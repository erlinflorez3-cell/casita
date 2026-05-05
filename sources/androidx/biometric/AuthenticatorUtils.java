package androidx.biometric;

import android.os.Build;
import androidx.biometric.BiometricPrompt;

/* JADX INFO: loaded from: classes.dex */
class AuthenticatorUtils {
    private static final int BIOMETRIC_CLASS_MASK = 32767;

    static int getBiometricAuthenticators(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 32767));
    }

    static boolean isDeviceCredentialAllowed(int i2) {
        return (i2 & 32768) != 0;
    }

    static boolean isWeakBiometricAllowed(int i2) {
        return (i2 + 255) - (i2 | 255) == 255;
    }

    private AuthenticatorUtils() {
    }

    static String convertToString(int i2) {
        if (i2 == 15) {
            return "BIOMETRIC_STRONG";
        }
        if (i2 == 255) {
            return "BIOMETRIC_WEAK";
        }
        if (i2 == 32768) {
            return "DEVICE_CREDENTIAL";
        }
        if (i2 == 32783) {
            return "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
        }
        if (i2 == 33023) {
            return "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
        }
        return String.valueOf(i2);
    }

    static int getConsolidatedAuthenticators(BiometricPrompt.PromptInfo promptInfo, BiometricPrompt.CryptoObject cryptoObject) {
        if (promptInfo.getAllowedAuthenticators() != 0) {
            return promptInfo.getAllowedAuthenticators();
        }
        int i2 = cryptoObject != null ? 15 : 255;
        return promptInfo.isDeviceCredentialAllowed() ? (-1) - (((-1) - 32768) & ((-1) - i2)) : i2;
    }

    static boolean isSupportedCombination(int i2) {
        if (i2 == 15 || i2 == 255) {
            return true;
        }
        return i2 != 32768 ? i2 != 32783 ? i2 == 33023 || i2 == 0 : Build.VERSION.SDK_INT < 28 || Build.VERSION.SDK_INT > 29 : Build.VERSION.SDK_INT >= 30;
    }

    static boolean isSomeBiometricAllowed(int i2) {
        return getBiometricAuthenticators(i2) != 0;
    }
}
