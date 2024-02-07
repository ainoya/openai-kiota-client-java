package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents a chat completion response returned by model, based on the provided input.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateChatCompletionResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of chat completion choices. Can be more than one if `n` is greater than 1.
     */
    private java.util.List<CreateChatCompletionResponseChoices> choices;
    /**
     * The Unix timestamp (in seconds) of when the chat completion was created.
     */
    private Integer created;
    /**
     * A unique identifier for the chat completion.
     */
    private String id;
    /**
     * The model used for the chat completion.
     */
    private String model;
    /**
     * The object type, which is always `chat.completion`.
     */
    private CreateChatCompletionResponseObject object;
    /**
     * This fingerprint represents the backend configuration that the model runs with.Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.
     */
    private String systemFingerprint;
    /**
     * Usage statistics for the completion request.
     */
    private CompletionUsage usage;
    /**
     * Instantiates a new CreateChatCompletionResponse and sets the default values.
     */
    public CreateChatCompletionResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateChatCompletionResponse
     */
    @jakarta.annotation.Nonnull
    public static CreateChatCompletionResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateChatCompletionResponse();
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
     * Gets the choices property value. A list of chat completion choices. Can be more than one if `n` is greater than 1.
     * @return a java.util.List<CreateChatCompletionResponseChoices>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CreateChatCompletionResponseChoices> getChoices() {
        return this.choices;
    }
    /**
     * Gets the created property value. The Unix timestamp (in seconds) of when the chat completion was created.
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
        deserializerMap.put("choices", (n) -> { this.setChoices(n.getCollectionOfObjectValues(CreateChatCompletionResponseChoices::createFromDiscriminatorValue)); });
        deserializerMap.put("created", (n) -> { this.setCreated(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(CreateChatCompletionResponseObject::forValue)); });
        deserializerMap.put("system_fingerprint", (n) -> { this.setSystemFingerprint(n.getStringValue()); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getObjectValue(CompletionUsage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. A unique identifier for the chat completion.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the model property value. The model used for the chat completion.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the object property value. The object type, which is always `chat.completion`.
     * @return a CreateChatCompletionResponseObject
     */
    @jakarta.annotation.Nullable
    public CreateChatCompletionResponseObject getObject() {
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
     * Sets the choices property value. A list of chat completion choices. Can be more than one if `n` is greater than 1.
     * @param value Value to set for the choices property.
     */
    public void setChoices(@jakarta.annotation.Nullable final java.util.List<CreateChatCompletionResponseChoices> value) {
        this.choices = value;
    }
    /**
     * Sets the created property value. The Unix timestamp (in seconds) of when the chat completion was created.
     * @param value Value to set for the created property.
     */
    public void setCreated(@jakarta.annotation.Nullable final Integer value) {
        this.created = value;
    }
    /**
     * Sets the id property value. A unique identifier for the chat completion.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the model property value. The model used for the chat completion.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the object property value. The object type, which is always `chat.completion`.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final CreateChatCompletionResponseObject value) {
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
