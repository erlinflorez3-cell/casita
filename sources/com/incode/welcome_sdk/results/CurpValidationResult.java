package com.incode.welcome_sdk.results;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class CurpValidationResult extends BaseResult {
    public static final int $stable = 8;
    public final String curp;
    public final Map<String, Object> data;
    public final boolean isFinalAttempt;
    public final boolean isValid;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurpValidationResult(ResultCode resultCode) {
        this(resultCode, null, false, null, false, 30, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurpValidationResult(ResultCode resultCode, String str) {
        this(resultCode, str, false, null, false, 28, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurpValidationResult(ResultCode resultCode, String str, boolean z2) {
        this(resultCode, str, z2, null, false, 24, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurpValidationResult(ResultCode resultCode, String str, boolean z2, Map<String, ? extends Object> map) {
        this(resultCode, str, z2, map, false, 16, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ CurpValidationResult(ResultCode resultCode, String str, boolean z2, Map map, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? new HashMap() : map, (i2 & 16) == 0 ? z3 : false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurpValidationResult(ResultCode resultCode, String str, boolean z2, Map<String, ? extends Object> map, boolean z3) {
        super(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.curp = str;
        this.isValid = z2;
        this.data = map;
        this.isFinalAttempt = z3;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public String toString() {
        return "CurpValidationResult{curp='" + this.curp + "', valid=" + this.isValid + ", data=" + this.data + ", isFinalAttempt=" + this.isFinalAttempt + "}";
    }
}
