package org.bouncycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import yg.C1626yg;
import yg.Ig;
import yg.OY;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class BaseKeyGenerator extends KeyGeneratorSpi {
    protected String algName;
    protected int defaultKeySize;
    protected CipherKeyGenerator engine;
    protected int keySize;
    protected boolean uninitialised = true;

    protected BaseKeyGenerator(String str, int i2, CipherKeyGenerator cipherKeyGenerator) {
        this.algName = str;
        this.defaultKeySize = i2;
        this.keySize = i2;
        this.engine = cipherKeyGenerator;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected SecretKey engineGenerateKey() throws Throwable {
        if (this.uninitialised) {
            CipherKeyGenerator cipherKeyGenerator = this.engine;
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1626yg.Ud("f6bv<&v[\u007fi\u0001!Y)Ol#F}z\u001b\u0006oLYt", (short) (OY.Xd() ^ 2282), (short) (OY.Xd() ^ 18842))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                cipherKeyGenerator.init(new KeyGenerationParameters((SecureRandom) constructor.newInstance(objArr), this.defaultKeySize));
                this.uninitialised = false;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return new SecretKeySpec(this.engine.generateKey(), this.algName);
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(int i2, SecureRandom secureRandom) throws Throwable {
        if (secureRandom == null) {
            try {
                Object[] objArr = new Object[0];
                Constructor<?> constructor = Class.forName(Ig.wd("\u000eK2\u0001DEG\u0005@=2\u001fY\u0018)!rz?&\\G.(\rb", (short) (ZN.Xd() ^ 24596))).getConstructor(new Class[0]);
                try {
                    constructor.setAccessible(true);
                    secureRandom = (SecureRandom) constructor.newInstance(objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalArgumentException e3) {
                throw new InvalidParameterException(e3.getMessage());
            }
        }
        this.engine.init(new KeyGenerationParameters(secureRandom, i2));
        this.uninitialised = false;
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.engine.init(new KeyGenerationParameters(secureRandom, this.defaultKeySize));
            this.uninitialised = false;
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }
}
