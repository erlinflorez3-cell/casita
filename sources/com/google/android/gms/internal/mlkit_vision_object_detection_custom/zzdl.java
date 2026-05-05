package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzdl {
    private final zznz zza;
    private final Boolean zzb;
    private final Boolean zzc;
    private final zzni zzd = null;
    private final zzqw zze;

    /* synthetic */ zzdl(zzdj zzdjVar, zzdk zzdkVar) {
        this.zza = zzdjVar.zza;
        this.zzb = zzdjVar.zzb;
        this.zzc = zzdjVar.zzc;
        this.zze = zzdjVar.zzd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdl)) {
            return false;
        }
        zzdl zzdlVar = (zzdl) obj;
        if (Objects.equal(this.zza, zzdlVar.zza) && Objects.equal(this.zzb, zzdlVar.zzb) && Objects.equal(this.zzc, zzdlVar.zzc)) {
            zzni zzniVar = zzdlVar.zzd;
            if (Objects.equal(null, null) && Objects.equal(this.zze, zzdlVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, null, this.zze);
    }

    public final zznz zza() {
        return this.zza;
    }

    public final zzqw zzb() {
        return this.zze;
    }

    public final Boolean zzc() {
        return this.zzb;
    }

    public final Boolean zzd() {
        return this.zzc;
    }
}
