package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface Encoder {
    int decode(String str, OutputStream outputStream) throws IOException;

    int decode(byte[] bArr, int i2, int i3, OutputStream outputStream) throws IOException;

    int encode(byte[] bArr, int i2, int i3, OutputStream outputStream) throws IOException;
}
