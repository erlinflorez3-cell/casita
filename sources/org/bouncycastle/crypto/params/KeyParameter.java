package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes6.dex */
public class KeyParameter implements CipherParameters {
    private byte[] key;

    public KeyParameter(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public KeyParameter(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.key = bArr2;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
    }

    public byte[] getKey() {
        return this.key;
    }
}
