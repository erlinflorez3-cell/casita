package com.google.android.play.core.splitinstall.testing;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class zzq implements com.google.android.play.core.splitinstall.zzf {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ List zze;
    final /* synthetic */ FakeSplitInstallManager zzf;

    zzq(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, long j2, boolean z2, List list3) {
        this.zzf = fakeSplitInstallManager;
        this.zza = list;
        this.zzb = list2;
        this.zzc = j2;
        this.zzd = z2;
        this.zze = list3;
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zza() throws Throwable {
        this.zzf.zzr(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzb(int i2) throws Throwable {
        this.zzf.zzs(6, i2, null, null, null, null, null);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzc() {
        if (this.zzd) {
            return;
        }
        this.zzf.zzp(this.zze, this.zza, this.zzb, this.zzc, true);
    }
}
