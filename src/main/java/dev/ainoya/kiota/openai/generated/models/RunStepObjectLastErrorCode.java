package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * One of `server_error` or `rate_limit_exceeded`.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum RunStepObjectLastErrorCode implements ValuedEnum {
    Server_error("server_error"),
    Rate_limit_exceeded("rate_limit_exceeded");
    public final String value;
    RunStepObjectLastErrorCode(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static RunStepObjectLastErrorCode forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "server_error": return Server_error;
            case "rate_limit_exceeded": return Rate_limit_exceeded;
            default: return null;
        }
    }
}
