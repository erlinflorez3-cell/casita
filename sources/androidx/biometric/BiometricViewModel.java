package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.AuthenticationCallbackProvider;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public class BiometricViewModel extends ViewModel {
    private AuthenticationCallbackProvider mAuthenticationCallbackProvider;
    private MutableLiveData<BiometricErrorData> mAuthenticationError;
    private MutableLiveData<CharSequence> mAuthenticationHelpMessage;
    private MutableLiveData<BiometricPrompt.AuthenticationResult> mAuthenticationResult;
    private CancellationSignalProvider mCancellationSignalProvider;
    private WeakReference<FragmentActivity> mClientActivity;
    private BiometricPrompt.AuthenticationCallback mClientCallback;
    private Executor mClientExecutor;
    private BiometricPrompt.CryptoObject mCryptoObject;
    private MutableLiveData<CharSequence> mFingerprintDialogHelpMessage;
    private MutableLiveData<Integer> mFingerprintDialogState;
    private MutableLiveData<Boolean> mIsAuthenticationFailurePending;
    private boolean mIsAwaitingResult;
    private boolean mIsConfirmingDeviceCredential;
    private boolean mIsDelayingPrompt;
    private MutableLiveData<Boolean> mIsFingerprintDialogCancelPending;
    private boolean mIsIgnoringCancel;
    private MutableLiveData<Boolean> mIsNegativeButtonPressPending;
    private boolean mIsPromptShowing;
    private boolean mIsUsingKeyguardManagerForBiometricAndCredential;
    private DialogInterface.OnClickListener mNegativeButtonListener;
    private CharSequence mNegativeButtonTextOverride;
    private BiometricPrompt.PromptInfo mPromptInfo;
    private int mCanceledFrom = 0;
    private boolean mIsFingerprintDialogDismissedInstantly = true;
    private int mFingerprintDialogPreviousState = 0;

    private static class DefaultExecutor implements Executor {
        private final Handler mHandler;

        DefaultExecutor() throws Throwable {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.yd("4@5B>71y:=v\u0014655)5", (short) (ZN.Xd() ^ 22031))).getDeclaredMethod(C1561oA.Yd("\u007f~\u000fh}\u0007\rk\u0010\u0011\u0013\t\u0017", (short) (ZN.Xd() ^ 1892)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.mHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) throws Throwable {
            Handler handler = this.mHandler;
            Class<?> cls = Class.forName(Xg.qd("!/&53.*t7<w\u0013-;2;5C", (short) (OY.Xd() ^ 8574), (short) (OY.Xd() ^ 12082)));
            Class<?>[] clsArr = {Class.forName(Jg.Wd("JP4s\u000f eE\rh[Q\u001b}/t]9", (short) (ZN.Xd() ^ 19077), (short) (ZN.Xd() ^ 220)))};
            Object[] objArr = {runnable};
            short sXd = (short) (Od.Xd() ^ (-9846));
            short sXd2 = (short) (Od.Xd() ^ (-31370));
            int[] iArr = new int["l\u0003\u001aH".length()];
            QB qb = new QB("l\u0003\u001aH");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private static final class CallbackListener extends AuthenticationCallbackProvider.Listener {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        CallbackListener(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        void onSuccess(BiometricPrompt.AuthenticationResult authenticationResult) {
            if (this.mViewModelRef.get() == null || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            if (authenticationResult.getAuthenticationType() == -1) {
                authenticationResult = new BiometricPrompt.AuthenticationResult(authenticationResult.getCryptoObject(), this.mViewModelRef.get().getInferredAuthenticationResultType());
            }
            this.mViewModelRef.get().setAuthenticationResult(authenticationResult);
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        void onError(int i2, CharSequence charSequence) {
            if (this.mViewModelRef.get() == null || this.mViewModelRef.get().isConfirmingDeviceCredential() || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            this.mViewModelRef.get().setAuthenticationError(new BiometricErrorData(i2, charSequence));
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        void onHelp(CharSequence charSequence) throws Throwable {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setAuthenticationHelpMessage(charSequence);
            }
        }

        @Override // androidx.biometric.AuthenticationCallbackProvider.Listener
        void onFailure() {
            if (this.mViewModelRef.get() == null || !this.mViewModelRef.get().isAwaitingResult()) {
                return;
            }
            this.mViewModelRef.get().setAuthenticationFailurePending(true);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    private static class NegativeButtonListener implements DialogInterface.OnClickListener {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        NegativeButtonListener(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setNegativeButtonPressPending(true);
            }
        }
    }

    Executor getClientExecutor() {
        Executor executor = this.mClientExecutor;
        return executor != null ? executor : new DefaultExecutor();
    }

    void setClientExecutor(Executor executor) {
        this.mClientExecutor = executor;
    }

    /* JADX INFO: renamed from: androidx.biometric.BiometricViewModel$1 */
    class AnonymousClass1 extends BiometricPrompt.AuthenticationCallback {
        AnonymousClass1() {
        }
    }

    BiometricPrompt.AuthenticationCallback getClientCallback() {
        if (this.mClientCallback == null) {
            this.mClientCallback = new BiometricPrompt.AuthenticationCallback() { // from class: androidx.biometric.BiometricViewModel.1
                AnonymousClass1() {
                }
            };
        }
        return this.mClientCallback;
    }

    void setClientCallback(BiometricPrompt.AuthenticationCallback authenticationCallback) {
        this.mClientCallback = authenticationCallback;
    }

    void resetClientCallback() {
        this.mClientCallback = null;
    }

    public FragmentActivity getClientActivity() {
        WeakReference<FragmentActivity> weakReference = this.mClientActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    void setClientActivity(FragmentActivity fragmentActivity) {
        this.mClientActivity = new WeakReference<>(fragmentActivity);
    }

    void setPromptInfo(BiometricPrompt.PromptInfo promptInfo) {
        this.mPromptInfo = promptInfo;
    }

    CharSequence getTitle() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getTitle();
        }
        return null;
    }

    CharSequence getSubtitle() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getSubtitle();
        }
        return null;
    }

    CharSequence getDescription() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getDescription();
        }
        return null;
    }

    CharSequence getNegativeButtonText() {
        CharSequence charSequence = this.mNegativeButtonTextOverride;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return promptInfo.getNegativeButtonText();
        }
        return null;
    }

    boolean isConfirmationRequired() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        return promptInfo == null || promptInfo.isConfirmationRequired();
    }

    int getAllowedAuthenticators() {
        BiometricPrompt.PromptInfo promptInfo = this.mPromptInfo;
        if (promptInfo != null) {
            return AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, this.mCryptoObject);
        }
        return 0;
    }

    BiometricPrompt.CryptoObject getCryptoObject() {
        return this.mCryptoObject;
    }

    void setCryptoObject(BiometricPrompt.CryptoObject cryptoObject) {
        this.mCryptoObject = cryptoObject;
    }

    AuthenticationCallbackProvider getAuthenticationCallbackProvider() {
        if (this.mAuthenticationCallbackProvider == null) {
            this.mAuthenticationCallbackProvider = new AuthenticationCallbackProvider(new CallbackListener(this));
        }
        return this.mAuthenticationCallbackProvider;
    }

    CancellationSignalProvider getCancellationSignalProvider() {
        if (this.mCancellationSignalProvider == null) {
            this.mCancellationSignalProvider = new CancellationSignalProvider();
        }
        return this.mCancellationSignalProvider;
    }

    DialogInterface.OnClickListener getNegativeButtonListener() {
        if (this.mNegativeButtonListener == null) {
            this.mNegativeButtonListener = new NegativeButtonListener(this);
        }
        return this.mNegativeButtonListener;
    }

    void setNegativeButtonTextOverride(CharSequence charSequence) {
        this.mNegativeButtonTextOverride = charSequence;
    }

    int getCanceledFrom() {
        return this.mCanceledFrom;
    }

    void setCanceledFrom(int i2) {
        this.mCanceledFrom = i2;
    }

    boolean isPromptShowing() {
        return this.mIsPromptShowing;
    }

    void setPromptShowing(boolean z2) {
        this.mIsPromptShowing = z2;
    }

    boolean isAwaitingResult() {
        return this.mIsAwaitingResult;
    }

    void setAwaitingResult(boolean z2) {
        this.mIsAwaitingResult = z2;
    }

    boolean isConfirmingDeviceCredential() {
        return this.mIsConfirmingDeviceCredential;
    }

    void setConfirmingDeviceCredential(boolean z2) {
        this.mIsConfirmingDeviceCredential = z2;
    }

    boolean isDelayingPrompt() {
        return this.mIsDelayingPrompt;
    }

    void setDelayingPrompt(boolean z2) {
        this.mIsDelayingPrompt = z2;
    }

    boolean isIgnoringCancel() {
        return this.mIsIgnoringCancel;
    }

    void setIgnoringCancel(boolean z2) {
        this.mIsIgnoringCancel = z2;
    }

    boolean isUsingKeyguardManagerForBiometricAndCredential() {
        return this.mIsUsingKeyguardManagerForBiometricAndCredential;
    }

    void setUsingKeyguardManagerForBiometricAndCredential(boolean z2) {
        this.mIsUsingKeyguardManagerForBiometricAndCredential = z2;
    }

    LiveData<BiometricPrompt.AuthenticationResult> getAuthenticationResult() {
        if (this.mAuthenticationResult == null) {
            this.mAuthenticationResult = new MutableLiveData<>();
        }
        return this.mAuthenticationResult;
    }

    void setAuthenticationResult(BiometricPrompt.AuthenticationResult authenticationResult) {
        if (this.mAuthenticationResult == null) {
            this.mAuthenticationResult = new MutableLiveData<>();
        }
        updateValue(this.mAuthenticationResult, authenticationResult);
    }

    MutableLiveData<BiometricErrorData> getAuthenticationError() {
        if (this.mAuthenticationError == null) {
            this.mAuthenticationError = new MutableLiveData<>();
        }
        return this.mAuthenticationError;
    }

    void setAuthenticationError(BiometricErrorData biometricErrorData) {
        if (this.mAuthenticationError == null) {
            this.mAuthenticationError = new MutableLiveData<>();
        }
        updateValue(this.mAuthenticationError, biometricErrorData);
    }

    LiveData<CharSequence> getAuthenticationHelpMessage() {
        if (this.mAuthenticationHelpMessage == null) {
            this.mAuthenticationHelpMessage = new MutableLiveData<>();
        }
        return this.mAuthenticationHelpMessage;
    }

    void setAuthenticationHelpMessage(CharSequence charSequence) throws Throwable {
        if (this.mAuthenticationHelpMessage == null) {
            this.mAuthenticationHelpMessage = new MutableLiveData<>();
        }
        updateValue(this.mAuthenticationHelpMessage, charSequence);
    }

    LiveData<Boolean> isAuthenticationFailurePending() {
        if (this.mIsAuthenticationFailurePending == null) {
            this.mIsAuthenticationFailurePending = new MutableLiveData<>();
        }
        return this.mIsAuthenticationFailurePending;
    }

    void setAuthenticationFailurePending(boolean z2) {
        if (this.mIsAuthenticationFailurePending == null) {
            this.mIsAuthenticationFailurePending = new MutableLiveData<>();
        }
        updateValue(this.mIsAuthenticationFailurePending, Boolean.valueOf(z2));
    }

    LiveData<Boolean> isNegativeButtonPressPending() {
        if (this.mIsNegativeButtonPressPending == null) {
            this.mIsNegativeButtonPressPending = new MutableLiveData<>();
        }
        return this.mIsNegativeButtonPressPending;
    }

    void setNegativeButtonPressPending(boolean z2) {
        if (this.mIsNegativeButtonPressPending == null) {
            this.mIsNegativeButtonPressPending = new MutableLiveData<>();
        }
        updateValue(this.mIsNegativeButtonPressPending, Boolean.valueOf(z2));
    }

    boolean isFingerprintDialogDismissedInstantly() {
        return this.mIsFingerprintDialogDismissedInstantly;
    }

    void setFingerprintDialogDismissedInstantly(boolean z2) {
        this.mIsFingerprintDialogDismissedInstantly = z2;
    }

    LiveData<Boolean> isFingerprintDialogCancelPending() {
        if (this.mIsFingerprintDialogCancelPending == null) {
            this.mIsFingerprintDialogCancelPending = new MutableLiveData<>();
        }
        return this.mIsFingerprintDialogCancelPending;
    }

    void setFingerprintDialogCancelPending(boolean z2) {
        if (this.mIsFingerprintDialogCancelPending == null) {
            this.mIsFingerprintDialogCancelPending = new MutableLiveData<>();
        }
        updateValue(this.mIsFingerprintDialogCancelPending, Boolean.valueOf(z2));
    }

    int getFingerprintDialogPreviousState() {
        return this.mFingerprintDialogPreviousState;
    }

    void setFingerprintDialogPreviousState(int i2) {
        this.mFingerprintDialogPreviousState = i2;
    }

    LiveData<Integer> getFingerprintDialogState() {
        if (this.mFingerprintDialogState == null) {
            this.mFingerprintDialogState = new MutableLiveData<>();
        }
        return this.mFingerprintDialogState;
    }

    void setFingerprintDialogState(int i2) {
        if (this.mFingerprintDialogState == null) {
            this.mFingerprintDialogState = new MutableLiveData<>();
        }
        updateValue(this.mFingerprintDialogState, Integer.valueOf(i2));
    }

    LiveData<CharSequence> getFingerprintDialogHelpMessage() {
        if (this.mFingerprintDialogHelpMessage == null) {
            this.mFingerprintDialogHelpMessage = new MutableLiveData<>();
        }
        return this.mFingerprintDialogHelpMessage;
    }

    void setFingerprintDialogHelpMessage(CharSequence charSequence) {
        if (this.mFingerprintDialogHelpMessage == null) {
            this.mFingerprintDialogHelpMessage = new MutableLiveData<>();
        }
        updateValue(this.mFingerprintDialogHelpMessage, charSequence);
    }

    int getInferredAuthenticationResultType() {
        int allowedAuthenticators = getAllowedAuthenticators();
        return (!AuthenticatorUtils.isSomeBiometricAllowed(allowedAuthenticators) || AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators)) ? -1 : 2;
    }

    private static <T> void updateValue(MutableLiveData<T> mutableLiveData, T t2) throws Throwable {
        Thread threadCurrentThread = Thread.currentThread();
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1593ug.zd("-;2A?:6\u0001CH\u0004#GHJ@N", (short) (C1499aX.Xd() ^ (-20308)), (short) (C1499aX.Xd() ^ (-1122)))).getDeclaredMethod(C1561oA.od("JGU-@GK(JII=I", (short) (C1607wl.Xd() ^ 15412)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            if (threadCurrentThread == ((Looper) declaredMethod.invoke(null, objArr)).getThread()) {
                mutableLiveData.setValue(t2);
            } else {
                mutableLiveData.postValue(t2);
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
