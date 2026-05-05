package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class zzau extends zzbb {
    zzau(zzbc zzbcVar, TaskCompletionSource taskCompletionSource) {
        super(zzbcVar, taskCompletionSource);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzc(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, RemoteException {
        super.zzc(bundle);
        this.zza.trySetResult(null);
    }
}
