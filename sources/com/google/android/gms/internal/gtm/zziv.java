package com.google.android.gms.internal.gtm;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
final class zziv extends com.google.android.gms.tagmanager.zzch {
    final /* synthetic */ zzjh zza;

    zziv(zzjh zzjhVar) {
        this.zza = zzjhVar;
    }

    @Override // com.google.android.gms.tagmanager.zzci
    public final void zze(String str, String str2, Bundle bundle, long j2) {
        if (str.endsWith("+gtm")) {
            return;
        }
        this.zza.zzg.execute(new zziu(this, str2, bundle, String.valueOf(str).concat("+gtm"), j2, str));
    }
}
