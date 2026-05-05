package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes6.dex */
public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private byte[] engineState = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f27540x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f27541y = 0;
    private byte[] workingKey = null;

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        this.f27540x = 0;
        this.f27541y = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int i2 = 0; i2 < 256; i2++) {
            this.engineState[i2] = (byte) i2;
        }
        int length = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = bArr[length] & 255;
            byte[] bArr2 = this.engineState;
            byte b2 = bArr2[i4];
            i3 = (i5 + b2 + i3) & 255;
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b2;
            length = (length + 1) % bArr.length;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + cipherParameters.getClass().getName());
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        setKey(key);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) {
        if (i2 + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i4 + i3 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.f27540x + 1;
            int i7 = (i6 + 255) - (i6 | 255);
            this.f27540x = i7;
            byte[] bArr3 = this.engineState;
            byte b2 = bArr3[i7];
            int i8 = (this.f27541y + b2) & 255;
            this.f27541y = i8;
            bArr3[i7] = bArr3[i8];
            bArr3[i8] = b2;
            bArr2[i5 + i4] = (byte) (bArr3[(-1) - (((-1) - (bArr3[i7] + b2)) | ((-1) - 255))] ^ bArr[i5 + i2]);
        }
        return i3;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        int i2 = (this.f27540x + 1) & 255;
        this.f27540x = i2;
        byte[] bArr = this.engineState;
        byte b3 = bArr[i2];
        int i3 = this.f27541y + b3;
        int i4 = (i3 + 255) - (i3 | 255);
        this.f27541y = i4;
        bArr[i2] = bArr[i4];
        bArr[i4] = b3;
        return (byte) (b2 ^ bArr[(bArr[i2] + b3) & 255]);
    }
}
