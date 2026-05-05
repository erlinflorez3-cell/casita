package com.incode.welcome_sdk.data.remote.beans;

import android.os.SystemClock;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.results.FaceMatchResult;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bf {

    /* JADX INFO: renamed from: f */
    private static int f9430f = 0;

    /* JADX INFO: renamed from: g */
    private static int f9431g = 0;

    /* JADX INFO: renamed from: h */
    private static int f9432h = 1;

    /* JADX INFO: renamed from: i */
    private static int f9433i = 1;

    /* JADX INFO: renamed from: a */
    private final double f9434a;

    /* JADX INFO: renamed from: b */
    private final double f9435b;

    /* JADX INFO: renamed from: c */
    private final String f9436c;

    /* JADX INFO: renamed from: d */
    private final boolean f9437d;

    /* JADX INFO: renamed from: e */
    private final double f9438e;

    /* JADX INFO: renamed from: j */
    private final boolean f9439j;

    public static /* synthetic */ Object b(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | (~(i2 | i4)) | (~(i5 | i4));
        int i11 = ~i5;
        int i12 = (~(i11 | i4)) | i2;
        int i13 = (~(i4 | i2 | i5)) | (~(i9 | i11));
        int i14 = i2 + i5 + i7 + ((-373584967) * i6) + ((-1711780345) * i3);
        int i15 = i14 * i14;
        int i16 = (i2 * 1075882953) + 1902575616 + (1075882953 * i5) + ((-462509112) * i10) + (925018224 * i12) + (462509112 * i13) + (1538392064 * i7) + ((-375259136) * i6) + ((-1109524480) * i3) + (585564160 * i15);
        int i17 = ((i2 * 235012993) - 778813113) + (i5 * 235012993) + (i10 * (-632)) + (i12 * 1264) + (i13 * IptcDirectory.TAG_CAPTION) + (i7 * 235013625) + (i6 * 915899377) + (i3 * (-1709701169)) + (i15 * 1974403072);
        return i16 + ((i17 * i17) * (-848756736)) != 1 ? a(objArr) : e(objArr);
    }

    public bf(double d2, double d3, double d4, boolean z2, String str, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f9438e = d2;
        this.f9435b = d3;
        this.f9434a = d4;
        this.f9437d = z2;
        this.f9436c = str;
        this.f9439j = z3;
    }

    public final double e() {
        int i2 = 2 % 2;
        int i3 = f9431g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f9432h = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        double d2 = this.f9438e;
        int i5 = i4 + 47;
        f9431g = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        bf bfVar = (bf) objArr[0];
        int i2 = 2 % 2;
        int i3 = f9431g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f9432h = i4;
        int i5 = i3 % 2;
        double d2 = bfVar.f9435b;
        int i6 = i4 + 37;
        f9431g = i6 % 128;
        if (i6 % 2 == 0) {
            return Double.valueOf(d2);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double c() {
        int i2 = 2 % 2;
        int i3 = f9431g + 7;
        f9432h = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9434a;
        }
        throw null;
    }

    public final boolean a() {
        int i2 = 2 % 2;
        int i3 = f9432h;
        int i4 = i3 + 93;
        f9431g = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f9437d;
        int i6 = i3 + 55;
        f9431g = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f9432h + 19;
        int i4 = i3 % 128;
        f9431g = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f9436c;
        int i5 = i4 + 93;
        f9432h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return str;
    }

    public final boolean h() {
        int i2 = 2 % 2;
        int i3 = f9431g;
        int i4 = i3 + 47;
        f9432h = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f9439j;
        int i6 = i3 + 19;
        f9432h = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ FaceMatchResult a(bf bfVar, List list, FaceMatch.MatchType matchType) {
        int i2 = 2 % 2;
        int i3 = f9432h + 73;
        f9431g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            return bfVar.b(list, matchType, null);
        }
        bfVar.b(list, matchType, null);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b A[PHI: r7 r9
  0x002b: PHI (r7v3 com.incode.welcome_sdk.results.ResultCode) = (r7v0 com.incode.welcome_sdk.results.ResultCode), (r7v4 com.incode.welcome_sdk.results.ResultCode) binds: [B:23:0x0058, B:18:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r9v3 double) = (r9v0 double), (r9v4 double) binds: [B:23:0x0058, B:18:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[PHI: r7 r9
  0x005b: PHI (r7v1 com.incode.welcome_sdk.results.ResultCode) = (r7v0 com.incode.welcome_sdk.results.ResultCode), (r7v4 com.incode.welcome_sdk.results.ResultCode) binds: [B:23:0x0058, B:18:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r9v1 double) = (r9v0 double), (r9v4 double) binds: [B:23:0x0058, B:18:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.results.FaceMatchResult b(java.util.List<? extends com.incode.welcome_sdk.IdCategory> r23, com.incode.welcome_sdk.modules.FaceMatch.MatchType r24, java.lang.Double r25) {
        /*
            r22 = this;
            r4 = r22
            r4 = r4
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.incode.welcome_sdk.data.remote.beans.bf.f9431g
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.bf.f9432h = r0
            int r1 = r1 % r6
            java.lang.String r0 = ""
            r2 = r25
            r5 = r24
            r3 = r23
            if (r1 != 0) goto L4c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.incode.welcome_sdk.results.ResultCode r7 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
            double r9 = r4.b(r3)
            r0 = 12
            int r0 = r0 / 0
            if (r2 == 0) goto L5b
        L2b:
            double r11 = r2.doubleValue()
        L2f:
            boolean r17 = r4.c(r3, r5, r2)
            double r15 = r4.f9434a
            double r13 = r4.f9435b
            boolean r2 = r4.f9439j
            boolean r1 = r4.f9437d
            java.lang.String r0 = r4.f9436c
            com.incode.welcome_sdk.results.FaceMatchResult r6 = new com.incode.welcome_sdk.results.FaceMatchResult
            r8 = 0
            r19 = r1
            r20 = r0
            r21 = r2
            r18 = r3
            r6.<init>(r7, r8, r9, r11, r13, r15, r17, r18, r19, r20, r21)
            return r6
        L4c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.incode.welcome_sdk.results.ResultCode r7 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
            double r9 = r4.b(r3)
            if (r2 == 0) goto L5b
            goto L2b
        L5b:
            int r0 = com.incode.welcome_sdk.data.remote.beans.bf.f9431g
            int r1 = r0 + 107
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.bf.f9432h = r0
            int r1 = r1 % r6
            r11 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.bf.b(java.util.List, com.incode.welcome_sdk.modules.FaceMatch$MatchType, java.lang.Double):com.incode.welcome_sdk.results.FaceMatchResult");
    }

    private final double b(List<? extends IdCategory> list) {
        int i2 = 2 % 2;
        if (!list.contains(IdCategory.FIRST)) {
            int i3 = f9431g + 9;
            f9432h = i3 % 128;
            int i4 = i3 % 2;
            return 0.0d;
        }
        int i5 = f9432h + 45;
        f9431g = i5 % 128;
        if (i5 % 2 == 0) {
            return this.f9438e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x00ee, code lost:
    
        if (r1 == 3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00f4, code lost:
    
        if (r10.f9438e < 0.6000000238418579d) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00fa, code lost:
    
        if (r10.f9435b < 0.6000000238418579d) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00fc, code lost:
    
        r1 = com.incode.welcome_sdk.data.remote.beans.bf.f9432h + 45;
        com.incode.welcome_sdk.data.remote.beans.bf.f9431g = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0109, code lost:
    
        if (r10.f9434a < 0.6000000238418579d) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x010b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0118, code lost:
    
        if (r0 == 3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x015a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0160, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean c(java.util.List<? extends com.incode.welcome_sdk.IdCategory> r11, com.incode.welcome_sdk.modules.FaceMatch.MatchType r12, java.lang.Double r13) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.bf.c(java.util.List, com.incode.welcome_sdk.modules.FaceMatch$MatchType, java.lang.Double):boolean");
    }

    public static final class a {

        /* JADX INFO: renamed from: a */
        private static int f9440a = 0;

        /* JADX INFO: renamed from: b */
        public static int f9441b = 0;

        /* JADX INFO: renamed from: d */
        public static int f9442d = 0;

        /* JADX INFO: renamed from: e */
        private static int f9443e = 1;

        private a() {
        }

        @JvmStatic
        public static bf c(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            double dOptDouble = jSONObject.optDouble("confidence", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("nfcSelfieConfidence", 0.0d);
            double dOptDouble3 = jSONObject.optDouble("nfcIdConfidence", 0.0d);
            boolean zOptBoolean = jSONObject.optBoolean("existingUser");
            String strOptString = jSONObject.optString("existingInterviewId");
            boolean zOptBoolean2 = jSONObject.optBoolean("nameMatched");
            Intrinsics.checkNotNull(strOptString);
            bf bfVar = new bf(dOptDouble, dOptDouble2, dOptDouble3, zOptBoolean, strOptString, zOptBoolean2);
            int i3 = f9440a + 93;
            f9443e = i3 % 128;
            if (i3 % 2 != 0) {
                return bfVar;
            }
            throw null;
        }

        public static int e() {
            int i2 = f9441b;
            int i3 = i2 % 7018044;
            f9441b = i2 + 1;
            if (i3 != 0) {
                return f9442d;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            f9442d = iElapsedRealtime;
            return iElapsedRealtime;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) throws JSONException, IOException {
        ResponseBody responseBody = (ResponseBody) objArr[0];
        int i2 = 2 % 2;
        int i3 = f9431g + 117;
        f9432h = i3 % 128;
        int i4 = i3 % 2;
        bf bfVarC = a.c(responseBody);
        int i5 = f9431g + 25;
        f9432h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return bfVarC;
    }

    static {
        new a((byte) 0);
        int i2 = f9433i + 1;
        f9430f = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final bf a(ResponseBody responseBody) throws JSONException, IOException {
        Object[] objArr = {responseBody};
        int iD = com.incode.welcome_sdk.data.remote.e.d();
        int iD2 = com.incode.welcome_sdk.data.remote.e.d();
        return (bf) b(-964473382, com.incode.welcome_sdk.data.remote.e.d(), objArr, iD, 964473383, com.incode.welcome_sdk.data.remote.e.d(), iD2);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        if (Double.compare(this.f9438e, bfVar.f9438e) != 0) {
            int i3 = f9431g + 125;
            f9432h = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Double.compare(this.f9435b, bfVar.f9435b) != 0 || Double.compare(this.f9434a, bfVar.f9434a) != 0 || this.f9437d != bfVar.f9437d) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f9436c, bfVar.f9436c)) {
            int i5 = f9431g + 1;
            f9432h = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.f9439j == bfVar.f9439j) {
            return true;
        }
        int i7 = f9431g + 121;
        f9432h = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9432h + 31;
        f9431g = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((Double.hashCode(this.f9438e) * 31) + Double.hashCode(this.f9435b)) * 31) + Double.hashCode(this.f9434a)) * 31) + Boolean.hashCode(this.f9437d)) * 31) + this.f9436c.hashCode()) * 31) + Boolean.hashCode(this.f9439j);
        int i5 = f9431g + 25;
        f9432h = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode;
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        private static int f9444a = 0;

        /* JADX INFO: renamed from: d */
        private static int f9445d = 1;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f9446e;

        static {
            int[] iArr = new int[FaceMatch.MatchType.values().length];
            try {
                iArr[FaceMatch.MatchType.ID_SELFIE.ordinal()] = 1;
                int i2 = f9444a + 61;
                f9445d = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FaceMatch.MatchType.NFC_SELFIE.ordinal()] = 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FaceMatch.MatchType.NFC_3_WAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9446e = iArr;
            int i6 = f9445d + 37;
            f9444a = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9432h + 47;
        f9431g = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.f9438e;
        double d3 = this.f9435b;
        double d4 = this.f9434a;
        if (i4 == 0) {
            return "ResponseProcessFace(confidence=" + d2 + ", nfcSelfieConfidence=" + d3 + ", nfcIdConfidence=" + d4 + ", isExistingUser=" + this.f9437d + ", existingInterviewId=" + this.f9436c + ", isNameMatched=" + this.f9439j + ")";
        }
        String str = "ResponseProcessFace(confidence=" + d2 + ", nfcSelfieConfidence=" + d3 + ", nfcIdConfidence=" + d4 + ", isExistingUser=" + this.f9437d + ", existingInterviewId=" + this.f9436c + ", isNameMatched=" + this.f9439j + ")";
        throw null;
    }

    public final double b() {
        int iD = com.incode.welcome_sdk.data.remote.e.d();
        int iD2 = com.incode.welcome_sdk.data.remote.e.d();
        int iD3 = com.incode.welcome_sdk.data.remote.e.d();
        return ((Double) b(818351744, com.incode.welcome_sdk.data.remote.e.d(), new Object[]{this}, iD, -818351744, iD3, iD2)).doubleValue();
    }
}
