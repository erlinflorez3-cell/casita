package com.facebook.react.devsupport;

import com.biocatch.client.android.sdk.core.Constants;
import com.dynatrace.android.callback.OkCallback;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.common.DebugServerException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.MultipartStreamReader;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class BundleDownloader {
    private static final int FILES_CHANGED_COUNT_NOT_BUILT_BY_BUNDLER = -2;
    private static final String TAG = "BundleDownloader";
    private final OkHttpClient mClient;
    private Call mDownloadBundleFromURLCall;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.BundleDownloader$1 */
    class AnonymousClass1 implements Callback {
        final /* synthetic */ BundleInfo val$bundleInfo;
        final /* synthetic */ DevBundleDownloadListener val$callback;
        final /* synthetic */ File val$outputFile;

        AnonymousClass1(DevBundleDownloadListener devBundleDownloadListener, File file, BundleInfo bundleInfo) {
            devBundleDownloadListener = devBundleDownloadListener;
            file = file;
            bundleInfo = bundleInfo;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            OkCallback.onFailure_enter(call, iOException);
            try {
                if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.isCanceled()) {
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    return;
                }
                BundleDownloader.this.mDownloadBundleFromURLCall = null;
                String string = call.request().url().toString();
                devBundleDownloadListener.onFailure(DebugServerException.makeGeneric(string, "Could not connect to development server.", "URL: " + string, iOException));
            } finally {
                OkCallback.onFailure_exit();
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            OkCallback.onResponse_enter(call, response);
            try {
                try {
                    if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.isCanceled()) {
                        BundleDownloader.this.mDownloadBundleFromURLCall = null;
                        if (response != null) {
                            response.close();
                        }
                        return;
                    }
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    String string = response.request().url().toString();
                    Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(response.header("content-type"));
                    if (matcher.find()) {
                        BundleDownloader.this.processMultipartResponse(string, response, matcher.group(1), file, bundleInfo, devBundleDownloadListener);
                    } else {
                        ResponseBody responseBodyBody = response.body();
                        try {
                            BundleDownloader.this.processBundleResult(string, response.code(), response.headers(), response.body().source(), file, bundleInfo, devBundleDownloadListener);
                            if (responseBodyBody != null) {
                                responseBodyBody.close();
                            }
                        } finally {
                        }
                    }
                    if (response != null) {
                        response.close();
                    }
                    return;
                } finally {
                    OkCallback.onResponse_exit();
                }
                OkCallback.onResponse_exit();
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.BundleDownloader$2 */
    class AnonymousClass2 implements MultipartStreamReader.ChunkListener {
        final /* synthetic */ BundleInfo val$bundleInfo;
        final /* synthetic */ DevBundleDownloadListener val$callback;
        final /* synthetic */ File val$outputFile;
        final /* synthetic */ Response val$response;
        final /* synthetic */ String val$url;

        AnonymousClass2(Response response, String str, File file, BundleInfo bundleInfo, DevBundleDownloadListener devBundleDownloadListener) {
            response = response;
            str = str;
            file = file;
            bundleInfo = bundleInfo;
            devBundleDownloadListener = devBundleDownloadListener;
        }

        @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
        public void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z2) throws IOException {
            if (z2) {
                int iCode = response.code();
                if (map.containsKey("X-Http-Status")) {
                    iCode = Integer.parseInt(map.get("X-Http-Status"));
                }
                BundleDownloader.this.processBundleResult(str, iCode, Headers.of(map), buffer, file, bundleInfo, devBundleDownloadListener);
                return;
            }
            if (map.containsKey("Content-Type") && map.get("Content-Type").equals(Constants.WUP_CONTENT_TYPE)) {
                try {
                    JSONObject jSONObject = new JSONObject(buffer.readUtf8());
                    devBundleDownloadListener.onProgress(jSONObject.has("status") ? jSONObject.getString("status") : "Bundling", jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null);
                } catch (JSONException e2) {
                    FLog.e(ReactConstants.TAG, "Error parsing progress JSON. " + e2.toString());
                }
            }
        }

        @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
        public void onChunkProgress(Map<String, String> map, long j2, long j3) {
            if ("application/javascript".equals(map.get("Content-Type"))) {
                devBundleDownloadListener.onProgress("Downloading", Integer.valueOf((int) (j2 / 1024)), Integer.valueOf((int) (j3 / 1024)));
            }
        }
    }

    public static class BundleInfo {
        private int mFilesChangedCount;
        private String mUrl;

        public static BundleInfo fromJSONString(String str) {
            if (str == null) {
                return null;
            }
            BundleInfo bundleInfo = new BundleInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                bundleInfo.mUrl = jSONObject.getString("url");
                bundleInfo.mFilesChangedCount = jSONObject.getInt("filesChangedCount");
                return bundleInfo;
            } catch (JSONException e2) {
                FLog.e(BundleDownloader.TAG, "Invalid bundle info: ", e2);
                return null;
            }
        }

        public int getFilesChangedCount() {
            return this.mFilesChangedCount;
        }

        public String getUrl() {
            String str = this.mUrl;
            return str != null ? str : "unknown";
        }

        public String toJSONString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", this.mUrl);
                jSONObject.put("filesChangedCount", this.mFilesChangedCount);
                return jSONObject.toString();
            } catch (JSONException e2) {
                FLog.e(BundleDownloader.TAG, "Can't serialize bundle info: ", e2);
                return null;
            }
        }
    }

    public BundleDownloader(OkHttpClient okHttpClient) {
        this.mClient = okHttpClient;
    }

    private static void populateBundleInfo(String str, Headers headers, BundleInfo bundleInfo) {
        bundleInfo.mUrl = str;
        String str2 = headers.get("X-Metro-Files-Changed-Count");
        if (str2 != null) {
            try {
                bundleInfo.mFilesChangedCount = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                bundleInfo.mFilesChangedCount = -2;
            }
        }
    }

    public void processBundleResult(String str, int i2, Headers headers, BufferedSource bufferedSource, File file, BundleInfo bundleInfo, DevBundleDownloadListener devBundleDownloadListener) throws IOException {
        if (i2 == 200) {
            if (bundleInfo != null) {
                populateBundleInfo(str, headers, bundleInfo);
            }
            File file2 = new File(file.getPath() + DefaultDiskStorage.FileType.TEMP);
            if (storePlainJSInFile(bufferedSource, file2) && !file2.renameTo(file)) {
                throw new IOException("Couldn't rename " + file2 + " to " + file);
            }
            devBundleDownloadListener.onSuccess();
            return;
        }
        String utf8 = bufferedSource.readUtf8();
        DebugServerException debugServerException = DebugServerException.parse(str, utf8);
        if (debugServerException != null) {
            devBundleDownloadListener.onFailure(debugServerException);
            return;
        }
        StringBuilder sb = new StringBuilder("The development server returned response error code: ");
        sb.append(i2).append("\n\nURL: ").append(str).append("\n\nBody:\n").append(utf8);
        devBundleDownloadListener.onFailure(new DebugServerException(sb.toString()));
    }

    public void processMultipartResponse(String str, Response response, String str2, File file, BundleInfo bundleInfo, DevBundleDownloadListener devBundleDownloadListener) throws IOException {
        if (new MultipartStreamReader(response.body().source(), str2).readAllParts(new MultipartStreamReader.ChunkListener() { // from class: com.facebook.react.devsupport.BundleDownloader.2
            final /* synthetic */ BundleInfo val$bundleInfo;
            final /* synthetic */ DevBundleDownloadListener val$callback;
            final /* synthetic */ File val$outputFile;
            final /* synthetic */ Response val$response;
            final /* synthetic */ String val$url;

            AnonymousClass2(Response response2, String str3, File file2, BundleInfo bundleInfo2, DevBundleDownloadListener devBundleDownloadListener2) {
                response = response2;
                str = str3;
                file = file2;
                bundleInfo = bundleInfo2;
                devBundleDownloadListener = devBundleDownloadListener2;
            }

            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkComplete(Map<String, String> map, Buffer buffer, boolean z2) throws IOException {
                if (z2) {
                    int iCode = response.code();
                    if (map.containsKey("X-Http-Status")) {
                        iCode = Integer.parseInt(map.get("X-Http-Status"));
                    }
                    BundleDownloader.this.processBundleResult(str, iCode, Headers.of(map), buffer, file, bundleInfo, devBundleDownloadListener);
                    return;
                }
                if (map.containsKey("Content-Type") && map.get("Content-Type").equals(Constants.WUP_CONTENT_TYPE)) {
                    try {
                        JSONObject jSONObject = new JSONObject(buffer.readUtf8());
                        devBundleDownloadListener.onProgress(jSONObject.has("status") ? jSONObject.getString("status") : "Bundling", jSONObject.has("done") ? Integer.valueOf(jSONObject.getInt("done")) : null, jSONObject.has("total") ? Integer.valueOf(jSONObject.getInt("total")) : null);
                    } catch (JSONException e2) {
                        FLog.e(ReactConstants.TAG, "Error parsing progress JSON. " + e2.toString());
                    }
                }
            }

            @Override // com.facebook.react.devsupport.MultipartStreamReader.ChunkListener
            public void onChunkProgress(Map<String, String> map, long j2, long j3) {
                if ("application/javascript".equals(map.get("Content-Type"))) {
                    devBundleDownloadListener.onProgress("Downloading", Integer.valueOf((int) (j2 / 1024)), Integer.valueOf((int) (j3 / 1024)));
                }
            }
        })) {
            return;
        }
        devBundleDownloadListener2.onFailure(new DebugServerException("Error while reading multipart response.\n\nResponse code: " + response2.code() + "\n\nURL: " + str3.toString() + "\n\n"));
    }

    private static boolean storePlainJSInFile(BufferedSource bufferedSource, File file) throws Throwable {
        Sink sink;
        try {
            sink = Okio.sink(file);
        } catch (Throwable th) {
            th = th;
            sink = null;
        }
        try {
            bufferedSource.readAll(sink);
            if (sink == null) {
                return true;
            }
            sink.close();
            return true;
        } catch (Throwable th2) {
            th = th2;
            if (sink != null) {
                sink.close();
            }
            throw th;
        }
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleInfo bundleInfo) {
        downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, new Request.Builder());
    }

    public void downloadBundleFromURL(DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleInfo bundleInfo, Request.Builder builder) {
        Call call = (Call) Assertions.assertNotNull(this.mClient.newCall(builder.url(str).addHeader("Accept", "multipart/mixed").build()));
        this.mDownloadBundleFromURLCall = call;
        OkCallback.enqueue(call, new Callback() { // from class: com.facebook.react.devsupport.BundleDownloader.1
            final /* synthetic */ BundleInfo val$bundleInfo;
            final /* synthetic */ DevBundleDownloadListener val$callback;
            final /* synthetic */ File val$outputFile;

            AnonymousClass1(DevBundleDownloadListener devBundleDownloadListener2, File file2, BundleInfo bundleInfo2) {
                devBundleDownloadListener = devBundleDownloadListener2;
                file = file2;
                bundleInfo = bundleInfo2;
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call2, IOException iOException) {
                OkCallback.onFailure_enter(call2, iOException);
                try {
                    if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.isCanceled()) {
                        BundleDownloader.this.mDownloadBundleFromURLCall = null;
                        return;
                    }
                    BundleDownloader.this.mDownloadBundleFromURLCall = null;
                    String string = call2.request().url().toString();
                    devBundleDownloadListener.onFailure(DebugServerException.makeGeneric(string, "Could not connect to development server.", "URL: " + string, iOException));
                } finally {
                    OkCallback.onFailure_exit();
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call2, Response response) throws IOException {
                OkCallback.onResponse_enter(call2, response);
                try {
                    try {
                        if (BundleDownloader.this.mDownloadBundleFromURLCall == null || BundleDownloader.this.mDownloadBundleFromURLCall.isCanceled()) {
                            BundleDownloader.this.mDownloadBundleFromURLCall = null;
                            if (response != null) {
                                response.close();
                            }
                            return;
                        }
                        BundleDownloader.this.mDownloadBundleFromURLCall = null;
                        String string = response.request().url().toString();
                        Matcher matcher = Pattern.compile("multipart/mixed;.*boundary=\"([^\"]+)\"").matcher(response.header("content-type"));
                        if (matcher.find()) {
                            BundleDownloader.this.processMultipartResponse(string, response, matcher.group(1), file, bundleInfo, devBundleDownloadListener);
                        } else {
                            ResponseBody responseBodyBody = response.body();
                            try {
                                BundleDownloader.this.processBundleResult(string, response.code(), response.headers(), response.body().source(), file, bundleInfo, devBundleDownloadListener);
                                if (responseBodyBody != null) {
                                    responseBodyBody.close();
                                }
                            } finally {
                            }
                        }
                        if (response != null) {
                            response.close();
                        }
                        return;
                    } finally {
                        OkCallback.onResponse_exit();
                    }
                    OkCallback.onResponse_exit();
                } finally {
                }
            }
        });
    }
}
