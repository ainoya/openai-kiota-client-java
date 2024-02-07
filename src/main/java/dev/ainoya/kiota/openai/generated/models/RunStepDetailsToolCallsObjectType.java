package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Always `tool_calls`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunStepDetailsToolCallsObjectType implements ValuedEnum {
    Tool_calls("tool_calls");
    public final String value;
    RunStepDetailsToolCallsObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunStepDetailsToolCallsObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tool_calls": return Tool_calls;
            default: return null;
        }
    }
}
