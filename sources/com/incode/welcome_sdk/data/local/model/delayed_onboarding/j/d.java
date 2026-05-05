package com.incode.welcome_sdk.data.local.model.delayed_onboarding.j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f8894g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f8895h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f8898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8900e;

    public d(long j2, boolean z2, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f8900e = 0L;
        this.f8897b = j2;
        this.f8898c = z2;
        this.f8899d = str;
        this.f8896a = str2;
    }

    public final long c() {
        int i2 = 2 % 2;
        int i3 = f8894g;
        int i4 = i3 + 43;
        f8895h = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = this.f8900e;
        int i5 = i3 + 49;
        f8895h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return j2;
    }

    public final long d() {
        int i2 = 2 % 2;
        int i3 = f8895h + 33;
        int i4 = i3 % 128;
        f8894g = i4;
        int i5 = i3 % 2;
        long j2 = this.f8897b;
        if (i5 != 0) {
            int i6 = 11 / 0;
        }
        int i7 = i4 + 15;
        f8895h = i7 % 128;
        if (i7 % 2 != 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f8894g + 3;
        int i4 = i3 % 128;
        f8895h = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f8898c;
        int i6 = i4 + 33;
        f8894g = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f8895h;
        int i4 = i3 + 47;
        f8894g = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f8899d;
        int i6 = i3 + 51;
        f8894g = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String a() {
        String str;
        int i2 = 2 % 2;
        int i3 = f8895h;
        int i4 = i3 + 89;
        f8894g = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.f8896a;
            int i5 = 10 / 0;
        } else {
            str = this.f8896a;
        }
        int i6 = i3 + 43;
        f8894g = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 44 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r10 instanceof com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r5 + 69;
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d.f8894g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r10 = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r9.f8900e == r10.f8900e) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r9.f8897b == r10.f8897b) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r9.f8898c == r10.f8898c) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        r1 = r5 + 7;
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d.f8894g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.f8899d, r10.f8899d) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r1 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d.f8894g + 89;
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d.f8895h = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.f8896a, r10.f8896a) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r9 == r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 == r10) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            r8 = 2
            int r0 = r8 % r8
            int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d.f8894g
            int r0 = r0 + 97
            int r5 = r0 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d.f8895h = r5
            int r0 = r0 % r8
            r7 = 1
            r6 = 0
            if (r0 != 0) goto L16
            r0 = 72
            int r0 = r0 / r6
            if (r9 != r10) goto L19
        L15:
            return r7
        L16:
            if (r9 != r10) goto L19
            goto L15
        L19:
            boolean r0 = r10 instanceof com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d
            if (r0 != 0) goto L25
            int r1 = r5 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d.f8894g = r0
            int r1 = r1 % r8
            return r6
        L25:
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d r10 = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d) r10
            long r3 = r9.f8900e
            long r1 = r10.f8900e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L30
            return r6
        L30:
            long r3 = r9.f8897b
            long r1 = r10.f8897b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L39
            return r6
        L39:
            boolean r1 = r9.f8898c
            boolean r0 = r10.f8898c
            if (r1 == r0) goto L47
            int r1 = r5 + 7
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d.f8894g = r0
            int r1 = r1 % r8
            return r6
        L47:
            java.lang.String r1 = r9.f8899d
            java.lang.String r0 = r10.f8899d
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L5b
            int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d.f8894g
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d.f8895h = r0
            int r1 = r1 % r8
            return r6
        L5b:
            java.lang.String r1 = r9.f8896a
            java.lang.String r0 = r10.f8896a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L66
            return r6
        L66:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.model.delayed_onboarding.j.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int i2 = 2 % 2;
        int i3 = f8894g + 35;
        f8895h = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode2 = ((((((Long.hashCode(this.f8900e) * 31) + Long.hashCode(this.f8897b)) * 31) + Boolean.hashCode(this.f8898c)) * 31) + this.f8899d.hashCode()) * 31;
        String str = this.f8896a;
        if (str == null) {
            int i5 = f8895h;
            int i6 = i5 + 31;
            f8894g = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 7;
            f8894g = i8 % 128;
            int i9 = i8 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8895h + 35;
        f8894g = i3 % 128;
        if (i3 % 2 != 0) {
            String str = "SelfieScanResultEntity(_id=" + this.f8900e + ", selfieScanId=" + this.f8897b + ", spoofAttempt=" + this.f8898c + ", resultCode=" + this.f8899d + ", error=" + this.f8896a + ")";
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str2 = "SelfieScanResultEntity(_id=" + this.f8900e + ", selfieScanId=" + this.f8897b + ", spoofAttempt=" + this.f8898c + ", resultCode=" + this.f8899d + ", error=" + this.f8896a + ")";
        int i4 = f8894g + 55;
        f8895h = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return str2;
    }
}
