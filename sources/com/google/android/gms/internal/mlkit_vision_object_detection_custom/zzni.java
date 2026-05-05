package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzni {
    private final zzng zza;
    private final Integer zzb;
    private final Integer zzc = null;
    private final Boolean zzd = null;

    /* synthetic */ zzni(zznf zznfVar, zznh zznhVar) {
        this.zza = zznfVar.zza;
        this.zzb = zznfVar.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzni)) {
            return false;
        }
        zzni zzniVar = (zzni) obj;
        if (Objects.equal(this.zza, zzniVar.zza) && Objects.equal(this.zzb, zzniVar.zzb)) {
            Integer num = zzniVar.zzc;
            if (Objects.equal(null, null)) {
                Boolean bool = zzniVar.zzd;
                if (Objects.equal(null, null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, null, null);
    }

    public final zzng zza() {
        return this.zza;
    }

    public final Integer zzb() {
        return this.zzb;
    }
}
