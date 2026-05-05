package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.Logger;

/* JADX INFO: loaded from: classes8.dex */
final class zzjr implements Logger {
    zzjr() {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void error(Exception exc) {
        zzho.zzb("", exc);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void error(String str) {
        zzho.zza(str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final int getLogLevel() {
        return 3;
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void info(String str) {
        zzho.zzc(str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void setLogLevel(int i2) {
        zzho.zze("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void verbose(String str) {
        zzho.zzd(str);
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void warn(String str) {
        zzho.zze(str);
    }
}
