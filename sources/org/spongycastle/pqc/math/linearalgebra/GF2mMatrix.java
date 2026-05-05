package org.spongycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class GF2mMatrix extends Matrix {
    protected GF2mField field;
    protected int[][] matrix;

    public GF2mMatrix(GF2mField gF2mField, byte[] bArr) {
        this.field = gF2mField;
        int i2 = 8;
        int i3 = 1;
        while (gF2mField.getDegree() > i2) {
            i3++;
            i2 += 8;
        }
        if (bArr.length < 5) {
            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
        }
        int i4 = ((((-1) - (((-1) - bArr[3]) | ((-1) - 255))) << 24) ^ (((-1) - (((-1) - bArr[2]) | ((-1) - 255))) << 16)) ^ (((-1) - (((-1) - bArr[1]) | ((-1) - 255))) << 8);
        byte b2 = bArr[0];
        this.numRows = i4 ^ ((b2 + 255) - (b2 | 255));
        int i5 = i3 * this.numRows;
        if (this.numRows > 0) {
            int i6 = 4;
            if ((bArr.length - 4) % i5 == 0) {
                this.numColumns = (bArr.length - 4) / i5;
                this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.numColumns);
                for (int i7 = 0; i7 < this.numRows; i7++) {
                    for (int i8 = 0; i8 < this.numColumns; i8++) {
                        int i9 = 0;
                        while (i9 < i2) {
                            int[] iArr = this.matrix[i7];
                            iArr[i8] = (((-1) - (((-1) - bArr[i6]) | ((-1) - 255))) << i9) ^ iArr[i8];
                            i9 += 8;
                            i6++;
                        }
                        if (!this.field.isElementOfThisField(this.matrix[i7][i8])) {
                            throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
                        }
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException(" Error: given array is not encoded matrix over GF(2^m)");
    }

    protected GF2mMatrix(GF2mField gF2mField, int[][] iArr) {
        this.field = gF2mField;
        this.matrix = iArr;
        this.numRows = iArr.length;
        this.numColumns = iArr[0].length;
    }

    public GF2mMatrix(GF2mMatrix gF2mMatrix) {
        this.numRows = gF2mMatrix.numRows;
        this.numColumns = gF2mMatrix.numColumns;
        this.field = gF2mMatrix.field;
        this.matrix = new int[this.numRows][];
        for (int i2 = 0; i2 < this.numRows; i2++) {
            this.matrix[i2] = IntUtils.clone(gF2mMatrix.matrix[i2]);
        }
    }

    private void addToRow(int[] iArr, int[] iArr2) {
        for (int length = iArr2.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.add(iArr[length], iArr2[length]);
        }
    }

    private int[] multRowWithElement(int[] iArr, int i2) {
        int[] iArr2 = new int[iArr.length];
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr2[length] = this.field.mult(iArr[length], i2);
        }
        return iArr2;
    }

    private void multRowWithElementThis(int[] iArr, int i2) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = this.field.mult(iArr[length], i2);
        }
    }

    private static void swapColumns(int[][] iArr, int i2, int i3) {
        int[] iArr2 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = iArr2;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        int i2;
        if (this.numRows != this.numColumns) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.numRows);
        for (int i3 = this.numRows - 1; i3 >= 0; i3--) {
            iArr[i3] = IntUtils.clone(this.matrix[i3]);
        }
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.numRows);
        for (int i4 = this.numRows - 1; i4 >= 0; i4--) {
            iArr2[i4][i4] = 1;
        }
        for (int i5 = 0; i5 < this.numRows; i5++) {
            if (iArr[i5][i5] == 0) {
                int i6 = i5 + 1;
                boolean z2 = false;
                while (i6 < this.numRows) {
                    if (iArr[i6][i5] != 0) {
                        swapColumns(iArr, i5, i6);
                        swapColumns(iArr2, i5, i6);
                        i6 = this.numRows;
                        z2 = true;
                    }
                    i6++;
                }
                if (!z2) {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            int iInverse = this.field.inverse(iArr[i5][i5]);
            multRowWithElementThis(iArr[i5], iInverse);
            multRowWithElementThis(iArr2[i5], iInverse);
            for (int i7 = 0; i7 < this.numRows; i7++) {
                if (i7 != i5 && (i2 = iArr[i7][i5]) != 0) {
                    int[] iArrMultRowWithElement = multRowWithElement(iArr[i5], i2);
                    int[] iArrMultRowWithElement2 = multRowWithElement(iArr2[i5], i2);
                    addToRow(iArrMultRowWithElement, iArr[i7]);
                    addToRow(iArrMultRowWithElement2, iArr2[i7]);
                }
            }
        }
        return new GF2mMatrix(this.field, iArr2);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mMatrix)) {
            GF2mMatrix gF2mMatrix = (GF2mMatrix) obj;
            if (this.field.equals(gF2mMatrix.field) && gF2mMatrix.numRows == this.numColumns && gF2mMatrix.numColumns == this.numColumns) {
                for (int i2 = 0; i2 < this.numRows; i2++) {
                    for (int i3 = 0; i3 < this.numColumns; i3++) {
                        if (this.matrix[i2][i3] != gF2mMatrix.matrix[i2][i3]) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i2 = 8;
        int i3 = 1;
        while (this.field.getDegree() > i2) {
            i3++;
            i2 += 8;
        }
        int i4 = 4;
        byte[] bArr = new byte[(this.numRows * this.numColumns * i3) + 4];
        int i5 = this.numRows;
        bArr[0] = (byte) ((i5 + 255) - (i5 | 255));
        int i6 = this.numRows >>> 8;
        bArr[1] = (byte) ((i6 + 255) - (i6 | 255));
        bArr[2] = (byte) ((this.numRows >>> 16) & 255);
        bArr[3] = (byte) ((this.numRows >>> 24) & 255);
        for (int i7 = 0; i7 < this.numRows; i7++) {
            for (int i8 = 0; i8 < this.numColumns; i8++) {
                int i9 = 0;
                while (i9 < i2) {
                    bArr[i4] = (byte) (this.matrix[i7][i8] >>> i9);
                    i9 += 8;
                    i4++;
                }
            }
        }
        return bArr;
    }

    public int hashCode() {
        int iHashCode = (((this.field.hashCode() * 31) + this.numRows) * 31) + this.numColumns;
        for (int i2 = 0; i2 < this.numRows; i2++) {
            for (int i3 = 0; i3 < this.numColumns; i3++) {
                iHashCode = (iHashCode * 31) + this.matrix[i2][i3];
            }
        }
        return iHashCode;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i2 = 0; i2 < this.numRows; i2++) {
            for (int i3 = 0; i3 < this.numColumns; i3++) {
                if (this.matrix[i2][i3] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        throw new RuntimeException("Not implemented.");
    }

    @Override // org.spongycastle.pqc.math.linearalgebra.Matrix
    public String toString() {
        String str = this.numRows + " x " + this.numColumns + " Matrix over " + this.field.toString() + ": \n";
        for (int i2 = 0; i2 < this.numRows; i2++) {
            for (int i3 = 0; i3 < this.numColumns; i3++) {
                str = str + this.field.elementToStr(this.matrix[i2][i3]) + " : ";
            }
            str = str + "\n";
        }
        return str;
    }
}
