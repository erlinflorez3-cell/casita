package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes8.dex */
final class zzo extends zzn {
    private final char zza;

    zzo(char c2) {
        this.zza = c2;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = this.zza;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt((i2 + 15) - (15 | i2));
            i2 >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    @Override // com.google.android.gms.internal.common.zzr
    public final boolean zza(char c2) {
        return c2 == this.zza;
    }
}
