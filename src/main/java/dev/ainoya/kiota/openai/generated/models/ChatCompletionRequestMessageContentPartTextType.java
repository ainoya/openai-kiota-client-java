package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of the content part.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChatCompletionRequestMessageContentPartTextType implements ValuedEnum {
    Text("text");
    public final String value;
    ChatCompletionRequestMessageContentPartTextType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatCompletionRequestMessageContentPartTextType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            default: return null;
        }
    }
}
