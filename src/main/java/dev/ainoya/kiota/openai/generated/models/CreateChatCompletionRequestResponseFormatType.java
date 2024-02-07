package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Must be one of `text` or `json_object`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateChatCompletionRequestResponseFormatType implements ValuedEnum {
    Text("text"),
    Json_object("json_object");
    public final String value;
    CreateChatCompletionRequestResponseFormatType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateChatCompletionRequestResponseFormatType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "text": return Text;
            case "json_object": return Json_object;
            default: return null;
        }
    }
}
