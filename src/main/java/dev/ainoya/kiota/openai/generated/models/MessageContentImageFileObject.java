package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageContentImageFileObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The image_file property
     */
    private MessageContentImageFileObjectImageFile imageFile;
    /**
     * Always `image_file`.
     */
    private MessageContentImageFileObjectType type;
    /**
     * Instantiates a new MessageContentImageFileObject and sets the default values.
     */
    public MessageContentImageFileObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageContentImageFileObject
     */
    @jakarta.annotation.Nonnull
    public static MessageContentImageFileObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageContentImageFileObject();
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
        deserializerMap.put("image_file", (n) -> { this.setImageFile(n.getObjectValue(MessageContentImageFileObjectImageFile::createFromDiscriminatorValue)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(MessageContentImageFileObjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the image_file property value. The image_file property
     * @return a MessageContentImageFileObjectImageFile
     */
    @jakarta.annotation.Nullable
    public MessageContentImageFileObjectImageFile getImageFile() {
        return this.imageFile;
    }
    /**
     * Gets the type property value. Always `image_file`.
     * @return a MessageContentImageFileObjectType
     */
    @jakarta.annotation.Nullable
    public MessageContentImageFileObjectType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("image_file", this.getImageFile());
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
     * Sets the image_file property value. The image_file property
     * @param value Value to set for the image_file property.
     */
    public void setImageFile(@jakarta.annotation.Nullable final MessageContentImageFileObjectImageFile value) {
        this.imageFile = value;
    }
    /**
     * Sets the type property value. Always `image_file`.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final MessageContentImageFileObjectType value) {
        this.type = value;
    }
}
