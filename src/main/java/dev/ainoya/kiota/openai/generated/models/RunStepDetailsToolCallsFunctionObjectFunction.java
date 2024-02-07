package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The definition of the function that was called.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunStepDetailsToolCallsFunctionObjectFunction implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The arguments passed to the function.
     */
    private String arguments;
    /**
     * The name of the function.
     */
    private String name;
    /**
     * The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
     */
    private String output;
    /**
     * Instantiates a new RunStepDetailsToolCallsFunctionObjectFunction and sets the default values.
     */
    public RunStepDetailsToolCallsFunctionObjectFunction() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunStepDetailsToolCallsFunctionObjectFunction
     */
    @jakarta.annotation.Nonnull
    public static RunStepDetailsToolCallsFunctionObjectFunction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunStepDetailsToolCallsFunctionObjectFunction();
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
     * Gets the arguments property value. The arguments passed to the function.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getArguments() {
        return this.arguments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("arguments", (n) -> { this.setArguments(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("output", (n) -> { this.setOutput(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the name property value. The name of the function.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the output property value. The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOutput() {
        return this.output;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("arguments", this.getArguments());
        writer.writeStringValue("name", this.getName());
        writer.writeStringValue("output", this.getOutput());
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
     * Sets the arguments property value. The arguments passed to the function.
     * @param value Value to set for the arguments property.
     */
    public void setArguments(@jakarta.annotation.Nullable final String value) {
        this.arguments = value;
    }
    /**
     * Sets the name property value. The name of the function.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the output property value. The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
     * @param value Value to set for the output property.
     */
    public void setOutput(@jakarta.annotation.Nullable final String value) {
        this.output = value;
    }
}
