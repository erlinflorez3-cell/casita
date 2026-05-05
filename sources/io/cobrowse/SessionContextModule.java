package io.cobrowse;

import android.app.Activity;
import android.app.Application;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes3.dex */
abstract class SessionContextModule {
    final Application application;
    final Session session;

    SessionContextModule(Application application, Session session) {
        this.application = application;
        this.session = session;
    }

    abstract void destroy();

    Activity getActivity() {
        return ActivityWatcher.foregroundActivity();
    }

    Application getApplication() {
        return this.application;
    }

    Display getDisplay(int i2) {
        return getDisplayManager().getDisplay(i2);
    }

    Display getDisplay(String str) {
        if (str == null) {
            return null;
        }
        try {
            return getDisplay(Integer.parseInt(str));
        } catch (Exception unused) {
            return null;
        }
    }

    DisplayManager getDisplayManager() {
        return (DisplayManager) getApplication().getSystemService("display");
    }

    WindowManager getWindowManager() {
        return (WindowManager) getApplication().getSystemService("window");
    }
}
