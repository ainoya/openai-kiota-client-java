package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FineTuningJobEventObject implements ValuedEnum {
    Fine_tuningJobEvent("fine_tuning.job.event");
    public final String value;
    FineTuningJobEventObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FineTuningJobEventObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "fine_tuning.job.event": return Fine_tuningJobEvent;
            default: return null;
        }
    }
}
