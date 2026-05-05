package com.google.android.play.core.splitcompat;

/* JADX INFO: loaded from: classes9.dex */
final class zzq implements Runnable {
    final /* synthetic */ SplitCompat zza;

    zzq(SplitCompat splitCompat) {
        this.zza = splitCompat;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        try {
            this.zza.zzc.zzk();
        } catch (Exception e2) {
        }
    }
}
