package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.Logger;

/* JADX INFO: loaded from: classes8.dex */
final class zzcw implements Logger {
    private int zza = 2;
    private boolean zzb;

    zzcw() {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void error(Exception exc) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void error(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final int getLogLevel() {
        return this.zza;
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void info(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void setLogLevel(int i2) {
        this.zza = i2;
        if (this.zzb) {
            return;
        }
        String str = "Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + ((String) zzew.zzc.zzb()) + " DEBUG";
        this.zzb = true;
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void verbose(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void warn(String str) {
    }
}
