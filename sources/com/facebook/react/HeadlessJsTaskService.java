package com.facebook.react;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import yg.C1561oA;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HeadlessJsTaskService extends Service implements HeadlessJsTaskEventListener {
    private static PowerManager.WakeLock sWakeLock = null;
    private final Set<Integer> mActiveTasks = new CopyOnWriteArraySet();

    public static void acquireWakeLockNow(Context context) throws Throwable {
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock == null || !wakeLock.isHeld()) {
            String strWd = Ig.wd("\bXrw\u001e", (short) (C1607wl.Xd() ^ 13841));
            Class<?> cls = Class.forName(EO.Od(")\u0004M5d\u001c5 \u0011\u000b\no\u0010%Q*\u0005-\u0006Eq^z", (short) (C1607wl.Xd() ^ 23251)));
            Class<?>[] clsArr = {Class.forName(C1561oA.Qd("\u0016\f \nU\u0013\u0007\u0013\u000bPt\u0015\u0012\b\f\u0004", (short) (FB.Xd() ^ 29266)))};
            Object[] objArr = {strWd};
            short sXd = (short) (FB.Xd() ^ 10990);
            short sXd2 = (short) (FB.Xd() ^ 1717);
            int[] iArr = new int[",+;\u001bB=?1:!4BG;69".length()];
            QB qb = new QB(",+;\u001bB=?1:!4BG;69");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) Assertions.assertNotNull((PowerManager) method.invoke(context, objArr))).newWakeLock(1, HeadlessJsTaskService.class.getCanonicalName());
                sWakeLock = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
                sWakeLock.acquire();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private void createReactContextAndScheduleTask(final HeadlessJsTaskConfig headlessJsTaskConfig) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            final ReactHost reactHost = getReactHost();
            reactHost.addReactInstanceEventListener(new ReactInstanceEventListener() { // from class: com.facebook.react.HeadlessJsTaskService.2
                @Override // com.facebook.react.ReactInstanceEventListener
                public void onReactContextInitialized(ReactContext reactContext) {
                    HeadlessJsTaskService.this.invokeStartTask(reactContext, headlessJsTaskConfig);
                    reactHost.removeReactInstanceEventListener(this);
                }
            });
            reactHost.start();
        } else {
            final ReactInstanceManager reactInstanceManager = getReactNativeHost().getReactInstanceManager();
            reactInstanceManager.addReactInstanceEventListener(new ReactInstanceEventListener() { // from class: com.facebook.react.HeadlessJsTaskService.3
                @Override // com.facebook.react.ReactInstanceEventListener
                public void onReactContextInitialized(ReactContext reactContext) {
                    HeadlessJsTaskService.this.invokeStartTask(reactContext, headlessJsTaskConfig);
                    reactInstanceManager.removeReactInstanceEventListener(this);
                }
            });
            reactInstanceManager.createReactContextInBackground();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeStartTask(ReactContext reactContext, final HeadlessJsTaskConfig headlessJsTaskConfig) {
        final HeadlessJsTaskContext headlessJsTaskContext = HeadlessJsTaskContext.getInstance(reactContext);
        headlessJsTaskContext.addTaskEventListener(this);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.HeadlessJsTaskService.1
            @Override // java.lang.Runnable
            public void run() {
                HeadlessJsTaskService.this.mActiveTasks.add(Integer.valueOf(headlessJsTaskContext.startTask(headlessJsTaskConfig)));
            }
        });
    }

    protected ReactContext getReactContext() {
        if (!ReactFeatureFlags.enableBridgelessArchitecture) {
            return getReactNativeHost().getReactInstanceManager().getCurrentReactContext();
        }
        ReactHost reactHost = getReactHost();
        Assertions.assertNotNull(reactHost, "getReactHost() is null in New Architecture");
        return reactHost.getCurrentReactContext();
    }

    protected ReactHost getReactHost() {
        return ((ReactApplication) getApplication()).getReactHost();
    }

    protected ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) getApplication()).getReactNativeHost();
    }

    protected HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ReactContext reactContext = getReactContext();
        if (reactContext != null) {
            HeadlessJsTaskContext.getInstance(reactContext).removeTaskEventListener(this);
        }
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskFinish(int i2) {
        this.mActiveTasks.remove(Integer.valueOf(i2));
        if (this.mActiveTasks.size() == 0) {
            stopSelf();
        }
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskStart(int i2) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) throws Throwable {
        HeadlessJsTaskConfig taskConfig = getTaskConfig(intent);
        if (taskConfig == null) {
            return 2;
        }
        startTask(taskConfig);
        return 3;
    }

    protected void startTask(HeadlessJsTaskConfig headlessJsTaskConfig) throws Throwable {
        UiThreadUtil.assertOnUiThread();
        acquireWakeLockNow(this);
        ReactContext reactContext = getReactContext();
        if (reactContext == null) {
            createReactContextAndScheduleTask(headlessJsTaskConfig);
        } else {
            invokeStartTask(reactContext, headlessJsTaskConfig);
        }
    }
}
