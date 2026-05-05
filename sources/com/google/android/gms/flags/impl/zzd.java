package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
public final class zzd extends zza<Integer> {
    public static Integer zza(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) com.google.android.gms.internal.flags.zze.zza(new zze(sharedPreferences, str, num));
        } catch (Exception e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            if (strValueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(strValueOf);
            } else {
                new String("Flag value not available, returning default: ");
            }
            return num;
        }
    }
}
