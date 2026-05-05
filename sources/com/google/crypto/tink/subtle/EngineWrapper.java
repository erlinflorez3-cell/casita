package com.google.crypto.tink.subtle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public interface EngineWrapper<T> {

    public static class TCipher implements EngineWrapper<Cipher> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public Cipher getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            return provider == null ? Cipher.getInstance(algorithm) : Cipher.getInstance(algorithm, provider);
        }
    }

    public static class TKeyAgreement implements EngineWrapper<KeyAgreement> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public KeyAgreement getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyAgreement.getInstance(algorithm) : KeyAgreement.getInstance(algorithm, provider);
        }
    }

    public static class TKeyFactory implements EngineWrapper<KeyFactory> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public KeyFactory getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyFactory.getInstance(algorithm) : KeyFactory.getInstance(algorithm, provider);
        }
    }

    public static class TKeyPairGenerator implements EngineWrapper<KeyPairGenerator> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public KeyPairGenerator getInstance(String algorithm, Provider provider) throws Throwable {
            if (provider != null) {
                Object[] objArr = {algorithm, provider};
                Method declaredMethod = Class.forName(Wg.Zd("$~V\u0005\fv+d9\u001aM\u001cc;5\u0013i\u001co=\u0001xY YJ{i*O", (short) (C1633zX.Xd() ^ (-32168)), (short) (C1633zX.Xd() ^ (-5289)))).getDeclaredMethod(Qg.kd("]Zh<`ddP\\PQ", (short) (C1499aX.Xd() ^ (-174)), (short) (C1499aX.Xd() ^ (-2103))), Class.forName(C1561oA.Xd("\u0013\u000b!\rZ\u001a\u0010\u001e\u0018_\u0006('\u001f%\u001f", (short) (C1580rY.Xd() ^ (-1047)))), Class.forName(Wg.vd("LDVB\u0014ZIH_]Q]g\u001d<_aiYU[i", (short) (C1499aX.Xd() ^ (-14543)))));
                try {
                    declaredMethod.setAccessible(true);
                    return (KeyPairGenerator) declaredMethod.invoke(null, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Class<?> cls = Class.forName(C1593ug.zd(")!7#p7*)<:2>Dy\u00183H 2;E\u001b:D<J:NJN", (short) (FB.Xd() ^ 8082), (short) (FB.Xd() ^ 10139)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1607wl.Xd() ^ 10012);
            int[] iArr = new int["\n\u007f\u0014}I\u0007z\u0007~Dh\t\u0006{\u007fw".length()];
            QB qb = new QB("\n\u007f\u0014}I\u0007z\u0007~Dh\t\u0006{\u007fw");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr2 = {algorithm};
            Method declaredMethod2 = cls.getDeclaredMethod(C1561oA.Kd("feuKqwygukn", (short) (FB.Xd() ^ 9759)), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                return (KeyPairGenerator) declaredMethod2.invoke(null, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    public static class TMac implements EngineWrapper<Mac> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public Mac getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            return provider == null ? Mac.getInstance(algorithm) : Mac.getInstance(algorithm, provider);
        }
    }

    public static class TMessageDigest implements EngineWrapper<MessageDigest> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public MessageDigest getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            return provider == null ? MessageDigest.getInstance(algorithm) : MessageDigest.getInstance(algorithm, provider);
        }
    }

    public static class TSignature implements EngineWrapper<Signature> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public Signature getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            return provider == null ? Signature.getInstance(algorithm) : Signature.getInstance(algorithm, provider);
        }
    }

    T getInstance(String algorithm, Provider provider) throws GeneralSecurityException;
}
