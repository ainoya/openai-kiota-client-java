package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always `file`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OpenAIFileObject implements ValuedEnum {
    File("file");
    public final String value;
    OpenAIFileObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OpenAIFileObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "file": return File;
            default: return null;
        }
    }
}
