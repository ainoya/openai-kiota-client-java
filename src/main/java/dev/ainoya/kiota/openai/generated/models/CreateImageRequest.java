package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateImageRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The model to use for image generation.
     */
    private CreateImageRequestModel model;
    /**
     * The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
     */
    private Integer n;
    /**
     * A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
     */
    private String prompt;
    /**
     * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
     */
    private CreateImageRequestQuality quality;
    /**
     * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
     */
    private CreateImageRequestResponseFormat responseFormat;
    /**
     * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
     */
    private CreateImageRequestSize size;
    /**
     * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
     */
    private CreateImageRequestStyle style;
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     */
    private String user;
    /**
     * Instantiates a new CreateImageRequest and sets the default values.
     */
    public CreateImageRequest() {
        this.setAdditionalData(new HashMap<>());
        this.setQuality(CreateImageRequestQuality.forValue("standard"));
        this.setResponseFormat(CreateImageRequestResponseFormat.forValue("url"));
        this.setSize(CreateImageRequestSize.forValue("1024x1024"));
        this.setStyle(CreateImageRequestStyle.forValue("vivid"));
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateImageRequest
     */
    @jakarta.annotation.Nonnull
    public static CreateImageRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateImageRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("model", (n) -> { this.setModel(n.getObjectValue(CreateImageRequestModel::createFromDiscriminatorValue)); });
        deserializerMap.put("n", (n) -> { this.setN(n.getIntegerValue()); });
        deserializerMap.put("prompt", (n) -> { this.setPrompt(n.getStringValue()); });
        deserializerMap.put("quality", (n) -> { this.setQuality(n.getEnumValue(CreateImageRequestQuality::forValue)); });
        deserializerMap.put("response_format", (n) -> { this.setResponseFormat(n.getEnumValue(CreateImageRequestResponseFormat::forValue)); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getEnumValue(CreateImageRequestSize::forValue)); });
        deserializerMap.put("style", (n) -> { this.setStyle(n.getEnumValue(CreateImageRequestStyle::forValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the model property value. The model to use for image generation.
     * @return a CreateImageRequestModel
     */
    @jakarta.annotation.Nullable
    public CreateImageRequestModel getModel() {
        return this.model;
    }
    /**
     * Gets the n property value. The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getN() {
        return this.n;
    }
    /**
     * Gets the prompt property value. A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrompt() {
        return this.prompt;
    }
    /**
     * Gets the quality property value. The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
     * @return a CreateImageRequestQuality
     */
    @jakarta.annotation.Nullable
    public CreateImageRequestQuality getQuality() {
        return this.quality;
    }
    /**
     * Gets the response_format property value. The format in which the generated images are returned. Must be one of `url` or `b64_json`.
     * @return a CreateImageRequestResponseFormat
     */
    @jakarta.annotation.Nullable
    public CreateImageRequestResponseFormat getResponseFormat() {
        return this.responseFormat;
    }
    /**
     * Gets the size property value. The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
     * @return a CreateImageRequestSize
     */
    @jakarta.annotation.Nullable
    public CreateImageRequestSize getSize() {
        return this.size;
    }
    /**
     * Gets the style property value. The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
     * @return a CreateImageRequestStyle
     */
    @jakarta.annotation.Nullable
    public CreateImageRequestStyle getStyle() {
        return this.style;
    }
    /**
     * Gets the user property value. A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("model", this.getModel());
        writer.writeIntegerValue("n", this.getN());
        writer.writeStringValue("prompt", this.getPrompt());
        writer.writeEnumValue("quality", this.getQuality());
        writer.writeEnumValue("response_format", this.getResponseFormat());
        writer.writeEnumValue("size", this.getSize());
        writer.writeEnumValue("style", this.getStyle());
        writer.writeStringValue("user", this.getUser());
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
     * Sets the model property value. The model to use for image generation.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final CreateImageRequestModel value) {
        this.model = value;
    }
    /**
     * Sets the n property value. The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
     * @param value Value to set for the n property.
     */
    public void setN(@jakarta.annotation.Nullable final Integer value) {
        this.n = value;
    }
    /**
     * Sets the prompt property value. A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
     * @param value Value to set for the prompt property.
     */
    public void setPrompt(@jakarta.annotation.Nullable final String value) {
        this.prompt = value;
    }
    /**
     * Sets the quality property value. The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
     * @param value Value to set for the quality property.
     */
    public void setQuality(@jakarta.annotation.Nullable final CreateImageRequestQuality value) {
        this.quality = value;
    }
    /**
     * Sets the response_format property value. The format in which the generated images are returned. Must be one of `url` or `b64_json`.
     * @param value Value to set for the response_format property.
     */
    public void setResponseFormat(@jakarta.annotation.Nullable final CreateImageRequestResponseFormat value) {
        this.responseFormat = value;
    }
    /**
     * Sets the size property value. The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final CreateImageRequestSize value) {
        this.size = value;
    }
    /**
     * Sets the style property value. The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
     * @param value Value to set for the style property.
     */
    public void setStyle(@jakarta.annotation.Nullable final CreateImageRequestStyle value) {
        this.style = value;
    }
    /**
     * Sets the user property value. A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
    /**
     * Composed type wrapper for classes string
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class CreateImageRequestModel implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type string
         */
        private String string;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a CreateImageRequestModel
         */
        @jakarta.annotation.Nonnull
        public static CreateImageRequestModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final CreateImageRequestModel result = new CreateImageRequestModel();
            if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * The deserialization information for the current model
         * @return a Map<String, java.util.function.Consumer<ParseNode>>
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the string property value. Composed type representation for type string
         * @return a String
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.string;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the string property value. Composed type representation for type string
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.string = value;
        }
    }
}
