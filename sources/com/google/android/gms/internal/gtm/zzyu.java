package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzyu {
    private static final zzyu zza = new zzyq(null);
    private static final zzyu zzb = new zzys(0 == true ? 1 : 0);

    /* synthetic */ zzyu(zzyt zzytVar) {
    }

    static zzyu zzd() {
        return zza;
    }

    static zzyu zze() {
        return zzb;
    }

    abstract List zza(Object obj, long j2);

    abstract void zzb(Object obj, long j2);

    abstract void zzc(Object obj, Object obj2, long j2);
}
