package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzjk implements Runnable {
    final /* synthetic */ zzjl zza;

    zzjk(zzjl zzjlVar) {
        this.zza = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zza.isEmpty()) {
            zzho.zze("TagManagerBackend dispatch called without loaded container.");
            return;
        }
        Iterator it = this.zza.zza.values().iterator();
        while (it.hasNext()) {
            ((zzgs) it.next()).zzs();
        }
    }
}
