package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AESResult extends BaseResult {
    public static final int $stable = 0;
    public final boolean documentSigning;
    public final boolean resourcesNotFound;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AESResult(ResultCode resultCode) {
        this(resultCode, false, false, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AESResult(ResultCode resultCode, boolean z2) {
        this(resultCode, z2, false, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ AESResult(ResultCode resultCode, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AESResult(ResultCode resultCode, boolean z2, boolean z3) {
        super(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.documentSigning = z2;
        this.resourcesNotFound = z3;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "AESResult{documentSigning=" + this.documentSigning + ", resourcesNotFound='" + this.resourcesNotFound + "'}";
    }
}
