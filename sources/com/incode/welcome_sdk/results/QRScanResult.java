package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class QRScanResult extends BaseResult {
    public static final int $stable = 0;
    public final String value;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRScanResult(ResultCode resultCode) {
        this(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRScanResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ QRScanResult(ResultCode resultCode, Throwable th, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRScanResult(ResultCode resultCode, Throwable th, String str) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.value = str;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "QRScanResult{value='" + this.value + "', resultCode=" + this.resultCode + "}";
    }
}
