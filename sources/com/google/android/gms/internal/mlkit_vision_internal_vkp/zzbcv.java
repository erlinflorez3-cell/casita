package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
final class zzbcv extends zzbcw {
    final /* synthetic */ zzbdd zza;
    private int zzb = 0;
    private final int zzc;

    zzbcv(zzbdd zzbddVar) {
        this.zza = zzbddVar;
        this.zzc = zzbddVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbcy
    public final byte zza() {
        int i2 = this.zzb;
        if (i2 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i2 + 1;
        return this.zza.zzb(i2);
    }
}
