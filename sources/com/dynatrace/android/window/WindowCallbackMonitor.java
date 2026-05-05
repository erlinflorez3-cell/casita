package com.dynatrace.android.window;

import android.app.Activity;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class WindowCallbackMonitor {
    private ActivityWindowTracker tracker;

    public void startMonitoring(Application application, Activity activity, List<WindowListenerFactory> list) {
        if (list.isEmpty()) {
            return;
        }
        ActivityWindowTracker activityWindowTrackerNewTracker = ActivityWindowTracker.newTracker(new WindowCallbackInstrumentation(list), activity);
        this.tracker = activityWindowTrackerNewTracker;
        short sXd = (short) (ZN.Xd() ^ 10646);
        int[] iArr = new int["v\u0005w\u0007\u0001{s>~\u000f\fJZ\u000b\b\u0005\u000f\n\u0005\u0019\u000b\u0012\u000e".length()];
        QB qb = new QB("v\u0005w\u0007\u0001{s>~\u000f\fJZ\u000b\b\u0005\u000f\n\u0005\u0019\u000b\u0012\u000e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Object[] objArr = {activityWindowTrackerNewTracker};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("\u0013\u0007\n\r\u0018\u001a\f\u001ai\r\u001f\u0015#\u0017#)|\u001b\u0019\u0019\u0018/\u001a$\u001e|\u001c()  #,5", (short) (C1499aX.Xd() ^ (-1462)), (short) (C1499aX.Xd() ^ (-4297))), Class.forName(C1561oA.Yd("!/&53.*t)9:x\r=>;943G=DDz\u0019<NDRFRX,JHHG^ISM,KWXOOR[d", (short) (FB.Xd() ^ 25806))));
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void stopMonitoring(Application application) {
        ActivityWindowTracker activityWindowTracker = this.tracker;
        if (activityWindowTracker != null) {
            application.unregisterActivityLifecycleCallbacks(activityWindowTracker);
            this.tracker = null;
        }
    }
}
