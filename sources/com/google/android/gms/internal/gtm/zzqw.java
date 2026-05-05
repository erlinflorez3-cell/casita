package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzqw implements Iterator {
    final /* synthetic */ Iterator zza;

    zzqw(zzqz zzqzVar, Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzrk((String) this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
