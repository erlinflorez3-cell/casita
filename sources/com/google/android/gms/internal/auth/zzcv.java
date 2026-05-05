package com.google.android.gms.internal.auth;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzcv extends zzdc {
    zzcv(zzcz zzczVar, String str, Long l2, boolean z2) {
        super(zzczVar, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String str = "Invalid long value for " + this.zzc + ": " + ((String) obj);
            return null;
        }
    }
}
