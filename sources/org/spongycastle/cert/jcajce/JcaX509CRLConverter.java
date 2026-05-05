package org.spongycastle.cert.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import org.spongycastle.cert.X509CRLHolder;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class JcaX509CRLConverter {
    private CertHelper helper;

    private class ExCRLException extends CRLException {
        private Throwable cause;

        public ExCRLException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public JcaX509CRLConverter() {
        this.helper = new DefaultCertHelper();
        this.helper = new DefaultCertHelper();
    }

    public X509CRL getCRL(X509CRLHolder x509CRLHolder) throws Throwable {
        try {
            CertificateFactory certificateFactory = this.helper.getCertificateFactory(C1626yg.Ud("\u0019*6)Y", (short) (C1499aX.Xd() ^ (-27868)), (short) (C1499aX.Xd() ^ (-3595))));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(x509CRLHolder.getEncoded());
            Class<?> cls = Class.forName(Ig.wd("Z\u0002CS}\u0007Z6\u000e,#N%MlN\u0017-\fv^!\u0003ylQ'\\c roWL(ZO", (short) (ZN.Xd() ^ 28834)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(EO.Od("4[`.,\u001c@9z\u000f\u0015u\u001f\u0006I$SO\u0006", (short) (C1633zX.Xd() ^ (-24083))));
            Object[] objArr = {byteArrayInputStream};
            Method method = cls.getMethod(C1561oA.Qd("\u000f\f\u0014\n\u0016\u0004\u0016\u0006bpi", (short) (OY.Xd() ^ 32239)), clsArr);
            try {
                method.setAccessible(true);
                return (X509CRL) ((CRL) method.invoke(certificateFactory, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            throw new ExCRLException(C1561oA.Kd("XlX[glbii\u001cm_qsjpj$hky|rpton\u0003tJ1", (short) (OY.Xd() ^ 11908)) + e3.getMessage(), e3);
        } catch (NoSuchProviderException e4) {
            throw new ExCRLException(C1561oA.od("ur~}}\u0002,qswl'xjuxksec\u001emnjpb\\\\h/", (short) (C1580rY.Xd() ^ (-3161))) + e4.getMessage(), e4);
        } catch (CertificateException e5) {
            short sXd = (short) (ZN.Xd() ^ 22529);
            short sXd2 = (short) (ZN.Xd() ^ 24891);
            int[] iArr = new int["0/=>@Fr7G;8L>yA=@RNRZ\u001c\u0003".length()];
            QB qb = new QB("0/=>@Fr7G;8L>yA=@RNRZ\u001c\u0003");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            throw new ExCRLException(new String(iArr, 0, i2) + e5.getMessage(), e5);
        }
    }

    public JcaX509CRLConverter setProvider(String str) {
        this.helper = new NamedCertHelper(str);
        return this;
    }

    public JcaX509CRLConverter setProvider(Provider provider) {
        this.helper = new ProviderCertHelper(provider);
        return this;
    }
}
