package com.RNFetchBlob;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.RNFetchBlob.Response.RNFetchBlobDefaultResp;
import com.RNFetchBlob.Response.RNFetchBlobFileResp;
import com.biocatch.client.android.sdk.core.Constants;
import com.dynatrace.android.callback.OkCallback;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.SentryThread;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
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

/* JADX INFO: loaded from: classes4.dex */
public class RNFetchBlobReq extends BroadcastReceiver implements Runnable {
    Callback callback;
    OkHttpClient client;
    long contentLength;
    String destPath;
    long downloadManagerId;
    ReadableMap headers;
    String method;
    RNFetchBlobConfig options;
    String rawRequestBody;
    ReadableArray rawRequestBodyArray;
    RNFetchBlobBody requestBody;
    RequestType requestType;
    WritableMap respInfo;
    ResponseType responseType;
    String taskId;
    String url;
    public static HashMap<String, Call> taskTable = new HashMap<>();
    public static HashMap<String, Long> androidDownloadManagerTaskTable = new HashMap<>();
    static HashMap<String, RNFetchBlobProgressConfig> progressReport = new HashMap<>();
    static HashMap<String, RNFetchBlobProgressConfig> uploadProgressReport = new HashMap<>();
    static ConnectionPool pool = new ConnectionPool();
    ResponseFormat responseFormat = ResponseFormat.Auto;
    boolean timeout = false;
    ArrayList<String> redirects = new ArrayList<>();

