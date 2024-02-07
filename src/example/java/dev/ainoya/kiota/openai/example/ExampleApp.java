package dev.ainoya.kiota.openai.example;

import com.microsoft.kiota.ApiException;
import com.microsoft.kiota.authentication.AccessTokenProvider;
import com.microsoft.kiota.authentication.AllowedHostsValidator;
import com.microsoft.kiota.authentication.BaseBearerTokenAuthenticationProvider;
import com.microsoft.kiota.http.ObservabilityOptions;
import com.microsoft.kiota.http.OkHttpRequestAdapter;
import com.microsoft.kiota.serialization.*;
import dev.ainoya.kiota.openai.generated.ApiClient;
import dev.ainoya.kiota.openai.generated.models.*;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Map;

class ExampleBearerTokenProvider implements AccessTokenProvider {
   // https://learn.microsoft.com/en-us/openapi/kiota/authentication?tabs=java

    @NotNull
    @Override
    public String getAuthorizationToken(@NotNull URI uri, @Nullable Map<String, Object> additionalAuthenticationContext) {
        // get token from env variable "OPENAI_API_KEY"
        return System.getenv("OPENAI_API_KEY");
    }

    @NotNull
    @Override
    public AllowedHostsValidator getAllowedHostsValidator() {
        return new AllowedHostsValidator(
                "openai.com"
                );
    }
}

public class ExampleApp {

    public static void main(String[] args) {
        final BaseBearerTokenAuthenticationProvider authProvider = new BaseBearerTokenAuthenticationProvider(new ExampleBearerTokenProvider());

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor().setLevel(
                HttpLoggingInterceptor.Level.BASIC
                // if set level to BODY, kiota client will not work because of the response body is consumed by the interceptor
        );

        Call.Factory httpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(logging)
                .build();

        ParseNodeFactory parseNodeFactory = ParseNodeFactoryRegistry.defaultInstance;
        SerializationWriterFactory serializationWriterFactory = SerializationWriterFactoryRegistry.defaultInstance;
        final OkHttpRequestAdapter requestAdapter = new OkHttpRequestAdapter(authProvider,
                null,
                null,
                httpClient
                );


        ApiClient client = new ApiClient(requestAdapter);

        final CreateChatCompletionRequest request = getCreateChatCompletionRequest();

        try {
            CreateChatCompletionResponse post = client
                    .chat().completions().post(request);

            // debug response
            if (post != null) {
                var choices = post.getChoices();
                if (choices != null) {
                    for (var choice : choices) {
                        if (choice.getMessage() != null) {
                            System.out.println(choice.getMessage().getContent());
                        }
                    }
                } else {
                    System.out.println("choices is null");
                }
            } else {
                System.out.println("post is null");
            }
        } catch (ApiException e) {
            // handle as ApiException
            System.out.println(e.getLocalizedMessage());
        }

    }

    @NotNull
    private static CreateChatCompletionRequest getCreateChatCompletionRequest() {
        final CreateChatCompletionRequest request = new CreateChatCompletionRequest();

        final CreateChatCompletionRequest.CreateChatCompletionRequestModel model = new CreateChatCompletionRequest.CreateChatCompletionRequestModel();
        model.setString("gpt-4-turbo-preview");

        request.setModel(
                model
        );

        request.setMaxTokens(100);


        ChatCompletionRequestMessage message = new ChatCompletionRequestMessage();
        ChatCompletionRequestUserMessage userMessage = new ChatCompletionRequestUserMessage();

        ChatCompletionRequestMessageContentPart contentPart = new ChatCompletionRequestMessageContentPart();

        ChatCompletionRequestMessageContentPartText partText = new ChatCompletionRequestMessageContentPartText();
        partText.setText("What is the meaning of life?");
        partText.setType(ChatCompletionRequestMessageContentPartTextType.Text);

        contentPart.setChatCompletionRequestMessageContentPartText(
                partText
        );

        userMessage.setContent(List.of(
                contentPart
        ));

        userMessage.setRole(
                ChatCompletionRequestUserMessageRole.User
        );

        message.setChatCompletionRequestUserMessage(userMessage);
        List<ChatCompletionRequestMessage> messages = List.of(
                message
        );

        request.setMessages(
                messages
        );
        return request;
    }
}
