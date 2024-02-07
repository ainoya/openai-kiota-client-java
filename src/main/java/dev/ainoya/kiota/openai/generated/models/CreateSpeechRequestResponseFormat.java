package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, and `flac`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateSpeechRequestResponseFormat implements ValuedEnum {
    Mp3("mp3"),
    Opus("opus"),
    Aac("aac"),
    Flac("flac");
    public final String value;
    CreateSpeechRequestResponseFormat(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateSpeechRequestResponseFormat forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "mp3": return Mp3;
            case "opus": return Opus;
            case "aac": return Aac;
            case "flac": return Flac;
            default: return null;
        }
    }
}
