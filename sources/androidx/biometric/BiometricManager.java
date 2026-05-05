package androidx.biometric;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes.dex */
public class BiometricManager {
    private static final int AUTH_MODALITY_CREDENTIAL = 1;
    private static final int AUTH_MODALITY_FACE = 8;
    private static final int AUTH_MODALITY_FINGERPRINT = 4;
    private static final int AUTH_MODALITY_NONE = 0;
    private static final int AUTH_MODALITY_UNKNOWN_BIOMETRIC = 2;
    public static final int BIOMETRIC_ERROR_HW_UNAVAILABLE = 1;
    public static final int BIOMETRIC_ERROR_NONE_ENROLLED = 11;
    public static final int BIOMETRIC_ERROR_NO_HARDWARE = 12;
    public static final int BIOMETRIC_ERROR_SECURITY_UPDATE_REQUIRED = 15;
    public static final int BIOMETRIC_ERROR_UNSUPPORTED = -2;
    public static final int BIOMETRIC_STATUS_UNKNOWN = -1;
    public static final int BIOMETRIC_SUCCESS = 0;
    private static final String TAG = "BiometricManager";
    private final android.hardware.biometrics.BiometricManager mBiometricManager;
    private final FingerprintManagerCompat mFingerprintManager;
    private final Injector mInjector;

    public interface Authenticators {
        public static final int BIOMETRIC_STRONG = 15;
        public static final int BIOMETRIC_WEAK = 255;
        public static final int DEVICE_CREDENTIAL = 32768;
    }

    interface Injector {
        android.hardware.biometrics.BiometricManager getBiometricManager();

        FingerprintManagerCompat getFingerprintManager();

        Resources getResources();

        boolean isDeviceSecurable();

        boolean isDeviceSecuredWithCredential();

        boolean isFaceHardwarePresent();

        boolean isFingerprintHardwarePresent();

        boolean isIrisHardwarePresent();

        boolean isStrongBiometricGuaranteed();
    }

    public static class Strings {
        private final BiometricManager.Strings mStrings;
        private final StringsCompat mStringsCompat;

        Strings(BiometricManager.Strings strings) {
            this.mStrings = strings;
            this.mStringsCompat = null;
        }

        Strings(StringsCompat stringsCompat) {
            this.mStrings = null;
            this.mStringsCompat = stringsCompat;
        }

        public CharSequence getButtonLabel() {
            BiometricManager.Strings strings;
            if (Build.VERSION.SDK_INT >= 31 && (strings = this.mStrings) != null) {
                return Api31Impl.getButtonLabel(strings);
            }
            StringsCompat stringsCompat = this.mStringsCompat;
            if (stringsCompat != null) {
                return stringsCompat.getButtonLabel();
            }
            return null;
        }

        public CharSequence getPromptMessage() {
            BiometricManager.Strings strings;
            if (Build.VERSION.SDK_INT >= 31 && (strings = this.mStrings) != null) {
                return Api31Impl.getPromptMessage(strings);
            }
            StringsCompat stringsCompat = this.mStringsCompat;
            if (stringsCompat != null) {
                return stringsCompat.getPromptMessage();
            }
            return null;
        }

        public CharSequence getSettingName() {
            BiometricManager.Strings strings;
            if (Build.VERSION.SDK_INT >= 31 && (strings = this.mStrings) != null) {
                return Api31Impl.getSettingName(strings);
            }
            StringsCompat stringsCompat = this.mStringsCompat;
            if (stringsCompat != null) {
                return stringsCompat.getSettingName();
            }
            return null;
        }
    }

    private class StringsCompat {
        private final int mAuthenticators;
        private final int mPossibleModalities;
        private final Resources mResources;

