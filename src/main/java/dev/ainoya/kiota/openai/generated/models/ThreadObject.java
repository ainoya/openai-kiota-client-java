package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ThreadObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Unix timestamp (in seconds) for when the thread was created.
     */
    private Integer createdAt;
    /**
     * The identifier, which can be referenced in API endpoints.
     */
    private String id;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     */
    private ThreadObjectMetadata metadata;
    /**
     * The object type, which is always `thread`.
     */
    private ThreadObjectObject object;
    /**
     * Instantiates a new ThreadObject and sets the default values.
     */
    public ThreadObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ThreadObject
     */
    @jakarta.annotation.Nonnull
    public static ThreadObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThreadObject();
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
     * Gets the created_at property value. The Unix timestamp (in seconds) for when the thread was created.
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
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(ThreadObjectMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(ThreadObjectObject::forValue)); });
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
     * Gets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @return a ThreadObjectMetadata
     */
    @jakarta.annotation.Nullable
    public ThreadObjectMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the object property value. The object type, which is always `thread`.
     * @return a ThreadObjectObject
     */
    @jakarta.annotation.Nullable
    public ThreadObjectObject getObject() {
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
        writer.writeObjectValue("metadata", this.getMetadata());
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
     * Sets the created_at property value. The Unix timestamp (in seconds) for when the thread was created.
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
     * Sets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final ThreadObjectMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the object property value. The object type, which is always `thread`.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final ThreadObjectObject value) {
        this.object = value;
    }
}
