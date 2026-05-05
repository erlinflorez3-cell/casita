package org.bouncycastle.pkcs.bc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder;
import yg.C1561oA;
import yg.C1580rY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class BcPKCS12MacCalculatorBuilder implements PKCS12MacCalculatorBuilder {
    private AlgorithmIdentifier algorithmIdentifier;
    private ExtendedDigest digest;
    private int iterationCount;
    private SecureRandom random;
    private int saltLength;

    public BcPKCS12MacCalculatorBuilder() {
        this(new SHA1Digest(), new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE));
    }

    public BcPKCS12MacCalculatorBuilder(ExtendedDigest extendedDigest, AlgorithmIdentifier algorithmIdentifier) {
        this.iterationCount = 1024;
        this.digest = extendedDigest;
        this.algorithmIdentifier = algorithmIdentifier;
        this.saltLength = extendedDigest.getDigestSize();
    }

    @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
    public MacCalculator build(char[] cArr) throws Throwable {
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(C1561oA.Kd("ldzf4zml\u007f}u\u0002\b=cvu\t\u0007zhx\u0007}\n\t", (short) (Od.Xd() ^ (-1805)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        byte[] bArr = new byte[this.saltLength];
        SecureRandom secureRandom = this.random;
        short sXd = (short) (C1580rY.Xd() ^ (-22049));
        short sXd2 = (short) (C1580rY.Xd() ^ (-366));
        int[] iArr = new int["'dKu\f Q\u001dx5~O\u0014\u0016|W'vC{+\n`\u0014n+".length()];
        QB qb = new QB("'dKu\f Q\u001dx5~O\u0014\u0016|W'vC{+\n`\u0014n+");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {byte[].class};
        Object[] objArr2 = {bArr};
        short sXd3 = (short) (Od.Xd() ^ (-5654));
        int[] iArr2 = new int["+#74\u0003;7)8".length()];
        QB qb2 = new QB("+#74\u0003;7)8");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            return PKCS12PBEUtils.createMacCalculator(this.algorithmIdentifier.getAlgorithm(), this.digest, new PKCS12PBEParams(bArr, this.iterationCount), cArr);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // org.bouncycastle.pkcs.PKCS12MacCalculatorBuilder
    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    public BcPKCS12MacCalculatorBuilder setIterationCount(int i2) {
        this.iterationCount = i2;
        return this;
    }
}
