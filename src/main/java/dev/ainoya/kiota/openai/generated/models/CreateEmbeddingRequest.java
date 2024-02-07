package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CreateEmbeddingRequest implements Parsable {
    /**
     * The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.
     */
    private Integer dimensions;
    /**
     * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
     */
    private CreateEmbeddingRequestEncodingFormat encodingFormat;
    /**
     * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens.
     */
    private CreateEmbeddingRequestInput input;
    /**
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
     */
    private CreateEmbeddingRequestModel model;
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     */
    private String user;
    /**
     * Instantiates a new CreateEmbeddingRequest and sets the default values.
     */
    public CreateEmbeddingRequest() {
        this.setEncodingFormat(CreateEmbeddingRequestEncodingFormat.forValue("float"));
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CreateEmbeddingRequest
     */
    @jakarta.annotation.Nonnull
    public static CreateEmbeddingRequest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CreateEmbeddingRequest();
    }
    /**
     * Gets the dimensions property value. The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDimensions() {
        return this.dimensions;
    }
    /**
     * Gets the encoding_format property value. The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
     * @return a CreateEmbeddingRequestEncodingFormat
     */
    @jakarta.annotation.Nullable
    public CreateEmbeddingRequestEncodingFormat getEncodingFormat() {
        return this.encodingFormat;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("dimensions", (n) -> { this.setDimensions(n.getIntegerValue()); });
        deserializerMap.put("encoding_format", (n) -> { this.setEncodingFormat(n.getEnumValue(CreateEmbeddingRequestEncodingFormat::forValue)); });
        deserializerMap.put("input", (n) -> { this.setInput(n.getObjectValue(CreateEmbeddingRequestInput::createFromDiscriminatorValue)); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getObjectValue(CreateEmbeddingRequestModel::createFromDiscriminatorValue)); });
        deserializerMap.put("user", (n) -> { this.setUser(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the input property value. Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens.
     * @return a CreateEmbeddingRequestInput
     */
    @jakarta.annotation.Nullable
    public CreateEmbeddingRequestInput getInput() {
        return this.input;
    }
    /**
     * Gets the model property value. ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
     * @return a CreateEmbeddingRequestModel
     */
    @jakarta.annotation.Nullable
    public CreateEmbeddingRequestModel getModel() {
        return this.model;
    }
    /**
     * Gets the user property value. A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUser() {
        return this.user;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("dimensions", this.getDimensions());
        writer.writeEnumValue("encoding_format", this.getEncodingFormat());
        writer.writeObjectValue("input", this.getInput());
        writer.writeObjectValue("model", this.getModel());
        writer.writeStringValue("user", this.getUser());
    }
    /**
     * Sets the dimensions property value. The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.
     * @param value Value to set for the dimensions property.
     */
    public void setDimensions(@jakarta.annotation.Nullable final Integer value) {
        this.dimensions = value;
    }
    /**
     * Sets the encoding_format property value. The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
     * @param value Value to set for the encoding_format property.
     */
    public void setEncodingFormat(@jakarta.annotation.Nullable final CreateEmbeddingRequestEncodingFormat value) {
        this.encodingFormat = value;
    }
    /**
     * Sets the input property value. Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens.
     * @param value Value to set for the input property.
     */
    public void setInput(@jakarta.annotation.Nullable final CreateEmbeddingRequestInput value) {
        this.input = value;
    }
    /**
     * Sets the model property value. ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
     * @param value Value to set for the model property.
     */
    public void setModel(@jakarta.annotation.Nullable final CreateEmbeddingRequestModel value) {
        this.model = value;
    }
    /**
     * Sets the user property value. A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * @param value Value to set for the user property.
     */
    public void setUser(@jakarta.annotation.Nullable final String value) {
        this.user = value;
    }
    /**
     * Composed type wrapper for classes CreateEmbeddingRequest_inputMember1, integer, string, stringCreateEmbeddingRequestInput
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class CreateEmbeddingRequestInput implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type CreateEmbeddingRequest_inputMember1
         */
        private java.util.List<CreateEmbeddingRequestInputMember1> createEmbeddingRequestInputMember1;
        /**
         * Composed type representation for type integer
         */
        private Integer integer;
        /**
         * Composed type representation for type string
         */
        private String string;
        /**
         * Composed type representation for type stringCreateEmbeddingRequestInput
         */
        private StringCreateEmbeddingRequestInput stringCreateEmbeddingRequestInput;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a CreateEmbeddingRequestInput
         */
        @jakarta.annotation.Nonnull
        public static CreateEmbeddingRequestInput createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final CreateEmbeddingRequestInput result = new CreateEmbeddingRequestInput();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getIntegerValue() != null) {
                result.setInteger(parseNode.getIntegerValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            } else if (parseNode.getCollectionOfObjectValues(CreateEmbeddingRequestInputMember1::createFromDiscriminatorValue) != null) {
                result.setCreateEmbeddingRequestInputMember1(parseNode.getCollectionOfObjectValues(CreateEmbeddingRequestInputMember1::createFromDiscriminatorValue));
            }
            return result;
        }
        /**
         * Gets the CreateEmbeddingRequest_inputMember1 property value. Composed type representation for type CreateEmbeddingRequest_inputMember1
         * @return a java.util.List<CreateEmbeddingRequestInputMember1>
         */
        @jakarta.annotation.Nullable
        public java.util.List<CreateEmbeddingRequestInputMember1> getCreateEmbeddingRequestInputMember1() {
            return this.createEmbeddingRequestInputMember1;
        }
        /**
         * The deserialization information for the current model
         * @return a Map<String, java.util.function.Consumer<ParseNode>>
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            if (this.getStringCreateEmbeddingRequestInput() != null) {
                return this.getStringCreateEmbeddingRequestInput().getFieldDeserializers();
            }
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
         * Gets the stringCreateEmbeddingRequestInput property value. Composed type representation for type stringCreateEmbeddingRequestInput
         * @return a StringCreateEmbeddingRequestInput
         */
        @jakarta.annotation.Nullable
        public StringCreateEmbeddingRequestInput getStringCreateEmbeddingRequestInput() {
            return this.stringCreateEmbeddingRequestInput;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getStringCreateEmbeddingRequestInput() != null) {
                writer.writeObjectValue(null, this.getStringCreateEmbeddingRequestInput());
            } else if (this.getInteger() != null) {
                writer.writeIntegerValue(null, this.getInteger());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            } else if (this.getCreateEmbeddingRequestInputMember1() != null) {
                writer.writeCollectionOfObjectValues(null, this.getCreateEmbeddingRequestInputMember1());
            }
        }
        /**
         * Sets the CreateEmbeddingRequest_inputMember1 property value. Composed type representation for type CreateEmbeddingRequest_inputMember1
         * @param value Value to set for the CreateEmbeddingRequest_inputMember1 property.
         */
        public void setCreateEmbeddingRequestInputMember1(@jakarta.annotation.Nullable final java.util.List<CreateEmbeddingRequestInputMember1> value) {
            this.createEmbeddingRequestInputMember1 = value;
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
        /**
         * Sets the stringCreateEmbeddingRequestInput property value. Composed type representation for type stringCreateEmbeddingRequestInput
         * @param value Value to set for the stringCreateEmbeddingRequestInput property.
         */
        public void setStringCreateEmbeddingRequestInput(@jakarta.annotation.Nullable final StringCreateEmbeddingRequestInput value) {
            this.stringCreateEmbeddingRequestInput = value;
        }
    }
    /**
     * Composed type wrapper for classes string
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class CreateEmbeddingRequestModel implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type string
         */
        private String string;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a CreateEmbeddingRequestModel
         */
        @jakarta.annotation.Nonnull
        public static CreateEmbeddingRequestModel createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final CreateEmbeddingRequestModel result = new CreateEmbeddingRequestModel();
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
