package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class BackIdScanResult extends BaseResult implements ActualIdScanResult {
    public static final int $stable = 8;
    private final IdScanResult result;

    public static /* synthetic */ BackIdScanResult copy$default(BackIdScanResult backIdScanResult, IdScanResult idScanResult, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            idScanResult = backIdScanResult.result;
        }
        return backIdScanResult.copy(idScanResult);
    }

    public final IdScanResult component1() {
        return this.result;
    }

    public final BackIdScanResult copy(IdScanResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new BackIdScanResult(result);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BackIdScanResult) && Intrinsics.areEqual(this.result, ((BackIdScanResult) obj).result);
    }

    public final int hashCode() {
        return this.result.hashCode();
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "BackIdScanResult(result=" + this.result + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackIdScanResult(IdScanResult result) {
        super(null, null, null, 7, null);
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    @Override // com.incode.welcome_sdk.results.ActualIdScanResult
    public final IdScanResult getResult() {
        return this.result;
    }
}
