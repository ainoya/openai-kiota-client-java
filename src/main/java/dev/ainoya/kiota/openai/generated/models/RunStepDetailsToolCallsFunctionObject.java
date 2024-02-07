package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunStepDetailsToolCallsFunctionObject implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The definition of the function that was called.
     */
    private RunStepDetailsToolCallsFunctionObjectFunction function;
    /**
     * The ID of the tool call object.
     */
    private String id;
    /**
     * The type of tool call. This is always going to be `function` for this type of tool call.
     */
    private RunStepDetailsToolCallsFunctionObjectType type;
    /**
     * Instantiates a new RunStepDetailsToolCallsFunctionObject and sets the default values.
     */
    public RunStepDetailsToolCallsFunctionObject() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunStepDetailsToolCallsFunctionObject
     */
    @jakarta.annotation.Nonnull
    public static RunStepDetailsToolCallsFunctionObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunStepDetailsToolCallsFunctionObject();
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
        deserializerMap.put("function", (n) -> { this.setFunction(n.getObjectValue(RunStepDetailsToolCallsFunctionObjectFunction::createFromDiscriminatorValue)); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getEnumValue(RunStepDetailsToolCallsFunctionObjectType::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the function property value. The definition of the function that was called.
     * @return a RunStepDetailsToolCallsFunctionObjectFunction
     */
    @jakarta.annotation.Nullable
    public RunStepDetailsToolCallsFunctionObjectFunction getFunction() {
        return this.function;
    }
    /**
     * Gets the id property value. The ID of the tool call object.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the type property value. The type of tool call. This is always going to be `function` for this type of tool call.
     * @return a RunStepDetailsToolCallsFunctionObjectType
     */
    @jakarta.annotation.Nullable
    public RunStepDetailsToolCallsFunctionObjectType getType() {
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
     * Sets the function property value. The definition of the function that was called.
     * @param value Value to set for the function property.
     */
    public void setFunction(@jakarta.annotation.Nullable final RunStepDetailsToolCallsFunctionObjectFunction value) {
        this.function = value;
    }
    /**
     * Sets the id property value. The ID of the tool call object.
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the type property value. The type of tool call. This is always going to be `function` for this type of tool call.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final RunStepDetailsToolCallsFunctionObjectType value) {
        this.type = value;
    }
}