package com.google.android.gms.internal.tapandpay;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
final class zzca extends zzcf {
    private final Object zza;
    private boolean zzb;

    zzca(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
