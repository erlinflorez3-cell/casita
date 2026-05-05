package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class zzaw extends zzbb {
    zzaw(zzbc zzbcVar, TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zze(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, RemoteException {
        super.zze(bundle);
        this.zza.trySetResult(null);
    }
}
