package io.cobrowse;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.drew.metadata.exif.makernotes.NikonType2MakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.firebase.messaging.FirebaseMessaging;
import com.statsig.androidsdk.StatsigLoggerKt;
import io.cobrowse.CBORSocket;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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
final class Device extends RESTResource<Device> {
    private static final String DeviceIdPrefsKey = "cobrowse_io_device_id";
    private static Map<String, Object> customData = null;
    private static String deviceId = null;
    private static String token = null;
    private final Application app;
    private final Set<Listener> listeners = new HashSet();
    private CBORSocket notificationSocket;

    interface Listener {
        void deviceDidRegister(Device device);
    }

    Device(Application application) {
        this.app = application;
    }

    static String[] availableCapabilities() {
        HashSet hashSet = new HashSet(Arrays.asList("laser", "drawing", "pointer", "keypress", "selectors"));
        if (CobrowseService.isMediaProjectionEnabled()) {
            hashSet.add("full_device");
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    private void closeNotificationSocket() {
        CBORSocket cBORSocket = this.notificationSocket;
        if (cBORSocket != null) {
            cBORSocket.disconnect();
            this.notificationSocket = null;
        }
    }

    static Map<String, Object> customData() {
        return customData;
    }

    static void customData(Map<String, Object> map) {
        customData = map;
    }

    private String deviceId() {
        return deviceId(this.app);
    }

    static synchronized String deviceId(Application application) {
        String str = deviceId;
        if (str != null) {
            return str;
        }
        String value = SecureStorage.instance().getValue(application, DeviceIdPrefsKey);
        deviceId = value;
        if (value == null) {
            deviceId = UUID.randomUUID().toString();
            if (!SecureStorage.instance().setValue(application, DeviceIdPrefsKey, deviceId)) {
            }
        }
        return deviceId;
    }

    static String getToken() {
        return token;
    }

    static Map<String, Object> info(Application application) throws Throwable {
        String str;
        PackageInfo packageInfo;
        HashMap map = new HashMap();
        String strValueOf = "";
        try {
            PackageManager packageManager = application.getPackageManager();
            String packageName = application.getPackageName();
            Class<?> cls = Class.forName(C1561oA.Qd("XdYfb[U\u001eR][`PX]\u0016WS\u00134DELAFC*=I;@=I", (short) (C1499aX.Xd() ^ (-16940))));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1593ug.zd("@8N:\bG=KE\r3UTLRL", (short) (Od.Xd() ^ (-26364)), (short) (Od.Xd() ^ (-3378))));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {packageName, 0};
            short sXd = (short) (C1607wl.Xd() ^ 26905);
            int[] iArr = new int["ro}XhipejgJnem".length()];
            QB qb = new QB("ro}XhipejgJnem");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                packageInfo = (PackageInfo) method.invoke(packageManager, objArr);
                str = packageInfo.versionName;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (PackageManager.NameNotFoundException e3) {
            str = "";
        }
        try {
            strValueOf = String.valueOf(packageInfo.versionCode);
        } catch (PackageManager.NameNotFoundException e4) {
            C1561oA.Kd("}+\u001f0.74'\f\u0013", (short) (C1607wl.Xd() ^ 15121));
            Wg.Zd("Q\u001fn@q02V\bv\u000eQ\u001aF\u0016\\Ui%acj8{C/8\u0006M?F\u0007P\u0018E\u001b^XY-m5o=w:vL\u0013", (short) (OY.Xd() ^ 5203), (short) (OY.Xd() ^ 8710));
        }
        map.put(C1561oA.Xd("EB8L?IMI", (short) (C1499aX.Xd() ^ (-18664))), Wg.vd("#/$1-& ", (short) (C1633zX.Xd() ^ (-28445))));
        map.put(Qg.kd("]]m_XY", (short) (FB.Xd() ^ 30523), (short) (FB.Xd() ^ 29636)), Build.DEVICE);
        String language = Locale.getDefault().getLanguage();
        short sXd2 = (short) (C1607wl.Xd() ^ 9561);
        short sXd3 = (short) (C1607wl.Xd() ^ 25584);
        int[] iArr2 = new int["ggwibc\\hj]Zd\\".length()];
        QB qb2 = new QB("ggwibc\\hj]Zd\\");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
            i3++;
        }
        map.put(new String(iArr2, 0, i3), language);
        map.put(C1561oA.yd("X[F\\R^^SPN", (short) (C1607wl.Xd() ^ 15697)), System.getProperty(C1561oA.ud("BE~F4@@5:8", (short) (Od.Xd() ^ (-10042)))));
        map.put(C1561oA.Yd("%*\u0017\u001a*$\u001b)#5%-", (short) (C1499aX.Xd() ^ (-26416))), String.valueOf(Build.VERSION.SDK_INT));
        map.put(Xg.qd("\u000f\u001f \u0010\u001b\u0017", (short) (OY.Xd() ^ 17357), (short) (OY.Xd() ^ PhotoshopDirectory.TAG_ALPHA_IDENTIFIERS)), application.getPackageName());
        Context applicationContext = application.getApplicationContext();
        Object[] objArr2 = new Object[0];
        Method method2 = Class.forName(Jg.Wd("\fE\u001fXAgG=og\u000bu\u001b\u000f9hrK%W<|f", (short) (Od.Xd() ^ (-18896)), (short) (Od.Xd() ^ (-10041)))).getMethod(ZO.xd("mp}A]Vgj7Z^(p\u001e,|\u0015t", (short) (C1580rY.Xd() ^ (-25353)), (short) (C1580rY.Xd() ^ (-3586))), new Class[0]);
        try {
            method2.setAccessible(true);
            map.put(C1626yg.Ud("R\u0007v^B\u001fs+", (short) (C1633zX.Xd() ^ (-29359)), (short) (C1633zX.Xd() ^ (-11185))), ((ApplicationInfo) method2.invoke(applicationContext, objArr2)).loadLabel(application.getPackageManager()).toString());
            short sXd4 = (short) (ZN.Xd() ^ 24944);
            int[] iArr3 = new int["\"\u007f\u0012!j\u0012\u0003l\nQWj2\u0019C`\u0014\u0010S".length()];
            QB qb3 = new QB("\"\u007f\u0012!j\u0012\u0003l\nQWj2\u0019C`\u0014\u0010S");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd4 + i4)));
                i4++;
            }
            map.put(new String(iArr3, 0, i4), deviceId(application));
            short sXd5 = (short) (C1633zX.Xd() ^ (-27988));
            int[] iArr4 = new int["m4\u0016a1Ty3KRG".length()];
            QB qb4 = new QB("m4\u0016a1Ty3KRG");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i5)) + xuXd4.CK(iKK4));
                i5++;
            }
            map.put(new String(iArr4, 0, i5), str);
            map.put(C1561oA.Qd("\u007f\u000e\rz|\u000f\u0002\u0004z", (short) (FB.Xd() ^ 30582)), strValueOf);
            map.put(C1593ug.zd("\u0011!\"\u0012\u0016*\u001f#\u001c\u0018\u001d**#'&53#7-44", (short) (ZN.Xd() ^ 10064), (short) (ZN.Xd() ^ 16912)), C1561oA.od("pbh`[l]", (short) (FB.Xd() ^ 8657)));
            map.put(C1561oA.Kd("yksh\u0001p~\u0001w~~", (short) (C1580rY.Xd() ^ (-4844))), CobrowseIO.version());
            map.put(Wg.Zd("~\u001aep5\u0011(ra\u0002H]", (short) (C1580rY.Xd() ^ (-15745)), (short) (C1580rY.Xd() ^ (-5387))), Boolean.valueOf(NotificationManagerCompat.from(application).areNotificationsEnabled()));
            map.put(Qg.kd("m_YYbQT_SSP_", (short) (C1499aX.Xd() ^ (-22558)), (short) (C1499aX.Xd() ^ (-25324))), new String[]{C1561oA.Xd("OC?AL\r@VD", (short) (Od.Xd() ^ (-17874))), Wg.vd("7:16/w6;+,", (short) (Od.Xd() ^ (-17529)))});
            map.put(hg.Vd("<9G77=?;E94A", (short) (Od.Xd() ^ (-8680)), (short) (Od.Xd() ^ (-30776))), availableCapabilities());
            if (isFullDeviceControlAvailable(application)) {
                map.put(C1561oA.ud("KYON@DDTF?@9<GEJGC?", (short) (C1607wl.Xd() ^ 25442)), Boolean.valueOf(CobrowseAccessibilityService.isRunning(application)));
            }
            return map;
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private static boolean isFullDeviceControlAvailable(Application application) {
        return CobrowseAccessibilityService.isEnabled(application);
    }

    static /* synthetic */ void lambda$openNotificationSocket$1(Map map) {
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj != null) {
                map2.put(str, obj.toString());
            }
        }
        CobrowseIO.instance().onPushNotification(map2, false);
    }

    private String notificationToken() {
        return (String) field("notification_token", String.class);
    }

    private String notificationUrl() {
        return (String) field("notification_url", String.class);
    }

    private synchronized void openNotificationSocket() {
        if (this.notificationSocket != null) {
            return;
        }
        CBORSocket cBORSocket = new CBORSocket(new CBORSocket.URLRequest() { // from class: io.cobrowse.Device$$ExternalSyntheticLambda1
            @Override // io.cobrowse.CBORSocket.URLRequest
            public final Request create() {
                return this.f$0.m8810lambda$openNotificationSocket$0$iocobrowseDevice();
            }
        });
        this.notificationSocket = cBORSocket;
        cBORSocket.setMaxReconnectDelay(StatsigLoggerKt.FLUSH_TIMER_MS);
        this.notificationSocket.onMessage("notification", new CBORSocket.MessageListener() { // from class: io.cobrowse.Device$$ExternalSyntheticLambda2
            @Override // io.cobrowse.CBORSocket.MessageListener
            public final void onMessage(Map map) {
                Device.lambda$openNotificationSocket$1(map);
            }
        });
        this.notificationSocket.onMessage("probe", new CBORSocket.MessageListener() { // from class: io.cobrowse.Device$$ExternalSyntheticLambda3
            @Override // io.cobrowse.CBORSocket.MessageListener
            public final void onMessage(Map map) {
                this.f$0.m8811lambda$openNotificationSocket$2$iocobrowseDevice(map);
            }
        });
        this.notificationSocket.onError(new CBORSocket.ErrorListener() { // from class: io.cobrowse.Device$$ExternalSyntheticLambda4
            @Override // io.cobrowse.CBORSocket.ErrorListener
            public final void onError(Throwable th, Response response) {
                this.f$0.m8812lambda$openNotificationSocket$3$iocobrowseDevice(th, response);
            }
        });
    }

    static void setToken(String str) {
        token = str;
    }

    private synchronized void updateNotificationSocket() {
        if (notificationToken() == null || notificationUrl() == null) {
            closeNotificationSocket();
        } else {
            openNotificationSocket();
        }
    }

    String bannerMessage() {
        return (String) field("banner_message", String.class);
    }

    synchronized void deregister(Callback<Error, Device> callback) {
        customData = null;
        closeNotificationSocket();
        delete(callback);
    }

    /* JADX INFO: renamed from: lambda$openNotificationSocket$0$io-cobrowse-Device */
    /* synthetic */ Request m8810lambda$openNotificationSocket$0$iocobrowseDevice() {
        return CobrowseIO.request(this.app).url(SocketURL.resolve(notificationUrl(), CobrowseIO.instance().apiUrl())).header("Authorization", "Bearer " + notificationToken()).build();
    }

    /* JADX INFO: renamed from: lambda$openNotificationSocket$2$io-cobrowse-Device */
    /* synthetic */ void m8811lambda$openNotificationSocket$2$iocobrowseDevice(Map map) {
        try {
            this.notificationSocket.send("alive", map);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: lambda$openNotificationSocket$3$io-cobrowse-Device */
    /* synthetic */ void m8812lambda$openNotificationSocket$3$iocobrowseDevice(Throwable th, Response response) {
        String str = "Notification socket error " + th;
        if (response != null) {
            String str2 = "Response code = " + response.code();
        }
        if (response == null || response.code() < 400 || response.code() >= 500) {
            return;
        }
        closeNotificationSocket();
    }

    /* JADX INFO: renamed from: lambda$register$4$io-cobrowse-Device */
    /* synthetic */ void m8813lambda$register$4$iocobrowseDevice(Device device, Callback callback, Error error, Device device2) {
        if (error == null) {
            device.updateNotificationSocket();
        }
        ThreadUtils.invoke(callback, error, device2);
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().deviceDidRegister(device);
        }
    }

    void register(final Callback<Error, Device> callback) {
        HashMap map = new HashMap();
        if (token != null) {
            map.put("push_provider", FirebaseMessaging.INSTANCE_ID_SCOPE);
            map.put("push_token", token);
        }
        Map<String, Object> mapCustomData = customData();
        if (mapCustomData != null) {
            map.put("custom_data", mapCustomData);
        }
        map.put(io.sentry.protocol.Device.TYPE, info(this.app));
        update(map, new Callback() { // from class: io.cobrowse.Device$$ExternalSyntheticLambda0
            @Override // io.cobrowse.Callback
            public final void call(Error error, Object obj) {
                this.f$0.m8813lambda$register$4$iocobrowseDevice(this, callback, error, (Device) obj);
            }
        });
    }

    public void registerDeviceListener(Listener listener) {
        this.listeners.add(listener);
    }

    int registrationInterval() {
        return ((Integer) field("next_registration", Integer.class, Integer.valueOf(NikonType2MakernoteDirectory.TAG_NIKON_SCAN))).intValue();
    }

    @Override // io.cobrowse.RESTResource
    void reset() {
        super.reset();
        closeNotificationSocket();
    }

    @Override // io.cobrowse.RESTResource
    HttpUrl url() {
        HttpUrl httpUrlResolve = CobrowseIO.instance().apiUrl().resolve("/api/1/devices/" + deviceId());
        if (httpUrlResolve != null) {
            return httpUrlResolve;
        }
        throw new RuntimeException("Cannot create an HTTP Url, is API a valid HTTP(S) scheme?");
    }
}
