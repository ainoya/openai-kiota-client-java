package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Details of the Code Interpreter tool call the run step was involved in.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunStepDetailsToolCallsCodeObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Code Interpreter tool call definition.
     */
    private RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter;
    /**
     * The ID of the tool call.
     */
    private String id;
    /**
     * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
     */
    private RunStepDetailsToolCallsCodeObjectType type;
    /**
     * Instantiates a new RunStepDetailsToolCallsCodeObject and sets the default values.
     */
    public RunStepDetailsToolCallsCodeObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunStepDetailsToolCallsCodeObject
     */
    @jakarta.annotation.Nonnull
    public static RunStepDetailsToolCallsCodeObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunStepDetailsToolCallsCodeObject();
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
     * Gets the code_interpreter property value. The Code Interpreter tool call definition.
     * @return a RunStepDetailsToolCallsCodeObjectCodeInterpreter
     */
    @jakarta.annotation.Nullable
    public RunStepDetailsToolCallsCodeObjectCodeInterpreter getCodeInterpreter() {
        return this.codeInterpreter;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("code_interpreter", (n) -> { this.setCodeInterpreter(n.getObjectValue(RunStepDetailsToolCallsCodeObjectCodeInterpreter::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RunStepDetailsToolCallsCodeObjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The ID of the tool call.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the type property value. The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
     * @return a RunStepDetailsToolCallsCodeObjectType
     */
    @jakarta.annotation.Nullable
    public RunStepDetailsToolCallsCodeObjectType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("code_interpreter", this.getCodeInterpreter());
        writer.writeStringValue("id", this.getId());
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
     * Sets the code_interpreter property value. The Code Interpreter tool call definition.
     * @param value Value to set for the code_interpreter property.
     */
    public void setCodeInterpreter(@jakarta.annotation.Nullable final RunStepDetailsToolCallsCodeObjectCodeInterpreter value) {
        this.codeInterpreter = value;
    }
    /**
     * Sets the id property value. The ID of the tool call.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the type property value. The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RunStepDetailsToolCallsCodeObjectType value) {
        this.type = value;
    }
}
