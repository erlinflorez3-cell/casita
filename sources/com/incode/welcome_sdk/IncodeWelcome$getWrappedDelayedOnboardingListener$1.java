package com.incode.welcome_sdk;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.c;
import com.incode.welcome_sdk.results.CombinedConsentResult;
import com.incode.welcome_sdk.results.DocumentValidationResult;
import com.incode.welcome_sdk.results.FaceMatchResult;
import com.incode.welcome_sdk.results.IdProcessResult;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.results.SelfieScanResult;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IncodeWelcome$getWrappedDelayedOnboardingListener$1 extends IncodeWelcome.OnboardingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f4184a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f4185c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f4186d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f4187e = 0;
    final /* synthetic */ IncodeWelcome.OnboardingListener $onboardingListener;

    IncodeWelcome$getWrappedDelayedOnboardingListener$1(IncodeWelcome.OnboardingListener onboardingListener) {
        this.$onboardingListener = onboardingListener;
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.SuccessListener
    public final void onSuccess() {
        int i2 = 2 % 2;
        int i3 = f4184a + 105;
        f4186d = i3 % 128;
        int i4 = i3 % 2;
        this.$onboardingListener.onSuccess();
        c.b bVar = c.f4426a;
        c.b.d().a();
        int i5 = f4184a + 21;
        f4186d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IdScanListener
    public final void onIdFrontCompleted(IdScanResult idScanResult) {
        int i2 = 2 % 2;
        int i3 = f4184a + 91;
        f4186d = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(idScanResult, "");
            this.$onboardingListener.onIdFrontCompleted(idScanResult);
        } else {
            Intrinsics.checkNotNullParameter(idScanResult, "");
            this.$onboardingListener.onIdFrontCompleted(idScanResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IdScanListener
    public final void onIdBackCompleted(IdScanResult idScanResult) {
        int i2 = 2 % 2;
        int i3 = f4184a + 123;
        f4186d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(idScanResult, "");
        this.$onboardingListener.onIdBackCompleted(idScanResult);
        int i5 = f4186d + 83;
        f4184a = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IdProcessListener
    public final void onIdProcessed(IdProcessResult idProcessResult) {
        int i2 = 2 % 2;
        int i3 = f4184a + 47;
        f4186d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(idProcessResult, "");
        this.$onboardingListener.onIdProcessed(idProcessResult);
        c.b bVar = c.f4426a;
        c.b.d().b();
        int i5 = f4186d + 35;
        f4184a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.DocumentValidationListener
    public final void onDocumentValidationCompleted(DocumentType documentType, DocumentValidationResult documentValidationResult) {
        int i2 = 2 % 2;
        int i3 = f4184a + 105;
        f4186d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(documentType, "");
            Intrinsics.checkNotNullParameter(documentValidationResult, "");
            this.$onboardingListener.onDocumentValidationCompleted(documentType, documentValidationResult);
            int i4 = 71 / 0;
        } else {
            Intrinsics.checkNotNullParameter(documentType, "");
            Intrinsics.checkNotNullParameter(documentValidationResult, "");
            this.$onboardingListener.onDocumentValidationCompleted(documentType, documentValidationResult);
        }
        int i5 = f4184a + 5;
        f4186d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.SelfieScanListener
    public final void onSelfieScanCompleted(SelfieScanResult selfieScanResult) {
        int i2 = 2 % 2;
        int i3 = f4186d + 13;
        f4184a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(selfieScanResult, "");
        this.$onboardingListener.onSelfieScanCompleted(selfieScanResult);
        int i5 = f4184a + 29;
        f4186d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.FaceMatchListener
    public final void onFaceMatchCompleted(FaceMatchResult faceMatchResult) {
        int i2 = 2 % 2;
        int i3 = f4186d + 43;
        f4184a = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(faceMatchResult, "");
            this.$onboardingListener.onFaceMatchCompleted(faceMatchResult);
            c.b bVar = c.f4426a;
            c.b.d().d();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(faceMatchResult, "");
        this.$onboardingListener.onFaceMatchCompleted(faceMatchResult);
        c.b bVar2 = c.f4426a;
        c.b.d().d();
        int i4 = f4186d + 57;
        f4184a = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener
    public final void onCombinedConsentCompleted(CombinedConsentResult combinedConsentResult) {
        int i2 = 2 % 2;
        int i3 = f4186d + 123;
        f4184a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(combinedConsentResult, "");
        this.$onboardingListener.onCombinedConsentCompleted(combinedConsentResult);
        int i5 = f4184a + 65;
        f4186d = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.UserCancelledListener
    public final void onUserCancelled() {
        int i2 = 2 % 2;
        int i3 = f4184a + 75;
        f4186d = i3 % 128;
        if (i3 % 2 != 0) {
            this.$onboardingListener.onUserCancelled();
            c.b bVar = c.f4426a;
            c.b.d().c();
            int i4 = f4186d + 29;
            f4184a = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.$onboardingListener.onUserCancelled();
        c.b bVar2 = c.f4426a;
        c.b.d().c();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.ErrorListener
    public final void onError(Throwable th) {
        int i2 = 2 % 2;
        int i3 = f4184a + 59;
        f4186d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        this.$onboardingListener.onError(th);
        c.b bVar = c.f4426a;
        c.b.d().c();
        int i5 = f4186d + 109;
        f4184a = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static int c() {
        int i2 = f4185c;
        int i3 = i2 % 7998417;
        f4185c = i2 + 1;
        if (i3 != 0) {
            return f4187e;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        f4187e = iMaxMemory;
        return iMaxMemory;
    }
}
