package com.incode.welcome_sdk.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceLoginAttemptSyncError {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7460a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7461c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7462d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f7463e = 117 % 128;
    private final Throwable throwable;
    private final Integer unsuccessfulSyncCount;

    public FaceLoginAttemptSyncError(Throwable th, Integer num) {
        this.throwable = th;
        this.unsuccessfulSyncCount = num;
    }

    public /* synthetic */ FaceLoginAttemptSyncError(Throwable th, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i2 & 2) != 0 ? null : num);
    }

    public final Throwable getThrowable() {
        int i2 = 2 % 2;
        int i3 = f7462d;
        int i4 = i3 + 69;
        f7460a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Throwable th = this.throwable;
        int i5 = i3 + 83;
        f7460a = i5 % 128;
        int i6 = i5 % 2;
        return th;
    }

    public final Integer getUnsuccessfulSyncCount() {
        int i2 = 2 % 2;
        int i3 = f7462d;
        int i4 = i3 + 67;
        f7460a = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        Integer num = this.unsuccessfulSyncCount;
        int i5 = i3 + 5;
        f7460a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return num;
    }

    static {
        int i2 = 117 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f7460a + 51;
        f7462d = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceLoginAttemptSyncError)) {
            return false;
        }
        FaceLoginAttemptSyncError faceLoginAttemptSyncError = (FaceLoginAttemptSyncError) obj;
        if (!Intrinsics.areEqual(this.throwable, faceLoginAttemptSyncError.throwable)) {
            int i5 = f7462d + 97;
            f7460a = i5 % 128;
            return i5 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.unsuccessfulSyncCount, faceLoginAttemptSyncError.unsuccessfulSyncCount)) {
            return true;
        }
        int i6 = f7462d + 45;
        f7460a = i6 % 128;
        return i6 % 2 == 0;
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        Throwable th = this.throwable;
        int iHashCode2 = 0;
        if (th == null) {
            int i3 = f7462d + 17;
            f7460a = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = th.hashCode();
        }
        int i4 = iHashCode * 31;
        Integer num = this.unsuccessfulSyncCount;
        if (num == null) {
            int i5 = f7462d + 37;
            f7460a = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode2 = 1;
            }
        } else {
            iHashCode2 = num.hashCode();
        }
        return i4 + iHashCode2;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7462d + 83;
        f7460a = i3 % 128;
        if (i3 % 2 != 0) {
            return "FaceLoginAttemptSyncError(throwable=" + this.throwable + ", unsuccessfulSyncCount=" + this.unsuccessfulSyncCount + ")";
        }
        String str = "FaceLoginAttemptSyncError(throwable=" + this.throwable + ", unsuccessfulSyncCount=" + this.unsuccessfulSyncCount + ")";
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ FaceLoginAttemptSyncError copy$default(FaceLoginAttemptSyncError faceLoginAttemptSyncError, Throwable th, Integer num, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f7462d;
        int i5 = i4 + 79;
        f7460a = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            th = faceLoginAttemptSyncError.throwable;
        }
        if ((i2 & 2) != 0) {
            int i7 = i4 + 61;
            f7460a = i7 % 128;
            if (i7 % 2 == 0) {
                num = faceLoginAttemptSyncError.unsuccessfulSyncCount;
                int i8 = 63 / 0;
            } else {
                num = faceLoginAttemptSyncError.unsuccessfulSyncCount;
            }
            int i9 = i4 + 13;
            f7460a = i9 % 128;
            int i10 = i9 % 2;
        }
        return faceLoginAttemptSyncError.copy(th, num);
    }

    public final FaceLoginAttemptSyncError copy(Throwable th, Integer num) {
        int i2 = 2 % 2;
        FaceLoginAttemptSyncError faceLoginAttemptSyncError = new FaceLoginAttemptSyncError(th, num);
        int i3 = f7462d + 115;
        f7460a = i3 % 128;
        int i4 = i3 % 2;
        return faceLoginAttemptSyncError;
    }

    public final Integer component2() {
        int i2 = 2 % 2;
        int i3 = f7460a + 113;
        int i4 = i3 % 128;
        f7462d = i4;
        int i5 = i3 % 2;
        Integer num = this.unsuccessfulSyncCount;
        int i6 = i4 + 91;
        f7460a = i6 % 128;
        if (i6 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Throwable component1() {
        int i2 = 2 % 2;
        int i3 = f7462d + 21;
        int i4 = i3 % 128;
        f7460a = i4;
        int i5 = i3 % 2;
        Throwable th = this.throwable;
        int i6 = i4 + 89;
        f7462d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 41 / 0;
        }
        return th;
    }
}
