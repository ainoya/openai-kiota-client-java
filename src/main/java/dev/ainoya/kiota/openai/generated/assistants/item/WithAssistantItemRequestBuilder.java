package dev.ainoya.kiota.openai.generated.assistants.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import dev.ainoya.kiota.openai.generated.assistants.item.files.FilesRequestBuilder;
import dev.ainoya.kiota.openai.generated.models.AssistantObject;
import dev.ainoya.kiota.openai.generated.models.DeleteAssistantResponse;
import dev.ainoya.kiota.openai.generated.models.ModifyAssistantRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /assistants/{assistant_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithAssistantItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The files property
     */
    @jakarta.annotation.Nonnull
    public FilesRequestBuilder files() {
        return new FilesRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithAssistant_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAssistantItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/assistants/{assistant_id}", pathParameters);
    }
    /**
     * Instantiates a new WithAssistant_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithAssistantItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/assistants/{assistant_id}", rawUrl);
    }
    /**
     * Delete an assistant.
     * @return a DeleteAssistantResponse
     */
    @jakarta.annotation.Nullable
    public DeleteAssistantResponse delete() {
        return delete(null);
    }
    /**
     * Delete an assistant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeleteAssistantResponse
     */
    @jakarta.annotation.Nullable
    public DeleteAssistantResponse delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, DeleteAssistantResponse::createFromDiscriminatorValue);
    }
    /**
     * Retrieves an assistant.
     * @return a AssistantObject
     */
    @jakarta.annotation.Nullable
    public AssistantObject get() {
        return get(null);
    }
    /**
     * Retrieves an assistant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AssistantObject
     */
    @jakarta.annotation.Nullable
    public AssistantObject get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AssistantObject::createFromDiscriminatorValue);
    }
    /**
     * Modifies an assistant.
     * @param body The request body
     * @return a AssistantObject
     */
    @jakarta.annotation.Nullable
    public AssistantObject post(@jakarta.annotation.Nonnull final ModifyAssistantRequest body) {
        return post(body, null);
    }
    /**
     * Modifies an assistant.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AssistantObject
     */
    @jakarta.annotation.Nullable
    public AssistantObject post(@jakarta.annotation.Nonnull final ModifyAssistantRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AssistantObject::createFromDiscriminatorValue);
    }
    /**
     * Delete an assistant.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete an assistant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Retrieves an assistant.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieves an assistant.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Modifies an assistant.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ModifyAssistantRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Modifies an assistant.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ModifyAssistantRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithAssistantItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithAssistantItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithAssistantItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
