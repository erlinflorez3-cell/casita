package com.facetec.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.facetec.sdk.FaceTecCancelButtonCustomization;
import com.facetec.sdk.FaceTecSDK;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
final class ba {
    static int B = 15;
    static int C = 80;
    static int Code = 35;
    static int D = 10;
    static int F = 130;
    static int I = 78;
    static int L = 30;
    static int S = -55;
    static float V = 1.1f;
    static int Z = 50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static int f2961a = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static int f2962b = 28;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static int f2963c = 28;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static int f2964d = 28;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int f2965e = 20;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static int f2966f = 20;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static int f2967g = 20;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static int f2968h = 24;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static int f2969i = 16;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static int f2970j = 20;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static int f2971k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static int f2972l = 20;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f2973m = 28;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static int f2974n = 12;

    /* JADX INFO: renamed from: com.facetec.sdk.ba$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] Code;
        static final /* synthetic */ int[] I;
        static final /* synthetic */ int[] Z;

        static {
            int[] iArr = new int[x.values().length];
            I = iArr;
            try {
                iArr[x.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                I[x.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                I[x.SCANNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                I[x.WEAK_CONNECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                I[x.FINISHED_WITH_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                I[x.FINISHED_WITH_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                I[x.SKIPPED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                I[x.DISABLED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[aq.values().length];
            Code = iArr2;
            try {
                iArr2[aq.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Code[aq.IDSCAN_RETRY_FACE_DID_NOT_MATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Code[aq.IDSCAN_RETRY_ID_NOT_FULLY_VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Code[aq.IDSCAN_RETRY_OCR_RESULTS_NOT_GOOD_ENOUGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Code[aq.IDSCAN_RETRY_ID_TYPE_NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                Code[aq.IDSCAN_RETRY_USER_CONFIRMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                Code[aq.IDSCAN_SKIP_OR_ERROR_NFC.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                Code[aq.IDSCAN_SUCCESS_FRONT_SIDE.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                Code[aq.IDSCAN_SUCCESS_FRONT_SIDE_BACK_NEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                Code[aq.IDSCAN_SUCCESS_BACK_SIDE.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                Code[aq.IDSCAN_SUCCESS_USER_CONFIRMATION.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                Code[aq.IDSCAN_SUCCESS_NFC.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr3 = new int[Code.values().length];
            Z = iArr3;
            try {
                iArr3[Code.RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                Z[Code.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    enum Code {
        COLOR,
        RESOURCE
    }

    ba() {
    }

    static int A() {
        return aZ().D.buttonTextNormalColor;
    }

    static int B(Context context) {
        int i2 = aZ().D.retryScreenIdealImage;
        if (i2 == 0) {
            i2 = FaceTecSDK.V.D.retryScreenIdealImage;
        }
        return i2 == 0 ? Code(context, "facetec_ideal_pose_image", R.drawable.facetec_internal_ideal) : i2;
    }

    static int B(Context context, int i2) {
        int i3 = AnonymousClass4.Z[V(context, i2).ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return 255;
            }
            return (-1) - (((-1) - (i2 >> 24)) | ((-1) - 255));
        }
        Drawable drawable = ContextCompat.getDrawable(context, i2);
        if (drawable == null) {
            int color = ContextCompat.getColor(context, i2) >> 24;
            return (255 + color) - (255 | color);
        }
        if (drawable instanceof ShapeDrawable) {
            return ((ShapeDrawable) drawable).getPaint().getAlpha();
        }
        if (!(drawable instanceof GradientDrawable)) {
            if (drawable instanceof ColorDrawable) {
                return drawable.getAlpha();
            }
            return 255;
        }
        int[] colors = ((GradientDrawable) drawable).getColors();
        if (colors == null) {
            return 255;
        }
        int color2 = 0;
        for (int i4 = 0; i4 < colors.length; i4++) {
            int i5 = AnonymousClass4.Z[V(context, colors[i4]).ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                }
            } else {
                color2 += (ContextCompat.getColor(context, colors[i4]) >> 24) & 255;
            }
            int i6 = colors[i4] >> 24;
            color2 += (i6 + 255) - (i6 | 255);
        }
        return color2 / colors.length;
    }

    static String B(x xVar) {
        switch (AnonymousClass4.I[xVar.ordinal()]) {
            case 1:
                return "";
            case 2:
                return bb.Z(R.string.FaceTec_idscan_nfc_status_starting_message);
            case 3:
                return bb.Z(R.string.FaceTec_idscan_nfc_status_scanning_message);
            case 4:
                return bb.Z(R.string.FaceTec_idscan_nfc_status_weak_connection_message);
            case 5:
                return bb.Z(R.string.FaceTec_idscan_nfc_status_finished_with_success_message);
            case 6:
                return bb.Z(R.string.FaceTec_idscan_nfc_status_finished_with_error_message);
            case 7:
                return bb.Z(R.string.FaceTec_idscan_nfc_status_skipped_message);
            case 8:
                return bb.Z(R.string.FaceTec_idscan_nfc_status_disabled_message);
            default:
                return null;
        }
    }

    static String B(boolean z2) {
        String strZ = FaceTecSDK.V.D.readyScreenHeaderAttributedString;
        if (!strZ.isEmpty() && strZ.contains("\n")) {
            strZ = strZ.substring(0, strZ.indexOf("\n"));
        }
        if (strZ.isEmpty()) {
            strZ = bb.Z(R.string.FaceTec_instructions_header_ready_1);
            if (strZ.contains("\n")) {
                strZ = strZ.substring(0, strZ.indexOf("\n"));
            }
        }
        return (!z2 || FaceTecSDK.V.I || strZ.length() <= 30) ? strZ : strZ.substring(0, 30);
    }

    static void B() {
        FaceTecCustomization faceTecCustomization = FaceTecSDK.V;
        if (faceTecCustomization.f2852c.progressRadialOffset == -1) {
            faceTecCustomization.f2852c.progressRadialOffset = f() + g();
        }
        FaceTecSDK.V = faceTecCustomization;
    }

    static void B(Context context, TextView textView, Drawable drawable, int i2) {
        int i3 = AnonymousClass4.Z[V(textView.getContext(), i2).ordinal()];
        if (i3 == 1) {
            if (drawable instanceof ShapeDrawable) {
                ((ShapeDrawable) drawable).getPaint().setColor(ContextCompat.getColor(context, i2));
                return;
            } else if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setColor(ContextCompat.getColor(context, i2));
                return;
            } else {
                if (drawable instanceof ColorDrawable) {
                    ((ColorDrawable) drawable).setColor(ContextCompat.getColor(context, i2));
                    return;
                }
                return;
            }
        }
        if (i3 != 2) {
            return;
        }
        if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i2);
        } else if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i2);
        } else if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(i2);
        }
    }

    static void B(Context context, TextView textView, Drawable drawable, int i2, int i3, double d2) {
        int i4 = AnonymousClass4.Z[V(textView.getContext(), i2).ordinal()];
        if (i4 == 1) {
            if (drawable instanceof GradientDrawable) {
                GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                gradientDrawable.setStroke(i3, ContextCompat.getColor(context, i2));
                gradientDrawable.setCornerRadius((float) d2);
                return;
            }
            return;
        }
        if (i4 == 2 && (drawable instanceof GradientDrawable)) {
            GradientDrawable gradientDrawable2 = (GradientDrawable) drawable;
            gradientDrawable2.setStroke(i3, i2);
            gradientDrawable2.setCornerRadius((float) d2);
        }
    }

    static void B(View view) {
        int iG = G();
        int i2 = AnonymousClass4.Z[V(view.getContext(), iG).ordinal()];
        if (i2 == 1) {
            view.setBackgroundResource(iG);
        } else if (i2 != 2) {
            view.setBackgroundColor(0);
        } else {
            view.setBackgroundColor(iG);
        }
    }

    static void B(Button button, int i2) {
        button.setTextColor(i2);
    }

    static void B(TextView textView) {
        int i2 = aZ().L.textColor;
        int i3 = AnonymousClass4.Z[V(textView.getContext(), i2).ordinal()];
        if (i3 == 1) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), i2));
        } else {
            if (i3 != 2) {
                return;
            }
            textView.setTextColor(i2);
        }
    }

    static void B(TextView textView, String str) {
        textView.setText(Html.fromHtml(str.replace("\n", "<br/>"), 63));
    }

    static int C() {
        return 10;
    }

    static int C(Context context) {
        int iCode = Code(context, aZ().D.retryScreenSubtextTextColor);
        return iCode == 0 ? g(context) : iCode;
    }

    static String C(boolean z2) {
        String strZ = FaceTecSDK.V.D.retryScreenSubtextAttributedString;
        if (strZ.isEmpty()) {
            strZ = bb.Z(R.string.FaceTec_retry_subheader_message);
        }
        return (!z2 || FaceTecSDK.V.I || strZ == null || strZ.length() <= 40) ? strZ : strZ.substring(0, 40);
    }

    static void C(View view) {
        Code(view, Z(FaceTecSDK.V.Code.selectionScreenBackgroundColors));
    }

    static float Code() {
        return (Resources.getSystem().getDisplayMetrics().widthPixels / ce.V(340)) * (n.S() / 1.7777778f);
    }

    public static int Code(int i2, int i3) {
        return Color.argb(i3, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    static int Code(Context context) {
        return Code(context, aZ().Code.captureFrameStrokeColor);
    }

    static int Code(Context context, int i2) {
        if (AnonymousClass4.Z[V(context, i2).ordinal()] != 1) {
            return i2;
        }
        try {
            return ContextCompat.getColor(context, i2);
        } catch (Throwable unused) {
            return i2;
        }
    }

    static int Code(Context context, String str, int i2) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("\u0011n6%\u0002.EG=\u0006\u000bn4?)A)7\u000f|.\n[", (short) (OY.Xd() ^ 2880))).getMethod(EO.Od("Y/\u0002><n\r=lP*\\", (short) (Od.Xd() ^ (-17922))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            String strQd = C1561oA.Qd("\u001a'\u0015*\u0013\u0013\u001c\u0014", (short) (Od.Xd() ^ (-22904)));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1593ug.zd("ESJYWRN\u0019O\\\\cU_f!7ddk]qn", (short) (C1580rY.Xd() ^ (-5282)), (short) (C1580rY.Xd() ^ (-1006)))).getMethod(C1561oA.od("0-;\u0016&'.#(%\r\u001f*!", (short) (C1633zX.Xd() ^ (-13327))), new Class[0]);
            try {
                method2.setAccessible(true);
                int identifier = resources.getIdentifier(str, strQd, (String) method2.invoke(context, objArr2));
                return identifier == 0 ? i2 : identifier;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    static String Code(boolean z2) {
        String strZ = FaceTecSDK.V.D.readyScreenSubtextAttributedString;
        if (!strZ.isEmpty() && strZ.contains("\n")) {
            strZ = strZ.substring(0, strZ.indexOf("\n"));
        }
        if (strZ.isEmpty()) {
            strZ = bb.Z(R.string.FaceTec_instructions_message_ready_1);
            if (strZ.contains("\n")) {
                strZ = strZ.substring(0, strZ.indexOf("\n"));
            }
        }
        return (!z2 || FaceTecSDK.V.I || strZ.length() <= 50) ? strZ : strZ.substring(0, 50);
    }

    static void Code(View view) {
        int iZ = Z(FaceTecSDK.V.V.backgroundColors);
        int i2 = AnonymousClass4.Z[V(view.getContext(), iZ).ordinal()];
        if (i2 == 1) {
            view.setBackgroundResource(iZ);
        } else if (i2 != 2) {
            view.setBackgroundColor(0);
        } else {
            view.setBackgroundColor(iZ);
        }
    }

    private static void Code(View view, int i2) {
        int i3 = AnonymousClass4.Z[V(view.getContext(), i2).ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return;
            }
            view.setBackgroundColor(Code(i2, 255));
        } else {
            if (ContextCompat.getDrawable(view.getContext(), i2) == null) {
                view.setBackgroundColor(Code(ContextCompat.getColor(view.getContext(), i2), 255));
                return;
            }
            Drawable drawableMutate = ContextCompat.getDrawable(view.getContext(), i2).mutate();
            if (drawableMutate instanceof ShapeDrawable) {
                ((ShapeDrawable) drawableMutate).getPaint().setAlpha(255);
            } else if (drawableMutate instanceof GradientDrawable) {
                drawableMutate = V(view.getContext(), (GradientDrawable) drawableMutate);
            } else if (drawableMutate instanceof ColorDrawable) {
                drawableMutate.setAlpha(255);
            }
            view.setBackground(drawableMutate);
        }
    }

    static void Code(TextView textView) {
        int i2 = aZ().Code.reviewScreenForegroundColor;
        int i3 = AnonymousClass4.Z[V(textView.getContext(), i2).ordinal()];
        if (i3 == 1) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), i2));
        } else {
            if (i3 != 2) {
                return;
            }
            textView.setTextColor(i2);
        }
    }

    private static void Code(String str) {
        bu.I(String.format("Your %s text has been configured to use more than %d characters.  %d or less characters is recommended for this text in order to render well on all devices and OS versions.", str, 20, 20));
    }

    static int D() {
        int i2 = FaceTecSDK.V.S.borderWidth == -1 ? 2 : FaceTecSDK.V.S.borderWidth;
        return Math.max(i2 == 0 ? 0 : 1, Math.round(i2 * Code()));
    }

    static int D(Context context) {
        int iCode = Code(context, aZ().D.readyScreenSubtextTextColor);
        return iCode == 0 ? g(context) : iCode;
    }

    static String D(boolean z2) {
        String strZ = bb.Z(R.string.FaceTec_retry_ideal_image_label);
        return (!z2 || FaceTecSDK.V.I || strZ == null || strZ.length() <= 20) ? strZ : strZ.substring(0, 20);
    }

    static int E() {
        return Z(FaceTecSDK.V.C.backgroundColor);
    }

    static int F() {
        int i2 = FaceTecSDK.V.D.retryScreenImageBorderWidth == -1 ? 1 : FaceTecSDK.V.D.retryScreenImageBorderWidth;
        return Math.max(i2 == 0 ? 0 : 1, Math.round(i2 * Code()));
    }

    static int F(Context context) {
        int iCode = Code(context, aZ().D.retryScreenHeaderTextColor);
        return iCode == 0 ? g(context) : iCode;
    }

    static String F(boolean z2) {
        String strZ = bb.Z(R.string.FaceTec_retry_instruction_message_3);
        return (!z2 || FaceTecSDK.V.I || strZ == null || strZ.length() <= 40) ? strZ : strZ.substring(0, 40);
    }

    static int G() {
        return Z(FaceTecSDK.V.D.backgroundColors);
    }

    static int H() {
        return aZ().D.readyScreenTextBackgroundColor;
    }

    static int I() {
        float fCode = Code() * V();
        String strZ = bb.Z(R.string.FaceTec_idscan_type_selection_header);
        return Math.round((f2973m + ((strZ == null || strZ.length() <= 36) ? 0 : -4)) * fCode);
    }

    public static int I(int i2, float f2) {
        return Color.argb(Math.round(Color.alpha(i2) * f2), Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    static int I(Context context) {
        int i2 = FaceTecSDK.V.D.cameraPermissionsScreenImage;
        return i2 == 0 ? Code(context, "facetec_camera", R.drawable.facetec_internal_camera) : i2;
    }

    static String I(aq aqVar) {
        HashMap<aq, String> map = FaceTecCustomization.f2848f;
        String str = map != null ? map.get(aqVar) : null;
        if (str != null) {
            return str;
        }
        switch (AnonymousClass4.Code[aqVar.ordinal()]) {
        }
        return str;
    }

    static String I(boolean z2) {
        String strZ = FaceTecSDK.V.D.retryScreenHeaderAttributedString;
        if (strZ.isEmpty()) {
            strZ = bb.Z(R.string.FaceTec_retry_header);
        }
        return (!z2 || FaceTecSDK.V.I || strZ == null || strZ.length() <= 30) ? strZ : strZ.substring(0, 30);
    }

    static void I(Context context, Drawable drawable, int i2) {
        int i3 = AnonymousClass4.Z[V(context, i2).ordinal()];
        if (i3 == 1) {
            if (drawable instanceof GradientDrawable) {
                ((GradientDrawable) drawable).setColor(ContextCompat.getColor(context, i2));
            }
        } else if (i3 == 2 && (drawable instanceof GradientDrawable)) {
            ((GradientDrawable) drawable).setColor(i2);
        }
    }

    static void I(View view) {
        Code(view, Z(FaceTecSDK.V.F.backgroundColors));
    }

    static void I(TextView textView) {
        int iV = v();
        int i2 = AnonymousClass4.Z[V(textView.getContext(), iV).ordinal()];
        if (i2 == 1) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), iV));
        } else {
            if (i2 != 2) {
                return;
            }
            textView.setTextColor(iV);
        }
    }

    static int J() {
        return aZ().D.buttonTextHighlightColor;
    }

    static int K() {
        return aZ().D.buttonBackgroundDisabledColor;
    }

    static int L() {
        return -1;
    }

    static int L(Context context) {
        int iCode = Code(context, aZ().D.readyScreenHeaderTextColor);
        return iCode == 0 ? g(context) : iCode;
    }

    static String L(boolean z2) {
        String strZ = bb.Z(R.string.FaceTec_retry_instruction_message_1);
        return (!z2 || FaceTecSDK.V.I || strZ == null || strZ.length() <= 40) ? strZ : strZ.substring(0, 40);
    }

    static void L(TextView textView) {
        int i2 = aZ().Code.captureScreenFocusMessageTextColor;
        int i3 = AnonymousClass4.Z[V(textView.getContext(), i2).ordinal()];
        if (i3 == 1) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), i2));
        } else {
            if (i3 != 2) {
                return;
            }
            textView.setTextColor(i2);
        }
    }

    static int M() {
        return aZ().D.buttonTextDisabledColor;
    }

    static int N() {
        return aZ().D.buttonBackgroundHighlightColor;
    }

    static int O() {
        return aZ().D.buttonBackgroundNormalColor;
    }

    static int P() {
        return aZ().Code.buttonBackgroundNormalColor;
    }

    static int Q() {
        return aZ().D.buttonBorderColor;
    }

    static int R() {
        return aZ().Code.buttonTextHighlightColor;
    }

    static int S(Context context) {
        return Code(context, aZ().S.borderColor);
    }

    static FaceTecSize S() {
        return new FaceTecSize(Math.round(ce.B(Resources.getSystem().getDisplayMetrics().widthPixels) - ((D << 1) * Code())), Math.round(Code() * 60.0f));
    }

    static String S(boolean z2) {
        String strZ = bb.Z(R.string.FaceTec_retry_instruction_message_2);
        return (!z2 || FaceTecSDK.V.I || strZ == null || strZ.length() <= 40) ? strZ : strZ.substring(0, 40);
    }

    static void S(TextView textView) {
        int i2 = aZ().Code.captureScreenForegroundColor;
        int i3 = AnonymousClass4.Z[V(textView.getContext(), i2).ordinal()];
        if (i3 == 1) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), i2));
        } else {
            if (i3 != 2) {
                return;
            }
            textView.setTextColor(i2);
        }
    }

    static int T() {
        return aZ().Code.buttonTextNormalColor;
    }

    static int U() {
        return aZ().Code.buttonTextDisabledColor;
    }

    static float V() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f2 = displayMetrics.widthPixels;
        float f3 = displayMetrics.heightPixels;
        float f4 = ((double) n.S()) < 1.4d ? 0.94f : 0.88f;
        float f5 = f2 * f4;
        float f6 = displayMetrics.density * 340.0f;
        if (f5 > f6) {
            f4 = f6 / f2;
            f5 = f6;
        }
        int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? Resources.getSystem().getDimensionPixelSize(identifier) : 0;
        int identifier2 = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", "android");
        int dimensionPixelSize2 = identifier2 > 0 ? Resources.getSystem().getDimensionPixelSize(identifier2) : 0;
        float fS = n.S() * f5;
        float f7 = (((f3 - ((displayMetrics.density * 10.0f) * 3.0f)) - 10.0f) - dimensionPixelSize2) - dimensionPixelSize;
        return fS > f7 ? f7 / (n.S() * f2) : f4;
    }

    static int V(Context context) {
        int i2 = aZ().V.inputFieldPlaceholderTextColor;
        return i2 == 0 ? Code(Code(context, am()), 102) : i2;
    }

    private static GradientDrawable V(Context context, GradientDrawable gradientDrawable) {
        int[] colors = gradientDrawable.getColors();
        if (colors != null) {
            for (int i2 = 0; i2 < colors.length; i2++) {
                int i3 = AnonymousClass4.Z[V(context, colors[i2]).ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                    }
                } else {
                    colors[i2] = Code(ContextCompat.getColor(context, colors[i2]), 255);
                }
                colors[i2] = Code(colors[i2], 255);
            }
        }
        gradientDrawable.setColors(colors);
        return gradientDrawable;
    }

