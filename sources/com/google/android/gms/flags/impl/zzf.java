package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
public final class zzf extends zza<Long> {
    public static Long zza(SharedPreferences sharedPreferences, String str, Long l2) {
        try {
            return (Long) com.google.android.gms.internal.flags.zze.zza(new zzg(sharedPreferences, str, l2));
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            if (strValueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(strValueOf);
            } else {
                new String("Flag value not available, returning default: ");
            }
            return l2;
        }
    }
}
