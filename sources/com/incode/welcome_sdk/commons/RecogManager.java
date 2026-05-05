package com.incode.welcome_sdk.commons;

import com.incode.recogkitandroid.FaceAttributesDetectorKitAndroid;
import com.incode.recogkitandroid.FacePadKitAndroid;
import com.incode.recogkitandroid.IdFaceDetectorKit;
import com.incode.recogkitandroid.RecogKitAndroid;
import com.incode.recogkitandroid.SelfieFaceDetectorKit;
import com.incode.recogkitandroid.SelfieFaceQualityKitAndroid;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Singleton
public final class RecogManager {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a */
    private static int f4597a = 0;

    /* JADX INFO: renamed from: c */
    private static int f4598c = 1;

    /* JADX INFO: renamed from: d */
    private static int f4599d = 1;

    /* JADX INFO: renamed from: e */
    private static int f4600e = 0;
    private final FaceAttributesDetectorKitAndroid faceAttributesDetectorKit;
    private final FacePadKitAndroid facePadKitAndroid;
    private final IdFaceDetectorKit idFaceDetectorKit;
    private final RecogKitAndroid recogKitAndroid;
    private final SelfieFaceDetectorKit selfieFaceDetectorKit;
    private final SelfieFaceQualityKitAndroid selfieFaceQualityKitAndroid;

    public RecogManager(RecogKitAndroid recogKitAndroid, FacePadKitAndroid facePadKitAndroid, FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid, IdFaceDetectorKit idFaceDetectorKit, SelfieFaceDetectorKit selfieFaceDetectorKit, SelfieFaceQualityKitAndroid selfieFaceQualityKitAndroid) {
        this.recogKitAndroid = recogKitAndroid;
        this.facePadKitAndroid = facePadKitAndroid;
        this.faceAttributesDetectorKit = faceAttributesDetectorKitAndroid;
        this.idFaceDetectorKit = idFaceDetectorKit;
        this.selfieFaceDetectorKit = selfieFaceDetectorKit;
        this.selfieFaceQualityKitAndroid = selfieFaceQualityKitAndroid;
    }

