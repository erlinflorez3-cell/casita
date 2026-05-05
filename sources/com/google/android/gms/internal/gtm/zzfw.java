package com.google.android.gms.internal.gtm;

import android.os.Build;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfw {
    public static final int zza;

    static {
        zza = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
