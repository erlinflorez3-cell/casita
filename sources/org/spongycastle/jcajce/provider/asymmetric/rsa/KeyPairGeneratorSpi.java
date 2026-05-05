package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.generators.RSAKeyPairGenerator;
import org.spongycastle.crypto.params.RSAKeyGenerationParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import yg.C1633zX;
import yg.Qg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    static final BigInteger defaultPublicExponent = BigInteger.valueOf(65537);
    static final int defaultTests = 112;
    RSAKeyPairGenerator engine;
    RSAKeyGenerationParameters param;

    public KeyPairGeneratorSpi() throws Throwable {
        super(Qg.kd("VVC", (short) (C1633zX.Xd() ^ (-25912)), (short) (C1633zX.Xd() ^ (-22970))));
        this.engine = new RSAKeyPairGenerator();
        BigInteger bigInteger = defaultPublicExponent;
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(hg.Vd("\u0001v\u000bt@\u0005ur\u0004\u007fu\u007f\u00047[lizvhTbncmj", (short) (ZN.Xd() ^ 24771), (short) (ZN.Xd() ^ 2425))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            RSAKeyGenerationParameters rSAKeyGenerationParameters = new RSAKeyGenerationParameters(bigInteger, (SecureRandom) constructor.newInstance(objArr), 2048, 112);
            this.param = rSAKeyGenerationParameters;
            this.engine.init(rSAKeyGenerationParameters);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCRSAPublicKey((RSAKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCRSAPrivateCrtKey((RSAPrivateCrtKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i2, SecureRandom secureRandom) {
        RSAKeyGenerationParameters rSAKeyGenerationParameters = new RSAKeyGenerationParameters(defaultPublicExponent, secureRandom, i2, 112);
        this.param = rSAKeyGenerationParameters;
        this.engine.init(rSAKeyGenerationParameters);
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof RSAKeyGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a RSAKeyGenParameterSpec");
        }
        RSAKeyGenParameterSpec rSAKeyGenParameterSpec = (RSAKeyGenParameterSpec) algorithmParameterSpec;
        RSAKeyGenerationParameters rSAKeyGenerationParameters = new RSAKeyGenerationParameters(rSAKeyGenParameterSpec.getPublicExponent(), secureRandom, rSAKeyGenParameterSpec.getKeysize(), 112);
        this.param = rSAKeyGenerationParameters;
        this.engine.init(rSAKeyGenerationParameters);
    }
}
