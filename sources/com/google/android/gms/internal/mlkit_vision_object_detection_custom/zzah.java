package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzah implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzal zze;

    /* synthetic */ zzah(zzal zzalVar, zzag zzagVar) {
        this.zze = zzalVar;
        this.zzb = zzalVar.zzf;
        this.zzc = zzalVar.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.zzc;
        this.zzd = i2;
        Object objZza = zza(i2);
        this.zzc = this.zze.zzf(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzi.zzd(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i2 = this.zzd;
        zzal zzalVar = this.zze;
        zzalVar.remove(zzal.zzg(zzalVar, i2));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i2);
}
