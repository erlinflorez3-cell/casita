package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes6.dex */
public class POPOPrivKey extends ASN1Object implements ASN1Choice {
    public static final int agreeMAC = 3;
    public static final int dhMAC = 2;
    public static final int encryptedKey = 4;
    public static final int subsequentMessage = 1;
    public static final int thisMessage = 0;
    private ASN1Encodable obj;
    private int tagNo;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private POPOPrivKey(org.bouncycastle.asn1.ASN1TaggedObject r4) {
        /*
            r3 = this;
            r3.<init>()
            int r2 = r4.getTagNo()
            r3.tagNo = r2
            r1 = 0
            if (r2 == 0) goto L35
            r0 = 1
            if (r2 == r0) goto L24
            r0 = 2
            if (r2 == r0) goto L35
            r0 = 3
            if (r2 == r0) goto L1f
            r0 = 4
            if (r2 != r0) goto L3a
            org.bouncycastle.asn1.cms.EnvelopedData r0 = org.bouncycastle.asn1.cms.EnvelopedData.getInstance(r4, r1)
        L1c:
            r3.obj = r0
            return
        L1f:
            org.bouncycastle.asn1.crmf.PKMACValue r0 = org.bouncycastle.asn1.crmf.PKMACValue.getInstance(r4, r1)
            goto L1c
        L24:
            org.bouncycastle.asn1.ASN1Integer r0 = org.bouncycastle.asn1.ASN1Integer.getInstance(r4, r1)
            java.math.BigInteger r0 = r0.getValue()
            int r0 = r0.intValue()
            org.bouncycastle.asn1.crmf.SubsequentMessage r0 = org.bouncycastle.asn1.crmf.SubsequentMessage.valueOf(r0)
            goto L1c
        L35:
            org.bouncycastle.asn1.DERBitString r0 = org.bouncycastle.asn1.DERBitString.getInstance(r4, r1)
            goto L1c
        L3a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown tag in POPOPrivKey"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.crmf.POPOPrivKey.<init>(org.bouncycastle.asn1.ASN1TaggedObject):void");
    }

    public POPOPrivKey(SubsequentMessage subsequentMessage2) {
        this.tagNo = 1;
        this.obj = subsequentMessage2;
    }

    public static POPOPrivKey getInstance(Object obj) {
        if (obj instanceof POPOPrivKey) {
            return (POPOPrivKey) obj;
        }
        if (obj != null) {
            return new POPOPrivKey(ASN1TaggedObject.getInstance(obj));
        }
        return null;
    }

    public static POPOPrivKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1TaggedObject.getInstance(aSN1TaggedObject, z2));
    }

    public int getType() {
        return this.tagNo;
    }

    public ASN1Encodable getValue() {
        return this.obj;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(false, this.tagNo, this.obj);
    }
}
