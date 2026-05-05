package org.bouncycastle.jcajce.provider.symmetric;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.RC532Engine;
import org.bouncycastle.crypto.engines.RC564Engine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public final class RC5 {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() throws Throwable {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(ZO.xd("w\u0001\u001aw\u00066 <\u0016~\u0010t@B\u0010Qm*dJ\"}\b6/\u0019", (short) (C1607wl.Xd() ^ 9851), (short) (C1607wl.Xd() ^ 107))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    this.random = (SecureRandom) constructor.newInstance(objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            SecureRandom secureRandom = this.random;
            Class<?> cls = Class.forName(C1626yg.Ud("22\u0019n\u001et\u001d\f'{g\u0015*\u000eg*v=\u0010+\u0015\u0012\u001cF+9", (short) (OY.Xd() ^ 9387), (short) (OY.Xd() ^ 20965)));
            Class<?>[] clsArr = {byte[].class};
            Object[] objArr2 = {bArr};
            short sXd = (short) (C1607wl.Xd() ^ 30611);
            int[] iArr = new int["\u0002Rq\u000boZ/}]".length()];
            QB qb = new QB("\u0002Rq\u000boZ/}]");
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
                method.invoke(secureRandom, objArr2);
                try {
                    AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(EO.Od("\tI~", (short) (Od.Xd() ^ (-18742))));
                    algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                    return algorithmParametersCreateParametersInstance;
                } catch (Exception e3) {
                    throw new RuntimeException(e3.getMessage());
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC5 parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "RC5 IV";
        }
    }

    public static class CBC32 extends BaseBlockCipher {
        public CBC32() {
            super(new CBCBlockCipher(new RC532Engine()), 64);
        }
    }

    public static class CFB8Mac32 extends BaseMac {
        public CFB8Mac32() {
            super(new CFBBlockCipherMac(new RC532Engine()));
        }
    }

    public static class ECB32 extends BaseBlockCipher {
        public ECB32() {
            super(new RC532Engine());
        }
    }

    public static class ECB64 extends BaseBlockCipher {
        public ECB64() {
            super(new RC564Engine());
        }
    }

    public static class KeyGen32 extends BaseKeyGenerator {
        public KeyGen32() {
            super("RC5", 128, new CipherKeyGenerator());
        }
    }

    public static class KeyGen64 extends BaseKeyGenerator {
        public KeyGen64() {
            super("RC5-64", 256, new CipherKeyGenerator());
        }
    }

    public static class Mac32 extends BaseMac {
        public Mac32() {
            super(new CBCBlockCipherMac(new RC532Engine()));
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = RC5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            configurableProvider.addAlgorithm("Cipher.RC5", sb.append(str).append("$ECB32").toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RC5-32", "RC5");
            configurableProvider.addAlgorithm("Cipher.RC5-64", str + "$ECB64");
            configurableProvider.addAlgorithm("KeyGenerator.RC5", str + "$KeyGen32");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.RC5-32", "RC5");
            configurableProvider.addAlgorithm("KeyGenerator.RC5-64", str + "$KeyGen64");
            configurableProvider.addAlgorithm("AlgorithmParameters.RC5", str + "$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.RC5-64", str + "$AlgParams");
            configurableProvider.addAlgorithm("Mac.RC5MAC", str + "$Mac32");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC5", "RC5MAC");
            configurableProvider.addAlgorithm("Mac.RC5MAC/CFB8", str + "$CFB8Mac32");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
        }
    }

    private RC5() {
    }
}
