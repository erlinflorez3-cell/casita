package org.bouncycastle.openssl.jcajce;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.SecureRandom;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.openssl.PEMEncryptor;
import org.bouncycastle.openssl.PEMException;
import yg.C1561oA;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

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
            Constructor<?> constructor = Class.forName(C1561oA.Yd("TLbN\u001cbUTge]io%K^]pnbP`neqp", (short) (OY.Xd() ^ 27188))).getConstructor(new Class[0]);
            try {
                constructor.setAccessible(true);
                this.random = (SecureRandom) constructor.newInstance(objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        String str = this.algorithm;
        short sXd = (short) (OY.Xd() ^ 1632);
        short sXd2 = (short) (OY.Xd() ^ 25827);
        int[] iArr = new int["\u0002\u0007\u0016p".length()];
        QB qb = new QB("\u0002\u0007\u0016p");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        final byte[] bArr = new byte[str.startsWith(new String(iArr, 0, i2)) ? 16 : 8];
        SecureRandom secureRandom = this.random;
        Object[] objArr2 = {bArr};
        Method method = Class.forName(Jg.Wd("*\r\tb\u0016B\u0013xqmO=!@IJ/<\u0014mE@4\u0015~o", (short) (C1633zX.Xd() ^ (-1741)), (short) (C1633zX.Xd() ^ (-16252)))).getMethod(ZO.xd("4ipZ\u0017p(\u0016a", (short) (Od.Xd() ^ (-10264)), (short) (Od.Xd() ^ (-8672))), byte[].class);
        try {
            method.setAccessible(true);
            method.invoke(secureRandom, objArr2);
            return new PEMEncryptor() { // from class: org.bouncycastle.openssl.jcajce.JcePEMEncryptorBuilder.1
                @Override // org.bouncycastle.openssl.PEMEncryptor
                public byte[] encrypt(byte[] bArr2) throws PEMException {
                    return PEMUtilities.crypt(true, JcePEMEncryptorBuilder.this.helper, bArr2, cArr, JcePEMEncryptorBuilder.this.algorithm, bArr);
                }

                @Override // org.bouncycastle.openssl.PEMEncryptor
                public String getAlgorithm() {
                    return JcePEMEncryptorBuilder.this.algorithm;
                }

                @Override // org.bouncycastle.openssl.PEMEncryptor
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
