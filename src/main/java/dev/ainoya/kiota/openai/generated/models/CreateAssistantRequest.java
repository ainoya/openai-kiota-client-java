package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateAssistantRequest implements Parsable {
    /**
     * The description of the assistant. The maximum length is 512 characters.
     */
    private String description;
    /**
     * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.
     */
    private java.util.List<String> fileIds;
    /**
     * The system instructions that the assistant uses. The maximum length is 32768 characters.
     */
    private String instructions;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     */
    private CreateAssistantRequestMetadata metadata;
    /**
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
     */
    private String model;
    /**
     * The name of the assistant. The maximum length is 256 characters.
     */
    private String name;
    /**
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.
     */
    private java.util.List<CreateAssistantRequestTools> tools;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateAssistantRequest
     */
    @jakarta.annotation.Nonnull
    public static CreateAssistantRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateAssistantRequest();
    }
    /**
     * Gets the description property value. The description of the assistant. The maximum length is 512 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("file_ids", (n) -> { this.setFileIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("instructions", (n) -> { this.setInstructions(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(CreateAssistantRequestMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("tools", (n) -> { this.setTools(n.getCollectionOfObjectValues(CreateAssistantRequestTools::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the file_ids property value. A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }
    /**
     * Gets the instructions property value. The system instructions that the assistant uses. The maximum length is 32768 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstructions() {
        return this.instructions;
    }
    /**
     * Gets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @return a CreateAssistantRequestMetadata
     */
    @jakarta.annotation.Nullable
    public CreateAssistantRequestMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the model property value. ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the name property value. The name of the assistant. The maximum length is 256 characters.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the tools property value. A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.
     * @return a java.util.List<CreateAssistantRequestTools>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CreateAssistantRequestTools> getTools() {
        return this.tools;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfPrimitiveValues("file_ids", this.getFileIds());
        writer.writeStringValue("instructions", this.getInstructions());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("tools", this.getTools());
    }
    /**
     * Sets the description property value. The description of the assistant. The maximum length is 512 characters.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the file_ids property value. A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.
     * @param value Value to set for the file_ids property.
     */
    public void setFileIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.fileIds = value;
    }
    /**
     * Sets the instructions property value. The system instructions that the assistant uses. The maximum length is 32768 characters.
     * @param value Value to set for the instructions property.
     */
    public void setInstructions(@jakarta.annotation.Nullable final String value) {
        this.instructions = value;
    }
    /**
     * Sets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final CreateAssistantRequestMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the model property value. ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the name property value. The name of the assistant. The maximum length is 256 characters.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the tools property value. A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.
     * @param value Value to set for the tools property.
     */
    public void setTools(@jakarta.annotation.Nullable final java.util.List<CreateAssistantRequestTools> value) {
        this.tools = value;
    }
    /**
     * Composed type wrapper for classes AssistantToolsCode, AssistantToolsFunction, AssistantToolsRetrieval
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class CreateAssistantRequestTools implements ComposedTypeWrapper, Parsable {
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
         * @return a CreateAssistantRequestTools
         */
        @jakarta.annotation.Nonnull
        public static CreateAssistantRequestTools createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final CreateAssistantRequestTools result = new CreateAssistantRequestTools();
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
