package com.dynatrace.android.lifecycle.appstart;

import android.app.Application;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.measurement.MeasurementProvider;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.appstart.AppStartAction;
import com.dynatrace.android.useraction.AppStartPlaceholderSegment;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class AppStartController {
    private static final String LOG_TAG = Global.LOG_PREFIX + "AppStartController";
    private final ActivityStateListener activityStateListener;
    private AppStartAction.Builder appStartActionBuilder;
    private final AppStartActionObserver appStartActionObserver;
    private final AppStartAggregator appStartAggregator;
    private final Application application;
    private final AtomicBoolean isActionFinalized = new AtomicBoolean(false);
    private final MeasurementProvider measurementProvider;

    public AppStartController(MeasurementProvider measurementProvider, AppStartAggregator appStartAggregator, AppStartActionObserver appStartActionObserver, Application application) {
        this.measurementProvider = measurementProvider;
        this.appStartAggregator = appStartAggregator;
        this.appStartActionObserver = appStartActionObserver;
        this.application = application;
        this.activityStateListener = new ActivityStateListener(this, measurementProvider);
    }

    public void appStart(String str, MeasurementPoint measurementPoint, MeasurementPoint measurementPoint2) throws Throwable {
        DTXAutoActionWrapper dTXAutoActionWrapperDetermineUserAction = this.appStartAggregator.determineUserAction(str, measurementPoint);
        dTXAutoActionWrapperDetermineUserAction.startTimer(5000);
        AppStartPlaceholderSegment appStartPlaceholderSegment = new AppStartPlaceholderSegment(str, dTXAutoActionWrapperDetermineUserAction, this);
        this.appStartAggregator.aggregatePlaceholder(appStartPlaceholderSegment);
        this.appStartActionBuilder = new AppStartAction.Builder().withName(str).withStartPoint(measurementPoint2).withParentAction(dTXAutoActionWrapperDetermineUserAction).withPlaceholderSegment(appStartPlaceholderSegment);
        Application application = this.application;
        Object[] objArr = {this.activityStateListener};
        Method method = Class.forName(Wg.Zd("kLG \"J\u000ee^w\u001d.FDEoq|AaxMV", (short) (C1580rY.Xd() ^ (-15678)), (short) (C1580rY.Xd() ^ (-11709)))).getMethod(Wg.vd("8*+,55%1~ 0$0\",0\">:85J3;3\u0010-76+)*QX", (short) (FB.Xd() ^ 27139)), Class.forName(C1561oA.Xd("Zh_nlgc.brs2Fvwtrml\u0001v}}4Ru\b}\f\u007f\f\u0012e\u0004\u0002\u0002\u0001\u0018\u0003\r\u0007e\u0005\u0011\u0012\t\t\f\u0015\u001e", (short) (ZN.Xd() ^ 22485))));
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void appStartComplete(MeasurementPoint measurementPoint, String str) {
        if (this.isActionFinalized.compareAndSet(false, true)) {
            this.appStartActionBuilder.withEndPoint(measurementPoint);
            this.appStartActionBuilder.withName(str);
            AppStartAction appStartActionBuild = this.appStartActionBuilder.build();
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "AppStart action completed: " + appStartActionBuild);
            }
            this.appStartActionObserver.onAppStartCompleted(appStartActionBuild);
            this.application.unregisterActivityLifecycleCallbacks(this.activityStateListener);
        }
    }

    public void appStartStopped() {
        appStartComplete(this.measurementProvider.measure(), null);
    }

    public void cancelAppStart() {
        if (this.isActionFinalized.compareAndSet(false, true)) {
            this.application.unregisterActivityLifecycleCallbacks(this.activityStateListener);
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "AppStart action dropped");
            }
        }
    }

    ActivityStateListener getActivityStateListener() {
        return this.activityStateListener;
    }

    AppStartAction.Builder getAppStartActionBuilder() {
        return this.appStartActionBuilder;
    }

    boolean isActionFinalized() {
        return this.isActionFinalized.get();
    }
}
