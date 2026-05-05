package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class bh extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f3392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f3393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f3395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f3396e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i2) {
        super(bnVar, taskCompletionSource);
        this.f3396e = bnVar;
        this.f3392a = bundle;
        this.f3393b = activity;
        this.f3394c = taskCompletionSource2;
        this.f3395d = i2;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (bn.k(this.f3396e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f3396e;
            com.google.android.play.integrity.internal.ae aeVar = bnVar.f3406a;
            ((com.google.android.play.integrity.internal.i) aeVar.e()).c(this.f3392a, bnVar.f3410e.a(this.f3393b, this.f3394c, aeVar));
        } catch (RemoteException e2) {
            this.f3396e.f3407b.c(e2, "requestAndShowDialog(%s)", Integer.valueOf(this.f3395d));
            this.f3394c.trySetException(new StandardIntegrityException(-100, e2));
        }
    }
}
