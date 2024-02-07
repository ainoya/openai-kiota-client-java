package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateEmbeddingRequestEncodingFormat implements ValuedEnum {
    Float("float"),
    Base64("base64");
    public final String value;
    CreateEmbeddingRequestEncodingFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateEmbeddingRequestEncodingFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "float": return Float;
            case "base64": return Base64;
            default: return null;
        }
    }
}
