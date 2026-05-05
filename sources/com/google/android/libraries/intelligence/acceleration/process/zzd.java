package com.google.android.libraries.intelligence.acceleration.process;

import android.app.Activity;

/* JADX INFO: loaded from: classes8.dex */
final class zzd extends zza {
    final /* synthetic */ zze zza;

    zzd(zze zzeVar) {
        this.zza = zzeVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        this.zza.zza.zzc();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        this.zza.zza.zzd();
    }
}
