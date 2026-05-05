package org.bouncycastle.pqc.crypto.newhope;

import com.drew.metadata.exif.makernotes.CasioType2MakernoteDirectory;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class ErrorCorrection {
    ErrorCorrection() {
    }

    static short LDDecode(int i2, int i3, int i4, int i5) {
        return (short) (((((g(i2) + g(i3)) + g(i4)) + g(i5)) - 98312) >>> 31);
    }

    static int abs(int i2) {
        int i3 = i2 >> 31;
        return (i2 ^ i3) - i3;
    }

    static int f(int[] iArr, int i2, int i3, int i4) {
        int i5 = (i4 * 2730) >> 25;
        int i6 = i5 - ((12288 - (i4 - (i5 * CasioType2MakernoteDirectory.TAG_SELF_TIMER))) >> 31);
        iArr[i2] = (i6 >> 1) + (i6 & 1);
        int i7 = i6 - 1;
        iArr[i3] = (i7 >> 1) + ((i7 + 1) - (1 | i7));
        return abs(i4 - (iArr[i2] * 24578));
    }

    static int g(int i2) {
        int i3 = (i2 * 2730) >> 27;
        int i4 = i3 - ((49155 - (i2 - (49156 * i3))) >> 31);
        return abs((((i4 >> 1) + ((-1) - (((-1) - i4) | ((-1) - 1)))) * 98312) - i2);
    }

    static void helpRec(short[] sArr, short[] sArr2, byte[] bArr, byte b2) {
        short s2 = 8;
        byte[] bArr2 = new byte[8];
        bArr2[0] = b2;
        byte[] bArr3 = new byte[32];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 32);
        int[] iArr = new int[8];
        int i2 = 0;
        while (i2 < 256) {
            int i3 = bArr3[i2 >>> 3] >>> (7 & i2);
            int i4 = ((i3 + 1) - (i3 | 1)) * 4;
            int i5 = i2 + 256;
            int i6 = i2 + 512;
            int i7 = i2 + 768;
            int iF = (24577 - (((f(iArr, 0, 4, (sArr2[i2] * s2) + i4) + f(iArr, 1, 5, (sArr2[i5] * s2) + i4)) + f(iArr, 2, 6, (sArr2[i6] * s2) + i4)) + f(iArr, 3, 7, (sArr2[i7] * s2) + i4))) >> 31;
            int i8 = ~iF;
            int i9 = iArr[0];
            int i10 = (i8 + i9) - (i8 | i9);
            int i11 = iArr[4];
            int i12 = i10 ^ ((i11 + iF) - (i11 | iF));
            int i13 = iArr[1];
            int i14 = ((i8 + i13) - (i8 | i13)) ^ (iArr[5] & iF);
            int i15 = (-1) - (((-1) - i8) | ((-1) - iArr[2]));
            int i16 = iArr[6];
            int[] iArr2 = {i12, i14, i15 ^ ((i16 + iF) - (i16 | iF)), (iArr[7] & iF) ^ ((-1) - (((-1) - i8) | ((-1) - iArr[3])))};
            int i17 = iArr2[0];
            int i18 = iArr2[3];
            int i19 = i17 - i18;
            sArr[i2] = (short) ((i19 + 3) - (i19 | 3));
            int i20 = iArr2[1] - i18;
            sArr[i5] = (short) ((i20 + 3) - (i20 | 3));
            sArr[i6] = (short) ((-1) - (((-1) - (iArr2[2] - i18)) | ((-1) - 3)));
            int i21 = (-iF) + (i18 * 2);
            sArr[i7] = (short) ((i21 + 3) - (i21 | 3));
            i2++;
            s2 = 8;
        }
    }

    static void rec(byte[] bArr, short[] sArr, short[] sArr2) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = (sArr[i2] * 8) + 196624;
            int i4 = sArr2[i2] * 2;
            int i5 = i2 + 768;
            short s2 = sArr2[i5];
            int i6 = i3 - ((i4 + s2) * CasioType2MakernoteDirectory.TAG_SELF_TIMER);
            int i7 = i2 + 256;
            int i8 = ((sArr[i7] * 8) + 196624) - (((sArr2[i7] * 2) + s2) * CasioType2MakernoteDirectory.TAG_SELF_TIMER);
            int i9 = i2 + 512;
            int[] iArr = {i6, i8, ((sArr[i9] * 8) + 196624) - (((sArr2[i9] * 2) + s2) * CasioType2MakernoteDirectory.TAG_SELF_TIMER), ((sArr[i5] * 8) + 196624) - (s2 * CasioType2MakernoteDirectory.TAG_SELF_TIMER)};
            int i10 = i2 >>> 3;
            bArr[i10] = (byte) ((LDDecode(iArr[0], iArr[1], iArr[2], iArr[3]) << ((i2 + 7) - (7 | i2))) | bArr[i10]);
        }
    }
}
