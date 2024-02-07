package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunStepDetailsToolCallsCodeOutputLogsObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The text output from the Code Interpreter tool call.
     */
    private String logs;
    /**
     * Always `logs`.
     */
    private RunStepDetailsToolCallsCodeOutputLogsObjectType type;
    /**
     * Instantiates a new RunStepDetailsToolCallsCodeOutputLogsObject and sets the default values.
     */
    public RunStepDetailsToolCallsCodeOutputLogsObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunStepDetailsToolCallsCodeOutputLogsObject
     */
    @jakarta.annotation.Nonnull
    public static RunStepDetailsToolCallsCodeOutputLogsObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunStepDetailsToolCallsCodeOutputLogsObject();
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
        deserializerMap.put("logs", (n) -> { this.setLogs(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RunStepDetailsToolCallsCodeOutputLogsObjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the logs property value. The text output from the Code Interpreter tool call.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLogs() {
        return this.logs;
    }
    /**
     * Gets the type property value. Always `logs`.
     * @return a RunStepDetailsToolCallsCodeOutputLogsObjectType
     */
    @jakarta.annotation.Nullable
    public RunStepDetailsToolCallsCodeOutputLogsObjectType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("logs", this.getLogs());
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
     * Sets the logs property value. The text output from the Code Interpreter tool call.
     * @param value Value to set for the logs property.
     */
    public void setLogs(@jakarta.annotation.Nullable final String value) {
        this.logs = value;
    }
    /**
     * Sets the type property value. Always `logs`.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RunStepDetailsToolCallsCodeOutputLogsObjectType value) {
        this.type = value;
    }
}
