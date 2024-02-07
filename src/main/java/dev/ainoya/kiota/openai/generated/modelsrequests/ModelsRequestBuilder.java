package dev.ainoya.kiota.openai.generated.modelsrequests;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import dev.ainoya.kiota.openai.generated.models.ListModelsResponse;
import dev.ainoya.kiota.openai.generated.modelsrequests.item.WithModelItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /models
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ModelsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the dev.ainoya.kiota.openai.generated.modelsRequests.item collection
     * @param model The ID of the model to use for this request
     * @return a WithModelItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithModelItemRequestBuilder byModel(@jakarta.annotation.Nonnull final String model) {
        Objects.requireNonNull(model);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("model", model);
        return new WithModelItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new ModelsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ModelsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/models", pathParameters);
    }
    /**
     * Instantiates a new ModelsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ModelsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/models", rawUrl);
    }
    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @return a ListModelsResponse
     */
    @jakarta.annotation.Nullable
    public ListModelsResponse get() {
        return get(null);
    }
    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ListModelsResponse
     */
    @jakarta.annotation.Nullable
    public ListModelsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListModelsResponse::createFromDiscriminatorValue);
    }
    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ModelsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ModelsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ModelsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
