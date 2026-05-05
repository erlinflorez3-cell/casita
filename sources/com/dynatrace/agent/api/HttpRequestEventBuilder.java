package com.dynatrace.agent.api;

import com.dynatrace.agent.api.internal.HttpRequestEventBuilderInternal;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpRequestEventBuilder {
    private static final String NULL_NOT_ALLOWED_MESSAGE = "Event property with key 'null' is not allowed and thus ignored";
    private final HttpRequestEventBuilderInternal internalBuilder;

    public HttpRequestEventBuilder(String url, String requestMethod) {
        this.internalBuilder = new HttpRequestEventBuilderInternal(url == null ? "" : url, requestMethod == null ? "" : requestMethod);
    }

    public HttpRequestEventBuilder addEventProperty(String key, double value) {
        if (key != null) {
            this.internalBuilder.addEventProperty(key, value);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, NULL_NOT_ALLOWED_MESSAGE);
        }
        return this;
    }

    public HttpRequestEventBuilder addEventProperty(String key, int value) {
        if (key != null) {
            this.internalBuilder.addEventProperty(key, value);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, NULL_NOT_ALLOWED_MESSAGE);
        }
        return this;
    }

    public HttpRequestEventBuilder addEventProperty(String key, long value) {
        if (key != null) {
            this.internalBuilder.addEventProperty(key, value);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, NULL_NOT_ALLOWED_MESSAGE);
        }
        return this;
    }

    public HttpRequestEventBuilder addEventProperty(String key, String value) {
        if (key != null) {
            this.internalBuilder.addEventProperty(key, value);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, NULL_NOT_ALLOWED_MESSAGE);
        }
        return this;
    }

    public HttpRequestEventBuilder addEventProperty(String key, boolean value) {
        if (key != null) {
            this.internalBuilder.addEventProperty(key, value);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, NULL_NOT_ALLOWED_MESSAGE);
        }
        return this;
    }

    HttpRequestEventBuilderInternal.HttpRequestEvent build() {
        return this.internalBuilder.build();
    }

    public HttpRequestEventBuilder withBytesReceived(int bytesReceived) {
        this.internalBuilder.withBytesReceived(bytesReceived);
        return this;
    }

    public HttpRequestEventBuilder withBytesSent(int bytesSent) {
        this.internalBuilder.withBytesSent(bytesSent);
        return this;
    }

    public HttpRequestEventBuilder withDuration(long durationMilliseconds) {
        this.internalBuilder.withDuration(durationMilliseconds);
        return this;
    }

    public HttpRequestEventBuilder withReasonPhrase(String reasonPhrase) {
        this.internalBuilder.withReasonPhrase(reasonPhrase);
        return this;
    }

    public HttpRequestEventBuilder withStatusCode(int statusCode) {
        this.internalBuilder.withStatusCode(statusCode);
        return this;
    }

    public HttpRequestEventBuilder withThrowable(Throwable throwable) {
        if (throwable != null) {
            this.internalBuilder.withThrowable(throwable);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "Passing a Throwable with value 'null' is not allowed and thus ignored");
        }
        return this;
    }

    public HttpRequestEventBuilder withTraceparentHeader(String traceparentHeader) {
        if (traceparentHeader != null) {
            this.internalBuilder.withTraceparentHeader(traceparentHeader);
        } else {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "Traceparent header with value 'null' is not allowed and thus ignored");
        }
        return this;
    }
}
