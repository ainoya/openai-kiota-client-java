package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The type of tool being defined: `code_interpreter`
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum AssistantToolsCodeType implements ValuedEnum {
    Code_interpreter("code_interpreter");
    public final String value;
    AssistantToolsCodeType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static AssistantToolsCodeType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "code_interpreter": return Code_interpreter;
            default: return null;
        }
    }
}
