package com.facetec.sdk;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceTecSDK {
    public static final String EXTRA_ID_SCAN_RESULTS = "facetecsdk.signup.idScanResult";
    public static final String EXTRA_SESSION_RESULTS = "facetecsdk.signup.sessionResult";
    public static final int REQUEST_CODE_SESSION = 1002;
    private static final boolean isMinimalLibrary = n.B();
    static FaceTecCustomization V = new FaceTecCustomization();
    static FaceTecCustomization B = null;
    static FaceTecCustomization Code = null;
    static Code Z = Code.NORMAL;

    /* JADX INFO: renamed from: com.facetec.sdk.FaceTecSDK$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[bw.values().length];
            Code = iArr;
            try {
                iArr[bw.CLICKABLE_READY_SCREEN_SUBTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[bw.DEV_MODE_TAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum CameraPermissionStatus {
        GRANTED("Authorized"),
        NOT_YET_REQUESTED("Not Yet Requested"),
        DENIED("Denied");

        private final String B;

        CameraPermissionStatus(String str) {
            this.B = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.B;
        }
    }

    enum Code {
        NORMAL,
        LOW_LIGHT,
        BRIGHT_LIGHT
    }

    public static abstract class InitializeCallback {
        public abstract void onCompletion(boolean z2);
    }

    private FaceTecSDK() {
    }

    static boolean B() {
        return Z == Code.BRIGHT_LIGHT && Code != null;
    }

    private static boolean B(int i2) {
        boolean z2 = (i2 >= 2 && i2 <= 20) || i2 == -1;
        if (!z2) {
            bu.I("An error occurred while setting FaceTecCustomization due to a radial offset value set outside allowed range. Reverting radial offset value to default.");
        }
        return z2;
    }

    private static boolean Code(int i2) {
        boolean z2 = (i2 >= 0 && i2 <= 40) || i2 == -1;
        if (!z2) {
            bu.I("An error occurred while setting FaceTecCustomization due to a corner radius value set outside allowed range. Reverting corner radius value to default.");
        }
        return z2;
    }

    private static boolean I(int i2) {
        boolean z2 = true;
        int i3 = ba.B << 1;
        if ((i2 < 0 || i2 > i3) && i2 != -1) {
            z2 = false;
        }
        if (!z2) {
            bu.I("An error occurred while setting FaceTecCustomization due to a corner radius value set outside allowed range. Reverting corner radius value to default.");
        }
        return z2;
    }

    private static boolean V(int i2) {
        boolean z2 = (i2 >= 2 && i2 <= 20) || i2 == -1;
        if (!z2) {
            bu.I("An error occurred while setting FaceTecCustomization due to a stroke width value set outside allowed range. Reverting stroke width value to default.");
        }
        return z2;
    }

    static boolean Z() {
        return Z == Code.LOW_LIGHT && B != null;
    }

    private static boolean Z(int i2) {
        boolean z2 = (i2 >= 0 && i2 <= 20) || i2 == -1;
        if (!z2) {
            bu.I("An error occurred while setting FaceTecCustomization due to a border width value set outside allowed range. Reverting border width value to default.");
        }
        return z2;
    }

    public static void configureOCRLocalization(JSONObject jSONObject) {
        n.Z = jSONObject;
    }

    public static String createFaceTecAPIUserAgentString(String str) {
        return n.V(str);
    }

    public static CameraPermissionStatus getCameraPermissionStatus(Context context) {
        return n.L(context);
    }

    public static Long getLockoutEndTime(Context context) {
        return n.I(context);
    }

    public static FaceTecSDKStatus getStatus(Context context) {
        return n.Z(context);
    }

    public static void initializeInDevelopmentMode(Context context, String str, String str2, InitializeCallback initializeCallback) {
        n.Z(context, str, str2, initializeCallback);
    }

    public static void initializeInProductionMode(Context context, String str, String str2, String str3, InitializeCallback initializeCallback) {
        n.B(context);
        n.Z(context, str, str2, str3, initializeCallback);
    }

    public static boolean isLockedOut(Context context) {
        return n.Code(context);
    }

    public static void setAuditTrailType(FaceTecAuditTrailType faceTecAuditTrailType) {
        n.Z(faceTecAuditTrailType);
    }

    public static void setCustomization(FaceTecCustomization faceTecCustomization) {
        if (faceTecCustomization != null) {
            for (int i2 = 0; i2 < cd.Z.length(); i2++) {
                try {
                    JSONObject jSONObject = cd.Z.getJSONObject(i2);
                    String string = jSONObject.getString("overrideKey");
                    bw bwVar = (bw) jSONObject.get("type");
                    if (faceTecCustomization.f2854e.get(string) != null && faceTecCustomization.f2854e.get(string).equals(jSONObject.getString("overrideValue"))) {
                        int i3 = AnonymousClass4.Code[bwVar.ordinal()];
                        if (i3 == 1) {
                            faceTecCustomization.B = true;
                        } else if (i3 == 2) {
                            faceTecCustomization.Z = false;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (!Z(faceTecCustomization.D.buttonBorderWidth)) {
                faceTecCustomization.D.buttonBorderWidth = -1;
            }
            if (!Z(faceTecCustomization.Code.buttonBorderWidth)) {
                faceTecCustomization.Code.buttonBorderWidth = -1;
            }
            if (!Z(faceTecCustomization.S.borderWidth)) {
                faceTecCustomization.S.borderWidth = -1;
            }
            if (!Z(faceTecCustomization.Code.captureScreenTextBackgroundBorderWidth)) {
                faceTecCustomization.Code.captureScreenTextBackgroundBorderWidth = -1;
            }
            if (!Z(faceTecCustomization.Code.reviewScreenTextBackgroundBorderWidth)) {
                faceTecCustomization.Code.reviewScreenTextBackgroundBorderWidth = -1;
            }
            if (!Z(faceTecCustomization.D.retryScreenImageBorderWidth)) {
                faceTecCustomization.D.retryScreenImageBorderWidth = -1;
            }
            if (!Z(faceTecCustomization.V.mainHeaderDividerLineWidth)) {
                faceTecCustomization.V.mainHeaderDividerLineWidth = -1;
            }
            if (!Z(faceTecCustomization.V.inputFieldBorderWidth)) {
                faceTecCustomization.V.inputFieldBorderWidth = -1;
            }
            if (!I(faceTecCustomization.S.cornerRadius)) {
                faceTecCustomization.S.cornerRadius = -1;
            }
            if (!Code(faceTecCustomization.L.cornerRadius)) {
                faceTecCustomization.L.cornerRadius = -1;
            }
            if (!Code(faceTecCustomization.D.buttonCornerRadius)) {
                faceTecCustomization.D.buttonCornerRadius = -1;
            }
            if (!Code(faceTecCustomization.Code.buttonCornerRadius)) {
                faceTecCustomization.Code.buttonCornerRadius = -1;
            }
            if (!Code(faceTecCustomization.Code.captureScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.Code.captureScreenTextBackgroundCornerRadius = -1;
            }
            if (!Code(faceTecCustomization.Code.reviewScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.Code.reviewScreenTextBackgroundCornerRadius = -1;
            }
            if (!Code(faceTecCustomization.D.readyScreenTextBackgroundCornerRadius)) {
                faceTecCustomization.D.readyScreenTextBackgroundCornerRadius = -1;
            }
            if (!Code(faceTecCustomization.D.retryScreenImageCornerRadius)) {
                faceTecCustomization.D.retryScreenImageCornerRadius = -1;
            }
            if (!Code(faceTecCustomization.V.inputFieldCornerRadius)) {
                faceTecCustomization.V.inputFieldCornerRadius = -1;
            }
            if (!V(faceTecCustomization.f2852c.strokeWidth)) {
                faceTecCustomization.f2852c.strokeWidth = -1;
            }
            if (!V(faceTecCustomization.f2852c.progressStrokeWidth)) {
                faceTecCustomization.f2852c.progressStrokeWidth = -1;
            }
            if (!B(faceTecCustomization.f2852c.progressRadialOffset)) {
                faceTecCustomization.f2852c.progressRadialOffset = -1;
            }
            if (faceTecCustomization.D.retryScreenHeaderAttributedString != null && !faceTecCustomization.D.retryScreenHeaderAttributedString.isEmpty()) {
                ba.aS();
            }
            if (faceTecCustomization.D.retryScreenSubtextAttributedString != null && !faceTecCustomization.D.retryScreenSubtextAttributedString.isEmpty()) {
                ba.aY();
            }
            if (faceTecCustomization.D.readyScreenHeaderAttributedString != null && !faceTecCustomization.D.readyScreenHeaderAttributedString.isEmpty()) {
                ba.aU();
            }
            if (faceTecCustomization.D.readyScreenSubtextAttributedString != null && !faceTecCustomization.D.readyScreenSubtextAttributedString.isEmpty()) {
                ba.aT();
            }
            V = faceTecCustomization;
        }
    }

    public static void setDynamicDimmingCustomization(FaceTecCustomization faceTecCustomization) {
        Code = faceTecCustomization;
    }

    public static void setDynamicStrings(Map<Integer, String> map) {
        bb.I(map);
    }

    public static void setLowLightCustomization(FaceTecCustomization faceTecCustomization) {
        B = faceTecCustomization;
    }

    public static void unload() {
        n.Code();
    }

    public static String version() {
        return "9.4.4";
    }
}
