package com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors;

import android.content.Context;
import com.biocatch.client.android.sdk.core.Constants;
import com.dynatrace.android.callback.OkCallback;
import com.facetec.sdk.FaceTecCustomization;
import com.facetec.sdk.FaceTecFaceScanProcessor;
import com.facetec.sdk.FaceTecFaceScanResultCallback;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.FaceTecSessionActivity;
import com.facetec.sdk.FaceTecSessionResult;
import com.facetec.sdk.FaceTecSessionStatus;
import com.ticnow.sdk.idnowonboarding.model.config.IDNowOnboardingConfiguration;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.Processor;
import com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.ProgressRequestBody;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class LivenessCheckProcessor extends Processor implements FaceTecFaceScanProcessor {
    private final Context context;
    private final IDNowOnboardingConfiguration onBoardingConfiguration;
    private final String sessionToken;
    private final String TAG = "LivenessCheckProcessor";
    private boolean success = false;

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.LivenessCheckProcessor$1 */
    class AnonymousClass1 implements Callback {
        final /* synthetic */ FaceTecFaceScanResultCallback val$faceScanResultCallback;

        AnonymousClass1(FaceTecFaceScanResultCallback faceTecFaceScanResultCallback) {
            faceTecFaceScanResultCallback = faceTecFaceScanResultCallback;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            OkCallback.onFailure_enter(call, iOException);
            try {
                faceTecFaceScanResultCallback.cancel();
            } finally {
                OkCallback.onFailure_exit();
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            OkCallback.onResponse_enter(call, response);
            try {
                String strString = response.body().string();
                response.body().close();
                try {
                    JSONObject jSONObject = new JSONObject(strString);
                    boolean z2 = jSONObject.getBoolean("wasProcessed");
                    String string = jSONObject.getString("scanResultBlob");
                    if (z2) {
                        FaceTecCustomization.overrideResultScreenSuccessMessage = "Toma de foto exitosa";
                        LivenessCheckProcessor.this.success = faceTecFaceScanResultCallback.proceedToNextStep(string);
                    } else {
                        faceTecFaceScanResultCallback.cancel();
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    faceTecFaceScanResultCallback.cancel();
                }
            } finally {
                OkCallback.onResponse_exit();
            }
        }
    }

    public LivenessCheckProcessor(String str, Context context, IDNowOnboardingConfiguration iDNowOnboardingConfiguration, Processor.SessionTokenErrorCallback sessionTokenErrorCallback) throws Exception {
        this.sessionToken = str;
        this.context = context;
        this.onBoardingConfiguration = iDNowOnboardingConfiguration;
        startFaceTecSession();
    }

    public LivenessCheckProcessor(String str, Context context, String str2, String str3) throws Exception {
        IDNowOnboardingConfiguration iDNowOnboardingConfiguration = new IDNowOnboardingConfiguration();
        this.onBoardingConfiguration = iDNowOnboardingConfiguration;
        this.sessionToken = str;
        this.context = context;
        iDNowOnboardingConfiguration.setZoomServerBaseURL(str2);
        iDNowOnboardingConfiguration.setZoomLicenceKey(str3);
        startFaceTecSession();
    }

    private void startFaceTecSession() throws Exception {
        FaceTecSessionActivity.createAndLaunchSession(this.context, this, this.sessionToken);
    }

    @Override // com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.Processor
    public boolean isSuccess() {
        return this.success;
    }

    @Override // com.facetec.sdk.FaceTecFaceScanProcessor
    public void processSessionWhileFaceTecSDKWaits(FaceTecSessionResult faceTecSessionResult, final FaceTecFaceScanResultCallback faceTecFaceScanResultCallback) {
        if (faceTecSessionResult.getStatus() != FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY) {
            NetworkingHelpers.cancelPendingRequests();
            faceTecFaceScanResultCallback.cancel();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("faceScan", faceTecSessionResult.getFaceScanBase64());
            jSONObject.put("auditTrailImage", faceTecSessionResult.getAuditTrailCompressedBase64()[0]);
            jSONObject.put("lowQualityAuditTrailImage", faceTecSessionResult.getLowQualityAuditTrailCompressedBase64()[0]);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        OkCallback.enqueue(NetworkingHelpers.getApiClient().newCall(new Request.Builder().url(this.onBoardingConfiguration.zoomServerBaseURL + "/liveness-3d").header("Content-Type", Constants.WUP_CONTENT_TYPE).header("X-Device-Key", this.onBoardingConfiguration.zoomLicenceKey).header("User-Agent", FaceTecSDK.createFaceTecAPIUserAgentString(faceTecSessionResult.getSessionId())).post(new ProgressRequestBody(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jSONObject.toString()), new ProgressRequestBody.Listener() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.LivenessCheckProcessor$$ExternalSyntheticLambda0
            @Override // com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.ProgressRequestBody.Listener
            public final void onUploadProgressChanged(long j2, long j3) {
                faceTecFaceScanResultCallback.uploadProgress(j2 / j3);
            }
        })).build()), new Callback() { // from class: com.ticnow.sdk.idnowonboarding.steps.onboardingsteps.face.processors.LivenessCheckProcessor.1
            final /* synthetic */ FaceTecFaceScanResultCallback val$faceScanResultCallback;

            AnonymousClass1(final FaceTecFaceScanResultCallback faceTecFaceScanResultCallback2) {
                faceTecFaceScanResultCallback = faceTecFaceScanResultCallback2;
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                OkCallback.onFailure_enter(call, iOException);
                try {
                    faceTecFaceScanResultCallback.cancel();
                } finally {
                    OkCallback.onFailure_exit();
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                OkCallback.onResponse_enter(call, response);
                try {
                    String strString = response.body().string();
                    response.body().close();
                    try {
                        JSONObject jSONObject2 = new JSONObject(strString);
                        boolean z2 = jSONObject2.getBoolean("wasProcessed");
                        String string = jSONObject2.getString("scanResultBlob");
                        if (z2) {
                            FaceTecCustomization.overrideResultScreenSuccessMessage = "Toma de foto exitosa";
                            LivenessCheckProcessor.this.success = faceTecFaceScanResultCallback.proceedToNextStep(string);
                        } else {
                            faceTecFaceScanResultCallback.cancel();
                        }
                    } catch (JSONException e22) {
                        e22.printStackTrace();
                        faceTecFaceScanResultCallback.cancel();
                    }
                } finally {
                    OkCallback.onResponse_exit();
                }
            }
        });
    }
}
