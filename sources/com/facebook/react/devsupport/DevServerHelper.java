package com.facebook.react.devsupport;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import com.dynatrace.android.callback.OkCallback;
import com.facebook.common.logging.FLog;
import com.facebook.hermes.intl.Constants;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.BundleDownloader;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.FileIoHandler;
import com.facebook.react.packagerconnection.JSPackagerClient;
import com.facebook.react.packagerconnection.NotificationOnlyHandler;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.packagerconnection.RequestOnlyHandler;
import com.facebook.react.packagerconnection.Responder;
import com.facebook.react.util.RNLog;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Okio;
import okio.Sink;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class DevServerHelper {
    private static final String DEBUGGER_MSG_DISABLE = "{ \"id\":1,\"method\":\"Debugger.disable\" }";
    private static final int HTTP_CONNECT_TIMEOUT_MS = 5000;
    public static final String RELOAD_APP_EXTRA_JS_PROXY = "jsproxy";
    private final Context mApplicationContext;
    private final BundleDownloader mBundleDownloader;
    private final OkHttpClient mClient;
    private IInspectorPackagerConnection mInspectorPackagerConnection;
    private final String mPackageName;
    private JSPackagerClient mPackagerClient;
    private final PackagerConnectionSettings mPackagerConnectionSettings;
    private final PackagerStatusCheck mPackagerStatusCheck;
    private final DeveloperSettings mSettings;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$1 */
    class AnonymousClass1 extends AsyncTask<Void, Void, Void> {
        final /* synthetic */ String val$clientId;
        final /* synthetic */ PackagerCommandListener val$commandListener;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$1$1 */
        class C01541 extends NotificationOnlyHandler {
            C01541() {
            }

            @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
            public void onNotification(Object obj) {
                packagerCommandListener.onPackagerReloadCommand();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$1$2 */
        class AnonymousClass2 extends NotificationOnlyHandler {
            AnonymousClass2() {
            }

            @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
            public void onNotification(Object obj) {
                packagerCommandListener.onPackagerDevMenuCommand();
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$1$3 */
        class AnonymousClass3 extends RequestOnlyHandler {
            AnonymousClass3() {
            }

            @Override // com.facebook.react.packagerconnection.RequestOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
            public void onRequest(Object obj, Responder responder) {
                packagerCommandListener.onCaptureHeapCommand(responder);
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$1$4 */
        class AnonymousClass4 implements ReconnectingWebSocket.ConnectionCallback {
            AnonymousClass4() {
            }

            @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
            public void onConnected() {
                packagerCommandListener.onPackagerConnected();
            }

            @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
            public void onDisconnected() {
                packagerCommandListener.onPackagerDisconnected();
            }
        }

        AnonymousClass1(PackagerCommandListener packagerCommandListener, String str) {
            packagerCommandListener = packagerCommandListener;
            str = str;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            HashMap map = new HashMap();
            map.put("reload", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper.1.1
                C01541() {
                }

                @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                public void onNotification(Object obj) {
                    packagerCommandListener.onPackagerReloadCommand();
                }
            });
            map.put("devMenu", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper.1.2
                AnonymousClass2() {
                }

                @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                public void onNotification(Object obj) {
                    packagerCommandListener.onPackagerDevMenuCommand();
                }
            });
            map.put("captureHeap", new RequestOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper.1.3
                AnonymousClass3() {
                }

                @Override // com.facebook.react.packagerconnection.RequestOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                public void onRequest(Object obj, Responder responder) {
                    packagerCommandListener.onCaptureHeapCommand(responder);
                }
            });
            Map<String, RequestHandler> mapCustomCommandHandlers = packagerCommandListener.customCommandHandlers();
            if (mapCustomCommandHandlers != null) {
                map.putAll(mapCustomCommandHandlers);
            }
            map.putAll(new FileIoHandler().handlers());
            AnonymousClass4 anonymousClass4 = new ReconnectingWebSocket.ConnectionCallback() { // from class: com.facebook.react.devsupport.DevServerHelper.1.4
                AnonymousClass4() {
                }

                @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                public void onConnected() {
                    packagerCommandListener.onPackagerConnected();
                }

                @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                public void onDisconnected() {
                    packagerCommandListener.onPackagerDisconnected();
                }
            };
            DevServerHelper.this.mPackagerClient = new JSPackagerClient(str, DevServerHelper.this.mPackagerConnectionSettings, map, anonymousClass4);
            DevServerHelper.this.mPackagerClient.init();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$2 */
    class AnonymousClass2 extends AsyncTask<Void, Void, Void> {
        AnonymousClass2() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            if (DevServerHelper.this.mPackagerClient != null) {
                DevServerHelper.this.mPackagerClient.close();
                DevServerHelper.this.mPackagerClient = null;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$3 */
    class AnonymousClass3 extends AsyncTask<Void, Void, Void> {
        AnonymousClass3() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            if (InspectorFlags.getFuseboxEnabled()) {
                DevServerHelper.this.mInspectorPackagerConnection = new CxxInspectorPackagerConnection(DevServerHelper.this.getInspectorDeviceUrl(), DevServerHelper.this.mPackageName);
            } else {
                DevServerHelper.this.mInspectorPackagerConnection = new InspectorPackagerConnection(DevServerHelper.this.getInspectorDeviceUrl(), DevServerHelper.this.mPackageName);
            }
            DevServerHelper.this.mInspectorPackagerConnection.connect();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$4 */
    class AnonymousClass4 extends AsyncTask<Void, Void, Void> {
        AnonymousClass4() {
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            if (DevServerHelper.this.mInspectorPackagerConnection != null) {
                DevServerHelper.this.mInspectorPackagerConnection.closeQuietly();
                DevServerHelper.this.mInspectorPackagerConnection = null;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$5 */
    class AnonymousClass5 implements Callback {
        AnonymousClass5() {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            OkCallback.onFailure_enter(call, iOException);
            try {
            } finally {
                OkCallback.onFailure_exit();
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            OkCallback.onResponse_enter(call, response);
            try {
            } finally {
                OkCallback.onResponse_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$6 */
    class AnonymousClass6 implements Callback {
        final /* synthetic */ ReactContext val$context;
        final /* synthetic */ String val$errorMessage;

        AnonymousClass6(ReactContext reactContext, String str) {
            reactContext = reactContext;
            str = str;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            OkCallback.onFailure_enter(call, iOException);
            try {
                RNLog.w(reactContext, str);
            } finally {
                OkCallback.onFailure_exit();
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            OkCallback.onResponse_enter(call, response);
            try {
            } finally {
                OkCallback.onResponse_exit();
            }
        }
    }

    private enum BundleType {
        BUNDLE("bundle"),
        MAP("map");

        private final String mTypeID;

        BundleType(String str) {
            this.mTypeID = str;
        }

        public String typeID() {
            return this.mTypeID;
        }
    }

    public interface PackagerCommandListener {
        Map<String, RequestHandler> customCommandHandlers();

        void onCaptureHeapCommand(Responder responder);

        void onPackagerConnected();

        void onPackagerDevMenuCommand();

        void onPackagerDisconnected();

        void onPackagerReloadCommand();
    }

    public DevServerHelper(DeveloperSettings developerSettings, Context context, PackagerConnectionSettings packagerConnectionSettings) throws Throwable {
        this.mSettings = developerSettings;
        this.mPackagerConnectionSettings = packagerConnectionSettings;
        OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().connectTimeout(5000L, TimeUnit.MILLISECONDS).readTimeout(0L, TimeUnit.MILLISECONDS).writeTimeout(0L, TimeUnit.MILLISECONDS).build();
        this.mClient = okHttpClientBuild;
        this.mBundleDownloader = new BundleDownloader(okHttpClientBuild);
        this.mPackagerStatusCheck = new PackagerStatusCheck(okHttpClientBuild);
        this.mApplicationContext = context;
        Class<?> cls = Class.forName(ZO.xd("A\u0016\u0015,moTM=X*8rV\u0012(Jup8~\n'", (short) (OY.Xd() ^ 14865), (short) (OY.Xd() ^ 30931)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-1212));
        short sXd2 = (short) (C1499aX.Xd() ^ (-29093));
        int[] iArr = new int["\u0006W,C\nJ4B\u007f[?K\u0002;".length()];
        QB qb = new QB("\u0006W,C\nJ4B\u007f[?K\u0002;");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this.mPackageName = (String) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private String createBundleURL(String str, BundleType bundleType) {
        return createBundleURL(str, bundleType, this.mPackagerConnectionSettings.getDebugServerHost());
    }

    private String createBundleURL(String str, BundleType bundleType, String str2) {
        return createBundleURL(str, bundleType, str2, false, true);
    }

    private String createBundleURL(String str, BundleType bundleType, String str2, boolean z2, boolean z3) {
        boolean devMode = getDevMode();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.mPackagerConnectionSettings.getAdditionalOptionsForPackager().entrySet()) {
            if (entry.getValue().length() != 0) {
                sb.append("&" + entry.getKey() + "=" + Uri.encode(entry.getValue()));
            }
        }
        return String.format(Locale.US, "http://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", str2, str, bundleType.typeID(), Boolean.valueOf(devMode), Boolean.valueOf(devMode), Boolean.valueOf(getJSMinifyMode()), this.mPackageName, z2 ? "true" : Constants.CASEFIRST_FALSE, z3 ? "true" : Constants.CASEFIRST_FALSE) + (InspectorFlags.getFuseboxEnabled() ? "&excludeSource=true&sourcePaths=url-server" : "") + sb.toString();
    }

    private String createLaunchJSDevtoolsCommandUrl() {
        return String.format(Locale.US, "http://%s/launch-js-devtools", this.mPackagerConnectionSettings.getDebugServerHost());
    }

    private static String createResourceURL(String str, String str2) {
        return String.format(Locale.US, "http://%s/%s", str, str2);
    }

    private String createSplitBundleURL(String str, String str2) {
        return createBundleURL(str, BundleType.BUNDLE, str2, true, false);
    }

    private boolean getDevMode() {
        return this.mSettings.isJSDevModeEnabled();
    }

    private String getHostForJSProxy() {
        String str = (String) Assertions.assertNotNull(this.mPackagerConnectionSettings.getDebugServerHost());
        int iLastIndexOf = str.lastIndexOf(58);
        return iLastIndexOf > -1 ? AndroidInfoHelpers.DEVICE_LOCALHOST + str.substring(iLastIndexOf) : AndroidInfoHelpers.DEVICE_LOCALHOST;
    }

    private String getInspectorDeviceId() throws Throwable {
        String str = this.mPackageName;
        Context context = this.mApplicationContext;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("Q/\u0003l9~\"j}IR.pwm\u0001aw[k\u0019Nv", (short) (C1607wl.Xd() ^ 4916))).getMethod(EO.Od("^\u000b\n64\u0001)#kc=0ielZv\u0010", (short) (ZN.Xd() ^ 24948)), new Class[0]);
        try {
            method.setAccessible(true);
            return getSHA256(String.format(Locale.US, C1561oA.Kd("M[Ra_ZV \u0019h#\u001ck&\u001fn", (short) (Od.Xd() ^ (-18715))), str, Settings.Secure.getString((ContentResolver) method.invoke(context, objArr), C1561oA.Qd("eqfsohb\\e_", (short) (C1633zX.Xd() ^ (-25003)))), InspectorFlags.getFuseboxEnabled() ? C1593ug.zd("Yih[Ygq", (short) (Od.Xd() ^ (-30552)), (short) (Od.Xd() ^ (-21473))) : C1561oA.od("\u0013\u000b\f\u0005\u0006\u001b", (short) (FB.Xd() ^ 1961))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public String getInspectorDeviceUrl() {
        return String.format(Locale.US, "http://%s/inspector/device?name=%s&app=%s&device=%s", this.mPackagerConnectionSettings.getDebugServerHost(), Uri.encode(AndroidInfoHelpers.getFriendlyDeviceName()), Uri.encode(this.mPackageName), Uri.encode(getInspectorDeviceId()));
    }

    private boolean getJSMinifyMode() {
        return this.mSettings.isJSMinifyEnabled();
    }

    private static String getSHA256(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            try {
                byte[] bArrDigest = messageDigest.digest(str.getBytes("UTF-8"));
                return String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", Byte.valueOf(bArrDigest[0]), Byte.valueOf(bArrDigest[1]), Byte.valueOf(bArrDigest[2]), Byte.valueOf(bArrDigest[3]), Byte.valueOf(bArrDigest[4]), Byte.valueOf(bArrDigest[5]), Byte.valueOf(bArrDigest[6]), Byte.valueOf(bArrDigest[7]), Byte.valueOf(bArrDigest[8]), Byte.valueOf(bArrDigest[9]), Byte.valueOf(bArrDigest[10]), Byte.valueOf(bArrDigest[11]), Byte.valueOf(bArrDigest[12]), Byte.valueOf(bArrDigest[13]), Byte.valueOf(bArrDigest[14]), Byte.valueOf(bArrDigest[15]), Byte.valueOf(bArrDigest[16]), Byte.valueOf(bArrDigest[17]), Byte.valueOf(bArrDigest[18]), Byte.valueOf(bArrDigest[19]));
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError("This environment doesn't support UTF-8 encoding", e2);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError("Could not get standard SHA-256 algorithm", e3);
        }
    }

    public void closeInspectorConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.4
            AnonymousClass4() {
            }

            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                if (DevServerHelper.this.mInspectorPackagerConnection != null) {
                    DevServerHelper.this.mInspectorPackagerConnection.closeQuietly();
                    DevServerHelper.this.mInspectorPackagerConnection = null;
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void closePackagerConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.2
            AnonymousClass2() {
            }

            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                if (DevServerHelper.this.mPackagerClient != null) {
                    DevServerHelper.this.mPackagerClient.close();
                    DevServerHelper.this.mPackagerClient = null;
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void disableDebugger() {
        IInspectorPackagerConnection iInspectorPackagerConnection = this.mInspectorPackagerConnection;
        if (iInspectorPackagerConnection != null) {
            iInspectorPackagerConnection.sendEventToAllConnections(DEBUGGER_MSG_DISABLE);
        }
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleDownloader.BundleInfo bundleInfo) {
        this.mBundleDownloader.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo);
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleDownloader.BundleInfo bundleInfo, Request.Builder builder) {
        this.mBundleDownloader.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, builder);
    }

    public File downloadBundleResourceFromUrlSync(String str, File file) {
        try {
            Response responseExecute = OkCallback.execute(this.mClient.newCall(new Request.Builder().url(createResourceURL(this.mPackagerConnectionSettings.getDebugServerHost(), str)).build()));
            try {
                if (!responseExecute.isSuccessful()) {
                    if (responseExecute != null) {
                        responseExecute.close();
                    }
                    return null;
                }
                Sink sink = Okio.sink(file);
                try {
                    Okio.buffer(responseExecute.body().source()).readAll(sink);
                    if (sink != null) {
                        sink.close();
                    }
                    if (responseExecute != null) {
                        responseExecute.close();
                    }
                    return file;
                } finally {
                }
            } finally {
            }
        } catch (Exception e2) {
            FLog.e(ReactConstants.TAG, "Failed to fetch resource synchronously - resourcePath: \"%s\", outputFile: \"%s\"", str, file.getAbsolutePath(), e2);
            return null;
        }
        FLog.e(ReactConstants.TAG, "Failed to fetch resource synchronously - resourcePath: \"%s\", outputFile: \"%s\"", str, file.getAbsolutePath(), e2);
        return null;
    }

    public String getDevServerBundleURL(String str) {
        return createBundleURL(str, BundleType.BUNDLE, this.mPackagerConnectionSettings.getDebugServerHost());
    }

    public String getDevServerSplitBundleURL(String str) {
        return createSplitBundleURL(str, this.mPackagerConnectionSettings.getDebugServerHost());
    }

    public String getJSBundleURLForRemoteDebugging(String str) {
        return createBundleURL(str, BundleType.BUNDLE, getHostForJSProxy());
    }

    public String getSourceMapUrl(String str) {
        return createBundleURL(str, BundleType.MAP);
    }

    public String getSourceUrl(String str) {
        return createBundleURL(str, BundleType.BUNDLE);
    }

    public String getWebsocketProxyURL() {
        return String.format(Locale.US, "ws://%s/debugger-proxy?role=client", this.mPackagerConnectionSettings.getDebugServerHost());
    }

    public void isPackagerRunning(PackagerStatusCallback packagerStatusCallback) {
        String debugServerHost = this.mPackagerConnectionSettings.getDebugServerHost();
        if (debugServerHost != null) {
            this.mPackagerStatusCheck.run(debugServerHost, packagerStatusCallback);
        } else {
            FLog.w(ReactConstants.TAG, "No packager host configured.");
            packagerStatusCallback.onPackagerStatusFetched(false);
        }
    }

    public void launchJSDevtools() {
        OkCallback.enqueue(this.mClient.newCall(new Request.Builder().url(createLaunchJSDevtoolsCommandUrl()).build()), new Callback() { // from class: com.facebook.react.devsupport.DevServerHelper.5
            AnonymousClass5() {
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                OkCallback.onFailure_enter(call, iOException);
                try {
                } finally {
                    OkCallback.onFailure_exit();
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                OkCallback.onResponse_enter(call, response);
                try {
                } finally {
                    OkCallback.onResponse_exit();
                }
            }
        });
    }

    public void openDebugger(ReactContext reactContext, String str) {
        OkCallback.enqueue(this.mClient.newCall(new Request.Builder().url(String.format(Locale.US, "http://%s/open-debugger?appId=%s&device=%s", this.mPackagerConnectionSettings.getDebugServerHost(), Uri.encode(this.mPackageName), Uri.encode(getInspectorDeviceId()))).method(HttpPost.METHOD_NAME, RequestBody.create((MediaType) null, "")).build()), new Callback() { // from class: com.facebook.react.devsupport.DevServerHelper.6
            final /* synthetic */ ReactContext val$context;
            final /* synthetic */ String val$errorMessage;

            AnonymousClass6(ReactContext reactContext2, String str2) {
                reactContext = reactContext2;
                str = str2;
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                OkCallback.onFailure_enter(call, iOException);
                try {
                    RNLog.w(reactContext, str);
                } finally {
                    OkCallback.onFailure_exit();
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                OkCallback.onResponse_enter(call, response);
                try {
                } finally {
                    OkCallback.onResponse_exit();
                }
            }
        });
    }

    public void openInspectorConnection() {
        if (this.mInspectorPackagerConnection != null) {
            FLog.w(ReactConstants.TAG, "Inspector connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.3
                AnonymousClass3() {
                }

                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) {
                    if (InspectorFlags.getFuseboxEnabled()) {
                        DevServerHelper.this.mInspectorPackagerConnection = new CxxInspectorPackagerConnection(DevServerHelper.this.getInspectorDeviceUrl(), DevServerHelper.this.mPackageName);
                    } else {
                        DevServerHelper.this.mInspectorPackagerConnection = new InspectorPackagerConnection(DevServerHelper.this.getInspectorDeviceUrl(), DevServerHelper.this.mPackageName);
                    }
                    DevServerHelper.this.mInspectorPackagerConnection.connect();
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public void openPackagerConnection(String str, PackagerCommandListener packagerCommandListener) {
        if (this.mPackagerClient != null) {
            FLog.w(ReactConstants.TAG, "Packager connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.1
                final /* synthetic */ String val$clientId;
                final /* synthetic */ PackagerCommandListener val$commandListener;

                /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$1$1 */
                class C01541 extends NotificationOnlyHandler {
                    C01541() {
                    }

                    @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                    public void onNotification(Object obj) {
                        packagerCommandListener.onPackagerReloadCommand();
                    }
                }

                /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$1$2 */
                class AnonymousClass2 extends NotificationOnlyHandler {
                    AnonymousClass2() {
                    }

                    @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                    public void onNotification(Object obj) {
                        packagerCommandListener.onPackagerDevMenuCommand();
                    }
                }

                /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$1$3 */
                class AnonymousClass3 extends RequestOnlyHandler {
                    AnonymousClass3() {
                    }

                    @Override // com.facebook.react.packagerconnection.RequestOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                    public void onRequest(Object obj, Responder responder) {
                        packagerCommandListener.onCaptureHeapCommand(responder);
                    }
                }

                /* JADX INFO: renamed from: com.facebook.react.devsupport.DevServerHelper$1$4 */
                class AnonymousClass4 implements ReconnectingWebSocket.ConnectionCallback {
                    AnonymousClass4() {
                    }

                    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                    public void onConnected() {
                        packagerCommandListener.onPackagerConnected();
                    }

                    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                    public void onDisconnected() {
                        packagerCommandListener.onPackagerDisconnected();
                    }
                }

                AnonymousClass1(PackagerCommandListener packagerCommandListener2, String str2) {
                    packagerCommandListener = packagerCommandListener2;
                    str = str2;
                }

                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) {
                    HashMap map = new HashMap();
                    map.put("reload", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper.1.1
                        C01541() {
                        }

                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object obj) {
                            packagerCommandListener.onPackagerReloadCommand();
                        }
                    });
                    map.put("devMenu", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper.1.2
                        AnonymousClass2() {
                        }

                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object obj) {
                            packagerCommandListener.onPackagerDevMenuCommand();
                        }
                    });
                    map.put("captureHeap", new RequestOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper.1.3
                        AnonymousClass3() {
                        }

                        @Override // com.facebook.react.packagerconnection.RequestOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onRequest(Object obj, Responder responder) {
                            packagerCommandListener.onCaptureHeapCommand(responder);
                        }
                    });
                    Map<String, RequestHandler> mapCustomCommandHandlers = packagerCommandListener.customCommandHandlers();
                    if (mapCustomCommandHandlers != null) {
                        map.putAll(mapCustomCommandHandlers);
                    }
                    map.putAll(new FileIoHandler().handlers());
                    AnonymousClass4 anonymousClass4 = new ReconnectingWebSocket.ConnectionCallback() { // from class: com.facebook.react.devsupport.DevServerHelper.1.4
                        AnonymousClass4() {
                        }

                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onConnected() {
                            packagerCommandListener.onPackagerConnected();
                        }

                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onDisconnected() {
                            packagerCommandListener.onPackagerDisconnected();
                        }
                    };
                    DevServerHelper.this.mPackagerClient = new JSPackagerClient(str, DevServerHelper.this.mPackagerConnectionSettings, map, anonymousClass4);
                    DevServerHelper.this.mPackagerClient.init();
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
