package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzyq extends zzyu {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzyq() {
        super(null);
    }

    /* synthetic */ zzyq(zzyp zzypVar) {
        super(null);
    }

    private static List zzf(Object obj, long j2, int i2) {
        List list;
        List list2 = (List) zzaau.zzf(obj, j2);
        if (list2.isEmpty()) {
            List zzynVar = list2 instanceof zzyo ? new zzyn(i2) : ((list2 instanceof zzzo) && (list2 instanceof zzyd)) ? ((zzyd) list2).zzd(i2) : new ArrayList(i2);
            zzaau.zzs(obj, j2, zzynVar);
            return zzynVar;
        }
        if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i2);
            arrayList.addAll(list2);
            zzaau.zzs(obj, j2, arrayList);
            list = arrayList;
        } else {
            if (!(list2 instanceof zzaap)) {
                if (!(list2 instanceof zzzo) || !(list2 instanceof zzyd)) {
                    return list2;
                }
                zzyd zzydVar = (zzyd) list2;
                if (zzydVar.zzc()) {
                    return list2;
                }
                zzyd zzydVarZzd = zzydVar.zzd(list2.size() + i2);
                zzaau.zzs(obj, j2, zzydVarZzd);
                return zzydVarZzd;
            }
            zzyn zzynVar2 = new zzyn(list2.size() + i2);
            zzynVar2.addAll(zzynVar2.size(), (zzaap) list2);
            zzaau.zzs(obj, j2, zzynVar2);
            list = zzynVar2;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    final List zza(Object obj, long j2) {
        return zzf(obj, j2, 10);
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    final void zzb(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) zzaau.zzf(obj, j2);
        if (list instanceof zzyo) {
            objUnmodifiableList = ((zzyo) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzzo) && (list instanceof zzyd)) {
                zzyd zzydVar = (zzyd) list;
                if (zzydVar.zzc()) {
                    zzydVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzaau.zzs(obj, j2, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.gtm.zzyu
    final void zzc(Object obj, Object obj2, long j2) {
        List list = (List) zzaau.zzf(obj2, j2);
        List listZzf = zzf(obj, j2, list.size());
        int size = listZzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listZzf.addAll(list);
        }
        if (size > 0) {
            list = listZzf;
        }
        zzaau.zzs(obj, j2, list);
    }
}
