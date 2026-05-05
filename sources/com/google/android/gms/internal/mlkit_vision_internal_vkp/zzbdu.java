package com.google.android.gms.internal.mlkit_vision_internal_vkp;

/* JADX INFO: loaded from: classes8.dex */
final class zzbdu {
    private final Object zza;
    private final int zzb;

    zzbdu(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbdu)) {
            return false;
        }
        zzbdu zzbduVar = (zzbdu) obj;
        return this.zza == zzbduVar.zza && this.zzb == zzbduVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
