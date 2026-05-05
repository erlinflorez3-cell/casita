package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public class ColorContrast {
    private static final float HIGH_CONTRAST_THRESHOLD = 0.6666667f;
    private static final float MEDIUM_CONTRAST_THRESHOLD = 0.33333334f;

    private static class ColorContrastActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        private final Set<Activity> activitiesInStack = new LinkedHashSet();
        private final ColorContrastOptions colorContrastOptions;
        private UiModeManager.ContrastChangeListener contrastChangeListener;

        ColorContrastActivityLifecycleCallbacks(ColorContrastOptions colorContrastOptions) {
            this.colorContrastOptions = colorContrastOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            this.activitiesInStack.remove(activity);
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager == null || this.contrastChangeListener == null || !this.activitiesInStack.isEmpty()) {
                return;
            }
            uiModeManager.removeContrastChangeListener(this.contrastChangeListener);
            this.contrastChangeListener = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) throws Throwable {
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.activitiesInStack.isEmpty() && this.contrastChangeListener == null) {
                this.contrastChangeListener = new UiModeManager.ContrastChangeListener() { // from class: com.google.android.material.color.ColorContrast.ColorContrastActivityLifecycleCallbacks.1
                    @Override // android.app.UiModeManager.ContrastChangeListener
                    public void onContrastChanged(float f2) {
                        Iterator it = ColorContrastActivityLifecycleCallbacks.this.activitiesInStack.iterator();
                        while (it.hasNext()) {
                            ((Activity) it.next()).recreate();
                        }
                    }
                };
                uiModeManager.addContrastChangeListener(ContextCompat.getMainExecutor(activity.getApplicationContext()), this.contrastChangeListener);
            }
            this.activitiesInStack.add(activity);
            if (uiModeManager != null) {
                ColorContrast.applyToActivityIfAvailable(activity, this.colorContrastOptions);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private ColorContrast() {
    }

    public static void applyToActivitiesIfAvailable(Application application, ColorContrastOptions colorContrastOptions) throws Throwable {
        if (isContrastAvailable()) {
            ColorContrastActivityLifecycleCallbacks colorContrastActivityLifecycleCallbacks = new ColorContrastActivityLifecycleCallbacks(colorContrastOptions);
            short sXd = (short) (C1607wl.Xd() ^ 22670);
            short sXd2 = (short) (C1607wl.Xd() ^ 18242);
            int[] iArr = new int["\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0013#$bv'(%#\u001e\u001d1'..".length()];
            QB qb = new QB("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0013#$bv'(%#\u001e\u001d1'..");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Object[] objArr = {colorContrastActivityLifecycleCallbacks};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("=I\u0011Sg4GSk|NI&OtYA#t\u007fX\u001b\u0017LX!^\u0003$w\u0006\u0004D\r", (short) (C1580rY.Xd() ^ (-18833)), (short) (C1580rY.Xd() ^ (-16150))), Class.forName(Jg.Wd("EPqRRoF\u0013Y;E\u0016\r?Z9)6 1=*@ti#;\u000f2,\u000f3|p\u0015\u0013h%\u0012m\u00023T\u0003]VwMPk", (short) (Od.Xd() ^ (-32404)), (short) (Od.Xd() ^ (-11988)))));
            try {
                method.setAccessible(true);
                method.invoke(application, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public static void applyToActivityIfAvailable(Activity activity, ColorContrastOptions colorContrastOptions) throws Throwable {
        int contrastThemeOverlayResourceId;
        if (isContrastAvailable() && (contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(activity, colorContrastOptions)) != 0) {
            ThemeUtils.applyThemeOverlay(activity, contrastThemeOverlayResourceId);
        }
    }

    private static int getContrastThemeOverlayResourceId(Context context, ColorContrastOptions colorContrastOptions) throws Throwable {
        String strUd = C1626yg.Ud("g\u001a&$Em", (short) (C1580rY.Xd() ^ (-23287)), (short) (C1580rY.Xd() ^ (-29447)));
        Class<?> cls = Class.forName(Ig.wd("F.0WJgH\bb\u001c\u001bEgdd=.B\u00077mBb", (short) (C1633zX.Xd() ^ (-30071))));
        Class<?>[] clsArr = {Class.forName(EO.Od("Ag+=\u001a\u001e~S$}%`*\u0017@R", (short) (C1633zX.Xd() ^ (-9447))))};
        Object[] objArr = {strUd};
        short sXd = (short) (C1633zX.Xd() ^ (-19077));
        int[] iArr = new int["=:H&KDD4; 1=@2+,".length()];
        QB qb = new QB("=:H&KDD4; 1=@2+,");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            UiModeManager uiModeManager = (UiModeManager) method.invoke(context, objArr);
            if (isContrastAvailable() && uiModeManager != null) {
                float contrast = uiModeManager.getContrast();
                int mediumContrastThemeOverlay = colorContrastOptions.getMediumContrastThemeOverlay();
                int highContrastThemeOverlay = colorContrastOptions.getHighContrastThemeOverlay();
                if (contrast >= 0.6666667f) {
                    return highContrastThemeOverlay == 0 ? mediumContrastThemeOverlay : highContrastThemeOverlay;
                }
                if (contrast >= MEDIUM_CONTRAST_THRESHOLD) {
                    return mediumContrastThemeOverlay == 0 ? highContrastThemeOverlay : mediumContrastThemeOverlay;
                }
            }
            return 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean isContrastAvailable() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static Context wrapContextIfAvailable(Context context, ColorContrastOptions colorContrastOptions) {
        int contrastThemeOverlayResourceId;
        return (isContrastAvailable() && (contrastThemeOverlayResourceId = getContrastThemeOverlayResourceId(context, colorContrastOptions)) != 0) ? new ContextThemeWrapper(context, contrastThemeOverlayResourceId) : context;
    }
}
