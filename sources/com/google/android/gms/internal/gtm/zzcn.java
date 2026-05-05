package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
final class zzcn implements Callable {
    final /* synthetic */ zzcp zza;

    zzcn(zzcp zzcpVar) {
        this.zza = zzcpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return this.zza.zzc();
    }
}
