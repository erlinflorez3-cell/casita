package com.incode.welcome_sdk;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.results.AESResult;
import com.incode.welcome_sdk.results.AntifraudResult;
import com.incode.welcome_sdk.results.ApproveResult;
import com.incode.welcome_sdk.results.CaptchaResult;
import com.incode.welcome_sdk.results.CombinedConsentResult;
import com.incode.welcome_sdk.results.CurpValidationResult;
import com.incode.welcome_sdk.results.CustomWatchlistResult;
import com.incode.welcome_sdk.results.DocumentValidationResult;
import com.incode.welcome_sdk.results.DynamicFormsResult;
import com.incode.welcome_sdk.results.EKYBResult;
import com.incode.welcome_sdk.results.EKYCResult;
import com.incode.welcome_sdk.results.EmailAddressResult;
import com.incode.welcome_sdk.results.FaceAuthenticationResult;
import com.incode.welcome_sdk.results.FaceMatchResult;
import com.incode.welcome_sdk.results.GeolocationResult;
import com.incode.welcome_sdk.results.GlobalWatchlistResult;
import com.incode.welcome_sdk.results.IdInfoResult;
import com.incode.welcome_sdk.results.IdProcessResult;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.results.IdValidationResult;
import com.incode.welcome_sdk.results.InterviewEventResult;
import com.incode.welcome_sdk.results.MachineLearningConsentResult;
import com.incode.welcome_sdk.results.NameResult;
import com.incode.welcome_sdk.results.NfcScanResult;
import com.incode.welcome_sdk.results.PhoneNumberResult;
import com.incode.welcome_sdk.results.QESResult;
import com.incode.welcome_sdk.results.QRScanResult;
import com.incode.welcome_sdk.results.SelfieScanResult;
import com.incode.welcome_sdk.results.SignatureFormResult;
import com.incode.welcome_sdk.results.UserScoreResult;
import com.incode.welcome_sdk.results.VideoSelfieResult;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class a extends IncodeWelcome.OnboardingListener {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f4416b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4417c = 3 % 128;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4418d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f4419e = 0;
    private IncodeWelcome.OnboardingListener delegatedOnboardingListener;
    private final IncodeWelcome.OnboardingListener onboardingListener;

    public a(IncodeWelcome.OnboardingListener onboardingListener, boolean z2) {
        Intrinsics.checkNotNullParameter(onboardingListener, "");
        this.onboardingListener = onboardingListener;
        if (z2) {
            return;
        }
        this.delegatedOnboardingListener = onboardingListener;
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.SuccessListener
    public void onSuccess() {
        int i2 = 2 % 2;
        int i3 = f4418d + 87;
        f4416b = i3 % 128;
        int i4 = i3 % 2;
        this.onboardingListener.onSuccess();
        int i5 = f4418d + 123;
        f4416b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.EventListener
    public void onEvent(Event event, HashMap<String, Object> map) {
        int i2 = 2 % 2;
        int i3 = f4418d + 77;
        f4416b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(event, "");
            this.onboardingListener.onEvent(event, map);
        } else {
            Intrinsics.checkNotNullParameter(event, "");
            this.onboardingListener.onEvent(event, map);
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.EventListener
    public void onEvent(InterviewEventResult interviewEventResult) {
        int i2 = 2 % 2;
        int i3 = f4416b + 111;
        f4418d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(interviewEventResult, "");
        this.onboardingListener.onEvent(interviewEventResult);
        int i5 = f4416b + 53;
        f4418d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.UserCancelledListener
    public void onUserCancelled() {
        int i2 = 2 % 2;
        int i3 = f4418d + 45;
        f4416b = i3 % 128;
        int i4 = i3 % 2;
        this.onboardingListener.onUserCancelled();
        int i5 = f4416b + 71;
        f4418d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.OnboardingSectionCompletedListener
    public void onOnboardingSectionCompleted(String str) {
        int i2 = 2 % 2;
        int i3 = f4416b + 115;
        f4418d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onboardingListener.onOnboardingSectionCompleted(str);
        int i5 = f4416b + 85;
        f4418d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.AntifraudListener
    public void onAntifraudCompleted(AntifraudResult antifraudResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(antifraudResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener == null) {
            int i3 = f4418d + 17;
            f4416b = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = f4416b + 61;
        f4418d = i4 % 128;
        int i5 = i4 % 2;
        onboardingListener.onAntifraudCompleted(antifraudResult);
        Unit unit = Unit.INSTANCE;
        if (i5 != 0) {
            int i6 = 33 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.DynamicFormsListener
    public void onDynamicFormsCompleted(DynamicFormsResult dynamicFormsResult) {
        int i2 = 2 % 2;
        int i3 = f4416b + 121;
        f4418d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(dynamicFormsResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            int i5 = f4418d + 73;
            f4416b = i5 % 128;
            int i6 = i5 % 2;
            onboardingListener.onDynamicFormsCompleted(dynamicFormsResult);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.ProcessGlobalWatchlistListener
    public void onGlobalWatchlistProcessed(GlobalWatchlistResult globalWatchlistResult) {
        int i2 = 2 % 2;
        int i3 = f4416b + 45;
        f4418d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(globalWatchlistResult, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(globalWatchlistResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onGlobalWatchlistProcessed(globalWatchlistResult);
            Unit unit = Unit.INSTANCE;
            int i4 = f4418d + 51;
            f4416b = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.OnboardingSessionListener
    public void onOnboardingSessionCreated(String str, String str2, String str3) {
        int i2 = 2 % 2;
        int i3 = f4418d + 79;
        f4416b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str3, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str3, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onOnboardingSessionCreated(str, str2, str3);
            Unit unit = Unit.INSTANCE;
        } else {
            int i4 = f4416b + 111;
            f4418d = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.QRScanListener
    public void onQRScanCompleted(QRScanResult qRScanResult) {
        IncodeWelcome.OnboardingListener onboardingListener;
        int i2 = 2 % 2;
        int i3 = f4416b + 77;
        f4418d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(qRScanResult, "");
            onboardingListener = this.delegatedOnboardingListener;
            int i4 = 12 / 0;
            if (onboardingListener == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(qRScanResult, "");
            onboardingListener = this.delegatedOnboardingListener;
            if (onboardingListener == null) {
                return;
            }
        }
        onboardingListener.onQRScanCompleted(qRScanResult);
        Unit unit = Unit.INSTANCE;
        int i5 = f4418d + 15;
        f4416b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener
    @Deprecated(message = "")
    public void onIdValidationCompleted(IdValidationResult idValidationResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(idValidationResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener == null) {
            int i3 = f4418d + 47;
            f4416b = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = f4418d + 115;
        f4416b = i5 % 128;
        int i6 = i5 % 2;
        onboardingListener.onIdValidationCompleted(idValidationResult);
        Unit unit = Unit.INSTANCE;
        if (i6 == 0) {
            int i7 = 56 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.CurpValidationListener
    public void onCurpValidationCompleted(CurpValidationResult curpValidationResult) {
        int i2 = 2 % 2;
        int i3 = f4416b + 101;
        f4418d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(curpValidationResult, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(curpValidationResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            int i4 = f4418d + 15;
            f4416b = i4 % 128;
            int i5 = i4 % 2;
            onboardingListener.onCurpValidationCompleted(curpValidationResult);
            Unit unit = Unit.INSTANCE;
            if (i5 == 0) {
                throw null;
            }
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.DocumentValidationListener
    public void onDocumentValidationCompleted(DocumentType documentType, DocumentValidationResult documentValidationResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 71;
        f4416b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(documentType, "");
            Intrinsics.checkNotNullParameter(documentValidationResult, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(documentType, "");
        Intrinsics.checkNotNullParameter(documentValidationResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onDocumentValidationCompleted(documentType, documentValidationResult);
            Unit unit = Unit.INSTANCE;
            return;
        }
        int i4 = f4416b + 61;
        f4418d = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.SelfieScanListener
    public void onSelfieScanCompleted(SelfieScanResult selfieScanResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 17;
        f4416b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(selfieScanResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onSelfieScanCompleted(selfieScanResult);
            Unit unit = Unit.INSTANCE;
            int i5 = f4416b + 97;
            f4418d = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.FaceMatchListener
    public void onFaceMatchCompleted(FaceMatchResult faceMatchResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(faceMatchResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener == null) {
            int i3 = f4418d + 35;
            f4416b = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = f4418d + 69;
        f4416b = i5 % 128;
        int i6 = i5 % 2;
        onboardingListener.onFaceMatchCompleted(faceMatchResult);
        Unit unit = Unit.INSTANCE;
        int i7 = f4418d + 11;
        f4416b = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.FaceAuthenticationListener
    public void onFaceAuthenticationCompleted(FaceAuthenticationResult faceAuthenticationResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(faceAuthenticationResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener == null) {
            int i3 = f4416b + 9;
            f4418d = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = f4418d + 5;
        f4416b = i5 % 128;
        int i6 = i5 % 2;
        onboardingListener.onFaceAuthenticationCompleted(faceAuthenticationResult);
        Unit unit = Unit.INSTANCE;
        if (i6 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.GovernmentValidationListener
    public void onGovernmentValidationCompleted(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f4416b;
        int i4 = i3 + 17;
        f4418d = i4 % 128;
        int i5 = i4 % 2;
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            int i6 = i3 + 89;
            f4418d = i6 % 128;
            int i7 = i6 % 2;
            onboardingListener.onGovernmentValidationCompleted(z2);
            Unit unit = Unit.INSTANCE;
            int i8 = f4418d + 1;
            f4416b = i8 % 128;
            if (i8 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.SignatureFormListener
    public void onSignatureCollected(SignatureFormResult signatureFormResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(signatureFormResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener == null) {
            int i3 = f4418d + 87;
            f4416b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 94 / 0;
                return;
            }
            return;
        }
        int i5 = f4418d + 65;
        f4416b = i5 % 128;
        int i6 = i5 % 2;
        onboardingListener.onSignatureCollected(signatureFormResult);
        Unit unit = Unit.INSTANCE;
        if (i6 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.UserConsentListener
    public void onUserConsentCompleted() {
        int i2 = 2 % 2;
        int i3 = f4416b;
        int i4 = i3 + 17;
        f4418d = i4 % 128;
        int i5 = i4 % 2;
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            int i6 = i3 + 95;
            f4418d = i6 % 128;
            int i7 = i6 % 2;
            onboardingListener.onUserConsentCompleted();
            Unit unit = Unit.INSTANCE;
            if (i7 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener
    public void onCombinedConsentCompleted(CombinedConsentResult combinedConsentResult) {
        int i2 = 2 % 2;
        int i3 = f4416b + 123;
        f4418d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(combinedConsentResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onCombinedConsentCompleted(combinedConsentResult);
            Unit unit = Unit.INSTANCE;
        } else {
            int i5 = f4418d + 113;
            f4416b = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.MachineLearningConsentListener
    public void onMachineLearningConsentCompleted(MachineLearningConsentResult machineLearningConsentResult) {
        int i2 = 2 % 2;
        int i3 = f4416b + 11;
        f4418d = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(machineLearningConsentResult, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(machineLearningConsentResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onMachineLearningConsentCompleted(machineLearningConsentResult);
            Unit unit = Unit.INSTANCE;
        } else {
            int i4 = f4418d + 69;
            f4416b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.ProcessCustomWatchlistListener
    public void onCustomWatchlistProcessed(CustomWatchlistResult customWatchlistResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 59;
        f4416b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(customWatchlistResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            int i5 = f4418d + 107;
            f4416b = i5 % 128;
            int i6 = i5 % 2;
            onboardingListener.onCustomWatchlistProcessed(customWatchlistResult);
            Unit unit = Unit.INSTANCE;
            int i7 = f4418d + 75;
            f4416b = i7 % 128;
            if (i7 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.PhoneNumberListener
    public void onAddPhoneCompleted(PhoneNumberResult phoneNumberResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 21;
        f4416b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(phoneNumberResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onAddPhoneCompleted(phoneNumberResult);
            Unit unit = Unit.INSTANCE;
            int i5 = f4416b + 43;
            f4418d = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.EmailAddressListener
    public void onAddEmailCompleted(EmailAddressResult emailAddressResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 57;
        f4416b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(emailAddressResult, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(emailAddressResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onAddEmailCompleted(emailAddressResult);
            Unit unit = Unit.INSTANCE;
            int i4 = f4416b + 121;
            f4418d = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r1 = r2 + 79;
        com.incode.welcome_sdk.a.f4416b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        r1.onEstimatedWaitingTime(r5);
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r1 != null) goto L6;
     */
    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.EstimatedWaitingTimeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEstimatedWaitingTime(int r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r2 = com.incode.welcome_sdk.a.f4418d
            int r1 = r2 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.a.f4416b = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L1c
            com.incode.welcome_sdk.IncodeWelcome$OnboardingListener r1 = r4.delegatedOnboardingListener
            r0 = 49
            int r0 = r0 / 0
            if (r1 == 0) goto L21
        L16:
            r1.onEstimatedWaitingTime(r5)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return
        L1c:
            com.incode.welcome_sdk.IncodeWelcome$OnboardingListener r1 = r4.delegatedOnboardingListener
            if (r1 == 0) goto L21
            goto L16
        L21:
            int r1 = r2 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.a.f4416b = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L2b
            return
        L2b:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.a.onEstimatedWaitingTime(int):void");
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.GeolocationListener
    public void onGeolocationFetched(GeolocationResult geolocationResult) {
        IncodeWelcome.OnboardingListener onboardingListener;
        int i2 = 2 % 2;
        int i3 = f4418d + 55;
        f4416b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(geolocationResult, "");
            onboardingListener = this.delegatedOnboardingListener;
            int i4 = 34 / 0;
            if (onboardingListener == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(geolocationResult, "");
            onboardingListener = this.delegatedOnboardingListener;
            if (onboardingListener == null) {
                return;
            }
        }
        onboardingListener.onGeolocationFetched(geolocationResult);
        Unit unit = Unit.INSTANCE;
        int i5 = f4418d + 53;
        f4416b = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IntroListener
    public void onIntroCompleted() {
        int i2 = 2 % 2;
        int i3 = f4418d;
        int i4 = i3 + 59;
        int i5 = i4 % 128;
        f4416b = i5;
        int i6 = i4 % 2;
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener == null) {
            int i7 = i3 + 75;
            f4416b = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        int i9 = i5 + 121;
        f4418d = i9 % 128;
        int i10 = i9 % 2;
        onboardingListener.onIntroCompleted();
        Unit unit = Unit.INSTANCE;
        int i11 = f4416b + 35;
        f4418d = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.NameListener
    public void onAddNameCompleted(NameResult nameResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 63;
        f4416b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nameResult, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(nameResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onAddNameCompleted(nameResult);
            Unit unit = Unit.INSTANCE;
            return;
        }
        int i4 = f4418d + 99;
        f4416b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.ApproveListener
    public void onApproveCompleted(ApproveResult approveResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 47;
        f4416b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(approveResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onApproveCompleted(approveResult);
            Unit unit = Unit.INSTANCE;
            int i5 = f4416b + 103;
            f4418d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 74 / 0;
            }
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.UserScoreListener
    public void onResultsShown(UserScoreResult userScoreResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 55;
        f4416b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(userScoreResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onResultsShown(userScoreResult);
            Unit unit = Unit.INSTANCE;
            int i5 = f4416b + 25;
            f4418d = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.AcceptVideoSelfieListener
    public void onUserAcceptedVideoSelfie() {
        int i2 = 2 % 2;
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            int i3 = f4416b + 69;
            f4418d = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            onboardingListener.onUserAcceptedVideoSelfie();
            if (i4 != 0) {
                Unit unit = Unit.INSTANCE;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i5 = f4416b + 35;
            f4418d = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.VideoSelfieListener
    public void onVideoRecorded(VideoSelfieResult videoSelfieResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 51;
        f4416b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(videoSelfieResult, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(videoSelfieResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onVideoRecorded(videoSelfieResult);
            Unit unit = Unit.INSTANCE;
        } else {
            int i4 = f4416b + 39;
            f4418d = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.CaptchaListener
    public void onCaptchaCollected(CaptchaResult captchaResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 17;
        f4416b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(captchaResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onCaptchaCollected(captchaResult);
            Unit unit = Unit.INSTANCE;
            int i5 = f4416b + 25;
            f4418d = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.QueuePositionChangeListener
    public void onQueuePositionChanged(int i2) {
        IncodeWelcome.OnboardingListener onboardingListener;
        int i3 = 2 % 2;
        int i4 = f4416b + 97;
        f4418d = i4 % 128;
        if (i4 % 2 != 0) {
            onboardingListener = this.delegatedOnboardingListener;
            int i5 = 41 / 0;
            if (onboardingListener == null) {
                return;
            }
        } else {
            onboardingListener = this.delegatedOnboardingListener;
            if (onboardingListener == null) {
                return;
            }
        }
        onboardingListener.onQueuePositionChanged(i2);
        Unit unit = Unit.INSTANCE;
        int i6 = f4416b + 121;
        f4418d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 25 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.VideoConferenceListener
    public void onConferenceEnded() {
        int i2 = 2 % 2;
        int i3 = f4418d;
        int i4 = i3 + 23;
        f4416b = i4 % 128;
        int i5 = i4 % 2;
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            int i6 = i3 + 111;
            f4416b = i6 % 128;
            int i7 = i6 % 2;
            onboardingListener.onConferenceEnded();
            Unit unit = Unit.INSTANCE;
            if (i7 == 0) {
                throw null;
            }
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.GeolocationListener
    public void onGeolocationUnavailable(Throwable th) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener == null) {
            int i3 = f4416b + 35;
            f4418d = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i4 = f4416b + 95;
        f4418d = i4 % 128;
        int i5 = i4 % 2;
        onboardingListener.onGeolocationUnavailable(th);
        Unit unit = Unit.INSTANCE;
        if (i5 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IdScanListener
    public void onIdFrontCompleted(IdScanResult idScanResult) {
        int i2 = 2 % 2;
        int i3 = f4416b + 23;
        f4418d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(idScanResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            int i5 = f4418d + 51;
            f4416b = i5 % 128;
            int i6 = i5 % 2;
            onboardingListener.onIdFrontCompleted(idScanResult);
            Unit unit = Unit.INSTANCE;
            int i7 = f4416b + 35;
            f4418d = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IdScanListener
    public void onIdBackCompleted(IdScanResult idScanResult) {
        int i2 = 2 % 2;
        int i3 = f4416b + 23;
        f4418d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(idScanResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onIdBackCompleted(idScanResult);
            Unit unit = Unit.INSTANCE;
        } else {
            int i5 = f4416b + 47;
            f4418d = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IdProcessListener
    public void onIdProcessed(IdProcessResult idProcessResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 103;
        f4416b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(idProcessResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener == null) {
            int i5 = f4418d + 121;
            f4416b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 18 / 0;
                return;
            }
            return;
        }
        int i7 = f4416b + 109;
        f4418d = i7 % 128;
        int i8 = i7 % 2;
        onboardingListener.onIdProcessed(idProcessResult);
        Unit unit = Unit.INSTANCE;
        if (i8 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.NfcScanListener
    public void onNfcScanCompleted(NfcScanResult nfcScanResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(nfcScanResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener == null) {
            int i3 = f4418d + 75;
            f4416b = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = f4416b + 125;
            f4418d = i5 % 128;
            int i6 = i5 % 2;
            onboardingListener.onNfcScanCompleted(nfcScanResult);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.SSLPinningFailedListener
    public void onSSLPinningFailed() {
        int i2 = 2 % 2;
        int i3 = f4416b;
        int i4 = i3 + 25;
        f4418d = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            int i5 = i3 + 53;
            f4418d = i5 % 128;
            int i6 = i5 % 2;
            onboardingListener.onSSLPinningFailed();
            Unit unit = Unit.INSTANCE;
            if (i6 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.EKYCListener
    public void onEKYCChecksCompleted(EKYCResult eKYCResult) {
        int i2 = 2 % 2;
        int i3 = f4416b + 17;
        f4418d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(eKYCResult, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(eKYCResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onEKYCChecksCompleted(eKYCResult);
            Unit unit = Unit.INSTANCE;
        } else {
            int i4 = f4416b + 49;
            f4418d = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.AESListener
    public void onAESCompleted(AESResult aESResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 35;
        f4416b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(aESResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onAESCompleted(aESResult);
            Unit unit = Unit.INSTANCE;
        } else {
            int i5 = f4418d + 35;
            f4416b = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.QESListener
    public void onQESCompleted(QESResult qESResult) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(qESResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener == null) {
            int i3 = f4416b + 97;
            f4418d = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = f4416b + 109;
        f4418d = i5 % 128;
        int i6 = i5 % 2;
        onboardingListener.onQESCompleted(qESResult);
        Unit unit = Unit.INSTANCE;
        if (i6 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.ErrorListener
    public void onError(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f4416b + 51;
        f4418d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            int i5 = f4416b + 67;
            f4418d = i5 % 128;
            int i6 = i5 % 2;
            onboardingListener.onError(th);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.EKYBListener
    public void onEKYBChecksCompleted(EKYBResult eKYBResult) {
        int i2 = 2 % 2;
        int i3 = f4416b + 93;
        f4418d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(eKYBResult, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(eKYBResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onEKYBChecksCompleted(eKYBResult);
            Unit unit = Unit.INSTANCE;
        } else {
            int i4 = f4416b + 47;
            f4418d = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IdInfoListener
    public void onIdInfoCompleted(IdInfoResult idInfoResult) {
        int i2 = 2 % 2;
        int i3 = f4418d + 65;
        f4416b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(idInfoResult, "");
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            int i5 = f4418d + 9;
            f4416b = i5 % 128;
            int i6 = i5 % 2;
            onboardingListener.onIdInfoCompleted(idInfoResult);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.TaxIdValidationListener
    public void onTaxIdValidationCompleted(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f4416b + 83;
        f4418d = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        IncodeWelcome.OnboardingListener onboardingListener = this.delegatedOnboardingListener;
        if (onboardingListener != null) {
            onboardingListener.onTaxIdValidationCompleted(z2);
            Unit unit = Unit.INSTANCE;
            int i4 = f4418d + 123;
            f4416b = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
        }
    }

    static {
        int i2 = 3 % 2;
    }
}
