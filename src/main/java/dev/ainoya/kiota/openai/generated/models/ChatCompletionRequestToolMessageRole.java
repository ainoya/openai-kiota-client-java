package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The role of the messages author, in this case `tool`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChatCompletionRequestToolMessageRole implements ValuedEnum {
    Tool("tool");
    public final String value;
    ChatCompletionRequestToolMessageRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatCompletionRequestToolMessageRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "tool": return Tool;
            default: return null;
        }
    }
}
