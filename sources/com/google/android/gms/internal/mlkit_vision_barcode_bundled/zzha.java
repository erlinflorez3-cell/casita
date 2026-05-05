package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.common.base.Ascii;
import okio.Utf8;

/* JADX INFO: loaded from: classes8.dex */
final class zzha {
    static /* bridge */ /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws zzer {
        if (zze(b3) || (((b2 << Ascii.FS) + (b3 + 112)) >> 30) != 0 || zze(b4) || zze(b5)) {
            throw new zzer("Protocol message had invalid UTF-8.");
        }
        int i3 = (-1) - (((-1) - (((b2 + 7) - (b2 | 7)) << 18)) & ((-1) - (((-1) - (((-1) - b3) | ((-1) - 63))) << 12)));
        int i4 = (-1) - (((-1) - ((-1) - (((-1) - i3) & ((-1) - ((b4 & Utf8.REPLACEMENT_BYTE) << 6))))) & ((-1) - ((b5 + Utf8.REPLACEMENT_BYTE) - (b5 | Utf8.REPLACEMENT_BYTE))));
        cArr[i2] = (char) ((i4 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i2 + 1] = (char) ((i4 & 1023) + Utf8.LOG_SURROGATE_HEADER);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r5
  0x0016: PHI (r5v2 byte) = (r5v1 byte), (r5v4 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void zzb(byte r5, byte r6, byte r7, char[] r8, int r9) throws com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer {
        /*
            boolean r0 = zze(r6)
            if (r0 != 0) goto L3e
            r1 = -96
            r0 = -32
            if (r5 != r0) goto Lf
            if (r6 < r1) goto L3e
            r5 = r0
        Lf:
            r0 = -19
            if (r5 != r0) goto L16
            if (r6 >= r1) goto L3e
            r5 = r0
        L16:
            boolean r0 = zze(r7)
            if (r0 != 0) goto L3e
            r0 = 15
            int r4 = r5 + r0
            r5 = r5 | r0
            int r4 = r4 - r5
            r0 = 63
            int r1 = (-1) - r6
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r3 = (-1) - r1
            r0 = 63
            int r1 = (-1) - r7
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r2 = (-1) - r1
            int r1 = r4 << 12
            int r0 = r3 << 6
            r1 = r1 | r0
            r1 = r1 | r2
            char r0 = (char) r1
            r8[r9] = r0
            return
        L3e:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer r1 = new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzha.zzb(byte, byte, byte, char[], int):void");
    }

    static /* bridge */ /* synthetic */ void zzc(byte b2, byte b3, char[] cArr, int i2) throws zzer {
        if (b2 < -62 || zze(b3)) {
            throw new zzer("Protocol message had invalid UTF-8.");
        }
        cArr[i2] = (char) ((-1) - (((-1) - ((b2 & Ascii.US) << 6)) & ((-1) - (b3 & Utf8.REPLACEMENT_BYTE))));
    }

    static /* bridge */ /* synthetic */ boolean zzd(byte b2) {
        return b2 >= 0;
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }
}
