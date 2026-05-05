package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.gestures.NoOpWindowCallback;
import io.sentry.android.core.internal.gestures.SentryGestureListener;
import io.sentry.android.core.internal.gestures.SentryWindowCallback;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public final class UserInteractionIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {
    private final Application application;
    private IHub hub;
    private final boolean isAndroidXAvailable;
    private SentryAndroidOptions options;

    public UserInteractionIntegration(Application application, LoadClass loadClass) {
        this.application = (Application) Objects.requireNonNull(application, "Application is required");
        this.isAndroidXAvailable = loadClass.isClassAvailable("androidx.core.view.GestureDetectorCompat", this.options);
    }

    private void startTracking(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.hub == null || this.options == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new NoOpWindowCallback();
        }
        if (callback instanceof SentryWindowCallback) {
            return;
        }
        window.setCallback(new SentryWindowCallback(callback, activity, new SentryGestureListener(activity, this.hub, this.options), this.options));
    }

    private void stopTracking(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof SentryWindowCallback) {
            SentryWindowCallback sentryWindowCallback = (SentryWindowCallback) callback;
            sentryWindowCallback.stopTracking();
            if (sentryWindowCallback.getDelegate() instanceof NoOpWindowCallback) {
                window.setCallback(null);
            } else {
                window.setCallback(sentryWindowCallback.getDelegate());
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.application.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        stopTracking(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        startTracking(activity);
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

    @Override // io.sentry.Integration
    public void register(IHub iHub, SentryOptions sentryOptions) throws Throwable {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        short sXd = (short) (Od.Xd() ^ (-32299));
        short sXd2 = (short) (Od.Xd() ^ (-29898));
        int[] iArr = new int["|\u001du1\b}qq9\u000bfx_h#(85\u001cyG\u0017K$aKYq<u)r".length()];
        QB qb = new QB("|\u001du1\b}qq9\u000bfx_h#(85\u001cyG\u0017K$aKYq<u)r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, new String(iArr, 0, i2));
        this.hub = (IHub) Objects.requireNonNull(iHub, Ig.wd("ip-H\t6\r|!\u001f'v5\u0018-", (short) (C1607wl.Xd() ^ 13242)));
        boolean z2 = this.options.isEnableUserInteractionBreadcrumbs() || this.options.isEnableUserInteractionTracing();
        this.options.getLogger().log(SentryLevel.DEBUG, EO.Od("R#\u0007o\u0006x\u000f/gVVImmd\u001dw\u001c42x\u001fD5VU(7^\u0003$Mn\u000b\u00125]T", (short) (FB.Xd() ^ 4726)), Boolean.valueOf(z2));
        if (z2) {
            if (!this.isAndroidXAvailable) {
                sentryOptions.getLogger().log(SentryLevel.INFO, C1561oA.Xd("o}t\u0004\u0002|x\u000eDz\b\f\u007f;\u0006\u0011>\u000e\u0010\u0016B\u0005\u001b\u0007\u0010\u0014\n\f\u0017\u0011XM\u0004#\u0016${\")\u001b)\u0019\u001c.$++\u0007-4&)5%9/66hA::sBn26q<BHJ8DE??", (short) (C1607wl.Xd() ^ 951)), new Object[0]);
                return;
            }
            Application application = this.application;
            Object[] objArr = {this};
            Method method = Class.forName(C1561oA.Qd("o{p}yrl5gut1Cqpkg`]ochf", (short) (C1607wl.Xd() ^ 8496))).getMethod(C1561oA.od("`RST]]MY'HXLXJTX*FB@=R;C;\u00185?>3129@", (short) (C1499aX.Xd() ^ (-10363))), Class.forName(C1593ug.zd("+90?=84~3CD\u0003\u0017GHEC>=QGNN\u0005#FXN\\P\\b6TRRQhS]W6UabYY\\en", (short) (Od.Xd() ^ (-18066)), (short) (Od.Xd() ^ (-9661)))));
            try {
                method.setAccessible(true);
                method.invoke(application, objArr);
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                short sXd3 = (short) (C1633zX.Xd() ^ (-10384));
                int[] iArr2 = new int["\u0001 \u0013!x\u001f&\u0018&\u0016\u0019+!((\u0004*1#&2\"6,33e06<>,8933}".length()];
                QB qb2 = new QB("\u0001 \u0013!x\u001f&\u0018&\u0016\u0019+!((\u0004*1#&2\"6,33e06<>,8933}");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
                    i3++;
                }
                logger.log(sentryLevel, new String(iArr2, 0, i3), new Object[0]);
                IntegrationUtils.addIntegrationToSdkVersion(Wg.Zd("+*ljB8/p~^1#(~n", (short) (C1607wl.Xd() ^ 2088), (short) (C1607wl.Xd() ^ 20798)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
