package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.IncodeWelcome;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class bg {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f9447k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f9448l = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f9449q = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f9450s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f9456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f9457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f9459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f9460j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f9461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f9462n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f9463o;

    public static /* synthetic */ Object c(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~(i8 | i6);
        int i10 = ~i6;
        int i11 = i9 | (~(i10 | i4));
        int i12 = ~(i10 | i7);
        int i13 = i11 | i12;
        int i14 = ~i4;
        int i15 = i12 | (~(i14 | i7));
        int i16 = (~(i6 | i8 | i14)) | (~(i14 | i10 | i7));
        int i17 = i4 + i7 + i3 + ((-1369571145) * i5) + ((-720088171) * i2);
        int i18 = i17 * i17;
        int i19 = (((-954023988) * i4) - 252706816) + ((-260227018) * i7) + ((-346898485) * i13) + (i15 * 346898485) + (346898485 * i16) + ((-607125504) * i3) + (565182464 * i5) + (1611661312 * i2) + ((-409206784) * i18);
        int i20 = ((i4 * (-1931095572)) - 2087550970) + (i7 * (-1931094842)) + (i13 * (-365)) + (i15 * 365) + (i16 * 365) + (i3 * (-1931095207)) + (i5 * (-789048161)) + (i2 * 356376013) + (i18 * 423362560);
        int i21 = i19 + (i20 * i20 * (-1901854720));
        if (i21 == 1) {
            return b(objArr);
        }
        if (i21 != 2) {
            return d(objArr);
        }
        bg bgVar = (bg) objArr[0];
        int i22 = 2 % 2;
        int i23 = f9448l;
        int i24 = i23 + 79;
        f9447k = i24 % 128;
        int i25 = i24 % 2;
        String str = bgVar.f9454d;
        int i26 = i23 + 23;
        f9447k = i26 % 128;
        int i27 = i26 % 2;
        return str;
    }

    public bg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.f9451a = str;
        this.f9453c = str2;
        this.f9454d = str3;
        this.f9452b = str4;
        this.f9455e = str5;
        this.f9458h = str6;
        this.f9456f = str7;
        this.f9459i = str8;
        this.f9457g = str9;
        this.f9460j = str10;
        this.f9461m = str11;
        this.f9462n = str12;
        this.f9463o = str13;
    }

    public final String e() {
        String str;
        int i2 = 2 % 2;
        int i3 = f9448l;
        int i4 = i3 + 75;
        f9447k = i4 % 128;
        if (i4 % 2 != 0) {
            str = this.f9451a;
            int i5 = 65 / 0;
        } else {
            str = this.f9451a;
        }
        int i6 = i3 + 41;
        f9447k = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String c() {
        int i2 = 2 % 2;
        int i3 = f9447k + 109;
        int i4 = i3 % 128;
        f9448l = i4;
        int i5 = i3 % 2;
        String str = this.f9453c;
        int i6 = i4 + 19;
        f9447k = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f9447k;
        int i4 = i3 + 43;
        f9448l = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f9452b;
        int i6 = i3 + 117;
        f9448l = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f9448l + 17;
        f9447k = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9455e;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String j() {
        int i2 = 2 % 2;
        int i3 = f9448l + 29;
        f9447k = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f9458h;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = f9448l;
        int i4 = i3 + 27;
        f9447k = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f9456f;
        int i6 = i3 + 85;
        f9447k = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        bg bgVar = (bg) objArr[0];
        int i2 = 2 % 2;
        int i3 = f9447k + 41;
        int i4 = i3 % 128;
        f9448l = i4;
        int i5 = i3 % 2;
        String str = bgVar.f9459i;
        if (i5 == 0) {
            int i6 = 22 / 0;
        }
        int i7 = i4 + 75;
        f9447k = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 22 / 0;
        }
        return str;
    }

    public final String f() {
        int i2 = 2 % 2;
        int i3 = f9448l + 17;
        int i4 = i3 % 128;
        f9447k = i4;
        int i5 = i3 % 2;
        String str = this.f9457g;
        int i6 = i4 + 57;
        f9448l = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 98 / 0;
        }
        return str;
    }

    public final String h() {
        int i2 = 2 % 2;
        int i3 = f9447k;
        int i4 = i3 + 115;
        f9448l = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f9460j;
        int i6 = i3 + 71;
        f9448l = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        bg bgVar = (bg) objArr[0];
        int i2 = 2 % 2;
        int i3 = f9448l + 117;
        int i4 = i3 % 128;
        f9447k = i4;
        int i5 = i3 % 2;
        String str = bgVar.f9461m;
        if (i5 != 0) {
            int i6 = 27 / 0;
        }
        int i7 = i4 + 35;
        f9448l = i7 % 128;
        if (i7 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String k() {
        int i2 = 2 % 2;
        int i3 = f9448l + 97;
        int i4 = i3 % 128;
        f9447k = i4;
        int i5 = i3 % 2;
        String str = this.f9462n;
        int i6 = i4 + 105;
        f9448l = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String n() {
        int i2 = 2 % 2;
        int i3 = f9448l + 57;
        int i4 = i3 % 128;
        f9447k = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.f9463o;
        int i5 = i4 + 27;
        f9448l = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f9464b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f9465d = 0;

        private c() {
        }

        @JvmStatic
        public static bg b(ResponseBody responseBody) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            JSONObject jSONObject = new JSONObject(responseBody.string());
            bg bgVar = new bg(jSONObject.optString("rfcIssuer"), jSONObject.optString("issuerName"), jSONObject.optString("rfcReceiver"), jSONObject.optString("receiverName"), jSONObject.optString("fiscalInvoice"), jSONObject.optString("issueDate"), jSONObject.optString("certificationDate"), jSONObject.optString("rfcPac"), jSONObject.optString("totalCfdi"), jSONObject.optString("voucherEffect"), jSONObject.optString("cancellationStatus"), jSONObject.optString("validationCode"), jSONObject.optString("status"));
            int i3 = f9465d + 41;
            f9464b = i3 % 128;
            if (i3 % 2 != 0) {
                return bgVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    static {
        new c((byte) 0);
        int i2 = f9450s + 11;
        f9449q = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final bg d(ResponseBody responseBody) {
        int i2 = 2 % 2;
        int i3 = f9447k + 109;
        f9448l = i3 % 128;
        if (i3 % 2 != 0) {
            return c.b(responseBody);
        }
        c.b(responseBody);
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9448l + 13;
            f9447k = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        if (!Intrinsics.areEqual(this.f9451a, bgVar.f9451a)) {
            int i5 = f9448l + 19;
            f9447k = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.f9453c, bgVar.f9453c)) {
            int i6 = f9447k + 85;
            f9448l = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f9454d, bgVar.f9454d)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f9452b, bgVar.f9452b)) {
            int i8 = f9447k + 49;
            f9448l = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 9 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.f9455e, bgVar.f9455e)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f9458h, bgVar.f9458h)) {
            int i10 = f9448l + 93;
            f9447k = i10 % 128;
            return i10 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.f9456f, bgVar.f9456f)) {
            int i11 = f9448l;
            int i12 = i11 + 73;
            f9447k = i12 % 128;
            int i13 = i12 % 2;
            int i14 = i11 + 57;
            f9447k = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.f9459i, bgVar.f9459i)) {
            int i16 = f9448l + 33;
            f9447k = i16 % 128;
            return i16 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.f9457g, bgVar.f9457g)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f9460j, bgVar.f9460j)) {
            int i17 = f9447k + 1;
            f9448l = i17 % 128;
            return i17 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.f9461m, bgVar.f9461m) || !Intrinsics.areEqual(this.f9462n, bgVar.f9462n)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f9463o, bgVar.f9463o)) {
            return true;
        }
        int i18 = f9447k + 51;
        f9448l = i18 % 128;
        if (i18 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i2 = 2 % 2;
        String str = this.f9451a;
        int iHashCode5 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9453c;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9454d;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9452b;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9455e;
        if (str5 == null) {
            int i3 = f9448l + 29;
            f9447k = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str5.hashCode();
        }
        int i5 = (iHashCode8 + iHashCode) * 31;
        String str6 = this.f9458h;
        int iHashCode9 = (i5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9456f;
        if (str7 == null) {
            int i6 = f9448l + 121;
            f9447k = i6 % 128;
            iHashCode2 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = str7.hashCode();
        }
        int i7 = (iHashCode9 + iHashCode2) * 31;
        String str8 = this.f9459i;
        if (str8 == null) {
            int i8 = f9448l + 107;
            f9447k = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str8.hashCode();
        }
        int i10 = (i7 + iHashCode3) * 31;
        String str9 = this.f9457g;
        if (str9 == null) {
            int i11 = f9448l + 89;
            f9447k = i11 % 128;
            int i12 = i11 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str9.hashCode();
            int i13 = f9448l + 85;
            f9447k = i13 % 128;
            int i14 = i13 % 2;
        }
        int i15 = (i10 + iHashCode4) * 31;
        String str10 = this.f9460j;
        int iHashCode10 = (i15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f9461m;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f9462n;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f9463o;
        return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9447k + 77;
        f9448l = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponsePaymentProofInfo(rfcIssuer=" + this.f9451a + ", issuerName=" + this.f9453c + ", rfcReceiver=" + this.f9454d + ", receiverName=" + this.f9452b + ", fiscalInvoice=" + this.f9455e + ", issueDate=" + this.f9458h + ", certificationDate=" + this.f9456f + ", rfcPac=" + this.f9459i + ", totalCfdi=" + this.f9457g + ", voucherEffect=" + this.f9460j + ", cancellationStatus=" + this.f9461m + ", validationCode=" + this.f9462n + ", status=" + this.f9463o + ")";
        int i5 = f9447k + 37;
        f9448l = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String m() {
        int iD = IncodeWelcome.cm.d();
        return (String) c(new Object[]{this}, IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), -917271363, IncodeWelcome.cm.d(), iD, 917271364);
    }

    public final String i() {
        int iD = IncodeWelcome.cm.d();
        return (String) c(new Object[]{this}, IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), 426568383, IncodeWelcome.cm.d(), iD, -426568383);
    }

    public final String d() {
        int iD = IncodeWelcome.cm.d();
        return (String) c(new Object[]{this}, IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), -2109765290, IncodeWelcome.cm.d(), iD, 2109765292);
    }
}
