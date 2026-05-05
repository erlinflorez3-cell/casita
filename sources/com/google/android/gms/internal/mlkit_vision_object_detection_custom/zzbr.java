package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbr {
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
        if (collection instanceof zzbj) {
            collection = ((zzbj) collection).zza();
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
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    static boolean zzc(Set set, Iterator it) {
        ?? r1 = 0;
        while (it.hasNext()) {
            int i2 = (-1) - (((-1) - r1) & ((-1) - (set.remove(it.next()) ? 1 : 0)));
            r1 = 1;
            if (i2 != 1) {
                r1 = 0;
            }
        }
        return r1;
    }
}
