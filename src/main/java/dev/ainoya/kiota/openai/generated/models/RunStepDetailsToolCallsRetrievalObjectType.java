package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of tool call. This is always going to be `retrieval` for this type of tool call.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunStepDetailsToolCallsRetrievalObjectType implements ValuedEnum {
    Retrieval("retrieval");
    public final String value;
    RunStepDetailsToolCallsRetrievalObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunStepDetailsToolCallsRetrievalObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "retrieval": return Retrieval;
            default: return null;
        }
    }
}
