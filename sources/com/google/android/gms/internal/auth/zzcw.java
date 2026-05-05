package com.google.android.gms.internal.auth;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzcw extends zzdc {
    zzcw(zzcz zzczVar, String str, Boolean bool, boolean z2) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    final /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return true;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return false;
        }
        String str = "Invalid boolean value for " + this.zzc + ": " + ((String) obj);
        return null;
    }
}
