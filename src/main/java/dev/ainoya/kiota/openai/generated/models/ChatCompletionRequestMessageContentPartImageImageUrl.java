package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatCompletionRequestMessageContentPartImageImageUrl implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
     */
    private ChatCompletionRequestMessageContentPartImageImageUrlDetail detail;
    /**
     * Either a URL of the image or the base64 encoded image data.
     */
    private String url;
    /**
     * Instantiates a new ChatCompletionRequestMessageContentPartImageImageUrl and sets the default values.
     */
    public ChatCompletionRequestMessageContentPartImageImageUrl() {
        this.setAdditionalData(new HashMap<>());
        this.setDetail(ChatCompletionRequestMessageContentPartImageImageUrlDetail.forValue("auto"));
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatCompletionRequestMessageContentPartImageImageUrl
     */
    @jakarta.annotation.Nonnull
    public static ChatCompletionRequestMessageContentPartImageImageUrl createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatCompletionRequestMessageContentPartImageImageUrl();
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
     * Gets the detail property value. Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
     * @return a ChatCompletionRequestMessageContentPartImageImageUrlDetail
     */
    @jakarta.annotation.Nullable
    public ChatCompletionRequestMessageContentPartImageImageUrlDetail getDetail() {
        return this.detail;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("detail", (n) -> { this.setDetail(n.getEnumValue(ChatCompletionRequestMessageContentPartImageImageUrlDetail::forValue)); });
        deserializerMap.put("url", (n) -> { this.setUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the url property value. Either a URL of the image or the base64 encoded image data.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUrl() {
        return this.url;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("detail", this.getDetail());
        writer.writeStringValue("url", this.getUrl());
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
     * Sets the detail property value. Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
     * @param value Value to set for the detail property.
     */
    public void setDetail(@jakarta.annotation.Nullable final ChatCompletionRequestMessageContentPartImageImageUrlDetail value) {
        this.detail = value;
    }
    /**
     * Sets the url property value. Either a URL of the image or the base64 encoded image data.
     * @param value Value to set for the url property.
     */
    public void setUrl(@jakarta.annotation.Nullable final String value) {
        this.url = value;
    }
}
