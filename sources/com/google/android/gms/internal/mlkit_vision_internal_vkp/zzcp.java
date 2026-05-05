package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcp {
    public static final zzcp zza = new zzcp("VisionKit", 2);
    private final String zzb = "VisionKit";

    public zzcp(String str, int i2) {
    }

    private final boolean zzd(int i2) {
        return Log.isLoggable(this.zzb, i2);
    }

    private static final String zze(Object obj, String str, Object... objArr) {
        String str2;
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (obj instanceof Class) {
                name = ((Class) obj).getName();
            }
            String[] strArrSplit = name.split("\\.");
            int length = strArrSplit.length;
            str2 = length == 0 ? "" : strArrSplit[length - 1];
        }
        return "[" + str2 + "] " + str;
    }

    public final void zza(Throwable th, String str, Object... objArr) {
        if (zzd(6)) {
            String str2 = this.zzb;
        }
    }

    public final void zzb(@Nullable Object obj, String str, Object... objArr) {
        if (zzd(4)) {
            String str2 = this.zzb;
            zze(obj, str, objArr);
        }
    }

    public final void zzc(@Nullable Object obj, String str, Object... objArr) {
        if (zzd(5)) {
            String str2 = this.zzb;
            zze(obj, str, objArr);
        }
    }
}
