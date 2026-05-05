package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8860a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8861d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8862e;

    public f(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f8862e = str;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f8860a + 35;
        f8861d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f8862e;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f8861d + 9;
            f8860a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 96 / 0;
            }
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f8862e, ((f) obj).f8862e)) {
            return true;
        }
        int i5 = f8860a;
        int i6 = i5 + 113;
        f8861d = i6 % 128;
        boolean z2 = i6 % 2 != 0;
        int i7 = i5 + 97;
        f8861d = i7 % 128;
        int i8 = i7 % 2;
        return z2;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f8860a + 125;
        f8861d = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f8862e.hashCode();
            throw null;
        }
        int iHashCode = this.f8862e.hashCode();
        int i4 = f8861d + 31;
        f8860a = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8860a + 107;
        f8861d = i3 % 128;
        int i4 = i3 % 2;
        String str = "ModuleTypeEntity(name=" + this.f8862e + ")";
        int i5 = f8861d + 123;
        f8860a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
