package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.mceliece.McElieceKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mceliece.McElieceParameters;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceKeyGenParameterSpec;
import yg.C1593ug;
import yg.C1607wl;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceKeyPairGeneratorSpi extends KeyPairGenerator {
    McElieceKeyPairGenerator kpg;

    public McElieceKeyPairGeneratorSpi() {
        super("McEliece");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.kpg.generateKeyPair();
        return new KeyPair(new BCMcEliecePublicKey((McEliecePublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCMcEliecePrivateKey((McEliecePrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i2, SecureRandom secureRandom) throws Throwable {
        try {
            initialize(new McElieceKeyGenParameterSpec());
        } catch (InvalidAlgorithmParameterException unused) {
        }
    }

    @Override // java.security.KeyPairGenerator
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws Throwable {
        this.kpg = new McElieceKeyPairGenerator();
        super.initialize(algorithmParameterSpec);
        McElieceKeyGenParameterSpec mcElieceKeyGenParameterSpec = (McElieceKeyGenParameterSpec) algorithmParameterSpec;
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1593ug.zd("\u0015\r#\u000f\\#\u0016\u0015(&\u001e*0e\f\u001f\u001e1/#\u0011!/&21", (short) (C1607wl.Xd() ^ 519), (short) (C1607wl.Xd() ^ 19119))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.kpg.init(new McElieceKeyGenerationParameters((SecureRandom) constructor.newInstance(objArr), new McElieceParameters(mcElieceKeyGenParameterSpec.getM(), mcElieceKeyGenParameterSpec.getT())));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
