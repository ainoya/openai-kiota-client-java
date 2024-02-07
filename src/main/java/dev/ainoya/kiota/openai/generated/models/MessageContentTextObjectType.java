package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Always `text`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MessageContentTextObjectType implements ValuedEnum {
    Text("text");
    public final String value;
    MessageContentTextObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MessageContentTextObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            default: return null;
        }
    }
}
