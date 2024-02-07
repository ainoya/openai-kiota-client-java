package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatCompletionRequestMessageContentPartImage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The image_url property
     */
    private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;
    /**
     * The type of the content part.
     */
    private ChatCompletionRequestMessageContentPartImageType type;
    /**
     * Instantiates a new ChatCompletionRequestMessageContentPartImage and sets the default values.
     */
    public ChatCompletionRequestMessageContentPartImage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatCompletionRequestMessageContentPartImage
     */
    @jakarta.annotation.Nonnull
    public static ChatCompletionRequestMessageContentPartImage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatCompletionRequestMessageContentPartImage();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("image_url", (n) -> { this.setImageUrl(n.getObjectValue(ChatCompletionRequestMessageContentPartImageImageUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(ChatCompletionRequestMessageContentPartImageType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the image_url property value. The image_url property
     * @return a ChatCompletionRequestMessageContentPartImageImageUrl
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestMessageContentPartImageImageUrl getImageUrl() {
        return this.imageUrl;
    }
    /**
     * Gets the type property value. The type of the content part.
     * @return a ChatCompletionRequestMessageContentPartImageType
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestMessageContentPartImageType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("image_url", this.getImageUrl());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the image_url property value. The image_url property
     * @param value Value to set for the image_url property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final ChatCompletionRequestMessageContentPartImageImageUrl value) {
        this.imageUrl = value;
    }
    /**
     * Sets the type property value. The type of the content part.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final ChatCompletionRequestMessageContentPartImageType value) {
        this.type = value;
    }
}
