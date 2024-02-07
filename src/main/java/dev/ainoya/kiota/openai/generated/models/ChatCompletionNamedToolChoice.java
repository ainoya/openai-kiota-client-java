package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatCompletionNamedToolChoice implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The function property
     */
    private ChatCompletionNamedToolChoiceFunction function;
    /**
     * The type of the tool. Currently, only `function` is supported.
     */
    private ChatCompletionNamedToolChoiceType type;
    /**
     * Instantiates a new ChatCompletionNamedToolChoice and sets the default values.
     */
    public ChatCompletionNamedToolChoice() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatCompletionNamedToolChoice
     */
    @jakarta.annotation.Nonnull
    public static ChatCompletionNamedToolChoice createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatCompletionNamedToolChoice();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("function", (n) -> { this.setFunction(n.getObjectValue(ChatCompletionNamedToolChoiceFunction::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ChatCompletionNamedToolChoiceType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the function property value. The function property
     * @return a ChatCompletionNamedToolChoiceFunction
     */
    @jakarta.annotation.Nullable
    public ChatCompletionNamedToolChoiceFunction getFunction() {
        return this.function;
    }
    /**
     * Gets the type property value. The type of the tool. Currently, only `function` is supported.
     * @return a ChatCompletionNamedToolChoiceType
     */
    @jakarta.annotation.Nullable
    public ChatCompletionNamedToolChoiceType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("function", this.getFunction());
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
     * Sets the function property value. The function property
     * @param value Value to set for the function property.
     */
    public void setFunction(@jakarta.annotation.Nullable final ChatCompletionNamedToolChoiceFunction value) {
        this.function = value;
    }
    /**
     * Sets the type property value. The type of the tool. Currently, only `function` is supported.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final ChatCompletionNamedToolChoiceType value) {
        this.type = value;
    }
}
