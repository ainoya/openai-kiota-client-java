package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateImageRequestSize implements ValuedEnum {
    TwoFiveSixx256("256x256"),
    FiveOneTwox512("512x512"),
    OneZeroTwoFourx1024("1024x1024"),
    OneSevenNineTwox1024("1792x1024"),
    OneZeroTwoFourx1792("1024x1792");
    public final String value;
    CreateImageRequestSize(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateImageRequestSize forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "256x256": return TwoFiveSixx256;
            case "512x512": return FiveOneTwox512;
            case "1024x1024": return OneZeroTwoFourx1024;
            case "1792x1024": return OneSevenNineTwox1024;
            case "1024x1792": return OneZeroTwoFourx1792;
            default: return null;
        }
    }
}
