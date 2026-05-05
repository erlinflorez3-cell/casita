package org.msgpack.core.buffer;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface MessageBufferOutput extends Closeable, Flushable {
    void add(byte[] bArr, int i2, int i3) throws IOException;

    MessageBuffer next(int i2) throws IOException;

    void write(byte[] bArr, int i2, int i3) throws IOException;

    void writeBuffer(int i2) throws IOException;
}
