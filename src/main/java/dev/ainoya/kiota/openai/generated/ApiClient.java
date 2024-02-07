package dev.ainoya.kiota.openai.generated;

import com.microsoft.kiota.ApiClientBuilder;
import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.serialization.FormParseNodeFactory;
import com.microsoft.kiota.serialization.FormSerializationWriterFactory;
import com.microsoft.kiota.serialization.JsonParseNodeFactory;
import com.microsoft.kiota.serialization.JsonSerializationWriterFactory;
import com.microsoft.kiota.serialization.MultipartSerializationWriterFactory;
import com.microsoft.kiota.serialization.ParseNodeFactoryRegistry;
import com.microsoft.kiota.serialization.SerializationWriterFactoryRegistry;
import com.microsoft.kiota.serialization.TextParseNodeFactory;
import com.microsoft.kiota.serialization.TextSerializationWriterFactory;
import dev.ainoya.kiota.openai.generated.assistants.AssistantsRequestBuilder;
import dev.ainoya.kiota.openai.generated.audio.AudioRequestBuilder;
import dev.ainoya.kiota.openai.generated.chat.ChatRequestBuilder;
import dev.ainoya.kiota.openai.generated.completions.CompletionsRequestBuilder;
import dev.ainoya.kiota.openai.generated.embeddings.EmbeddingsRequestBuilder;
import dev.ainoya.kiota.openai.generated.files.FilesRequestBuilder;
import dev.ainoya.kiota.openai.generated.fine_tuning.FineTuningRequestBuilder;
import dev.ainoya.kiota.openai.generated.images.ImagesRequestBuilder;
import dev.ainoya.kiota.openai.generated.modelsrequests.ModelsRequestBuilder;
import dev.ainoya.kiota.openai.generated.moderations.ModerationsRequestBuilder;
import dev.ainoya.kiota.openai.generated.threads.ThreadsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * The main entry point of the SDK, exposes the configuration and the fluent API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApiClient extends BaseRequestBuilder {
    /**
     * The assistants property
     */
    @jakarta.annotation.Nonnull
    public AssistantsRequestBuilder assistants() {
        return new AssistantsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The audio property
     */
    @jakarta.annotation.Nonnull
    public AudioRequestBuilder audio() {
        return new AudioRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The chat property
     */
    @jakarta.annotation.Nonnull
    public ChatRequestBuilder chat() {
        return new ChatRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The completions property
     */
    @jakarta.annotation.Nonnull
    public CompletionsRequestBuilder completions() {
        return new CompletionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The embeddings property
     */
    @jakarta.annotation.Nonnull
    public EmbeddingsRequestBuilder embeddings() {
        return new EmbeddingsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The files property
     */
    @jakarta.annotation.Nonnull
    public FilesRequestBuilder files() {
        return new FilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The fine_tuning property
     */
    @jakarta.annotation.Nonnull
    public FineTuningRequestBuilder fineTuning() {
        return new FineTuningRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The images property
     */
    @jakarta.annotation.Nonnull
    public ImagesRequestBuilder images() {
        return new ImagesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The models property
     */
    @jakarta.annotation.Nonnull
    public ModelsRequestBuilder models() {
        return new ModelsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The moderations property
     */
    @jakarta.annotation.Nonnull
    public ModerationsRequestBuilder moderations() {
        return new ModerationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The threads property
     */
    @jakarta.annotation.Nonnull
    public ThreadsRequestBuilder threads() {
        return new ThreadsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ApiClient and sets the default values.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ApiClient(@jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}");
        this.pathParameters = new HashMap<>();
        ApiClientBuilder.registerDefaultSerializer(() -> new JsonSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new TextSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new FormSerializationWriterFactory());
        ApiClientBuilder.registerDefaultSerializer(() -> new MultipartSerializationWriterFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new JsonParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new FormParseNodeFactory());
        ApiClientBuilder.registerDefaultDeserializer(() -> new TextParseNodeFactory());
        if (requestAdapter.getBaseUrl() == null || requestAdapter.getBaseUrl().isEmpty()) {
            requestAdapter.setBaseUrl("https://api.openai.com/v1");
        }
        pathParameters.put("baseurl", requestAdapter.getBaseUrl());
    }
}
