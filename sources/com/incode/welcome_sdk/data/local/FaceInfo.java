package com.incode.welcome_sdk.data.local;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7681b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7682c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7683d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f7684e = 57 % 128;
    private final String customerUUID;
    private final long faceInfoId;
    private final String faceTemplate;
    private final String templateId;

    public FaceInfo(long j2, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.faceInfoId = j2;
        this.templateId = str;
        this.faceTemplate = str2;
        this.customerUUID = str3;
    }

    public /* synthetic */ FaceInfo(long j2, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j2, str, str2, str3);
    }

    public final long getFaceInfoId() {
        int i2 = 2 % 2;
        int i3 = f7683d;
        int i4 = i3 + 109;
        f7681b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.faceInfoId;
        int i6 = i3 + 87;
        f7681b = i6 % 128;
        if (i6 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    public final String getTemplateId() {
        int i2 = 2 % 2;
        int i3 = f7681b + 81;
        int i4 = i3 % 128;
        f7683d = i4;
        int i5 = i3 % 2;
        String str = this.templateId;
        int i6 = i4 + 105;
        f7681b = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFaceTemplate() {
        String str;
        int i2 = 2 % 2;
        int i3 = f7681b + 27;
        int i4 = i3 % 128;
        f7683d = i4;
        if (i3 % 2 != 0) {
            str = this.faceTemplate;
            int i5 = 35 / 0;
        } else {
            str = this.faceTemplate;
        }
        int i6 = i4 + 113;
        f7681b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getCustomerUUID() {
        int i2 = 2 % 2;
        int i3 = f7681b + 55;
        int i4 = i3 % 128;
        f7683d = i4;
        int i5 = i3 % 2;
        String str = this.customerUUID;
        int i6 = i4 + 11;
        f7681b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static {
        if (57 % 2 == 0) {
            int i2 = 89 / 0;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f7683d + 47;
            f7681b = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof FaceInfo)) {
            return false;
        }
        FaceInfo faceInfo = (FaceInfo) obj;
        if (this.faceInfoId != faceInfo.faceInfoId) {
            return false;
        }
        if (!Intrinsics.areEqual(this.templateId, faceInfo.templateId)) {
            int i5 = f7683d + 39;
            f7681b = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.faceTemplate, faceInfo.faceTemplate)) {
            if (Intrinsics.areEqual(this.customerUUID, faceInfo.customerUUID)) {
                return true;
            }
            int i7 = f7683d + 11;
            f7681b = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = f7683d + 115;
        f7681b = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[PHI: r3
  0x004e: PHI (r3v1 int) = (r3v0 int), (r3v5 int) binds: [B:10:0x004b, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002c A[PHI: r3
  0x002c: PHI (r3v4 int) = (r3v0 int), (r3v5 int) binds: [B:10:0x004b, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.data.local.FaceInfo.f7681b
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.FaceInfo.f7683d = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L2f
            long r0 = r5.faceInfoId
            int r0 = java.lang.Long.hashCode(r0)
            int r1 = r0 >> 124
            java.lang.String r0 = r5.templateId
            int r0 = r0.hashCode()
            int r1 = r1 / r0
            int r1 = r1 >>> 122
            java.lang.String r0 = r5.faceTemplate
            int r0 = r0.hashCode()
            int r1 = r1 % r0
            int r3 = r1 / 7
            java.lang.String r0 = r5.customerUUID
            if (r0 != 0) goto L4e
        L2c:
            r2 = 0
        L2d:
            int r3 = r3 + r2
            return r3
        L2f:
            long r0 = r5.faceInfoId
            int r0 = java.lang.Long.hashCode(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r5.templateId
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r5.faceTemplate
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            int r3 = r1 * 31
            java.lang.String r0 = r5.customerUUID
            if (r0 != 0) goto L4e
            goto L2c
        L4e:
            java.lang.String r0 = r5.customerUUID
            int r2 = r0.hashCode()
            int r0 = com.incode.welcome_sdk.data.local.FaceInfo.f7683d
            int r1 = r0 + 5
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.local.FaceInfo.f7681b = r0
            int r1 = r1 % r4
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.local.FaceInfo.hashCode():int");
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7683d + 51;
        f7681b = i3 % 128;
        int i4 = i3 % 2;
        String str = "FaceInfo(faceInfoId=" + this.faceInfoId + ", templateId=" + this.templateId + ", faceTemplate=" + this.faceTemplate + ", customerUUID=" + this.customerUUID + ")";
        int i5 = f7683d + 89;
        f7681b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ FaceInfo copy$default(FaceInfo faceInfo, long j2, String str, String str2, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f7681b + 7;
            f7683d = i4 % 128;
            int i5 = i4 % 2;
            j2 = faceInfo.faceInfoId;
        }
        if ((i2 & 2) != 0) {
            int i6 = f7683d + 43;
            f7681b = i6 % 128;
            if (i6 % 2 == 0) {
                str = faceInfo.templateId;
                int i7 = 92 / 0;
            } else {
                str = faceInfo.templateId;
            }
        }
        if ((i2 & 4) != 0) {
            int i8 = f7683d + 19;
            f7681b = i8 % 128;
            int i9 = i8 % 2;
            str2 = faceInfo.faceTemplate;
            if (i9 == 0) {
                int i10 = 62 / 0;
            }
        }
        if ((i2 & 8) != 0) {
            str3 = faceInfo.customerUUID;
        }
        return faceInfo.copy(j2, str, str2, str3);
    }

    public final FaceInfo copy(long j2, String str, String str2, String str3) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        FaceInfo faceInfo = new FaceInfo(j2, str, str2, str3);
        int i3 = f7681b + 29;
        f7683d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 56 / 0;
        }
        return faceInfo;
    }

    public final String component4() {
        int i2 = 2 % 2;
        int i3 = f7681b;
        int i4 = i3 + 61;
        f7683d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.customerUUID;
        int i6 = i3 + 11;
        f7683d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f7681b;
        int i4 = i3 + 21;
        f7683d = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.faceTemplate;
        int i5 = i3 + 85;
        f7683d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f7681b + 23;
        f7683d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.templateId;
        }
        throw null;
    }

    public final long component1() {
        int i2 = 2 % 2;
        int i3 = f7681b + 11;
        f7683d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.faceInfoId;
        }
        int i4 = 27 / 0;
        return this.faceInfoId;
    }
}
