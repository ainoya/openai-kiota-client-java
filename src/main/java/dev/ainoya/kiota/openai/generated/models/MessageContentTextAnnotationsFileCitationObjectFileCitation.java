package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MessageContentTextAnnotationsFileCitationObjectFileCitation implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ID of the specific File the citation is from.
     */
    private String fileId;
    /**
     * The specific quote in the file.
     */
    private String quote;
    /**
     * Instantiates a new MessageContentTextAnnotationsFileCitationObjectFileCitation and sets the default values.
     */
    public MessageContentTextAnnotationsFileCitationObjectFileCitation() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageContentTextAnnotationsFileCitationObjectFileCitation
     */
    @jakarta.annotation.Nonnull
    public static MessageContentTextAnnotationsFileCitationObjectFileCitation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageContentTextAnnotationsFileCitationObjectFileCitation();
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
        deserializerMap.put("file_id", (n) -> { this.setFileId(n.getStringValue()); });
        deserializerMap.put("quote", (n) -> { this.setQuote(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the file_id property value. The ID of the specific File the citation is from.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFileId() {
        return this.fileId;
    }
    /**
     * Gets the quote property value. The specific quote in the file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getQuote() {
        return this.quote;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("file_id", this.getFileId());
        writer.writeStringValue("quote", this.getQuote());
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
     * Sets the file_id property value. The ID of the specific File the citation is from.
     * @param value Value to set for the file_id property.
     */
    public void setFileId(@jakarta.annotation.Nullable final String value) {
        this.fileId = value;
    }
    /**
     * Sets the quote property value. The specific quote in the file.
     * @param value Value to set for the quote property.
     */
    public void setQuote(@jakarta.annotation.Nullable final String value) {
        this.quote = value;
    }
}
