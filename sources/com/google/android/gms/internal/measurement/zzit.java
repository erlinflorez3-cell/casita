package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes8.dex */
final class zzit {
    private final zzjc zza;
    private final byte[] zzb;

    private zzit(int i2) {
        byte[] bArr = new byte[i2];
        this.zzb = bArr;
        this.zza = zzjc.zzb(bArr);
    }

    public final zzik zza() {
        this.zza.zzb();
        return new zziv(this.zzb);
    }

    public final zzjc zzb() {
        return this.zza;
    }
}
