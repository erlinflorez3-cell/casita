package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import okio.Utf8;

/* JADX INFO: loaded from: classes8.dex */
final class zzmo {
    static /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws zzkb {
        if (zza(b3) || (((b2 << Ascii.FS) + (b3 + 112)) >> 30) != 0 || zza(b4) || zza(b5)) {
            throw zzkb.zzd();
        }
        int i3 = ((-1) - (((-1) - ((((b2 + 7) - (b2 | 7)) << 18) | ((b3 & Utf8.REPLACEMENT_BYTE) << 12))) & ((-1) - (((b4 + Utf8.REPLACEMENT_BYTE) - (b4 | Utf8.REPLACEMENT_BYTE)) << 6)))) | (b5 & Utf8.REPLACEMENT_BYTE);
        cArr[i2] = (char) ((i3 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i2 + 1] = (char) (((-1) - (((-1) - i3) | ((-1) - 1023))) + Utf8.LOG_SURROGATE_HEADER);
    }

    static /* synthetic */ void zza(byte b2, byte b3, byte b4, char[] cArr, int i2) throws zzkb {
        if (zza(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || zza(b4)))) {
            throw zzkb.zzd();
        }
        cArr[i2] = (char) ((-1) - (((-1) - ((((b2 + Ascii.SI) - (b2 | Ascii.SI)) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6))) & ((-1) - (b4 & Utf8.REPLACEMENT_BYTE))));
    }

    static /* synthetic */ void zza(byte b2, byte b3, char[] cArr, int i2) throws zzkb {
        if (b2 < -62 || zza(b3)) {
            throw zzkb.zzd();
        }
        cArr[i2] = (char) ((((b2 + Ascii.US) - (b2 | Ascii.US)) << 6) | ((-1) - (((-1) - b3) | ((-1) - 63))));
    }

    static /* synthetic */ void zza(byte b2, char[] cArr, int i2) {
        cArr[i2] = (char) b2;
    }

    private static boolean zza(byte b2) {
        return b2 > -65;
    }
}
