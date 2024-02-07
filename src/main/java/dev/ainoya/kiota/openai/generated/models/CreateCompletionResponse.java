package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateCompletionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The list of completion choices the model generated for the input prompt.
     */
    private java.util.List<CreateCompletionResponseChoices> choices;
    /**
     * The Unix timestamp (in seconds) of when the completion was created.
     */
    private Integer created;
    /**
     * A unique identifier for the completion.
     */
    private String id;
    /**
     * The model used for completion.
     */
    private String model;
    /**
     * The object type, which is always "text_completion"
     */
    private CreateCompletionResponseObject object;
    /**
     * This fingerprint represents the backend configuration that the model runs with.Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.
     */
    private String systemFingerprint;
    /**
     * Usage statistics for the completion request.
     */
    private CompletionUsage usage;
    /**
     * Instantiates a new CreateCompletionResponse and sets the default values.
     */
    public CreateCompletionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateCompletionResponse
     */
    @jakarta.annotation.Nonnull
    public static CreateCompletionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateCompletionResponse();
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
     * Gets the choices property value. The list of completion choices the model generated for the input prompt.
     * @return a java.util.List<CreateCompletionResponseChoices>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CreateCompletionResponseChoices> getChoices() {
        return this.choices;
    }
    /**
     * Gets the created property value. The Unix timestamp (in seconds) of when the completion was created.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("choices", (n) -> { this.setChoices(n.getCollectionOfObjectValues(CreateCompletionResponseChoices::createFromDiscriminatorValue)); });
        deserializerMap.put("created", (n) -> { this.setCreated(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(CreateCompletionResponseObject::forValue)); });
        deserializerMap.put("system_fingerprint", (n) -> { this.setSystemFingerprint(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getObjectValue(CompletionUsage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. A unique identifier for the completion.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the model property value. The model used for completion.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the object property value. The object type, which is always "text_completion"
     * @return a CreateCompletionResponseObject
     */
    @jakarta.annotation.Nullable
    public CreateCompletionResponseObject getObject() {
        return this.object;
    }
    /**
     * Gets the system_fingerprint property value. This fingerprint represents the backend configuration that the model runs with.Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSystemFingerprint() {
        return this.systemFingerprint;
    }
    /**
     * Gets the usage property value. Usage statistics for the completion request.
     * @return a CompletionUsage
     */
    @jakarta.annotation.Nullable
    public CompletionUsage getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("choices", this.getChoices());
        writer.writeIntegerValue("created", this.getCreated());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("model", this.getModel());
        writer.writeEnumValue("object", this.getObject());
        writer.writeStringValue("system_fingerprint", this.getSystemFingerprint());
        writer.writeObjectValue("usage", this.getUsage());
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
     * Sets the choices property value. The list of completion choices the model generated for the input prompt.
     * @param value Value to set for the choices property.
     */
    public void setChoices(@jakarta.annotation.Nullable final java.util.List<CreateCompletionResponseChoices> value) {
        this.choices = value;
    }
    /**
     * Sets the created property value. The Unix timestamp (in seconds) of when the completion was created.
     * @param value Value to set for the created property.
     */
    public void setCreated(@jakarta.annotation.Nullable final Integer value) {
        this.created = value;
    }
    /**
     * Sets the id property value. A unique identifier for the completion.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the model property value. The model used for completion.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the object property value. The object type, which is always "text_completion"
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final CreateCompletionResponseObject value) {
        this.object = value;
    }
    /**
     * Sets the system_fingerprint property value. This fingerprint represents the backend configuration that the model runs with.Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.
     * @param value Value to set for the system_fingerprint property.
     */
    public void setSystemFingerprint(@jakarta.annotation.Nullable final String value) {
        this.systemFingerprint = value;
    }
    /**
     * Sets the usage property value. Usage statistics for the completion request.
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final CompletionUsage value) {
        this.usage = value;
    }
}