    static FaceTecCustomization V(FaceTecCustomization faceTecCustomization) {
        Typeface typeface = Typeface.DEFAULT_BOLD;
        Typeface typeface2 = Typeface.DEFAULT;
        if (faceTecCustomization.L.textFont == null) {
            faceTecCustomization.L.textFont = typeface2;
        }
        if (faceTecCustomization.D.headerFont == null) {
            faceTecCustomization.D.headerFont = typeface;
        }
        if (faceTecCustomization.D.subtextFont == null) {
            faceTecCustomization.D.subtextFont = typeface2;
        }
        if (faceTecCustomization.D.buttonFont == null) {
            faceTecCustomization.D.buttonFont = typeface2;
        }
        if (faceTecCustomization.F.messageFont == null) {
            faceTecCustomization.F.messageFont = typeface2;
        }
        if (faceTecCustomization.Code.headerFont == null) {
            faceTecCustomization.Code.headerFont = typeface;
        }
        if (faceTecCustomization.Code.subtextFont == null) {
            faceTecCustomization.Code.subtextFont = typeface2;
        }
        if (faceTecCustomization.Code.buttonFont == null) {
            faceTecCustomization.Code.buttonFont = typeface2;
        }
        if (faceTecCustomization.Code.captureScreenFocusMessageFont == null) {
            faceTecCustomization.Code.captureScreenFocusMessageFont = typeface2;
        }
        if (faceTecCustomization.V.buttonFont == null) {
            faceTecCustomization.V.buttonFont = typeface2;
        }
        if (faceTecCustomization.V.mainHeaderFont == null) {
            faceTecCustomization.V.mainHeaderFont = typeface;
        }
        if (faceTecCustomization.V.sectionHeaderFont == null) {
            faceTecCustomization.V.sectionHeaderFont = typeface;
        }
        if (faceTecCustomization.V.fieldLabelFont == null) {
            faceTecCustomization.V.fieldLabelFont = typeface2;
        }
        if (faceTecCustomization.V.fieldValueFont == null) {
            faceTecCustomization.V.fieldValueFont = typeface2;
        }
        if (faceTecCustomization.V.inputFieldFont == null) {
            faceTecCustomization.V.inputFieldFont = faceTecCustomization.V.fieldValueFont;
        }
        if (faceTecCustomization.V.inputFieldPlaceholderFont == null) {
            faceTecCustomization.V.inputFieldPlaceholderFont = faceTecCustomization.V.inputFieldFont;
        }
        return faceTecCustomization;
    }

