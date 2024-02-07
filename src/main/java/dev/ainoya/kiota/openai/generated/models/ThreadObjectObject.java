package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always `thread`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ThreadObjectObject implements ValuedEnum {
    Thread("thread");
    public final String value;
    ThreadObjectObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ThreadObjectObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "thread": return Thread;
            default: return null;
        }
    }
}
