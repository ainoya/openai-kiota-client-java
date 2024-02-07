package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FineTuningJob implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was created.
     */
    private Integer createdAt;
    /**
     * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
     */
    private FineTuningJobError error;
    /**
     * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     */
    private String fineTunedModel;
    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     */
    private Integer finishedAt;
    /**
     * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     */
    private FineTuningJobHyperparameters hyperparameters;
    /**
     * The object identifier, which can be referenced in the API endpoints.
     */
    private String id;
    /**
     * The base model that is being fine-tuned.
     */
    private String model;
    /**
     * The object type, which is always "fine_tuning.job".
     */
    private FineTuningJobObject object;
    /**
     * The organization that owns the fine-tuning job.
     */
    private String organizationId;
    /**
     * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     */
    private java.util.List<String> resultFiles;
    /**
     * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     */
    private FineTuningJobStatus status;
    /**
     * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     */
    private Integer trainedTokens;
    /**
     * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     */
    private String trainingFile;
    /**
     * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     */
    private String validationFile;
    /**
     * Instantiates a new FineTuningJob and sets the default values.
     */
    public FineTuningJob() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FineTuningJob
     */
    @jakarta.annotation.Nonnull
    public static FineTuningJob createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FineTuningJob();
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
     * Gets the created_at property value. The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the error property value. For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
     * @return a FineTuningJobError
     */
    @jakarta.annotation.Nullable
    public FineTuningJobError getError() {
        return this.error;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(14);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getIntegerValue()); });
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(FineTuningJobError::createFromDiscriminatorValue)); });
        deserializerMap.put("fine_tuned_model", (n) -> { this.setFineTunedModel(n.getStringValue()); });
        deserializerMap.put("finished_at", (n) -> { this.setFinishedAt(n.getIntegerValue()); });
        deserializerMap.put("hyperparameters", (n) -> { this.setHyperparameters(n.getObjectValue(FineTuningJobHyperparameters::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(FineTuningJobObject::forValue)); });
        deserializerMap.put("organization_id", (n) -> { this.setOrganizationId(n.getStringValue()); });
        deserializerMap.put("result_files", (n) -> { this.setResultFiles(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(FineTuningJobStatus::forValue)); });
        deserializerMap.put("trained_tokens", (n) -> { this.setTrainedTokens(n.getIntegerValue()); });
        deserializerMap.put("training_file", (n) -> { this.setTrainingFile(n.getStringValue()); });
        deserializerMap.put("validation_file", (n) -> { this.setValidationFile(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the fine_tuned_model property value. The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFineTunedModel() {
        return this.fineTunedModel;
    }
    /**
     * Gets the finished_at property value. The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getFinishedAt() {
        return this.finishedAt;
    }
    /**
     * Gets the hyperparameters property value. The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     * @return a FineTuningJobHyperparameters
     */
    @jakarta.annotation.Nullable
    public FineTuningJobHyperparameters getHyperparameters() {
        return this.hyperparameters;
    }
    /**
     * Gets the id property value. The object identifier, which can be referenced in the API endpoints.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the model property value. The base model that is being fine-tuned.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getModel() {
        return this.model;
    }
    /**
     * Gets the object property value. The object type, which is always "fine_tuning.job".
     * @return a FineTuningJobObject
     */
    @jakarta.annotation.Nullable
    public FineTuningJobObject getObject() {
        return this.object;
    }
    /**
     * Gets the organization_id property value. The organization that owns the fine-tuning job.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOrganizationId() {
        return this.organizationId;
    }
    /**
     * Gets the result_files property value. The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getResultFiles() {
        return this.resultFiles;
    }
    /**
     * Gets the status property value. The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     * @return a FineTuningJobStatus
     */
    @jakarta.annotation.Nullable
    public FineTuningJobStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the trained_tokens property value. The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTrainedTokens() {
        return this.trainedTokens;
    }
    /**
     * Gets the training_file property value. The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTrainingFile() {
        return this.trainingFile;
    }
    /**
     * Gets the validation_file property value. The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValidationFile() {
        return this.validationFile;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("created_at", this.getCreatedAt());
        writer.writeObjectValue("error", this.getError());
        writer.writeStringValue("fine_tuned_model", this.getFineTunedModel());
        writer.writeIntegerValue("finished_at", this.getFinishedAt());
        writer.writeObjectValue("hyperparameters", this.getHyperparameters());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("model", this.getModel());
        writer.writeEnumValue("object", this.getObject());
        writer.writeStringValue("organization_id", this.getOrganizationId());
        writer.writeCollectionOfPrimitiveValues("result_files", this.getResultFiles());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeIntegerValue("trained_tokens", this.getTrainedTokens());
        writer.writeStringValue("training_file", this.getTrainingFile());
        writer.writeStringValue("validation_file", this.getValidationFile());
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
     * Sets the created_at property value. The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Integer value) {
        this.createdAt = value;
    }
    /**
     * Sets the error property value. For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final FineTuningJobError value) {
        this.error = value;
    }
    /**
     * Sets the fine_tuned_model property value. The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     * @param value Value to set for the fine_tuned_model property.
     */
    public void setFineTunedModel(@jakarta.annotation.Nullable final String value) {
        this.fineTunedModel = value;
    }
    /**
     * Sets the finished_at property value. The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     * @param value Value to set for the finished_at property.
     */
    public void setFinishedAt(@jakarta.annotation.Nullable final Integer value) {
        this.finishedAt = value;
    }
    /**
     * Sets the hyperparameters property value. The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     * @param value Value to set for the hyperparameters property.
     */
    public void setHyperparameters(@jakarta.annotation.Nullable final FineTuningJobHyperparameters value) {
        this.hyperparameters = value;
    }
    /**
     * Sets the id property value. The object identifier, which can be referenced in the API endpoints.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the model property value. The base model that is being fine-tuned.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final String value) {
        this.model = value;
    }
    /**
     * Sets the object property value. The object type, which is always "fine_tuning.job".
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final FineTuningJobObject value) {
        this.object = value;
    }
    /**
     * Sets the organization_id property value. The organization that owns the fine-tuning job.
     * @param value Value to set for the organization_id property.
     */
    public void setOrganizationId(@jakarta.annotation.Nullable final String value) {
        this.organizationId = value;
    }
    /**
     * Sets the result_files property value. The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @param value Value to set for the result_files property.
     */
    public void setResultFiles(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.resultFiles = value;
    }
    /**
     * Sets the status property value. The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final FineTuningJobStatus value) {
        this.status = value;
    }
    /**
     * Sets the trained_tokens property value. The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     * @param value Value to set for the trained_tokens property.
     */
    public void setTrainedTokens(@jakarta.annotation.Nullable final Integer value) {
        this.trainedTokens = value;
    }
    /**
     * Sets the training_file property value. The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @param value Value to set for the training_file property.
     */
    public void setTrainingFile(@jakarta.annotation.Nullable final String value) {
        this.trainingFile = value;
    }
    /**
     * Sets the validation_file property value. The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @param value Value to set for the validation_file property.
     */
    public void setValidationFile(@jakarta.annotation.Nullable final String value) {
        this.validationFile = value;
    }
}
