package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f3436a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f3437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f3438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f3439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f3440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f3441f;

    /* synthetic */ s(Context context, r rVar) {
        com.google.android.play.integrity.internal.ak akVarB = com.google.android.play.integrity.internal.al.b(context);
        this.f3437b = akVarB;
        com.google.android.play.integrity.internal.an anVarB = com.google.android.play.integrity.internal.aj.b(ac.f3327a);
        this.f3438c = anVarB;
        au auVar = new au(akVarB, l.f3429a);
        this.f3439d = auVar;
        com.google.android.play.integrity.internal.an anVarB2 = com.google.android.play.integrity.internal.aj.b(new al(akVarB, anVarB, auVar, l.f3429a));
        this.f3440e = anVarB2;
        this.f3441f = com.google.android.play.integrity.internal.aj.b(new ab(anVarB2));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f3441f.a();
    }
}
