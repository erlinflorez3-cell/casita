package com.google.android.play.core.review;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzt;

/* JADX INFO: loaded from: classes9.dex */
class zzg extends com.google.android.play.core.review.internal.zzg {
    final com.google.android.play.core.review.internal.zzi zza;
    final TaskCompletionSource zzb;
    final /* synthetic */ zzi zzc;

    zzg(zzi zziVar, com.google.android.play.core.review.internal.zzi zziVar2, TaskCompletionSource taskCompletionSource) {
        this.zzc = zziVar;
        this.zza = zziVar2;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.play.core.review.internal.zzh
    public void zzb(Bundle bundle) throws Throwable {
        zzt zztVar = this.zzc.zza;
        if (zztVar != null) {
            zztVar.zzu(this.zzb);
        }
        this.zza.zzc("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
