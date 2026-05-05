package androidx.biometric;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class BiometricPrompt {
    public static final int AUTHENTICATION_RESULT_TYPE_BIOMETRIC = 2;
    public static final int AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL = 1;
    public static final int AUTHENTICATION_RESULT_TYPE_UNKNOWN = -1;
    static final String BIOMETRIC_FRAGMENT_TAG = "androidx.biometric.BiometricFragment";
    static final int BIOMETRIC_SUCCESS = 0;
    public static final int ERROR_CANCELED = 5;
    public static final int ERROR_HW_NOT_PRESENT = 12;
    public static final int ERROR_HW_UNAVAILABLE = 1;
    public static final int ERROR_LOCKOUT = 7;
    public static final int ERROR_LOCKOUT_PERMANENT = 9;
    public static final int ERROR_NEGATIVE_BUTTON = 13;
    public static final int ERROR_NO_BIOMETRICS = 11;
    public static final int ERROR_NO_DEVICE_CREDENTIAL = 14;
    public static final int ERROR_NO_SPACE = 4;
    public static final int ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int ERROR_TIMEOUT = 3;
    public static final int ERROR_UNABLE_TO_PROCESS = 2;
    public static final int ERROR_USER_CANCELED = 10;
    public static final int ERROR_VENDOR = 8;
    private static final String TAG = "BiometricPromptCompat";
    private FragmentManager mClientFragmentManager;
    private boolean mHostedInActivity;

    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i2, CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface AuthenticationError {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class CryptoObject {
        private final Cipher mCipher;
        private final IdentityCredential mIdentityCredential;
        private final Mac mMac;
        private final PresentationSession mPresentationSession;
        private final Signature mSignature;

        public CryptoObject(Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
            this.mIdentityCredential = null;
            this.mPresentationSession = null;
        }

        public CryptoObject(Cipher cipher) {
            this.mSignature = null;
            this.mCipher = cipher;
            this.mMac = null;
            this.mIdentityCredential = null;
            this.mPresentationSession = null;
        }

        public CryptoObject(Mac mac) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = mac;
            this.mIdentityCredential = null;
            this.mPresentationSession = null;
        }

        public CryptoObject(IdentityCredential identityCredential) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = null;
            this.mIdentityCredential = identityCredential;
            this.mPresentationSession = null;
        }

        public CryptoObject(PresentationSession presentationSession) {
            this.mSignature = null;
            this.mCipher = null;
            this.mMac = null;
            this.mIdentityCredential = null;
            this.mPresentationSession = presentationSession;
        }

        public Signature getSignature() {
            return this.mSignature;
        }

        public Cipher getCipher() {
            return this.mCipher;
        }

        public Mac getMac() {
            return this.mMac;
        }

        public IdentityCredential getIdentityCredential() {
            return this.mIdentityCredential;
        }

        public PresentationSession getPresentationSession() {
            return this.mPresentationSession;
        }
    }

    public static class AuthenticationResult {
        private final int mAuthenticationType;
        private final CryptoObject mCryptoObject;

        AuthenticationResult(CryptoObject cryptoObject, int i2) {
            this.mCryptoObject = cryptoObject;
            this.mAuthenticationType = i2;
        }

        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }

        public int getAuthenticationType() {
            return this.mAuthenticationType;
        }
    }

    public static class PromptInfo {
        private final int mAllowedAuthenticators;
        private final CharSequence mDescription;
        private final boolean mIsConfirmationRequired;
        private final boolean mIsDeviceCredentialAllowed;
        private final CharSequence mNegativeButtonText;
        private final CharSequence mSubtitle;
        private final CharSequence mTitle;

        public static class Builder {
            private CharSequence mTitle = null;
            private CharSequence mSubtitle = null;
            private CharSequence mDescription = null;
            private CharSequence mNegativeButtonText = null;
            private boolean mIsConfirmationRequired = true;
            private boolean mIsDeviceCredentialAllowed = false;
            private int mAllowedAuthenticators = 0;

            public Builder setTitle(CharSequence charSequence) {
                this.mTitle = charSequence;
                return this;
            }

            public Builder setSubtitle(CharSequence charSequence) {
                this.mSubtitle = charSequence;
                return this;
            }

            public Builder setDescription(CharSequence charSequence) {
                this.mDescription = charSequence;
                return this;
            }

            public Builder setNegativeButtonText(CharSequence charSequence) {
                this.mNegativeButtonText = charSequence;
                return this;
            }

            public Builder setConfirmationRequired(boolean z2) {
                this.mIsConfirmationRequired = z2;
                return this;
            }

            @Deprecated
            public Builder setDeviceCredentialAllowed(boolean z2) {
                this.mIsDeviceCredentialAllowed = z2;
                return this;
            }

            public Builder setAllowedAuthenticators(int i2) {
                this.mAllowedAuthenticators = i2;
                return this;
            }

            public PromptInfo build() {
                boolean zIsDeviceCredentialAllowed;
                if (TextUtils.isEmpty(this.mTitle)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                }
                if (!AuthenticatorUtils.isSupportedCombination(this.mAllowedAuthenticators)) {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + AuthenticatorUtils.convertToString(this.mAllowedAuthenticators));
                }
                int i2 = this.mAllowedAuthenticators;
                if (i2 != 0) {
                    zIsDeviceCredentialAllowed = AuthenticatorUtils.isDeviceCredentialAllowed(i2);
                } else {
                    zIsDeviceCredentialAllowed = this.mIsDeviceCredentialAllowed;
                }
                if (TextUtils.isEmpty(this.mNegativeButtonText) && !zIsDeviceCredentialAllowed) {
                    throw new IllegalArgumentException("Negative text must be set and non-empty.");
                }
                if (!TextUtils.isEmpty(this.mNegativeButtonText) && zIsDeviceCredentialAllowed) {
                    throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                }
                return new PromptInfo(this.mTitle, this.mSubtitle, this.mDescription, this.mNegativeButtonText, this.mIsConfirmationRequired, this.mIsDeviceCredentialAllowed, this.mAllowedAuthenticators);
            }
        }

        PromptInfo(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z2, boolean z3, int i2) {
            this.mTitle = charSequence;
            this.mSubtitle = charSequence2;
            this.mDescription = charSequence3;
            this.mNegativeButtonText = charSequence4;
            this.mIsConfirmationRequired = z2;
            this.mIsDeviceCredentialAllowed = z3;
            this.mAllowedAuthenticators = i2;
        }

        public CharSequence getTitle() {
            return this.mTitle;
        }

        public CharSequence getSubtitle() {
            return this.mSubtitle;
        }

        public CharSequence getDescription() {
            return this.mDescription;
        }

        public CharSequence getNegativeButtonText() {
            CharSequence charSequence = this.mNegativeButtonText;
            return charSequence != null ? charSequence : "";
        }

        public boolean isConfirmationRequired() {
            return this.mIsConfirmationRequired;
        }

        @Deprecated
        public boolean isDeviceCredentialAllowed() {
            return this.mIsDeviceCredentialAllowed;
        }

        public int getAllowedAuthenticators() {
            return this.mAllowedAuthenticators;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    private static class ResetCallbackObserver implements DefaultLifecycleObserver {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        ResetCallbackObserver(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().resetClientCallback();
            }
        }
    }

    public BiometricPrompt(FragmentActivity fragmentActivity, AuthenticationCallback authenticationCallback) {
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (authenticationCallback == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        init(true, fragmentActivity.getSupportFragmentManager(), (BiometricViewModel) new ViewModelProvider(fragmentActivity).get(BiometricViewModel.class), null, authenticationCallback);
    }

    public BiometricPrompt(Fragment fragment, AuthenticationCallback authenticationCallback) {
        if (fragment == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        }
        if (authenticationCallback == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ViewModelProvider(fragment).get(BiometricViewModel.class);
        addObservers(fragment, biometricViewModel);
        init(false, childFragmentManager, biometricViewModel, null, authenticationCallback);
    }

    public BiometricPrompt(FragmentActivity fragmentActivity, Executor executor, AuthenticationCallback authenticationCallback) {
        if (fragmentActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (authenticationCallback == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        init(true, fragmentActivity.getSupportFragmentManager(), (BiometricViewModel) new ViewModelProvider(fragmentActivity).get(BiometricViewModel.class), executor, authenticationCallback);
    }

    public BiometricPrompt(Fragment fragment, Executor executor, AuthenticationCallback authenticationCallback) {
        if (fragment == null) {
            throw new IllegalArgumentException("Fragment must not be null.");
        }
        if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        }
        if (authenticationCallback == null) {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ViewModelProvider(fragment).get(BiometricViewModel.class);
        addObservers(fragment, biometricViewModel);
        init(false, childFragmentManager, biometricViewModel, executor, authenticationCallback);
    }

    private void init(boolean z2, FragmentManager fragmentManager, BiometricViewModel biometricViewModel, Executor executor, AuthenticationCallback authenticationCallback) {
        this.mHostedInActivity = z2;
        this.mClientFragmentManager = fragmentManager;
        if (executor != null) {
            biometricViewModel.setClientExecutor(executor);
        }
        biometricViewModel.setClientCallback(authenticationCallback);
    }

    public void authenticate(PromptInfo promptInfo, CryptoObject cryptoObject) throws Throwable {
        if (promptInfo == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        if (cryptoObject == null) {
            throw new IllegalArgumentException("CryptoObject cannot be null.");
        }
        int consolidatedAuthenticators = AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, cryptoObject);
        if (AuthenticatorUtils.isWeakBiometricAllowed(consolidatedAuthenticators)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
        }
        if (Build.VERSION.SDK_INT < 30 && AuthenticatorUtils.isDeviceCredentialAllowed(consolidatedAuthenticators)) {
            throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
        }
        authenticateInternal(promptInfo, cryptoObject);
    }

    public void authenticate(PromptInfo promptInfo) throws Throwable {
        if (promptInfo == null) {
            throw new IllegalArgumentException("PromptInfo cannot be null.");
        }
        authenticateInternal(promptInfo, null);
    }

    private void authenticateInternal(PromptInfo promptInfo, CryptoObject cryptoObject) throws Throwable {
        FragmentManager fragmentManager = this.mClientFragmentManager;
        if (fragmentManager != null && !fragmentManager.isStateSaved()) {
            findOrAddBiometricFragment().authenticate(promptInfo, cryptoObject);
        }
    }

    public void cancelAuthentication() {
        BiometricFragment biometricFragmentFindBiometricFragment;
        FragmentManager fragmentManager = this.mClientFragmentManager;
        if (fragmentManager != null && (biometricFragmentFindBiometricFragment = findBiometricFragment(fragmentManager)) != null) {
            biometricFragmentFindBiometricFragment.cancelAuthentication(3);
        }
    }

    static BiometricViewModel getViewModel(Fragment fragment, boolean z2) {
        ViewModelStoreOwner activity = z2 ? fragment.getActivity() : null;
        if (activity == null) {
            activity = fragment.getParentFragment();
        }
        if (activity == null) {
            throw new IllegalStateException("view model not found");
        }
        return (BiometricViewModel) new ViewModelProvider(activity).get(BiometricViewModel.class);
    }

    private static void addObservers(Fragment fragment, BiometricViewModel biometricViewModel) {
        fragment.getLifecycle().addObserver(new ResetCallbackObserver(biometricViewModel));
    }

    private static BiometricFragment findBiometricFragment(FragmentManager fragmentManager) {
        return (BiometricFragment) fragmentManager.findFragmentByTag(BIOMETRIC_FRAGMENT_TAG);
    }

    private BiometricFragment findOrAddBiometricFragment() {
        BiometricFragment biometricFragmentFindBiometricFragment = findBiometricFragment(this.mClientFragmentManager);
        if (biometricFragmentFindBiometricFragment != null) {
            return biometricFragmentFindBiometricFragment;
        }
        BiometricFragment biometricFragmentNewInstance = BiometricFragment.newInstance(this.mHostedInActivity);
        this.mClientFragmentManager.beginTransaction().add(biometricFragmentNewInstance, BIOMETRIC_FRAGMENT_TAG).commitAllowingStateLoss();
        this.mClientFragmentManager.executePendingTransactions();
        return biometricFragmentNewInstance;
    }
}
