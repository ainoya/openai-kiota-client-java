package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Always `image`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunStepDetailsToolCallsCodeOutputImageObjectType implements ValuedEnum {
    Image("image");
    public final String value;
    RunStepDetailsToolCallsCodeOutputImageObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunStepDetailsToolCallsCodeOutputImageObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "image": return Image;
            default: return null;
        }
    }
}
