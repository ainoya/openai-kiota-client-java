package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * Always `file_citation`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum MessageContentTextAnnotationsFileCitationObjectType implements ValuedEnum {
    File_citation("file_citation");
    public final String value;
    MessageContentTextAnnotationsFileCitationObjectType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static MessageContentTextAnnotationsFileCitationObjectType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "file_citation": return File_citation;
            default: return null;
        }
    }
}
