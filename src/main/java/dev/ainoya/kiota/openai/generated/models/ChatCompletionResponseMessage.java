package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A chat completion message generated by the model.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatCompletionResponseMessage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The contents of the message.
     */
    private String content;
    /**
     * Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.
     * @deprecated
     * 
     */
    @Deprecated
    private ChatCompletionResponseMessageFunctionCall functionCall;
    /**
     * The role of the author of this message.
     */
    private ChatCompletionResponseMessageRole role;
    /**
     * The tool calls generated by the model, such as function calls.
     */
    private java.util.List<ChatCompletionMessageToolCall> toolCalls;
    /**
     * Instantiates a new ChatCompletionResponseMessage and sets the default values.
     */
    public ChatCompletionResponseMessage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatCompletionResponseMessage
     */
    @jakarta.annotation.Nonnull
    public static ChatCompletionResponseMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatCompletionResponseMessage();
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
     * Gets the content property value. The contents of the message.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("function_call", (n) -> { this.setFunctionCall(n.getObjectValue(ChatCompletionResponseMessageFunctionCall::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(ChatCompletionResponseMessageRole::forValue)); });
        deserializerMap.put("tool_calls", (n) -> { this.setToolCalls(n.getCollectionOfObjectValues(ChatCompletionMessageToolCall::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the function_call property value. Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.
     * @return a ChatCompletionResponseMessageFunctionCall
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public ChatCompletionResponseMessageFunctionCall getFunctionCall() {
        return this.functionCall;
    }
    /**
     * Gets the role property value. The role of the author of this message.
     * @return a ChatCompletionResponseMessageRole
     */
    @jakarta.annotation.Nullable
    public ChatCompletionResponseMessageRole getRole() {
        return this.role;
    }
    /**
     * Gets the tool_calls property value. The tool calls generated by the model, such as function calls.
     * @return a java.util.List<ChatCompletionMessageToolCall>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChatCompletionMessageToolCall> getToolCalls() {
        return this.toolCalls;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeObjectValue("function_call", this.getFunctionCall());
        writer.writeEnumValue("role", this.getRole());
        writer.writeCollectionOfObjectValues("tool_calls", this.getToolCalls());
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
     * Sets the content property value. The contents of the message.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the function_call property value. Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.
     * @param value Value to set for the function_call property.
     * @deprecated
     * 
     */
    @Deprecated
    public void setFunctionCall(@jakarta.annotation.Nullable final ChatCompletionResponseMessageFunctionCall value) {
        this.functionCall = value;
    }
    /**
     * Sets the role property value. The role of the author of this message.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final ChatCompletionResponseMessageRole value) {
        this.role = value;
    }
    /**
     * Sets the tool_calls property value. The tool calls generated by the model, such as function calls.
     * @param value Value to set for the tool_calls property.
     */
    public void setToolCalls(@jakarta.annotation.Nullable final java.util.List<ChatCompletionMessageToolCall> value) {
        this.toolCalls = value;
    }
}
