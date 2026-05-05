package com.incode.welcome_sdk.results;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieResult extends BaseResult {
    public static final int $stable = 8;
    private String audioFilePath;
    private final ResultCode code;
    private String documentImagePath;
    private String idBackImagePath;
    private String idFrontImagePath;
    private String selfieImagePath;
    private String videoFilePath;
    private String voiceConsentSelfiePath;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSelfieResult(ResultCode code) {
        this(code, null, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
        Intrinsics.checkNotNullParameter(code, "code");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSelfieResult(ResultCode code, Throwable th) {
        this(code, th, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        Intrinsics.checkNotNullParameter(code, "code");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSelfieResult(ResultCode code, Throwable th, String str) {
        this(code, th, str, null, null, null, null, null, null, 504, null);
        Intrinsics.checkNotNullParameter(code, "code");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSelfieResult(ResultCode code, Throwable th, String str, String str2) {
        this(code, th, str, str2, null, null, null, null, null, 496, null);
        Intrinsics.checkNotNullParameter(code, "code");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSelfieResult(ResultCode code, Throwable th, String str, String str2, String str3) {
        this(code, th, str, str2, str3, null, null, null, null, 480, null);
        Intrinsics.checkNotNullParameter(code, "code");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSelfieResult(ResultCode code, Throwable th, String str, String str2, String str3, String str4) {
        this(code, th, str, str2, str3, str4, null, null, null, 448, null);
        Intrinsics.checkNotNullParameter(code, "code");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSelfieResult(ResultCode code, Throwable th, String str, String str2, String str3, String str4, String str5) {
        this(code, th, str, str2, str3, str4, str5, null, null, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, null);
        Intrinsics.checkNotNullParameter(code, "code");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoSelfieResult(ResultCode code, Throwable th, String str, String str2, String str3, String str4, String str5, String str6) {
        this(code, th, str, str2, str3, str4, str5, str6, null, 256, null);
        Intrinsics.checkNotNullParameter(code, "code");
    }

    public /* synthetic */ VideoSelfieResult(ResultCode resultCode, Throwable th, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i2 & 2) != 0 ? null : th, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) == 0 ? str7 : null);
    }

    public final ResultCode getCode() {
        return this.code;
    }

    public final String getVideoFilePath() {
        return this.videoFilePath;
    }

    public final void setVideoFilePath(String str) {
        this.videoFilePath = str;
    }

    public final String getAudioFilePath() {
        return this.audioFilePath;
    }

    public final void setAudioFilePath(String str) {
        this.audioFilePath = str;
    }

    public final String getSelfieImagePath() {
        return this.selfieImagePath;
    }

    public final void setSelfieImagePath(String str) {
        this.selfieImagePath = str;
    }

    public final String getIdFrontImagePath() {
        return this.idFrontImagePath;
    }

    public final void setIdFrontImagePath(String str) {
        this.idFrontImagePath = str;
    }

    public final String getIdBackImagePath() {
        return this.idBackImagePath;
    }

    public final void setIdBackImagePath(String str) {
        this.idBackImagePath = str;
    }

    public final String getDocumentImagePath() {
        return this.documentImagePath;
    }

    public final void setDocumentImagePath(String str) {
        this.documentImagePath = str;
    }

    public final String getVoiceConsentSelfiePath() {
        return this.voiceConsentSelfiePath;
    }

    public final void setVoiceConsentSelfiePath(String str) {
        this.voiceConsentSelfiePath = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSelfieResult(ResultCode code, Throwable th, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(code, th, null, 4, null);
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.videoFilePath = str;
        this.audioFilePath = str2;
        this.selfieImagePath = str3;
        this.idFrontImagePath = str4;
        this.idBackImagePath = str5;
        this.documentImagePath = str6;
        this.voiceConsentSelfiePath = str7;
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "VideoSelfieResult{resultCode=" + this.code + ", videoFilePath=" + this.videoFilePath + ", audioFilePath=" + this.audioFilePath + ", selfieImagePath=" + this.selfieImagePath + ", idFrontImagePath=" + this.idFrontImagePath + ", idBackImagePath=" + this.idBackImagePath + ", documentImagePath=" + this.documentImagePath + "}";
    }
}
