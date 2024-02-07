package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the "retrieval" tool to search files.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageContentTextAnnotationsFileCitationObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The end_index property
     */
    private Integer endIndex;
    /**
     * The file_citation property
     */
    private MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;
    /**
     * The start_index property
     */
    private Integer startIndex;
    /**
     * The text in the message content that needs to be replaced.
     */
    private String text;
    /**
     * Always `file_citation`.
     */
    private MessageContentTextAnnotationsFileCitationObjectType type;
    /**
     * Instantiates a new MessageContentTextAnnotationsFileCitationObject and sets the default values.
     */
    public MessageContentTextAnnotationsFileCitationObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageContentTextAnnotationsFileCitationObject
     */
    @jakarta.annotation.Nonnull
    public static MessageContentTextAnnotationsFileCitationObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageContentTextAnnotationsFileCitationObject();
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
     * Gets the end_index property value. The end_index property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEndIndex() {
        return this.endIndex;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("end_index", (n) -> { this.setEndIndex(n.getIntegerValue()); });
        deserializerMap.put("file_citation", (n) -> { this.setFileCitation(n.getObjectValue(MessageContentTextAnnotationsFileCitationObjectFileCitation::createFromDiscriminatorValue)); });
        deserializerMap.put("start_index", (n) -> { this.setStartIndex(n.getIntegerValue()); });
        deserializerMap.put("text", (n) -> { this.setText(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(MessageContentTextAnnotationsFileCitationObjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the file_citation property value. The file_citation property
     * @return a MessageContentTextAnnotationsFileCitationObjectFileCitation
     */
    @jakarta.annotation.Nullable
    public MessageContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
        return this.fileCitation;
    }
    /**
     * Gets the start_index property value. The start_index property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getStartIndex() {
        return this.startIndex;
    }
    /**
     * Gets the text property value. The text in the message content that needs to be replaced.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getText() {
        return this.text;
    }
    /**
     * Gets the type property value. Always `file_citation`.
     * @return a MessageContentTextAnnotationsFileCitationObjectType
     */
    @jakarta.annotation.Nullable
    public MessageContentTextAnnotationsFileCitationObjectType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("end_index", this.getEndIndex());
        writer.writeObjectValue("file_citation", this.getFileCitation());
        writer.writeIntegerValue("start_index", this.getStartIndex());
        writer.writeStringValue("text", this.getText());
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
     * Sets the end_index property value. The end_index property
     * @param value Value to set for the end_index property.
     */
    public void setEndIndex(@jakarta.annotation.Nullable final Integer value) {
        this.endIndex = value;
    }
    /**
     * Sets the file_citation property value. The file_citation property
     * @param value Value to set for the file_citation property.
     */
    public void setFileCitation(@jakarta.annotation.Nullable final MessageContentTextAnnotationsFileCitationObjectFileCitation value) {
        this.fileCitation = value;
    }
    /**
     * Sets the start_index property value. The start_index property
     * @param value Value to set for the start_index property.
     */
    public void setStartIndex(@jakarta.annotation.Nullable final Integer value) {
        this.startIndex = value;
    }
    /**
     * Sets the text property value. The text in the message content that needs to be replaced.
     * @param value Value to set for the text property.
     */
    public void setText(@jakarta.annotation.Nullable final String value) {
        this.text = value;
    }
    /**
     * Sets the type property value. Always `file_citation`.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final MessageContentTextAnnotationsFileCitationObjectType value) {
        this.type = value;
    }
}
