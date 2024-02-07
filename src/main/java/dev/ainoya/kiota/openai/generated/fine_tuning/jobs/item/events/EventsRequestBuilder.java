package dev.ainoya.kiota.openai.generated.fine_tuning.jobs.item.events;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import dev.ainoya.kiota.openai.generated.models.ListFineTuningJobEventsResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /fine_tuning/jobs/{fine_tuning_job_id}/events
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EventsRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new EventsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fine_tuning/jobs/{fine_tuning_job_id}/events{?after*,limit*}", pathParameters);
    }
    /**
     * Instantiates a new EventsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public EventsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fine_tuning/jobs/{fine_tuning_job_id}/events{?after*,limit*}", rawUrl);
    }
    /**
     * Get status updates for a fine-tuning job.
     * @return a ListFineTuningJobEventsResponse
     */
    @jakarta.annotation.Nullable
    public ListFineTuningJobEventsResponse get() {
        return get(null);
    }
    /**
     * Get status updates for a fine-tuning job.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ListFineTuningJobEventsResponse
     */
    @jakarta.annotation.Nullable
    public ListFineTuningJobEventsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListFineTuningJobEventsResponse::createFromDiscriminatorValue);
    }
    /**
     * Get status updates for a fine-tuning job.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get status updates for a fine-tuning job.
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
     * @return a EventsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new EventsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Get status updates for a fine-tuning job.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Identifier for the last event from the previous pagination request.
         */
        @jakarta.annotation.Nullable
        public String after;
        /**
         * Number of events to retrieve.
         */
        @jakarta.annotation.Nullable
        public Integer limit;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("after", after);
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
