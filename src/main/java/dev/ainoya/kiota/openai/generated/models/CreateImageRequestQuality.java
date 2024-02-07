package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateImageRequestQuality implements ValuedEnum {
    Standard("standard"),
    Hd("hd");
    public final String value;
    CreateImageRequestQuality(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateImageRequestQuality forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "standard": return Standard;
            case "hd": return Hd;
            default: return null;
        }
    }
}
