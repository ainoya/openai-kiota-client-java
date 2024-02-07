package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always `thread.run.step`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunStepObjectObject implements ValuedEnum {
    ThreadRunStep("thread.run.step");
    public final String value;
    RunStepObjectObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunStepObjectObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "thread.run.step": return ThreadRunStep;
            default: return null;
        }
    }
}
