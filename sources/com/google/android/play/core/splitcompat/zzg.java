package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
final class zzg implements zzl {
    final /* synthetic */ zzh zza;

    zzg(zzh zzhVar) {
        this.zza = zzhVar;
    }

    @Override // com.google.android.play.core.splitcompat.zzl
    public final void zza(zzm zzmVar, File file, boolean z2) throws IOException {
        this.zza.zzb.add(file);
        if (z2) {
            return;
        }
        this.zza.zzc.set(false);
    }
}
