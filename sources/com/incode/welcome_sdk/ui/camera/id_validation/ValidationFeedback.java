package com.incode.welcome_sdk.ui.camera.id_validation;

import com.incode.welcome_sdk.R;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ValidationFeedback {
    public static final ValidationFeedback A;
    public static final ValidationFeedback B;
    public static final ValidationFeedback C;
    public static final ValidationFeedback D;
    public static final ValidationFeedback E;
    public static final ValidationFeedback F;
    public static final ValidationFeedback G;
    public static final ValidationFeedback H;
    public static final ValidationFeedback I;
    private static final /* synthetic */ EnumEntries O;
    private static int Q = 1;
    private static int R = 0;
    private static final /* synthetic */ ValidationFeedback[] S;
    private static int U = 0;
    private static int X = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ValidationFeedback f11696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ValidationFeedback f11697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ValidationFeedback f11698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ValidationFeedback f11699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ValidationFeedback f11700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ValidationFeedback f11701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ValidationFeedback f11702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ValidationFeedback f11703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ValidationFeedback f11704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ValidationFeedback f11705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ValidationFeedback f11706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ValidationFeedback f11707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ValidationFeedback f11708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ValidationFeedback f11709n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ValidationFeedback f11710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ValidationFeedback f11711p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ValidationFeedback f11712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ValidationFeedback f11713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ValidationFeedback f11714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ValidationFeedback f11715t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ValidationFeedback f11716u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ValidationFeedback f11717v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ValidationFeedback f11718w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ValidationFeedback f11719x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ValidationFeedback f11720y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ValidationFeedback f11721z;
    private int J;
    private int K;
    private int L;
    private boolean M;
    private int N;
    private boolean P;

    private ValidationFeedback(String str, int i2, int i3, int i4, int i5, boolean z2, int i6, boolean z3) {
        this.N = i3;
        this.L = i4;
        this.J = i5;
        this.M = z2;
        this.K = i6;
        this.P = z3;
    }

    private /* synthetic */ ValidationFeedback(String str, int i2, int i3, int i4, int i5, boolean z2, int i6, boolean z3, int i7) {
        this(str, i2, i3, i4, (i7 & 4) != 0 ? -1 : i5, (i7 & 8) != 0 ? true : z2, (i7 & 16) != 0 ? 0 : i6, (i7 & 32) == 0 ? z3 : false);
    }

    public final int getDrawableResId() {
        int i2 = 2 % 2;
        int i3 = R + 1;
        int i4 = i3 % 128;
        Q = i4;
        int i5 = i3 % 2;
        int i6 = this.N;
        int i7 = i4 + 61;
        R = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 82 / 0;
        }
        return i6;
    }

    public final void setDrawableResId(int i2) {
        int i3 = 2 % 2;
        int i4 = Q;
        int i5 = i4 + 61;
        R = i5 % 128;
        int i6 = i5 % 2;
        this.N = i2;
        int i7 = i4 + 109;
        R = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getMessageResId() {
        int i2 = 2 % 2;
        int i3 = Q + 79;
        R = i3 % 128;
        if (i3 % 2 == 0) {
            return this.L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setMessageResId(int i2) {
        int i3 = 2 % 2;
        int i4 = Q + 11;
        int i5 = i4 % 128;
        R = i5;
        int i6 = i4 % 2;
        this.L = i2;
        int i7 = i5 + 53;
        Q = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isCancelable() {
        int i2 = 2 % 2;
        int i3 = Q;
        int i4 = i3 + 121;
        R = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.M;
        int i5 = i3 + 47;
        R = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return z2;
    }

    public final void setCancelable(boolean z2) {
        int i2 = 2 % 2;
        int i3 = Q + 51;
        int i4 = i3 % 128;
        R = i4;
        int i5 = i3 % 2;
        this.M = z2;
        int i6 = i4 + 83;
        Q = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getDelayMillis() {
        int i2 = 2 % 2;
        int i3 = Q + 53;
        int i4 = i3 % 128;
        R = i4;
        int i5 = i3 % 2;
        int i6 = this.K;
        int i7 = i4 + 25;
        Q = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final void setDelayMillis(int i2) {
        int i3 = 2 % 2;
        int i4 = Q;
        int i5 = i4 + 115;
        R = i5 % 128;
        int i6 = i5 % 2;
        this.K = i2;
        int i7 = i4 + 19;
        R = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isPersistent() {
        int i2 = 2 % 2;
        int i3 = Q + 55;
        int i4 = i3 % 128;
        R = i4;
        int i5 = i3 % 2;
        boolean z2 = this.P;
        int i6 = i4 + 73;
        Q = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final void setPersistent(boolean z2) {
        int i2 = 2 % 2;
        int i3 = Q + 57;
        R = i3 % 128;
        int i4 = i3 % 2;
        this.P = z2;
        if (i4 != 0) {
            int i5 = 77 / 0;
        }
    }

    static {
        String str = "INFO_SHOW_FRONT";
        f11699d = new ValidationFeedback(str, 0, R.drawable.onboard_sdk_info_show_front, R.string.onboard_sdk_validation_show_front, 0, false, 2000, false, 44);
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        String str2 = "INFO_SHOW_BACK";
        f11698c = new ValidationFeedback(str2, 1, R.drawable.onboard_sdk_info_show_back, R.string.onboard_sdk_validation_show_back, i2, z3, 2000, z2, 44);
        boolean z4 = false;
        boolean z5 = false;
        String str3 = "INFO_SHOW_PASSPORT";
        byte b2 = 0 == true ? 1 : 0;
        f11696a = new ValidationFeedback(str3, 2, R.drawable.onboard_sdk_info_show_passport, R.string.onboard_sdk_validation_show_passport, b2, z5, 2000, z4, 44);
        String str4 = "INFO_FILL_RECTANGLE_WITH_ID";
        f11700e = new ValidationFeedback(str4, 3, R.drawable.onboard_sdk_info_fill_rectangle_with_id, R.string.onboard_sdk_validation_fill_rectangle_with_id, i2, z3, 4000, z2, 36);
        String str5 = "INFO_FILL_RECTANGLE_WITH_PASSPORT";
        byte b3 = 0 == true ? 1 : 0;
        f11697b = new ValidationFeedback(str5, 4, R.drawable.onboard_sdk_info_fill_rectangle_with_passport, R.string.onboard_sdk_validation_fill_rectangle_with_passport, b3, z5, 4000, z4, 36);
        String str6 = "INFO_HOLD_STILL";
        f11705j = new ValidationFeedback(str6, 5, R.drawable.onboard_sdk_info_hold_still, R.string.onboard_sdk_validation_autocapture_hold_still, i2, z3, 0, true, 20);
        String str7 = "INFO_SUCCESS";
        byte b4 = 0 == true ? 1 : 0;
        f11703h = new ValidationFeedback(str7, 6, R.drawable.onboard_sdk_info_success, R.string.onboard_sdk_validation_success, b4, z5, 0, true, 20);
        boolean z6 = false;
        int i3 = 44;
        int i4 = 2000;
        String str8 = "WARN_SHOW_FRONT";
        f11702g = new ValidationFeedback(str8, 7, R.drawable.onboard_sdk_warn_show_front, R.string.onboard_sdk_validation_warn_show_front, i2, z3, i4, z6, i3);
        boolean z7 = false;
        int i5 = 44;
        int i6 = 2000;
        String str9 = "WARN_SHOW_BACK";
        f11704i = new ValidationFeedback(str9, 8, R.drawable.onboard_sdk_warn_show_back, R.string.onboard_sdk_validation_warn_show_back, 0 == true ? 1 : 0, z5, i6, z7, i5);
        String str10 = "WARN_ID_TOO_DARK";
        f11701f = new ValidationFeedback(str10, 9, R.drawable.onboard_sdk_warn_dark, R.string.onboard_sdk_validation_warn_id_too_dark, i2, z3, i4, z6, i3);
        String str11 = "WARN_ID_BLURRED";
        f11707l = new ValidationFeedback(str11, 10, R.drawable.onboard_sdk_warn_out_of_focus, R.string.onboard_sdk_validation_warn_id_out_of_focus, 0 == true ? 1 : 0, z5, i6, z7, i5);
        String str12 = "WARN_ID_GLARE";
        f11709n = new ValidationFeedback(str12, 11, R.drawable.onboard_sdk_warn_glare, R.string.onboard_sdk_validation_warn_id_glare_detected, R.string.onboard_sdk_validation_voice_over_warn_id_glare_detected, z3, i4, z6, 40);
        String str13 = "WARN_FILL_RECTANGLE_WITH_ID";
        f11710o = new ValidationFeedback(str13, 12, R.drawable.onboard_sdk_info_fill_rectangle_with_id, R.string.onboard_sdk_validation_fill_rectangle_with_id, 0 == true ? 1 : 0, z5, i6, z7, i5);
        int i7 = 44;
        int i8 = 0;
        String str14 = "WARN_PASSPORT_TOO_DARK";
        f11706k = new ValidationFeedback(str14, 13, R.drawable.onboard_sdk_warn_dark, R.string.onboard_sdk_validation_warn_passport_too_dark, i8, z3, i4, z6, i7);
        String str15 = "WARN_PASSPORT_BLURRED";
        f11708m = new ValidationFeedback(str15, 14, R.drawable.onboard_sdk_warn_out_of_focus, R.string.onboard_sdk_validation_warn_passport_out_of_focus, 0 == true ? 1 : 0, z5, i6, z7, i5);
        String str16 = "WARN_PASSPORT_GLARE";
        f11715t = new ValidationFeedback(str16, 15, R.drawable.onboard_sdk_warn_glare, R.string.onboard_sdk_validation_warn_passport_glare_detected, i8, z3, i4, z6, i7);
        String str17 = "WARN_FILL_RECTANGLE_WITH_PASSPORT";
        f11713r = new ValidationFeedback(str17, 16, R.drawable.onboard_sdk_info_fill_rectangle_with_passport, R.string.onboard_sdk_validation_fill_rectangle_with_passport, 0 == true ? 1 : 0, z5, i6, z7, i5);
        boolean z8 = true;
        int i9 = 20;
        int i10 = 0;
        String str18 = "INFO_VS_PROCESSING";
        f11714s = new ValidationFeedback(str18, 17, 0, R.string.onboard_sdk_video_selfie_feedback_id_processing, i8, z3, i10, z8, i9);
        int i11 = 36;
        int i12 = 4000;
        String str19 = "ERROR_VS_ID_GENERIC";
        f11712q = new ValidationFeedback(str19, 18, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_feedback_id_scan_failed, 0 == true ? 1 : 0, z5, i12, z7, i11);
        String str20 = "ERROR_VS_FINAL_ID_GENERIC";
        f11711p = new ValidationFeedback(str20, 19, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_final_feedback_id_scan_failed, i8, z3, i10, z8, i9);
        String str21 = "ERROR_VS_ID_TYPE_VERIFICATION";
        f11720y = new ValidationFeedback(str21, 20, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_feedback_id_type_match_failed, 0 == true ? 1 : 0, z5, i12, z7, i11);
        String str22 = "ERROR_VS_FINAL_ID_TYPE_VERIFICATION";
        f11718w = new ValidationFeedback(str22, 21, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_final_feedback_id_type_match_failed, i8, z3, i10, z8, i9);
        String str23 = "ERROR_VS_ID_PHOTO_VERIFICATION";
        f11717v = new ValidationFeedback(str23, 22, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_feedback_id_photo_verification_failed, 0 == true ? 1 : 0, z5, i12, z7, i11);
        String str24 = "ERROR_VS_FINAL_ID_PHOTO_VERIFICATION";
        f11719x = new ValidationFeedback(str24, 23, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_feedback_final_id_photo_verification_failed, i8, z3, i10, z8, i9);
        String str25 = "ERROR_VS_ID_NAME_VERIFICATION";
        f11716u = new ValidationFeedback(str25, 24, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_feedback_id_name_verification_failed, 0 == true ? 1 : 0, z5, i12, z7, i11);
        String str26 = "ERROR_VS_FINAL_VS_ID_NAME_VERIFICATION";
        B = new ValidationFeedback(str26, 25, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_feedback_final_id_name_verification_failed, i8, z3, i10, z8, i9);
        String str27 = "ERROR_VS_PASSPORT_GENERIC";
        C = new ValidationFeedback(str27, 26, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_feedback_passport_scan_failed, 0 == true ? 1 : 0, z5, i12, z7, i11);
        boolean z9 = false;
        int i13 = 36;
        int i14 = 4000;
        String str28 = "ERROR_VS_FINAL_PASSPORT_GENERIC";
        D = new ValidationFeedback(str28, 27, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_final_feedback_passport_scan_failed, i8, z3, i14, z9, i13);
        String str29 = "ERROR_VS_PASSPORT_TYPE_VERIFICATION";
        A = new ValidationFeedback(str29, 28, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_feedback_passport_type_match_failed, 0 == true ? 1 : 0, z5, i12, z7, i11);
        String str30 = "ERROR_VS_FINAL_PASSPORT_TYPE_VERIFICATION";
        f11721z = new ValidationFeedback(str30, 29, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_final_feedback_passport_type_match_failed, i8, z3, i14, z9, i13);
        String str31 = "ERROR_VS_PASSPORT_PHOTO_VERIFICATION";
        E = new ValidationFeedback(str31, 30, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_feedback_passport_photo_verification_failed, 0 == true ? 1 : 0, z5, i12, z7, i11);
        String str32 = "ERROR_VS_FINAL_PASSPORT_PHOTO_VERIFICATION";
        I = new ValidationFeedback(str32, 31, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_final_feedback_passport_photo_verification_failed, i8, z3, i14, z9, i13);
        String str33 = "ERROR_VS_PASSPORT_NAME_VERIFICATION";
        H = new ValidationFeedback(str33, 32, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_feedback_passport_name_verification_failed, 0 == true ? 1 : 0, z5, i12, z7, i11);
        String str34 = "ERROR_VS_FINAL_PASSPORT_NAME_VERIFICATION";
        F = new ValidationFeedback(str34, 33, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_final_feedback_passport_name_verification_failed, i8, z3, i14, z9, i13);
        String str35 = "ERROR_VS_NO_NETWORK";
        G = new ValidationFeedback(str35, 34, R.drawable.onboard_sdk_info_error, R.string.onboard_sdk_video_selfie_feedback_no_network, 0 == true ? 1 : 0, z5, i12, z7, i11);
        ValidationFeedback[] validationFeedbackArrA = a();
        S = validationFeedbackArrA;
        O = EnumEntriesKt.enumEntries(validationFeedbackArrA);
        int i15 = U + 65;
        X = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 97 / 0;
        }
    }

    public final int getVoiceOverMessageResId() {
        int i2 = 2 % 2;
        int i3 = Q;
        int i4 = i3 + 125;
        R = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = this.J;
        if (i5 != -1) {
            return i5;
        }
        int i6 = i3 + 87;
        R = i6 % 128;
        int i7 = i6 % 2;
        int i8 = this.L;
        if (i7 != 0) {
            int i9 = 17 / 0;
        }
        return i8;
    }

    private static final /* synthetic */ ValidationFeedback[] a() {
        int i2 = 2 % 2;
        int i3 = R;
        int i4 = i3 + 53;
        Q = i4 % 128;
        int i5 = i4 % 2;
        ValidationFeedback[] validationFeedbackArr = {f11699d, f11698c, f11696a, f11700e, f11697b, f11705j, f11703h, f11702g, f11704i, f11701f, f11707l, f11709n, f11710o, f11706k, f11708m, f11715t, f11713r, f11714s, f11712q, f11711p, f11720y, f11718w, f11717v, f11719x, f11716u, B, C, D, A, f11721z, E, I, H, F, G};
        int i6 = i3 + 59;
        Q = i6 % 128;
        int i7 = i6 % 2;
        return validationFeedbackArr;
    }

    public static EnumEntries<ValidationFeedback> getEntries() {
        EnumEntries<ValidationFeedback> enumEntries;
        int i2 = 2 % 2;
        int i3 = Q + 19;
        int i4 = i3 % 128;
        R = i4;
        if (i3 % 2 != 0) {
            enumEntries = O;
            int i5 = 37 / 0;
        } else {
            enumEntries = O;
        }
        int i6 = i4 + 17;
        Q = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 25 / 0;
        }
        return enumEntries;
    }

    public static ValidationFeedback valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = Q + 63;
        R = i3 % 128;
        int i4 = i3 % 2;
        ValidationFeedback validationFeedback = (ValidationFeedback) Enum.valueOf(ValidationFeedback.class, str);
        if (i4 != 0) {
            throw null;
        }
        int i5 = Q + 23;
        R = i5 % 128;
        if (i5 % 2 == 0) {
            return validationFeedback;
        }
        throw null;
    }

    public static ValidationFeedback[] values() {
        ValidationFeedback[] validationFeedbackArr;
        int i2 = 2 % 2;
        int i3 = Q + 99;
        R = i3 % 128;
        if (i3 % 2 != 0) {
            validationFeedbackArr = (ValidationFeedback[]) S.clone();
            int i4 = 88 / 0;
        } else {
            validationFeedbackArr = (ValidationFeedback[]) S.clone();
        }
        int i5 = Q + 125;
        R = i5 % 128;
        if (i5 % 2 == 0) {
            return validationFeedbackArr;
        }
        throw null;
    }
}
