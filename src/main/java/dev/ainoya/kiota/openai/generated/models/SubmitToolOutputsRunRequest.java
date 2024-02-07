package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SubmitToolOutputsRunRequest implements Parsable {
    /**
     * A list of tools for which the outputs are being submitted.
     */
    private java.util.List<SubmitToolOutputsRunRequestToolOutputs> toolOutputs;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SubmitToolOutputsRunRequest
     */
    @jakarta.annotation.Nonnull
    public static SubmitToolOutputsRunRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SubmitToolOutputsRunRequest();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("tool_outputs", (n) -> { this.setToolOutputs(n.getCollectionOfObjectValues(SubmitToolOutputsRunRequestToolOutputs::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the tool_outputs property value. A list of tools for which the outputs are being submitted.
     * @return a java.util.List<SubmitToolOutputsRunRequestToolOutputs>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SubmitToolOutputsRunRequestToolOutputs> getToolOutputs() {
        return this.toolOutputs;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("tool_outputs", this.getToolOutputs());
    }
    /**
     * Sets the tool_outputs property value. A list of tools for which the outputs are being submitted.
     * @param value Value to set for the tool_outputs property.
     */
    public void setToolOutputs(@jakarta.annotation.Nullable final java.util.List<SubmitToolOutputsRunRequestToolOutputs> value) {
        this.toolOutputs = value;
    }
}
