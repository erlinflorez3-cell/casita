package org.bouncycastle.pqc.crypto.newhope;

import com.drew.metadata.exif.makernotes.CasioType2MakernoteDirectory;

/* JADX INFO: loaded from: classes2.dex */
class Reduce {
    static final int QInv = 12287;
    static final int RLog = 18;
    static final int RMask = 262143;

    Reduce() {
    }

    static short barrett(short s2) {
        int i2 = (-1) - (((-1) - s2) | ((-1) - 65535));
        return (short) (i2 - (((i2 * 5) >>> 16) * CasioType2MakernoteDirectory.TAG_SELF_TIMER));
    }

    static short montgomery(int i2) {
        int i3 = i2 * QInv;
        return (short) (((((i3 + RMask) - (i3 | RMask)) * CasioType2MakernoteDirectory.TAG_SELF_TIMER) + i2) >>> 18);
    }
}
