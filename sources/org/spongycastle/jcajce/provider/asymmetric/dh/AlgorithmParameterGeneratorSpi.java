package org.spongycastle.jcajce.provider.asymmetric.dh;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.crypto.generators.DHParametersGenerator;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected SecureRandom random;
    protected int strength = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27984l = 0;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() throws Throwable {
        DHParametersGenerator dHParametersGenerator = new DHParametersGenerator();
        SecureRandom secureRandom = this.random;
        if (secureRandom != null) {
            dHParametersGenerator.init(this.strength, 20, secureRandom);
        } else {
            int i2 = this.strength;
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Wg.Zd("Lc:\tV\u001e3sI\b@nu.5\tJ\u001e^3\"5c\u001bi)", (short) (ZN.Xd() ^ 2527), (short) (ZN.Xd() ^ 22534))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                dHParametersGenerator.init(i2, 20, (SecureRandom) constructor.newInstance(objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        DHParameters dHParametersGenerateParameters = dHParametersGenerator.generateParameters();
        short sXd = (short) (OY.Xd() ^ 10468);
        int[] iArr = new int["\u0011\u0016".length()];
        QB qb = new QB("\u0011\u0016");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
            i3++;
        }
        try {
            AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(new String(iArr, 0, i3));
            algorithmParametersCreateParametersInstance.init(new DHParameterSpec(dHParametersGenerateParameters.getP(), dHParametersGenerateParameters.getG(), this.f27984l));
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
        this.f27984l = dHGenParameterSpec.getExponentSize();
        this.random = secureRandom;
    }
}
