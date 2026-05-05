package androidx.core.view;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class DisplayCompat {
    private static final int DISPLAY_SIZE_4K_HEIGHT = 2160;
    private static final int DISPLAY_SIZE_4K_WIDTH = 3840;

    private DisplayCompat() {
    }

    public static ModeCompat getMode(Context context, Display display) {
        return Api23Impl.getMode(context, display);
    }

    private static Point getDisplaySize(Context context, Display display) {
        Point currentDisplaySizeFromWorkarounds = getCurrentDisplaySizeFromWorkarounds(context, display);
        if (currentDisplaySizeFromWorkarounds != null) {
            return currentDisplaySizeFromWorkarounds;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    public static ModeCompat[] getSupportedModes(Context context, Display display) {
        return Api23Impl.getSupportedModes(context, display);
    }

    private static Point parseDisplaySize(String str) throws NumberFormatException {
        String[] strArrSplit = str.trim().split("x", -1);
        if (strArrSplit.length == 2) {
            int i2 = Integer.parseInt(strArrSplit[0]);
            int i3 = Integer.parseInt(strArrSplit[1]);
            if (i2 > 0 && i3 > 0) {
                return new Point(i2, i3);
            }
        }
        throw new NumberFormatException();
    }

    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean isTv(Context context) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 12178);
        int[] iArr = new int["\u0019e7\u0016\u0003&".length()];
        QB qb = new QB("\u0019e7\u0016\u0003&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2)};
        Method method = Class.forName(EO.Od("za\u0019\u0004\u00197ZL4!u&e`vV0J\u0012$W3Y", (short) (C1607wl.Xd() ^ 28849))).getMethod(C1593ug.zd("0/?\u001fFAC5>%8FK?:=", (short) (ZN.Xd() ^ 18683), (short) (ZN.Xd() ^ 30668)), Class.forName(C1561oA.Qd(">4H2};/;3x\u001d=:04,", (short) (Od.Xd() ^ (-23168)))));
        try {
            method.setAccessible(true);
            UiModeManager uiModeManager = (UiModeManager) method.invoke(context, objArr);
            return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static Point parsePhysicalDisplaySizeFromSystemProperties(String str, Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String systemProperty = getSystemProperty(str);
        if (!TextUtils.isEmpty(systemProperty) && systemProperty != null) {
            try {
                return parseDisplaySize(systemProperty);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    static Point getCurrentDisplaySizeFromWorkarounds(Context context, Display display) {
        Point physicalDisplaySizeFromSystemProperties = Build.VERSION.SDK_INT < 28 ? parsePhysicalDisplaySizeFromSystemProperties("sys.display-size", display) : parsePhysicalDisplaySizeFromSystemProperties("vendor.display-size", display);
        if (physicalDisplaySizeFromSystemProperties != null) {
            return physicalDisplaySizeFromSystemProperties;
        }
        if (isSonyBravia4kTv(context) && isCurrentModeTheLargestMode(display)) {
            return new Point(3840, DISPLAY_SIZE_4K_HEIGHT);
        }
        return null;
    }

    private static boolean isSonyBravia4kTv(Context context) throws Throwable {
        if (isTv(context) && hg.Vd("4OMW", (short) (C1633zX.Xd() ^ (-189)), (short) (C1633zX.Xd() ^ (-24164))).equals(Build.MANUFACTURER) && Build.MODEL.startsWith(C1561oA.ud("1@.B4+", (short) (FB.Xd() ^ 10418)))) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("\u0003\u000f\b\u0015\r\u0006\u0004L\r\u0018\u001a\u001f\u000b\u0013\u001cTt \"'\u0013%$", (short) (C1499aX.Xd() ^ (-19159)))).getMethod(C1561oA.Yd("|{\fhz}\u0007}\u0005\u0004l\u0002\u0010\u0004\u000b\n\u0018", (short) (OY.Xd() ^ 4286)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = {Xg.qd("'43t;88Dy1BE}93E8L7I=\u0007J<JBJ\rQGJG", (short) (C1580rY.Xd() ^ (-20014)), (short) (C1580rY.Xd() ^ (-13129)))};
                Method method2 = Class.forName(Jg.Wd("c\u001f;_\u0003#D$\u007fRw\u0014+Z\u0007V?\u0003i\"Y\u00020<h-;e\u0019\u001aVz\u001e", (short) (Od.Xd() ^ (-28253)), (short) (Od.Xd() ^ (-25157)))).getMethod(C1626yg.Ud("N}Ii.\u001c\r\\B\u0013\u001c<\u0006?p|", (short) (Od.Xd() ^ (-27431)), (short) (Od.Xd() ^ (-29130))), Class.forName(ZO.xd("Bf\u0012\u001cYI\u001cG\u0016%x\u00146Md#", (short) (C1580rY.Xd() ^ (-21708)), (short) (C1580rY.Xd() ^ (-28515)))));
                try {
                    method2.setAccessible(true);
                    if (((Boolean) method2.invoke(packageManager, objArr2)).booleanValue()) {
                        return true;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return false;
    }

    static boolean isCurrentModeTheLargestMode(Display display) {
        return Api23Impl.isCurrentModeTheLargestMode(display);
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static ModeCompat getMode(Context context, Display display) {
            Display.Mode mode = display.getMode();
            Point currentDisplaySizeFromWorkarounds = DisplayCompat.getCurrentDisplaySizeFromWorkarounds(context, display);
            if (currentDisplaySizeFromWorkarounds == null || physicalSizeEquals(mode, currentDisplaySizeFromWorkarounds)) {
                return new ModeCompat(mode, true);
            }
            return new ModeCompat(mode, currentDisplaySizeFromWorkarounds);
        }

        public static ModeCompat[] getSupportedModes(Context context, Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            ModeCompat[] modeCompatArr = new ModeCompat[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point currentDisplaySizeFromWorkarounds = DisplayCompat.getCurrentDisplaySizeFromWorkarounds(context, display);
            if (currentDisplaySizeFromWorkarounds != null && !physicalSizeEquals(mode, currentDisplaySizeFromWorkarounds)) {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    modeCompatArr[i2] = physicalSizeEquals(supportedModes[i2], mode) ? new ModeCompat(supportedModes[i2], currentDisplaySizeFromWorkarounds) : new ModeCompat(supportedModes[i2], false);
                }
            } else {
                for (int i3 = 0; i3 < supportedModes.length; i3++) {
                    modeCompatArr[i3] = new ModeCompat(supportedModes[i3], physicalSizeEquals(supportedModes[i3], mode));
                }
            }
            return modeCompatArr;
        }

        static boolean isCurrentModeTheLargestMode(Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        static boolean physicalSizeEquals(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        static boolean physicalSizeEquals(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    public static final class ModeCompat {
        private final boolean mIsNative;
        private final Display.Mode mMode;
        private final Point mPhysicalSize;

        ModeCompat(Point point) {
            Preconditions.checkNotNull(point, "physicalSize == null");
            this.mPhysicalSize = point;
            this.mMode = null;
            this.mIsNative = true;
        }

        ModeCompat(Display.Mode mode, boolean z2) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            this.mPhysicalSize = new Point(Api23Impl.getPhysicalWidth(mode), Api23Impl.getPhysicalHeight(mode));
            this.mMode = mode;
            this.mIsNative = z2;
        }

        ModeCompat(Display.Mode mode, Point point) {
            Preconditions.checkNotNull(mode, "mode == null, can't wrap a null reference");
            Preconditions.checkNotNull(point, "physicalSize == null");
            this.mPhysicalSize = point;
            this.mMode = mode;
            this.mIsNative = true;
        }

        public int getPhysicalWidth() {
            return this.mPhysicalSize.x;
        }

        public int getPhysicalHeight() {
            return this.mPhysicalSize.y;
        }

        @Deprecated
        public boolean isNative() {
            return this.mIsNative;
        }

        public Display.Mode toMode() {
            return this.mMode;
        }

        static class Api23Impl {
            private Api23Impl() {
            }

            static int getPhysicalWidth(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }

            static int getPhysicalHeight(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }
        }
    }
}
