package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
 * @deprecated
 * 
 */
@Deprecated
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OpenAIFileStatus implements ValuedEnum {
    Uploaded("uploaded"),
    Processed("processed"),
    Error("error");
    public final String value;
    OpenAIFileStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OpenAIFileStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "uploaded": return Uploaded;
            case "processed": return Processed;
            case "error": return Error;
            default: return null;
        }
    }
}
