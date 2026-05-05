package com.google.android.gms.internal.gtm;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes8.dex */
final class zzik implements Handler.Callback {
    final /* synthetic */ zzim zza;

    zzik(zzim zzimVar) {
        this.zza = zzimVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1 && zzin.zza.equals(message.obj)) {
            this.zza.zza.zzi();
            zzim zzimVar = this.zza;
            if (!zzimVar.zza.zzn()) {
                zzimVar.zzc(1800000L);
            }
        }
        return true;
    }
}
