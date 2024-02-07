package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always "embedding".
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum EmbeddingObject implements ValuedEnum {
    Embedding("embedding");
    public final String value;
    EmbeddingObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static EmbeddingObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "embedding": return Embedding;
            default: return null;
        }
    }
}
