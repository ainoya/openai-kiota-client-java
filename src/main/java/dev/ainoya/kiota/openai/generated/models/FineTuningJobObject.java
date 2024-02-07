package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always "fine_tuning.job".
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FineTuningJobObject implements ValuedEnum {
    Fine_tuningJob("fine_tuning.job");
    public final String value;
    FineTuningJobObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FineTuningJobObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "fine_tuning.job": return Fine_tuningJob;
            default: return null;
        }
    }
}
