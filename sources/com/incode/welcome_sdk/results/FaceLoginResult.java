package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceLoginResult {
    public static final int $stable = 0;
    public final String customerUUID;
    public final String interviewId;
    public final String interviewToken;
    public final boolean success;
    public final String token;
    public final String transactionId;

    public FaceLoginResult() {
        this(false, null, null, null, null, null, 63, null);
    }

    public FaceLoginResult(boolean z2) {
        this(z2, null, null, null, null, null, 62, null);
    }

    public FaceLoginResult(boolean z2, String str) {
        this(z2, str, null, null, null, null, 60, null);
    }

    public FaceLoginResult(boolean z2, String str, String str2) {
        this(z2, str, str2, null, null, null, 56, null);
    }

    public FaceLoginResult(boolean z2, String str, String str2, String str3) {
        this(z2, str, str2, str3, null, null, 48, null);
    }

    public FaceLoginResult(boolean z2, String str, String str2, String str3, String str4) {
        this(z2, str, str2, str3, str4, null, 32, null);
    }

    public static /* synthetic */ FaceLoginResult copy$default(FaceLoginResult faceLoginResult, boolean z2, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = faceLoginResult.success;
        }
        if ((i2 & 2) != 0) {
            str = faceLoginResult.customerUUID;
        }
        if ((i2 & 4) != 0) {
            str2 = faceLoginResult.interviewId;
        }
        if ((i2 & 8) != 0) {
            str3 = faceLoginResult.interviewToken;
        }
        if ((i2 & 16) != 0) {
            str4 = faceLoginResult.token;
        }
        if ((i2 & 32) != 0) {
            str5 = faceLoginResult.transactionId;
        }
        return faceLoginResult.copy(z2, str, str2, str3, str4, str5);
    }

    public final boolean component1() {
        return this.success;
    }

    public final String component2() {
        return this.customerUUID;
    }

    public final String component3() {
        return this.interviewId;
    }

    public final String component4() {
        return this.interviewToken;
    }

    public final String component5() {
        return this.token;
    }

    public final String component6() {
        return this.transactionId;
    }

    public final FaceLoginResult copy(boolean z2, String str, String str2, String str3, String str4, String str5) {
        return new FaceLoginResult(z2, str, str2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceLoginResult)) {
            return false;
        }
        FaceLoginResult faceLoginResult = (FaceLoginResult) obj;
        return this.success == faceLoginResult.success && Intrinsics.areEqual(this.customerUUID, faceLoginResult.customerUUID) && Intrinsics.areEqual(this.interviewId, faceLoginResult.interviewId) && Intrinsics.areEqual(this.interviewToken, faceLoginResult.interviewToken) && Intrinsics.areEqual(this.token, faceLoginResult.token) && Intrinsics.areEqual(this.transactionId, faceLoginResult.transactionId);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.customerUUID;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.interviewId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.interviewToken;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.token;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.transactionId;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "FaceLoginResult(success=" + this.success + ", customerUUID=" + this.customerUUID + ", interviewId=" + this.interviewId + ", interviewToken=" + this.interviewToken + ", token=" + this.token + ", transactionId=" + this.transactionId + ")";
    }

    public FaceLoginResult(boolean z2, String str, String str2, String str3, String str4, String str5) {
        this.success = z2;
        this.customerUUID = str;
        this.interviewId = str2;
        this.interviewToken = str3;
        this.token = str4;
        this.transactionId = str5;
    }

    public /* synthetic */ FaceLoginResult(boolean z2, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) == 0 ? str5 : null);
    }

    public final FaceLoginResult applyTransactionId(String str) {
        return copy$default(this, false, null, null, null, null, str, 31, null);
    }
}
