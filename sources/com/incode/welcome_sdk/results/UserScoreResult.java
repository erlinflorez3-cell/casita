package com.incode.welcome_sdk.results;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.incode.welcome_sdk.data.remote.beans.FacialRecognitionResults;
import com.incode.welcome_sdk.data.remote.beans.GovernmentValidationResults;
import com.incode.welcome_sdk.data.remote.beans.IdVerificationResults;
import com.incode.welcome_sdk.data.remote.beans.LivenessCheckResults;
import com.incode.welcome_sdk.data.remote.beans.ResultsStatus;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class UserScoreResult extends BaseResult {
    public static final int $stable = 8;
    public Map<String, ? extends Object> extendedUserScoreJsonData;
    public FacialRecognitionResults facialRecognitionResults;
    public GovernmentValidationResults governmentValidationResults;
    public IdVerificationResults idVerificationResults;
    public LivenessCheckResults livenessCheckResults;
    public String overallScore;
    public ResultsStatus overallStatus;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserScoreResult(ResultCode resultCode) {
        this(resultCode, null, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserScoreResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserScoreResult(ResultCode resultCode, Throwable th, String str) {
        this(resultCode, th, str, null, null, null, null, null, null, 504, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserScoreResult(ResultCode resultCode, Throwable th, String str, ResultsStatus resultsStatus) {
        this(resultCode, th, str, resultsStatus, null, null, null, null, null, 496, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserScoreResult(ResultCode resultCode, Throwable th, String str, ResultsStatus resultsStatus, IdVerificationResults idVerificationResults) {
        this(resultCode, th, str, resultsStatus, idVerificationResults, null, null, null, null, 480, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserScoreResult(ResultCode resultCode, Throwable th, String str, ResultsStatus resultsStatus, IdVerificationResults idVerificationResults, LivenessCheckResults livenessCheckResults) {
        this(resultCode, th, str, resultsStatus, idVerificationResults, livenessCheckResults, null, null, null, 448, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserScoreResult(ResultCode resultCode, Throwable th, String str, ResultsStatus resultsStatus, IdVerificationResults idVerificationResults, LivenessCheckResults livenessCheckResults, FacialRecognitionResults facialRecognitionResults) {
        this(resultCode, th, str, resultsStatus, idVerificationResults, livenessCheckResults, facialRecognitionResults, null, null, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserScoreResult(ResultCode resultCode, Throwable th, String str, ResultsStatus resultsStatus, IdVerificationResults idVerificationResults, LivenessCheckResults livenessCheckResults, FacialRecognitionResults facialRecognitionResults, GovernmentValidationResults governmentValidationResults) {
        this(resultCode, th, str, resultsStatus, idVerificationResults, livenessCheckResults, facialRecognitionResults, governmentValidationResults, null, 256, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    public /* synthetic */ UserScoreResult(ResultCode resultCode, Throwable th, String str, ResultsStatus resultsStatus, IdVerificationResults idVerificationResults, LivenessCheckResults livenessCheckResults, FacialRecognitionResults facialRecognitionResults, GovernmentValidationResults governmentValidationResults, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : resultsStatus, (i2 & 16) != 0 ? null : idVerificationResults, (i2 & 32) != 0 ? null : livenessCheckResults, (i2 & 64) != 0 ? null : facialRecognitionResults, (i2 & 128) == 0 ? governmentValidationResults : null, (i2 & 256) != 0 ? new HashMap() : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserScoreResult(ResultCode resultCode, Throwable th, String str, ResultsStatus resultsStatus, IdVerificationResults idVerificationResults, LivenessCheckResults livenessCheckResults, FacialRecognitionResults facialRecognitionResults, GovernmentValidationResults governmentValidationResults, Map<String, ? extends Object> extendedUserScoreJsonData) {
        super(resultCode, th, null, 4, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        Intrinsics.checkNotNullParameter(extendedUserScoreJsonData, "extendedUserScoreJsonData");
        this.overallScore = str;
        this.overallStatus = resultsStatus;
        this.idVerificationResults = idVerificationResults;
        this.livenessCheckResults = livenessCheckResults;
        this.facialRecognitionResults = facialRecognitionResults;
        this.governmentValidationResults = governmentValidationResults;
        this.extendedUserScoreJsonData = extendedUserScoreJsonData;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "UserScore{overallScore='" + this.overallScore + "', overallStatus=" + this.overallStatus + ", idVerificationResults=" + this.idVerificationResults + ", livenessCheckResults=" + this.livenessCheckResults + ", facialRecognitionResults=" + this.facialRecognitionResults + ", governmentValidationResults=" + this.governmentValidationResults + ", extendedUserScoreJsonData=" + this.extendedUserScoreJsonData + "}";
    }
}
