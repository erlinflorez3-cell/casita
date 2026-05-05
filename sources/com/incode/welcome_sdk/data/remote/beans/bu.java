package com.incode.welcome_sdk.data.remote.beans;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9572d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9573e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9575b;

    public bu(String str, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f9575b = str;
        this.f9574a = z2;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f9573e;
        int i4 = i3 + 91;
        f9572d = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f9575b;
        int i5 = i3 + 13;
        f9572d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f9573e;
        int i4 = i3 + 33;
        f9572d = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f9574a;
        int i6 = i3 + 101;
        f9572d = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9572d + 13;
        int i4 = i3 % 128;
        f9573e = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 23;
            f9572d = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof bu)) {
            return false;
        }
        bu buVar = (bu) obj;
        if (!Intrinsics.areEqual(this.f9575b, buVar.f9575b)) {
            int i8 = f9573e + 99;
            f9572d = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.f9574a == buVar.f9574a) {
            return true;
        }
        int i10 = f9573e + 125;
        f9572d = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9573e + 123;
        f9572d = i3 % 128;
        int iHashCode = i3 % 2 == 0 ? (this.f9575b.hashCode() / 74) % Boolean.hashCode(this.f9574a) : (this.f9575b.hashCode() * 31) + Boolean.hashCode(this.f9574a);
        int i4 = f9572d + 1;
        f9573e = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        String str;
        int i2 = 2 % 2;
        int i3 = f9572d + 113;
        f9573e = i3 % 128;
        if (i3 % 2 != 0) {
            str = "WorkflowModuleWrapper(moduleKey=" + this.f9575b + ", isSupported=" + this.f9574a + ")";
            int i4 = 14 / 0;
        } else {
            str = "WorkflowModuleWrapper(moduleKey=" + this.f9575b + ", isSupported=" + this.f9574a + ")";
        }
        int i5 = f9573e + 69;
        f9572d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