        StringsCompat(Resources resources, int i2, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.mResources = resources;
            this.mAuthenticators = i2;
            int i3 = (z5 && AuthenticatorUtils.isDeviceCredentialAllowed(i2)) ? 1 : 0;
            if (AuthenticatorUtils.isSomeBiometricAllowed(i2)) {
                i3 = z2 ? (i3 + 4) - (i3 & 4) : i3;
                i3 = z3 ? (i3 + 8) - (i3 & 8) : i3;
                if (z4) {
                    i3 |= 2;
                }
            }
            this.mPossibleModalities = i3;
        }

        CharSequence getButtonLabel() {
            if (BiometricManager.this.canAuthenticate(AuthenticatorUtils.getBiometricAuthenticators(this.mAuthenticators)) == 0) {
                int i2 = this.mPossibleModalities & (-2);
                if (i2 == 4) {
                    return this.mResources.getString(R.string.use_fingerprint_label);
                }
                if (i2 == 8) {
                    return this.mResources.getString(R.string.use_face_label);
                }
                return this.mResources.getString(R.string.use_biometric_label);
            }
            if ((this.mPossibleModalities & 1) != 0) {
                return this.mResources.getString(R.string.use_screen_lock_label);
            }
            return null;
        }

        CharSequence getPromptMessage() {
            int i2;
            if (BiometricManager.this.canAuthenticate(AuthenticatorUtils.getBiometricAuthenticators(this.mAuthenticators)) == 0) {
                int i3 = (-1) - (((-1) - this.mPossibleModalities) | ((-1) - (-2)));
                if (i3 != 4) {
                    if (i3 == 8) {
                        if (AuthenticatorUtils.isDeviceCredentialAllowed(this.mAuthenticators)) {
                            i2 = R.string.face_or_screen_lock_prompt_message;
                        } else {
                            i2 = R.string.face_prompt_message;
                        }
                    } else if (AuthenticatorUtils.isDeviceCredentialAllowed(this.mAuthenticators)) {
                        i2 = R.string.biometric_or_screen_lock_prompt_message;
                    } else {
                        i2 = R.string.biometric_prompt_message;
                    }
                } else if (AuthenticatorUtils.isDeviceCredentialAllowed(this.mAuthenticators)) {
                    i2 = R.string.fingerprint_or_screen_lock_prompt_message;
                } else {
                    i2 = R.string.fingerprint_prompt_message;
                }
                return this.mResources.getString(i2);
            }
            if ((this.mPossibleModalities & 1) != 0) {
                return this.mResources.getString(R.string.screen_lock_prompt_message);
            }
            return null;
        }

