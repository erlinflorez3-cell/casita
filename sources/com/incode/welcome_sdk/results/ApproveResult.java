package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ApproveResult extends BaseResult {
    public static final int $stable = 0;
    public final boolean isSuccess;
    public final String token;
    public final String uuid;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApproveResult(ResultCode resultCode) {
        this(resultCode, false, null, null, 14, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApproveResult(ResultCode resultCode, boolean z2) {
        this(resultCode, z2, null, null, 12, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApproveResult(ResultCode resultCode, boolean z2, String str) {
        this(resultCode, z2, str, null, 8, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ ApproveResult(ResultCode resultCode, boolean z2, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApproveResult(ResultCode resultCode, boolean z2, String str, String str2) {
        super(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.isSuccess = z2;
        this.uuid = str;
        this.token = str2;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "ApproveResult{success=" + this.isSuccess + ", uuid='" + this.uuid + "', token='" + this.token + "'}";
    }
}
