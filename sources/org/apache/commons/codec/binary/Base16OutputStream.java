package org.apache.commons.codec.binary;

import java.io.OutputStream;
import org.apache.commons.codec.CodecPolicy;

/* JADX INFO: loaded from: classes6.dex */
public class Base16OutputStream extends BaseNCodecOutputStream {
    public Base16OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base16OutputStream(OutputStream outputStream, boolean z2) {
        this(outputStream, z2, false);
    }

    public Base16OutputStream(OutputStream outputStream, boolean z2, boolean z3) {
        this(outputStream, z2, z3, CodecPolicy.LENIENT);
    }

    public Base16OutputStream(OutputStream outputStream, boolean z2, boolean z3, CodecPolicy codecPolicy) {
        super(outputStream, new Base16(z3, codecPolicy), z2);
    }
}
