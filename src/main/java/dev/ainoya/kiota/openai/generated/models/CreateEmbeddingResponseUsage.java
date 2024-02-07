package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The usage information for the request.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateEmbeddingResponseUsage implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of tokens used by the prompt.
     */
    private Integer promptTokens;
    /**
     * The total number of tokens used by the request.
     */
    private Integer totalTokens;
    /**
     * Instantiates a new CreateEmbeddingResponseUsage and sets the default values.
     */
    public CreateEmbeddingResponseUsage() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateEmbeddingResponseUsage
     */
    @jakarta.annotation.Nonnull
    public static CreateEmbeddingResponseUsage createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateEmbeddingResponseUsage();
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
        deserializerMap.put("prompt_tokens", (n) -> { this.setPromptTokens(n.getIntegerValue()); });
        deserializerMap.put("total_tokens", (n) -> { this.setTotalTokens(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the prompt_tokens property value. The number of tokens used by the prompt.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getPromptTokens() {
        return this.promptTokens;
    }
    /**
     * Gets the total_tokens property value. The total number of tokens used by the request.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTotalTokens() {
        return this.totalTokens;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("prompt_tokens", this.getPromptTokens());
        writer.writeIntegerValue("total_tokens", this.getTotalTokens());
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
     * Sets the prompt_tokens property value. The number of tokens used by the prompt.
     * @param value Value to set for the prompt_tokens property.
     */
    public void setPromptTokens(@jakarta.annotation.Nullable final Integer value) {
        this.promptTokens = value;
    }
    /**
     * Sets the total_tokens property value. The total number of tokens used by the request.
     * @param value Value to set for the total_tokens property.
     */
    public void setTotalTokens(@jakarta.annotation.Nullable final Integer value) {
        this.totalTokens = value;
    }
}
