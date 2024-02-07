package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatCompletionRequestToolMessage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The contents of the tool message.
     */
    private String content;
    /**
     * The role of the messages author, in this case `tool`.
     */
    private ChatCompletionRequestToolMessageRole role;
    /**
     * Tool call that this message is responding to.
     */
    private String toolCallId;
    /**
     * Instantiates a new ChatCompletionRequestToolMessage and sets the default values.
     */
    public ChatCompletionRequestToolMessage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatCompletionRequestToolMessage
     */
    @jakarta.annotation.Nonnull
    public static ChatCompletionRequestToolMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatCompletionRequestToolMessage();
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
     * Gets the content property value. The contents of the tool message.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(ChatCompletionRequestToolMessageRole::forValue)); });
        deserializerMap.put("tool_call_id", (n) -> { this.setToolCallId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the role property value. The role of the messages author, in this case `tool`.
     * @return a ChatCompletionRequestToolMessageRole
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestToolMessageRole getRole() {
        return this.role;
    }
    /**
     * Gets the tool_call_id property value. Tool call that this message is responding to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getToolCallId() {
        return this.toolCallId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeEnumValue("role", this.getRole());
        writer.writeStringValue("tool_call_id", this.getToolCallId());
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
     * Sets the content property value. The contents of the tool message.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the role property value. The role of the messages author, in this case `tool`.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final ChatCompletionRequestToolMessageRole value) {
        this.role = value;
    }
    /**
     * Sets the tool_call_id property value. Tool call that this message is responding to.
     * @param value Value to set for the tool_call_id property.
     */
    public void setToolCallId(@jakarta.annotation.Nullable final String value) {
        this.toolCallId = value;
    }
}
