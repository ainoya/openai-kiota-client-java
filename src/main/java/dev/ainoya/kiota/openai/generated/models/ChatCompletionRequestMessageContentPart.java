package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Composed type wrapper for classes ChatCompletionRequestMessageContentPartImage, ChatCompletionRequestMessageContentPartText
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatCompletionRequestMessageContentPart implements ComposedTypeWrapper, Parsable {
    /**
     * Composed type representation for type ChatCompletionRequestMessageContentPartImage
     */
    private ChatCompletionRequestMessageContentPartImage chatCompletionRequestMessageContentPartImage;
    /**
     * Composed type representation for type ChatCompletionRequestMessageContentPartText
     */
    private ChatCompletionRequestMessageContentPartText chatCompletionRequestMessageContentPartText;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatCompletionRequestMessageContentPart
     */
    @jakarta.annotation.Nonnull
    public static ChatCompletionRequestMessageContentPart createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ChatCompletionRequestMessageContentPart result = new ChatCompletionRequestMessageContentPart();
        final ParseNode mappingValueNode = parseNode.getChildNode("type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            if ("ChatCompletionRequestMessageContentPartImage".equalsIgnoreCase(mappingValue)) {
                result.setChatCompletionRequestMessageContentPartImage(new ChatCompletionRequestMessageContentPartImage());
            } else if ("ChatCompletionRequestMessageContentPartText".equalsIgnoreCase(mappingValue)) {
                result.setChatCompletionRequestMessageContentPartText(new ChatCompletionRequestMessageContentPartText());
            }
        }
        return result;
    }
    /**
     * Gets the ChatCompletionRequestMessageContentPartImage property value. Composed type representation for type ChatCompletionRequestMessageContentPartImage
     * @return a ChatCompletionRequestMessageContentPartImage
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestMessageContentPartImage getChatCompletionRequestMessageContentPartImage() {
        return this.chatCompletionRequestMessageContentPartImage;
    }
    /**
     * Gets the ChatCompletionRequestMessageContentPartText property value. Composed type representation for type ChatCompletionRequestMessageContentPartText
     * @return a ChatCompletionRequestMessageContentPartText
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestMessageContentPartText getChatCompletionRequestMessageContentPartText() {
        return this.chatCompletionRequestMessageContentPartText;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        if (this.getChatCompletionRequestMessageContentPartImage() != null) {
            return this.getChatCompletionRequestMessageContentPartImage().getFieldDeserializers();
        } else if (this.getChatCompletionRequestMessageContentPartText() != null) {
            return this.getChatCompletionRequestMessageContentPartText().getFieldDeserializers();
        }
        return new HashMap<String, java.util.function.Consumer<ParseNode>>();
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        if (this.getChatCompletionRequestMessageContentPartImage() != null) {
            writer.writeObjectValue(null, this.getChatCompletionRequestMessageContentPartImage());
        } else if (this.getChatCompletionRequestMessageContentPartText() != null) {
            writer.writeObjectValue(null, this.getChatCompletionRequestMessageContentPartText());
        }
    }
    /**
     * Sets the ChatCompletionRequestMessageContentPartImage property value. Composed type representation for type ChatCompletionRequestMessageContentPartImage
     * @param value Value to set for the ChatCompletionRequestMessageContentPartImage property.
     */
    public void setChatCompletionRequestMessageContentPartImage(@jakarta.annotation.Nullable final ChatCompletionRequestMessageContentPartImage value) {
        this.chatCompletionRequestMessageContentPartImage = value;
    }
    /**
     * Sets the ChatCompletionRequestMessageContentPartText property value. Composed type representation for type ChatCompletionRequestMessageContentPartText
     * @param value Value to set for the ChatCompletionRequestMessageContentPartText property.
     */
    public void setChatCompletionRequestMessageContentPartText(@jakarta.annotation.Nullable final ChatCompletionRequestMessageContentPartText value) {
        this.chatCompletionRequestMessageContentPartText = value;
    }
}
