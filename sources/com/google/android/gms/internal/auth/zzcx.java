package com.google.android.gms.internal.auth;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzcx extends zzdc {
    zzcx(zzcz zzczVar, String str, Double d2, boolean z2) {
        super(zzczVar, str, d2, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String str = "Invalid double value for " + this.zzc + ": " + ((String) obj);
            return null;
        }
    }
}
