package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * For now, this is always `submit_tool_outputs`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunObjectRequiredActionType implements ValuedEnum {
    Submit_tool_outputs("submit_tool_outputs");
    public final String value;
    RunObjectRequiredActionType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunObjectRequiredActionType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "submit_tool_outputs": return Submit_tool_outputs;
            default: return null;
        }
    }
}
