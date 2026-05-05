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
import yg.C1561oA;
import yg.C1633zX;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes7.dex */
public class ECNewRandomnessTransform implements ECPairFactorTransform {
    private ECPublicKeyParameters key;
    private BigInteger lastK;
    private SecureRandom random;

    protected ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.ec.ECPairFactorTransform
    public BigInteger getTransformValue() {
        return this.lastK;
    }

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public void init(CipherParameters cipherParameters) throws Throwable {
        SecureRandom random;
        boolean z2 = cipherParameters instanceof ParametersWithRandom;
        short sXd = (short) (C1633zX.Xd() ^ (-26531));
        int[] iArr = new int["(%1UAJF?&?R(8H6A8F6BBm.>0i;-8;.6(&`&.0\\* 1X*\u0018$\u0019#  \u0016#\"M!\u001e\f\u0018\u001c\u000e\u0016\u0018\u0012Q".length()];
        QB qb = new QB("(%1UAJF?&?R(8H6A8F6BBm.>0i;-8;.6(&`&.0\\* 1X*\u0018$\u0019#  \u0016#\"M!\u001e\f\u0018\u001c\u000e\u0016\u0018\u0012Q");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
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
            Constructor<?> constructor = Class.forName(C1561oA.yd("xn\u0003l8|mj{wmw{/Sdarn`LZf[eb", (short) (C1633zX.Xd() ^ (-17164)))).getConstructor(new Class[0]);
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
            throw new IllegalStateException("ECNewRandomnessTransform not initialised");
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger n2 = parameters.getN();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        BigInteger bigIntegerGenerateK = ECUtil.generateK(n2, this.random);
        ECPoint[] eCPointArr = {eCMultiplierCreateBasePointMultiplier.multiply(parameters.getG(), bigIntegerGenerateK).add(eCPair.getX()), this.key.getQ().multiply(bigIntegerGenerateK).add(eCPair.getY())};
        parameters.getCurve().normalizeAll(eCPointArr);
        this.lastK = bigIntegerGenerateK;
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }
}
