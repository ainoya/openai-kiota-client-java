package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateSpeechRequestVoice implements ValuedEnum {
    Alloy("alloy"),
    Echo("echo"),
    Fable("fable"),
    Onyx("onyx"),
    Nova("nova"),
    Shimmer("shimmer");
    public final String value;
    CreateSpeechRequestVoice(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateSpeechRequestVoice forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "alloy": return Alloy;
            case "echo": return Echo;
            case "fable": return Fable;
            case "onyx": return Onyx;
            case "nova": return Nova;
            case "shimmer": return Shimmer;
            default: return null;
        }
    }
}
