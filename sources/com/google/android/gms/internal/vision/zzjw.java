package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzjw extends zzju {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: private */
    zzjw() {
        super();
    }

    /* synthetic */ zzjw(zzjx zzjxVar) {
        this();
    }

    private static <L> List<L> zza(Object obj, long j2, int i2) {
        Object obj2;
        List<L> listZzc = zzc(obj, j2);
        if (listZzc.isEmpty()) {
            List<L> zzjsVar = listZzc instanceof zzjv ? new zzjs(i2) : ((listZzc instanceof zzkw) && (listZzc instanceof zzjl)) ? ((zzjl) listZzc).zza(i2) : new ArrayList<>(i2);
            zzma.zza(obj, j2, zzjsVar);
            return zzjsVar;
        }
        if (zza.isAssignableFrom(listZzc.getClass())) {
            ArrayList arrayList = new ArrayList(listZzc.size() + i2);
            arrayList.addAll(listZzc);
            zzma.zza(obj, j2, arrayList);
            obj2 = arrayList;
        } else {
            if (!(listZzc instanceof zzlz)) {
                if (!(listZzc instanceof zzkw) || !(listZzc instanceof zzjl)) {
                    return listZzc;
                }
                zzjl zzjlVar = (zzjl) listZzc;
                if (zzjlVar.zza()) {
                    return listZzc;
                }
                zzjl zzjlVarZza = zzjlVar.zza(listZzc.size() + i2);
                zzma.zza(obj, j2, zzjlVarZza);
                return zzjlVarZza;
            }
            zzjs zzjsVar2 = new zzjs(listZzc.size() + i2);
            zzjsVar2.addAll((zzlz) listZzc);
            zzma.zza(obj, j2, zzjsVar2);
            obj2 = zzjsVar2;
        }
        return (List<L>) obj2;
    }

    private static <E> List<E> zzc(Object obj, long j2) {
        return (List) zzma.zzf(obj, j2);
    }

    @Override // com.google.android.gms.internal.vision.zzju
    final <L> List<L> zza(Object obj, long j2) {
        return zza(obj, j2, 10);
    }

    @Override // com.google.android.gms.internal.vision.zzju
    final <E> void zza(Object obj, Object obj2, long j2) {
        List listZzc = zzc(obj2, j2);
        List listZza = zza(obj, j2, listZzc.size());
        int size = listZza.size();
        int size2 = listZzc.size();
        if (size > 0 && size2 > 0) {
            listZza.addAll(listZzc);
        }
        if (size > 0) {
            listZzc = listZza;
        }
        zzma.zza(obj, j2, listZzc);
    }

    @Override // com.google.android.gms.internal.vision.zzju
    final void zzb(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) zzma.zzf(obj, j2);
        if (list instanceof zzjv) {
            objUnmodifiableList = ((zzjv) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzkw) && (list instanceof zzjl)) {
                zzjl zzjlVar = (zzjl) list;
                if (zzjlVar.zza()) {
                    zzjlVar.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzma.zza(obj, j2, objUnmodifiableList);
    }
}
