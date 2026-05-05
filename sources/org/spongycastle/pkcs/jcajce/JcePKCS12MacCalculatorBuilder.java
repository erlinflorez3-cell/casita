package org.spongycastle.pkcs.jcajce;

import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.jcajce.PKCS12Key;
import org.spongycastle.jcajce.io.MacOutputStream;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.operator.GenericKey;
import org.spongycastle.operator.MacCalculator;
import org.spongycastle.operator.OperatorCreationException;
import org.spongycastle.pkcs.PKCS12MacCalculatorBuilder;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class JcePKCS12MacCalculatorBuilder implements PKCS12MacCalculatorBuilder {
    private ASN1ObjectIdentifier algorithm;
    private JcaJceHelper helper;
    private int iterationCount;
    private SecureRandom random;
    private int saltLength;

    public JcePKCS12MacCalculatorBuilder() {
        this(OIWObjectIdentifiers.idSHA1);
    }

    public JcePKCS12MacCalculatorBuilder(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.helper = new DefaultJcaJceHelper();
        this.iterationCount = 1024;
        this.algorithm = aSN1ObjectIdentifier;
    }

    @Override // org.spongycastle.pkcs.PKCS12MacCalculatorBuilder
    public MacCalculator build(char[] cArr) throws Throwable {
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Wg.Zd("\u0014+l78lz)/J,g\u00115\u0005w*,CfFun\u0013B1", (short) (C1499aX.Xd() ^ (-19311)), (short) (C1499aX.Xd() ^ (-24975)))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        try {
            final Mac macCreateMac = this.helper.createMac(this.algorithm.getId());
            int macLength = macCreateMac.getMacLength();
            this.saltLength = macLength;
            final byte[] bArr = new byte[macLength];
            SecureRandom secureRandom = this.random;
            Object[] objArr2 = {bArr};
            Method method = Class.forName(C1561oA.Xd("\u0005|\u0013~L\u0013\u0006\u0005\u0018\u0016\u000e\u001a U{\u000f\u000e!\u001f\u0013\u0001\u0011\u001f\u0016\"!", (short) (ZN.Xd() ^ 721))).getMethod(Wg.vd("MCYT%[YIJ", (short) (FB.Xd() ^ 7045)), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(secureRandom, objArr2);
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, this.iterationCount);
                final PKCS12Key pKCS12Key = new PKCS12Key(cArr);
                macCreateMac.init(pKCS12Key, pBEParameterSpec);
                return new MacCalculator() { // from class: org.spongycastle.pkcs.jcajce.JcePKCS12MacCalculatorBuilder.1
                    @Override // org.spongycastle.operator.MacCalculator
                    public AlgorithmIdentifier getAlgorithmIdentifier() {
                        return new AlgorithmIdentifier(JcePKCS12MacCalculatorBuilder.this.algorithm, new PKCS12PBEParams(bArr, JcePKCS12MacCalculatorBuilder.this.iterationCount));
                    }

                    @Override // org.spongycastle.operator.MacCalculator
                    public GenericKey getKey() {
                        return new GenericKey(getAlgorithmIdentifier(), pKCS12Key.getEncoded());
                    }

                    @Override // org.spongycastle.operator.MacCalculator
                    public byte[] getMac() {
                        return macCreateMac.doFinal();
                    }

                    @Override // org.spongycastle.operator.MacCalculator
                    public OutputStream getOutputStream() {
                        return new MacOutputStream(macCreateMac);
                    }
                };
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Exception e4) {
            short sXd = (short) (C1607wl.Xd() ^ 29473);
            short sXd2 = (short) (C1607wl.Xd() ^ 32734);
            int[] iArr = new int["\u0015\r~~\b\u007f9\r\u00076x\u0007xs\u0006u/[NO+mjtj{qewqs:\u001f".length()];
            QB qb = new QB("\u0015\r~~\b\u007f9\r\u00076x\u0007xs\u0006u/[NO+mjtj{qewqs:\u001f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            throw new OperatorCreationException(new String(iArr, 0, i2) + e4.getMessage(), e4);
        }
    }

    @Override // org.spongycastle.pkcs.PKCS12MacCalculatorBuilder
    public AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return new AlgorithmIdentifier(this.algorithm, DERNull.INSTANCE);
    }

    public JcePKCS12MacCalculatorBuilder setIterationCount(int i2) {
        this.iterationCount = i2;
        return this;
    }

    public JcePKCS12MacCalculatorBuilder setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JcePKCS12MacCalculatorBuilder setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }
}
