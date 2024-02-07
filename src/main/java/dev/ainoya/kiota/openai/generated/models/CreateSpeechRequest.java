package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateSpeechRequest implements Parsable {
    /**
     * The text to generate audio for. The maximum length is 4096 characters.
     */
    private String input;
    /**
     * One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd`
     */
    private CreateSpeechRequestModel model;
    /**
     * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, and `flac`.
     */
    private CreateSpeechRequestResponseFormat responseFormat;
    /**
     * The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
     */
    private Double speed;
    /**
     * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
     */
    private CreateSpeechRequestVoice voice;
    /**
     * Instantiates a new CreateSpeechRequest and sets the default values.
     */
    public CreateSpeechRequest() {
        this.setResponseFormat(CreateSpeechRequestResponseFormat.forValue("mp3"));
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateSpeechRequest
     */
    @jakarta.annotation.Nonnull
    public static CreateSpeechRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateSpeechRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("input", (n) -> { this.setInput(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getObjectValue(CreateSpeechRequestModel::createFromDiscriminatorValue)); });
        deserializerMap.put("response_format", (n) -> { this.setResponseFormat(n.getEnumValue(CreateSpeechRequestResponseFormat::forValue)); });
        deserializerMap.put("speed", (n) -> { this.setSpeed(n.getDoubleValue()); });
        deserializerMap.put("voice", (n) -> { this.setVoice(n.getEnumValue(CreateSpeechRequestVoice::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the input property value. The text to generate audio for. The maximum length is 4096 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInput() {
        return this.input;
    }
    /**
     * Gets the model property value. One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd`
     * @return a CreateSpeechRequestModel
     */
    @jakarta.annotation.Nullable
    public CreateSpeechRequestModel getModel() {
        return this.model;
    }
    /**
     * Gets the response_format property value. The format to audio in. Supported formats are `mp3`, `opus`, `aac`, and `flac`.
     * @return a CreateSpeechRequestResponseFormat
     */
    @jakarta.annotation.Nullable
    public CreateSpeechRequestResponseFormat getResponseFormat() {
        return this.responseFormat;
    }
    /**
     * Gets the speed property value. The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSpeed() {
        return this.speed;
    }
    /**
     * Gets the voice property value. The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
     * @return a CreateSpeechRequestVoice
     */
    @jakarta.annotation.Nullable
    public CreateSpeechRequestVoice getVoice() {
        return this.voice;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("input", this.getInput());
        writer.writeObjectValue("model", this.getModel());
        writer.writeEnumValue("response_format", this.getResponseFormat());
        writer.writeDoubleValue("speed", this.getSpeed());
        writer.writeEnumValue("voice", this.getVoice());
    }
    /**
     * Sets the input property value. The text to generate audio for. The maximum length is 4096 characters.
     * @param value Value to set for the input property.
     */
    public void setInput(@jakarta.annotation.Nullable final String value) {
        this.input = value;
    }
    /**
     * Sets the model property value. One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd`
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final CreateSpeechRequestModel value) {
        this.model = value;
    }
    /**
     * Sets the response_format property value. The format to audio in. Supported formats are `mp3`, `opus`, `aac`, and `flac`.
     * @param value Value to set for the response_format property.
     */
    public void setResponseFormat(@jakarta.annotation.Nullable final CreateSpeechRequestResponseFormat value) {
        this.responseFormat = value;
    }
    /**
     * Sets the speed property value. The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
     * @param value Value to set for the speed property.
     */
    public void setSpeed(@jakarta.annotation.Nullable final Double value) {
        this.speed = value;
    }
    /**
     * Sets the voice property value. The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
     * @param value Value to set for the voice property.
     */
    public void setVoice(@jakarta.annotation.Nullable final CreateSpeechRequestVoice value) {
        this.voice = value;
    }
    /**
     * Composed type wrapper for classes string
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class CreateSpeechRequestModel implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type string
         */
        private String string;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a CreateSpeechRequestModel
         */
        @jakarta.annotation.Nonnull
        public static CreateSpeechRequestModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final CreateSpeechRequestModel result = new CreateSpeechRequestModel();
            if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * The deserialization information for the current model
         * @return a Map<String, java.util.function.Consumer<ParseNode>>
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the string property value. Composed type representation for type string
         * @return a String
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.string;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the string property value. Composed type representation for type string
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.string = value;
        }
    }
}
