package dev.ainoya.kiota.openai.generated.threads.item.runs.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import dev.ainoya.kiota.openai.generated.models.ModifyRunRequest;
import dev.ainoya.kiota.openai.generated.models.RunObject;
import dev.ainoya.kiota.openai.generated.threads.item.runs.item.cancel.CancelRequestBuilder;
import dev.ainoya.kiota.openai.generated.threads.item.runs.item.steps.StepsRequestBuilder;
import dev.ainoya.kiota.openai.generated.threads.item.runs.item.submit_tool_outputs.SubmitToolOutputsRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /threads/{thread_id}/runs/{run_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithRunItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The cancel property
     */
    @jakarta.annotation.Nonnull
    public CancelRequestBuilder cancel() {
        return new CancelRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The steps property
     */
    @jakarta.annotation.Nonnull
    public StepsRequestBuilder steps() {
        return new StepsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The submit_tool_outputs property
     */
    @jakarta.annotation.Nonnull
    public SubmitToolOutputsRequestBuilder submitToolOutputs() {
        return new SubmitToolOutputsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithRun_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithRunItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/threads/{thread_id}/runs/{run_id}", pathParameters);
    }
    /**
     * Instantiates a new WithRun_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithRunItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/threads/{thread_id}/runs/{run_id}", rawUrl);
    }
    /**
     * Retrieves a run.
     * @return a RunObject
     */
    @jakarta.annotation.Nullable
    public RunObject get() {
        return get(null);
    }
    /**
     * Retrieves a run.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RunObject
     */
    @jakarta.annotation.Nullable
    public RunObject get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, RunObject::createFromDiscriminatorValue);
    }
    /**
     * Modifies a run.
     * @param body The request body
     * @return a RunObject
     */
    @jakarta.annotation.Nullable
    public RunObject post(@jakarta.annotation.Nonnull final ModifyRunRequest body) {
        return post(body, null);
    }
    /**
     * Modifies a run.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RunObject
     */
    @jakarta.annotation.Nullable
    public RunObject post(@jakarta.annotation.Nonnull final ModifyRunRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, RunObject::createFromDiscriminatorValue);
    }
    /**
     * Retrieves a run.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieves a run.
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
     * Modifies a run.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ModifyRunRequest body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Modifies a run.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ModifyRunRequest body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a WithRunItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithRunItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithRunItemRequestBuilder(rawUrl, requestAdapter);
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
