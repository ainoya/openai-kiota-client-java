package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of tool being defined: `function`
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssistantToolsFunctionType implements ValuedEnum {
    Function("function");
    public final String value;
    AssistantToolsFunctionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssistantToolsFunctionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "function": return Function;
            default: return null;
        }
    }
}
