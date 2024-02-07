package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Tool call objects
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunToolCallObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The function definition.
     */
    private RunToolCallObjectFunction function;
    /**
     * The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
     */
    private String id;
    /**
     * The type of tool call the output is required for. For now, this is always `function`.
     */
    private RunToolCallObjectType type;
    /**
     * Instantiates a new RunToolCallObject and sets the default values.
     */
    public RunToolCallObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunToolCallObject
     */
    @jakarta.annotation.Nonnull
    public static RunToolCallObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunToolCallObject();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("function", (n) -> { this.setFunction(n.getObjectValue(RunToolCallObjectFunction::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RunToolCallObjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the function property value. The function definition.
     * @return a RunToolCallObjectFunction
     */
    @jakarta.annotation.Nullable
    public RunToolCallObjectFunction getFunction() {
        return this.function;
    }
    /**
     * Gets the id property value. The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the type property value. The type of tool call the output is required for. For now, this is always `function`.
     * @return a RunToolCallObjectType
     */
    @jakarta.annotation.Nullable
    public RunToolCallObjectType getType() {
        return this.type;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("function", this.getFunction());
        writer.writeStringValue("id", this.getId());
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
     * Sets the function property value. The function definition.
     * @param value Value to set for the function property.
     */
    public void setFunction(@jakarta.annotation.Nullable final RunToolCallObjectFunction value) {
        this.function = value;
    }
    /**
     * Sets the id property value. The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the type property value. The type of tool call the output is required for. For now, this is always `function`.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RunToolCallObjectType value) {
        this.type = value;
    }
}
