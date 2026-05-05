package org.bouncycastle.pqc.crypto.newhope;

import android.R;
import com.drew.metadata.exif.makernotes.CasioType2MakernoteDirectory;
import com.google.common.base.Ascii;
import okio.Utf8;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
class Poly {
    Poly() {
    }

    static void add(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i2 = 0; i2 < 1024; i2++) {
            sArr3[i2] = Reduce.barrett((short) (sArr[i2] + sArr2[i2]));
        }
    }

    static void fromBytes(short[] sArr, byte[] bArr) {
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = i2 * 7;
            int i4 = bArr[i3] & 255;
            byte b2 = bArr[i3 + 1];
            int i5 = (-1) - (((-1) - bArr[i3 + 2]) | ((-1) - 255));
            byte b3 = bArr[i3 + 3];
            byte b4 = bArr[i3 + 4];
            int i6 = (b4 + 255) - (b4 | 255);
            byte b5 = bArr[i3 + 5];
            int i7 = bArr[i3 + 6] & 255;
            int i8 = i2 * 4;
            sArr[i8] = (short) ((-1) - (((-1) - i4) & ((-1) - (((b2 + Utf8.REPLACEMENT_BYTE) - (b2 | Utf8.REPLACEMENT_BYTE)) << 8))));
            int i9 = (-1) - (((-1) - ((b2 & 255) >>> 6)) & ((-1) - (i5 << 2)));
            int i10 = (b3 & Ascii.SI) << 10;
            sArr[i8 + 1] = (short) ((i9 + i10) - (i9 & i10));
            int i11 = (-1) - (((-1) - (((b3 + 255) - (255 | b3)) >>> 4)) & ((-1) - (i6 << 4)));
            int i12 = ((-1) - (((-1) - b5) | ((-1) - 3))) << 12;
            sArr[i8 + 2] = (short) ((i11 + i12) - (i11 & i12));
            sArr[i8 + 3] = (short) ((-1) - (((-1) - (i7 << 6)) & ((-1) - ((b5 & 255) >>> 2))));
        }
    }

    static void fromNTT(short[] sArr) {
        NTT.bitReverse(sArr);
        NTT.core(sArr, Precomp.OMEGAS_INV_MONTGOMERY);
        NTT.mulCoefficients(sArr, Precomp.PSIS_INV_MONTGOMERY);
    }

    static void getNoise(short[] sArr, byte[] bArr, byte b2) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b2;
        byte[] bArr3 = new byte[4096];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 4096);
        for (int i2 = 0; i2 < 1024; i2++) {
            int iBigEndianToInt = Pack.bigEndianToInt(bArr3, i2 * 4);
            int i3 = 0;
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = iBigEndianToInt >> i4;
                i3 += (i5 + R.attr.cacheColorHint) - (i5 | R.attr.cacheColorHint);
            }
            sArr[i2] = (short) (((((i3 >>> 24) + i3) & 255) + CasioType2MakernoteDirectory.TAG_SELF_TIMER) - ((-1) - (((-1) - ((i3 >>> 16) + (i3 >>> 8))) | ((-1) - 255))));
        }
    }

    private static short normalize(short s2) {
        short sBarrett = Reduce.barrett(s2);
        int i2 = sBarrett - 12289;
        return (short) (((-1) - (((-1) - (sBarrett ^ i2)) | ((-1) - (i2 >> 31)))) ^ i2);
    }

    static void pointWise(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i2 = 0; i2 < 1024; i2++) {
            sArr3[i2] = Reduce.montgomery(((-1) - (((-1) - sArr[i2]) | ((-1) - 65535))) * (65535 & Reduce.montgomery((sArr2[i2] & 65535) * 3186)));
        }
    }

    static void toBytes(byte[] bArr, short[] sArr) {
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = i2 * 4;
            short sNormalize = normalize(sArr[i3]);
            short sNormalize2 = normalize(sArr[i3 + 1]);
            short sNormalize3 = normalize(sArr[i3 + 2]);
            short sNormalize4 = normalize(sArr[i3 + 3]);
            int i4 = i2 * 7;
            bArr[i4] = (byte) sNormalize;
            bArr[i4 + 1] = (byte) ((sNormalize >> 8) | (sNormalize2 << 6));
            bArr[i4 + 2] = (byte) (sNormalize2 >> 2);
            bArr[i4 + 3] = (byte) ((-1) - (((-1) - (sNormalize2 >> 10)) & ((-1) - (sNormalize3 << 4))));
            bArr[i4 + 4] = (byte) (sNormalize3 >> 4);
            int i5 = sNormalize3 >> 12;
            int i6 = sNormalize4 << 2;
            bArr[i4 + 5] = (byte) ((i5 + i6) - (i5 & i6));
            bArr[i4 + 6] = (byte) (sNormalize4 >> 6);
        }
    }

    static void toNTT(short[] sArr) {
        NTT.mulCoefficients(sArr, Precomp.PSIS_BITREV_MONTGOMERY);
        NTT.core(sArr, Precomp.OMEGAS_MONTGOMERY);
    }

    static void uniform(short[] sArr, byte[] bArr) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i2 = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            sHAKEDigest.doOutput(bArr2, 0, 256);
            for (int i3 = 0; i3 < 256; i3 += 2) {
                int i4 = bArr2[i3] & 255;
                byte b2 = bArr2[i3 + 1];
                int i5 = ((b2 + 255) - (b2 | 255)) << 8;
                int i6 = ((i4 + i5) - (i4 & i5)) & 16383;
                if (i6 < 12289) {
                    int i7 = i2 + 1;
                    sArr[i2] = (short) i6;
                    if (i7 == 1024) {
                        return;
                    } else {
                        i2 = i7;
                    }
                }
            }
        }
    }
}
