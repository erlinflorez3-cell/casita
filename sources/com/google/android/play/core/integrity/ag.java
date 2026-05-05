package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class ag extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f3334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f3335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f3337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f3338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i2) {
        super(taskCompletionSource);
        this.f3338e = ajVar;
        this.f3334a = bundle;
        this.f3335b = activity;
        this.f3336c = taskCompletionSource2;
        this.f3337d = i2;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        try {
            com.google.android.play.integrity.internal.n nVar = (com.google.android.play.integrity.internal.n) this.f3338e.f3343a.e();
            Bundle bundle = this.f3334a;
            aj ajVar = this.f3338e;
            nVar.c(bundle, ajVar.f3346d.a(this.f3335b, this.f3336c, ajVar.f3343a));
        } catch (RemoteException e2) {
            this.f3338e.f3344b.c(e2, "requestAndShowDialog(%s)", Integer.valueOf(this.f3337d));
            this.f3336c.trySetException(new IntegrityServiceException(-100, e2));
        }
    }
}
