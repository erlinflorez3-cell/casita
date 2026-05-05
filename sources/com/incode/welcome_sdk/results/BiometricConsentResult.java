package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BiometricConsentResult extends BaseResult {
    public static final int $stable = 0;
    public final boolean consentGiven;
    public final boolean isSuccess;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricConsentResult(ResultCode resultCode) {
        this(resultCode, null, false, false, 14, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricConsentResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, false, false, 12, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricConsentResult(ResultCode resultCode, Throwable th, boolean z2) {
        this(resultCode, th, z2, false, 8, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ BiometricConsentResult(ResultCode resultCode, Throwable th, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricConsentResult(ResultCode resultCode, Throwable th, boolean z2, boolean z3) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.isSuccess = z2;
        this.consentGiven = z3;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "BiometricConsentResult{resultCode=" + this.resultCode + ", isSuccess=" + this.isSuccess + ", consentGiven=" + this.consentGiven + ", error=" + this.error + "}";
    }
}
