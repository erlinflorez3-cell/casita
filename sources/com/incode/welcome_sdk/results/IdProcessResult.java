package com.incode.welcome_sdk.results;

import com.incode.welcome_sdk.IncodeWelcome;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdProcessResult extends BaseResult {
    public static final int $stable = 8;
    private IncodeWelcome.OCRData ocrData;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IdProcessResult(ResultCode resultCode) {
        this(resultCode, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ IdProcessResult(ResultCode resultCode, IncodeWelcome.OCRData oCRData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : oCRData);
    }

    public final IncodeWelcome.OCRData getOcrData() {
        return this.ocrData;
    }

    public final void setOcrData(IncodeWelcome.OCRData oCRData) {
        this.ocrData = oCRData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdProcessResult(ResultCode resultCode, IncodeWelcome.OCRData oCRData) {
        super(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.ocrData = oCRData;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "IdProcessResult{ocrData='" + this.ocrData + "', resultCode=" + this.resultCode + "}";
    }
}
