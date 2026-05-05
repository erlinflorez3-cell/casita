package com.incode.welcome_sdk.data.remote.beans;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9701a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9702c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9704e;

    public k(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f9704e = str;
        this.f9703d = str2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!Intrinsics.areEqual(this.f9704e, kVar.f9704e)) {
            int i3 = f9701a + 31;
            f9702c = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.f9703d, kVar.f9703d)) {
            return true;
        }
        int i5 = f9701a + 11;
        f9702c = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9702c + 77;
        f9701a = i3 % 128;
        int iHashCode = i3 % 2 == 0 ? this.f9704e.hashCode() / this.f9703d.hashCode() : (this.f9704e.hashCode() * 31) + this.f9703d.hashCode();
        int i4 = f9701a + 109;
        f9702c = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9701a + 1;
        f9702c = i3 % 128;
        if (i3 % 2 == 0) {
            return "FlowIndexItem(id=" + this.f9704e + ", name=" + this.f9703d + ")";
        }
        int i4 = 6 / 0;
        return "FlowIndexItem(id=" + this.f9704e + ", name=" + this.f9703d + ")";
    }
}
