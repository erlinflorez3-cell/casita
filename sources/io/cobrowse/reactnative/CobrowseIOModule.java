package io.cobrowse.reactnative;

import android.app.Activity;
import android.os.Handler;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import io.cobrowse.Callback;
import io.cobrowse.CobrowseAccessibilityService;
import io.cobrowse.CobrowseIO;
import io.cobrowse.Session;
import io.cobrowse.reactnative.CobrowseIO;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class CobrowseIOModule extends ReactContextBaseJavaModule {
    public static CobrowseIO.Delegate delegate = null;
    private CobrowseIOCommonDelegates delegates;

    CobrowseIOModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.delegates = new CommonDelegates(reactApplicationContext);
        io.cobrowse.CobrowseIO.instance().setDelegate(this.delegates);
    }

    @ReactMethod
    public void accessibilityServiceIsRunning(Promise promise) {
        promise.resolve(Boolean.valueOf(CobrowseAccessibilityService.isRunning(getReactApplicationContext())));
    }

    @ReactMethod
    public void accessibilityServiceShowSetup(Promise promise) throws Exception {
        CobrowseAccessibilityService.showSetup(getReactApplicationContext());
        promise.resolve(null);
    }

    @ReactMethod
    public void activateSession(final Promise promise) throws Throwable {
        Handler handler = new Handler(getReactApplicationContext().getMainLooper());
        Runnable runnable = new Runnable() { // from class: io.cobrowse.reactnative.CobrowseIOModule.4
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                Session sessionCurrentSession = io.cobrowse.CobrowseIO.instance().currentSession();
                if (sessionCurrentSession != null) {
                    sessionCurrentSession.activate(new Callback<Error, Session>() { // from class: io.cobrowse.reactnative.CobrowseIOModule.4.1
                        @Override // io.cobrowse.Callback
                        public void call(Error error, Session session) {
                            if (error != null) {
                                promise.reject("cbio_activate_session_failed", error);
                            } else {
                                promise.resolve(Conversion.convert(session));
                            }
                        }
                    });
                    return;
                }
                Promise promise2 = promise;
                short sXd = (short) (Od.Xd() ^ (-2044));
                short sXd2 = (short) (Od.Xd() ^ (-6982));
                int[] iArr = new int["ygL\u00129)]E~[".length()];
                QB qb = new QB("ygL\u00129)]E~[");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                Object[] objArr = {new String(iArr, 0, i2)};
                Constructor<?> constructor = Class.forName(ZO.xd("3\bq\u001b\u000br\u0005Pdt\rAUF\u0019", (short) (Od.Xd() ^ (-14601)), (short) (Od.Xd() ^ (-24763)))).getConstructor(Class.forName(C1626yg.Ud("2_'_\u0004+L\u0002<\u000b\u000b[1X::", (short) (OY.Xd() ^ 8355), (short) (OY.Xd() ^ 30069))));
                try {
                    constructor.setAccessible(true);
                    Error error = (Error) constructor.newInstance(objArr);
                    short sXd3 = (short) (FB.Xd() ^ 15057);
                    int[] iArr2 = new int["}USn(Hl\u0017EGt*MQ9\u0011rg".length()];
                    QB qb2 = new QB("}USn(Hl\u0017EGt*MQ9\u0011rg");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                        i3++;
                    }
                    promise2.reject(new String(iArr2, 0, i3), error);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        };
        Class<?> cls = Class.forName(EO.Od("@\u0014\u001aIP\bX$\u0015F|;\u007f\u001d|(>;", (short) (Od.Xd() ^ (-30643))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (OY.Xd() ^ 16489);
        int[] iArr = new int["1';%p.\".&k\u000f1)(\u001a\u001a#\u001b".length()];
        QB qb = new QB("1';%p.\".&k\u000f1)(\u001a\u001a#\u001b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {runnable};
        Method method = cls.getMethod(C1593ug.zd("\u001a\u001a\u001f!", (short) (C1607wl.Xd() ^ 7182), (short) (C1607wl.Xd() ^ 27291)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void api(String str) {
        io.cobrowse.CobrowseIO.instance().api(str);
    }

    @ReactMethod
    public void capabilities(ReadableArray readableArray) {
        String[] strArr = new String[readableArray.size()];
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            try {
                strArr[i2] = readableArray.getString(i2);
            } catch (UnexpectedNativeTypeException e2) {
                String str = "Failed to process capabilities: " + e2.getMessage();
            }
        }
        io.cobrowse.CobrowseIO.instance().capabilities(strArr);
    }

    @ReactMethod
    public void createSession(final Promise promise) throws Throwable {
        Handler handler = new Handler(getReactApplicationContext().getMainLooper());
        Object[] objArr = {new Runnable() { // from class: io.cobrowse.reactnative.CobrowseIOModule.2
            @Override // java.lang.Runnable
            public void run() {
                io.cobrowse.CobrowseIO.instance().createSession(new Callback<Error, Session>() { // from class: io.cobrowse.reactnative.CobrowseIOModule.2.1
                    @Override // io.cobrowse.Callback
                    public void call(Error error, Session session) {
                        if (error != null) {
                            promise.reject("cbio_create_session_failed", error);
                        } else {
                            promise.resolve(Conversion.convert(session));
                        }
                    }
                });
            }
        }};
        Method method = Class.forName(C1561oA.od("q}r\u007f{tn7wz4Meqfmeq", (short) (C1580rY.Xd() ^ (-10984)))).getMethod(Wg.Zd("4\u001d\u0013\u001e", (short) (C1580rY.Xd() ^ (-28781)), (short) (C1580rY.Xd() ^ (-7705))), Class.forName(C1561oA.Kd("=5K7\u0005D:HB\n/SMNBDOI", (short) (C1633zX.Xd() ^ (-8213)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void currentSession(Promise promise) {
        promise.resolve(Conversion.convert(io.cobrowse.CobrowseIO.instance().currentSession()));
    }

    @ReactMethod
    public void customData(ReadableMap readableMap) {
        io.cobrowse.CobrowseIO.instance().customData(readableMap.toHashMap());
    }

    @ReactMethod
    public void deviceToken(String str) {
        if (getReactApplicationContext().getCurrentActivity() != null) {
            io.cobrowse.CobrowseIO.instance().setDeviceToken(getReactApplicationContext().getCurrentActivity().getApplication(), str);
        }
    }

    @ReactMethod
    public void endSession(final Promise promise) throws Throwable {
        Handler handler = new Handler(getReactApplicationContext().getMainLooper());
        Runnable runnable = new Runnable() { // from class: io.cobrowse.reactnative.CobrowseIOModule.5
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                Session sessionCurrentSession = io.cobrowse.CobrowseIO.instance().currentSession();
                if (sessionCurrentSession == null) {
                    promise.resolve(null);
                } else {
                    sessionCurrentSession.end(new Callback<Error, Session>() { // from class: io.cobrowse.reactnative.CobrowseIOModule.5.1
                        @Override // io.cobrowse.Callback
                        public void call(Error error, Session session) {
                            if (error != null) {
                                promise.reject("cbio_end_session_failed", error);
                            } else {
                                promise.resolve(null);
                            }
                        }
                    });
                }
            }
        };
        Class<?> cls = Class.forName(C1561oA.Xd("=KBQOJF\u0011SX\u0014/IWNWQ_", (short) (FB.Xd() ^ 6748)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (ZN.Xd() ^ 6974);
        int[] iArr = new int["PF^H\u0018UMYU\u001bBd`_UUB:".length()];
        QB qb = new QB("PF^H\u0018UMYU\u001bBd`_UUB:");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {runnable};
        Method method = cls.getMethod(Qg.kd("qorr", (short) (C1607wl.Xd() ^ 28917), (short) (C1607wl.Xd() ^ 21936)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CobrowseIO";
    }

    @ReactMethod
    public void getSession(final String str, final Promise promise) throws Throwable {
        Handler handler = new Handler(getReactApplicationContext().getMainLooper());
        Object[] objArr = {new Runnable() { // from class: io.cobrowse.reactnative.CobrowseIOModule.3
            @Override // java.lang.Runnable
            public void run() {
                io.cobrowse.CobrowseIO.instance().getSession(str, new Callback<Error, Session>() { // from class: io.cobrowse.reactnative.CobrowseIOModule.3.1
                    @Override // io.cobrowse.Callback
                    public void call(Error error, Session session) {
                        if (error != null) {
                            promise.reject("cbio_get_session_failed", error);
                        } else {
                            promise.resolve(Conversion.convert(session));
                        }
                    }
                });
            }
        }};
        Method method = Class.forName(hg.Vd("\u0007\u0013\b\u0015\u0011\n\u0004L\r\u0010Ibz\u0007{\u0003z\u0007", (short) (C1633zX.Xd() ^ (-21248)), (short) (C1633zX.Xd() ^ (-13642)))).getMethod(C1561oA.yd("*(//", (short) (C1607wl.Xd() ^ 8719)), Class.forName(C1561oA.ud("\b}\u0012{G\u0005x\u0005|Be\b\u007f~ppyq", (short) (Od.Xd() ^ (-6228)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void license(String str) {
        io.cobrowse.CobrowseIO.instance().license(str);
    }

    @ReactMethod
    public void overwriteSessionIndicator() {
        io.cobrowse.CobrowseIO.instance().setDelegate((CobrowseIOCommonDelegates) Proxy.newProxyInstance(CobrowseIOCommonDelegates.class.getClassLoader(), new Class[]{CobrowseIOCommonDelegates.class, CobrowseIO.SessionControlsDelegate.class}, new DynamicSessionControlInvocationHandler(this.delegates)));
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setUnredactedTags(ReadableArray readableArray, Promise promise) {
        this.delegates.setUnredactedTags(readableArray, promise);
    }

    @ReactMethod
    public void start() {
        final Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() { // from class: io.cobrowse.reactnative.CobrowseIOModule.1
                @Override // java.lang.Runnable
                public void run() {
                    io.cobrowse.CobrowseIO.instance().start(currentActivity);
                }
            });
        }
    }

    @ReactMethod
    public void stop() {
        io.cobrowse.CobrowseIO.instance().stop();
    }

    @ReactMethod
    public void updateSession(final ReadableMap readableMap, final Promise promise) throws Throwable {
        Handler handler = new Handler(getReactApplicationContext().getMainLooper());
        Object[] objArr = {new Runnable() { // from class: io.cobrowse.reactnative.CobrowseIOModule.6
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                Session sessionCurrentSession = io.cobrowse.CobrowseIO.instance().currentSession();
                if (sessionCurrentSession == null) {
                    promise.resolve(null);
                    return;
                }
                if (readableMap.hasKey("full_device")) {
                    try {
                        sessionCurrentSession.setFullDeviceState(Conversion.fullDeviceState(readableMap.getString("full_device")), new Callback<Error, Session>() { // from class: io.cobrowse.reactnative.CobrowseIOModule.6.1
                            @Override // io.cobrowse.Callback
                            public void call(Error error, Session session) {
                                if (error != null) {
                                    promise.reject("cbio_full_device_failed", error);
                                } else {
                                    promise.resolve(null);
                                }
                            }
                        });
                    } catch (UnexpectedNativeTypeException unused) {
                        sessionCurrentSession.setFullDevice(readableMap.getBoolean("full_device"), new Callback<Error, Session>() { // from class: io.cobrowse.reactnative.CobrowseIOModule.6.2
                            @Override // io.cobrowse.Callback
                            public void call(Error error, Session session) {
                                if (error != null) {
                                    promise.reject("cbio_full_device_failed", error);
                                } else {
                                    promise.resolve(null);
                                }
                            }
                        });
                    }
                } else if (readableMap.hasKey("remote_control")) {
                    sessionCurrentSession.setRemoteControl(Conversion.remoteControl(readableMap.getString("remote_control")), new Callback<Error, Session>() { // from class: io.cobrowse.reactnative.CobrowseIOModule.6.3
                        @Override // io.cobrowse.Callback
                        public void call(Error error, Session session) {
                            if (error != null) {
                                promise.reject("cbio_remote_control_failed", error);
                            } else {
                                promise.resolve(null);
                            }
                        }
                    });
                }
            }
        }};
        Method method = Class.forName(C1561oA.Yd("lzq\u0001~yu@\u0003\bC^x\u0007}\u0007\u0001\u000f", (short) (C1499aX.Xd() ^ (-11785)))).getMethod(Jg.Wd("%_4\u0013", (short) (C1633zX.Xd() ^ (-28864)), (short) (C1633zX.Xd() ^ (-21657))), Class.forName(Xg.qd("OG]I\u0017VLZT\u001cAe_`TVa[", (short) (C1499aX.Xd() ^ (-30423)), (short) (C1499aX.Xd() ^ (-27126)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public void webviewRedactedViews(ReadableArray readableArray) {
        String[] strArr = new String[readableArray.size()];
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            try {
                strArr[i2] = readableArray.getString(i2);
            } catch (UnexpectedNativeTypeException e2) {
                String str = "Failed to process webviewRedactedViews: " + e2.getMessage();
            }
        }
        io.cobrowse.CobrowseIO.instance().webviewRedactedViews(strArr);
    }
}
