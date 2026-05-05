package io.cobrowse;

import android.util.Pair;
import java.util.HashMap;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class JSONRequest {
    private Callback<Error, JSONObject> callback;

    public static class Params {
        private final JSONObject body;
        private final HashMap<String, String> headers;
        private final String method;
        private final HttpUrl url;

        public Params(HttpUrl httpUrl, String str, HashMap<String, String> map) {
            this(httpUrl, str, null, map);
        }

        public Params(HttpUrl httpUrl, String str, JSONObject jSONObject, HashMap<String, String> map) {
            this.url = httpUrl;
            this.method = str;
            this.body = jSONObject;
            this.headers = new HashMap<>(map);
        }
    }

    JSONRequest(Callback<Error, JSONObject> callback) {
        this.callback = callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.util.Pair<java.lang.Error, org.json.JSONObject> doInBackground(io.cobrowse.JSONRequest.Params r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.cobrowse.JSONRequest.doInBackground(io.cobrowse.JSONRequest$Params):android.util.Pair");
    }

    public void execute(final Params params) {
        JSONRequestExecutor.reuse().execute(new Runnable() { // from class: io.cobrowse.JSONRequest$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m8829lambda$execute$0$iocobrowseJSONRequest(params);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$execute$0$io-cobrowse-JSONRequest, reason: not valid java name */
    /* synthetic */ void m8829lambda$execute$0$iocobrowseJSONRequest(Params params) throws Throwable {
        Pair<Error, JSONObject> pairDoInBackground = doInBackground(params);
        Callback<Error, JSONObject> callback = this.callback;
        if (callback != null) {
            ThreadUtils.invoke(callback, (Error) pairDoInBackground.first, (JSONObject) pairDoInBackground.second);
        }
    }
}
