package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes6.dex */
public class Tables64kGCMMultiplier implements GCMMultiplier {
    private byte[] H;
    private int[][][] M;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        int i2 = 0;
        if (this.M == null) {
            this.M = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, 16, 256, 4);
        } else if (Arrays.areEqual(this.H, bArr)) {
            return;
        }
        this.H = Arrays.clone(bArr);
        GCMUtil.asInts(bArr, this.M[0][128]);
        for (int i3 = 64; i3 >= 1; i3 >>= 1) {
            int[][] iArr = this.M[0];
            GCMUtil.multiplyP(iArr[i3 + i3], iArr[i3]);
        }
        while (true) {
            for (int i4 = 2; i4 < 256; i4 += i4) {
                for (int i5 = 1; i5 < i4; i5++) {
                    int[][] iArr2 = this.M[i2];
                    GCMUtil.xor(iArr2[i4], iArr2[i5], iArr2[i4 + i5]);
                }
            }
            int i6 = i2 + 1;
            if (i6 == 16) {
                return;
            }
            for (int i7 = 128; i7 > 0; i7 >>= 1) {
                int[][][] iArr3 = this.M;
                GCMUtil.multiplyP8(iArr3[i2][i7], iArr3[i6][i7]);
            }
            i2 = i6;
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        int[] iArr = new int[4];
        for (int i2 = 15; i2 >= 0; i2--) {
            int[][] iArr2 = this.M[i2];
            byte b2 = bArr[i2];
            int[] iArr3 = iArr2[(b2 + 255) - (b2 | 255)];
            iArr[0] = iArr[0] ^ iArr3[0];
            iArr[1] = iArr[1] ^ iArr3[1];
            iArr[2] = iArr[2] ^ iArr3[2];
            iArr[3] = iArr3[3] ^ iArr[3];
        }
        Pack.intToBigEndian(iArr, bArr, 0);
    }
}
