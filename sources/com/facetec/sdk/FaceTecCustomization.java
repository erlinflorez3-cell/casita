package com.facetec.sdk;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceTecCustomization {
    public static int activityThemeId = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static HashMap<aq, String> f2848f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static HashMap<az, String> f2849h = null;
    public static String overrideResultScreenSuccessMessage = null;
    boolean B;
    FaceTecOverlayCustomization C;
    FaceTecIDScanCustomization Code;
    FaceTecGuidanceCustomization D;
    FaceTecResultScreenCustomization F;
    boolean I;
    FaceTecFeedbackCustomization L;
    FaceTecFrameCustomization S;
    FaceTecOCRConfirmationCustomization V;
    boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    FaceTecExitAnimationStyle f2850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    FaceTecExitAnimationStyle f2851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    FaceTecOvalCustomization f2852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    FaceTecCancelButtonCustomization f2853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Map<String, String> f2854e;
    public int exitAnimationSuccessResourceID;
    public int exitAnimationUnsuccessResourceID;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private FaceTecSessionTimerCustomization f2855j;
    public FaceTecSecurityWatermarkImage securityWatermarkImage;
    public FaceTecVocalGuidanceCustomization vocalGuidanceCustomization;

    public FaceTecCustomization() {
        this(new HashMap());
    }

    public FaceTecCustomization(Map<String, String> map) {
        this.Z = true;
        this.B = false;
        this.I = false;
        this.S = new FaceTecFrameCustomization();
        this.L = new FaceTecFeedbackCustomization();
        this.f2852c = new FaceTecOvalCustomization();
        this.f2853d = new FaceTecCancelButtonCustomization();
        this.D = new FaceTecGuidanceCustomization();
        this.F = new FaceTecResultScreenCustomization();
        this.C = new FaceTecOverlayCustomization();
        this.Code = new FaceTecIDScanCustomization();
        this.V = new FaceTecOCRConfirmationCustomization();
        this.f2855j = new FaceTecSessionTimerCustomization();
        this.f2851b = FaceTecExitAnimationStyle.RIPPLE_OUT;
        this.f2850a = FaceTecExitAnimationStyle.NONE;
        this.exitAnimationUnsuccessResourceID = -1;
        this.exitAnimationSuccessResourceID = -1;
        this.f2854e = map;
        this.securityWatermarkImage = FaceTecSecurityWatermarkImage.FACETEC_ZOOM;
        this.vocalGuidanceCustomization = new FaceTecVocalGuidanceCustomization();
    }

    @Deprecated
    public static void setIDScanResultScreenMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        bu.I(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", "setIDScanResultScreenMessageOverrides"));
        HashMap<aq, String> map = new HashMap<>();
        f2848f = map;
        map.put(aq.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str5);
        f2848f.put(aq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str6);
        f2848f.put(aq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str7);
        f2848f.put(aq.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f2848f.put(aq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f2848f.put(aq.IDSCAN_SUCCESS_BACK_SIDE, str3);
        f2848f.put(aq.IDSCAN_SUCCESS_USER_CONFIRMATION, str4);
    }

    @Deprecated
    public static void setIDScanResultScreenMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        bu.I(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", "setIDScanResultScreenMessageOverrides"));
        HashMap<aq, String> map = new HashMap<>();
        f2848f = map;
        map.put(aq.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str6);
        f2848f.put(aq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str7);
        f2848f.put(aq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str8);
        f2848f.put(aq.IDSCAN_SKIP_OR_ERROR_NFC, str9);
        f2848f.put(aq.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f2848f.put(aq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f2848f.put(aq.IDSCAN_SUCCESS_BACK_SIDE, str3);
        f2848f.put(aq.IDSCAN_SUCCESS_USER_CONFIRMATION, str4);
        f2848f.put(aq.IDSCAN_SUCCESS_NFC, str5);
    }

    public static void setIDScanResultScreenMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        HashMap<aq, String> map = new HashMap<>();
        f2848f = map;
        map.put(aq.IDSCAN_RETRY_FACE_DID_NOT_MATCH, str6);
        f2848f.put(aq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE, str7);
        f2848f.put(aq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH, str8);
        f2848f.put(aq.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED, str9);
        f2848f.put(aq.IDSCAN_SKIP_OR_ERROR_NFC, str10);
        f2848f.put(aq.IDSCAN_SUCCESS_FRONT_SIDE, str);
        f2848f.put(aq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT, str2);
        f2848f.put(aq.IDSCAN_SUCCESS_BACK_SIDE, str3);
        f2848f.put(aq.IDSCAN_SUCCESS_USER_CONFIRMATION, str4);
        f2848f.put(aq.IDSCAN_SUCCESS_NFC, str5);
    }

    @Deprecated
    public static void setIDScanUploadMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        bu.I(String.format("FaceTec SDK Deprecated Method Warning:  The %s function with these arguments is deprecated, please use the updated overload in order to customize all available strings.", "setIDScanUploadMessageOverrides"));
        HashMap<az, String> map = new HashMap<>();
        f2849h = map;
        map.put(az.IDSCAN_FRONT_SIDE_UPLOAD_STARTED, str);
        f2849h.put(az.IDSCAN_FRONT_SIDE_STILL_UPLOADING, str2);
        f2849h.put(az.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str3);
        f2849h.put(az.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str4);
        f2849h.put(az.IDSCAN_BACK_SIDE_UPLOAD_STARTED, str5);
        f2849h.put(az.IDSCAN_BACK_SIDE_STILL_UPLOADING, str6);
        f2849h.put(az.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str7);
        f2849h.put(az.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str8);
        f2849h.put(az.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_STARTED, str9);
        f2849h.put(az.IDSCAN_USER_CONFIRMED_INFO_STILL_UPLOADING, str10);
        f2849h.put(az.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_RESPONSE, str11);
        f2849h.put(az.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_PROCESSING, str12);
    }

    public static void setIDScanUploadMessageOverrides(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        HashMap<az, String> map = new HashMap<>();
        f2849h = map;
        map.put(az.IDSCAN_FRONT_SIDE_UPLOAD_STARTED, str);
        f2849h.put(az.IDSCAN_FRONT_SIDE_STILL_UPLOADING, str2);
        f2849h.put(az.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str3);
        f2849h.put(az.IDSCAN_FRONT_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str4);
        f2849h.put(az.IDSCAN_BACK_SIDE_UPLOAD_STARTED, str5);
        f2849h.put(az.IDSCAN_BACK_SIDE_STILL_UPLOADING, str6);
        f2849h.put(az.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_RESPONSE, str7);
        f2849h.put(az.IDSCAN_BACK_SIDE_UPLOAD_COMPLETE_AWAITING_PROCESSING, str8);
        f2849h.put(az.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_STARTED, str9);
        f2849h.put(az.IDSCAN_USER_CONFIRMED_INFO_STILL_UPLOADING, str10);
        f2849h.put(az.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_RESPONSE, str11);
        f2849h.put(az.IDSCAN_USER_CONFIRMED_INFO_UPLOAD_COMPLETE_AWAITING_PROCESSING, str12);
        f2849h.put(az.NFC_UPLOAD_STARTED, str13);
        f2849h.put(az.NFC_STILL_UPLOADING, str14);
        f2849h.put(az.NFC_UPLOAD_COMPLETE_AWAITING_RESPONSE, str15);
        f2849h.put(az.NFC_UPLOAD_COMPLETE_AWAITING_PROCESSING, str16);
    }

    public final FaceTecCancelButtonCustomization getCancelButtonCustomization() {
        return this.f2853d;
    }

    public final FaceTecExitAnimationStyle getExitAnimationSuccessCustom() {
        return this.f2851b;
    }

    public final FaceTecExitAnimationStyle getExitAnimationUnsuccessCustom() {
        return this.f2850a;
    }

    public final FaceTecFeedbackCustomization getFeedbackCustomization() {
        return this.L;
    }

    public final FaceTecFrameCustomization getFrameCustomization() {
        return this.S;
    }

    public final FaceTecGuidanceCustomization getGuidanceCustomization() {
        return this.D;
    }

    public final FaceTecIDScanCustomization getIdScanCustomization() {
        return this.Code;
    }

    public final FaceTecOCRConfirmationCustomization getOcrConfirmationCustomization() {
        return this.V;
    }

    public final FaceTecOvalCustomization getOvalCustomization() {
        return this.f2852c;
    }

    public final FaceTecOverlayCustomization getOverlayCustomization() {
        return this.C;
    }

    public final FaceTecResultScreenCustomization getResultScreenCustomization() {
        return this.F;
    }

    public final FaceTecSessionTimerCustomization getSessionTimerCustomization() {
        return this.f2855j;
    }

    public final void setCancelButtonCustomization(FaceTecCancelButtonCustomization faceTecCancelButtonCustomization) {
        if (faceTecCancelButtonCustomization == null) {
            faceTecCancelButtonCustomization = new FaceTecCancelButtonCustomization();
        }
        this.f2853d = faceTecCancelButtonCustomization;
    }

    public final void setExitAnimationSuccessCustom(FaceTecExitAnimationStyle faceTecExitAnimationStyle) {
        if (faceTecExitAnimationStyle == null) {
            faceTecExitAnimationStyle = FaceTecExitAnimationStyle.CIRCLE_FADE;
        }
        this.f2851b = faceTecExitAnimationStyle;
        FaceTecExitAnimationStyle faceTecExitAnimationStyle2 = FaceTecExitAnimationStyle.CIRCLE_FADE;
    }

    public final void setExitAnimationUnsuccessCustom(FaceTecExitAnimationStyle faceTecExitAnimationStyle) {
        if (faceTecExitAnimationStyle == null) {
            faceTecExitAnimationStyle = FaceTecExitAnimationStyle.CIRCLE_FADE;
        }
        this.f2850a = faceTecExitAnimationStyle;
        FaceTecExitAnimationStyle faceTecExitAnimationStyle2 = FaceTecExitAnimationStyle.CIRCLE_FADE;
    }

    public final void setFeedbackCustomization(FaceTecFeedbackCustomization faceTecFeedbackCustomization) {
        if (faceTecFeedbackCustomization == null) {
            faceTecFeedbackCustomization = new FaceTecFeedbackCustomization();
        }
        this.L = faceTecFeedbackCustomization;
    }

    public final void setFrameCustomization(FaceTecFrameCustomization faceTecFrameCustomization) {
        if (faceTecFrameCustomization == null) {
            faceTecFrameCustomization = new FaceTecFrameCustomization();
        }
        this.S = faceTecFrameCustomization;
    }

    public final void setGuidanceCustomization(FaceTecGuidanceCustomization faceTecGuidanceCustomization) {
        if (faceTecGuidanceCustomization == null) {
            faceTecGuidanceCustomization = new FaceTecGuidanceCustomization();
        }
        this.D = faceTecGuidanceCustomization;
    }

    public final void setIdScanCustomization(FaceTecIDScanCustomization faceTecIDScanCustomization) {
        if (faceTecIDScanCustomization == null) {
            faceTecIDScanCustomization = new FaceTecIDScanCustomization();
        }
        this.Code = faceTecIDScanCustomization;
    }

    public final void setOcrConfirmationCustomization(FaceTecOCRConfirmationCustomization faceTecOCRConfirmationCustomization) {
        if (faceTecOCRConfirmationCustomization == null) {
            faceTecOCRConfirmationCustomization = new FaceTecOCRConfirmationCustomization();
        }
        this.V = faceTecOCRConfirmationCustomization;
    }

    public final void setOvalCustomization(FaceTecOvalCustomization faceTecOvalCustomization) {
        if (faceTecOvalCustomization == null) {
            faceTecOvalCustomization = new FaceTecOvalCustomization();
        }
        this.f2852c = faceTecOvalCustomization;
    }

    public final void setOverlayCustomization(FaceTecOverlayCustomization faceTecOverlayCustomization) {
        if (faceTecOverlayCustomization == null) {
            faceTecOverlayCustomization = new FaceTecOverlayCustomization();
        }
        this.C = faceTecOverlayCustomization;
    }

    public final void setResultScreenCustomization(FaceTecResultScreenCustomization faceTecResultScreenCustomization) {
        if (faceTecResultScreenCustomization == null) {
            faceTecResultScreenCustomization = new FaceTecResultScreenCustomization();
        }
        this.F = faceTecResultScreenCustomization;
    }

    public final void setSessionTimerCustomization(FaceTecSessionTimerCustomization faceTecSessionTimerCustomization) {
        if (faceTecSessionTimerCustomization == null) {
            faceTecSessionTimerCustomization = new FaceTecSessionTimerCustomization();
        }
        this.f2855j = faceTecSessionTimerCustomization;
    }
}
