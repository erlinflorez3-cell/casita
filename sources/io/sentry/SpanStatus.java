package io.sentry;

import cz.msebera.android.httpclient.HttpStatus;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public enum SpanStatus implements JsonSerializable {
    OK(200, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(HttpStatus.SC_NOT_FOUND),
    ALREADY_EXISTS(HttpStatus.SC_CONFLICT),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(HttpStatus.SC_CONFLICT),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    public static final class Deserializer implements JsonDeserializer<SpanStatus> {
        @Override // io.sentry.JsonDeserializer
        public SpanStatus deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            return SpanStatus.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
        }
    }

    SpanStatus(int i2) {
        this.minHttpStatusCode = i2;
        this.maxHttpStatusCode = i2;
    }

    SpanStatus(int i2, int i3) {
        this.minHttpStatusCode = i2;
        this.maxHttpStatusCode = i3;
    }

    public static SpanStatus fromHttpStatusCode(int i2) {
        for (SpanStatus spanStatus : values()) {
            if (spanStatus.matches(i2)) {
                return spanStatus;
            }
        }
        return null;
    }

    public static SpanStatus fromHttpStatusCode(Integer num, SpanStatus spanStatus) {
        SpanStatus spanStatusFromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : spanStatus;
        return spanStatusFromHttpStatusCode != null ? spanStatusFromHttpStatusCode : spanStatus;
    }

    private boolean matches(int i2) {
        return i2 >= this.minHttpStatusCode && i2 <= this.maxHttpStatusCode;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.value(name().toLowerCase(Locale.ROOT));
    }
}
