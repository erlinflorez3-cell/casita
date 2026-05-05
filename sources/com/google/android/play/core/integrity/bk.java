package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class bk extends bi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f3400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f3401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f3402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j2) {
        super(bnVar, taskCompletionSource);
        this.f3400c = bnVar;
        this.f3401d = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
        this.f3402e = j2;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void c(Bundle bundle) throws RemoteException {
        super.c(bundle);
        this.f3401d.d("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f3400c.f3411f.a(bundle);
        if (apiExceptionA != null) {
            this.f3397a.trySetException(apiExceptionA);
            return;
        }
        bj bjVar = new bj(this, this.f3400c.f3408c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f3397a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
