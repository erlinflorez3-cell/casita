package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class BiometricFragment extends Fragment {
    private static final String ARG_HAS_FACE = "has_face";
    private static final String ARG_HAS_FINGERPRINT = "has_fingerprint";
    private static final String ARG_HAS_IRIS = "has_iris";
    private static final String ARG_HOST_ACTIVITY = "host_activity";
    static final int CANCELED_FROM_CLIENT = 3;
    static final int CANCELED_FROM_INTERNAL = 0;
    static final int CANCELED_FROM_NEGATIVE_BUTTON = 2;
    static final int CANCELED_FROM_USER = 1;
    private static final int DISMISS_INSTANTLY_DELAY_MS = 500;
    private static final String FINGERPRINT_DIALOG_FRAGMENT_TAG = "androidx.biometric.FingerprintDialogFragment";
    private static final int HIDE_DIALOG_DELAY_MS = 2000;
    private static final int REQUEST_CONFIRM_CREDENTIAL = 1;
    private static final int SHOW_PROMPT_DELAY_MS = 600;
    private static final String TAG = "BiometricFragment";
    private Handler mHandler;
    private BiometricViewModel mViewModel;

    public BiometricFragment() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Yd("[i`omhd/qv2Quvxn|", (short) (OY.Xd() ^ 258))).getDeclaredMethod(Xg.qd("UTd>S\\bAefh^l", (short) (C1580rY.Xd() ^ (-26338)), (short) (C1580rY.Xd() ^ (-9112))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static class PromptExecutor implements Executor {
        private final Handler mPromptHandler;

        PromptExecutor() throws Throwable {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.od("JVKXTMG\u0010PS\r*LKK?K", (short) (OY.Xd() ^ 16179))).getDeclaredMethod(C1561oA.Kd("{z\u000bdy\u0003\tg\f\r\u000f\u0005\u0013", (short) (C1633zX.Xd() ^ (-31100))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.mPromptHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) throws Throwable {
            Handler handler = this.mPromptHandler;
            short sXd = (short) (C1633zX.Xd() ^ (-10509));
            short sXd2 = (short) (C1633zX.Xd() ^ (-26171));
            int[] iArr = new int["\u000e\u0019-Id[tLkmEm%0CY0;".length()];
            QB qb = new QB("\u000e\u0019-Id[tLkmEm%0CY0;");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {runnable};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("==>@", (short) (ZN.Xd() ^ 6681)), Class.forName(C1561oA.Xd("\u001f\u0017-\u0019f&\u001c*$k\u00115/0$&1+", (short) (OY.Xd() ^ 8045))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private static class ShowPromptForAuthenticationRunnable implements Runnable {
        private final WeakReference<BiometricFragment> mFragmentRef;

        ShowPromptForAuthenticationRunnable(BiometricFragment biometricFragment) {
            this.mFragmentRef = new WeakReference<>(biometricFragment);
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            if (this.mFragmentRef.get() != null) {
                this.mFragmentRef.get().showPromptForAuthentication();
            }
        }
    }

    private static class StopDelayingPromptRunnable implements Runnable {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        StopDelayingPromptRunnable(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setDelayingPrompt(false);
            }
        }
    }

    private static class StopIgnoringCancelRunnable implements Runnable {
        private final WeakReference<BiometricViewModel> mViewModelRef;

        StopIgnoringCancelRunnable(BiometricViewModel biometricViewModel) {
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mViewModelRef.get() != null) {
                this.mViewModelRef.get().setIgnoringCancel(false);
            }
        }
    }

    static BiometricFragment newInstance(boolean z2) {
        BiometricFragment biometricFragment = new BiometricFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(ARG_HOST_ACTIVITY, z2);
        biometricFragment.setArguments(bundle);
        return biometricFragment;
    }

    static BiometricFragment newInstance(Handler handler, BiometricViewModel biometricViewModel, boolean z2, boolean z3, boolean z4, boolean z5) {
        BiometricFragment biometricFragment = new BiometricFragment();
        Bundle bundle = new Bundle();
        biometricFragment.mHandler = handler;
        biometricFragment.mViewModel = biometricViewModel;
        bundle.putBoolean(ARG_HOST_ACTIVITY, z2);
        bundle.putBoolean(ARG_HAS_FINGERPRINT, z3);
        bundle.putBoolean(ARG_HAS_FACE, z4);
        bundle.putBoolean(ARG_HAS_IRIS, z5);
        biometricFragment.setArguments(bundle);
        return biometricFragment;
    }

    private boolean isHostedInActivity() {
        return getArguments().getBoolean(ARG_HOST_ACTIVITY, true);
    }

    private boolean hasFingerprint() {
        return getArguments().getBoolean(ARG_HAS_FINGERPRINT, PackageUtils.hasSystemFeatureFingerprint(getContext()));
    }

    private boolean hasFace() {
        return getArguments().getBoolean(ARG_HAS_FACE, PackageUtils.hasSystemFeatureFace(getContext()));
    }

    private boolean hasIris() {
        return getArguments().getBoolean(ARG_HAS_IRIS, PackageUtils.hasSystemFeatureIris(getContext()));
    }

    BiometricViewModel getViewModel() {
        return this.mViewModel;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.mViewModel == null) {
            this.mViewModel = BiometricPrompt.getViewModel(this, isHostedInActivity());
        }
        connectViewModel();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() throws Throwable {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators())) {
            this.mViewModel.setIgnoringCancel(true);
            Handler handler = this.mHandler;
            Object[] objArr = {new StopIgnoringCancelRunnable(this.mViewModel), 250L};
            Method method = Class.forName(EO.Od("\u001baE3x(?8!)eY\u001e1\u001b|3^", (short) (C1499aX.Xd() ^ (-2774)))).getMethod(C1593ug.zd(">>CE\u00168@6O<<", (short) (FB.Xd() ^ 23280), (short) (FB.Xd() ^ 27812)), Class.forName(C1561oA.Qd("D:N8\u0004A5A9~\"D<;--6.", (short) (ZN.Xd() ^ 31192))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.mViewModel.isConfirmingDeviceCredential() || isChangingConfigurations()) {
            return;
        }
        cancelAuthentication(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) throws Throwable {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            this.mViewModel.setConfirmingDeviceCredential(false);
            handleConfirmCredentialResult(i3);
        }
    }

    private void connectViewModel() {
        this.mViewModel.setClientActivity(getActivity());
        this.mViewModel.getAuthenticationResult().observe(this, new Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda5
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                this.f$0.m29lambda$connectViewModel$0$androidxbiometricBiometricFragment((BiometricPrompt.AuthenticationResult) obj);
            }
        });
        this.mViewModel.getAuthenticationError().observe(this, new Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                this.f$0.m30lambda$connectViewModel$1$androidxbiometricBiometricFragment((BiometricErrorData) obj);
            }
        });
        this.mViewModel.getAuthenticationHelpMessage().observe(this, new Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda7
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f$0.m31lambda$connectViewModel$2$androidxbiometricBiometricFragment((CharSequence) obj);
            }
        });
        this.mViewModel.isAuthenticationFailurePending().observe(this, new Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda8
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f$0.m32lambda$connectViewModel$3$androidxbiometricBiometricFragment((Boolean) obj);
            }
        });
        this.mViewModel.isNegativeButtonPressPending().observe(this, new Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda9
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                this.f$0.m33lambda$connectViewModel$4$androidxbiometricBiometricFragment((Boolean) obj);
            }
        });
        this.mViewModel.isFingerprintDialogCancelPending().observe(this, new Observer() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda10
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) throws Throwable {
                this.f$0.m34lambda$connectViewModel$5$androidxbiometricBiometricFragment((Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$connectViewModel$0$androidx-biometric-BiometricFragment */
    /* synthetic */ void m29lambda$connectViewModel$0$androidxbiometricBiometricFragment(BiometricPrompt.AuthenticationResult authenticationResult) throws Throwable {
        if (authenticationResult != null) {
            onAuthenticationSucceeded(authenticationResult);
            this.mViewModel.setAuthenticationResult(null);
        }
    }

    /* JADX INFO: renamed from: lambda$connectViewModel$1$androidx-biometric-BiometricFragment */
    /* synthetic */ void m30lambda$connectViewModel$1$androidxbiometricBiometricFragment(BiometricErrorData biometricErrorData) throws Throwable {
        if (biometricErrorData != null) {
            onAuthenticationError(biometricErrorData.getErrorCode(), biometricErrorData.getErrorMessage());
            this.mViewModel.setAuthenticationError(null);
        }
    }

    /* JADX INFO: renamed from: lambda$connectViewModel$2$androidx-biometric-BiometricFragment */
    /* synthetic */ void m31lambda$connectViewModel$2$androidxbiometricBiometricFragment(CharSequence charSequence) {
        if (charSequence != null) {
            onAuthenticationHelp(charSequence);
            this.mViewModel.setAuthenticationError(null);
        }
    }

    /* JADX INFO: renamed from: lambda$connectViewModel$3$androidx-biometric-BiometricFragment */
    /* synthetic */ void m32lambda$connectViewModel$3$androidxbiometricBiometricFragment(Boolean bool) {
        if (bool.booleanValue()) {
            onAuthenticationFailed();
            this.mViewModel.setAuthenticationFailurePending(false);
        }
    }

    /* JADX INFO: renamed from: lambda$connectViewModel$4$androidx-biometric-BiometricFragment */
    /* synthetic */ void m33lambda$connectViewModel$4$androidxbiometricBiometricFragment(Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            if (isManagingDeviceCredentialButton()) {
                onDeviceCredentialButtonPressed();
            } else {
                onCancelButtonPressed();
            }
            this.mViewModel.setNegativeButtonPressPending(false);
        }
    }

    /* JADX INFO: renamed from: lambda$connectViewModel$5$androidx-biometric-BiometricFragment */
    /* synthetic */ void m34lambda$connectViewModel$5$androidxbiometricBiometricFragment(Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            cancelAuthentication(1);
            dismiss();
            this.mViewModel.setFingerprintDialogCancelPending(false);
        }
    }

    void authenticate(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject) throws Throwable {
        this.mViewModel.setPromptInfo(promptInfo);
        int consolidatedAuthenticators = AuthenticatorUtils.getConsolidatedAuthenticators(promptInfo, cryptoObject);
        if (Build.VERSION.SDK_INT < 30 && consolidatedAuthenticators == 15 && cryptoObject == null) {
            this.mViewModel.setCryptoObject(CryptoObjectUtils.createFakeCryptoObject());
        } else {
            this.mViewModel.setCryptoObject(cryptoObject);
        }
        if (isManagingDeviceCredentialButton()) {
            this.mViewModel.setNegativeButtonTextOverride(getString(R.string.confirm_device_credential_password));
        } else {
            this.mViewModel.setNegativeButtonTextOverride(null);
        }
        if (isKeyguardManagerNeededForCredential()) {
            this.mViewModel.setAwaitingResult(true);
            launchConfirmCredentialActivity();
            return;
        }
        if (!this.mViewModel.isDelayingPrompt()) {
            showPromptForAuthentication();
            return;
        }
        Handler handler = this.mHandler;
        ShowPromptForAuthenticationRunnable showPromptForAuthenticationRunnable = new ShowPromptForAuthenticationRunnable(this);
        short sXd = (short) (C1499aX.Xd() ^ (-28311));
        int[] iArr = new int["\u0012 \u0017&$\u001f\u001be(-h\u0004\u001e,#,&4".length()];
        QB qb = new QB("\u0012 \u0017&$\u001f\u001be(-h\u0004\u001e,#,&4");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(Wg.Zd("!gy1zv9A9N-]\u0012\u0011\u0013\u000f\u0014\u001c", (short) (OY.Xd() ^ 22607), (short) (OY.Xd() ^ 27613))), Long.TYPE};
        Object[] objArr = {showPromptForAuthenticationRunnable, 600L};
        short sXd2 = (short) (C1607wl.Xd() ^ 31621);
        int[] iArr2 = new int["\"\"')y\u001c$\u001a3  ".length()];
        QB qb2 = new QB("\"\"')y\u001c$\u001a3  ");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    void showPromptForAuthentication() throws Throwable {
        if (!this.mViewModel.isPromptShowing() && getContext() != null) {
            this.mViewModel.setPromptShowing(true);
            this.mViewModel.setAwaitingResult(true);
            if (isKeyguardManagerNeededForBiometricAndCredential()) {
                launchConfirmCredentialActivity();
            } else if (isUsingFingerprintDialog()) {
                showFingerprintDialogForAuthentication();
            } else {
                showBiometricPromptForAuthentication();
            }
        }
    }

    private void showFingerprintDialogForAuthentication() throws Throwable {
        Context contextRequireContext = requireContext();
        short sXd = (short) (FB.Xd() ^ 12186);
        short sXd2 = (short) (FB.Xd() ^ 20175);
        int[] iArr = new int["\u000b\r&b\u0005b\b\u0002'\u0013R7Xk0\f.3*\u0003u,\u0005".length()];
        QB qb = new QB("\u000b\r&b\u0005b\b\u0002'\u0013R7Xk0\f.3*\u0003u,\u0005");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Ig.wd("z1lW\u001d_=\u0011O_r\b^Q\u007f\rFXo\tI", (short) (OY.Xd() ^ 18682)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context = (Context) method.invoke(contextRequireContext, objArr);
            FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(context);
            int iCheckForFingerprintPreAuthenticationErrors = checkForFingerprintPreAuthenticationErrors(fingerprintManagerCompatFrom);
            if (iCheckForFingerprintPreAuthenticationErrors != 0) {
                m35x21f86f4c(iCheckForFingerprintPreAuthenticationErrors, ErrorUtils.getFingerprintErrorString(context, iCheckForFingerprintPreAuthenticationErrors));
                return;
            }
            if (isAdded()) {
                this.mViewModel.setFingerprintDialogDismissedInstantly(true);
                if (!DeviceUtils.shouldHideFingerprintDialog(context, Build.MODEL)) {
                    Handler handler = this.mHandler;
                    Runnable runnable = new Runnable() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m39x8ea05632();
                        }
                    };
                    Class<?> cls = Class.forName(EO.Od("}S\u0017\r\u00118WPq\t=y^ik\u0015[N", (short) (Od.Xd() ^ (-31079))));
                    Class<?>[] clsArr = {Class.forName(C1561oA.Qd("6,@*u3'3+p\u00146.-\u001f\u001f( ", (short) (ZN.Xd() ^ 7894))), Long.TYPE};
                    Object[] objArr2 = {runnable, 500L};
                    short sXd3 = (short) (C1499aX.Xd() ^ (-13058));
                    short sXd4 = (short) (C1499aX.Xd() ^ (-16317));
                    int[] iArr2 = new int["\u000e\u000e\u0013\u0015e\b\u0010\u0006\u001f\f\f".length()];
                    QB qb2 = new QB("\u000e\u000e\u0013\u0015e\b\u0010\u0006\u001f\f\f");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                        i3++;
                    }
                    Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(handler, objArr2);
                        FingerprintDialogFragment fingerprintDialogFragmentNewInstance = FingerprintDialogFragment.newInstance(isHostedInActivity());
                        FragmentManager parentFragmentManager = getParentFragmentManager();
                        short sXd5 = (short) (C1607wl.Xd() ^ 25626);
                        int[] iArr3 = new int["~\u000b\u007f\r\t\u0002{\u000fCv|\u0002~u\u0004\u0001vo9PrvnkwtukotCg^hja?jX]bYaf".length()];
                        QB qb3 = new QB("~\u000b\u007f\r\t\u0002{\u000fCv|\u0002~u\u0004\u0001vo9PrvnkwtukotCg^hja?jX]bYaf");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(sXd5 + sXd5 + i4 + xuXd3.CK(iKK3));
                            i4++;
                        }
                        fingerprintDialogFragmentNewInstance.show(parentFragmentManager, new String(iArr3, 0, i4));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                this.mViewModel.setCanceledFrom(0);
                authenticateWithFingerprint(fingerprintManagerCompatFrom, context);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX INFO: renamed from: lambda$showFingerprintDialogForAuthentication$6$androidx-biometric-BiometricFragment */
    /* synthetic */ void m39x8ea05632() {
        this.mViewModel.setFingerprintDialogDismissedInstantly(false);
    }

    private void showBiometricPromptForAuthentication() throws Throwable {
        Context contextRequireContext = requireContext();
        Class<?> cls = Class.forName(Jg.Wd("\u0017{ioN?\u0012K\u000b\u000f~|70.^5Y0(\u0002\r\u0001", (short) (Od.Xd() ^ (-19907)), (short) (Od.Xd() ^ (-11529))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 6288);
        short sXd2 = (short) (ZN.Xd() ^ 830);
        int[] iArr = new int["\u0015.ZM^>B{wOMlQ\u001a\u0010G{;lnZ".length()];
        QB qb = new QB("\u0015.ZM^>B{wOMlQ\u001a\u0010G{;lnZ");
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
            BiometricPrompt.Builder builderCreatePromptBuilder = Api28Impl.createPromptBuilder((Context) method.invoke(contextRequireContext, objArr));
            CharSequence title = this.mViewModel.getTitle();
            CharSequence subtitle = this.mViewModel.getSubtitle();
            CharSequence description = this.mViewModel.getDescription();
            if (title != null) {
                Api28Impl.setTitle(builderCreatePromptBuilder, title);
            }
            if (subtitle != null) {
                Api28Impl.setSubtitle(builderCreatePromptBuilder, subtitle);
            }
            if (description != null) {
                Api28Impl.setDescription(builderCreatePromptBuilder, description);
            }
            CharSequence negativeButtonText = this.mViewModel.getNegativeButtonText();
            if (!TextUtils.isEmpty(negativeButtonText)) {
                Api28Impl.setNegativeButton(builderCreatePromptBuilder, negativeButtonText, this.mViewModel.getClientExecutor(), this.mViewModel.getNegativeButtonListener());
            }
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.setConfirmationRequired(builderCreatePromptBuilder, this.mViewModel.isConfirmationRequired());
            }
            int allowedAuthenticators = this.mViewModel.getAllowedAuthenticators();
            if (Build.VERSION.SDK_INT >= 30) {
                Api30Impl.setAllowedAuthenticators(builderCreatePromptBuilder, allowedAuthenticators);
            } else if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.setDeviceCredentialAllowed(builderCreatePromptBuilder, AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators));
            }
            authenticateWithBiometricPrompt(Api28Impl.buildPrompt(builderCreatePromptBuilder), getContext());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    void authenticateWithFingerprint(FingerprintManagerCompat fingerprintManagerCompat, Context context) throws Throwable {
        try {
            fingerprintManagerCompat.authenticate(CryptoObjectUtils.wrapForFingerprintManager(this.mViewModel.getCryptoObject()), 0, this.mViewModel.getCancellationSignalProvider().getFingerprintCancellationSignal(), this.mViewModel.getAuthenticationCallbackProvider().getFingerprintCallback(), (Handler) null);
        } catch (NullPointerException e2) {
            m35x21f86f4c(1, ErrorUtils.getFingerprintErrorString(context, 1));
        }
    }

    void authenticateWithBiometricPrompt(android.hardware.biometrics.BiometricPrompt biometricPrompt, Context context) throws Throwable {
        String str;
        BiometricPrompt.CryptoObject cryptoObjectWrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(this.mViewModel.getCryptoObject());
        CancellationSignal biometricCancellationSignal = this.mViewModel.getCancellationSignalProvider().getBiometricCancellationSignal();
        PromptExecutor promptExecutor = new PromptExecutor();
        BiometricPrompt.AuthenticationCallback biometricCallback = this.mViewModel.getAuthenticationCallbackProvider().getBiometricCallback();
        try {
            if (cryptoObjectWrapForBiometricPrompt == null) {
                Api28Impl.authenticate(biometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
            } else {
                Api28Impl.authenticate(biometricPrompt, cryptoObjectWrapForBiometricPrompt, biometricCancellationSignal, promptExecutor, biometricCallback);
            }
        } catch (NullPointerException e2) {
            Wg.vd("\\\u0003\f\t\u0004\u0012\u0013\tuW\u0007t}\u0003}\u0006~", (short) (C1607wl.Xd() ^ 7196));
            Qg.kd("W~\u0003-Z[O)\u007fooqi#cvtgckpd]Zl`d\\\u0014j[eX\u000fPV[XO]ZPI\u0005TUQNPS\f", (short) (OY.Xd() ^ 30644), (short) (OY.Xd() ^ 10690));
            if (context != null) {
                int i2 = R.string.default_error_msg;
                Class<?> cls = Class.forName(hg.Vd("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ", (short) (OY.Xd() ^ 2140), (short) (OY.Xd() ^ 6088)));
                Class<?>[] clsArr = {Integer.TYPE};
                Object[] objArr = {Integer.valueOf(i2)};
                Method method = cls.getMethod(C1561oA.ud("# .\f,)\u001f#\u001b", (short) (ZN.Xd() ^ 30274)), clsArr);
                try {
                    method.setAccessible(true);
                    str = (String) method.invoke(context, objArr);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                str = "";
            }
            m35x21f86f4c(1, str);
        }
    }

    void cancelAuthentication(int i2) {
        if (i2 == 3 || !this.mViewModel.isIgnoringCancel()) {
            if (isUsingFingerprintDialog()) {
                this.mViewModel.setCanceledFrom(i2);
                if (i2 == 1) {
                    sendErrorToClient(10, ErrorUtils.getFingerprintErrorString(getContext(), 10));
                }
            }
            this.mViewModel.getCancellationSignalProvider().cancel();
        }
    }

    void dismiss() throws Throwable {
        dismissFingerprintDialog();
        this.mViewModel.setPromptShowing(false);
        if (!this.mViewModel.isConfirmingDeviceCredential() && isAdded()) {
            getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
        Context context = getContext();
        if (context == null || !DeviceUtils.shouldDelayShowingPrompt(context, Build.MODEL)) {
            return;
        }
        this.mViewModel.setDelayingPrompt(true);
        Handler handler = this.mHandler;
        Object[] objArr = {new StopDelayingPromptRunnable(this.mViewModel), 600L};
        Method method = Class.forName(C1561oA.yd("<JAPFA=\bRW\u0013.@NENP^", (short) (ZN.Xd() ^ 5620))).getMethod(Xg.qd("<<AC\u00146>4M::", (short) (OY.Xd() ^ 32487), (short) (OY.Xd() ^ 25392)), Class.forName(C1561oA.Yd("|t\u000bvD\u0004y\b\u0002In\u0013\r\u000e\u0002\u0004\u000f\t", (short) (C1607wl.Xd() ^ 12247))), Long.TYPE);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void dismissFingerprintDialog() {
        this.mViewModel.setPromptShowing(false);
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) parentFragmentManager.findFragmentByTag(FINGERPRINT_DIALOG_FRAGMENT_TAG);
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.isAdded()) {
                    fingerprintDialogFragment.dismissAllowingStateLoss();
                } else {
                    parentFragmentManager.beginTransaction().remove(fingerprintDialogFragment).commitAllowingStateLoss();
                }
            }
        }
    }

    void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) throws Throwable {
        sendSuccessAndDismiss(authenticationResult);
    }

    void onAuthenticationError(final int i2, final CharSequence charSequence) throws Throwable {
        if (!ErrorUtils.isKnownError(i2)) {
            i2 = 8;
        }
        Context context = getContext();
        if (Build.VERSION.SDK_INT < 29 && ErrorUtils.isLockoutError(i2) && context != null && KeyguardUtils.isDeviceSecuredWithCredential(context) && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators())) {
            launchConfirmCredentialActivity();
            return;
        }
        if (isUsingFingerprintDialog()) {
            if (charSequence == null) {
                charSequence = ErrorUtils.getFingerprintErrorString(getContext(), i2);
            }
            if (i2 == 5) {
                int canceledFrom = this.mViewModel.getCanceledFrom();
                if (canceledFrom == 0 || canceledFrom == 3) {
                    sendErrorToClient(i2, charSequence);
                }
                dismiss();
                return;
            }
            if (this.mViewModel.isFingerprintDialogDismissedInstantly()) {
                m35x21f86f4c(i2, charSequence);
            } else {
                showFingerprintErrorMessage(charSequence);
                Handler handler = this.mHandler;
                Runnable runnable = new Runnable() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f$0.m35x21f86f4c(i2, charSequence);
                    }
                };
                long dismissDialogDelay = getDismissDialogDelay();
                Class<?> cls = Class.forName(Jg.Wd("IO\u000eh.\u0001$:D!$+\rv1\u0002'\u0011", (short) (FB.Xd() ^ 6603), (short) (FB.Xd() ^ 28997)));
                Class<?>[] clsArr = {Class.forName(ZO.xd("(\u0017'\u0012&n?|\u0002[+nxnP,dV", (short) (FB.Xd() ^ 13881), (short) (FB.Xd() ^ 15051))), Long.TYPE};
                Object[] objArr = {runnable, Long.valueOf(dismissDialogDelay)};
                Method method = cls.getMethod(C1626yg.Ud("H -S\u0018t\u007f&g73", (short) (C1633zX.Xd() ^ (-16893)), (short) (C1633zX.Xd() ^ (-921))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            this.mViewModel.setFingerprintDialogDismissedInstantly(true);
            return;
        }
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg) + Ig.wd("\u0004", (short) (C1607wl.Xd() ^ 22400)) + i2;
        }
        m35x21f86f4c(i2, charSequence);
    }

    void onAuthenticationHelp(CharSequence charSequence) {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(charSequence);
        }
    }

    void onAuthenticationFailed() {
        if (isUsingFingerprintDialog()) {
            showFingerprintErrorMessage(getString(R.string.fingerprint_not_recognized));
        }
        sendFailureToClient();
    }

    void onDeviceCredentialButtonPressed() throws Throwable {
        launchConfirmCredentialActivity();
    }

    void onCancelButtonPressed() throws Throwable {
        CharSequence negativeButtonText = this.mViewModel.getNegativeButtonText();
        if (negativeButtonText == null) {
            negativeButtonText = getString(R.string.default_error_msg);
        }
        m35x21f86f4c(13, negativeButtonText);
        cancelAuthentication(2);
    }

    private void launchConfirmCredentialActivity() throws Throwable {
        Context context = getContext();
        KeyguardManager keyguardManager = context != null ? KeyguardUtils.getKeyguardManager(context) : null;
        if (keyguardManager == null) {
            m35x21f86f4c(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        CharSequence title = this.mViewModel.getTitle();
        CharSequence subtitle = this.mViewModel.getSubtitle();
        CharSequence description = this.mViewModel.getDescription();
        if (subtitle == null) {
            subtitle = description;
        }
        Intent intentCreateConfirmDeviceCredentialIntent = Api21Impl.createConfirmDeviceCredentialIntent(keyguardManager, title, subtitle);
        if (intentCreateConfirmDeviceCredentialIntent == null) {
            m35x21f86f4c(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.mViewModel.setConfirmingDeviceCredential(true);
        if (isUsingFingerprintDialog()) {
            dismissFingerprintDialog();
        }
        intentCreateConfirmDeviceCredentialIntent.setFlags(134742016);
        startActivityForResult(intentCreateConfirmDeviceCredentialIntent, 1);
    }

    private void handleConfirmCredentialResult(int i2) throws Throwable {
        int i3 = -1;
        if (i2 == -1) {
            if (this.mViewModel.isUsingKeyguardManagerForBiometricAndCredential()) {
                this.mViewModel.setUsingKeyguardManagerForBiometricAndCredential(false);
            } else {
                i3 = 1;
            }
            sendSuccessAndDismiss(new BiometricPrompt.AuthenticationResult(null, i3));
            return;
        }
        m35x21f86f4c(10, getString(R.string.generic_error_user_canceled));
    }

    private void showFingerprintErrorMessage(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.mViewModel.setFingerprintDialogState(2);
        this.mViewModel.setFingerprintDialogHelpMessage(charSequence);
    }

    private void sendSuccessAndDismiss(BiometricPrompt.AuthenticationResult authenticationResult) throws Throwable {
        sendSuccessToClient(authenticationResult);
        dismiss();
    }

    /* JADX INFO: renamed from: sendErrorAndDismiss */
    public void m35x21f86f4c(int i2, CharSequence charSequence) throws Throwable {
        sendErrorToClient(i2, charSequence);
        dismiss();
    }

    private void sendSuccessToClient(final BiometricPrompt.AuthenticationResult authenticationResult) {
        if (this.mViewModel.isAwaitingResult()) {
            this.mViewModel.setAwaitingResult(false);
            this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m38xae54389b(authenticationResult);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$sendSuccessToClient$8$androidx-biometric-BiometricFragment */
    /* synthetic */ void m38xae54389b(BiometricPrompt.AuthenticationResult authenticationResult) {
        this.mViewModel.getClientCallback().onAuthenticationSucceeded(authenticationResult);
    }

    private void sendErrorToClient(final int i2, final CharSequence charSequence) {
        if (!this.mViewModel.isConfirmingDeviceCredential() && this.mViewModel.isAwaitingResult()) {
            this.mViewModel.setAwaitingResult(false);
            this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m36lambda$sendErrorToClient$9$androidxbiometricBiometricFragment(i2, charSequence);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$sendErrorToClient$9$androidx-biometric-BiometricFragment */
    /* synthetic */ void m36lambda$sendErrorToClient$9$androidxbiometricBiometricFragment(int i2, CharSequence charSequence) {
        this.mViewModel.getClientCallback().onAuthenticationError(i2, charSequence);
    }

    private void sendFailureToClient() {
        if (this.mViewModel.isAwaitingResult()) {
            this.mViewModel.getClientExecutor().execute(new Runnable() { // from class: androidx.biometric.BiometricFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m37x647d35db();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$sendFailureToClient$10$androidx-biometric-BiometricFragment */
    /* synthetic */ void m37x647d35db() {
        this.mViewModel.getClientCallback().onAuthenticationFailed();
    }

    private static int checkForFingerprintPreAuthenticationErrors(FingerprintManagerCompat fingerprintManagerCompat) {
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !fingerprintManagerCompat.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }

    boolean isManagingDeviceCredentialButton() {
        return Build.VERSION.SDK_INT <= 28 && AuthenticatorUtils.isDeviceCredentialAllowed(this.mViewModel.getAllowedAuthenticators());
    }

    private boolean isUsingFingerprintDialog() {
        return Build.VERSION.SDK_INT < 28 || isFingerprintDialogNeededForCrypto() || isFingerprintDialogNeededForErrorHandling();
    }

    private boolean isFingerprintDialogNeededForCrypto() {
        Context context = getContext();
        return (context == null || this.mViewModel.getCryptoObject() == null || !DeviceUtils.shouldUseFingerprintForCrypto(context, Build.MANUFACTURER, Build.MODEL)) ? false : true;
    }

    private boolean isFingerprintDialogNeededForErrorHandling() {
        return Build.VERSION.SDK_INT == 28 && !hasFingerprint();
    }

    private boolean isKeyguardManagerNeededForCredential() {
        Context context = getContext();
        if (Build.VERSION.SDK_INT != 29 || hasFingerprint() || hasFace() || hasIris()) {
            return isManagingDeviceCredentialButton() && BiometricManager.from(context).canAuthenticate(255) != 0;
        }
        return true;
    }

    private boolean isKeyguardManagerNeededForBiometricAndCredential() {
        Context context = getContext();
        if (context == null || !DeviceUtils.shouldUseKeyguardManagerForBiometricAndCredential(context, Build.MANUFACTURER)) {
            return false;
        }
        int allowedAuthenticators = this.mViewModel.getAllowedAuthenticators();
        if (!AuthenticatorUtils.isWeakBiometricAllowed(allowedAuthenticators) || !AuthenticatorUtils.isDeviceCredentialAllowed(allowedAuthenticators)) {
            return false;
        }
        this.mViewModel.setUsingKeyguardManagerForBiometricAndCredential(true);
        return true;
    }

    private boolean isChangingConfigurations() {
        FragmentActivity activity = getActivity();
        return activity != null && activity.isChangingConfigurations();
    }

    private int getDismissDialogDelay() {
        Context context = getContext();
        if (context == null || !DeviceUtils.shouldHideFingerprintDialog(context, Build.MODEL)) {
            return HIDE_DIALOG_DELAY_MS;
        }
        return 0;
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static void setAllowedAuthenticators(BiometricPrompt.Builder builder, int i2) {
            builder.setAllowedAuthenticators(i2);
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static void setConfirmationRequired(BiometricPrompt.Builder builder, boolean z2) {
            builder.setConfirmationRequired(z2);
        }

        static void setDeviceCredentialAllowed(BiometricPrompt.Builder builder, boolean z2) {
            builder.setDeviceCredentialAllowed(z2);
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        static BiometricPrompt.Builder createPromptBuilder(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        static void setTitle(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }

        static void setSubtitle(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void setDescription(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void setNegativeButton(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        static android.hardware.biometrics.BiometricPrompt buildPrompt(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        static void authenticate(android.hardware.biometrics.BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
        }

        static void authenticate(android.hardware.biometrics.BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
        }
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static Intent createConfirmDeviceCredentialIntent(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }
}
