package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class al implements com.google.android.play.integrity.internal.ak {

    /* JADX INFO: renamed from: a */
    private final com.google.android.play.integrity.internal.an f3349a;

    /* JADX INFO: renamed from: b */
    private final com.google.android.play.integrity.internal.an f3350b;

    /* JADX INFO: renamed from: c */
    private final com.google.android.play.integrity.internal.an f3351c;

    /* JADX INFO: renamed from: d */
    private final com.google.android.play.integrity.internal.an f3352d;

    public al(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2, com.google.android.play.integrity.internal.an anVar3, com.google.android.play.integrity.internal.an anVar4) {
        this.f3349a = anVar;
        this.f3350b = anVar2;
        this.f3351c = anVar3;
        this.f3352d = anVar4;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ Object a() {
        return new aj((Context) this.f3349a.a(), (com.google.android.play.integrity.internal.s) this.f3350b.a(), ((au) this.f3351c).a(), new i());
    }
}
