package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

/* JADX INFO: loaded from: classes5.dex */
public final class DelayedOnboardingSyncResult {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8634b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8635c = 115 % 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8636d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8637e = 1;
    private final int successfulSyncCount;
    private final int unsuccessfulSyncCount;

    public DelayedOnboardingSyncResult(int i2, int i3) {
        this.successfulSyncCount = i2;
        this.unsuccessfulSyncCount = i3;
    }

    public final int getSuccessfulSyncCount() {
        int i2 = 2 % 2;
        int i3 = f8636d + 99;
        int i4 = i3 % 128;
        f8637e = i4;
        int i5 = i3 % 2;
        int i6 = this.successfulSyncCount;
        int i7 = i4 + 33;
        f8636d = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getUnsuccessfulSyncCount() {
        int i2 = 2 % 2;
        int i3 = f8637e;
        int i4 = i3 + 3;
        f8636d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.unsuccessfulSyncCount;
        int i7 = i3 + 89;
        f8636d = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    static {
        if (115 % 2 == 0) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f8637e + 47;
            f8636d = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof DelayedOnboardingSyncResult)) {
            return false;
        }
        DelayedOnboardingSyncResult delayedOnboardingSyncResult = (DelayedOnboardingSyncResult) obj;
        if (this.successfulSyncCount != delayedOnboardingSyncResult.successfulSyncCount) {
            return false;
        }
        if (this.unsuccessfulSyncCount == delayedOnboardingSyncResult.unsuccessfulSyncCount) {
            return true;
        }
        int i5 = f8636d + 117;
        f8637e = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f8637e + 85;
        f8636d = i3 % 128;
        int iHashCode = i3 % 2 != 0 ? (Integer.hashCode(this.successfulSyncCount) >>> 98) >>> Integer.hashCode(this.unsuccessfulSyncCount) : (Integer.hashCode(this.successfulSyncCount) * 31) + Integer.hashCode(this.unsuccessfulSyncCount);
        int i4 = f8636d + 123;
        f8637e = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8637e + 5;
        f8636d = i3 % 128;
        if (i3 % 2 == 0) {
            return "DelayedOnboardingSyncResult(successfulSyncCount=" + this.successfulSyncCount + ", unsuccessfulSyncCount=" + this.unsuccessfulSyncCount + ")";
        }
        int i4 = 32 / 0;
        return "DelayedOnboardingSyncResult(successfulSyncCount=" + this.successfulSyncCount + ", unsuccessfulSyncCount=" + this.unsuccessfulSyncCount + ")";
    }

    public static /* synthetic */ DelayedOnboardingSyncResult copy$default(DelayedOnboardingSyncResult delayedOnboardingSyncResult, int i2, int i3, int i4, Object obj) {
        int i5 = 2 % 2;
        int i6 = f8636d + 9;
        int i7 = i6 % 128;
        f8637e = i7;
        if (i6 % 2 != 0 && (i4 & 1) != 0) {
            int i8 = i7 + 55;
            f8636d = i8 % 128;
            int i9 = i8 % 2;
            i2 = delayedOnboardingSyncResult.successfulSyncCount;
        }
        if ((i4 & 2) != 0) {
            i3 = delayedOnboardingSyncResult.unsuccessfulSyncCount;
        }
        return delayedOnboardingSyncResult.copy(i2, i3);
    }

    public final DelayedOnboardingSyncResult copy(int i2, int i3) {
        int i4 = 2 % 2;
        DelayedOnboardingSyncResult delayedOnboardingSyncResult = new DelayedOnboardingSyncResult(i2, i3);
        int i5 = f8637e + 23;
        f8636d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return delayedOnboardingSyncResult;
    }

    public final int component2() {
        int i2 = 2 % 2;
        int i3 = f8637e + 13;
        int i4 = i3 % 128;
        f8636d = i4;
        int i5 = i3 % 2;
        int i6 = this.unsuccessfulSyncCount;
        int i7 = i4 + 13;
        f8637e = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component1() {
        int i2 = 2 % 2;
        int i3 = f8637e;
        int i4 = i3 + 83;
        f8636d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.successfulSyncCount;
        int i7 = i3 + 57;
        f8636d = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }
}
