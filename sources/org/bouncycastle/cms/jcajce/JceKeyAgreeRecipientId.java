package org.bouncycastle.cms.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cms.KeyAgreeRecipientId;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.Ig;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public class JceKeyAgreeRecipientId extends KeyAgreeRecipientId {
    public JceKeyAgreeRecipientId(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("\\\u0015:<\r&@Y\u001d\u0006vwf\u0019\u001aQ\u0016\"\u0007\u000ej>-\u0017./\u0014\u001f\u0016Sew\u0017:", (short) (C1607wl.Xd() ^ 5665), (short) (C1607wl.Xd() ^ 21214))).getMethod(Ig.wd("\u007fMjb\u001eA+\u0013AZ9R\u0004\u001allI$q<nE", (short) (ZN.Xd() ^ 21553)), new Class[0]);
        try {
            method.setAccessible(true);
            X500Principal x500Principal = (X500Principal) method.invoke(x509Certificate, objArr);
            short sXd = (short) (C1499aX.Xd() ^ (-25775));
            int[] iArr = new int["a&OXwi'4\u0012bW@\u0015C\u0001`C78j\u0003I &DE)C2\u0007\\:5\b".length()];
            QB qb = new QB("a&OXwi'4\u0012bW@\u0015C\u0001`C78j\u0003I &DE)C2\u0007\\:5\b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("jguSdpf]gHneY[g", (short) (C1607wl.Xd() ^ 6205)), new Class[0]);
            try {
                method2.setAccessible(true);
                this(x500Principal, (BigInteger) method2.invoke(x509Certificate, objArr2));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public JceKeyAgreeRecipientId(X500Principal x500Principal, BigInteger bigInteger) {
        super(X500Name.getInstance(x500Principal.getEncoded()), bigInteger);
    }
}
