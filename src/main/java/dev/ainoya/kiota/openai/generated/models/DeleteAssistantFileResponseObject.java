package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum DeleteAssistantFileResponseObject implements ValuedEnum {
    AssistantFileDeleted("assistant.file.deleted");
    public final String value;
    DeleteAssistantFileResponseObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static DeleteAssistantFileResponseObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "assistant.file.deleted": return AssistantFileDeleted;
            default: return null;
        }
    }
}
