package org.bouncycastle.pqc.jcajce.provider.rainbow;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowKeyPairGenerator;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.RainbowParameterSpec;
import yg.C1499aX;
import yg.FB;
import yg.Qg;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class RainbowKeyPairGeneratorSpi extends KeyPairGenerator {
    RainbowKeyPairGenerator engine;
    boolean initialised;
    RainbowKeyGenerationParameters param;
    SecureRandom random;
    int strength;

    public RainbowKeyPairGeneratorSpi() throws Throwable {
        super(Qg.kd("CQX\\O[b", (short) (FB.Xd() ^ 23379), (short) (FB.Xd() ^ 14783)));
        this.engine = new RainbowKeyPairGenerator();
        this.strength = 1024;
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(hg.Vd("\u0014\n\u001e\bS\u0018\t\u0006\u0017\u0013\t\u0013\u0017Jn\u007f|\u000e\n{gu\u0002v\u0001}", (short) (C1499aX.Xd() ^ (-23419)), (short) (C1499aX.Xd() ^ (-31142)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
            this.initialised = false;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() throws Throwable {
        if (!this.initialised) {
            RainbowKeyGenerationParameters rainbowKeyGenerationParameters = new RainbowKeyGenerationParameters(this.random, new RainbowParameters(new RainbowParameterSpec().getVi()));
            this.param = rainbowKeyGenerationParameters;
            this.engine.init(rainbowKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCRainbowPublicKey((RainbowPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCRainbowPrivateKey((RainbowPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i2, SecureRandom secureRandom) {
        this.strength = i2;
        this.random = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws Throwable {
        if (!(algorithmParameterSpec instanceof RainbowParameterSpec)) {
            throw new InvalidAlgorithmParameterException("parameter object not a RainbowParameterSpec");
        }
        RainbowKeyGenerationParameters rainbowKeyGenerationParameters = new RainbowKeyGenerationParameters(secureRandom, new RainbowParameters(((RainbowParameterSpec) algorithmParameterSpec).getVi()));
        this.param = rainbowKeyGenerationParameters;
        this.engine.init(rainbowKeyGenerationParameters);
        this.initialised = true;
    }
}
