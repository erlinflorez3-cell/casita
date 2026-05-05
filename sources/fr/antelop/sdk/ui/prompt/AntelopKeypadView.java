package fr.antelop.sdk.ui.prompt;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.a.l;
import o.d.d;
import o.n.a;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public final class AntelopKeypadView extends a {
    private final Theming theming;

    public interface KeypadCallback {
        void onExtraButtonPressed();

        void onKeyPressed();

        void onPasscodeEntryDone(byte[] bArr);
    }

    static final class Theming extends a.e {
        final boolean enableOverlayProtection;
        final String overlayWarningMessage;
        final boolean randomizeKeyboard;

        Theming(String str, boolean z2, boolean z3, int i2, int i3, String str2, String str3, int i4, int i5, int i6, String str4, String str5, int i7, String str6, String str7, Boolean bool) {
            super(i2, i3, i4, i5, str2, str3, R.style.antelopKeypadViewKeyboardDigitStyle, R.style.antelopKeypadViewKeyboardAlphaStyle, R.style.antelopKeypadViewKeyboardBackgroundStyle, i6, i7, str6, str7, str4, str5, bool.booleanValue());
            this.overlayWarningMessage = str;
            this.enableOverlayProtection = z2;
            this.randomizeKeyboard = z3;
        }
    }

    public AntelopKeypadView(Context context) {
        super(context);
        this.theming = init(context, null);
    }

    public AntelopKeypadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.theming = init(context, attributeSet);
    }

    public AntelopKeypadView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.theming = init(context, attributeSet);
    }

    public AntelopKeypadView(Context context, String str, boolean z2, boolean z3, int i2, int i3, String str2, String str3, int i4, int i5, int i6, String str4, String str5, int i7, String str6, String str7) throws Throwable {
        super(context);
        Class<?> cls = Class.forName(C1626yg.Ud("\u001e+5R\u0019\u001e\u000b7p6\u0010\f|\\F7\tXg^_Vu", (short) (Od.Xd() ^ (-16933)), (short) (Od.Xd() ^ (-20056))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-7986));
        int[] iArr = new int["{Q,h\u0012B`\u001d>\"$\u0012".length()];
        QB qb = new QB("{Q,h\u0012B`\u001d>\"$\u0012");
        int i8 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i8] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ (sXd + i8)));
            i8++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i8), clsArr);
        try {
            method.setAccessible(true);
            boolean z4 = ((Resources) method.invoke(context, objArr)).getBoolean(R.bool.antelopKeypadViewDefaultShowAlpha);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(EO.Od("m2V\u0005*hOYeuv\u0017RQ\f_![\u0013Ah$B", (short) (C1607wl.Xd() ^ OlympusMakernoteDirectory.TAG_EXTERNAL_FLASH_MODE))).getMethod(C1561oA.Qd("OLZ7IVQVRBCP", (short) (Od.Xd() ^ (-9181))), new Class[0]);
            try {
                method2.setAccessible(true);
                int color = ((Resources) method2.invoke(context, objArr2)).getColor(i4);
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1593ug.zd("\u0015#\u001a)'\"\u001eh\u001f,,3%/6p\u000744;-A>", (short) (C1607wl.Xd() ^ 26193), (short) (C1607wl.Xd() ^ 9749))).getMethod(C1561oA.od("# .\u000b\u001d*%*&\u0016\u0017$", (short) (C1633zX.Xd() ^ (-6419))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    this.theming = new Theming(str, z2, z3, i2, i3, str2, str3, color, ((Resources) method3.invoke(context, objArr3)).getColor(i5), i6, str4, str5, i7, str6, str7, Boolean.valueOf(z4));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private Theming init(Context context, AttributeSet attributeSet) throws Throwable {
        String string;
        String str;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u0010\u001d\u001d$\u0016 'aw%%,\u001e2/", (short) (C1633zX.Xd() ^ (-24639)))).getMethod(Wg.Zd("5\u0005\u0001OPO8/\u001a{ji", (short) (ZN.Xd() ^ 32449), (short) (ZN.Xd() ^ 15903)), new Class[0]);
        try {
            method.setAccessible(true);
            String string2 = ((Resources) method.invoke(context, objArr)).getString(R.string.antelopKeypadViewDefaultOverlayWarningMessage);
            Class<?> cls = Class.forName(C1561oA.Xd("gul{ytp;q~~\u0006w\u0002\tCY\u0007\u0007\u000e\u007f\u0014\u0011", (short) (OY.Xd() ^ 27606)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 15172);
            int[] iArr = new int["wt\u0007cy\u0007\u0006\u000b\u000bz\u007f\r".length()];
            QB qb = new QB("wt\u0007cy\u0007\u0006\u000b\u000bz\u007f\r");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method2.setAccessible(true);
                boolean z2 = ((Resources) method2.invoke(context, objArr2)).getBoolean(R.bool.antelopKeypadViewDefaultEnableOverlayProtection);
                short sXd2 = (short) (C1633zX.Xd() ^ (-15304));
                short sXd3 = (short) (C1633zX.Xd() ^ (-14261));
                int[] iArr2 = new int["UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR".length()];
                QB qb2 = new QB("UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                    i3++;
                }
                Class<?> cls2 = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd4 = (short) (C1633zX.Xd() ^ (-29511));
                short sXd5 = (short) (C1633zX.Xd() ^ (-22613));
                int[] iArr3 = new int["liwTfsnso_`m".length()];
                QB qb3 = new QB("liwTfsnso_`m");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                    i4++;
                }
                Method method3 = cls2.getMethod(new String(iArr3, 0, i4), clsArr2);
                try {
                    method3.setAccessible(true);
                    boolean z3 = ((Resources) method3.invoke(context, objArr3)).getBoolean(R.bool.antelopKeypadViewDefaultRandomizeKeyboard);
                    short sXd6 = (short) (C1633zX.Xd() ^ (-4246));
                    int[] iArr4 = new int["UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR".length()];
                    QB qb4 = new QB("UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4));
                        i5++;
                    }
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(new String(iArr4, 0, i5)).getMethod(C1561oA.yd("\u001f\u001e.\r\u0019(%,\"\u0014\u0017&", (short) (C1499aX.Xd() ^ (-17024))), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        int integer = ((Resources) method4.invoke(context, objArr4)).getInteger(R.integer.antelopKeypadViewDefaultPinLength);
                        int resourceId = R.drawable.antelopKeypadViewDefaultBulletIcon;
                        Object[] objArr5 = new Object[0];
                        Method method5 = Class.forName(C1561oA.Yd(".<3B@;7\u00028EEL>HO\n MMTFZW", (short) (C1607wl.Xd() ^ 30457))).getMethod(Xg.qd("VUeDXgdki[^m", (short) (FB.Xd() ^ 31099), (short) (FB.Xd() ^ 29820)), new Class[0]);
                        try {
                            method5.setAccessible(true);
                            String string3 = ((Resources) method5.invoke(context, objArr5)).getString(R.string.antelopKeypadViewDefaultDigitsCounterAccessibilityLabel);
                            short sXd7 = (short) (OY.Xd() ^ 30699);
                            short sXd8 = (short) (OY.Xd() ^ 15949);
                            int[] iArr5 = new int["d)R\u001cT\u000685*m$]\u0012N\b|M5g%U\u001cO".length()];
                            QB qb5 = new QB("d)R\u001cT\u000685*m$]\u0012N\b|M5g%U\u001cO");
                            int i6 = 0;
                            while (qb5.YK()) {
                                int iKK5 = qb5.KK();
                                Xu xuXd5 = Xu.Xd(iKK5);
                                iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - ((i6 * sXd8) ^ sXd7));
                                i6++;
                            }
                            Object[] objArr6 = new Object[0];
                            Method method6 = Class.forName(new String(iArr5, 0, i6)).getMethod(ZO.xd("n\u0019OD8w!e\u0011\u001d~e", (short) (C1633zX.Xd() ^ (-15458)), (short) (C1633zX.Xd() ^ (-20376))), new Class[0]);
                            try {
                                method6.setAccessible(true);
                                String string4 = ((Resources) method6.invoke(context, objArr6)).getString(R.string.antelopKeypadViewDefaultDigitsCounterAccessibilityValueFormat);
                                Class<?> cls3 = Class.forName(C1626yg.Ud("7\u0015\u001b)M\u00013 kyXa\u0005U/3i\u0007I\u0004IM,", (short) (Od.Xd() ^ (-25520)), (short) (Od.Xd() ^ (-26608))));
                                Class<?>[] clsArr3 = new Class[0];
                                Object[] objArr7 = new Object[0];
                                short sXd9 = (short) (ZN.Xd() ^ 1461);
                                int[] iArr6 = new int["$m\t\u0018a+|\u0001'IC]".length()];
                                QB qb6 = new QB("$m\t\u0018a+|\u0001'IC]");
                                int i7 = 0;
                                while (qb6.YK()) {
                                    int iKK6 = qb6.KK();
                                    Xu xuXd6 = Xu.Xd(iKK6);
                                    iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd9 + i7)));
                                    i7++;
                                }
                                Method method7 = cls3.getMethod(new String(iArr6, 0, i7), clsArr3);
                                try {
                                    method7.setAccessible(true);
                                    int color = ((Resources) method7.invoke(context, objArr7)).getColor(R.color.antelopKeypadViewDefaultColorPrimary);
                                    Object[] objArr8 = new Object[0];
                                    Method method8 = Class.forName(EO.Od("\nf,\u001d\f*SG3.1\u0013nowM/K%%L6V", (short) (C1633zX.Xd() ^ (-1055)))).getMethod(C1561oA.Qd("&#1\u000e -(-)\u0019\u001a'", (short) (C1607wl.Xd() ^ 13092)), new Class[0]);
                                    try {
                                        method8.setAccessible(true);
                                        int color2 = ((Resources) method8.invoke(context, objArr8)).getColor(R.color.antelopKeypadViewDefaultColorSecondary);
                                        int resourceId2 = R.drawable.antelopKeypadViewDefaultDeleteButtonIcon;
                                        short sXd10 = (short) (Od.Xd() ^ (-871));
                                        short sXd11 = (short) (Od.Xd() ^ (-20745));
                                        int[] iArr7 = new int["\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB".length()];
                                        QB qb7 = new QB("\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB");
                                        int i8 = 0;
                                        while (qb7.YK()) {
                                            int iKK7 = qb7.KK();
                                            Xu xuXd7 = Xu.Xd(iKK7);
                                            iArr7[i8] = xuXd7.fK((xuXd7.CK(iKK7) - (sXd10 + i8)) - sXd11);
                                            i8++;
                                        }
                                        Object[] objArr9 = new Object[0];
                                        Method method9 = Class.forName(new String(iArr7, 0, i8)).getMethod(C1561oA.od("ro}Zlytyuefs", (short) (C1607wl.Xd() ^ 27292)), new Class[0]);
                                        try {
                                            method9.setAccessible(true);
                                            String string5 = ((Resources) method9.invoke(context, objArr9)).getString(R.string.antelopKeypadViewDefaultDeleteButtonAccessibilityLabel);
                                            Object[] objArr10 = new Object[0];
                                            Method method10 = Class.forName(C1561oA.Kd("CQHWUPL\u0017MZZaS]d\u001f5bbi[ol", (short) (C1499aX.Xd() ^ (-5147)))).getMethod(Wg.Zd("y\u000435h\u0013/Yf\u0004$f", (short) (OY.Xd() ^ 13085), (short) (OY.Xd() ^ 3707)), new Class[0]);
                                            try {
                                                method10.setAccessible(true);
                                                String string6 = ((Resources) method10.invoke(context, objArr10)).getString(R.string.antelopKeypadViewDefaultDeleteButtonAccessibilityHint);
                                                Object[] objArr11 = new Object[0];
                                                Method method11 = Class.forName(C1561oA.Xd("LZQ`^YU Vccj\\fm(>kkrdxu", (short) (C1633zX.Xd() ^ (-8683)))).getMethod(Wg.vd("~}\u000elx\b\u0005\f\u0002sv\u0006", (short) (FB.Xd() ^ 21824)), new Class[0]);
                                                try {
                                                    method11.setAccessible(true);
                                                    boolean z4 = ((Resources) method11.invoke(context, objArr11)).getBoolean(R.bool.antelopKeypadViewDefaultShowAlpha);
                                                    int resourceId3 = 0;
                                                    if (attributeSet == null) {
                                                        string = "";
                                                        str = string;
                                                    } else {
                                                        Class<?> cls4 = Class.forName(Qg.kd("\u001c(\u001d*&\u001f\u0019a\u0016!\u001f$\u0014\u001c!Ym\u0019\u0017\u001c\f\u001e\u0019", (short) (C1633zX.Xd() ^ (-30852)), (short) (C1633zX.Xd() ^ (-15438))));
                                                        Class<?>[] clsArr4 = new Class[0];
                                                        Object[] objArr12 = new Object[0];
                                                        short sXd12 = (short) (C1633zX.Xd() ^ (-26111));
                                                        short sXd13 = (short) (C1633zX.Xd() ^ (-19198));
                                                        int[] iArr8 = new int["ro}\\okri".length()];
                                                        QB qb8 = new QB("ro}\\okri");
                                                        int i9 = 0;
                                                        while (qb8.YK()) {
                                                            int iKK8 = qb8.KK();
                                                            Xu xuXd8 = Xu.Xd(iKK8);
                                                            iArr8[i9] = xuXd8.fK(sXd12 + i9 + xuXd8.CK(iKK8) + sXd13);
                                                            i9++;
                                                        }
                                                        Method method12 = cls4.getMethod(new String(iArr8, 0, i9), clsArr4);
                                                        try {
                                                            method12.setAccessible(true);
                                                            TypedArray typedArrayObtainStyledAttributes = ((Resources.Theme) method12.invoke(context, objArr12)).obtainStyledAttributes(attributeSet, R.styleable.AntelopKeypadView, 0, 0);
                                                            String string7 = typedArrayObtainStyledAttributes.getString(R.styleable.AntelopKeypadView_antelopKeypadViewOverlayWarningMessage);
                                                            if (string7 == null) {
                                                                string7 = string2;
                                                            }
                                                            z2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AntelopKeypadView_antelopKeypadViewEnableOverlayProtection, z2);
                                                            z3 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AntelopKeypadView_antelopKeypadViewRandomizeKeyboard, z3);
                                                            integer = typedArrayObtainStyledAttributes.getInt(R.styleable.AntelopKeypadView_antelopKeypadViewPinLength, integer);
                                                            resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AntelopKeypadView_antelopKeypadViewBulletDrawable, resourceId);
                                                            String string8 = typedArrayObtainStyledAttributes.getString(R.styleable.AntelopKeypadView_antelopKeypadViewDigitsCounterAccessibilityMessage);
                                                            if (string8 == null) {
                                                                string8 = string3;
                                                            }
                                                            String string9 = typedArrayObtainStyledAttributes.getString(R.styleable.AntelopKeypadView_antelopKeypadViewDigitsCounterAccessibilityValueFormatMessage);
                                                            if (string9 != null) {
                                                                string4 = string9;
                                                            }
                                                            color = typedArrayObtainStyledAttributes.getColor(R.styleable.AntelopKeypadView_antelopKeypadViewColorPrimary, color);
                                                            color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.AntelopKeypadView_antelopKeypadViewColorSecondary, color2);
                                                            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AntelopKeypadView_antelopKeypadViewDeleteDrawable, resourceId2);
                                                            String string10 = typedArrayObtainStyledAttributes.getString(R.styleable.AntelopKeypadView_antelopKeypadViewDeleteAccessibilityLabelMessage);
                                                            if (string10 != null) {
                                                                string5 = string10;
                                                            }
                                                            String string11 = typedArrayObtainStyledAttributes.getString(R.styleable.AntelopKeypadView_antelopKeypadViewDeleteAccessibilityHintMessage);
                                                            if (string11 != null) {
                                                                string6 = string11;
                                                            }
                                                            resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AntelopKeypadView_antelopKeypadViewExtraDrawable, 0);
                                                            string = typedArrayObtainStyledAttributes.getString(R.styleable.AntelopKeypadView_antelopKeypadViewExtraAccessibilityLabelMessage);
                                                            if (string == null) {
                                                                string = "";
                                                            }
                                                            String string12 = typedArrayObtainStyledAttributes.getString(R.styleable.AntelopKeypadView_antelopKeypadViewExtraAccessibilityHintMessage);
                                                            str = string12 != null ? string12 : "";
                                                            typedArrayObtainStyledAttributes.recycle();
                                                            string2 = string7;
                                                            string3 = string8;
                                                        } catch (InvocationTargetException e2) {
                                                            throw e2.getCause();
                                                        }
                                                    }
                                                    return new Theming(string2, z2, z3, integer, resourceId, string3, string4, color, color2, resourceId2, string5, string6, resourceId3, string, str, Boolean.valueOf(z4));
                                                } catch (InvocationTargetException e3) {
                                                    throw e3.getCause();
                                                }
                                            } catch (InvocationTargetException e4) {
                                                throw e4.getCause();
                                            }
                                        } catch (InvocationTargetException e5) {
                                            throw e5.getCause();
                                        }
                                    } catch (InvocationTargetException e6) {
                                        throw e6.getCause();
                                    }
                                } catch (InvocationTargetException e7) {
                                    throw e7.getCause();
                                }
                            } catch (InvocationTargetException e8) {
                                throw e8.getCause();
                            }
                        } catch (InvocationTargetException e9) {
                            throw e9.getCause();
                        }
                    } catch (InvocationTargetException e10) {
                        throw e10.getCause();
                    }
                } catch (InvocationTargetException e11) {
                    throw e11.getCause();
                }
            } catch (InvocationTargetException e12) {
                throw e12.getCause();
            }
        } catch (InvocationTargetException e13) {
            throw e13.getCause();
        }
    }

    @Override // o.ec.c
    public final void enableOverlayProtection(String str) {
        super.enableOverlayProtection(str);
    }

    public final void initializeView(final KeypadCallback keypadCallback) throws Throwable {
        if (this.theming.enableOverlayProtection) {
            enableOverlayProtection(this.theming.overlayWarningMessage);
        }
        super.initializeView(new a.b() { // from class: fr.antelop.sdk.ui.prompt.AntelopKeypadView.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int[] f19579a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f19580b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static char f19581c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f19582d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static char[] f19583e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static int f19584f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static int f19585g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static int f19586h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static int f19587i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static int f19588j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public static int f19589k = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(short r9, int r10, int r11) {
                /*
                    byte[] r8 = fr.antelop.sdk.ui.prompt.AntelopKeypadView.AnonymousClass1.$$c
                    int r0 = r9 * 4
                    int r7 = 1 - r0
                    int r0 = r10 * 4
                    int r6 = 3 - r0
                    int r0 = 121 - r11
                    byte[] r5 = new byte[r7]
                    r4 = 0
                    if (r8 != 0) goto L2a
                    r2 = r7
                    r3 = r4
                L13:
                    int r0 = -r0
                    int r0 = r0 + r2
                    r2 = r3
                L16:
                    int r6 = r6 + 1
                    byte r1 = (byte) r0
                    int r3 = r2 + 1
                    r5[r2] = r1
                    if (r3 != r7) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L25:
                    r1 = r8[r6]
                    r2 = r0
                    r0 = r1
                    goto L13
                L2a:
                    r2 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.ui.prompt.AntelopKeypadView.AnonymousClass1.$$e(short, int, int):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f19589k = 848273012;
                f19587i = -2023087361;
                f19585g = -468005021;
                f19584f = -1313697661;
                init$0();
                f19586h = 0;
                f19588j = 1;
                f19580b = 0;
                f19582d = 1;
                a();
                f19583e = new char[]{64532};
                f19581c = (char) 51646;
                int i2 = f19588j + 113;
                f19586h = i2 % 128;
                int i3 = i2 % 2;
            }

            static void a() {
                f19579a = new int[]{2084021496, 1340127663, 1738109403, -572593700, 2063273441, 116149689, 327464461, 733717138, 1197648179, 763886548, -1861686410, -151040587, -283894843, 1107697488, -361724204, -1237321560, 1596685190, -1406512740};
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(Unknown Source)
                	at java.base/java.util.TreeMap.lastKey(Unknown Source)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] e(android.content.Context r21, int r22, int r23, int r24) {
                /*
                    Method dump skipped, instruction units count: 1756
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.ui.prompt.AntelopKeypadView.AnonymousClass1.e(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{38, Ascii.CAN, 67, -113};
                $$b = 250;
            }

            static void init$1() {
                $$c = new byte[]{93, -2, -4, -85};
                $$d = 246;
            }

            private static void l(int[] iArr, int i2, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                l lVar = new l();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = f19579a;
                long j2 = 0;
                int i5 = 989264422;
                int i6 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $10 + 79;
                        $11 = i8 % 128;
                        int i9 = i8 % i3;
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                            Object objA = d.a(i5);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = d.a((ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)) + 676, (char) KeyEvent.normalizeMetaState(0), 12 - KeyEvent.normalizeMetaState(0), -328001469, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                            i7++;
                            i3 = 2;
                            j2 = 0;
                            i5 = 989264422;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = f19579a;
                char c2 = '0';
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i10 = $10 + 9;
                    $11 = i10 % 128;
                    int i11 = 2;
                    int i12 = i10 % 2;
                    int i13 = 0;
                    while (i13 < length3) {
                        int i14 = $10 + 113;
                        $11 = i14 % 128;
                        if (i14 % i11 == 0) {
                            Object[] objArr3 = {Integer.valueOf(iArr5[i13])};
                            Object objA2 = d.a(989264422);
                            if (objA2 == null) {
                                byte b4 = (byte) i6;
                                byte b5 = b4;
                                objA2 = d.a(674 - TextUtils.indexOf("", c2, i6, i6), (char) (TypedValue.complexToFraction(i6, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i6, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 12, -328001469, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            iArr6[i13] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                            i13 >>= 1;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                            Object objA3 = d.a(989264422);
                            if (objA3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objA3 = d.a(675 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.MeasureSpec.getSize(0) + 12, -328001469, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE});
                            }
                            iArr6[i13] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                            i13++;
                        }
                        c2 = '0';
                        i6 = 0;
                        i11 = 2;
                    }
                    int i15 = $11 + 97;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    iArr5 = iArr6;
                    i6 = 0;
                }
                System.arraycopy(iArr5, i6, iArr4, i6, length2);
                lVar.f19941d = i6;
                while (lVar.f19941d < iArr.length) {
                    cArr[i6] = (char) (iArr[lVar.f19941d] >> 16);
                    cArr[1] = (char) iArr[lVar.f19941d];
                    cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                    cArr[3] = (char) iArr[lVar.f19941d + 1];
                    lVar.f19942e = (cArr[0] << 16) + cArr[1];
                    lVar.f19940a = (cArr[2] << 16) + cArr[3];
                    l.a(iArr4);
                    for (int i17 = 0; i17 < 16; i17++) {
                        lVar.f19942e ^= iArr4[i17];
                        Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                        Object objA4 = d.a(2098218801);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            objA4 = d.a(302 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (52697 - Color.alpha(0)), 12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1416256172, false, $$e(b8, b8, (byte) (-$$c[1])), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue;
                    }
                    int i18 = lVar.f19942e;
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = i18;
                    lVar.f19940a ^= iArr4[16];
                    lVar.f19942e ^= iArr4[17];
                    int i19 = lVar.f19942e;
                    int i20 = lVar.f19940a;
                    cArr[0] = (char) (lVar.f19942e >>> 16);
                    cArr[1] = (char) lVar.f19942e;
                    cArr[2] = (char) (lVar.f19940a >>> 16);
                    cArr[3] = (char) lVar.f19940a;
                    l.a(iArr4);
                    cArr2[lVar.f19941d * 2] = cArr[0];
                    cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                    cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                    cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                    Object[] objArr6 = {lVar, lVar};
                    Object objA5 = d.a(986820978);
                    if (objA5 == null) {
                        byte b9 = (byte) 0;
                        objA5 = d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 228, (char) (51003 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getPressedStateDuration() >> 16) + 9, -330018025, false, $$e(b9, b9, (byte) $$c.length), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                    int i21 = $10 + 67;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    i6 = 0;
                }
                objArr[0] = new String(cArr2, 0, i2);
            }

            private static void m(byte b2, byte b3, int i2, Object[] objArr) {
                int i3 = 101 - b3;
                int i4 = b2 * 4;
                int i5 = 3 - (i2 * 2);
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[1 - i4];
                int i6 = 0 - i4;
                int i7 = -1;
                if (bArr == null) {
                    i3 = i6 + i5;
                    i5 = i5;
                }
                while (true) {
                    i7++;
                    bArr2[i7] = (byte) i3;
                    if (i7 == i6) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    } else {
                        int i8 = i5 + 1;
                        i3 += bArr[i8];
                        i5 = i8;
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void n(int r29, java.lang.String r30, byte r31, java.lang.Object[] r32) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 881
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.ui.prompt.AntelopKeypadView.AnonymousClass1.n(int, java.lang.String, byte, java.lang.Object[]):void");
            }

            @Override // o.n.a.b
            public void onExtraButtonPressed() {
                int i2 = 2 % 2;
                int i3 = f19582d + 113;
                f19580b = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                KeypadCallback keypadCallback2 = keypadCallback;
                if (keypadCallback2 != null) {
                    keypadCallback2.onExtraButtonPressed();
                }
                int i4 = f19580b + 85;
                f19582d = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            @Override // o.n.a.b
            public void onKeyPressed() {
                int i2 = 2 % 2;
                int i3 = f19582d + 71;
                int i4 = i3 % 128;
                f19580b = i4;
                int i5 = i3 % 2;
                KeypadCallback keypadCallback2 = keypadCallback;
                if (keypadCallback2 != null) {
                    int i6 = i4 + 27;
                    f19582d = i6 % 128;
                    if (i6 % 2 == 0) {
                        keypadCallback2.onKeyPressed();
                        int i7 = 87 / 0;
                    } else {
                        keypadCallback2.onKeyPressed();
                    }
                }
                int i8 = f19582d + 85;
                f19580b = i8 % 128;
                int i9 = i8 % 2;
            }

            @Override // o.n.a.b
            public void onPasscodeEntryDone(byte[] bArr) {
                int i2 = 2 % 2;
                int i3 = f19580b + 79;
                f19582d = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 36 / 0;
                    if (keypadCallback == null) {
                        return;
                    }
                } else if (keypadCallback == null) {
                    return;
                }
                keypadCallback.onPasscodeEntryDone(bArr);
                int i5 = f19582d + 7;
                f19580b = i5 % 128;
                int i6 = i5 % 2;
            }
        }, this.theming);
        if (this.theming.randomizeKeyboard) {
            randomize();
        }
    }

    public final void randomize() {
        super.scramble();
    }

    @Override // o.n.a
    public final void resetPasscode() {
        super.resetPasscode();
    }
}
