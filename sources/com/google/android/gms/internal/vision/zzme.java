package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzme {
    zzme() {
    }

    abstract int zza(int i2, byte[] bArr, int i3, int i4);

    abstract int zza(CharSequence charSequence, byte[] bArr, int i2, int i3);

    final boolean zza(byte[] bArr, int i2, int i3) {
        return zza(0, bArr, i2, i3) == 0;
    }

    abstract String zzb(byte[] bArr, int i2, int i3) throws zzjk;
}
