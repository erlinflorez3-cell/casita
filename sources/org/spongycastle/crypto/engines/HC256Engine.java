package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes2.dex */
public class HC256Engine implements StreamCipher {
    private boolean initialised;
    private byte[] iv;
    private byte[] key;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f27897p = new int[1024];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f27898q = new int[1024];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private byte getByte() {
        if (this.idx == 0) {
            int iStep = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) ((iStep + 255) - (255 | iStep));
            int i2 = iStep >> 8;
            bArr[1] = (byte) ((i2 + 255) - (i2 | 255));
            bArr[2] = (byte) ((-1) - (((-1) - (iStep >> 16)) | ((-1) - 255)));
            int i3 = iStep >> 24;
            bArr[3] = (byte) ((i3 + 255) - (i3 | 255));
        }
        byte[] bArr2 = this.buf;
        int i4 = this.idx;
        byte b2 = bArr2[i4];
        this.idx = 3 & (i4 + 1);
        return b2;
    }

    private void init() {
        byte[] bArr = this.key;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.iv.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.key;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.key = bArr2;
        }
        byte[] bArr4 = this.iv;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.iv;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.iv = bArr5;
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[2560];
        for (int i2 = 0; i2 < 32; i2++) {
            int i3 = i2 >> 2;
            int i4 = iArr[i3];
            byte b2 = this.key[i2];
            int i5 = ((b2 + 255) - (b2 | 255)) << (((-1) - (((-1) - i2) | ((-1) - 3))) * 8);
            iArr[i3] = (i4 + i5) - (i4 & i5);
        }
        for (int i6 = 0; i6 < 32; i6++) {
            int i7 = (i6 >> 2) + 8;
            iArr[i7] = iArr[i7] | (((-1) - (((-1) - this.iv[i6]) | ((-1) - 255))) << (((i6 + 3) - (3 | i6)) * 8));
        }
        for (int i8 = 16; i8 < 2560; i8++) {
            int i9 = iArr[i8 - 2];
            int i10 = iArr[i8 - 15];
            iArr[i8] = ((i9 >>> 10) ^ (rotateRight(i9, 17) ^ rotateRight(i9, 19))) + iArr[i8 - 7] + ((i10 >>> 3) ^ (rotateRight(i10, 7) ^ rotateRight(i10, 18))) + iArr[i8 - 16] + i8;
        }
        System.arraycopy(iArr, 512, this.f27897p, 0, 1024);
        System.arraycopy(iArr, 1536, this.f27898q, 0, 1024);
        for (int i11 = 0; i11 < 4096; i11++) {
            step();
        }
        this.cnt = 0;
    }

    private static int rotateRight(int i2, int i3) {
        int i4 = i2 >>> i3;
        int i5 = i2 << (-i3);
        return (i5 + i4) - (i5 & i4);
    }

    private int step() {
        int i2;
        int i3;
        int i4 = this.cnt;
        int i5 = (-1) - (((-1) - i4) | ((-1) - 1023));
        if (i4 < 1024) {
            int[] iArr = this.f27897p;
            int i6 = iArr[(-1) - (((-1) - (i5 - 3)) | ((-1) - 1023))];
            int i7 = i5 - 1023;
            int i8 = iArr[(i7 + 1023) - (i7 | 1023)];
            int i9 = iArr[i5];
            int iRotateRight = iArr[(i5 - 10) & 1023] + (rotateRight(i8, 23) ^ rotateRight(i6, 10));
            int[] iArr2 = this.f27898q;
            int i10 = i6 ^ i8;
            iArr[i5] = i9 + iRotateRight + iArr2[(i10 + 1023) - (i10 | 1023)];
            int[] iArr3 = this.f27897p;
            int i11 = iArr3[(i5 - 12) & 1023];
            int i12 = i11 >> 8;
            i2 = iArr2[(-1) - (((-1) - i11) | ((-1) - 255))] + iArr2[((i12 + 255) - (i12 | 255)) + 256] + iArr2[((-1) - (((-1) - (i11 >> 16)) | ((-1) - 255))) + 512] + iArr2[((i11 >> 24) & 255) + 768];
            i3 = iArr3[i5];
        } else {
            int[] iArr4 = this.f27898q;
            int i13 = iArr4[(i5 - 3) & 1023];
            int i14 = iArr4[(-1) - (((-1) - (i5 - 1023)) | ((-1) - 1023))];
            int i15 = iArr4[i5];
            int iRotateRight2 = iArr4[(i5 - 10) & 1023] + (rotateRight(i14, 23) ^ rotateRight(i13, 10));
            int[] iArr5 = this.f27897p;
            int i16 = i13 ^ i14;
            iArr4[i5] = i15 + iRotateRight2 + iArr5[(i16 + 1023) - (i16 | 1023)];
            int[] iArr6 = this.f27898q;
            int i17 = iArr6[(-1) - (((-1) - (i5 - 12)) | ((-1) - 1023))];
            int i18 = i17 >> 8;
            int i19 = iArr5[(-1) - (((-1) - i17) | ((-1) - 255))] + iArr5[((i18 + 255) - (i18 | 255)) + 256];
            int i20 = i17 >> 16;
            int i21 = i19 + iArr5[((i20 + 255) - (i20 | 255)) + 512];
            int i22 = i17 >> 24;
            i2 = i21 + iArr5[((i22 + 255) - (i22 | 255)) + 768];
            i3 = iArr6[i5];
        }
        int i23 = i3 ^ i2;
        this.cnt = (this.cnt + 1) & 2047;
        return i23;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-256";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.iv = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        } else {
            this.iv = new byte[0];
            parameters = cipherParameters;
        }
        if (!(parameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Invalid parameter passed to HC256 init - " + cipherParameters.getClass().getName());
        }
        this.key = ((KeyParameter) parameters).getKey();
        init();
        this.initialised = true;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws DataLengthException {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i2 + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i4 + i3 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2[i4 + i5] = (byte) (bArr[i2 + i5] ^ getByte());
        }
        return i3;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        return (byte) (b2 ^ getByte());
    }
}
