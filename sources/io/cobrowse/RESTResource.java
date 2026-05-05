package io.cobrowse;

import cz.msebera.android.httpclient.client.methods.HttpPost;
import io.cobrowse.JSONRequest;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
abstract class RESTResource<T> {
    HashMap<String, String> headers = new HashMap<>();
    Map<String, Object> resource;

    RESTResource() {
    }

    private void request(String str, Map<String, Object> map, final Callback<Error, T> callback) {
        new JSONRequest(new Callback() { // from class: io.cobrowse.RESTResource$$ExternalSyntheticLambda0
            @Override // io.cobrowse.Callback
            public final void call(Error error, Object obj) {
                this.f$0.m8830lambda$request$0$iocobrowseRESTResource(callback, this, error, (JSONObject) obj);
            }
        }).execute(new JSONRequest.Params(url(), str, ObjectMapper.toJSONObject(map), headers()));
    }

    void create(Map<String, Object> map, Callback<Error, T> callback) {
        request(HttpPost.METHOD_NAME, map, callback);
    }

    void delete(Callback<Error, T> callback) {
        request("DELETE", null, callback);
    }

    public void fetch(Callback<Error, T> callback) {
        request("GET", null, callback);
    }

    <S> S field(String str, Class<S> cls) {
        Map<String, Object> map = this.resource;
        if (map == null) {
            return null;
        }
        return (S) TypeUtils.check(map.get(str), cls, null);
    }

    <S> S field(String str, Class<S> cls, S s2) {
        S s3 = (S) field(str, cls);
        return s3 == null ? s2 : s3;
    }

    protected HashMap<String, String> headers() {
        HashMap<String, String> map = new HashMap<>(CobrowseIO.headers());
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    /* JADX INFO: renamed from: lambda$request$0$io-cobrowse-RESTResource */
    /* synthetic */ void m8830lambda$request$0$iocobrowseRESTResource(Callback callback, Object obj, Error error, JSONObject jSONObject) {
        if (error != null) {
            ThreadUtils.invoke(callback, error, null);
            return;
        }
        if (jSONObject != null) {
            updateResource(ObjectMapper.toMap(jSONObject));
        }
        ThreadUtils.invoke(callback, null, obj);
    }

    void reset() {
        this.resource = null;
    }

    protected void setHeader(String str, String str2) {
        this.headers.put(str, str2);
    }

    void update(Map<String, Object> map, Callback<Error, T> callback) {
        request("PUT", map, callback);
    }

    void updateResource(Map<String, Object> map) {
        this.resource = map;
    }

    abstract HttpUrl url();
}
