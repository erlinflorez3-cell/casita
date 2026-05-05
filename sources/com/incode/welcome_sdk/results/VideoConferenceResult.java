package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoConferenceResult extends BaseResult {
    public static final int $stable = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoConferenceResult(ResultCode resultCode) {
        this(resultCode, null, 2, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ VideoConferenceResult(ResultCode resultCode, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoConferenceResult(ResultCode resultCode, Throwable th) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "VideoConferenceResult{resultCode=" + this.resultCode + "}";
    }
}
