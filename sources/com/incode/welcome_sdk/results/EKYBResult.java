package com.incode.welcome_sdk.results;

import com.incode.welcome_sdk.data.remote.beans.j;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class EKYBResult extends BaseResult {
    public static final int $stable = 8;
    public final List<j> resultTests;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EKYBResult(ResultCode resultCode) {
        this(resultCode, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ EKYBResult(ResultCode resultCode, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EKYBResult(ResultCode resultCode, List<j> resultTests) {
        super(resultCode, null, null, 6, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(resultTests, "resultTests");
        this.resultTests = resultTests;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "EKYBResult{resultTests=" + this.resultTests + "}";
    }
}
