package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence,`length` if the maximum number of tokens specified in the request was reached,or `content_filter` if content was omitted due to a flag from our content filters.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateCompletionResponseChoicesFinishReason implements ValuedEnum {
    Stop("stop"),
    Length("length"),
    Content_filter("content_filter");
    public final String value;
    CreateCompletionResponseChoicesFinishReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateCompletionResponseChoicesFinishReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "stop": return Stop;
            case "length": return Length;
            case "content_filter": return Content_filter;
            default: return null;
        }
    }
}
