package com.incode.welcome_sdk.data.remote.beans;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9604b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9605d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pair<ResponseSuccess, IResponseDocumentScan> f9606a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Throwable f9607c;

    /* JADX WARN: Multi-variable type inference failed */
    private bw(Pair<? extends ResponseSuccess, ? extends IResponseDocumentScan> pair, Throwable th) {
        this.f9606a = pair;
        this.f9607c = th;
    }

    public /* synthetic */ bw(Pair pair, Throwable th, int i2) {
        this((i2 & 1) != 0 ? null : pair, (i2 & 2) != 0 ? null : th);
    }

    public final Pair<ResponseSuccess, IResponseDocumentScan> a() {
        int i2 = 2 % 2;
        int i3 = f9605d;
        int i4 = i3 + 125;
        f9604b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Pair<ResponseSuccess, IResponseDocumentScan> pair = this.f9606a;
        int i5 = i3 + 51;
        f9604b = i5 % 128;
        if (i5 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    public final Throwable d() {
        int i2 = 2 % 2;
        int i3 = f9605d + 125;
        f9604b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9607c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public bw() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f9605d + 73;
        f9604b = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        if (!Intrinsics.areEqual(this.f9606a, bwVar.f9606a)) {
            int i4 = f9604b + 79;
            f9605d = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.f9607c, bwVar.f9607c)) {
            return true;
        }
        int i6 = f9605d + 41;
        int i7 = i6 % 128;
        f9604b = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 41;
        f9605d = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 58 / 0;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        Pair<ResponseSuccess, IResponseDocumentScan> pair = this.f9606a;
        int iHashCode2 = 0;
        if (pair == null) {
            int i3 = f9605d + 47;
            f9604b = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = pair.hashCode();
        }
        int i5 = iHashCode * 31;
        Throwable th = this.f9607c;
        if (th == null) {
            int i6 = f9604b + 55;
            f9605d = i6 % 128;
            if (i6 % 2 != 0) {
                iHashCode2 = 1;
            }
        } else {
            iHashCode2 = th.hashCode();
        }
        return i5 + iHashCode2;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9604b + 1;
        f9605d = i3 % 128;
        int i4 = i3 % 2;
        String str = "WrappedResponseDocumentScan(documentScanPair=" + this.f9606a + ", error=" + this.f9607c + ")";
        int i5 = f9604b + 13;
        f9605d = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
