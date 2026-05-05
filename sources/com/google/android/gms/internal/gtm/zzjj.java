package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzjj implements Runnable {
    final /* synthetic */ zzgz zza;
    final /* synthetic */ zzjl zzb;

    zzjj(zzjl zzjlVar, zzgz zzgzVar) {
        this.zzb = zzjlVar;
        this.zza = zzgzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb.zza.isEmpty()) {
            zzho.zza("TagManagerBackend emit called without loaded container.");
            return;
        }
        Iterator it = this.zzb.zza.values().iterator();
        while (it.hasNext()) {
            ((zzgs) it.next()).zzt(this.zza);
        }
    }
}
