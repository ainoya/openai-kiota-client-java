package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Describes an OpenAI model offering that can be used with the API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Model implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Unix timestamp (in seconds) when the model was created.
     */
    private Integer created;
    /**
     * The model identifier, which can be referenced in the API endpoints.
     */
    private String id;
    /**
     * The object type, which is always "model".
     */
    private ModelObject object;
    /**
     * The organization that owns the model.
     */
    private String ownedBy;
    /**
     * Instantiates a new Model and sets the default values.
     */
    public Model() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Model
     */
    @jakarta.annotation.Nonnull
    public static Model createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Model();
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
     * Gets the created property value. The Unix timestamp (in seconds) when the model was created.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCreated() {
        return this.created;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("created", (n) -> { this.setCreated(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(ModelObject::forValue)); });
        deserializerMap.put("owned_by", (n) -> { this.setOwnedBy(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The model identifier, which can be referenced in the API endpoints.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the object property value. The object type, which is always "model".
     * @return a ModelObject
     */
    @jakarta.annotation.Nullable
    public ModelObject getObject() {
        return this.object;
    }
    /**
     * Gets the owned_by property value. The organization that owns the model.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOwnedBy() {
        return this.ownedBy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("created", this.getCreated());
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("object", this.getObject());
        writer.writeStringValue("owned_by", this.getOwnedBy());
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
     * Sets the created property value. The Unix timestamp (in seconds) when the model was created.
     * @param value Value to set for the created property.
     */
    public void setCreated(@jakarta.annotation.Nullable final Integer value) {
        this.created = value;
    }
    /**
     * Sets the id property value. The model identifier, which can be referenced in the API endpoints.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the object property value. The object type, which is always "model".
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final ModelObject value) {
        this.object = value;
    }
    /**
     * Sets the owned_by property value. The organization that owns the model.
     * @param value Value to set for the owned_by property.
     */
    public void setOwnedBy(@jakarta.annotation.Nullable final String value) {
        this.ownedBy = value;
    }
}
