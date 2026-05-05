package com.incode.welcome_sdk.commons.d;

import com.incode.model_id_face_detection.R;
import com.incode.recogkitandroid.IdFaceDetectorKit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4797a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4798c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IdFaceDetectorKit f4799e;

    @Override // com.incode.welcome_sdk.commons.d.e
    public final /* synthetic */ e d(String str) {
        int i2 = 2 % 2;
        int i3 = f4797a + 87;
        f4798c = i3 % 128;
        int i4 = i3 % 2;
        j jVarA = a(str);
        if (i4 == 0) {
            throw null;
        }
        int i5 = f4797a + 91;
        f4798c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return jVarA;
    }

    @Override // com.incode.welcome_sdk.commons.d.e
    public final /* synthetic */ e e(int i2) {
        int i3 = 2 % 2;
        int i4 = f4798c + 47;
        f4797a = i4 % 128;
        int i5 = i4 % 2;
        return a(i2, 0);
    }

    @Override // com.incode.welcome_sdk.commons.d.e
    public final String b() {
        int i2 = 2 % 2;
        int i3 = f4798c;
        int i4 = i3 + 115;
        f4797a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 75;
        f4797a = i6 % 128;
        if (i6 % 2 == 0) {
            return "id_facedetector.encnnmodelv2";
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.d.e
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f4797a + 97;
        int i4 = i3 % 128;
        f4798c = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = i4 + 111;
        f4797a = i5 % 128;
        int i6 = i5 % 2;
        return "cbaec2e3d9e15973a8482dc5d30bf5f45924e4ee34422eddf406bc7650961013";
    }

    @Override // com.incode.welcome_sdk.commons.d.e
    public final int e() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f4797a + 45;
        f4798c = i4 % 128;
        if (i4 % 2 == 0) {
            i2 = R.raw.id_facedetector;
            int i5 = 35 / 0;
        } else {
            i2 = R.raw.id_facedetector;
        }
        int i6 = f4797a + 39;
        f4798c = i6 % 128;
        int i7 = i6 % 2;
        return i2;
    }

    private j a(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.f4799e = new IdFaceDetectorKit(str);
        int i3 = f4797a + 25;
        f4798c = i3 % 128;
        int i4 = i3 % 2;
        return this;
    }

    private j a(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f4797a;
        int i6 = i5 + 85;
        f4798c = i6 % 128;
        IdFaceDetectorKit idFaceDetectorKit = null;
        if (i6 % 2 == 0) {
            idFaceDetectorKit.hashCode();
            throw null;
        }
        IdFaceDetectorKit idFaceDetectorKit2 = this.f4799e;
        if (idFaceDetectorKit2 == null) {
            int i7 = i5 + 125;
            f4798c = i7 % 128;
            int i8 = i7 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            idFaceDetectorKit = idFaceDetectorKit2;
        }
        idFaceDetectorKit.setNumThreads(i2, 0);
        return this;
    }

    @Override // com.incode.welcome_sdk.commons.d.e
    public final IdFaceDetectorKit c() {
        int i2 = 2 % 2;
        int i3 = f4798c + 109;
        int i4 = i3 % 128;
        f4797a = i4;
        int i5 = i3 % 2;
        IdFaceDetectorKit idFaceDetectorKit = this.f4799e;
        if (idFaceDetectorKit == null) {
            int i6 = i4 + 41;
            f4798c = i6 % 128;
            int i7 = i6 % 2;
            idFaceDetectorKit = null;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i7 == 0) {
                throw null;
            }
        }
        return idFaceDetectorKit;
    }
}
