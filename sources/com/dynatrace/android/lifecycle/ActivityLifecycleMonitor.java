package com.dynatrace.android.lifecycle;

import android.app.Application;
import android.os.Build;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.events.lifecycle.FinishedActionObserver;
import com.dynatrace.android.agent.events.lifecycle.StoreActionObserver;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.lifecycle.action.LifecycleActionFactoryImpl;
import com.dynatrace.android.lifecycle.callback.ActivityComponentIdentifier;
import com.dynatrace.android.lifecycle.callback.ActivityLifecycleListener;
import com.dynatrace.android.lifecycle.callback.ActivityLifecycleListenerLegacy;
import com.dynatrace.android.useraction.ActionAggregatorImpl;
import com.dynatrace.android.useraction.LoadingActionNameGenerator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class ActivityLifecycleMonitor {
    private Application.ActivityLifecycleCallbacks lifecycleCallbacks;

    public void startMonitoring(Application application, TimeLineProvider timeLineProvider) {
        LifecycleController lifecycleController = new LifecycleController(new LifecycleActionFactoryImpl(), new FinishedActionObserver(), new StoreActionObserver(), new MeasurementProviderImpl(timeLineProvider), new ActionAggregatorImpl(new LoadingActionNameGenerator()));
        ActivityComponentIdentifier activityComponentIdentifier = new ActivityComponentIdentifier();
        Application.ActivityLifecycleCallbacks activityLifecycleListener = Build.VERSION.SDK_INT >= 29 ? new ActivityLifecycleListener(lifecycleController, activityComponentIdentifier) : new ActivityLifecycleListenerLegacy(lifecycleController, activityComponentIdentifier);
        this.lifecycleCallbacks = activityLifecycleListener;
        Class<?> cls = Class.forName(Ig.wd("X8:m8U:yN\u0013\u0013p5X\u000b\u000ebD\b!W'J", (short) (FB.Xd() ^ 13682)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (Od.Xd() ^ (-3709));
        int[] iArr = new int["\u001ba\u00063x(~8\u0013eg?}3'<v\u000f4\u007f\fj;l`N>{nP7\u0017QM\u0001:'\u0019k\u0003w>\u000f .8l@\u001a\u0003".length()];
        QB qb = new QB("\u001ba\u00063x(~8\u0013eg?}3'<v\u000f4\u007f\fj;l`N>{nP7\u0017QM\u0001:'\u0019k\u0003w>\u000f .8l@\u001a\u0003");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {activityLifecycleListener};
        short sXd2 = (short) (Od.Xd() ^ (-20839));
        int[] iArr2 = new int["+\u001d\u001e\u001f((\u0018$q\u0013#\u0017#\u0015\u001f#t\u0011\r\u000b\b\u001d\u0006\u000e\u0006b\u007f\n\t}{|\u0004\u000b".length()];
        QB qb2 = new QB("+\u001d\u001e\u001f((\u0018$q\u0013#\u0017#\u0015\u001f#t\u0011\r\u000b\b\u001d\u0006\u000e\u0006b\u007f\n\t}{|\u0004\u000b");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void stopMonitoring(Application application) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.lifecycleCallbacks;
        if (activityLifecycleCallbacks != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            this.lifecycleCallbacks = null;
        }
    }
}
