package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzbfe {
    zzbfe() {
    }

    public static final List zza(Object obj, long j2) {
        zzbet zzbetVar = (zzbet) zzbhk.zzf(obj, j2);
        if (zzbetVar.zzc()) {
            return zzbetVar;
        }
        int size = zzbetVar.size();
        zzbet zzbetVarZzd = zzbetVar.zzd(size == 0 ? 10 : size + size);
        zzbhk.zzs(obj, j2, zzbetVarZzd);
        return zzbetVarZzd;
    }
}
