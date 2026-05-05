package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.SentryStackFrame;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
final class zzf extends com.google.android.play.core.review.internal.zzj {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzi zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzf(zzi zziVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.zza = taskCompletionSource2;
        this.zzb = zziVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    protected final void zza() {
        try {
            com.google.android.play.core.review.internal.zzf zzfVar = (com.google.android.play.core.review.internal.zzf) this.zzb.zza.zze();
            String str = this.zzb.zzc;
            Bundle bundle = new Bundle();
            Map mapZza = zzj.zza();
            bundle.putInt("playcore_version_code", ((Integer) mapZza.get(SentryBaseEvent.DEFAULT_PLATFORM)).intValue());
            if (mapZza.containsKey(SentryStackFrame.JsonKeys.NATIVE)) {
                bundle.putInt("playcore_native_version", ((Integer) mapZza.get(SentryStackFrame.JsonKeys.NATIVE)).intValue());
            }
            if (mapZza.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapZza.get("unity")).intValue());
            }
            zzi zziVar = this.zzb;
            zzfVar.zzc(str, bundle, new zzh(zziVar, this.zza, zziVar.zzc));
        } catch (RemoteException e2) {
            zzi.zzb.zzb(e2, "error requesting in-app review for %s", this.zzb.zzc);
            this.zza.trySetException(new RuntimeException(e2));
        }
    }
}
