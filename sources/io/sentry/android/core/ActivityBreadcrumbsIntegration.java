package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.ILogger;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.Session;
import io.sentry.TypeCheckHint;
import io.sentry.protocol.SentryThread;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityBreadcrumbsIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {
    private final Application application;
    private boolean enabled;
    private IHub hub;

    public ActivityBreadcrumbsIntegration(Application application) {
        this.application = (Application) Objects.requireNonNull(application, "Application is required");
    }

    private void addBreadcrumb(Activity activity, String str) {
        if (this.hub == null) {
            return;
        }
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType(NotificationCompat.CATEGORY_NAVIGATION);
        breadcrumb.setData(SentryThread.JsonKeys.STATE, str);
        breadcrumb.setData("screen", getActivityName(activity));
        breadcrumb.setCategory("ui.lifecycle");
        breadcrumb.setLevel(SentryLevel.INFO);
        Hint hint = new Hint();
        hint.set(TypeCheckHint.ANDROID_ACTIVITY, activity);
        this.hub.addBreadcrumb(breadcrumb, hint);
    }

    private String getActivityName(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.enabled) {
            this.application.unregisterActivityLifecycleCallbacks(this);
            IHub iHub = this.hub;
            if (iHub != null) {
                iHub.getOptions().getLogger().log(SentryLevel.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        addBreadcrumb(activity, "created");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        addBreadcrumb(activity, "destroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        addBreadcrumb(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        addBreadcrumb(activity, "resumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        addBreadcrumb(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        addBreadcrumb(activity, Session.JsonKeys.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        addBreadcrumb(activity, "stopped");
    }

    @Override // io.sentry.Integration
    public void register(IHub iHub, SentryOptions sentryOptions) throws Throwable {
        SentryAndroidOptions sentryAndroidOptions = sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null;
        short sXd = (short) (FB.Xd() ^ 24906);
        int[] iArr = new int["iz\u0007\f\r\u0013]\nr\u007f\u007fxv`\u0005\botvz*r\u007f+pbqtksig".length()];
        QB qb = new QB("iz\u0007\f\r\u0013]\nr\u007f\u007fxv`\u0005\botvz*r\u007f+pbqtksig");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, new String(iArr, 0, i2));
        short sXd2 = (short) (OY.Xd() ^ 23533);
        int[] iArr2 = new int["M{i(r}+~r\u007f\u0005y\u0004ww".length()];
        QB qb2 = new QB("M{i(r}+~r\u007f\u0005y\u0004ww");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
            i3++;
        }
        this.hub = (IHub) Objects.requireNonNull(iHub, new String(iArr2, 0, i3));
        this.enabled = sentryAndroidOptions2.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = sentryOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        Object[] objArr = {Boolean.valueOf(this.enabled)};
        short sXd3 = (short) (C1607wl.Xd() ^ 17995);
        short sXd4 = (short) (C1607wl.Xd() ^ 20608);
        int[] iArr3 = new int["\u001d@RHVJV\\&WKHLL\\`YOa8^eWZfVj`gg\u001a`j^`kee<#)x".length()];
        QB qb3 = new QB("\u001d@RHVJV\\&WKHLL\\`YOa8^eWZfVj`gg\u001a`j^`kee<#)x");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
            i4++;
        }
        logger.log(sentryLevel, new String(iArr3, 0, i4), objArr);
        if (this.enabled) {
            Application application = this.application;
            Class<?> cls = Class.forName(Jg.Wd("K\u001c]g/dkp\u000f\u001ae\u001etok2\u000b\u0011I(\u0019jd", (short) (FB.Xd() ^ 25341), (short) (FB.Xd() ^ 10977)));
            Class<?>[] clsArr = new Class[1];
            short sXd5 = (short) (C1607wl.Xd() ^ 26455);
            short sXd6 = (short) (C1607wl.Xd() ^ 22352);
            int[] iArr4 = new int["Y+,+x0Rjj:\u0016B^\u0011mMoE&0GV0\u0007\u001d|9o\u000eblieAN\bP%[iq\u0017N@O<xfCB".length()];
            QB qb4 = new QB("Y+,+x0Rjj:\u0016B^\u0011mMoE&0GV0\u0007\u001d|9o\u000eblieAN\bP%[iq\u0017N@O<xfCB");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd6) + sXd5)));
                i5++;
            }
            clsArr[0] = Class.forName(new String(iArr4, 0, i5));
            Object[] objArr2 = {this};
            Method method = cls.getMethod(C1626yg.Ud("-\u001ac\u0007;;jO\tE\b'\n@he\fd\u001c\u0014~:U\u0005\u0014\u0017\u0002\u0010|a\u0014D+5", (short) (C1607wl.Xd() ^ 13050), (short) (C1607wl.Xd() ^ 16853)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(application, objArr2);
                sentryOptions.getLogger().log(SentryLevel.DEBUG, Ig.wd("J7\u001ar/Up5#G8\u0016FWB+zQ\u007fI\u0015U-@\u0001c6\u0014T\u0011p\u001aAj}=e|N,", (short) (C1633zX.Xd() ^ (-30424))), new Object[0]);
                short sXd7 = (short) (OY.Xd() ^ 5876);
                int[] iArr5 = new int["\u0010x\u001a0g\bxo\u0017\u0016\u0005d21*\u0012V+\u0007".length()];
                QB qb5 = new QB("\u0010x\u001a0g\bxo\u0017\u0016\u0005d21*\u0012V+\u0007");
                int i6 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i6] = xuXd5.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + i6)) + xuXd5.CK(iKK5));
                    i6++;
                }
                IntegrationUtils.addIntegrationToSdkVersion(new String(iArr5, 0, i6));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
