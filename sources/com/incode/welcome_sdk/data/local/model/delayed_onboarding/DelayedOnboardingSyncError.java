package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DelayedOnboardingSyncError {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8630b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8631c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8632d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8633e = 1;
    private final Throwable throwable;
    private final int unsuccessfulSyncCount;

    public DelayedOnboardingSyncError(Throwable th, int i2) {
        this.throwable = th;
        this.unsuccessfulSyncCount = i2;
    }

    public final Throwable getThrowable() {
        int i2 = 2 % 2;
        int i3 = f8630b;
        int i4 = i3 + 53;
        f8633e = i4 % 128;
        int i5 = i4 % 2;
        Throwable th = this.throwable;
        int i6 = i3 + 11;
        f8633e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 32 / 0;
        }
        return th;
    }

    public final int getUnsuccessfulSyncCount() {
        int i2 = 2 % 2;
        int i3 = f8633e;
        int i4 = i3 + 55;
        f8630b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = this.unsuccessfulSyncCount;
        int i6 = i3 + 45;
        f8630b = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i2 = 1 + 123;
        f8632d = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f8630b;
        int i4 = i3 + 117;
        f8633e = i4 % 128;
        int i5 = i4 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DelayedOnboardingSyncError)) {
            int i6 = i3 + 51;
            f8633e = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        DelayedOnboardingSyncError delayedOnboardingSyncError = (DelayedOnboardingSyncError) obj;
        if (!Intrinsics.areEqual(this.throwable, delayedOnboardingSyncError.throwable)) {
            int i8 = f8633e + 111;
            f8630b = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.unsuccessfulSyncCount == delayedOnboardingSyncError.unsuccessfulSyncCount) {
            return true;
        }
        int i10 = f8630b + 97;
        f8633e = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f8633e + 117;
        f8630b = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Throwable th = this.throwable;
        int iHashCode = ((th == null ? 0 : th.hashCode()) * 31) + Integer.hashCode(this.unsuccessfulSyncCount);
        int i4 = f8633e + 49;
        f8630b = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8630b + 125;
        f8633e = i3 % 128;
        int i4 = i3 % 2;
        String str = "DelayedOnboardingSyncError(throwable=" + this.throwable + ", unsuccessfulSyncCount=" + this.unsuccessfulSyncCount + ")";
        int i5 = f8630b + 51;
        f8633e = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ DelayedOnboardingSyncError copy$default(DelayedOnboardingSyncError delayedOnboardingSyncError, Throwable th, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = f8630b + 75;
        int i6 = i5 % 128;
        f8633e = i6;
        int i7 = i5 % 2;
        if ((i3 & 1) != 0) {
            int i8 = i6 + 101;
            f8630b = i8 % 128;
            if (i8 % 2 != 0) {
                Throwable th2 = delayedOnboardingSyncError.throwable;
                throw null;
            }
            th = delayedOnboardingSyncError.throwable;
        }
        if ((i3 & 2) != 0) {
            i2 = delayedOnboardingSyncError.unsuccessfulSyncCount;
            int i9 = f8630b + 27;
            f8633e = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 / 2;
            }
        }
        DelayedOnboardingSyncError delayedOnboardingSyncErrorCopy = delayedOnboardingSyncError.copy(th, i2);
        int i11 = f8633e + 33;
        f8630b = i11 % 128;
        int i12 = i11 % 2;
        return delayedOnboardingSyncErrorCopy;
    }

    public final DelayedOnboardingSyncError copy(Throwable th, int i2) {
        int i3 = 2 % 2;
        DelayedOnboardingSyncError delayedOnboardingSyncError = new DelayedOnboardingSyncError(th, i2);
        int i4 = f8630b + 77;
        f8633e = i4 % 128;
        int i5 = i4 % 2;
        return delayedOnboardingSyncError;
    }

    public final int component2() {
        int i2 = 2 % 2;
        int i3 = f8630b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f8633e = i4;
        int i5 = i3 % 2;
        int i6 = this.unsuccessfulSyncCount;
        int i7 = i4 + 105;
        f8630b = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final Throwable component1() {
        int i2 = 2 % 2;
        int i3 = f8630b;
        int i4 = i3 + 79;
        f8633e = i4 % 128;
        int i5 = i4 % 2;
        Throwable th = this.throwable;
        int i6 = i3 + 1;
        f8633e = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 25 / 0;
        }
        return th;
    }
}
