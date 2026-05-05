package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomWatchlistResult extends BaseResult {
    public static final int $stable = 0;
    private final boolean success;

    public /* synthetic */ CustomWatchlistResult(ResultCode resultCode, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? false : z2);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomWatchlistResult(ResultCode resultCode, boolean z2) {
        super(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.success = z2;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "CustomWatchlistResult{data=" + this.success + "', resultCode =" + this.resultCode + "}";
    }
}
