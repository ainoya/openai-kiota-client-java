package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateMessageRequest implements Parsable {
    /**
     * The content of the message.
     */
    private String content;
    /**
     * A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files.
     */
    private java.util.List<String> fileIds;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     */
    private CreateMessageRequestMetadata metadata;
    /**
     * The role of the entity that is creating the message. Currently only `user` is supported.
     */
    private CreateMessageRequestRole role;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateMessageRequest
     */
    @jakarta.annotation.Nonnull
    public static CreateMessageRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateMessageRequest();
    }
    /**
     * Gets the content property value. The content of the message.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("content", (n) -> { this.setContent(n.getStringValue()); });
        deserializerMap.put("file_ids", (n) -> { this.setFileIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(CreateMessageRequestMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(CreateMessageRequestRole::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the file_ids property value. A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }
    /**
     * Gets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @return a CreateMessageRequestMetadata
     */
    @jakarta.annotation.Nullable
    public CreateMessageRequestMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Gets the role property value. The role of the entity that is creating the message. Currently only `user` is supported.
     * @return a CreateMessageRequestRole
     */
    @jakarta.annotation.Nullable
    public CreateMessageRequestRole getRole() {
        return this.role;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("content", this.getContent());
        writer.writeCollectionOfPrimitiveValues("file_ids", this.getFileIds());
        writer.writeObjectValue("metadata", this.getMetadata());
        writer.writeEnumValue("role", this.getRole());
    }
    /**
     * Sets the content property value. The content of the message.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final String value) {
        this.content = value;
    }
    /**
     * Sets the file_ids property value. A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files.
     * @param value Value to set for the file_ids property.
     */
    public void setFileIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.fileIds = value;
    }
    /**
     * Sets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final CreateMessageRequestMetadata value) {
        this.metadata = value;
    }
    /**
     * Sets the role property value. The role of the entity that is creating the message. Currently only `user` is supported.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final CreateMessageRequestRole value) {
        this.role = value;
    }
}
