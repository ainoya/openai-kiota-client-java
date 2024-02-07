package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always `assistant`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssistantObjectObject implements ValuedEnum {
    Assistant("assistant");
    public final String value;
    AssistantObjectObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssistantObjectObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "assistant": return Assistant;
            default: return null;
        }
    }
}
