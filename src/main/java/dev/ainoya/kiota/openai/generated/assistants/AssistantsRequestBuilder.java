package dev.ainoya.kiota.openai.generated.assistants;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import dev.ainoya.kiota.openai.generated.assistants.item.WithAssistantItemRequestBuilder;
import dev.ainoya.kiota.openai.generated.models.AssistantObject;
import dev.ainoya.kiota.openai.generated.models.CreateAssistantRequest;
import dev.ainoya.kiota.openai.generated.models.ListAssistantsResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /assistants
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssistantsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the dev.ainoya.kiota.openai.generated.assistants.item collection
     * @param assistant_id The ID of the assistant to retrieve.
     * @return a WithAssistantItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithAssistantItemRequestBuilder byAssistant_id(@jakarta.annotation.Nonnull final String assistant_id) {
        Objects.requireNonNull(assistant_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("assistant_id", assistant_id);
        return new WithAssistantItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new AssistantsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssistantsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/assistants{?after*,before*,limit*,order*}", pathParameters);
    }
    /**
     * Instantiates a new AssistantsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AssistantsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/assistants{?after*,before*,limit*,order*}", rawUrl);
    }
    /**
     * Returns a list of assistants.
     * @return a ListAssistantsResponse
     */
    @jakarta.annotation.Nullable
    public ListAssistantsResponse get() {
        return get(null);
    }
    /**
     * Returns a list of assistants.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ListAssistantsResponse
     */
    @jakarta.annotation.Nullable
    public ListAssistantsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListAssistantsResponse::createFromDiscriminatorValue);
    }
    /**
     * Create an assistant with a model and instructions.
     * @param body The request body
     * @return a AssistantObject
     */
    @jakarta.annotation.Nullable
    public AssistantObject post(@jakarta.annotation.Nonnull final CreateAssistantRequest body) {
        return post(body, null);
    }
    /**
     * Create an assistant with a model and instructions.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a AssistantObject
     */
    @jakarta.annotation.Nullable
    public AssistantObject post(@jakarta.annotation.Nonnull final CreateAssistantRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, AssistantObject::createFromDiscriminatorValue);
    }
    /**
     * Returns a list of assistants.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of assistants.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new, x -> x.queryParameters);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Create an assistant with a model and instructions.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAssistantRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an assistant with a model and instructions.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateAssistantRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a AssistantsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public AssistantsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new AssistantsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns a list of assistants.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * A cursor for use in pagination. `after` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after=obj_foo in order to fetch the next page of the list.
         */
        @jakarta.annotation.Nullable
        public String after;
        /**
         * A cursor for use in pagination. `before` is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before=obj_foo in order to fetch the previous page of the list.
         */
        @jakarta.annotation.Nullable
        public String before;
        /**
         * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20.
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * Sort order by the `created_at` timestamp of the objects. `asc` for ascending order and `desc` for descending order.
         */
        @jakarta.annotation.Nullable
        public GetOrderQueryParameterType order;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("order", order);
            allQueryParams.put("after", after);
            allQueryParams.put("before", before);
            allQueryParams.put("limit", limit);
            return allQueryParams;
        }
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
        /**
         * Request query parameters
         */
        @jakarta.annotation.Nullable
        public GetQueryParameters queryParameters = new GetQueryParameters();
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
