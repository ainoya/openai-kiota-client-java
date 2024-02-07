package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Composed type wrapper for classes ChatCompletionRequestAssistantMessage, ChatCompletionRequestFunctionMessage, ChatCompletionRequestSystemMessage, ChatCompletionRequestToolMessage, ChatCompletionRequestUserMessage
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatCompletionRequestMessage implements ComposedTypeWrapper, Parsable {
    /**
     * Composed type representation for type ChatCompletionRequestAssistantMessage
     */
    private ChatCompletionRequestAssistantMessage chatCompletionRequestAssistantMessage;
    /**
     * Composed type representation for type ChatCompletionRequestFunctionMessage
     */
    private ChatCompletionRequestFunctionMessage chatCompletionRequestFunctionMessage;
    /**
     * Composed type representation for type ChatCompletionRequestSystemMessage
     */
    private ChatCompletionRequestSystemMessage chatCompletionRequestSystemMessage;
    /**
     * Composed type representation for type ChatCompletionRequestToolMessage
     */
    private ChatCompletionRequestToolMessage chatCompletionRequestToolMessage;
    /**
     * Composed type representation for type ChatCompletionRequestUserMessage
     */
    private ChatCompletionRequestUserMessage chatCompletionRequestUserMessage;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatCompletionRequestMessage
     */
    @jakarta.annotation.Nonnull
    public static ChatCompletionRequestMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ChatCompletionRequestMessage result = new ChatCompletionRequestMessage();
        final ParseNode mappingValueNode = parseNode.getChildNode("role");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            if ("ChatCompletionRequestAssistantMessage".equalsIgnoreCase(mappingValue)) {
                result.setChatCompletionRequestAssistantMessage(new ChatCompletionRequestAssistantMessage());
            } else if ("ChatCompletionRequestFunctionMessage".equalsIgnoreCase(mappingValue)) {
                result.setChatCompletionRequestFunctionMessage(new ChatCompletionRequestFunctionMessage());
            } else if ("ChatCompletionRequestSystemMessage".equalsIgnoreCase(mappingValue)) {
                result.setChatCompletionRequestSystemMessage(new ChatCompletionRequestSystemMessage());
            } else if ("ChatCompletionRequestToolMessage".equalsIgnoreCase(mappingValue)) {
                result.setChatCompletionRequestToolMessage(new ChatCompletionRequestToolMessage());
            } else if ("ChatCompletionRequestUserMessage".equalsIgnoreCase(mappingValue)) {
                result.setChatCompletionRequestUserMessage(new ChatCompletionRequestUserMessage());
            }
        }
        return result;
    }
    /**
     * Gets the ChatCompletionRequestAssistantMessage property value. Composed type representation for type ChatCompletionRequestAssistantMessage
     * @return a ChatCompletionRequestAssistantMessage
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestAssistantMessage getChatCompletionRequestAssistantMessage() {
        return this.chatCompletionRequestAssistantMessage;
    }
    /**
     * Gets the ChatCompletionRequestFunctionMessage property value. Composed type representation for type ChatCompletionRequestFunctionMessage
     * @return a ChatCompletionRequestFunctionMessage
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestFunctionMessage getChatCompletionRequestFunctionMessage() {
        return this.chatCompletionRequestFunctionMessage;
    }
    /**
     * Gets the ChatCompletionRequestSystemMessage property value. Composed type representation for type ChatCompletionRequestSystemMessage
     * @return a ChatCompletionRequestSystemMessage
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestSystemMessage getChatCompletionRequestSystemMessage() {
        return this.chatCompletionRequestSystemMessage;
    }
    /**
     * Gets the ChatCompletionRequestToolMessage property value. Composed type representation for type ChatCompletionRequestToolMessage
     * @return a ChatCompletionRequestToolMessage
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestToolMessage getChatCompletionRequestToolMessage() {
        return this.chatCompletionRequestToolMessage;
    }
    /**
     * Gets the ChatCompletionRequestUserMessage property value. Composed type representation for type ChatCompletionRequestUserMessage
     * @return a ChatCompletionRequestUserMessage
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestUserMessage getChatCompletionRequestUserMessage() {
        return this.chatCompletionRequestUserMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        if (this.getChatCompletionRequestAssistantMessage() != null) {
            return this.getChatCompletionRequestAssistantMessage().getFieldDeserializers();
        } else if (this.getChatCompletionRequestFunctionMessage() != null) {
            return this.getChatCompletionRequestFunctionMessage().getFieldDeserializers();
        } else if (this.getChatCompletionRequestSystemMessage() != null) {
            return this.getChatCompletionRequestSystemMessage().getFieldDeserializers();
        } else if (this.getChatCompletionRequestToolMessage() != null) {
            return this.getChatCompletionRequestToolMessage().getFieldDeserializers();
        } else if (this.getChatCompletionRequestUserMessage() != null) {
            return this.getChatCompletionRequestUserMessage().getFieldDeserializers();
        }
        return new HashMap<String, java.util.function.Consumer<ParseNode>>();
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        if (this.getChatCompletionRequestAssistantMessage() != null) {
            writer.writeObjectValue(null, this.getChatCompletionRequestAssistantMessage());
        } else if (this.getChatCompletionRequestFunctionMessage() != null) {
            writer.writeObjectValue(null, this.getChatCompletionRequestFunctionMessage());
        } else if (this.getChatCompletionRequestSystemMessage() != null) {
            writer.writeObjectValue(null, this.getChatCompletionRequestSystemMessage());
        } else if (this.getChatCompletionRequestToolMessage() != null) {
            writer.writeObjectValue(null, this.getChatCompletionRequestToolMessage());
        } else if (this.getChatCompletionRequestUserMessage() != null) {
            writer.writeObjectValue(null, this.getChatCompletionRequestUserMessage());
        }
    }
    /**
     * Sets the ChatCompletionRequestAssistantMessage property value. Composed type representation for type ChatCompletionRequestAssistantMessage
     * @param value Value to set for the ChatCompletionRequestAssistantMessage property.
     */
    public void setChatCompletionRequestAssistantMessage(@jakarta.annotation.Nullable final ChatCompletionRequestAssistantMessage value) {
        this.chatCompletionRequestAssistantMessage = value;
    }
    /**
     * Sets the ChatCompletionRequestFunctionMessage property value. Composed type representation for type ChatCompletionRequestFunctionMessage
     * @param value Value to set for the ChatCompletionRequestFunctionMessage property.
     */
    public void setChatCompletionRequestFunctionMessage(@jakarta.annotation.Nullable final ChatCompletionRequestFunctionMessage value) {
        this.chatCompletionRequestFunctionMessage = value;
    }
    /**
     * Sets the ChatCompletionRequestSystemMessage property value. Composed type representation for type ChatCompletionRequestSystemMessage
     * @param value Value to set for the ChatCompletionRequestSystemMessage property.
     */
    public void setChatCompletionRequestSystemMessage(@jakarta.annotation.Nullable final ChatCompletionRequestSystemMessage value) {
        this.chatCompletionRequestSystemMessage = value;
    }
    /**
     * Sets the ChatCompletionRequestToolMessage property value. Composed type representation for type ChatCompletionRequestToolMessage
     * @param value Value to set for the ChatCompletionRequestToolMessage property.
     */
    public void setChatCompletionRequestToolMessage(@jakarta.annotation.Nullable final ChatCompletionRequestToolMessage value) {
        this.chatCompletionRequestToolMessage = value;
    }
    /**
     * Sets the ChatCompletionRequestUserMessage property value. Composed type representation for type ChatCompletionRequestUserMessage
     * @param value Value to set for the ChatCompletionRequestUserMessage property.
     */
    public void setChatCompletionRequestUserMessage(@jakarta.annotation.Nullable final ChatCompletionRequestUserMessage value) {
        this.chatCompletionRequestUserMessage = value;
    }
}
