package org.apache.commons.codec.binary;

import java.io.InputStream;
import org.apache.commons.codec.CodecPolicy;

/* JADX INFO: loaded from: classes6.dex */
public class Base16InputStream extends BaseNCodecInputStream {
    public Base16InputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public Base16InputStream(InputStream inputStream, boolean z2) {
        this(inputStream, z2, false);
    }

    public Base16InputStream(InputStream inputStream, boolean z2, boolean z3) {
        this(inputStream, z2, z3, CodecPolicy.LENIENT);
    }

    public Base16InputStream(InputStream inputStream, boolean z2, boolean z3, CodecPolicy codecPolicy) {
        super(inputStream, new Base16(z3, codecPolicy), z2);
    }
}
