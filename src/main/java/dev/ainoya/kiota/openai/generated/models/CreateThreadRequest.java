package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateThreadRequest implements Parsable {
    /**
     * A list of [messages](/docs/api-reference/messages) to start the thread with.
     */
    private java.util.List<CreateMessageRequest> messages;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     */
    private CreateThreadRequestMetadata metadata;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateThreadRequest
     */
    @jakarta.annotation.Nonnull
    public static CreateThreadRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateThreadRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("messages", (n) -> { this.setMessages(n.getCollectionOfObjectValues(CreateMessageRequest::createFromDiscriminatorValue)); });
        deserializerMap.put("metadata", (n) -> { this.setMetadata(n.getObjectValue(CreateThreadRequestMetadata::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the messages property value. A list of [messages](/docs/api-reference/messages) to start the thread with.
     * @return a java.util.List<CreateMessageRequest>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CreateMessageRequest> getMessages() {
        return this.messages;
    }
    /**
     * Gets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @return a CreateThreadRequestMetadata
     */
    @jakarta.annotation.Nullable
    public CreateThreadRequestMetadata getMetadata() {
        return this.metadata;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("messages", this.getMessages());
        writer.writeObjectValue("metadata", this.getMetadata());
    }
    /**
     * Sets the messages property value. A list of [messages](/docs/api-reference/messages) to start the thread with.
     * @param value Value to set for the messages property.
     */
    public void setMessages(@jakarta.annotation.Nullable final java.util.List<CreateMessageRequest> value) {
        this.messages = value;
    }
    /**
     * Sets the metadata property value. Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * @param value Value to set for the metadata property.
     */
    public void setMetadata(@jakarta.annotation.Nullable final CreateThreadRequestMetadata value) {
        this.metadata = value;
    }
}
