package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.CrashUtils;

/* JADX INFO: loaded from: classes8.dex */
final class zzgv {
    public static void zza(String str, Context context) {
        zzho.zza(str);
        if (CrashUtils.addDynamiteErrorToDropBox(context, new RuntimeException(str))) {
            zzho.zzd("Crash reported successfully.");
        } else {
            zzho.zzd("Failed to report crash");
        }
    }

    public static void zzb(String str, Throwable th, Context context) {
        zzho.zzb(str, th);
        if (CrashUtils.addDynamiteErrorToDropBox(context, th)) {
            zzho.zzd("Crash reported successfully.");
        } else {
            zzho.zzd("Failed to report crash");
        }
    }

    public static void zzc(String str, Context context) {
        zzho.zze(str);
        if (CrashUtils.addDynamiteErrorToDropBox(context, new RuntimeException(str))) {
            zzho.zzd("Crash reported successfully.");
        } else {
            zzho.zzd("Failed to report crash");
        }
    }
}
