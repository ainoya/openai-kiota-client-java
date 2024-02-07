package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The hyperparameters used for the fine-tuning job.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateFineTuningJobRequestHyperparameters implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Number of examples in each batch. A larger batch size means that model parametersare updated less frequently, but with lower variance.
     */
    private CreateFineTuningJobRequestHyperparametersBatchSize batchSize;
    /**
     * Scaling factor for the learning rate. A smaller learning rate may be useful to avoidoverfitting.
     */
    private CreateFineTuningJobRequestHyperparametersLearningRateMultiplier learningRateMultiplier;
    /**
     * The number of epochs to train the model for. An epoch refers to one full cyclethrough the training dataset.
     */
    private CreateFineTuningJobRequestHyperparametersNEpochs nEpochs;
    /**
     * Instantiates a new CreateFineTuningJobRequestHyperparameters and sets the default values.
     */
    public CreateFineTuningJobRequestHyperparameters() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateFineTuningJobRequestHyperparameters
     */
    @jakarta.annotation.Nonnull
    public static CreateFineTuningJobRequestHyperparameters createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateFineTuningJobRequestHyperparameters();
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
     * Gets the batch_size property value. Number of examples in each batch. A larger batch size means that model parametersare updated less frequently, but with lower variance.
     * @return a CreateFineTuningJobRequestHyperparametersBatchSize
     */
    @jakarta.annotation.Nullable
    public CreateFineTuningJobRequestHyperparametersBatchSize getBatchSize() {
        return this.batchSize;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("batch_size", (n) -> { this.setBatchSize(n.getObjectValue(CreateFineTuningJobRequestHyperparametersBatchSize::createFromDiscriminatorValue)); });
        deserializerMap.put("learning_rate_multiplier", (n) -> { this.setLearningRateMultiplier(n.getObjectValue(CreateFineTuningJobRequestHyperparametersLearningRateMultiplier::createFromDiscriminatorValue)); });
        deserializerMap.put("n_epochs", (n) -> { this.setNEpochs(n.getObjectValue(CreateFineTuningJobRequestHyperparametersNEpochs::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the learning_rate_multiplier property value. Scaling factor for the learning rate. A smaller learning rate may be useful to avoidoverfitting.
     * @return a CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
     */
    @jakarta.annotation.Nullable
    public CreateFineTuningJobRequestHyperparametersLearningRateMultiplier getLearningRateMultiplier() {
        return this.learningRateMultiplier;
    }
    /**
     * Gets the n_epochs property value. The number of epochs to train the model for. An epoch refers to one full cyclethrough the training dataset.
     * @return a CreateFineTuningJobRequestHyperparametersNEpochs
     */
    @jakarta.annotation.Nullable
    public CreateFineTuningJobRequestHyperparametersNEpochs getNEpochs() {
        return this.nEpochs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("batch_size", this.getBatchSize());
        writer.writeObjectValue("learning_rate_multiplier", this.getLearningRateMultiplier());
        writer.writeObjectValue("n_epochs", this.getNEpochs());
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
     * Sets the batch_size property value. Number of examples in each batch. A larger batch size means that model parametersare updated less frequently, but with lower variance.
     * @param value Value to set for the batch_size property.
     */
    public void setBatchSize(@jakarta.annotation.Nullable final CreateFineTuningJobRequestHyperparametersBatchSize value) {
        this.batchSize = value;
    }
    /**
     * Sets the learning_rate_multiplier property value. Scaling factor for the learning rate. A smaller learning rate may be useful to avoidoverfitting.
     * @param value Value to set for the learning_rate_multiplier property.
     */
    public void setLearningRateMultiplier(@jakarta.annotation.Nullable final CreateFineTuningJobRequestHyperparametersLearningRateMultiplier value) {
        this.learningRateMultiplier = value;
    }
    /**
     * Sets the n_epochs property value. The number of epochs to train the model for. An epoch refers to one full cyclethrough the training dataset.
     * @param value Value to set for the n_epochs property.
     */
    public void setNEpochs(@jakarta.annotation.Nullable final CreateFineTuningJobRequestHyperparametersNEpochs value) {
        this.nEpochs = value;
    }
    /**
     * Composed type wrapper for classes integer, string
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class CreateFineTuningJobRequestHyperparametersBatchSize implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type integer
         */
        private Integer integer;
        /**
         * Composed type representation for type string
         */
        private String string;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a CreateFineTuningJobRequestHyperparametersBatchSize
         */
        @jakarta.annotation.Nonnull
        public static CreateFineTuningJobRequestHyperparametersBatchSize createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final CreateFineTuningJobRequestHyperparametersBatchSize result = new CreateFineTuningJobRequestHyperparametersBatchSize();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getIntegerValue() != null) {
                result.setInteger(parseNode.getIntegerValue());
            } else if (parseNode.getStringValue() != null) {
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
         * Gets the integer property value. Composed type representation for type integer
         * @return a Integer
         */
        @jakarta.annotation.Nullable
        public Integer getInteger() {
            return this.integer;
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
            if (this.getInteger() != null) {
                writer.writeIntegerValue(null, this.getInteger());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the integer property value. Composed type representation for type integer
         * @param value Value to set for the integer property.
         */
        public void setInteger(@jakarta.annotation.Nullable final Integer value) {
            this.integer = value;
        }
        /**
         * Sets the string property value. Composed type representation for type string
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.string = value;
        }
    }
    /**
     * Composed type wrapper for classes double, string
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class CreateFineTuningJobRequestHyperparametersLearningRateMultiplier implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type double
         */
        private Double doubleEscaped;
        /**
         * Composed type representation for type string
         */
        private String string;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
         */
        @jakarta.annotation.Nonnull
        public static CreateFineTuningJobRequestHyperparametersLearningRateMultiplier createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final CreateFineTuningJobRequestHyperparametersLearningRateMultiplier result = new CreateFineTuningJobRequestHyperparametersLearningRateMultiplier();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the double property value. Composed type representation for type double
         * @return a Double
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.doubleEscaped;
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
            if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the double property value. Composed type representation for type double
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.doubleEscaped = value;
        }
        /**
         * Sets the string property value. Composed type representation for type string
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.string = value;
        }
    }
    /**
     * Composed type wrapper for classes integer, string
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class CreateFineTuningJobRequestHyperparametersNEpochs implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type integer
         */
        private Integer integer;
        /**
         * Composed type representation for type string
         */
        private String string;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a CreateFineTuningJobRequestHyperparametersNEpochs
         */
        @jakarta.annotation.Nonnull
        public static CreateFineTuningJobRequestHyperparametersNEpochs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final CreateFineTuningJobRequestHyperparametersNEpochs result = new CreateFineTuningJobRequestHyperparametersNEpochs();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getIntegerValue() != null) {
                result.setInteger(parseNode.getIntegerValue());
            } else if (parseNode.getStringValue() != null) {
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
         * Gets the integer property value. Composed type representation for type integer
         * @return a Integer
         */
        @jakarta.annotation.Nullable
        public Integer getInteger() {
            return this.integer;
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
            if (this.getInteger() != null) {
                writer.writeIntegerValue(null, this.getInteger());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the integer property value. Composed type representation for type integer
         * @param value Value to set for the integer property.
         */
        public void setInteger(@jakarta.annotation.Nullable final Integer value) {
            this.integer = value;
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
