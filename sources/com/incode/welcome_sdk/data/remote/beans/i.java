package com.incode.welcome_sdk.data.remote.beans;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9686a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9687c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9689e;

    public i(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.f9689e = str;
        this.f9688d = str2;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f9687c + 47;
        f9686a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9689e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f9686a;
        int i4 = i3 + 63;
        f9687c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f9688d;
        int i6 = i3 + 47;
        f9687c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            int i3 = f9686a + 49;
            f9687c = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        i iVar = (i) obj;
        if (Intrinsics.areEqual(this.f9689e, iVar.f9689e)) {
            return Intrinsics.areEqual(this.f9688d, iVar.f9688d);
        }
        int i5 = f9686a + 125;
        f9687c = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9686a + 55;
        f9687c = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (this.f9689e.hashCode() * 31) + this.f9688d.hashCode();
        int i5 = f9686a + 115;
        f9687c = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9686a + 45;
        f9687c = i3 % 128;
        if (i3 % 2 != 0) {
            return "Document(documentRef=" + this.f9689e + ", documentUrl=" + this.f9688d + ")";
        }
        String str = "Document(documentRef=" + this.f9689e + ", documentUrl=" + this.f9688d + ")";
        throw null;
    }
}
