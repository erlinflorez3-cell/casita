package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdScanCompleted extends BaseResult implements IdScanResultType {
    public static final int $stable = 0;

    public /* synthetic */ IdScanCompleted(ResultCode resultCode, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdScanCompleted(ResultCode resultCode, Throwable th) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }
}
