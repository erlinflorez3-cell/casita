package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class EKYCResult extends BaseResult {
    public static final int $stable = 0;

    public EKYCResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EKYCResult(ResultCode resultCode) {
        this(resultCode, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ EKYCResult(ResultCode resultCode, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ResultCode.SUCCESS : resultCode, (i2 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EKYCResult(ResultCode resultCode, Throwable th) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "EKYCResult{resultCode=" + this.resultCode + "}";
    }
}
