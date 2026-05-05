package org.spongycastle.crypto.ec;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.math.ec.ECMultiplier;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.math.ec.FixedPointCombMultiplier;
import yg.C1580rY;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class ECNewRandomnessTransform implements ECPairFactorTransform {
    private ECPublicKeyParameters key;
    private BigInteger lastK;
    private SecureRandom random;

    protected ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.ec.ECPairFactorTransform
    public BigInteger getTransformValue() {
        return this.lastK;
    }

    @Override // org.spongycastle.crypto.ec.ECPairTransform
    public void init(CipherParameters cipherParameters) throws Throwable {
        boolean z2 = cipherParameters instanceof ParametersWithRandom;
        short sXd = (short) (C1580rY.Xd() ^ (-5369));
        int[] iArr = new int["\u0015\u0014\"H6A?:#>S+=O?LEUGUW\u0005GYM\t\\P]bWaUU\u0012Ycg\u0016e]p\u001am]kbnmogvw%zyiw}q{\u007f{=".length()];
        QB qb = new QB("\u0015\u0014\"H6A?:#>S+=O?LEUGUW\u0005GYM\t\\P]bWaUU\u0012Ycg\u0016e]p\u001am]kbnmogvw%zyiw}q{\u007f{=");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        if (z2) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            if (!(parametersWithRandom.getParameters() instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException(str);
            }
            this.key = (ECPublicKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
            return;
        }
        if (!(cipherParameters instanceof ECPublicKeyParameters)) {
            throw new IllegalArgumentException(str);
        }
        this.key = (ECPublicKeyParameters) cipherParameters;
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(Wg.Zd(";7#v~)\u0003s/\u000b~t\u0012GS~cvOmS=3`[:", (short) (FB.Xd() ^ 7800), (short) (FB.Xd() ^ 2936))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // org.spongycastle.crypto.ec.ECPairTransform
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
