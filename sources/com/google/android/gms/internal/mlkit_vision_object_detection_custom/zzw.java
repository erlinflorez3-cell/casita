package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzw extends zzy implements Serializable {
    private transient Map zza;
    private transient int zzb;

    protected zzw(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.zza = map;
    }

    static /* bridge */ /* synthetic */ void zzk(zzw zzwVar, Object obj) {
        Object objRemove;
        Map map = zzwVar.zza;
        map.getClass();
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzwVar.zzb -= size;
        }
    }

    abstract Collection zza();

    Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zze(Object obj) {
        Collection collectionZza = (Collection) this.zza.get(obj);
        if (collectionZza == null) {
            collectionZza = zza();
        }
        return zzb(obj, collectionZza);
    }

    final List zzf(Object obj, List list, @CheckForNull zzt zztVar) {
        return list instanceof RandomAccess ? new zzr(this, obj, list, zztVar) : new zzv(this, obj, list, zztVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzy
    final Map zzh() {
        return new zzo(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzy
    final Set zzi() {
        return new zzq(this, this.zza);
    }

    public final void zzl() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzy, com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzbi
    public final boolean zzm(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}
