package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of tool being defined: `retrieval`
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssistantToolsRetrievalType implements ValuedEnum {
    Retrieval("retrieval");
    public final String value;
    AssistantToolsRetrievalType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssistantToolsRetrievalType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "retrieval": return Retrieval;
            default: return null;
        }
    }
}
