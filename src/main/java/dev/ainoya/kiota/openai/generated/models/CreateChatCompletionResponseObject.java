package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always `chat.completion`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateChatCompletionResponseObject implements ValuedEnum {
    ChatCompletion("chat.completion");
    public final String value;
    CreateChatCompletionResponseObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateChatCompletionResponseObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "chat.completion": return ChatCompletion;
            default: return null;
        }
    }
}
