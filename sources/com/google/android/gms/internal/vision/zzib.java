package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes8.dex */
final class zzib {
    private final zzii zza;
    private final byte[] zzb;

    private zzib(int i2) {
        byte[] bArr = new byte[i2];
        this.zzb = bArr;
        this.zza = zzii.zza(bArr);
    }

    /* synthetic */ zzib(int i2, zzhs zzhsVar) {
        this(i2);
    }

    public final zzht zza() {
        this.zza.zzb();
        return new zzid(this.zzb);
    }

    public final zzii zzb() {
        return this.zza;
    }
}
