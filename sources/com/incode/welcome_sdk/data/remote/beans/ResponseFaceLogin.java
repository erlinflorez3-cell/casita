package com.incode.welcome_sdk.data.remote.beans;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ResponseFaceLogin {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9143a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9144b = 21 % 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9145c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9146d = 1;
    public final String customerId;
    public final boolean faceMatch;
    public final Boolean hasFaceMask;
    public final String interviewId;
    public final String interviewToken;
    public final boolean secondFactor;
    public final boolean spoofAttempt;
    public final String token;
    public final String transactionId;

    public ResponseFaceLogin(String str, String str2, String str3, String str4, String str5, boolean z2, boolean z3, boolean z4, Boolean bool) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.customerId = str;
        this.token = str2;
        this.interviewId = str3;
        this.interviewToken = str4;
        this.transactionId = str5;
        this.faceMatch = z2;
        this.spoofAttempt = z3;
        this.secondFactor = z4;
        this.hasFaceMask = bool;
    }

    public /* synthetic */ ResponseFaceLogin(String str, String str2, String str3, String str4, String str5, boolean z2, boolean z3, boolean z4, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) == 0 ? str5 : "", (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (i2 & 128) == 0 ? z4 : false, (i2 & 256) == 0 ? bool : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResponseFaceLogin(String str) {
        this(str, "", "", "", "", false, false, false, Boolean.FALSE);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResponseFaceLogin(String str, boolean z2) {
        this(str, "", "", "", "", z2, false, false, Boolean.FALSE);
        Intrinsics.checkNotNullParameter(str, "");
    }

    static {
        if (21 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ResponseFaceLogin() {
        this(null, null, null, null, null, false, false, false, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9145c + 121;
            f9146d = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof ResponseFaceLogin)) {
            return false;
        }
        ResponseFaceLogin responseFaceLogin = (ResponseFaceLogin) obj;
        if (!Intrinsics.areEqual(this.customerId, responseFaceLogin.customerId)) {
            int i5 = f9146d + 55;
            f9145c = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.token, responseFaceLogin.token)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.interviewId, responseFaceLogin.interviewId)) {
            int i7 = f9145c + 69;
            f9146d = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.interviewToken, responseFaceLogin.interviewToken) || !Intrinsics.areEqual(this.transactionId, responseFaceLogin.transactionId) || this.faceMatch != responseFaceLogin.faceMatch || this.spoofAttempt != responseFaceLogin.spoofAttempt) {
            return false;
        }
        if (this.secondFactor == responseFaceLogin.secondFactor) {
            return Intrinsics.areEqual(this.hasFaceMask, responseFaceLogin.hasFaceMask);
        }
        int i9 = f9146d + 41;
        f9145c = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9145c + 111;
        f9146d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.customerId;
        int iHashCode = 0;
        int iHashCode2 = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.token.hashCode()) * 31) + this.interviewId.hashCode()) * 31) + this.interviewToken.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + Boolean.hashCode(this.faceMatch)) * 31) + Boolean.hashCode(this.spoofAttempt)) * 31) + Boolean.hashCode(this.secondFactor)) * 31;
        Boolean bool = this.hasFaceMask;
        if (bool == null) {
            int i4 = f9146d + 69;
            f9145c = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode = bool.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9145c + 23;
        f9146d = i3 % 128;
        int i4 = i3 % 2;
        String str = "ResponseFaceLogin(customerId=" + this.customerId + ", token=" + this.token + ", interviewId=" + this.interviewId + ", interviewToken=" + this.interviewToken + ", transactionId=" + this.transactionId + ", faceMatch=" + this.faceMatch + ", spoofAttempt=" + this.spoofAttempt + ", secondFactor=" + this.secondFactor + ", hasFaceMask=" + this.hasFaceMask + ")";
        int i5 = f9145c + 45;
        f9146d = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ ResponseFaceLogin copy$default(ResponseFaceLogin responseFaceLogin, String str, String str2, String str3, String str4, String str5, boolean z2, boolean z3, boolean z4, Boolean bool, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f9146d + 75;
        int i5 = i4 % 128;
        f9145c = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            str = responseFaceLogin.customerId;
        }
        if ((i2 & 2) != 0) {
            str2 = responseFaceLogin.token;
        }
        if ((i2 & 4) != 0) {
            str3 = responseFaceLogin.interviewId;
        }
        if ((i2 & 8) != 0) {
            str4 = responseFaceLogin.interviewToken;
        }
        Object obj2 = null;
        if ((i2 & 16) != 0) {
            int i7 = i5 + 37;
            f9146d = i7 % 128;
            if (i7 % 2 == 0) {
                String str6 = responseFaceLogin.transactionId;
                obj2.hashCode();
                throw null;
            }
            str5 = responseFaceLogin.transactionId;
        }
        if ((i2 & 32) != 0) {
            z2 = responseFaceLogin.faceMatch;
        }
        if ((i2 & 64) != 0) {
            z3 = responseFaceLogin.spoofAttempt;
        }
        if ((i2 & 128) != 0) {
            int i8 = i5 + 17;
            f9146d = i8 % 128;
            if (i8 % 2 == 0) {
                boolean z5 = responseFaceLogin.secondFactor;
                throw null;
            }
            z4 = responseFaceLogin.secondFactor;
        }
        if ((i2 & 256) != 0) {
            bool = responseFaceLogin.hasFaceMask;
        }
        return responseFaceLogin.copy(str, str2, str3, str4, str5, z2, z3, z4, bool);
    }

    public final ResponseFaceLogin copy(String str, String str2, String str3, String str4, String str5, boolean z2, boolean z3, boolean z4, Boolean bool) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        ResponseFaceLogin responseFaceLogin = new ResponseFaceLogin(str, str2, str3, str4, str5, z2, z3, z4, bool);
        int i3 = f9146d + 31;
        f9145c = i3 % 128;
        int i4 = i3 % 2;
        return responseFaceLogin;
    }

    public final Boolean component9() {
        int i2 = 2 % 2;
        int i3 = f9146d + 47;
        f9145c = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.hasFaceMask;
        if (i4 != 0) {
            int i5 = 27 / 0;
        }
        return bool;
    }

    public final boolean component8() {
        int i2 = 2 % 2;
        int i3 = f9145c + 117;
        int i4 = i3 % 128;
        f9146d = i4;
        int i5 = i3 % 2;
        boolean z2 = this.secondFactor;
        int i6 = i4 + 107;
        f9145c = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component7() {
        int i2 = 2 % 2;
        int i3 = f9145c + 121;
        int i4 = i3 % 128;
        f9146d = i4;
        int i5 = i3 % 2;
        boolean z2 = this.spoofAttempt;
        int i6 = i4 + 101;
        f9145c = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component6() {
        int i2 = 2 % 2;
        int i3 = f9146d + 101;
        int i4 = i3 % 128;
        f9145c = i4;
        int i5 = i3 % 2;
        boolean z2 = this.faceMatch;
        int i6 = i4 + 19;
        f9146d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 77 / 0;
        }
        return z2;
    }

    public final String component5() {
        int i2 = 2 % 2;
        int i3 = f9145c;
        int i4 = i3 + 81;
        f9146d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.transactionId;
        int i6 = i3 + 69;
        f9146d = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i2 = 2 % 2;
        int i3 = f9145c;
        int i4 = i3 + 117;
        f9146d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.interviewToken;
        int i6 = i3 + 25;
        f9146d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 47 / 0;
        }
        return str;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f9146d + 105;
        f9145c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.interviewId;
        if (i4 != 0) {
            int i5 = 39 / 0;
        }
        return str;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f9146d;
        int i4 = i3 + 55;
        f9145c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.token;
        int i6 = i3 + 89;
        f9145c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f9145c + 83;
        f9146d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.customerId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
