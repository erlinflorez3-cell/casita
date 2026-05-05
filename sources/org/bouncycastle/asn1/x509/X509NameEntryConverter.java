package org.bouncycastle.asn1.x509;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes6.dex */
public abstract class X509NameEntryConverter {
    protected boolean canBePrintable(String str) {
        return DERPrintableString.isPrintableString(str);
    }

    protected ASN1Primitive convertHexEncoded(String str, int i2) throws IOException {
        String lowerCase = Strings.toLowerCase(str);
        int length = (lowerCase.length() - i2) / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 != length; i3++) {
            int i4 = (i3 * 2) + i2;
            char cCharAt = lowerCase.charAt(i4);
            char cCharAt2 = lowerCase.charAt(i4 + 1);
            if (cCharAt < 'a') {
                bArr[i3] = (byte) ((cCharAt - '0') << 4);
            } else {
                bArr[i3] = (byte) ((cCharAt - 'W') << 4);
            }
            if (cCharAt2 < 'a') {
                bArr[i3] = (byte) ((-1) - (((-1) - ((byte) (cCharAt2 - '0'))) & ((-1) - bArr[i3])));
            } else {
                bArr[i3] = (byte) ((-1) - (((-1) - ((byte) (cCharAt2 - 'W'))) & ((-1) - bArr[i3])));
            }
        }
        return new ASN1InputStream(bArr).readObject();
    }

    public abstract ASN1Primitive getConvertedValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str);
}
