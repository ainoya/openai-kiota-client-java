package dev.ainoya.kiota.openai.generated.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum FineTuningJobEventLevel implements ValuedEnum {
    Info("info"),
    Warn("warn"),
    Error("error");
    public final String value;
    FineTuningJobEventLevel(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static FineTuningJobEventLevel forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "info": return Info;
            case "warn": return Warn;
            case "error": return Error;
            default: return null;
        }
    }
}
