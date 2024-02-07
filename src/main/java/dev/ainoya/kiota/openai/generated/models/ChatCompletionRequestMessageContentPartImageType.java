package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of the content part.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ChatCompletionRequestMessageContentPartImageType implements ValuedEnum {
    Image_url("image_url");
    public final String value;
    ChatCompletionRequestMessageContentPartImageType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ChatCompletionRequestMessageContentPartImageType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "image_url": return Image_url;
            default: return null;
        }
    }
}
