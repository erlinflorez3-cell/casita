package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzbs implements Iterator {
    final Iterator zza;

    zzbs(Iterator it) {
        it.getClass();
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }

    abstract Object zza(Object obj);
}
