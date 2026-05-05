package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.ZO;

/* JADX INFO: loaded from: classes9.dex */
public class WindowUtils {
    private static final String TAG = "WindowUtils";

    private static class Api14Impl {
        private Api14Impl() {
        }

        static Rect getCurrentWindowBounds(WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point realSizeForDisplay = getRealSizeForDisplay(defaultDisplay);
            Rect rect = new Rect();
            if (realSizeForDisplay.x == 0 || realSizeForDisplay.y == 0) {
                defaultDisplay.getRectSize(rect);
            } else {
                rect.right = realSizeForDisplay.x;
                rect.bottom = realSizeForDisplay.y;
            }
            return rect;
        }

        private static Point getRealSizeForDisplay(Display display) {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
            } catch (IllegalAccessException e2) {
                String unused = WindowUtils.TAG;
            } catch (NoSuchMethodException e3) {
                String unused2 = WindowUtils.TAG;
            } catch (InvocationTargetException e4) {
                String unused3 = WindowUtils.TAG;
            }
            return point;
        }
    }

    private static class Api17Impl {
        private Api17Impl() {
        }

        static Rect getCurrentWindowBounds(WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static Rect getCurrentWindowBounds(WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    private WindowUtils() {
    }

    public static Rect getCurrentWindowBounds(Context context) throws Throwable {
        Object[] objArr = {ZO.xd("lPP4*@", (short) (Od.Xd() ^ (-8440)), (short) (Od.Xd() ^ (-6219)))};
        Method method = Class.forName(C1626yg.Ud("\f\u000bcE\u001b$,.O\u0017\r\tcr\tC\u0019t4ui\fZ", (short) (OY.Xd() ^ 5830), (short) (OY.Xd() ^ 9112))).getMethod(EO.Od("6\u0006#\u001ee\ftN4{\nvF9\rr", (short) (C1607wl.Xd() ^ 32422)), Class.forName(Ig.wd("o1\"n`Zm0V\u001b(%twn?", (short) (Od.Xd() ^ (-25805)))));
        try {
            method.setAccessible(true);
            WindowManager windowManager = (WindowManager) method.invoke(context, objArr);
            return Build.VERSION.SDK_INT >= 30 ? Api30Impl.getCurrentWindowBounds(windowManager) : Api17Impl.getCurrentWindowBounds(windowManager);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
