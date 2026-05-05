package com.incode.welcome_sdk.data;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7627a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7628b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7631e;

    public d(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.f7629c = str;
        this.f7631e = str2;
        this.f7630d = str3;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f7627a + 25;
        int i4 = i3 % 128;
        f7628b = i4;
        int i5 = i3 % 2;
        String str = this.f7630d;
        int i6 = i4 + 27;
        f7627a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f7628b;
        int i4 = i3 + 75;
        f7627a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f7629c;
        int i6 = i3 + 83;
        f7627a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 84 / 0;
        }
        return str;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f7628b;
        int i4 = i3 + 47;
        f7627a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f7631e;
        int i6 = i3 + 1;
        f7627a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f7627a;
            int i4 = i3 + 69;
            f7628b = i4 % 128;
            boolean z2 = i4 % 2 == 0;
            int i5 = i3 + 5;
            f7628b = i5 % 128;
            if (i5 % 2 == 0) {
                return z2;
            }
            throw null;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Intrinsics.areEqual(this.f7629c, dVar.f7629c)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f7631e, dVar.f7631e)) {
            int i6 = f7627a + 7;
            f7628b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 37 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.f7630d, dVar.f7630d)) {
            return true;
        }
        int i8 = f7628b + 73;
        f7627a = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f7627a + 17;
        f7628b = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((this.f7629c.hashCode() * 31) + this.f7631e.hashCode()) * 31) + this.f7630d.hashCode();
        int i5 = f7627a + 125;
        f7628b = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7628b + 89;
        f7627a = i3 % 128;
        if (i3 % 2 != 0) {
            return "DeepLinkData(flowId=" + this.f7629c + ", interviewId=" + this.f7631e + ", module=" + this.f7630d + ")";
        }
        String str = "DeepLinkData(flowId=" + this.f7629c + ", interviewId=" + this.f7631e + ", module=" + this.f7630d + ")";
        throw null;
    }
}
