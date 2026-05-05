package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.IHub;
import io.sentry.Integration;
import io.sentry.SentryOptions;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.OY;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public final class CurrentActivityIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {
    private final Application application;

    public CurrentActivityIntegration(Application application) {
        this.application = (Application) Objects.requireNonNull(application, "Application is required");
    }

    private void cleanCurrentActivity(Activity activity) {
        if (CurrentActivityHolder.getInstance().getActivity() == activity) {
            CurrentActivityHolder.getInstance().clearActivity();
        }
    }

    private void setCurrentActivity(Activity activity) {
        CurrentActivityHolder.getInstance().setActivity(activity);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.application.unregisterActivityLifecycleCallbacks(this);
        CurrentActivityHolder.getInstance().clearActivity();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        setCurrentActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        cleanCurrentActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        cleanCurrentActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        setCurrentActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        setCurrentActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        cleanCurrentActivity(activity);
    }

    @Override // io.sentry.Integration
    public void register(IHub iHub, SentryOptions sentryOptions) throws Throwable {
        Application application = this.application;
        Object[] objArr = {this};
        Method method = Class.forName(C1593ug.zd("\u0016$\u001b*(#\u001fi\u001e./m\u0002230.)(<299", (short) (ZN.Xd() ^ 27530), (short) (ZN.Xd() ^ 3676))).getMethod(C1561oA.Kd("\\PSVacUc3Vh^l`lrFdbbaxcmgFeqriilu~", (short) (C1499aX.Xd() ^ (-19599))), Class.forName(C1561oA.od("1=2?;4.v)76r\u000532-)\"\u001f1%*(\\x\u001a*\u001e*\u001c&*{\u0018\u0014\u0012\u000f$\r\u0015\ri\u0007\u0011\u0010\u0005\u0003\u0004\u000b\u0012", (short) (OY.Xd() ^ 24750))));
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
