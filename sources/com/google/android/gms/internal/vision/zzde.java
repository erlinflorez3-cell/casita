package com.google.android.gms.internal.vision;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes8.dex */
public final class zzde {
    public static int zza(int i2, int i3) {
        String strZza;
        if (i2 >= 0 && i2 < i3) {
            return i2;
        }
        if (i2 < 0) {
            strZza = zzdg.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2));
        } else {
            if (i3 < 0) {
                throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i3).toString());
            }
            strZza = zzdg.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    @NonNullDecl
    public static <T> T zza(@NonNullDecl T t2) {
        t2.getClass();
        return t2;
    }

    @NonNullDecl
    public static <T> T zza(@NonNullDecl T t2, @NullableDecl Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    private static String zza(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0) {
            return zzdg.zza("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return zzdg.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(new StringBuilder(26).append("negative size: ").append(i3).toString());
    }

    public static void zza(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? zza(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? zza(i3, i4, "end index") : zzdg.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static void zza(boolean z2, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int zzb(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(zza(i2, i3, FirebaseAnalytics.Param.INDEX));
        }
        return i2;
    }

    public static void zzb(boolean z2, @NullableDecl Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
