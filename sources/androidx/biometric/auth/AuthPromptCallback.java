package androidx.biometric.auth;

import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AuthPromptCallback {
    public void onAuthenticationError(FragmentActivity fragmentActivity, int i2, CharSequence charSequence) {
    }

    public void onAuthenticationFailed(FragmentActivity fragmentActivity) {
    }

    public void onAuthenticationSucceeded(FragmentActivity fragmentActivity, BiometricPrompt.AuthenticationResult authenticationResult) {
    }
}
