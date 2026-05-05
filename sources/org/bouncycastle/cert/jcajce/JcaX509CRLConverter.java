package org.bouncycastle.cert.jcajce;

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
import org.bouncycastle.cert.X509CRLHolder;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
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
            CertificateFactory certificateFactory = this.helper.getCertificateFactory(C1561oA.yd("f=A=C", (short) (C1499aX.Xd() ^ (-1110))));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(x509CRLHolder.getEncoded());
            short sXd = (short) (C1633zX.Xd() ^ (-3169));
            int[] iArr = new int["]UkW%k^]pnfrx.dgux3Ilz}squpo\u0004uWsv\t\u0005\t\u0011".length()];
            QB qb = new QB("]UkW%k^]pnfrx.dgux3Ilz}squpo\u0004uWsv\t\u0005\t\u0011");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[1];
            short sXd2 = (short) (C1499aX.Xd() ^ (-31733));
            short sXd3 = (short) (C1499aX.Xd() ^ (-7472));
            int[] iArr2 = new int["YQgS!]d$@fiooOqpdan".length()];
            QB qb2 = new QB("YQgS!]d$@fiooOqpdan");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr = {byteArrayInputStream};
            Method method = cls.getMethod(Jg.Wd("^*Z\u0007_{G\u007f\u0017Q\u0015", (short) (OY.Xd() ^ 10333), (short) (OY.Xd() ^ 2723)), clsArr);
            try {
                method.setAccessible(true);
                return (X509CRL) ((CRL) method.invoke(certificateFactory, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            throw new ExCRLException(Ig.wd("H6pMM\u0004\u0017K\u000b\u000b_0\u0016\u0017\u0003d0d~zH!mdh\u00196p\u001e\u0002\u0006", (short) (OY.Xd() ^ 5568)) + e3.getMessage(), e3);
        } catch (NoSuchProviderException e4) {
            throw new ExCRLException(C1626yg.Ud("6Ix\f!W96\u0001\u0016\u0011Bnj\u001dl}/<\u0013\u001f\bw\u0001}ds1(\"", (short) (Od.Xd() ^ (-13502)), (short) (Od.Xd() ^ (-8664))) + e4.getMessage(), e4);
        } catch (CertificateException e5) {
            throw new ExCRLException(ZO.xd("?yF\u001d\u001fhaL7\u0019!-~\u001b\u0019?\u001b~Rq\n\u00042", (short) (ZN.Xd() ^ 428), (short) (ZN.Xd() ^ 28960)) + e5.getMessage(), e5);
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
