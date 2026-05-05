package org.apache.commons.codec.binary;

import java.io.OutputStream;
import org.apache.commons.codec.CodecPolicy;

/* JADX INFO: loaded from: classes6.dex */
public class Base32OutputStream extends BaseNCodecOutputStream {
    public Base32OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base32OutputStream(OutputStream outputStream, boolean z2) {
        super(outputStream, new Base32(false), z2);
    }

    public Base32OutputStream(OutputStream outputStream, boolean z2, int i2, byte[] bArr) {
        super(outputStream, new Base32(i2, bArr), z2);
    }

    public Base32OutputStream(OutputStream outputStream, boolean z2, int i2, byte[] bArr, CodecPolicy codecPolicy) {
        super(outputStream, new Base32(i2, bArr, false, kotlin.io.encoding.Base64.padSymbol, codecPolicy), z2);
    }
}
