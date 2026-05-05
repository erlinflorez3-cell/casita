package org.spongycastle.crypto.engines;

import androidx.core.app.FrameMetricsAggregator;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes2.dex */
public class HC128Engine implements StreamCipher {
    private boolean initialised;
    private byte[] iv;
    private byte[] key;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f27895p = new int[512];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f27896q = new int[512];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private static int dim(int i2, int i3) {
        return mod512(i2 - i3);
    }

    private static int f1(int i2) {
        return (i2 >>> 3) ^ (rotateRight(i2, 7) ^ rotateRight(i2, 18));
    }

    private static int f2(int i2) {
        return (i2 >>> 10) ^ (rotateRight(i2, 17) ^ rotateRight(i2, 19));
    }

    private int g1(int i2, int i3, int i4) {
        return (rotateRight(i2, 10) ^ rotateRight(i4, 23)) + rotateRight(i3, 8);
    }

    private int g2(int i2, int i3, int i4) {
        return (rotateLeft(i2, 10) ^ rotateLeft(i4, 23)) + rotateLeft(i3, 8);
    }

    private byte getByte() {
        if (this.idx == 0) {
            int iStep = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (255 & iStep);
            bArr[1] = (byte) ((-1) - (((-1) - (iStep >> 8)) | ((-1) - 255)));
            bArr[2] = (byte) ((iStep >> 16) & 255);
            bArr[3] = (byte) ((-1) - (((-1) - (iStep >> 24)) | ((-1) - 255)));
        }
        byte[] bArr2 = this.buf;
        int i2 = this.idx;
        byte b2 = bArr2[i2];
        int i3 = i2 + 1;
        this.idx = (3 + i3) - (3 | i3);
        return b2;
    }

    private int h1(int i2) {
        int[] iArr = this.f27896q;
        return iArr[(i2 + 255) - (255 | i2)] + iArr[((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255))) + 256];
    }

    private int h2(int i2) {
        int[] iArr = this.f27895p;
        return iArr[255 & i2] + iArr[((-1) - (((-1) - (i2 >> 16)) | ((-1) - 255))) + 256];
    }

    private void init() {
        if (this.key.length != 16) {
            throw new IllegalArgumentException("The key must be 128 bits long");
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[1280];
        for (int i2 = 0; i2 < 16; i2++) {
            int i3 = i2 >> 2;
            int i4 = iArr[i3];
            int i5 = (this.key[i2] & 255) << (((-1) - (((-1) - i2) | ((-1) - 3))) * 8);
            iArr[i3] = (i5 + i4) - (i5 & i4);
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i6 = 0;
        while (true) {
            byte[] bArr = this.iv;
            if (i6 >= bArr.length || i6 >= 16) {
                break;
            }
            int i7 = (i6 >> 2) + 8;
            int i8 = iArr[i7];
            int i9 = ((-1) - (((-1) - bArr[i6]) | ((-1) - 255))) << (((i6 + 3) - (3 | i6)) * 8);
            iArr[i7] = (i9 + i8) - (i9 & i8);
            i6++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i10 = 16; i10 < 1280; i10++) {
            iArr[i10] = f2(iArr[i10 - 2]) + iArr[i10 - 7] + f1(iArr[i10 - 15]) + iArr[i10 - 16] + i10;
        }
        System.arraycopy(iArr, 256, this.f27895p, 0, 512);
        System.arraycopy(iArr, 768, this.f27896q, 0, 512);
        for (int i11 = 0; i11 < 512; i11++) {
            this.f27895p[i11] = step();
        }
        for (int i12 = 0; i12 < 512; i12++) {
            this.f27896q[i12] = step();
        }
        this.cnt = 0;
    }

    private static int mod1024(int i2) {
        return (i2 + 1023) - (i2 | 1023);
    }

    private static int mod512(int i2) {
        return (i2 + FrameMetricsAggregator.EVERY_DURATION) - (i2 | FrameMetricsAggregator.EVERY_DURATION);
    }

    private static int rotateLeft(int i2, int i3) {
        return (i2 >>> (-i3)) | (i2 << i3);
    }

    private static int rotateRight(int i2, int i3) {
        int i4 = i2 >>> i3;
        int i5 = i2 << (-i3);
        return (i5 + i4) - (i5 & i4);
    }

    private int step() {
        int iH2;
        int i2;
        int iMod512 = mod512(this.cnt);
        if (this.cnt < 512) {
            int[] iArr = this.f27895p;
            iArr[iMod512] = iArr[iMod512] + g1(iArr[dim(iMod512, 3)], this.f27895p[dim(iMod512, 10)], this.f27895p[dim(iMod512, FrameMetricsAggregator.EVERY_DURATION)]);
            iH2 = h1(this.f27895p[dim(iMod512, 12)]);
            i2 = this.f27895p[iMod512];
        } else {
            int[] iArr2 = this.f27896q;
            iArr2[iMod512] = iArr2[iMod512] + g2(iArr2[dim(iMod512, 3)], this.f27896q[dim(iMod512, 10)], this.f27896q[dim(iMod512, FrameMetricsAggregator.EVERY_DURATION)]);
            iH2 = h2(this.f27896q[dim(iMod512, 12)]);
            i2 = this.f27896q[iMod512];
        }
        int i3 = i2 ^ iH2;
        this.cnt = mod1024(this.cnt + 1);
        return i3;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-128";
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
            throw new IllegalArgumentException("Invalid parameter passed to HC128 init - " + cipherParameters.getClass().getName());
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
