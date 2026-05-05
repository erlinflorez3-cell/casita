package com.rnbiometrics;

import androidx.biometric.BiometricPrompt;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes5.dex */
public class SimplePromptCallback extends BiometricPrompt.AuthenticationCallback {
    private Promise promise;

    public SimplePromptCallback(Promise promise) {
        this.promise = promise;
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i2, CharSequence charSequence) {
        super.onAuthenticationError(i2, charSequence);
        if (i2 != 13 && i2 != 10) {
            this.promise.reject(charSequence.toString(), charSequence.toString());
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean(FirebaseAnalytics.Param.SUCCESS, false);
        writableNativeMap.putString("error", "User cancellation");
        this.promise.resolve(writableNativeMap);
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        super.onAuthenticationSucceeded(authenticationResult);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean(FirebaseAnalytics.Param.SUCCESS, true);
        this.promise.resolve(writableNativeMap);
    }
}
