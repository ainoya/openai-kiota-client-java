package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Composed type wrapper for classes ChatCompletionNamedToolChoice, string
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatCompletionToolChoiceOption implements ComposedTypeWrapper, Parsable {
    /**
     * Composed type representation for type ChatCompletionNamedToolChoice
     */
    private ChatCompletionNamedToolChoice chatCompletionNamedToolChoice;
    /**
     * Composed type representation for type string
     */
    private String string;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatCompletionToolChoiceOption
     */
    @jakarta.annotation.Nonnull
    public static ChatCompletionToolChoiceOption createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ChatCompletionToolChoiceOption result = new ChatCompletionToolChoiceOption();
        final ParseNode mappingValueNode = parseNode.getChildNode("");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
        }
        if (parseNode.getStringValue() != null) {
            result.setString(parseNode.getStringValue());
        }
        return result;
    }
    /**
     * Gets the ChatCompletionNamedToolChoice property value. Composed type representation for type ChatCompletionNamedToolChoice
     * @return a ChatCompletionNamedToolChoice
     */
    @jakarta.annotation.Nullable
    public ChatCompletionNamedToolChoice getChatCompletionNamedToolChoice() {
        return this.chatCompletionNamedToolChoice;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        if (this.getChatCompletionNamedToolChoice() != null) {
            return this.getChatCompletionNamedToolChoice().getFieldDeserializers();
        }
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
        if (this.getChatCompletionNamedToolChoice() != null) {
            writer.writeObjectValue(null, this.getChatCompletionNamedToolChoice());
        } else if (this.getString() != null) {
            writer.writeStringValue(null, this.getString());
        }
    }
    /**
     * Sets the ChatCompletionNamedToolChoice property value. Composed type representation for type ChatCompletionNamedToolChoice
     * @param value Value to set for the ChatCompletionNamedToolChoice property.
     */
    public void setChatCompletionNamedToolChoice(@jakarta.annotation.Nullable final ChatCompletionNamedToolChoice value) {
        this.chatCompletionNamedToolChoice = value;
    }
    /**
     * Sets the string property value. Composed type representation for type string
     * @param value Value to set for the string property.
     */
    public void setString(@jakarta.annotation.Nullable final String value) {
        this.string = value;
    }
}
