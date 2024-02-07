package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A list of [Files](/docs/api-reference/files) attached to an `assistant`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssistantFileObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The assistant ID that the file is attached to.
     */
    private String assistantId;
    /**
     * The Unix timestamp (in seconds) for when the assistant file was created.
     */
    private Integer createdAt;
    /**
     * The identifier, which can be referenced in API endpoints.
     */
    private String id;
    /**
     * The object type, which is always `assistant.file`.
     */
    private AssistantFileObjectObject object;
    /**
     * Instantiates a new AssistantFileObject and sets the default values.
     */
    public AssistantFileObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssistantFileObject
     */
    @jakarta.annotation.Nonnull
    public static AssistantFileObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssistantFileObject();
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
     * Gets the assistant_id property value. The assistant ID that the file is attached to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssistantId() {
        return this.assistantId;
    }
    /**
     * Gets the created_at property value. The Unix timestamp (in seconds) for when the assistant file was created.
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
        deserializerMap.put("assistant_id", (n) -> { this.setAssistantId(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(AssistantFileObjectObject::forValue)); });
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
     * Gets the object property value. The object type, which is always `assistant.file`.
     * @return a AssistantFileObjectObject
     */
    @jakarta.annotation.Nullable
    public AssistantFileObjectObject getObject() {
        return this.object;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assistant_id", this.getAssistantId());
        writer.writeIntegerValue("created_at", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
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
     * Sets the assistant_id property value. The assistant ID that the file is attached to.
     * @param value Value to set for the assistant_id property.
     */
    public void setAssistantId(@jakarta.annotation.Nullable final String value) {
        this.assistantId = value;
    }
    /**
     * Sets the created_at property value. The Unix timestamp (in seconds) for when the assistant file was created.
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
     * Sets the object property value. The object type, which is always `assistant.file`.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final AssistantFileObjectObject value) {
        this.object = value;
    }
}
