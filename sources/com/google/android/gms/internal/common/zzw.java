package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes8.dex */
final class zzw extends zzz {
    final /* synthetic */ zzr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzw(zzx zzxVar, zzaa zzaaVar, CharSequence charSequence, zzr zzrVar) {
        super(zzaaVar, charSequence);
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    final int zzc(int i2) {
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.common.zzz
    final int zzd(int i2) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzv.zzb(i2, length, FirebaseAnalytics.Param.INDEX);
        while (i2 < length) {
            if (this.zza.zza(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
