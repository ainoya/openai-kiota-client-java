package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence,`length` if the maximum number of tokens specified in the request was reached,`content_filter` if content was omitted due to a flag from our content filters,`tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum CreateChatCompletionResponseChoicesFinishReason implements ValuedEnum {
    Stop("stop"),
    Length("length"),
    Tool_calls("tool_calls"),
    Content_filter("content_filter"),
    Function_call("function_call");
    public final String value;
    CreateChatCompletionResponseChoicesFinishReason(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static CreateChatCompletionResponseChoicesFinishReason forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "stop": return Stop;
            case "length": return Length;
            case "tool_calls": return Tool_calls;
            case "content_filter": return Content_filter;
            case "function_call": return Function_call;
            default: return null;
        }
    }
}
