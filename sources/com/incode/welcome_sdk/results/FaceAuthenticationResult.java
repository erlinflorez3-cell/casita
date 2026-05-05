package com.incode.welcome_sdk.results;

import com.incode.welcome_sdk.commons.exceptions.FaceAuthenticationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceAuthenticationResult extends BaseResult {
    public static final int $stable = 0;
    public final String customerUUID;
    public final String encryptedSelfieBase64;
    public final boolean isSuccess;
    public final String selfieBase64;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceAuthenticationResult(ResultCode resultCode) {
        this(resultCode, null, false, null, null, null, 62, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceAuthenticationResult(ResultCode resultCode, FaceAuthenticationException faceAuthenticationException) {
        this(resultCode, faceAuthenticationException, false, null, null, null, 60, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceAuthenticationResult(ResultCode resultCode, FaceAuthenticationException faceAuthenticationException, boolean z2) {
        this(resultCode, faceAuthenticationException, z2, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceAuthenticationResult(ResultCode resultCode, FaceAuthenticationException faceAuthenticationException, boolean z2, String str) {
        this(resultCode, faceAuthenticationException, z2, str, null, null, 48, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceAuthenticationResult(ResultCode resultCode, FaceAuthenticationException faceAuthenticationException, boolean z2, String str, String str2) {
        this(resultCode, faceAuthenticationException, z2, str, str2, null, 32, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ FaceAuthenticationResult(ResultCode resultCode, FaceAuthenticationException faceAuthenticationException, boolean z2, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : faceAuthenticationException, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) == 0 ? str3 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceAuthenticationResult(ResultCode resultCode, FaceAuthenticationException faceAuthenticationException, boolean z2, String str, String str2, String str3) {
        super(resultCode, faceAuthenticationException, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.isSuccess = z2;
        this.customerUUID = str;
        this.selfieBase64 = str2;
        this.encryptedSelfieBase64 = str3;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "FaceAuthenticationResult(resultCode=" + this.resultCode + ", error=" + this.error + ", isSuccess=" + this.isSuccess + ", customerUUID=" + this.customerUUID + ", selfieBase64=" + (this.selfieBase64 != null ? "***" : null) + ", encryptedSelfieBase64=" + (this.encryptedSelfieBase64 == null ? null : "***") + ")";
    }
}
