package org.devio.rn.splashscreen;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class SplashScreen {
    private static WeakReference<Activity> mActivity = null;
    private static Dialog mSplashDialog = null;

    public static void hide(final Activity activity) {
        if (activity == null) {
            WeakReference<Activity> weakReference = mActivity;
            if (weakReference == null) {
                return;
            } else {
                activity = weakReference.get();
            }
        }
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: org.devio.rn.splashscreen.SplashScreen.2
            @Override // java.lang.Runnable
            public void run() {
                if (SplashScreen.mSplashDialog == null || !SplashScreen.mSplashDialog.isShowing()) {
                    return;
                }
                boolean zIsDestroyed = activity.isDestroyed();
                if (!activity.isFinishing() && !zIsDestroyed) {
                    SplashScreen.mSplashDialog.dismiss();
                }
                SplashScreen.mSplashDialog = null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setActivityAndroidP(Dialog dialog) {
        if (Build.VERSION.SDK_INT < 28 || dialog == null || dialog.getWindow() == null) {
            return;
        }
        dialog.getWindow().addFlags(512);
        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
        attributes.layoutInDisplayCutoutMode = 1;
        dialog.getWindow().setAttributes(attributes);
    }

    public static void show(Activity activity) {
        show(activity, false);
    }

    public static void show(final Activity activity, final int i2, final boolean z2) {
        if (activity == null) {
            return;
        }
        mActivity = new WeakReference<>(activity);
        activity.runOnUiThread(new Runnable() { // from class: org.devio.rn.splashscreen.SplashScreen.1
            @Override // java.lang.Runnable
            public void run() {
                if (activity.isFinishing()) {
                    return;
                }
                SplashScreen.mSplashDialog = new Dialog(activity, i2);
                SplashScreen.mSplashDialog.setContentView(R.layout.launch_screen);
                SplashScreen.mSplashDialog.setCancelable(false);
                if (z2) {
                    SplashScreen.setActivityAndroidP(SplashScreen.mSplashDialog);
                }
                if (SplashScreen.mSplashDialog.isShowing()) {
                    return;
                }
                SplashScreen.mSplashDialog.show();
            }
        });
    }

    public static void show(Activity activity, boolean z2) {
        show(activity, z2 ? R.style.SplashScreen_Fullscreen : R.style.SplashScreen_SplashTheme, z2);
    }
}
