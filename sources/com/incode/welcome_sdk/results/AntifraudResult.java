package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AntifraudResult extends BaseResult {
    public static final int $stable = 0;
    public final boolean result;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AntifraudResult(ResultCode resultCode) {
        this(resultCode, false, 2, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ AntifraudResult(ResultCode resultCode, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? false : z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AntifraudResult(ResultCode resultCode, boolean z2) {
        super(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.result = z2;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "AntifraudResult{result=" + this.result + "}";
    }
}
