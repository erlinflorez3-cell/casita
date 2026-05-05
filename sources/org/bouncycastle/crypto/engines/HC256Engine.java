package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes6.dex */
public class HC256Engine implements StreamCipher {
    private boolean initialised;
    private byte[] iv;
    private byte[] key;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f27535p = new int[1024];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f27536q = new int[1024];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private byte getByte() {
        if (this.idx == 0) {
            int iStep = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (255 & iStep);
            bArr[1] = (byte) ((-1) - (((-1) - (iStep >> 8)) | ((-1) - 255)));
            int i2 = iStep >> 16;
            bArr[2] = (byte) ((i2 + 255) - (i2 | 255));
            bArr[3] = (byte) ((iStep >> 24) & 255);
        }
        byte[] bArr2 = this.buf;
        int i3 = this.idx;
        byte b2 = bArr2[i3];
        this.idx = (-1) - (((-1) - 3) | ((-1) - (i3 + 1)));
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
            iArr[i3] = (-1) - (((-1) - i4) & ((-1) - (((b2 + 255) - (b2 | 255)) << ((3 & i2) * 8))));
        }
        for (int i5 = 0; i5 < 32; i5++) {
            int i6 = (i5 >> 2) + 8;
            iArr[i6] = (-1) - (((-1) - iArr[i6]) & ((-1) - ((this.iv[i5] & 255) << ((3 & i5) * 8))));
        }
        for (int i7 = 16; i7 < 2560; i7++) {
            int i8 = iArr[i7 - 2];
            int i9 = iArr[i7 - 15];
            iArr[i7] = ((i8 >>> 10) ^ (rotateRight(i8, 17) ^ rotateRight(i8, 19))) + iArr[i7 - 7] + ((i9 >>> 3) ^ (rotateRight(i9, 7) ^ rotateRight(i9, 18))) + iArr[i7 - 16] + i7;
        }
        System.arraycopy(iArr, 512, this.f27535p, 0, 1024);
        System.arraycopy(iArr, 1536, this.f27536q, 0, 1024);
        for (int i10 = 0; i10 < 4096; i10++) {
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
            int[] iArr = this.f27535p;
            int i6 = iArr[(i5 - 3) & 1023];
            int i7 = i5 - 1023;
            int i8 = iArr[(i7 + 1023) - (i7 | 1023)];
            int i9 = iArr[i5];
            int iRotateRight = iArr[(i5 - 10) & 1023] + (rotateRight(i8, 23) ^ rotateRight(i6, 10));
            int[] iArr2 = this.f27536q;
            iArr[i5] = i9 + iRotateRight + iArr2[(-1) - (((-1) - (i6 ^ i8)) | ((-1) - 1023))];
            int[] iArr3 = this.f27535p;
            int i10 = i5 - 12;
            int i11 = iArr3[(i10 + 1023) - (i10 | 1023)];
            int i12 = iArr2[(-1) - (((-1) - i11) | ((-1) - 255))] + iArr2[((i11 >> 8) & 255) + 256] + iArr2[((i11 >> 16) & 255) + 512];
            int i13 = i11 >> 24;
            i2 = i12 + iArr2[((i13 + 255) - (i13 | 255)) + 768];
            i3 = iArr3[i5];
        } else {
            int[] iArr4 = this.f27536q;
            int i14 = iArr4[(i5 - 3) & 1023];
            int i15 = iArr4[(-1) - (((-1) - (i5 - 1023)) | ((-1) - 1023))];
            int i16 = iArr4[i5];
            int i17 = i5 - 10;
            int iRotateRight2 = iArr4[(i17 + 1023) - (i17 | 1023)] + (rotateRight(i15, 23) ^ rotateRight(i14, 10));
            int[] iArr5 = this.f27535p;
            iArr4[i5] = i16 + iRotateRight2 + iArr5[(-1) - (((-1) - (i14 ^ i15)) | ((-1) - 1023))];
            int[] iArr6 = this.f27536q;
            int i18 = iArr6[(i5 - 12) & 1023];
            i2 = iArr5[255 & i18] + iArr5[((i18 >> 8) & 255) + 256] + iArr5[((i18 >> 16) & 255) + 512] + iArr5[((-1) - (((-1) - (i18 >> 24)) | ((-1) - 255))) + 768];
            i3 = iArr6[i5];
        }
        int i19 = i3 ^ i2;
        this.cnt = (-1) - (((-1) - (this.cnt + 1)) | ((-1) - 2047));
        return i19;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-256";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
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

    @Override // org.bouncycastle.crypto.StreamCipher
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

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        return (byte) (b2 ^ getByte());
    }
}
