package org.bouncycastle.pqc.jcajce.provider.newhope;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.newhope.NHKeyPairGenerator;
import org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters;
import yg.C1561oA;
import yg.OY;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class NHKeyPairGeneratorSpi extends KeyPairGenerator {
    NHKeyPairGenerator engine;
    boolean initialised;
    SecureRandom random;

    public NHKeyPairGeneratorSpi() throws Throwable {
        super(C1561oA.Xd("\u0016\u0011", (short) (ZN.Xd() ^ 22149)));
        this.engine = new NHKeyPairGenerator();
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Wg.vd("F<T>\u0006J?<IE?II|%6/@@2\u001a(8-30", (short) (OY.Xd() ^ 30890))).getConstructor(new Class[0]);
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
            this.engine.init(new KeyGenerationParameters(this.random, 1024));
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCNHPublicKey((NHPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCNHPrivateKey((NHPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i2, SecureRandom secureRandom) {
        if (i2 != 1024) {
            throw new IllegalArgumentException("strength must be 1024 bits");
        }
        this.engine.init(new KeyGenerationParameters(secureRandom, 1024));
        this.initialised = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("parameter object not recognised");
    }
}
