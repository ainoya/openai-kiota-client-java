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
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
     */
    private String assistantId;
    /**
     * The Unix timestamp (in seconds) for when the run was cancelled.
     */
    private Integer cancelledAt;
    /**
     * The Unix timestamp (in seconds) for when the run was completed.
     */
    private Integer completedAt;
    /**
     * The Unix timestamp (in seconds) for when the run was created.
     */
    private Integer createdAt;
    /**
     * The Unix timestamp (in seconds) for when the run will expire.
     */
    private Integer expiresAt;
    /**
     * The Unix timestamp (in seconds) for when the run failed.
     */
    private Integer failedAt;
    /**
     * The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
     */
    private java.util.List<String> fileIds;
    /**
     * The identifier, which can be referenced in API endpoints.
     */
    private String id;
    /**
     * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
     */
    private String instructions;
    /**
     * The last error associated with this run. Will be `null` if there are no errors.
     */
    private RunObjectLastError lastError;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     */
    private RunObjectMetadata metadata;
    /**
     * The model that the [assistant](/docs/api-reference/assistants) used for this run.
     */
    private String model;
    /**
     * The object type, which is always `thread.run`.
     */
    private RunObjectObject object;
    /**
     * Details on the action required to continue the run. Will be `null` if no action is required.
     */
    private RunObjectRequiredAction requiredAction;
    /**
     * The Unix timestamp (in seconds) for when the run was started.
     */
    private Integer startedAt;
    /**
     * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
     */
    private RunObjectStatus status;
    /**
     * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
     */
    private String threadId;
    /**
     * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
     */
    private java.util.List<RunObjectTools> tools;
    /**
     * Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
     */
    private RunCompletionUsage usage;
    /**
     * Instantiates a new RunObject and sets the default values.
     */
    public RunObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunObject
     */
    @jakarta.annotation.Nonnull
    public static RunObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunObject();
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
     * Gets the assistant_id property value. The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssistantId() {
        return this.assistantId;
    }
    /**
     * Gets the cancelled_at property value. The Unix timestamp (in seconds) for when the run was cancelled.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCancelledAt() {
        return this.cancelledAt;
    }
    /**
     * Gets the completed_at property value. The Unix timestamp (in seconds) for when the run was completed.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompletedAt() {
        return this.completedAt;
    }
    /**
     * Gets the created_at property value. The Unix timestamp (in seconds) for when the run was created.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the expires_at property value. The Unix timestamp (in seconds) for when the run will expire.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExpiresAt() {
        return this.expiresAt;
    }
    /**
     * Gets the failed_at property value. The Unix timestamp (in seconds) for when the run failed.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFailedAt() {
        return this.failedAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(19);
        deserializerMap.put("assistant_id", (n) -> { this.setAssistantId(n.getStringValue()); });
        deserializerMap.put("cancelled_at", (n) -> { this.setCancelledAt(n.getIntegerValue()); });
        deserializerMap.put("completed_at", (n) -> { this.setCompletedAt(n.getIntegerValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getIntegerValue()); });
        deserializerMap.put("expires_at", (n) -> { this.setExpiresAt(n.getIntegerValue()); });
        deserializerMap.put("failed_at", (n) -> { this.setFailedAt(n.getIntegerValue()); });
        deserializerMap.put("file_ids", (n) -> { this.setFileIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("instructions", (n) -> { this.setInstructions(n.getStringValue()); });
        deserializerMap.put("last_error", (n) -> { this.setLastError(n.getObjectValue(RunObjectLastError::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(RunObjectMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(RunObjectObject::forValue)); });
        deserializerMap.put("required_action", (n) -> { this.setRequiredAction(n.getObjectValue(RunObjectRequiredAction::createFromDiscriminatorValue)); });
        deserializerMap.put("started_at", (n) -> { this.setStartedAt(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RunObjectStatus::forValue)); });
        deserializerMap.put("thread_id", (n) -> { this.setThreadId(n.getStringValue()); });
        deserializerMap.put("tools", (n) -> { this.setTools(n.getCollectionOfObjectValues(RunObjectTools::createFromDiscriminatorValue)); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getObjectValue(RunCompletionUsage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the file_ids property value. The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
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
     * Gets the instructions property value. The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstructions() {
        return this.instructions;
    }
    /**
     * Gets the last_error property value. The last error associated with this run. Will be `null` if there are no errors.
     * @return a RunObjectLastError
     */
    @jakarta.annotation.Nullable
    public RunObjectLastError getLastError() {
        return this.lastError;
    }
    /**
     * Gets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @return a RunObjectMetadata
     */
    @jakarta.annotation.Nullable
    public RunObjectMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the model property value. The model that the [assistant](/docs/api-reference/assistants) used for this run.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the object property value. The object type, which is always `thread.run`.
     * @return a RunObjectObject
     */
    @jakarta.annotation.Nullable
    public RunObjectObject getObject() {
        return this.object;
    }
    /**
     * Gets the required_action property value. Details on the action required to continue the run. Will be `null` if no action is required.
     * @return a RunObjectRequiredAction
     */
    @jakarta.annotation.Nullable
    public RunObjectRequiredAction getRequiredAction() {
        return this.requiredAction;
    }
    /**
     * Gets the started_at property value. The Unix timestamp (in seconds) for when the run was started.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getStartedAt() {
        return this.startedAt;
    }
    /**
     * Gets the status property value. The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
     * @return a RunObjectStatus
     */
    @jakarta.annotation.Nullable
    public RunObjectStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the thread_id property value. The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThreadId() {
        return this.threadId;
    }
    /**
     * Gets the tools property value. The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
     * @return a java.util.List<RunObjectTools>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RunObjectTools> getTools() {
        return this.tools;
    }
    /**
     * Gets the usage property value. Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
     * @return a RunCompletionUsage
     */
    @jakarta.annotation.Nullable
    public RunCompletionUsage getUsage() {
        return this.usage;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assistant_id", this.getAssistantId());
        writer.writeIntegerValue("cancelled_at", this.getCancelledAt());
        writer.writeIntegerValue("completed_at", this.getCompletedAt());
        writer.writeIntegerValue("created_at", this.getCreatedAt());
        writer.writeIntegerValue("expires_at", this.getExpiresAt());
        writer.writeIntegerValue("failed_at", this.getFailedAt());
        writer.writeCollectionOfPrimitiveValues("file_ids", this.getFileIds());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("instructions", this.getInstructions());
        writer.writeObjectValue("last_error", this.getLastError());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeStringValue("model", this.getModel());
        writer.writeEnumValue("object", this.getObject());
        writer.writeObjectValue("required_action", this.getRequiredAction());
        writer.writeIntegerValue("started_at", this.getStartedAt());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("thread_id", this.getThreadId());
        writer.writeCollectionOfObjectValues("tools", this.getTools());
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
     * Sets the assistant_id property value. The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
     * @param value Value to set for the assistant_id property.
     */
    public void setAssistantId(@jakarta.annotation.Nullable final String value) {
        this.assistantId = value;
    }
    /**
     * Sets the cancelled_at property value. The Unix timestamp (in seconds) for when the run was cancelled.
     * @param value Value to set for the cancelled_at property.
     */
    public void setCancelledAt(@jakarta.annotation.Nullable final Integer value) {
        this.cancelledAt = value;
    }
    /**
     * Sets the completed_at property value. The Unix timestamp (in seconds) for when the run was completed.
     * @param value Value to set for the completed_at property.
     */
    public void setCompletedAt(@jakarta.annotation.Nullable final Integer value) {
        this.completedAt = value;
    }
    /**
     * Sets the created_at property value. The Unix timestamp (in seconds) for when the run was created.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Integer value) {
        this.createdAt = value;
    }
    /**
     * Sets the expires_at property value. The Unix timestamp (in seconds) for when the run will expire.
     * @param value Value to set for the expires_at property.
     */
    public void setExpiresAt(@jakarta.annotation.Nullable final Integer value) {
        this.expiresAt = value;
    }
    /**
     * Sets the failed_at property value. The Unix timestamp (in seconds) for when the run failed.
     * @param value Value to set for the failed_at property.
     */
    public void setFailedAt(@jakarta.annotation.Nullable final Integer value) {
        this.failedAt = value;
    }
    /**
     * Sets the file_ids property value. The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
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
     * Sets the instructions property value. The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
     * @param value Value to set for the instructions property.
     */
    public void setInstructions(@jakarta.annotation.Nullable final String value) {
        this.instructions = value;
    }
    /**
     * Sets the last_error property value. The last error associated with this run. Will be `null` if there are no errors.
     * @param value Value to set for the last_error property.
     */
    public void setLastError(@jakarta.annotation.Nullable final RunObjectLastError value) {
        this.lastError = value;
    }
    /**
     * Sets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final RunObjectMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the model property value. The model that the [assistant](/docs/api-reference/assistants) used for this run.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the object property value. The object type, which is always `thread.run`.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final RunObjectObject value) {
        this.object = value;
    }
    /**
     * Sets the required_action property value. Details on the action required to continue the run. Will be `null` if no action is required.
     * @param value Value to set for the required_action property.
     */
    public void setRequiredAction(@jakarta.annotation.Nullable final RunObjectRequiredAction value) {
        this.requiredAction = value;
    }
    /**
     * Sets the started_at property value. The Unix timestamp (in seconds) for when the run was started.
     * @param value Value to set for the started_at property.
     */
    public void setStartedAt(@jakarta.annotation.Nullable final Integer value) {
        this.startedAt = value;
    }
    /**
     * Sets the status property value. The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final RunObjectStatus value) {
        this.status = value;
    }
    /**
     * Sets the thread_id property value. The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
     * @param value Value to set for the thread_id property.
     */
    public void setThreadId(@jakarta.annotation.Nullable final String value) {
        this.threadId = value;
    }
    /**
     * Sets the tools property value. The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
     * @param value Value to set for the tools property.
     */
    public void setTools(@jakarta.annotation.Nullable final java.util.List<RunObjectTools> value) {
        this.tools = value;
    }
    /**
     * Sets the usage property value. Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final RunCompletionUsage value) {
        this.usage = value;
    }
    /**
     * Composed type wrapper for classes AssistantToolsCode, AssistantToolsFunction, AssistantToolsRetrieval
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class RunObjectTools implements ComposedTypeWrapper, Parsable {
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
         * @return a RunObjectTools
         */
        @jakarta.annotation.Nonnull
        public static RunObjectTools createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final RunObjectTools result = new RunObjectTools();
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
