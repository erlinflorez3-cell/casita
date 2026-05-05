package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class MachineLearningConsentResult extends BaseResult {
    public static final int $stable = 0;
    public final boolean isSuccess;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MachineLearningConsentResult(ResultCode resultCode) {
        this(resultCode, null, false, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MachineLearningConsentResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, false, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ MachineLearningConsentResult(ResultCode resultCode, Throwable th, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? false : z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MachineLearningConsentResult(ResultCode resultCode, Throwable th, boolean z2) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.isSuccess = z2;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "MachineLearningConsentResult{status=" + this.isSuccess + ", resultCode=" + this.resultCode + ", isSuccess=" + this.isSuccess + "}";
    }
}
