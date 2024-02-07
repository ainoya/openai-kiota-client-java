package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A list of files attached to a `message`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageFileObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Unix timestamp (in seconds) for when the message file was created.
     */
    private Integer createdAt;
    /**
     * The identifier, which can be referenced in API endpoints.
     */
    private String id;
    /**
     * The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
     */
    private String messageId;
    /**
     * The object type, which is always `thread.message.file`.
     */
    private MessageFileObjectObject object;
    /**
     * Instantiates a new MessageFileObject and sets the default values.
     */
    public MessageFileObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageFileObject
     */
    @jakarta.annotation.Nonnull
    public static MessageFileObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageFileObject();
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
     * Gets the created_at property value. The Unix timestamp (in seconds) for when the message file was created.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("message_id", (n) -> { this.setMessageId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(MessageFileObjectObject::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The identifier, which can be referenced in API endpoints.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the message_id property value. The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessageId() {
        return this.messageId;
    }
    /**
     * Gets the object property value. The object type, which is always `thread.message.file`.
     * @return a MessageFileObjectObject
     */
    @jakarta.annotation.Nullable
    public MessageFileObjectObject getObject() {
        return this.object;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("created_at", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("message_id", this.getMessageId());
        writer.writeEnumValue("object", this.getObject());
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
     * Sets the created_at property value. The Unix timestamp (in seconds) for when the message file was created.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Integer value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. The identifier, which can be referenced in API endpoints.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the message_id property value. The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
     * @param value Value to set for the message_id property.
     */
    public void setMessageId(@jakarta.annotation.Nullable final String value) {
        this.messageId = value;
    }
    /**
     * Sets the object property value. The object type, which is always `thread.message.file`.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final MessageFileObjectObject value) {
        this.object = value;
    }
}
