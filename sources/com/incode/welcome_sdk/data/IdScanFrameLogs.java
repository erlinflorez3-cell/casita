package com.incode.welcome_sdk.data;

import android.graphics.Point;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class IdScanFrameLogs {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7473a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7474b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7475c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7476d = 0;
    private final String algorithm;
    private final Float autocapturedFrameScore;
    private final long beginningTimestamp;
    private final Boolean enableBackShownAsFrontCheck;
    private final Boolean enableFrontShownAsBackCheck;
    private final long endingTimestamp;
    private final List<e> framesData;
    private final Boolean isOutputTruncated;
    private final String modelVersion;
    private final Boolean shouldSkipLocalGlareCheckBackId;
    private final d thresholds;

    public IdScanFrameLogs(String str, long j2, long j3, Boolean bool, Boolean bool2, Float f2, Boolean bool3, Boolean bool4, String str2, d dVar, List<e> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.modelVersion = str;
        this.beginningTimestamp = j2;
        this.endingTimestamp = j3;
        this.enableBackShownAsFrontCheck = bool;
        this.enableFrontShownAsBackCheck = bool2;
        this.autocapturedFrameScore = f2;
        this.isOutputTruncated = bool3;
        this.shouldSkipLocalGlareCheckBackId = bool4;
        this.algorithm = str2;
        this.thresholds = dVar;
        this.framesData = list;
    }

    public /* synthetic */ IdScanFrameLogs(String str, long j2, long j3, Boolean bool, Boolean bool2, Float f2, Boolean bool3, Boolean bool4, String str2, d dVar, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, j3, bool, bool2, f2, bool3, bool4, (i2 & 256) != 0 ? null : str2, dVar, list);
    }

    public final String getModelVersion() {
        int i2 = 2 % 2;
        int i3 = f7474b + 25;
        int i4 = i3 % 128;
        f7476d = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.modelVersion;
        int i5 = i4 + 59;
        f7474b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long getBeginningTimestamp() {
        int i2 = 2 % 2;
        int i3 = f7476d + 61;
        int i4 = i3 % 128;
        f7474b = i4;
        int i5 = i3 % 2;
        long j2 = this.beginningTimestamp;
        int i6 = i4 + 5;
        f7476d = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public final long getEndingTimestamp() {
        int i2 = 2 % 2;
        int i3 = f7476d + 103;
        int i4 = i3 % 128;
        f7474b = i4;
        int i5 = i3 % 2;
        long j2 = this.endingTimestamp;
        int i6 = i4 + 99;
        f7476d = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public final Boolean getEnableBackShownAsFrontCheck() {
        int i2 = 2 % 2;
        int i3 = f7474b + 65;
        int i4 = i3 % 128;
        f7476d = i4;
        int i5 = i3 % 2;
        Boolean bool = this.enableBackShownAsFrontCheck;
        int i6 = i4 + 111;
        f7474b = i6 % 128;
        int i7 = i6 % 2;
        return bool;
    }

    public final Boolean getEnableFrontShownAsBackCheck() {
        int i2 = 2 % 2;
        int i3 = f7474b;
        int i4 = i3 + 1;
        f7476d = i4 % 128;
        int i5 = i4 % 2;
        Boolean bool = this.enableFrontShownAsBackCheck;
        int i6 = i3 + 35;
        f7476d = i6 % 128;
        int i7 = i6 % 2;
        return bool;
    }

    public final Float getAutocapturedFrameScore() {
        int i2 = 2 % 2;
        int i3 = f7474b + 125;
        int i4 = i3 % 128;
        f7476d = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        Float f2 = this.autocapturedFrameScore;
        int i5 = i4 + 71;
        f7474b = i5 % 128;
        int i6 = i5 % 2;
        return f2;
    }

    public final Boolean isOutputTruncated() {
        int i2 = 2 % 2;
        int i3 = f7476d + 109;
        int i4 = i3 % 128;
        f7474b = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.isOutputTruncated;
        int i5 = i4 + 85;
        f7476d = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        obj.hashCode();
        throw null;
    }

    public final Boolean getShouldSkipLocalGlareCheckBackId() {
        Boolean bool;
        int i2 = 2 % 2;
        int i3 = f7474b;
        int i4 = i3 + 111;
        f7476d = i4 % 128;
        if (i4 % 2 != 0) {
            bool = this.shouldSkipLocalGlareCheckBackId;
            int i5 = 31 / 0;
        } else {
            bool = this.shouldSkipLocalGlareCheckBackId;
        }
        int i6 = i3 + 55;
        f7476d = i6 % 128;
        if (i6 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final String getAlgorithm() {
        int i2 = 2 % 2;
        int i3 = f7476d + 51;
        int i4 = i3 % 128;
        f7474b = i4;
        int i5 = i3 % 2;
        String str = this.algorithm;
        int i6 = i4 + 41;
        f7476d = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final d getThresholds() {
        int i2 = 2 % 2;
        int i3 = f7476d + 51;
        int i4 = i3 % 128;
        f7474b = i4;
        int i5 = i3 % 2;
        d dVar = this.thresholds;
        int i6 = i4 + 7;
        f7476d = i6 % 128;
        if (i6 % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    public final List<e> getFramesData() {
        int i2 = 2 % 2;
        int i3 = f7474b + 1;
        int i4 = i3 % 128;
        f7476d = i4;
        int i5 = i3 % 2;
        List<e> list = this.framesData;
        int i6 = i4 + 111;
        f7474b = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public static final class d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f7477g = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f7478o = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Float f7480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Float f7481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Float f7482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Float f7483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Float f7484f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Float f7485h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Float f7486i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Float f7487j;

        public /* synthetic */ d(String str, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7) {
            this(str, f2, f3, f4, f5, f6, f7, null, null);
        }

        public d(String str, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9) {
            this.f7479a = str;
            this.f7483e = f2;
            this.f7481c = f3;
            this.f7480b = f4;
            this.f7482d = f5;
            this.f7485h = f6;
            this.f7486i = f7;
            this.f7487j = f8;
            this.f7484f = f9;
        }

        public final JSONObject e() throws JSONException {
            int i2 = 2 % 2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("side", this.f7479a);
            jSONObject.putOpt("brightnessThreshold", this.f7483e);
            jSONObject.putOpt("blurThreshold", this.f7481c);
            jSONObject.putOpt("clsThreshold", this.f7480b);
            jSONObject.putOpt("glareThreshold", this.f7482d);
            jSONObject.putOpt("sideThreshold", this.f7485h);
            jSONObject.putOpt("iouThreshold", this.f7486i);
            jSONObject.putOpt("barcodeReadabilityThreshold", this.f7484f);
            jSONObject.putOpt("textReadabilityThreshold", this.f7487j);
            int i3 = f7478o + 85;
            f7477g = i3 % 128;
            if (i3 % 2 == 0) {
                return jSONObject;
            }
            throw null;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!Intrinsics.areEqual(this.f7479a, dVar.f7479a)) {
                int i3 = f7477g + 41;
                int i4 = i3 % 128;
                f7478o = i4;
                boolean z2 = i3 % 2 == 0;
                int i5 = i4 + 55;
                f7477g = i5 % 128;
                if (i5 % 2 == 0) {
                    return z2;
                }
                throw null;
            }
            if (!Intrinsics.areEqual((Object) this.f7483e, (Object) dVar.f7483e)) {
                int i6 = f7477g + 9;
                f7478o = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual((Object) this.f7481c, (Object) dVar.f7481c)) {
                return false;
            }
            if (!Intrinsics.areEqual((Object) this.f7480b, (Object) dVar.f7480b)) {
                int i8 = f7478o + 81;
                f7477g = i8 % 128;
                return i8 % 2 != 0;
            }
            if (!Intrinsics.areEqual((Object) this.f7482d, (Object) dVar.f7482d)) {
                int i9 = f7477g + 51;
                f7478o = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (!Intrinsics.areEqual((Object) this.f7485h, (Object) dVar.f7485h)) {
                int i11 = f7478o + 103;
                f7477g = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if (!Intrinsics.areEqual((Object) this.f7486i, (Object) dVar.f7486i) || (!Intrinsics.areEqual((Object) this.f7487j, (Object) dVar.f7487j))) {
                return false;
            }
            if (Intrinsics.areEqual((Object) this.f7484f, (Object) dVar.f7484f)) {
                return true;
            }
            int i13 = f7478o + 91;
            f7477g = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }

        public final int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int iHashCode4;
            int i2;
            int i3 = 2 % 2;
            int i4 = f7478o + 35;
            int i5 = i4 % 128;
            f7477g = i5;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.f7479a;
            int iHashCode5 = 0;
            if (str == null) {
                int i6 = i5 + 83;
                f7478o = i6 % 128;
                int i7 = i6 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int i8 = iHashCode * 31;
            Float f2 = this.f7483e;
            if (f2 == null) {
                int i9 = f7477g + 65;
                f7478o = i9 % 128;
                int i10 = i9 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = f2.hashCode();
            }
            int i11 = (i8 + iHashCode2) * 31;
            Float f3 = this.f7481c;
            int iHashCode6 = (i11 + (f3 == null ? 0 : f3.hashCode())) * 31;
            Float f4 = this.f7480b;
            int iHashCode7 = (iHashCode6 + (f4 == null ? 0 : f4.hashCode())) * 31;
            Float f5 = this.f7482d;
            if (f5 == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = f5.hashCode();
                int i12 = f7477g + 59;
                f7478o = i12 % 128;
                int i13 = i12 % 2;
            }
            int i14 = (iHashCode7 + iHashCode3) * 31;
            Float f6 = this.f7485h;
            int iHashCode8 = (i14 + (f6 == null ? 0 : f6.hashCode())) * 31;
            Float f7 = this.f7486i;
            if (f7 == null) {
                int i15 = f7477g + 83;
                f7478o = i15 % 128;
                int i16 = i15 % 2;
                iHashCode4 = 0;
            } else {
                iHashCode4 = f7.hashCode();
            }
            int i17 = (iHashCode8 + iHashCode4) * 31;
            Float f8 = this.f7487j;
            int iHashCode9 = (i17 + (f8 == null ? 0 : f8.hashCode())) * 31;
            Float f9 = this.f7484f;
            if (f9 == null) {
                i2 = f7478o + 49;
            } else {
                iHashCode5 = f9.hashCode();
                i2 = f7478o + 63;
            }
            f7477g = i2 % 128;
            int i18 = i2 % 2;
            return iHashCode9 + iHashCode5;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f7478o + 123;
            f7477g = i3 % 128;
            if (i3 % 2 != 0) {
                String str = "Thresholds(side=" + this.f7479a + ", brightnessThreshold=" + this.f7483e + ", blurThreshold=" + this.f7481c + ", clsThreshold=" + this.f7480b + ", glareThreshold=" + this.f7482d + ", sideThreshold=" + this.f7485h + ", iouThreshold=" + this.f7486i + ", textReadabilityThreshold=" + this.f7487j + ", barcodeReadabilityThreshold=" + this.f7484f + ")";
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str2 = "Thresholds(side=" + this.f7479a + ", brightnessThreshold=" + this.f7483e + ", blurThreshold=" + this.f7481c + ", clsThreshold=" + this.f7480b + ", glareThreshold=" + this.f7482d + ", sideThreshold=" + this.f7485h + ", iouThreshold=" + this.f7486i + ", textReadabilityThreshold=" + this.f7487j + ", barcodeReadabilityThreshold=" + this.f7484f + ")";
            int i4 = f7478o + 113;
            f7477g = i4 % 128;
            int i5 = i4 % 2;
            return str2;
        }
    }

    public static final class e {
        private static int A = 1;
        private static int B = 0;
        private static int C = 0;
        private static int D = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<Point> f7488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Float f7489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f7490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Long f7491d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Float f7492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f7493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Float f7494g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Integer f7495h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Float f7496i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final Float f7497j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final String f7498k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final Boolean f7499l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Boolean f7500m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Integer f7501n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final Integer f7502o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final String f7503p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Float f7504q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Float f7505r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final Float f7506s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Float f7507t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final Integer f7508u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final Integer f7509v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final Boolean f7510w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final Boolean f7511x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final Float f7512y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private final Float f7513z;

        public /* synthetic */ e(Long l2, String str, Float f2, Float f3, List list, Float f4, Float f5, String str2, Float f6, Integer num, Integer num2, Integer num3, String str3, Boolean bool, Boolean bool2, Float f7, Float f8, Float f9, Float f10, String str4) {
            this(l2, str, f2, f3, list, f4, f5, str2, f6, num, num2, num3, str3, bool, bool2, f7, f8, f9, f10, str4, null, null, null, null, null, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(Long l2, String str, Float f2, Float f3, List<? extends Point> list, Float f4, Float f5, String str2, Float f6, Integer num, Integer num2, Integer num3, String str3, Boolean bool, Boolean bool2, Float f7, Float f8, Float f9, Float f10, String str4, Integer num4, Boolean bool3, Integer num5, Boolean bool4, Float f11, Float f12) {
            this.f7491d = l2;
            this.f7490c = str;
            this.f7489b = f2;
            this.f7492e = f3;
            this.f7488a = list;
            this.f7496i = f4;
            this.f7497j = f5;
            this.f7493f = str2;
            this.f7494g = f6;
            this.f7495h = num;
            this.f7501n = num2;
            this.f7502o = num3;
            this.f7498k = str3;
            this.f7500m = bool;
            this.f7499l = bool2;
            this.f7504q = f7;
            this.f7506s = f8;
            this.f7505r = f9;
            this.f7507t = f10;
            this.f7503p = str4;
            this.f7508u = num4;
            this.f7510w = bool3;
            this.f7509v = num5;
            this.f7511x = bool4;
            this.f7512y = f11;
            this.f7513z = f12;
        }

        public final Boolean d() {
            int i2 = 2 % 2;
            int i3 = A + 59;
            int i4 = i3 % 128;
            B = i4;
            int i5 = i3 % 2;
            Boolean bool = this.f7500m;
            int i6 = i4 + 39;
            A = i6 % 128;
            if (i6 % 2 != 0) {
                return bool;
            }
            throw null;
        }

        public final JSONObject a() throws JSONException {
            JSONArray jSONArray;
            int i2 = 2 % 2;
            int i3 = B + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            int i4 = i3 % 128;
            A = i4;
            int i5 = i3 % 2;
            List<Point> list = this.f7488a;
            if (list != null) {
                jSONArray = new JSONArray();
                for (Point point : list) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(point.x);
                    jSONArray2.put(point.y);
                    jSONArray.put(jSONArray2);
                }
            } else {
                int i6 = i4 + 1;
                B = i6 % 128;
                int i7 = i6 % 2;
                jSONArray = null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("timestamp", this.f7491d);
            jSONObject.putOpt("documentType", this.f7490c);
            jSONObject.putOpt("brightness", this.f7489b);
            jSONObject.putOpt("cls", this.f7492e);
            jSONObject.putOpt("quad", jSONArray);
            jSONObject.putOpt("blur", this.f7496i);
            jSONObject.putOpt("glare", this.f7497j);
            jSONObject.putOpt("side", this.f7493f);
            jSONObject.putOpt("frameScore", this.f7494g);
            jSONObject.putOpt("idValidationState", this.f7498k);
            jSONObject.putOpt("detectionWidth", this.f7495h);
            jSONObject.putOpt("minDetectionWidth", this.f7501n);
            jSONObject.putOpt("maxDetectionWidth", this.f7502o);
            jSONObject.putOpt("isSuccessful", this.f7500m);
            jSONObject.putOpt("isHorizontal", this.f7499l);
            jSONObject.putOpt("frontScore", this.f7504q);
            jSONObject.putOpt("backScore", this.f7506s);
            jSONObject.putOpt("idScore", this.f7505r);
            jSONObject.putOpt("passportScore", this.f7507t);
            jSONObject.putOpt("idType", this.f7503p);
            jSONObject.putOpt("textReadability", this.f7508u);
            jSONObject.putOpt("textPass", this.f7510w);
            jSONObject.putOpt("barcodeReadability", this.f7509v);
            jSONObject.putOpt("barcodePass", this.f7511x);
            jSONObject.putOpt("docAreaRatio", this.f7512y);
            jSONObject.putOpt("iouScore", this.f7513z);
            return jSONObject;
        }

        public static final class b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f7514c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f7515e = 0;

            private b() {
            }

            @JvmStatic
            public static List<Point> c(Point[] pointArr) {
                int i2 = 2 % 2;
                int i3 = f7514c + 47;
                int i4 = i3 % 128;
                f7515e = i4;
                int i5 = i3 % 2;
                Object obj = null;
                if (pointArr == null) {
                    return null;
                }
                int i6 = i4 + 57;
                f7514c = i6 % 128;
                if (i6 % 2 != 0) {
                    return ArraysKt.toList(pointArr);
                }
                ArraysKt.toList(pointArr);
                obj.hashCode();
                throw null;
            }

            public /* synthetic */ b(byte b2) {
                this();
            }
        }

        static {
            new b((byte) 0);
            int i2 = D + 107;
            C = i2 % 128;
            int i3 = i2 % 2;
        }

        @JvmStatic
        public static final List<Point> d(Point[] pointArr) {
            int i2 = 2 % 2;
            int i3 = B + 43;
            A = i3 % 128;
            int i4 = i3 % 2;
            List<Point> listC = b.c(pointArr);
            if (i4 == 0) {
                int i5 = 16 / 0;
            }
            int i6 = A + 67;
            B = i6 % 128;
            if (i6 % 2 == 0) {
                return listC;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (!Intrinsics.areEqual(this.f7491d, eVar.f7491d)) {
                int i3 = B + 31;
                A = i3 % 128;
                return i3 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.f7490c, eVar.f7490c) || !Intrinsics.areEqual((Object) this.f7489b, (Object) eVar.f7489b) || !Intrinsics.areEqual((Object) this.f7492e, (Object) eVar.f7492e) || !Intrinsics.areEqual(this.f7488a, eVar.f7488a) || !Intrinsics.areEqual((Object) this.f7496i, (Object) eVar.f7496i) || !Intrinsics.areEqual((Object) this.f7497j, (Object) eVar.f7497j) || !Intrinsics.areEqual(this.f7493f, eVar.f7493f) || !Intrinsics.areEqual((Object) this.f7494g, (Object) eVar.f7494g) || !Intrinsics.areEqual(this.f7495h, eVar.f7495h) || !Intrinsics.areEqual(this.f7501n, eVar.f7501n) || !Intrinsics.areEqual(this.f7502o, eVar.f7502o) || !Intrinsics.areEqual(this.f7498k, eVar.f7498k) || !Intrinsics.areEqual(this.f7500m, eVar.f7500m)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.f7499l, eVar.f7499l)) {
                int i4 = A + 89;
                B = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual((Object) this.f7504q, (Object) eVar.f7504q)) {
                return false;
            }
            if (Intrinsics.areEqual((Object) this.f7506s, (Object) eVar.f7506s)) {
                return Intrinsics.areEqual((Object) this.f7505r, (Object) eVar.f7505r) && Intrinsics.areEqual((Object) this.f7507t, (Object) eVar.f7507t) && Intrinsics.areEqual(this.f7503p, eVar.f7503p) && Intrinsics.areEqual(this.f7508u, eVar.f7508u) && Intrinsics.areEqual(this.f7510w, eVar.f7510w) && Intrinsics.areEqual(this.f7509v, eVar.f7509v) && Intrinsics.areEqual(this.f7511x, eVar.f7511x) && Intrinsics.areEqual((Object) this.f7512y, (Object) eVar.f7512y) && Intrinsics.areEqual((Object) this.f7513z, (Object) eVar.f7513z);
            }
            int i6 = A + 103;
            B = i6 % 128;
            return i6 % 2 != 0;
        }

        public final int hashCode() {
            int iHashCode;
            int iHashCode2;
            int iHashCode3;
            int iHashCode4;
            int iHashCode5;
            int iHashCode6;
            int iHashCode7;
            int iHashCode8;
            int iHashCode9;
            int i2 = 2 % 2;
            Long l2 = this.f7491d;
            int iHashCode10 = (l2 == null ? 0 : l2.hashCode()) * 31;
            String str = this.f7490c;
            if (str == null) {
                int i3 = A + 97;
                B = i3 % 128;
                int i4 = i3 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int i5 = (iHashCode10 + iHashCode) * 31;
            Float f2 = this.f7489b;
            int iHashCode11 = (i5 + (f2 == null ? 0 : f2.hashCode())) * 31;
            Float f3 = this.f7492e;
            int iHashCode12 = (iHashCode11 + (f3 == null ? 0 : f3.hashCode())) * 31;
            List<Point> list = this.f7488a;
            int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
            Float f4 = this.f7496i;
            int iHashCode14 = (iHashCode13 + (f4 == null ? 0 : f4.hashCode())) * 31;
            Float f5 = this.f7497j;
            int iHashCode15 = (iHashCode14 + (f5 == null ? 0 : f5.hashCode())) * 31;
            String str2 = this.f7493f;
            if (str2 == null) {
                int i6 = B + 27;
                A = i6 % 128;
                int i7 = i6 % 2;
                iHashCode2 = 0;
            } else {
                iHashCode2 = str2.hashCode();
                int i8 = A + 37;
                B = i8 % 128;
                int i9 = i8 % 2;
            }
            int i10 = (iHashCode15 + iHashCode2) * 31;
            Float f6 = this.f7494g;
            int iHashCode16 = (i10 + (f6 == null ? 0 : f6.hashCode())) * 31;
            Integer num = this.f7495h;
            int iHashCode17 = (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f7501n;
            int iHashCode18 = (iHashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f7502o;
            if (num3 == null) {
                int i11 = A + 39;
                B = i11 % 128;
                int i12 = i11 % 2;
                iHashCode3 = 0;
            } else {
                iHashCode3 = num3.hashCode();
            }
            int i13 = (iHashCode18 + iHashCode3) * 31;
            String str3 = this.f7498k;
            if (str3 == null) {
                int i14 = A + 111;
                B = i14 % 128;
                int i15 = i14 % 2;
                iHashCode4 = 0;
            } else {
                iHashCode4 = str3.hashCode();
            }
            int i16 = (i13 + iHashCode4) * 31;
            Boolean bool = this.f7500m;
            int iHashCode19 = (i16 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f7499l;
            if (bool2 == null) {
                int i17 = B + 111;
                A = i17 % 128;
                int i18 = i17 % 2;
                iHashCode5 = 0;
            } else {
                iHashCode5 = bool2.hashCode();
            }
            int i19 = (iHashCode19 + iHashCode5) * 31;
            Float f7 = this.f7504q;
            if (f7 == null) {
                int i20 = A + 123;
                B = i20 % 128;
                int i21 = i20 % 2;
                iHashCode6 = 0;
            } else {
                iHashCode6 = f7.hashCode();
            }
            int i22 = (i19 + iHashCode6) * 31;
            Float f8 = this.f7506s;
            int iHashCode20 = (i22 + (f8 == null ? 0 : f8.hashCode())) * 31;
            Float f9 = this.f7505r;
            int iHashCode21 = (iHashCode20 + (f9 == null ? 0 : f9.hashCode())) * 31;
            Float f10 = this.f7507t;
            int iHashCode22 = (iHashCode21 + (f10 == null ? 0 : f10.hashCode())) * 31;
            String str4 = this.f7503p;
            int iHashCode23 = (iHashCode22 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num4 = this.f7508u;
            int iHashCode24 = (iHashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Boolean bool3 = this.f7510w;
            int iHashCode25 = (iHashCode24 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num5 = this.f7509v;
            if (num5 == null) {
                int i23 = B + 25;
                A = i23 % 128;
                int i24 = i23 % 2;
                iHashCode7 = 0;
            } else {
                iHashCode7 = num5.hashCode();
            }
            int i25 = (iHashCode25 + iHashCode7) * 31;
            Boolean bool4 = this.f7511x;
            if (bool4 == null) {
                int i26 = B + 81;
                A = i26 % 128;
                int i27 = i26 % 2;
                iHashCode8 = 0;
            } else {
                iHashCode8 = bool4.hashCode();
            }
            int i28 = (i25 + iHashCode8) * 31;
            Float f11 = this.f7512y;
            if (f11 == null) {
                int i29 = A + 43;
                B = i29 % 128;
                int i30 = i29 % 2;
                iHashCode9 = 0;
            } else {
                iHashCode9 = f11.hashCode();
            }
            int i31 = (i28 + iHashCode9) * 31;
            Float f12 = this.f7513z;
            return i31 + (f12 != null ? f12.hashCode() : 0);
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = A + 13;
            B = i3 % 128;
            int i4 = i3 % 2;
            String str = "FramesData(timestamp=" + this.f7491d + ", documentType=" + this.f7490c + ", brightness=" + this.f7489b + ", cls=" + this.f7492e + ", quad=" + this.f7488a + ", blur=" + this.f7496i + ", glare=" + this.f7497j + ", side=" + this.f7493f + ", frameScore=" + this.f7494g + ", detectionWidth=" + this.f7495h + ", minDetectionWidth=" + this.f7501n + ", maxDetectionWidth=" + this.f7502o + ", idValidationState=" + this.f7498k + ", isSuccessful=" + this.f7500m + ", isHorizontal=" + this.f7499l + ", frontScore=" + this.f7504q + ", backScore=" + this.f7506s + ", idScore=" + this.f7505r + ", passportScore=" + this.f7507t + ", idType=" + this.f7503p + ", textReadability=" + this.f7508u + ", textPass=" + this.f7510w + ", barcodeReadability=" + this.f7509v + ", barcodePass=" + this.f7511x + ", docAreaRatio=" + this.f7512y + ", iouScore=" + this.f7513z + ")";
            int i5 = A + 113;
            B = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final JSONObject toJson() throws JSONException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("modelVersion", this.modelVersion);
        jSONObject.put("beginningTimestamp", this.beginningTimestamp);
        jSONObject.put("endingTimestamp", this.endingTimestamp);
        jSONObject.putOpt("enableBackShownAsFrontCheck", this.enableBackShownAsFrontCheck);
        jSONObject.putOpt("enableFrontShownAsBackCheck", this.enableFrontShownAsBackCheck);
        jSONObject.putOpt("autocapturedFrameScore", this.autocapturedFrameScore);
        jSONObject.putOpt("isOutputTruncated", this.isOutputTruncated);
        jSONObject.putOpt("shouldSkipLocalGlareCheckBackId", this.shouldSkipLocalGlareCheckBackId);
        jSONObject.putOpt("algorithm", this.algorithm);
        d dVar = this.thresholds;
        JSONObject jSONObjectE = null;
        if (dVar != null) {
            int i3 = f7476d + 83;
            f7474b = i3 % 128;
            if (i3 % 2 == 0) {
                dVar.e();
                jSONObjectE.hashCode();
                throw null;
            }
            jSONObjectE = dVar.e();
        }
        jSONObject.putOpt("thresholds", jSONObjectE);
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.framesData.iterator();
        while (it.hasNext()) {
            int i4 = f7476d + 45;
            f7474b = i4 % 128;
            int i5 = i4 % 2;
            jSONArray.put(((e) it.next()).a());
        }
        Unit unit = Unit.INSTANCE;
        jSONObject.put("framesData", jSONArray);
        e firstGoodFrame = getFirstGoodFrame();
        if (firstGoodFrame != null) {
            jSONObject.putOpt("firstGoodFrame", firstGoodFrame.a());
        }
        int i6 = f7474b + 53;
        f7476d = i6 % 128;
        int i7 = i6 % 2;
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        return (com.incode.welcome_sdk.data.IdScanFrameLogs.e) r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.incode.welcome_sdk.data.IdScanFrameLogs.e getFirstGoodFrame() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            java.util.List<com.incode.welcome_sdk.data.IdScanFrameLogs$e> r0 = r6.framesData
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L26
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.incode.welcome_sdk.data.IdScanFrameLogs$e r0 = (com.incode.welcome_sdk.data.IdScanFrameLogs.e) r0
            java.lang.Boolean r1 = r0.d()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L30
            goto Lb
        L26:
            int r0 = com.incode.welcome_sdk.data.IdScanFrameLogs.f7476d
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IdScanFrameLogs.f7474b = r0
            int r1 = r1 % r5
            goto L3c
        L30:
            int r0 = com.incode.welcome_sdk.data.IdScanFrameLogs.f7476d
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.IdScanFrameLogs.f7474b = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L3f
            r3 = r2
        L3c:
            com.incode.welcome_sdk.data.IdScanFrameLogs$e r3 = (com.incode.welcome_sdk.data.IdScanFrameLogs.e) r3
            return r3
        L3f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IdScanFrameLogs.getFirstGoodFrame():com.incode.welcome_sdk.data.IdScanFrameLogs$e");
    }

    static {
        int i2 = 1 + 17;
        f7475c = i2 % 128;
        int i3 = i2 % 2;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdScanFrameLogs)) {
            return false;
        }
        IdScanFrameLogs idScanFrameLogs = (IdScanFrameLogs) obj;
        if (!Intrinsics.areEqual(this.modelVersion, idScanFrameLogs.modelVersion) || this.beginningTimestamp != idScanFrameLogs.beginningTimestamp || this.endingTimestamp != idScanFrameLogs.endingTimestamp || !Intrinsics.areEqual(this.enableBackShownAsFrontCheck, idScanFrameLogs.enableBackShownAsFrontCheck)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.enableFrontShownAsBackCheck, idScanFrameLogs.enableFrontShownAsBackCheck)) {
            int i3 = f7476d + 125;
            f7474b = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.autocapturedFrameScore, (Object) idScanFrameLogs.autocapturedFrameScore)) {
            int i5 = f7476d + 33;
            f7474b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 71 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.isOutputTruncated, idScanFrameLogs.isOutputTruncated) || !Intrinsics.areEqual(this.shouldSkipLocalGlareCheckBackId, idScanFrameLogs.shouldSkipLocalGlareCheckBackId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.algorithm, idScanFrameLogs.algorithm)) {
            int i7 = f7474b + 5;
            f7476d = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.thresholds, idScanFrameLogs.thresholds)) {
            return false;
        }
        if (Intrinsics.areEqual(this.framesData, idScanFrameLogs.framesData)) {
            return true;
        }
        int i9 = f7476d + 21;
        f7474b = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00db A[PHI: r1
  0x00db: PHI (r1v3 int) = (r1v2 int), (r1v23 int) binds: [B:34:0x00d7, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d A[PHI: r1
  0x002d: PHI (r1v22 int) = (r1v2 int), (r1v23 int) binds: [B:34:0x00d7, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode() {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.IdScanFrameLogs.hashCode():int");
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f7476d + 9;
        f7474b = i3 % 128;
        int i4 = i3 % 2;
        String str = "IdScanFrameLogs(modelVersion=" + this.modelVersion + ", beginningTimestamp=" + this.beginningTimestamp + ", endingTimestamp=" + this.endingTimestamp + ", enableBackShownAsFrontCheck=" + this.enableBackShownAsFrontCheck + ", enableFrontShownAsBackCheck=" + this.enableFrontShownAsBackCheck + ", autocapturedFrameScore=" + this.autocapturedFrameScore + ", isOutputTruncated=" + this.isOutputTruncated + ", shouldSkipLocalGlareCheckBackId=" + this.shouldSkipLocalGlareCheckBackId + ", algorithm=" + this.algorithm + ", thresholds=" + this.thresholds + ", framesData=" + this.framesData + ")";
        int i5 = f7474b + 81;
        f7476d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdScanFrameLogs copy$default(IdScanFrameLogs idScanFrameLogs, String str, long j2, long j3, Boolean bool, Boolean bool2, Float f2, Boolean bool3, Boolean bool4, String str2, d dVar, List list, int i2, Object obj) {
        String str3 = str;
        long j4 = j2;
        long j5 = j3;
        Boolean bool5 = bool;
        Float f3 = f2;
        Boolean bool6 = bool2;
        Boolean bool7 = bool4;
        Boolean bool8 = bool3;
        d dVar2 = dVar;
        String str4 = str2;
        List list2 = list;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f7474b + 107;
            f7476d = i4 % 128;
            if (i4 % 2 != 0) {
                String str5 = idScanFrameLogs.modelVersion;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str3 = idScanFrameLogs.modelVersion;
        }
        if ((i2 & 2) != 0) {
            j4 = idScanFrameLogs.beginningTimestamp;
        }
        if ((i2 & 4) != 0) {
            j5 = idScanFrameLogs.endingTimestamp;
        }
        if ((i2 & 8) != 0) {
            int i5 = f7476d + 83;
            f7474b = i5 % 128;
            int i6 = i5 % 2;
            bool5 = idScanFrameLogs.enableBackShownAsFrontCheck;
        }
        if ((i2 & 16) != 0) {
            int i7 = f7474b + 19;
            f7476d = i7 % 128;
            int i8 = i7 % 2;
            bool6 = idScanFrameLogs.enableFrontShownAsBackCheck;
        }
        if ((i2 & 32) != 0) {
            int i9 = f7474b + 69;
            f7476d = i9 % 128;
            int i10 = i9 % 2;
            f3 = idScanFrameLogs.autocapturedFrameScore;
        }
        if ((i2 & 64) != 0) {
            bool8 = idScanFrameLogs.isOutputTruncated;
        }
        if ((i2 & 128) != 0) {
            int i11 = f7474b + 59;
            f7476d = i11 % 128;
            int i12 = i11 % 2;
            bool7 = idScanFrameLogs.shouldSkipLocalGlareCheckBackId;
        }
        if ((i2 & 256) != 0) {
            int i13 = f7474b + 77;
            f7476d = i13 % 128;
            int i14 = i13 % 2;
            str4 = idScanFrameLogs.algorithm;
        }
        if ((i2 & 512) != 0) {
            dVar2 = idScanFrameLogs.thresholds;
        }
        if ((i2 & 1024) != 0) {
            list2 = idScanFrameLogs.framesData;
            int i15 = f7476d + 33;
            f7474b = i15 % 128;
            int i16 = i15 % 2;
        }
        return idScanFrameLogs.copy(str3, j4, j5, bool5, bool6, f3, bool8, bool7, str4, dVar2, list2);
    }

    public final IdScanFrameLogs copy(String str, long j2, long j3, Boolean bool, Boolean bool2, Float f2, Boolean bool3, Boolean bool4, String str2, d dVar, List<e> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        IdScanFrameLogs idScanFrameLogs = new IdScanFrameLogs(str, j2, j3, bool, bool2, f2, bool3, bool4, str2, dVar, list);
        int i3 = f7476d + 87;
        f7474b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 73 / 0;
        }
        return idScanFrameLogs;
    }

    public final List<e> component11() {
        int i2 = 2 % 2;
        int i3 = f7476d + 51;
        int i4 = i3 % 128;
        f7474b = i4;
        int i5 = i3 % 2;
        List<e> list = this.framesData;
        int i6 = i4 + 53;
        f7476d = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final d component10() {
        int i2 = 2 % 2;
        int i3 = f7474b + 3;
        f7476d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.thresholds;
        }
        throw null;
    }

    public final String component9() {
        int i2 = 2 % 2;
        int i3 = f7476d;
        int i4 = i3 + 21;
        f7474b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.algorithm;
        int i6 = i3 + 9;
        f7474b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 12 / 0;
        }
        return str;
    }

    public final Boolean component8() {
        int i2 = 2 % 2;
        int i3 = f7474b + 91;
        f7476d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.shouldSkipLocalGlareCheckBackId;
        }
        throw null;
    }

    public final Boolean component7() {
        int i2 = 2 % 2;
        int i3 = f7474b;
        int i4 = i3 + 27;
        f7476d = i4 % 128;
        int i5 = i4 % 2;
        Boolean bool = this.isOutputTruncated;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7476d = i6 % 128;
        int i7 = i6 % 2;
        return bool;
    }

    public final Float component6() {
        int i2 = 2 % 2;
        int i3 = f7474b + 47;
        f7476d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.autocapturedFrameScore;
        }
        throw null;
    }

    public final Boolean component5() {
        int i2 = 2 % 2;
        int i3 = f7476d + 97;
        f7474b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.enableFrontShownAsBackCheck;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component4() {
        int i2 = 2 % 2;
        int i3 = f7476d + 85;
        f7474b = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.enableBackShownAsFrontCheck;
        if (i4 == 0) {
            int i5 = 34 / 0;
        }
        return bool;
    }

    public final long component3() {
        int i2 = 2 % 2;
        int i3 = f7474b + 1;
        f7476d = i3 % 128;
        if (i3 % 2 == 0) {
            return this.endingTimestamp;
        }
        int i4 = 65 / 0;
        return this.endingTimestamp;
    }

    public final long component2() {
        int i2 = 2 % 2;
        int i3 = f7476d + 53;
        int i4 = i3 % 128;
        f7474b = i4;
        int i5 = i3 % 2;
        long j2 = this.beginningTimestamp;
        if (i5 == 0) {
            int i6 = 62 / 0;
        }
        int i7 = i4 + 65;
        f7476d = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 79 / 0;
        }
        return j2;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f7476d;
        int i4 = i3 + 9;
        f7474b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.modelVersion;
        int i5 = i3 + 21;
        f7474b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
