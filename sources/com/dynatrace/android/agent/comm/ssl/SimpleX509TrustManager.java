package com.dynatrace.android.agent.comm.ssl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleX509TrustManager implements X509TrustManager {
    private X509Certificate[] acceptedIssuers;
    private X509TrustManager myTrustManager;

    public SimpleX509TrustManager(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        this.myTrustManager = null;
        this.acceptedIssuers = null;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        X509TrustManager x509TrustManagerFindX509TrustManager = findX509TrustManager(trustManagerFactory);
        this.myTrustManager = x509TrustManagerFindX509TrustManager;
        if (x509TrustManagerFindX509TrustManager == null) {
            throw new NoSuchAlgorithmException("no trust manager found");
        }
        this.acceptedIssuers = x509TrustManagerFindX509TrustManager.getAcceptedIssuers();
    }

    private X509TrustManager findX509TrustManager(TrustManagerFactory trustManagerFactory) {
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.myTrustManager.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws Throwable {
        X509Certificate x509Certificate;
        if (x509CertificateArr != null && x509CertificateArr.length == 1 && (x509Certificate = x509CertificateArr[0]) != null) {
            short sXd = (short) (C1607wl.Xd() ^ 10071);
            short sXd2 = (short) (C1607wl.Xd() ^ 28529);
            int[] iArr = new int[";3I5\u0003I<;NLDPV\fBESV\u0011<\u001a\u0016 +N\\_USWRQeW".length()];
            QB qb = new QB(";3I5\u0003I<;NLDPV\fBESV\u0011<\u001a\u0016 +N\\_USWRQeW");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd3 = (short) (OY.Xd() ^ 29936);
            short sXd4 = (short) (OY.Xd() ^ 12298);
            int[] iArr2 = new int["um]R=\u000f\r\u000fn\\HF2".length()];
            QB qb2 = new QB("um]R=\u000f\r\u000fn\\HF2");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(x509Certificate, objArr);
                X509Certificate[] acceptedIssuers = getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    for (X509Certificate x509Certificate2 : acceptedIssuers) {
                        if (x509CertificateArr[0].equals(x509Certificate2)) {
                            return;
                        }
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.myTrustManager.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.acceptedIssuers;
    }
}
