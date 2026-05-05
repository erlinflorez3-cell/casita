package com.google.android.gms.common;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
class zzw {
    private static final zzw zze = new zzw(true, 3, 1, null, null);
    final boolean zza;

    @Nullable
    final String zzb;

    @Nullable
    final Throwable zzc;
    final int zzd;

    private zzw(boolean z2, int i2, int i3, @Nullable String str, @Nullable Throwable th) {
        this.zza = z2;
        this.zzd = i2;
        this.zzb = str;
        this.zzc = th;
    }

    @Deprecated
    static zzw zzb() {
        return zze;
    }

    static zzw zzc(String str) {
        return new zzw(false, 1, 5, str, null);
    }

    static zzw zzd(String str, Throwable th) {
        return new zzw(false, 1, 5, str, th);
    }

    static zzw zzf(int i2) {
        return new zzw(true, i2, 1, null, null);
    }

    static zzw zzg(int i2, int i3, String str, @Nullable Throwable th) {
        return new zzw(false, i2, i3, str, th);
    }

    @Nullable
    String zza() {
        return this.zzb;
    }

    final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc == null) {
            zza();
        } else {
            zza();
            Throwable th = this.zzc;
        }
    }
}
