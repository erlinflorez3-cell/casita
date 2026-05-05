package com.RNFetchBlob;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.util.SparseArray;
import androidx.core.content.FileProvider;
import com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import yg.CX;

/* JADX INFO: loaded from: classes4.dex */
public class RNFetchBlob extends ReactContextBaseJavaModule {
    static ReactApplicationContext RCTContext = null;
    private final OkHttpClient mClient;
    private static LinkedBlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();
    private static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 5000, TimeUnit.MILLISECONDS, taskQueue);
    static LinkedBlockingQueue<Runnable> fsTaskQueue = new LinkedBlockingQueue<>();
    private static ThreadPoolExecutor fsThreadPool = new ThreadPoolExecutor(2, 10, 5000, TimeUnit.MILLISECONDS, taskQueue);
    private static boolean ActionViewVisible = false;
    private static SparseArray<Promise> promiseTable = new SparseArray<>();

    public RNFetchBlob(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        OkHttpClient okHttpClient = OkHttpClientProvider.getOkHttpClient();
        this.mClient = okHttpClient;
        ((CookieJarContainer) okHttpClient.cookieJar()).setCookieJar(new JavaNetCookieJar(new ForwardingCookieHandler(reactApplicationContext)));
        RCTContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new ActivityEventListener() { // from class: com.RNFetchBlob.RNFetchBlob.1
            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i2, int i3, Intent intent) {
                if (i2 == RNFetchBlobConst.GET_CONTENT_INTENT.intValue() && i3 == -1) {
                    ((Promise) RNFetchBlob.promiseTable.get(RNFetchBlobConst.GET_CONTENT_INTENT.intValue())).resolve(intent.getData().toString());
                    RNFetchBlob.promiseTable.remove(RNFetchBlobConst.GET_CONTENT_INTENT.intValue());
                }
            }

            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onNewIntent(Intent intent) {
            }
        });
    }

    @ReactMethod
    public void actionViewIntent(String str, String str2, final Promise promise) throws Exception {
        try {
            Intent dataAndType = new Intent("android.intent.action.VIEW").setDataAndType(FileProvider.getUriForFile(getCurrentActivity(), getReactApplicationContext().getPackageName() + ".provider", new File(str)), str2);
            dataAndType.setFlags(1);
            dataAndType.addFlags(268435456);
            if (dataAndType.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                CX.ud();
                reactApplicationContext.startActivity(dataAndType);
            }
            ActionViewVisible = true;
            RCTContext.addLifecycleEventListener(new LifecycleEventListener() { // from class: com.RNFetchBlob.RNFetchBlob.4
                @Override // com.facebook.react.bridge.LifecycleEventListener
                public void onHostDestroy() {
                }

                @Override // com.facebook.react.bridge.LifecycleEventListener
                public void onHostPause() {
                }

                @Override // com.facebook.react.bridge.LifecycleEventListener
                public void onHostResume() {
                    if (RNFetchBlob.ActionViewVisible) {
                        promise.resolve(null);
                    }
                    RNFetchBlob.RCTContext.removeLifecycleEventListener(this);
                }
            });
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void addCompleteDownload(ReadableMap readableMap, Promise promise) {
        DownloadManager downloadManager = (DownloadManager) RCTContext.getSystemService("download");
        if (readableMap == null || !readableMap.hasKey("path")) {
            promise.reject("EINVAL", "RNFetchblob.addCompleteDownload config or path missing.");
            return;
        }
        String strNormalizePath = RNFetchBlobFS.normalizePath(readableMap.getString("path"));
        if (strNormalizePath == null) {
            promise.reject("EINVAL", "RNFetchblob.addCompleteDownload can not resolve URI:" + readableMap.getString("path"));
            return;
        }
        try {
            downloadManager.addCompletedDownload(readableMap.hasKey("title") ? readableMap.getString("title") : "", readableMap.hasKey("description") ? readableMap.getString("description") : "", true, readableMap.hasKey("mime") ? readableMap.getString("mime") : null, strNormalizePath, Long.valueOf(RNFetchBlobFS.statFile(strNormalizePath).getString(RRWebVideoEvent.JsonKeys.SIZE)).longValue(), readableMap.hasKey("showNotification") && readableMap.getBoolean("showNotification"));
            promise.resolve(null);
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void cancelRequest(String str, Callback callback) throws Throwable {
        try {
            RNFetchBlobReq.cancelTask(str);
            callback.invoke(null, str);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage(), null);
        }
    }

    @ReactMethod
    public void closeStream(String str, Callback callback) {
        RNFetchBlobFS.closeStream(str, callback);
    }

    @ReactMethod
    public void cp(final String str, final String str2, final Callback callback) {
        threadPool.execute(new Runnable() { // from class: com.RNFetchBlob.RNFetchBlob.5
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                RNFetchBlobFS.cp(str, str2, callback);
            }
        });
    }

    @ReactMethod
    public void createFile(final String str, final String str2, final String str3, final Promise promise) {
        threadPool.execute(new Runnable() { // from class: com.RNFetchBlob.RNFetchBlob.2
            @Override // java.lang.Runnable
            public void run() {
                RNFetchBlobFS.createFile(str, str2, str3, promise);
            }
        });
    }

    @ReactMethod
    public void createFileASCII(final String str, final ReadableArray readableArray, final Promise promise) {
        threadPool.execute(new Runnable() { // from class: com.RNFetchBlob.RNFetchBlob.3
            @Override // java.lang.Runnable
            public void run() {
                RNFetchBlobFS.createFileASCII(str, readableArray, promise);
            }
        });
    }

    @ReactMethod
    public void df(final Callback callback) {
        fsThreadPool.execute(new Runnable() { // from class: com.RNFetchBlob.RNFetchBlob.12
            @Override // java.lang.Runnable
            public void run() {
                RNFetchBlobFS.df(callback);
            }
        });
    }

    @ReactMethod
    public void enableProgressReport(String str, int i2, int i3) {
        RNFetchBlobReq.progressReport.put(str, new RNFetchBlobProgressConfig(true, i2, i3, RNFetchBlobProgressConfig.ReportType.Download));
    }

    @ReactMethod
    public void enableUploadProgressReport(String str, int i2, int i3) {
        RNFetchBlobReq.uploadProgressReport.put(str, new RNFetchBlobProgressConfig(true, i2, i3, RNFetchBlobProgressConfig.ReportType.Upload));
    }

    @ReactMethod
    public void exists(String str, Callback callback) {
        RNFetchBlobFS.exists(str, callback);
    }

    @ReactMethod
    public void fetchBlob(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) throws Throwable {
        new RNFetchBlobReq(readableMap, str, str2, str3, readableMap2, str4, null, this.mClient, callback).run();
    }

    @ReactMethod
    public void fetchBlobForm(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) throws Throwable {
        new RNFetchBlobReq(readableMap, str, str2, str3, readableMap2, null, readableArray, this.mClient, callback).run();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return RNFetchBlobFS.getSystemfolders(getReactApplicationContext());
    }

    @ReactMethod
    public void getContentIntent(String str, Promise promise) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (str != null) {
            intent.setType(str);
        } else {
            intent.setType("*/*");
        }
        promiseTable.put(RNFetchBlobConst.GET_CONTENT_INTENT.intValue(), promise);
        getReactApplicationContext().startActivityForResult(intent, RNFetchBlobConst.GET_CONTENT_INTENT.intValue(), null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNFetchBlob";
    }

    @ReactMethod
    public void getSDCardApplicationDir(Promise promise) {
        RNFetchBlobFS.getSDCardApplicationDir(getReactApplicationContext(), promise);
    }

    @ReactMethod
    public void getSDCardDir(Promise promise) {
        RNFetchBlobFS.getSDCardDir(promise);
    }

    @ReactMethod
    public void hash(final String str, final String str2, final Promise promise) {
        threadPool.execute(new Runnable() { // from class: com.RNFetchBlob.RNFetchBlob.10
            @Override // java.lang.Runnable
            public void run() {
                RNFetchBlobFS.hash(str, str2, promise);
            }
        });
    }

    @ReactMethod
    public void ls(String str, Promise promise) {
        RNFetchBlobFS.ls(str, promise);
    }

    @ReactMethod
    public void lstat(String str, Callback callback) {
        RNFetchBlobFS.lstat(str, callback);
    }

    @ReactMethod
    public void mkdir(String str, Promise promise) {
        RNFetchBlobFS.mkdir(str, promise);
    }

    @ReactMethod
    public void mv(String str, String str2, Callback callback) {
        RNFetchBlobFS.mv(str, str2, callback);
    }

    @ReactMethod
    public void readFile(final String str, final String str2, final Promise promise) {
        threadPool.execute(new Runnable() { // from class: com.RNFetchBlob.RNFetchBlob.6
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                RNFetchBlobFS.readFile(str, str2, promise);
            }
        });
    }

    @ReactMethod
    public void readStream(final String str, final String str2, final int i2, final int i3, final String str3) {
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        fsThreadPool.execute(new Runnable() { // from class: com.RNFetchBlob.RNFetchBlob.11
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                new RNFetchBlobFS(reactApplicationContext).readStream(str, str2, i2, i3, str3);
            }
        });
    }

    @ReactMethod
    public void removeSession(ReadableArray readableArray, Callback callback) {
        RNFetchBlobFS.removeSession(readableArray, callback);
    }

    @ReactMethod
    public void scanFile(final ReadableArray readableArray, final Callback callback) {
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        threadPool.execute(new Runnable() { // from class: com.RNFetchBlob.RNFetchBlob.9
            @Override // java.lang.Runnable
            public void run() {
                int size = readableArray.size();
                String[] strArr = new String[size];
                String[] strArr2 = new String[size];
                for (int i2 = 0; i2 < size; i2++) {
                    ReadableMap map = readableArray.getMap(i2);
                    if (map.hasKey("path")) {
                        strArr[i2] = map.getString("path");
                        if (map.hasKey("mime")) {
                            strArr2[i2] = map.getString("mime");
                        } else {
                            strArr2[i2] = null;
                        }
                    }
                }
                new RNFetchBlobFS(reactApplicationContext).scanFile(strArr, strArr2, callback);
            }
        });
    }

    @ReactMethod
    public void slice(String str, String str2, int i2, int i3, Promise promise) {
        RNFetchBlobFS.slice(str, str2, i2, i3, "", promise);
    }

    @ReactMethod
    public void stat(String str, Callback callback) {
        RNFetchBlobFS.stat(str, callback);
    }

    @ReactMethod
    public void unlink(String str, Callback callback) {
        RNFetchBlobFS.unlink(str, callback);
    }

    @ReactMethod
    public void writeArrayChunk(String str, ReadableArray readableArray, Callback callback) {
        RNFetchBlobFS.writeArrayChunk(str, readableArray, callback);
    }

    @ReactMethod
    public void writeChunk(String str, String str2, Callback callback) {
        RNFetchBlobFS.writeChunk(str, str2, callback);
    }

    @ReactMethod
    public void writeFile(final String str, final String str2, final String str3, final boolean z2, final Promise promise) {
        threadPool.execute(new Runnable() { // from class: com.RNFetchBlob.RNFetchBlob.8
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                RNFetchBlobFS.writeFile(str, str2, str3, z2, promise);
            }
        });
    }

    @ReactMethod
    public void writeFileArray(final String str, final ReadableArray readableArray, final boolean z2, final Promise promise) {
        threadPool.execute(new Runnable() { // from class: com.RNFetchBlob.RNFetchBlob.7
            @Override // java.lang.Runnable
            public void run() {
                RNFetchBlobFS.writeFile(str, readableArray, z2, promise);
            }
        });
    }

    @ReactMethod
    public void writeStream(String str, String str2, boolean z2, Callback callback) {
        new RNFetchBlobFS(getReactApplicationContext()).writeStream(str, str2, z2, callback);
    }
}
