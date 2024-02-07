package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A list of the categories, and whether they are flagged or not.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateModerationResponseResultsCategories implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Content that expresses, incites, or promotes harassing language towards any target.
     */
    private Boolean harassment;
    /**
     * Harassment content that also includes violence or serious harm towards any target.
     */
    private Boolean harassmentThreatening;
    /**
     * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
     */
    private Boolean hate;
    /**
     * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
     */
    private Boolean hateThreatening;
    /**
     * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
     */
    private Boolean selfHarm;
    /**
     * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
     */
    private Boolean selfHarmInstructions;
    /**
     * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
     */
    private Boolean selfHarmIntent;
    /**
     * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
     */
    private Boolean sexual;
    /**
     * Sexual content that includes an individual who is under 18 years old.
     */
    private Boolean sexualMinors;
    /**
     * Content that depicts death, violence, or physical injury.
     */
    private Boolean violence;
    /**
     * Content that depicts death, violence, or physical injury in graphic detail.
     */
    private Boolean violenceGraphic;
    /**
     * Instantiates a new CreateModerationResponseResultsCategories and sets the default values.
     */
    public CreateModerationResponseResultsCategories() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateModerationResponseResultsCategories
     */
    @jakarta.annotation.Nonnull
    public static CreateModerationResponseResultsCategories createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateModerationResponseResultsCategories();
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
        deserializerMap.put("harassment", (n) -> { this.setHarassment(n.getBooleanValue()); });
        deserializerMap.put("harassment/threatening", (n) -> { this.setHarassmentThreatening(n.getBooleanValue()); });
        deserializerMap.put("hate", (n) -> { this.setHate(n.getBooleanValue()); });
        deserializerMap.put("hate/threatening", (n) -> { this.setHateThreatening(n.getBooleanValue()); });
        deserializerMap.put("self-harm", (n) -> { this.setSelfHarm(n.getBooleanValue()); });
        deserializerMap.put("self-harm/instructions", (n) -> { this.setSelfHarmInstructions(n.getBooleanValue()); });
        deserializerMap.put("self-harm/intent", (n) -> { this.setSelfHarmIntent(n.getBooleanValue()); });
        deserializerMap.put("sexual", (n) -> { this.setSexual(n.getBooleanValue()); });
        deserializerMap.put("sexual/minors", (n) -> { this.setSexualMinors(n.getBooleanValue()); });
        deserializerMap.put("violence", (n) -> { this.setViolence(n.getBooleanValue()); });
        deserializerMap.put("violence/graphic", (n) -> { this.setViolenceGraphic(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the harassment property value. Content that expresses, incites, or promotes harassing language towards any target.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHarassment() {
        return this.harassment;
    }
    /**
     * Gets the harassment/threatening property value. Harassment content that also includes violence or serious harm towards any target.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHarassmentThreatening() {
        return this.harassmentThreatening;
    }
    /**
     * Gets the hate property value. Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHate() {
        return this.hate;
    }
    /**
     * Gets the hate/threatening property value. Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHateThreatening() {
        return this.hateThreatening;
    }
    /**
     * Gets the self-harm property value. Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSelfHarm() {
        return this.selfHarm;
    }
    /**
     * Gets the self-harm/instructions property value. Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSelfHarmInstructions() {
        return this.selfHarmInstructions;
    }
    /**
     * Gets the self-harm/intent property value. Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSelfHarmIntent() {
        return this.selfHarmIntent;
    }
    /**
     * Gets the sexual property value. Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSexual() {
        return this.sexual;
    }
    /**
     * Gets the sexual/minors property value. Sexual content that includes an individual who is under 18 years old.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSexualMinors() {
        return this.sexualMinors;
    }
    /**
     * Gets the violence property value. Content that depicts death, violence, or physical injury.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getViolence() {
        return this.violence;
    }
    /**
     * Gets the violence/graphic property value. Content that depicts death, violence, or physical injury in graphic detail.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getViolenceGraphic() {
        return this.violenceGraphic;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("harassment", this.getHarassment());
        writer.writeBooleanValue("harassment/threatening", this.getHarassmentThreatening());
        writer.writeBooleanValue("hate", this.getHate());
        writer.writeBooleanValue("hate/threatening", this.getHateThreatening());
        writer.writeBooleanValue("self-harm", this.getSelfHarm());
        writer.writeBooleanValue("self-harm/instructions", this.getSelfHarmInstructions());
        writer.writeBooleanValue("self-harm/intent", this.getSelfHarmIntent());
        writer.writeBooleanValue("sexual", this.getSexual());
        writer.writeBooleanValue("sexual/minors", this.getSexualMinors());
        writer.writeBooleanValue("violence", this.getViolence());
        writer.writeBooleanValue("violence/graphic", this.getViolenceGraphic());
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
     * Sets the harassment property value. Content that expresses, incites, or promotes harassing language towards any target.
     * @param value Value to set for the harassment property.
     */
    public void setHarassment(@jakarta.annotation.Nullable final Boolean value) {
        this.harassment = value;
    }
    /**
     * Sets the harassment/threatening property value. Harassment content that also includes violence or serious harm towards any target.
     * @param value Value to set for the harassment/threatening property.
     */
    public void setHarassmentThreatening(@jakarta.annotation.Nullable final Boolean value) {
        this.harassmentThreatening = value;
    }
    /**
     * Sets the hate property value. Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
     * @param value Value to set for the hate property.
     */
    public void setHate(@jakarta.annotation.Nullable final Boolean value) {
        this.hate = value;
    }
    /**
     * Sets the hate/threatening property value. Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
     * @param value Value to set for the hate/threatening property.
     */
    public void setHateThreatening(@jakarta.annotation.Nullable final Boolean value) {
        this.hateThreatening = value;
    }
    /**
     * Sets the self-harm property value. Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
     * @param value Value to set for the self-harm property.
     */
    public void setSelfHarm(@jakarta.annotation.Nullable final Boolean value) {
        this.selfHarm = value;
    }
    /**
     * Sets the self-harm/instructions property value. Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
     * @param value Value to set for the self-harm/instructions property.
     */
    public void setSelfHarmInstructions(@jakarta.annotation.Nullable final Boolean value) {
        this.selfHarmInstructions = value;
    }
    /**
     * Sets the self-harm/intent property value. Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
     * @param value Value to set for the self-harm/intent property.
     */
    public void setSelfHarmIntent(@jakarta.annotation.Nullable final Boolean value) {
        this.selfHarmIntent = value;
    }
    /**
     * Sets the sexual property value. Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
     * @param value Value to set for the sexual property.
     */
    public void setSexual(@jakarta.annotation.Nullable final Boolean value) {
        this.sexual = value;
    }
    /**
     * Sets the sexual/minors property value. Sexual content that includes an individual who is under 18 years old.
     * @param value Value to set for the sexual/minors property.
     */
    public void setSexualMinors(@jakarta.annotation.Nullable final Boolean value) {
        this.sexualMinors = value;
    }
    /**
     * Sets the violence property value. Content that depicts death, violence, or physical injury.
     * @param value Value to set for the violence property.
     */
    public void setViolence(@jakarta.annotation.Nullable final Boolean value) {
        this.violence = value;
    }
    /**
     * Sets the violence/graphic property value. Content that depicts death, violence, or physical injury in graphic detail.
     * @param value Value to set for the violence/graphic property.
     */
    public void setViolenceGraphic(@jakarta.annotation.Nullable final Boolean value) {
        this.violenceGraphic = value;
    }
}
