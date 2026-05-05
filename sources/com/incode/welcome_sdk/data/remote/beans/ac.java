package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9209a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9210d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9211e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f9212g = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.incode.welcome_sdk.data.remote.beans.d f9213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9214c;

    public ac(boolean z2, com.incode.welcome_sdk.data.remote.beans.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "");
        this.f9214c = z2;
        this.f9213b = dVar;
    }

    public final com.incode.welcome_sdk.data.remote.beans.d d() {
        int i2 = 2 % 2;
        int i3 = f9210d + 111;
        f9209a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f9213b;
        }
        throw null;
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9215b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9216d = 0;

        private d() {
        }

        @JvmStatic
        public static ac e(ResponseBody responseBody) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            boolean zOptBoolean = jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS);
            String strOptString = jSONObject.optString("regulationType");
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            ac acVar = new ac(zOptBoolean, new com.incode.welcome_sdk.data.remote.beans.d(strOptString, jSONObject.optBoolean("showMandatoryConsent")));
            int i3 = f9215b + 99;
            f9216d = i3 % 128;
            if (i3 % 2 == 0) {
                return acVar;
            }
            throw null;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        new d((byte) 0);
        int i2 = f9212g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9211e = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final ac b(ResponseBody responseBody) {
        int i2 = 2 % 2;
        int i3 = f9210d + 13;
        f9209a = i3 % 128;
        int i4 = i3 % 2;
        ac acVarE = d.e(responseBody);
        int i5 = f9210d + 23;
        f9209a = i5 % 128;
        int i6 = i5 % 2;
        return acVarE;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9210d + 113;
            f9209a = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof ac)) {
            int i5 = f9209a + 5;
            f9210d = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        ac acVar = (ac) obj;
        if (this.f9214c != acVar.f9214c) {
            int i7 = f9210d + 87;
            f9209a = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.f9213b, acVar.f9213b)) {
            return true;
        }
        int i9 = f9210d + 71;
        f9209a = i9 % 128;
        return i9 % 2 == 0;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9210d + 41;
        f9209a = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = Boolean.hashCode(this.f9214c);
        return i4 == 0 ? (iHashCode >>> 83) / this.f9213b.hashCode() : (iHashCode * 31) + this.f9213b.hashCode();
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9210d + 61;
        f9209a = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseDeviceFingerprint(success=" + this.f9214c + ", biometricConsentInfo=" + this.f9213b + ")";
        int i5 = f9210d + 37;
        f9209a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
