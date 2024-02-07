package dev.ainoya.kiota.openai.generated.fine_tuning.jobs;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import dev.ainoya.kiota.openai.generated.fine_tuning.jobs.item.WithFineTuningJobItemRequestBuilder;
import dev.ainoya.kiota.openai.generated.models.CreateFineTuningJobRequest;
import dev.ainoya.kiota.openai.generated.models.FineTuningJob;
import dev.ainoya.kiota.openai.generated.models.ListPaginatedFineTuningJobsResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /fine_tuning/jobs
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class JobsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the dev.ainoya.kiota.openai.generated.fine_tuning.jobs.item collection
     * @param fine_tuning_job_id The ID of the fine-tuning job.
     * @return a WithFineTuningJobItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithFineTuningJobItemRequestBuilder byFine_tuning_job_id(@jakarta.annotation.Nonnull final String fine_tuning_job_id) {
        Objects.requireNonNull(fine_tuning_job_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("fine_tuning_job_id", fine_tuning_job_id);
        return new WithFineTuningJobItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new JobsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public JobsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fine_tuning/jobs{?after*,limit*}", pathParameters);
    }
    /**
     * Instantiates a new JobsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public JobsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fine_tuning/jobs{?after*,limit*}", rawUrl);
    }
    /**
     * List your organization's fine-tuning jobs
     * @return a ListPaginatedFineTuningJobsResponse
     */
    @jakarta.annotation.Nullable
    public ListPaginatedFineTuningJobsResponse get() {
        return get(null);
    }
    /**
     * List your organization's fine-tuning jobs
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ListPaginatedFineTuningJobsResponse
     */
    @jakarta.annotation.Nullable
    public ListPaginatedFineTuningJobsResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListPaginatedFineTuningJobsResponse::createFromDiscriminatorValue);
    }
    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.[Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @param body The request body
     * @return a FineTuningJob
     */
    @jakarta.annotation.Nullable
    public FineTuningJob post(@jakarta.annotation.Nonnull final CreateFineTuningJobRequest body) {
        return post(body, null);
    }
    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.[Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a FineTuningJob
     */
    @jakarta.annotation.Nullable
    public FineTuningJob post(@jakarta.annotation.Nonnull final CreateFineTuningJobRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, FineTuningJob::createFromDiscriminatorValue);
    }
    /**
     * List your organization's fine-tuning jobs
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * List your organization's fine-tuning jobs
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
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.[Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateFineTuningJobRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.[Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final CreateFineTuningJobRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a JobsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public JobsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new JobsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * List your organization's fine-tuning jobs
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Identifier for the last job from the previous pagination request.
         */
        @jakarta.annotation.Nullable
        public String after;
        /**
         * Number of fine-tuning jobs to retrieve.
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
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
