package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunObjectStatus implements ValuedEnum {
    Queued("queued"),
    In_progress("in_progress"),
    Requires_action("requires_action"),
    Cancelling("cancelling"),
    Cancelled("cancelled"),
    Failed("failed"),
    Completed("completed"),
    Expired("expired");
    public final String value;
    RunObjectStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunObjectStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "queued": return Queued;
            case "in_progress": return In_progress;
            case "requires_action": return Requires_action;
            case "cancelling": return Cancelling;
            case "cancelled": return Cancelled;
            case "failed": return Failed;
            case "completed": return Completed;
            case "expired": return Expired;
            default: return null;
        }
    }
}
