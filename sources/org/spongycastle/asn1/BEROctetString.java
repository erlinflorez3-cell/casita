package org.spongycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class BEROctetString extends ASN1OctetString {
    private static final int MAX_LENGTH = 1000;
    private ASN1OctetString[] octs;

    /* JADX INFO: renamed from: org.spongycastle.asn1.BEROctetString$1 */
    class AnonymousClass1 implements Enumeration {
        int counter = 0;

        AnonymousClass1() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.counter < BEROctetString.this.octs.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            ASN1OctetString[] aSN1OctetStringArr = BEROctetString.this.octs;
            int i2 = this.counter;
            this.counter = i2 + 1;
            return aSN1OctetStringArr[i2];
        }
    }

    public BEROctetString(byte[] bArr) {
        super(bArr);
    }

    public BEROctetString(ASN1OctetString[] aSN1OctetStringArr) {
        super(toBytes(aSN1OctetStringArr));
        this.octs = aSN1OctetStringArr;
    }

    static BEROctetString fromSequence(ASN1Sequence aSN1Sequence) {
        ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i2 = 0;
        while (objects.hasMoreElements()) {
            aSN1OctetStringArr[i2] = (ASN1OctetString) objects.nextElement();
            i2++;
        }
        return new BEROctetString(aSN1OctetStringArr);
    }

    private Vector generateOcts() {
        Vector vector = new Vector();
        int i2 = 0;
        while (i2 < this.string.length) {
            int i3 = i2 + 1000;
            int length = (i3 > this.string.length ? this.string.length : i3) - i2;
            byte[] bArr = new byte[length];
            System.arraycopy(this.string, i2, bArr, 0, length);
            vector.addElement(new DEROctetString(bArr));
            i2 = i3;
        }
        return vector;
    }

    private static byte[] toBytes(ASN1OctetString[] aSN1OctetStringArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (i2 != aSN1OctetStringArr.length) {
            try {
                byteArrayOutputStream.write(((DEROctetString) aSN1OctetStringArr[i2]).getOctets());
                i2++;
            } catch (IOException e2) {
                throw new IllegalArgumentException("exception converting octets " + e2.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(aSN1OctetStringArr[i2].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.spongycastle.asn1.ASN1OctetString, org.spongycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.write(36);
        aSN1OutputStream.write(128);
        Enumeration objects = getObjects();
        while (objects.hasMoreElements()) {
            aSN1OutputStream.writeObject((ASN1Encodable) objects.nextElement());
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    int encodedLength() throws IOException {
        Enumeration objects = getObjects();
        int iEncodedLength = 0;
        while (objects.hasMoreElements()) {
            iEncodedLength += ((ASN1Encodable) objects.nextElement()).toASN1Primitive().encodedLength();
        }
        return iEncodedLength + 4;
    }

    public Enumeration getObjects() {
        return this.octs == null ? generateOcts().elements() : new Enumeration() { // from class: org.spongycastle.asn1.BEROctetString.1
            int counter = 0;

            AnonymousClass1() {
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.counter < BEROctetString.this.octs.length;
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                ASN1OctetString[] aSN1OctetStringArr = BEROctetString.this.octs;
                int i2 = this.counter;
                this.counter = i2 + 1;
                return aSN1OctetStringArr[i2];
            }
        };
    }

    @Override // org.spongycastle.asn1.ASN1OctetString
    public byte[] getOctets() {
        return this.string;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    boolean isConstructed() {
        return true;
    }
}
