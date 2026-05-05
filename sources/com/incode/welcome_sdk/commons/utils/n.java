package com.incode.welcome_sdk.commons.utils;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.exceptions.FaceAuthenticationException;
import com.incode.welcome_sdk.commons.exceptions.IncodeHttpException;
import com.incode.welcome_sdk.commons.extensions.ThrowableExtensionsKt;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationErrorCode;
import com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokEventListener;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import java.util.HashMap;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a */
    public static final n f6552a = new n();

    /* JADX INFO: renamed from: b */
    private static int f6553b = 0;

    /* JADX INFO: renamed from: c */
    private static int f6554c = 0;

    /* JADX INFO: renamed from: d */
    private static int f6555d = 1;

    /* JADX INFO: renamed from: e */
    private static int f6556e = 1;

    public static /* synthetic */ Object a(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i2;
        int i11 = i9 | i2;
        int i12 = (~((~i2) | i3)) | (~i11);
        int i13 = (~(i4 | i8 | i2)) | (~(i11 | i3));
        int i14 = i2 + i3 + i5 + (528639218 * i7) + ((-532493036) * i6);
        int i15 = i14 * i14;
        int i16 = ((i2 * 873666089) - 1460666368) + (873666089 * i3) + ((-875965520) * i10) + (437982760 * i12) + ((-437982760) * i13) + (435683328 * i5) + (1819279360 * i7) + ((-1621098496) * i6) + (586088448 * i15);
        int i17 = (i2 * (-1573143961)) + 2078511484 + (i3 * (-1573143961)) + (i10 * 1872) + (i12 * (-936)) + (i13 * 936) + (i5 * (-1573143025)) + (i7 * 123045422) + (i6 * (-1548035028)) + (i15 * 1845559296);
        int i18 = i16 + (i17 * i17 * 1848705024);
        if (i18 == 1) {
            int i19 = 2 % 2;
            int i20 = f6556e;
            int i21 = i20 + 65;
            f6553b = i21 % 128;
            int i22 = i21 % 2 != 0 ? 117 : 101;
            int i23 = i20 + 79;
            f6553b = i23 % 128;
            int i24 = i23 % 2;
            return Integer.valueOf(i22);
        }
        if (i18 != 2) {
            return c(objArr);
        }
        int i25 = 2 % 2;
        int i26 = f6553b;
        int i27 = i26 + 107;
        f6556e = i27 % 128;
        int i28 = i27 % 2;
        int i29 = i26 + 87;
        f6556e = i29 % 128;
        int i30 = i29 % 2;
        return 100;
    }

    private n() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0014, code lost:
    
        if ((r6 instanceof retrofit2.HttpException) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0016, code lost:
    
        r1 = r2 + 113;
        com.incode.welcome_sdk.commons.utils.n.f6556e = r1 % 128;
        r1 = r1 % 2;
        r4 = ((retrofit2.HttpException) r6).code();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0029, code lost:
    
        if ((!(r6 instanceof retrofit2.HttpException)) != true) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x002c, code lost:
    
        r0 = ((retrofit2.HttpException) r6).response();
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r0 = r0.errorBody();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0039, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x003b, code lost:
    
        r4 = new org.json.JSONObject(r0.string()).optInt("status", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004e, code lost:
    
        if ((r6 instanceof com.incode.welcome_sdk.commons.exceptions.NoConnectivityException) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0050, code lost:
    
        r1 = r2 + 93;
        com.incode.welcome_sdk.commons.utils.n.f6556e = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0057, code lost:
    
        if ((r1 % 2) != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0059, code lost:
    
        r0 = 82 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005e, code lost:
    
        if ((r6 instanceof java.net.UnknownHostException) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0060, code lost:
    
        r1 = com.incode.welcome_sdk.commons.utils.n.f6556e + 41;
        com.incode.welcome_sdk.commons.utils.n.f6553b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006d, code lost:
    
        if ((r6 instanceof java.net.UnknownHostException) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0070, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0072, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0073, code lost:
    
        timber.log.Timber.Forest.e(r3, "Couldn't parse error", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return -2;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(java.lang.Throwable r6) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.utils.n.f6556e
            int r0 = r0 + 75
            int r2 = r0 % 128
            com.incode.welcome_sdk.commons.utils.n.f6553b = r2
            int r0 = r0 % r3
            r5 = 0
            if (r0 == 0) goto L25
            boolean r1 = r6 instanceof retrofit2.HttpException
            r0 = 76
            int r0 = r0 / r5
            if (r1 == 0) goto L4c
        L16:
            int r1 = r2 + 113
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.n.f6556e = r0
            int r1 = r1 % r3
            r0 = r6
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            int r4 = r0.code()
            goto L2c
        L25:
            boolean r1 = r6 instanceof retrofit2.HttpException
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == r0) goto L4c
            goto L16
        L2c:
            retrofit2.HttpException r6 = (retrofit2.HttpException) r6     // Catch: java.lang.Exception -> L72
            retrofit2.Response r0 = r6.response()     // Catch: java.lang.Exception -> L72
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Exception -> L72
            okhttp3.ResponseBody r0 = r0.errorBody()     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L7e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = r0.string()     // Catch: java.lang.Exception -> L72
            r1.<init>(r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = "status"
            int r4 = r1.optInt(r0, r4)     // Catch: java.lang.Exception -> L72
            goto L7e
        L4c:
            boolean r0 = r6 instanceof com.incode.welcome_sdk.commons.exceptions.NoConnectivityException
            if (r0 != 0) goto L60
            int r1 = r2 + 93
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.n.f6556e = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L6b
            boolean r1 = r6 instanceof java.net.UnknownHostException
            r0 = 82
            int r0 = r0 / r5
            if (r1 == 0) goto L70
        L60:
            int r0 = com.incode.welcome_sdk.commons.utils.n.f6556e
            int r1 = r0 + 41
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.n.f6553b = r0
            int r1 = r1 % r3
            r4 = -2
            goto L7e
        L6b:
            boolean r0 = r6 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L70
            goto L60
        L70:
            r4 = -1
            goto L7e
        L72:
            r3 = move-exception
            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r1 = "Couldn't parse error"
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r2.e(r3, r1, r0)
        L7e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.n.b(java.lang.Throwable):int");
    }

    public static final int a() {
        int i2 = 2 % 2;
        int i3 = f6553b;
        int i4 = i3 + 105;
        f6556e = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 125;
        f6556e = i6 % 128;
        if (i6 % 2 != 0) {
            return 102;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final int b() {
        int i2 = 2 % 2;
        int i3 = f6556e;
        int i4 = i3 + 7;
        f6553b = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 117;
        f6553b = i6 % 128;
        int i7 = i6 % 2;
        return 103;
    }

    public static final int e() {
        int i2 = 2 % 2;
        int i3 = f6556e + 125;
        int i4 = i3 % 128;
        f6553b = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 67;
        f6556e = i6 % 128;
        int i7 = i6 % 2;
        return 104;
    }

    @JvmStatic
    public static final int e(int i2) {
        int i3 = 2 % 2;
        int i4 = f6553b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f6556e = i4 % 128;
        int i5 = i4 % 2;
        if (i2 == -2) {
            return R.string.onboard_sdk_face_scan_no_network;
        }
        if (i2 == 1003) {
            return R.string.onboard_sdk_face_scan_error_1003;
        }
        if (i2 == 4010) {
            return R.string.onboard_sdk_face_scan_error_4010;
        }
        if (i2 != 4019) {
            switch (i2) {
                case 100:
                    return R.string.onboard_sdk_face_scan_warn_selfie_too_dark;
                case 101:
                    return R.string.onboard_sdk_feedback_remove_lenses;
                case 102:
                    return R.string.onboard_sdk_feedback_face_mask_detected;
                case 103:
                    return R.string.onboard_sdk_feedback_open_eyes;
                case 104:
                    return R.string.onboard_sdk_feedback_remove_head_cover;
                default:
                    switch (i2) {
                        case AuthApiStatusCodes.AUTH_TOKEN_ERROR /* 3004 */:
                            return R.string.onboard_sdk_face_scan_error_3004;
                        case AuthApiStatusCodes.AUTH_URL_RESOLUTION /* 3005 */:
                            return R.string.onboard_sdk_face_scan_error_3005;
                        case AuthApiStatusCodes.AUTH_APP_CERT_ERROR /* 3006 */:
                            return R.string.onboard_sdk_face_scan_error_3006;
                        case 3007:
                            int i6 = R.string.onboard_sdk_face_scan_error_3007;
                            int i7 = f6556e + 121;
                            f6553b = i7 % 128;
                            if (i7 % 2 == 0) {
                                return i6;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        case 3008:
                            return R.string.onboard_sdk_face_scan_error_3008;
                        case 3009:
                            return R.string.onboard_sdk_face_scan_error_3009;
                        case IDStepResponseCodes.STEP_RESULT_PERMISSION_NOT_ACCEPTED /* 3010 */:
                            return R.string.onboard_sdk_face_scan_error_3010;
                        default:
                            return R.string.onboard_sdk_spoof_detected;
                    }
            }
        }
        return R.string.onboard_sdk_face_scan_error_4019;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0050  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(int r8) {
        /*
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.incode.welcome_sdk.commons.utils.n.f6556e
            int r6 = r0 + 117
            int r0 = r6 % 128
            com.incode.welcome_sdk.commons.utils.n.f6553b = r0
            int r6 = r6 % r7
            r5 = 3005(0xbbd, float:4.211E-42)
            r4 = 3004(0xbbc, float:4.21E-42)
            r3 = 4019(0xfb3, float:5.632E-42)
            r2 = 3007(0xbbf, float:4.214E-42)
            r1 = 1003(0x3eb, float:1.406E-42)
            if (r6 == 0) goto L2c
            r0 = 82
            int r0 = r0 / 0
            if (r8 == r1) goto L56
            if (r8 == r2) goto L53
            if (r8 == r3) goto L56
            if (r8 == r4) goto L56
            if (r8 == r5) goto L56
            switch(r8) {
                case 100: goto L53;
                case 101: goto L3a;
                case 102: goto L3d;
                case 103: goto L4d;
                case 104: goto L50;
                default: goto L29;
            }
        L29:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_selfie_capture_failed_title
            return r0
        L2c:
            if (r8 == r1) goto L56
            if (r8 == r2) goto L53
            if (r8 == r3) goto L56
            if (r8 == r4) goto L56
            if (r8 == r5) goto L56
            switch(r8) {
                case 100: goto L53;
                case 101: goto L3a;
                case 102: goto L3d;
                case 103: goto L4d;
                case 104: goto L50;
                default: goto L39;
            }
        L39:
            goto L29
        L3a:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_lenses_detected_title
            return r0
        L3d:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_face_mask_detected_title
            int r0 = com.incode.welcome_sdk.commons.utils.n.f6556e
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.n.f6553b = r0
            int r1 = r1 % r7
            if (r1 != 0) goto L4b
            return r2
        L4b:
            r0 = 0
            throw r0
        L4d:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_eyes_closed_title
            return r0
        L50:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_head_covered_title
            return r0
        L53:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_too_dark_title
            return r0
        L56:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_face_not_aligned_title
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.n.b(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004c  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int a(com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationErrorCode r4) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.commons.utils.n.f6556e
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.n.f6553b = r0
            int r1 = r1 % r3
            java.lang.String r0 = ""
            if (r1 == 0) goto L25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int[] r1 = com.incode.welcome_sdk.commons.utils.n.a.f6559e
            int r0 = r4.ordinal()
            r1 = r1[r0]
            r0 = 11
            int r0 = r0 / 0
            switch(r1) {
                case 1: goto L34;
                case 2: goto L37;
                case 3: goto L3a;
                case 4: goto L46;
                case 5: goto L49;
                case 6: goto L4c;
                default: goto L22;
            }
        L22:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_selfie_capture_failed_title
            return r0
        L25:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int[] r1 = com.incode.welcome_sdk.commons.utils.n.a.f6559e
            int r0 = r4.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L34;
                case 2: goto L37;
                case 3: goto L3a;
                case 4: goto L46;
                case 5: goto L49;
                case 6: goto L4c;
                default: goto L33;
            }
        L33:
            goto L22
        L34:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_too_dark_title
            return r0
        L37:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_lenses_detected_title
            return r0
        L3a:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_face_mask_detected_title
            int r0 = com.incode.welcome_sdk.commons.utils.n.f6553b
            int r1 = r0 + 63
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.n.f6556e = r0
            int r1 = r1 % r3
            return r2
        L46:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_eyes_closed_title
            return r0
        L49:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_head_covered_title
            return r0
        L4c:
            int r0 = com.incode.welcome_sdk.R.string.onboard_sdk_face_scan_failed_feedback_face_not_aligned_title
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.n.a(com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationErrorCode):int");
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        FaceAuthenticationErrorCode faceAuthenticationErrorCode = (FaceAuthenticationErrorCode) objArr[0];
        int i2 = 2 % 2;
        int i3 = f6556e + 87;
        f6553b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(faceAuthenticationErrorCode, "");
            int i4 = a.f6559e[faceAuthenticationErrorCode.ordinal()];
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(faceAuthenticationErrorCode, "");
        switch (a.f6559e[faceAuthenticationErrorCode.ordinal()]) {
            case 1:
                int i5 = R.string.onboard_sdk_face_scan_failed_feedback_too_dark_hint;
                int i6 = f6556e + 125;
                f6553b = i6 % 128;
                if (i6 % 2 == 0) {
                    return Integer.valueOf(i5);
                }
                int i7 = 80 / 0;
                return Integer.valueOf(i5);
            case 2:
                return Integer.valueOf(R.string.onboard_sdk_face_scan_failed_feedback_lenses_detected_hint);
            case 3:
                return Integer.valueOf(R.string.onboard_sdk_face_scan_failed_feedback_face_mask_detected_hint);
            case 4:
                return Integer.valueOf(R.string.onboard_sdk_face_scan_failed_feedback_eyes_closed_hint);
            case 5:
                return Integer.valueOf(R.string.onboard_sdk_face_scan_failed_feedback_head_covered_hint);
            case 6:
                return Integer.valueOf(R.string.onboard_sdk_face_scan_failed_feedback_face_not_aligned_hint);
            default:
                return Integer.valueOf(R.string.onboard_sdk_face_scan_failed_feedback_selfie_capture_failed_hint);
        }
    }

    @JvmStatic
    public static final int c(int i2, boolean z2) {
        int i3 = 2 % 2;
        int i4 = f6556e + 47;
        int i5 = i4 % 128;
        f6553b = i5;
        int i6 = i4 % 2;
        if (!z2) {
            int i7 = i5 + 101;
            f6556e = i7 % 128;
            int i8 = i7 % 2;
            return R.string.onboard_sdk_face_scan_failed_feedback_selfie_capture_total_failure_hint;
        }
        if (i2 != 1003) {
            if (i2 != 3007) {
                if (i2 != 4019 && i2 != 3004 && i2 != 3005) {
                    switch (i2) {
                        case 100:
                            break;
                        case 101:
                            int i9 = R.string.onboard_sdk_face_scan_failed_feedback_lenses_detected_hint;
                            int i10 = f6556e + 43;
                            f6553b = i10 % 128;
                            if (i10 % 2 != 0) {
                                int i11 = 80 / 0;
                            }
                            return i9;
                        case 102:
                            return R.string.onboard_sdk_face_scan_failed_feedback_face_mask_detected_hint;
                        case 103:
                            int i12 = R.string.onboard_sdk_face_scan_failed_feedback_eyes_closed_hint;
                            int i13 = f6556e + 13;
                            f6553b = i13 % 128;
                            int i14 = i13 % 2;
                            return i12;
                        case 104:
                            return R.string.onboard_sdk_face_scan_failed_feedback_head_covered_hint;
                        default:
                            return R.string.onboard_sdk_face_scan_failed_feedback_selfie_capture_failed_hint;
                    }
                }
            }
            return R.string.onboard_sdk_face_scan_failed_feedback_too_dark_hint;
        }
        int i15 = R.string.onboard_sdk_face_scan_failed_feedback_face_not_aligned_hint;
        int i16 = f6553b + 49;
        f6556e = i16 % 128;
        if (i16 % 2 != 0) {
            return i15;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0024 A[RETURN] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int d(int r4) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r2 = com.incode.welcome_sdk.commons.utils.n.f6556e
            int r1 = r2 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.n.f6553b = r0
            int r1 = r1 % r3
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r4 == r0) goto L32
            r0 = 3010(0xbc2, float:4.218E-42)
            if (r4 == r0) goto L30
            r0 = 4019(0xfb3, float:5.632E-42)
            if (r4 == r0) goto L32
            switch(r4) {
                case 100: goto L24;
                case 101: goto L25;
                case 102: goto L27;
                case 103: goto L2a;
                case 104: goto L2d;
                default: goto L1b;
            }
        L1b:
            switch(r4) {
                case 3004: goto L32;
                case 3005: goto L20;
                case 3006: goto L22;
                case 3007: goto L24;
                default: goto L1e;
            }
        L1e:
            r0 = 7
            return r0
        L20:
            r0 = 5
            return r0
        L22:
            r0 = 3
            return r0
        L24:
            return r3
        L25:
            r0 = 1
            return r0
        L27:
            r0 = 10
            return r0
        L2a:
            r0 = 11
            return r0
        L2d:
            r0 = 12
            return r0
        L30:
            r0 = 6
            return r0
        L32:
            int r2 = r2 + 61
            int r0 = r2 % 128
            com.incode.welcome_sdk.commons.utils.n.f6553b = r0
            int r2 = r2 % r3
            r1 = 4
            if (r2 == 0) goto L40
            r0 = 21
            int r0 = r0 / 0
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.n.d(int):int");
    }

    public static final class c extends Enum<c> {

        /* JADX INFO: renamed from: a */
        private static final /* synthetic */ c[] f6560a;

        /* JADX INFO: renamed from: d */
        public static final c f6561d = new c("ONBOARD_SDK_LOTTIE_ERROR_SELFIE_POSITIONING", "onboard_sdk_lottie_error_selfie_positioning", R.string.onboard_sdk_selfie_feedback_animation_url);

        /* JADX INFO: renamed from: e */
        private static int f6562e = 0;

        /* JADX INFO: renamed from: f */
        private static int f6563f = 1;

        /* JADX INFO: renamed from: g */
        private static int f6564g = 1;

        /* JADX INFO: renamed from: i */
        private static int f6565i = 0;

        /* JADX INFO: renamed from: b */
        private final int f6566b;

        /* JADX INFO: renamed from: c */
        private final String f6567c;

        private c(String str, String str2, int i2) {
            super(str, 0);
            this.f6567c = str2;
            this.f6566b = i2;
        }

        public final String a() {
            int i2 = 2 % 2;
            int i3 = f6562e;
            int i4 = i3 + 29;
            f6564g = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f6567c;
            int i6 = i3 + 61;
            f6564g = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int b() {
            int i2 = 2 % 2;
            int i3 = f6562e;
            int i4 = i3 + 105;
            f6564g = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.f6566b;
            int i7 = i3 + 83;
            f6564g = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        static {
            c[] cVarArrC = c();
            f6560a = cVarArrC;
            EnumEntriesKt.enumEntries(cVarArrC);
            int i2 = f6563f + 33;
            f6565i = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final /* synthetic */ c[] c() {
            int i2 = 2 % 2;
            int i3 = f6564g;
            int i4 = i3 + 55;
            f6562e = i4 % 128;
            c[] cVarArr = i4 % 2 != 0 ? new c[]{f6561d} : new c[]{f6561d};
            int i5 = i3 + 71;
            f6562e = i5 % 128;
            int i6 = i5 % 2;
            return cVarArr;
        }

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f6564g + 63;
            f6562e = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            if (i4 == 0) {
                return cVar;
            }
            throw null;
        }

        public static c[] values() {
            int i2 = 2 % 2;
            int i3 = f6562e + 11;
            f6564g = i3 % 128;
            int i4 = i3 % 2;
            c[] cVarArr = (c[]) f6560a.clone();
            int i5 = f6564g + 73;
            f6562e = i5 % 128;
            int i6 = i5 % 2;
            return cVarArr;
        }
    }

    @JvmStatic
    public static final c a(int i2) {
        int i3 = 2 % 2;
        int i4 = f6556e;
        int i5 = i4 + 111;
        f6553b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (i2 == 1003 || i2 == 4019 || i2 == 3004 || i2 == 3005) {
            return c.f6561d;
        }
        int i6 = i4 + 65;
        f6553b = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @JvmStatic
    public static final c e(FaceAuthenticationErrorCode faceAuthenticationErrorCode) {
        int i2 = 2 % 2;
        int i3 = f6553b + 77;
        f6556e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(faceAuthenticationErrorCode, "");
        Object obj = null;
        if (a.f6559e[faceAuthenticationErrorCode.ordinal()] != 6) {
            return null;
        }
        int i5 = f6556e + 43;
        f6553b = i5 % 128;
        if (i5 % 2 != 0) {
            c cVar = c.f6561d;
            throw null;
        }
        c cVar2 = c.f6561d;
        int i6 = f6553b + 61;
        f6556e = i6 % 128;
        if (i6 % 2 != 0) {
            return cVar2;
        }
        obj.hashCode();
        throw null;
    }

    public static boolean c(int i2) {
        int i3 = 2 % 2;
        if (500 <= i2) {
            int i4 = f6556e + 69;
            int i5 = i4 % 128;
            f6553b = i5;
            int i6 = i4 % 2;
            if (i2 < 600) {
                return true;
            }
            int i7 = i5 + 17;
            f6556e = i7 % 128;
            int i8 = i7 % 2;
        }
        return false;
    }

    @JvmStatic
    public static final HashMap<String, Object> a(Throwable th) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        HashMap<String, Object> map = new HashMap<>();
        HashMap<String, Object> map2 = map;
        String value = EventValues.ERROR_TYPE.getValue();
        String simpleName = th.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        map2.put(value, simpleName);
        if (th instanceof IncodeHttpException) {
            IncodeHttpException incodeHttpException = (IncodeHttpException) th;
            map2.put(EventValues.ERROR_MESSAGE.getValue(), incodeHttpException.b());
            map2.put(EventValues.ERROR_DESCRIPTION.getValue(), incodeHttpException.e());
        } else if (th instanceof FaceAuthenticationException) {
            int i3 = f6553b + 51;
            f6556e = i3 % 128;
            int i4 = i3 % 2;
            FaceAuthenticationException faceAuthenticationException = (FaceAuthenticationException) th;
            map2.put(EventValues.ERROR_MESSAGE.getValue(), faceAuthenticationException.getCode());
            map2.put(EventValues.ERROR_DESCRIPTION.getValue(), faceAuthenticationException.getMessage());
        } else {
            String message = th.getMessage();
            if (message != null) {
                map2.put(EventValues.ERROR_MESSAGE.getValue(), message);
            }
            String stackTraceAsString = ThrowableExtensionsKt.getStackTraceAsString(th);
            if (StringUtils.isNotBlank(stackTraceAsString)) {
                int i5 = f6553b + 1;
                f6556e = i5 % 128;
                int i6 = i5 % 2;
                map2.put(EventValues.ERROR_DESCRIPTION.getValue(), stackTraceAsString);
                int i7 = f6553b + 69;
                f6556e = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return map;
    }

    static {
        int i2 = f6555d + 5;
        f6554c = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 93 / 0;
        }
    }

    @JvmStatic
    public static final int c(FaceAuthenticationErrorCode faceAuthenticationErrorCode) {
        return ((Integer) a(1885033654, new Object[]{faceAuthenticationErrorCode}, -1885033654, OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b())).intValue();
    }

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        private static int f6557a = 0;

        /* JADX INFO: renamed from: b */
        private static int f6558b = 1;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f6559e;

        static {
            int[] iArr = new int[FaceAuthenticationErrorCode.values().length];
            try {
                iArr[FaceAuthenticationErrorCode.FACE_TOO_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FaceAuthenticationErrorCode.LENSES_DETECTED.ordinal()] = 2;
                int i2 = f6557a + 111;
                f6558b = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FaceAuthenticationErrorCode.FACE_MASK_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FaceAuthenticationErrorCode.CLOSED_EYES_DETECTED.ordinal()] = 4;
                int i5 = f6557a + 105;
                f6558b = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FaceAuthenticationErrorCode.HEAD_COVER_DETECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FaceAuthenticationErrorCode.FACE_TOO_SMALL.ordinal()] = 6;
                int i7 = f6558b + 51;
                f6557a = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            f6559e = iArr;
        }
    }

    public static final int c() {
        return ((Integer) a(1463773427, new Object[0], -1463773426, OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b())).intValue();
    }

    public static final int d() {
        return ((Integer) a(1758109762, new Object[0], -1758109760, OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b(), OpenTokEventListener.b())).intValue();
    }
}
