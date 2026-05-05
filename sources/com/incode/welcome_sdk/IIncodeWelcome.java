package com.incode.welcome_sdk;

import android.content.Context;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.QuantityKeyword;
import com.incode.welcome_sdk.data.local.FaceInfo;
import com.incode.welcome_sdk.listeners.AddNOM151ArchiveListener;
import com.incode.welcome_sdk.listeners.AntifraudListener;
import com.incode.welcome_sdk.listeners.FaceEventListener;
import com.incode.welcome_sdk.listeners.FaceInfoListener;
import com.incode.welcome_sdk.listeners.FaceMatchListener;
import com.incode.welcome_sdk.listeners.FaceRecognitionPrepareListener;
import com.incode.welcome_sdk.listeners.FetchRegionsListener;
import com.incode.welcome_sdk.listeners.FinishOnboardingListener;
import com.incode.welcome_sdk.listeners.GeolocationListener;
import com.incode.welcome_sdk.listeners.GetUserOCRDataListener;
import com.incode.welcome_sdk.listeners.GetUserScoreListener;
import com.incode.welcome_sdk.listeners.IdProcessListener;
import com.incode.welcome_sdk.listeners.OnboardingSessionListener;
import com.incode.welcome_sdk.listeners.PaymentProofInfoListener;
import com.incode.welcome_sdk.listeners.ProcessCustomWatchlistListener;
import com.incode.welcome_sdk.listeners.ProcessLaborHistoryListener;
import com.incode.welcome_sdk.listeners.ProcessPaymentProofListener;
import com.incode.welcome_sdk.listeners.ReportListener;
import com.incode.welcome_sdk.listeners.SelfieScanListener;
import com.incode.welcome_sdk.listeners.SyncDelayedOnboardingListener;
import com.incode.welcome_sdk.listeners.SyncFaceLoginAttemptsListener;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.modules.SelfieScan;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* JADX INFO: loaded from: classes3.dex */
public interface IIncodeWelcome {
    @Deprecated(message = "This method is deprecated and should no longer be used.", replaceWith = @ReplaceWith(expression = "addFace(faceInfo, faceEventListener)", imports = {}))
    void addFace(FaceInfo faceInfo);

    void addFace(FaceInfo faceInfo, FaceEventListener faceEventListener);

    void addNOM151Archive(String str, AddNOM151ArchiveListener addNOM151ArchiveListener);

    void deleteAllDelayedOnboardings();

    @Deprecated(message = "Libraries are now bundled with the SDK, and always available. This function should not be used anymore.")
    void downloadLibraries();

    void faceMatch(String str, IdCategory idCategory, FaceMatchListener faceMatchListener);

    void faceMatch(String str, FaceMatch.MatchType matchType, IdCategory idCategory, FaceMatchListener faceMatchListener);

    @Deprecated(message = "This method is deprecated and should no longer be used.")
    void fetchAllFlows(String str, IncodeWelcome.FetchFlowsListener fetchFlowsListener);

    @Deprecated(message = "This method is deprecated and should no longer be used.")
    void fetchFlow(String str, String str2, IncodeWelcome.FetchFlowListener fetchFlowListener);

    @Deprecated(message = "This method is deprecated as the region is no longer necessary in the onboarding flow.")
    void fetchRegions(FetchRegionsListener fetchRegionsListener);

    void finishOnboarding(Context context, FinishOnboardingListener finishOnboardingListener);

    void geolocation(Context context, String str, GeolocationListener geolocationListener);

    void getFaces(FaceInfoListener faceInfoListener);

    String getInterviewId();

    void getPaymentProofInfo(String str, PaymentProofInfoListener paymentProofInfoListener);

    void getReport(String str, ReportListener reportListener);

    SdkMode getSdkMode();

    void getUserOCRData(String str, GetUserOCRDataListener getUserOCRDataListener);

    void getUserScore(IncodeWelcome.IDResultsFetchMode iDResultsFetchMode, String str, GetUserScoreListener getUserScoreListener);

    String getVideoSelfiePath();

    @Deprecated(message = "Libraries are now bundled with the SDK, and always available. This function always returns true.")
    boolean isLibrariesReady();

    boolean isTokenInitialized();

    void processAntifraud(String str, AntifraudListener antifraudListener);

    void processCustomWatchlist(String str, ProcessCustomWatchlistListener processCustomWatchlistListener);

    void processId(String str, IdCategory idCategory, IdProcessListener idProcessListener);

    void processLaborHistory(String str, String str2, ProcessLaborHistoryListener processLaborHistoryListener);

    void processPaymentProof(String str, ProcessPaymentProofListener processPaymentProofListener);

    void removeAllFaces(FaceEventListener faceEventListener);

    @Deprecated(message = "This method is deprecated and should no longer be used.", replaceWith = @ReplaceWith(expression = "removeFace(customerUUID, faceEventListener)", imports = {}))
    void removeFace(String str);

    void removeFace(String str, FaceEventListener faceEventListener);

    void setCommonConfig(CommonConfig commonConfig);

    void setFaceAuthenticationHint(String str);

    @Deprecated(message = "This method is deprecated and should no longer be used.", replaceWith = @ReplaceWith(expression = "setFaces(faceInfoList, faceEventListener)", imports = {}))
    void setFaces(List<FaceInfo> list);

    void setFaces(List<FaceInfo> list, FaceEventListener faceEventListener);

    void setQuantityStrings(Locale locale, Map<String, ? extends Map<QuantityKeyword, ? extends CharSequence>> map);

    void setSdkMode(SdkMode sdkMode);

    void setStringArray(Locale locale, Map<String, CharSequence[]> map);

    void setStrings(Locale locale, Map<String, ? extends CharSequence> map);

    void setupOnboardingSession(SessionConfig sessionConfig, OnboardingSessionListener onboardingSessionListener);

    void startFaceLogin(Context context, SessionConfig sessionConfig, SelfieScan selfieScan, SelfieScanListener selfieScanListener);

    void startFaceLogin(Context context, SelfieScan selfieScan, SelfieScanListener selfieScanListener);

    void startOnboarding(Context context, SessionConfig sessionConfig, FlowConfig flowConfig, IncodeWelcome.OnboardingListener onboardingListener);

    void startOnboardingSection(Context context, FlowConfig flowConfig, IncodeWelcome.OnboardingListener onboardingListener);

    void startOnboardingSection(Context context, SessionConfig sessionConfig, FlowConfig flowConfig, IncodeWelcome.OnboardingListener onboardingListener);

    void startWorkflow(Context context, SessionConfig sessionConfig, IncodeWelcome.OnboardingListener onboardingListener);

    @Deprecated(message = "Libraries are now bundled with the SDK, and always available. FaceRecognitionPrepareListener#onFaceRecognitionReady() is called immediately")
    void subscribeForLibrariesReady(FaceRecognitionPrepareListener faceRecognitionPrepareListener);

    void syncDelayedOnboardings(SyncDelayedOnboardingListener syncDelayedOnboardingListener);

    void syncFaceLoginAttempts(SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener);
}
