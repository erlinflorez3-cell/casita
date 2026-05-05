package com.google.android.gms.internal.vision;

import com.google.common.base.Ascii;
import okio.Utf8;

/* JADX INFO: loaded from: classes8.dex */
final class zzmf {
    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws zzjk {
        if (zzg(b3) || (((b2 << Ascii.FS) + (b3 + 112)) >> 30) != 0 || zzg(b4) || zzg(b5)) {
            throw zzjk.zzh();
        }
        int i3 = (-1) - (((-1) - ((-1) - (((-1) - ((((-1) - (((-1) - b2) | ((-1) - 7))) << 18) | (((b3 + Utf8.REPLACEMENT_BYTE) - (b3 | Utf8.REPLACEMENT_BYTE)) << 12))) & ((-1) - ((b4 & Utf8.REPLACEMENT_BYTE) << 6))))) & ((-1) - ((-1) - (((-1) - b5) | ((-1) - 63)))));
        cArr[i2] = (char) ((i3 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i2 + 1] = (char) (((i3 + 1023) - (i3 | 1023)) + Utf8.LOG_SURROGATE_HEADER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b2, byte b3, byte b4, char[] cArr, int i2) throws zzjk {
        if (zzg(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || zzg(b4)))) {
            throw zzjk.zzh();
        }
        int i3 = ((-1) - (((-1) - b2) | ((-1) - 15))) << 12;
        int i4 = ((b3 + Utf8.REPLACEMENT_BYTE) - (b3 | Utf8.REPLACEMENT_BYTE)) << 6;
        cArr[i2] = (char) (((i3 + i4) - (i3 & i4)) | ((-1) - (((-1) - b4) | ((-1) - 63))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b2, byte b3, char[] cArr, int i2) throws zzjk {
        if (b2 < -62 || zzg(b3)) {
            throw zzjk.zzh();
        }
        cArr[i2] = (char) ((-1) - (((-1) - (((-1) - (((-1) - b2) | ((-1) - 31))) << 6)) & ((-1) - ((b3 + Utf8.REPLACEMENT_BYTE) - (b3 | Utf8.REPLACEMENT_BYTE)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(byte b2, char[] cArr, int i2) {
        cArr[i2] = (char) b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(byte b2) {
        return b2 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zze(byte b2) {
        return b2 < -32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzf(byte b2) {
        return b2 < -16;
    }

    private static boolean zzg(byte b2) {
        return b2 > -65;
    }
}
