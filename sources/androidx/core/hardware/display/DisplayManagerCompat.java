package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class DisplayManagerCompat {
    static final String DISPLAY_CATEGORY_ALL = "android.hardware.display.category.ALL_INCLUDING_DISABLED";
    public static final String DISPLAY_CATEGORY_BUILT_IN_DISPLAYS = "android.hardware.display.category.BUILT_IN_DISPLAYS";
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    static final int DISPLAY_TYPE_INTERNAL = 1;
    private final Context mContext;

    private DisplayManagerCompat(Context context) {
        this.mContext = context;
    }

    public static DisplayManagerCompat getInstance(Context context) {
        return new DisplayManagerCompat(context);
    }

    public Display getDisplay(int i2) throws Throwable {
        Context context = this.mContext;
        short sXd = (short) (C1633zX.Xd() ^ (-24233));
        short sXd2 = (short) (C1633zX.Xd() ^ (-31744));
        int[] iArr = new int["kq|zwm\u0007".length()];
        QB qb = new QB("kq|zwm\u0007");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
            i3++;
        }
        Object[] objArr = {new String(iArr, 0, i3)};
        Method method = Class.forName(Jg.Wd("\n:\u0019\u0018{eE\u007f\\Y@)\u0013|zS]j`F0(K", (short) (ZN.Xd() ^ 3122), (short) (ZN.Xd() ^ 21310))).getMethod(C1626yg.Ud("P\u0017n'a!jH\f\u001fDn\u0018EC0", (short) (C1607wl.Xd() ^ 30760), (short) (C1607wl.Xd() ^ 18581)), Class.forName(ZO.xd(":At]\u0019A9(\u0016QY6\t,PM", (short) (Od.Xd() ^ (-5628)), (short) (Od.Xd() ^ (-27467)))));
        try {
            method.setAccessible(true);
            return ((DisplayManager) method.invoke(context, objArr)).getDisplay(i2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public Display[] getDisplays() throws Throwable {
        Context context = this.mContext;
        String strWd = Ig.wd("\u000bb|\u0014\u0006-\u001b", (short) (ZN.Xd() ^ 28659));
        Class<?> cls = Class.forName(EO.Od("A\u001caUT$x\u001c\u0019FIg$5-\u0002t\u0015]Y\"nz", (short) (C1633zX.Xd() ^ (-9403))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Qd("uk\u007fi5rfrj0Ttqgkc", (short) (Od.Xd() ^ (-28015))))};
        Object[] objArr = {strWd};
        short sXd = (short) (C1607wl.Xd() ^ 10888);
        short sXd2 = (short) (C1607wl.Xd() ^ 13310);
        int[] iArr = new int["\u0012\u0011!\u0001(#%\u0017 \u0007\u001a(-!\u001c\u001f".length()];
        QB qb = new QB("\u0012\u0011!\u0001(#%\u0017 \u0007\u001a(-!\u001c\u001f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return ((DisplayManager) method.invoke(context, objArr)).getDisplays();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public Display[] getDisplays(String str) throws Throwable {
        Context context = this.mContext;
        String strOd = C1561oA.od("37@<7+B", (short) (Od.Xd() ^ (-10879)));
        short sXd = (short) (FB.Xd() ^ 20889);
        int[] iArr = new int["2@7FD?;\u0006<IIPBLS\u000e$QQXJ^[".length()];
        QB qb = new QB("2@7FD?;\u0006<IIPBLS\u000e$QQXJ^[");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (C1499aX.Xd() ^ (-3421));
        short sXd3 = (short) (C1499aX.Xd() ^ (-19286));
        int[] iArr2 = new int["EKMc\u001dj)\u0005S%7\u0007osH\"".length()];
        QB qb2 = new QB("EKMc\u001dj)\u0005S%7\u0007osH\"");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {strOd};
        Method method = cls.getMethod(C1561oA.Xd("('7\u0017>9;-6\u001d0>C725", (short) (ZN.Xd() ^ 28008)), clsArr);
        try {
            method.setAccessible(true);
            DisplayManager displayManager = (DisplayManager) method.invoke(context, objArr);
            if (Wg.vd("'5,;940z& 2%9$6*c\u001b!,*'\u001d6[\u0012\u0011%\u0017\u001a#'\u001fTi}rv\u007f\ffl~djuspVoj", (short) (ZN.Xd() ^ 17975)).equals(str)) {
                return computeBuiltInDisplays(displayManager);
            }
            Context context2 = this.mContext;
            Object[] objArr2 = {strOd};
            Method method2 = Class.forName(Qg.kd(".:/<81+s(316&.3k\u007f+).\u001e0+", (short) (ZN.Xd() ^ 11930), (short) (ZN.Xd() ^ 23935))).getMethod(C1561oA.ud("\u0004\u0001\u000fl\u0012\u000b\u000bz\u0002fw\u0004\u0007xqr", (short) (C1499aX.Xd() ^ (-25808))), Class.forName(hg.Vd("tj~h4qeqi/Sspfjb", (short) (C1607wl.Xd() ^ 29748), (short) (C1607wl.Xd() ^ 30259))));
            try {
                method2.setAccessible(true);
                return ((DisplayManager) method2.invoke(context2, objArr2)).getDisplays(str);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static Display[] computeBuiltInDisplays(DisplayManager displayManager) {
        Display[] displays;
        if (Build.VERSION.SDK_INT >= 32) {
            displays = displayManager.getDisplays(DISPLAY_CATEGORY_ALL);
        } else {
            displays = displayManager.getDisplays();
        }
        Display[] displayArr = new Display[numberOfDisplaysByType(1, displays)];
        int i2 = 0;
        for (Display display : displays) {
            if (1 == getTypeCompat(display)) {
                displayArr[i2] = display;
                i2++;
            }
        }
        return displayArr;
    }

    private static int numberOfDisplaysByType(int i2, Display[] displayArr) {
        int i3 = 0;
        for (Display display : displayArr) {
            if (i2 == getTypeCompat(display)) {
                i3++;
            }
        }
        return i3;
    }

    static int getTypeCompat(Display display) {
        try {
            return ((Integer) Objects.requireNonNull(Display.class.getMethod("getType", new Class[0]).invoke(display, new Object[0]))).intValue();
        } catch (NoSuchMethodException unused) {
            return 0;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
