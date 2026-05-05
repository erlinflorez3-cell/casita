package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f1656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f1657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1660f;

    public /* synthetic */ r90() {
        this(false, null, null, 0L, 0L, 0L);
    }

    public r90(boolean z2, Long l2, String str, long j2, long j3, long j4) {
        this.f1655a = z2;
        this.f1656b = l2;
        this.f1657c = str;
        this.f1658d = j2;
        this.f1659e = j3;
        this.f1660f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90Var = (r90) obj;
        return this.f1655a == r90Var.f1655a && Intrinsics.areEqual(this.f1656b, r90Var.f1656b) && Intrinsics.areEqual(this.f1657c, r90Var.f1657c) && this.f1658d == r90Var.f1658d && this.f1659e == r90Var.f1659e && this.f1660f == r90Var.f1660f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public final int hashCode() {
        boolean z2 = this.f1655a;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = r02 * 31;
        Long l2 = this.f1656b;
        int iHashCode = (i2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f1657c;
        return Long.hashCode(this.f1660f) + ((Long.hashCode(this.f1659e) + ((Long.hashCode(this.f1658d) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Config(isEnabled=" + this.f1655a + ", sdkDebuggerExpirationTime=" + this.f1656b + ", sdkDebuggerAuthCode=" + this.f1657c + ", sdkDebuggerFlushIntervalBytes=" + this.f1658d + ", sdkDebuggerFlushIntervalSeconds=" + this.f1659e + ", sdkDebuggerMaxPayloadBytes=" + this.f1660f + ')';
    }
}