        CharSequence getSettingName() {
            int i2 = this.mPossibleModalities;
            if (i2 == 0) {
                return null;
            }
            if (i2 == 1) {
                return this.mResources.getString(R.string.use_screen_lock_label);
            }
            if (i2 == 2) {
                return this.mResources.getString(R.string.use_biometric_label);
            }
            if (i2 == 4) {
                return this.mResources.getString(R.string.use_fingerprint_label);
            }
            if (i2 == 8) {
                return this.mResources.getString(R.string.use_face_label);
            }
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0) {
                return this.mResources.getString(R.string.use_biometric_label);
            }
            int i3 = (-1) - (((-1) - i2) | ((-1) - (-2)));
            if (i3 == 4) {
                return this.mResources.getString(R.string.use_fingerprint_or_screen_lock_label);
            }
            if (i3 == 8) {
                return this.mResources.getString(R.string.use_face_or_screen_lock_label);
            }
            return this.mResources.getString(R.string.use_biometric_or_screen_lock_label);
        }
    }

    private static class DefaultInjector implements Injector {
        private final Context mContext;

        DefaultInjector(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd("s\u0002x\b\u0006\u0001|G}\u000b\u000b\u0012\u0004\u000e\u0015Oe\u0013\u0013\u001a\f \u001d", (short) (ZN.Xd() ^ 17889))).getMethod(Wg.Zd("E<(q\u001b\u0014\\\u001b\u0012xtWJ6Yr:6(,\u0015", (short) (FB.Xd() ^ 1528), (short) (FB.Xd() ^ 3424)), new Class[0]);
            try {
                method.setAccessible(true);
                this.mContext = (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public Resources getResources() throws Throwable {
            Context context = this.mContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd("O]Tca\\X#Yffm_ip+Annug{x", (short) (OY.Xd() ^ 2560))).getMethod(Wg.vd("\f\u000b\u0017u\u000e\u001d\u0016\u001d\u000f\u0001\u007f\u000f", (short) (C1499aX.Xd() ^ (-1415))), new Class[0]);
            try {
                method.setAccessible(true);
                return (Resources) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public android.hardware.biometrics.BiometricManager getBiometricManager() {
            return Api29Impl.create(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public FingerprintManagerCompat getFingerprintManager() {
            return FingerprintManagerCompat.from(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isDeviceSecurable() {
            return KeyguardUtils.getKeyguardManager(this.mContext) != null;
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isDeviceSecuredWithCredential() {
            return KeyguardUtils.isDeviceSecuredWithCredential(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isFingerprintHardwarePresent() {
            return PackageUtils.hasSystemFeatureFingerprint(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isFaceHardwarePresent() {
            return PackageUtils.hasSystemFeatureFace(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isIrisHardwarePresent() {
            return PackageUtils.hasSystemFeatureIris(this.mContext);
        }

        @Override // androidx.biometric.BiometricManager.Injector
        public boolean isStrongBiometricGuaranteed() {
            return DeviceUtils.canAssumeStrongBiometrics(this.mContext, Build.MODEL);
        }
    }

    public static BiometricManager from(Context context) {
        return new BiometricManager(new DefaultInjector(context));
    }

    BiometricManager(Injector injector) {
        this.mInjector = injector;
        this.mBiometricManager = Build.VERSION.SDK_INT >= 29 ? injector.getBiometricManager() : null;
        this.mFingerprintManager = Build.VERSION.SDK_INT <= 29 ? injector.getFingerprintManager() : null;
    }

    @Deprecated
    public int canAuthenticate() {
        return canAuthenticate(255);
    }

    public int canAuthenticate(int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            android.hardware.biometrics.BiometricManager biometricManager = this.mBiometricManager;
            if (biometricManager == null) {
                return 1;
            }
            return Api30Impl.canAuthenticate(biometricManager, i2);
        }
        return canAuthenticateCompat(i2);
    }

    private int canAuthenticateCompat(int i2) {
        if (!AuthenticatorUtils.isSupportedCombination(i2)) {
            return -2;
        }
        if (i2 == 0 || !this.mInjector.isDeviceSecurable()) {
            return 12;
        }
        if (AuthenticatorUtils.isDeviceCredentialAllowed(i2)) {
            return this.mInjector.isDeviceSecuredWithCredential() ? 0 : 11;
        }
        if (Build.VERSION.SDK_INT == 29) {
            return AuthenticatorUtils.isWeakBiometricAllowed(i2) ? canAuthenticateWithWeakBiometricOnApi29() : canAuthenticateWithStrongBiometricOnApi29();
        }
        if (Build.VERSION.SDK_INT == 28) {
            if (this.mInjector.isFingerprintHardwarePresent()) {
                return canAuthenticateWithFingerprintOrUnknownBiometric();
            }
            return 12;
        }
        return canAuthenticateWithFingerprint();
    }

    private int canAuthenticateWithStrongBiometricOnApi29() {
        BiometricPrompt.CryptoObject cryptoObjectWrapForBiometricPrompt;
        Method canAuthenticateWithCryptoMethod = Api29Impl.getCanAuthenticateWithCryptoMethod();
        if (canAuthenticateWithCryptoMethod != null && (cryptoObjectWrapForBiometricPrompt = CryptoObjectUtils.wrapForBiometricPrompt(CryptoObjectUtils.createFakeCryptoObject())) != null) {
            try {
                Object objInvoke = Build.VERSION.SDK_INT == 29 ? canAuthenticateWithCryptoMethod.invoke(this.mBiometricManager, cryptoObjectWrapForBiometricPrompt) : null;
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            }
        }
        int iCanAuthenticateWithWeakBiometricOnApi29 = canAuthenticateWithWeakBiometricOnApi29();
        return (this.mInjector.isStrongBiometricGuaranteed() || iCanAuthenticateWithWeakBiometricOnApi29 != 0) ? iCanAuthenticateWithWeakBiometricOnApi29 : canAuthenticateWithFingerprintOrUnknownBiometric();
    }

    private int canAuthenticateWithWeakBiometricOnApi29() {
        android.hardware.biometrics.BiometricManager biometricManager = this.mBiometricManager;
        if (biometricManager == null) {
            return 1;
        }
        return Api29Impl.canAuthenticate(biometricManager);
    }

    private int canAuthenticateWithFingerprintOrUnknownBiometric() {
        if (this.mInjector.isDeviceSecuredWithCredential()) {
            return canAuthenticateWithFingerprint() == 0 ? 0 : -1;
        }
        return canAuthenticateWithFingerprint();
    }

    private int canAuthenticateWithFingerprint() {
        FingerprintManagerCompat fingerprintManagerCompat = this.mFingerprintManager;
        if (fingerprintManagerCompat == null) {
            return 1;
        }
        if (fingerprintManagerCompat.isHardwareDetected()) {
            return !this.mFingerprintManager.hasEnrolledFingerprints() ? 11 : 0;
        }
        return 12;
    }

    public Strings getStrings(int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (this.mBiometricManager == null) {
                return null;
            }
            return new Strings(Api31Impl.getStrings(this.mBiometricManager, i2));
        }
        return new Strings(new StringsCompat(this.mInjector.getResources(), i2, this.mInjector.isFingerprintHardwarePresent(), this.mInjector.isFaceHardwarePresent(), this.mInjector.isIrisHardwarePresent(), this.mInjector.isDeviceSecuredWithCredential()));
    }

    private static class Api31Impl {
        private Api31Impl() {
        }

        static BiometricManager.Strings getStrings(android.hardware.biometrics.BiometricManager biometricManager, int i2) {
            return biometricManager.getStrings(i2);
        }

        static CharSequence getButtonLabel(BiometricManager.Strings strings) {
            return strings.getButtonLabel();
        }

        static CharSequence getPromptMessage(BiometricManager.Strings strings) {
            return strings.getPromptMessage();
        }

        static CharSequence getSettingName(BiometricManager.Strings strings) {
            return strings.getSettingName();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    private static class Api30Impl {
        private Api30Impl() {
        }

        static int canAuthenticate(android.hardware.biometrics.BiometricManager biometricManager, int i2) {
            return biometricManager.canAuthenticate(i2);
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static android.hardware.biometrics.BiometricManager create(Context context) throws Throwable {
            Object[] objArr = {android.hardware.biometrics.BiometricManager.class};
            Method method = Class.forName(C1561oA.od("*6+84-'o$/-2\"*/g{'%*\u001a,'", (short) (C1607wl.Xd() ^ 19069))).getMethod(Wg.Zd("\fhcE\u0007,p<0\u0019F~F\u0014y~", (short) (C1499aX.Xd() ^ (-4862)), (short) (C1499aX.Xd() ^ (-7588))), Class.forName(C1561oA.Kd("D<R>\fKAOI\u0011'QGZ[", (short) (C1607wl.Xd() ^ 18671))));
            try {
                method.setAccessible(true);
                return (android.hardware.biometrics.BiometricManager) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static int canAuthenticate(android.hardware.biometrics.BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static Method getCanAuthenticateWithCryptoMethod() {
            try {
                return android.hardware.biometrics.BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }
}
