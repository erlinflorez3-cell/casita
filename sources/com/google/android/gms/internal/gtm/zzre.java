package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
final class zzre implements Iterator {
    final /* synthetic */ zzrg zza;
    private int zzb = 0;

    zzre(zzrg zzrgVar) {
        this.zza = zzrgVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        for (int i2 = this.zzb; i2 < this.zza.zzc.size(); i2++) {
            if (this.zza.zzc.get(i2) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzqz next() {
        if (this.zzb >= this.zza.zzc.size()) {
            throw new NoSuchElementException();
        }
        for (int i2 = this.zzb; i2 < this.zza.zzc.size(); i2++) {
            if (this.zza.zzc.get(i2) != null) {
                this.zzb = i2;
                int i3 = this.zzb;
                this.zzb = i3 + 1;
                return new zzrb(Double.valueOf(i3));
            }
        }
        throw new NoSuchElementException();
    }
}
