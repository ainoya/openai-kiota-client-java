package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The role of the entity that is creating the message. Currently only `user` is supported.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateMessageRequestRole implements ValuedEnum {
    User("user");
    public final String value;
    CreateMessageRequestRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateMessageRequestRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "user": return User;
            default: return null;
        }
    }
}
