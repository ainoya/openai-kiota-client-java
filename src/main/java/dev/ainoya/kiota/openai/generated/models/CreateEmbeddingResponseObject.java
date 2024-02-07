package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always "list".
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateEmbeddingResponseObject implements ValuedEnum {
    List("list");
    public final String value;
    CreateEmbeddingResponseObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateEmbeddingResponseObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "list": return List;
            default: return null;
        }
    }
}
