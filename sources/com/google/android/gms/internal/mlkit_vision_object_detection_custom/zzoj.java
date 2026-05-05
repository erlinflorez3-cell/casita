package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzoj {
    private final zzoh zzc;
    private final String zze;
    private final zzog zzf;
    private final Long zzg;
    private final Boolean zzi;
    private final String zza = null;
    private final String zzb = null;
    private final String zzd = null;
    private final Boolean zzh = null;

    /* synthetic */ zzoj(zzof zzofVar, zzoi zzoiVar) {
        this.zzc = zzofVar.zza;
        this.zze = zzofVar.zzb;
        this.zzf = zzofVar.zzc;
        this.zzg = zzofVar.zzd;
        this.zzi = zzofVar.zze;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzoj)) {
            return false;
        }
        zzoj zzojVar = (zzoj) obj;
        String str = zzojVar.zza;
        if (Objects.equal(null, null)) {
            String str2 = zzojVar.zzb;
            if (Objects.equal(null, null) && Objects.equal(this.zzc, zzojVar.zzc)) {
                String str3 = zzojVar.zzd;
                if (Objects.equal(null, null) && Objects.equal(this.zze, zzojVar.zze) && Objects.equal(this.zzf, zzojVar.zzf) && Objects.equal(this.zzg, zzojVar.zzg)) {
                    Boolean bool = zzojVar.zzh;
                    if (Objects.equal(null, null) && Objects.equal(this.zzi, zzojVar.zzi)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(null, null, this.zzc, null, this.zze, this.zzf, this.zzg, null, this.zzi);
    }

    public final zzog zza() {
        return this.zzf;
    }

    public final zzoh zzb() {
        return this.zzc;
    }

    public final Boolean zzc() {
        return this.zzi;
    }

    public final Long zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zze;
    }
}
