package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public class ThemeUtils {
    private static final String TAG = "ThemeUtils";
    private static final ThreadLocal<TypedValue> TL_TYPED_VALUE = new ThreadLocal<>();
    static final int[] DISABLED_STATE_SET = {-16842910};
    static final int[] FOCUSED_STATE_SET = {R.attr.state_focused};
    static final int[] ACTIVATED_STATE_SET = {R.attr.state_activated};
    static final int[] PRESSED_STATE_SET = {R.attr.state_pressed};
    static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    static final int[] SELECTED_STATE_SET = {R.attr.state_selected};
    static final int[] NOT_PRESSED_OR_FOCUSED_STATE_SET = {-16842919, -16842908};
    static final int[] EMPTY_STATE_SET = new int[0];
    private static final int[] TEMP_ARRAY = new int[1];

    public static ColorStateList createDisabledStateList(int i2, int i3) {
        return new ColorStateList(new int[][]{DISABLED_STATE_SET, EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    public static int getThemeAttrColor(Context context, int i2) {
        int[] iArr = TEMP_ARRAY;
        iArr[0] = i2;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return tintTypedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList getThemeAttrColorStateList(Context context, int i2) {
        int[] iArr = TEMP_ARRAY;
        iArr[0] = i2;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        try {
            return tintTypedArrayObtainStyledAttributes.getColorStateList(0);
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int getDisabledThemeAttrColor(Context context, int i2) throws Throwable {
        ColorStateList themeAttrColorStateList = getThemeAttrColorStateList(context, i2);
        if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
            return themeAttrColorStateList.getColorForState(DISABLED_STATE_SET, themeAttrColorStateList.getDefaultColor());
        }
        TypedValue typedValue = getTypedValue();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("L\u0014<a>\u0014j\u0004\u0007BG+I\\\u0007\u001ej\u001dSAo.{", (short) (ZN.Xd() ^ 14119))).getMethod(EO.Od("Al0)O*\u0010I", (short) (C1499aX.Xd() ^ (-26115))), new Class[0]);
        try {
            method.setAccessible(true);
            ((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(R.attr.disabledAlpha, typedValue, true);
            return getThemeAttrColor(context, i2, typedValue.getFloat());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static TypedValue getTypedValue() {
        ThreadLocal<TypedValue> threadLocal = TL_TYPED_VALUE;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    static int getThemeAttrColor(Context context, int i2, float f2) {
        return ColorUtils.setAlphaComponent(getThemeAttrColor(context, i2), Math.round(Color.alpha(r1) * f2));
    }

    public static void checkAppCompatTheme(View view, Context context) {
        String strYd = C1561oA.Yd("{\u0010\r I", (short) (Od.Xd() ^ (-10610)));
        Object[] objArr = {androidx.appcompat.R.styleable.AppCompatTheme};
        Method method = Class.forName(Xg.qd("u\u0004z\n\b\u0003~I\u007f\r\r\u0014\u0006\u0010\u0017Qg\u0015\u0015\u001c\u000e\"\u001f", (short) (Od.Xd() ^ (-26190)), (short) (Od.Xd() ^ (-24239)))).getMethod(Jg.Wd("Jd\nNq]UNn:Vl%oBg:J2HdJ", (short) (C1633zX.Xd() ^ (-18487)), (short) (C1633zX.Xd() ^ (-25374))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            try {
                if (!typedArray.hasValue(androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar)) {
                    short sXd = (short) (Od.Xd() ^ (-22805));
                    short sXd2 = (short) (Od.Xd() ^ (-5985));
                    int[] iArr = new int["x#|a\u0002sv,/(".length()];
                    QB qb = new QB("x#|a\u0002sv,/(");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                        i2++;
                    }
                    new String(iArr, 0, i2);
                    String str = strYd + view.getClass() + C1626yg.Ud("w\u001dVEa\"&\b_X\u001aGHGB#N<>6_V\u0003\u0019VD'N@\u001bJ\u001cw|$<_\r?50 xUA!y[K,]I\u0018>\u0014T:\u0003\u0013M~\u0001b)8\u000f.\u0014\u0017^t:kY&\u0015KDk\u0019K\u0013B\u0005\u001ch2-jO\u001d", (short) (C1499aX.Xd() ^ (-6922)), (short) (C1499aX.Xd() ^ (-29230)));
                }
            } finally {
                typedArray.recycle();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private ThemeUtils() {
    }
}
