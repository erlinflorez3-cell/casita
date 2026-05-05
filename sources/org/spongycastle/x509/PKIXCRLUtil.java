package org.spongycastle.x509;

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
import org.spongycastle.jce.provider.AnnotatedException;
import org.spongycastle.util.StoreException;
import yg.C1561oA;
import yg.C1593ug;
import yg.FB;
import yg.OY;

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
                        Method method = Class.forName(C1593ug.zd("PH^J\u0018^QPcaYek!WZhk&Q/+5@cqtjhlgfzl", (short) (OY.Xd() ^ 22690), (short) (OY.Xd() ^ 21035))).getMethod(C1561oA.od("OLZ3SW#GTDP", (short) (FB.Xd() ^ 11963)), new Class[0]);
                        try {
                            method.setAccessible(true);
                            if (thisUpdate.before((Date) method.invoke(certificateChecking, objArr))) {
                                hashSet2.add(x509crl);
                            }
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } else {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e3) {
            throw new AnnotatedException(C1561oA.Kd("Fzfiuzpww*zn\u0002ox~z\u0001z4x\u0006\u0005\t\u0006\u007f\u0010\u0002=aql\u0015P", (short) (OY.Xd() ^ 12709)), e3);
        }
    }
}
