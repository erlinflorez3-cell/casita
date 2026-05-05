package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.data.remote.beans.c;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationPresenter_Factory;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bc {

    /* JADX INFO: renamed from: p */
    private static int f9393p = 0;

    /* JADX INFO: renamed from: q */
    private static int f9394q = 1;

    /* JADX INFO: renamed from: r */
    private static int f9395r = 0;

    /* JADX INFO: renamed from: s */
    private static int f9396s = 1;

    /* JADX INFO: renamed from: a */
    private boolean f9397a;

    /* JADX INFO: renamed from: b */
    public final String f9398b;

    /* JADX INFO: renamed from: c */
    private int f9399c;

    /* JADX INFO: renamed from: d */
    private int f9400d;

    /* JADX INFO: renamed from: e */
    public double f9401e;

    /* JADX INFO: renamed from: f */
    private String f9402f;

    /* JADX INFO: renamed from: g */
    private int f9403g;

    /* JADX INFO: renamed from: h */
    private String f9404h;

    /* JADX INFO: renamed from: i */
    private boolean f9405i;

    /* JADX INFO: renamed from: j */
    private String f9406j;

    /* JADX INFO: renamed from: k */
    private final Throwable f9407k;

    /* JADX INFO: renamed from: l */
    private boolean f9408l;

    /* JADX INFO: renamed from: m */
    private d f9409m;

    /* JADX INFO: renamed from: n */
    private boolean f9410n;

    /* JADX INFO: renamed from: o */
    private boolean f9411o;

    /* JADX INFO: renamed from: t */
    private List<? extends c> f9412t;

    public static /* synthetic */ Object e(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i6 | i3;
        int i9 = ~i5;
        int i10 = i8 | i9;
        int i11 = ~(i9 | i6);
        int i12 = (~i8) | i11;
        int i13 = i11 | (~((~i6) | (~i3)));
        int i14 = i6 + i3 + i7 + (1699743442 * i2) + (2071835342 * i4);
        int i15 = i14 * i14;
        int i16 = ((i6 * (-557635572)) - 1375207424) + ((-557635572) * i3) + (i10 * (-2106796043)) + (2106796043 * i12) + ((-2106796043) * i13) + (1630535680 * i7) + ((-648019968) * i2) + ((-1801453568) * i4) + (1296564224 * i15);
        int i17 = ((i6 * (-355764420)) - 259725689) + (i3 * (-355764420)) + (i10 * 521) + (i12 * (-521)) + (i13 * 521) + (i7 * (-355763899)) + (i2 * 2119243930) + (i4 * (-943812730)) + (i15 * (-597164032));
        int i18 = i16 + (i17 * i17 * 58195968);
        if (i18 == 1) {
            bc bcVar = (bc) objArr[0];
            int i19 = 2 % 2;
            int i20 = f9393p + 15;
            int i21 = i20 % 128;
            f9394q = i21;
            int i22 = i20 % 2;
            List<? extends c> list = bcVar.f9412t;
            int i23 = i21 + 73;
            f9393p = i23 % 128;
            int i24 = i23 % 2;
            return list;
        }
        if (i18 == 2) {
            return d(objArr);
        }
        bc bcVar2 = (bc) objArr[0];
        int i25 = 2 % 2;
        int i26 = f9393p + 19;
        int i27 = i26 % 128;
        f9394q = i27;
        int i28 = i26 % 2;
        Throwable th = bcVar2.f9407k;
        int i29 = i27 + 113;
        f9393p = i29 % 128;
        int i30 = i29 % 2;
        return th;
    }

    public final int a() {
        int i2 = 2 % 2;
        int i3 = f9394q + 87;
        int i4 = i3 % 128;
        f9393p = i4;
        int i5 = i3 % 2;
        int i6 = this.f9399c;
        int i7 = i4 + 89;
        f9394q = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final int b() {
        int i2;
        int i3 = 2 % 2;
        int i4 = f9393p;
        int i5 = i4 + 93;
        f9394q = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = this.f9400d;
            int i6 = 31 / 0;
        } else {
            i2 = this.f9400d;
        }
        int i7 = i4 + 89;
        f9394q = i7 % 128;
        if (i7 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    public final boolean d() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f9394q;
        int i4 = i3 + 81;
        f9393p = i4 % 128;
        if (i4 % 2 != 0) {
            z2 = this.f9397a;
            int i5 = 49 / 0;
        } else {
            z2 = this.f9397a;
        }
        int i6 = i3 + 67;
        f9393p = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f9394q + 31;
        f9393p = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9405i;
        }
        throw null;
    }

    public final String c() {
        String str;
        int i2 = 2 % 2;
        int i3 = f9393p + 73;
        int i4 = i3 % 128;
        f9394q = i4;
        if (i3 % 2 == 0) {
            str = this.f9406j;
            int i5 = 85 / 0;
        } else {
            str = this.f9406j;
        }
        int i6 = i4 + 125;
        f9393p = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 74 / 0;
        }
        return str;
    }

    public final int f() {
        int i2 = 2 % 2;
        int i3 = f9394q + 25;
        int i4 = i3 % 128;
        f9393p = i4;
        int i5 = i3 % 2;
        int i6 = this.f9403g;
        int i7 = i4 + 69;
        f9394q = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        bc bcVar = (bc) objArr[0];
        int i2 = 2 % 2;
        int i3 = f9393p + 89;
        int i4 = i3 % 128;
        f9394q = i4;
        int i5 = i3 % 2;
        String str = bcVar.f9402f;
        int i6 = i4 + 17;
        f9393p = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = f9394q + 43;
        f9393p = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9404h;
        }
        throw null;
    }

    public final boolean j() {
        int i2 = 2 % 2;
        int i3 = f9393p + 71;
        int i4 = i3 % 128;
        f9394q = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f9410n;
        int i6 = i4 + 109;
        f9393p = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0014, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0016, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0019, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001c, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = com.incode.welcome_sdk.data.remote.beans.bc.f9393p + 77;
        com.incode.welcome_sdk.data.remote.beans.bc.f9394q = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.data.remote.beans.d i() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.data.remote.beans.bc.f9393p
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.bc.f9394q = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L17
            com.incode.welcome_sdk.data.remote.beans.d r1 = r3.f9409m
            r0 = 59
            int r0 = r0 / 0
            if (r1 == 0) goto L1c
        L16:
            return r1
        L17:
            com.incode.welcome_sdk.data.remote.beans.d r1 = r3.f9409m
            if (r1 == 0) goto L1c
            goto L16
        L1c:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            int r0 = com.incode.welcome_sdk.data.remote.beans.bc.f9393p
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.bc.f9394q = r0
            int r1 = r1 % r2
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.bc.i():com.incode.welcome_sdk.data.remote.beans.d");
    }

    public final boolean m() {
        int i2 = 2 % 2;
        int i3 = f9394q + 45;
        int i4 = i3 % 128;
        f9393p = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f9408l;
        int i6 = i4 + 103;
        f9394q = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean l() {
        int i2 = 2 % 2;
        int i3 = f9393p + 41;
        f9394q = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9411o;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public bc(int i2, int i3, boolean z2, double d2, String str, boolean z3, String str2, int i4, String str3, String str4, boolean z4, d dVar, boolean z5, boolean z6, List<? extends c> list) {
        Intrinsics.checkNotNullParameter(dVar, "");
        this.f9399c = i2;
        this.f9400d = i3;
        this.f9397a = z2;
        this.f9401e = d2;
        this.f9398b = str;
        this.f9405i = z3;
        this.f9406j = str2;
        this.f9403g = i4;
        this.f9402f = str3;
        this.f9404h = str4;
        this.f9410n = z4;
        this.f9409m = dVar;
        this.f9408l = z5;
        this.f9411o = z6;
        this.f9412t = list;
        this.f9407k = null;
    }

    public bc(Throwable th, String str) {
        Intrinsics.checkNotNullParameter(th, "");
        this.f9407k = th;
        this.f9398b = str;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9394q + 23;
        f9393p = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseIdScan{sharpness=" + this.f9399c + ", glare=" + this.f9400d + ", classification=" + this.f9397a + ", shadowConfidence=" + this.f9401e + ", readability=" + this.f9405i + ", typeOfId='" + this.f9398b + "', issueName='" + this.f9406j + "', issueYear=" + this.f9403g + ", countryCode='" + this.f9402f + "', failReason='" + this.f9404h + "', skipBackIdCapture=" + this.f9410n + ", biometricConsentInfo=" + i() + ", isSkipGlareFront=" + this.f9408l + ", isSkipGlareBack=" + this.f9411o + ", acceptedDocuments=" + this.f9412t + ", error=" + this.f9407k + "}";
        int i5 = f9393p + 41;
        f9394q = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static final class a {

        /* JADX INFO: renamed from: c */
        private static int f9413c = 1;

        /* JADX INFO: renamed from: e */
        private static int f9414e = 0;

        private a() {
        }

        /* synthetic */ class c extends FunctionReferenceImpl implements Function1<String, com.incode.welcome_sdk.data.remote.beans.c> {

            /* JADX INFO: renamed from: a */
            private static int f9415a = 0;

            /* JADX INFO: renamed from: e */
            private static int f9416e = 1;

            private com.incode.welcome_sdk.data.remote.beans.c a(String str) {
                int i2 = 2 % 2;
                int i3 = f9416e + 13;
                f9415a = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return c.d.d(str);
                }
                Intrinsics.checkNotNullParameter(str, "");
                c.d.d(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ com.incode.welcome_sdk.data.remote.beans.c invoke(String str) {
                int i2 = 2 % 2;
                int i3 = f9416e + 71;
                f9415a = i3 % 128;
                int i4 = i3 % 2;
                com.incode.welcome_sdk.data.remote.beans.c cVarA = a(str);
                int i5 = f9415a + 89;
                f9416e = i5 % 128;
                int i6 = i5 % 2;
                return cVarA;
            }

            c(Object obj) {
                super(1, obj, c.d.class, "fromName", "fromName(Ljava/lang/String;)Lcom/incode/welcome_sdk/data/remote/beans/AcceptedDocuments;", 0);
            }
        }

        @JvmStatic
        public static bc a(ResponseBody responseBody) throws JSONException, IOException {
            List listA;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            int iOptInt = jSONObject.optInt("sharpness");
            int iOptInt2 = jSONObject.optInt("glare");
            boolean zOptBoolean = jSONObject.optBoolean("classification");
            double dOptDouble = jSONObject.optDouble("shadowConfidence");
            String strOptString = jSONObject.optString("typeOfId");
            boolean zOptBoolean2 = jSONObject.optBoolean("readability", true);
            String strOptString2 = jSONObject.optString("issueName");
            int iOptInt3 = jSONObject.optInt("issueYear");
            String strOptString3 = jSONObject.optString("countryCode");
            String strOptString4 = jSONObject.optString("failReason");
            boolean zOptBoolean3 = jSONObject.optBoolean("skipBackIdCapture");
            boolean zOptBoolean4 = jSONObject.optBoolean("skipGlareFront");
            boolean zOptBoolean5 = jSONObject.optBoolean("skipGlareBack");
            String strOptString5 = jSONObject.optString("regulationType");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "");
            d dVar = new d(strOptString5, jSONObject.optBoolean("showMandatoryConsent"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("acceptedDocuments");
            if (jSONArrayOptJSONArray != null) {
                listA = com.incode.welcome_sdk.commons.extensions.i.a(jSONArrayOptJSONArray, new c(com.incode.welcome_sdk.data.remote.beans.c.f9612c));
                int i3 = f9413c + 87;
                f9414e = i3 % 128;
                int i4 = i3 % 2;
            } else {
                listA = null;
            }
            bc bcVar = new bc(iOptInt, iOptInt2, zOptBoolean, dOptDouble, strOptString, zOptBoolean2, strOptString2, iOptInt3, strOptString3, strOptString4, zOptBoolean3, dVar, zOptBoolean4, zOptBoolean5, listA);
            int i5 = f9413c + 31;
            f9414e = i5 % 128;
            int i6 = i5 % 2;
            return bcVar;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        new a((byte) 0);
        int i2 = f9396s + 59;
        f9395r = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final bc b(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9394q + 21;
        f9393p = i3 % 128;
        int i4 = i3 % 2;
        bc bcVarA = a.a(responseBody);
        int i5 = f9393p + 33;
        f9394q = i5 % 128;
        int i6 = i5 % 2;
        return bcVarA;
    }

    public final List<c> n() {
        int iE = BaseValidationPresenter_Factory.e();
        int iE2 = BaseValidationPresenter_Factory.e();
        return (List) e(BaseValidationPresenter_Factory.e(), new Object[]{this}, 1950513734, BaseValidationPresenter_Factory.e(), iE, -1950513733, iE2);
    }

    public final Throwable k() {
        int iE = BaseValidationPresenter_Factory.e();
        int iE2 = BaseValidationPresenter_Factory.e();
        return (Throwable) e(BaseValidationPresenter_Factory.e(), new Object[]{this}, -760616783, BaseValidationPresenter_Factory.e(), iE, 760616783, iE2);
    }

    public final String h() {
        int iE = BaseValidationPresenter_Factory.e();
        int iE2 = BaseValidationPresenter_Factory.e();
        return (String) e(BaseValidationPresenter_Factory.e(), new Object[]{this}, -210598799, BaseValidationPresenter_Factory.e(), iE, 210598801, iE2);
    }
}
