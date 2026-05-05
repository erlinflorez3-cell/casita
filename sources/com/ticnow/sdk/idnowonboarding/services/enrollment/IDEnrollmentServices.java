package com.ticnow.sdk.idnowonboarding.services.enrollment;

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
import com.ticnow.sdk.idnowonboarding.services.enrollment.enrollmentparser.EnrollmentServicesResponseParser;
import com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks.FinishEnrollmentRequestCallback;
import com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks.GetRegisterPathRequestCallBack;
import com.ticnow.sdk.idnowonboarding.services.enrollment.enrolmentcallbacks.InitEnrollmentRequestCallback;
import com.ticnow.sdk.idnowsecurity.api.IDSecurityApiImpl;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseCodes;
import com.ticnow.sdk.idnowsecurity.http.codes.IDEnrollmentResponseParser;
import com.ticnow.sdk.idnowsecurity.http.paths.IDEndPoints;
import com.ticnow.sdk.idnowsecurity.http.response.FinishEnrollmentResponse;
import com.ticnow.sdk.idnowsecurity.http.response.InitEnrollmentResponse;
import com.ticnow.sdk.idnowsecurity.http.response.RegisterPathResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class IDEnrollmentServices {

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices$1 */
    class AnonymousClass1 implements Response.Listener<String> {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ InitEnrollmentRequestCallback val$callback;
        final /* synthetic */ Context val$context;

        AnonymousClass1(Context context, Activity activity, InitEnrollmentRequestCallback initEnrollmentRequestCallback) {
            context = context;
            activity = activity;
            initEnrollmentRequestCallback = initEnrollmentRequestCallback;
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(String str) {
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            InitEnrollmentResponse initEnrollmentResponse = EnrollmentServicesResponseParser.getInitEnrollmentResponse(IDEnrollmentServices.deResponse(str, true, context, activity), context, activity);
            IDSecurityApiImpl.ProcessInitEnrollmentResponseResult processInitEnrollmentResponseResultProcessInitEnrollmentResponse = iDSecurityApiImpl.processInitEnrollmentResponse(context, activity, initEnrollmentResponse);
            IDEnrollmentResponseCodes iDEnrollmentResponseCodesProcessResponseCode = IDEnrollmentResponseParser.processResponseCode(processInitEnrollmentResponseResultProcessInitEnrollmentResponse.getIdNowCommonResponse().getCode());
            if (iDEnrollmentResponseCodesProcessResponseCode == IDEnrollmentResponseCodes.COD_OK) {
                initEnrollmentResponse.setEnvironmentsParams(processInitEnrollmentResponseResultProcessInitEnrollmentResponse.getIdNowCommonResponse().getEnvironmentsParams());
            }
            initEnrollmentRequestCallback.onInitEnrollmentRequestResponse(initEnrollmentResponse, iDEnrollmentResponseCodesProcessResponseCode);
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices$2 */
    class AnonymousClass2 implements Response.ErrorListener {
        AnonymousClass2() {
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            initEnrollmentRequestCallback.onInitEnrollmentRequestResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices$3 */
    class AnonymousClass3 extends StringRequest {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Context val$context;
        final /* synthetic */ String val$mRequestBody;
        final /* synthetic */ IDSecurityApiImpl.GenerateInitEnrollmentRequestResult val$request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(int i2, String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, Context context, Activity activity, IDSecurityApiImpl.GenerateInitEnrollmentRequestResult generateInitEnrollmentRequestResult) {
            super(i2, str, listener, errorListener);
            str = str2;
            context = context;
            activity = activity;
            generateInitEnrollmentRequestResult = generateInitEnrollmentRequestResult;
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
            for (int i2 = 0; i2 < generateInitEnrollmentRequestResult.getHeaders().size(); i2++) {
                map.put(generateInitEnrollmentRequestResult.getHeaders().get(i2).getKey(), generateInitEnrollmentRequestResult.getHeaders().get(i2).getValue());
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

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices$4 */
    class AnonymousClass4 implements Response.Listener<String> {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ GetRegisterPathRequestCallBack val$callback;
        final /* synthetic */ Context val$context;

        AnonymousClass4(Context context, Activity activity, GetRegisterPathRequestCallBack getRegisterPathRequestCallBack) {
            context = context;
            activity = activity;
            getRegisterPathRequestCallBack = getRegisterPathRequestCallBack;
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(String str) {
            RegisterPathResponse registerPathResponse = EnrollmentServicesResponseParser.getRegisterPathResponse(IDEnrollmentServices.deResponse(str, false, context, activity));
            getRegisterPathRequestCallBack.onGetRegisterPathRequestResponse(registerPathResponse, IDEnrollmentResponseParser.processResponseCode(registerPathResponse.getCode()));
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices$5 */
    class AnonymousClass5 implements Response.ErrorListener {
        AnonymousClass5() {
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            getRegisterPathRequestCallBack.onGetRegisterPathRequestResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices$6 */
    class AnonymousClass6 extends StringRequest {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Context val$context;
        final /* synthetic */ String val$mRequestBody;
        final /* synthetic */ IDSecurityApiImpl.GenerateGetRegisterPathRequestResult val$request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(int i2, String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, Context context, Activity activity, IDSecurityApiImpl.GenerateGetRegisterPathRequestResult generateGetRegisterPathRequestResult) {
            super(i2, str, listener, errorListener);
            str = str2;
            context = context;
            activity = activity;
            generateGetRegisterPathRequestResult = generateGetRegisterPathRequestResult;
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
            for (int i2 = 0; i2 < generateGetRegisterPathRequestResult.getHeaders().size(); i2++) {
                map.put(generateGetRegisterPathRequestResult.getHeaders().get(i2).getKey(), generateGetRegisterPathRequestResult.getHeaders().get(i2).getValue());
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

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices$7 */
    class AnonymousClass7 implements Response.Listener<String> {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ FinishEnrollmentRequestCallback val$callback;
        final /* synthetic */ Context val$context;

        AnonymousClass7(Context context, Activity activity, FinishEnrollmentRequestCallback finishEnrollmentRequestCallback) {
            context = context;
            activity = activity;
            finishEnrollmentRequestCallback = finishEnrollmentRequestCallback;
        }

        @Override // com.android.volley.Response.Listener
        public void onResponse(String str) {
            IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
            FinishEnrollmentResponse finishEnrollmentResponse = EnrollmentServicesResponseParser.getFinishEnrollmentResponse(IDEnrollmentServices.deResponse(str, false, context, activity));
            finishEnrollmentRequestCallback.onFinishEnrollmentRequestResponse(finishEnrollmentResponse, IDEnrollmentResponseParser.processResponseCode(iDSecurityApiImpl.processFinishEnrollmentResponseNEC(context, activity, finishEnrollmentResponse).getIdNowCommonResponse().getCode()));
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices$8 */
    class AnonymousClass8 implements Response.ErrorListener {
        AnonymousClass8() {
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            finishEnrollmentRequestCallback.onFinishEnrollmentRequestResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices$9 */
    class AnonymousClass9 extends StringRequest {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Context val$context;
        final /* synthetic */ String val$mRequestBody;
        final /* synthetic */ IDSecurityApiImpl.GenerateFinishEnrollmentRequestResult val$request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(int i2, String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, Context context, Activity activity, IDSecurityApiImpl.GenerateFinishEnrollmentRequestResult generateFinishEnrollmentRequestResult) {
            super(i2, str, listener, errorListener);
            str = str2;
            context = context;
            activity = activity;
            generateFinishEnrollmentRequestResult = generateFinishEnrollmentRequestResult;
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
            for (int i2 = 0; i2 < generateFinishEnrollmentRequestResult.getHeaders().size(); i2++) {
                map.put(generateFinishEnrollmentRequestResult.getHeaders().get(i2).getKey(), generateFinishEnrollmentRequestResult.getHeaders().get(i2).getValue());
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

    public static void InitEnrollment(Context context, Activity activity, InitEnrollmentRequestCallback initEnrollmentRequestCallback, IDSecurityApiImpl.GenerateInitEnrollmentRequestResult generateInitEnrollmentRequestResult) {
        try {
            RequestQueue requestQueueNewRequestQueue = Volley.newRequestQueue(context);
            AnonymousClass3 anonymousClass3 = new StringRequest(1, IDEndPoints.getCurrentInstance().getInitEnrollment(), new Response.Listener<String>() { // from class: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices.1
                final /* synthetic */ Activity val$activity;
                final /* synthetic */ InitEnrollmentRequestCallback val$callback;
                final /* synthetic */ Context val$context;

                AnonymousClass1(Context context2, Activity activity2, InitEnrollmentRequestCallback initEnrollmentRequestCallback2) {
                    context = context2;
                    activity = activity2;
                    initEnrollmentRequestCallback = initEnrollmentRequestCallback2;
                }

                @Override // com.android.volley.Response.Listener
                public void onResponse(String str) {
                    IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                    InitEnrollmentResponse initEnrollmentResponse = EnrollmentServicesResponseParser.getInitEnrollmentResponse(IDEnrollmentServices.deResponse(str, true, context, activity), context, activity);
                    IDSecurityApiImpl.ProcessInitEnrollmentResponseResult processInitEnrollmentResponseResultProcessInitEnrollmentResponse = iDSecurityApiImpl.processInitEnrollmentResponse(context, activity, initEnrollmentResponse);
                    IDEnrollmentResponseCodes iDEnrollmentResponseCodesProcessResponseCode = IDEnrollmentResponseParser.processResponseCode(processInitEnrollmentResponseResultProcessInitEnrollmentResponse.getIdNowCommonResponse().getCode());
                    if (iDEnrollmentResponseCodesProcessResponseCode == IDEnrollmentResponseCodes.COD_OK) {
                        initEnrollmentResponse.setEnvironmentsParams(processInitEnrollmentResponseResultProcessInitEnrollmentResponse.getIdNowCommonResponse().getEnvironmentsParams());
                    }
                    initEnrollmentRequestCallback.onInitEnrollmentRequestResponse(initEnrollmentResponse, iDEnrollmentResponseCodesProcessResponseCode);
                }
            }, new Response.ErrorListener() { // from class: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices.2
                AnonymousClass2() {
                }

                @Override // com.android.volley.Response.ErrorListener
                public void onErrorResponse(VolleyError volleyError) {
                    initEnrollmentRequestCallback.onInitEnrollmentRequestResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
                }
            }) { // from class: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices.3
                final /* synthetic */ Activity val$activity;
                final /* synthetic */ Context val$context;
                final /* synthetic */ String val$mRequestBody;
                final /* synthetic */ IDSecurityApiImpl.GenerateInitEnrollmentRequestResult val$request;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(int i2, String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, Context context2, Activity activity2, IDSecurityApiImpl.GenerateInitEnrollmentRequestResult generateInitEnrollmentRequestResult2) {
                    super(i2, str, listener, errorListener);
                    str = str2;
                    context = context2;
                    activity = activity2;
                    generateInitEnrollmentRequestResult = generateInitEnrollmentRequestResult2;
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
                    for (int i2 = 0; i2 < generateInitEnrollmentRequestResult.getHeaders().size(); i2++) {
                        map.put(generateInitEnrollmentRequestResult.getHeaders().get(i2).getKey(), generateInitEnrollmentRequestResult.getHeaders().get(i2).getValue());
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
            initEnrollmentRequestCallback2.onInitEnrollmentRequestResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
        }
    }

    public static String deResponse(String str, Boolean bool, Context context, Activity activity) {
        String strWd = Jg.Wd("Y58'T#0", (short) (C1607wl.Xd() ^ 8074), (short) (C1607wl.Xd() ^ 27244));
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.isNull(strWd)) {
                return null;
            }
            String string = jSONObject.getString(strWd);
            Class<?> cls = Class.forName(ZO.xd("){A1y(!=CC\u0016 n\u001b,\u000eY,%", (short) (C1499aX.Xd() ^ (-2165)), (short) (C1499aX.Xd() ^ (-7324))));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1633zX.Xd() ^ (-2126));
            short sXd2 = (short) (C1633zX.Xd() ^ (-20903));
            int[] iArr = new int["Crt=\u0005\u0003y8}\u0018\u0004 vV^2".length()];
            QB qb = new QB("Crt=\u0005\u0003y8}\u0018\u0004 vV^2");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {string, 0};
            Method declaredMethod = cls.getDeclaredMethod(Ig.wd("'\u0002\f6b\u0006", (short) (ZN.Xd() ^ 7922)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                return new String(bool.booleanValue() ? new IDSecurityApiImpl().dencryptDataInit(context, activity, bArr) : new IDSecurityApiImpl().decryptData(context, activity, bArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String deResponseOnly(String str, Boolean bool, Context context, Activity activity) {
        short sXd = (short) (C1607wl.Xd() ^ 15931);
        int[] iArr = new int["f%\r{)\u007f\u0017`\u0003VI*:X_PfY\u0010".length()];
        QB qb = new QB("f%\r{)\u007f\u0017`\u0003VI*:X_PfY\u0010");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[2];
            short sXd2 = (short) (ZN.Xd() ^ 1361);
            int[] iArr2 = new int["\u001f\u0015)\u0013^\u001c\u0010\u001c\u0014Y}\u001e\u001b\u0011\u0015\r".length()];
            QB qb2 = new QB("\u001f\u0015)\u0013^\u001c\u0010\u001c\u0014Y}\u001e\u001b\u0011\u0015\r");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str, 0};
            Method declaredMethod = cls.getDeclaredMethod(C1593ug.zd("cedqgi", (short) (OY.Xd() ^ 14340), (short) (OY.Xd() ^ 8883)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
                return new String(bool.booleanValue() ? new IDSecurityApiImpl().dencryptDataInit(context, activity, bArr) : new IDSecurityApiImpl().decryptData(context, activity, bArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void finishEnrollment(Context context, Activity activity, FinishEnrollmentRequestCallback finishEnrollmentRequestCallback, IDSecurityApiImpl.GenerateFinishEnrollmentRequestResult generateFinishEnrollmentRequestResult) {
        try {
            RequestQueue requestQueueNewRequestQueue = Volley.newRequestQueue(context);
            AnonymousClass9 anonymousClass9 = new StringRequest(1, IDEndPoints.getCurrentInstance().getFinishEnrollment(), new Response.Listener<String>() { // from class: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices.7
                final /* synthetic */ Activity val$activity;
                final /* synthetic */ FinishEnrollmentRequestCallback val$callback;
                final /* synthetic */ Context val$context;

                AnonymousClass7(Context context2, Activity activity2, FinishEnrollmentRequestCallback finishEnrollmentRequestCallback2) {
                    context = context2;
                    activity = activity2;
                    finishEnrollmentRequestCallback = finishEnrollmentRequestCallback2;
                }

                @Override // com.android.volley.Response.Listener
                public void onResponse(String str) {
                    IDSecurityApiImpl iDSecurityApiImpl = new IDSecurityApiImpl();
                    FinishEnrollmentResponse finishEnrollmentResponse = EnrollmentServicesResponseParser.getFinishEnrollmentResponse(IDEnrollmentServices.deResponse(str, false, context, activity));
                    finishEnrollmentRequestCallback.onFinishEnrollmentRequestResponse(finishEnrollmentResponse, IDEnrollmentResponseParser.processResponseCode(iDSecurityApiImpl.processFinishEnrollmentResponseNEC(context, activity, finishEnrollmentResponse).getIdNowCommonResponse().getCode()));
                }
            }, new Response.ErrorListener() { // from class: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices.8
                AnonymousClass8() {
                }

                @Override // com.android.volley.Response.ErrorListener
                public void onErrorResponse(VolleyError volleyError) {
                    finishEnrollmentRequestCallback.onFinishEnrollmentRequestResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
                }
            }) { // from class: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices.9
                final /* synthetic */ Activity val$activity;
                final /* synthetic */ Context val$context;
                final /* synthetic */ String val$mRequestBody;
                final /* synthetic */ IDSecurityApiImpl.GenerateFinishEnrollmentRequestResult val$request;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass9(int i2, String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, Context context2, Activity activity2, IDSecurityApiImpl.GenerateFinishEnrollmentRequestResult generateFinishEnrollmentRequestResult2) {
                    super(i2, str, listener, errorListener);
                    str = str2;
                    context = context2;
                    activity = activity2;
                    generateFinishEnrollmentRequestResult = generateFinishEnrollmentRequestResult2;
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
                    for (int i2 = 0; i2 < generateFinishEnrollmentRequestResult.getHeaders().size(); i2++) {
                        map.put(generateFinishEnrollmentRequestResult.getHeaders().get(i2).getKey(), generateFinishEnrollmentRequestResult.getHeaders().get(i2).getValue());
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
            anonymousClass9.setRetryPolicy(new DefaultRetryPolicy(HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT, 0, 1.0f));
            requestQueueNewRequestQueue.add(anonymousClass9);
        } catch (Throwable unused) {
            finishEnrollmentRequestCallback2.onFinishEnrollmentRequestResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
        }
    }

    public static void getRegisterPath(Context context, Activity activity, GetRegisterPathRequestCallBack getRegisterPathRequestCallBack, IDSecurityApiImpl.GenerateGetRegisterPathRequestResult generateGetRegisterPathRequestResult) {
        try {
            RequestQueue requestQueueNewRequestQueue = Volley.newRequestQueue(context);
            AnonymousClass6 anonymousClass6 = new StringRequest(1, IDEndPoints.getCurrentInstance().getGetRegisterPath(), new Response.Listener<String>() { // from class: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices.4
                final /* synthetic */ Activity val$activity;
                final /* synthetic */ GetRegisterPathRequestCallBack val$callback;
                final /* synthetic */ Context val$context;

                AnonymousClass4(Context context2, Activity activity2, GetRegisterPathRequestCallBack getRegisterPathRequestCallBack2) {
                    context = context2;
                    activity = activity2;
                    getRegisterPathRequestCallBack = getRegisterPathRequestCallBack2;
                }

                @Override // com.android.volley.Response.Listener
                public void onResponse(String str) {
                    RegisterPathResponse registerPathResponse = EnrollmentServicesResponseParser.getRegisterPathResponse(IDEnrollmentServices.deResponse(str, false, context, activity));
                    getRegisterPathRequestCallBack.onGetRegisterPathRequestResponse(registerPathResponse, IDEnrollmentResponseParser.processResponseCode(registerPathResponse.getCode()));
                }
            }, new Response.ErrorListener() { // from class: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices.5
                AnonymousClass5() {
                }

                @Override // com.android.volley.Response.ErrorListener
                public void onErrorResponse(VolleyError volleyError) {
                    getRegisterPathRequestCallBack.onGetRegisterPathRequestResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
                }
            }) { // from class: com.ticnow.sdk.idnowonboarding.services.enrollment.IDEnrollmentServices.6
                final /* synthetic */ Activity val$activity;
                final /* synthetic */ Context val$context;
                final /* synthetic */ String val$mRequestBody;
                final /* synthetic */ IDSecurityApiImpl.GenerateGetRegisterPathRequestResult val$request;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass6(int i2, String str, Response.Listener listener, Response.ErrorListener errorListener, String str2, Context context2, Activity activity2, IDSecurityApiImpl.GenerateGetRegisterPathRequestResult generateGetRegisterPathRequestResult2) {
                    super(i2, str, listener, errorListener);
                    str = str2;
                    context = context2;
                    activity = activity2;
                    generateGetRegisterPathRequestResult = generateGetRegisterPathRequestResult2;
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
                    for (int i2 = 0; i2 < generateGetRegisterPathRequestResult.getHeaders().size(); i2++) {
                        map.put(generateGetRegisterPathRequestResult.getHeaders().get(i2).getKey(), generateGetRegisterPathRequestResult.getHeaders().get(i2).getValue());
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
            getRegisterPathRequestCallBack2.onGetRegisterPathRequestResponse(null, IDEnrollmentResponseCodes.GENERAL_ERROR);
        }
    }
}
