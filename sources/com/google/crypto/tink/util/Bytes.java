package com.google.crypto.tink.util;

import com.google.crypto.tink.subtle.Hex;
import com.google.errorprone.annotations.Immutable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
@Immutable(containerOf = {})
public final class Bytes {
    private final byte[] data;

    private Bytes(final byte[] buf, final int start, final int len) {
        byte[] bArr = new byte[len];
        this.data = bArr;
        System.arraycopy(buf, start, bArr, 0, len);
    }

    public static Bytes copyFrom(final byte[] data) {
        if (data != null) {
            return copyFrom(data, 0, data.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static Bytes copyFrom(final byte[] data, final int start, final int len) {
        if (data != null) {
            return new Bytes(data, start, len);
        }
        throw new NullPointerException("data must be non-null");
    }

    public boolean equals(Object o2) {
        if (o2 instanceof Bytes) {
            return Arrays.equals(((Bytes) o2).data, this.data);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public int size() {
        return this.data.length;
    }

    public byte[] toByteArray() {
        byte[] bArr = this.data;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public String toString() {
        return "Bytes(" + Hex.encode(this.data) + ")";
    }
}
