package com.incode.welcome_sdk.data.remote.beans;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9647c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9648e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9650b;

    public d(String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f9650b = str;
        this.f9649a = z2;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f9648e + 97;
        int i4 = i3 % 128;
        f9647c = i4;
        int i5 = i3 % 2;
        String str = this.f9650b;
        int i6 = i4 + 109;
        f9648e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f9647c + 63;
        int i4 = i3 % 128;
        f9648e = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.f9649a;
        int i5 = i4 + 95;
        f9647c = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Intrinsics.areEqual(this.f9650b, dVar.f9650b)) {
            int i3 = f9648e + 1;
            f9647c = i3 % 128;
            return i3 % 2 == 0;
        }
        if (this.f9649a == dVar.f9649a) {
            return true;
        }
        int i4 = f9648e + 43;
        int i5 = i4 % 128;
        f9647c = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 111;
        f9648e = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9648e + 69;
        f9647c = i3 % 128;
        int iHashCode = i3 % 2 == 0 ? (this.f9650b.hashCode() << 126) - Boolean.hashCode(this.f9649a) : (this.f9650b.hashCode() * 31) + Boolean.hashCode(this.f9649a);
        int i4 = f9647c + 29;
        f9648e = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9647c + 75;
        f9648e = i3 % 128;
        if (i3 % 2 == 0) {
            return "BiometricConsentInfo(regulationType=" + this.f9650b + ", showMandatoryConsent=" + this.f9649a + ")";
        }
        String str = "BiometricConsentInfo(regulationType=" + this.f9650b + ", showMandatoryConsent=" + this.f9649a + ")";
        throw null;
    }

    public final boolean b() {
        int i2 = 2 % 2;
        int i3 = f9648e + 5;
        f9647c = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9649a;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f9648e + 73;
        int i4 = i3 % 128;
        f9647c = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f9650b;
        int i5 = i4 + 39;
        f9648e = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
