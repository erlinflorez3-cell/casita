package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FrontIdScanResult extends BaseResult implements ActualIdScanResult {
    public static final int $stable = 8;
    private final IdScanResult result;

    public static /* synthetic */ FrontIdScanResult copy$default(FrontIdScanResult frontIdScanResult, IdScanResult idScanResult, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            idScanResult = frontIdScanResult.result;
        }
        return frontIdScanResult.copy(idScanResult);
    }

    public final IdScanResult component1() {
        return this.result;
    }

    public final FrontIdScanResult copy(IdScanResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new FrontIdScanResult(result);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FrontIdScanResult) && Intrinsics.areEqual(this.result, ((FrontIdScanResult) obj).result);
    }

    public final int hashCode() {
        return this.result.hashCode();
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "FrontIdScanResult(result=" + this.result + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrontIdScanResult(IdScanResult result) {
        super(null, null, null, 7, null);
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    @Override // com.incode.welcome_sdk.results.ActualIdScanResult
    public final IdScanResult getResult() {
        return this.result;
    }
}
