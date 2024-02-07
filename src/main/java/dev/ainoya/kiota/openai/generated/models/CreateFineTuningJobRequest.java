package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateFineTuningJobRequest implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The hyperparameters used for the fine-tuning job.
     */
    private CreateFineTuningJobRequestHyperparameters hyperparameters;
    /**
     * The name of the model to fine-tune. You can select one of the[supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned).
     */
    private CreateFineTuningJobRequestModel model;
    /**
     * A string of up to 18 characters that will be added to your fine-tuned model name.For example, a `suffix` of "custom-model-name" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.
     */
    private String suffix;
    /**
     * The ID of an uploaded file that contains training data.See [upload file](/docs/api-reference/files/upload) for how to upload a file.Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     */
    private String trainingFile;
    /**
     * The ID of an uploaded file that contains validation data.If you provide this file, the data is used to generate validationmetrics periodically during fine-tuning. These metrics can be viewed inthe fine-tuning results file.The same data should not be present in both train and validation files.Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     */
    private String validationFile;
    /**
     * Instantiates a new CreateFineTuningJobRequest and sets the default values.
     */
    public CreateFineTuningJobRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateFineTuningJobRequest
     */
    @jakarta.annotation.Nonnull
    public static CreateFineTuningJobRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateFineTuningJobRequest();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("hyperparameters", (n) -> { this.setHyperparameters(n.getObjectValue(CreateFineTuningJobRequestHyperparameters::createFromDiscriminatorValue)); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getObjectValue(CreateFineTuningJobRequestModel::createFromDiscriminatorValue)); });
        deserializerMap.put("suffix", (n) -> { this.setSuffix(n.getStringValue()); });
        deserializerMap.put("training_file", (n) -> { this.setTrainingFile(n.getStringValue()); });
        deserializerMap.put("validation_file", (n) -> { this.setValidationFile(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hyperparameters property value. The hyperparameters used for the fine-tuning job.
     * @return a CreateFineTuningJobRequestHyperparameters
     */
    @jakarta.annotation.Nullable
    public CreateFineTuningJobRequestHyperparameters getHyperparameters() {
        return this.hyperparameters;
    }
    /**
     * Gets the model property value. The name of the model to fine-tune. You can select one of the[supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned).
     * @return a CreateFineTuningJobRequestModel
     */
    @jakarta.annotation.Nullable
    public CreateFineTuningJobRequestModel getModel() {
        return this.model;
    }
    /**
     * Gets the suffix property value. A string of up to 18 characters that will be added to your fine-tuned model name.For example, a `suffix` of "custom-model-name" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSuffix() {
        return this.suffix;
    }
    /**
     * Gets the training_file property value. The ID of an uploaded file that contains training data.See [upload file](/docs/api-reference/files/upload) for how to upload a file.Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTrainingFile() {
        return this.trainingFile;
    }
    /**
     * Gets the validation_file property value. The ID of an uploaded file that contains validation data.If you provide this file, the data is used to generate validationmetrics periodically during fine-tuning. These metrics can be viewed inthe fine-tuning results file.The same data should not be present in both train and validation files.Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
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
        writer.writeObjectValue("hyperparameters", this.getHyperparameters());
        writer.writeObjectValue("model", this.getModel());
        writer.writeStringValue("suffix", this.getSuffix());
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
     * Sets the hyperparameters property value. The hyperparameters used for the fine-tuning job.
     * @param value Value to set for the hyperparameters property.
     */
    public void setHyperparameters(@jakarta.annotation.Nullable final CreateFineTuningJobRequestHyperparameters value) {
        this.hyperparameters = value;
    }
    /**
     * Sets the model property value. The name of the model to fine-tune. You can select one of the[supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned).
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final CreateFineTuningJobRequestModel value) {
        this.model = value;
    }
    /**
     * Sets the suffix property value. A string of up to 18 characters that will be added to your fine-tuned model name.For example, a `suffix` of "custom-model-name" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.
     * @param value Value to set for the suffix property.
     */
    public void setSuffix(@jakarta.annotation.Nullable final String value) {
        this.suffix = value;
    }
    /**
     * Sets the training_file property value. The ID of an uploaded file that contains training data.See [upload file](/docs/api-reference/files/upload) for how to upload a file.Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     * @param value Value to set for the training_file property.
     */
    public void setTrainingFile(@jakarta.annotation.Nullable final String value) {
        this.trainingFile = value;
    }
    /**
     * Sets the validation_file property value. The ID of an uploaded file that contains validation data.If you provide this file, the data is used to generate validationmetrics periodically during fine-tuning. These metrics can be viewed inthe fine-tuning results file.The same data should not be present in both train and validation files.Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     * @param value Value to set for the validation_file property.
     */
    public void setValidationFile(@jakarta.annotation.Nullable final String value) {
        this.validationFile = value;
    }
    /**
     * Composed type wrapper for classes string
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class CreateFineTuningJobRequestModel implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type string
         */
        private String string;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a CreateFineTuningJobRequestModel
         */
        @jakarta.annotation.Nonnull
        public static CreateFineTuningJobRequestModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final CreateFineTuningJobRequestModel result = new CreateFineTuningJobRequestModel();
            if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * The deserialization information for the current model
         * @return a Map<String, java.util.function.Consumer<ParseNode>>
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the string property value. Composed type representation for type string
         * @return a String
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.string;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the string property value. Composed type representation for type string
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.string = value;
        }
    }
}
