package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbn {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    static boolean zzb(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzbf) {
            collection = ((zzbf) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zzc(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    static boolean zzc(Set set, Iterator it) {
        ?? r2 = 0;
        while (it.hasNext()) {
            boolean zRemove = set.remove(it.next());
            int i2 = (r2 + (zRemove ? 1 : 0)) - (r2 & (zRemove ? 1 : 0));
            r2 = 1;
            if (i2 != 1) {
                r2 = 0;
            }
        }
        return r2;
    }
}
