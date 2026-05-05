package com.google.android.gms.analytics;

import androidx.core.app.NotificationCompat;
import com.facebook.common.callercontext.ContextChain;
import com.google.android.gms.internal.gtm.zzfc;

/* JADX INFO: loaded from: classes8.dex */
public final class zzd {
    public static String zza(int i2) {
        return zzn("&cd", i2);
    }

    public static String zzb(int i2) {
        return zzn("cd", i2);
    }

    public static String zzc(int i2) {
        return zzn("cd", i2);
    }

    public static String zzd(int i2) {
        return zzn("&cm", i2);
    }

    public static String zze(int i2) {
        return zzn("cm", i2);
    }

    public static String zzf(int i2) {
        return zzn("cm", i2);
    }

    public static String zzg(int i2) {
        return zzn("&il", i2);
    }

    public static String zzh(int i2) {
        return zzn("il", i2);
    }

    public static String zzi(int i2) {
        return zzn(ContextChain.TAG_PRODUCT_AND_INFRA, i2);
    }

    public static String zzj(int i2) {
        return zzn("&pr", i2);
    }

    public static String zzk(int i2) {
        return zzn("pr", i2);
    }

    public static String zzl(int i2) {
        return zzn("&promo", i2);
    }

    public static String zzm(int i2) {
        return zzn(NotificationCompat.CATEGORY_PROMO, i2);
    }

    private static String zzn(String str, int i2) {
        if (i2 <= 0) {
            zzfc.zzb("index out of range for prefix", str);
            return "";
        }
        return str + i2;
    }
}
