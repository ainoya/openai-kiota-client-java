package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeleteThreadResponseObject implements ValuedEnum {
    ThreadDeleted("thread.deleted");
    public final String value;
    DeleteThreadResponseObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeleteThreadResponseObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "thread.deleted": return ThreadDeleted;
            default: return null;
        }
    }
}
