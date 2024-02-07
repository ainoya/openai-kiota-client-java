package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateRunRequest implements Parsable {
    /**
     * Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
     */
    private String additionalInstructions;
    /**
     * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
     */
    private String assistantId;
    /**
     * Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
     */
    private String instructions;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     */
    private CreateRunRequestMetadata metadata;
    /**
     * The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
     */
    private String model;
    /**
     * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
     */
    private java.util.List<CreateRunRequestTools> tools;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateRunRequest
     */
    @jakarta.annotation.Nonnull
    public static CreateRunRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateRunRequest();
    }
    /**
     * Gets the additional_instructions property value. Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAdditionalInstructions() {
        return this.additionalInstructions;
    }
    /**
     * Gets the assistant_id property value. The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssistantId() {
        return this.assistantId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("additional_instructions", (n) -> { this.setAdditionalInstructions(n.getStringValue()); });
        deserializerMap.put("assistant_id", (n) -> { this.setAssistantId(n.getStringValue()); });
        deserializerMap.put("instructions", (n) -> { this.setInstructions(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(CreateRunRequestMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("tools", (n) -> { this.setTools(n.getCollectionOfObjectValues(CreateRunRequestTools::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the instructions property value. Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstructions() {
        return this.instructions;
    }
    /**
     * Gets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @return a CreateRunRequestMetadata
     */
    @jakarta.annotation.Nullable
    public CreateRunRequestMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the model property value. The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the tools property value. Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
     * @return a java.util.List<CreateRunRequestTools>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CreateRunRequestTools> getTools() {
        return this.tools;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("additional_instructions", this.getAdditionalInstructions());
        writer.writeStringValue("assistant_id", this.getAssistantId());
        writer.writeStringValue("instructions", this.getInstructions());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeStringValue("model", this.getModel());
        writer.writeCollectionOfObjectValues("tools", this.getTools());
    }
    /**
     * Sets the additional_instructions property value. Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
     * @param value Value to set for the additional_instructions property.
     */
    public void setAdditionalInstructions(@jakarta.annotation.Nullable final String value) {
        this.additionalInstructions = value;
    }
    /**
     * Sets the assistant_id property value. The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
     * @param value Value to set for the assistant_id property.
     */
    public void setAssistantId(@jakarta.annotation.Nullable final String value) {
        this.assistantId = value;
    }
    /**
     * Sets the instructions property value. Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
     * @param value Value to set for the instructions property.
     */
    public void setInstructions(@jakarta.annotation.Nullable final String value) {
        this.instructions = value;
    }
    /**
     * Sets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final CreateRunRequestMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the model property value. The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the tools property value. Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
     * @param value Value to set for the tools property.
     */
    public void setTools(@jakarta.annotation.Nullable final java.util.List<CreateRunRequestTools> value) {
        this.tools = value;
    }
    /**
     * Composed type wrapper for classes AssistantToolsCode, AssistantToolsFunction, AssistantToolsRetrieval
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class CreateRunRequestTools implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type AssistantToolsCode
         */
        private AssistantToolsCode assistantToolsCode;
        /**
         * Composed type representation for type AssistantToolsFunction
         */
        private AssistantToolsFunction assistantToolsFunction;
        /**
         * Composed type representation for type AssistantToolsRetrieval
         */
        private AssistantToolsRetrieval assistantToolsRetrieval;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a CreateRunRequestTools
         */
        @jakarta.annotation.Nonnull
        public static CreateRunRequestTools createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final CreateRunRequestTools result = new CreateRunRequestTools();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            return result;
        }
        /**
         * Gets the AssistantToolsCode property value. Composed type representation for type AssistantToolsCode
         * @return a AssistantToolsCode
         */
        @jakarta.annotation.Nullable
        public AssistantToolsCode getAssistantToolsCode() {
            return this.assistantToolsCode;
        }
        /**
         * Gets the AssistantToolsFunction property value. Composed type representation for type AssistantToolsFunction
         * @return a AssistantToolsFunction
         */
        @jakarta.annotation.Nullable
        public AssistantToolsFunction getAssistantToolsFunction() {
            return this.assistantToolsFunction;
        }
        /**
         * Gets the AssistantToolsRetrieval property value. Composed type representation for type AssistantToolsRetrieval
         * @return a AssistantToolsRetrieval
         */
        @jakarta.annotation.Nullable
        public AssistantToolsRetrieval getAssistantToolsRetrieval() {
            return this.assistantToolsRetrieval;
        }
        /**
         * The deserialization information for the current model
         * @return a Map<String, java.util.function.Consumer<ParseNode>>
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            if (this.getAssistantToolsCode() != null) {
                return this.getAssistantToolsCode().getFieldDeserializers();
            } else if (this.getAssistantToolsFunction() != null) {
                return this.getAssistantToolsFunction().getFieldDeserializers();
            } else if (this.getAssistantToolsRetrieval() != null) {
                return this.getAssistantToolsRetrieval().getFieldDeserializers();
            }
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getAssistantToolsCode() != null) {
                writer.writeObjectValue(null, this.getAssistantToolsCode());
            } else if (this.getAssistantToolsFunction() != null) {
                writer.writeObjectValue(null, this.getAssistantToolsFunction());
            } else if (this.getAssistantToolsRetrieval() != null) {
                writer.writeObjectValue(null, this.getAssistantToolsRetrieval());
            }
        }
        /**
         * Sets the AssistantToolsCode property value. Composed type representation for type AssistantToolsCode
         * @param value Value to set for the AssistantToolsCode property.
         */
        public void setAssistantToolsCode(@jakarta.annotation.Nullable final AssistantToolsCode value) {
            this.assistantToolsCode = value;
        }
        /**
         * Sets the AssistantToolsFunction property value. Composed type representation for type AssistantToolsFunction
         * @param value Value to set for the AssistantToolsFunction property.
         */
        public void setAssistantToolsFunction(@jakarta.annotation.Nullable final AssistantToolsFunction value) {
            this.assistantToolsFunction = value;
        }
        /**
         * Sets the AssistantToolsRetrieval property value. Composed type representation for type AssistantToolsRetrieval
         * @param value Value to set for the AssistantToolsRetrieval property.
         */
        public void setAssistantToolsRetrieval(@jakarta.annotation.Nullable final AssistantToolsRetrieval value) {
            this.assistantToolsRetrieval = value;
        }
    }
}
