package dev.ainoya.kiota.openai.generated.images;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import dev.ainoya.kiota.openai.generated.images.edits.EditsRequestBuilder;
import dev.ainoya.kiota.openai.generated.images.generations.GenerationsRequestBuilder;
import dev.ainoya.kiota.openai.generated.images.variations.VariationsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /images
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImagesRequestBuilder extends BaseRequestBuilder {
    /**
     * The edits property
     */
    @jakarta.annotation.Nonnull
    public EditsRequestBuilder edits() {
        return new EditsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The generations property
     */
    @jakarta.annotation.Nonnull
    public GenerationsRequestBuilder generations() {
        return new GenerationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The variations property
     */
    @jakarta.annotation.Nonnull
    public VariationsRequestBuilder variations() {
        return new VariationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new ImagesRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagesRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/images", pathParameters);
    }
    /**
     * Instantiates a new ImagesRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ImagesRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/images", rawUrl);
    }
}
