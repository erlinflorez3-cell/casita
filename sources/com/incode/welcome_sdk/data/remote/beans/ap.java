package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.remote.beans.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ap {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f9310q = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f9311r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f9312s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f9313t = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f9317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f9318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f9319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f9320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f9322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f9323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f9324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f9325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f9326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f9327n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<p> f9328o;

    public ap(boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str2, boolean z10, boolean z11, String str3, boolean z12, List<p> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f9316c = z2;
        this.f9314a = z3;
        this.f9315b = str;
        this.f9317d = z4;
        this.f9318e = z5;
        this.f9323j = z6;
        this.f9322i = z7;
        this.f9319f = z8;
        this.f9320g = z9;
        this.f9321h = str2;
        this.f9327n = z10;
        this.f9324k = z11;
        this.f9325l = str3;
        this.f9326m = z12;
        this.f9328o = list;
    }

    public final boolean e() {
        int i2 = 2 % 2;
        int i3 = f9313t + 87;
        f9311r = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9326m;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ap(byte b2) {
        this(false, false, "", false, false, false, false, false, false, "", false, false, "", false, CollectionsKt.emptyList());
    }

    public final List<p> b() {
        int i2 = 2 % 2;
        int i3 = f9311r + 81;
        f9313t = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9328o;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9329a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9330b = 1;

        private e() {
        }

        @JvmStatic
        public static ap e(ResponseBody responseBody) throws JSONException, IOException {
            JSONObject jSONObject;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject2 = new JSONObject(responseBody.string());
            JSONArray jSONArrayB = com.incode.welcome_sdk.commons.extensions.i.b(jSONObject2, "flowModules");
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayB.length();
            for (int i3 = 0; i3 < length; i3++) {
                Object obj = jSONArrayB.get(i3);
                p pVarA = null;
                if (obj instanceof JSONObject) {
                    jSONObject = (JSONObject) obj;
                    int i4 = f9330b + 1;
                    f9329a = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    int i6 = f9330b + 49;
                    f9329a = i6 % 128;
                    int i7 = i6 % 2;
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    int i8 = f9329a + 93;
                    f9330b = i8 % 128;
                    if (i8 % 2 == 0) {
                        p.d dVar = p.f9750c;
                        pVarA = p.d.a(jSONObject);
                        int i9 = 79 / 0;
                    } else {
                        p.d dVar2 = p.f9750c;
                        pVarA = p.d.a(jSONObject);
                    }
                }
                if (pVarA != null) {
                    int i10 = f9329a + 59;
                    f9330b = i10 % 128;
                    int i11 = i10 % 2;
                    arrayList.add(pVarA);
                }
            }
            boolean zOptBoolean = jSONObject2.optBoolean("addContinueToDesktop");
            boolean zOptBoolean2 = jSONObject2.optBoolean("autoApproveEnabled");
            String strOptString = jSONObject2.optString("autoApproveLevel");
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            boolean zOptBoolean3 = jSONObject2.optBoolean("checkAuthorization");
            boolean zOptBoolean4 = jSONObject2.optBoolean("checkTutorials");
            boolean zOptBoolean5 = jSONObject2.optBoolean("disableLaunchScreen");
            boolean zOptBoolean6 = jSONObject2.optBoolean("disableMandatoryConsentCheck");
            boolean zOptBoolean7 = jSONObject2.optBoolean("displayOnboardingResultOnDesktop");
            boolean zOptBoolean8 = jSONObject2.optBoolean("enableMultipleOnboardings");
            String strOptString2 = jSONObject2.optString("name");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            boolean zOptBoolean9 = jSONObject2.optBoolean("redirectDesktopToMobile");
            boolean zOptBoolean10 = jSONObject2.optBoolean("redirectOriginOnly");
            String strOptString3 = jSONObject2.optString("idRank");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            return new ap(zOptBoolean, zOptBoolean2, strOptString, zOptBoolean3, zOptBoolean4, zOptBoolean5, zOptBoolean6, zOptBoolean7, zOptBoolean8, strOptString2, zOptBoolean9, zOptBoolean10, strOptString3, jSONObject2.optBoolean("ageAssurance"), arrayList);
        }

        public /* synthetic */ e(byte b2) {
            this();
        }
    }

    static {
        new e((byte) 0);
        int i2 = f9310q + 113;
        f9312s = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final ap d(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9311r + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9313t = i3 % 128;
        int i4 = i3 % 2;
        ap apVarE = e.e(responseBody);
        int i5 = f9311r + 45;
        f9313t = i5 % 128;
        if (i5 % 2 != 0) {
            return apVarE;
        }
        throw null;
    }

    public ap() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9311r + 113;
            f9313t = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        if (this.f9316c != apVar.f9316c) {
            return false;
        }
        if (this.f9314a != apVar.f9314a) {
            int i5 = f9313t + 49;
            f9311r = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f9315b, apVar.f9315b) || this.f9317d != apVar.f9317d) {
            return false;
        }
        if (this.f9318e != apVar.f9318e) {
            int i7 = f9313t + 117;
            f9311r = i7 % 128;
            return i7 % 2 != 0;
        }
        if (this.f9323j != apVar.f9323j) {
            int i8 = f9311r + 73;
            f9313t = i8 % 128;
            return i8 % 2 == 0;
        }
        if (this.f9322i != apVar.f9322i) {
            int i9 = f9313t + 17;
            f9311r = i9 % 128;
            return i9 % 2 != 0;
        }
        if (this.f9319f != apVar.f9319f) {
            int i10 = f9313t + 45;
            f9311r = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.f9320g != apVar.f9320g) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f9321h, apVar.f9321h)) {
            int i12 = f9311r + 35;
            f9313t = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.f9327n != apVar.f9327n) {
            int i14 = f9311r + 21;
            f9313t = i14 % 128;
            return i14 % 2 == 0;
        }
        if (this.f9324k != apVar.f9324k || (!Intrinsics.areEqual(this.f9325l, apVar.f9325l))) {
            return false;
        }
        if (this.f9326m == apVar.f9326m) {
            return Intrinsics.areEqual(this.f9328o, apVar.f9328o);
        }
        int i15 = f9311r + 5;
        f9313t = i15 % 128;
        int i16 = i15 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9311r + 31;
        f9313t = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = (((((((((((((((((((((((((((Boolean.hashCode(this.f9316c) * 31) + Boolean.hashCode(this.f9314a)) * 31) + this.f9315b.hashCode()) * 31) + Boolean.hashCode(this.f9317d)) * 31) + Boolean.hashCode(this.f9318e)) * 31) + Boolean.hashCode(this.f9323j)) * 31) + Boolean.hashCode(this.f9322i)) * 31) + Boolean.hashCode(this.f9319f)) * 31) + Boolean.hashCode(this.f9320g)) * 31) + this.f9321h.hashCode()) * 31) + Boolean.hashCode(this.f9327n)) * 31) + Boolean.hashCode(this.f9324k)) * 31) + this.f9325l.hashCode()) * 31) + Boolean.hashCode(this.f9326m)) * 31) + this.f9328o.hashCode();
        int i5 = f9311r + 21;
        f9313t = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 29 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9313t + 87;
        f9311r = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseFlowConfiguration(addContinueToDesktop=" + this.f9316c + ", autoApproveEnabled=" + this.f9314a + ", autoApproveLevel=" + this.f9315b + ", checkAuthorization=" + this.f9317d + ", checkTutorials=" + this.f9318e + ", disableLaunchScreen=" + this.f9323j + ", disableMandatoryConsentCheck=" + this.f9322i + ", displayOnboardingResultOnDesktop=" + this.f9319f + ", enableMultipleOnboardings=" + this.f9320g + ", name=" + this.f9321h + ", redirectDesktopToMobile=" + this.f9327n + ", redirectOriginOnly=" + this.f9324k + ", idRank=" + this.f9325l + ", ageAssurance=" + this.f9326m + ", flowModules=" + this.f9328o + ")";
        int i5 = f9313t + 47;
        f9311r = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return str;
    }
}
