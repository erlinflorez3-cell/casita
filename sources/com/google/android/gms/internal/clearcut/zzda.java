package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzda extends zzcy {
    private static final Class<?> zzlv = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: private */
    zzda() {
        super();
    }

    /* synthetic */ zzda(zzcz zzczVar) {
        this();
    }

    private static <E> List<E> zzb(Object obj, long j2) {
        return (List) zzfd.zzo(obj, j2);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcy
    final void zza(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) zzfd.zzo(obj, j2);
        if (list instanceof zzcx) {
            objUnmodifiableList = ((zzcx) list).zzbu();
        } else if (zzlv.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        zzfd.zza(obj, j2, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcy
    final <E> void zza(Object obj, Object obj2, long j2) {
        List list;
        List list2;
        List listZzb = zzb(obj2, j2);
        int size = listZzb.size();
        List listZzb2 = zzb(obj, j2);
        if (listZzb2.isEmpty()) {
            List zzcwVar = listZzb2 instanceof zzcx ? new zzcw(size) : new ArrayList(size);
            zzfd.zza(obj, j2, zzcwVar);
            list2 = zzcwVar;
        } else {
            if (zzlv.isAssignableFrom(listZzb2.getClass())) {
                ArrayList arrayList = new ArrayList(listZzb2.size() + size);
                arrayList.addAll(listZzb2);
                list = arrayList;
            } else {
                boolean z2 = listZzb2 instanceof zzfa;
                list2 = listZzb2;
                if (z2) {
                    zzcw zzcwVar2 = new zzcw(listZzb2.size() + size);
                    zzcwVar2.addAll((zzfa) listZzb2);
                    list = zzcwVar2;
                }
            }
            zzfd.zza(obj, j2, list);
            list2 = list;
        }
        int size2 = list2.size();
        int size3 = listZzb.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(listZzb);
        }
        if (size2 > 0) {
            listZzb = list2;
        }
        zzfd.zza(obj, j2, listZzb);
    }
}
