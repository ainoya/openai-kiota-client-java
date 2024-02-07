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
 * Details of the tool call.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunStepDetailsToolCallsObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.
     */
    private java.util.List<RunStepDetailsToolCallsObjectToolCalls> toolCalls;
    /**
     * Always `tool_calls`.
     */
    private RunStepDetailsToolCallsObjectType type;
    /**
     * Instantiates a new RunStepDetailsToolCallsObject and sets the default values.
     */
    public RunStepDetailsToolCallsObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunStepDetailsToolCallsObject
     */
    @jakarta.annotation.Nonnull
    public static RunStepDetailsToolCallsObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunStepDetailsToolCallsObject();
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
        deserializerMap.put("tool_calls", (n) -> { this.setToolCalls(n.getCollectionOfObjectValues(RunStepDetailsToolCallsObjectToolCalls::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RunStepDetailsToolCallsObjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tool_calls property value. An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.
     * @return a java.util.List<RunStepDetailsToolCallsObjectToolCalls>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RunStepDetailsToolCallsObjectToolCalls> getToolCalls() {
        return this.toolCalls;
    }
    /**
     * Gets the type property value. Always `tool_calls`.
     * @return a RunStepDetailsToolCallsObjectType
     */
    @jakarta.annotation.Nullable
    public RunStepDetailsToolCallsObjectType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("tool_calls", this.getToolCalls());
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
     * Sets the tool_calls property value. An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.
     * @param value Value to set for the tool_calls property.
     */
    public void setToolCalls(@jakarta.annotation.Nullable final java.util.List<RunStepDetailsToolCallsObjectToolCalls> value) {
        this.toolCalls = value;
    }
    /**
     * Sets the type property value. Always `tool_calls`.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RunStepDetailsToolCallsObjectType value) {
        this.type = value;
    }
    /**
     * Composed type wrapper for classes RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class RunStepDetailsToolCallsObjectToolCalls implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type RunStepDetailsToolCallsCodeObject
         */
        private RunStepDetailsToolCallsCodeObject runStepDetailsToolCallsCodeObject;
        /**
         * Composed type representation for type RunStepDetailsToolCallsFunctionObject
         */
        private RunStepDetailsToolCallsFunctionObject runStepDetailsToolCallsFunctionObject;
        /**
         * Composed type representation for type RunStepDetailsToolCallsRetrievalObject
         */
        private RunStepDetailsToolCallsRetrievalObject runStepDetailsToolCallsRetrievalObject;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a RunStepDetailsToolCallsObjectToolCalls
         */
        @jakarta.annotation.Nonnull
        public static RunStepDetailsToolCallsObjectToolCalls createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final RunStepDetailsToolCallsObjectToolCalls result = new RunStepDetailsToolCallsObjectToolCalls();
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
            if (this.getRunStepDetailsToolCallsCodeObject() != null) {
                return this.getRunStepDetailsToolCallsCodeObject().getFieldDeserializers();
            } else if (this.getRunStepDetailsToolCallsFunctionObject() != null) {
                return this.getRunStepDetailsToolCallsFunctionObject().getFieldDeserializers();
            } else if (this.getRunStepDetailsToolCallsRetrievalObject() != null) {
                return this.getRunStepDetailsToolCallsRetrievalObject().getFieldDeserializers();
            }
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the RunStepDetailsToolCallsCodeObject property value. Composed type representation for type RunStepDetailsToolCallsCodeObject
         * @return a RunStepDetailsToolCallsCodeObject
         */
        @jakarta.annotation.Nullable
        public RunStepDetailsToolCallsCodeObject getRunStepDetailsToolCallsCodeObject() {
            return this.runStepDetailsToolCallsCodeObject;
        }
        /**
         * Gets the RunStepDetailsToolCallsFunctionObject property value. Composed type representation for type RunStepDetailsToolCallsFunctionObject
         * @return a RunStepDetailsToolCallsFunctionObject
         */
        @jakarta.annotation.Nullable
        public RunStepDetailsToolCallsFunctionObject getRunStepDetailsToolCallsFunctionObject() {
            return this.runStepDetailsToolCallsFunctionObject;
        }
        /**
         * Gets the RunStepDetailsToolCallsRetrievalObject property value. Composed type representation for type RunStepDetailsToolCallsRetrievalObject
         * @return a RunStepDetailsToolCallsRetrievalObject
         */
        @jakarta.annotation.Nullable
        public RunStepDetailsToolCallsRetrievalObject getRunStepDetailsToolCallsRetrievalObject() {
            return this.runStepDetailsToolCallsRetrievalObject;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getRunStepDetailsToolCallsCodeObject() != null) {
                writer.writeObjectValue(null, this.getRunStepDetailsToolCallsCodeObject());
            } else if (this.getRunStepDetailsToolCallsFunctionObject() != null) {
                writer.writeObjectValue(null, this.getRunStepDetailsToolCallsFunctionObject());
            } else if (this.getRunStepDetailsToolCallsRetrievalObject() != null) {
                writer.writeObjectValue(null, this.getRunStepDetailsToolCallsRetrievalObject());
            }
        }
        /**
         * Sets the RunStepDetailsToolCallsCodeObject property value. Composed type representation for type RunStepDetailsToolCallsCodeObject
         * @param value Value to set for the RunStepDetailsToolCallsCodeObject property.
         */
        public void setRunStepDetailsToolCallsCodeObject(@jakarta.annotation.Nullable final RunStepDetailsToolCallsCodeObject value) {
            this.runStepDetailsToolCallsCodeObject = value;
        }
        /**
         * Sets the RunStepDetailsToolCallsFunctionObject property value. Composed type representation for type RunStepDetailsToolCallsFunctionObject
         * @param value Value to set for the RunStepDetailsToolCallsFunctionObject property.
         */
        public void setRunStepDetailsToolCallsFunctionObject(@jakarta.annotation.Nullable final RunStepDetailsToolCallsFunctionObject value) {
            this.runStepDetailsToolCallsFunctionObject = value;
        }
        /**
         * Sets the RunStepDetailsToolCallsRetrievalObject property value. Composed type representation for type RunStepDetailsToolCallsRetrievalObject
         * @param value Value to set for the RunStepDetailsToolCallsRetrievalObject property.
         */
        public void setRunStepDetailsToolCallsRetrievalObject(@jakarta.annotation.Nullable final RunStepDetailsToolCallsRetrievalObject value) {
            this.runStepDetailsToolCallsRetrievalObject = value;
        }
    }
}
