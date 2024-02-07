package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatCompletionRequestUserMessage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The contents of the user message.
     */
    private java.util.List<ChatCompletionRequestMessageContentPart> content;
    /**
     * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     */
    private String name;
    /**
     * The role of the messages author, in this case `user`.
     */
    private ChatCompletionRequestUserMessageRole role;
    /**
     * Instantiates a new ChatCompletionRequestUserMessage and sets the default values.
     */
    public ChatCompletionRequestUserMessage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatCompletionRequestUserMessage
     */
    @jakarta.annotation.Nonnull
    public static ChatCompletionRequestUserMessage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatCompletionRequestUserMessage();
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
     * Gets the content property value. The contents of the user message.
     * @return a java.util.List<ChatCompletionRequestMessageContentPart>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChatCompletionRequestMessageContentPart> getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("content", (n) -> { this.setContent(n.getCollectionOfObjectValues(ChatCompletionRequestMessageContentPart::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getEnumValue(ChatCompletionRequestUserMessageRole::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the role property value. The role of the messages author, in this case `user`.
     * @return a ChatCompletionRequestUserMessageRole
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestUserMessageRole getRole() {
        return this.role;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("content", this.getContent());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("role", this.getRole());
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
     * Sets the content property value. The contents of the user message.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final java.util.List<ChatCompletionRequestMessageContentPart> value) {
        this.content = value;
    }
    /**
     * Sets the name property value. An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the role property value. The role of the messages author, in this case `user`.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final ChatCompletionRequestUserMessageRole value) {
        this.role = value;
    }
}
