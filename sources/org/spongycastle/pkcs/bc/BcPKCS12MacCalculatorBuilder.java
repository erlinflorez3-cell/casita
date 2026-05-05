package org.spongycastle.pkcs.bc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.operator.MacCalculator;
import org.spongycastle.pkcs.PKCS12MacCalculatorBuilder;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;

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

    @Override // org.spongycastle.pkcs.PKCS12MacCalculatorBuilder
    public MacCalculator build(char[] cArr) throws Throwable {
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Ig.wd("\u0007Ex\u0007LM\u0017\rLxYzQ\u00149d>2\u0007=g>a[\u0004*", (short) (C1580rY.Xd() ^ (-16089)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        byte[] bArr = new byte[this.saltLength];
        SecureRandom secureRandom = this.random;
        Object[] objArr2 = {bArr};
        Method method = Class.forName(EO.Od("&eH\u001c028v7)\u001a\u00076x\n~\u0019!vAlT{u\u000f\u0019", (short) (FB.Xd() ^ 29659))).getMethod(C1561oA.Qd(".$61}4.\u001e+", (short) (C1633zX.Xd() ^ (-5555))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            return PKCS12PBEUtils.createMacCalculator(this.algorithmIdentifier.getAlgorithm(), this.digest, new PKCS12PBEParams(bArr, this.iterationCount), cArr);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // org.spongycastle.pkcs.PKCS12MacCalculatorBuilder
    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    public BcPKCS12MacCalculatorBuilder setIterationCount(int i2) {
        this.iterationCount = i2;
        return this;
    }
}
