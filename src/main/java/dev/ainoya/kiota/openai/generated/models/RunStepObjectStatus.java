package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunStepObjectStatus implements ValuedEnum {
    In_progress("in_progress"),
    Cancelled("cancelled"),
    Failed("failed"),
    Completed("completed"),
    Expired("expired");
    public final String value;
    RunStepObjectStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunStepObjectStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "in_progress": return In_progress;
            case "cancelled": return Cancelled;
            case "failed": return Failed;
            case "completed": return Completed;
            case "expired": return Expired;
            default: return null;
        }
    }
}
