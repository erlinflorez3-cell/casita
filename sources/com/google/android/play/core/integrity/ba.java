package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes9.dex */
public final class ba implements com.google.android.play.integrity.internal.ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f3378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.an f3379b;

    public ba(com.google.android.play.integrity.internal.an anVar, com.google.android.play.integrity.internal.an anVar2) {
        this.f3378a = anVar;
        this.f3379b = anVar2;
    }

    @Override // com.google.android.play.integrity.internal.an
    public final /* bridge */ /* synthetic */ Object a() {
        com.google.android.play.integrity.internal.an anVar = this.f3379b;
        return new az((bn) this.f3378a.a(), (bt) anVar.a());
    }
}
