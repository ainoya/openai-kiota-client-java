package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Details of the message creation by the run step.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunStepDetailsMessageCreationObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The message_creation property
     */
    private RunStepDetailsMessageCreationObjectMessageCreation messageCreation;
    /**
     * Always `message_creation`.
     */
    private RunStepDetailsMessageCreationObjectType type;
    /**
     * Instantiates a new RunStepDetailsMessageCreationObject and sets the default values.
     */
    public RunStepDetailsMessageCreationObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunStepDetailsMessageCreationObject
     */
    @jakarta.annotation.Nonnull
    public static RunStepDetailsMessageCreationObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunStepDetailsMessageCreationObject();
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
        deserializerMap.put("message_creation", (n) -> { this.setMessageCreation(n.getObjectValue(RunStepDetailsMessageCreationObjectMessageCreation::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RunStepDetailsMessageCreationObjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the message_creation property value. The message_creation property
     * @return a RunStepDetailsMessageCreationObjectMessageCreation
     */
    @jakarta.annotation.Nullable
    public RunStepDetailsMessageCreationObjectMessageCreation getMessageCreation() {
        return this.messageCreation;
    }
    /**
     * Gets the type property value. Always `message_creation`.
     * @return a RunStepDetailsMessageCreationObjectType
     */
    @jakarta.annotation.Nullable
    public RunStepDetailsMessageCreationObjectType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("message_creation", this.getMessageCreation());
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
     * Sets the message_creation property value. The message_creation property
     * @param value Value to set for the message_creation property.
     */
    public void setMessageCreation(@jakarta.annotation.Nullable final RunStepDetailsMessageCreationObjectMessageCreation value) {
        this.messageCreation = value;
    }
    /**
     * Sets the type property value. Always `message_creation`.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RunStepDetailsMessageCreationObjectType value) {
        this.type = value;
    }
}
