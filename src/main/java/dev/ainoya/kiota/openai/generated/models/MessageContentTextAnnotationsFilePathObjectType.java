package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Always `file_path`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MessageContentTextAnnotationsFilePathObjectType implements ValuedEnum {
    File_path("file_path");
    public final String value;
    MessageContentTextAnnotationsFilePathObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MessageContentTextAnnotationsFilePathObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "file_path": return File_path;
            default: return null;
        }
    }
}
