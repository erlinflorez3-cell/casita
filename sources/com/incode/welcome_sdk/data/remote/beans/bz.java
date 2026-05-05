package com.incode.welcome_sdk.data.remote.beans;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bz {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9608d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9609e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bf f9610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f9611b;

    private bz(bf bfVar, Throwable th) {
        this.f9610a = bfVar;
        this.f9611b = th;
    }

    public /* synthetic */ bz(bf bfVar, Throwable th, int i2) {
        this((i2 & 1) != 0 ? null : bfVar, (i2 & 2) != 0 ? null : th);
    }

    public final Throwable d() {
        int i2 = 2 % 2;
        int i3 = f9609e + 69;
        f9608d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9611b;
        }
        throw null;
    }

    public final bf e() {
        int i2 = 2 % 2;
        int i3 = f9608d;
        int i4 = i3 + 97;
        f9609e = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        bf bfVar = this.f9610a;
        int i5 = i3 + 105;
        f9609e = i5 % 128;
        int i6 = i5 % 2;
        return bfVar;
    }

    public bz() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9609e;
        int i4 = i3 + 55;
        f9608d = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            int i6 = i3 + 81;
            f9608d = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        bz bzVar = (bz) obj;
        if (!Intrinsics.areEqual(this.f9610a, bzVar.f9610a)) {
            int i8 = f9608d + 125;
            f9609e = i8 % 128;
            if (i8 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.f9611b, bzVar.f9611b)) {
            return true;
        }
        int i9 = f9608d + 105;
        f9609e = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f9609e;
        int i4 = i3 + 1;
        f9608d = i4 % 128;
        int i5 = i4 % 2;
        bf bfVar = this.f9610a;
        if (bfVar == null) {
            int i6 = i3 + 85;
            f9608d = i6 % 128;
            iHashCode = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = bfVar.hashCode();
        }
        int i7 = iHashCode * 31;
        Throwable th = this.f9611b;
        int iHashCode2 = i7 + (th == null ? 0 : th.hashCode());
        int i8 = f9608d + 91;
        f9609e = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 83 / 0;
        }
        return iHashCode2;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9608d + 13;
        f9609e = i3 % 128;
        int i4 = i3 % 2;
        String str = "WrappedResponseProcessFace(responseProcessFace=" + this.f9610a + ", error=" + this.f9611b + ")";
        int i5 = f9608d + 93;
        f9609e = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
