package com.incode.welcome_sdk;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* JADX INFO: loaded from: classes3.dex */
public interface e {
    @GET("health")
    Observable<ResponseBody> b(@Header("x-api-key") String str, @Header("api-version") String str2);
}
