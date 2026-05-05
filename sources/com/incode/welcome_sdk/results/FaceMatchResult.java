package com.incode.welcome_sdk.results;

import com.incode.welcome_sdk.IdCategory;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FaceMatchResult extends BaseResult {
    public static final int $stable = 8;
    public final double confidence;
    public final String existingInterviewId;
    public final List<IdCategory> idCategories;
    public final boolean isExistingUser;
    public final boolean isFaceMatched;
    public final boolean isNameMatched;
    public final double nfcVsIdConfidence;
    public final double nfcVsSelfieConfidence;
    public final double secondIdConfidence;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceMatchResult(ResultCode resultCode) {
        this(resultCode, null, 0.0d, 0.0d, 0.0d, 0.0d, false, null, false, null, false, 2046, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceMatchResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, 0.0d, 0.0d, 0.0d, 0.0d, false, null, false, null, false, 2044, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceMatchResult(ResultCode resultCode, Throwable th, double d2) {
        this(resultCode, th, d2, 0.0d, 0.0d, 0.0d, false, null, false, null, false, 2040, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceMatchResult(ResultCode resultCode, Throwable th, double d2, double d3) {
        this(resultCode, th, d2, d3, 0.0d, 0.0d, false, null, false, null, false, 2032, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceMatchResult(ResultCode resultCode, Throwable th, double d2, double d3, double d4) {
        this(resultCode, th, d2, d3, d4, 0.0d, false, null, false, null, false, 2016, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceMatchResult(ResultCode resultCode, Throwable th, double d2, double d3, double d4, double d5) {
        this(resultCode, th, d2, d3, d4, d5, false, null, false, null, false, 1984, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceMatchResult(ResultCode resultCode, Throwable th, double d2, double d3, double d4, double d5, boolean z2) {
        this(resultCode, th, d2, d3, d4, d5, z2, null, false, null, false, 1920, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceMatchResult(ResultCode resultCode, Throwable th, double d2, double d3, double d4, double d5, boolean z2, List<? extends IdCategory> idCategories) {
        this(resultCode, th, d2, d3, d4, d5, z2, idCategories, false, null, false, 1792, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(idCategories, "idCategories");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceMatchResult(ResultCode resultCode, Throwable th, double d2, double d3, double d4, double d5, boolean z2, List<? extends IdCategory> idCategories, boolean z3) {
        this(resultCode, th, d2, d3, d4, d5, z2, idCategories, z3, null, false, 1536, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(idCategories, "idCategories");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaceMatchResult(ResultCode resultCode, Throwable th, double d2, double d3, double d4, double d5, boolean z2, List<? extends IdCategory> idCategories, boolean z3, String str) {
        this(resultCode, th, d2, d3, d4, d5, z2, idCategories, z3, str, false, 1024, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(idCategories, "idCategories");
    }

    public /* synthetic */ FaceMatchResult(ResultCode resultCode, Throwable th, double d2, double d3, double d4, double d5, boolean z2, List list, boolean z3, String str, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? 0.0d : d2, (i2 & 8) != 0 ? 0.0d : d3, (i2 & 16) != 0 ? 0.0d : d4, (i2 & 32) == 0 ? d5 : 0.0d, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? CollectionsKt.emptyList() : list, (i2 & 256) != 0 ? false : z3, (i2 & 512) == 0 ? str : null, (i2 & 1024) == 0 ? z4 : false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaceMatchResult(ResultCode resultCode, Throwable th, double d2, double d3, double d4, double d5, boolean z2, List<? extends IdCategory> idCategories, boolean z3, String str, boolean z4) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(idCategories, "idCategories");
        this.confidence = d2;
        this.secondIdConfidence = d3;
        this.nfcVsSelfieConfidence = d4;
        this.nfcVsIdConfidence = d5;
        this.isFaceMatched = z2;
        this.idCategories = idCategories;
        this.isExistingUser = z3;
        this.existingInterviewId = str;
        this.isNameMatched = z4;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "FaceMatchResult{confidence=" + this.confidence + ", secondIdConfidence=" + this.secondIdConfidence + ", nfcVsSelfieConfidence=" + this.nfcVsSelfieConfidence + ", nfcVsIdConfidence=" + this.nfcVsIdConfidence + ", faceMatched=" + this.isFaceMatched + ", idCategory=" + CollectionsKt.joinToString$default(this.idCategories, null, null, null, 0, null, null, 63, null) + ", existingUser=" + this.isExistingUser + ", existingInterviewId='" + this.existingInterviewId + "', nameMatched=" + this.isNameMatched + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.incode.welcome_sdk.results.FaceMatchResult");
        FaceMatchResult faceMatchResult = (FaceMatchResult) obj;
        return this.confidence == faceMatchResult.confidence && this.secondIdConfidence == faceMatchResult.secondIdConfidence && this.nfcVsSelfieConfidence == faceMatchResult.nfcVsSelfieConfidence && this.nfcVsIdConfidence == faceMatchResult.nfcVsIdConfidence && this.isFaceMatched == faceMatchResult.isFaceMatched && Intrinsics.areEqual(this.idCategories, faceMatchResult.idCategories) && this.isExistingUser == faceMatchResult.isExistingUser && Intrinsics.areEqual(this.existingInterviewId, faceMatchResult.existingInterviewId) && this.isNameMatched == faceMatchResult.isNameMatched;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((Double.hashCode(this.confidence) * 31) + Double.hashCode(this.secondIdConfidence)) * 31) + Double.hashCode(this.nfcVsSelfieConfidence)) * 31) + Double.hashCode(this.nfcVsIdConfidence)) * 31) + Boolean.hashCode(this.isFaceMatched)) * 31) + this.idCategories.hashCode()) * 31) + Boolean.hashCode(this.isExistingUser)) * 31;
        String str = this.existingInterviewId;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isNameMatched);
    }
}
