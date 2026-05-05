package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.generators.ElGamalParametersGenerator;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27633l = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() throws Throwable {
        ElGamalParametersGenerator elGamalParametersGenerator = new ElGamalParametersGenerator();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            elGamalParametersGenerator.init(this.strength, 20, secureRandom);
        } else {
            int i2 = this.strength;
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(ZO.xd("AQ~}r(jom\u0002_Z\u0018h+n}pMPD\u0018l\u0019\u0012\u000b", (short) (OY.Xd() ^ 12002), (short) (OY.Xd() ^ 5954))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                elGamalParametersGenerator.init(i2, 20, (SecureRandom) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        ElGamalParameters elGamalParametersGenerateParameters = elGamalParametersGenerator.generateParameters();
        short sXd = (short) (C1580rY.Xd() ^ (-8799));
        short sXd2 = (short) (C1580rY.Xd() ^ (-16394));
        int[] iArr = new int["j$KIwdk".length()];
        QB qb = new QB("j$KIwdk");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(new String(iArr, 0, i3));
            algorithmParametersCreateParametersInstance.init(new DHParameterSpec(elGamalParametersGenerateParameters.getP(), elGamalParametersGenerateParameters.getG(), this.f27633l));
            return algorithmParametersCreateParametersInstance;
        } catch (Exception e3) {
            throw new RuntimeException(e3.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i2, SecureRandom secureRandom) {
        this.strength = i2;
        this.random = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof DHGenParameterSpec)) {
            throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
        }
        DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
        this.strength = dHGenParameterSpec.getPrimeSize();
        this.f27633l = dHGenParameterSpec.getExponentSize();
        this.random = secureRandom;
    }
}
