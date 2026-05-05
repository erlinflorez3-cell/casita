package com.incode.welcome_sdk.data.local.model.delayed_onboarding.d;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: g */
    private static int f8791g = 0;

    /* JADX INFO: renamed from: h */
    private static int f8792h = 1;

    /* JADX INFO: renamed from: a */
    private final String f8793a;

    /* JADX INFO: renamed from: b */
    private final DocumentType f8794b;

    /* JADX INFO: renamed from: c */
    private final String f8795c;

    /* JADX INFO: renamed from: d */
    private final boolean f8796d;

    /* JADX INFO: renamed from: e */
    private final long f8797e;

    /* JADX INFO: renamed from: f */
    private final boolean f8798f;

    public static /* synthetic */ Object c(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i7;
        int i10 = ~(i8 | i9);
        int i11 = (~((~i4) | i9)) | i10;
        int i12 = i5 | i7;
        int i13 = (~(i4 | i9)) | i10;
        int i14 = i5 + i7 + i3 + (1258674323 * i2) + ((-126594725) * i6);
        int i15 = i14 * i14;
        int i16 = ((-1449289074) * i5) + 1954676736 + ((-212912869) * i7) + (i11 * (-1236376205)) + (i12 * (-1236376205)) + ((-1236376205) * i13) + (1609302016 * i3) + (881065984 * i2) + ((-991690752) * i6) + ((-541982720) * i15);
        int i17 = ((i5 * (-1656160718)) - 817430035) + (i7 * (-1656161339)) + (i11 * 621) + (i12 * 621) + (i13 * 621) + (i3 * (-1656160097)) + (i2 * (-2121497779)) + (i6 * 1378977669) + (i15 * (-275906560));
        return i16 + ((i17 * i17) * (-372375552)) != 1 ? c(objArr) : e(objArr);
    }

    public d(long j2, String str, DocumentType documentType, String str2, boolean z2, boolean z3) {
        this.f8797e = j2;
        this.f8795c = str;
        this.f8794b = documentType;
        this.f8793a = str2;
        this.f8796d = z2;
        this.f8798f = z3;
    }

    public final long e() {
        int i2 = 2 % 2;
        int i3 = f8792h + 99;
        f8791g = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f8797e;
        }
        int i4 = 8 / 0;
        return this.f8797e;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f8791g + 111;
        int i4 = i3 % 128;
        f8792h = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.f8795c;
        int i5 = i4 + 1;
        f8791g = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final DocumentType d() {
        int i2 = 2 % 2;
        int i3 = f8792h + 13;
        int i4 = i3 % 128;
        f8791g = i4;
        int i5 = i3 % 2;
        DocumentType documentType = this.f8794b;
        int i6 = i4 + 71;
        f8792h = i6 % 128;
        int i7 = i6 % 2;
        return documentType;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f8792h;
        int i4 = i3 + 67;
        f8791g = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f8793a;
        int i6 = i3 + 93;
        f8791g = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8792h + 17;
        int i4 = i3 % 128;
        f8791g = i4;
        int i5 = i3 % 2;
        Object obj = null;
        boolean z2 = dVar.f8796d;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 79;
        f8792h = i6 % 128;
        if (i6 % 2 != 0) {
            return Boolean.valueOf(z2);
        }
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f8792h;
        int i4 = i3 + 5;
        f8791g = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        boolean z2 = dVar.f8798f;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 51;
        f8791g = i6 % 128;
        if (i6 % 2 == 0) {
            return Boolean.valueOf(z2);
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0013, code lost:
    
        if (r9 == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0015, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0016, code lost:
    
        if (r9 == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x001b, code lost:
    
        if ((r10 instanceof com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x001d, code lost:
    
        r1 = r7 + 69;
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8792h = r1 % 128;
        r1 = r1 % 2;
        r1 = r7 + 73;
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8792h = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x002c, code lost:
    
        r10 = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0034, code lost:
    
        if (r9.f8797e == r10.f8797e) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0036, code lost:
    
        r1 = r7 + 109;
        com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8792h = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0046, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.f8795c, r10.f8795c) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004d, code lost:
    
        if (r9.f8794b == r10.f8794b) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0058, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9.f8793a, r10.f8793a) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x005e, code lost:
    
        if (r9.f8796d == r10.f8796d) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0065, code lost:
    
        if (r9.f8798f == r10.f8798f) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0067, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0068, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0069, code lost:
    
        return false;
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
            int r7 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8791g
            int r1 = r7 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8792h = r0
            int r1 = r1 % r8
            r6 = 1
            r5 = 0
            if (r1 != 0) goto L16
            r0 = 43
            int r0 = r0 / r5
            if (r9 != r10) goto L19
        L15:
            return r6
        L16:
            if (r9 != r10) goto L19
            goto L15
        L19:
            boolean r0 = r10 instanceof com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d
            if (r0 != 0) goto L2c
            int r1 = r7 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8792h = r0
            int r1 = r1 % r8
            int r1 = r7 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8792h = r0
            int r1 = r1 % r8
            return r5
        L2c:
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d r10 = (com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d) r10
            long r3 = r9.f8797e
            long r1 = r10.f8797e
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L3e
            int r1 = r7 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8792h = r0
            int r1 = r1 % r8
            return r5
        L3e:
            java.lang.String r1 = r9.f8795c
            java.lang.String r0 = r10.f8795c
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L49
            return r5
        L49:
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r1 = r9.f8794b
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = r10.f8794b
            if (r1 == r0) goto L50
            return r5
        L50:
            java.lang.String r1 = r9.f8793a
            java.lang.String r0 = r10.f8793a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L69
            boolean r1 = r9.f8796d
            boolean r0 = r10.f8796d
            if (r1 == r0) goto L61
            return r5
        L61:
            boolean r1 = r9.f8798f
            boolean r0 = r10.f8798f
            if (r1 == r0) goto L68
            return r5
        L68:
            return r6
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x001b A[PHI: r1
  0x001b: PHI (r1v12 int) = (r1v0 int), (r1v13 int) binds: [B:37:0x005a, B:25:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[PHI: r1
  0x005d: PHI (r1v1 int) = (r1v0 int), (r1v13 int) binds: [B:37:0x005a, B:25:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8791g
            int r2 = r0 + 11
            int r0 = r2 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8792h = r0
            int r2 = r2 % r4
            r3 = 0
            long r0 = r5.f8797e
            if (r2 != 0) goto L52
            int r0 = java.lang.Long.hashCode(r0)
            int r1 = r0 + (-78)
            java.lang.String r0 = r5.f8795c
            if (r0 != 0) goto L5d
        L1b:
            r0 = r3
        L1c:
            int r1 = r1 + r0
            int r2 = r1 * 31
            com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType r0 = r5.f8794b
            if (r0 != 0) goto L4d
            int r0 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8792h
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.f8791g = r0
            int r1 = r1 % r4
            r0 = r3
        L2d:
            int r2 = r2 + r0
            int r1 = r2 * 31
            java.lang.String r0 = r5.f8793a
            if (r0 != 0) goto L48
        L34:
            int r1 = r1 + r3
            int r1 = r1 * 31
            boolean r0 = r5.f8796d
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r5.f8798f
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            return r1
        L48:
            int r3 = r0.hashCode()
            goto L34
        L4d:
            int r0 = r0.hashCode()
            goto L2d
        L52:
            int r0 = java.lang.Long.hashCode(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r5.f8795c
            if (r0 != 0) goto L5d
            goto L1b
        L5d:
            java.lang.String r0 = r5.f8795c
            int r0 = r0.hashCode()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.model.delayed_onboarding.d.d.hashCode():int");
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f8792h + 77;
        f8791g = i3 % 128;
        int i4 = i3 % 2;
        String str = "DocumentScanEntity(id=" + this.f8797e + ", documentPath=" + this.f8795c + ", documentType=" + this.f8794b + ", mimeType=" + this.f8793a + ", isCompleted=" + this.f8796d + ", isSynced=" + this.f8798f + ")";
        int i5 = f8791g + 73;
        f8792h = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ d d(d dVar, long j2, String str, DocumentType documentType, String str2, boolean z2, boolean z3, int i2) {
        boolean z4 = z3;
        boolean z5 = z2;
        String str3 = str2;
        String str4 = str;
        DocumentType documentType2 = documentType;
        long j3 = j2;
        int i3 = 2 % 2;
        int i4 = f8792h + 87;
        int i5 = i4 % 128;
        f8791g = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 49;
            int i8 = i7 % 128;
            f8792h = i8;
            int i9 = i7 % 2;
            j3 = dVar.f8797e;
            int i10 = i8 + 27;
            f8791g = i10 % 128;
            int i11 = i10 % 2;
        }
        if ((i2 & 2) != 0) {
            int i12 = f8791g + 97;
            f8792h = i12 % 128;
            int i13 = i12 % 2;
            str4 = dVar.f8795c;
        }
        if ((i2 & 4) != 0) {
            documentType2 = dVar.f8794b;
        }
        if ((i2 & 8) != 0) {
            str3 = dVar.f8793a;
        }
        if ((i2 & 16) != 0) {
            int i14 = f8791g + 63;
            f8792h = i14 % 128;
            int i15 = i14 % 2;
            z5 = dVar.f8796d;
            if (i15 == 0) {
                int i16 = 12 / 0;
            }
        }
        if ((i2 & 32) != 0) {
            z4 = dVar.f8798f;
        }
        d dVarD = d(j3, str4, documentType2, str3, z5, z4);
        int i17 = f8791g + 93;
        f8792h = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 44 / 0;
        }
        return dVarD;
    }

    private static d d(long j2, String str, DocumentType documentType, String str2, boolean z2, boolean z3) {
        int i2 = 2 % 2;
        d dVar = new d(j2, str, documentType, str2, z2, z3);
        int i3 = f8792h + 47;
        f8791g = i3 % 128;
        if (i3 % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    public final boolean f() {
        int iD = IncodeWelcome.cm.d();
        int iD2 = IncodeWelcome.cm.d();
        return ((Boolean) c(IncodeWelcome.cm.d(), iD2, new Object[]{this}, iD, -1648933131, IncodeWelcome.cm.d(), 1648933132)).booleanValue();
    }

    public final boolean c() {
        int iD = IncodeWelcome.cm.d();
        int iD2 = IncodeWelcome.cm.d();
        return ((Boolean) c(IncodeWelcome.cm.d(), iD2, new Object[]{this}, iD, -1018733746, IncodeWelcome.cm.d(), 1018733746)).booleanValue();
    }
}
