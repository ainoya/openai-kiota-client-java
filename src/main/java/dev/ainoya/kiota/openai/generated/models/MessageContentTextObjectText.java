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
public class MessageContentTextObjectText implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The annotations property
     */
    private java.util.List<MessageContentTextObjectTextAnnotations> annotations;
    /**
     * The data that makes up the text.
     */
    private String value;
    /**
     * Instantiates a new MessageContentTextObjectText and sets the default values.
     */
    public MessageContentTextObjectText() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MessageContentTextObjectText
     */
    @jakarta.annotation.Nonnull
    public static MessageContentTextObjectText createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MessageContentTextObjectText();
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
     * Gets the annotations property value. The annotations property
     * @return a java.util.List<MessageContentTextObjectTextAnnotations>
     */
    @jakarta.annotation.Nullable
    public java.util.List<MessageContentTextObjectTextAnnotations> getAnnotations() {
        return this.annotations;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("annotations", (n) -> { this.setAnnotations(n.getCollectionOfObjectValues(MessageContentTextObjectTextAnnotations::createFromDiscriminatorValue)); });
        deserializerMap.put("value", (n) -> { this.setValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The data that makes up the text.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getValue() {
        return this.value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("annotations", this.getAnnotations());
        writer.writeStringValue("value", this.getValue());
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
     * Sets the annotations property value. The annotations property
     * @param value Value to set for the annotations property.
     */
    public void setAnnotations(@jakarta.annotation.Nullable final java.util.List<MessageContentTextObjectTextAnnotations> value) {
        this.annotations = value;
    }
    /**
     * Sets the value property value. The data that makes up the text.
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final String value) {
        this.value = value;
    }
    /**
     * Composed type wrapper for classes MessageContentTextAnnotationsFileCitationObject, MessageContentTextAnnotationsFilePathObject
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class MessageContentTextObjectTextAnnotations implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type MessageContentTextAnnotationsFileCitationObject
         */
        private MessageContentTextAnnotationsFileCitationObject messageContentTextAnnotationsFileCitationObject;
        /**
         * Composed type representation for type MessageContentTextAnnotationsFilePathObject
         */
        private MessageContentTextAnnotationsFilePathObject messageContentTextAnnotationsFilePathObject;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a MessageContentTextObjectTextAnnotations
         */
        @jakarta.annotation.Nonnull
        public static MessageContentTextObjectTextAnnotations createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final MessageContentTextObjectTextAnnotations result = new MessageContentTextObjectTextAnnotations();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            return result;
        }
        /**
         * The deserialization information for the current model
         * @return a Map<String, java.util.function.Consumer<ParseNode>>
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            if (this.getMessageContentTextAnnotationsFileCitationObject() != null) {
                return this.getMessageContentTextAnnotationsFileCitationObject().getFieldDeserializers();
            } else if (this.getMessageContentTextAnnotationsFilePathObject() != null) {
                return this.getMessageContentTextAnnotationsFilePathObject().getFieldDeserializers();
            }
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the MessageContentTextAnnotationsFileCitationObject property value. Composed type representation for type MessageContentTextAnnotationsFileCitationObject
         * @return a MessageContentTextAnnotationsFileCitationObject
         */
        @jakarta.annotation.Nullable
        public MessageContentTextAnnotationsFileCitationObject getMessageContentTextAnnotationsFileCitationObject() {
            return this.messageContentTextAnnotationsFileCitationObject;
        }
        /**
         * Gets the MessageContentTextAnnotationsFilePathObject property value. Composed type representation for type MessageContentTextAnnotationsFilePathObject
         * @return a MessageContentTextAnnotationsFilePathObject
         */
        @jakarta.annotation.Nullable
        public MessageContentTextAnnotationsFilePathObject getMessageContentTextAnnotationsFilePathObject() {
            return this.messageContentTextAnnotationsFilePathObject;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getMessageContentTextAnnotationsFileCitationObject() != null) {
                writer.writeObjectValue(null, this.getMessageContentTextAnnotationsFileCitationObject());
            } else if (this.getMessageContentTextAnnotationsFilePathObject() != null) {
                writer.writeObjectValue(null, this.getMessageContentTextAnnotationsFilePathObject());
            }
        }
        /**
         * Sets the MessageContentTextAnnotationsFileCitationObject property value. Composed type representation for type MessageContentTextAnnotationsFileCitationObject
         * @param value Value to set for the MessageContentTextAnnotationsFileCitationObject property.
         */
        public void setMessageContentTextAnnotationsFileCitationObject(@jakarta.annotation.Nullable final MessageContentTextAnnotationsFileCitationObject value) {
            this.messageContentTextAnnotationsFileCitationObject = value;
        }
        /**
         * Sets the MessageContentTextAnnotationsFilePathObject property value. Composed type representation for type MessageContentTextAnnotationsFilePathObject
         * @param value Value to set for the MessageContentTextAnnotationsFilePathObject property.
         */
        public void setMessageContentTextAnnotationsFilePathObject(@jakarta.annotation.Nullable final MessageContentTextAnnotationsFilePathObject value) {
            this.messageContentTextAnnotationsFilePathObject = value;
        }
    }
}
