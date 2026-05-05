package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
abstract class zztw implements zzty {
    zztw() {
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
