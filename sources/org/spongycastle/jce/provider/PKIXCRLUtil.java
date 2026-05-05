package org.spongycastle.jce.provider;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.spongycastle.jcajce.PKIXCRLStoreSelector;
import org.spongycastle.util.Store;
import org.spongycastle.util.StoreException;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.Wg;

/* JADX INFO: loaded from: classes2.dex */
class PKIXCRLUtil {
    PKIXCRLUtil() {
    }

    private final Collection findCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        AnnotatedException annotatedException = null;
        boolean z2 = false;
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    hashSet.addAll(((Store) obj).getMatches(pKIXCRLStoreSelector));
                    z2 = true;
                } catch (StoreException e2) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e2);
                }
            } else {
                try {
                    hashSet.addAll(PKIXCRLStoreSelector.getCRLs(pKIXCRLStoreSelector, (CertStore) obj));
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

    public Set findCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, Date date, List list, List list2) throws Throwable {
        HashSet<X509CRL> hashSet = new HashSet();
        try {
            hashSet.addAll(findCRLs(pKIXCRLStoreSelector, list2));
            hashSet.addAll(findCRLs(pKIXCRLStoreSelector, list));
            HashSet hashSet2 = new HashSet();
            for (X509CRL x509crl : hashSet) {
                if (x509crl.getNextUpdate().after(date)) {
                    X509Certificate certificateChecking = pKIXCRLStoreSelector.getCertificateChecking();
                    if (certificateChecking != null) {
                        Date thisUpdate = x509crl.getThisUpdate();
                        Object[] objArr = new Object[0];
                        Method method = Class.forName(C1561oA.Kd("xp\u0007r@\u0007yx\f\n\u0002\u000e\u0014I\u007f\u0003\u0011\u0014NyWS]h\f\u001a\u001d\u0013\u0011\u0015\u0010\u000f#\u0015", (short) (OY.Xd() ^ 29))).getMethod(Wg.Zd("S\u0006=K\u0015NC\u001ds\u001bP", (short) (C1499aX.Xd() ^ (-28307)), (short) (C1499aX.Xd() ^ (-17949))), new Class[0]);
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
            throw new AnnotatedException(C1561oA.Xd("*^JMY^T[[\u000e^ReS\\b^d^\u0018\\ihlicse!EUPx4", (short) (C1580rY.Xd() ^ (-26209))), e3);
        }
    }
}
