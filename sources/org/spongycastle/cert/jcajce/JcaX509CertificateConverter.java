package org.spongycastle.cert.jcajce;

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
import org.spongycastle.cert.X509CertificateHolder;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.hg;

/* JADX INFO: loaded from: classes2.dex */
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
            CertificateFactory certificateFactory = this.helper.getCertificateFactory(Wg.Zd("\nRJ\u0013\u0017", (short) (C1499aX.Xd() ^ (-26208)), (short) (C1499aX.Xd() ^ (-1606))));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(x509CertificateHolder.getEncoded());
            Class<?> cls = Class.forName(C1561oA.Xd("&\u001e4 m4'&97/;Av-0>A{\u00125CF<:>98L> <?QMQY", (short) (C1607wl.Xd() ^ 25229)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Wg.vd("_WiU'cf&6\\[aeEcbjgp", (short) (C1499aX.Xd() ^ (-23943))));
            Object[] objArr = {byteArrayInputStream};
            Method method = cls.getMethod(Qg.kd("^[cYeSeU2S_`TPRKHZJ", (short) (C1499aX.Xd() ^ (-25424)), (short) (C1499aX.Xd() ^ (-19608))), clsArr);
            try {
                method.setAccessible(true);
                return (X509Certificate) ((Certificate) method.invoke(certificateFactory, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IOException e3) {
            throw new ExCertificateParsingException(C1561oA.ud("\n\u001c\u0006\u0007\u0011\u0014\b\r\u000b;\u000bz\u000b\u000b\u007f\u0004{3uv\u0003\u0004wsunk}mA&", (short) (Od.Xd() ^ (-2239))) + e3.getMessage(), e3);
        } catch (NoSuchProviderException e4) {
            throw new ExCertificateException(hg.Vd("wt\u0001\u007f\u007f\u0004.suyn)zlwzmuge oplrd^^j1", (short) (C1633zX.Xd() ^ (-18169)), (short) (C1633zX.Xd() ^ (-27901))) + e4.getMessage(), e4);
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
