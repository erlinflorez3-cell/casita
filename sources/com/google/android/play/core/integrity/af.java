package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class af extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f3329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f3330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f3331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f3332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f3333e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l2, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f3333e = ajVar;
        this.f3329a = bArr;
        this.f3330b = l2;
        this.f3331c = taskCompletionSource2;
        this.f3332d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        try {
            ((com.google.android.play.integrity.internal.n) this.f3333e.f3343a.e()).d(aj.a(this.f3333e, this.f3329a, this.f3330b, null), new ai(this.f3333e, this.f3331c));
        } catch (RemoteException e2) {
            this.f3333e.f3344b.c(e2, "requestIntegrityToken(%s)", this.f3332d);
            this.f3331c.trySetException(new IntegrityServiceException(-100, e2));
        }
    }
}
