package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes9.dex */
final class zzw implements Runnable {
    final /* synthetic */ SplitInstallSessionState zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzx zzd;

    zzw(zzx zzxVar, SplitInstallSessionState splitInstallSessionState, int i2, int i3) {
        this.zzd = zzxVar;
        this.zza = splitInstallSessionState;
        this.zzb = i2;
        this.zzc = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzx zzxVar = this.zzd;
        SplitInstallSessionState splitInstallSessionState = this.zza;
        zzxVar.zzk(new zza(splitInstallSessionState.sessionId(), this.zzb, this.zzc, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.zzb(), splitInstallSessionState.zza(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.zzc()));
    }
}
