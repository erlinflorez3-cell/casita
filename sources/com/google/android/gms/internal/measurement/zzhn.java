package com.google.android.gms.internal.measurement;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzhn extends zzhj<Long> {
    zzhn(zzhr zzhrVar, String str, Long l2, boolean z2) {
        super(zzhrVar, str, l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzhj
    @Nullable
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final Long zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = "Invalid long value for " + super.zzb() + ": " + String.valueOf(obj);
        return null;
    }
}
