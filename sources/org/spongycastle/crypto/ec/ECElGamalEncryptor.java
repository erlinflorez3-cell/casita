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
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class ECElGamalEncryptor implements ECEncryptor {
    private ECPublicKeyParameters key;
    private SecureRandom random;

    protected ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.spongycastle.crypto.ec.ECEncryptor
    public ECPair encrypt(ECPoint eCPoint) {
        ECPublicKeyParameters eCPublicKeyParameters = this.key;
        if (eCPublicKeyParameters == null) {
            throw new IllegalStateException("ECElGamalEncryptor not initialised");
        }
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        BigInteger bigIntegerGenerateK = ECUtil.generateK(parameters.getN(), this.random);
        ECPoint[] eCPointArr = {createBasePointMultiplier().multiply(parameters.getG(), bigIntegerGenerateK), this.key.getQ().multiply(bigIntegerGenerateK).add(eCPoint)};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new ECPair(eCPointArr[0], eCPointArr[1]);
    }

    @Override // org.spongycastle.crypto.ec.ECEncryptor
    public void init(CipherParameters cipherParameters) throws Throwable {
        boolean z2 = cipherParameters instanceof ParametersWithRandom;
        short sXd = (short) (C1633zX.Xd() ^ (-6709));
        int[] iArr = new int["Iols\u001a\u0002\u00150g?O\nf\bP@u\u0005/F\u0007Xu\ro\u007f2bN\"kX]{\u0001\u000b+Tv4CQ,3\u0012\u0004?u\u0019y".length()];
        QB qb = new QB("Iols\u001a\u0002\u00150g?O\nf\bP@u\u0005/F\u0007Xu\ro\u007f2bN\"kX]{\u0001\u000b+Tv4CQ,3\u0012\u0004?u\u0019y");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
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
        Constructor<?> constructor = Class.forName(C1561oA.Qd("<2F0{@1.?;1;?r\u0017(%62$\u0010\u001e*\u001f)&", (short) (FB.Xd() ^ 16369))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this.random = (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
