package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
final class zzzb {
    zzzb() {
    }

    public static final boolean zza(Object obj) {
        return !((zzza) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzza zzzaVarZzb = (zzza) obj;
        zzza zzzaVar = (zzza) obj2;
        if (!zzzaVar.isEmpty()) {
            if (!zzzaVarZzb.zze()) {
                zzzaVarZzb = zzzaVarZzb.zzb();
            }
            zzzaVarZzb.zzd(zzzaVar);
        }
        return zzzaVarZzb;
    }
}