    private static Code V(Context context, int i2) throws Throwable {
        TypedValue typedValue = new TypedValue();
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd(":H?NLGC\u000eDQQXJT[\u0016,YY`Rfc", (short) (OY.Xd() ^ 13531))).getMethod(Wg.Zd("\u0016`:d]:~n6s[8", (short) (C1580rY.Xd() ^ (-19586)), (short) (C1580rY.Xd() ^ (-16031))), new Class[0]);
            try {
                method.setAccessible(true);
                ((Resources) method.invoke(context, objArr)).getValue(i2, typedValue, true);
                return Code.RESOURCE;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception unused) {
            return Code.COLOR;
        }
    }

    static String V(az azVar) {
        if (FaceTecCustomization.f2849h != null) {
            return FaceTecCustomization.f2849h.get(azVar);
        }
        return null;
    }

    static String V(boolean z2) {
        String strZ = FaceTecSDK.V.D.readyScreenSubtextAttributedString;
        if (!strZ.isEmpty() && strZ.contains("\n")) {
            strZ = strZ.substring(strZ.indexOf("\n") + 1, strZ.length());
        }
        if (strZ.isEmpty()) {
            strZ = bb.Z(R.string.FaceTec_instructions_message_ready_2);
            if (strZ.contains("\n")) {
                strZ = strZ.substring(strZ.indexOf("\n") + 1, strZ.length());
            }
        }
        return (!z2 || FaceTecSDK.V.I || strZ.length() <= 50) ? strZ : strZ.substring(0, 50);
    }

    static void V(Drawable drawable, int i2) {
        if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i2);
        } else if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i2);
        } else if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(i2);
        }
    }

    static void V(Drawable drawable, int i2, int i3, double d2) {
        if (drawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            gradientDrawable.setStroke(i3, i2);
            gradientDrawable.setCornerRadius((float) d2);
        }
    }

    static void V(View view) {
        int iAW = aW();
        int i2 = AnonymousClass4.Z[V(view.getContext(), iAW).ordinal()];
        if (i2 == 1) {
            view.setBackgroundResource(iAW);
        } else {
            if (i2 != 2) {
                return;
            }
            view.setBackgroundColor(iAW);
        }
    }

    static void V(ProgressBar progressBar, Drawable drawable, Drawable drawable2) {
        int i2 = aZ().F.uploadProgressFillColor;
        int i3 = AnonymousClass4.Z[V(progressBar.getContext(), i2).ordinal()];
        if (i3 == 1) {
            ((GradientDrawable) drawable).setColor(ContextCompat.getColor(progressBar.getContext(), i2));
            ((GradientDrawable) drawable2).setColor(I(ContextCompat.getColor(progressBar.getContext(), i2), 0.5f));
        } else {
            if (i3 != 2) {
                return;
            }
            ((GradientDrawable) drawable).setColor(i2);
            ((GradientDrawable) drawable2).setColor(I(i2, 0.5f));
        }
    }

    static void V(TextView textView) {
        int i2 = aZ().Code.selectionScreenForegroundColor;
        int i3 = AnonymousClass4.Z[V(textView.getContext(), i2).ordinal()];
        if (i3 == 1) {
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), i2));
        } else {
            if (i3 != 2) {
                return;
            }
            textView.setTextColor(i2);
        }
    }

    private static void V(String str) {
        bu.I(String.format("FaceTec SDK Text Customization Alert: Your text is too long for the %s text element to render correctly on a significant portion of supported devices. Please update this text string to short, concise text, based on our default text element for optimal User Experience and Success Rates. If you continue with too many characters, the FaceTec SDK will not show the excess characters, and this will likely impact User Experience and Success Rates. These character limitations must be in place to ensure compatibility with the 1,000,000+ Device/Model/Platform/Version/Screen Size/Camera Res combinations that FaceTec supports.", str));
    }

    static int W() {
        return aZ().Code.buttonBackgroundHighlightColor;
    }

    static int X() {
        return aZ().V.buttonTextNormalColor;
    }

    static int Y() {
        return aZ().Code.buttonBackgroundDisabledColor;
    }

    static int Z() {
        return Math.round(ce.V(B) * Code() * V());
    }

    private static int Z(int i2) {
        if (FaceTecSDK.Z == FaceTecSDK.Code.LOW_LIGHT) {
            return -1;
        }
        return FaceTecSDK.Z == FaceTecSDK.Code.BRIGHT_LIGHT ? ViewCompat.MEASURED_STATE_MASK : i2;
    }

    static int Z(Context context) {
        return Code(context, Z(FaceTecSDK.V.Code.captureScreenBackgroundColor));
    }

    static String Z(boolean z2) {
        String strZ = FaceTecSDK.V.D.readyScreenHeaderAttributedString;
        if (!strZ.isEmpty() && strZ.contains("\n")) {
            strZ = strZ.substring(strZ.indexOf("\n") + 1, strZ.length());
        }
        if (strZ.isEmpty()) {
            strZ = bb.Z(R.string.FaceTec_instructions_header_ready_2);
            if (strZ.contains("\n")) {
                strZ = strZ.substring(strZ.indexOf("\n") + 1, strZ.length());
            }
        }
        return (!z2 || FaceTecSDK.V.I || strZ.length() <= 30) ? strZ : strZ.substring(0, 30);
    }

    static void Z(View view) {
        int iE = E();
        int i2 = AnonymousClass4.Z[V(view.getContext(), iE).ordinal()];
        if (i2 == 1) {
            view.setBackgroundColor(ContextCompat.getColor(view.getContext(), iE));
        } else if (i2 != 2) {
            view.setBackgroundColor(0);
        } else {
            view.setBackgroundColor(iE);
        }
    }

    static void Z(ProgressBar progressBar, Drawable drawable) {
        int i2 = aZ().F.uploadProgressTrackColor;
        int i3 = AnonymousClass4.Z[V(progressBar.getContext(), i2).ordinal()];
        if (i3 == 1) {
            ((GradientDrawable) drawable).setColor(ContextCompat.getColor(progressBar.getContext(), i2));
        } else {
            if (i3 != 2) {
                return;
            }
            ((GradientDrawable) drawable).setColor(i2);
        }
    }

    static void Z(TextView textView) {
        Context context = textView.getContext();
        int iAV = aV();
        int i2 = AnonymousClass4.Z[V(context, iAV).ordinal()];
        if (i2 == 1) {
            textView.setTextColor(ContextCompat.getColor(context, iAV));
        } else {
            if (i2 != 2) {
                return;
            }
            textView.setTextColor(iAV);
        }
    }

    static int a() {
        int i2 = FaceTecSDK.V.D.buttonBorderWidth == -1 ? 0 : FaceTecSDK.V.D.buttonBorderWidth;
        return Math.max(i2 != 0 ? 1 : 0, Math.round(i2 * Code()));
    }

    static int a(Context context) {
        return Code(context, aZ().D.readyScreenOvalFillColor);
    }

    static int aA() {
        int i2 = aZ().Code.selectionScreenBrandingImage;
        return i2 == 0 ? FaceTecSDK.V.Code.selectionScreenBrandingImage : i2;
    }

    static int aB() {
        return 255;
    }

    static int[] aC() {
        int[] iArr = aZ().D.retryScreenSlideshowImages;
        return iArr.length == 0 ? FaceTecSDK.V.D.retryScreenSlideshowImages : iArr;
    }

    static int aD() {
        return aZ().Code.customNFCStartingAnimation;
    }

    static int aE() {
        int i2 = aZ().F.resultAnimationUnsuccessBackgroundImage;
        return i2 == 0 ? FaceTecSDK.V.F.resultAnimationUnsuccessBackgroundImage : i2;
    }

    static int aF() {
        return aZ().Code.customNFCScanningAnimation;
    }

    static int aG() {
        return aZ().Code.customStaticNFCScanningAnimation;
    }

    static int aH() {
        return aZ().F.customActivityIndicatorAnimation;
    }

    static int aI() {
        return aZ().Code.customStaticNFCStartingAnimation;
    }

    static int aJ() {
        return aZ().Code.customNFCSkipOrErrorAnimation;
    }

    static int aK() {
        return aZ().Code.customStaticNFCSkipOrErrorAnimation;
    }

    static int aL() {
        return aZ().F.customResultAnimationSuccess;
    }

    static int aM() {
        return aZ().F.customStaticResultAnimationUnsuccess;
    }

    static int aN() {
        return aZ().F.customStaticResultAnimationSuccess;
    }

    static int aO() {
        return aZ().F.customResultAnimationUnsuccess;
    }

    static float aP() {
        return Math.min(Math.max(FaceTecSDK.V.F.animationRelativeScale, 0.5f), 2.0f);
    }

    static boolean aQ() {
        return (FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.DISABLED || FaceTecSDK.V.f2853d.V == FaceTecCancelButtonCustomization.ButtonLocation.CUSTOM) ? false : true;
    }

    static void aR() {
        aU();
        aT();
        aS();
        aY();
        String strL = L(false);
        String strS = S(false);
        String strF = F(false);
        if (strL != null && strL.length() > 40) {
            V("Retry Screen Instruction Message 1");
        }
        if (strS != null && strS.length() > 40) {
            V("Retry Screen Instruction Message 2");
        }
        if (strF != null && strF.length() > 40) {
            V("Retry Screen Instruction Message 3");
        }
        String strE = e(false);
        String strD = D(false);
        if (strE != null && strE.length() > 20) {
            V("Retry Screen Your Image Label");
        }
        if (strD == null || strD.length() <= 20) {
            return;
        }
        V("Retry Screen Ideal Image Label");
    }

    static void aS() {
        String strI = I(false);
        if (strI.length() > 30) {
            V("Retry Screen Header");
        } else if (strI.length() > 20) {
            Code("Retry Screen Header");
        }
    }

    static void aT() {
        String strCode = Code(false);
        String strV = V(false);
        if (strCode.length() > 50) {
            V("Ready Screen Subtext Line 1");
        }
        if (strV.length() > 50) {
            V("Ready Screen Subtext Line 2");
        }
    }

    static void aU() {
        String strB = B(false);
        String strZ = Z(false);
        if (strB.length() > 30) {
            V("Ready Screen Header Line 1");
        }
        if (strZ.length() > 30) {
            V("Ready Screen Header Line 2");
        }
    }

    private static int aV() {
        return aZ().D.foregroundColor;
    }

    private static int aW() {
        return Z(FaceTecSDK.V.S.backgroundColor);
    }

    static void aY() {
        if (C(false).length() > 40) {
            V("Retry Screen Sub-Header Message");
        }
    }

    private static FaceTecCustomization aZ() {
        return FaceTecSDK.Z() ? FaceTecSDK.B : FaceTecSDK.B() ? FaceTecSDK.Code : FaceTecSDK.V;
    }

    static int aa() {
        return aZ().Code.buttonBorderColor;
    }

    static int ab() {
        return aZ().V.buttonTextHighlightColor;
    }

    static int ac() {
        return aZ().V.buttonBackgroundNormalColor;
    }

    static int ad() {
        return aZ().V.buttonTextDisabledColor;
    }

    static int ae() {
        return aZ().V.buttonBackgroundHighlightColor;
    }

    static int af() {
        return aZ().V.buttonBorderColor;
    }

    static int ag() {
        return aZ().V.buttonBackgroundDisabledColor;
    }

    static int ah() {
        return aZ().V.fieldValueTextColor;
    }

    static int ai() {
        return aZ().V.sectionHeaderTextColor;
    }

    static int aj() {
        return aZ().V.mainHeaderDividerLineColor;
    }

    static int ak() {
        return aZ().V.mainHeaderTextColor;
    }

    static int al() {
        return aZ().V.fieldLabelTextColor;
    }

    static int am() {
        int i2 = aZ().V.inputFieldTextColor;
        return i2 == 0 ? ah() : i2;
    }

    static int an() {
        return aZ().V.inputFieldBackgroundColor;
    }

    static int ao() {
        return aZ().Code.reviewScreenTextBackgroundColor;
    }

    static int ap() {
        return aZ().Code.reviewScreenTextBackgroundBorderColor;
    }

    static int aq() {
        return aZ().V.inputFieldBorderColor;
    }

    static int ar() {
        int i2 = aZ().Code.activeTorchButtonImage;
        return i2 == 0 ? FaceTecSDK.V.Code.activeTorchButtonImage : i2;
    }

    static int as() {
        return aZ().Code.captureScreenTextBackgroundBorderColor;
    }

    static int at() {
        int i2 = aZ().Code.inactiveTorchButtonImage;
        return i2 == 0 ? FaceTecSDK.V.Code.inactiveTorchButtonImage : i2;
    }

    static int au() {
        return aZ().Code.captureScreenTextBackgroundColor;
    }

    static int av() {
        int i2 = aZ().C.brandingImage;
        return i2 == 0 ? FaceTecSDK.V.C.brandingImage : i2;
    }

    static int aw() {
        int i2 = aZ().F.resultAnimationSuccessBackgroundImage;
        return i2 == 0 ? FaceTecSDK.V.F.resultAnimationSuccessBackgroundImage : i2;
    }

    static int ax() {
        int i2 = aZ().F.customActivityIndicatorImage;
        return i2 == 0 ? FaceTecSDK.V.F.customActivityIndicatorImage : i2;
    }

    static int ay() {
        int i2 = aZ().f2853d.customImage;
        return i2 == 0 ? FaceTecSDK.V.f2853d.customImage : i2;
    }

    static int az() {
        int i2 = aZ().Code.selectionScreenDocumentImage;
        return i2 == 0 ? FaceTecSDK.V.Code.selectionScreenDocumentImage : i2;
    }

    static int b() {
        int i2 = FaceTecSDK.V.V.mainHeaderDividerLineWidth == -1 ? 2 : FaceTecSDK.V.V.mainHeaderDividerLineWidth;
        return Math.max(i2 == 0 ? 0 : 1, Math.round(i2 * Code()));
    }

    static int b(Context context) {
        return Code(context, aZ().F.resultAnimationBackgroundColor);
    }

    static int c() {
        int i2 = FaceTecSDK.V.V.inputFieldBorderWidth == -1 ? 1 : FaceTecSDK.V.V.inputFieldBorderWidth;
        return Math.max(i2 == 0 ? 0 : 1, Math.round(i2 * Code()));
    }

    static int c(Context context) {
        return Code(Code(context, aZ().f2852c.strokeColor), 255);
    }

    static int d() {
        int i2 = FaceTecSDK.V.V.buttonBorderWidth == -1 ? 0 : FaceTecSDK.V.V.buttonBorderWidth;
        return Math.max(i2 != 0 ? 1 : 0, Math.round(i2 * Code()));
    }

    static int d(Context context) {
        return Code(context, aZ().F.resultAnimationForegroundColor);
    }

    static int e() {
        int i2 = FaceTecSDK.V.Code.buttonBorderWidth == -1 ? 0 : FaceTecSDK.V.Code.buttonBorderWidth;
        return Math.max(i2 != 0 ? 1 : 0, Math.round(i2 * Code()));
    }

    static int e(Context context) {
        return Code(Code(context, aW()), 255);
    }

    static String e(boolean z2) {
        String strZ = bb.Z(R.string.FaceTec_retry_your_image_label);
        return (!z2 || FaceTecSDK.V.I || strZ == null || strZ.length() <= 20) ? strZ : strZ.substring(0, 20);
    }

    static int f() {
        int i2 = FaceTecSDK.V.f2852c.strokeWidth == -1 ? 6 : FaceTecSDK.V.f2852c.strokeWidth;
        return Math.max(i2 == 0 ? 0 : 1, Math.round(i2 * Code()));
    }

    static int f(Context context) {
        return Code(context, aZ().D.retryScreenImageBorderColor);
    }

    static int g() {
        int i2 = FaceTecSDK.V.f2852c.progressStrokeWidth == -1 ? 6 : FaceTecSDK.V.f2852c.progressStrokeWidth;
        return Math.max(i2 == 0 ? 0 : 1, Math.round(i2 * Code()));
    }

    private static int g(Context context) {
        return Code(context, aV());
    }

    static int h() {
        int i2 = FaceTecSDK.V.Code.captureFrameStrokeWidth == -1 ? 2 : FaceTecSDK.V.Code.captureFrameStrokeWidth;
        return Math.max(i2 == 0 ? 0 : 1, Math.round(i2 * Code()));
    }

    static GradientDrawable h(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i2 = aZ().L.backgroundColors;
        int i3 = AnonymousClass4.Z[V(context, i2).ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                gradientDrawable.setColor(i2);
            }
        } else if (ContextCompat.getDrawable(context, i2) instanceof GradientDrawable) {
            gradientDrawable = (GradientDrawable) ContextCompat.getDrawable(context, i2);
        } else {
            gradientDrawable.setColor(ContextCompat.getColor(context, i2));
        }
        gradientDrawable.setCornerRadius(ce.V((int) (Math.round((FaceTecSDK.V.L.cornerRadius == -1 ? 3 : FaceTecSDK.V.L.cornerRadius) * Code()) * V())));
        return gradientDrawable;
    }

    static int i() {
        int i2 = FaceTecSDK.V.Code.reviewScreenTextBackgroundBorderWidth == -1 ? 0 : FaceTecSDK.V.Code.reviewScreenTextBackgroundBorderWidth;
        return Math.max(i2 != 0 ? 1 : 0, Math.round(i2 * Code()));
    }

    static Drawable i(Context context) {
        int iG = G();
        if (AnonymousClass4.Z[V(context, iG).ordinal()] == 1) {
            if (ContextCompat.getDrawable(context, iG) == null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(Code(ContextCompat.getColor(context, iG), 255));
                return gradientDrawable;
            }
            Drawable drawableMutate = ContextCompat.getDrawable(context, iG).mutate();
            if (drawableMutate instanceof ShapeDrawable) {
                ((ShapeDrawable) drawableMutate).getPaint().setAlpha(255);
                return drawableMutate;
            }
            if (drawableMutate instanceof GradientDrawable) {
                return V(context, (GradientDrawable) drawableMutate);
            }
            if (drawableMutate instanceof ColorDrawable) {
                drawableMutate.setAlpha(255);
                return drawableMutate;
            }
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Code(iG, 255));
        return gradientDrawable2;
    }

    static int j() {
        int i2 = FaceTecSDK.V.Code.captureScreenTextBackgroundBorderWidth == -1 ? 0 : FaceTecSDK.V.Code.captureScreenTextBackgroundBorderWidth;
        return Math.max(i2 != 0 ? 1 : 0, Math.round(i2 * Code()));
    }

    static int j(Context context) {
        return Code(context, aZ().D.retryScreenOvalStrokeColor);
    }

    static int k() {
        return Math.round((FaceTecSDK.V.D.readyScreenTextBackgroundCornerRadius == -1 ? 6 : FaceTecSDK.V.D.readyScreenTextBackgroundCornerRadius) * Code());
    }

    static int l() {
        return Math.round((FaceTecSDK.V.Code.captureScreenTextBackgroundCornerRadius == -1 ? 6 : FaceTecSDK.V.Code.captureScreenTextBackgroundCornerRadius) * Code());
    }

    static int m() {
        return Math.round((FaceTecSDK.V.Code.reviewScreenTextBackgroundCornerRadius == -1 ? 6 : FaceTecSDK.V.Code.reviewScreenTextBackgroundCornerRadius) * Code());
    }

    static int n() {
        return Math.round((FaceTecSDK.V.D.retryScreenImageCornerRadius == -1 ? 10 : FaceTecSDK.V.D.retryScreenImageCornerRadius) * Code());
    }

    static int o() {
        return Math.round((FaceTecSDK.V.S.cornerRadius == -1 ? 20 : FaceTecSDK.V.S.cornerRadius) * Code());
    }

    static int p() {
        return Math.round((FaceTecSDK.V.Code.buttonCornerRadius == -1 ? 8 : FaceTecSDK.V.Code.buttonCornerRadius) * Code());
    }

    static int q() {
        return Math.round((FaceTecSDK.V.V.inputFieldCornerRadius == -1 ? 3 : FaceTecSDK.V.V.inputFieldCornerRadius) * Code());
    }

    static int r() {
        return Math.round((FaceTecSDK.V.Code.captureFrameCornerRadius == -1 ? 12 : FaceTecSDK.V.Code.captureFrameCornerRadius) * Code());
    }

    static int s() {
        return Math.round((FaceTecSDK.V.D.buttonCornerRadius == -1 ? 8 : FaceTecSDK.V.D.buttonCornerRadius) * Code());
    }

    static int t() {
        return Math.round((FaceTecSDK.V.V.buttonCornerRadius == -1 ? 8 : FaceTecSDK.V.V.buttonCornerRadius) * Code());
    }

    static Typeface u() {
        Typeface typeface = FaceTecSDK.V.D.retryScreenHeaderFont;
        return typeface == null ? FaceTecSDK.V.D.headerFont : typeface;
    }

    static int v() {
        return aZ().F.foregroundColor;
    }

    static Typeface w() {
        Typeface typeface = FaceTecSDK.V.D.retryScreenSubtextFont;
        return typeface == null ? FaceTecSDK.V.D.subtextFont : typeface;
    }

    static Typeface x() {
        Typeface typeface = FaceTecSDK.V.D.readyScreenHeaderFont;
        return typeface == null ? FaceTecSDK.V.D.headerFont : typeface;
    }

    static Typeface y() {
        Typeface typeface = FaceTecSDK.V.D.readyScreenSubtextFont;
        return typeface == null ? FaceTecSDK.V.D.subtextFont : typeface;
    }

    static int z() {
        return aZ().F.activityIndicatorColor;
    }
}
