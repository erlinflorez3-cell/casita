package com.incode.welcome_sdk.results;

import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SelfieScanResult extends BaseResult {
    public static final int STATUS_CLOSED_EYES_DETECTED = 11;
    public static final int STATUS_FACE_NOT_FOUND = 4;
    public static final int STATUS_FACE_TOO_SMALL = 5;
    public static final int STATUS_GENERIC_ERROR = 7;
    public static final int STATUS_HEAD_COVER_DETECTED = 12;
    public static final int STATUS_INSUFFICIENT_PHOTO_QUALITY = 6;
    public static final int STATUS_LENSES_DETECTED = 1;
    public static final int STATUS_MASK_DETECTED = 10;
    public static final int STATUS_NO_RESULT = 9;
    public static final int STATUS_OK = 0;
    public static final int STATUS_SPOOF_DETECTED = 13;
    public static final int STATUS_TOO_BLURRY = 3;
    public static final int STATUS_TOO_DARK = 2;
    public final String croppedSelfieImgPath;
    public final FaceLoginResult faceLoginResult;
    public final double faceRecognitionConfidence;
    public final String fullFrameSelfieBase64;
    public final String fullFrameSelfieEncryptedBase64;
    public final String fullFrameSelfieImgPath;
    public final Boolean hasFaceMask;
    public Integer idealCaptureEnvironmentTestResult;
    public final Boolean isFaceMatched;
    public final Boolean isSpoofAttempt;
    public final double maskConfidence;
    public String metadata;
    public final String selfieBase64;
    public final String selfieEncryptedBase64;
    public final double spoofConfidence;
    public final int status;
    public String videoFilePath;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode) {
        this(resultCode, null, null, 0.0d, null, 0.0d, null, 0.0d, null, null, null, 0, null, null, null, null, null, null, null, null, 1048574, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th) {
        this(resultCode, th, null, 0.0d, null, 0.0d, null, 0.0d, null, null, null, 0, null, null, null, null, null, null, null, null, 1048572, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats) {
        this(resultCode, th, deviceStats, 0.0d, null, 0.0d, null, 0.0d, null, null, null, 0, null, null, null, null, null, null, null, null, 1048568, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2) {
        this(resultCode, th, deviceStats, d2, null, 0.0d, null, 0.0d, null, null, null, 0, null, null, null, null, null, null, null, null, 1048560, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool) {
        this(resultCode, th, deviceStats, d2, bool, 0.0d, null, 0.0d, null, null, null, 0, null, null, null, null, null, null, null, null, 1048544, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3) {
        this(resultCode, th, deviceStats, d2, bool, d3, null, 0.0d, null, null, null, 0, null, null, null, null, null, null, null, null, 1048512, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, 0.0d, null, null, null, 0, null, null, null, null, null, null, null, null, 1048448, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, null, null, null, 0, null, null, null, null, null, null, null, null, 1048320, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, bool3, null, null, 0, null, null, null, null, null, null, null, null, 1048064, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, bool3, str, null, 0, null, null, null, null, null, null, null, null, 1047552, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str, String str2) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, bool3, str, str2, 0, null, null, null, null, null, null, null, null, 1046528, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str, String str2, int i2) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, bool3, str, str2, i2, null, null, null, null, null, null, null, null, 1044480, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str, String str2, int i2, String str3) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, bool3, str, str2, i2, str3, null, null, null, null, null, null, null, 1040384, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str, String str2, int i2, String str3, String str4) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, bool3, str, str2, i2, str3, str4, null, null, null, null, null, null, 1032192, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str, String str2, int i2, String str3, String str4, String str5) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, bool3, str, str2, i2, str3, str4, str5, null, null, null, null, null, 1015808, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str, String str2, int i2, String str3, String str4, String str5, String str6) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, bool3, str, str2, i2, str3, str4, str5, str6, null, null, null, null, 983040, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str, String str2, int i2, String str3, String str4, String str5, String str6, FaceLoginResult faceLoginResult) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, bool3, str, str2, i2, str3, str4, str5, str6, faceLoginResult, null, null, null, 917504, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str, String str2, int i2, String str3, String str4, String str5, String str6, FaceLoginResult faceLoginResult, Integer num) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, bool3, str, str2, i2, str3, str4, str5, str6, faceLoginResult, num, null, null, 786432, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str, String str2, int i2, String str3, String str4, String str5, String str6, FaceLoginResult faceLoginResult, Integer num, String str7) {
        this(resultCode, th, deviceStats, d2, bool, d3, bool2, d4, bool3, str, str2, i2, str3, str4, str5, str6, faceLoginResult, num, str7, null, 524288, null);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
    }

    @Deprecated(message = "Not used anymore")
    public static /* synthetic */ void getFaceRecognitionConfidence$annotations() {
    }

    @Deprecated(message = "This info is part of metadata", replaceWith = @ReplaceWith(expression = "SelfieScanResult.metadata", imports = {}))
    public static /* synthetic */ void getIdealCaptureEnvironmentTestResult$annotations() {
    }

    @Deprecated(message = "Behaves as an analog to hasFaceMask. Please use hasFaceMask to check if the person is wearing a mask or not.")
    public static /* synthetic */ void getMaskConfidence$annotations() {
    }

    @Deprecated(message = "Not used anymore; Use fullFrameSelfieBase64 instead")
    public static /* synthetic */ void getSelfieEncryptedBase64$annotations() {
    }

    @Deprecated(message = "Not used anymore")
    public static /* synthetic */ void getSpoofConfidence$annotations() {
    }

    @Deprecated(message = "Not used anymore. Please use FaceLoginResult success field instead.")
    public static /* synthetic */ void isFaceMatched$annotations() {
    }

    public /* synthetic */ SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str, String str2, int i2, String str3, String str4, String str5, String str6, FaceLoginResult faceLoginResult, Integer num, String str7, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(resultCode, (i3 & 2) != 0 ? null : th, (i3 & 4) != 0 ? null : deviceStats, (i3 & 8) != 0 ? -1.0d : d2, (i3 & 16) != 0 ? null : bool, (i3 & 32) != 0 ? -1.0d : d3, (i3 & 64) != 0 ? null : bool2, (i3 & 128) == 0 ? d4 : -1.0d, (i3 & 256) != 0 ? null : bool3, (i3 & 512) != 0 ? null : str, (i3 & 1024) != 0 ? null : str2, (i3 & 2048) != 0 ? 9 : i2, (i3 & 4096) != 0 ? null : str3, (i3 & 8192) != 0 ? null : str4, (i3 & 16384) != 0 ? null : str5, (32768 & i3) != 0 ? null : str6, (65536 & i3) != 0 ? null : faceLoginResult, (131072 & i3) != 0 ? null : num, (262144 & i3) != 0 ? null : str7, (i3 & 524288) != 0 ? null : str8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieScanResult(ResultCode resultCode, Throwable th, DeviceStats deviceStats, double d2, Boolean bool, double d3, Boolean bool2, double d4, Boolean bool3, String str, String str2, int i2, String str3, String str4, String str5, String str6, FaceLoginResult faceLoginResult, Integer num, String str7, String str8) {
        super(resultCode, th, deviceStats);
        Intrinsics.checkNotNullParameter(resultCode, "resultCode");
        this.faceRecognitionConfidence = d2;
        this.isFaceMatched = bool;
        this.spoofConfidence = d3;
        this.isSpoofAttempt = bool2;
        this.maskConfidence = d4;
        this.hasFaceMask = bool3;
        this.croppedSelfieImgPath = str;
        this.fullFrameSelfieImgPath = str2;
        this.status = i2;
        this.selfieEncryptedBase64 = str3;
        this.selfieBase64 = str4;
        this.fullFrameSelfieEncryptedBase64 = str5;
        this.fullFrameSelfieBase64 = str6;
        this.faceLoginResult = faceLoginResult;
        this.idealCaptureEnvironmentTestResult = num;
        this.metadata = str7;
        this.videoFilePath = str8;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.incode.welcome_sdk.results.BaseResult
    public final String toString() {
        return "SelfieScanResult(resultCode=" + this.resultCode + ", error=" + this.error + ", deviceStats=" + this.deviceStats + ", faceRecognitionConfidence=" + this.faceRecognitionConfidence + ", isFaceMatched=" + this.isFaceMatched + ", spoofConfidence=" + this.spoofConfidence + ", isSpoofAttempt=" + this.isSpoofAttempt + ", maskConfidence=" + this.maskConfidence + ", hasFaceMask=" + this.hasFaceMask + ", croppedSelfieImgPath=" + this.croppedSelfieImgPath + ", fullFrameSelfieImgPath=" + this.fullFrameSelfieImgPath + ", status=" + this.status + ", faceLoginResult=" + this.faceLoginResult + ", metadata=" + this.metadata + ", videoFilePath=" + this.videoFilePath + ")";
    }
}
