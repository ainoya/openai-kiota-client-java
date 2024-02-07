package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always `assistant.file`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssistantFileObjectObject implements ValuedEnum {
    AssistantFile("assistant.file");
    public final String value;
    AssistantFileObjectObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssistantFileObjectObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "assistant.file": return AssistantFile;
            default: return null;
        }
    }
}
