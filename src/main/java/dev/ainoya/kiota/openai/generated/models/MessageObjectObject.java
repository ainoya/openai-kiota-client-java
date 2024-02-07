package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always `thread.message`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MessageObjectObject implements ValuedEnum {
    ThreadMessage("thread.message");
    public final String value;
    MessageObjectObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MessageObjectObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "thread.message": return ThreadMessage;
            default: return null;
        }
    }
}
