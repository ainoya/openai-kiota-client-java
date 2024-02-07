package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateCompletionResponseChoicesLogprobs implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The text_offset property
     */
    private java.util.List<Integer> textOffset;
    /**
     * The token_logprobs property
     */
    private java.util.List<Double> tokenLogprobs;
    /**
     * The tokens property
     */
    private java.util.List<String> tokens;
    /**
     * The top_logprobs property
     */
    private java.util.List<CreateCompletionResponseChoicesLogprobsTopLogprobs> topLogprobs;
    /**
     * Instantiates a new CreateCompletionResponseChoicesLogprobs and sets the default values.
     */
    public CreateCompletionResponseChoicesLogprobs() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateCompletionResponseChoicesLogprobs
     */
    @jakarta.annotation.Nonnull
    public static CreateCompletionResponseChoicesLogprobs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateCompletionResponseChoicesLogprobs();
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
        deserializerMap.put("text_offset", (n) -> { this.setTextOffset(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("token_logprobs", (n) -> { this.setTokenLogprobs(n.getCollectionOfPrimitiveValues(Double.class)); });
        deserializerMap.put("tokens", (n) -> { this.setTokens(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("top_logprobs", (n) -> { this.setTopLogprobs(n.getCollectionOfObjectValues(CreateCompletionResponseChoicesLogprobsTopLogprobs::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the text_offset property value. The text_offset property
     * @return a java.util.List<Integer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getTextOffset() {
        return this.textOffset;
    }
    /**
     * Gets the token_logprobs property value. The token_logprobs property
     * @return a java.util.List<Double>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Double> getTokenLogprobs() {
        return this.tokenLogprobs;
    }
    /**
     * Gets the tokens property value. The tokens property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTokens() {
        return this.tokens;
    }
    /**
     * Gets the top_logprobs property value. The top_logprobs property
     * @return a java.util.List<CreateCompletionResponseChoicesLogprobsTopLogprobs>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CreateCompletionResponseChoicesLogprobsTopLogprobs> getTopLogprobs() {
        return this.topLogprobs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("text_offset", this.getTextOffset());
        writer.writeCollectionOfPrimitiveValues("token_logprobs", this.getTokenLogprobs());
        writer.writeCollectionOfPrimitiveValues("tokens", this.getTokens());
        writer.writeCollectionOfObjectValues("top_logprobs", this.getTopLogprobs());
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
     * Sets the text_offset property value. The text_offset property
     * @param value Value to set for the text_offset property.
     */
    public void setTextOffset(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.textOffset = value;
    }
    /**
     * Sets the token_logprobs property value. The token_logprobs property
     * @param value Value to set for the token_logprobs property.
     */
    public void setTokenLogprobs(@jakarta.annotation.Nullable final java.util.List<Double> value) {
        this.tokenLogprobs = value;
    }
    /**
     * Sets the tokens property value. The tokens property
     * @param value Value to set for the tokens property.
     */
    public void setTokens(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tokens = value;
    }
    /**
     * Sets the top_logprobs property value. The top_logprobs property
     * @param value Value to set for the top_logprobs property.
     */
    public void setTopLogprobs(@jakarta.annotation.Nullable final java.util.List<CreateCompletionResponseChoicesLogprobsTopLogprobs> value) {
        this.topLogprobs = value;
    }
}
