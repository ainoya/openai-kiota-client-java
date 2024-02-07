package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The role of the messages author, in this case `assistant`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChatCompletionRequestAssistantMessageRole implements ValuedEnum {
    Assistant("assistant");
    public final String value;
    ChatCompletionRequestAssistantMessageRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatCompletionRequestAssistantMessageRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "assistant": return Assistant;
            default: return null;
        }
    }
}
