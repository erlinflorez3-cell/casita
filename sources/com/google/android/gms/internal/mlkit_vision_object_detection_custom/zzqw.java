package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzqw {
    private final zzqu zza;
    private final Boolean zzb;
    private final Boolean zzc;
    private final Integer zzd;
    private final Float zze;
    private final zzon zzf;

    /* synthetic */ zzqw(zzqt zzqtVar, zzqv zzqvVar) {
        this.zza = zzqtVar.zza;
        this.zzb = zzqtVar.zzb;
        this.zzc = zzqtVar.zzc;
        this.zzd = zzqtVar.zzd;
        this.zze = zzqtVar.zze;
        this.zzf = zzqtVar.zzf;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqw)) {
            return false;
        }
        zzqw zzqwVar = (zzqw) obj;
        return Objects.equal(this.zza, zzqwVar.zza) && Objects.equal(this.zzb, zzqwVar.zzb) && Objects.equal(this.zzc, zzqwVar.zzc) && Objects.equal(this.zzd, zzqwVar.zzd) && Objects.equal(this.zze, zzqwVar.zze) && Objects.equal(this.zzf, zzqwVar.zzf);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }

    public final zzon zza() {
        return this.zzf;
    }

    public final zzqu zzb() {
        return this.zza;
    }

    public final Boolean zzc() {
        return this.zzc;
    }

    public final Boolean zzd() {
        return this.zzb;
    }

    public final Float zze() {
        return this.zze;
    }

    public final Integer zzf() {
        return this.zzd;
    }
}
