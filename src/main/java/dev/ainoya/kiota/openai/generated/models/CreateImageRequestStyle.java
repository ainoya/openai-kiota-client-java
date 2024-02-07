package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateImageRequestStyle implements ValuedEnum {
    Vivid("vivid"),
    Natural("natural");
    public final String value;
    CreateImageRequestStyle(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateImageRequestStyle forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "vivid": return Vivid;
            case "natural": return Natural;
            default: return null;
        }
    }
}
