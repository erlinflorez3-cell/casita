package com.dynatrace.android.callback;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.OneAgentLoggingKt;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CbConstants;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.List;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public class OkCallback {
    private static final String LOGTAG = Global.LOG_PREFIX + "OkCallback";
    public static boolean useRequestHeaders = false;
    public static boolean useResponseHeaders = false;

    public static void enqueue(Call call, okhttp3.Callback callback) {
        if (!Global.isAlive.get()) {
            call.enqueue(callback);
            return;
        }
        if (call == null) {
            return;
        }
        OkRequestStateParms okRequestStateParms = new OkRequestStateParms(call.request(), CbConstants.WrMethod.enqueue, CbConstants.WrStates.PRE_EXEC, 0, useResponseHeaders, useRequestHeaders);
        updateRequest(okRequestStateParms);
        try {
            call.enqueue(callback);
        } catch (RuntimeException e2) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "tracked failed 'enqueue' method call");
            okRequestStateParms.exception = e2;
            updateRequest(okRequestStateParms, 0, null, e2.toString(), CbConstants.WrStates.POST_EXEC_ERR);
            throw e2;
        }
    }

    public static Response execute(Call call) throws Exception {
        if (!Global.isAlive.get()) {
            return call.execute();
        }
        if (call == null) {
            return null;
        }
        OkRequestStateParms okRequestStateParms = new OkRequestStateParms(call.request(), CbConstants.WrMethod.execute, CbConstants.WrStates.PRE_EXEC, 0, useResponseHeaders, useRequestHeaders);
        try {
            updateRequest(okRequestStateParms);
            Response responseExecute = call.execute();
            okRequestStateParms.parseHeaders();
            okRequestStateParms.calcHttpMessageBytes(responseExecute);
            okRequestStateParms.evaluateServerTiming(responseExecute.headers(HttpHeaders.SERVER_TIMING));
            updateRequest(okRequestStateParms, responseExecute.code(), (responseExecute.protocol() == Protocol.HTTP_1_0 || responseExecute.protocol() == Protocol.HTTP_1_1) ? responseExecute.message() : null, null, CbConstants.WrStates.POST_EXEC_OK);
            return responseExecute;
        } catch (Exception e2) {
            Utility.devLog(OneAgentLoggingKt.TAG_EVENT_GENERATION, "tracked failed 'execute' method call");
            okRequestStateParms.exception = e2;
            updateRequest(okRequestStateParms, 0, null, e2.toString(), CbConstants.WrStates.POST_EXEC_ERR);
            throw e2;
        }
    }

    public static void newInstance_start(OkHttpClient.Builder builder) {
        try {
            List<Interceptor> listInterceptors = builder.interceptors();
            listInterceptors.remove(OkInterceptor.theInterceptor);
            listInterceptors.add(0, OkInterceptor.theInterceptor);
            builder.networkInterceptors().remove(OkHeaderInterceptor.theInterceptor);
            builder.addNetworkInterceptor(OkHeaderInterceptor.theInterceptor);
        } catch (Exception e2) {
            Utility.zlogE(LOGTAG, e2.getMessage(), e2);
        }
    }

    public static void onFailure_enter(Call call, IOException iOException) {
        CbWebReqTracker cbWebReqTracker;
        if (!Global.isAlive.get() || call == null || (cbWebReqTracker = OkInterceptor.reqTracker.get(call.request())) == null) {
            return;
        }
        cbWebReqTracker.stateParm.exception = iOException;
        updateRequest(cbWebReqTracker.stateParm, 0, null, iOException.toString(), CbConstants.WrStates.POST_EXEC_ERR);
    }

    public static void onFailure_exit() {
    }

    public static void onResponse_enter(Call call, Response response) {
        CbWebReqTracker cbWebReqTracker;
        if (!Global.isAlive.get() || call == null || (cbWebReqTracker = OkInterceptor.reqTracker.get(call.request())) == null) {
            return;
        }
        ((OkRequestStateParms) cbWebReqTracker.stateParm).calcHttpMessageBytes(response);
        ((OkRequestStateParms) cbWebReqTracker.stateParm).parseHeaders();
        cbWebReqTracker.stateParm.evaluateServerTiming(response.headers(HttpHeaders.SERVER_TIMING));
        updateRequest(cbWebReqTracker.stateParm, response.code(), (response.protocol() == Protocol.HTTP_1_0 || response.protocol() == Protocol.HTTP_1_1) ? response.message() : null, null, CbConstants.WrStates.POST_EXEC_OK);
    }

    public static void onResponse_exit() {
    }

    private static void updateRequest(OkRequestStateParms okRequestStateParms) {
        if (okRequestStateParms.request == null || !CallbackCore.configuration.webRequestTiming) {
            return;
        }
        if (Global.DEBUG) {
            Utility.zlogD(LOGTAG, String.format("%s of %s of %s to %s (%d)", okRequestStateParms.state, okRequestStateParms.trackingMethod, okRequestStateParms.request.getClass().getName(), okRequestStateParms.getRequestDesc(), Integer.valueOf(okRequestStateParms.request.hashCode())));
        }
        CbWebReqTracker cbWebReqTrackerAddRequest = OkInterceptor.reqTracker.get(okRequestStateParms.request);
        if (cbWebReqTrackerAddRequest == null && CbConstants.WrStates.PRE_EXEC == okRequestStateParms.state) {
            cbWebReqTrackerAddRequest = OkInterceptor.theInterceptor.addRequest(okRequestStateParms.request, okRequestStateParms);
        }
        if (cbWebReqTrackerAddRequest == null) {
            return;
        }
        cbWebReqTrackerAddRequest.procNewState(okRequestStateParms);
        if (cbWebReqTrackerAddRequest.canFinalize) {
            synchronized (OkInterceptor.reqTracker) {
                OkInterceptor.reqTracker.remove(okRequestStateParms.request);
            }
            cbWebReqTrackerAddRequest.sendEvents(okRequestStateParms);
        }
    }

    private static void updateRequest(WebReqStateParms webReqStateParms, int i2, String str, String str2, CbConstants.WrStates wrStates) {
        if (webReqStateParms != null) {
            webReqStateParms.respCode = i2;
            if (str != null) {
                webReqStateParms.reason = str;
                webReqStateParms.reasonPhrase = str;
            } else {
                webReqStateParms.reason = str2;
            }
            webReqStateParms.state = wrStates;
            updateRequest((OkRequestStateParms) webReqStateParms);
        }
    }
}
