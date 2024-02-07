package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The role of the messages author, in this case `system`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChatCompletionRequestSystemMessageRole implements ValuedEnum {
    System("system");
    public final String value;
    ChatCompletionRequestSystemMessageRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatCompletionRequestSystemMessageRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "system": return System;
            default: return null;
        }
    }
}
