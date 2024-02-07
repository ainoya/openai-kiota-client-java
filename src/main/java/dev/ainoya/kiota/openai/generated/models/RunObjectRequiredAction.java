package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Details on the action required to continue the run. Will be `null` if no action is required.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunObjectRequiredAction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Details on the tool outputs needed for this run to continue.
     */
    private RunObjectRequiredActionSubmitToolOutputs submitToolOutputs;
    /**
     * For now, this is always `submit_tool_outputs`.
     */
    private RunObjectRequiredActionType type;
    /**
     * Instantiates a new RunObjectRequiredAction and sets the default values.
     */
    public RunObjectRequiredAction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunObjectRequiredAction
     */
    @jakarta.annotation.Nonnull
    public static RunObjectRequiredAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunObjectRequiredAction();
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
        deserializerMap.put("submit_tool_outputs", (n) -> { this.setSubmitToolOutputs(n.getObjectValue(RunObjectRequiredActionSubmitToolOutputs::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RunObjectRequiredActionType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the submit_tool_outputs property value. Details on the tool outputs needed for this run to continue.
     * @return a RunObjectRequiredActionSubmitToolOutputs
     */
    @jakarta.annotation.Nullable
    public RunObjectRequiredActionSubmitToolOutputs getSubmitToolOutputs() {
        return this.submitToolOutputs;
    }
    /**
     * Gets the type property value. For now, this is always `submit_tool_outputs`.
     * @return a RunObjectRequiredActionType
     */
    @jakarta.annotation.Nullable
    public RunObjectRequiredActionType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("submit_tool_outputs", this.getSubmitToolOutputs());
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
     * Sets the submit_tool_outputs property value. Details on the tool outputs needed for this run to continue.
     * @param value Value to set for the submit_tool_outputs property.
     */
    public void setSubmitToolOutputs(@jakarta.annotation.Nullable final RunObjectRequiredActionSubmitToolOutputs value) {
        this.submitToolOutputs = value;
    }
    /**
     * Sets the type property value. For now, this is always `submit_tool_outputs`.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RunObjectRequiredActionType value) {
        this.type = value;
    }
}
