package io.cobrowse;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import yg.C1561oA;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
final class ActivityWatcher implements Application.ActivityLifecycleCallbacks {
    private static WeakReference<Activity> foregroundActivity = null;
    private final Application application;
    private static final HashSet<Observer> observers = new HashSet<>();
    private static final LinkedList<WeakReference<Activity>> activities = new LinkedList<>();

    interface Observer {
        void activityChanged(Activity activity, Activity activity2);
    }

    ActivityWatcher(Application application) throws Throwable {
        this.application = application;
        short sXd = (short) (C1607wl.Xd() ^ 28931);
        short sXd2 = (short) (C1607wl.Xd() ^ 7313);
        int[] iArr = new int["kyp\u007f}xt?s\u0004\u0005CW\b\t\u0006\u0004~}\u0012\b\u000f\u000f".length()];
        QB qb = new QB("kyp\u007f}xt?s\u0004\u0005CW\b\t\u0006\u0004~}\u0012\b\u000f\u000f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = {this};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd("F:=@KM?M\u001d@RHVJV\\0NLLKbMWQ0O[\\SSV_h", (short) (Od.Xd() ^ (-12235))), Class.forName(C1561oA.od("@LANJC=\u00068FE\u0002\u0014BA<81.@497k\b)9-9+59\u000b'#!\u001e3\u001c$\u001cx\u0016 \u001f\u0014\u0012\u0013\u001a!", (short) (C1607wl.Xd() ^ 14499))));
        try {
            method.setAccessible(true);
            method.invoke(application, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void clear(Activity activity) {
        WeakReference<Activity> weakReference = null;
        for (WeakReference<Activity> weakReference2 : activities) {
            if (activity.equals(weakReference2.get())) {
                weakReference = weakReference2;
            }
        }
        if (weakReference != null) {
            activities.remove(weakReference);
        }
        if (foregroundActivity() == activity) {
            setForeground(null);
        }
    }

    static Activity foregroundActivity() {
        WeakReference<Activity> weakReference = foregroundActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    static Set<Activity> getActivities() {
        HashSet hashSet = new HashSet();
        Iterator<WeakReference<Activity>> it = activities.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity != null) {
                hashSet.add(activity);
            }
        }
        return hashSet;
    }

    static void registerActivityObserver(Observer observer) {
        observers.add(observer);
    }

    static void removeActivityObserver(Observer observer) {
        observers.remove(observer);
    }

    private static void setForeground(Activity activity) {
        track(activity);
        Activity activityForegroundActivity = foregroundActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            foregroundActivity = null;
        } else {
            foregroundActivity = new WeakReference<>(activity);
        }
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            it.next().activityChanged(activity, activityForegroundActivity);
        }
    }

    private static void track(Activity activity) {
        if (activity == null || getActivities().contains(activity)) {
            return;
        }
        activities.addLast(new WeakReference<>(activity));
    }

    void destroy() {
        this.application.unregisterActivityLifecycleCallbacks(this);
        activities.clear();
        foregroundActivity = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        String str = "Activity created " + activity;
        track(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        String str = "Activity destroyed " + activity;
        clear(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String str = "Activity paused " + activity;
        if (foregroundActivity() == activity) {
            setForeground(null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        String str = "Activity resumed " + activity;
        track(activity);
        setForeground(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        String str = "Activity started " + activity;
        track(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        String str = "Activity stopped " + activity;
    }
}
