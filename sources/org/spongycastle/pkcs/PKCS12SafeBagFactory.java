package org.spongycastle.pkcs;

import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.pkcs.ContentInfo;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.SafeBag;
import org.spongycastle.cms.CMSEncryptedData;
import org.spongycastle.cms.CMSException;
import org.spongycastle.operator.InputDecryptorProvider;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS12SafeBagFactory {
    private ASN1Sequence safeBagSeq;

    public PKCS12SafeBagFactory(ContentInfo contentInfo) {
        if (contentInfo.getContentType().equals(PKCSObjectIdentifiers.encryptedData)) {
            throw new IllegalArgumentException("encryptedData requires constructor with decryptor.");
        }
        this.safeBagSeq = ASN1Sequence.getInstance(ASN1OctetString.getInstance(contentInfo.getContent()).getOctets());
    }

    public PKCS12SafeBagFactory(ContentInfo contentInfo, InputDecryptorProvider inputDecryptorProvider) throws PKCSException {
        if (!contentInfo.getContentType().equals(PKCSObjectIdentifiers.encryptedData)) {
            throw new IllegalArgumentException("encryptedData requires constructor with decryptor.");
        }
        try {
            this.safeBagSeq = ASN1Sequence.getInstance(new CMSEncryptedData(org.spongycastle.asn1.cms.ContentInfo.getInstance(contentInfo)).getContent(inputDecryptorProvider));
        } catch (CMSException e2) {
            throw new PKCSException("unable to extract data: " + e2.getMessage(), e2);
        }
    }

    public PKCS12SafeBag[] getSafeBags() {
        PKCS12SafeBag[] pKCS12SafeBagArr = new PKCS12SafeBag[this.safeBagSeq.size()];
        for (int i2 = 0; i2 != this.safeBagSeq.size(); i2++) {
            pKCS12SafeBagArr[i2] = new PKCS12SafeBag(SafeBag.getInstance(this.safeBagSeq.getObjectAt(i2)));
        }
        return pKCS12SafeBagArr;
    }
}
