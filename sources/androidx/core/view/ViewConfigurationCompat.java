package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import androidx.annotation.ReplaceWith;
import androidx.core.util.Supplier;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewConfigurationCompat {
    private static final int NO_FLING_MAX_VELOCITY = Integer.MIN_VALUE;
    private static final int NO_FLING_MIN_VELOCITY = Integer.MAX_VALUE;
    private static final int RESOURCE_ID_NOT_SUPPORTED = -1;
    private static final int RESOURCE_ID_SUPPORTED_BUT_NOT_FOUND = 0;
    private static final String TAG = "ViewConfigCompat";
    private static Method sGetScaledScrollFactorMethod = null;

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00079%\u0019\u0007g+P=Q\u001d\u0019Q@5#zpcPQ/\u0007`SE6\r#\nx,\u001a", imports = {})
    @Deprecated
    public static int getScaledPagingTouchSlop(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00079%\u0019\u0007g+Q9P\u001a\u001bbA1-\u0010}p4H6(<C[ub", imports = {})
    @Deprecated
    public static boolean hasPermanentMenuKey(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    public static float getScaledHorizontalScrollFactor(ViewConfiguration viewConfiguration, Context context) {
        return Api26Impl.getScaledHorizontalScrollFactor(viewConfiguration);
    }

    public static float getScaledVerticalScrollFactor(ViewConfiguration viewConfiguration, Context context) {
        return Api26Impl.getScaledVerticalScrollFactor(viewConfiguration);
    }

    private static float getLegacyScrollFactor(ViewConfiguration viewConfiguration, Context context) throws Throwable {
        if (sGetScaledScrollFactorMethod != null) {
            try {
                return ((Integer) r1.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                C1561oA.Yd("\u0016*':\u000744-10\r:9=/C", (short) (FB.Xd() ^ 12906));
                short sXd = (short) (ZN.Xd() ^ 30423);
                short sXd2 = (short) (ZN.Xd() ^ 3181);
                int[] iArr = new int["x&-%\u001eZ*,2^&*0'c2+;08.j32B\"32>88(9IGEF!=@RNR\t\u000b\u0003SS\u0006=QNa.[[TXWfdTh^ee".length()];
                QB qb = new QB("x&-%\u001eZ*,2^&*0'c2+;08.j32B\"32>88(9IGEF!=@RNR\t\u000b\u0003SS\u0006=QNa.[[TXWfdTh^ee");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                    i2++;
                }
                new String(iArr, 0, i2);
            }
        }
        TypedValue typedValue = new TypedValue();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("\u000eOf(5\u000f~\u0019i.= \t]\u0005u\u0017#\u0017m}EQ", (short) (C1607wl.Xd() ^ 30213), (short) (C1607wl.Xd() ^ 24202))).getMethod(ZO.xd("k\u0004lDw\u0004\u007f\"", (short) (C1633zX.Xd() ^ (-24910)), (short) (C1633zX.Xd() ^ (-15163))), new Class[0]);
        try {
            method.setAccessible(true);
            if (!((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 0.0f;
            }
            short sXd3 = (short) (ZN.Xd() ^ 10172);
            short sXd4 = (short) (ZN.Xd() ^ 19283);
            int[] iArr2 = new int["c(e@Z=#:5D\u0014GQz=\u001a-6.% vL".length()];
            QB qb2 = new QB("c(e@Z=#:5D\u0014GQz=\u001a-6.% vL");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                i3++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(Ig.wd("`\f\u0019S'\u0010$:\u0004Ep\u0015", (short) (Od.Xd() ^ (-2845))), new Class[0]);
            try {
                method2.setAccessible(true);
                return typedValue.getDimension(((Resources) method2.invoke(context, objArr2)).getDisplayMetrics());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static int getScaledHoverSlop(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getScaledHoverSlop(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration viewConfiguration, Context context) throws Throwable {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.shouldShowMenuShortcutsWhenKeyboardPresent(viewConfiguration);
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("hvm|zuq<r\u007f\u007f\u0007x\u0003\nDZ\b\b\u000f\u0001\u0015\u0012", (short) (C1633zX.Xd() ^ (-28569)))).getMethod(Wg.Zd("4\\\u0014\fCk\u001001Tv'", (short) (Od.Xd() ^ (-15789)), (short) (Od.Xd() ^ (-19126))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            short sXd = (short) (FB.Xd() ^ 15224);
            int[] iArr = new int["Xee^baZoemvMfpxWmuy|l\u007f\u007f\u007fdvt~\\w\rv\u0005w\n|i\r\u0001\u0010\u0003\r\u0014".length()];
            QB qb = new QB("Xee^baZoemvMfpxWmuy|l\u007f\u007f\u007fdvt~\\w\rv\u0005w\n|i\r\u0001\u0010\u0003\r\u0014");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            int platformResId = getPlatformResId(resources, new String(iArr, 0, i2), Wg.vd("\t\u0015\u0018\u0014", (short) (C1580rY.Xd() ^ (-25833))));
            return platformResId != 0 && resources.getBoolean(platformResId);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static int getScaledMinimumFlingVelocity(Context context, final ViewConfiguration viewConfiguration, int i2, int i3, int i4) throws Throwable {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getScaledMinimumFlingVelocity(viewConfiguration, i2, i3, i4);
        }
        if (!isInputDeviceInfoValid(i2, i3, i4)) {
            return Integer.MAX_VALUE;
        }
        short sXd = (short) (Od.Xd() ^ (-23481));
        short sXd2 = (short) (Od.Xd() ^ (-15359));
        int[] iArr = new int["JXO^\\WS\u001eTaahZdk&<iipbvs".length()];
        QB qb = new QB("JXO^\\WS\u001eTaahZdk&<iipbvs");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK((xuXd.CK(iKK) - (sXd + i5)) - sXd2);
            i5++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i5)).getMethod(C1561oA.od("vs\u0002^p}x}yijw", (short) (C1633zX.Xd() ^ (-24049))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int preApi34MinimumFlingVelocityResId = getPreApi34MinimumFlingVelocityResId(resources, i4, i3);
            Objects.requireNonNull(viewConfiguration);
            return getCompatFlingVelocityThreshold(resources, preApi34MinimumFlingVelocityResId, new Supplier() { // from class: androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Supplier
                public final Object get() {
                    return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
                }
            }, Integer.MAX_VALUE);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static int getScaledMaximumFlingVelocity(Context context, final ViewConfiguration viewConfiguration, int i2, int i3, int i4) throws Throwable {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.getScaledMaximumFlingVelocity(viewConfiguration, i2, i3, i4);
        }
        if (!isInputDeviceInfoValid(i2, i3, i4)) {
            return Integer.MIN_VALUE;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("L0uaHg\rwdRU3\u0010\u0011\t]@X1\u001dE\">", (short) (Od.Xd() ^ (-13345)))).getMethod(C1561oA.Qd("pm{Xjwrwscdq", (short) (ZN.Xd() ^ 30488)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int preApi34MaximumFlingVelocityResId = getPreApi34MaximumFlingVelocityResId(resources, i4, i3);
            Objects.requireNonNull(viewConfiguration);
            return getCompatFlingVelocityThreshold(resources, preApi34MaximumFlingVelocityResId, new Supplier() { // from class: androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Supplier
                public final Object get() {
                    return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
                }
            }, Integer.MIN_VALUE);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private ViewConfigurationCompat() {
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static float getScaledHorizontalScrollFactor(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        static float getScaledVerticalScrollFactor(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static int getScaledHoverSlop(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        static boolean shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static int getScaledMaximumFlingVelocity(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i2, i3, i4);
        }

        static int getScaledMinimumFlingVelocity(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i2, i3, i4);
        }
    }

    private static int getPreApi34MaximumFlingVelocityResId(Resources resources, int i2, int i3) {
        if (i2 == 4194304 && i3 == 26) {
            return getPlatformResId(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int getPreApi34MinimumFlingVelocityResId(Resources resources, int i2, int i3) {
        if (i2 == 4194304 && i3 == 26) {
            return getPlatformResId(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int getPlatformResId(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static boolean isInputDeviceInfoValid(int i2, int i3, int i4) {
        InputDevice device = InputDevice.getDevice(i2);
        return (device == null || device.getMotionRange(i3, i4) == null) ? false : true;
    }

    private static int getCompatFlingVelocityThreshold(Resources resources, int i2, Supplier<Integer> supplier, int i3) {
        int dimensionPixelSize;
        if (i2 != -1) {
            return (i2 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i2)) < 0) ? i3 : dimensionPixelSize;
        }
        return supplier.get().intValue();
    }
}
