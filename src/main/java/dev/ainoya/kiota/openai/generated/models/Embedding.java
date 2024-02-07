package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents an embedding vector returned by embedding endpoint.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Embedding implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).
     */
    private java.util.List<Double> embedding;
    /**
     * The index of the embedding in the list of embeddings.
     */
    private Integer index;
    /**
     * The object type, which is always "embedding".
     */
    private EmbeddingObject object;
    /**
     * Instantiates a new Embedding and sets the default values.
     */
    public Embedding() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Embedding
     */
    @jakarta.annotation.Nonnull
    public static Embedding createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Embedding();
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
     * Gets the embedding property value. The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).
     * @return a java.util.List<Double>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Double> getEmbedding() {
        return this.embedding;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("embedding", (n) -> { this.setEmbedding(n.getCollectionOfPrimitiveValues(Double.class)); });
        deserializerMap.put("index", (n) -> { this.setIndex(n.getIntegerValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(EmbeddingObject::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the index property value. The index of the embedding in the list of embeddings.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIndex() {
        return this.index;
    }
    /**
     * Gets the object property value. The object type, which is always "embedding".
     * @return a EmbeddingObject
     */
    @jakarta.annotation.Nullable
    public EmbeddingObject getObject() {
        return this.object;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("embedding", this.getEmbedding());
        writer.writeIntegerValue("index", this.getIndex());
        writer.writeEnumValue("object", this.getObject());
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
     * Sets the embedding property value. The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).
     * @param value Value to set for the embedding property.
     */
    public void setEmbedding(@jakarta.annotation.Nullable final java.util.List<Double> value) {
        this.embedding = value;
    }
    /**
     * Sets the index property value. The index of the embedding in the list of embeddings.
     * @param value Value to set for the index property.
     */
    public void setIndex(@jakarta.annotation.Nullable final Integer value) {
        this.index = value;
    }
    /**
     * Sets the object property value. The object type, which is always "embedding".
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final EmbeddingObject value) {
        this.object = value;
    }
}
