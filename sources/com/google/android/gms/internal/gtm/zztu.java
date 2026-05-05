package com.google.android.gms.internal.gtm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
final class zztu extends zztw {
    final /* synthetic */ zzud zza;
    private int zzb = 0;
    private final int zzc;

    zztu(zzud zzudVar) {
        this.zza = zzudVar;
        this.zzc = zzudVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzty
    public final byte zza() {
        int i2 = this.zzb;
        if (i2 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i2 + 1;
        return this.zza.zzb(i2);
    }
}
