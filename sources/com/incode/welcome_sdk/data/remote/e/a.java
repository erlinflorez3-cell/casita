package com.incode.welcome_sdk.data.remote.e;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes5.dex */
public interface a {
    @GET("omni/get/interviewer-info")
    Observable<ResponseBody> d(@Header("X-Incode-Hardware-Id") String str);

    @GET("omni/queue/conference/index")
    Observable<ResponseBody> d(@Header("X-Incode-Hardware-Id") String str, @Query("queueName") String str2);

    @PUT("omni/queue/conference/add")
    Observable<ResponseBody> e(@Header("X-Incode-Hardware-Id") String str, @Query("queueName") String str2, @Body RequestBody requestBody);
}
