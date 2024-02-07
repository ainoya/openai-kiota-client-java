package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The `File` object represents a document that has been uploaded to OpenAI.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OpenAIFile implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The size of the file, in bytes.
     */
    private Integer bytes;
    /**
     * The Unix timestamp (in seconds) for when the file was created.
     */
    private Integer createdAt;
    /**
     * The name of the file.
     */
    private String filename;
    /**
     * The file identifier, which can be referenced in the API endpoints.
     */
    private String id;
    /**
     * The object type, which is always `file`.
     */
    private OpenAIFileObject object;
    /**
     * The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
     */
    private OpenAIFilePurpose purpose;
    /**
     * Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
     * @deprecated
     * 
     */
    @Deprecated
    private OpenAIFileStatus status;
    /**
     * Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
     * @deprecated
     * 
     */
    @Deprecated
    private String statusDetails;
    /**
     * Instantiates a new OpenAIFile and sets the default values.
     */
    public OpenAIFile() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OpenAIFile
     */
    @jakarta.annotation.Nonnull
    public static OpenAIFile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OpenAIFile();
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
     * Gets the bytes property value. The size of the file, in bytes.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getBytes() {
        return this.bytes;
    }
    /**
     * Gets the created_at property value. The Unix timestamp (in seconds) for when the file was created.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("bytes", (n) -> { this.setBytes(n.getIntegerValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getIntegerValue()); });
        deserializerMap.put("filename", (n) -> { this.setFilename(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(OpenAIFileObject::forValue)); });
        deserializerMap.put("purpose", (n) -> { this.setPurpose(n.getEnumValue(OpenAIFilePurpose::forValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(OpenAIFileStatus::forValue)); });
        deserializerMap.put("status_details", (n) -> { this.setStatusDetails(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the filename property value. The name of the file.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFilename() {
        return this.filename;
    }
    /**
     * Gets the id property value. The file identifier, which can be referenced in the API endpoints.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the object property value. The object type, which is always `file`.
     * @return a OpenAIFileObject
     */
    @jakarta.annotation.Nullable
    public OpenAIFileObject getObject() {
        return this.object;
    }
    /**
     * Gets the purpose property value. The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
     * @return a OpenAIFilePurpose
     */
    @jakarta.annotation.Nullable
    public OpenAIFilePurpose getPurpose() {
        return this.purpose;
    }
    /**
     * Gets the status property value. Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
     * @return a OpenAIFileStatus
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public OpenAIFileStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the status_details property value. Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
     * @return a String
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public String getStatusDetails() {
        return this.statusDetails;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("bytes", this.getBytes());
        writer.writeIntegerValue("created_at", this.getCreatedAt());
        writer.writeStringValue("filename", this.getFilename());
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("object", this.getObject());
        writer.writeEnumValue("purpose", this.getPurpose());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeStringValue("status_details", this.getStatusDetails());
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
     * Sets the bytes property value. The size of the file, in bytes.
     * @param value Value to set for the bytes property.
     */
    public void setBytes(@jakarta.annotation.Nullable final Integer value) {
        this.bytes = value;
    }
    /**
     * Sets the created_at property value. The Unix timestamp (in seconds) for when the file was created.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Integer value) {
        this.createdAt = value;
    }
    /**
     * Sets the filename property value. The name of the file.
     * @param value Value to set for the filename property.
     */
    public void setFilename(@jakarta.annotation.Nullable final String value) {
        this.filename = value;
    }
    /**
     * Sets the id property value. The file identifier, which can be referenced in the API endpoints.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the object property value. The object type, which is always `file`.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final OpenAIFileObject value) {
        this.object = value;
    }
    /**
     * Sets the purpose property value. The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
     * @param value Value to set for the purpose property.
     */
    public void setPurpose(@jakarta.annotation.Nullable final OpenAIFilePurpose value) {
        this.purpose = value;
    }
    /**
     * Sets the status property value. Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
     * @param value Value to set for the status property.
     * @deprecated
     * 
     */
    @Deprecated
    public void setStatus(@jakarta.annotation.Nullable final OpenAIFileStatus value) {
        this.status = value;
    }
    /**
     * Sets the status_details property value. Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
     * @param value Value to set for the status_details property.
     * @deprecated
     * 
     */
    @Deprecated
    public void setStatusDetails(@jakarta.annotation.Nullable final String value) {
        this.statusDetails = value;
    }
}
