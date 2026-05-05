package com.ocetnik.timer;

import android.os.Handler;
import android.os.PowerManager;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class BackgroundTimerModule extends ReactContextBaseJavaModule {
    private Handler handler;
    private final LifecycleEventListener listener;
    private PowerManager powerManager;
    private ReactContext reactContext;
    private Runnable runnable;
    private PowerManager.WakeLock wakeLock;

    public BackgroundTimerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        LifecycleEventListener lifecycleEventListener = new LifecycleEventListener() { // from class: com.ocetnik.timer.BackgroundTimerModule.1
            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
                if (BackgroundTimerModule.this.wakeLock.isHeld()) {
                    BackgroundTimerModule.this.wakeLock.release();
                }
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
            }
        };
        this.listener = lifecycleEventListener;
        this.reactContext = reactApplicationContext;
        PowerManager powerManager = (PowerManager) getReactApplicationContext().getSystemService("power");
        this.powerManager = powerManager;
        this.wakeLock = powerManager.newWakeLock(1, "rohit_bg_wakelock");
        reactApplicationContext.addLifecycleEventListener(lifecycleEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNBackgroundTimer";
    }

    @ReactMethod
    public void setTimeout(final int i2, double d2) throws Throwable {
        Handler handler = new Handler();
        Runnable runnable = new Runnable() { // from class: com.ocetnik.timer.BackgroundTimerModule.3
            @Override // java.lang.Runnable
            public void run() {
                if (BackgroundTimerModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) BackgroundTimerModule.this.getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("backgroundTimer.timeout", Integer.valueOf(i2));
                }
            }
        };
        Class<?> cls = Class.forName(hg.Vd("frgtpic,lo)BZf[bZf", (short) (C1580rY.Xd() ^ (-7895)), (short) (C1580rY.Xd() ^ (-23702))));
        Class<?>[] clsArr = {Class.forName(C1561oA.ud("'\u001d1\u001bf$\u0018$\u001ca\u0005'\u001f\u001e\u0010\u0010\u0019\u0011", (short) (Od.Xd() ^ (-26776)))), Long.TYPE};
        Object[] objArr = {runnable, Long.valueOf((long) d2)};
        Method method = cls.getMethod(C1561oA.yd("\u0013\u0013\u0014\u0016b\u0005\t~$\u0011\r", (short) (FB.Xd() ^ 23173)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void start(int i2) throws Throwable {
        if (!this.wakeLock.isHeld()) {
            this.wakeLock.acquire();
        }
        this.handler = new Handler();
        Runnable runnable = new Runnable() { // from class: com.ocetnik.timer.BackgroundTimerModule.2
            @Override // java.lang.Runnable
            public void run() {
                BackgroundTimerModule backgroundTimerModule = BackgroundTimerModule.this;
                backgroundTimerModule.sendEvent(backgroundTimerModule.reactContext, "backgroundTimer");
            }
        };
        this.runnable = runnable;
        Handler handler = this.handler;
        short sXd = (short) (ZN.Xd() ^ 28223);
        int[] iArr = new int["7E<KID@\u000bMR\u000e)CQHQKY".length()];
        QB qb = new QB("7E<KID@\u000bMR\u000e)CQHQKY");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (FB.Xd() ^ 12414);
        short sXd3 = (short) (FB.Xd() ^ 22223);
        int[] iArr2 = new int["\u0007~\u0015\u0001N\u000e\u0004\u0012\fSx\u001d\u0017\u0018\f\u000e\u0019\u0013".length()];
        QB qb2 = new QB("\u0007~\u0015\u0001N\u000e\u0004\u0012\fSx\u001d\u0017\u0018\f\u000e\u0019\u0013");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i4)) + sXd3);
            i4++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i4));
        Object[] objArr = {runnable};
        Method method = cls.getMethod(Jg.Wd("\"e\u001fE", (short) (C1499aX.Xd() ^ (-6949)), (short) (C1499aX.Xd() ^ (-28334))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void stop() {
        if (this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacks(this.runnable);
        }
    }
}
