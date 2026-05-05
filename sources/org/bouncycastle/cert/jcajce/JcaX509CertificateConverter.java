package org.bouncycastle.cert.jcajce;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes6.dex */
public class JcaX509CertificateConverter {
    private CertHelper helper;

    private class ExCertificateException extends CertificateException {
        private Throwable cause;

        public ExCertificateException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    private class ExCertificateParsingException extends CertificateParsingException {
        private Throwable cause;

        public ExCertificateParsingException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    public JcaX509CertificateConverter() {
        this.helper = new DefaultCertHelper();
        this.helper = new DefaultCertHelper();
    }

    public X509Certificate getCertificate(X509CertificateHolder x509CertificateHolder) throws Throwable {
        try {
            CertHelper certHelper = this.helper;
            short sXd = (short) (FB.Xd() ^ 5134);
            int[] iArr = new int["m\u0014/D_".length()];
            QB qb = new QB("m\u0014/D_");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            CertificateFactory certificateFactory = certHelper.getCertificateFactory(new String(iArr, 0, i2));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(x509CertificateHolder.getEncoded());
            Class<?> cls = Class.forName(C1561oA.Qd("J@T>\nN?<MI?IM\u000156BC{\u00101=>2.0)&8(\b\"#3-/5", (short) (C1580rY.Xd() ^ (-4148))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1593ug.zd(".&<(u29x\u0015;>DD$FE96C", (short) (OY.Xd() ^ 11084), (short) (OY.Xd() ^ 16683)));
            Object[] objArr = {byteArrayInputStream};
            Method method = cls.getMethod(C1561oA.od("+(0&2 2\"~ ,-!\u001d\u001f\u0018\u0015'\u0017", (short) (FB.Xd() ^ 9659)), clsArr);
            try {
                method.setAccessible(true);
                return (X509Certificate) ((Certificate) method.invoke(certificateFactory, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            throw new ExCertificateParsingException(Wg.Zd("w#CYW\u0014&(R av;0;xlA2LLS\\L\u007f\u0017\u0011?\\*$", (short) (OY.Xd() ^ 9723), (short) (OY.Xd() ^ 6178)) + e3.getMessage(), e3);
        } catch (NoSuchProviderException e4) {
            throw new ExCertificateException(C1561oA.Kd(":9GHJP|DHNE\u0002UIV[PZNN\u000b\\_]eYUWe.", (short) (Od.Xd() ^ (-30024))) + e4.getMessage(), e4);
        }
    }

    public JcaX509CertificateConverter setProvider(String str) {
        this.helper = new NamedCertHelper(str);
        return this;
    }

    public JcaX509CertificateConverter setProvider(Provider provider) {
        this.helper = new ProviderCertHelper(provider);
        return this;
    }
}
