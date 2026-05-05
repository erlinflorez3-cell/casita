package com.dynatrace.android.lifecycle.activitytracking;

import android.app.Application;
import com.dynatrace.agent.di.CoreComponent;
import com.dynatrace.android.agent.metrics.AndroidMetrics;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetrics;
import com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsListener;
import com.dynatrace.android.lifecycle.callback.ActivityComponentIdentifier;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class ActiveActivityMonitor implements ActiveActivityListener, ScreenMetricsListener {
    private ActiveActivityTracker activityTracker;

    @Override // com.dynatrace.android.lifecycle.activitytracking.ActiveActivityListener
    public void onActiveActivityChanged(String str) {
        AndroidMetrics.getInstance().setCurrentActivityName(str);
    }

    @Override // com.dynatrace.android.lifecycle.activitytracking.metrics.ScreenMetricsListener
    public void onScreenMetrics(ScreenMetrics screenMetrics) throws Throwable {
        AndroidMetrics.getInstance().updateScreenMetrics(screenMetrics);
        CoreComponent holder = CoreComponent.Holder.getInstance();
        if (holder != null) {
            holder.getMetricsRepository().updateScreenMetrics(screenMetrics);
        }
    }

    public void startMonitoring(Application application) {
        ActiveActivityTracker activeActivityTracker = new ActiveActivityTracker(new ActivityComponentIdentifier(), this, new ActivityScreenMetricsCollector(), this);
        this.activityTracker = activeActivityTracker;
        Class<?> cls = Class.forName(C1593ug.zd("\u001f-$31,(r'78v\u000b;<9721E;BB", (short) (C1499aX.Xd() ^ (-32238)), (short) (C1499aX.Xd() ^ (-31810))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1607wl.Xd() ^ 16661);
        int[] iArr = new int["u\u0002v\u0004\u007fxr;m{z7Iwvqmfcuinl!=^nbn`jn@\\XVShQYQ.KUTIGHOV".length()];
        QB qb = new QB("u\u0002v\u0004\u007fxr;m{z7Iwvqmfcuinl!=^nbn`jn@\\XVShQYQ.KUTIGHOV");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {activeActivityTracker};
        Method method = cls.getMethod(C1561oA.Kd("~rux\u0004\u0006w\u0006Ux\u000b\u0001\u000f\u0003\u000f\u0015h\u0007\u0005\u0005\u0004\u001b\u0006\u0010\nh\b\u0014\u0015\f\f\u000f\u0018!", (short) (C1499aX.Xd() ^ (-24939))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void stopMonitoring(Application application) {
        ActiveActivityTracker activeActivityTracker = this.activityTracker;
        if (activeActivityTracker != null) {
            application.unregisterActivityLifecycleCallbacks(activeActivityTracker);
            this.activityTracker = null;
        }
    }
}
