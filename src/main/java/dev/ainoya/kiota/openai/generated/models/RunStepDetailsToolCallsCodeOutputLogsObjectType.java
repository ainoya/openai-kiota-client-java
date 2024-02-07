package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Always `logs`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunStepDetailsToolCallsCodeOutputLogsObjectType implements ValuedEnum {
    Logs("logs");
    public final String value;
    RunStepDetailsToolCallsCodeOutputLogsObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunStepDetailsToolCallsCodeOutputLogsObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "logs": return Logs;
            default: return null;
        }
    }
}
