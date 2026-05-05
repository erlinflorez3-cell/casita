package com.google.android.gms.internal.gtm;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes8.dex */
final class zzja implements ComponentCallbacks2 {
    final /* synthetic */ zzjh zza;

    zzja(zzjh zzjhVar) {
        this.zza = zzjhVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20) {
            this.zza.zzg.execute(new zziz(this));
        }
    }
}
