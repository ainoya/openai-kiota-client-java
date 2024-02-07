package dev.ainoya.kiota.openai.generated.audio;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import dev.ainoya.kiota.openai.generated.audio.speech.SpeechRequestBuilder;
import dev.ainoya.kiota.openai.generated.audio.transcriptions.TranscriptionsRequestBuilder;
import dev.ainoya.kiota.openai.generated.audio.translations.TranslationsRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /audio
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AudioRequestBuilder extends BaseRequestBuilder {
    /**
     * The speech property
     */
    @jakarta.annotation.Nonnull
    public SpeechRequestBuilder speech() {
        return new SpeechRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The transcriptions property
     */
    @jakarta.annotation.Nonnull
    public TranscriptionsRequestBuilder transcriptions() {
        return new TranscriptionsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The translations property
     */
    @jakarta.annotation.Nonnull
    public TranslationsRequestBuilder translations() {
        return new TranslationsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new AudioRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AudioRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/audio", pathParameters);
    }
    /**
     * Instantiates a new AudioRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public AudioRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/audio", rawUrl);
    }
}
