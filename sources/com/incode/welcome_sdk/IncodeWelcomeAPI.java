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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class IncodeWelcomeAPI implements IIncodeWelcome {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4380a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4381b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4382c = 97 % 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4383d = 1;

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void setCommonConfig(CommonConfig commonConfig) {
        int i2 = 2 % 2;
        int i3 = f4381b + 19;
        f4383d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(commonConfig, "");
        int i5 = f4383d + 121;
        f4381b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public SdkMode getSdkMode() {
        int i2 = 2 % 2;
        int i3 = f4381b;
        int i4 = i3 + 109;
        f4383d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 43;
        f4383d = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void setSdkMode(SdkMode sdkMode) {
        int i2 = 2 % 2;
        int i3 = f4383d + 111;
        f4381b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sdkMode, "");
        int i5 = f4383d + 67;
        f4381b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void startOnboarding(Context context, SessionConfig sessionConfig, FlowConfig flowConfig, IncodeWelcome.OnboardingListener onboardingListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 89;
        f4381b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(sessionConfig, "");
            Intrinsics.checkNotNullParameter(flowConfig, "");
            Intrinsics.checkNotNullParameter(onboardingListener, "");
            int i4 = 11 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(sessionConfig, "");
            Intrinsics.checkNotNullParameter(flowConfig, "");
            Intrinsics.checkNotNullParameter(onboardingListener, "");
        }
        int i5 = f4381b + 93;
        f4383d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void setupOnboardingSession(SessionConfig sessionConfig, OnboardingSessionListener onboardingSessionListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 73;
        f4381b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sessionConfig, "");
            return;
        }
        Intrinsics.checkNotNullParameter(sessionConfig, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void startOnboardingSection(Context context, FlowConfig flowConfig, IncodeWelcome.OnboardingListener onboardingListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 19;
        f4383d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(flowConfig, "");
        Intrinsics.checkNotNullParameter(onboardingListener, "");
        int i5 = f4383d + 79;
        f4381b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void startOnboardingSection(Context context, SessionConfig sessionConfig, FlowConfig flowConfig, IncodeWelcome.OnboardingListener onboardingListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 45;
        f4381b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(flowConfig, "");
        Intrinsics.checkNotNullParameter(onboardingListener, "");
        int i5 = f4383d + 17;
        f4381b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void syncDelayedOnboardings(SyncDelayedOnboardingListener syncDelayedOnboardingListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 107;
        f4381b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(syncDelayedOnboardingListener, "");
        } else {
            Intrinsics.checkNotNullParameter(syncDelayedOnboardingListener, "");
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void deleteAllDelayedOnboardings() {
        int i2 = 2 % 2;
        int i3 = f4381b + 87;
        f4383d = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void startWorkflow(Context context, SessionConfig sessionConfig, IncodeWelcome.OnboardingListener onboardingListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 99;
        f4383d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sessionConfig, "");
        Intrinsics.checkNotNullParameter(onboardingListener, "");
        int i5 = f4381b + 77;
        f4383d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void startFaceLogin(Context context, SelfieScan selfieScan, SelfieScanListener selfieScanListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 123;
        f4381b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(selfieScan, "");
            Intrinsics.checkNotNullParameter(selfieScanListener, "");
            int i4 = 5 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(selfieScan, "");
            Intrinsics.checkNotNullParameter(selfieScanListener, "");
        }
        int i5 = f4381b + 33;
        f4383d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void startFaceLogin(Context context, SessionConfig sessionConfig, SelfieScan selfieScan, SelfieScanListener selfieScanListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 101;
        f4381b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(sessionConfig, "");
            Intrinsics.checkNotNullParameter(selfieScan, "");
            Intrinsics.checkNotNullParameter(selfieScanListener, "");
            return;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sessionConfig, "");
        Intrinsics.checkNotNullParameter(selfieScan, "");
        Intrinsics.checkNotNullParameter(selfieScanListener, "");
        throw null;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void finishOnboarding(Context context, FinishOnboardingListener finishOnboardingListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 85;
        f4383d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int i5 = f4381b + 103;
        f4383d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void getUserScore(IncodeWelcome.IDResultsFetchMode iDResultsFetchMode, String str, GetUserScoreListener getUserScoreListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 87;
        f4383d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iDResultsFetchMode, "");
            Intrinsics.checkNotNullParameter(getUserScoreListener, "");
        } else {
            Intrinsics.checkNotNullParameter(iDResultsFetchMode, "");
            Intrinsics.checkNotNullParameter(getUserScoreListener, "");
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void getReport(String str, ReportListener reportListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 39;
        f4381b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(reportListener, "");
        } else {
            Intrinsics.checkNotNullParameter(reportListener, "");
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public String getInterviewId() {
        int i2 = 2 % 2;
        int i3 = f4381b;
        int i4 = i3 + 95;
        f4383d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 31;
        f4383d = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public String getVideoSelfiePath() {
        int i2 = 2 % 2;
        int i3 = f4381b;
        int i4 = i3 + 19;
        f4383d = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 43;
        f4383d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 28 / 0;
        }
        return null;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public boolean isTokenInitialized() {
        int i2 = 2 % 2;
        int i3 = f4381b + 85;
        f4383d = i3 % 128;
        return i3 % 2 == 0;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void faceMatch(String str, IdCategory idCategory, FaceMatchListener faceMatchListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 53;
        f4381b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(faceMatchListener, "");
        int i5 = f4383d + 67;
        f4381b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void faceMatch(String str, FaceMatch.MatchType matchType, IdCategory idCategory, FaceMatchListener faceMatchListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 29;
        f4381b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(faceMatchListener, "");
            int i4 = 34 / 0;
        } else {
            Intrinsics.checkNotNullParameter(faceMatchListener, "");
        }
        int i5 = f4383d + 117;
        f4381b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void geolocation(Context context, String str, GeolocationListener geolocationListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 87;
        f4383d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(geolocationListener, "");
        int i5 = f4383d + 43;
        f4381b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void processId(String str, IdCategory idCategory, IdProcessListener idProcessListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 95;
        f4383d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(idProcessListener, "");
            return;
        }
        Intrinsics.checkNotNullParameter(idProcessListener, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void processLaborHistory(String str, String str2, ProcessLaborHistoryListener processLaborHistoryListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 77;
        f4383d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(processLaborHistoryListener, "");
        int i5 = f4381b + 105;
        f4383d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void processPaymentProof(String str, ProcessPaymentProofListener processPaymentProofListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 17;
        f4381b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(processPaymentProofListener, "");
        int i5 = f4383d + 23;
        f4381b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void processAntifraud(String str, AntifraudListener antifraudListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 93;
        f4383d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(antifraudListener, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(antifraudListener, "");
        int i4 = f4383d + 17;
        f4381b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void processCustomWatchlist(String str, ProcessCustomWatchlistListener processCustomWatchlistListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 27;
        f4383d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(processCustomWatchlistListener, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(processCustomWatchlistListener, "");
        int i4 = f4381b + 9;
        f4383d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void getPaymentProofInfo(String str, PaymentProofInfoListener paymentProofInfoListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 77;
        f4383d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(paymentProofInfoListener, "");
        int i5 = f4381b + 45;
        f4383d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void setStrings(Locale locale, Map<String, ? extends CharSequence> map) {
        int i2 = 2 % 2;
        int i3 = f4381b + 117;
        f4383d = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void setStringArray(Locale locale, Map<String, CharSequence[]> map) {
        int i2 = 2 % 2;
        int i3 = f4381b + 95;
        f4383d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void setQuantityStrings(Locale locale, Map<String, ? extends Map<QuantityKeyword, ? extends CharSequence>> map) {
        int i2 = 2 % 2;
        int i3 = f4383d + 29;
        f4381b = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void addNOM151Archive(String str, AddNOM151ArchiveListener addNOM151ArchiveListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 97;
        f4383d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(addNOM151ArchiveListener, "");
        int i5 = f4381b + 65;
        f4383d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 80 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void getUserOCRData(String str, GetUserOCRDataListener getUserOCRDataListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 59;
        f4381b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(getUserOCRDataListener, "");
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(getUserOCRDataListener, "");
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void setFaces(List<FaceInfo> list, FaceEventListener faceEventListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 61;
        f4383d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            int i4 = 23 / 0;
        } else {
            Intrinsics.checkNotNullParameter(list, "");
        }
        int i5 = f4383d + 11;
        f4381b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void addFace(FaceInfo faceInfo, FaceEventListener faceEventListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 103;
        f4383d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(faceInfo, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(faceInfo, "");
        int i4 = f4383d + 71;
        f4381b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void removeFace(String str, FaceEventListener faceEventListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 33;
        f4381b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i5 = f4383d + 115;
        f4381b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void removeAllFaces(FaceEventListener faceEventListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 43;
        f4381b = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void getFaces(FaceInfoListener faceInfoListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 39;
        f4383d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(faceInfoListener, "");
        } else {
            Intrinsics.checkNotNullParameter(faceInfoListener, "");
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void syncFaceLoginAttempts(SyncFaceLoginAttemptsListener syncFaceLoginAttemptsListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 93;
        f4383d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(syncFaceLoginAttemptsListener, "");
        int i5 = f4381b + 31;
        f4383d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    public void setFaceAuthenticationHint(String str) {
        int i2 = 2 % 2;
        int i3 = f4381b + 121;
        f4383d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    @Deprecated(message = "This method is deprecated and should no longer be used", replaceWith = @ReplaceWith(expression = "setFaces(faceInfoList, faceEventListener)", imports = {}))
    public void setFaces(List<FaceInfo> list) {
        int i2 = 2 % 2;
        int i3 = f4383d + 11;
        f4381b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        int i4 = f4383d + 91;
        f4381b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    @Deprecated(message = "This method is deprecated and should no longer be used", replaceWith = @ReplaceWith(expression = "addFace(faceInfo, faceEventListener)", imports = {}))
    public void addFace(FaceInfo faceInfo) {
        int i2 = 2 % 2;
        int i3 = f4383d + 15;
        f4381b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(faceInfo, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(faceInfo, "");
        int i4 = f4383d + 27;
        f4381b = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    @Deprecated(message = "This method is deprecated and should no longer be used", replaceWith = @ReplaceWith(expression = "removeFace(customerUUID, faceEventListener)", imports = {}))
    public void removeFace(String str) {
        int i2 = 2 % 2;
        int i3 = f4383d + 53;
        f4381b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i5 = f4383d + 21;
        f4381b = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    @Deprecated(message = "This method is deprecated and should no longer be used.")
    public void fetchAllFlows(String str, IncodeWelcome.FetchFlowsListener fetchFlowsListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 111;
        f4381b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    @Deprecated(message = "This method is deprecated and should no longer be used.")
    public void fetchFlow(String str, String str2, IncodeWelcome.FetchFlowListener fetchFlowListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 89;
        f4381b = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    @Deprecated(message = "This method is deprecated as the region is no longer necessary in the onboarding flow.")
    public void fetchRegions(FetchRegionsListener fetchRegionsListener) {
        int i2 = 2 % 2;
        int i3 = f4383d + 81;
        f4381b = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    @Deprecated(message = "Libraries are now bundled with the SDK, and always available. This function should not be used anymore.")
    public void downloadLibraries() {
        int i2 = 2 % 2;
        int i3 = f4381b + 123;
        f4383d = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    @Deprecated(message = "Libraries are now bundled with the SDK, and always available. This function always returns true.")
    public boolean isLibrariesReady() {
        int i2 = 2 % 2;
        int i3 = f4383d + 97;
        int i4 = i3 % 128;
        f4381b = i4;
        boolean z2 = i3 % 2 == 0;
        int i5 = i4 + 89;
        f4383d = i5 % 128;
        if (i5 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.IIncodeWelcome
    @Deprecated(message = "Libraries are now bundled with the SDK, and always available. FaceRecognitionPrepareListener#onFaceRecognitionReady() is called immediately")
    public void subscribeForLibrariesReady(FaceRecognitionPrepareListener faceRecognitionPrepareListener) {
        int i2 = 2 % 2;
        int i3 = f4381b + 71;
        f4383d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(faceRecognitionPrepareListener, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(faceRecognitionPrepareListener, "");
        int i4 = f4381b + 105;
        f4383d = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i2 = 97 % 2;
    }
}
