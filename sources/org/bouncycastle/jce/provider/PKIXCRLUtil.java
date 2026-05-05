package org.bouncycastle.jce.provider;

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
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;
import yg.C1499aX;
import yg.C1561oA;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

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
                        Class<?> cls = Class.forName(C1561oA.Xd("nf|h6|on\u0002\u007fw\u0004\n?ux\u0007\nDoMIS^\u0002\u0010\u0013\t\u0007\u000b\u0006\u0005\u0019\u000b", (short) (Od.Xd() ^ (-20241))));
                        Class<?>[] clsArr = new Class[0];
                        Object[] objArr = new Object[0];
                        short sXd = (short) (C1499aX.Xd() ^ (-21532));
                        int[] iArr = new int["xu\u0004\\|\u0001Lp\u000e}\n".length()];
                        QB qb = new QB("xu\u0004\\|\u0001Lp\u000e}\n");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                            i2++;
                        }
                        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
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
            short sXd2 = (short) (ZN.Xd() ^ 31559);
            short sXd3 = (short) (ZN.Xd() ^ 12958);
            int[] iArr2 = new int["\t;%&03',*Z)\u001b,\u0018\u001f#\u001d!\u0019P\u0013\u001e\u001b\u001d\u0018\u0010\u001e\u000eGiwp\u0017P".length()];
            QB qb2 = new QB("\t;%&03',*Z)\u001b,\u0018\u001f#\u001d!\u0019P\u0013\u001e\u001b\u001d\u0018\u0010\u001e\u000eGiwp\u0017P");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            throw new AnnotatedException(new String(iArr2, 0, i3), e3);
        }
    }
}
