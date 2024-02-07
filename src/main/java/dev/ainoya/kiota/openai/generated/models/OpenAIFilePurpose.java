package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum OpenAIFilePurpose implements ValuedEnum {
    FineTune("fine-tune"),
    FineTuneResults("fine-tune-results"),
    Assistants("assistants"),
    Assistants_output("assistants_output");
    public final String value;
    OpenAIFilePurpose(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static OpenAIFilePurpose forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "fine-tune": return FineTune;
            case "fine-tune-results": return FineTuneResults;
            case "assistants": return Assistants;
            case "assistants_output": return Assistants_output;
            default: return null;
        }
    }
}
