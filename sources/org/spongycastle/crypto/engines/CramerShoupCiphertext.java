package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public class CramerShoupCiphertext {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    BigInteger f27893e;
    BigInteger u1;
    BigInteger u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    BigInteger f27894v;

    public CramerShoupCiphertext() {
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.u1 = bigInteger;
        this.u2 = bigInteger2;
        this.f27893e = bigInteger3;
        this.f27894v = bigInteger4;
    }

    public CramerShoupCiphertext(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 0);
        int i2 = 4 + iBigEndianToInt;
        this.u1 = new BigInteger(Arrays.copyOfRange(bArr, 4, i2));
        int i3 = iBigEndianToInt + 8;
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i2) + i3;
        this.u2 = new BigInteger(Arrays.copyOfRange(bArr, i3, iBigEndianToInt2));
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, iBigEndianToInt2);
        int i4 = iBigEndianToInt2 + 4;
        int i5 = iBigEndianToInt3 + i4;
        this.f27893e = new BigInteger(Arrays.copyOfRange(bArr, i4, i5));
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i5);
        int i6 = i5 + 4;
        this.f27894v = new BigInteger(Arrays.copyOfRange(bArr, i6, iBigEndianToInt4 + i6));
    }

    public BigInteger getE() {
        return this.f27893e;
    }

    public BigInteger getU1() {
        return this.u1;
    }

    public BigInteger getU2() {
        return this.u2;
    }

    public BigInteger getV() {
        return this.f27894v;
    }

    public void setE(BigInteger bigInteger) {
        this.f27893e = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.u1 = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.u2 = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.f27894v = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.f27893e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.f27894v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        Pack.intToBigEndian(length2, bArr, 4 + length);
        int i2 = length + 8;
        System.arraycopy(byteArray2, 0, bArr, i2, length2);
        int i3 = i2 + length2;
        Pack.intToBigEndian(length3, bArr, i3);
        int i4 = i3 + 4;
        System.arraycopy(byteArray3, 0, bArr, i4, length3);
        int i5 = i4 + length3;
        Pack.intToBigEndian(length4, bArr, i5);
        System.arraycopy(byteArray4, 0, bArr, i5 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("u1: " + this.u1.toString());
        stringBuffer.append("\nu2: " + this.u2.toString());
        stringBuffer.append("\ne: " + this.f27893e.toString());
        stringBuffer.append("\nv: " + this.f27894v.toString());
        return stringBuffer.toString();
    }
}
