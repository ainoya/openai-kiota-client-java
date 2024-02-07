package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of tool call. This is always going to be `function` for this type of tool call.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunStepDetailsToolCallsFunctionObjectType implements ValuedEnum {
    Function("function");
    public final String value;
    RunStepDetailsToolCallsFunctionObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunStepDetailsToolCallsFunctionObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "function": return Function;
            default: return null;
        }
    }
}
