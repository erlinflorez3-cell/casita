package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import androidx.biometric.BiometricPrompt;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
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

/* JADX INFO: loaded from: classes.dex */
class CryptoObjectUtils {
    private static final String FAKE_KEY_NAME = "androidxBiometric";
    private static final String KEYSTORE_INSTANCE = "AndroidKeyStore";
    private static final String TAG = "CryptoObjectUtils";

    private CryptoObjectUtils() {
    }

    static BiometricPrompt.CryptoObject unwrapFromBiometricPrompt(BiometricPrompt.CryptoObject cryptoObject) {
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = Api28Impl.getCipher(cryptoObject);
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = Api28Impl.getSignature(cryptoObject);
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = Api28Impl.getMac(cryptoObject);
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        if (Build.VERSION.SDK_INT >= 30 && (identityCredential = Api30Impl.getIdentityCredential(cryptoObject)) != null) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }
        if (Build.VERSION.SDK_INT < 33 || (presentationSession = Api33Impl.getPresentationSession(cryptoObject)) == null) {
            return null;
        }
        return new BiometricPrompt.CryptoObject(presentationSession);
    }

    static BiometricPrompt.CryptoObject wrapForBiometricPrompt(BiometricPrompt.CryptoObject cryptoObject) {
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return Api28Impl.create(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return Api28Impl.create(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return Api28Impl.create(mac);
        }
        if (Build.VERSION.SDK_INT >= 30 && (identityCredential = cryptoObject.getIdentityCredential()) != null) {
            return Api30Impl.create(identityCredential);
        }
        if (Build.VERSION.SDK_INT < 33 || (presentationSession = cryptoObject.getPresentationSession()) == null) {
            return null;
        }
        return Api33Impl.create(presentationSession);
    }

    static BiometricPrompt.CryptoObject unwrapFromFingerprintManager(FingerprintManagerCompat.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new BiometricPrompt.CryptoObject(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new BiometricPrompt.CryptoObject(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new BiometricPrompt.CryptoObject(mac);
        }
        return null;
    }

    static FingerprintManagerCompat.CryptoObject wrapForFingerprintManager(BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        Cipher cipher = cryptoObject.getCipher();
        if (cipher != null) {
            return new FingerprintManagerCompat.CryptoObject(cipher);
        }
        Signature signature = cryptoObject.getSignature();
        if (signature != null) {
            return new FingerprintManagerCompat.CryptoObject(signature);
        }
        Mac mac = cryptoObject.getMac();
        if (mac != null) {
            return new FingerprintManagerCompat.CryptoObject(mac);
        }
        if ((Build.VERSION.SDK_INT < 30 || cryptoObject.getIdentityCredential() == null) && Build.VERSION.SDK_INT >= 33 && cryptoObject.getPresentationSession() != null) {
        }
        return null;
    }

    static BiometricPrompt.CryptoObject createFakeCryptoObject() {
        String strYd = C1561oA.Yd("\u0014\"\u0019(&!\u001d2|%,+$43+&", (short) (Od.Xd() ^ (-29473)));
        String strQd = Xg.qd("e\u0014\u000b\u001a\u0018\u0013\u000fv\u0012'\u0002$ $\u0018", (short) (OY.Xd() ^ 19920), (short) (OY.Xd() ^ 17376));
        try {
            Class<?> cls = Class.forName(Jg.Wd("xzj\u00018h\u0015^\u001c$u+\u001b;\u0014x7\u001c\u0018>-\u000b", (short) (C1633zX.Xd() ^ (-32739)), (short) (C1633zX.Xd() ^ (-8505))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(ZO.xd("'H\u000f#8FA\u0002\\08\u001fJAP\u007f", (short) (C1580rY.Xd() ^ (-31170)), (short) (C1580rY.Xd() ^ (-28714))));
            Object[] objArr = {strQd};
            Method declaredMethod = cls.getDeclaredMethod(C1626yg.Ud("\u000fvB6n\u007fJ\u0013\t\u0002?", (short) (Od.Xd() ^ (-8638)), (short) (Od.Xd() ^ (-20185))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                KeyStore keyStore = (KeyStore) declaredMethod.invoke(null, objArr);
                Class<?> cls2 = Class.forName(Ig.wd("\u0015V;\tC;C\u007f6&\u0019\f=\u0002|{f \bl4q", (short) (ZN.Xd() ^ 32211)));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(EO.Od("\u001fd=\u000f=';k0 n\u001eq\u001a\u0015W0\u0002m>\u0004U8f\f\u00107Z,;`yv0$K\u0002\u0014\u007f\u0005\f", (short) (Od.Xd() ^ (-14082))));
                Object[] objArr2 = {null};
                Method method = cls2.getMethod(C1561oA.Qd("\u0002\u0004tv", (short) (OY.Xd() ^ 15463)), clsArr2);
                try {
                    method.setAccessible(true);
                    method.invoke(keyStore, objArr2);
                    KeyGenParameterSpec.Builder builderCreateKeyGenParameterSpecBuilder = Api23Impl.createKeyGenParameterSpecBuilder(strYd, 3);
                    Api23Impl.setBlockModeCBC(builderCreateKeyGenParameterSpecBuilder);
                    Api23Impl.setEncryptionPaddingPKCS7(builderCreateKeyGenParameterSpecBuilder);
                    KeyGenerator keyGenerator = KeyGenerator.getInstance(C1593ug.zd("}\u0003\u0012", (short) (C1499aX.Xd() ^ (-12474)), (short) (C1499aX.Xd() ^ (-16164))), strQd);
                    Api23Impl.initKeyGenerator(keyGenerator, Api23Impl.buildKeyGenParameterSpec(builderCreateKeyGenParameterSpecBuilder));
                    keyGenerator.generateKey();
                    short sXd = (short) (C1607wl.Xd() ^ 19489);
                    int[] iArr = new int["qg{e1ufctpfpt(D]pIiceW".length()];
                    QB qb = new QB("qg{e1ufctpfpt(D]pIiceW");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Class<?> cls3 = Class.forName(new String(iArr, 0, i2));
                    Class<?>[] clsArr3 = new Class[2];
                    clsArr3[0] = Class.forName(C1561oA.Kd("\u000f\u0007\u001d\tV\u0016\f\u001a\u0014[\u0002$#\u001b!\u001b", (short) (C1633zX.Xd() ^ (-23074))));
                    clsArr3[1] = char[].class;
                    Object[] objArr3 = {strYd, null};
                    Method method2 = cls3.getMethod(Wg.Zd("\b\u001fh%Xr", (short) (FB.Xd() ^ 27621), (short) (FB.Xd() ^ 11613)), clsArr3);
                    try {
                        method2.setAccessible(true);
                        SecretKey secretKey = (SecretKey) ((Key) method2.invoke(keyStore, objArr3));
                        Cipher cipher = Cipher.getInstance(C1561oA.Xd("JO^;PPR?a]VgLfx|}\u0004\n\u0004", (short) (C1580rY.Xd() ^ (-18514))));
                        cipher.init(1, secretKey);
                        return new BiometricPrompt.CryptoObject(cipher);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e5) {
            Wg.vd("5ci_jdCUTNK[CaUWU", (short) (Od.Xd() ^ (-28335)));
            Qg.kd("Smtvnl'zt$ftfasc\u001db\\e^\u0018Zhndga\u0011_QXRO_\u0018", (short) (ZN.Xd() ^ 30918), (short) (ZN.Xd() ^ 22896));
            return null;
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
        }

        static BiometricPrompt.CryptoObject create(PresentationSession presentationSession) {
            return new BiometricPrompt.CryptoObject(presentationSession);
        }

        static PresentationSession getPresentationSession(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getPresentationSession();
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static BiometricPrompt.CryptoObject create(IdentityCredential identityCredential) {
            return new BiometricPrompt.CryptoObject(identityCredential);
        }

        static IdentityCredential getIdentityCredential(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getIdentityCredential();
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        static BiometricPrompt.CryptoObject create(Cipher cipher) {
            return new BiometricPrompt.CryptoObject(cipher);
        }

        static BiometricPrompt.CryptoObject create(Signature signature) {
            return new BiometricPrompt.CryptoObject(signature);
        }

        static BiometricPrompt.CryptoObject create(Mac mac) {
            return new BiometricPrompt.CryptoObject(mac);
        }

        static Cipher getCipher(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getCipher();
        }

        static Signature getSignature(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getSignature();
        }

        static Mac getMac(BiometricPrompt.CryptoObject cryptoObject) {
            return cryptoObject.getMac();
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        static KeyGenParameterSpec.Builder createKeyGenParameterSpecBuilder(String str, int i2) {
            return new KeyGenParameterSpec.Builder(str, i2);
        }

        static void setBlockModeCBC(KeyGenParameterSpec.Builder builder) throws Throwable {
            String[] strArr = new String[1];
            short sXd = (short) (C1580rY.Xd() ^ (-8641));
            int[] iArr = new int["##%".length()];
            QB qb = new QB("##%");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            strArr[0] = new String(iArr, 0, i2);
            short sXd2 = (short) (Od.Xd() ^ (-29223));
            short sXd3 = (short) (Od.Xd() ^ (-13391));
            int[] iArr2 = new int["{\n\u0001\u0010\u000e\t\u0005O\u0016\t\b\u001b\u0019\u0011\u001d#X\u0017\u0012'\"$ $\u0018a\u007f\u001b0~\u001e(\u000b\u001d/\u001f,%5'5\u00175+*k\u000b?4813A".length()];
            QB qb2 = new QB("{\n\u0001\u0010\u000e\t\u0005O\u0016\t\b\u001b\u0019\u0011\u001d#X\u0017\u0012'\"$ $\u0018a\u007f\u001b0~\u001e(\u000b\u001d/\u001f,%5'5\u00175+*k\u000b?4813A");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            Object[] objArr = {strArr};
            Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Jg.Wd("\u0016^aLy\u0016\u0006Tq}\u0016\u00165", (short) (FB.Xd() ^ 14917), (short) (FB.Xd() ^ 6644)), String[].class);
            try {
                method.setAccessible(true);
                method.invoke(builder, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static void setEncryptionPaddingPKCS7(KeyGenParameterSpec.Builder builder) throws Throwable {
            String[] strArr = new String[1];
            short sXd = (short) (FB.Xd() ^ 15120);
            short sXd2 = (short) (FB.Xd() ^ 9378);
            int[] iArr = new int["\u001dj:\u0018\u0015[zMK-R=".length()];
            QB qb = new QB("\u001dj:\u0018\u0015[zMK-R=");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            strArr[0] = new String(iArr, 0, i2);
            Object[] objArr = {strArr};
            Method method = Class.forName(C1626yg.Ud("#\u0006 <&<tV>\u0001OkaFx~_\u00137R\u0015\u001d>s\u0004x\u0002_{d[5\u000f5lh.[5`EH\u0002F*X*;B^VQq", (short) (Od.Xd() ^ (-30931)), (short) (Od.Xd() ^ (-1370)))).getMethod(Ig.wd("g\"~C4d\u0004Jjra-}mF+\u0003}J'l", (short) (C1580rY.Xd() ^ (-21244))), String[].class);
            try {
                method.setAccessible(true);
                method.invoke(builder, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static KeyGenParameterSpec buildKeyGenParameterSpec(KeyGenParameterSpec.Builder builder) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("\u0016\"\u0017$ \u0019\u0013[ \u0011\u000e\u001f\u001b\u0011\u001b\u001fR\u000f\b\u001b\u0014\u0014\u000e\u0010\u0002Ie~\u0012^{\u0004dt\u0005r}t\u0003r~^znk+Hzmoffr", (short) (C1633zX.Xd() ^ (-21226)))).getMethod(C1561oA.yd("\u0001\u0015\n\u000e\u0007", (short) (C1499aX.Xd() ^ (-20900))), new Class[0]);
            try {
                method.setAccessible(true);
                return (KeyGenParameterSpec) method.invoke(builder, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static void initKeyGenerator(KeyGenerator keyGenerator, KeyGenParameterSpec keyGenParameterSpec) throws InvalidAlgorithmParameterException {
            keyGenerator.init(keyGenParameterSpec);
        }
    }
}
