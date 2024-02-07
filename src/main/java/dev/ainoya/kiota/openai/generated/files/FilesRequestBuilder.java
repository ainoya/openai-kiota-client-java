package dev.ainoya.kiota.openai.generated.files;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.MultipartBody;
import com.microsoft.kiota.QueryParameters;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import dev.ainoya.kiota.openai.generated.files.item.WithFileItemRequestBuilder;
import dev.ainoya.kiota.openai.generated.models.ListFilesResponse;
import dev.ainoya.kiota.openai.generated.models.OpenAIFile;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /files
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FilesRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the dev.ainoya.kiota.openai.generated.files.item collection
     * @param file_id The ID of the file to use for this request.
     * @return a WithFileItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithFileItemRequestBuilder byFile_id(@jakarta.annotation.Nonnull final String file_id) {
        Objects.requireNonNull(file_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("file_id", file_id);
        return new WithFileItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new FilesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FilesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/files{?purpose*}", pathParameters);
    }
    /**
     * Instantiates a new FilesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public FilesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/files{?purpose*}", rawUrl);
    }
    /**
     * Returns a list of files that belong to the user's organization.
     * @return a ListFilesResponse
     */
    @jakarta.annotation.Nullable
    public ListFilesResponse get() {
        return get(null);
    }
    /**
     * Returns a list of files that belong to the user's organization.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ListFilesResponse
     */
    @jakarta.annotation.Nullable
    public ListFilesResponse get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, ListFilesResponse::createFromDiscriminatorValue);
    }
    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
     * @param body The request body
     * @return a OpenAIFile
     */
    @jakarta.annotation.Nullable
    public OpenAIFile post(@jakarta.annotation.Nonnull final MultipartBody body) {
        return post(body, null);
    }
    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OpenAIFile
     */
    @jakarta.annotation.Nullable
    public OpenAIFile post(@jakarta.annotation.Nonnull final MultipartBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, OpenAIFile::createFromDiscriminatorValue);
    }
    /**
     * Returns a list of files that belong to the user's organization.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Returns a list of files that belong to the user's organization.
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
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MultipartBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.Please [contact us](https://help.openai.com/) if you need to increase these storage limits.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final MultipartBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "multipart/form-data", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a FilesRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public FilesRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new FilesRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Returns a list of files that belong to the user's organization.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetQueryParameters implements QueryParameters {
        /**
         * Only return files with the given purpose.
         */
        @jakarta.annotation.Nullable
        public String purpose;
        /**
         * Extracts the query parameters into a map for the URI template parsing.
         * @return a Map<String, Object>
         */
        @jakarta.annotation.Nonnull
        public Map<String, Object> toQueryParameters() {
            final Map<String, Object> allQueryParams = new HashMap();
            allQueryParams.put("purpose", purpose);
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
