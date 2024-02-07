package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always `thread.run`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunObjectObject implements ValuedEnum {
    ThreadRun("thread.run");
    public final String value;
    RunObjectObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunObjectObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "thread.run": return ThreadRun;
            default: return null;
        }
    }
}
