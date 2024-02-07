package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always `thread.message.file`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MessageFileObjectObject implements ValuedEnum {
    ThreadMessageFile("thread.message.file");
    public final String value;
    MessageFileObjectObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MessageFileObjectObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "thread.message.file": return ThreadMessageFile;
            default: return null;
        }
    }
}
