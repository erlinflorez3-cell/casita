package com.dynatrace.android.lifecycle.appstate;

import android.app.Application;
import com.dynatrace.android.agent.AppFgBgStateListener;
import com.dynatrace.android.lifecycle.callback.ActivityComponentIdentifier;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Qg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class ApplicationStateMonitor {
    private ApplicationStateTracker tracker;

    public void startMonitoring(Application application) {
        ApplicationStateTracker applicationStateTracker = new ApplicationStateTracker(new ActivityComponentIdentifier());
        this.tracker = applicationStateTracker;
        applicationStateTracker.registerAppStateListener(new AppFgBgStateListener());
        Object[] objArr = {this.tracker};
        Method method = Class.forName(Qg.kd("\u000e\u001a\u000f\u001c\u0018\u0011\u000bS\u0006\u0014\u0013Oa\u0010\u000f\n\u0006~{\u000e\u0002\u0007\u0005", (short) (ZN.Xd() ^ 25989), (short) (ZN.Xd() ^ 26715))).getMethod(C1561oA.ud("\n{|}\u0007\u0007v\u0003Pq\u0002u\u0002s}\u0002Sokif{dldA^hg\\Z[bi", (short) (FB.Xd() ^ 10600)), Class.forName(hg.Vd("frgtpic,^lk(:hgb^WTfZ_]\u0012.O_S_Q[_1MIGDYBJB\u001f<FE:89@G", (short) (C1633zX.Xd() ^ (-16882)), (short) (C1633zX.Xd() ^ (-14492)))));
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void stopMonitoring(Application application) {
        ApplicationStateTracker applicationStateTracker = this.tracker;
        if (applicationStateTracker != null) {
            application.unregisterActivityLifecycleCallbacks(applicationStateTracker);
            this.tracker = null;
        }
    }
}
