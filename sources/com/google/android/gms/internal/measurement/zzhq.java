package com.google.android.gms.internal.measurement;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzhq extends zzhj<Boolean> {
    zzhq(zzhr zzhrVar, String str, Boolean bool, boolean z2) {
        super(zzhrVar, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.zzhj
    @Nullable
    final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzgi.zzc.matcher(str).matches()) {
                return true;
            }
            if (zzgi.zzd.matcher(str).matches()) {
                return false;
            }
        }
        String str2 = "Invalid boolean value for " + super.zzb() + ": " + String.valueOf(obj);
        return null;
    }
}
