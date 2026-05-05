package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class bg extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f3387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f3388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f3389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f3391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i2, String str, long j2, long j3, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f3391e = bnVar;
        this.f3387a = str;
        this.f3388b = j2;
        this.f3389c = j3;
        this.f3390d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (bn.k(this.f3391e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f3391e;
            ((com.google.android.play.integrity.internal.i) bnVar.f3406a.e()).d(bn.a(bnVar, this.f3387a, this.f3388b, this.f3389c, 0), new bk(this.f3391e, this.f3390d, this.f3388b));
        } catch (RemoteException e2) {
            this.f3391e.f3407b.c(e2, "requestExpressIntegrityToken(%s, %s)", this.f3387a, Long.valueOf(this.f3388b));
            this.f3390d.trySetException(new StandardIntegrityException(-100, e2));
        }
    }
}
