package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of run step, which can be either `message_creation` or `tool_calls`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunStepObjectType implements ValuedEnum {
    Message_creation("message_creation"),
    Tool_calls("tool_calls");
    public final String value;
    RunStepObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunStepObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "message_creation": return Message_creation;
            case "tool_calls": return Tool_calls;
            default: return null;
        }
    }
}
