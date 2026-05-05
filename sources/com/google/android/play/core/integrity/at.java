package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f3367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f3368b;

    at(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2) {
        this.f3367a = anVar;
        this.f3368b = anVar2;
    }

    final as a(Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        Object objA = this.f3367a.a();
        objA.getClass();
        k kVar = (k) this.f3368b.a();
        kVar.getClass();
        activity.getClass();
        aeVar.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, aeVar);
    }
}
