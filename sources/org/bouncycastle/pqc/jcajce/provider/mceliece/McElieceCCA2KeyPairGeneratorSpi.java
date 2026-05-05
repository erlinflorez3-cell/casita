package org.bouncycastle.pqc.jcajce.provider.mceliece;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyPairGenerator;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import yg.C1561oA;
import yg.C1580rY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceCCA2KeyPairGeneratorSpi extends KeyPairGenerator {
    private McElieceCCA2KeyPairGenerator kpg;

    public McElieceCCA2KeyPairGeneratorSpi() {
        super("McEliece-CCA2");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() throws Throwable {
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.kpg.generateKeyPair();
        return new KeyPair(new BCMcElieceCCA2PublicKey((McElieceCCA2PublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCMcElieceCCA2PrivateKey((McElieceCCA2PrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i2, SecureRandom secureRandom) throws Throwable {
        this.kpg = new McElieceCCA2KeyPairGenerator();
        this.kpg.init(new McElieceCCA2KeyGenerationParameters(secureRandom, new McElieceCCA2Parameters()));
    }

    @Override // java.security.KeyPairGenerator
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws Throwable {
        this.kpg = new McElieceCCA2KeyPairGenerator();
        super.initialize(algorithmParameterSpec);
        McElieceCCA2KeyGenParameterSpec mcElieceCCA2KeyGenParameterSpec = (McElieceCCA2KeyGenParameterSpec) algorithmParameterSpec;
        short sXd = (short) (C1580rY.Xd() ^ (-8888));
        short sXd2 = (short) (C1580rY.Xd() ^ (-21717));
        int[] iArr = new int["<<\u001aHJ,\u0001M\u0003N%\u0018'\u0006}{wlMcK5,Gr\u0013".length()];
        QB qb = new QB("<<\u001aHJ,\u0001M\u0003N%\u0018'\u0006}{wlMcK5,Gr\u0013");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.kpg.init(new McElieceCCA2KeyGenerationParameters((SecureRandom) constructor.newInstance(objArr), new McElieceCCA2Parameters(mcElieceCCA2KeyGenParameterSpec.getM(), mcElieceCCA2KeyGenParameterSpec.getT(), mcElieceCCA2KeyGenParameterSpec.getDigest())));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
