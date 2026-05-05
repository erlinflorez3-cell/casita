package org.spongycastle.x509.extension;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1String;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.X509Extension;
import org.spongycastle.util.Integers;
import yg.C1561oA;
import yg.C1593ug;
import yg.Od;
import yg.ZN;

/* JADX INFO: loaded from: classes2.dex */
public class X509ExtensionUtil {
    public static ASN1Primitive fromExtensionValue(byte[] bArr) throws IOException {
        return ASN1Primitive.fromByteArray(((ASN1OctetString) ASN1Primitive.fromByteArray(bArr)).getOctets());
    }

    private static Collection getAlternativeNames(byte[] bArr) throws Throwable {
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
                        arrayList2.add(generalName.getName().toASN1Primitive());
                        break;
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((ASN1String) generalName.getName()).getString());
                        break;
                    case 4:
                        arrayList2.add(X500Name.getInstance(generalName.getName()).toString());
                        break;
                    case 7:
                        arrayList2.add(DEROctetString.getInstance(generalName.getName()).getOctets());
                        break;
                    case 8:
                        arrayList2.add(ASN1ObjectIdentifier.getInstance(generalName.getName()).getId());
                        break;
                    default:
                        throw new IOException(C1561oA.Qd("\u0011/1k?+0g5;2&(4z_", (short) (Od.Xd() ^ (-3136))) + generalName.getTagNo());
                }
                arrayList.add(arrayList2);
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e2) {
            Object[] objArr = {e2.getMessage()};
            Constructor<?> constructor = Class.forName(C1593ug.zd("A9O;\tOBATRJV\\\u0012HKY\\\u0017-P^aWUYTSgYEWikbhbAuadpukrr", (short) (ZN.Xd() ^ 22865), (short) (ZN.Xd() ^ 25307))).getConstructor(Class.forName(C1561oA.od("'\u001d1\u001bf$\u0018$\u001ca\u0006&#\u0019\u001d\u0015", (short) (Od.Xd() ^ (-28935)))));
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
