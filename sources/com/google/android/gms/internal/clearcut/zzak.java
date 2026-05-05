package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes8.dex */
final class zzak extends zzae<String> {
    zzak(zzao zzaoVar, String str, String str2) {
        super(zzaoVar, str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzae
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final String zza(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.zzds, null);
        } catch (ClassCastException e2) {
            String strValueOf = String.valueOf(this.zzds);
            if (strValueOf.length() != 0) {
                "Invalid string value in SharedPreferences for ".concat(strValueOf);
            } else {
                new String("Invalid string value in SharedPreferences for ");
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzae
    protected final /* synthetic */ String zzb(String str) {
        return str;
    }
}
