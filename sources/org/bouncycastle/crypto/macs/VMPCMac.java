package org.bouncycastle.crypto.macs;

import com.google.common.base.Ascii;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes6.dex */
public class VMPCMac implements Mac {
    private byte[] T;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f27565g;
    private byte[] workingIV;
    private byte[] workingKey;
    private byte x1;
    private byte x2;
    private byte x3;
    private byte x4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f27566n = 0;
    private byte[] P = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte f27567s = 0;

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.f27567s = (byte) 0;
        this.P = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            this.P[i2] = (byte) i2;
        }
        for (int i3 = 0; i3 < 768; i3++) {
            byte[] bArr3 = this.P;
            byte b2 = this.f27567s;
            int i4 = (i3 + 255) - (255 | i3);
            byte b3 = bArr3[i4];
            int i5 = b2 + b3 + bArr[i3 % bArr.length];
            byte b4 = bArr3[(i5 + 255) - (i5 | 255)];
            this.f27567s = b4;
            bArr3[i4] = bArr3[(b4 + 255) - (255 | b4)];
            bArr3[b4 & 255] = b3;
        }
        for (int i6 = 0; i6 < 768; i6++) {
            byte[] bArr4 = this.P;
            byte b5 = this.f27567s;
            int i7 = (-1) - (((-1) - i6) | ((-1) - 255));
            byte b6 = bArr4[i7];
            byte b7 = bArr4[(b5 + b6 + bArr2[i6 % bArr2.length]) & 255];
            this.f27567s = b7;
            bArr4[i7] = bArr4[(b7 + 255) - (255 | b7)];
            bArr4[b7 & 255] = b6;
        }
        this.f27566n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i2) throws IllegalStateException, DataLengthException {
        for (int i3 = 1; i3 < 25; i3++) {
            byte[] bArr2 = this.P;
            byte b2 = this.f27567s;
            byte b3 = this.f27566n;
            byte b4 = bArr2[(b2 + bArr2[(b3 + 255) - (255 | b3)]) & 255];
            this.f27567s = b4;
            byte b5 = this.x4;
            byte b6 = this.x3;
            byte b7 = bArr2[(b5 + b6 + i3) & 255];
            this.x4 = b7;
            byte b8 = this.x2;
            byte b9 = bArr2[(-1) - (((-1) - ((b6 + b8) + i3)) | ((-1) - 255))];
            this.x3 = b9;
            byte b10 = this.x1;
            byte b11 = bArr2[(b8 + b10 + i3) & 255];
            this.x2 = b11;
            int i4 = b10 + b4 + i3;
            byte b12 = bArr2[(i4 + 255) - (i4 | 255)];
            this.x1 = b12;
            byte[] bArr3 = this.T;
            byte b13 = this.f27565g;
            bArr3[b13 & Ascii.US] = (byte) (b12 ^ bArr3[(b13 + Ascii.US) - (31 | b13)]);
            int i5 = b13 + 1;
            bArr3[(i5 + 31) - (i5 | 31)] = (byte) (b11 ^ bArr3[(-1) - (((-1) - (b13 + 1)) | ((-1) - 31))]);
            bArr3[(b13 + 2) & 31] = (byte) (b9 ^ bArr3[(b13 + 2) & 31]);
            int i6 = b13 + 3;
            bArr3[(b13 + 3) & 31] = (byte) (b7 ^ bArr3[(i6 + 31) - (i6 | 31)]);
            int i7 = b13 + 4;
            this.f27565g = (byte) ((i7 + 31) - (i7 | 31));
            byte b14 = bArr2[(b3 + 255) - (255 | b3)];
            bArr2[(-1) - (((-1) - b3) | ((-1) - 255))] = bArr2[(b4 + 255) - (255 | b4)];
            bArr2[(b4 + 255) - (b4 | 255)] = b14;
            this.f27566n = (byte) ((b3 + 1) & 255);
        }
        for (int i8 = 0; i8 < 768; i8++) {
            byte[] bArr4 = this.P;
            byte b15 = this.f27567s;
            int i9 = (i8 + 255) - (255 | i8);
            byte b16 = bArr4[i9];
            byte b17 = bArr4[(-1) - (((-1) - ((b15 + b16) + this.T[31 & i8])) | ((-1) - 255))];
            this.f27567s = b17;
            bArr4[i9] = bArr4[255 & b17];
            bArr4[(-1) - (((-1) - b17) | ((-1) - 255))] = b16;
        }
        byte[] bArr5 = new byte[20];
        for (int i10 = 0; i10 < 20; i10++) {
            byte[] bArr6 = this.P;
            int i11 = (i10 + 255) - (255 | i10);
            byte b18 = bArr6[(-1) - (((-1) - (this.f27567s + bArr6[i11])) | ((-1) - 255))];
            this.f27567s = b18;
            int i12 = bArr6[bArr6[255 & b18] & 255] + 1;
            bArr5[i10] = bArr6[(i12 + 255) - (i12 | 255)];
            byte b19 = bArr6[i11];
            bArr6[i11] = bArr6[(b18 + 255) - (255 | b18)];
            bArr6[b18 & 255] = b19;
        }
        System.arraycopy(bArr5, 0, bArr, i2, 20);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] iv = parametersWithIV.getIV();
        this.workingIV = iv;
        if (iv == null || iv.length < 1 || iv.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.workingKey = keyParameter.getKey();
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.f27566n = (byte) 0;
        this.x4 = (byte) 0;
        this.x3 = (byte) 0;
        this.x2 = (byte) 0;
        this.x1 = (byte) 0;
        this.f27565g = (byte) 0;
        this.T = new byte[32];
        for (int i2 = 0; i2 < 32; i2++) {
            this.T[i2] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        byte[] bArr = this.P;
        byte b3 = this.f27567s;
        byte b4 = this.f27566n;
        byte b5 = bArr[(-1) - (((-1) - (b3 + bArr[255 & b4])) | ((-1) - 255))];
        this.f27567s = b5;
        byte b6 = (byte) (b2 ^ bArr[(bArr[bArr[(-1) - (((-1) - b5) | ((-1) - 255))] & 255] + 1) & 255]);
        byte b7 = this.x4;
        byte b8 = this.x3;
        int i2 = b7 + b8;
        byte b9 = bArr[(i2 + 255) - (i2 | 255)];
        this.x4 = b9;
        byte b10 = this.x2;
        byte b11 = bArr[(b8 + b10) & 255];
        this.x3 = b11;
        byte b12 = this.x1;
        byte b13 = bArr[(-1) - (((-1) - (b10 + b12)) | ((-1) - 255))];
        this.x2 = b13;
        byte b14 = bArr[(b12 + b5 + b6) & 255];
        this.x1 = b14;
        byte[] bArr2 = this.T;
        byte b15 = this.f27565g;
        bArr2[(-1) - (((-1) - b15) | ((-1) - 31))] = (byte) (b14 ^ bArr2[(b15 + Ascii.US) - (31 | b15)]);
        int i3 = b15 + 1;
        bArr2[(b15 + 1) & 31] = (byte) (b13 ^ bArr2[(i3 + 31) - (i3 | 31)]);
        bArr2[(b15 + 2) & 31] = (byte) (b11 ^ bArr2[(-1) - (((-1) - (b15 + 2)) | ((-1) - 31))]);
        int i4 = b15 + 3;
        bArr2[(-1) - (((-1) - (b15 + 3)) | ((-1) - 31))] = (byte) (b9 ^ bArr2[(i4 + 31) - (i4 | 31)]);
        int i5 = b15 + 4;
        this.f27565g = (byte) ((i5 + 31) - (i5 | 31));
        byte b16 = bArr[(b4 + 255) - (255 | b4)];
        bArr[b4 & 255] = bArr[(b5 + 255) - (255 | b5)];
        bArr[(-1) - (((-1) - b5) | ((-1) - 255))] = b16;
        int i6 = b4 + 1;
        this.f27566n = (byte) ((i6 + 255) - (i6 | 255));
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i2, int i3) throws IllegalStateException, DataLengthException {
        if (i2 + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            update(bArr[i2 + i4]);
        }
    }
}
