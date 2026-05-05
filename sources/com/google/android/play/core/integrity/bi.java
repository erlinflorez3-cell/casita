package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
class bi extends com.google.android.play.integrity.internal.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f3397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f3398b;

    bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.f3398b = bnVar;
        this.f3397a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(Bundle bundle) throws RemoteException {
        this.f3398b.f3406a.v(this.f3397a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(Bundle bundle) throws RemoteException {
        this.f3398b.f3406a.v(this.f3397a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(Bundle bundle) throws RemoteException {
        this.f3398b.f3406a.v(this.f3397a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(Bundle bundle) throws RemoteException {
        this.f3398b.f3406a.v(this.f3397a);
    }
}