    /* JADX INFO: renamed from: com.RNFetchBlob.RNFetchBlobReq$1 */
    class AnonymousClass1 implements Interceptor {
        AnonymousClass1() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            RNFetchBlobReq.this.redirects.add(chain.request().url().toString());
            return chain.proceed(chain.request());
        }
    }

    /* JADX INFO: renamed from: com.RNFetchBlob.RNFetchBlobReq$2 */
    class AnonymousClass2 implements Interceptor {
        final /* synthetic */ Request val$req;

        AnonymousClass2(Request request) {
            request = request;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            try {
                Response responseProceed = chain.proceed(request);
                int i2 = AnonymousClass4.$SwitchMap$com$RNFetchBlob$RNFetchBlobReq$ResponseType[RNFetchBlobReq.this.responseType.ordinal()];
                return responseProceed.newBuilder().body(i2 != 1 ? i2 != 2 ? new RNFetchBlobDefaultResp(RNFetchBlob.RCTContext, RNFetchBlobReq.this.taskId, responseProceed.body(), RNFetchBlobReq.this.options.increment.booleanValue()) : new RNFetchBlobFileResp(RNFetchBlob.RCTContext, RNFetchBlobReq.this.taskId, responseProceed.body(), RNFetchBlobReq.this.destPath, RNFetchBlobReq.this.options.overwrite.booleanValue()) : new RNFetchBlobDefaultResp(RNFetchBlob.RCTContext, RNFetchBlobReq.this.taskId, responseProceed.body(), RNFetchBlobReq.this.options.increment.booleanValue())).build();
            } catch (SocketException unused) {
                RNFetchBlobReq.this.timeout = true;
                return chain.proceed(chain.request());
            } catch (SocketTimeoutException unused2) {
                RNFetchBlobReq.this.timeout = true;
                return chain.proceed(chain.request());
            } catch (Exception unused3) {
                return chain.proceed(chain.request());
            }
        }
    }

    /* JADX INFO: renamed from: com.RNFetchBlob.RNFetchBlobReq$3 */
    class AnonymousClass3 implements okhttp3.Callback {
        AnonymousClass3() {
        }

        /* JADX WARN: Finally extract failed */
        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            OkCallback.onFailure_enter(call, iOException);
            try {
                RNFetchBlobReq.cancelTask(RNFetchBlobReq.this.taskId);
                if (RNFetchBlobReq.this.respInfo == null) {
                    RNFetchBlobReq.this.respInfo = Arguments.createMap();
                }
                if (iOException.getClass().equals(SocketTimeoutException.class)) {
                    RNFetchBlobReq.this.respInfo.putBoolean(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, true);
                    RNFetchBlobReq.this.callback.invoke("The request timed out.", null, null);
                } else {
                    RNFetchBlobReq.this.callback.invoke(iOException.getLocalizedMessage(), null, null);
                }
                RNFetchBlobReq.this.releaseTaskResource();
                OkCallback.onFailure_exit();
            } catch (Throwable th) {
                OkCallback.onFailure_exit();
                throw th;
            }
        }

        /* JADX WARN: Finally extract failed */
        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            OkCallback.onResponse_enter(call, response);
            try {
                ReadableMap readableMap = RNFetchBlobReq.this.options.addAndroidDownloads;
                if (readableMap != null) {
                    String string = readableMap.hasKey("title") ? RNFetchBlobReq.this.options.addAndroidDownloads.getString("title") : "";
                    String string2 = readableMap.hasKey("description") ? readableMap.getString("description") : "";
                    String string3 = readableMap.hasKey("mime") ? readableMap.getString("mime") : "text/plain";
                    boolean z2 = false;
                    boolean z3 = readableMap.hasKey("mediaScannable") ? readableMap.getBoolean("mediaScannable") : false;
                    if (readableMap.hasKey("notification")) {
                        z2 = readableMap.getBoolean("notification");
                    }
                    ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
                    ReactApplicationContext reactApplicationContext2 = RNFetchBlob.RCTContext;
                    ((DownloadManager) reactApplicationContext.getSystemService("download")).addCompletedDownload(string, string2, z3, string3, RNFetchBlobReq.this.destPath, RNFetchBlobReq.this.contentLength, z2);
                }
                RNFetchBlobReq.this.done(response);
                OkCallback.onResponse_exit();
            } catch (Throwable th) {
                OkCallback.onResponse_exit();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.RNFetchBlob.RNFetchBlobReq$4 */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$RequestType;
        static final /* synthetic */ int[] $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$ResponseType;

        static {
            int[] iArr = new int[ResponseType.values().length];
            $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$ResponseType = iArr;
            try {
                iArr[ResponseType.KeepInMemory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$ResponseType[ResponseType.FileStorage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[RequestType.values().length];
            $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$RequestType = iArr2;
            try {
                iArr2[RequestType.SingleFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$RequestType[RequestType.AsIs.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$RequestType[RequestType.Form.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$RNFetchBlob$RNFetchBlobReq$RequestType[RequestType.WithoutBody.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    enum RequestType {
        Form,
        SingleFile,
        AsIs,
        WithoutBody,
        Others
    }

    enum ResponseFormat {
        Auto,
        UTF8,
        BASE64
    }

    enum ResponseType {
        KeepInMemory,
        FileStorage
    }

    public RNFetchBlobReq(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, ReadableArray readableArray, OkHttpClient okHttpClient, Callback callback) {
        this.method = str2.toUpperCase();
        RNFetchBlobConfig rNFetchBlobConfig = new RNFetchBlobConfig(readableMap);
        this.options = rNFetchBlobConfig;
        this.taskId = str;
        this.url = str3;
        this.headers = readableMap2;
        this.callback = callback;
        this.rawRequestBody = str4;
        this.rawRequestBodyArray = readableArray;
        this.client = okHttpClient;
        if (rNFetchBlobConfig.fileCache.booleanValue() || this.options.path != null) {
            this.responseType = ResponseType.FileStorage;
        } else {
            this.responseType = ResponseType.KeepInMemory;
        }
        if (str4 != null) {
            this.requestType = RequestType.SingleFile;
        } else if (readableArray != null) {
            this.requestType = RequestType.Form;
        } else {
            this.requestType = RequestType.WithoutBody;
        }
    }

    public static void cancelTask(String str) throws Throwable {
        if (taskTable.containsKey(str)) {
            taskTable.get(str).cancel();
            taskTable.remove(str);
        }
        if (androidDownloadManagerTaskTable.containsKey(str)) {
            long jLongValue = androidDownloadManagerTaskTable.get(str).longValue();
            Context applicationContext = RNFetchBlob.RCTContext.getApplicationContext();
            Object[] objArr = {C1561oA.ud(" *1'$&\u0017\u0019", (short) (FB.Xd() ^ 31273))};
            Method method = Class.forName(C1561oA.yd("KYP_]XT\u001fERRYKU\\\u0017\u001dJJQCWT", (short) (OY.Xd() ^ 20688))).getMethod(Xg.qd("\u001d\u001c,\f3.0\"+\u0012%38,'*", (short) (ZN.Xd() ^ 17400), (short) (ZN.Xd() ^ 18862)), Class.forName(C1561oA.Yd("*\"8$q1'5/v\u001d?>6<6", (short) (Od.Xd() ^ (-17940)))));
            try {
                method.setAccessible(true);
                ((DownloadManager) method.invoke(applicationContext, objArr)).remove(jLongValue);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0177 A[Catch: IOException -> 0x02bf, TRY_LEAVE, TryCatch #3 {IOException -> 0x02bf, blocks: (B:106:0x0131, B:108:0x013b, B:109:0x0157, B:111:0x015e, B:112:0x0163, B:113:0x0177, B:117:0x01a5, B:135:0x0266, B:137:0x0276, B:139:0x02a2, B:140:0x02a8, B:141:0x02af, B:144:0x02ba, B:145:0x02be, B:118:0x01c0, B:120:0x01c6, B:121:0x01d6, B:127:0x021c, B:129:0x0248, B:130:0x024e, B:131:0x0255, B:133:0x0261, B:134:0x0265), top: B:157:0x0131, inners: #1, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void done(okhttp3.Response r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.RNFetchBlobReq.done(okhttp3.Response):void");
    }

    private void emitStateEvent(WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(RNFetchBlobConst.EVENT_HTTP_STATE, writableMap);
    }

    public static OkHttpClient.Builder enableTls12OnPreLollipop(OkHttpClient.Builder builder) {
        return builder;
    }

    private String getHeaderIgnoreCases(HashMap<String, String> map, String str) {
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = map.get(str.toLowerCase());
        return str3 == null ? "" : str3;
    }

    private String getHeaderIgnoreCases(Headers headers, String str) {
        String str2 = headers.get(str);
        return str2 != null ? str2 : headers.get(str.toLowerCase()) == null ? "" : headers.get(str.toLowerCase());
    }

    public static RNFetchBlobProgressConfig getReportProgress(String str) {
        if (progressReport.containsKey(str)) {
            return progressReport.get(str);
        }
        return null;
    }

    public static RNFetchBlobProgressConfig getReportUploadProgress(String str) {
        if (uploadProgressReport.containsKey(str)) {
            return uploadProgressReport.get(str);
        }
        return null;
    }

    private WritableMap getResponseInfo(Response response, boolean z2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("status", response.code());
        writableMapCreateMap.putString(SentryThread.JsonKeys.STATE, ExifInterface.GPS_MEASUREMENT_2D);
        writableMapCreateMap.putString("taskId", this.taskId);
        writableMapCreateMap.putBoolean(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, this.timeout);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        for (int i2 = 0; i2 < response.headers().size(); i2++) {
            writableMapCreateMap2.putString(response.headers().name(i2), response.headers().value(i2));
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<String> it = this.redirects.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(it.next());
        }
        writableMapCreateMap.putArray("redirects", writableArrayCreateArray);
        writableMapCreateMap.putMap("headers", writableMapCreateMap2);
        Headers headers = response.headers();
        if (z2) {
            writableMapCreateMap.putString("respType", "blob");
        } else if (getHeaderIgnoreCases(headers, "content-type").equalsIgnoreCase("text/")) {
            writableMapCreateMap.putString("respType", "text");
        } else if (getHeaderIgnoreCases(headers, "content-type").contains(Constants.WUP_CONTENT_TYPE)) {
            writableMapCreateMap.putString("respType", "json");
        } else {
            writableMapCreateMap.putString("respType", "");
        }
        return writableMapCreateMap;
    }

    private boolean isBlobResponse(Response response) {
        boolean z2;
        String headerIgnoreCases = getHeaderIgnoreCases(response.headers(), "Content-Type");
        boolean zEqualsIgnoreCase = headerIgnoreCases.equalsIgnoreCase("text/");
        boolean zEqualsIgnoreCase2 = headerIgnoreCases.equalsIgnoreCase(Constants.WUP_CONTENT_TYPE);
        if (this.options.binaryContentTypes != null) {
            for (int i2 = 0; i2 < this.options.binaryContentTypes.size(); i2++) {
                if (headerIgnoreCases.toLowerCase().contains(this.options.binaryContentTypes.getString(i2).toLowerCase())) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        return (zEqualsIgnoreCase2 && zEqualsIgnoreCase) || z2;
    }

    public void releaseTaskResource() {
        if (taskTable.containsKey(this.taskId)) {
            taskTable.remove(this.taskId);
        }
        if (androidDownloadManagerTaskTable.containsKey(this.taskId)) {
            androidDownloadManagerTaskTable.remove(this.taskId);
        }
        if (uploadProgressReport.containsKey(this.taskId)) {
            uploadProgressReport.remove(this.taskId);
        }
        if (progressReport.containsKey(this.taskId)) {
            progressReport.remove(this.taskId);
        }
        RNFetchBlobBody rNFetchBlobBody = this.requestBody;
        if (rNFetchBlobBody != null) {
            rNFetchBlobBody.clearRequestBody();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0324  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r18, android.content.Intent r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.RNFetchBlobReq.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        String strVd = hg.Vd("6\\Zk\\,)", (short) (C1607wl.Xd() ^ 2050), (short) (C1607wl.Xd() ^ 18970));
        String strUd = C1561oA.ud("\u001e\u001c\u001f\u001f", (short) (C1580rY.Xd() ^ (-32486)));
        String strYd = C1561oA.yd(".Y[`LT]\u00157[UI", (short) (C1607wl.Xd() ^ 32215));
        ReadableMap readableMap = this.options.addAndroidDownloads;
        String strYd2 = C1561oA.Yd("\u000e\u007f\u0014\t", (short) (C1499aX.Xd() ^ (-12440)));
        if (readableMap != null) {
            ReadableMap readableMap2 = this.options.addAndroidDownloads;
            short sXd = (short) (OY.Xd() ^ 10275);
            short sXd2 = (short) (OY.Xd() ^ 5635);
            int[] iArr = new int["YXK+W`XW[NR<Q_SZYg".length()];
            QB qb = new QB("YXK+W`XW[NR<Q_SZYg");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            if (readableMap2.hasKey(str) && this.options.addAndroidDownloads.getBoolean(str)) {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.url));
                ReadableMap readableMap3 = this.options.addAndroidDownloads;
                String strWd = Jg.Wd("}\u0017;L!$=WA5S2", (short) (OY.Xd() ^ 4532), (short) (OY.Xd() ^ 22817));
                if (readableMap3.hasKey(strWd) && this.options.addAndroidDownloads.getBoolean(strWd)) {
                    request.setNotificationVisibility(1);
                } else {
                    request.setNotificationVisibility(2);
                }
                ReadableMap readableMap4 = this.options.addAndroidDownloads;
                String strXd = ZO.xd("\u001diN-_", (short) (C1633zX.Xd() ^ (-18389)), (short) (C1633zX.Xd() ^ (-17905)));
                if (readableMap4.hasKey(strXd)) {
                    request.setTitle(this.options.addAndroidDownloads.getString(strXd));
                }
                ReadableMap readableMap5 = this.options.addAndroidDownloads;
                short sXd3 = (short) (OY.Xd() ^ 20307);
                short sXd4 = (short) (OY.Xd() ^ 19811);
                int[] iArr2 = new int["M_Q\f\u001cpWc')o".length()];
                QB qb2 = new QB("M_Q\f\u001cpWc')o");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                if (readableMap5.hasKey(str2)) {
                    request.setDescription(this.options.addAndroidDownloads.getString(str2));
                }
                if (this.options.addAndroidDownloads.hasKey(strYd2)) {
                    request.setDestinationUri(Uri.parse(Ig.wd("\u0016j?\u0018Eu\u0012", (short) (C1607wl.Xd() ^ 12349)) + this.options.addAndroidDownloads.getString(strYd2)));
                }
                ReadableMap readableMap6 = this.options.addAndroidDownloads;
                String strOd = EO.Od("Y-rG", (short) (ZN.Xd() ^ 12699));
                if (readableMap6.hasKey(strOd)) {
                    request.setMimeType(this.options.addAndroidDownloads.getString(strOd));
                }
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.headers.keySetIterator();
                ReadableMap readableMap7 = this.options.addAndroidDownloads;
                String strQd = C1561oA.Qd("~uswn_nkwvhhqi", (short) (Od.Xd() ^ (-23368)));
                if (readableMap7.hasKey(strQd) && this.options.addAndroidDownloads.hasKey(strQd)) {
                    request.allowScanningByMediaScanner();
                }
                while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                    String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                    request.addRequestHeader(strNextKey, this.headers.getString(strNextKey));
                }
                Context applicationContext = RNFetchBlob.RCTContext.getApplicationContext();
                String strZd = C1593ug.zd("@LUMLPCG", (short) (C1580rY.Xd() ^ (-25001)), (short) (C1580rY.Xd() ^ (-1420)));
                short sXd5 = (short) (OY.Xd() ^ 23870);
                int[] iArr3 = new int["[g\\ie^X!U`^cS[`\u0019-XV[K]X".length()];
                QB qb3 = new QB("[g\\ie^X!U`^cS[`\u0019-XV[K]X");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd5 + sXd5 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                Class<?> cls = Class.forName(new String(iArr3, 0, i4));
                Class<?>[] clsArr = new Class[1];
                short sXd6 = (short) (FB.Xd() ^ 22681);
                int[] iArr4 = new int["\u001f\u0017-\u0019f&\u001c*$k\u001243+1+".length()];
                QB qb4 = new QB("\u001f\u0017-\u0019f&\u001c*$k\u001243+1+");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - ((sXd6 + sXd6) + i5));
                    i5++;
                }
                clsArr[0] = Class.forName(new String(iArr4, 0, i5));
                Object[] objArr = {strZd};
                short sXd7 = (short) (C1607wl.Xd() ^ 32404);
                short sXd8 = (short) (C1607wl.Xd() ^ 29151);
                int[] iArr5 = new int["={[vM\bYf~%g1\u0006\u001ad#".length()];
                QB qb5 = new QB("={[vM\bYf~%g1\u0006\u001ad#");
                int i6 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i6] = xuXd5.fK(((i6 * sXd8) ^ sXd7) + xuXd5.CK(iKK5));
                    i6++;
                }
                Method method = cls.getMethod(new String(iArr5, 0, i6), clsArr);
                try {
                    method.setAccessible(true);
                    long jEnqueue = ((DownloadManager) method.invoke(applicationContext, objArr)).enqueue(request);
                    this.downloadManagerId = jEnqueue;
                    androidDownloadManagerTaskTable.put(this.taskId, Long.valueOf(jEnqueue));
                    IntentFilter intentFilter = new IntentFilter(C1561oA.Xd("o}t\u0004\u0002|xC\u007f\u0006\r~\t\u0010J~\u0002\u0014\n\u0011\u0011Qht}utxko\fp}|\u0001}w\by", (short) (FB.Xd() ^ 18931)));
                    Class<?> cls2 = Class.forName(Wg.vd("p~q\u0001\u0003}u@jwszpz}8b\u0010\f\u0013\t\u001d\u0016", (short) (Od.Xd() ^ (-30240))));
                    Class<?>[] clsArr2 = new Class[2];
                    short sXd9 = (short) (C1607wl.Xd() ^ 32038);
                    short sXd10 = (short) (C1607wl.Xd() ^ 29254);
                    int[] iArr6 = new int["frgtpic,`kin^fk$7fbSUSPaa>PMNQ]KW".length()];
                    QB qb6 = new QB("frgtpic,`kin^fk$7fbSUSPaa>PMNQ]KW");
                    int i7 = 0;
                    while (qb6.YK()) {
                        int iKK6 = qb6.KK();
                        Xu xuXd6 = Xu.Xd(iKK6);
                        iArr6[i7] = xuXd6.fK(((sXd9 + i7) + xuXd6.CK(iKK6)) - sXd10);
                        i7++;
                    }
                    clsArr2[0] = Class.forName(new String(iArr6, 0, i7));
                    clsArr2[1] = Class.forName(hg.Vd("r~s\u0001|uo8lwuzjrw0JnsckpAcel\\h", (short) (FB.Xd() ^ 21860), (short) (FB.Xd() ^ 26401)));
                    Object[] objArr2 = {this, intentFilter};
                    Method method2 = cls2.getMethod(C1561oA.ud("_QRS\\\\LX7IFGJVDP", (short) (C1499aX.Xd() ^ (-30913))), clsArr2);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(applicationContext, objArr2);
                        return;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
        }
        String md5 = this.taskId;
        String str3 = this.options.appendExt.isEmpty() ? "" : C1561oA.yd(ExifInterface.LATITUDE_SOUTH, (short) (FB.Xd() ^ 15305)) + this.options.appendExt;
        if (this.options.key != null) {
            md5 = RNFetchBlobUtils.getMD5(this.options.key);
            if (md5 == null) {
                md5 = this.taskId;
            }
            File file = new File(RNFetchBlobFS.getTmpPath(md5) + str3);
            if (file.exists()) {
                this.callback.invoke(null, strYd2, file.getAbsolutePath());
                return;
            }
        }
        if (this.options.path != null) {
            this.destPath = this.options.path;
        } else if (this.options.fileCache.booleanValue()) {
            this.destPath = RNFetchBlobFS.getTmpPath(md5) + str3;
        }
        try {
            OkHttpClient.Builder unsafeOkHttpClient = this.options.trusty.booleanValue() ? RNFetchBlobUtils.getUnsafeOkHttpClient(this.client) : this.client.newBuilder();
            if (this.options.wifiOnly.booleanValue()) {
                ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
                ReactApplicationContext reactApplicationContext2 = RNFetchBlob.RCTContext;
                short sXd11 = (short) (C1580rY.Xd() ^ (-22441));
                int[] iArr7 = new int["\u001f,,-%$6,:.:@".length()];
                QB qb7 = new QB("\u001f,,-%$6,:.:@");
                int i8 = 0;
                while (qb7.YK()) {
                    int iKK7 = qb7.KK();
                    Xu xuXd7 = Xu.Xd(iKK7);
                    iArr7[i8] = xuXd7.fK(xuXd7.CK(iKK7) - (((sXd11 + sXd11) + sXd11) + i8));
                    i8++;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) reactApplicationContext.getSystemService(new String(iArr7, 0, i8));
                for (Network network : connectivityManager.getAllNetworks()) {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities != null && networkInfo != null && networkInfo.isConnected() && networkCapabilities.hasTransport(1)) {
                        unsafeOkHttpClient.proxy(Proxy.NO_PROXY);
                        unsafeOkHttpClient.socketFactory(network.getSocketFactory());
                    }
                }
                this.callback.invoke(Xg.qd("\r/`#9%.2(*5/j#6\u00148o4AAB:9KAHHN\n", (short) (OY.Xd() ^ 9375), (short) (OY.Xd() ^ 16202)), null, null);
                releaseTaskResource();
                return;
            }
            Request.Builder builder = new Request.Builder();
            try {
                builder.url(new URL(this.url));
            } catch (MalformedURLException e4) {
                e4.printStackTrace();
            }
            HashMap<String, String> map = new HashMap<>();
            ReadableMap readableMap8 = this.headers;
            if (readableMap8 != null) {
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator2 = readableMap8.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator2.hasNextKey()) {
                    String strNextKey2 = readableMapKeySetIteratorKeySetIterator2.nextKey();
                    String string = this.headers.getString(strNextKey2);
                    if (!strNextKey2.equalsIgnoreCase(Jg.Wd("\u0011+eCO\u0017,grcXOO", (short) (FB.Xd() ^ 7652), (short) (FB.Xd() ^ 12647)))) {
                        builder.header(strNextKey2.toLowerCase(), string);
                        map.put(strNextKey2.toLowerCase(), string);
                    } else if (string.equalsIgnoreCase(ZO.xd("YND\u000f\u0013\u0019", (short) (ZN.Xd() ^ 19681), (short) (ZN.Xd() ^ 13783)))) {
                        this.responseFormat = ResponseFormat.BASE64;
                    } else {
                        short sXd12 = (short) (C1607wl.Xd() ^ 1867);
                        short sXd13 = (short) (C1607wl.Xd() ^ 10234);
                        int[] iArr8 = new int["\u0001\u001d7(".length()];
                        QB qb8 = new QB("\u0001\u001d7(");
                        int i9 = 0;
                        while (qb8.YK()) {
                            int iKK8 = qb8.KK();
                            Xu xuXd8 = Xu.Xd(iKK8);
                            iArr8[i9] = xuXd8.fK((C1561oA.Xd[i9 % C1561oA.Xd.length] ^ ((sXd12 + sXd12) + (i9 * sXd13))) + xuXd8.CK(iKK8));
                            i9++;
                        }
                        if (string.equalsIgnoreCase(new String(iArr8, 0, i9))) {
                            this.responseFormat = ResponseFormat.UTF8;
                        }
                    }
                }
            }
            boolean zEqualsIgnoreCase = this.method.equalsIgnoreCase(strUd);
            String strWd2 = Ig.wd("\bK,\u0007\u000b", (short) (C1607wl.Xd() ^ 1847));
            String strOd2 = EO.Od(")]\u000b", (short) (C1607wl.Xd() ^ 6920));
            String strQd2 = C1561oA.Qd(",75:*27n59/#", (short) (C1499aX.Xd() ^ (-17588)));
            if (zEqualsIgnoreCase || this.method.equalsIgnoreCase(strOd2) || this.method.equalsIgnoreCase(strWd2)) {
                String lowerCase = getHeaderIgnoreCases(map, strYd).toLowerCase();
                if (this.rawRequestBodyArray != null) {
                    this.requestType = RequestType.Form;
                } else if (lowerCase.isEmpty()) {
                    if (!lowerCase.equalsIgnoreCase("")) {
                        short sXd14 = (short) (Od.Xd() ^ (-2654));
                        short sXd15 = (short) (Od.Xd() ^ (-31578));
                        int[] iArr9 = new int["3CDA?:9MCJJ\fMBTFV\u0010WYXLIV".length()];
                        QB qb9 = new QB("3CDA?:9MCJJ\fMBTFV\u0010WYXLIV");
                        int i10 = 0;
                        while (qb9.YK()) {
                            int iKK9 = qb9.KK();
                            Xu xuXd9 = Xu.Xd(iKK9);
                            iArr9[i10] = xuXd9.fK((xuXd9.CK(iKK9) - (sXd14 + i10)) - sXd15);
                            i10++;
                        }
                        builder.header(strYd, new String(iArr9, 0, i10));
                    }
                    this.requestType = RequestType.SingleFile;
                }
                String str4 = this.rawRequestBody;
                if (str4 != null) {
                    if (str4.startsWith(C1561oA.od("=8/M[IM&OQC\rEGIA\u0015\t\b", (short) (C1499aX.Xd() ^ (-25261)))) || this.rawRequestBody.startsWith(C1561oA.Kd("PMFfvflGrvj6mzz\u0002s}\u0005KAB", (short) (ZN.Xd() ^ 27688)))) {
                        this.requestType = RequestType.SingleFile;
                    } else if (lowerCase.toLowerCase().contains(strVd) || lowerCase.toLowerCase().startsWith(Wg.Zd("#5631,*>4;;{=4F8G", (short) (C1580rY.Xd() ^ (-11042)), (short) (C1580rY.Xd() ^ (-12051))))) {
                        String strReplace = lowerCase.replace(strVd, "").replace(C1561oA.Xd("rzz\u000e\u0001rq", (short) (C1580rY.Xd() ^ (-12659))), "");
                        if (map.containsKey(strQd2)) {
                            map.put(strQd2, strReplace);
                        }
                        if (map.containsKey(strYd)) {
                            map.put(strYd, strReplace);
                        }
                        this.requestType = RequestType.SingleFile;
                    } else {
                        this.requestType = RequestType.AsIs;
                    }
                }
            } else {
                this.requestType = RequestType.WithoutBody;
            }
            boolean zEqualsIgnoreCase2 = getHeaderIgnoreCases(map, Wg.vd("\u0002\u001f\u0011\u001d\u001d\u000f\u0011\u001dRi\u0016\n\u0011\u0005\r\u0011%", (short) (ZN.Xd() ^ 24930))).equalsIgnoreCase(Qg.kd("8<H@<53", (short) (Od.Xd() ^ (-13786)), (short) (Od.Xd() ^ (-15988))));
            int i11 = AnonymousClass4.$SwitchMap$com$RNFetchBlob$RNFetchBlobReq$RequestType[this.requestType.ordinal()];
            if (i11 == 1) {
                RNFetchBlobBody mime = new RNFetchBlobBody(this.taskId).chunkedEncoding(zEqualsIgnoreCase2).setRequestType(this.requestType).setBody(this.rawRequestBody).setMIME(MediaType.parse(getHeaderIgnoreCases(map, strQd2)));
                this.requestBody = mime;
                builder.method(this.method, mime);
            } else if (i11 == 2) {
                RNFetchBlobBody mime2 = new RNFetchBlobBody(this.taskId).chunkedEncoding(zEqualsIgnoreCase2).setRequestType(this.requestType).setBody(this.rawRequestBody).setMIME(MediaType.parse(getHeaderIgnoreCases(map, strQd2)));
                this.requestBody = mime2;
                builder.method(this.method, mime2);
            } else if (i11 == 3) {
                RNFetchBlobBody mime3 = new RNFetchBlobBody(this.taskId).chunkedEncoding(zEqualsIgnoreCase2).setRequestType(this.requestType).setBody(this.rawRequestBodyArray).setMIME(MediaType.parse(C1561oA.ud("\u000f\u0016\f\u0013\u0007\r|\r\u000eG}\u0006\b\u0002@vr\u0005pI-nz\u007fwlhx~A", (short) (C1633zX.Xd() ^ (-25445))) + (hg.Vd("NI@^lZ^7`bT\u001e", (short) (C1633zX.Xd() ^ (-1811)), (short) (C1633zX.Xd() ^ (-1915))) + this.taskId)));
                this.requestBody = mime3;
                builder.method(this.method, mime3);
            } else if (i11 == 4) {
                if (this.method.equalsIgnoreCase(strUd) || this.method.equalsIgnoreCase(strOd2) || this.method.equalsIgnoreCase(strWd2)) {
                    builder.method(this.method, RequestBody.create((MediaType) null, new byte[0]));
                } else {
                    builder.method(this.method, null);
                }
            }
            Request requestBuild = builder.build();
            unsafeOkHttpClient.addNetworkInterceptor(new Interceptor() { // from class: com.RNFetchBlob.RNFetchBlobReq.1
                AnonymousClass1() {
                }

                @Override // okhttp3.Interceptor
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    RNFetchBlobReq.this.redirects.add(chain.request().url().toString());
                    return chain.proceed(chain.request());
                }
            });
            unsafeOkHttpClient.addInterceptor(new Interceptor() { // from class: com.RNFetchBlob.RNFetchBlobReq.2
                final /* synthetic */ Request val$req;

                AnonymousClass2(Request requestBuild2) {
                    request = requestBuild2;
                }

                @Override // okhttp3.Interceptor
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    try {
                        Response responseProceed = chain.proceed(request);
                        int i22 = AnonymousClass4.$SwitchMap$com$RNFetchBlob$RNFetchBlobReq$ResponseType[RNFetchBlobReq.this.responseType.ordinal()];
                        return responseProceed.newBuilder().body(i22 != 1 ? i22 != 2 ? new RNFetchBlobDefaultResp(RNFetchBlob.RCTContext, RNFetchBlobReq.this.taskId, responseProceed.body(), RNFetchBlobReq.this.options.increment.booleanValue()) : new RNFetchBlobFileResp(RNFetchBlob.RCTContext, RNFetchBlobReq.this.taskId, responseProceed.body(), RNFetchBlobReq.this.destPath, RNFetchBlobReq.this.options.overwrite.booleanValue()) : new RNFetchBlobDefaultResp(RNFetchBlob.RCTContext, RNFetchBlobReq.this.taskId, responseProceed.body(), RNFetchBlobReq.this.options.increment.booleanValue())).build();
                    } catch (SocketException unused) {
                        RNFetchBlobReq.this.timeout = true;
                        return chain.proceed(chain.request());
                    } catch (SocketTimeoutException unused2) {
                        RNFetchBlobReq.this.timeout = true;
                        return chain.proceed(chain.request());
                    } catch (Exception unused3) {
                        return chain.proceed(chain.request());
                    }
                }
            });
            if (this.options.timeout >= 0) {
                unsafeOkHttpClient.connectTimeout(this.options.timeout, TimeUnit.MILLISECONDS);
                unsafeOkHttpClient.readTimeout(this.options.timeout, TimeUnit.MILLISECONDS);
            }
            unsafeOkHttpClient.connectionPool(pool);
            unsafeOkHttpClient.retryOnConnectionFailure(false);
            unsafeOkHttpClient.followRedirects(this.options.followRedirect.booleanValue());
            unsafeOkHttpClient.followSslRedirects(this.options.followRedirect.booleanValue());
            unsafeOkHttpClient.retryOnConnectionFailure(true);
            Call callNewCall = enableTls12OnPreLollipop(unsafeOkHttpClient).build().newCall(requestBuild2);
            taskTable.put(this.taskId, callNewCall);
            OkCallback.enqueue(callNewCall, new okhttp3.Callback() { // from class: com.RNFetchBlob.RNFetchBlobReq.3
                AnonymousClass3() {
                }

                /* JADX WARN: Finally extract failed */
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    OkCallback.onFailure_enter(call, iOException);
                    try {
                        RNFetchBlobReq.cancelTask(RNFetchBlobReq.this.taskId);
                        if (RNFetchBlobReq.this.respInfo == null) {
                            RNFetchBlobReq.this.respInfo = Arguments.createMap();
                        }
                        if (iOException.getClass().equals(SocketTimeoutException.class)) {
                            RNFetchBlobReq.this.respInfo.putBoolean(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT, true);
                            RNFetchBlobReq.this.callback.invoke("The request timed out.", null, null);
                        } else {
                            RNFetchBlobReq.this.callback.invoke(iOException.getLocalizedMessage(), null, null);
                        }
                        RNFetchBlobReq.this.releaseTaskResource();
                        OkCallback.onFailure_exit();
                    } catch (Throwable th) {
                        OkCallback.onFailure_exit();
                        throw th;
                    }
                }

                /* JADX WARN: Finally extract failed */
                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) throws IOException {
                    OkCallback.onResponse_enter(call, response);
                    try {
                        ReadableMap readableMap9 = RNFetchBlobReq.this.options.addAndroidDownloads;
                        if (readableMap9 != null) {
                            String string2 = readableMap9.hasKey("title") ? RNFetchBlobReq.this.options.addAndroidDownloads.getString("title") : "";
                            String string22 = readableMap9.hasKey("description") ? readableMap9.getString("description") : "";
                            String string3 = readableMap9.hasKey("mime") ? readableMap9.getString("mime") : "text/plain";
                            boolean z2 = false;
                            boolean z3 = readableMap9.hasKey("mediaScannable") ? readableMap9.getBoolean("mediaScannable") : false;
                            if (readableMap9.hasKey("notification")) {
                                z2 = readableMap9.getBoolean("notification");
                            }
                            ReactApplicationContext reactApplicationContext3 = RNFetchBlob.RCTContext;
                            ReactApplicationContext reactApplicationContext22 = RNFetchBlob.RCTContext;
                            ((DownloadManager) reactApplicationContext3.getSystemService("download")).addCompletedDownload(string2, string22, z3, string3, RNFetchBlobReq.this.destPath, RNFetchBlobReq.this.contentLength, z2);
                        }
                        RNFetchBlobReq.this.done(response);
                        OkCallback.onResponse_exit();
                    } catch (Throwable th) {
                        OkCallback.onResponse_exit();
                        throw th;
                    }
                }
            });
        } catch (Exception e5) {
            e5.printStackTrace();
            releaseTaskResource();
            this.callback.invoke(C1561oA.yd("\u000e\t\u007f\u001e,\u001a\u001ev \"\u0014P\"\u0014\u001f\"1>>h-9846|a", (short) (C1580rY.Xd() ^ (-12786))) + e5.getMessage() + e5.getCause());
        }
    }
}
