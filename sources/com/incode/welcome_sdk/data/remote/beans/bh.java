package com.incode.welcome_sdk.data.remote.beans;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.IncodeWelcome$getWrappedDelayedOnboardingListener$1;
import com.incode.welcome_sdk.data.FlowType;
import java.lang.reflect.Method;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class bh {

    /* JADX INFO: renamed from: a */
    public static final d f9466a = new d((byte) 0);

    /* JADX INFO: renamed from: l */
    private static int f9467l = 1;

    /* JADX INFO: renamed from: n */
    private static int f9468n = 0;

    /* JADX INFO: renamed from: s */
    private static int f9469s = 0;

    /* JADX INFO: renamed from: t */
    private static int f9470t = 1;

    /* JADX INFO: renamed from: b */
    private final String f9471b;

    /* JADX INFO: renamed from: c */
    private final String f9472c;

    /* JADX INFO: renamed from: d */
    private final int f9473d;

    /* JADX INFO: renamed from: e */
    private final String f9474e;

    /* JADX INFO: renamed from: f */
    private final int f9475f;

    /* JADX INFO: renamed from: g */
    private final boolean f9476g;

    /* JADX INFO: renamed from: h */
    private final int f9477h;

    /* JADX INFO: renamed from: i */
    private final int f9478i;

    /* JADX INFO: renamed from: j */
    private final int f9479j;

    /* JADX INFO: renamed from: k */
    private final boolean f9480k;

    /* JADX INFO: renamed from: m */
    private final FlowType f9481m;

    /* JADX INFO: renamed from: o */
    private final String f9482o;

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~((~i7) | i8 | i2);
        int i10 = ~i2;
        int i11 = (~(i8 | i7)) | (~(i8 | i10)) | (~(i10 | i7));
        int i12 = (~(i10 | i4)) | i7;
        int i13 = i4 + i7 + i5 + ((-946781377) * i6) + ((-59450693) * i3);
        int i14 = i13 * i13;
        int i15 = (((-143250568) * i4) - 346488832) + (357422218 * i7) + (i9 * (-1897147255)) + ((-1897147255) * i11) + (1897147255 * i12) + ((-2040397824) * i5) + ((-1205993472) * i6) + ((-1651113984) * i3) + ((-884408320) * i14);
        int i16 = ((i4 * 358501064) - 1042343473) + (i7 * 358500518) + (i9 * (-273)) + (i11 * (-273)) + (i12 * 273) + (i5 * 358500791) + (i6 * (-249165559)) + (i3 * 1905372845) + (i14 * 573505536);
        int i17 = i15 + (i16 * i16 * (-553189376));
        if (i17 == 1) {
            return a(objArr);
        }
        if (i17 != 2) {
            bh bhVar = (bh) objArr[0];
            int i18 = 2 % 2;
            int i19 = f9468n;
            int i20 = i19 + 121;
            f9467l = i20 % 128;
            int i21 = i20 % 2;
            String str = bhVar.f9482o;
            int i22 = i19 + 17;
            f9467l = i22 % 128;
            int i23 = i22 % 2;
            return str;
        }
        bh bhVar2 = (bh) objArr[0];
        int i24 = 2 % 2;
        int i25 = f9468n + 53;
        int i26 = i25 % 128;
        f9467l = i26;
        int i27 = i25 % 2;
        int i28 = bhVar2.f9473d;
        int i29 = i26 + 75;
        f9468n = i29 % 128;
        int i30 = i29 % 2;
        return Integer.valueOf(i28);
    }

    public bh(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, boolean z2, FlowType flowType, boolean z3, String str4) {
        this.f9471b = str;
        this.f9472c = str2;
        this.f9474e = str3;
        this.f9473d = i2;
        this.f9479j = i3;
        this.f9477h = i4;
        this.f9475f = i5;
        this.f9478i = i6;
        this.f9476g = z2;
        this.f9481m = flowType;
        this.f9480k = z3;
        this.f9482o = str4;
    }

    public final String e() {
        int i2 = 2 % 2;
        int i3 = f9468n;
        int i4 = i3 + 79;
        f9467l = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f9471b;
        int i5 = i3 + 7;
        f9467l = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f9467l + 59;
        f9468n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9472c;
        }
        throw null;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f9467l + 19;
        int i4 = i3 % 128;
        f9468n = i4;
        int i5 = i3 % 2;
        String str = this.f9474e;
        int i6 = i4 + 101;
        f9467l = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final int d() {
        int i2 = 2 % 2;
        int i3 = f9468n;
        int i4 = i3 + 65;
        f9467l = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f9479j;
        int i7 = i3 + 83;
        f9467l = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        bh bhVar = (bh) objArr[0];
        int i2 = 2 % 2;
        int i3 = f9467l;
        int i4 = i3 + 31;
        f9468n = i4 % 128;
        int i5 = i4 % 2;
        int i6 = bhVar.f9477h;
        if (i5 != 0) {
            throw null;
        }
        int i7 = i3 + 77;
        f9468n = i7 % 128;
        if (i7 % 2 == 0) {
            return Integer.valueOf(i6);
        }
        throw null;
    }

    public final int i() {
        int i2 = 2 % 2;
        int i3 = f9467l;
        int i4 = i3 + 51;
        f9468n = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = this.f9475f;
        int i6 = i3 + 17;
        f9468n = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int g() {
        int i2 = 2 % 2;
        int i3 = f9468n + 27;
        int i4 = i3 % 128;
        f9467l = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = this.f9478i;
        int i6 = i4 + 27;
        f9468n = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final boolean f() {
        int i2 = 2 % 2;
        int i3 = f9467l + 9;
        f9468n = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9476g;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FlowType h() {
        int i2 = 2 % 2;
        int i3 = f9467l;
        int i4 = i3 + 31;
        f9468n = i4 % 128;
        int i5 = i4 % 2;
        FlowType flowType = this.f9481m;
        int i6 = i3 + 9;
        f9468n = i6 % 128;
        int i7 = i6 % 2;
        return flowType;
    }

    public final boolean k() {
        int i2 = 2 % 2;
        int i3 = f9468n + 87;
        int i4 = i3 % 128;
        f9467l = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f9480k;
        int i6 = i4 + 49;
        f9468n = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 31 / 0;
        }
        return z2;
    }

    public bh(int i2, int i3, int i4, int i5, int i6, boolean z2, String str) {
        this(null, null, null, i2, i3, i4, i5, i6, false, null, z2, str);
    }

    public static final class d implements bd<bh> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static int f9483a = 0;

        /* JADX INFO: renamed from: c */
        private static int f9484c = 0;

        /* JADX INFO: renamed from: e */
        private static long f9485e = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0028 -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r6, int r7, byte r8) {
            /*
                int r2 = r8 * 4
                int r1 = 1 - r2
                int r0 = r7 * 2
                int r8 = r0 + 117
                int r0 = r6 * 2
                int r7 = 3 - r0
                byte[] r6 = com.incode.welcome_sdk.data.remote.beans.bh.d.$$a
                byte[] r5 = new byte[r1]
                r4 = 0
                int r3 = 0 - r2
                if (r6 != 0) goto L2d
                r2 = r4
                r0 = r7
            L17:
                int r7 = r7 + r8
                r1 = r2
                r8 = r7
                r7 = r0
            L1b:
                byte r0 = (byte) r8
                r5[r1] = r0
                int r2 = r1 + 1
                if (r1 != r3) goto L28
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L28:
                int r0 = r7 + 1
                r7 = r6[r0]
                goto L17
            L2d:
                r1 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.bh.d.$$c(int, int, byte):java.lang.String");
        }

        static void init$0() {
            $$a = new byte[]{Ascii.FS, 50, 106, MessagePack.Code.NIL};
            $$b = 239;
        }

        private d() {
        }

        @Override // com.incode.welcome_sdk.data.remote.beans.bd
        public final /* synthetic */ bh a(ResponseBody responseBody) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f9484c + 107;
            f9483a = i3 % 128;
            if (i3 % 2 != 0) {
                e(responseBody);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            bh bhVarE = e(responseBody);
            int i4 = f9484c + 33;
            f9483a = i4 % 128;
            int i5 = i4 % 2;
            return bhVarE;
        }

        @JvmStatic
        public static bh b(ResponseBody responseBody) throws Throwable {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            String string = jSONObject.getString("token");
            String strOptString = jSONObject.optString("interviewId");
            String strOptString2 = jSONObject.optString("interviewCode");
            int iOptInt = jSONObject.optInt("idCaptureTimeout", -1);
            int iOptInt2 = jSONObject.optInt("idDetectionTimeout", -1);
            int iOptInt3 = jSONObject.optInt("selfieCaptureTimeout", -1);
            int iOptInt4 = jSONObject.optInt("idCaptureRetries", -1);
            int iOptInt5 = jSONObject.optInt("selfieCaptureRetries", -1);
            boolean zOptBoolean = jSONObject.optBoolean("existingSession", false);
            FlowType.d dVar = FlowType.Companion;
            Object[] objArr = new Object[1];
            d("か」\uf6f6\udcd7ꂿ䁄녤萒", View.MeasureSpec.getSize(0), objArr);
            String strOptString3 = jSONObject.optString("flowType", ((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            bh bhVar = new bh(string, strOptString, strOptString2, iOptInt, iOptInt2, iOptInt3, iOptInt4, iOptInt5, zOptBoolean, dVar.c(strOptString3), jSONObject.optBoolean("optinEnabled"), jSONObject.optString("optinCompanyName"));
            int i3 = f9484c + 23;
            f9483a = i3 % 128;
            if (i3 % 2 == 0) {
                return bhVar;
            }
            throw null;
        }

        private static void d(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            if (str2 != null) {
                int i4 = $11 + 57;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            com.c.a.k kVar = new com.c.a.k();
            char[] cArrE = com.c.a.k.e(f9485e ^ (-3501477462694648052L), (char[]) charArray, i2);
            kVar.f2772b = 4;
            while (kVar.f2772b < cArrE.length) {
                int i6 = $11 + 107;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                kVar.f2773d = kVar.f2772b - 4;
                int i8 = kVar.f2772b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrE[kVar.f2772b] ^ cArrE[kVar.f2772b % 4]), Long.valueOf(kVar.f2773d), Long.valueOf(f9485e)};
                    Object objC = com.c.a.e.e.c(1215460496);
                    if (objC == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objC = com.c.a.e.e.e((char) (91 - ImageFormat.getBitsPerPixel(0)), View.combineMeasuredStates(0, 0) + 20, 1107 - View.MeasureSpec.getMode(0), 1223194345, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrE[i8] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objC2 = com.c.a.e.e.c(-727400358);
                    if (objC2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objC2 = com.c.a.e.e.e((char) (Process.myTid() >> 22), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20, Color.alpha(0) + 1282, -734084573, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrE, 4, cArrE.length - 4);
        }

        private static bh e(ResponseBody responseBody) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f9484c + 55;
            f9483a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            bh bhVarB = b(responseBody);
            int i5 = f9484c + 5;
            f9483a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 81 / 0;
            }
            return bhVarB;
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f9483a = 0;
            f9484c = 1;
            f9485e = -8875473435041132046L;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9470t + 59;
        f9469s = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
    }

    @JvmStatic
    public static final bh c(ResponseBody responseBody) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f9467l + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9468n = i3 % 128;
        int i4 = i3 % 2;
        bh bhVarB = d.b(responseBody);
        int i5 = f9468n + 83;
        f9467l = i5 % 128;
        int i6 = i5 % 2;
        return bhVarB;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh)) {
            return false;
        }
        bh bhVar = (bh) obj;
        if (!Intrinsics.areEqual(this.f9471b, bhVar.f9471b)) {
            int i3 = f9467l + 59;
            f9468n = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f9472c, bhVar.f9472c) || !Intrinsics.areEqual(this.f9474e, bhVar.f9474e)) {
            return false;
        }
        if (this.f9473d != bhVar.f9473d) {
            int i5 = f9468n + 81;
            f9467l = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.f9479j != bhVar.f9479j) {
            int i7 = f9468n + 47;
            f9467l = i7 % 128;
            return i7 % 2 == 0;
        }
        if (this.f9477h != bhVar.f9477h || this.f9475f != bhVar.f9475f) {
            return false;
        }
        if (this.f9478i == bhVar.f9478i) {
            return this.f9476g == bhVar.f9476g && this.f9481m == bhVar.f9481m && this.f9480k == bhVar.f9480k && Intrinsics.areEqual(this.f9482o, bhVar.f9482o);
        }
        int i8 = f9468n + 7;
        f9467l = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i2 = 2 % 2;
        String str = this.f9471b;
        int iHashCode3 = 0;
        int iHashCode4 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9472c;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9474e;
        if (str3 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
            int i3 = f9467l + 81;
            f9468n = i3 % 128;
            int i4 = i3 % 2;
        }
        int iHashCode6 = (((((((((((((iHashCode5 + iHashCode) * 31) + Integer.hashCode(this.f9473d)) * 31) + Integer.hashCode(this.f9479j)) * 31) + Integer.hashCode(this.f9477h)) * 31) + Integer.hashCode(this.f9475f)) * 31) + Integer.hashCode(this.f9478i)) * 31) + Boolean.hashCode(this.f9476g)) * 31;
        FlowType flowType = this.f9481m;
        if (flowType == null) {
            int i5 = f9467l + 17;
            f9468n = i5 % 128;
            iHashCode2 = i5 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = flowType.hashCode();
        }
        int iHashCode7 = (((iHashCode6 + iHashCode2) * 31) + Boolean.hashCode(this.f9480k)) * 31;
        String str4 = this.f9482o;
        if (str4 == null) {
            int i6 = f9468n + 69;
            f9467l = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode3 = str4.hashCode();
        }
        return iHashCode7 + iHashCode3;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9468n + 79;
        f9467l = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseOnboardingStart(token=" + this.f9471b + ", interviewId=" + this.f9472c + ", interviewCode=" + this.f9474e + ", idCaptureTimeout=" + this.f9473d + ", idDetectionTimeout=" + this.f9479j + ", selfieCaptureTimeout=" + this.f9477h + ", idCaptureRetries=" + this.f9475f + ", selfieCaptureRetries=" + this.f9478i + ", isExistingSession=" + this.f9476g + ", flowType=" + this.f9481m + ", optinEnabled=" + this.f9480k + ", optinCompanyName=" + this.f9482o + ")";
        int i5 = f9467l + 115;
        f9468n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return str;
    }

    public final String o() {
        int iC = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC2 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC3 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        return (String) e(iC, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), 1905909278, iC2, new Object[]{this}, iC3, -1905909278);
    }

    public final int j() {
        int iC = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC2 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC3 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        return ((Integer) e(iC, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), -780312722, iC2, new Object[]{this}, iC3, 780312723)).intValue();
    }

    public final int c() {
        int iC = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC2 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        int iC3 = IncodeWelcome$getWrappedDelayedOnboardingListener$1.c();
        return ((Integer) e(iC, IncodeWelcome$getWrappedDelayedOnboardingListener$1.c(), 1059690612, iC2, new Object[]{this}, iC3, -1059690610)).intValue();
    }
}
