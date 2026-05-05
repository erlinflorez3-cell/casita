package org.spongycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class GoppaCode {

    public static class MaMaPe {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private GF2Matrix f28197h;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Permutation f28198p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private GF2Matrix f28199s;

        public MaMaPe(GF2Matrix gF2Matrix, GF2Matrix gF2Matrix2, Permutation permutation) {
            this.f28199s = gF2Matrix;
            this.f28197h = gF2Matrix2;
            this.f28198p = permutation;
        }

        public GF2Matrix getFirstMatrix() {
            return this.f28199s;
        }

        public Permutation getPermutation() {
            return this.f28198p;
        }

        public GF2Matrix getSecondMatrix() {
            return this.f28197h;
        }
    }

    public static class MatrixSet {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private GF2Matrix f28200g;
        private int[] setJ;

        public MatrixSet(GF2Matrix gF2Matrix, int[] iArr) {
            this.f28200g = gF2Matrix;
            this.setJ = iArr;
        }

        public GF2Matrix getG() {
            return this.f28200g;
        }

        public int[] getSetJ() {
            return this.setJ;
        }
    }

    private GoppaCode() {
    }

    public static MaMaPe computeSystematicForm(GF2Matrix gF2Matrix, SecureRandom secureRandom) {
        boolean z2;
        GF2Matrix gF2Matrix2;
        int numColumns = gF2Matrix.getNumColumns();
        GF2Matrix gF2Matrix3 = null;
        while (true) {
            Permutation permutation = new Permutation(numColumns, secureRandom);
            GF2Matrix gF2Matrix4 = (GF2Matrix) gF2Matrix.rightMultiply(permutation);
            GF2Matrix leftSubMatrix = gF2Matrix4.getLeftSubMatrix();
            try {
                gF2Matrix2 = (GF2Matrix) leftSubMatrix.computeInverse();
                z2 = true;
            } catch (ArithmeticException unused) {
                z2 = false;
                gF2Matrix2 = gF2Matrix3;
            }
            if (z2) {
                return new MaMaPe(leftSubMatrix, ((GF2Matrix) gF2Matrix2.rightMultiply(gF2Matrix4)).getRightSubMatrix(), permutation);
            }
            gF2Matrix3 = gF2Matrix2;
        }
    }

    public static GF2Matrix createCanonicalCheckMatrix(GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int degree = gF2mField.getDegree();
        int i2 = 1 << degree;
        int degree2 = polynomialGF2mSmallM.getDegree();
        int i3 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, degree2, i2);
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, degree2, i2);
        for (int i4 = 0; i4 < i2; i4++) {
            iArr2[0][i4] = gF2mField.inverse(polynomialGF2mSmallM.evaluateAt(i4));
        }
        for (int i5 = 1; i5 < degree2; i5++) {
            for (int i6 = 0; i6 < i2; i6++) {
                iArr2[i5][i6] = gF2mField.mult(iArr2[i5 - 1][i6], i6);
            }
        }
        int i7 = 0;
        while (i7 < degree2) {
            int i8 = i3;
            while (i8 < i2) {
                while (i3 <= i7) {
                    int[] iArr3 = iArr[i7];
                    iArr3[i8] = gF2mField.add(iArr3[i8], gF2mField.mult(iArr2[i3][i8], polynomialGF2mSmallM.getCoefficient((degree2 + i3) - i7)));
                    i3++;
                }
                i8++;
                i3 = 0;
            }
            i7++;
            i3 = 0;
        }
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, degree2 * degree, (i2 + 31) >>> 5);
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i9 >>> 5;
            int i11 = 1 << ((-1) - (((-1) - i9) | ((-1) - 31)));
            for (int i12 = 0; i12 < degree2; i12++) {
                int i13 = iArr[i12][i9];
                for (int i14 = 0; i14 < degree; i14++) {
                    if (((i13 >>> i14) & 1) != 0) {
                        int[] iArr5 = iArr4[(((i12 + 1) * degree) - i14) - 1];
                        iArr5[i10] = iArr5[i10] ^ i11;
                    }
                }
            }
        }
        return new GF2Matrix(i2, iArr4);
    }

    public static GF2Vector syndromeDecode(GF2Vector gF2Vector, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int degree = 1 << gF2mField.getDegree();
        GF2Vector gF2Vector2 = new GF2Vector(degree);
        if (!gF2Vector.isZero()) {
            PolynomialGF2mSmallM[] polynomialGF2mSmallMArrModPolynomialToFracton = new PolynomialGF2mSmallM(gF2Vector.toExtensionFieldVector(gF2mField)).modInverse(polynomialGF2mSmallM).addMonomial(1).modSquareRootMatrix(polynomialGF2mSmallMArr).modPolynomialToFracton(polynomialGF2mSmallM);
            PolynomialGF2mSmallM polynomialGF2mSmallM2 = polynomialGF2mSmallMArrModPolynomialToFracton[0];
            PolynomialGF2mSmallM polynomialGF2mSmallMMultiply = polynomialGF2mSmallM2.multiply(polynomialGF2mSmallM2);
            PolynomialGF2mSmallM polynomialGF2mSmallM3 = polynomialGF2mSmallMArrModPolynomialToFracton[1];
            PolynomialGF2mSmallM polynomialGF2mSmallMAdd = polynomialGF2mSmallMMultiply.add(polynomialGF2mSmallM3.multiply(polynomialGF2mSmallM3).multWithMonomial(1));
            PolynomialGF2mSmallM polynomialGF2mSmallMMultWithElement = polynomialGF2mSmallMAdd.multWithElement(gF2mField.inverse(polynomialGF2mSmallMAdd.getHeadCoefficient()));
            for (int i2 = 0; i2 < degree; i2++) {
                if (polynomialGF2mSmallMMultWithElement.evaluateAt(i2) == 0) {
                    gF2Vector2.setBit(i2);
                }
            }
        }
        return gF2Vector2;
    }
}
