package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzys extends zzyu {
    private zzys() {
        super(null);
    }

    /* synthetic */ zzys(zzyr zzyrVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    final List zza(Object obj, long j2) {
        zzyd zzydVar = (zzyd) zzaau.zzf(obj, j2);
        if (zzydVar.zzc()) {
            return zzydVar;
        }
        int size = zzydVar.size();
        zzyd zzydVarZzd = zzydVar.zzd(size == 0 ? 10 : size + size);
        zzaau.zzs(obj, j2, zzydVarZzd);
        return zzydVarZzd;
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    final void zzb(Object obj, long j2) {
        ((zzyd) zzaau.zzf(obj, j2)).zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    final void zzc(Object obj, Object obj2, long j2) {
        zzyd zzydVarZzd = (zzyd) zzaau.zzf(obj, j2);
        zzyd zzydVar = (zzyd) zzaau.zzf(obj2, j2);
        int size = zzydVarZzd.size();
        int size2 = zzydVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzydVarZzd.zzc()) {
                zzydVarZzd = zzydVarZzd.zzd(size2 + size);
            }
            zzydVarZzd.addAll(zzydVar);
        }
        if (size > 0) {
            zzydVar = zzydVarZzd;
        }
        zzaau.zzs(obj, j2, zzydVar);
    }
}
