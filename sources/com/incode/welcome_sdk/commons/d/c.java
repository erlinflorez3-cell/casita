package com.incode.welcome_sdk.commons.d;

import com.incode.core_light.Constants;
import com.incode.core_light.R;
import com.incode.recogkitandroid.FaceAttributesDetectorKitAndroid;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4788a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4789e = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FaceAttributesDetectorKitAndroid f4790c;

    @Override // com.incode.welcome_sdk.commons.d.b
    public final /* synthetic */ b c(int i2) {
        int i3 = 2 % 2;
        int i4 = f4788a + 5;
        f4789e = i4 % 128;
        int i5 = i4 % 2;
        c cVarA = a(i2, 0);
        int i6 = f4788a + 121;
        f4789e = i6 % 128;
        if (i6 % 2 != 0) {
            return cVarA;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.d.b
    public final /* synthetic */ b c(String str) {
        int i2 = 2 % 2;
        int i3 = f4789e + 29;
        f4788a = i3 % 128;
        int i4 = i3 % 2;
        c cVarB = b(str);
        int i5 = f4789e + 61;
        f4788a = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return cVarB;
    }

    @Override // com.incode.welcome_sdk.commons.d.b
    public final String e() {
        int i2 = 2 % 2;
        int i3 = f4789e;
        int i4 = i3 + 125;
        f4788a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 71;
        f4788a = i6 % 128;
        if (i6 % 2 == 0) {
            return Constants.FACE_ATTRIBUTES_MODEL_FILENAME;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.d.b
    public final String b() {
        int i2 = 2 % 2;
        int i3 = f4788a + 1;
        int i4 = i3 % 128;
        f4789e = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i4 + 121;
        f4788a = i5 % 128;
        int i6 = i5 % 2;
        return Constants.FACE_ATTRIBUTES_MODEL_CHECKSUM;
    }

    @Override // com.incode.welcome_sdk.commons.d.b
    public final int a() {
        int i2 = 2 % 2;
        int i3 = f4788a + 81;
        f4789e = i3 % 128;
        int i4 = i3 % 2;
        int i5 = R.raw.bf_attrib_31b8f9d92fb345c2b4bbdd222792562c_0;
        if (i4 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private c b(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.f4790c = new FaceAttributesDetectorKitAndroid(str);
        int i3 = f4789e + 115;
        f4788a = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    private c a(int i2, int i3) {
        int i4 = 2 % 2;
        FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid = this.f4790c;
        if (faceAttributesDetectorKitAndroid == null) {
            int i5 = f4789e + 31;
            f4788a = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            faceAttributesDetectorKitAndroid = null;
        }
        faceAttributesDetectorKitAndroid.setNumThreads(i2, 0);
        int i7 = f4789e + 5;
        f4788a = i7 % 128;
        int i8 = i7 % 2;
        return this;
    }

    @Override // com.incode.welcome_sdk.commons.d.b
    public final FaceAttributesDetectorKitAndroid d() {
        int i2 = 2 % 2;
        int i3 = f4788a + 115;
        f4789e = i3 % 128;
        FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid2 = this.f4790c;
        if (faceAttributesDetectorKitAndroid2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            faceAttributesDetectorKitAndroid = faceAttributesDetectorKitAndroid2;
        }
        int i4 = f4789e + 101;
        f4788a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
        return faceAttributesDetectorKitAndroid;
    }
}
