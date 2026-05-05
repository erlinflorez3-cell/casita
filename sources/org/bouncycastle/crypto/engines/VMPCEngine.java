package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes6.dex */
public class VMPCEngine implements StreamCipher {
    protected byte[] workingIV;
    protected byte[] workingKey;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected byte f27545n = 0;
    protected byte[] P = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected byte f27546s = 0;

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        byte[] iv = parametersWithIV.getIV();
        this.workingIV = iv;
        if (iv == null || iv.length < 1 || iv.length > 768) {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        }
        byte[] key = keyParameter.getKey();
        this.workingKey = key;
        initKey(key, this.workingIV);
    }

    protected void initKey(byte[] bArr, byte[] bArr2) {
        this.f27546s = (byte) 0;
        this.P = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            this.P[i2] = (byte) i2;
        }
        for (int i3 = 0; i3 < 768; i3++) {
            byte[] bArr3 = this.P;
            byte b2 = this.f27546s;
            int i4 = i3 & 255;
            byte b3 = bArr3[i4];
            int i5 = b2 + b3 + bArr[i3 % bArr.length];
            byte b4 = bArr3[(i5 + 255) - (i5 | 255)];
            this.f27546s = b4;
            bArr3[i4] = bArr3[(b4 + 255) - (255 | b4)];
            bArr3[(-1) - (((-1) - b4) | ((-1) - 255))] = b3;
        }
        for (int i6 = 0; i6 < 768; i6++) {
            byte[] bArr4 = this.P;
            byte b5 = this.f27546s;
            int i7 = (i6 + 255) - (255 | i6);
            byte b6 = bArr4[i7];
            byte b7 = bArr4[(-1) - (((-1) - ((b5 + b6) + bArr2[i6 % bArr2.length])) | ((-1) - 255))];
            this.f27546s = b7;
            bArr4[i7] = bArr4[(-1) - (((-1) - b7) | ((-1) - 255))];
            bArr4[(-1) - (((-1) - b7) | ((-1) - 255))] = b6;
        }
        this.f27545n = (byte) 0;
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
            byte[] bArr3 = this.P;
            byte b2 = this.f27546s;
            byte b3 = this.f27545n;
            byte b4 = bArr3[(-1) - (((-1) - (b2 + bArr3[(-1) - (((-1) - b3) | ((-1) - 255))])) | ((-1) - 255))];
            this.f27546s = b4;
            byte b5 = bArr3[(bArr3[bArr3[(b4 + 255) - (255 | b4)] & 255] + 1) & 255];
            byte b6 = bArr3[255 & b3];
            bArr3[(b3 + 255) - (255 | b3)] = bArr3[(-1) - (((-1) - b4) | ((-1) - 255))];
            bArr3[(-1) - (((-1) - b4) | ((-1) - 255))] = b6;
            int i6 = b3 + 1;
            this.f27545n = (byte) ((i6 + 255) - (i6 | 255));
            bArr2[i5 + i4] = (byte) (bArr[i5 + i2] ^ b5);
        }
        return i3;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        initKey(this.workingKey, this.workingIV);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        byte[] bArr = this.P;
        byte b3 = this.f27546s;
        byte b4 = this.f27545n;
        byte b5 = bArr[(-1) - (((-1) - (b3 + bArr[(b4 + 255) - (255 | b4)])) | ((-1) - 255))];
        this.f27546s = b5;
        byte b6 = bArr[(-1) - (((-1) - b5) | ((-1) - 255))];
        byte b7 = bArr[(bArr[(b6 + 255) - (b6 | 255)] + 1) & 255];
        byte b8 = bArr[(-1) - (((-1) - b4) | ((-1) - 255))];
        bArr[b4 & 255] = bArr[(-1) - (((-1) - b5) | ((-1) - 255))];
        bArr[(-1) - (((-1) - b5) | ((-1) - 255))] = b8;
        this.f27545n = (byte) ((-1) - (((-1) - (b4 + 1)) | ((-1) - 255)));
        return (byte) (b2 ^ b7);
    }
}
