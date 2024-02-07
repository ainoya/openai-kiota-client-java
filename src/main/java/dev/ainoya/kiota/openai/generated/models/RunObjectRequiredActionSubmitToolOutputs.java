package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Details on the tool outputs needed for this run to continue.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RunObjectRequiredActionSubmitToolOutputs implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * A list of the relevant tool calls.
     */
    private java.util.List<RunToolCallObject> toolCalls;
    /**
     * Instantiates a new RunObjectRequiredActionSubmitToolOutputs and sets the default values.
     */
    public RunObjectRequiredActionSubmitToolOutputs() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RunObjectRequiredActionSubmitToolOutputs
     */
    @jakarta.annotation.Nonnull
    public static RunObjectRequiredActionSubmitToolOutputs createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RunObjectRequiredActionSubmitToolOutputs();
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
        deserializerMap.put("tool_calls", (n) -> { this.setToolCalls(n.getCollectionOfObjectValues(RunToolCallObject::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tool_calls property value. A list of the relevant tool calls.
     * @return a java.util.List<RunToolCallObject>
     */
    @jakarta.annotation.Nullable
    public java.util.List<RunToolCallObject> getToolCalls() {
        return this.toolCalls;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("tool_calls", this.getToolCalls());
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
     * Sets the tool_calls property value. A list of the relevant tool calls.
     * @param value Value to set for the tool_calls property.
     */
    public void setToolCalls(@jakarta.annotation.Nullable final java.util.List<RunToolCallObject> value) {
        this.toolCalls = value;
    }
}
