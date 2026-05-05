package org.bouncycastle.pqc.math.linearalgebra;

import cz.msebera.android.httpclient.message.TokenParser;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;
import yg.C1580rY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class GF2Matrix extends Matrix {
    private int length;
    private int[][] matrix;

    public GF2Matrix(int i2, char c2) throws Throwable {
        short sXd = (short) (C1580rY.Xd() ^ (-14832));
        int[] iArr = new int["SKaM\u001baTSfd\\hn$J]\\omaO_mdpo".length()];
        QB qb = new QB("SKaM\u001baTSfd\\hn$J]\\omaO_mdpo");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(new String(iArr, 0, i3)).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            this(i2, c2, (SecureRandom) constructor.newInstance(objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public GF2Matrix(int i2, char c2, SecureRandom secureRandom) {
        if (i2 <= 0) {
            throw new ArithmeticException("Size of matrix is non-positive.");
        }
        if (c2 == 'I') {
            assignUnitMatrix(i2);
            return;
        }
        if (c2 == 'L') {
            assignRandomLowerTriangularMatrix(i2, secureRandom);
            return;
        }
        if (c2 == 'R') {
            assignRandomRegularMatrix(i2, secureRandom);
        } else if (c2 == 'U') {
            assignRandomUpperTriangularMatrix(i2, secureRandom);
        } else {
            if (c2 != 'Z') {
                throw new ArithmeticException("Unknown matrix type.");
            }
            assignZeroMatrix(i2, i2);
        }
    }

    private GF2Matrix(int i2, int i3) {
        if (i3 <= 0 || i2 <= 0) {
            throw new ArithmeticException("size of matrix is non-positive");
        }
        assignZeroMatrix(i2, i3);
    }

    public GF2Matrix(int i2, int[][] iArr) {
        if (iArr[0].length != ((i2 + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.numColumns = i2;
        this.numRows = iArr.length;
        this.length = iArr[0].length;
        int i3 = i2 & 31;
        int i4 = i3 == 0 ? -1 : (1 << i3) - 1;
        for (int i5 = 0; i5 < this.numRows; i5++) {
            int[] iArr2 = iArr[i5];
            int i6 = this.length - 1;
            iArr2[i6] = (-1) - (((-1) - iArr2[i6]) | ((-1) - i4));
        }
        this.matrix = iArr;
    }

    public GF2Matrix(GF2Matrix gF2Matrix) {
        this.numColumns = gF2Matrix.getNumColumns();
        this.numRows = gF2Matrix.getNumRows();
        this.length = gF2Matrix.length;
        this.matrix = new int[gF2Matrix.matrix.length][];
        int i2 = 0;
        while (true) {
            int[][] iArr = this.matrix;
            if (i2 >= iArr.length) {
                return;
            }
            iArr[i2] = IntUtils.clone(gF2Matrix.matrix[i2]);
            i2++;
        }
    }

    public GF2Matrix(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.numRows = LittleEndianConversions.OS2IP(bArr, 0);
        this.numColumns = LittleEndianConversions.OS2IP(bArr, 4);
        int i2 = ((this.numColumns + 7) >>> 3) * this.numRows;
        if (this.numRows > 0) {
            int i3 = 8;
            if (i2 == bArr.length - 8) {
                this.length = (this.numColumns + 31) >>> 5;
                this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.length);
                int i4 = this.numColumns >> 5;
                int i5 = this.numColumns;
                int i6 = (i5 + 31) - (i5 | 31);
                for (int i7 = 0; i7 < this.numRows; i7++) {
                    int i8 = 0;
                    while (i8 < i4) {
                        this.matrix[i7][i8] = LittleEndianConversions.OS2IP(bArr, i3);
                        i8++;
                        i3 += 4;
                    }
                    int i9 = 0;
                    while (i9 < i6) {
                        int[] iArr = this.matrix[i7];
                        int i10 = iArr[i4];
                        byte b2 = bArr[i3];
                        iArr[i4] = (((b2 + 255) - (b2 | 255)) << i9) ^ i10;
                        i9 += 8;
                        i3++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    private static void addToRow(int[] iArr, int[] iArr2, int i2) {
        for (int length = iArr2.length - 1; length >= i2; length--) {
            iArr2[length] = iArr[length] ^ iArr2[length];
        }
    }

    private void assignRandomLowerTriangularMatrix(int i2, SecureRandom secureRandom) {
        this.numRows = i2;
        this.numColumns = i2;
        this.length = (i2 + 31) >>> 5;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.length);
        for (int i3 = 0; i3 < this.numRows; i3++) {
            int i4 = i3 >>> 5;
            int i5 = 31 & i3;
            int i6 = 31 - i5;
            int i7 = 1 << i5;
            for (int i8 = 0; i8 < i4; i8++) {
                this.matrix[i3][i8] = secureRandom.nextInt();
            }
            this.matrix[i3][i4] = (-1) - (((-1) - i7) & ((-1) - (secureRandom.nextInt() >>> i6)));
            while (true) {
                i4++;
                if (i4 < this.length) {
                    this.matrix[i3][i4] = 0;
                }
            }
        }
    }

    private void assignRandomRegularMatrix(int i2, SecureRandom secureRandom) {
        this.numRows = i2;
        this.numColumns = i2;
        this.length = (i2 + 31) >>> 5;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.length);
        GF2Matrix gF2Matrix = (GF2Matrix) new GF2Matrix(i2, 'L', secureRandom).rightMultiply(new GF2Matrix(i2, 'U', secureRandom));
        int[] vector = new Permutation(i2, secureRandom).getVector();
        for (int i3 = 0; i3 < i2; i3++) {
            System.arraycopy(gF2Matrix.matrix[i3], 0, this.matrix[vector[i3]], 0, this.length);
        }
    }

    private void assignRandomUpperTriangularMatrix(int i2, SecureRandom secureRandom) {
        int i3;
        this.numRows = i2;
        this.numColumns = i2;
        this.length = (i2 + 31) >>> 5;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.length);
        int i4 = (i2 + 31) - (i2 | 31);
        int i5 = i4 == 0 ? -1 : (1 << i4) - 1;
        for (int i6 = 0; i6 < this.numRows; i6++) {
            int i7 = i6 >>> 5;
            int i8 = i6 & 31;
            for (int i9 = 0; i9 < i7; i9++) {
                this.matrix[i6][i9] = 0;
            }
            this.matrix[i6][i7] = ((-1) - (((-1) - secureRandom.nextInt()) & ((-1) - 1))) << i8;
            while (true) {
                i7++;
                i3 = this.length;
                if (i7 < i3) {
                    this.matrix[i6][i7] = secureRandom.nextInt();
                }
            }
            int[] iArr = this.matrix[i6];
            int i10 = i3 - 1;
            iArr[i10] = iArr[i10] & i5;
        }
    }

    private void assignUnitMatrix(int i2) {
        this.numRows = i2;
        this.numColumns = i2;
        this.length = (i2 + 31) >>> 5;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.length);
        for (int i3 = 0; i3 < this.numRows; i3++) {
            for (int i4 = 0; i4 < this.length; i4++) {
                this.matrix[i3][i4] = 0;
            }
        }
        for (int i5 = 0; i5 < this.numRows; i5++) {
            this.matrix[i5][i5 >>> 5] = 1 << (i5 & 31);
        }
    }

    private void assignZeroMatrix(int i2, int i3) {
        this.numRows = i2;
        this.numColumns = i3;
        this.length = (i3 + 31) >>> 5;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.length);
        for (int i4 = 0; i4 < this.numRows; i4++) {
            for (int i5 = 0; i5 < this.length; i5++) {
                this.matrix[i4][i5] = 0;
            }
        }
    }

    public static GF2Matrix[] createRandomRegularMatrixAndItsInverse(int i2, SecureRandom secureRandom) {
        int i3 = (i2 + 31) >> 5;
        GF2Matrix gF2Matrix = new GF2Matrix(i2, 'L', secureRandom);
        GF2Matrix gF2Matrix2 = new GF2Matrix(i2, 'U', secureRandom);
        GF2Matrix gF2Matrix3 = (GF2Matrix) gF2Matrix.rightMultiply(gF2Matrix2);
        Permutation permutation = new Permutation(i2, secureRandom);
        int[] vector = permutation.getVector();
        int i4 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2, i3);
        for (int i5 = 0; i5 < i2; i5++) {
            System.arraycopy(gF2Matrix3.matrix[vector[i5]], 0, iArr[i5], 0, i3);
        }
        GF2Matrix gF2Matrix4 = new GF2Matrix(i2, iArr);
        GF2Matrix gF2Matrix5 = new GF2Matrix(i2, 'I');
        int i6 = 0;
        while (i6 < i2) {
            int i7 = i6 >>> 5;
            int i8 = 1 << ((-1) - (((-1) - i6) | ((-1) - 31)));
            int i9 = i6 + 1;
            int i10 = i9;
            while (i10 < i2) {
                int i11 = gF2Matrix.matrix[i10][i7];
                if ((i11 + i8) - (i11 | i8) != 0) {
                    while (i4 <= i7) {
                        int[][] iArr2 = gF2Matrix5.matrix;
                        int[] iArr3 = iArr2[i10];
                        iArr3[i4] = iArr3[i4] ^ iArr2[i6][i4];
                        i4++;
                    }
                }
                i10++;
                i4 = 0;
            }
            i6 = i9;
        }
        GF2Matrix gF2Matrix6 = new GF2Matrix(i2, 'I');
        for (int i12 = i2 - 1; i12 >= 0; i12--) {
            int i13 = i12 >>> 5;
            int i14 = 1 << (31 & i12);
            for (int i15 = i12 - 1; i15 >= 0; i15--) {
                if ((gF2Matrix2.matrix[i15][i13] & i14) != 0) {
                    for (int i16 = i13; i16 < i3; i16++) {
                        int[][] iArr4 = gF2Matrix6.matrix;
                        int[] iArr5 = iArr4[i15];
                        iArr5[i16] = iArr4[i12][i16] ^ iArr5[i16];
                    }
                }
            }
        }
        return new GF2Matrix[]{gF2Matrix4, (GF2Matrix) gF2Matrix6.rightMultiply(gF2Matrix5.rightMultiply(permutation))};
    }

    private static void swapRows(int[][] iArr, int i2, int i3) {
        int[] iArr2 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = iArr2;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix computeInverse() {
        if (this.numRows != this.numColumns) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.length);
        for (int i2 = this.numRows - 1; i2 >= 0; i2--) {
            iArr[i2] = IntUtils.clone(this.matrix[i2]);
        }
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.length);
        for (int i3 = this.numRows - 1; i3 >= 0; i3--) {
            iArr2[i3][i3 >> 5] = 1 << (31 & i3);
        }
        for (int i4 = 0; i4 < this.numRows; i4++) {
            int i5 = i4 >> 5;
            int i6 = 1 << ((i4 + 31) - (31 | i4));
            if ((iArr[i4][i5] & i6) == 0) {
                int i7 = i4 + 1;
                boolean z2 = false;
                while (i7 < this.numRows) {
                    if ((iArr[i7][i5] & i6) != 0) {
                        swapRows(iArr, i4, i7);
                        swapRows(iArr2, i4, i7);
                        i7 = this.numRows;
                        z2 = true;
                    }
                    i7++;
                }
                if (!z2) {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            for (int i8 = this.numRows - 1; i8 >= 0; i8--) {
                if (i8 != i4) {
                    int[] iArr3 = iArr[i8];
                    if ((iArr3[i5] & i6) != 0) {
                        addToRow(iArr[i4], iArr3, i5);
                        addToRow(iArr2[i4], iArr2[i8], 0);
                    }
                }
            }
        }
        return new GF2Matrix(this.numColumns, iArr2);
    }

    public Matrix computeTranspose() {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numColumns, (this.numRows + 31) >>> 5);
        for (int i2 = 0; i2 < this.numRows; i2++) {
            for (int i3 = 0; i3 < this.numColumns; i3++) {
                int i4 = i2 >>> 5;
                int i5 = (-1) - (((-1) - i2) | ((-1) - 31));
                if ((-1) - (((-1) - (this.matrix[i2][i3 >>> 5] >>> ((i3 + 31) - (31 | i3)))) | ((-1) - 1)) == 1) {
                    int[] iArr2 = iArr[i3];
                    iArr2[i4] = (-1) - (((-1) - (1 << i5)) & ((-1) - iArr2[i4]));
                }
            }
        }
        return new GF2Matrix(this.numRows, iArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GF2Matrix)) {
            return false;
        }
        GF2Matrix gF2Matrix = (GF2Matrix) obj;
        if (this.numRows != gF2Matrix.numRows || this.numColumns != gF2Matrix.numColumns || this.length != gF2Matrix.length) {
            return false;
        }
        for (int i2 = 0; i2 < this.numRows; i2++) {
            if (!IntUtils.equals(this.matrix[i2], gF2Matrix.matrix[i2])) {
                return false;
            }
        }
        return true;
    }

    public GF2Matrix extendLeftCompactForm() {
        GF2Matrix gF2Matrix = new GF2Matrix(this.numRows, this.numColumns + this.numRows);
        int i2 = (this.numRows - 1) + this.numColumns;
        int i3 = this.numRows - 1;
        while (i3 >= 0) {
            System.arraycopy(this.matrix[i3], 0, gF2Matrix.matrix[i3], 0, this.length);
            int[] iArr = gF2Matrix.matrix[i3];
            int i4 = i2 >> 5;
            iArr[i4] = (-1) - (((-1) - iArr[i4]) & ((-1) - (1 << (31 & i2))));
            i3--;
            i2--;
        }
        return gF2Matrix;
    }

    public GF2Matrix extendRightCompactForm() {
        int i2;
        GF2Matrix gF2Matrix = new GF2Matrix(this.numRows, this.numRows + this.numColumns);
        int i3 = this.numRows >> 5;
        int i4 = this.numRows & 31;
        for (int i5 = this.numRows - 1; i5 >= 0; i5--) {
            int[] iArr = gF2Matrix.matrix[i5];
            int i6 = i5 >> 5;
            iArr[i6] = (-1) - (((-1) - iArr[i6]) & ((-1) - (1 << (31 & i5))));
            int i7 = 0;
            if (i4 != 0) {
                int i8 = i3;
                while (true) {
                    i2 = this.length;
                    if (i7 >= i2 - 1) {
                        break;
                    }
                    int i9 = this.matrix[i5][i7];
                    int[] iArr2 = gF2Matrix.matrix[i5];
                    int i10 = i8 + 1;
                    iArr2[i8] = (-1) - (((-1) - iArr2[i8]) & ((-1) - (i9 << i4)));
                    iArr2[i10] = (-1) - (((-1) - iArr2[i10]) & ((-1) - (i9 >>> (32 - i4))));
                    i7++;
                    i8 = i10;
                }
                int i11 = this.matrix[i5][i2 - 1];
                int[] iArr3 = gF2Matrix.matrix[i5];
                int i12 = i8 + 1;
                int i13 = iArr3[i8];
                int i14 = i11 << i4;
                iArr3[i8] = (i13 + i14) - (i13 & i14);
                if (i12 < gF2Matrix.length) {
                    iArr3[i12] = iArr3[i12] | (i11 >>> (32 - i4));
                }
            } else {
                System.arraycopy(this.matrix[i5], 0, iArr, i3, this.length);
            }
        }
        return gF2Matrix;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i2 = 8;
        byte[] bArr = new byte[(((this.numColumns + 7) >>> 3) * this.numRows) + 8];
        LittleEndianConversions.I2OSP(this.numRows, bArr, 0);
        LittleEndianConversions.I2OSP(this.numColumns, bArr, 4);
        int i3 = this.numColumns >>> 5;
        int i4 = this.numColumns;
        int i5 = (i4 + 31) - (i4 | 31);
        for (int i6 = 0; i6 < this.numRows; i6++) {
            int i7 = 0;
            while (i7 < i3) {
                LittleEndianConversions.I2OSP(this.matrix[i6][i7], bArr, i2);
                i7++;
                i2 += 4;
            }
            int i8 = 0;
            while (i8 < i5) {
                bArr[i2] = (byte) ((-1) - (((-1) - (this.matrix[i6][i3] >>> i8)) | ((-1) - 255)));
                i8 += 8;
                i2++;
            }
        }
        return bArr;
    }

    public double getHammingWeight() {
        int i2 = (-1) - (((-1) - this.numColumns) | ((-1) - 31));
        int i3 = this.length;
        if (i2 != 0) {
            i3--;
        }
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (int i4 = 0; i4 < this.numRows; i4++) {
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.matrix[i4][i5];
                for (int i7 = 0; i7 < 32; i7++) {
                    int i8 = i6 >>> i7;
                    d2 += (double) ((i8 + 1) - (i8 | 1));
                    d3 += 1.0d;
                }
            }
            int i9 = this.matrix[i4][this.length - 1];
            for (int i10 = 0; i10 < i2; i10++) {
                d2 += (double) ((-1) - (((-1) - (i9 >>> i10)) | ((-1) - 1)));
                d3 += 1.0d;
            }
        }
        return d2 / d3;
    }

    public int[][] getIntArray() {
        return this.matrix;
    }

    public GF2Matrix getLeftSubMatrix() {
        if (this.numColumns <= this.numRows) {
            throw new ArithmeticException("empty submatrix");
        }
        int i2 = (this.numRows + 31) >> 5;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, i2);
        int i3 = (1 << ((-1) - (((-1) - this.numRows) | ((-1) - 31)))) - 1;
        if (i3 == 0) {
            i3 = -1;
        }
        for (int i4 = this.numRows - 1; i4 >= 0; i4--) {
            System.arraycopy(this.matrix[i4], 0, iArr[i4], 0, i2);
            int[] iArr2 = iArr[i4];
            int i5 = i2 - 1;
            iArr2[i5] = iArr2[i5] & i3;
        }
        return new GF2Matrix(this.numRows, iArr);
    }

    public int getLength() {
        return this.length;
    }

    public GF2Matrix getRightSubMatrix() {
        int i2;
        if (this.numColumns <= this.numRows) {
            throw new ArithmeticException("empty submatrix");
        }
        int i3 = this.numRows >> 5;
        int i4 = (-1) - (((-1) - this.numRows) | ((-1) - 31));
        GF2Matrix gF2Matrix = new GF2Matrix(this.numRows, this.numColumns - this.numRows);
        for (int i5 = this.numRows - 1; i5 >= 0; i5--) {
            int i6 = 0;
            if (i4 != 0) {
                int i7 = i3;
                while (true) {
                    i2 = gF2Matrix.length;
                    if (i6 >= i2 - 1) {
                        break;
                    }
                    int[] iArr = gF2Matrix.matrix[i5];
                    int[] iArr2 = this.matrix[i5];
                    int i8 = i7 + 1;
                    iArr[i6] = (-1) - (((-1) - (iArr2[i7] >>> i4)) & ((-1) - (iArr2[i8] << (32 - i4))));
                    i6++;
                    i7 = i8;
                }
                int[] iArr3 = gF2Matrix.matrix[i5];
                int[] iArr4 = this.matrix[i5];
                int i9 = i7 + 1;
                iArr3[i2 - 1] = iArr4[i7] >>> i4;
                if (i9 < this.length) {
                    int i10 = i2 - 1;
                    iArr3[i10] = (-1) - (((-1) - iArr3[i10]) & ((-1) - (iArr4[i9] << (32 - i4))));
                }
            } else {
                System.arraycopy(this.matrix[i5], i3, gF2Matrix.matrix[i5], 0, gF2Matrix.length);
            }
        }
        return gF2Matrix;
    }

    public int[] getRow(int i2) {
        return this.matrix[i2];
    }

    public int hashCode() {
        int iHashCode = (((this.numRows * 31) + this.numColumns) * 31) + this.length;
        for (int i2 = 0; i2 < this.numRows; i2++) {
            iHashCode = (iHashCode * 31) + this.matrix[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i2 = 0; i2 < this.numRows; i2++) {
            for (int i3 = 0; i3 < this.length; i3++) {
                if (this.matrix[i2][i3] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public Matrix leftMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        if (vector.length != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[][] iArr = new int[this.numRows][];
        for (int i2 = this.numRows - 1; i2 >= 0; i2--) {
            iArr[i2] = IntUtils.clone(this.matrix[vector[i2]]);
        }
        return new GF2Matrix(this.numRows, iArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector leftMultiply(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[this.length];
        int i2 = this.numRows >> 5;
        int i3 = this.numRows;
        int i4 = 1 << ((i3 + 31) - (i3 | 31));
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = 1;
            do {
                int i8 = vecArray[i6];
                if ((i8 + i7) - (i8 | i7) != 0) {
                    for (int i9 = 0; i9 < this.length; i9++) {
                        iArr[i9] = iArr[i9] ^ this.matrix[i5][i9];
                    }
                }
                i5++;
                i7 <<= 1;
            } while (i7 != 0);
        }
        for (int i10 = 1; i10 != i4; i10 <<= 1) {
            int i11 = vecArray[i2];
            if ((i11 + i10) - (i11 | i10) != 0) {
                for (int i12 = 0; i12 < this.length; i12++) {
                    iArr[i12] = iArr[i12] ^ this.matrix[i5][i12];
                }
            }
            i5++;
        }
        return new GF2Vector(iArr, this.numColumns);
    }

    public Vector leftMultiplyLeftCompactForm(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[((this.numRows + this.numColumns) + 31) >>> 5];
        int i2 = this.numRows >>> 5;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = 1;
            do {
                int i6 = vecArray[i4];
                if ((i6 + i5) - (i6 | i5) != 0) {
                    for (int i7 = 0; i7 < this.length; i7++) {
                        iArr[i7] = iArr[i7] ^ this.matrix[i3][i7];
                    }
                    int i8 = (this.numColumns + i3) >>> 5;
                    int i9 = (-1) - (((-1) - (this.numColumns + i3)) | ((-1) - 31));
                    int i10 = iArr[i8];
                    int i11 = 1 << i9;
                    iArr[i8] = (i11 + i10) - (i11 & i10);
                }
                i3++;
                i5 <<= 1;
            } while (i5 != 0);
        }
        int i12 = 1 << ((-1) - (((-1) - this.numRows) | ((-1) - 31)));
        for (int i13 = 1; i13 != i12; i13 <<= 1) {
            if ((-1) - (((-1) - vecArray[i2]) | ((-1) - i13)) != 0) {
                for (int i14 = 0; i14 < this.length; i14++) {
                    iArr[i14] = iArr[i14] ^ this.matrix[i3][i14];
                }
                int i15 = (this.numColumns + i3) >>> 5;
                int i16 = (this.numColumns + i3) & 31;
                int i17 = iArr[i15];
                int i18 = 1 << i16;
                iArr[i15] = (i18 + i17) - (i18 & i17);
            }
            i3++;
        }
        return new GF2Vector(iArr, this.numRows + this.numColumns);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Matrix matrix) {
        if (!(matrix instanceof GF2Matrix)) {
            throw new ArithmeticException("matrix is not defined over GF(2)");
        }
        if (matrix.numRows != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        GF2Matrix gF2Matrix = (GF2Matrix) matrix;
        GF2Matrix gF2Matrix2 = new GF2Matrix(this.numRows, matrix.numColumns);
        int i2 = (-1) - (((-1) - this.numColumns) | ((-1) - 31));
        int i3 = this.length;
        if (i2 != 0) {
            i3--;
        }
        for (int i4 = 0; i4 < this.numRows; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = this.matrix[i4][i6];
                for (int i8 = 0; i8 < 32; i8++) {
                    if (((1 << i8) & i7) != 0) {
                        for (int i9 = 0; i9 < gF2Matrix.length; i9++) {
                            int[] iArr = gF2Matrix2.matrix[i4];
                            iArr[i9] = iArr[i9] ^ gF2Matrix.matrix[i5][i9];
                        }
                    }
                    i5++;
                }
            }
            int i10 = this.matrix[i4][this.length - 1];
            for (int i11 = 0; i11 < i2; i11++) {
                if ((-1) - (((-1) - (1 << i11)) | ((-1) - i10)) != 0) {
                    for (int i12 = 0; i12 < gF2Matrix.length; i12++) {
                        int[] iArr2 = gF2Matrix2.matrix[i4];
                        iArr2[i12] = iArr2[i12] ^ gF2Matrix.matrix[i5][i12];
                    }
                }
                i5++;
            }
        }
        return gF2Matrix2;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Matrix rightMultiply(Permutation permutation) {
        int[] vector = permutation.getVector();
        if (vector.length != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        GF2Matrix gF2Matrix = new GF2Matrix(this.numRows, this.numColumns);
        for (int i2 = this.numColumns - 1; i2 >= 0; i2--) {
            int i3 = i2 >>> 5;
            int i4 = i2 & 31;
            int i5 = vector[i2];
            int i6 = i5 >>> 5;
            int i7 = i5 & 31;
            for (int i8 = this.numRows - 1; i8 >= 0; i8--) {
                int[] iArr = gF2Matrix.matrix[i8];
                int i9 = iArr[i3];
                int i10 = this.matrix[i8][i6] >>> i7;
                int i11 = ((i10 + 1) - (i10 | 1)) << i4;
                iArr[i3] = (i9 + i11) - (i9 & i11);
            }
        }
        return gF2Matrix;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public Vector rightMultiply(Vector vector) {
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[(this.numRows + 31) >>> 5];
        for (int i2 = 0; i2 < this.numRows; i2++) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.length; i4++) {
                i3 ^= this.matrix[i2][i4] & vecArray[i4];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < 32; i6++) {
                i5 ^= (-1) - (((-1) - (i3 >>> i6)) | ((-1) - 1));
            }
            if (i5 == 1) {
                int i7 = i2 >>> 5;
                iArr[i7] = (-1) - (((-1) - iArr[i7]) & ((-1) - (1 << (31 & i2))));
            }
        }
        return new GF2Vector(iArr, this.numRows);
    }

    public Vector rightMultiplyRightCompactForm(Vector vector) {
        int i2;
        if (!(vector instanceof GF2Vector)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numColumns + this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((GF2Vector) vector).getVecArray();
        int[] iArr = new int[(this.numRows + 31) >>> 5];
        int i3 = this.numRows >> 5;
        int i4 = this.numRows & 31;
        for (int i5 = 0; i5 < this.numRows; i5++) {
            int i6 = i5 >> 5;
            int i7 = i5 & 31;
            int i8 = (vecArray[i6] >>> i7) & 1;
            int i9 = i3;
            int i10 = 0;
            if (i4 != 0) {
                while (true) {
                    i2 = this.length;
                    if (i10 >= i2 - 1) {
                        break;
                    }
                    int i11 = i9 + 1;
                    int i12 = vecArray[i9] >>> i4;
                    int i13 = vecArray[i11] << (32 - i4);
                    i8 ^= ((i12 + i13) - (i12 & i13)) & this.matrix[i5][i10];
                    i10++;
                    i9 = i11;
                }
                int i14 = i9 + 1;
                int i15 = vecArray[i9] >>> i4;
                if (i14 < vecArray.length) {
                    i15 = (-1) - (((-1) - i15) & ((-1) - (vecArray[i14] << (32 - i4))));
                }
                i8 ^= (-1) - (((-1) - this.matrix[i5][i2 - 1]) | ((-1) - i15));
            } else {
                while (i10 < this.length) {
                    i8 ^= vecArray[i9] & this.matrix[i5][i10];
                    i10++;
                    i9++;
                }
            }
            int i16 = 0;
            for (int i17 = 0; i17 < 32; i17++) {
                i16 ^= (i8 + 1) - (1 | i8);
                i8 >>>= 1;
            }
            if (i16 == 1) {
                int i18 = iArr[i6];
                int i19 = 1 << i7;
                iArr[i6] = (i18 + i19) - (i18 & i19);
            }
        }
        return new GF2Vector(iArr, this.numRows);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public String toString() {
        int i2 = (-1) - (((-1) - this.numColumns) | ((-1) - 31));
        int i3 = this.length;
        if (i2 != 0) {
            i3--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < this.numRows; i4++) {
            stringBuffer.append(i4 + ": ");
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.matrix[i4][i5];
                for (int i7 = 0; i7 < 32; i7++) {
                    if (((i6 >>> i7) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(TokenParser.SP);
            }
            int i8 = this.matrix[i4][this.length - 1];
            for (int i9 = 0; i9 < i2; i9++) {
                if ((-1) - (((-1) - (i8 >>> i9)) | ((-1) - 1)) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}
