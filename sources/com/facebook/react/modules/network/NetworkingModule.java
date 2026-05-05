package com.facebook.react.modules.network;

import android.net.Uri;
import android.os.Bundle;
import com.dynatrace.android.callback.OkCallback;
import com.facebook.common.logging.FLog;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.module.annotations.ReactModule;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;
import okio.GzipSource;
import okio.Okio;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u000e$24+-%\"&\u001e")
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "Networking";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static com.facebook.react.modules.network.CustomClientBuilder customClientBuilder = null;
    private final OkHttpClient mClient;
    private final ForwardingCookieHandler mCookieHandler;
    private final CookieJarContainer mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<RequestBodyHandler> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<ResponseHandler> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<UriHandler> mUriHandlers;

    /* JADX INFO: renamed from: com.facebook.react.modules.network.NetworkingModule$1 */
    class AnonymousClass1 implements ProgressListener {
        long last = System.nanoTime();
        final /* synthetic */ ReactApplicationContext val$reactApplicationContext;
        final /* synthetic */ int val$requestId;
        final /* synthetic */ String val$responseType;

        AnonymousClass1(String str, ReactApplicationContext reactApplicationContext, int i2) {
            str = str;
            reactApplicationContext = reactApplicationContext;
            i = i2;
        }

        @Override // com.facebook.react.modules.network.ProgressListener
        public void onProgress(long j2, long j3, boolean z2) {
            long jNanoTime = System.nanoTime();
            if ((z2 || NetworkingModule.shouldDispatch(jNanoTime, this.last)) && !str.equals("text")) {
                ResponseUtil.onDataReceivedProgress(reactApplicationContext, i, j2, j3);
                this.last = jNanoTime;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.modules.network.NetworkingModule$2 */
    class AnonymousClass2 implements Callback {
        final /* synthetic */ ReactApplicationContext val$reactApplicationContext;
        final /* synthetic */ int val$requestId;
        final /* synthetic */ String val$responseType;
        final /* synthetic */ boolean val$useIncrementalUpdates;

        AnonymousClass2(int i2, ReactApplicationContext reactApplicationContext, String str, boolean z2) {
            i = i2;
            reactApplicationContext = reactApplicationContext;
            str = str;
            z = z2;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            OkCallback.onFailure_enter(call, iOException);
            try {
                if (NetworkingModule.this.mShuttingDown) {
                    return;
                }
                NetworkingModule.this.removeRequest(i);
                ResponseUtil.onRequestError(reactApplicationContext, i, iOException.getMessage() != null ? iOException.getMessage() : "Error while executing request: " + iOException.getClass().getSimpleName(), iOException);
                OkCallback.onFailure_exit();
            } finally {
                OkCallback.onFailure_exit();
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            ResponseBody responseBodyBody;
            boolean z2;
            String strKd;
            OkCallback.onResponse_enter(call, response);
            try {
                if (NetworkingModule.this.mShuttingDown) {
                    return;
                }
                NetworkingModule.this.removeRequest(i);
                ResponseUtil.onResponseReceived(reactApplicationContext, i, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().toString());
                try {
                    responseBodyBody = response.body();
                    if (C1561oA.Qd("|\u000f|\u0003", (short) (Od.Xd() ^ (-140))).equalsIgnoreCase(response.header(C1593ug.zd("0]]dV`g!:dZg]cic", (short) (C1499aX.Xd() ^ (-8775)), (short) (C1499aX.Xd() ^ (-30944))))) && responseBodyBody != null) {
                        GzipSource gzipSource = new GzipSource(responseBodyBody.source());
                        short sXd = (short) (C1607wl.Xd() ^ 21017);
                        int[] iArr = new int["4_]bRZ_\u0017=aWK".length()];
                        QB qb = new QB("4_]bRZ_\u0017=aWK");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                            i2++;
                        }
                        String strHeader = response.header(new String(iArr, 0, i2));
                        responseBodyBody = ResponseBody.create(strHeader != null ? MediaType.parse(strHeader) : null, -1L, Okio.buffer(gzipSource));
                    }
                    for (ResponseHandler responseHandler : NetworkingModule.this.mResponseHandlers) {
                        if (responseHandler.supports(str)) {
                            ResponseUtil.onDataReceived(reactApplicationContext, i, responseHandler.toResponseData(responseBodyBody));
                            ResponseUtil.onRequestSuccess(reactApplicationContext, i);
                            return;
                        }
                    }
                    z2 = z;
                    strKd = C1561oA.Kd(" \u0012&#", (short) (C1607wl.Xd() ^ 25662));
                } catch (IOException e2) {
                    ResponseUtil.onRequestError(reactApplicationContext, i, e2.getMessage(), e2);
                }
                if (z2 && str.equals(strKd)) {
                    NetworkingModule.this.readWithProgress(i, responseBodyBody);
                    ResponseUtil.onRequestSuccess(reactApplicationContext, i);
                    return;
                }
                String strString = "";
                if (str.equals(strKd)) {
                    try {
                        strString = responseBodyBody.string();
                    } catch (IOException e3) {
                        String strMethod = response.request().method();
                        short sXd2 = (short) (ZN.Xd() ^ 17084);
                        short sXd3 = (short) (ZN.Xd() ^ 18722);
                        int[] iArr2 = new int["\u0002\u0010/O".length()];
                        QB qb2 = new QB("\u0002\u0010/O");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        if (!strMethod.equalsIgnoreCase(new String(iArr2, 0, i3))) {
                            ResponseUtil.onRequestError(reactApplicationContext, i, e3.getMessage(), e3);
                        }
                    }
                } else if (str.equals(C1561oA.Xd("\u007f\u007f\u0013\u0006WV", (short) (C1499aX.Xd() ^ (-19925))))) {
                    Object[] objArr = {responseBodyBody.bytes(), 2};
                    Method declaredMethod = Class.forName(Wg.vd("1?2AC>6\u0001MM?C\n\u001f;NE\u0017\u0012", (short) (C1580rY.Xd() ^ (-15684)))).getDeclaredMethod(Qg.kd("ksgrffTnQqndh`", (short) (C1633zX.Xd() ^ (-3634)), (short) (C1633zX.Xd() ^ (-3775))), byte[].class, Integer.TYPE);
                    try {
                        declaredMethod.setAccessible(true);
                        strString = (String) declaredMethod.invoke(null, objArr);
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                }
                ResponseUtil.onDataReceived(reactApplicationContext, i, strString);
                ResponseUtil.onRequestSuccess(reactApplicationContext, i);
            } finally {
                OkCallback.onResponse_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.modules.network.NetworkingModule$3 */
    class AnonymousClass3 implements ProgressListener {
        long last = System.nanoTime();
        final /* synthetic */ ReactApplicationContext val$reactApplicationContext;
        final /* synthetic */ int val$requestId;

        AnonymousClass3(ReactApplicationContext reactApplicationContext, int i2) {
            reactApplicationContext = reactApplicationContext;
            i = i2;
        }

        @Override // com.facebook.react.modules.network.ProgressListener
        public void onProgress(long j2, long j3, boolean z2) {
            long jNanoTime = System.nanoTime();
            if (z2 || NetworkingModule.shouldDispatch(jNanoTime, this.last)) {
                ResponseUtil.onDataSend(reactApplicationContext, i, j2, j3);
                this.last = jNanoTime;
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.modules.network.NetworkingModule$4 */
    class AnonymousClass4 extends GuardedAsyncTask<Void, Void> {
        final /* synthetic */ int val$requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(ReactContext reactContext, int i2) {
            super(reactContext);
            i = i2;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            OkHttpCallUtil.cancelTag(NetworkingModule.this.mClient, Integer.valueOf(i));
        }
    }

    @Deprecated
    public interface CustomClientBuilder extends com.facebook.react.modules.network.CustomClientBuilder {
    }

    public interface RequestBodyHandler {
        boolean supports(ReadableMap readableMap);

        RequestBody toRequestBody(ReadableMap readableMap, String str);
    }

    public interface ResponseHandler {
        boolean supports(String str);

        WritableMap toResponseData(ResponseBody responseBody) throws IOException;
    }

    public interface UriHandler {
        WritableMap fetch(Uri uri) throws IOException;

        boolean supports(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<NetworkInterceptorCreator> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
            Iterator<NetworkInterceptorCreator> it = list.iterator();
            while (it.hasNext()) {
                builderNewBuilder.addNetworkInterceptor(it.next().create());
            }
            okHttpClient = builderNewBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
        this.mCookieJarContainer = (CookieJarContainer) okHttpClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<NetworkInterceptorCreator> list) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), list);
    }

    private synchronized void addRequest(int i2) {
        this.mRequestIds.add(Integer.valueOf(i2));
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
        com.facebook.react.modules.network.CustomClientBuilder customClientBuilder2 = customClientBuilder;
        if (customClientBuilder2 != null) {
            customClientBuilder2.apply(builder);
        }
    }

    private synchronized void cancelAllRequests() {
        Iterator<Integer> it = this.mRequestIds.iterator();
        while (it.hasNext()) {
            cancelRequest(it.next().intValue());
        }
        this.mRequestIds.clear();
    }

    private void cancelRequest(int i2) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.network.NetworkingModule.4
            final /* synthetic */ int val$requestId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(ReactContext reactContext, int i22) {
                super(reactContext);
                i = i22;
            }

            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... voidArr) {
                OkHttpCallUtil.cancelTag(NetworkingModule.this.mClient, Integer.valueOf(i));
            }
        }.execute(new Void[0]);
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i2) {
        MediaType mediaType;
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        int size = readableArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            ReadableMap map = readableArray.getMap(i3);
            Headers headersExtractHeaders = extractHeaders(map.getArray("headers"), null);
            if (headersExtractHeaders == null) {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i2, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String str2 = headersExtractHeaders.get(CONTENT_TYPE_HEADER_NAME);
            if (str2 != null) {
                mediaType = MediaType.parse(str2);
                headersExtractHeaders = headersExtractHeaders.newBuilder().removeAll(CONTENT_TYPE_HEADER_NAME).build();
            } else {
                mediaType = null;
            }
            if (map.hasKey("string")) {
                builder.addPart(headersExtractHeaders, RequestBody.create(mediaType, map.getString("string")));
            } else if (!map.hasKey("uri")) {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i2, "Unrecognized FormData part.", null);
            } else {
                if (mediaType == null) {
                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i2, "Binary FormData part needs a content-type header.", null);
                    return null;
                }
                String string = map.getString("uri");
                InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string);
                if (fileInputStream == null) {
                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i2, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                builder.addPart(headersExtractHeaders, RequestBodyUtil.create(mediaType, fileInputStream));
            }
        }
        return builder;
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableArray array = readableArray.getArray(i2);
            if (array != null && array.size() == 2) {
                String strStripHeaderName = HeaderUtil.stripHeaderName(array.getString(0));
                String string = array.getString(1);
                if (strStripHeaderName != null && string != null) {
                    builder.addUnsafeNonAscii(strStripHeaderName, string);
                }
            }
            return null;
        }
        if (builder.get(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            builder.add(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap == null || !readableMap.hasKey("string")) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    public /* synthetic */ Response lambda$sendRequestInternal$0(String str, ReactApplicationContext reactApplicationContext, int i2, Interceptor.Chain chain) throws IOException {
        Response responseProceed = chain.proceed(chain.request());
        return responseProceed.newBuilder().body(new ProgressResponseBody(responseProceed.body(), new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule.1
            long last = System.nanoTime();
            final /* synthetic */ ReactApplicationContext val$reactApplicationContext;
            final /* synthetic */ int val$requestId;
            final /* synthetic */ String val$responseType;

            AnonymousClass1(String str2, ReactApplicationContext reactApplicationContext2, int i22) {
                str = str2;
                reactApplicationContext = reactApplicationContext2;
                i = i22;
            }

            @Override // com.facebook.react.modules.network.ProgressListener
            public void onProgress(long j2, long j3, boolean z2) {
                long jNanoTime = System.nanoTime();
                if ((z2 || NetworkingModule.shouldDispatch(jNanoTime, this.last)) && !str.equals("text")) {
                    ResponseUtil.onDataReceivedProgress(reactApplicationContext, i, j2, j3);
                    this.last = jNanoTime;
                }
            }
        })).build();
    }

    public void readWithProgress(int i2, ResponseBody responseBody) throws IOException {
        long j2;
        long jContentLength = -1;
        try {
            ProgressResponseBody progressResponseBody = (ProgressResponseBody) responseBody;
            j2 = progressResponseBody.totalBytesRead();
            try {
                jContentLength = progressResponseBody.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j2 = -1;
        }
        ProgressiveStringDecoder progressiveStringDecoder = new ProgressiveStringDecoder(responseBody.contentType() == null ? StandardCharsets.UTF_8 : responseBody.contentType().charset(StandardCharsets.UTF_8));
        InputStream inputStreamByteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[8192];
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            while (true) {
                int i3 = inputStreamByteStream.read(bArr);
                if (i3 == -1) {
                    return;
                } else {
                    ResponseUtil.onIncrementalDataReceived(reactApplicationContextIfActiveOrWarn, i2, progressiveStringDecoder.decodeNext(bArr, i3), j2, jContentLength);
                }
            }
        } finally {
            inputStreamByteStream.close();
        }
    }

    public synchronized void removeRequest(int i2) {
        this.mRequestIds.remove(Integer.valueOf(i2));
    }

    public static void setCustomClientBuilder(com.facebook.react.modules.network.CustomClientBuilder customClientBuilder2) {
        customClientBuilder = customClientBuilder2;
    }

    public static boolean shouldDispatch(long j2, long j3) {
        return j3 + 100000000 < j2;
    }

    public static WritableMap translateHeaders(Headers headers) {
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < headers.size(); i2++) {
            String strName = headers.name(i2);
            if (bundle.containsKey(strName)) {
                bundle.putString(strName, bundle.getString(strName) + ", " + headers.value(i2));
            } else {
                bundle.putString(strName, headers.value(i2));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, int i2) {
        if (requestBody == null) {
            return null;
        }
        return RequestBodyUtil.createProgressRequest(requestBody, new ProgressListener() { // from class: com.facebook.react.modules.network.NetworkingModule.3
            long last = System.nanoTime();
            final /* synthetic */ ReactApplicationContext val$reactApplicationContext;
            final /* synthetic */ int val$requestId;

            AnonymousClass3(ReactApplicationContext reactApplicationContext, int i22) {
                reactApplicationContext = reactApplicationContext;
                i = i22;
            }

            @Override // com.facebook.react.modules.network.ProgressListener
            public void onProgress(long j2, long j3, boolean z2) {
                long jNanoTime = System.nanoTime();
                if (z2 || NetworkingModule.shouldDispatch(jNanoTime, this.last)) {
                    ResponseUtil.onDataSend(reactApplicationContext, i, j2, j3);
                    this.last = jNanoTime;
                }
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d2) {
        int i2 = (int) d2;
        cancelRequest(i2);
        removeRequest(i2);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    public void addRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.add(requestBodyHandler);
    }

    public void addResponseHandler(ResponseHandler responseHandler) {
        this.mResponseHandlers.add(responseHandler);
    }

    public void addUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.add(uriHandler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(com.facebook.react.bridge.Callback callback) {
        this.mCookieHandler.clearCookies(callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mCookieJarContainer.setCookieJar(new JavaNetCookieJar(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.destroy();
        this.mCookieJarContainer.removeCookieJar();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d2) {
    }

    public void removeRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.remove(requestBodyHandler);
    }

    public void removeResponseHandler(ResponseHandler responseHandler) {
        this.mResponseHandlers.remove(responseHandler);
    }

    public void removeUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.remove(uriHandler);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d2, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z2, double d3, boolean z3) {
        int i2 = (int) d2;
        try {
            sendRequestInternal(str, str2, i2, readableArray, readableMap, str3, z2, (int) d3, z3);
        } catch (Throwable th) {
            FLog.e("Networking", "Failed to send url request: " + str2, th);
            ResponseUtil.onRequestError(getReactApplicationContextIfActiveOrWarn(), i2, th.getMessage(), th);
        }
    }

    public void sendRequestInternal(String str, String str2, final int i2, ReadableArray readableArray, ReadableMap readableMap, final String str3, boolean z2, int i3, boolean z3) {
        RequestBodyHandler next;
        RequestBody emptyBody;
        final ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        try {
            Uri uri = Uri.parse(str2);
            for (UriHandler uriHandler : this.mUriHandlers) {
                if (uriHandler.supports(uri, str3)) {
                    ResponseUtil.onDataReceived(reactApplicationContextIfActiveOrWarn, i2, uriHandler.fetch(uri));
                    ResponseUtil.onRequestSuccess(reactApplicationContextIfActiveOrWarn, i2);
                    return;
                }
            }
            try {
                Request.Builder builderUrl = new Request.Builder().url(str2);
                if (i2 != 0) {
                    builderUrl.tag(Integer.valueOf(i2));
                }
                OkHttpClient.Builder builderNewBuilder = this.mClient.newBuilder();
                applyCustomBuilder(builderNewBuilder);
                if (!z3) {
                    builderNewBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z2) {
                    builderNewBuilder.addNetworkInterceptor(new Interceptor() { // from class: com.facebook.react.modules.network.NetworkingModule$$ExternalSyntheticLambda0
                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) {
                            return this.f$0.lambda$sendRequestInternal$0(str3, reactApplicationContextIfActiveOrWarn, i2, chain);
                        }
                    });
                }
                if (i3 != this.mClient.callTimeoutMillis()) {
                    builderNewBuilder.callTimeout(i3, TimeUnit.MILLISECONDS);
                }
                OkHttpClient okHttpClientBuild = builderNewBuilder.build();
                Headers headersExtractHeaders = extractHeaders(readableArray, readableMap);
                if (headersExtractHeaders == null) {
                    ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i2, "Unrecognized headers format", null);
                    return;
                }
                String str4 = headersExtractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                String str5 = headersExtractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
                builderUrl.headers(headersExtractHeaders);
                if (readableMap != null) {
                    Iterator<RequestBodyHandler> it = this.mRequestBodyHandlers.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (next.supports(readableMap)) {
                            break;
                        }
                    }
                    next = null;
                } else {
                    next = null;
                }
                if (readableMap == null || str.toLowerCase(Locale.ROOT).equals("get") || str.toLowerCase(Locale.ROOT).equals("head")) {
                    emptyBody = RequestBodyUtil.getEmptyBody(str);
                } else if (next != null) {
                    emptyBody = next.toRequestBody(readableMap, str4);
                } else if (readableMap.hasKey("string")) {
                    if (str4 == null) {
                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i2, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string = readableMap.getString("string");
                    MediaType mediaType = MediaType.parse(str4);
                    if (RequestBodyUtil.isGzipEncoding(str5)) {
                        emptyBody = RequestBodyUtil.createGzip(mediaType, string);
                        if (emptyBody == null) {
                            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i2, "Failed to gzip request body", null);
                            return;
                        }
                    } else {
                        emptyBody = RequestBody.create(mediaType, string.getBytes(mediaType == null ? StandardCharsets.UTF_8 : mediaType.charset(StandardCharsets.UTF_8)));
                    }
                } else if (readableMap.hasKey("base64")) {
                    if (str4 == null) {
                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i2, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    emptyBody = RequestBody.create(MediaType.parse(str4), ByteString.decodeBase64(readableMap.getString("base64")));
                } else if (readableMap.hasKey("uri")) {
                    if (str4 == null) {
                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i2, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string2 = readableMap.getString("uri");
                    InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string2);
                    if (fileInputStream == null) {
                        ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn, i2, "Could not retrieve file for uri " + string2, null);
                        return;
                    }
                    emptyBody = RequestBodyUtil.create(MediaType.parse(str4), fileInputStream);
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                    if (str4 == null) {
                        str4 = "multipart/form-data";
                    }
                    MultipartBody.Builder builderConstructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), str4, i2);
                    if (builderConstructMultipartBody == null) {
                        return;
                    } else {
                        emptyBody = builderConstructMultipartBody.build();
                    }
                } else {
                    emptyBody = RequestBodyUtil.getEmptyBody(str);
                }
                builderUrl.method(str, wrapRequestBodyWithProgressEmitter(emptyBody, i2));
                addRequest(i2);
                OkCallback.enqueue(okHttpClientBuild.newCall(builderUrl.build()), new Callback() { // from class: com.facebook.react.modules.network.NetworkingModule.2
                    final /* synthetic */ ReactApplicationContext val$reactApplicationContext;
                    final /* synthetic */ int val$requestId;
                    final /* synthetic */ String val$responseType;
                    final /* synthetic */ boolean val$useIncrementalUpdates;

                    AnonymousClass2(final int i22, final ReactApplicationContext reactApplicationContextIfActiveOrWarn2, final String str32, boolean z22) {
                        i = i22;
                        reactApplicationContext = reactApplicationContextIfActiveOrWarn2;
                        str = str32;
                        z = z22;
                    }

                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        OkCallback.onFailure_enter(call, iOException);
                        try {
                            if (NetworkingModule.this.mShuttingDown) {
                                return;
                            }
                            NetworkingModule.this.removeRequest(i);
                            ResponseUtil.onRequestError(reactApplicationContext, i, iOException.getMessage() != null ? iOException.getMessage() : "Error while executing request: " + iOException.getClass().getSimpleName(), iOException);
                            OkCallback.onFailure_exit();
                        } finally {
                            OkCallback.onFailure_exit();
                        }
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) throws IOException {
                        ResponseBody responseBodyBody;
                        boolean z22;
                        String strKd;
                        OkCallback.onResponse_enter(call, response);
                        try {
                            if (NetworkingModule.this.mShuttingDown) {
                                return;
                            }
                            NetworkingModule.this.removeRequest(i);
                            ResponseUtil.onResponseReceived(reactApplicationContext, i, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().toString());
                            try {
                                responseBodyBody = response.body();
                                if (C1561oA.Qd("|\u000f|\u0003", (short) (Od.Xd() ^ (-140))).equalsIgnoreCase(response.header(C1593ug.zd("0]]dV`g!:dZg]cic", (short) (C1499aX.Xd() ^ (-8775)), (short) (C1499aX.Xd() ^ (-30944))))) && responseBodyBody != null) {
                                    GzipSource gzipSource = new GzipSource(responseBodyBody.source());
                                    short sXd = (short) (C1607wl.Xd() ^ 21017);
                                    int[] iArr = new int["4_]bRZ_\u0017=aWK".length()];
                                    QB qb = new QB("4_]bRZ_\u0017=aWK");
                                    int i22 = 0;
                                    while (qb.YK()) {
                                        int iKK = qb.KK();
                                        Xu xuXd = Xu.Xd(iKK);
                                        iArr[i22] = xuXd.fK(sXd + sXd + i22 + xuXd.CK(iKK));
                                        i22++;
                                    }
                                    String strHeader = response.header(new String(iArr, 0, i22));
                                    responseBodyBody = ResponseBody.create(strHeader != null ? MediaType.parse(strHeader) : null, -1L, Okio.buffer(gzipSource));
                                }
                                for (ResponseHandler responseHandler : NetworkingModule.this.mResponseHandlers) {
                                    if (responseHandler.supports(str)) {
                                        ResponseUtil.onDataReceived(reactApplicationContext, i, responseHandler.toResponseData(responseBodyBody));
                                        ResponseUtil.onRequestSuccess(reactApplicationContext, i);
                                        return;
                                    }
                                }
                                z22 = z;
                                strKd = C1561oA.Kd(" \u0012&#", (short) (C1607wl.Xd() ^ 25662));
                            } catch (IOException e2) {
                                ResponseUtil.onRequestError(reactApplicationContext, i, e2.getMessage(), e2);
                            }
                            if (z22 && str.equals(strKd)) {
                                NetworkingModule.this.readWithProgress(i, responseBodyBody);
                                ResponseUtil.onRequestSuccess(reactApplicationContext, i);
                                return;
                            }
                            String strString = "";
                            if (str.equals(strKd)) {
                                try {
                                    strString = responseBodyBody.string();
                                } catch (IOException e3) {
                                    String strMethod = response.request().method();
                                    short sXd2 = (short) (ZN.Xd() ^ 17084);
                                    short sXd3 = (short) (ZN.Xd() ^ 18722);
                                    int[] iArr2 = new int["\u0002\u0010/O".length()];
                                    QB qb2 = new QB("\u0002\u0010/O");
                                    int i32 = 0;
                                    while (qb2.YK()) {
                                        int iKK2 = qb2.KK();
                                        Xu xuXd2 = Xu.Xd(iKK2);
                                        iArr2[i32] = xuXd2.fK(((i32 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                                        i32++;
                                    }
                                    if (!strMethod.equalsIgnoreCase(new String(iArr2, 0, i32))) {
                                        ResponseUtil.onRequestError(reactApplicationContext, i, e3.getMessage(), e3);
                                    }
                                }
                            } else if (str.equals(C1561oA.Xd("\u007f\u007f\u0013\u0006WV", (short) (C1499aX.Xd() ^ (-19925))))) {
                                Object[] objArr = {responseBodyBody.bytes(), 2};
                                Method declaredMethod = Class.forName(Wg.vd("1?2AC>6\u0001MM?C\n\u001f;NE\u0017\u0012", (short) (C1580rY.Xd() ^ (-15684)))).getDeclaredMethod(Qg.kd("ksgrffTnQqndh`", (short) (C1633zX.Xd() ^ (-3634)), (short) (C1633zX.Xd() ^ (-3775))), byte[].class, Integer.TYPE);
                                try {
                                    declaredMethod.setAccessible(true);
                                    strString = (String) declaredMethod.invoke(null, objArr);
                                } catch (InvocationTargetException e4) {
                                    throw e4.getCause();
                                }
                            }
                            ResponseUtil.onDataReceived(reactApplicationContext, i, strString);
                            ResponseUtil.onRequestSuccess(reactApplicationContext, i);
                        } finally {
                            OkCallback.onResponse_exit();
                        }
                    }
                });
            } catch (Exception e2) {
                ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn2, i22, e2.getMessage(), null);
            }
        } catch (IOException e3) {
            ResponseUtil.onRequestError(reactApplicationContextIfActiveOrWarn2, i22, e3.getMessage(), e3);
        }
    }
}
