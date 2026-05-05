package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.params.DSAParameterGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import yg.C1561oA;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected DSAParameterGenerationParameters params;
    protected SecureRandom random;
    protected int strength = 1024;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() throws Throwable {
        DSAParametersGenerator dSAParametersGenerator = this.strength <= 1024 ? new DSAParametersGenerator() : new DSAParametersGenerator(new SHA256Digest());
        if (this.random == null) {
            short sXd = (short) (ZN.Xd() ^ 17548);
            int[] iArr = new int["]{\u0001Que7&p\u000e\u00030i\u0018i\"BZ\u0010'<\u0018OI\\\u0013".length()];
            QB qb = new QB("]{\u0001Que7&p\u000e\u00030i\u0018i\"BZ\u0010'<\u0018OI\\\u0013");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        int i3 = this.strength;
        if (i3 == 1024) {
            DSAParameterGenerationParameters dSAParameterGenerationParameters = new DSAParameterGenerationParameters(1024, 160, 80, this.random);
            this.params = dSAParameterGenerationParameters;
            dSAParametersGenerator.init(dSAParameterGenerationParameters);
        } else if (i3 > 1024) {
            DSAParameterGenerationParameters dSAParameterGenerationParameters2 = new DSAParameterGenerationParameters(this.strength, 256, 80, this.random);
            this.params = dSAParameterGenerationParameters2;
            dSAParametersGenerator.init(dSAParameterGenerationParameters2);
        } else {
            dSAParametersGenerator.init(i3, 20, this.random);
        }
        DSAParameters dSAParametersGenerateParameters = dSAParametersGenerator.generateParameters();
        short sXd2 = (short) (FB.Xd() ^ 30862);
        int[] iArr2 = new int["jHJ".length()];
        QB qb2 = new QB("jHJ");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i4)) + xuXd2.CK(iKK2));
            i4++;
        }
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(new String(iArr2, 0, i4));
            algorithmParametersCreateParametersInstance.init(new DSAParameterSpec(dSAParametersGenerateParameters.getP(), dSAParametersGenerateParameters.getQ(), dSAParametersGenerateParameters.getG()));
            return algorithmParametersCreateParametersInstance;
        } catch (Exception e3) {
            throw new RuntimeException(e3.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i2, SecureRandom secureRandom) {
        if (i2 < 512 || i2 > 3072) {
            throw new InvalidParameterException("strength must be from 512 - 3072");
        }
        if (i2 <= 1024 && i2 % 64 != 0) {
            throw new InvalidParameterException("strength must be a multiple of 64 below 1024 bits.");
        }
        if (i2 > 1024 && i2 % 1024 != 0) {
            throw new InvalidParameterException("strength must be a multiple of 1024 above 1024 bits.");
        }
        this.strength = i2;
        this.random = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }
}
