package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzbq extends AbstractSet {
    zzbq() {
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return zzbr.zzb(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
