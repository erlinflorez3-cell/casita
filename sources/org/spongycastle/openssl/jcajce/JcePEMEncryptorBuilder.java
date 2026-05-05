package org.spongycastle.openssl.jcajce;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.SecureRandom;
import org.spongycastle.jcajce.util.DefaultJcaJceHelper;
import org.spongycastle.jcajce.util.JcaJceHelper;
import org.spongycastle.jcajce.util.NamedJcaJceHelper;
import org.spongycastle.jcajce.util.ProviderJcaJceHelper;
import org.spongycastle.openssl.PEMEncryptor;
import org.spongycastle.openssl.PEMException;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
public class JcePEMEncryptorBuilder {
    private final String algorithm;
    private JcaJceHelper helper = new DefaultJcaJceHelper();
    private SecureRandom random;

    public JcePEMEncryptorBuilder(String str) {
        this.algorithm = str;
    }

    public PEMEncryptor build(final char[] cArr) throws Throwable {
        if (this.random == null) {
            Object[] objArr = new Object[0];
            Constructor<?> constructor = Class.forName(Wg.vd("1)?+p7*)DB:FDy 3:MK?%5C:NM", (short) (FB.Xd() ^ 8616))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        String str = this.algorithm;
        short sXd = (short) (FB.Xd() ^ 27585);
        short sXd2 = (short) (FB.Xd() ^ 10159);
        int[] iArr = new int["sv\u0004\\".length()];
        QB qb = new QB("sv\u0004\\");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        final byte[] bArr = new byte[str.startsWith(new String(iArr, 0, i2)) ? 16 : 8];
        SecureRandom secureRandom = this.random;
        Object[] objArr2 = {bArr};
        Method method = Class.forName(hg.Vd("TJ^H\u0014XIFWSISW\u000b/@=NJ<(6B7A>", (short) (C1607wl.Xd() ^ 14299), (short) (C1607wl.Xd() ^ 12383))).getMethod(C1561oA.ud("bXje2hbR_", (short) (FB.Xd() ^ 17027)), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            return new PEMEncryptor() { // from class: org.spongycastle.openssl.jcajce.JcePEMEncryptorBuilder.1
                @Override // org.spongycastle.openssl.PEMEncryptor
                public byte[] encrypt(byte[] bArr2) throws PEMException {
                    return PEMUtilities.crypt(true, JcePEMEncryptorBuilder.this.helper, bArr2, cArr, JcePEMEncryptorBuilder.this.algorithm, bArr);
                }

                @Override // org.spongycastle.openssl.PEMEncryptor
                public String getAlgorithm() {
                    return JcePEMEncryptorBuilder.this.algorithm;
                }

                @Override // org.spongycastle.openssl.PEMEncryptor
                public byte[] getIV() {
                    return bArr;
                }
            };
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public JcePEMEncryptorBuilder setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JcePEMEncryptorBuilder setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }

    public JcePEMEncryptorBuilder setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }
}
