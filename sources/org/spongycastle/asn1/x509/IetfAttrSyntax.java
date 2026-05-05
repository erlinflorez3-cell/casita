package org.spongycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes2.dex */
public class IetfAttrSyntax extends ASN1Object {
    public static final int VALUE_OCTETS = 1;
    public static final int VALUE_OID = 2;
    public static final int VALUE_UTF8 = 3;
    GeneralNames policyAuthority;
    int valueChoice;
    Vector values = new Vector();

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private IetfAttrSyntax(org.spongycastle.asn1.ASN1Sequence r7) {
        /*
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.policyAuthority = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r6.values = r0
            r0 = -1
            r6.valueChoice = r0
            r1 = 0
            org.spongycastle.asn1.ASN1Encodable r0 = r7.getObjectAt(r1)
            boolean r0 = r0 instanceof org.spongycastle.asn1.ASN1TaggedObject
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L67
            org.spongycastle.asn1.ASN1Encodable r0 = r7.getObjectAt(r1)
            org.spongycastle.asn1.ASN1TaggedObject r0 = (org.spongycastle.asn1.ASN1TaggedObject) r0
            org.spongycastle.asn1.x509.GeneralNames r0 = org.spongycastle.asn1.x509.GeneralNames.getInstance(r0, r1)
            r6.policyAuthority = r0
        L27:
            r1 = r5
        L28:
            org.spongycastle.asn1.ASN1Encodable r0 = r7.getObjectAt(r1)
            boolean r0 = r0 instanceof org.spongycastle.asn1.ASN1Sequence
            if (r0 == 0) goto L89
            org.spongycastle.asn1.ASN1Encodable r0 = r7.getObjectAt(r1)
            org.spongycastle.asn1.ASN1Sequence r0 = (org.spongycastle.asn1.ASN1Sequence) r0
            java.util.Enumeration r3 = r0.getObjects()
        L3a:
            boolean r0 = r3.hasMoreElements()
            if (r0 == 0) goto L88
            java.lang.Object r2 = r3.nextElement()
            org.spongycastle.asn1.ASN1Primitive r2 = (org.spongycastle.asn1.ASN1Primitive) r2
            boolean r0 = r2 instanceof org.spongycastle.asn1.ASN1ObjectIdentifier
            if (r0 == 0) goto L5b
            r1 = r4
        L4b:
            int r0 = r6.valueChoice
            if (r0 >= 0) goto L51
            r6.valueChoice = r1
        L51:
            int r0 = r6.valueChoice
            if (r1 != r0) goto L78
            java.util.Vector r0 = r6.values
            r0.addElement(r2)
            goto L3a
        L5b:
            boolean r0 = r2 instanceof org.spongycastle.asn1.DERUTF8String
            if (r0 == 0) goto L61
            r1 = 3
            goto L4b
        L61:
            boolean r0 = r2 instanceof org.spongycastle.asn1.DEROctetString
            if (r0 == 0) goto L80
            r1 = r5
            goto L4b
        L67:
            int r0 = r7.size()
            if (r0 != r4) goto L28
            org.spongycastle.asn1.ASN1Encodable r0 = r7.getObjectAt(r1)
            org.spongycastle.asn1.x509.GeneralNames r0 = org.spongycastle.asn1.x509.GeneralNames.getInstance(r0)
            r6.policyAuthority = r0
            goto L27
        L78:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Mix of value types in IetfAttrSyntax"
            r1.<init>(r0)
            throw r1
        L80:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Bad value type encoding IetfAttrSyntax"
            r1.<init>(r0)
            throw r1
        L88:
            return
        L89:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Non-IetfAttrSyntax encoding"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.asn1.x509.IetfAttrSyntax.<init>(org.spongycastle.asn1.ASN1Sequence):void");
    }

    public static IetfAttrSyntax getInstance(Object obj) {
        if (obj instanceof IetfAttrSyntax) {
            return (IetfAttrSyntax) obj;
        }
        if (obj != null) {
            return new IetfAttrSyntax(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralNames getPolicyAuthority() {
        return this.policyAuthority;
    }

    public int getValueType() {
        return this.valueChoice;
    }

    public Object[] getValues() {
        int i2 = 0;
        if (getValueType() == 1) {
            int size = this.values.size();
            ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
            while (i2 != size) {
                aSN1OctetStringArr[i2] = (ASN1OctetString) this.values.elementAt(i2);
                i2++;
            }
            return aSN1OctetStringArr;
        }
        if (getValueType() == 2) {
            int size2 = this.values.size();
            ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size2];
            while (i2 != size2) {
                aSN1ObjectIdentifierArr[i2] = (ASN1ObjectIdentifier) this.values.elementAt(i2);
                i2++;
            }
            return aSN1ObjectIdentifierArr;
        }
        int size3 = this.values.size();
        DERUTF8String[] dERUTF8StringArr = new DERUTF8String[size3];
        while (i2 != size3) {
            dERUTF8StringArr[i2] = (DERUTF8String) this.values.elementAt(i2);
            i2++;
        }
        return dERUTF8StringArr;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.policyAuthority != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, this.policyAuthority));
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        Enumeration enumerationElements = this.values.elements();
        while (enumerationElements.hasMoreElements()) {
            aSN1EncodableVector2.add((ASN1Encodable) enumerationElements.nextElement());
        }
        aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        return new DERSequence(aSN1EncodableVector);
    }
}
