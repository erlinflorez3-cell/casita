package com.incode.welcome_sdk.commons.d;

import com.incode.core_light.Constants;
import com.incode.core_light.R;
import com.incode.recogkitandroid.SelfieFaceQualityKitAndroid;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4803d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4804e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SelfieFaceQualityKitAndroid f4805a;

    @Override // com.incode.welcome_sdk.commons.d.i
    public final /* synthetic */ i a(String str) {
        int i2 = 2 % 2;
        int i3 = f4803d + 109;
        f4804e = i3 % 128;
        int i4 = i3 % 2;
        n nVarC = c(str, 0.63f);
        int i5 = f4804e + 11;
        f4803d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return nVarC;
    }

    @Override // com.incode.welcome_sdk.commons.d.i
    public final /* bridge */ /* synthetic */ i c(int i2) {
        int i3 = 2 % 2;
        int i4 = f4803d + 15;
        f4804e = i4 % 128;
        int i5 = i4 % 2;
        n nVarC = c(i2, 0);
        int i6 = f4803d + 43;
        f4804e = i6 % 128;
        if (i6 % 2 == 0) {
            return nVarC;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.d.i
    public final String e() {
        int i2 = 2 % 2;
        int i3 = f4804e + 69;
        int i4 = i3 % 128;
        f4803d = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = i4 + 95;
        f4804e = i5 % 128;
        int i6 = i5 % 2;
        return Constants.SELFIE_FACE_QUALITY_MODEL_FILENAME;
    }

    @Override // com.incode.welcome_sdk.commons.d.i
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f4804e + 93;
        int i4 = i3 % 128;
        f4803d = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i4 + 19;
        f4804e = i5 % 128;
        int i6 = i5 % 2;
        return Constants.SELFIE_FACE_QUALITY_MODEL_CHECKSUM;
    }

    @Override // com.incode.welcome_sdk.commons.d.i
    public final int d() {
        int i2 = 2 % 2;
        int i3 = f4804e + 91;
        f4803d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.raw.selfie_quality_model_v1_0_f16_4773007c657b4f05a460321456740d0f;
        int i6 = f4803d + 13;
        f4804e = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private n c(String str, float f2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.f4805a = new SelfieFaceQualityKitAndroid(str, 0.63f);
        int i3 = f4804e + 41;
        f4803d = i3 % 128;
        if (i3 % 2 != 0) {
            return this;
        }
        throw null;
    }

    private n c(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f4804e + 25;
        f4803d = i5 % 128;
        int i6 = i5 % 2;
        SelfieFaceQualityKitAndroid selfieFaceQualityKitAndroid = this.f4805a;
        Object obj = null;
        if (selfieFaceQualityKitAndroid == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            selfieFaceQualityKitAndroid = null;
        }
        selfieFaceQualityKitAndroid.setNumThreads(i2, 0);
        int i7 = f4804e + 83;
        f4803d = i7 % 128;
        if (i7 % 2 != 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.d.i
    public final SelfieFaceQualityKitAndroid c() {
        int i2 = 2 % 2;
        int i3 = f4803d + 107;
        f4804e = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        SelfieFaceQualityKitAndroid selfieFaceQualityKitAndroid = this.f4805a;
        if (selfieFaceQualityKitAndroid != null) {
            return selfieFaceQualityKitAndroid;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = f4803d + 125;
        f4804e = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
