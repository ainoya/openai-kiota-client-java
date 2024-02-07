package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Always `message_creation`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunStepDetailsMessageCreationObjectType implements ValuedEnum {
    Message_creation("message_creation");
    public final String value;
    RunStepDetailsMessageCreationObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunStepDetailsMessageCreationObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "message_creation": return Message_creation;
            default: return null;
        }
    }
}
