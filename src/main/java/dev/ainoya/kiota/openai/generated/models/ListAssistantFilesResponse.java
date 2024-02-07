package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ListAssistantFilesResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The data property
     */
    private java.util.List<AssistantFileObject> data;
    /**
     * The first_id property
     */
    private String firstId;
    /**
     * The has_more property
     */
    private Boolean hasMore;
    /**
     * The last_id property
     */
    private String lastId;
    /**
     * The object property
     */
    private String object;
    /**
     * Instantiates a new ListAssistantFilesResponse and sets the default values.
     */
    public ListAssistantFilesResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ListAssistantFilesResponse
     */
    @jakarta.annotation.Nonnull
    public static ListAssistantFilesResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ListAssistantFilesResponse();
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
     * Gets the data property value. The data property
     * @return a java.util.List<AssistantFileObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssistantFileObject> getData() {
        return this.data;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("data", (n) -> { this.setData(n.getCollectionOfObjectValues(AssistantFileObject::createFromDiscriminatorValue)); });
        deserializerMap.put("first_id", (n) -> { this.setFirstId(n.getStringValue()); });
        deserializerMap.put("has_more", (n) -> { this.setHasMore(n.getBooleanValue()); });
        deserializerMap.put("last_id", (n) -> { this.setLastId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the first_id property value. The first_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirstId() {
        return this.firstId;
    }
    /**
     * Gets the has_more property value. The has_more property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasMore() {
        return this.hasMore;
    }
    /**
     * Gets the last_id property value. The last_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastId() {
        return this.lastId;
    }
    /**
     * Gets the object property value. The object property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getObject() {
        return this.object;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("data", this.getData());
        writer.writeStringValue("first_id", this.getFirstId());
        writer.writeBooleanValue("has_more", this.getHasMore());
        writer.writeStringValue("last_id", this.getLastId());
        writer.writeStringValue("object", this.getObject());
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
     * Sets the data property value. The data property
     * @param value Value to set for the data property.
     */
    public void setData(@jakarta.annotation.Nullable final java.util.List<AssistantFileObject> value) {
        this.data = value;
    }
    /**
     * Sets the first_id property value. The first_id property
     * @param value Value to set for the first_id property.
     */
    public void setFirstId(@jakarta.annotation.Nullable final String value) {
        this.firstId = value;
    }
    /**
     * Sets the has_more property value. The has_more property
     * @param value Value to set for the has_more property.
     */
    public void setHasMore(@jakarta.annotation.Nullable final Boolean value) {
        this.hasMore = value;
    }
    /**
     * Sets the last_id property value. The last_id property
     * @param value Value to set for the last_id property.
     */
    public void setLastId(@jakarta.annotation.Nullable final String value) {
        this.lastId = value;
    }
    /**
     * Sets the object property value. The object property
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final String value) {
        this.object = value;
    }
}
