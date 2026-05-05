package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f3340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f3341b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f3342c;

    ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f3340a = ajVar;
        this.f3342c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(Bundle bundle) {
        this.f3340a.f3343a.v(this.f3342c);
        this.f3341b.d("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f3340a.f3347e.a(bundle);
        if (apiExceptionA != null) {
            this.f3342c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f3342c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f3340a.f3345c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f3342c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
