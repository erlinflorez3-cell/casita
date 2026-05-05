package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ResponseCombinedConsent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9125a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9126c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9127d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f9128e = 0;
    private final List<Consent> consents;
    private final String languageConsentId;
    private final String terms;
    private final String title;
    public static final a Companion = new a(0);
    public static final int $stable = 8;

    public ResponseCombinedConsent(String str, String str2, String str3, List<Consent> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.languageConsentId = str;
        this.title = str2;
        this.terms = str3;
        this.consents = list;
    }

    public /* synthetic */ ResponseCombinedConsent(String str, String str2, String str3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getLanguageConsentId() {
        int i2 = 2 % 2;
        int i3 = f9127d;
        int i4 = i3 + 77;
        f9128e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.languageConsentId;
        int i6 = i3 + 5;
        f9128e = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 0;
        }
        return str;
    }

    public final String getTitle() {
        int i2 = 2 % 2;
        int i3 = f9128e + 109;
        int i4 = i3 % 128;
        f9127d = i4;
        int i5 = i3 % 2;
        String str = this.title;
        int i6 = i4 + 59;
        f9128e = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getTerms() {
        int i2 = 2 % 2;
        int i3 = f9127d + 103;
        int i4 = i3 % 128;
        f9128e = i4;
        int i5 = i3 % 2;
        String str = this.terms;
        int i6 = i4 + 85;
        f9127d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final List<Consent> getConsents() {
        int i2 = 2 % 2;
        int i3 = f9127d;
        int i4 = i3 + 11;
        f9128e = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Consent> list = this.consents;
        int i5 = i3 + 121;
        f9128e = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9129b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9130c = 1;

        private a() {
        }

        @JvmStatic
        public static ResponseCombinedConsent c(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            String string = jSONObject.getString("languageConsentId");
            String string2 = jSONObject.getString("title");
            String string3 = jSONObject.getString("terms");
            JSONArray jSONArray = jSONObject.getJSONArray("consents");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            int i3 = f9129b + 79;
            f9130c = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 < length; i5++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                String string4 = jSONObject2.getString("checkboxId");
                Intrinsics.checkNotNullExpressionValue(string4, "");
                String string5 = jSONObject2.getString("consentText");
                Intrinsics.checkNotNullExpressionValue(string5, "");
                arrayList.add(new Consent(string4, string5, jSONObject2.optBoolean("optional")));
            }
            Intrinsics.checkNotNull(string);
            Intrinsics.checkNotNull(string2);
            Intrinsics.checkNotNull(string3);
            return new ResponseCombinedConsent(string, string2, string3, arrayList);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9126c + 13;
        f9125a = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final ResponseCombinedConsent parse(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9128e + 41;
        f9127d = i3 % 128;
        int i4 = i3 % 2;
        ResponseCombinedConsent responseCombinedConsentC = a.c(responseBody);
        int i5 = f9127d + 33;
        f9128e = i5 % 128;
        int i6 = i5 % 2;
        return responseCombinedConsentC;
    }

    public ResponseCombinedConsent() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9128e + 57;
            f9127d = i3 % 128;
            return i3 % 2 != 0;
        }
        if (!(obj instanceof ResponseCombinedConsent)) {
            int i4 = f9128e + 47;
            f9127d = i4 % 128;
            return i4 % 2 == 0;
        }
        ResponseCombinedConsent responseCombinedConsent = (ResponseCombinedConsent) obj;
        if (!Intrinsics.areEqual(this.languageConsentId, responseCombinedConsent.languageConsentId)) {
            int i5 = f9127d;
            int i6 = i5 + 77;
            f9128e = i6 % 128;
            boolean z2 = i6 % 2 != 0;
            int i7 = i5 + 37;
            f9128e = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 73 / 0;
            }
            return z2;
        }
        if (!Intrinsics.areEqual(this.title, responseCombinedConsent.title)) {
            int i9 = f9127d + 35;
            f9128e = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.terms, responseCombinedConsent.terms)) {
            return Intrinsics.areEqual(this.consents, responseCombinedConsent.consents);
        }
        int i11 = f9128e + 107;
        f9127d = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9128e + 45;
        f9127d = i3 % 128;
        int iHashCode = i3 % 2 == 0 ? (((((this.languageConsentId.hashCode() - 105) << this.title.hashCode()) - 72) + this.terms.hashCode()) - 51) >> this.consents.hashCode() : (((((this.languageConsentId.hashCode() * 31) + this.title.hashCode()) * 31) + this.terms.hashCode()) * 31) + this.consents.hashCode();
        int i4 = f9127d + 115;
        f9128e = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9128e + 77;
        f9127d = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseCombinedConsent(languageConsentId=" + this.languageConsentId + ", title=" + this.title + ", terms=" + this.terms + ", consents=" + this.consents + ")";
        int i5 = f9127d + 45;
        f9128e = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResponseCombinedConsent copy$default(ResponseCombinedConsent responseCombinedConsent, String str, String str2, String str3, List list, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f9127d;
            int i5 = i4 + 61;
            f9128e = i5 % 128;
            int i6 = i5 % 2;
            str = responseCombinedConsent.languageConsentId;
            int i7 = i4 + 123;
            f9128e = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i2 & 2) != 0) {
            int i9 = f9128e + 117;
            f9127d = i9 % 128;
            if (i9 % 2 == 0) {
                str2 = responseCombinedConsent.title;
                int i10 = 74 / 0;
            } else {
                str2 = responseCombinedConsent.title;
            }
        }
        if ((i2 & 4) != 0) {
            str3 = responseCombinedConsent.terms;
            int i11 = f9128e + 47;
            f9127d = i11 % 128;
            int i12 = i11 % 2;
        }
        if ((i2 & 8) != 0) {
            list = responseCombinedConsent.consents;
        }
        return responseCombinedConsent.copy(str, str2, str3, list);
    }

    public final ResponseCombinedConsent copy(String str, String str2, String str3, List<Consent> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        ResponseCombinedConsent responseCombinedConsent = new ResponseCombinedConsent(str, str2, str3, list);
        int i3 = f9128e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9127d = i3 % 128;
        if (i3 % 2 != 0) {
            return responseCombinedConsent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Consent> component4() {
        int i2 = 2 % 2;
        int i3 = f9128e + 67;
        f9127d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.consents;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f9128e;
        int i4 = i3 + 19;
        f9127d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.terms;
        int i6 = i3 + 29;
        f9127d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f9127d + 125;
        int i4 = i3 % 128;
        f9128e = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.title;
        int i5 = i4 + 97;
        f9127d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f9127d;
        int i4 = i3 + 121;
        f9128e = i4 % 128;
        int i5 = i4 % 2;
        String str = this.languageConsentId;
        int i6 = i3 + 89;
        f9128e = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
