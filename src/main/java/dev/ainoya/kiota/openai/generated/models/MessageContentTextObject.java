package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The text content that is part of a message.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageContentTextObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The text property
     */
    private MessageContentTextObjectText text;
    /**
     * Always `text`.
     */
    private MessageContentTextObjectType type;
    /**
     * Instantiates a new MessageContentTextObject and sets the default values.
     */
    public MessageContentTextObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageContentTextObject
     */
    @jakarta.annotation.Nonnull
    public static MessageContentTextObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageContentTextObject();
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
        deserializerMap.put("text", (n) -> { this.setText(n.getObjectValue(MessageContentTextObjectText::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(MessageContentTextObjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the text property value. The text property
     * @return a MessageContentTextObjectText
     */
    @jakarta.annotation.Nullable
    public MessageContentTextObjectText getText() {
        return this.text;
    }
    /**
     * Gets the type property value. Always `text`.
     * @return a MessageContentTextObjectType
     */
    @jakarta.annotation.Nullable
    public MessageContentTextObjectType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("text", this.getText());
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
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final MessageContentTextObjectText value) {
        this.text = value;
    }
    /**
     * Sets the type property value. Always `text`.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final MessageContentTextObjectType value) {
        this.type = value;
    }
}
