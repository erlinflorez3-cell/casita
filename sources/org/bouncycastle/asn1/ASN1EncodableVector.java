package org.bouncycastle.asn1;

import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes6.dex */
public class ASN1EncodableVector {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Vector f27450v = new Vector();

    public void add(ASN1Encodable aSN1Encodable) {
        this.f27450v.addElement(aSN1Encodable);
    }

    public void addAll(ASN1EncodableVector aSN1EncodableVector) {
        Enumeration enumerationElements = aSN1EncodableVector.f27450v.elements();
        while (enumerationElements.hasMoreElements()) {
            this.f27450v.addElement(enumerationElements.nextElement());
        }
    }

    public ASN1Encodable get(int i2) {
        return (ASN1Encodable) this.f27450v.elementAt(i2);
    }

    public int size() {
        return this.f27450v.size();
    }
}
