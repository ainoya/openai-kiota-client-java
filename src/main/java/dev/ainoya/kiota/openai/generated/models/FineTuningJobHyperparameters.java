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
 * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FineTuningJobHyperparameters implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset."auto" decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs.
     */
    private FineTuningJobHyperparametersNEpochs nEpochs;
    /**
     * Instantiates a new FineTuningJobHyperparameters and sets the default values.
     */
    public FineTuningJobHyperparameters() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a FineTuningJobHyperparameters
     */
    @jakarta.annotation.Nonnull
    public static FineTuningJobHyperparameters createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FineTuningJobHyperparameters();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("n_epochs", (n) -> { this.setNEpochs(n.getObjectValue(FineTuningJobHyperparametersNEpochs::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the n_epochs property value. The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset."auto" decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs.
     * @return a FineTuningJobHyperparametersNEpochs
     */
    @jakarta.annotation.Nullable
    public FineTuningJobHyperparametersNEpochs getNEpochs() {
        return this.nEpochs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
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
     * Sets the n_epochs property value. The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset."auto" decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs.
     * @param value Value to set for the n_epochs property.
     */
    public void setNEpochs(@jakarta.annotation.Nullable final FineTuningJobHyperparametersNEpochs value) {
        this.nEpochs = value;
    }
    /**
     * Composed type wrapper for classes integer, string
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class FineTuningJobHyperparametersNEpochs implements ComposedTypeWrapper, Parsable {
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
         * @return a FineTuningJobHyperparametersNEpochs
         */
        @jakarta.annotation.Nonnull
        public static FineTuningJobHyperparametersNEpochs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final FineTuningJobHyperparametersNEpochs result = new FineTuningJobHyperparametersNEpochs();
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
