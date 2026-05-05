package org.spongycastle.cms.jcajce;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.cms.KeyAgreeRecipientId;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class JceKeyAgreeRecipientId extends KeyAgreeRecipientId {
    public JceKeyAgreeRecipientId(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("^VhT&l[Za_S_i\u001fQTVY\u0010;\u001d\u0019\u001f*AONDFJA@\tz", (short) (C1580rY.Xd() ^ (-22597)))).getMethod(C1561oA.Yd("IHX.YZ]N\\C!\u001d\u001e?bZ`V]eWc", (short) (C1633zX.Xd() ^ (-26182))), new Class[0]);
        try {
            method.setAccessible(true);
            X500Principal x500Principal = (X500Principal) method.invoke(x509Certificate, objArr);
            short sXd = (short) (FB.Xd() ^ 8399);
            short sXd2 = (short) (FB.Xd() ^ 26418);
            int[] iArr = new int["vn\u0005p>\u0005wv\n\b\u007f\f\u0012G}\u0001\u000f\u0012LwUQ[f\n\u0018\u001b\u0011\u000f\u0013\u000e\r!\u0013".length()];
            QB qb = new QB("vn\u0005p>\u0005wv\n\b\u007f\f\u0012G}\u0001\u000f\u0012LwUQ[f\n\u0018\u001b\u0011\u000f\u0013\u000e\r!\u0013");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("0\u0011S5zyS~|\"=\u0018@6\u0007", (short) (ZN.Xd() ^ 29016), (short) (ZN.Xd() ^ 13309)), new Class[0]);
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
