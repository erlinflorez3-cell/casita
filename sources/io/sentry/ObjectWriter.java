package io.sentry;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public interface ObjectWriter {
    ObjectWriter beginArray() throws IOException;

    ObjectWriter beginObject() throws IOException;

    ObjectWriter endArray() throws IOException;

    ObjectWriter endObject() throws IOException;

    ObjectWriter jsonValue(String str) throws IOException;

    ObjectWriter name(String str) throws IOException;

    ObjectWriter nullValue() throws IOException;

    void setLenient(boolean z2);

    ObjectWriter value(double d2) throws IOException;

    ObjectWriter value(long j2) throws IOException;

    ObjectWriter value(ILogger iLogger, Object obj) throws IOException;

    ObjectWriter value(Boolean bool) throws IOException;

    ObjectWriter value(Number number) throws IOException;

    ObjectWriter value(String str) throws IOException;

    ObjectWriter value(boolean z2) throws IOException;
}
