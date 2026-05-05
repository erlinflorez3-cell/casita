package com.incode.welcome_sdk.commons.d;

import com.incode.model_liveness_detection.R;
import com.incode.recogkitandroid.FacePadKitAndroid;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4791b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4792d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FacePadKitAndroid f4793e;

    @Override // com.incode.welcome_sdk.commons.d.a
    public final /* synthetic */ a c(int i2) {
        int i3 = 2 % 2;
        int i4 = f4792d + 61;
        f4791b = i4 % 128;
        int i5 = i4 % 2;
        d dVarD = d(i2, 0);
        int i6 = f4791b + 49;
        f4792d = i6 % 128;
        int i7 = i6 % 2;
        return dVarD;
    }

    @Override // com.incode.welcome_sdk.commons.d.a
    public final /* synthetic */ a c(String str) {
        int i2 = 2 % 2;
        int i3 = f4791b + 83;
        f4792d = i3 % 128;
        int i4 = i3 % 2;
        d dVarA = a(str);
        int i5 = f4791b + 77;
        f4792d = i5 % 128;
        if (i5 % 2 != 0) {
            return dVarA;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.d.a
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f4792d + 123;
        f4791b = i3 % 128;
        if (i3 % 2 == 0) {
            return "pad_model_fused_070521_optimized.encnnmodelv2";
        }
        int i4 = 95 / 0;
        return "pad_model_fused_070521_optimized.encnnmodelv2";
    }

    @Override // com.incode.welcome_sdk.commons.d.a
    public final String c() {
        int i2 = 2 % 2;
        int i3 = f4791b;
        int i4 = i3 + 71;
        f4792d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 95;
        f4792d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 68 / 0;
        }
        return "0b2045f777eeaf8ce890b13eb904719773112c1e2c5afdbe7488ab787adc7dec";
    }

    @Override // com.incode.welcome_sdk.commons.d.a
    public final int d() {
        int i2 = 2 % 2;
        int i3 = f4791b + 63;
        f4792d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.raw.pad_model_fused_070521_optimized;
        int i6 = f4792d + 15;
        f4791b = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private d a(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.f4793e = new FacePadKitAndroid(str);
        int i3 = f4791b + 1;
        f4792d = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    private d d(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f4792d + 105;
        f4791b = i5 % 128;
        FacePadKitAndroid facePadKitAndroid = null;
        if (i5 % 2 == 0) {
            FacePadKitAndroid facePadKitAndroid2 = this.f4793e;
            if (facePadKitAndroid2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = f4791b + 87;
                f4792d = i6 % 128;
                int i7 = i6 % 2;
            } else {
                facePadKitAndroid = facePadKitAndroid2;
            }
            facePadKitAndroid.setNumThreads(i2, 0);
            return this;
        }
        facePadKitAndroid.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // com.incode.welcome_sdk.commons.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.recogkitandroid.FacePadKitAndroid e() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.d.d.f4792d
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.d.d.f4791b = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L2f
            com.incode.recogkitandroid.FacePadKitAndroid r2 = r4.f4793e
            r0 = 66
            int r0 = r0 / 0
            if (r2 != 0) goto L25
        L16:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            int r0 = com.incode.welcome_sdk.commons.d.d.f4791b
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.d.d.f4792d = r0
            int r1 = r1 % r3
            r2 = 0
        L25:
            int r0 = com.incode.welcome_sdk.commons.d.d.f4792d
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.d.d.f4791b = r0
            int r1 = r1 % r3
            return r2
        L2f:
            com.incode.recogkitandroid.FacePadKitAndroid r2 = r4.f4793e
            if (r2 != 0) goto L25
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.d.d.e():com.incode.recogkitandroid.FacePadKitAndroid");
    }
}
