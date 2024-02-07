package dev.ainoya.kiota.openai.generated.fine_tuning.jobs.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import dev.ainoya.kiota.openai.generated.fine_tuning.jobs.item.cancel.CancelRequestBuilder;
import dev.ainoya.kiota.openai.generated.fine_tuning.jobs.item.events.EventsRequestBuilder;
import dev.ainoya.kiota.openai.generated.models.FineTuningJob;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /fine_tuning/jobs/{fine_tuning_job_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithFineTuningJobItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The cancel property
     */
    @jakarta.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The events property
     */
    @jakarta.annotation.Nonnull
    public EventsRequestBuilder events() {
        return new EventsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithFine_tuning_job_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithFineTuningJobItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fine_tuning/jobs/{fine_tuning_job_id}", pathParameters);
    }
    /**
     * Instantiates a new WithFine_tuning_job_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithFineTuningJobItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fine_tuning/jobs/{fine_tuning_job_id}", rawUrl);
    }
    /**
     * Get info about a fine-tuning job.[Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @return a FineTuningJob
     */
    @jakarta.annotation.Nullable
    public FineTuningJob get() {
        return get(null);
    }
    /**
     * Get info about a fine-tuning job.[Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a FineTuningJob
     */
    @jakarta.annotation.Nullable
    public FineTuningJob get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, FineTuningJob::createFromDiscriminatorValue);
    }
    /**
     * Get info about a fine-tuning job.[Learn more about fine-tuning](/docs/guides/fine-tuning)
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get info about a fine-tuning job.[Learn more about fine-tuning](/docs/guides/fine-tuning)
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
     * @return a WithFineTuningJobItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithFineTuningJobItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithFineTuningJobItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
