package com.incode.welcome_sdk.data;

import android.graphics.PointF;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.recogkitandroid.Face;
import com.incode.recogkitandroid.FaceAttributes;
import com.incode.welcome_sdk.ui.camera.video_selfie.FacePositionConstraint;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class SelfieScanFrameLogs {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7545a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7546b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7547c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7548d = 0;
    private final long beginningTimestamp;
    private final long endingTimestamp;
    private final String faceAuthMode;
    private final String faceRecognitionMode;
    private final Integer frameHeight;
    private final Integer frameWidth;
    private final List<e> framesData;
    private final Boolean isOutputTruncated;
    private final String livenessDetectionMode;
    private final String mode;
    private final b thresholds;

    public SelfieScanFrameLogs(long j2, long j3, String str, String str2, String str3, String str4, Integer num, Integer num2, Boolean bool, b bVar, List<e> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.beginningTimestamp = j2;
        this.endingTimestamp = j3;
        this.mode = str;
        this.faceRecognitionMode = str2;
        this.livenessDetectionMode = str3;
        this.faceAuthMode = str4;
        this.frameWidth = num;
        this.frameHeight = num2;
        this.isOutputTruncated = bool;
        this.thresholds = bVar;
        this.framesData = list;
    }

    public final long getBeginningTimestamp() {
        int i2 = 2 % 2;
        int i3 = f7548d;
        int i4 = i3 + 87;
        f7545a = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        long j2 = this.beginningTimestamp;
        int i5 = i3 + 67;
        f7545a = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        obj.hashCode();
        throw null;
    }

    public final long getEndingTimestamp() {
        int i2 = 2 % 2;
        int i3 = f7548d;
        int i4 = i3 + 99;
        f7545a = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.endingTimestamp;
        int i6 = i3 + 107;
        f7545a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 48 / 0;
        }
        return j2;
    }

    public final String getMode() {
        int i2 = 2 % 2;
        int i3 = f7545a + 83;
        int i4 = i3 % 128;
        f7548d = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.mode;
        int i5 = i4 + 65;
        f7545a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFaceRecognitionMode() {
        int i2 = 2 % 2;
        int i3 = f7545a;
        int i4 = i3 + 27;
        f7548d = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.faceRecognitionMode;
        int i5 = i3 + 51;
        f7548d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLivenessDetectionMode() {
        int i2 = 2 % 2;
        int i3 = f7545a;
        int i4 = i3 + 29;
        f7548d = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        String str = this.livenessDetectionMode;
        int i5 = i3 + 95;
        f7548d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFaceAuthMode() {
        int i2 = 2 % 2;
        int i3 = f7548d + 35;
        f7545a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.faceAuthMode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getFrameWidth() {
        int i2 = 2 % 2;
        int i3 = f7545a + 7;
        int i4 = i3 % 128;
        f7548d = i4;
        int i5 = i3 % 2;
        Integer num = this.frameWidth;
        int i6 = i4 + 99;
        f7545a = i6 % 128;
        int i7 = i6 % 2;
        return num;
    }

    public final Integer getFrameHeight() {
        int i2 = 2 % 2;
        int i3 = f7548d;
        int i4 = i3 + 63;
        f7545a = i4 % 128;
        int i5 = i4 % 2;
        Integer num = this.frameHeight;
        int i6 = i3 + 75;
        f7545a = i6 % 128;
        int i7 = i6 % 2;
        return num;
    }

    public final Boolean isOutputTruncated() {
        int i2 = 2 % 2;
        int i3 = f7545a + 5;
        int i4 = i3 % 128;
        f7548d = i4;
        int i5 = i3 % 2;
        Boolean bool = this.isOutputTruncated;
        int i6 = i4 + 59;
        f7545a = i6 % 128;
        if (i6 % 2 != 0) {
            return bool;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final b getThresholds() {
        int i2 = 2 % 2;
        int i3 = f7545a + 31;
        int i4 = i3 % 128;
        f7548d = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        b bVar = this.thresholds;
        int i5 = i4 + 91;
        f7545a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return bVar;
    }

    public final List<e> getFramesData() {
        int i2 = 2 % 2;
        int i3 = f7548d + 83;
        f7545a = i3 % 128;
        int i4 = i3 % 2;
        List<e> list = this.framesData;
        if (i4 == 0) {
            int i5 = 64 / 0;
        }
        return list;
    }

    public static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f7549i = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static int f7550n = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Float f7551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Float f7552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Float f7553c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final FacePositionConstraint f7554d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Boolean f7555e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Boolean f7556f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Boolean f7557g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Float f7558h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Boolean f7559j;

        public b(FacePositionConstraint facePositionConstraint, Float f2, Float f3, Float f4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Float f5) {
            this.f7554d = facePositionConstraint;
            this.f7551a = f2;
            this.f7553c = f3;
            this.f7552b = f4;
            this.f7555e = bool;
            this.f7556f = bool2;
            this.f7559j = bool3;
            this.f7557g = bool4;
            this.f7558h = f5;
        }

        public final JSONObject c() throws JSONException {
            int i2 = 2 % 2;
            JSONObject jSONObject = new JSONObject();
            FacePositionConstraint facePositionConstraint = this.f7554d;
            if (facePositionConstraint != null) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(Float.valueOf(facePositionConstraint.getMinX()));
                jSONArray.put(Float.valueOf(facePositionConstraint.getMinY()));
                jSONArray.put(Float.valueOf(facePositionConstraint.getMaxX()));
                jSONArray.put(Float.valueOf(facePositionConstraint.getMaxY()));
                Unit unit = Unit.INSTANCE;
                jSONObject.put("facePositionConstraints", jSONArray);
            }
            jSONObject.putOpt("angleThreshold", this.f7551a);
            jSONObject.putOpt("brightnessThreshold", this.f7553c);
            jSONObject.putOpt("blurThreshold", this.f7552b);
            jSONObject.putOpt("isLensesCheckEnabled", this.f7555e);
            jSONObject.putOpt("isMaskCheckEnabled", this.f7556f);
            jSONObject.putOpt("isClosedEyesCheckEnabled", this.f7559j);
            jSONObject.putOpt("isHeadCoverCheckEnabled", this.f7557g);
            jSONObject.putOpt("minMagicCropSize", this.f7558h);
            int i3 = f7549i + 99;
            f7550n = i3 % 128;
            int i4 = i3 % 2;
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = f7550n + 105;
                int i4 = i3 % 128;
                f7549i = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 41;
                f7550n = i6 % 128;
                if (i6 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof b)) {
                int i7 = f7550n + 73;
                f7549i = i7 % 128;
                if (i7 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            b bVar = (b) obj;
            if (!Intrinsics.areEqual(this.f7554d, bVar.f7554d) || !Intrinsics.areEqual((Object) this.f7551a, (Object) bVar.f7551a) || !Intrinsics.areEqual((Object) this.f7553c, (Object) bVar.f7553c)) {
                return false;
            }
            if (!Intrinsics.areEqual((Object) this.f7552b, (Object) bVar.f7552b)) {
                int i8 = f7550n + 45;
                f7549i = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.f7555e, bVar.f7555e)) {
                int i10 = f7549i + 71;
                f7550n = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.f7556f, bVar.f7556f)) {
                return false;
            }
            if (Intrinsics.areEqual(this.f7559j, bVar.f7559j)) {
                return Intrinsics.areEqual(this.f7557g, bVar.f7557g) && !(Intrinsics.areEqual((Object) this.f7558h, (Object) bVar.f7558h) ^ true);
            }
            int i12 = f7549i + 9;
            f7550n = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }

        public final int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int iHashCode4;
            int iHashCode5;
            int i2 = 2 % 2;
            FacePositionConstraint facePositionConstraint = this.f7554d;
            if (facePositionConstraint == null) {
                int i3 = f7549i + 3;
                f7550n = i3 % 128;
                iHashCode = i3 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = facePositionConstraint.hashCode();
            }
            int i4 = iHashCode * 31;
            Float f2 = this.f7551a;
            int iHashCode6 = (i4 + (f2 == null ? 0 : f2.hashCode())) * 31;
            Float f3 = this.f7553c;
            if (f3 == null) {
                iHashCode2 = 0;
            } else {
                iHashCode2 = f3.hashCode();
                int i5 = f7550n + 107;
                f7549i = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = (iHashCode6 + iHashCode2) * 31;
            Float f4 = this.f7552b;
            int iHashCode7 = (i7 + (f4 == null ? 0 : f4.hashCode())) * 31;
            Boolean bool = this.f7555e;
            if (bool == null) {
                int i8 = f7550n + 15;
                f7549i = i8 % 128;
                int i9 = i8 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = bool.hashCode();
                int i10 = f7549i + 117;
                f7550n = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = (iHashCode7 + iHashCode3) * 31;
            Boolean bool2 = this.f7556f;
            if (bool2 == null) {
                int i13 = f7550n + 55;
                f7549i = i13 % 128;
                int i14 = i13 % 2;
                iHashCode4 = 0;
            } else {
                iHashCode4 = bool2.hashCode();
            }
            int i15 = (i12 + iHashCode4) * 31;
            Boolean bool3 = this.f7559j;
            int iHashCode8 = (i15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.f7557g;
            if (bool4 == null) {
                int i16 = f7550n + 105;
                f7549i = i16 % 128;
                int i17 = i16 % 2;
                iHashCode5 = 0;
            } else {
                iHashCode5 = bool4.hashCode();
            }
            int i18 = (iHashCode8 + iHashCode5) * 31;
            Float f5 = this.f7558h;
            return i18 + (f5 != null ? f5.hashCode() : 0);
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f7549i + 43;
            f7550n = i3 % 128;
            int i4 = i3 % 2;
            String str = "Thresholds(facePositionConstraints=" + this.f7554d + ", angleThreshold=" + this.f7551a + ", brightnessThreshold=" + this.f7553c + ", blurThreshold=" + this.f7552b + ", isLensesCheckEnabled=" + this.f7555e + ", isMaskCheckEnabled=" + this.f7556f + ", isClosedEyesCheckEnabled=" + this.f7559j + ", isHeadCoverCheckEnabled=" + this.f7557g + ", minMagicCropSize=" + this.f7558h + ")";
            int i5 = f7549i + 53;
            f7550n = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f7560g = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f7561i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Boolean f7562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Float f7563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Float f7564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f7565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Long f7566e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final List<c> f7567h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Float f7568j;

        public e(Long l2, Float f2, Float f3, Boolean bool, String str, Float f4, List<c> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.f7566e = l2;
            this.f7563b = f2;
            this.f7564c = f3;
            this.f7562a = bool;
            this.f7565d = str;
            this.f7568j = f4;
            this.f7567h = list;
        }

        public static final class c {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static int f7569f = 1;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f7570j = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Float f7571a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Float f7572b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Face.Rect f7573c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final b f7574d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Float f7575e;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final FaceAttributes f7576h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private final Boolean f7577i;

            public c(Float f2, Float f3, Float f4, Face.Rect rect, b bVar, FaceAttributes faceAttributes, Boolean bool) {
                this.f7571a = f2;
                this.f7572b = f3;
                this.f7575e = f4;
                this.f7573c = rect;
                this.f7574d = bVar;
                this.f7576h = faceAttributes;
                this.f7577i = bool;
            }

            public static final class b {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private static int f7578h = 0;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                private static int f7579i = 1;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final PointF f7580a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final PointF f7581b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final PointF f7582c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private final PointF f7583d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private final PointF f7584e;

                public b(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, PointF pointF5) {
                    this.f7583d = pointF;
                    this.f7581b = pointF2;
                    this.f7582c = pointF3;
                    this.f7580a = pointF4;
                    this.f7584e = pointF5;
                }

                public final JSONObject a() throws JSONException {
                    int i2 = 2 % 2;
                    JSONObject jSONObject = new JSONObject();
                    PointF pointF = this.f7583d;
                    if (pointF != null) {
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(Float.valueOf(pointF.x));
                        jSONArray.put(Float.valueOf(pointF.y));
                        Unit unit = Unit.INSTANCE;
                        jSONObject.put("rightEye", jSONArray);
                    }
                    PointF pointF2 = this.f7581b;
                    if (pointF2 != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(Float.valueOf(pointF2.x));
                        jSONArray2.put(Float.valueOf(pointF2.y));
                        Unit unit2 = Unit.INSTANCE;
                        jSONObject.put("leftEye", jSONArray2);
                    }
                    PointF pointF3 = this.f7582c;
                    if (pointF3 != null) {
                        JSONArray jSONArray3 = new JSONArray();
                        jSONArray3.put(Float.valueOf(pointF3.x));
                        jSONArray3.put(Float.valueOf(pointF3.y));
                        Unit unit3 = Unit.INSTANCE;
                        jSONObject.put("noseTip", jSONArray3);
                        int i3 = f7578h + 111;
                        f7579i = i3 % 128;
                        int i4 = i3 % 2;
                    }
                    PointF pointF4 = this.f7580a;
                    if (pointF4 == null) {
                        int i5 = f7578h + 113;
                        f7579i = i5 % 128;
                        int i6 = i5 % 2;
                    } else {
                        JSONArray jSONArray4 = new JSONArray();
                        jSONArray4.put(Float.valueOf(pointF4.x));
                        jSONArray4.put(Float.valueOf(pointF4.y));
                        Unit unit4 = Unit.INSTANCE;
                        jSONObject.put("rightMouth", jSONArray4);
                    }
                    PointF pointF5 = this.f7584e;
                    if (pointF5 != null) {
                        JSONArray jSONArray5 = new JSONArray();
                        jSONArray5.put(Float.valueOf(pointF5.x));
                        jSONArray5.put(Float.valueOf(pointF5.y));
                        Unit unit5 = Unit.INSTANCE;
                        jSONObject.put("leftMouth", jSONArray5);
                    }
                    return jSONObject;
                }

                public final boolean equals(Object obj) {
                    int i2 = 2 % 2;
                    if (this == obj) {
                        int i3 = f7579i + 83;
                        f7578h = i3 % 128;
                        return i3 % 2 == 0;
                    }
                    if (!(obj instanceof b)) {
                        int i4 = f7578h + 5;
                        f7579i = i4 % 128;
                        int i5 = i4 % 2;
                        return false;
                    }
                    b bVar = (b) obj;
                    if (!Intrinsics.areEqual(this.f7583d, bVar.f7583d) || !Intrinsics.areEqual(this.f7581b, bVar.f7581b)) {
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.f7582c, bVar.f7582c)) {
                        int i6 = f7578h + 59;
                        f7579i = i6 % 128;
                        int i7 = i6 % 2;
                        return false;
                    }
                    if (!Intrinsics.areEqual(this.f7580a, bVar.f7580a)) {
                        int i8 = f7579i + 53;
                        f7578h = i8 % 128;
                        int i9 = i8 % 2;
                        return false;
                    }
                    if (Intrinsics.areEqual(this.f7584e, bVar.f7584e)) {
                        return true;
                    }
                    int i10 = f7579i + 43;
                    f7578h = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 30 / 0;
                    }
                    return false;
                }

                public final int hashCode() {
                    int iHashCode;
                    int iHashCode2;
                    int iHashCode3;
                    int i2 = 2 % 2;
                    PointF pointF = this.f7583d;
                    int iHashCode4 = 0;
                    if (pointF == null) {
                        int i3 = f7579i + 71;
                        f7578h = i3 % 128;
                        int i4 = i3 % 2;
                        iHashCode = 0;
                    } else {
                        iHashCode = pointF.hashCode();
                    }
                    int i5 = iHashCode * 31;
                    PointF pointF2 = this.f7581b;
                    if (pointF2 == null) {
                        int i6 = f7578h + 19;
                        int i7 = i6 % 128;
                        f7579i = i7;
                        iHashCode2 = i6 % 2 == 0 ? 1 : 0;
                        int i8 = i7 + 59;
                        f7578h = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = 2 / 5;
                        }
                    } else {
                        iHashCode2 = pointF2.hashCode();
                    }
                    int i10 = (i5 + iHashCode2) * 31;
                    PointF pointF3 = this.f7582c;
                    if (pointF3 == null) {
                        int i11 = f7579i + 123;
                        f7578h = i11 % 128;
                        int i12 = i11 % 2;
                        iHashCode3 = 0;
                    } else {
                        iHashCode3 = pointF3.hashCode();
                    }
                    int i13 = (i10 + iHashCode3) * 31;
                    PointF pointF4 = this.f7580a;
                    int iHashCode5 = (i13 + (pointF4 == null ? 0 : pointF4.hashCode())) * 31;
                    PointF pointF5 = this.f7584e;
                    if (pointF5 == null) {
                        int i14 = f7578h + 45;
                        f7579i = i14 % 128;
                        if (i14 % 2 == 0) {
                            iHashCode4 = 1;
                        }
                    } else {
                        iHashCode4 = pointF5.hashCode();
                    }
                    return iHashCode5 + iHashCode4;
                }

                public final String toString() {
                    String str;
                    int i2 = 2 % 2;
                    int i3 = f7579i + 113;
                    f7578h = i3 % 128;
                    if (i3 % 2 != 0) {
                        str = "Landmarks(rightEye=" + this.f7583d + ", leftEye=" + this.f7581b + ", noseTip=" + this.f7582c + ", rightMouth=" + this.f7580a + ", leftMouth=" + this.f7584e + ")";
                        int i4 = 6 / 0;
                    } else {
                        str = "Landmarks(rightEye=" + this.f7583d + ", leftEye=" + this.f7581b + ", noseTip=" + this.f7582c + ", rightMouth=" + this.f7580a + ", leftMouth=" + this.f7584e + ")";
                    }
                    int i5 = f7578h + 53;
                    f7579i = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }
            }

            public final JSONObject b() throws JSONException {
                JSONObject jSONObjectA;
                Boolean boolValueOf;
                int i2 = 2 % 2;
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("yaw", this.f7571a);
                jSONObject.putOpt("roll", this.f7572b);
                jSONObject.putOpt("pitch", this.f7575e);
                Face.Rect rect = this.f7573c;
                if (rect != null) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(Float.valueOf(rect.f3644x));
                    jSONArray.put(Float.valueOf(rect.f3645y));
                    jSONArray.put(Float.valueOf(rect.width));
                    jSONArray.put(Float.valueOf(rect.height));
                    Unit unit = Unit.INSTANCE;
                    jSONObject.put("faceRectangle", jSONArray);
                }
                b bVar = this.f7574d;
                Boolean boolValueOf2 = null;
                if (bVar != null) {
                    jSONObjectA = bVar.a();
                    int i3 = f7570j + 61;
                    f7569f = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    jSONObjectA = null;
                }
                jSONObject.putOpt("landmarks", jSONObjectA);
                FaceAttributes faceAttributes = this.f7576h;
                jSONObject.putOpt("headwear", faceAttributes != null ? Boolean.valueOf(faceAttributes.headwear) : null);
                FaceAttributes faceAttributes2 = this.f7576h;
                if (faceAttributes2 != null) {
                    int i5 = f7570j + 3;
                    f7569f = i5 % 128;
                    if (i5 % 2 == 0) {
                        Boolean.valueOf(faceAttributes2.eyeglasses);
                        throw null;
                    }
                    boolValueOf = Boolean.valueOf(faceAttributes2.eyeglasses);
                } else {
                    boolValueOf = null;
                }
                jSONObject.putOpt("eyeglasses", boolValueOf);
                FaceAttributes faceAttributes3 = this.f7576h;
                jSONObject.putOpt("closedEyes", faceAttributes3 != null ? Boolean.valueOf(faceAttributes3.closedEyes) : null);
                FaceAttributes faceAttributes4 = this.f7576h;
                if (faceAttributes4 != null) {
                    int i6 = f7570j + 101;
                    f7569f = i6 % 128;
                    if (i6 % 2 == 0) {
                        boolValueOf2 = Boolean.valueOf(faceAttributes4.mask);
                        int i7 = 3 / 0;
                    } else {
                        boolValueOf2 = Boolean.valueOf(faceAttributes4.mask);
                    }
                }
                jSONObject.putOpt("mask", boolValueOf2);
                jSONObject.putOpt("isFirstDetectedFaceWithinConstraints", this.f7577i);
                return jSONObject;
            }

            public final boolean equals(Object obj) {
                int i2 = 2 % 2;
                if (this == obj) {
                    int i3 = f7569f + 95;
                    f7570j = i3 % 128;
                    int i4 = i3 % 2;
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (!Intrinsics.areEqual((Object) this.f7571a, (Object) cVar.f7571a)) {
                    int i5 = f7569f + 103;
                    f7570j = i5 % 128;
                    int i6 = i5 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual((Object) this.f7572b, (Object) cVar.f7572b)) {
                    int i7 = f7570j + 11;
                    f7569f = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 74 / 0;
                    }
                    return false;
                }
                if (!Intrinsics.areEqual((Object) this.f7575e, (Object) cVar.f7575e)) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.f7573c, cVar.f7573c)) {
                    int i9 = f7570j + 77;
                    f7569f = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.f7574d, cVar.f7574d)) {
                    return false;
                }
                if (Intrinsics.areEqual(this.f7576h, cVar.f7576h)) {
                    return Intrinsics.areEqual(this.f7577i, cVar.f7577i);
                }
                int i11 = f7569f + 35;
                f7570j = i11 % 128;
                return i11 % 2 != 0;
            }

            public final int hashCode() {
                int iHashCode;
                int iHashCode2;
                int i2 = 2 % 2;
                Float f2 = this.f7571a;
                int iHashCode3 = 0;
                int iHashCode4 = (f2 == null ? 0 : f2.hashCode()) * 31;
                Float f3 = this.f7572b;
                if (f3 == null) {
                    int i3 = f7569f + 107;
                    f7570j = i3 % 128;
                    int i4 = i3 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = f3.hashCode();
                }
                int i5 = (iHashCode4 + iHashCode) * 31;
                Float f4 = this.f7575e;
                int iHashCode5 = (i5 + (f4 == null ? 0 : f4.hashCode())) * 31;
                Face.Rect rect = this.f7573c;
                if (rect == null) {
                    int i6 = f7570j + 99;
                    f7569f = i6 % 128;
                    int i7 = i6 % 2;
                    iHashCode2 = 0;
                } else {
                    iHashCode2 = rect.hashCode();
                }
                int i8 = (iHashCode5 + iHashCode2) * 31;
                b bVar = this.f7574d;
                int iHashCode6 = (i8 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                FaceAttributes faceAttributes = this.f7576h;
                int iHashCode7 = (iHashCode6 + (faceAttributes == null ? 0 : faceAttributes.hashCode())) * 31;
                Boolean bool = this.f7577i;
                if (bool != null) {
                    iHashCode3 = bool.hashCode();
                    int i9 = f7569f + 55;
                    f7570j = i9 % 128;
                    int i10 = i9 % 2;
                }
                return iHashCode7 + iHashCode3;
            }

            public final String toString() {
                String str;
                int i2 = 2 % 2;
                int i3 = f7569f + 101;
                f7570j = i3 % 128;
                if (i3 % 2 != 0) {
                    str = "Face(yaw=" + this.f7571a + ", roll=" + this.f7572b + ", pitch=" + this.f7575e + ", faceRectangle=" + this.f7573c + ", landmarks=" + this.f7574d + ", attributes=" + this.f7576h + ", isFirstDetectedFaceWithinConstraints=" + this.f7577i + ")";
                    int i4 = 4 / 0;
                } else {
                    str = "Face(yaw=" + this.f7571a + ", roll=" + this.f7572b + ", pitch=" + this.f7575e + ", faceRectangle=" + this.f7573c + ", landmarks=" + this.f7574d + ", attributes=" + this.f7576h + ", isFirstDetectedFaceWithinConstraints=" + this.f7577i + ")";
                }
                int i5 = f7570j + 79;
                f7569f = i5 % 128;
                if (i5 % 2 != 0) {
                    return str;
                }
                throw null;
            }
        }

        public final JSONObject e() throws JSONException {
            int i2 = 2 % 2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("timestamp", this.f7566e);
            jSONObject.putOpt("brightness", this.f7563b);
            jSONObject.putOpt("blur", this.f7564c);
            jSONObject.putOpt("magicCropPassed", this.f7562a);
            jSONObject.putOpt("detectionResult", this.f7565d);
            jSONObject.putOpt("faceQualityScore", this.f7568j);
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = this.f7567h.iterator();
            int i3 = f7560g + 77;
            f7561i = i3 % 128;
            int i4 = i3 % 2;
            while (!(!it.hasNext())) {
                int i5 = f7561i + 37;
                f7560g = i5 % 128;
                if (i5 % 2 != 0) {
                    jSONArray.put(((c) it.next()).b());
                } else {
                    jSONArray.put(((c) it.next()).b());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            Unit unit = Unit.INSTANCE;
            jSONObject.put("faces", jSONArray);
            return jSONObject;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f7560g;
            int i4 = i3 + 11;
            f7561i = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                int i5 = i3 + 71;
                f7561i = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            e eVar = (e) obj;
            if ((!Intrinsics.areEqual(this.f7566e, eVar.f7566e)) || !Intrinsics.areEqual((Object) this.f7563b, (Object) eVar.f7563b) || !Intrinsics.areEqual((Object) this.f7564c, (Object) eVar.f7564c) || !Intrinsics.areEqual(this.f7562a, eVar.f7562a) || !Intrinsics.areEqual(this.f7565d, eVar.f7565d)) {
                return false;
            }
            if (!Intrinsics.areEqual((Object) this.f7568j, (Object) eVar.f7568j)) {
                int i7 = f7560g + 29;
                f7561i = i7 % 128;
                if (i7 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            if (Intrinsics.areEqual(this.f7567h, eVar.f7567h)) {
                return true;
            }
            int i8 = f7561i + 125;
            f7560g = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public final int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int i2 = 2 % 2;
            int i3 = f7561i + 89;
            f7560g = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Long l2 = this.f7566e;
            int iHashCode4 = 0;
            int iHashCode5 = (l2 == null ? 0 : l2.hashCode()) * 31;
            Float f2 = this.f7563b;
            int iHashCode6 = (iHashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
            Float f3 = this.f7564c;
            if (f3 == null) {
                int i4 = f7561i + 83;
                f7560g = i4 % 128;
                iHashCode = i4 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = f3.hashCode();
            }
            int i5 = (iHashCode6 + iHashCode) * 31;
            Boolean bool = this.f7562a;
            if (bool == null) {
                int i6 = f7560g;
                int i7 = i6 + 21;
                f7561i = i7 % 128;
                int i8 = i7 % 2;
                int i9 = i6 + 109;
                f7561i = i9 % 128;
                int i10 = i9 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = bool.hashCode();
            }
            int i11 = (i5 + iHashCode2) * 31;
            String str = this.f7565d;
            if (str == null) {
                int i12 = f7560g + 87;
                f7561i = i12 % 128;
                int i13 = i12 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = str.hashCode();
            }
            int i14 = (i11 + iHashCode3) * 31;
            Float f4 = this.f7568j;
            if (f4 != null) {
                iHashCode4 = f4.hashCode();
                int i15 = f7561i + 67;
                f7560g = i15 % 128;
                int i16 = i15 % 2;
            }
            return ((i14 + iHashCode4) * 31) + this.f7567h.hashCode();
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f7561i + 27;
            f7560g = i3 % 128;
            int i4 = i3 % 2;
            String str = "FramesData(timestamp=" + this.f7566e + ", brightness=" + this.f7563b + ", blur=" + this.f7564c + ", magicCropPassed=" + this.f7562a + ", detectionResult=" + this.f7565d + ", faceQualityScore=" + this.f7568j + ", faces=" + this.f7567h + ")";
            int i5 = f7560g + 109;
            f7561i = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }
    }

    public final JSONObject toJson() throws JSONException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("beginningTimestamp", this.beginningTimestamp);
        jSONObject.put("endingTimestamp", this.endingTimestamp);
        jSONObject.putOpt("mode", this.mode);
        jSONObject.putOpt("faceRecognitionMode", this.faceRecognitionMode);
        jSONObject.putOpt("livenessDetectionMode", this.livenessDetectionMode);
        jSONObject.putOpt("faceAuthMode", this.faceAuthMode);
        jSONObject.putOpt("frameWidth", this.frameWidth);
        jSONObject.putOpt("frameHeight", this.frameHeight);
        jSONObject.putOpt("isOutputTruncated", this.isOutputTruncated);
        b bVar = this.thresholds;
        jSONObject.putOpt("thresholds", bVar != null ? bVar.c() : null);
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.framesData.iterator();
        int i3 = f7548d + 23;
        f7545a = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = f7545a + 57;
            f7548d = i5 % 128;
            if (i5 % 2 == 0) {
                jSONArray.put(((e) it.next()).e());
            } else {
                jSONArray.put(((e) it.next()).e());
                throw null;
            }
        }
        Unit unit = Unit.INSTANCE;
        jSONObject.put("framesData", jSONArray);
        return jSONObject;
    }

    static {
        int i2 = 1 + 47;
        f7546b = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f7545a + 45;
            f7548d = i3 % 128;
            return i3 % 2 == 0;
        }
        if (!(obj instanceof SelfieScanFrameLogs)) {
            int i4 = f7545a + 45;
            f7548d = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        SelfieScanFrameLogs selfieScanFrameLogs = (SelfieScanFrameLogs) obj;
        if (this.beginningTimestamp != selfieScanFrameLogs.beginningTimestamp || this.endingTimestamp != selfieScanFrameLogs.endingTimestamp) {
            return false;
        }
        if (!Intrinsics.areEqual(this.mode, selfieScanFrameLogs.mode)) {
            int i6 = f7548d + 85;
            f7545a = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.faceRecognitionMode, selfieScanFrameLogs.faceRecognitionMode)) {
            int i7 = f7548d + 11;
            f7545a = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.livenessDetectionMode, selfieScanFrameLogs.livenessDetectionMode) || !Intrinsics.areEqual(this.faceAuthMode, selfieScanFrameLogs.faceAuthMode) || !Intrinsics.areEqual(this.frameWidth, selfieScanFrameLogs.frameWidth)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.frameHeight, selfieScanFrameLogs.frameHeight)) {
            int i9 = f7548d + 57;
            f7545a = i9 % 128;
            return i9 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.isOutputTruncated, selfieScanFrameLogs.isOutputTruncated)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.thresholds, selfieScanFrameLogs.thresholds)) {
            int i10 = f7545a + 5;
            f7548d = i10 % 128;
            return i10 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.framesData, selfieScanFrameLogs.framesData)) {
            return true;
        }
        int i11 = f7545a;
        int i12 = i11 + 105;
        f7548d = i12 % 128;
        boolean z2 = i12 % 2 != 0;
        int i13 = i11 + 19;
        f7548d = i13 % 128;
        if (i13 % 2 == 0) {
            return z2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i2 = 2 % 2;
        int iHashCode4 = ((Long.hashCode(this.beginningTimestamp) * 31) + Long.hashCode(this.endingTimestamp)) * 31;
        String str = this.mode;
        int iHashCode5 = 0;
        if (str == null) {
            int i3 = f7545a + 17;
            f7548d = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i5 = (iHashCode4 + iHashCode) * 31;
        String str2 = this.faceRecognitionMode;
        int iHashCode6 = (i5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.livenessDetectionMode;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.faceAuthMode;
        if (str4 == null) {
            int i6 = f7545a + 13;
            f7548d = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        int i8 = (iHashCode7 + iHashCode2) * 31;
        Integer num = this.frameWidth;
        int iHashCode8 = (i8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.frameHeight;
        if (num2 == null) {
            int i9 = f7548d + 73;
            f7545a = i9 % 128;
            iHashCode3 = i9 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = num2.hashCode();
            int i10 = f7545a + 23;
            f7548d = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = (iHashCode8 + iHashCode3) * 31;
        Boolean bool = this.isOutputTruncated;
        int iHashCode9 = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        b bVar = this.thresholds;
        if (bVar == null) {
            int i13 = f7548d + 101;
            f7545a = i13 % 128;
            if (i13 % 2 == 0) {
                iHashCode5 = 1;
            }
        } else {
            iHashCode5 = bVar.hashCode();
        }
        int iHashCode10 = ((iHashCode9 + iHashCode5) * 31) + this.framesData.hashCode();
        int i14 = f7548d + 107;
        f7545a = i14 % 128;
        if (i14 % 2 != 0) {
            return iHashCode10;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7548d + 103;
        f7545a = i3 % 128;
        if (i3 % 2 != 0) {
            return "SelfieScanFrameLogs(beginningTimestamp=" + this.beginningTimestamp + ", endingTimestamp=" + this.endingTimestamp + ", mode=" + this.mode + ", faceRecognitionMode=" + this.faceRecognitionMode + ", livenessDetectionMode=" + this.livenessDetectionMode + ", faceAuthMode=" + this.faceAuthMode + ", frameWidth=" + this.frameWidth + ", frameHeight=" + this.frameHeight + ", isOutputTruncated=" + this.isOutputTruncated + ", thresholds=" + this.thresholds + ", framesData=" + this.framesData + ")";
        }
        String str = "SelfieScanFrameLogs(beginningTimestamp=" + this.beginningTimestamp + ", endingTimestamp=" + this.endingTimestamp + ", mode=" + this.mode + ", faceRecognitionMode=" + this.faceRecognitionMode + ", livenessDetectionMode=" + this.livenessDetectionMode + ", faceAuthMode=" + this.faceAuthMode + ", frameWidth=" + this.frameWidth + ", frameHeight=" + this.frameHeight + ", isOutputTruncated=" + this.isOutputTruncated + ", thresholds=" + this.thresholds + ", framesData=" + this.framesData + ")";
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelfieScanFrameLogs copy$default(SelfieScanFrameLogs selfieScanFrameLogs, long j2, long j3, String str, String str2, String str3, String str4, Integer num, Integer num2, Boolean bool, b bVar, List list, int i2, Object obj) {
        long j4 = j2;
        String str5 = str;
        long j5 = j3;
        String str6 = str4;
        String str7 = str3;
        String str8 = str2;
        Boolean bool2 = bool;
        Integer num3 = num2;
        Integer num4 = num;
        List list2 = list;
        b bVar2 = bVar;
        int i3 = 2 % 2;
        int i4 = f7545a;
        int i5 = i4 + 95;
        f7548d = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            j4 = selfieScanFrameLogs.beginningTimestamp;
        }
        if ((i2 & 2) != 0) {
            int i7 = i4 + 95;
            f7548d = i7 % 128;
            if (i7 % 2 != 0) {
                long j6 = selfieScanFrameLogs.endingTimestamp;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            j5 = selfieScanFrameLogs.endingTimestamp;
        }
        if ((i2 & 4) != 0) {
            int i8 = i4 + 1;
            f7548d = i8 % 128;
            int i9 = i8 % 2;
            str5 = selfieScanFrameLogs.mode;
        }
        if ((i2 & 8) != 0) {
            str8 = selfieScanFrameLogs.faceRecognitionMode;
            int i10 = f7548d + 109;
            f7545a = i10 % 128;
            int i11 = i10 % 2;
        }
        if ((i2 & 16) != 0) {
            str7 = selfieScanFrameLogs.livenessDetectionMode;
        }
        if ((i2 & 32) != 0) {
            str6 = selfieScanFrameLogs.faceAuthMode;
        }
        if ((i2 & 64) != 0) {
            num4 = selfieScanFrameLogs.frameWidth;
        }
        if ((i2 & 128) != 0) {
            num3 = selfieScanFrameLogs.frameHeight;
        }
        if ((i2 & 256) != 0) {
            int i12 = f7545a + 29;
            f7548d = i12 % 128;
            int i13 = i12 % 2;
            bool2 = selfieScanFrameLogs.isOutputTruncated;
        }
        if ((i2 & 512) != 0) {
            bVar2 = selfieScanFrameLogs.thresholds;
        }
        if ((i2 & 1024) != 0) {
            list2 = selfieScanFrameLogs.framesData;
        }
        String str9 = str8;
        return selfieScanFrameLogs.copy(j4, j5, str5, str9, str7, str6, num4, num3, bool2, bVar2, list2);
    }

    public final SelfieScanFrameLogs copy(long j2, long j3, String str, String str2, String str3, String str4, Integer num, Integer num2, Boolean bool, b bVar, List<e> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        SelfieScanFrameLogs selfieScanFrameLogs = new SelfieScanFrameLogs(j2, j3, str, str2, str3, str4, num, num2, bool, bVar, list);
        int i3 = f7545a + 121;
        f7548d = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 42 / 0;
        }
        return selfieScanFrameLogs;
    }

    public final List<e> component11() {
        int i2 = 2 % 2;
        int i3 = f7548d;
        int i4 = i3 + 49;
        f7545a = i4 % 128;
        int i5 = i4 % 2;
        List<e> list = this.framesData;
        int i6 = i3 + 9;
        f7545a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 11 / 0;
        }
        return list;
    }

    public final b component10() {
        int i2 = 2 % 2;
        int i3 = f7548d + 95;
        int i4 = i3 % 128;
        f7545a = i4;
        int i5 = i3 % 2;
        b bVar = this.thresholds;
        int i6 = i4 + 43;
        f7548d = i6 % 128;
        int i7 = i6 % 2;
        return bVar;
    }

    public final Boolean component9() {
        int i2 = 2 % 2;
        int i3 = f7545a + 9;
        f7548d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.isOutputTruncated;
        }
        throw null;
    }

    public final Integer component8() {
        Integer num;
        int i2 = 2 % 2;
        int i3 = f7545a + 21;
        int i4 = i3 % 128;
        f7548d = i4;
        if (i3 % 2 != 0) {
            num = this.frameHeight;
            int i5 = 4 / 0;
        } else {
            num = this.frameHeight;
        }
        int i6 = i4 + 37;
        f7545a = i6 % 128;
        int i7 = i6 % 2;
        return num;
    }

    public final Integer component7() {
        int i2 = 2 % 2;
        int i3 = f7545a + 21;
        int i4 = i3 % 128;
        f7548d = i4;
        int i5 = i3 % 2;
        Integer num = this.frameWidth;
        int i6 = i4 + 5;
        f7545a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 6 / 0;
        }
        return num;
    }

    public final String component6() {
        int i2 = 2 % 2;
        int i3 = f7548d;
        int i4 = i3 + 49;
        f7545a = i4 % 128;
        int i5 = i4 % 2;
        String str = this.faceAuthMode;
        int i6 = i3 + 107;
        f7545a = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component5() {
        int i2 = 2 % 2;
        int i3 = f7548d + 17;
        int i4 = i3 % 128;
        f7545a = i4;
        int i5 = i3 % 2;
        String str = this.livenessDetectionMode;
        int i6 = i4 + 15;
        f7548d = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i2 = 2 % 2;
        int i3 = f7545a;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7548d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.faceRecognitionMode;
        int i6 = i3 + 85;
        f7548d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f7548d + 43;
        int i4 = i3 % 128;
        f7545a = i4;
        int i5 = i3 % 2;
        String str = this.mode;
        int i6 = i4 + 39;
        f7548d = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long component2() {
        int i2 = 2 % 2;
        int i3 = f7548d + 59;
        int i4 = i3 % 128;
        f7545a = i4;
        int i5 = i3 % 2;
        long j2 = this.endingTimestamp;
        int i6 = i4 + 25;
        f7548d = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public final long component1() {
        int i2 = 2 % 2;
        int i3 = f7545a;
        int i4 = i3 + 7;
        f7548d = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.beginningTimestamp;
        int i6 = i3 + 87;
        f7548d = i6 % 128;
        if (i6 % 2 == 0) {
            return j2;
        }
        throw null;
    }
}
