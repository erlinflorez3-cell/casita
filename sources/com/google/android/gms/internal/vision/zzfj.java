package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes8.dex */
final class zzfj extends zzfd {
    zzfj() {
    }

    @Override // com.google.android.gms.internal.vision.zzfd
    public final void zza(Throwable th) {
        th.printStackTrace();
    }

    @Override // com.google.android.gms.internal.vision.zzfd
    public final void zza(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }
}
