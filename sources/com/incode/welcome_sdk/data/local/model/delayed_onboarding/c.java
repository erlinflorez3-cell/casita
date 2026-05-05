package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8737b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8738c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8739a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8740d;

    public c(long j2, String str) {
        this.f8739a = j2;
        this.f8740d = str;
    }

    public final long d() {
        int i2 = 2 % 2;
        int i3 = f8738c;
        int i4 = i3 + 95;
        f8737b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.f8739a;
        int i6 = i3 + 11;
        f8737b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f8737b;
        int i4 = i3 + 123;
        f8738c = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.f8740d;
        int i5 = i3 + 111;
        f8738c = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f8738c + 103;
            f8737b = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f8739a != cVar.f8739a) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f8740d, cVar.f8740d)) {
            int i4 = f8738c + 91;
            f8737b = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = f8738c + 29;
        f8737b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f8737b + 47;
        f8738c = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = Long.hashCode(this.f8739a) * 31;
        String str = this.f8740d;
        if (str == null) {
            int i5 = f8738c + 117;
            f8737b = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8738c + 13;
        f8737b = i3 % 128;
        int i4 = i3 % 2;
        String str = "FlowConfigEntity(id=" + this.f8739a + ", flowTag=" + this.f8740d + ")";
        int i5 = f8737b + 13;
        f8738c = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
