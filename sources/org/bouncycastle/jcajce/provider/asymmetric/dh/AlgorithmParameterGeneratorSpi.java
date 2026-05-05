package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.generators.DHParametersGenerator;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27622l = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() throws Throwable {
        DHParametersGenerator dHParametersGenerator = new DHParametersGenerator();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            dHParametersGenerator.init(this.strength, 20, secureRandom);
        } else {
            int i2 = this.strength;
            short sXd = (short) (C1633zX.Xd() ^ (-7663));
            short sXd2 = (short) (C1633zX.Xd() ^ (-22774));
            int[] iArr = new int["\u001b;\u001e&8#Z\u001e] D\rW1\u001cS\u001fv!Qc<\u000b*~&".length()];
            QB qb = new QB("\u001b;\u001e&8#Z\u001e] D\rW1\u001cS\u001fv!Qc<\u000b*~&");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i3++;
            }
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(new String(iArr, 0, i3)).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                dHParametersGenerator.init(i2, 20, (SecureRandom) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        DHParameters dHParametersGenerateParameters = dHParametersGenerator.generateParameters();
        short sXd3 = (short) (FB.Xd() ^ 5623);
        int[] iArr2 = new int["\u007f\u0005".length()];
        QB qb2 = new QB("\u007f\u0005");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i4));
            i4++;
        }
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(new String(iArr2, 0, i4));
            algorithmParametersCreateParametersInstance.init(new DHParameterSpec(dHParametersGenerateParameters.getP(), dHParametersGenerateParameters.getG(), this.f27622l));
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
        this.f27622l = dHGenParameterSpec.getExponentSize();
        this.random = secureRandom;
    }
}
