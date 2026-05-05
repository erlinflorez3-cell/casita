package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.ProcessUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1499aX;
import yg.C1561oA;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final BackgroundDetector zza = new BackgroundDetector();
    private final AtomicBoolean zzb = new AtomicBoolean();
    private final AtomicBoolean zzc = new AtomicBoolean();
    private final ArrayList zzd = new ArrayList();
    private boolean zze = false;

    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z2);
    }

    private BackgroundDetector() {
    }

    public static BackgroundDetector getInstance() {
        return zza;
    }

    public static void initialize(Application application) {
        BackgroundDetector backgroundDetector = zza;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.zze) {
                short sXd = (short) (C1499aX.Xd() ^ (-12550));
                int[] iArr = new int["Zf[hd]W R`_\u001c.\\[VRKHZNSQ".length()];
                QB qb = new QB("Zf[hd]W R`_\u001c.\\[VRKHZNSQ");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Object[] objArr = {backgroundDetector};
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd("f%Z(e\u001aV\u0018\u001a\bLsLq(\u0001\u0007O S|f\u00037\u0004\f]<g\u0011c\u0012L(", (short) (ZN.Xd() ^ 6351), (short) (ZN.Xd() ^ 15286)), Class.forName(C1561oA.Kd("\u0010\u001e\u0015$\"\u001d\u0019c\u0018()g{,-*(#\"6,33i\b+=3A5AG\u001b9776M8B<\u001b:FG>>AJS", (short) (FB.Xd() ^ 24772))));
                try {
                    method.setAccessible(true);
                    method.invoke(application, objArr);
                    application.registerComponentCallbacks(backgroundDetector);
                    backgroundDetector.zze = true;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }

    private final void zza(boolean z2) {
        synchronized (zza) {
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                ((BackgroundStateChangeListener) it.next()).onBackgroundStateChanged(z2);
            }
        }
    }

    public void addListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (zza) {
            this.zzd.add(backgroundStateChangeListener);
        }
    }

    public boolean isInBackground() {
        return this.zzb.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.zzc;
        boolean zCompareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.zzc;
        boolean zCompareAndSet = this.zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.zzb.compareAndSet(false, true)) {
            this.zzc.set(true);
            zza(true);
        }
    }

    public boolean readCurrentStateIfPossible(boolean z2) {
        if (!this.zzc.get()) {
            if (ProcessUtils.zza()) {
                return z2;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.zzc.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.zzb.set(true);
            }
        }
        return isInBackground();
    }
}
