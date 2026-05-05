package com.incode.welcome_sdk.data;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceLoginAttemptSyncResult {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7467a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7468b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7469c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7470d = 0;
    private final int pendingSyncCount;
    private final int successfulSyncCount;
    private final int syncedWithErrorCount;

    public FaceLoginAttemptSyncResult(int i2, int i3, int i4) {
        this.successfulSyncCount = i2;
        this.pendingSyncCount = i3;
        this.syncedWithErrorCount = i4;
    }

    public final int getSuccessfulSyncCount() {
        int i2 = 2 % 2;
        int i3 = f7467a + 117;
        int i4 = i3 % 128;
        f7470d = i4;
        int i5 = i3 % 2;
        int i6 = this.successfulSyncCount;
        int i7 = i4 + 107;
        f7467a = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int getPendingSyncCount() {
        int i2 = 2 % 2;
        int i3 = f7470d + 49;
        f7467a = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.pendingSyncCount;
        if (i4 == 0) {
            int i6 = 27 / 0;
        }
        return i5;
    }

    public final int getSyncedWithErrorCount() {
        int i2 = 2 % 2;
        int i3 = f7467a;
        int i4 = i3 + 29;
        f7470d = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.syncedWithErrorCount;
        int i6 = i3 + 51;
        f7470d = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        int i2 = 1 + 79;
        f7469c = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r4 + 35;
        com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult.f7467a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r7 = (com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r6.successfulSyncCount == r7.successfulSyncCount) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r1 = r4 + 37;
        com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult.f7467a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r6.pendingSyncCount == r7.pendingSyncCount) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r6.syncedWithErrorCount == r7.syncedWithErrorCount) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult.f7467a
            int r0 = r0 + 71
            int r4 = r0 % 128
            com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult.f7470d = r4
            int r0 = r0 % r5
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L16
            r0 = 36
            int r0 = r0 / r2
            if (r6 != r7) goto L19
        L15:
            return r3
        L16:
            if (r6 != r7) goto L19
            goto L15
        L19:
            boolean r0 = r7 instanceof com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult
            if (r0 != 0) goto L25
            int r1 = r4 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult.f7467a = r0
            int r1 = r1 % r5
            return r2
        L25:
            com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult r7 = (com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult) r7
            int r1 = r6.successfulSyncCount
            int r0 = r7.successfulSyncCount
            if (r1 == r0) goto L39
            int r1 = r4 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult.f7467a = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L37
        L36:
            return r3
        L37:
            r3 = r2
            goto L36
        L39:
            int r1 = r6.pendingSyncCount
            int r0 = r7.pendingSyncCount
            if (r1 == r0) goto L40
            return r2
        L40:
            int r1 = r6.syncedWithErrorCount
            int r0 = r7.syncedWithErrorCount
            if (r1 == r0) goto L47
            return r2
        L47:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.FaceLoginAttemptSyncResult.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f7467a + 43;
        f7470d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((Integer.hashCode(this.successfulSyncCount) * 31) + Integer.hashCode(this.pendingSyncCount)) * 31) + Integer.hashCode(this.syncedWithErrorCount);
        int i5 = f7467a + 5;
        f7470d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7470d + 107;
        f7467a = i3 % 128;
        if (i3 % 2 != 0) {
            return "FaceLoginAttemptSyncResult(successfulSyncCount=" + this.successfulSyncCount + ", pendingSyncCount=" + this.pendingSyncCount + ", syncedWithErrorCount=" + this.syncedWithErrorCount + ")";
        }
        String str = "FaceLoginAttemptSyncResult(successfulSyncCount=" + this.successfulSyncCount + ", pendingSyncCount=" + this.pendingSyncCount + ", syncedWithErrorCount=" + this.syncedWithErrorCount + ")";
        throw null;
    }

    public static /* synthetic */ FaceLoginAttemptSyncResult copy$default(FaceLoginAttemptSyncResult faceLoginAttemptSyncResult, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = 2 % 2;
        if ((i5 & 1) != 0) {
            i2 = faceLoginAttemptSyncResult.successfulSyncCount;
        }
        if ((i5 & 2) != 0) {
            i3 = faceLoginAttemptSyncResult.pendingSyncCount;
        }
        if ((i5 & 4) != 0) {
            i4 = faceLoginAttemptSyncResult.syncedWithErrorCount;
            int i7 = f7470d + 1;
            f7467a = i7 % 128;
            int i8 = i7 % 2;
        }
        FaceLoginAttemptSyncResult faceLoginAttemptSyncResultCopy = faceLoginAttemptSyncResult.copy(i2, i3, i4);
        int i9 = f7470d + 121;
        f7467a = i9 % 128;
        if (i9 % 2 != 0) {
            return faceLoginAttemptSyncResultCopy;
        }
        throw null;
    }

    public final FaceLoginAttemptSyncResult copy(int i2, int i3, int i4) {
        int i5 = 2 % 2;
        FaceLoginAttemptSyncResult faceLoginAttemptSyncResult = new FaceLoginAttemptSyncResult(i2, i3, i4);
        int i6 = f7470d + 101;
        f7467a = i6 % 128;
        if (i6 % 2 != 0) {
            return faceLoginAttemptSyncResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component3() {
        int i2 = 2 % 2;
        int i3 = f7467a + 83;
        int i4 = i3 % 128;
        f7470d = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = this.syncedWithErrorCount;
        int i6 = i4 + 121;
        f7467a = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i2 = 2 % 2;
        int i3 = f7467a;
        int i4 = i3 + 65;
        f7470d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.pendingSyncCount;
        int i7 = i3 + 107;
        f7470d = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 2 / 0;
        }
        return i6;
    }

    public final int component1() {
        int i2 = 2 % 2;
        int i3 = f7467a;
        int i4 = i3 + 91;
        f7470d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.successfulSyncCount;
        int i7 = i3 + 125;
        f7470d = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 85 / 0;
        }
        return i6;
    }
}
