package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class w extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f3492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ae f3493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ae aeVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, t tVar) {
        super(taskCompletionSource);
        this.f3493c = aeVar;
        this.f3491a = taskCompletionSource2;
        this.f3492b = tVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f3493c.f3468g) {
            ae.o(this.f3493c, this.f3491a);
            if (this.f3493c.f3474m.getAndIncrement() > 0) {
                this.f3493c.f3464c.d("Already connected to the service.", new Object[0]);
            }
            ae.q(this.f3493c, this.f3492b);
        }
    }
}
