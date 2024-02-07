package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatCompletionMessageToolCall implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The function that the model called.
     */
    private ChatCompletionMessageToolCallFunction function;
    /**
     * The ID of the tool call.
     */
    private String id;
    /**
     * The type of the tool. Currently, only `function` is supported.
     */
    private ChatCompletionMessageToolCallType type;
    /**
     * Instantiates a new ChatCompletionMessageToolCall and sets the default values.
     */
    public ChatCompletionMessageToolCall() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatCompletionMessageToolCall
     */
    @jakarta.annotation.Nonnull
    public static ChatCompletionMessageToolCall createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatCompletionMessageToolCall();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("function", (n) -> { this.setFunction(n.getObjectValue(ChatCompletionMessageToolCallFunction::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ChatCompletionMessageToolCallType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the function property value. The function that the model called.
     * @return a ChatCompletionMessageToolCallFunction
     */
    @jakarta.annotation.Nullable
    public ChatCompletionMessageToolCallFunction getFunction() {
        return this.function;
    }
    /**
     * Gets the id property value. The ID of the tool call.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the type property value. The type of the tool. Currently, only `function` is supported.
     * @return a ChatCompletionMessageToolCallType
     */
    @jakarta.annotation.Nullable
    public ChatCompletionMessageToolCallType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("function", this.getFunction());
        writer.writeStringValue("id", this.getId());
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
     * Sets the function property value. The function that the model called.
     * @param value Value to set for the function property.
     */
    public void setFunction(@jakarta.annotation.Nullable final ChatCompletionMessageToolCallFunction value) {
        this.function = value;
    }
    /**
     * Sets the id property value. The ID of the tool call.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the type property value. The type of the tool. Currently, only `function` is supported.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final ChatCompletionMessageToolCallType value) {
        this.type = value;
    }
}
