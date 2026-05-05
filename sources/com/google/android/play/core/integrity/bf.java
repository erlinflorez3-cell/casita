package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class bf extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f3384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f3386c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i2, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f3386c = bnVar;
        this.f3384a = j2;
        this.f3385b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (bn.k(this.f3386c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f3386c;
            ((com.google.android.play.integrity.internal.i) bnVar.f3406a.e()).e(bn.b(bnVar, this.f3384a, 0), new bl(this.f3386c, this.f3385b));
        } catch (RemoteException e2) {
            this.f3386c.f3407b.c(e2, "warmUpIntegrityToken(%s)", Long.valueOf(this.f3384a));
            this.f3385b.trySetException(new StandardIntegrityException(-100, e2));
        }
    }
}
