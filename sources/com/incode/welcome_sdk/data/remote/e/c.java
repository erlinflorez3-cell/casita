package com.incode.welcome_sdk.data.remote.e;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AppsFlyerProperties;
import com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationRequest;
import com.incode.welcome_sdk.data.remote.beans.ResponseFaceAuthentication;
import com.incode.welcome_sdk.data.remote.beans.al;
import com.incode.welcome_sdk.data.remote.beans.f;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.sentry.protocol.Device;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes5.dex */
public interface c {
    @PUT("omni/update")
    Observable<ResponseBody> A(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/add/speech?audioOnly=true")
    Observable<ResponseBody> B(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/add/curp")
    Observable<ResponseBody> C(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/third-party-login")
    Observable<ResponseBody> D(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/nfc/add/nfc-data")
    Observable<ResponseBody> E(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/process/imss")
    Observable<ResponseBody> F(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/watchlist-result")
    Single<ResponseBody> G(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("api/validate/rfc")
    Single<ResponseBody> H(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/videoselfie/compare-ocr/v2")
    Observable<ResponseBody> I(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/decrypt")
    Observable<ResponseBody> J(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/process/government-validation")
    Observable<ResponseBody> K(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/videoselfie/compare-ocr/encrypted")
    Observable<ResponseBody> L(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/get/report")
    Observable<ResponseBody> M(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/videoselfie/compare-back-ocr/v2")
    Observable<ResponseBody> N(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/code/verify")
    Observable<ResponseBody> O(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @PUT
    Single<ResponseBody> P(@Url String str, @Body RequestBody requestBody);

    @POST("omni/consents/submit")
    Observable<ResponseBody> Q(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/add/user-consent")
    Observable<ResponseBody> R(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/verifyFace")
    Observable<ResponseBody> S(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("liveness-stat")
    Observable<ResponseBody> T(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/videoselfie/voiceconsent/add/face")
    Single<ResponseBody> U(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/form-answer/submit")
    Single<ResponseBody> V(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/sign-combined-consent")
    Single<ResponseBody> W(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/process/payment-proof")
    Observable<ResponseBody> a(@Header("X-Incode-Hardware-Id") String str);

    @GET("omni/get/questionAndAnswer")
    Observable<ResponseBody> a(@Header("X-Incode-Hardware-Id") String str, @Query("numberOfQuestions") int i2, @Query("returnVoiceConsentQuestion") boolean z2);

    @GET
    Observable<ResponseBody> a(@Url String str, @Header("X-Incode-Hardware-Id") String str2);

    @POST
    Observable<ResponseBody> a(@Url String str, @Header("X-Incode-Hardware-Id") String str2, @Header("internal_request_id") int i2, @Query("captureType") f fVar, @Query("glare") Integer num, @Body RequestBody requestBody);

    @GET("omni/consents")
    Observable<ResponseBody> a(@Header("X-Incode-Hardware-Id") String str, @Query("regulationType") String str2, @Query(Device.JsonKeys.LANGUAGE) String str3, @Query("type") String str4);

    @POST("omni/log/frame/v2")
    Observable<ResponseBody> a(@Header("X-Incode-Hardware-Id") String str, @Query("source") String str2, @Body RequestBody requestBody);

    @POST("omni/onboarding-authentications/authenticate")
    Single<ResponseFaceAuthentication> a(@Header("X-Incode-Hardware-Id") String str, @Body FaceAuthenticationRequest faceAuthenticationRequest);

    @GET("omni/get/combined-consent")
    Single<ResponseBody> a(@Header("X-Incode-Hardware-Id") String str, @Query("id") String str2, @Query(Device.JsonKeys.LANGUAGE) String str3);

    @POST("omni/recordings/record-start")
    Single<ResponseBody> a(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/get/medical-ocr-data")
    Observable<ResponseBody> b(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/get/watchlist/blacklist-templates")
    Observable<ResponseBody> b(@Header("X-Incode-Hardware-Id") String str, @Query(TypedValues.CycleType.S_WAVE_OFFSET) int i2, @Query("limit") int i3, @Body RequestBody requestBody);

    @GET("omni/send/otp")
    Observable<ResponseBody> b(@Header("X-Incode-Hardware-Id") String str, @Query("communicationchannel") String str2);

    @POST
    Observable<ResponseBody> b(@Url String str, @Header("X-Incode-Hardware-Id") String str2, @Header("internal_request_id") int i2, @Query("captureType") f fVar, @Query("glare") Integer num, @Body RequestBody requestBody);

    @POST("omni/add/document")
    Observable<ResponseBody> b(@Header("X-Incode-Hardware-Id") String str, @Query("type") String str2, @Query("format") String str3, @Query("subtype") String str4, @Body RequestBody requestBody, @Header("internal_request_id") int i2);

    @POST
    Observable<ResponseBody> b(@Url String str, @Header("X-Incode-Hardware-Id") String str2, @Body RequestBody requestBody);

    @POST
    Single<ResponseBody> b(@Url String str, @Query("matchingType") String str2, @Header("X-Incode-Hardware-Id") String str3);

    @POST("omni/authentication/recording/record-start")
    Single<ResponseBody> b(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/start")
    Single<ResponseBody> b(@Body RequestBody requestBody);

    @GET("omni/getRegions")
    Observable<ResponseBody> c();

    @POST("omni/process/watchlist")
    Observable<ResponseBody> c(@Header("X-Incode-Hardware-Id") String str);

    @DELETE("omni/customer")
    Observable<ResponseBody> c(@Header("X-Incode-Hardware-Id") String str, @Query(HintConstants.AUTOFILL_HINT_PHONE) String str2);

    @POST
    Observable<ResponseBody> c(@Url String str, @Header("X-Incode-Hardware-Id") String str2, @Header("internal_request_id") int i2, @Query("captureType") f fVar, @Query("glare") Integer num, @Body RequestBody requestBody);

    @POST("mock-init")
    Observable<ResponseBody> c(@Body RequestBody requestBody);

    @PUT("liveness-stat/{statId}")
    Single<ResponseBody> c(@Header("X-Incode-Hardware-Id") String str, @Path("statId") String str2, @Body RequestBody requestBody);

    @POST("omni/authentication/recording/create-session")
    Single<ResponseBody> c(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/process/address")
    Observable<ResponseBody> d(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/process/approve")
    Observable<ResponseBody> d(@Header("X-Incode-Hardware-Id") String str, @Query("interviewId") String str2);

    @GET("omni/compare/otp")
    Observable<ResponseBody> d(@Header("X-Incode-Hardware-Id") String str, @Query("code") String str2, @Query(AppsFlyerProperties.CHANNEL) String str3);

    @POST("omni/add/document/encrypted")
    Observable<ResponseBody> d(@Header("X-Incode-Hardware-Id") String str, @Query("type") String str2, @Query("format") String str3, @Query("title") String str4, @Body RequestBody requestBody, @Header("internal_request_id") int i2);

    @PUT
    Observable<ResponseBody> d(@Url String str, @Header("X-Incode-Hardware-Id") String str2, @Body RequestBody requestBody);

    @POST("omni/add/face")
    Observable<ResponseBody> d(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody, @Query("captureType") f fVar, @Query("imageType") String str2);

    @POST("omni/1to1/v2/identify")
    Single<ResponseBody> d(@Header("X-Request-Timestamp") long j2, @Body RequestBody requestBody);

    @POST("omni/recordings/record-stop")
    Single<ResponseBody> d(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/validation-archive")
    Observable<ResponseBody> e(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/workflow/search")
    Observable<ResponseBody> e(@Header("X-Incode-Hardware-Id") String str, @Query(TypedValues.CycleType.S_WAVE_OFFSET) int i2, @Query("limit") int i3, @Body RequestBody requestBody);

    @POST("omni/process/face")
    Observable<ResponseBody> e(@Header("X-Incode-Hardware-Id") String str, @Query("imageType") String str2);

    @POST
    Observable<ResponseBody> e(@Url String str, @Header("X-Incode-Hardware-Id") String str2, @Header("internal_request_id") int i2, @Query("captureType") f fVar, @Query("glare") Integer num, @Body RequestBody requestBody);

    @GET("omni/get/face-template")
    Observable<ResponseBody> e(@Header("X-Incode-Hardware-Id") String str, @Query("type") String str2, @Query("origin") String str3, @Query("id") String str4);

    @POST
    Observable<ResponseBody> e(@Url String str, @Header("X-Incode-Hardware-Id") String str2, @Body RequestBody requestBody);

    @POST("omni/add/face")
    Observable<ResponseBody> e(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody, @Query("captureType") f fVar, @Query("recordingId") String str2);

    @POST("omni/oneToN/v2/identify")
    Single<ResponseBody> e(@Header("X-Request-Timestamp") long j2, @Body RequestBody requestBody);

    @POST("omni/recordings/create-session")
    Single<ResponseBody> e(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/get/score")
    Observable<ResponseBody> f(@Header("X-Incode-Hardware-Id") String str);

    @GET("omni/flow/{id}")
    @Deprecated
    Observable<ResponseBody> f(@Header("X-Incode-Hardware-Id") String str, @Path("id") String str2);

    @POST("omni/add/phone")
    Observable<ResponseBody> f(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/get/payment-proof-info")
    Observable<ResponseBody> g(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/session/attachFlow")
    Observable<ResponseBody> g(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/get/events-signature")
    Observable<ResponseBody> h(@Header("X-Incode-Hardware-Id") String str);

    @GET("omni/generateSessionRecordingUploadUrl")
    Single<ResponseBody> h(@Header("X-Incode-Hardware-Id") String str, @Query("type") String str2);

    @POST("omni/authentication/recording/record-stop")
    Single<ResponseBody> h(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/code/generate")
    Observable<ResponseBody> i(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/add/email")
    Observable<ResponseBody> i(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/get/postprocess/isfinished")
    Observable<ResponseBody> j(@Header("X-Incode-Hardware-Id") String str);

    @DELETE("omni/customer")
    Observable<ResponseBody> j(@Header("X-Incode-Hardware-Id") String str, @Query("customerId") String str2);

    @POST("omni/add/name")
    Observable<ResponseBody> j(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/onboarding/flow")
    Observable<ResponseBody> k(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/add/device-fingerprint")
    Single<ResponseBody> k(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/finish-status")
    Observable<ResponseBody> l(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/add/qr-code-text")
    Observable<ResponseBody> l(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/workflow/info")
    Observable<ResponseBody> m(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/add/signature")
    Observable<ResponseBody> m(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/onboarding/flow-indexes")
    Observable<ResponseBody> n(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/add/document-id")
    Observable<ResponseBody> n(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/flow/get-all")
    @Deprecated
    Observable<ResponseBody> o(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/add/geolocation")
    Observable<ResponseBody> o(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/generateVideoSelfieUrl")
    Observable<ResponseBody> p(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/videoselfie/compare-id/encrypted")
    Observable<ResponseBody> p(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/get/id-summary")
    Observable<ResponseBody> q(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/videoselfie/compare-back-id/v2")
    Observable<ResponseBody> q(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @POST("omni/workflow/process/node")
    Observable<ResponseBody> r(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/videoselfie/compare-id/v2")
    Observable<ResponseBody> r(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/workflow/current/node")
    Observable<ResponseBody> s(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/interview-events")
    Observable<Response<ResponseBody>> s(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/process/antifraud")
    Observable<ResponseBody> t(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/interview-events/single")
    Observable<ResponseBody> t(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/get/phone")
    Observable<ResponseBody> u(@Header("X-Incode-Hardware-Id") String str);

    @PUT
    Observable<ResponseBody> u(@Url String str, @Body RequestBody requestBody);

    @POST("omni/externalVerification/ekyb")
    Observable<ResponseBody> v(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/feature-config")
    Single<al> v(@Header("X-Incode-Hardware-Id") String str);

    @PUT("omni/update")
    Observable<ResponseBody> w(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("e2ee/key/v2")
    Single<ResponseBody> w(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/externalVerification/ekyc")
    Observable<ResponseBody> x(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("omni/get/custom-fields")
    Single<ResponseBody> x(@Header("X-Incode-Hardware-Id") String str);

    @POST("omni/external-screen/generateUploadUrl")
    Observable<ResponseBody> y(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);

    @GET("e2ee/key/v2")
    Single<ResponseBody> y(@Header("X-Force-Post") String str);

    @POST("omni/add/curp/v2")
    Observable<ResponseBody> z(@Header("X-Incode-Hardware-Id") String str, @Body RequestBody requestBody);
}
