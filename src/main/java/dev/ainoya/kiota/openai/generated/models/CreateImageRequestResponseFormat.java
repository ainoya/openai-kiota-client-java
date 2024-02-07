package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateImageRequestResponseFormat implements ValuedEnum {
    Url("url"),
    B64_json("b64_json");
    public final String value;
    CreateImageRequestResponseFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateImageRequestResponseFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "url": return Url;
            case "b64_json": return B64_json;
            default: return null;
        }
    }
}
