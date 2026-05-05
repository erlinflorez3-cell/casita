package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes9.dex */
public final class aj implements an {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f3478a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile an f3479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f3480c = f3478a;

    private aj(an anVar) {
        this.f3479b = anVar;
    }

    public static an b(an anVar) {
        return anVar instanceof aj ? anVar : new aj(anVar);
    }

    @Override // com.google.android.play.integrity.internal.an
    public final Object a() {
        Object objA = this.f3480c;
        Object obj = f3478a;
        if (objA == obj) {
            synchronized (this) {
                objA = this.f3480c;
                if (objA == obj) {
                    objA = this.f3479b.a();
                    Object obj2 = this.f3480c;
                    if (obj2 != obj && obj2 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.f3480c = objA;
                    this.f3479b = null;
                }
            }
        }
        return objA;
    }
}
