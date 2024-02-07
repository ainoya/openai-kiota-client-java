package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateModerationResponseResults implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of the categories, and whether they are flagged or not.
     */
    private CreateModerationResponseResultsCategories categories;
    /**
     * A list of the categories along with their scores as predicted by model.
     */
    private CreateModerationResponseResultsCategoryScores categoryScores;
    /**
     * Whether the content violates [OpenAI's usage policies](/policies/usage-policies).
     */
    private Boolean flagged;
    /**
     * Instantiates a new CreateModerationResponseResults and sets the default values.
     */
    public CreateModerationResponseResults() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateModerationResponseResults
     */
    @jakarta.annotation.Nonnull
    public static CreateModerationResponseResults createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateModerationResponseResults();
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
     * Gets the categories property value. A list of the categories, and whether they are flagged or not.
     * @return a CreateModerationResponseResultsCategories
     */
    @jakarta.annotation.Nullable
    public CreateModerationResponseResultsCategories getCategories() {
        return this.categories;
    }
    /**
     * Gets the category_scores property value. A list of the categories along with their scores as predicted by model.
     * @return a CreateModerationResponseResultsCategoryScores
     */
    @jakarta.annotation.Nullable
    public CreateModerationResponseResultsCategoryScores getCategoryScores() {
        return this.categoryScores;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getObjectValue(CreateModerationResponseResultsCategories::createFromDiscriminatorValue)); });
        deserializerMap.put("category_scores", (n) -> { this.setCategoryScores(n.getObjectValue(CreateModerationResponseResultsCategoryScores::createFromDiscriminatorValue)); });
        deserializerMap.put("flagged", (n) -> { this.setFlagged(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the flagged property value. Whether the content violates [OpenAI's usage policies](/policies/usage-policies).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getFlagged() {
        return this.flagged;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("categories", this.getCategories());
        writer.writeObjectValue("category_scores", this.getCategoryScores());
        writer.writeBooleanValue("flagged", this.getFlagged());
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
     * Sets the categories property value. A list of the categories, and whether they are flagged or not.
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final CreateModerationResponseResultsCategories value) {
        this.categories = value;
    }
    /**
     * Sets the category_scores property value. A list of the categories along with their scores as predicted by model.
     * @param value Value to set for the category_scores property.
     */
    public void setCategoryScores(@jakarta.annotation.Nullable final CreateModerationResponseResultsCategoryScores value) {
        this.categoryScores = value;
    }
    /**
     * Sets the flagged property value. Whether the content violates [OpenAI's usage policies](/policies/usage-policies).
     * @param value Value to set for the flagged property.
     */
    public void setFlagged(@jakarta.annotation.Nullable final Boolean value) {
        this.flagged = value;
    }
}
