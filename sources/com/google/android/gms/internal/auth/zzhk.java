package com.google.android.gms.internal.auth;

import com.google.common.base.Ascii;
import okio.Utf8;

/* JADX INFO: loaded from: classes8.dex */
final class zzhk {
    static /* bridge */ /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws zzfb {
        if (zze(b3) || (((b2 << Ascii.FS) + (b3 + 112)) >> 30) != 0 || zze(b4) || zze(b5)) {
            throw zzfb.zzb();
        }
        int i3 = (-1) - (((-1) - (((-1) - (((-1) - ((b2 & 7) << 18)) & ((-1) - (((b3 + Utf8.REPLACEMENT_BYTE) - (b3 | Utf8.REPLACEMENT_BYTE)) << 12)))) | ((b4 & Utf8.REPLACEMENT_BYTE) << 6))) & ((-1) - ((b5 + Utf8.REPLACEMENT_BYTE) - (b5 | Utf8.REPLACEMENT_BYTE))));
        cArr[i2] = (char) ((i3 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i2 + 1] = (char) (((i3 + 1023) - (i3 | 1023)) + Utf8.LOG_SURROGATE_HEADER);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r3
  0x0016: PHI (r3v2 byte) = (r3v1 byte), (r3v5 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void zzb(byte r3, byte r4, byte r5, char[] r6, int r7) throws com.google.android.gms.internal.auth.zzfb {
        /*
            boolean r0 = zze(r4)
            if (r0 != 0) goto L47
            r1 = -96
            r0 = -32
            if (r3 != r0) goto Lf
            if (r4 < r1) goto L47
            r3 = r0
        Lf:
            r0 = -19
            if (r3 != r0) goto L16
            if (r4 >= r1) goto L47
            r3 = r0
        L16:
            boolean r0 = zze(r5)
            if (r0 != 0) goto L47
            r0 = 15
            int r1 = (-1) - r3
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r1 = (-1) - r1
            r0 = 63
            int r3 = r4 + r0
            r4 = r4 | r0
            int r3 = r3 - r4
            r0 = 63
            int r2 = r5 + r0
            r5 = r5 | r0
            int r2 = r2 - r5
            int r1 = r1 << 12
            int r0 = r3 << 6
            int r1 = (-1) - r1
            int r0 = (-1) - r0
            r1 = r1 & r0
            int r0 = (-1) - r1
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 & r0
            int r0 = (-1) - r1
            char r0 = (char) r0
            r6[r7] = r0
            return
        L47:
            com.google.android.gms.internal.auth.zzfb r0 = com.google.android.gms.internal.auth.zzfb.zzb()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzhk.zzb(byte, byte, byte, char[], int):void");
    }

    static /* bridge */ /* synthetic */ void zzc(byte b2, byte b3, char[] cArr, int i2) throws zzfb {
        if (b2 < -62 || zze(b3)) {
            throw zzfb.zzb();
        }
        cArr[i2] = (char) (((b2 & Ascii.US) << 6) | ((-1) - (((-1) - b3) | ((-1) - 63))));
    }

    static /* bridge */ /* synthetic */ boolean zzd(byte b2) {
        return b2 >= 0;
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }
}
