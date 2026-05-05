package com.incode.welcome_sdk.data.local.model.delayed_onboarding.e;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8831b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8832c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8833a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8835e;

    public b(long j2, boolean z2, boolean z3) {
        this.f8833a = j2;
        this.f8834d = z2;
        this.f8835e = z3;
    }

    public final long e() {
        int i2 = 2 % 2;
        int i3 = f8831b + 43;
        int i4 = i3 % 128;
        f8832c = i4;
        int i5 = i3 % 2;
        long j2 = this.f8833a;
        if (i5 == 0) {
            int i6 = 84 / 0;
        }
        int i7 = i4 + 103;
        f8831b = i7 % 128;
        if (i7 % 2 == 0) {
            return j2;
        }
        throw null;
    }

    public final void c() {
        int i2 = 2 % 2;
        int i3 = f8832c;
        int i4 = i3 + 51;
        f8831b = i4 % 128;
        if (i4 % 2 != 0) {
            this.f8834d = false;
        } else {
            this.f8834d = true;
        }
        int i5 = i3 + 79;
        f8831b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
    }

    public final boolean d() {
        int i2 = 2 % 2;
        int i3 = f8831b;
        int i4 = i3 + 29;
        f8832c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f8834d;
        int i6 = i3 + 23;
        f8832c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f8832c + 19;
        int i4 = i3 % 128;
        f8831b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f8835e;
        int i6 = i4 + 23;
        f8832c = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f8831b;
        int i4 = i3 + 9;
        f8832c = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f8833a != bVar.f8833a) {
            return false;
        }
        if (this.f8834d == bVar.f8834d) {
            return this.f8835e == bVar.f8835e;
        }
        int i5 = i3 + 5;
        f8832c = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f8832c + 5;
        f8831b = i3 % 128;
        int iHashCode = i3 % 2 != 0 ? (((Long.hashCode(this.f8833a) >> PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) * Boolean.hashCode(this.f8834d)) * 94) - Boolean.hashCode(this.f8835e) : (((Long.hashCode(this.f8833a) * 31) + Boolean.hashCode(this.f8834d)) * 31) + Boolean.hashCode(this.f8835e);
        int i4 = f8831b + 117;
        f8832c = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8831b + 61;
        f8832c = i3 % 128;
        int i4 = i3 % 2;
        String str = "ProcessIdEntity(_id=" + this.f8833a + ", isCompleted=" + this.f8834d + ", isSynced=" + this.f8835e + ")";
        int i5 = f8832c + 93;
        f8831b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ b d(b bVar) {
        int i2 = 2 % 2;
        int i3 = f8832c + 55;
        f8831b = i3 % 128;
        int i4 = i3 % 2;
        b bVarB = b(bVar.f8833a, bVar.f8834d, true);
        int i5 = f8832c + 9;
        f8831b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return bVarB;
    }

    private static b b(long j2, boolean z2, boolean z3) {
        int i2 = 2 % 2;
        b bVar = new b(j2, z2, true);
        int i3 = f8832c + 105;
        f8831b = i3 % 128;
        int i4 = i3 % 2;
        return bVar;
    }
}
