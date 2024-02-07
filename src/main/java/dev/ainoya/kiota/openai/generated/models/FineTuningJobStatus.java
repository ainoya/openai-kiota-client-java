package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FineTuningJobStatus implements ValuedEnum {
    Validating_files("validating_files"),
    Queued("queued"),
    Running("running"),
    Succeeded("succeeded"),
    Failed("failed"),
    Cancelled("cancelled");
    public final String value;
    FineTuningJobStatus(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FineTuningJobStatus forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "validating_files": return Validating_files;
            case "queued": return Queued;
            case "running": return Running;
            case "succeeded": return Succeeded;
            case "failed": return Failed;
            case "cancelled": return Cancelled;
            default: return null;
        }
    }
}
