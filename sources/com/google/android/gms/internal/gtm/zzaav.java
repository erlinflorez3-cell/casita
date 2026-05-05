package com.google.android.gms.internal.gtm;

import com.google.common.base.Ascii;
import okio.Utf8;

/* JADX INFO: loaded from: classes8.dex */
final class zzaav {
    static /* bridge */ /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws zzyg {
        if (zze(b3) || (((b2 << Ascii.FS) + (b3 + 112)) >> 30) != 0 || zze(b4) || zze(b5)) {
            throw zzyg.zzd();
        }
        int i3 = b3 & Utf8.REPLACEMENT_BYTE;
        int i4 = (-1) - (((-1) - ((b2 & 7) << 18)) & ((-1) - (i3 << 12)));
        int i5 = ((b4 + Utf8.REPLACEMENT_BYTE) - (b4 | Utf8.REPLACEMENT_BYTE)) << 6;
        int i6 = (-1) - (((-1) - ((i4 + i5) - (i4 & i5))) & ((-1) - ((b5 + Utf8.REPLACEMENT_BYTE) - (b5 | Utf8.REPLACEMENT_BYTE))));
        cArr[i2] = (char) ((i6 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i2 + 1] = (char) ((i6 & 1023) + Utf8.LOG_SURROGATE_HEADER);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v2 byte) = (r2v1 byte), (r2v5 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* bridge */ /* synthetic */ void zzb(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.gtm.zzyg {
        /*
            boolean r0 = zze(r3)
            if (r0 != 0) goto L41
            r1 = -96
            r0 = -32
            if (r2 != r0) goto Lf
            if (r3 < r1) goto L41
            r2 = r0
        Lf:
            r0 = -19
            if (r2 != r0) goto L16
            if (r3 >= r1) goto L41
            r2 = r0
        L16:
            boolean r0 = zze(r4)
            if (r0 != 0) goto L41
            r0 = 15
            int r1 = (-1) - r2
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r1 = (-1) - r1
            r0 = 63
            int r2 = r3 + r0
            r3 = r3 | r0
            int r2 = r2 - r3
            r0 = 63
            r4 = r4 & r0
            int r1 = r1 << 12
            int r0 = r2 << 6
            int r1 = (-1) - r1
            int r0 = (-1) - r0
            r1 = r1 & r0
            int r1 = (-1) - r1
            int r0 = r1 + r4
            r1 = r1 & r4
            int r0 = r0 - r1
            char r0 = (char) r0
            r5[r6] = r0
            return
        L41:
            com.google.android.gms.internal.gtm.zzyg r0 = com.google.android.gms.internal.gtm.zzyg.zzd()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzaav.zzb(byte, byte, byte, char[], int):void");
    }

    static /* bridge */ /* synthetic */ void zzc(byte b2, byte b3, char[] cArr, int i2) throws zzyg {
        if (b2 < -62 || zze(b3)) {
            throw zzyg.zzd();
        }
        cArr[i2] = (char) ((-1) - (((-1) - (((-1) - (((-1) - b2) | ((-1) - 31))) << 6)) & ((-1) - ((-1) - (((-1) - b3) | ((-1) - 63))))));
    }

    static /* bridge */ /* synthetic */ boolean zzd(byte b2) {
        return b2 >= 0;
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }
}
