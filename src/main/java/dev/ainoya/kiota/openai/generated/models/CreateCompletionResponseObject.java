package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always "text_completion"
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateCompletionResponseObject implements ValuedEnum {
    Text_completion("text_completion");
    public final String value;
    CreateCompletionResponseObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateCompletionResponseObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text_completion": return Text_completion;
            default: return null;
        }
    }
}
