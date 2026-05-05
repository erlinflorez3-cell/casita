package org.bouncycastle.x509.extension;

import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509Extension;
import org.bouncycastle.util.Integers;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes2.dex */
public class X509ExtensionUtil {
    public static ASN1Primitive fromExtensionValue(byte[] bArr) throws IOException {
        return ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(bArr)).getOctets());
    }

    private static Collection getAlternativeNames(byte[] bArr) throws Throwable {
        Object id;
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration objects = DERSequence.getInstance(fromExtensionValue(bArr)).getObjects();
            while (objects.hasMoreElements()) {
                GeneralName generalName = GeneralName.getInstance(objects.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integers.valueOf(generalName.getTagNo()));
                switch (generalName.getTagNo()) {
                    case 0:
                    case 3:
                    case 5:
                        id = generalName.getName().toASN1Primitive();
                        break;
                    case 1:
                    case 2:
                    case 6:
                        id = ((ASN1String) generalName.getName()).getString();
                        break;
                    case 4:
                        id = X500Name.getInstance(generalName.getName()).toString();
                        break;
                    case 7:
                        arrayList2.add(DEROctetString.getInstance(generalName.getName()).getOctets());
                        continue;
                        arrayList.add(arrayList2);
                        break;
                    case 8:
                        id = ASN1ObjectIdentifier.getInstance(generalName.getName()).getId();
                        break;
                    default:
                        throw new IOException(ZO.xd(";E\u0010\u00047_9}Y\u0012\u0019L\u0005g\t.", (short) (FB.Xd() ^ 22714), (short) (FB.Xd() ^ OlympusMakernoteDirectory.TAG_RED_BALANCE)) + generalName.getTagNo());
                }
                arrayList2.add(id);
                arrayList.add(arrayList2);
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e2) {
            String message = e2.getMessage();
            short sXd = (short) (C1633zX.Xd() ^ (-32750));
            short sXd2 = (short) (C1633zX.Xd() ^ (-26665));
            int[] iArr = new int["HCM$e\u0004S?.tu\u00123^lm\u001626\u0007\u001e2g}|P\u001c:[\"ok][3.y'\u0014 ^.\u0019v\u000b\u001d".length()];
            QB qb = new QB("HCM$e\u0004S?.tu\u00123^lm\u001626\u0007\u001e2g}|P\u001c:[\"ok][3.y'\u0014 ^.\u0019v\u000b\u001d");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {message};
            Constructor<?> constructor = Class.forName(new String(iArr, 0, i2)).getConstructor(Class.forName(Ig.wd("7\u0002f/\"\u0014\u001b]{Hin\u001a!sP", (short) (OY.Xd() ^ 15499))));
            try {
                constructor.setAccessible(true);
                throw ((CertificateParsingException) constructor.newInstance(objArr));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    public static Collection getIssuerAlternativeNames(X509Certificate x509Certificate) throws CertificateParsingException {
        return getAlternativeNames(x509Certificate.getExtensionValue(X509Extension.issuerAlternativeName.getId()));
    }

    public static Collection getSubjectAlternativeNames(X509Certificate x509Certificate) throws CertificateParsingException {
        return getAlternativeNames(x509Certificate.getExtensionValue(X509Extension.subjectAlternativeName.getId()));
    }
}
