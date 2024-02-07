package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChatCompletionRequestMessageContentPartImageImageUrlDetail implements ValuedEnum {
    Auto("auto"),
    Low("low"),
    High("high");
    public final String value;
    ChatCompletionRequestMessageContentPartImageImageUrlDetail(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatCompletionRequestMessageContentPartImageImageUrlDetail forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "auto": return Auto;
            case "low": return Low;
            case "high": return High;
            default: return null;
        }
    }
}
