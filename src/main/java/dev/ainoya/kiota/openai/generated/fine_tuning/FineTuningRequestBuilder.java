package dev.ainoya.kiota.openai.generated.fine_tuning;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import dev.ainoya.kiota.openai.generated.fine_tuning.jobs.JobsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /fine_tuning
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FineTuningRequestBuilder extends BaseRequestBuilder {
    /**
     * The jobs property
     */
    @jakarta.annotation.Nonnull
    public JobsRequestBuilder jobs() {
        return new JobsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new Fine_tuningRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FineTuningRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fine_tuning", pathParameters);
    }
    /**
     * Instantiates a new Fine_tuningRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FineTuningRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/fine_tuning", rawUrl);
    }
}
