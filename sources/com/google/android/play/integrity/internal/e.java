package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes9.dex */
final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3485b;

    e(int i2, long j2) {
        this.f3484a = i2;
        this.f3485b = j2;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final int a() {
        return this.f3484a;
    }

    @Override // com.google.android.play.integrity.internal.f
    public final long b() {
        return this.f3485b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f3484a == fVar.a() && this.f3485b == fVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3485b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((this.f3484a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f3484a + ", eventTimestamp=" + this.f3485b + "}";
    }
}
