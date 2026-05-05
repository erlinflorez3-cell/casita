package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzy implements zzbi {

    @CheckForNull
    private transient Set zza;

    @CheckForNull
    private transient Map zzb;

    zzy() {
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbi) {
            return zzn().equals(((zzbi) obj).zzn());
        }
        return false;
    }

    public final int hashCode() {
        return zzn().hashCode();
    }

    public final String toString() {
        return zzn().toString();
    }

    abstract Map zzh();

    abstract Set zzi();

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzbi
    public boolean zzm(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzbi
    public final Map zzn() {
        Map map = this.zzb;
        if (map != null) {
            return map;
        }
        Map mapZzh = zzh();
        this.zzb = mapZzh;
        return mapZzh;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzbi
    public final Set zzo() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set setZzi = zzi();
        this.zza = setZzi;
        return setZzi;
    }
}
