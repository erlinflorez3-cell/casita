package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Handler;
import androidx.core.os.CancellationSignal;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class FingerprintManagerCompat {
    private final Context mContext;

    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i2, CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i2, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        }
    }

    public static FingerprintManagerCompat from(Context context) {
        return new FingerprintManagerCompat(context);
    }

    private FingerprintManagerCompat(Context context) {
        this.mContext = context;
    }

    public boolean hasEnrolledFingerprints() {
        FingerprintManager fingerprintManagerOrNull = getFingerprintManagerOrNull(this.mContext);
        return fingerprintManagerOrNull != null && Api23Impl.hasEnrolledFingerprints(fingerprintManagerOrNull);
    }

    public boolean isHardwareDetected() {
        FingerprintManager fingerprintManagerOrNull = getFingerprintManagerOrNull(this.mContext);
        return fingerprintManagerOrNull != null && Api23Impl.isHardwareDetected(fingerprintManagerOrNull);
    }

    @Deprecated
    public void authenticate(CryptoObject cryptoObject, int i2, CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        authenticate(cryptoObject, i2, cancellationSignal != null ? (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject() : null, authenticationCallback, handler);
    }

    public void authenticate(CryptoObject cryptoObject, int i2, android.os.CancellationSignal cancellationSignal, AuthenticationCallback authenticationCallback, Handler handler) {
        FingerprintManager fingerprintManagerOrNull = getFingerprintManagerOrNull(this.mContext);
        if (fingerprintManagerOrNull != null) {
            Api23Impl.authenticate(fingerprintManagerOrNull, wrapCryptoObject(cryptoObject), cancellationSignal, i2, wrapCallback(authenticationCallback), handler);
        }
    }

    private static FingerprintManager getFingerprintManagerOrNull(Context context) {
        return Api23Impl.getFingerprintManagerOrNull(context);
    }

    private static FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
        return Api23Impl.wrapCryptoObject(cryptoObject);
    }

    static CryptoObject unwrapCryptoObject(FingerprintManager.CryptoObject cryptoObject) {
        return Api23Impl.unwrapCryptoObject(cryptoObject);
    }

    private static FingerprintManager.AuthenticationCallback wrapCallback(final AuthenticationCallback authenticationCallback) {
        return new FingerprintManager.AuthenticationCallback() { // from class: androidx.core.hardware.fingerprint.FingerprintManagerCompat.1
            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationError(int i2, CharSequence charSequence) {
                authenticationCallback.onAuthenticationError(i2, charSequence);
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationHelp(int i2, CharSequence charSequence) {
                authenticationCallback.onAuthenticationHelp(i2, charSequence);
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                authenticationCallback.onAuthenticationSucceeded(new AuthenticationResult(FingerprintManagerCompat.unwrapCryptoObject(Api23Impl.getCryptoObject(authenticationResult))));
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationFailed() {
                authenticationCallback.onAuthenticationFailed();
            }
        };
    }

    public static class CryptoObject {
        private final Cipher mCipher;
        private final Mac mMac;
        private final Signature mSignature;

        public CryptoObject(Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
        }

        public CryptoObject(Cipher cipher) {
            this.mCipher = cipher;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(Mac mac) {
            this.mMac = mac;
            this.mCipher = null;
            this.mSignature = null;
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
    }

    public static final class AuthenticationResult {
        private final CryptoObject mCryptoObject;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean hasEnrolledFingerprints(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        static boolean isHardwareDetected(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        static void authenticate(Object obj, Object obj2, android.os.CancellationSignal cancellationSignal, int i2, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i2, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static FingerprintManager.CryptoObject getCryptoObject(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager getFingerprintManagerOrNull(Context context) throws Throwable {
            short sXd = (short) (FB.Xd() ^ 8610);
            int[] iArr = new int["\u0011\u001d\u0016##\u001c\u001ab\u001b&(-!)2jb\u000e\u0010\u0015\t\u001b\u001a".length()];
            QB qb = new QB("\u0011\u001d\u0016##\u001c\u001ab\u001b&(-!)2jb\u000e\u0010\u0015\t\u001b\u001a");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Yd("\r\f\u001cx\u000b\u000e\u0017\u000e\u0015\u0014|\u0012 \u0014\u001b\u001a(", (short) (ZN.Xd() ^ 14755)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Object[] objArr2 = {Xg.qd("UcZigb^)d^pcwbth2kouon|{~v|\u0004", (short) (C1607wl.Xd() ^ 32365), (short) (C1607wl.Xd() ^ 24541))};
                Method method2 = Class.forName(Jg.Wd("e|\u0015+Jpm_;Kt\u001b\u0016AS/\u0016\u001d\u0002N_\f88d\u0003t-DW\b\n=", (short) (ZN.Xd() ^ 30725), (short) (ZN.Xd() ^ 9168))).getMethod(C1626yg.Ud("B^C\u001a\u0016\\\u0013~yTz3'k|\u0004", (short) (ZN.Xd() ^ 31091), (short) (ZN.Xd() ^ 28769)), Class.forName(ZO.xd("`5cN`S64G\u0002T\u001bQ\tqG", (short) (Od.Xd() ^ (-5844)), (short) (Od.Xd() ^ (-18635)))));
                try {
                    method2.setAccessible(true);
                    if (!((Boolean) method2.invoke(packageManager, objArr2)).booleanValue()) {
                        return null;
                    }
                    Object[] objArr3 = {FingerprintManager.class};
                    Method method3 = Class.forName(Ig.wd("gI\u000b~)VkZaCB(jwo\u0011m\u0012f\"TA\u0011", (short) (Od.Xd() ^ (-26052)))).getMethod(C1561oA.Qd("C@N,QJJ:A&7CF812", (short) (C1607wl.Xd() ^ 20574)), Class.forName(EO.Od("Ff*8\r)ub+\u0001\u0010_ @,", (short) (OY.Xd() ^ 26808))));
                    try {
                        method3.setAccessible(true);
                        return (FingerprintManager) method3.invoke(context, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }

        public static FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        public static CryptoObject unwrapCryptoObject(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }
    }
}
