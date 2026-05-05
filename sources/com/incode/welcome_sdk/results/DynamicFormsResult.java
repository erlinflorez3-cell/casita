package com.incode.welcome_sdk.results;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicFormsResult extends BaseResult {
    public static final int $stable = 8;
    private final List<DynamicFormQuestionnaireModel> answers;
    public final boolean isSuccess;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicFormsResult(ResultCode resultCode) {
        this(resultCode, null, false, null, 14, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicFormsResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, false, null, 12, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicFormsResult(ResultCode resultCode, Throwable th, boolean z2) {
        this(resultCode, th, z2, null, 8, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ DynamicFormsResult(ResultCode resultCode, Throwable th, boolean z2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? null : list);
    }

    public final List<DynamicFormQuestionnaireModel> getAnswers() {
        return this.answers;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicFormsResult(ResultCode resultCode, Throwable th, boolean z2, List<DynamicFormQuestionnaireModel> list) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.isSuccess = z2;
        this.answers = list;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "DynamicFormsResult{isSuccess='" + this.isSuccess + "', resultCode=" + this.resultCode + ", answers=" + this.answers + ", error=" + this.error + "}";
    }
}
