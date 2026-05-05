package androidx.biometric.auth;

import android.os.Handler;
import android.os.Looper;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes.dex */
class AuthPromptUtils {
    private AuthPromptUtils() {
    }

    static AuthPrompt startAuthentication(AuthPromptHost authPromptHost, BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject, Executor executor, AuthPromptCallback authPromptCallback) throws Throwable {
        BiometricPrompt biometricPromptCreateBiometricPrompt = createBiometricPrompt(authPromptHost, executor, authPromptCallback);
        if (cryptoObject == null) {
            biometricPromptCreateBiometricPrompt.authenticate(promptInfo);
        } else {
            biometricPromptCreateBiometricPrompt.authenticate(promptInfo, cryptoObject);
        }
        return new AuthPromptWrapper(biometricPromptCreateBiometricPrompt);
    }

    private static BiometricPrompt createBiometricPrompt(AuthPromptHost authPromptHost, Executor executor, AuthPromptCallback authPromptCallback) {
        if (executor == null) {
            executor = new DefaultExecutor();
        }
        if (authPromptHost.getActivity() != null) {
            return new BiometricPrompt(authPromptHost.getActivity(), executor, wrapCallback(authPromptCallback, new ViewModelProvider(authPromptHost.getActivity())));
        }
        if (authPromptHost.getFragment() != null && authPromptHost.getFragment().getActivity() != null) {
            return new BiometricPrompt(authPromptHost.getFragment(), executor, wrapCallback(authPromptCallback, new ViewModelProvider(authPromptHost.getFragment().getActivity())));
        }
        throw new IllegalArgumentException("AuthPromptHost must contain a FragmentActivity or an attached Fragment.");
    }

    private static AuthenticationCallbackWrapper wrapCallback(AuthPromptCallback authPromptCallback, ViewModelProvider viewModelProvider) {
        return new AuthenticationCallbackWrapper(authPromptCallback, (BiometricViewModel) viewModelProvider.get(BiometricViewModel.class));
    }

    private static class AuthPromptWrapper implements AuthPrompt {
        private final WeakReference<BiometricPrompt> mBiometricPromptRef;

        AuthPromptWrapper(BiometricPrompt biometricPrompt) {
            this.mBiometricPromptRef = new WeakReference<>(biometricPrompt);
        }

        @Override // androidx.biometric.auth.AuthPrompt
        public void cancelAuthentication() {
            if (this.mBiometricPromptRef.get() != null) {
                this.mBiometricPromptRef.get().cancelAuthentication();
            }
        }
    }

    private static class DefaultExecutor implements Executor {
        private final Handler mHandler;

        DefaultExecutor() throws Throwable {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(Xg.qd("r\u0001w\u0007\u0005\u007f{F\t\u000eIh\r\u000e\u0010\u0006\u0014", (short) (C1499aX.Xd() ^ (-31696)), (short) (C1499aX.Xd() ^ (-28742)))).getDeclaredMethod(Jg.Wd("[:u\u0019\u001a0\"\u000bZf\u0017XO", (short) (Od.Xd() ^ (-8568)), (short) (Od.Xd() ^ (-28743))), new Class[0]);
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
            Class<?> cls = Class.forName(ZO.xd("\u0004NC\\R(CVXZg+)>,H\u0004\u0001", (short) (ZN.Xd() ^ 13820), (short) (ZN.Xd() ^ 5995)));
            Class<?>[] clsArr = {Class.forName(C1626yg.Ud("8)ln\u0004*I\u0007iv;bk!Y3l\u0007", (short) (C1633zX.Xd() ^ (-19342)), (short) (C1633zX.Xd() ^ (-14242))))};
            Object[] objArr = {runnable};
            short sXd = (short) (Od.Xd() ^ (-19200));
            int[] iArr = new int["\t;k\u0016".length()];
            QB qb = new QB("\t;k\u0016");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
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

    private static class AuthenticationCallbackWrapper extends BiometricPrompt.AuthenticationCallback {
        private final AuthPromptCallback mClientCallback;
        private final WeakReference<BiometricViewModel> mViewModelRef;

        AuthenticationCallbackWrapper(AuthPromptCallback authPromptCallback, BiometricViewModel biometricViewModel) {
            this.mClientCallback = authPromptCallback;
            this.mViewModelRef = new WeakReference<>(biometricViewModel);
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationError(int i2, CharSequence charSequence) {
            this.mClientCallback.onAuthenticationError(getActivity(this.mViewModelRef), i2, charSequence);
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
            this.mClientCallback.onAuthenticationSucceeded(getActivity(this.mViewModelRef), authenticationResult);
        }

        @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.mClientCallback.onAuthenticationFailed(getActivity(this.mViewModelRef));
        }

        private static FragmentActivity getActivity(WeakReference<BiometricViewModel> weakReference) {
            if (weakReference.get() != null) {
                return weakReference.get().getClientActivity();
            }
            return null;
        }
    }
}
