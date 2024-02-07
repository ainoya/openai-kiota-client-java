package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and `gpt-3.5-turbo-1106`.Setting to `{ "type": "json_object" }` enables JSON mode, which guarantees the message the model generates is valid JSON.**Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly "stuck" request. Also note that the message content may be partially cut off if `finish_reason="length"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateChatCompletionRequestResponseFormat implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Must be one of `text` or `json_object`.
     */
    private CreateChatCompletionRequestResponseFormatType type;
    /**
     * Instantiates a new CreateChatCompletionRequestResponseFormat and sets the default values.
     */
    public CreateChatCompletionRequestResponseFormat() {
        this.setAdditionalData(new HashMap<>());
        this.setType(CreateChatCompletionRequestResponseFormatType.forValue("text"));
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateChatCompletionRequestResponseFormat
     */
    @jakarta.annotation.Nonnull
    public static CreateChatCompletionRequestResponseFormat createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateChatCompletionRequestResponseFormat();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(CreateChatCompletionRequestResponseFormatType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the type property value. Must be one of `text` or `json_object`.
     * @return a CreateChatCompletionRequestResponseFormatType
     */
    @jakarta.annotation.Nullable
    public CreateChatCompletionRequestResponseFormatType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("type", this.getType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the type property value. Must be one of `text` or `json_object`.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final CreateChatCompletionRequestResponseFormatType value) {
        this.type = value;
    }
}