    public final RecogKitAndroid getRecogKitAndroid() {
        int i2 = 2 % 2;
        int i3 = f4597a + 113;
        int i4 = i3 % 128;
        f4599d = i4;
        int i5 = i3 % 2;
        RecogKitAndroid recogKitAndroid = this.recogKitAndroid;
        int i6 = i4 + 91;
        f4597a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 19 / 0;
        }
        return recogKitAndroid;
    }

    public final FacePadKitAndroid getFacePadKitAndroid() {
        int i2 = 2 % 2;
        int i3 = f4597a + 59;
        int i4 = i3 % 128;
        f4599d = i4;
        int i5 = i3 % 2;
        FacePadKitAndroid facePadKitAndroid = this.facePadKitAndroid;
        int i6 = i4 + 59;
        f4597a = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 29 / 0;
        }
        return facePadKitAndroid;
    }

    public final FaceAttributesDetectorKitAndroid getFaceAttributesDetectorKit() {
        int i2 = 2 % 2;
        int i3 = f4597a;
        int i4 = i3 + 99;
        f4599d = i4 % 128;
        int i5 = i4 % 2;
        FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid = this.faceAttributesDetectorKit;
        int i6 = i3 + 21;
        f4599d = i6 % 128;
        int i7 = i6 % 2;
        return faceAttributesDetectorKitAndroid;
    }

    public final IdFaceDetectorKit getIdFaceDetectorKit() {
        int i2 = 2 % 2;
        int i3 = f4597a + 3;
        f4599d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.idFaceDetectorKit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SelfieFaceDetectorKit getSelfieFaceDetectorKit() {
        int i2 = 2 % 2;
        int i3 = f4597a + 113;
        int i4 = i3 % 128;
        f4599d = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        SelfieFaceDetectorKit selfieFaceDetectorKit = this.selfieFaceDetectorKit;
        int i5 = i4 + 117;
        f4597a = i5 % 128;
        if (i5 % 2 == 0) {
            return selfieFaceDetectorKit;
        }
        obj.hashCode();
        throw null;
    }

    public final SelfieFaceQualityKitAndroid getSelfieFaceQualityKitAndroid() {
        SelfieFaceQualityKitAndroid selfieFaceQualityKitAndroid;
        int i2 = 2 % 2;
        int i3 = f4599d + 11;
        int i4 = i3 % 128;
        f4597a = i4;
        if (i3 % 2 != 0) {
            selfieFaceQualityKitAndroid = this.selfieFaceQualityKitAndroid;
            int i5 = 1 / 0;
        } else {
            selfieFaceQualityKitAndroid = this.selfieFaceQualityKitAndroid;
        }
        int i6 = i4 + 79;
        f4599d = i6 % 128;
        if (i6 % 2 != 0) {
            return selfieFaceQualityKitAndroid;
        }
        throw null;
    }

    static {
        int i2 = 1 + 75;
        f4600e = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecogManager)) {
            return false;
        }
        RecogManager recogManager = (RecogManager) obj;
        if (!Intrinsics.areEqual(this.recogKitAndroid, recogManager.recogKitAndroid) || !Intrinsics.areEqual(this.facePadKitAndroid, recogManager.facePadKitAndroid)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.faceAttributesDetectorKit, recogManager.faceAttributesDetectorKit)) {
            int i3 = f4597a + 45;
            f4599d = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.idFaceDetectorKit, recogManager.idFaceDetectorKit) || !Intrinsics.areEqual(this.selfieFaceDetectorKit, recogManager.selfieFaceDetectorKit)) {
            return false;
        }
        if (Intrinsics.areEqual(this.selfieFaceQualityKitAndroid, recogManager.selfieFaceQualityKitAndroid)) {
            return true;
        }
        int i5 = f4599d;
        int i6 = i5 + 113;
        f4597a = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 45;
        f4597a = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i2 = 2 % 2;
        RecogKitAndroid recogKitAndroid = this.recogKitAndroid;
        int iHashCode4 = 0;
        int iHashCode5 = (recogKitAndroid == null ? 0 : recogKitAndroid.hashCode()) * 31;
        FacePadKitAndroid facePadKitAndroid = this.facePadKitAndroid;
        if (facePadKitAndroid == null) {
            int i3 = f4597a + 59;
            f4599d = i3 % 128;
            iHashCode = i3 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = facePadKitAndroid.hashCode();
        }
        int i4 = (iHashCode5 + iHashCode) * 31;
        FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid = this.faceAttributesDetectorKit;
        int iHashCode6 = (i4 + (faceAttributesDetectorKitAndroid == null ? 0 : faceAttributesDetectorKitAndroid.hashCode())) * 31;
        IdFaceDetectorKit idFaceDetectorKit = this.idFaceDetectorKit;
        if (idFaceDetectorKit == null) {
            int i5 = f4597a + 113;
            f4599d = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = idFaceDetectorKit.hashCode();
        }
        int i7 = (iHashCode6 + iHashCode2) * 31;
        SelfieFaceDetectorKit selfieFaceDetectorKit = this.selfieFaceDetectorKit;
        if (selfieFaceDetectorKit == null) {
            int i8 = f4597a + 123;
            f4599d = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = selfieFaceDetectorKit.hashCode();
        }
        int i10 = (i7 + iHashCode3) * 31;
        SelfieFaceQualityKitAndroid selfieFaceQualityKitAndroid = this.selfieFaceQualityKitAndroid;
        if (selfieFaceQualityKitAndroid == null) {
            int i11 = f4597a + 51;
            f4599d = i11 % 128;
            int i12 = i11 % 2;
        } else {
            iHashCode4 = selfieFaceQualityKitAndroid.hashCode();
        }
        return i10 + iHashCode4;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f4597a + 27;
        f4599d = i3 % 128;
        if (i3 % 2 != 0) {
            return "RecogManager(recogKitAndroid=" + this.recogKitAndroid + ", facePadKitAndroid=" + this.facePadKitAndroid + ", faceAttributesDetectorKit=" + this.faceAttributesDetectorKit + ", idFaceDetectorKit=" + this.idFaceDetectorKit + ", selfieFaceDetectorKit=" + this.selfieFaceDetectorKit + ", selfieFaceQualityKitAndroid=" + this.selfieFaceQualityKitAndroid + ")";
        }
        String str = "RecogManager(recogKitAndroid=" + this.recogKitAndroid + ", facePadKitAndroid=" + this.facePadKitAndroid + ", faceAttributesDetectorKit=" + this.faceAttributesDetectorKit + ", idFaceDetectorKit=" + this.idFaceDetectorKit + ", selfieFaceDetectorKit=" + this.selfieFaceDetectorKit + ", selfieFaceQualityKitAndroid=" + this.selfieFaceQualityKitAndroid + ")";
        throw null;
    }

    public static /* synthetic */ RecogManager copy$default(RecogManager recogManager, RecogKitAndroid recogKitAndroid, FacePadKitAndroid facePadKitAndroid, FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid, IdFaceDetectorKit idFaceDetectorKit, SelfieFaceDetectorKit selfieFaceDetectorKit, SelfieFaceQualityKitAndroid selfieFaceQualityKitAndroid, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f4599d;
        int i5 = i4 + 71;
        f4597a = i5 % 128;
        if (i5 % 2 == 0 && (i2 & 1) != 0) {
            recogKitAndroid = recogManager.recogKitAndroid;
        }
        if ((i2 & 2) != 0) {
            facePadKitAndroid = recogManager.facePadKitAndroid;
        }
        if ((i2 & 4) != 0) {
            int i6 = i4 + 41;
            f4597a = i6 % 128;
            int i7 = i6 % 2;
            faceAttributesDetectorKitAndroid = recogManager.faceAttributesDetectorKit;
        }
        if ((i2 & 8) != 0) {
            int i8 = i4 + 37;
            f4597a = i8 % 128;
            if (i8 % 2 != 0) {
                idFaceDetectorKit = recogManager.idFaceDetectorKit;
                int i9 = 2 / 0;
            } else {
                idFaceDetectorKit = recogManager.idFaceDetectorKit;
            }
        }
        if ((i2 & 16) != 0) {
            selfieFaceDetectorKit = recogManager.selfieFaceDetectorKit;
        }
        if ((i2 & 32) != 0) {
            selfieFaceQualityKitAndroid = recogManager.selfieFaceQualityKitAndroid;
        }
        return recogManager.copy(recogKitAndroid, facePadKitAndroid, faceAttributesDetectorKitAndroid, idFaceDetectorKit, selfieFaceDetectorKit, selfieFaceQualityKitAndroid);
    }

    public final RecogManager copy(RecogKitAndroid recogKitAndroid, FacePadKitAndroid facePadKitAndroid, FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid, IdFaceDetectorKit idFaceDetectorKit, SelfieFaceDetectorKit selfieFaceDetectorKit, SelfieFaceQualityKitAndroid selfieFaceQualityKitAndroid) {
        int i2 = 2 % 2;
        RecogManager recogManager = new RecogManager(recogKitAndroid, facePadKitAndroid, faceAttributesDetectorKitAndroid, idFaceDetectorKit, selfieFaceDetectorKit, selfieFaceQualityKitAndroid);
        int i3 = f4599d + 79;
        f4597a = i3 % 128;
        if (i3 % 2 == 0) {
            return recogManager;
        }
        throw null;
    }

    public final SelfieFaceQualityKitAndroid component6() {
        int i2 = 2 % 2;
        int i3 = f4597a;
        int i4 = i3 + 57;
        f4599d = i4 % 128;
        int i5 = i4 % 2;
        SelfieFaceQualityKitAndroid selfieFaceQualityKitAndroid = this.selfieFaceQualityKitAndroid;
        int i6 = i3 + 13;
        f4599d = i6 % 128;
        if (i6 % 2 != 0) {
            return selfieFaceQualityKitAndroid;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SelfieFaceDetectorKit component5() {
        int i2 = 2 % 2;
        int i3 = f4597a + 79;
        f4599d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.selfieFaceDetectorKit;
        }
        throw null;
    }

    public final IdFaceDetectorKit component4() {
        int i2 = 2 % 2;
        int i3 = f4597a + 63;
        f4599d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.idFaceDetectorKit;
        }
        throw null;
    }

    public final FaceAttributesDetectorKitAndroid component3() {
        int i2 = 2 % 2;
        int i3 = f4599d + 71;
        int i4 = i3 % 128;
        f4597a = i4;
        int i5 = i3 % 2;
        FaceAttributesDetectorKitAndroid faceAttributesDetectorKitAndroid = this.faceAttributesDetectorKit;
        int i6 = i4 + 85;
        f4599d = i6 % 128;
        int i7 = i6 % 2;
        return faceAttributesDetectorKitAndroid;
    }

    public final FacePadKitAndroid component2() {
        int i2 = 2 % 2;
        int i3 = f4597a + 63;
        f4599d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.facePadKitAndroid;
        }
        throw null;
    }

    public final RecogKitAndroid component1() {
        int i2 = 2 % 2;
        int i3 = f4599d + 63;
        f4597a = i3 % 128;
        if (i3 % 2 == 0) {
            return this.recogKitAndroid;
        }
        throw null;
    }
}
