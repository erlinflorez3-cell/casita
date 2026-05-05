package io.cobrowse;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import io.cobrowse.Device;
import io.cobrowse.FullDeviceFrameSource;
import io.cobrowse.Session;
import io.cobrowse.SessionContext;
import io.cobrowse.integrations.Integration;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.Request;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class CobrowseIO {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String DEVICE_ID_KEY = "device_id";
    public static final String DEVICE_NAME_KEY = "device_name";
    static final String TAG = "CobrowseIO";
    public static final String USER_EMAIL_KEY = "user_email";
    public static final String USER_ID_KEY = "user_id";
    public static final String USER_NAME_KEY = "user_name";
    private static final CobrowseIO instance = new CobrowseIO();
    private final String[] availableCapabilities;
    private String[] capabilities;
    private SessionContext context;
    private final SessionContext.Delegate contextDelegate;
    private Delegate delegate;
    private Device device;
    private long lastFCMTime;
    private String[] redactedViews;
    private boolean started;
    private String[] unredactedViews;
    private Toast upgradeToast;
    private String[] webviewRedactedViews;
    private String license = null;
    private HttpUrl api = HttpUrl.get("https://api.cobrowse.io");
    private boolean registration = true;

    /* JADX INFO: renamed from: io.cobrowse.CobrowseIO$1 */
    class AnonymousClass1 implements SessionContext.Delegate {
        AnonymousClass1() {
        }

        @Override // io.cobrowse.RedactionManager.Delegate
        public List<Selector> redactionSelectors() {
            return SelectorParser.parseAll(CobrowseIO.this.redactedViews);
        }

        @Override // io.cobrowse.RedactionManager.Delegate
        public List<Selector> unredactionSelectors() {
            return SelectorParser.parseAll(CobrowseIO.this.unredactedViews);
        }
    }

    /* JADX INFO: renamed from: io.cobrowse.CobrowseIO$2 */
    class AnonymousClass2 implements Session.Listener {
        AnonymousClass2() {
        }

        @Override // io.cobrowse.Session.Listener
        public void sessionDidEnd(Session session) {
            if (CobrowseIO.this.delegate != null) {
                CobrowseIO.this.delegate.sessionDidEnd(session);
            }
            if (CobrowseIO.this.context != null) {
                CobrowseIO.this.context.destroy();
                CobrowseIO.this.context = null;
            }
        }

        @Override // io.cobrowse.Session.Listener
        public void sessionDidUpdate(Session session) {
            if (CobrowseIO.this.delegate != null) {
                CobrowseIO.this.delegate.sessionDidUpdate(session);
            }
            CobrowseIO.this.showBannerMessageIfRequired();
        }
    }

    /* JADX INFO: renamed from: io.cobrowse.CobrowseIO$3 */
    class AnonymousClass3 extends HashMap<String, Object> {
        AnonymousClass3() {
            put(io.sentry.protocol.Device.TYPE, Device.info(CobrowseInitProvider.getApplication()));
            if (CobrowseIO.this.customData() != null) {
                put("custom_data", CobrowseIO.this.customData());
            }
        }
    }

    /* JADX INFO: renamed from: io.cobrowse.CobrowseIO$4 */
    class AnonymousClass4 extends HashMap<String, String> {
        AnonymousClass4() {
            put("X-CobrowseSDKVersion", CobrowseIO.version());
            put("X-CobrowsePlatform", "android");
            put("X-CobrowseDevice", CobrowseIO.instance().deviceId());
            put("X-CobrowseLicense", CobrowseIO.instance().license());
            put("X-CobrowseAPIVersion", "1.2.0");
        }
    }

    public interface Delegate extends Session.Listener {
    }

    public interface FullDeviceRequestDelegate extends Delegate {
        void handleFullDeviceRequest(Activity activity, Session session);
    }

    public interface Redacted {
        List<View> redactedViews();
    }

    public interface RedactionDelegate {
        List<View> redactedViews(Activity activity);
    }

    interface RemoteControlDelegate extends Delegate {
        boolean shouldAllowKeyEvent(View view, KeyEvent keyEvent, Session session);

        boolean shouldAllowTouch(View view, Touch touch, Session session);
    }

    public interface RemoteControlRequestDelegate extends Delegate {
        void handleRemoteControlRequest(Activity activity, Session session);
    }

    public interface SessionControlsDelegate extends Delegate {
        void hideSessionControls(Activity activity, Session session);

        void showSessionControls(Activity activity, Session session);
    }

    public interface SessionLoadDelegate extends Delegate {
        void sessionDidLoad(Session session);
    }

    public interface SessionRequestDelegate extends Delegate {
        void handleSessionRequest(Activity activity, Session session);
    }

    public interface Unredacted {
        List<View> unredactedViews();
    }

    public interface UnredactionDelegate {
        List<View> unredactedViews(Activity activity);
    }

    private CobrowseIO() {
        String[] strArrAvailableCapabilities = Device.availableCapabilities();
        this.availableCapabilities = strArrAvailableCapabilities;
        this.capabilities = strArrAvailableCapabilities;
        this.webviewRedactedViews = new String[0];
        this.redactedViews = new String[0];
        this.unredactedViews = new String[0];
        this.started = false;
        this.contextDelegate = new SessionContext.Delegate() { // from class: io.cobrowse.CobrowseIO.1
            AnonymousClass1() {
            }

            @Override // io.cobrowse.RedactionManager.Delegate
            public List<Selector> redactionSelectors() {
                return SelectorParser.parseAll(CobrowseIO.this.redactedViews);
            }

            @Override // io.cobrowse.RedactionManager.Delegate
            public List<Selector> unredactionSelectors() {
                return SelectorParser.parseAll(CobrowseIO.this.unredactedViews);
            }
        };
    }

    private boolean canLaunchFromBackground(Application application) {
        if (ActivityWatcher.foregroundActivity() != null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && !CobrowseAccessibilityService.isRunning(application)) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.lastFCMTime;
            if (jCurrentTimeMillis < 10000) {
                String str = "Relying on FCM for background launch, delta=" + jCurrentTimeMillis;
                return true;
            }
            String str2 = "Cannot automatically launch app from background, delta=" + jCurrentTimeMillis;
            return false;
        }
        return true;
    }

    static HashMap<String, String> headers() {
        return new HashMap<String, String>() { // from class: io.cobrowse.CobrowseIO.4
            AnonymousClass4() {
                put("X-CobrowseSDKVersion", CobrowseIO.version());
                put("X-CobrowsePlatform", "android");
                put("X-CobrowseDevice", CobrowseIO.instance().deviceId());
                put("X-CobrowseLicense", CobrowseIO.instance().license());
                put("X-CobrowseAPIVersion", "1.2.0");
            }
        };
    }

    public static CobrowseIO instance() {
        return instance;
    }

    public static synchronized Boolean isCobrowseNotification(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        if (!map.containsKey("cobrowseio-notification")) {
            return false;
        }
        String str = map.get("cobrowseio-notification");
        if (str == null) {
            return false;
        }
        return Boolean.valueOf(str.equals("true"));
    }

    static /* synthetic */ void lambda$onPushNotification$5(Error error, Session session) {
        if (error != null) {
            String str = "Push failed: " + error.getMessage();
        }
    }

    public synchronized void performStart() {
        if (this.started) {
            return;
        }
        if (this.license == null) {
            return;
        }
        this.started = true;
        String str = "Initialising CobrowseIO " + version();
        if (this.device == null) {
            Device device = new Device(CobrowseInitProvider.getApplication());
            this.device = device;
            device.registerDeviceListener(new Device.Listener() { // from class: io.cobrowse.CobrowseIO$$ExternalSyntheticLambda6
                @Override // io.cobrowse.Device.Listener
                public final void deviceDidRegister(Device device2) {
                    this.f$0.m8809lambda$performStart$4$iocobrowseCobrowseIO(device2);
                }
            });
        }
        Integration.init(CobrowseInitProvider.getApplication());
        reinitialize();
        if (registration()) {
            DeviceRegistrationLoop.init(CobrowseInitProvider.getApplication());
        }
        CobrowseService.startCobrowseService(CobrowseInitProvider.getApplication());
    }

    public synchronized void performStop() {
        DeviceRegistrationLoop.stop(CobrowseInitProvider.getApplication());
        if (currentSession() != null) {
            currentSession().end(null);
        }
        SessionContext sessionContext = this.context;
        if (sessionContext != null) {
            sessionContext.destroy();
            this.context = null;
        }
        if (this.device != null && registration()) {
            this.device.deregister(null);
            this.device = null;
        }
        this.started = false;
    }

    static Request.Builder request(Application application) {
        Request.Builder builder = new Request.Builder();
        for (Map.Entry<String, String> entry : headers().entrySet()) {
            builder.header(entry.getKey(), entry.getValue());
        }
        return builder;
    }

    /* JADX INFO: renamed from: setCurrentSession, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m8807lambda$getSession$2$iocobrowseCobrowseIO(Session session) {
        if (!this.started) {
            throw new RuntimeException("Cobrowse not started");
        }
        SessionContext sessionContext = this.context;
        if (sessionContext != null) {
            sessionContext.destroy();
            this.context = null;
        }
        if (session == null) {
            return;
        }
        this.context = new SessionContext(this.contextDelegate, CobrowseInitProvider.getApplication(), session);
        session.registerSessionListener(new Session.Listener() { // from class: io.cobrowse.CobrowseIO.2
            AnonymousClass2() {
            }

            @Override // io.cobrowse.Session.Listener
            public void sessionDidEnd(Session session2) {
                if (CobrowseIO.this.delegate != null) {
                    CobrowseIO.this.delegate.sessionDidEnd(session2);
                }
                if (CobrowseIO.this.context != null) {
                    CobrowseIO.this.context.destroy();
                    CobrowseIO.this.context = null;
                }
            }

            @Override // io.cobrowse.Session.Listener
            public void sessionDidUpdate(Session session2) {
                if (CobrowseIO.this.delegate != null) {
                    CobrowseIO.this.delegate.sessionDidUpdate(session2);
                }
                CobrowseIO.this.showBannerMessageIfRequired();
            }
        });
    }

    public void showBannerMessageIfRequired() {
        Device device = this.device;
        if (device == null || device.bannerMessage() == null) {
            return;
        }
        Toast toast = this.upgradeToast;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(CobrowseInitProvider.getApplication(), this.device.bannerMessage(), 1);
        this.upgradeToast = toastMakeText;
        toastMakeText.show();
    }

    static String version() {
        return BuildConfig.COBROWSE_VERSION_NAME;
    }

    public String api() {
        return this.api.toString();
    }

    public synchronized void api(String str) {
        if (!str.equals(this.api.toString()) && this.started) {
            throw new RuntimeException("Error: cannot change API once Cobrowse is started");
        }
        this.api = HttpUrl.get(str);
    }

    HttpUrl apiUrl() {
        return this.api;
    }

    public synchronized void capabilities(String[] strArr) {
        if (this.started) {
            throw new RuntimeException("Error: cannot change capabilities once Cobrowse is started");
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            if (Arrays.asList(this.availableCapabilities).contains(str)) {
                hashSet.add(str);
            } else {
                String str2 = "Warning: Capability '" + str + "' not supported. Ignoring...";
            }
        }
        this.capabilities = (String[]) hashSet.toArray(new String[0]);
    }

    public synchronized String[] capabilities() {
        if (currentSession() == null || !currentSession().isActive()) {
            return this.capabilities;
        }
        return currentSession().capabilities();
    }

    public synchronized void createSession(final Callback<Error, Session> callback) {
        if (this.started) {
            Session sessionCurrentSession = currentSession();
            if (sessionCurrentSession == null || !(sessionCurrentSession.isAuthorizing() || sessionCurrentSession.isActive())) {
                final Session session = new Session(capabilities());
                session.create(new HashMap<String, Object>() { // from class: io.cobrowse.CobrowseIO.3
                    AnonymousClass3() {
                        put(io.sentry.protocol.Device.TYPE, Device.info(CobrowseInitProvider.getApplication()));
                        if (CobrowseIO.this.customData() != null) {
                            put("custom_data", CobrowseIO.this.customData());
                        }
                    }
                }, new Callback() { // from class: io.cobrowse.CobrowseIO$$ExternalSyntheticLambda0
                    @Override // io.cobrowse.Callback
                    public final void call(Error error, Object obj) {
                        this.f$0.m8805lambda$createSession$0$iocobrowseCobrowseIO(callback, session, error, (Session) obj);
                    }
                });
                ThreadUtils.invokeAndWait(new Runnable() { // from class: io.cobrowse.CobrowseIO$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m8806lambda$createSession$1$iocobrowseCobrowseIO(session);
                    }
                });
                return;
            }
            Object[] objArr = {C1561oA.yd("d\u000f\u0018\n\t\u000b#H\u0015\u0019M\u000eO\"\u0017$\u0007{\u0005\u0003", (short) (C1607wl.Xd() ^ 11115))};
            Constructor<?> constructor = Class.forName(C1561oA.Yd("]UkW%dZhb*Bpqos", (short) (FB.Xd() ^ 23439))).getConstructor(Class.forName(Xg.qd("E=S?\rLBPJ\u00128ZYQWQ", (short) (C1607wl.Xd() ^ 31936), (short) (C1607wl.Xd() ^ 17460))));
            try {
                constructor.setAccessible(true);
                ThreadUtils.invoke((Callback<Error, TArg>) callback, (Error) constructor.newInstance(objArr));
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        short sXd = (short) (ZN.Xd() ^ 18028);
        short sXd2 = (short) (ZN.Xd() ^ 19329);
        int[] iArr = new int["BB.>?qqg4;88b$&_\"\u001f)( \u001eX\u001a\u001c\u001c$&\u0018Q\u0014\"\u0014\u000f!\u0015\u0019\u0011H\tF\u0019\n\u0017\u0016\u000b\u0010\u000e".length()];
        QB qb = new QB("BB.>?qqg4;88b$&_\"\u001f)( \u001eX\u001a\u001c\u001c$&\u0018Q\u0014\"\u0014\u000f!\u0015\u0019\u0011H\tF\u0019\n\u0017\u0016\u000b\u0010\u000e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr2 = {new String(iArr, 0, i2)};
        Constructor<?> constructor2 = Class.forName(hg.Vd("\n\u007f\u0014}I\u0007z\u0007~DZ\u0007\u0006\u0002\u0004", (short) (C1580rY.Xd() ^ (-26319)), (short) (C1580rY.Xd() ^ (-8077)))).getConstructor(Class.forName(C1561oA.ud("%\u001b/\u0019d\"\u0016\"\u001a_\u0004$!\u0017\u001b\u0013", (short) (C1580rY.Xd() ^ (-23226)))));
        try {
            constructor2.setAccessible(true);
            ThreadUtils.invoke((Callback<Error, TArg>) callback, (Error) constructor2.newInstance(objArr2));
            return;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public Session currentSession() {
        SessionContext sessionContext = this.context;
        if (sessionContext != null) {
            return sessionContext.session;
        }
        return null;
    }

    public Map<String, Object> customData() {
        if (Device.customData() == null) {
            return null;
        }
        return Collections.unmodifiableMap(Device.customData());
    }

    public synchronized void customData(Map<String, Object> map) {
        if (Device.customData() == null || !MapUtils.contains(Device.customData(), map)) {
            Device.customData(map);
            if (this.started) {
                if (this.device != null && registration()) {
                    this.device.register(null);
                }
                if (currentSession() != null && currentSession().isActive()) {
                    HashMap map2 = new HashMap();
                    map2.put("custom_data", map);
                    currentSession().update(map2, null);
                }
            }
        }
    }

    public String deviceId() {
        return Device.deviceId(CobrowseInitProvider.getApplication());
    }

    @Deprecated
    public String deviceId(Application application) {
        return deviceId();
    }

    Delegate getDelegate() {
        return this.delegate;
    }

    <T extends Delegate> T getDelegate(Class cls) {
        Delegate delegate = this.delegate;
        if (delegate != null && cls.isAssignableFrom(delegate.getClass())) {
            return (T) this.delegate;
        }
        return null;
    }

    Device getDevice() {
        return this.device;
    }

    public synchronized void getSession(String str, final Callback<Error, Session> callback) {
        if (!this.started) {
            Object[] objArr = {Jg.Wd("h\u0011\u00131H\u00117I\u001c9Lz;\u0013\u0019pYl\r\u001a(:\u001bz\u0003\u00197em=\n%Ynv\t\u0017dK'\u007f\u0005(Q`o\u007f", (short) (OY.Xd() ^ 12822), (short) (OY.Xd() ^ 16021))};
            Constructor<?> constructor = Class.forName(ZO.xd("R\u001a\bPy\u0012^5e)d0FT\b", (short) (C1633zX.Xd() ^ (-23508)), (short) (C1633zX.Xd() ^ (-14186)))).getConstructor(Class.forName(C1626yg.Ud("D\u001f]X@\u0010\u0013]zWL \"SJ^", (short) (C1499aX.Xd() ^ (-15824)), (short) (C1499aX.Xd() ^ (-17946)))));
            try {
                constructor.setAccessible(true);
                ThreadUtils.invoke((Callback<Error, TArg>) callback, (Error) constructor.newInstance(objArr));
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Session sessionCurrentSession = currentSession();
        if (sessionCurrentSession != null && sessionCurrentSession.hasIdOrCode(str)) {
            ThreadUtils.invoke(callback, sessionCurrentSession);
            return;
        }
        final Session session = new Session(capabilities());
        session.resource = new HashMap();
        session.resource.put(Ig.wd("N*|U", (short) (Od.Xd() ^ (-22085))), str);
        ThreadUtils.invokeAndWait(new Runnable() { // from class: io.cobrowse.CobrowseIO$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8807lambda$getSession$2$iocobrowseCobrowseIO(session);
            }
        });
        session.fetch(new Callback() { // from class: io.cobrowse.CobrowseIO$$ExternalSyntheticLambda5
            @Override // io.cobrowse.Callback
            public final void call(Error error, Object obj) {
                this.f$0.m8808lambda$getSession$3$iocobrowseCobrowseIO(callback, session, error, (Session) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$createSession$0$io-cobrowse-CobrowseIO */
    /* synthetic */ void m8805lambda$createSession$0$iocobrowseCobrowseIO(Callback callback, Session session, Error error, Session session2) {
        if (error != null) {
            m8807lambda$getSession$2$iocobrowseCobrowseIO(null);
        }
        if (error != null) {
            session2 = null;
        }
        ThreadUtils.invoke(callback, error, session2);
        SessionLoadDelegate sessionLoadDelegate = (SessionLoadDelegate) getDelegate(SessionLoadDelegate.class);
        if (sessionLoadDelegate != null) {
            sessionLoadDelegate.sessionDidLoad(session);
        }
    }

    /* JADX INFO: renamed from: lambda$getSession$3$io-cobrowse-CobrowseIO */
    /* synthetic */ void m8808lambda$getSession$3$iocobrowseCobrowseIO(Callback callback, Session session, Error error, Session session2) {
        if (error != null) {
            m8807lambda$getSession$2$iocobrowseCobrowseIO(null);
        }
        if (error != null) {
            session2 = null;
        }
        ThreadUtils.invoke(callback, error, session2);
        SessionLoadDelegate sessionLoadDelegate = (SessionLoadDelegate) getDelegate(SessionLoadDelegate.class);
        if (sessionLoadDelegate != null) {
            sessionLoadDelegate.sessionDidLoad(session);
        }
    }

    /* JADX INFO: renamed from: lambda$performStart$4$io-cobrowse-CobrowseIO */
    /* synthetic */ void m8809lambda$performStart$4$iocobrowseCobrowseIO(Device device) {
        showBannerMessageIfRequired();
    }

    boolean launchApp() throws Exception {
        if (!canLaunchFromBackground(CobrowseInitProvider.getApplication())) {
            return false;
        }
        String packageName = CobrowseInitProvider.getApplication().getPackageName();
        PackageManager packageManager = CobrowseInitProvider.getApplication().getPackageManager();
        Object[] objArr = {packageName};
        Method method = Class.forName(EO.Od("C)-ZOnU~k+,L('1ETOhB\ndN@\r\u0007M*\u001d^P)\u000e", (short) (C1499aX.Xd() ^ (-16074)))).getMethod(C1593ug.zd("a`pI_tndjLryku|Oy}\\nqzqxw", (short) (FB.Xd() ^ 7639), (short) (FB.Xd() ^ 10284)), Class.forName(C1561oA.Qd("9/C-x6*6.s\u001885+/'", (short) (C1607wl.Xd() ^ 31061))));
        try {
            method.setAccessible(true);
            Intent intent = (Intent) method.invoke(packageManager, objArr);
            if (intent == null) {
                return false;
            }
            intent.setFlags(268435456);
            Application application = CobrowseInitProvider.getApplication();
            CX.ud();
            application.startActivity(intent);
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    boolean launchPermissionActivity() throws Exception {
        if (!canLaunchFromBackground(CobrowseInitProvider.getApplication())) {
            return false;
        }
        Intent intent = new Intent(CobrowseInitProvider.getApplication(), (Class<?>) FullDeviceFrameSource.PermissionRequestActivity.class);
        intent.setFlags(268468224);
        Application application = CobrowseInitProvider.getApplication();
        CX.ud();
        application.startActivity(intent);
        return true;
    }

    public String license() {
        String str = this.license;
        return str == null ? "" : str;
    }

    public synchronized void license(String str) {
        if (!str.equals(this.license) && this.started) {
            throw new RuntimeException("Error: cannot change license once Cobrowse is started");
        }
        this.license = str;
    }

    public synchronized void onPushNotification(Map<String, String> map) {
        onPushNotification(map, true);
    }

    void onPushNotification(Map<String, String> map, boolean z2) {
        try {
            if (isCobrowseNotification(map).booleanValue()) {
                if (z2) {
                    this.lastFCMTime = System.currentTimeMillis();
                }
                String str = map.get("cobrowseio-code");
                if (str != null) {
                    getSession(str, new Callback() { // from class: io.cobrowse.CobrowseIO$$ExternalSyntheticLambda3
                        @Override // io.cobrowse.Callback
                        public final void call(Error error, Object obj) {
                            CobrowseIO.lambda$onPushNotification$5(error, (Session) obj);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            String str2 = "Error processing notification " + th;
        }
    }

    public synchronized void redactedViews(String[] strArr) {
        if (this.started) {
            throw new RuntimeException("Error: cannot change redactedViews once Cobrowse is started");
        }
        for (String str : strArr) {
            if (SelectorParser.parse(str) == null) {
                String str2 = "Failed to parse redaction selector: " + str;
            }
        }
        this.redactedViews = strArr;
    }

    public synchronized String[] redactedViews() {
        return this.redactedViews;
    }

    public synchronized void registration(boolean z2) {
        if (z2 != this.registration && this.started) {
            throw new RuntimeException("Error: cannot change auto-registration configuration once Cobrowse is started");
        }
        this.registration = z2;
    }

    public boolean registration() {
        return this.registration;
    }

    void reinitialize() {
        if (this.started) {
            this.device.reset();
            if (registration()) {
                DeviceRegistrationLoop.schedule(CobrowseInitProvider.getApplication(), 0L, 0);
            }
        }
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    @Deprecated
    public synchronized void setDeviceToken(Application application, String str) {
        setDeviceToken(str);
    }

    public synchronized void setDeviceToken(String str) {
        if (str.equals(Device.getToken())) {
            return;
        }
        Device.setToken(str);
        if (this.started && this.device != null && registration()) {
            this.device.register(null);
        }
    }

    public void start() {
        ThreadUtils.invokeAndWait(new Runnable() { // from class: io.cobrowse.CobrowseIO$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.performStart();
            }
        });
    }

    @Deprecated
    public void start(Activity activity) {
        start();
    }

    @Deprecated
    public void start(Application application) {
        start();
    }

    public void stop() {
        ThreadUtils.invokeAndWait(new Runnable() { // from class: io.cobrowse.CobrowseIO$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.performStop();
            }
        });
    }

    public synchronized void unredactedViews(String[] strArr) {
        if (this.started) {
            throw new RuntimeException("Error: cannot change unredactedViews once Cobrowse is started");
        }
        for (String str : strArr) {
            if (SelectorParser.parse(str) == null) {
                String str2 = "Failed to parse unredaction selector: " + str;
            }
        }
        this.unredactedViews = strArr;
    }

    public synchronized String[] unredactedViews() {
        return this.unredactedViews;
    }

    public synchronized void webviewRedactedViews(String[] strArr) {
        if (this.started) {
            throw new RuntimeException("Error: cannot change webviewRedaction once Cobrowse is started");
        }
        this.webviewRedactedViews = strArr;
    }

    public synchronized String[] webviewRedactedViews() {
        return this.webviewRedactedViews;
    }
}
