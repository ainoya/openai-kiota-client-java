package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateCompletionResponseChoices implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence,`length` if the maximum number of tokens specified in the request was reached,or `content_filter` if content was omitted due to a flag from our content filters.
     */
    private CreateCompletionResponseChoicesFinishReason finishReason;
    /**
     * The index property
     */
    private Integer index;
    /**
     * The logprobs property
     */
    private CreateCompletionResponseChoicesLogprobs logprobs;
    /**
     * The text property
     */
    private String text;
    /**
     * Instantiates a new CreateCompletionResponseChoices and sets the default values.
     */
    public CreateCompletionResponseChoices() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateCompletionResponseChoices
     */
    @jakarta.annotation.Nonnull
    public static CreateCompletionResponseChoices createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateCompletionResponseChoices();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("finish_reason", (n) -> { this.setFinishReason(n.getEnumValue(CreateCompletionResponseChoicesFinishReason::forValue)); });
        deserializerMap.put("index", (n) -> { this.setIndex(n.getIntegerValue()); });
        deserializerMap.put("logprobs", (n) -> { this.setLogprobs(n.getObjectValue(CreateCompletionResponseChoicesLogprobs::createFromDiscriminatorValue)); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the finish_reason property value. The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence,`length` if the maximum number of tokens specified in the request was reached,or `content_filter` if content was omitted due to a flag from our content filters.
     * @return a CreateCompletionResponseChoicesFinishReason
     */
    @jakarta.annotation.Nullable
    public CreateCompletionResponseChoicesFinishReason getFinishReason() {
        return this.finishReason;
    }
    /**
     * Gets the index property value. The index property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIndex() {
        return this.index;
    }
    /**
     * Gets the logprobs property value. The logprobs property
     * @return a CreateCompletionResponseChoicesLogprobs
     */
    @jakarta.annotation.Nullable
    public CreateCompletionResponseChoicesLogprobs getLogprobs() {
        return this.logprobs;
    }
    /**
     * Gets the text property value. The text property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("finish_reason", this.getFinishReason());
        writer.writeIntegerValue("index", this.getIndex());
        writer.writeObjectValue("logprobs", this.getLogprobs());
        writer.writeStringValue("text", this.getText());
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
     * Sets the finish_reason property value. The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence,`length` if the maximum number of tokens specified in the request was reached,or `content_filter` if content was omitted due to a flag from our content filters.
     * @param value Value to set for the finish_reason property.
     */
    public void setFinishReason(@jakarta.annotation.Nullable final CreateCompletionResponseChoicesFinishReason value) {
        this.finishReason = value;
    }
    /**
     * Sets the index property value. The index property
     * @param value Value to set for the index property.
     */
    public void setIndex(@jakarta.annotation.Nullable final Integer value) {
        this.index = value;
    }
    /**
     * Sets the logprobs property value. The logprobs property
     * @param value Value to set for the logprobs property.
     */
    public void setLogprobs(@jakarta.annotation.Nullable final CreateCompletionResponseChoicesLogprobs value) {
        this.logprobs = value;
    }
    /**
     * Sets the text property value. The text property
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
}
