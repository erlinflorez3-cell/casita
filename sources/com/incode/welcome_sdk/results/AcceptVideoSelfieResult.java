package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AcceptVideoSelfieResult extends BaseResult {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptVideoSelfieResult(ResultCode resultCode) {
        super(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "AcceptVideoSelfieResult{resultCode=" + this.resultCode + "}";
    }
}
