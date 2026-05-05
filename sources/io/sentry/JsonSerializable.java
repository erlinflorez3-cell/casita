package io.sentry;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface JsonSerializable {
    void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException;
}
