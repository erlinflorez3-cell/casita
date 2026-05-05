package org.bouncycastle.crypto.ec;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import yg.C1580rY;
import yg.C1633zX;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class ECNewPublicKeyTransform implements ECPairTransform {
    private ECPublicKeyParameters key;
    private SecureRandom random;

    protected ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public void init(CipherParameters cipherParameters) throws Throwable {
        SecureRandom random;
        boolean z2 = cipherParameters instanceof ParametersWithRandom;
        short sXd = (short) (C1580rY.Xd() ^ (-510));
        short sXd2 = (short) (C1580rY.Xd() ^ (-23831));
        int[] iArr = new int["QNZ~jsohOh{Qaq_jao_kk\u0017WgY\u0013dVadW_QO\nOWY\u0006SIZ\u0002QUAJF?zE>QvJG5AE7?A;z".length()];
        QB qb = new QB("QNZ~jsohOh{Qaq_jao_kk\u0017WgY\u0013dVadW_QO\nOWY\u0006SIZ\u0002QUAJF?zE>QvJG5AE7?A;z");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        if (z2) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            if (!(parametersWithRandom.getParameters() instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException(str);
            }
            this.key = (ECPublicKeyParameters) parametersWithRandom.getParameters();
            random = parametersWithRandom.getRandom();
        } else {
            if (!(cipherParameters instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException(str);
            }
            this.key = (ECPublicKeyParameters) cipherParameters;
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(hg.Vd("\r\u0003\u0017\u0001L\u0011\u0002~\u0010\f\u0002\f\u0010Cgxu\u0007\u0003t`nzoyv", (short) (C1633zX.Xd() ^ (-10868)), (short) (C1633zX.Xd() ^ (-30837)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.random = random;
    }

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public ECPair transform(ECPair eCPair) {
        ECPublicKeyParameters eCPublicKeyParameters = this.key;
        if (eCPublicKeyParameters == null) {
            throw new IllegalStateException("ECNewPublicKeyTransform not initialised");
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger n2 = parameters.getN();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        BigInteger bigIntegerGenerateK = ECUtil.generateK(n2, this.random);
        ECPoint[] eCPointArr = {eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerGenerateK), this.key.getQ().multiply(bigIntegerGenerateK).add(eCPair.getY())};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }
}
