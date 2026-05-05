package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzon {
    private final zzoj zza;
    private final zzol zzb = null;
    private final zzol zzc = null;
    private final Boolean zzd = null;

    /* synthetic */ zzon(zzok zzokVar, zzom zzomVar) {
        this.zza = zzokVar.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzon)) {
            return false;
        }
        zzon zzonVar = (zzon) obj;
        if (Objects.equal(this.zza, zzonVar.zza)) {
            zzol zzolVar = zzonVar.zzb;
            if (Objects.equal(null, null)) {
                zzol zzolVar2 = zzonVar.zzc;
                if (Objects.equal(null, null)) {
                    Boolean bool = zzonVar.zzd;
                    if (Objects.equal(null, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, null, null);
    }

    public final zzoj zza() {
        return this.zza;
    }
}
