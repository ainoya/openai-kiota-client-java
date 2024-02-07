package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A list of the categories along with their scores as predicted by model.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateModerationResponseResultsCategoryScores implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The score for the category 'harassment'.
     */
    private Double harassment;
    /**
     * The score for the category 'harassment/threatening'.
     */
    private Double harassmentThreatening;
    /**
     * The score for the category 'hate'.
     */
    private Double hate;
    /**
     * The score for the category 'hate/threatening'.
     */
    private Double hateThreatening;
    /**
     * The score for the category 'self-harm'.
     */
    private Double selfHarm;
    /**
     * The score for the category 'self-harm/instructions'.
     */
    private Double selfHarmInstructions;
    /**
     * The score for the category 'self-harm/intent'.
     */
    private Double selfHarmIntent;
    /**
     * The score for the category 'sexual'.
     */
    private Double sexual;
    /**
     * The score for the category 'sexual/minors'.
     */
    private Double sexualMinors;
    /**
     * The score for the category 'violence'.
     */
    private Double violence;
    /**
     * The score for the category 'violence/graphic'.
     */
    private Double violenceGraphic;
    /**
     * Instantiates a new CreateModerationResponseResultsCategoryScores and sets the default values.
     */
    public CreateModerationResponseResultsCategoryScores() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateModerationResponseResultsCategoryScores
     */
    @jakarta.annotation.Nonnull
    public static CreateModerationResponseResultsCategoryScores createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateModerationResponseResultsCategoryScores();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(11);
        deserializerMap.put("harassment", (n) -> { this.setHarassment(n.getDoubleValue()); });
        deserializerMap.put("harassment/threatening", (n) -> { this.setHarassmentThreatening(n.getDoubleValue()); });
        deserializerMap.put("hate", (n) -> { this.setHate(n.getDoubleValue()); });
        deserializerMap.put("hate/threatening", (n) -> { this.setHateThreatening(n.getDoubleValue()); });
        deserializerMap.put("self-harm", (n) -> { this.setSelfHarm(n.getDoubleValue()); });
        deserializerMap.put("self-harm/instructions", (n) -> { this.setSelfHarmInstructions(n.getDoubleValue()); });
        deserializerMap.put("self-harm/intent", (n) -> { this.setSelfHarmIntent(n.getDoubleValue()); });
        deserializerMap.put("sexual", (n) -> { this.setSexual(n.getDoubleValue()); });
        deserializerMap.put("sexual/minors", (n) -> { this.setSexualMinors(n.getDoubleValue()); });
        deserializerMap.put("violence", (n) -> { this.setViolence(n.getDoubleValue()); });
        deserializerMap.put("violence/graphic", (n) -> { this.setViolenceGraphic(n.getDoubleValue()); });
        return deserializerMap;
    }
    /**
     * Gets the harassment property value. The score for the category 'harassment'.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getHarassment() {
        return this.harassment;
    }
    /**
     * Gets the harassment/threatening property value. The score for the category 'harassment/threatening'.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getHarassmentThreatening() {
        return this.harassmentThreatening;
    }
    /**
     * Gets the hate property value. The score for the category 'hate'.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getHate() {
        return this.hate;
    }
    /**
     * Gets the hate/threatening property value. The score for the category 'hate/threatening'.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getHateThreatening() {
        return this.hateThreatening;
    }
    /**
     * Gets the self-harm property value. The score for the category 'self-harm'.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSelfHarm() {
        return this.selfHarm;
    }
    /**
     * Gets the self-harm/instructions property value. The score for the category 'self-harm/instructions'.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSelfHarmInstructions() {
        return this.selfHarmInstructions;
    }
    /**
     * Gets the self-harm/intent property value. The score for the category 'self-harm/intent'.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSelfHarmIntent() {
        return this.selfHarmIntent;
    }
    /**
     * Gets the sexual property value. The score for the category 'sexual'.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSexual() {
        return this.sexual;
    }
    /**
     * Gets the sexual/minors property value. The score for the category 'sexual/minors'.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getSexualMinors() {
        return this.sexualMinors;
    }
    /**
     * Gets the violence property value. The score for the category 'violence'.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getViolence() {
        return this.violence;
    }
    /**
     * Gets the violence/graphic property value. The score for the category 'violence/graphic'.
     * @return a Double
     */
    @jakarta.annotation.Nullable
    public Double getViolenceGraphic() {
        return this.violenceGraphic;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeDoubleValue("harassment", this.getHarassment());
        writer.writeDoubleValue("harassment/threatening", this.getHarassmentThreatening());
        writer.writeDoubleValue("hate", this.getHate());
        writer.writeDoubleValue("hate/threatening", this.getHateThreatening());
        writer.writeDoubleValue("self-harm", this.getSelfHarm());
        writer.writeDoubleValue("self-harm/instructions", this.getSelfHarmInstructions());
        writer.writeDoubleValue("self-harm/intent", this.getSelfHarmIntent());
        writer.writeDoubleValue("sexual", this.getSexual());
        writer.writeDoubleValue("sexual/minors", this.getSexualMinors());
        writer.writeDoubleValue("violence", this.getViolence());
        writer.writeDoubleValue("violence/graphic", this.getViolenceGraphic());
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
     * Sets the harassment property value. The score for the category 'harassment'.
     * @param value Value to set for the harassment property.
     */
    public void setHarassment(@jakarta.annotation.Nullable final Double value) {
        this.harassment = value;
    }
    /**
     * Sets the harassment/threatening property value. The score for the category 'harassment/threatening'.
     * @param value Value to set for the harassment/threatening property.
     */
    public void setHarassmentThreatening(@jakarta.annotation.Nullable final Double value) {
        this.harassmentThreatening = value;
    }
    /**
     * Sets the hate property value. The score for the category 'hate'.
     * @param value Value to set for the hate property.
     */
    public void setHate(@jakarta.annotation.Nullable final Double value) {
        this.hate = value;
    }
    /**
     * Sets the hate/threatening property value. The score for the category 'hate/threatening'.
     * @param value Value to set for the hate/threatening property.
     */
    public void setHateThreatening(@jakarta.annotation.Nullable final Double value) {
        this.hateThreatening = value;
    }
    /**
     * Sets the self-harm property value. The score for the category 'self-harm'.
     * @param value Value to set for the self-harm property.
     */
    public void setSelfHarm(@jakarta.annotation.Nullable final Double value) {
        this.selfHarm = value;
    }
    /**
     * Sets the self-harm/instructions property value. The score for the category 'self-harm/instructions'.
     * @param value Value to set for the self-harm/instructions property.
     */
    public void setSelfHarmInstructions(@jakarta.annotation.Nullable final Double value) {
        this.selfHarmInstructions = value;
    }
    /**
     * Sets the self-harm/intent property value. The score for the category 'self-harm/intent'.
     * @param value Value to set for the self-harm/intent property.
     */
    public void setSelfHarmIntent(@jakarta.annotation.Nullable final Double value) {
        this.selfHarmIntent = value;
    }
    /**
     * Sets the sexual property value. The score for the category 'sexual'.
     * @param value Value to set for the sexual property.
     */
    public void setSexual(@jakarta.annotation.Nullable final Double value) {
        this.sexual = value;
    }
    /**
     * Sets the sexual/minors property value. The score for the category 'sexual/minors'.
     * @param value Value to set for the sexual/minors property.
     */
    public void setSexualMinors(@jakarta.annotation.Nullable final Double value) {
        this.sexualMinors = value;
    }
    /**
     * Sets the violence property value. The score for the category 'violence'.
     * @param value Value to set for the violence property.
     */
    public void setViolence(@jakarta.annotation.Nullable final Double value) {
        this.violence = value;
    }
    /**
     * Sets the violence/graphic property value. The score for the category 'violence/graphic'.
     * @param value Value to set for the violence/graphic property.
     */
    public void setViolenceGraphic(@jakarta.annotation.Nullable final Double value) {
        this.violenceGraphic = value;
    }
}
