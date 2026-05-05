package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ASN1ApplicationSpecific extends ASN1Primitive {
    protected final boolean isConstructed;
    protected final byte[] octets;
    protected final int tag;

    ASN1ApplicationSpecific(boolean z2, int i2, byte[] bArr) {
        this.isConstructed = z2;
        this.tag = i2;
        this.octets = Arrays.clone(bArr);
    }

    public static ASN1ApplicationSpecific getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1ApplicationSpecific)) {
            return (ASN1ApplicationSpecific) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException e2) {
            throw new IllegalArgumentException("Failed to construct object from byte[]: " + e2.getMessage());
        }
    }

    protected static int getLengthOfHeader(byte[] bArr) {
        byte b2 = bArr[1];
        int i2 = (b2 + 255) - (255 | b2);
        if (i2 == 128 || i2 <= 127) {
            return 2;
        }
        int i3 = (b2 + 127) - (b2 | 127);
        if (i3 <= 4) {
            return i3 + 2;
        }
        throw new IllegalStateException("DER length more than 4 bytes: " + i3);
    }

    private byte[] replaceTagNumber(int i2, byte[] bArr) throws IOException {
        int i3;
        if ((-1) - (((-1) - bArr[0]) | ((-1) - 31)) == 31) {
            byte b2 = bArr[1];
            int i4 = 255 & b2;
            if ((b2 + 127) - (b2 | 127) == 0) {
                throw new ASN1ParsingException("corrupted stream - invalid high tag number found");
            }
            i3 = 2;
            while (i4 >= 0 && (i4 + 128) - (i4 | 128) != 0) {
                i4 = (-1) - (((-1) - bArr[i3]) | ((-1) - 255));
                i3++;
            }
        } else {
            i3 = 1;
        }
        int length = bArr.length - i3;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, i3, bArr2, 1, length);
        bArr2[0] = (byte) i2;
        return bArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1ApplicationSpecific)) {
            return false;
        }
        ASN1ApplicationSpecific aSN1ApplicationSpecific = (ASN1ApplicationSpecific) aSN1Primitive;
        return this.isConstructed == aSN1ApplicationSpecific.isConstructed && this.tag == aSN1ApplicationSpecific.tag && Arrays.areEqual(this.octets, aSN1ApplicationSpecific.octets);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(this.isConstructed ? 96 : 64, this.tag, this.octets);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength() throws IOException {
        return StreamUtil.calculateTagLength(this.tag) + StreamUtil.calculateBodyLength(this.octets.length) + this.octets.length;
    }

    public int getApplicationTag() {
        return this.tag;
    }

    public byte[] getContents() {
        return Arrays.clone(this.octets);
    }

    public ASN1Primitive getObject() throws IOException {
        return ASN1Primitive.fromByteArray(getContents());
    }

    public ASN1Primitive getObject(int i2) throws IOException {
        if (i2 >= 31) {
            throw new IOException("unsupported tag number");
        }
        byte[] encoded = getEncoded();
        byte[] bArrReplaceTagNumber = replaceTagNumber(i2, encoded);
        byte b2 = encoded[0];
        if ((b2 + 32) - (b2 | 32) != 0) {
            bArrReplaceTagNumber[0] = (byte) (bArrReplaceTagNumber[0] | 32);
        }
        return ASN1Primitive.fromByteArray(bArrReplaceTagNumber);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        boolean z2 = this.isConstructed;
        return ((z2 ? 1 : 0) ^ this.tag) ^ Arrays.hashCode(this.octets);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return this.isConstructed;
    }
}
