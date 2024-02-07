package dev.ainoya.kiota.openai.generated.threads.item.runs.item.steps;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import dev.ainoya.kiota.openai.generated.models.ListRunStepsResponse;
import dev.ainoya.kiota.openai.generated.threads.item.runs.item.steps.item.WithStepItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /threads/{thread_id}/runs/{run_id}/steps
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class StepsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the dev.ainoya.kiota.openai.generated.threads.item.runs.item.steps.item collection
     * @param step_id The ID of the run step to retrieve.
     * @return a WithStepItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithStepItemRequestBuilder byStep_id(@jakarta.annotation.Nonnull final String step_id) {
        Objects.requireNonNull(step_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("step_id", step_id);
        return new WithStepItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new StepsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StepsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/threads/{thread_id}/runs/{run_id}/steps{?after*,before*,limit*,order*}", pathParameters);
    }
    /**
     * Instantiates a new StepsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public StepsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/threads/{thread_id}/runs/{run_id}/steps{?after*,before*,limit*,order*}", rawUrl);
    }
    /**
     * Returns a list of run steps belonging to a run.
     * @return a ListRunStepsResponse
     */
    @jakarta.annotation.Nullable
    public ListRunStepsResponse get() {
        return get(null);
    }
    /**
     * Returns a list of run steps belonging to a run.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ListRunStepsResponse
     */
    @jakarta.annotation.Nullable
    public ListRunStepsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListRunStepsResponse::createFromDiscriminatorValue);
    }
    /**
     * Returns a list of run steps belonging to a run.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of run steps belonging to a run.
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a StepsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public StepsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new StepsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns a list of run steps belonging to a run.
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
}
