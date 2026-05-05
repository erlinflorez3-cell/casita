package io.invertase.firebase.common;

import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.invertase.firebase.interfaces.NativeEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseEventEmitter {
    private static ReactNativeFirebaseEventEmitter sharedInstance = new ReactNativeFirebaseEventEmitter();
    private final Handler handler;
    private int jsListenerCount;
    private final HashMap<String, Integer> jsListeners;
    private Boolean jsReady;
    private final List<NativeEvent> queuedEvents = new ArrayList();
    private ReactContext reactContext;

    public ReactNativeFirebaseEventEmitter() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Yd("O]Tca\\X#ej&Eijlbp", (short) (Od.Xd() ^ (-3592)))).getDeclaredMethod(Xg.qd("TSc=R[a@deg]k", (short) (C1580rY.Xd() ^ (-15201)), (short) (C1580rY.Xd() ^ (-12005))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.jsListeners = new HashMap<>();
            this.jsReady = false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private boolean emit(NativeEvent nativeEvent) {
        ReactContext reactContext;
        if (this.jsReady.booleanValue() && (reactContext = this.reactContext) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + nativeEvent.getEventName(), nativeEvent.getEventBody());
                return true;
            } catch (Exception e2) {
                String str = "Error sending Event " + nativeEvent.getEventName();
            }
        }
        return false;
    }

    public static ReactNativeFirebaseEventEmitter getSharedInstance() {
        return sharedInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$attachReactContext$0(ReactContext reactContext) {
        this.reactContext = reactContext;
        sendQueuedEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyJsReady$1(Boolean bool) {
        this.jsReady = bool;
        sendQueuedEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendEvent$2(NativeEvent nativeEvent) {
        synchronized (this.jsListeners) {
            if (!this.jsListeners.containsKey(nativeEvent.getEventName()) || !emit(nativeEvent)) {
                this.queuedEvents.add(nativeEvent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendQueuedEvents() {
        synchronized (this.jsListeners) {
            for (NativeEvent nativeEvent : new ArrayList(this.queuedEvents)) {
                if (this.jsListeners.containsKey(nativeEvent.getEventName())) {
                    this.queuedEvents.remove(nativeEvent);
                    sendEvent(nativeEvent);
                }
            }
        }
    }

    public void addListener(String str) throws Throwable {
        synchronized (this.jsListeners) {
            this.jsListenerCount++;
            if (this.jsListeners.containsKey(str)) {
                this.jsListeners.put(str, Integer.valueOf(this.jsListeners.get(str).intValue() + 1));
            } else {
                this.jsListeners.put(str, 1);
            }
        }
        Handler handler = this.handler;
        Object[] objArr = {new Runnable() { // from class: io.invertase.firebase.common.ReactNativeFirebaseEventEmitter$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.sendQueuedEvents();
            }
        }};
        Method method = Class.forName(Jg.Wd("tdY\f\u0010Kh;{$&_|\u0011(rt!", (short) (C1633zX.Xd() ^ (-21765)), (short) (C1633zX.Xd() ^ (-30879)))).getMethod(C1626yg.Ud("['\u0010H", (short) (C1499aX.Xd() ^ (-2916)), (short) (C1499aX.Xd() ^ (-153))), Class.forName(ZO.xd("\u000eGic}qYZ\u0018b@\u0010RpbL\u0003<", (short) (FB.Xd() ^ 32306), (short) (FB.Xd() ^ 18067))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void attachReactContext(final ReactContext reactContext) throws Throwable {
        Handler handler = this.handler;
        Object[] objArr = {new Runnable() { // from class: io.invertase.firebase.common.ReactNativeFirebaseEventEmitter$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$attachReactContext$0(reactContext);
            }
        }};
        Method method = Class.forName(Ig.wd("}g)\u0011\u00130YP39sq<=U%u~", (short) (C1580rY.Xd() ^ (-2432)))).getMethod(C1561oA.Qd("sqtt", (short) (Od.Xd() ^ (-15461))), Class.forName(EO.Od("}\"gtcV)1PU}=`hm\u000bQZ", (short) (C1607wl.Xd() ^ 5100))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public WritableMap getListenersMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap.putInt("listeners", this.jsListenerCount);
        writableMapCreateMap.putInt("queued", this.queuedEvents.size());
        synchronized (this.jsListeners) {
            for (Map.Entry<String, Integer> entry : this.jsListeners.entrySet()) {
                writableMapCreateMap2.putInt(entry.getKey(), entry.getValue().intValue());
            }
        }
        writableMapCreateMap.putMap("events", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public void notifyJsReady(final Boolean bool) throws Throwable {
        Handler handler = this.handler;
        Runnable runnable = new Runnable() { // from class: io.invertase.firebase.common.ReactNativeFirebaseEventEmitter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$notifyJsReady$1(bool);
            }
        };
        Class<?> cls = Class.forName(C1593ug.zd("!/&53.*t7<w\u0013-;2;5C", (short) (C1633zX.Xd() ^ (-14170)), (short) (C1633zX.Xd() ^ (-1006))));
        Class<?>[] clsArr = {Class.forName(C1561oA.od("B8L6\u0002?3?7| B:9++4,", (short) (OY.Xd() ^ 16873)))};
        Object[] objArr = {runnable};
        short sXd = (short) (ZN.Xd() ^ 7742);
        int[] iArr = new int["\u0011\u0011\u0016\u0018".length()];
        QB qb = new QB("\u0011\u0011\u0016\u0018");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void removeListener(String str, Boolean bool) {
        synchronized (this.jsListeners) {
            if (this.jsListeners.containsKey(str)) {
                int iIntValue = this.jsListeners.get(str).intValue();
                if (iIntValue <= 1 || bool.booleanValue()) {
                    this.jsListeners.remove(str);
                } else {
                    this.jsListeners.put(str, Integer.valueOf(iIntValue - 1));
                }
                int i2 = this.jsListenerCount;
                if (!bool.booleanValue()) {
                    iIntValue = 1;
                }
                this.jsListenerCount = i2 - iIntValue;
            }
        }
    }

    public void sendEvent(final NativeEvent nativeEvent) throws Throwable {
        Handler handler = this.handler;
        Runnable runnable = new Runnable() { // from class: io.invertase.firebase.common.ReactNativeFirebaseEventEmitter$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$sendEvent$2(nativeEvent);
            }
        };
        Class<?> cls = Class.forName(Wg.Zd("\u001eMc\u001a(:e@\u001aN\"\\\u0016>Tt\u000fD", (short) (C1633zX.Xd() ^ (-23028)), (short) (C1633zX.Xd() ^ (-7906))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Xd("\u0015\r#\u000f\\\u001c\u0012 \u001aa\u0007+%&\u001a\u001c'!", (short) (ZN.Xd() ^ 1608)))};
        Object[] objArr = {runnable};
        short sXd = (short) (C1499aX.Xd() ^ (-22391));
        int[] iArr = new int["**+-".length()];
        QB qb = new QB("**+-");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
