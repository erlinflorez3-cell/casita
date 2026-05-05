package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class NameResult extends BaseResult {
    public static final int $stable = 0;
    public final String name;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NameResult(ResultCode resultCode) {
        this(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NameResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ NameResult(ResultCode resultCode, Throwable th, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NameResult(ResultCode resultCode, Throwable th, String str) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.name = str;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "NameResult{name='" + this.name + "', resultCode=" + this.resultCode + "}";
    }
}
