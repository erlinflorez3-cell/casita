package com.incode.welcome_sdk.commons.d;

import com.incode.core_light.Constants;
import com.incode.core_light.R;
import com.incode.recogkitandroid.SelfieFaceDetectorKit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4800a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4801d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SelfieFaceDetectorKit f4802b;

    @Override // com.incode.welcome_sdk.commons.d.f
    public final /* synthetic */ f b(String str) {
        int i2 = 2 % 2;
        int i3 = f4800a + 13;
        f4801d = i3 % 128;
        int i4 = i3 % 2;
        k kVarE = e(str);
        int i5 = f4800a + 57;
        f4801d = i5 % 128;
        if (i5 % 2 != 0) {
            return kVarE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.d.f
    public final /* synthetic */ f d(int i2) {
        int i3 = 2 % 2;
        int i4 = f4800a + 49;
        f4801d = i4 % 128;
        int i5 = i4 % 2;
        k kVarC = c(i2, 0);
        int i6 = f4800a + 125;
        f4801d = i6 % 128;
        int i7 = i6 % 2;
        return kVarC;
    }

    @Override // com.incode.welcome_sdk.commons.d.f
    public final String b() {
        int i2 = 2 % 2;
        int i3 = f4801d;
        int i4 = i3 + 43;
        f4800a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 99;
        f4800a = i6 % 128;
        int i7 = i6 % 2;
        return Constants.SELFIE_FD_MODEL_FILENAME;
    }

    @Override // com.incode.welcome_sdk.commons.d.f
    public final String d() {
        int i2 = 2 % 2;
        int i3 = f4801d;
        int i4 = i3 + 69;
        f4800a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 63;
        f4800a = i6 % 128;
        int i7 = i6 % 2;
        return Constants.SELFIE_FD_MODEL_CHECKSUM;
    }

    @Override // com.incode.welcome_sdk.commons.d.f
    public final int e() {
        int i2 = 2 % 2;
        int i3 = f4800a + 107;
        f4801d = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.raw.selfie_facedetector;
        int i6 = f4801d + 113;
        f4800a = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private k e(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.f4802b = new SelfieFaceDetectorKit(str);
        int i3 = f4801d + 103;
        f4800a = i3 % 128;
        if (i3 % 2 == 0) {
            return this;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private k c(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f4801d + 1;
        int i6 = i5 % 128;
        f4800a = i6;
        int i7 = i5 % 2;
        SelfieFaceDetectorKit selfieFaceDetectorKit = this.f4802b;
        if (selfieFaceDetectorKit == null) {
            int i8 = i6 + 125;
            f4801d = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            selfieFaceDetectorKit = null;
        }
        selfieFaceDetectorKit.setNumThreads(i2, 0);
        return this;
    }

    @Override // com.incode.welcome_sdk.commons.d.f
    public final SelfieFaceDetectorKit c() {
        int i2 = 2 % 2;
        int i3 = f4801d + 59;
        f4800a = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        SelfieFaceDetectorKit selfieFaceDetectorKit = this.f4802b;
        if (selfieFaceDetectorKit == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = f4800a + 7;
            f4801d = i4 % 128;
            int i5 = i4 % 2;
            selfieFaceDetectorKit = null;
        }
        int i6 = f4801d + 45;
        f4800a = i6 % 128;
        if (i6 % 2 == 0) {
            return selfieFaceDetectorKit;
        }
        throw null;
    }
}
