package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Log probability information for the choice.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateChatCompletionResponseChoicesLogprobs implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of message content tokens with log probability information.
     */
    private java.util.List<ChatCompletionTokenLogprob> content;
    /**
     * Instantiates a new CreateChatCompletionResponseChoicesLogprobs and sets the default values.
     */
    public CreateChatCompletionResponseChoicesLogprobs() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateChatCompletionResponseChoicesLogprobs
     */
    @jakarta.annotation.Nonnull
    public static CreateChatCompletionResponseChoicesLogprobs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateChatCompletionResponseChoicesLogprobs();
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
     * Gets the content property value. A list of message content tokens with log probability information.
     * @return a java.util.List<ChatCompletionTokenLogprob>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ChatCompletionTokenLogprob> getContent() {
        return this.content;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("content", (n) -> { this.setContent(n.getCollectionOfObjectValues(ChatCompletionTokenLogprob::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("content", this.getContent());
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
     * Sets the content property value. A list of message content tokens with log probability information.
     * @param value Value to set for the content property.
     */
    public void setContent(@jakarta.annotation.Nullable final java.util.List<ChatCompletionTokenLogprob> value) {
        this.content = value;
    }
}
