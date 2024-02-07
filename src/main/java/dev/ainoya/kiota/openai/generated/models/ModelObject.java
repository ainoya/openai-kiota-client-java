package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The object type, which is always "model".
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum ModelObject implements ValuedEnum {
    Model("model");
    public final String value;
    ModelObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static ModelObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "model": return Model;
            default: return null;
        }
    }
}
