package org.spongycastle.pqc.math.linearalgebra;

import cz.msebera.android.httpclient.message.TokenParser;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public class GF2Vector extends Vector {

    /* JADX INFO: renamed from: v */
    private int[] f28196v;

    public GF2Vector(int i2) {
        if (i2 < 0) {
            throw new ArithmeticException("Negative length.");
        }
        this.length = i2;
        this.f28196v = new int[(i2 + 31) >> 5];
    }

    public GF2Vector(int i2, int i3, SecureRandom secureRandom) {
        if (i3 > i2) {
            throw new ArithmeticException("The hamming weight is greater than the length of vector.");
        }
        this.length = i2;
        this.f28196v = new int[(i2 + 31) >> 5];
        int[] iArr = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i4;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            int iNextInt = RandUtils.nextInt(secureRandom, i2);
            setBit(iArr[iNextInt]);
            i2--;
            iArr[iNextInt] = iArr[i2];
        }
    }

    public GF2Vector(int i2, SecureRandom secureRandom) {
        this.length = i2;
        int i3 = (i2 + 31) >> 5;
        this.f28196v = new int[i3];
        int i4 = i3 - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            this.f28196v[i5] = secureRandom.nextInt();
        }
        int i6 = (i2 + 31) - (i2 | 31);
        if (i6 != 0) {
            int[] iArr = this.f28196v;
            iArr[i4] = ((1 << i6) - 1) & iArr[i4];
        }
    }

    public GF2Vector(int i2, int[] iArr) {
        if (i2 < 0) {
            throw new ArithmeticException("negative length");
        }
        this.length = i2;
        int i3 = (i2 + 31) >> 5;
        if (iArr.length != i3) {
            throw new ArithmeticException("length mismatch");
        }
        int[] iArrClone = IntUtils.clone(iArr);
        this.f28196v = iArrClone;
        int i4 = (i2 + 31) - (i2 | 31);
        if (i4 != 0) {
            int i5 = i3 - 1;
            int i6 = iArrClone[i5];
            int i7 = (1 << i4) - 1;
            iArrClone[i5] = (i7 + i6) - (i7 | i6);
        }
    }

    public GF2Vector(GF2Vector gF2Vector) {
        this.length = gF2Vector.length;
        this.f28196v = IntUtils.clone(gF2Vector.f28196v);
    }

    protected GF2Vector(int[] iArr, int i2) {
        this.f28196v = iArr;
        this.length = i2;
    }

    public static GF2Vector OS2VP(int i2, byte[] bArr) {
        if (i2 < 0) {
            throw new ArithmeticException("negative length");
        }
        if (bArr.length <= ((i2 + 7) >> 3)) {
            return new GF2Vector(i2, LittleEndianConversions.toIntArray(bArr));
        }
        throw new ArithmeticException("length mismatch");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public Vector add(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        GF2Vector gF2Vector = (GF2Vector) vector;
        if (this.length != gF2Vector.length) {
            throw new ArithmeticException("length mismatch");
        }
        int[] iArrClone = IntUtils.clone(gF2Vector.f28196v);
        for (int length = iArrClone.length - 1; length >= 0; length--) {
            iArrClone[length] = iArrClone[length] ^ this.f28196v[length];
        }
        return new GF2Vector(this.length, iArrClone);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public boolean equals(Object obj) {
        if (!(obj instanceof GF2Vector)) {
            return false;
        }
        GF2Vector gF2Vector = (GF2Vector) obj;
        return this.length == gF2Vector.length && IntUtils.equals(this.f28196v, gF2Vector.f28196v);
    }

    public GF2Vector extractLeftVector(int i2) {
        if (i2 > this.length) {
            throw new ArithmeticException("invalid length");
        }
        if (i2 == this.length) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i2);
        int i3 = i2 >> 5;
        int i4 = (-1) - (((-1) - i2) | ((-1) - 31));
        System.arraycopy(this.f28196v, 0, gF2Vector.f28196v, 0, i3);
        if (i4 != 0) {
            gF2Vector.f28196v[i3] = (-1) - (((-1) - ((1 << i4) - 1)) | ((-1) - this.f28196v[i3]));
        }
        return gF2Vector;
    }

    public GF2Vector extractRightVector(int i2) {
        int i3;
        if (i2 > this.length) {
            throw new ArithmeticException("invalid length");
        }
        if (i2 == this.length) {
            return new GF2Vector(this);
        }
        GF2Vector gF2Vector = new GF2Vector(i2);
        int i4 = (this.length - i2) >> 5;
        int i5 = (-1) - (((-1) - (this.length - i2)) | ((-1) - 31));
        int i6 = (i2 + 31) >> 5;
        int i7 = 0;
        if (i5 != 0) {
            while (true) {
                i3 = i6 - 1;
                if (i7 >= i3) {
                    break;
                }
                int[] iArr = gF2Vector.f28196v;
                int[] iArr2 = this.f28196v;
                int i8 = i4 + 1;
                int i9 = iArr2[i4] >>> i5;
                int i10 = iArr2[i8] << (32 - i5);
                iArr[i7] = (i9 + i10) - (i9 & i10);
                i7++;
                i4 = i8;
            }
            int[] iArr3 = gF2Vector.f28196v;
            int[] iArr4 = this.f28196v;
            int i11 = i4 + 1;
            int i12 = iArr4[i4] >>> i5;
            iArr3[i3] = i12;
            if (i11 < iArr4.length) {
                int i13 = iArr4[i11] << (32 - i5);
                iArr3[i3] = (i12 + i13) - (i12 & i13);
            }
        } else {
            System.arraycopy(this.f28196v, i4, gF2Vector.f28196v, 0, i6);
        }
        return gF2Vector;
    }

    public GF2Vector extractVector(int[] iArr) {
        int length = iArr.length;
        if (iArr[length - 1] > this.length) {
            throw new ArithmeticException("invalid index set");
        }
        GF2Vector gF2Vector = new GF2Vector(length);
        for (int i2 = 0; i2 < length; i2++) {
            int[] iArr2 = this.f28196v;
            int i3 = iArr[i2];
            int i4 = iArr2[i3 >> 5];
            int i5 = 1 << ((-1) - (((-1) - i3) | ((-1) - 31)));
            if ((i4 + i5) - (i4 | i5) != 0) {
                int[] iArr3 = gF2Vector.f28196v;
                int i6 = i2 >> 5;
                iArr3[i6] = (-1) - (((-1) - (1 << (31 & i2))) & ((-1) - iArr3[i6]));
            }
        }
        return gF2Vector;
    }

    public int getBit(int i2) {
        if (i2 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (-1) - (((-1) - i2) | ((-1) - 31));
        return ((-1) - (((-1) - this.f28196v[i2 >> 5]) | ((-1) - (1 << i3)))) >>> i3;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public byte[] getEncoded() {
        return LittleEndianConversions.toByteArray(this.f28196v, (this.length + 7) >> 3);
    }

    public int getHammingWeight() {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f28196v;
            if (i2 >= iArr.length) {
                return i3;
            }
            int i4 = iArr[i2];
            for (int i5 = 0; i5 < 32; i5++) {
                if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
                    i3++;
                }
                i4 >>>= 1;
            }
            i2++;
        }
    }

    public int[] getVecArray() {
        return this.f28196v;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public int hashCode() {
        return (this.length * 31) + this.f28196v.hashCode();
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public boolean isZero() {
        for (int length = this.f28196v.length - 1; length >= 0; length--) {
            if (this.f28196v[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public Vector multiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        if (this.length != vector.length) {
            throw new ArithmeticException("length mismatch");
        }
        GF2Vector gF2Vector = new GF2Vector(this.length);
        for (int i2 = 0; i2 < vector.length; i2++) {
            int[] iArr = this.f28196v;
            int i3 = vector[i2];
            int i4 = iArr[i3 >> 5];
            int i5 = 1 << (i3 & 31);
            if ((i4 + i5) - (i4 | i5) != 0) {
                int[] iArr2 = gF2Vector.f28196v;
                int i6 = i2 >> 5;
                int i7 = iArr2[i6];
                int i8 = 1 << (31 & i2);
                iArr2[i6] = (i8 + i7) - (i8 & i7);
            }
        }
        return gF2Vector;
    }

    public void setBit(int i2) {
        if (i2 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int[] iArr = this.f28196v;
        int i3 = i2 >> 5;
        iArr[i3] = (1 << (i2 & 31)) | iArr[i3];
    }

    public GF2mVector toExtensionFieldVector(GF2mField gF2mField) {
        int degree = gF2mField.getDegree();
        if (this.length % degree != 0) {
            throw new ArithmeticException("conversion is impossible");
        }
        int i2 = this.length / degree;
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            for (int degree2 = gF2mField.getDegree() - 1; degree2 >= 0; degree2--) {
                if ((-1) - (((-1) - (this.f28196v[i3 >>> 5] >>> ((-1) - (((-1) - i3) | ((-1) - 31))))) | ((-1) - 1)) == 1) {
                    iArr[i4] = iArr[i4] ^ (1 << degree2);
                }
                i3++;
            }
        }
        return new GF2mVector(gF2mField, iArr);
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Vector
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < this.length; i2++) {
            if (i2 != 0 && (i2 + 31) - (31 | i2) == 0) {
                stringBuffer.append(TokenParser.SP);
            }
            int i3 = this.f28196v[i2 >> 5];
            int i4 = 1 << ((i2 + 31) - (31 | i2));
            if ((i3 + i4) - (i3 | i4) == 0) {
                stringBuffer.append('0');
            } else {
                stringBuffer.append('1');
            }
        }
        return stringBuffer.toString();
    }
}
