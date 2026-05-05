package com.ticnow.sdk.idnowonboarding.services.reintents;

import android.app.Activity;
import android.content.Context;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.biocatch.client.android.sdk.core.Constants;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.ticnow.sdk.idnowonboarding.model.api.IDReintentServicesImpl;
import com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices;
import com.ticnow.sdk.idnowonboarding.services.reintents.reintentsCallbacks.GetEnrollmentReintenNewsCallback;
import com.ticnow.sdk.idnowonboarding.services.reintents.reintentsCallbacks.UpdateEnrollmentReintenNewsCallback;
import com.ticnow.sdk.idnowonboarding.services.reintents.reintentsParser.ReintentsServicesReponseParser;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseParser;
import com.ticnow.sdk.idnowsecurity.http.paths.IDEndPoints;
import com.ticnow.sdk.idnowsecurity.http.response.IdNowCommonResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class IDReintentServices {

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices$1 */
    class AnonymousClass1 implements Response.Listener<String> {
        AnonymousClass1() {
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(String str) {
            new IDSecurityApiImpl();
            IdNowCommonResponse enrollmentReintentNewsResponse = ReintentsServicesReponseParser.getEnrollmentReintentNewsResponse(str);
            getEnrollmentReintenNewsCallback.onGetEnrollmentReintenNewsResponse(enrollmentReintentNewsResponse, IDEnrollmentResponseParser.processResponseCode(enrollmentReintentNewsResponse.getCode()));
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices$2 */
    class AnonymousClass2 implements Response.ErrorListener {
        AnonymousClass2() {
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            getEnrollmentReintenNewsCallback.onGetEnrollmentReintenNewsResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices$3 */
    class AnonymousClass3 extends StringRequest {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Context val$context;
        final /* synthetic */ String val$mRequestBody;
        final /* synthetic */ IDReintentServicesImpl.GenerateGetEnrollmentReintentNewsResult val$request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i2, String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, Context context, Activity activity, IDReintentServicesImpl.GenerateGetEnrollmentReintentNewsResult generateGetEnrollmentReintentNewsResult) {
            super(i2, str, listener, errorListener);
            str = str2;
            context = context;
            activity = activity;
            generateGetEnrollmentReintentNewsResult = generateGetEnrollmentReintentNewsResult;
        }

        @Override // com.android.volley.Request
        public byte[] getBody() {
            return str.getBytes(StandardCharsets.UTF_8);
        }

        @Override // com.android.volley.Request
        public String getBodyContentType() {
            return "application/json; charset=utf-8";
        }

        @Override // com.android.volley.Request
        public Map<String, String> getHeaders() {
            HashMap map = new HashMap();
            new IDSecurityApiImpl().getIdNowCredentials(context, activity);
            map.put("Content-Type", Constants.WUP_CONTENT_TYPE);
            for (int i2 = 0; i2 < generateGetEnrollmentReintentNewsResult.getHeaders().size(); i2++) {
                map.put(generateGetEnrollmentReintentNewsResult.getHeaders().get(i2).getKey(), generateGetEnrollmentReintentNewsResult.getHeaders().get(i2).getValue());
            }
            return map;
        }

        @Override // com.android.volley.toolbox.StringRequest, com.android.volley.Request
        protected Response<String> parseNetworkResponse(NetworkResponse networkResponse) {
            try {
                return Response.success(new JSONObject(new String(networkResponse.data, StandardCharsets.UTF_8)).toString(), HttpHeaderParser.parseCacheHeaders(networkResponse));
            } catch (Throwable th) {
                return Response.error(new ParseError(th));
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices$4 */
    class AnonymousClass4 implements Response.Listener<String> {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ UpdateEnrollmentReintenNewsCallback val$callback;
        final /* synthetic */ Context val$context;

        AnonymousClass4(Context context, Activity activity, UpdateEnrollmentReintenNewsCallback updateEnrollmentReintenNewsCallback) {
            context = context;
            activity = activity;
            updateEnrollmentReintenNewsCallback = updateEnrollmentReintenNewsCallback;
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(String str) {
            new IDSecurityApiImpl();
            IdNowCommonResponse enrollmentReintentNewsResponse = ReintentsServicesReponseParser.getEnrollmentReintentNewsResponse(IDEnrollmentServices.deResponse(str, false, context, activity));
            updateEnrollmentReintenNewsCallback.onUpdateEnrollmentReintenNewsResponse(enrollmentReintentNewsResponse, IDEnrollmentResponseParser.processResponseCode(enrollmentReintentNewsResponse.getCode()));
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices$5 */
    class AnonymousClass5 implements Response.ErrorListener {
        AnonymousClass5() {
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            updateEnrollmentReintenNewsCallback.onUpdateEnrollmentReintenNewsResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices$6 */
    class AnonymousClass6 extends StringRequest {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Context val$context;
        final /* synthetic */ String val$mRequestBody;
        final /* synthetic */ IDReintentServicesImpl.GenerateUpdateEnrollmentReintentNewsResult val$request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(int i2, String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, Context context, Activity activity, IDReintentServicesImpl.GenerateUpdateEnrollmentReintentNewsResult generateUpdateEnrollmentReintentNewsResult) {
            super(i2, str, listener, errorListener);
            str = str2;
            context = context;
            activity = activity;
            generateUpdateEnrollmentReintentNewsResult = generateUpdateEnrollmentReintentNewsResult;
        }

        @Override // com.android.volley.Request
        public byte[] getBody() {
            return str.getBytes(StandardCharsets.UTF_8);
        }

        @Override // com.android.volley.Request
        public String getBodyContentType() {
            return "application/json; charset=utf-8";
        }

        @Override // com.android.volley.Request
        public Map<String, String> getHeaders() {
            HashMap map = new HashMap();
            new IDSecurityApiImpl().getIdNowCredentials(context, activity);
            map.put("Content-Type", Constants.WUP_CONTENT_TYPE);
            for (int i2 = 0; i2 < generateUpdateEnrollmentReintentNewsResult.getHeaders().size(); i2++) {
                map.put(generateUpdateEnrollmentReintentNewsResult.getHeaders().get(i2).getKey(), generateUpdateEnrollmentReintentNewsResult.getHeaders().get(i2).getValue());
            }
            return map;
        }

        @Override // com.android.volley.toolbox.StringRequest, com.android.volley.Request
        protected Response<String> parseNetworkResponse(NetworkResponse networkResponse) {
            try {
                return Response.success(new JSONObject(new String(networkResponse.data, StandardCharsets.UTF_8)).toString(), HttpHeaderParser.parseCacheHeaders(networkResponse));
            } catch (Throwable th) {
                return Response.error(new ParseError(th));
            }
        }
    }

    public static void getEnrollmentReintenNews(Context context, Activity activity, GetEnrollmentReintenNewsCallback getEnrollmentReintenNewsCallback, IDReintentServicesImpl.GenerateGetEnrollmentReintentNewsResult generateGetEnrollmentReintentNewsResult) {
        try {
            RequestQueue requestQueueNewRequestQueue = Volley.newRequestQueue(context);
            AnonymousClass3 anonymousClass3 = new StringRequest(1, IDEndPoints.getCurrentInstance().getGetEnrollmentReintenNews(), new Response.Listener<String>() { // from class: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices.1
                AnonymousClass1() {
                }

                @Override // com.android.volley.Response.Listener
                public void onResponse(String str) {
                    new IDSecurityApiImpl();
                    IdNowCommonResponse enrollmentReintentNewsResponse = ReintentsServicesReponseParser.getEnrollmentReintentNewsResponse(str);
                    getEnrollmentReintenNewsCallback.onGetEnrollmentReintenNewsResponse(enrollmentReintentNewsResponse, IDEnrollmentResponseParser.processResponseCode(enrollmentReintentNewsResponse.getCode()));
                }
            }, new Response.ErrorListener() { // from class: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices.2
                AnonymousClass2() {
                }

                @Override // com.android.volley.Response.ErrorListener
                public void onErrorResponse(VolleyError volleyError) {
                    getEnrollmentReintenNewsCallback.onGetEnrollmentReintenNewsResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
                }
            }) { // from class: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices.3
                final /* synthetic */ Activity val$activity;
                final /* synthetic */ Context val$context;
                final /* synthetic */ String val$mRequestBody;
                final /* synthetic */ IDReintentServicesImpl.GenerateGetEnrollmentReintentNewsResult val$request;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(int i2, String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, Context context2, Activity activity2, IDReintentServicesImpl.GenerateGetEnrollmentReintentNewsResult generateGetEnrollmentReintentNewsResult2) {
                    super(i2, str, listener, errorListener);
                    str = str2;
                    context = context2;
                    activity = activity2;
                    generateGetEnrollmentReintentNewsResult = generateGetEnrollmentReintentNewsResult2;
                }

                @Override // com.android.volley.Request
                public byte[] getBody() {
                    return str.getBytes(StandardCharsets.UTF_8);
                }

                @Override // com.android.volley.Request
                public String getBodyContentType() {
                    return "application/json; charset=utf-8";
                }

                @Override // com.android.volley.Request
                public Map<String, String> getHeaders() {
                    HashMap map = new HashMap();
                    new IDSecurityApiImpl().getIdNowCredentials(context, activity);
                    map.put("Content-Type", Constants.WUP_CONTENT_TYPE);
                    for (int i2 = 0; i2 < generateGetEnrollmentReintentNewsResult.getHeaders().size(); i2++) {
                        map.put(generateGetEnrollmentReintentNewsResult.getHeaders().get(i2).getKey(), generateGetEnrollmentReintentNewsResult.getHeaders().get(i2).getValue());
                    }
                    return map;
                }

                @Override // com.android.volley.toolbox.StringRequest, com.android.volley.Request
                protected Response<String> parseNetworkResponse(NetworkResponse networkResponse) {
                    try {
                        return Response.success(new JSONObject(new String(networkResponse.data, StandardCharsets.UTF_8)).toString(), HttpHeaderParser.parseCacheHeaders(networkResponse));
                    } catch (Throwable th) {
                        return Response.error(new ParseError(th));
                    }
                }
            };
            anonymousClass3.setRetryPolicy(new DefaultRetryPolicy(HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT, 0, 1.0f));
            requestQueueNewRequestQueue.add(anonymousClass3);
        } catch (Throwable unused) {
            getEnrollmentReintenNewsCallback.onGetEnrollmentReintenNewsResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
        }
    }

    public static void updateEnrollmentReintenNews(Context context, Activity activity, UpdateEnrollmentReintenNewsCallback updateEnrollmentReintenNewsCallback, IDReintentServicesImpl.GenerateUpdateEnrollmentReintentNewsResult generateUpdateEnrollmentReintentNewsResult) {
        try {
            RequestQueue requestQueueNewRequestQueue = Volley.newRequestQueue(context);
            AnonymousClass6 anonymousClass6 = new StringRequest(1, IDEndPoints.getCurrentInstance().getUpdateEnrollmentReintentNews(), new Response.Listener<String>() { // from class: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices.4
                final /* synthetic */ Activity val$activity;
                final /* synthetic */ UpdateEnrollmentReintenNewsCallback val$callback;
                final /* synthetic */ Context val$context;

                AnonymousClass4(Context context2, Activity activity2, UpdateEnrollmentReintenNewsCallback updateEnrollmentReintenNewsCallback2) {
                    context = context2;
                    activity = activity2;
                    updateEnrollmentReintenNewsCallback = updateEnrollmentReintenNewsCallback2;
                }

                @Override // com.android.volley.Response.Listener
                public void onResponse(String str) {
                    new IDSecurityApiImpl();
                    IdNowCommonResponse enrollmentReintentNewsResponse = ReintentsServicesReponseParser.getEnrollmentReintentNewsResponse(IDEnrollmentServices.deResponse(str, false, context, activity));
                    updateEnrollmentReintenNewsCallback.onUpdateEnrollmentReintenNewsResponse(enrollmentReintentNewsResponse, IDEnrollmentResponseParser.processResponseCode(enrollmentReintentNewsResponse.getCode()));
                }
            }, new Response.ErrorListener() { // from class: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices.5
                AnonymousClass5() {
                }

                @Override // com.android.volley.Response.ErrorListener
                public void onErrorResponse(VolleyError volleyError) {
                    updateEnrollmentReintenNewsCallback.onUpdateEnrollmentReintenNewsResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
                }
            }) { // from class: com.ticnow.sdk.idnowonboarding.services.reintents.IDReintentServices.6
                final /* synthetic */ Activity val$activity;
                final /* synthetic */ Context val$context;
                final /* synthetic */ String val$mRequestBody;
                final /* synthetic */ IDReintentServicesImpl.GenerateUpdateEnrollmentReintentNewsResult val$request;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass6(int i2, String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, Context context2, Activity activity2, IDReintentServicesImpl.GenerateUpdateEnrollmentReintentNewsResult generateUpdateEnrollmentReintentNewsResult2) {
                    super(i2, str, listener, errorListener);
                    str = str2;
                    context = context2;
                    activity = activity2;
                    generateUpdateEnrollmentReintentNewsResult = generateUpdateEnrollmentReintentNewsResult2;
                }

                @Override // com.android.volley.Request
                public byte[] getBody() {
                    return str.getBytes(StandardCharsets.UTF_8);
                }

                @Override // com.android.volley.Request
                public String getBodyContentType() {
                    return "application/json; charset=utf-8";
                }

                @Override // com.android.volley.Request
                public Map<String, String> getHeaders() {
                    HashMap map = new HashMap();
                    new IDSecurityApiImpl().getIdNowCredentials(context, activity);
                    map.put("Content-Type", Constants.WUP_CONTENT_TYPE);
                    for (int i2 = 0; i2 < generateUpdateEnrollmentReintentNewsResult.getHeaders().size(); i2++) {
                        map.put(generateUpdateEnrollmentReintentNewsResult.getHeaders().get(i2).getKey(), generateUpdateEnrollmentReintentNewsResult.getHeaders().get(i2).getValue());
                    }
                    return map;
                }

                @Override // com.android.volley.toolbox.StringRequest, com.android.volley.Request
                protected Response<String> parseNetworkResponse(NetworkResponse networkResponse) {
                    try {
                        return Response.success(new JSONObject(new String(networkResponse.data, StandardCharsets.UTF_8)).toString(), HttpHeaderParser.parseCacheHeaders(networkResponse));
                    } catch (Throwable th) {
                        return Response.error(new ParseError(th));
                    }
                }
            };
            anonymousClass6.setRetryPolicy(new DefaultRetryPolicy(HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT, 0, 1.0f));
            requestQueueNewRequestQueue.add(anonymousClass6);
        } catch (Throwable unused) {
            updateEnrollmentReintenNewsCallback2.onUpdateEnrollmentReintenNewsResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
        }
    }
}
