package org.bouncycastle.x509;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.util.StoreException;
import yg.C1499aX;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;

/* JADX INFO: loaded from: classes2.dex */
class PKIXCRLUtil {
    PKIXCRLUtil() {
    }

    private final Collection findCRLs(X509CRLStoreSelector x509CRLStoreSelector, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        AnnotatedException annotatedException = null;
        boolean z2 = false;
        for (Object obj : list) {
            if (obj instanceof X509Store) {
                try {
                    hashSet.addAll(((X509Store) obj).getMatches(x509CRLStoreSelector));
                    z2 = true;
                } catch (StoreException e2) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e2);
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) obj).getCRLs(x509CRLStoreSelector));
                    z2 = true;
                } catch (CertStoreException e3) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e3);
                }
            }
        }
        if (z2 || annotatedException == null) {
            return hashSet;
        }
        throw annotatedException;
    }

    public Set findCRLs(X509CRLStoreSelector x509CRLStoreSelector, PKIXParameters pKIXParameters) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        try {
            hashSet.addAll(findCRLs(x509CRLStoreSelector, pKIXParameters.getCertStores()));
            return hashSet;
        } catch (AnnotatedException e2) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e2);
        }
    }

    public Set findCRLs(X509CRLStoreSelector x509CRLStoreSelector, ExtendedPKIXParameters extendedPKIXParameters, Date date) throws Throwable {
        HashSet<X509CRL> hashSet = new HashSet();
        try {
            hashSet.addAll(findCRLs(x509CRLStoreSelector, extendedPKIXParameters.getAdditionalStores()));
            hashSet.addAll(findCRLs(x509CRLStoreSelector, extendedPKIXParameters.getStores()));
            hashSet.addAll(findCRLs(x509CRLStoreSelector, extendedPKIXParameters.getCertStores()));
            HashSet hashSet2 = new HashSet();
            if (extendedPKIXParameters.getDate() != null) {
                date = extendedPKIXParameters.getDate();
            }
            for (X509CRL x509crl : hashSet) {
                if (x509crl.getNextUpdate().after(date)) {
                    X509Certificate certificateChecking = x509CRLStoreSelector.getCertificateChecking();
                    if (certificateChecking != null) {
                        Date thisUpdate = x509crl.getThisUpdate();
                        Object[] objArr = new Object[0];
                        Method method = Class.forName(C1626yg.Ud("- s\u0011j2\t\u001f5.\\jPE !\u001bqR\u0014\r$N\u001aP\tXG\u001f!`\u000f|o", (short) (Od.Xd() ^ (-26996)), (short) (Od.Xd() ^ (-5789)))).getMethod(Ig.wd("]4QB;s\u001c!\u0001\u0001\u0010", (short) (C1499aX.Xd() ^ (-13019))), new Class[0]);
                        try {
                            method.setAccessible(true);
                            if (thisUpdate.before((Date) method.invoke(certificateChecking, objArr))) {
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    hashSet2.add(x509crl);
                }
            }
            return hashSet2;
        } catch (AnnotatedException e3) {
            throw new AnnotatedException(EO.Od("\u0007\u0013K.pI\u001ap6{MZ7*\u00165\r\u007fA\"<p\u0001\u007f2Gt\u000e~0[o?\u0018", (short) (OY.Xd() ^ 24326)), e3);
        }
    }
}
