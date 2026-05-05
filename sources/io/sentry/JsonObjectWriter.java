package io.sentry;

import io.sentry.vendor.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes6.dex */
public final class JsonObjectWriter implements ObjectWriter {
    private final JsonObjectSerializer jsonObjectSerializer;
    private final JsonWriter jsonWriter;

    public JsonObjectWriter(Writer writer, int i2) {
        this.jsonWriter = new JsonWriter(writer);
        this.jsonObjectSerializer = new JsonObjectSerializer(i2);
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter beginArray() throws IOException {
        this.jsonWriter.beginArray();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter beginObject() throws IOException {
        this.jsonWriter.beginObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter endArray() throws IOException {
        this.jsonWriter.endArray();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter endObject() throws IOException {
        this.jsonWriter.endObject();
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public ObjectWriter jsonValue(String str) throws IOException {
        this.jsonWriter.jsonValue(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter name(String str) throws IOException {
        this.jsonWriter.name(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter nullValue() throws IOException {
        this.jsonWriter.nullValue();
        return this;
    }

    public void setIndent(String str) {
        this.jsonWriter.setIndent(str);
    }

    @Override // io.sentry.ObjectWriter
    public void setLenient(boolean z2) {
        this.jsonWriter.setLenient(z2);
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(double d2) throws IOException {
        this.jsonWriter.value(d2);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(long j2) throws IOException {
        this.jsonWriter.value(j2);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(ILogger iLogger, Object obj) throws IOException {
        this.jsonObjectSerializer.serialize(this, iLogger, obj);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(Boolean bool) throws IOException {
        this.jsonWriter.value(bool);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(Number number) throws IOException {
        this.jsonWriter.value(number);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(String str) throws IOException {
        this.jsonWriter.value(str);
        return this;
    }

    @Override // io.sentry.ObjectWriter
    public JsonObjectWriter value(boolean z2) throws IOException {
        this.jsonWriter.value(z2);
        return this;
    }
}
