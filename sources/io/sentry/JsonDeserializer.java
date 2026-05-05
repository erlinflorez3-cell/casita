package io.sentry;

/* JADX INFO: loaded from: classes6.dex */
public interface JsonDeserializer<T> {
    T deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception;
}
