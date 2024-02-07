package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The role of the messages author, in this case `function`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChatCompletionRequestFunctionMessageRole implements ValuedEnum {
    Function("function");
    public final String value;
    ChatCompletionRequestFunctionMessageRole(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatCompletionRequestFunctionMessageRole forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "function": return Function;
            default: return null;
        }
    }
}
