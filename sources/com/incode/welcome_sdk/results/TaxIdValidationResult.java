package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class TaxIdValidationResult extends BaseResult {
    public static final int $stable = 0;
    public final boolean isValid;
    public final String taxId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxIdValidationResult(ResultCode resultCode) {
        this(resultCode, null, false, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxIdValidationResult(ResultCode resultCode, String str) {
        this(resultCode, str, false, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ TaxIdValidationResult(ResultCode resultCode, String str, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxIdValidationResult(ResultCode resultCode, String str, boolean z2) {
        super(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.taxId = str;
        this.isValid = z2;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public String toString() {
        return "TaxIdValidationResult{taxId='" + this.taxId + "', isValid=" + this.isValid + ", resultCode=" + this.resultCode + "}";
    }
}
