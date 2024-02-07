package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Always `image_file`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MessageContentImageFileObjectType implements ValuedEnum {
    Image_file("image_file");
    public final String value;
    MessageContentImageFileObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MessageContentImageFileObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "image_file": return Image_file;
            default: return null;
        }
    }
}
