package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzbgs implements Iterator {
    final /* synthetic */ zzbgw zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzbgs(zzbgw zzbgwVar, zzbgr zzbgrVar) {
        this.zza = zzbgwVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.zzb + 1;
        zzbgw zzbgwVar = this.zza;
        if (i2 >= zzbgwVar.zzb) {
            return !zzbgwVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        zzbgw zzbgwVar = this.zza;
        return i2 < zzbgwVar.zzb ? (zzbgq) zzbgwVar.zza[i2] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i2 = this.zzb;
        zzbgw zzbgwVar = this.zza;
        if (i2 >= zzbgwVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i2 - 1;
            zzbgwVar.zzm(i2);
        }
    }
}
