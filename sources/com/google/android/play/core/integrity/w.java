package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
final class w implements aw {

    /* JADX INFO: renamed from: a */
    private final w f3443a = this;

    /* JADX INFO: renamed from: b */
    private final com.google.android.play.integrity.internal.an f3444b;

    /* JADX INFO: renamed from: c */
    private final com.google.android.play.integrity.internal.an f3445c;

    /* JADX INFO: renamed from: d */
    private final com.google.android.play.integrity.internal.an f3446d;

    /* JADX INFO: renamed from: e */
    private final com.google.android.play.integrity.internal.an f3447e;

    /* JADX INFO: renamed from: f */
    private final com.google.android.play.integrity.internal.an f3448f;

    /* JADX INFO: renamed from: g */
    private final com.google.android.play.integrity.internal.an f3449g;

    /* synthetic */ w(Context context, v vVar) {
        com.google.android.play.integrity.internal.ak akVarB = com.google.android.play.integrity.internal.al.b(context);
        this.f3444b = akVarB;
        com.google.android.play.integrity.internal.an anVarB = com.google.android.play.integrity.internal.aj.b(bb.f3380a);
        this.f3445c = anVarB;
        au auVar = new au(akVarB, n.f3434a);
        this.f3446d = auVar;
        com.google.android.play.integrity.internal.an anVarB2 = com.google.android.play.integrity.internal.aj.b(new bp(akVarB, anVarB, auVar, n.f3434a));
        this.f3447e = anVarB2;
        com.google.android.play.integrity.internal.an anVarB3 = com.google.android.play.integrity.internal.aj.b(new bu(anVarB2));
        this.f3448f = anVarB3;
        this.f3449g = com.google.android.play.integrity.internal.aj.b(new ba(anVarB2, anVarB3));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f3449g.a();
    }
}
