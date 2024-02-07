package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The entity that produced the message. One of `user` or `assistant`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MessageObjectRole implements ValuedEnum {
    User("user"),
    Assistant("assistant");
    public final String value;
    MessageObjectRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MessageObjectRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            case "assistant": return Assistant;
            default: return null;
        }
    }
}
