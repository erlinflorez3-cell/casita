package com.google.android.play.core.splitcompat;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class zzr implements Runnable {
    final /* synthetic */ Set zza;
    final /* synthetic */ SplitCompat zzb;

    zzr(SplitCompat splitCompat, Set set) {
        this.zzb = splitCompat;
        this.zza = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzg(this.zza);
        } catch (Exception e2) {
        }
    }
}
