package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
public final class zzb extends zza<Boolean> {
    public static Boolean zza(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) com.google.android.gms.internal.flags.zze.zza(new zzc(sharedPreferences, str, bool));
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            if (strValueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(strValueOf);
            } else {
                new String("Flag value not available, returning default: ");
            }
            return bool;
        }
    }
}
