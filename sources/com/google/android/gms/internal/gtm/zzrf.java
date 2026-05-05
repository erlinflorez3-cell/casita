package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzrf implements Iterator {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ Iterator zzb;

    zzrf(zzrg zzrgVar, Iterator it, Iterator it2) {
        this.zza = it;
        this.zzb = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.zza.hasNext() ? ((zzre) this.zza).next() : (zzqz) this.zzb.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
