package com.google.android.play.core.splitinstall.internal;

import android.os.Build;

/* JADX INFO: loaded from: classes9.dex */
public final class zzao {
    public static zzan zza() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 != 26 ? (i2 == 27 && Build.VERSION.PREVIEW_SDK_INT == 0) ? new zzbe() : new zzbg() : new zzbd();
    }
}
