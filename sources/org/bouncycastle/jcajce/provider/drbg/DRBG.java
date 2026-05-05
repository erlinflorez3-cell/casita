package org.bouncycastle.jcajce.provider.drbg;

import androidx.webkit.Profile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;
import yg.C1561oA;
import yg.C1580rY;
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
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class DRBG {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.drbg.DRBG";
    private static final String[][] initialEntropySourceNames = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};
    private static final Object[] initialEntropySourceAndSpi = findSource();

    private static class CoreSecureRandom extends SecureRandom {
        CoreSecureRandom() {
            super((SecureRandomSpi) DRBG.initialEntropySourceAndSpi[1], (Provider) DRBG.initialEntropySourceAndSpi[0]);
        }
    }

    public static class Default extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(true);

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i2) throws Throwable {
            SecureRandom secureRandom = random;
            Class<?> cls = Class.forName(EO.Od("Q\u001b}I\u0005\u0007\rC\u0004ufS\u0003Evk\u0006\u0016kV\u0002i\u0011\u0003\u001cN", (short) (C1633zX.Xd() ^ (-21981))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(C1561oA.Qd("=:B8D2D4!21/", (short) (ZN.Xd() ^ 12417)), clsArr);
            try {
                method.setAccessible(true);
                return (byte[]) method.invoke(secureRandom, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) throws Throwable {
            SecureRandom secureRandom = random;
            short sXd = (short) (C1607wl.Xd() ^ 19277);
            short sXd2 = (short) (C1607wl.Xd() ^ 26921);
            int[] iArr = new int["\u001f\u0017-\u0019f- \u001f20(4:o\u0016)(;9-\u001b+90<;".length()];
            QB qb = new QB("\u001f\u0017-\u0019f- \u001f20(4:o\u0016)(;9-\u001b+90<;");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Object[] objArr = {bArr};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("7-?:\u0007=7'4", (short) (OY.Xd() ^ 4005)), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) throws Throwable {
            SecureRandom secureRandom = random;
            Object[] objArr = {bArr};
            Method method = Class.forName(C1561oA.Kd("QI_K\u0019_RQdbZfl\"H[Zmk_M]kbnm", (short) (C1580rY.Xd() ^ (-29050)))).getMethod(Wg.Zd("O\u0016yMS(\u001c", (short) (C1580rY.Xd() ^ (-3567)), (short) (C1580rY.Xd() ^ (-32265))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("SecureRandom.DEFAULT", DRBG.PREFIX + "$Default");
            configurableProvider.addAlgorithm("SecureRandom.NONCEANDIV", DRBG.PREFIX + "$NonceAndIV");
        }
    }

    public static class NonceAndIV extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(false);

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i2) throws Throwable {
            SecureRandom secureRandom = random;
            Class<?> cls = Class.forName(C1561oA.Xd(" \u0018.\u001ag.! 31)5;p\u0017*)<:.\u001c,:1=<", (short) (C1607wl.Xd() ^ 8969)));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            Method method = cls.getMethod(Wg.vd("]Zf\\lZp`Qbec", (short) (C1607wl.Xd() ^ 11860)), clsArr);
            try {
                method.setAccessible(true);
                return (byte[]) method.invoke(secureRandom, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // java.security.SecureRandomSpi
        protected void engineNextBytes(byte[] bArr) throws Throwable {
            SecureRandom secureRandom = random;
            short sXd = (short) (Od.Xd() ^ (-5399));
            short sXd2 = (short) (Od.Xd() ^ (-21062));
            int[] iArr = new int["\u0013\t\u001d\u0007R\u0017\b\u0005\u0016\u0012\b\u0012\u0016Im~{\r\tzft\u0001u\u007f|".length()];
            QB qb = new QB("\u0013\t\u001d\u0007R\u0017\b\u0005\u0016\u0012\b\u0012\u0016Im~{\r\tzft\u0001u\u007f|");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Object[] objArr = {bArr};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("%\u001b-(t+%\u0015\"", (short) (C1580rY.Xd() ^ (-25060)), (short) (C1580rY.Xd() ^ (-17329))), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) throws Throwable {
            SecureRandom secureRandom = random;
            Class<?> cls = Class.forName(C1561oA.ud("MCWA\rQB?PLBLP\u0004(96GC5!/;0:7", (short) (Od.Xd() ^ (-9303))));
            Class<?>[] clsArr = {byte[].class};
            Object[] objArr = {bArr};
            short sXd = (short) (ZN.Xd() ^ 6566);
            int[] iArr = new int["\u0019\f\u0018w\u0007\b\u0004".length()];
            QB qb = new QB("\u0019\f\u0018w\u0007\b\u0004");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom createBaseRandom(boolean z2) throws Throwable {
        if (System.getProperty(C1561oA.Yd("fj`(]krlbydcvxqk5l{lr:r|\u0004\u0003\u0001\u0003\r\b\u0005\f\n{~", (short) (Od.Xd() ^ (-8271)))) != null) {
            EntropySourceProvider entropySourceProviderCreateEntropySource = createEntropySource();
            EntropySource entropySource = entropySourceProviderCreateEntropySource.get(128);
            return new SP800SecureRandomBuilder(entropySourceProviderCreateEntropySource).setPersonalizationString(generateDefaultPersonalizationString(entropySource.getEntropy())).buildHash(new SHA512Digest(), Arrays.concatenate(entropySource.getEntropy(), entropySource.getEntropy()), z2);
        }
        SecureRandom secureRandomCreateInitialEntropySource = createInitialEntropySource();
        SP800SecureRandomBuilder sP800SecureRandomBuilder = new SP800SecureRandomBuilder(secureRandomCreateInitialEntropySource, true);
        Object[] objArr = {16};
        Method method = Class.forName(Xg.qd("vn\u0005p>\u0005wv\n\b\u007f\f\u0012Gm\u0001\u007f\u0013\u0011\u0005r\u0003\u0011\b\u0014\u0013", (short) (C1580rY.Xd() ^ (-1733)), (short) (C1580rY.Xd() ^ (-18132)))).getMethod(Jg.Wd("~\u0005ut*!\u001c\u0015;5=d", (short) (ZN.Xd() ^ 13555), (short) (ZN.Xd() ^ 14961)), Integer.TYPE);
        try {
            method.setAccessible(true);
            SP800SecureRandomBuilder personalizationString = sP800SecureRandomBuilder.setPersonalizationString(generateDefaultPersonalizationString((byte[]) method.invoke(secureRandomCreateInitialEntropySource, objArr)));
            SHA512Digest sHA512Digest = new SHA512Digest();
            short sXd = (short) (OY.Xd() ^ 18921);
            short sXd2 = (short) (OY.Xd() ^ 18184);
            int[] iArr = new int["n>doo^7\u001b`\\\u0019Cx9pc[F*6[(a\u001a\u000e\u0002".length()];
            QB qb = new QB("n>doo^7\u001b`\\\u0019Cx9pc[F*6[(a\u001a\u000e\u0002");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Object[] objArr2 = {32};
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(C1626yg.Ud(";ow^\u001aH@Vu[\u007f\u0014", (short) (Od.Xd() ^ (-20065)), (short) (Od.Xd() ^ (-6110))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                return personalizationString.buildHash(sHA512Digest, (byte[]) method2.invoke(secureRandomCreateInitialEntropySource, objArr2), z2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static EntropySourceProvider createEntropySource() {
        final String property = System.getProperty("org.bouncycastle.drbg.entropysource");
        return (EntropySourceProvider) AccessController.doPrivileged(new PrivilegedAction<EntropySourceProvider>() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.1
            @Override // java.security.PrivilegedAction
            public EntropySourceProvider run() {
                try {
                    return (EntropySourceProvider) DRBG.class.getClassLoader().loadClass(property).newInstance();
                } catch (Exception e2) {
                    throw new IllegalStateException("entropy source " + property + " not created: " + e2.getMessage(), e2);
                }
            }
        });
    }

    private static SecureRandom createInitialEntropySource() throws Throwable {
        if (initialEntropySourceAndSpi != null) {
            return new CoreSecureRandom();
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Ig.wd("/X]')\u0012eI\u0011C6e\u0018Lo%Jx+\u0014F\u0013H<H`", (short) (FB.Xd() ^ 11016))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            return (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static final Object[] findSource() {
        int i2 = 0;
        while (true) {
            String[][] strArr = initialEntropySourceNames;
            if (i2 >= strArr.length) {
                return null;
            }
            String[] strArr2 = strArr[i2];
            try {
                return new Object[]{Class.forName(strArr2[0]).newInstance(), Class.forName(strArr2[1]).newInstance()};
            } catch (Throwable unused) {
                i2++;
            }
        }
    }

    private static byte[] generateDefaultPersonalizationString(byte[] bArr) {
        return Arrays.concatenate(Strings.toByteArray(Profile.DEFAULT_PROFILE_NAME), bArr, Pack.longToBigEndian(Thread.currentThread().getId()), Pack.longToBigEndian(System.currentTimeMillis()));
    }

    private static byte[] generateNonceIVPersonalizationString(byte[] bArr) {
        return Arrays.concatenate(Strings.toByteArray("Nonce"), bArr, Pack.longToLittleEndian(Thread.currentThread().getId()), Pack.longToLittleEndian(System.currentTimeMillis()));
    }
}
