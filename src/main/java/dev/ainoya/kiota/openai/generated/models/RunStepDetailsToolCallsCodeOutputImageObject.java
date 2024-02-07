package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunStepDetailsToolCallsCodeOutputImageObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The image property
     */
    private RunStepDetailsToolCallsCodeOutputImageObjectImage image;
    /**
     * Always `image`.
     */
    private RunStepDetailsToolCallsCodeOutputImageObjectType type;
    /**
     * Instantiates a new RunStepDetailsToolCallsCodeOutputImageObject and sets the default values.
     */
    public RunStepDetailsToolCallsCodeOutputImageObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunStepDetailsToolCallsCodeOutputImageObject
     */
    @jakarta.annotation.Nonnull
    public static RunStepDetailsToolCallsCodeOutputImageObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunStepDetailsToolCallsCodeOutputImageObject();
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
        deserializerMap.put("image", (n) -> { this.setImage(n.getObjectValue(RunStepDetailsToolCallsCodeOutputImageObjectImage::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RunStepDetailsToolCallsCodeOutputImageObjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the image property value. The image property
     * @return a RunStepDetailsToolCallsCodeOutputImageObjectImage
     */
    @jakarta.annotation.Nullable
    public RunStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
        return this.image;
    }
    /**
     * Gets the type property value. Always `image`.
     * @return a RunStepDetailsToolCallsCodeOutputImageObjectType
     */
    @jakarta.annotation.Nullable
    public RunStepDetailsToolCallsCodeOutputImageObjectType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("image", this.getImage());
        writer.writeEnumValue("type", this.getType());
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
     * Sets the image property value. The image property
     * @param value Value to set for the image property.
     */
    public void setImage(@jakarta.annotation.Nullable final RunStepDetailsToolCallsCodeOutputImageObjectImage value) {
        this.image = value;
    }
    /**
     * Sets the type property value. Always `image`.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RunStepDetailsToolCallsCodeOutputImageObjectType value) {
        this.type = value;
    }
}
