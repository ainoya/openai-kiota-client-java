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
 * Represents an `assistant` that can call the model and use tools.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AssistantObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Unix timestamp (in seconds) for when the assistant was created.
     */
    private Integer createdAt;
    /**
     * The description of the assistant. The maximum length is 512 characters.
     */
    private String description;
    /**
     * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.
     */
    private java.util.List<String> fileIds;
    /**
     * The identifier, which can be referenced in API endpoints.
     */
    private String id;
    /**
     * The system instructions that the assistant uses. The maximum length is 32768 characters.
     */
    private String instructions;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     */
    private AssistantObjectMetadata metadata;
    /**
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
     */
    private String model;
    /**
     * The name of the assistant. The maximum length is 256 characters.
     */
    private String name;
    /**
     * The object type, which is always `assistant`.
     */
    private AssistantObjectObject object;
    /**
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.
     */
    private java.util.List<AssistantObjectTools> tools;
    /**
     * Instantiates a new AssistantObject and sets the default values.
     */
    public AssistantObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AssistantObject
     */
    @jakarta.annotation.Nonnull
    public static AssistantObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssistantObject();
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
     * Gets the created_at property value. The Unix timestamp (in seconds) for when the assistant was created.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCreatedAt() {
        return this.createdAt;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getIntegerValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("file_ids", (n) -> { this.setFileIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("instructions", (n) -> { this.setInstructions(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(AssistantObjectMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(AssistantObjectObject::forValue)); });
        deserializerMap.put("tools", (n) -> { this.setTools(n.getCollectionOfObjectValues(AssistantObjectTools::createFromDiscriminatorValue)); });
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
     * Gets the id property value. The identifier, which can be referenced in API endpoints.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
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
     * @return a AssistantObjectMetadata
     */
    @jakarta.annotation.Nullable
    public AssistantObjectMetadata getMetadata() {
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
     * Gets the object property value. The object type, which is always `assistant`.
     * @return a AssistantObjectObject
     */
    @jakarta.annotation.Nullable
    public AssistantObjectObject getObject() {
        return this.object;
    }
    /**
     * Gets the tools property value. A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.
     * @return a java.util.List<AssistantObjectTools>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AssistantObjectTools> getTools() {
        return this.tools;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("created_at", this.getCreatedAt());
        writer.writeStringValue("description", this.getDescription());
        writer.writeCollectionOfPrimitiveValues("file_ids", this.getFileIds());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("instructions", this.getInstructions());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("object", this.getObject());
        writer.writeCollectionOfObjectValues("tools", this.getTools());
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
     * Sets the created_at property value. The Unix timestamp (in seconds) for when the assistant was created.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Integer value) {
        this.createdAt = value;
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
     * Sets the id property value. The identifier, which can be referenced in API endpoints.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
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
    public void setMetadata(@jakarta.annotation.Nullable final AssistantObjectMetadata value) {
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
     * Sets the object property value. The object type, which is always `assistant`.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final AssistantObjectObject value) {
        this.object = value;
    }
    /**
     * Sets the tools property value. A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.
     * @param value Value to set for the tools property.
     */
    public void setTools(@jakarta.annotation.Nullable final java.util.List<AssistantObjectTools> value) {
        this.tools = value;
    }
    /**
     * Composed type wrapper for classes AssistantToolsCode, AssistantToolsFunction, AssistantToolsRetrieval
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class AssistantObjectTools implements ComposedTypeWrapper, Parsable {
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
         * @return a AssistantObjectTools
         */
        @jakarta.annotation.Nonnull
        public static AssistantObjectTools createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final AssistantObjectTools result = new AssistantObjectTools();
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
