package com.incode.welcome_sdk.data.remote.e;

import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    @GET("omni/es/documents/unsigned")
    Object b(@Header("X-Incode-Hardware-Id") String str, Continuation<? super ResponseBody> continuation);

    @POST("omni/es/process/signQes")
    Object b(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody, Continuation<? super ResponseBody> continuation);

    @GET("omni/es/documents/signed")
    Object c(@Header("X-Incode-Hardware-Id") String str, Continuation<? super ResponseBody> continuation);

    @POST("omni/es/process/sign")
    Object c(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody, Continuation<? super ResponseBody> continuation);

    @POST("omni/start")
    Object c(@Body RequestBody requestBody, Continuation<? super ResponseBody> continuation);

    @POST("omni/es/generateDocumentUploadUrl")
    Object e(@Header("X-Incode-Hardware-Id") String str, Continuation<? super ResponseBody> continuation);
}
