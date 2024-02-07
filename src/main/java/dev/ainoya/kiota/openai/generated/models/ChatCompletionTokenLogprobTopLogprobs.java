package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChatCompletionTokenLogprobTopLogprobs implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
     */
    private java.util.List<Integer> bytes;
    /**
     * The log probability of this token.
     */
    private Double logprob;
    /**
     * The token.
     */
    private String token;
    /**
     * Instantiates a new ChatCompletionTokenLogprobTopLogprobs and sets the default values.
     */
    public ChatCompletionTokenLogprobTopLogprobs() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChatCompletionTokenLogprobTopLogprobs
     */
    @jakarta.annotation.Nonnull
    public static ChatCompletionTokenLogprobTopLogprobs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChatCompletionTokenLogprobTopLogprobs();
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
     * Gets the bytes property value. A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
     * @return a java.util.List<Integer>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Integer> getBytes() {
        return this.bytes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("bytes", (n) -> { this.setBytes(n.getCollectionOfPrimitiveValues(Integer.class)); });
        deserializerMap.put("logprob", (n) -> { this.setLogprob(n.getDoubleValue()); });
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the logprob property value. The log probability of this token.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getLogprob() {
        return this.logprob;
    }
    /**
     * Gets the token property value. The token.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getToken() {
        return this.token;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("bytes", this.getBytes());
        writer.writeDoubleValue("logprob", this.getLogprob());
        writer.writeStringValue("token", this.getToken());
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
     * Sets the bytes property value. A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
     * @param value Value to set for the bytes property.
     */
    public void setBytes(@jakarta.annotation.Nullable final java.util.List<Integer> value) {
        this.bytes = value;
    }
    /**
     * Sets the logprob property value. The log probability of this token.
     * @param value Value to set for the logprob property.
     */
    public void setLogprob(@jakarta.annotation.Nullable final Double value) {
        this.logprob = value;
    }
    /**
     * Sets the token property value. The token.
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.token = value;
    }
}
