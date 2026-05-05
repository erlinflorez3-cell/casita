package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes8.dex */
final class zzed<E> extends zzdm<E> {
    private final zzee<E> zza;

    zzed(zzee<E> zzeeVar, int i2) {
        super(zzeeVar.size(), i2);
        this.zza = zzeeVar;
    }

    @Override // com.google.android.gms.internal.vision.zzdm
    protected final E zza(int i2) {
        return this.zza.get(i2);
    }
}
