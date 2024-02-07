package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Code Interpreter tool call definition.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunStepDetailsToolCallsCodeObjectCodeInterpreter implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The input to the Code Interpreter tool call.
     */
    private String input;
    /**
     * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
     */
    private java.util.List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputs> outputs;
    /**
     * Instantiates a new RunStepDetailsToolCallsCodeObjectCodeInterpreter and sets the default values.
     */
    public RunStepDetailsToolCallsCodeObjectCodeInterpreter() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunStepDetailsToolCallsCodeObjectCodeInterpreter
     */
    @jakarta.annotation.Nonnull
    public static RunStepDetailsToolCallsCodeObjectCodeInterpreter createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunStepDetailsToolCallsCodeObjectCodeInterpreter();
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
        deserializerMap.put("input", (n) -> { this.setInput(n.getStringValue()); });
        deserializerMap.put("outputs", (n) -> { this.setOutputs(n.getCollectionOfObjectValues(RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputs::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the input property value. The input to the Code Interpreter tool call.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInput() {
        return this.input;
    }
    /**
     * Gets the outputs property value. The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
     * @return a java.util.List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputs>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputs> getOutputs() {
        return this.outputs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("input", this.getInput());
        writer.writeCollectionOfObjectValues("outputs", this.getOutputs());
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
     * Sets the input property value. The input to the Code Interpreter tool call.
     * @param value Value to set for the input property.
     */
    public void setInput(@jakarta.annotation.Nullable final String value) {
        this.input = value;
    }
    /**
     * Sets the outputs property value. The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
     * @param value Value to set for the outputs property.
     */
    public void setOutputs(@jakarta.annotation.Nullable final java.util.List<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputs> value) {
        this.outputs = value;
    }
    /**
     * Composed type wrapper for classes RunStepDetailsToolCallsCodeOutputImageObject, RunStepDetailsToolCallsCodeOutputLogsObject
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputs implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type RunStepDetailsToolCallsCodeOutputImageObject
         */
        private RunStepDetailsToolCallsCodeOutputImageObject runStepDetailsToolCallsCodeOutputImageObject;
        /**
         * Composed type representation for type RunStepDetailsToolCallsCodeOutputLogsObject
         */
        private RunStepDetailsToolCallsCodeOutputLogsObject runStepDetailsToolCallsCodeOutputLogsObject;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputs
         */
        @jakarta.annotation.Nonnull
        public static RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputs result = new RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputs();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            return result;
        }
        /**
         * The deserialization information for the current model
         * @return a Map<String, java.util.function.Consumer<ParseNode>>
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            if (this.getRunStepDetailsToolCallsCodeOutputImageObject() != null) {
                return this.getRunStepDetailsToolCallsCodeOutputImageObject().getFieldDeserializers();
            } else if (this.getRunStepDetailsToolCallsCodeOutputLogsObject() != null) {
                return this.getRunStepDetailsToolCallsCodeOutputLogsObject().getFieldDeserializers();
            }
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the RunStepDetailsToolCallsCodeOutputImageObject property value. Composed type representation for type RunStepDetailsToolCallsCodeOutputImageObject
         * @return a RunStepDetailsToolCallsCodeOutputImageObject
         */
        @jakarta.annotation.Nullable
        public RunStepDetailsToolCallsCodeOutputImageObject getRunStepDetailsToolCallsCodeOutputImageObject() {
            return this.runStepDetailsToolCallsCodeOutputImageObject;
        }
        /**
         * Gets the RunStepDetailsToolCallsCodeOutputLogsObject property value. Composed type representation for type RunStepDetailsToolCallsCodeOutputLogsObject
         * @return a RunStepDetailsToolCallsCodeOutputLogsObject
         */
        @jakarta.annotation.Nullable
        public RunStepDetailsToolCallsCodeOutputLogsObject getRunStepDetailsToolCallsCodeOutputLogsObject() {
            return this.runStepDetailsToolCallsCodeOutputLogsObject;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getRunStepDetailsToolCallsCodeOutputImageObject() != null) {
                writer.writeObjectValue(null, this.getRunStepDetailsToolCallsCodeOutputImageObject());
            } else if (this.getRunStepDetailsToolCallsCodeOutputLogsObject() != null) {
                writer.writeObjectValue(null, this.getRunStepDetailsToolCallsCodeOutputLogsObject());
            }
        }
        /**
         * Sets the RunStepDetailsToolCallsCodeOutputImageObject property value. Composed type representation for type RunStepDetailsToolCallsCodeOutputImageObject
         * @param value Value to set for the RunStepDetailsToolCallsCodeOutputImageObject property.
         */
        public void setRunStepDetailsToolCallsCodeOutputImageObject(@jakarta.annotation.Nullable final RunStepDetailsToolCallsCodeOutputImageObject value) {
            this.runStepDetailsToolCallsCodeOutputImageObject = value;
        }
        /**
         * Sets the RunStepDetailsToolCallsCodeOutputLogsObject property value. Composed type representation for type RunStepDetailsToolCallsCodeOutputLogsObject
         * @param value Value to set for the RunStepDetailsToolCallsCodeOutputLogsObject property.
         */
        public void setRunStepDetailsToolCallsCodeOutputLogsObject(@jakarta.annotation.Nullable final RunStepDetailsToolCallsCodeOutputLogsObject value) {
            this.runStepDetailsToolCallsCodeOutputLogsObject = value;
        }
    }
}
