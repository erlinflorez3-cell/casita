package com.facebook.react.devsupport.inspector;

import com.dynatrace.android.callback.OkCallback;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public class InspectorNetworkHelper {
    private static OkHttpClient client = null;

    private InspectorNetworkHelper() {
    }

    public static void loadNetworkResource(String str, final InspectorNetworkRequestListener inspectorNetworkRequestListener) {
        if (client == null) {
            client = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
        }
        try {
            OkCallback.enqueue(client.newCall(new Request.Builder().url(str).build()), new Callback() { // from class: com.facebook.react.devsupport.inspector.InspectorNetworkHelper.1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    OkCallback.onFailure_enter(call, iOException);
                    try {
                        if (call.isCanceled()) {
                            return;
                        }
                        inspectorNetworkRequestListener.onError(iOException.getMessage());
                    } finally {
                        OkCallback.onFailure_exit();
                    }
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    OkCallback.onResponse_enter(call, response);
                    try {
                        Headers headers = response.headers();
                        HashMap map = new HashMap();
                        for (String str2 : headers.names()) {
                            map.put(str2, headers.get(str2));
                        }
                        inspectorNetworkRequestListener.onHeaders(response.code(), map);
                        try {
                            ResponseBody responseBodyBody = response.body();
                            if (responseBodyBody != null) {
                                try {
                                    InputStream inputStreamByteStream = responseBodyBody.byteStream();
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        try {
                                            int i2 = inputStreamByteStream.read(bArr);
                                            if (i2 == -1) {
                                                break;
                                            }
                                            inspectorNetworkRequestListener.onData(new String(bArr, 0, i2));
                                        } finally {
                                            inputStreamByteStream.close();
                                        }
                                    }
                                } catch (Throwable th) {
                                    if (responseBodyBody != null) {
                                        try {
                                            responseBodyBody.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            inspectorNetworkRequestListener.onCompletion();
                            if (responseBodyBody != null) {
                                responseBodyBody.close();
                            }
                        } catch (IOException e2) {
                            inspectorNetworkRequestListener.onError(e2.getMessage());
                        }
                    } finally {
                        OkCallback.onResponse_exit();
                    }
                }
            });
        } catch (IllegalArgumentException unused) {
            inspectorNetworkRequestListener.onError("Not a valid URL: " + str);
        }
    }
}
