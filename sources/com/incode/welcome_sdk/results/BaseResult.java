package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class BaseResult {
    public static final int $stable = 8;
    public DeviceStats deviceStats;
    public Throwable error;
    public ResultCode resultCode;

    protected BaseResult() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected BaseResult(ResultCode resultCode) {
        this(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    protected BaseResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    protected BaseResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats) {
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.resultCode = resultCode;
        this.error = th;
        this.deviceStats = deviceStats;
    }

    public /* synthetic */ BaseResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ResultCode.USER_CANCELLED : resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? null : deviceStats);
    }

    public String toString() {
        return "BaseResult{resultCode=" + this.resultCode + ", error=" + this.error + ", deviceStats=" + this.deviceStats + "}";
    }
}
