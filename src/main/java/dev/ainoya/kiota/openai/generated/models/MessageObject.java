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
 * Represents a message within a [thread](/docs/api-reference/threads).
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
     */
    private String assistantId;
    /**
     * The content of the message in array of text and/or images.
     */
    private java.util.List<MessageObjectContent> content;
    /**
     * The Unix timestamp (in seconds) for when the message was created.
     */
    private Integer createdAt;
    /**
     * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
     */
    private java.util.List<String> fileIds;
    /**
     * The identifier, which can be referenced in API endpoints.
     */
    private String id;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     */
    private MessageObjectMetadata metadata;
    /**
     * The object type, which is always `thread.message`.
     */
    private MessageObjectObject object;
    /**
     * The entity that produced the message. One of `user` or `assistant`.
     */
    private MessageObjectRole role;
    /**
     * If applicable, the ID of the [run](/docs/api-reference/runs) associated with the authoring of this message.
     */
    private String runId;
    /**
     * The [thread](/docs/api-reference/threads) ID that this message belongs to.
     */
    private String threadId;
    /**
     * Instantiates a new MessageObject and sets the default values.
     */
    public MessageObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageObject
     */
    @jakarta.annotation.Nonnull
    public static MessageObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageObject();
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
     * Gets the assistant_id property value. If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAssistantId() {
        return this.assistantId;
    }
    /**
     * Gets the content property value. The content of the message in array of text and/or images.
     * @return a java.util.List<MessageObjectContent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MessageObjectContent> getContent() {
        return this.content;
    }
    /**
     * Gets the created_at property value. The Unix timestamp (in seconds) for when the message was created.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(10);
        deserializerMap.put("assistant_id", (n) -> { this.setAssistantId(n.getStringValue()); });
        deserializerMap.put("content", (n) -> { this.setContent(n.getCollectionOfObjectValues(MessageObjectContent::createFromDiscriminatorValue)); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getIntegerValue()); });
        deserializerMap.put("file_ids", (n) -> { this.setFileIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(MessageObjectMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(MessageObjectObject::forValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(MessageObjectRole::forValue)); });
        deserializerMap.put("run_id", (n) -> { this.setRunId(n.getStringValue()); });
        deserializerMap.put("thread_id", (n) -> { this.setThreadId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file_ids property value. A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
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
     * Gets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @return a MessageObjectMetadata
     */
    @jakarta.annotation.Nullable
    public MessageObjectMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the object property value. The object type, which is always `thread.message`.
     * @return a MessageObjectObject
     */
    @jakarta.annotation.Nullable
    public MessageObjectObject getObject() {
        return this.object;
    }
    /**
     * Gets the role property value. The entity that produced the message. One of `user` or `assistant`.
     * @return a MessageObjectRole
     */
    @jakarta.annotation.Nullable
    public MessageObjectRole getRole() {
        return this.role;
    }
    /**
     * Gets the run_id property value. If applicable, the ID of the [run](/docs/api-reference/runs) associated with the authoring of this message.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRunId() {
        return this.runId;
    }
    /**
     * Gets the thread_id property value. The [thread](/docs/api-reference/threads) ID that this message belongs to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getThreadId() {
        return this.threadId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("assistant_id", this.getAssistantId());
        writer.writeCollectionOfObjectValues("content", this.getContent());
        writer.writeIntegerValue("created_at", this.getCreatedAt());
        writer.writeCollectionOfPrimitiveValues("file_ids", this.getFileIds());
        writer.writeStringValue("id", this.getId());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeEnumValue("object", this.getObject());
        writer.writeEnumValue("role", this.getRole());
        writer.writeStringValue("run_id", this.getRunId());
        writer.writeStringValue("thread_id", this.getThreadId());
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
     * Sets the assistant_id property value. If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
     * @param value Value to set for the assistant_id property.
     */
    public void setAssistantId(@jakarta.annotation.Nullable final String value) {
        this.assistantId = value;
    }
    /**
     * Sets the content property value. The content of the message in array of text and/or images.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final java.util.List<MessageObjectContent> value) {
        this.content = value;
    }
    /**
     * Sets the created_at property value. The Unix timestamp (in seconds) for when the message was created.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Integer value) {
        this.createdAt = value;
    }
    /**
     * Sets the file_ids property value. A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
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
     * Sets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final MessageObjectMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the object property value. The object type, which is always `thread.message`.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final MessageObjectObject value) {
        this.object = value;
    }
    /**
     * Sets the role property value. The entity that produced the message. One of `user` or `assistant`.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final MessageObjectRole value) {
        this.role = value;
    }
    /**
     * Sets the run_id property value. If applicable, the ID of the [run](/docs/api-reference/runs) associated with the authoring of this message.
     * @param value Value to set for the run_id property.
     */
    public void setRunId(@jakarta.annotation.Nullable final String value) {
        this.runId = value;
    }
    /**
     * Sets the thread_id property value. The [thread](/docs/api-reference/threads) ID that this message belongs to.
     * @param value Value to set for the thread_id property.
     */
    public void setThreadId(@jakarta.annotation.Nullable final String value) {
        this.threadId = value;
    }
    /**
     * Composed type wrapper for classes MessageContentImageFileObject, MessageContentTextObject
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class MessageObjectContent implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type MessageContentImageFileObject
         */
        private MessageContentImageFileObject messageContentImageFileObject;
        /**
         * Composed type representation for type MessageContentTextObject
         */
        private MessageContentTextObject messageContentTextObject;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a MessageObjectContent
         */
        @jakarta.annotation.Nonnull
        public static MessageObjectContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final MessageObjectContent result = new MessageObjectContent();
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
            if (this.getMessageContentImageFileObject() != null) {
                return this.getMessageContentImageFileObject().getFieldDeserializers();
            } else if (this.getMessageContentTextObject() != null) {
                return this.getMessageContentTextObject().getFieldDeserializers();
            }
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the MessageContentImageFileObject property value. Composed type representation for type MessageContentImageFileObject
         * @return a MessageContentImageFileObject
         */
        @jakarta.annotation.Nullable
        public MessageContentImageFileObject getMessageContentImageFileObject() {
            return this.messageContentImageFileObject;
        }
        /**
         * Gets the MessageContentTextObject property value. Composed type representation for type MessageContentTextObject
         * @return a MessageContentTextObject
         */
        @jakarta.annotation.Nullable
        public MessageContentTextObject getMessageContentTextObject() {
            return this.messageContentTextObject;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getMessageContentImageFileObject() != null) {
                writer.writeObjectValue(null, this.getMessageContentImageFileObject());
            } else if (this.getMessageContentTextObject() != null) {
                writer.writeObjectValue(null, this.getMessageContentTextObject());
            }
        }
        /**
         * Sets the MessageContentImageFileObject property value. Composed type representation for type MessageContentImageFileObject
         * @param value Value to set for the MessageContentImageFileObject property.
         */
        public void setMessageContentImageFileObject(@jakarta.annotation.Nullable final MessageContentImageFileObject value) {
            this.messageContentImageFileObject = value;
        }
        /**
         * Sets the MessageContentTextObject property value. Composed type representation for type MessageContentTextObject
         * @param value Value to set for the MessageContentTextObject property.
         */
        public void setMessageContentTextObject(@jakarta.annotation.Nullable final MessageContentTextObject value) {
            this.messageContentTextObject = value;
        }
    }
}
