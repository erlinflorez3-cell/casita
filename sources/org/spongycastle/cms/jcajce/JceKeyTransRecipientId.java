package org.spongycastle.cms.jcajce;

import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.cms.KeyTransRecipientId;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes2.dex */
public class JceKeyTransRecipientId extends KeyTransRecipientId {
    /* JADX WARN: Illegal instructions before constructor call */
    public JceKeyTransRecipientId(X509Certificate x509Certificate) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("DJ\u0002[nR6rK7p*\u0017\nqRFv\u0012j\u000eg#k\u0012M\u0012u\u0019ZF\u0006[;", (short) (C1607wl.Xd() ^ 29836), (short) (C1607wl.Xd() ^ 19759))).getMethod(C1561oA.Xd("76F\u001cGHK<J1\u000f\u000b\f-PHNDKSEQ", (short) (C1580rY.Xd() ^ (-30828))), new Class[0]);
        try {
            method.setAccessible(true);
            X500Name x500NameConvertPrincipal = convertPrincipal((X500Principal) method.invoke(x509Certificate, objArr));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Wg.vd("ND\\F\u0016ZOLa]Wai\u001dUVFG\u0004-\r\u0007\u0013\u001cAMRFFHEB8(", (short) (OY.Xd() ^ 4070))).getMethod(Qg.kd(",)7\u0015&2(\u001f)\n0'\u001b\u001d)", (short) (FB.Xd() ^ 19006), (short) (FB.Xd() ^ OlympusMakernoteDirectory.TAG_OLYMPUS_IMAGE_HEIGHT)), new Class[0]);
            try {
                method2.setAccessible(true);
                super(x500NameConvertPrincipal, (BigInteger) method2.invoke(x509Certificate, objArr2), CMSUtils.getSubjectKeyId(x509Certificate));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public JceKeyTransRecipientId(X500Principal x500Principal, BigInteger bigInteger) {
        super(convertPrincipal(x500Principal), bigInteger);
    }

    public JceKeyTransRecipientId(X500Principal x500Principal, BigInteger bigInteger, byte[] bArr) {
        super(convertPrincipal(x500Principal), bigInteger, bArr);
    }

    private static X500Name convertPrincipal(X500Principal x500Principal) {
        if (x500Principal == null) {
            return null;
        }
        return X500Name.getInstance(x500Principal.getEncoded());
    }
}
