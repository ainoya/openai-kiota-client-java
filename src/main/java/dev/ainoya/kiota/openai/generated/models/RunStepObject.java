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
 * Represents a step in execution of a run.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunStepObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
     */
    private String assistantId;
    /**
     * The Unix timestamp (in seconds) for when the run step was cancelled.
     */
    private Integer cancelledAt;
    /**
     * The Unix timestamp (in seconds) for when the run step completed.
     */
    private Integer completedAt;
    /**
     * The Unix timestamp (in seconds) for when the run step was created.
     */
    private Integer createdAt;
    /**
     * The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
     */
    private Integer expiredAt;
    /**
     * The Unix timestamp (in seconds) for when the run step failed.
     */
    private Integer failedAt;
    /**
     * The identifier of the run step, which can be referenced in API endpoints.
     */
    private String id;
    /**
     * The last error associated with this run step. Will be `null` if there are no errors.
     */
    private RunStepObjectLastError lastError;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     */
    private RunStepObjectMetadata metadata;
    /**
     * The object type, which is always `thread.run.step`.
     */
    private RunStepObjectObject object;
    /**
     * The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
     */
    private String runId;
    /**
     * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
     */
    private RunStepObjectStatus status;
    /**
     * The details of the run step.
     */
    private RunStepObjectStepDetails stepDetails;
    /**
     * The ID of the [thread](/docs/api-reference/threads) that was run.
     */
    private String threadId;
    /**
     * The type of run step, which can be either `message_creation` or `tool_calls`.
     */
    private RunStepObjectType type;
    /**
     * Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
     */
    private RunStepCompletionUsage usage;
    /**
     * Instantiates a new RunStepObject and sets the default values.
     */
    public RunStepObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunStepObject
     */
    @jakarta.annotation.Nonnull
    public static RunStepObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunStepObject();
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
     * Gets the assistant_id property value. The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssistantId() {
        return this.assistantId;
    }
    /**
     * Gets the cancelled_at property value. The Unix timestamp (in seconds) for when the run step was cancelled.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCancelledAt() {
        return this.cancelledAt;
    }
    /**
     * Gets the completed_at property value. The Unix timestamp (in seconds) for when the run step completed.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCompletedAt() {
        return this.completedAt;
    }
    /**
     * Gets the created_at property value. The Unix timestamp (in seconds) for when the run step was created.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the expired_at property value. The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExpiredAt() {
        return this.expiredAt;
    }
    /**
     * Gets the failed_at property value. The Unix timestamp (in seconds) for when the run step failed.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(16);
        deserializerMap.put("assistant_id", (n) -> { this.setAssistantId(n.getStringValue()); });
        deserializerMap.put("cancelled_at", (n) -> { this.setCancelledAt(n.getIntegerValue()); });
        deserializerMap.put("completed_at", (n) -> { this.setCompletedAt(n.getIntegerValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getIntegerValue()); });
        deserializerMap.put("expired_at", (n) -> { this.setExpiredAt(n.getIntegerValue()); });
        deserializerMap.put("failed_at", (n) -> { this.setFailedAt(n.getIntegerValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("last_error", (n) -> { this.setLastError(n.getObjectValue(RunStepObjectLastError::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(RunStepObjectMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(RunStepObjectObject::forValue)); });
        deserializerMap.put("run_id", (n) -> { this.setRunId(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(RunStepObjectStatus::forValue)); });
        deserializerMap.put("step_details", (n) -> { this.setStepDetails(n.getObjectValue(RunStepObjectStepDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("thread_id", (n) -> { this.setThreadId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RunStepObjectType::forValue)); });
        deserializerMap.put("usage", (n) -> { this.setUsage(n.getObjectValue(RunStepCompletionUsage::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the id property value. The identifier of the run step, which can be referenced in API endpoints.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the last_error property value. The last error associated with this run step. Will be `null` if there are no errors.
     * @return a RunStepObjectLastError
     */
    @jakarta.annotation.Nullable
    public RunStepObjectLastError getLastError() {
        return this.lastError;
    }
    /**
     * Gets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @return a RunStepObjectMetadata
     */
    @jakarta.annotation.Nullable
    public RunStepObjectMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the object property value. The object type, which is always `thread.run.step`.
     * @return a RunStepObjectObject
     */
    @jakarta.annotation.Nullable
    public RunStepObjectObject getObject() {
        return this.object;
    }
    /**
     * Gets the run_id property value. The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRunId() {
        return this.runId;
    }
    /**
     * Gets the status property value. The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
     * @return a RunStepObjectStatus
     */
    @jakarta.annotation.Nullable
    public RunStepObjectStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the step_details property value. The details of the run step.
     * @return a RunStepObjectStepDetails
     */
    @jakarta.annotation.Nullable
    public RunStepObjectStepDetails getStepDetails() {
        return this.stepDetails;
    }
    /**
     * Gets the thread_id property value. The ID of the [thread](/docs/api-reference/threads) that was run.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThreadId() {
        return this.threadId;
    }
    /**
     * Gets the type property value. The type of run step, which can be either `message_creation` or `tool_calls`.
     * @return a RunStepObjectType
     */
    @jakarta.annotation.Nullable
    public RunStepObjectType getType() {
        return this.type;
    }
    /**
     * Gets the usage property value. Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
     * @return a RunStepCompletionUsage
     */
    @jakarta.annotation.Nullable
    public RunStepCompletionUsage getUsage() {
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
        writer.writeIntegerValue("expired_at", this.getExpiredAt());
        writer.writeIntegerValue("failed_at", this.getFailedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("last_error", this.getLastError());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeEnumValue("object", this.getObject());
        writer.writeStringValue("run_id", this.getRunId());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("step_details", this.getStepDetails());
        writer.writeStringValue("thread_id", this.getThreadId());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the assistant_id property value. The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
     * @param value Value to set for the assistant_id property.
     */
    public void setAssistantId(@jakarta.annotation.Nullable final String value) {
        this.assistantId = value;
    }
    /**
     * Sets the cancelled_at property value. The Unix timestamp (in seconds) for when the run step was cancelled.
     * @param value Value to set for the cancelled_at property.
     */
    public void setCancelledAt(@jakarta.annotation.Nullable final Integer value) {
        this.cancelledAt = value;
    }
    /**
     * Sets the completed_at property value. The Unix timestamp (in seconds) for when the run step completed.
     * @param value Value to set for the completed_at property.
     */
    public void setCompletedAt(@jakarta.annotation.Nullable final Integer value) {
        this.completedAt = value;
    }
    /**
     * Sets the created_at property value. The Unix timestamp (in seconds) for when the run step was created.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Integer value) {
        this.createdAt = value;
    }
    /**
     * Sets the expired_at property value. The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
     * @param value Value to set for the expired_at property.
     */
    public void setExpiredAt(@jakarta.annotation.Nullable final Integer value) {
        this.expiredAt = value;
    }
    /**
     * Sets the failed_at property value. The Unix timestamp (in seconds) for when the run step failed.
     * @param value Value to set for the failed_at property.
     */
    public void setFailedAt(@jakarta.annotation.Nullable final Integer value) {
        this.failedAt = value;
    }
    /**
     * Sets the id property value. The identifier of the run step, which can be referenced in API endpoints.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the last_error property value. The last error associated with this run step. Will be `null` if there are no errors.
     * @param value Value to set for the last_error property.
     */
    public void setLastError(@jakarta.annotation.Nullable final RunStepObjectLastError value) {
        this.lastError = value;
    }
    /**
     * Sets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final RunStepObjectMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the object property value. The object type, which is always `thread.run.step`.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final RunStepObjectObject value) {
        this.object = value;
    }
    /**
     * Sets the run_id property value. The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
     * @param value Value to set for the run_id property.
     */
    public void setRunId(@jakarta.annotation.Nullable final String value) {
        this.runId = value;
    }
    /**
     * Sets the status property value. The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final RunStepObjectStatus value) {
        this.status = value;
    }
    /**
     * Sets the step_details property value. The details of the run step.
     * @param value Value to set for the step_details property.
     */
    public void setStepDetails(@jakarta.annotation.Nullable final RunStepObjectStepDetails value) {
        this.stepDetails = value;
    }
    /**
     * Sets the thread_id property value. The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param value Value to set for the thread_id property.
     */
    public void setThreadId(@jakarta.annotation.Nullable final String value) {
        this.threadId = value;
    }
    /**
     * Sets the type property value. The type of run step, which can be either `message_creation` or `tool_calls`.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RunStepObjectType value) {
        this.type = value;
    }
    /**
     * Sets the usage property value. Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
     * @param value Value to set for the usage property.
     */
    public void setUsage(@jakarta.annotation.Nullable final RunStepCompletionUsage value) {
        this.usage = value;
    }
    /**
     * Composed type wrapper for classes RunStepDetailsMessageCreationObject, RunStepDetailsToolCallsObject
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class RunStepObjectStepDetails implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type RunStepDetailsMessageCreationObject
         */
        private RunStepDetailsMessageCreationObject runStepDetailsMessageCreationObject;
        /**
         * Composed type representation for type RunStepDetailsToolCallsObject
         */
        private RunStepDetailsToolCallsObject runStepDetailsToolCallsObject;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a RunStepObjectStepDetails
         */
        @jakarta.annotation.Nonnull
        public static RunStepObjectStepDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final RunStepObjectStepDetails result = new RunStepObjectStepDetails();
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
            if (this.getRunStepDetailsMessageCreationObject() != null) {
                return this.getRunStepDetailsMessageCreationObject().getFieldDeserializers();
            } else if (this.getRunStepDetailsToolCallsObject() != null) {
                return this.getRunStepDetailsToolCallsObject().getFieldDeserializers();
            }
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the RunStepDetailsMessageCreationObject property value. Composed type representation for type RunStepDetailsMessageCreationObject
         * @return a RunStepDetailsMessageCreationObject
         */
        @jakarta.annotation.Nullable
        public RunStepDetailsMessageCreationObject getRunStepDetailsMessageCreationObject() {
            return this.runStepDetailsMessageCreationObject;
        }
        /**
         * Gets the RunStepDetailsToolCallsObject property value. Composed type representation for type RunStepDetailsToolCallsObject
         * @return a RunStepDetailsToolCallsObject
         */
        @jakarta.annotation.Nullable
        public RunStepDetailsToolCallsObject getRunStepDetailsToolCallsObject() {
            return this.runStepDetailsToolCallsObject;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getRunStepDetailsMessageCreationObject() != null) {
                writer.writeObjectValue(null, this.getRunStepDetailsMessageCreationObject());
            } else if (this.getRunStepDetailsToolCallsObject() != null) {
                writer.writeObjectValue(null, this.getRunStepDetailsToolCallsObject());
            }
        }
        /**
         * Sets the RunStepDetailsMessageCreationObject property value. Composed type representation for type RunStepDetailsMessageCreationObject
         * @param value Value to set for the RunStepDetailsMessageCreationObject property.
         */
        public void setRunStepDetailsMessageCreationObject(@jakarta.annotation.Nullable final RunStepDetailsMessageCreationObject value) {
            this.runStepDetailsMessageCreationObject = value;
        }
        /**
         * Sets the RunStepDetailsToolCallsObject property value. Composed type representation for type RunStepDetailsToolCallsObject
         * @param value Value to set for the RunStepDetailsToolCallsObject property.
         */
        public void setRunStepDetailsToolCallsObject(@jakarta.annotation.Nullable final RunStepDetailsToolCallsObject value) {
            this.runStepDetailsToolCallsObject = value;
        }
    }
}
