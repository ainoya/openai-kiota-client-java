package dev.ainoya.kiota.openai.generated.chat;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import dev.ainoya.kiota.openai.generated.chat.completions.CompletionsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /chat
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatRequestBuilder extends BaseRequestBuilder {
    /**
     * The completions property
     */
    @jakarta.annotation.Nonnull
    public CompletionsRequestBuilder completions() {
        return new CompletionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ChatRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChatRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/chat", pathParameters);
    }
    /**
     * Instantiates a new ChatRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ChatRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/chat", rawUrl);
    }
}
