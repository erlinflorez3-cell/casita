package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public class GF2nPolynomialField extends GF2nField {
    private boolean isPentanomial;
    private boolean isTrinomial;
    private int[] pc;
    GF2Polynomial[] squaringMatrix;
    private int tc;

    public GF2nPolynomialField(int i2, SecureRandom secureRandom) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.pc = new int[3];
        if (i2 < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i2;
        computeFieldPolynomial();
        computeSquaringMatrix();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    public GF2nPolynomialField(int i2, SecureRandom secureRandom, GF2Polynomial gF2Polynomial) throws RuntimeException {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.pc = new int[3];
        if (i2 < 3) {
            throw new IllegalArgumentException("degree must be at least 3");
        }
        if (gF2Polynomial.getLength() != i2 + 1) {
            throw new RuntimeException();
        }
        if (!gF2Polynomial.isIrreducible()) {
            throw new RuntimeException();
        }
        this.mDegree = i2;
        this.fieldPolynomial = gF2Polynomial;
        computeSquaringMatrix();
        int i3 = 2;
        for (int i4 = 1; i4 < this.fieldPolynomial.getLength() - 1; i4++) {
            if (this.fieldPolynomial.testBit(i4)) {
                int i5 = i3 + 1;
                if (i5 == 3) {
                    this.tc = i4;
                }
                if (i5 <= 5) {
                    this.pc[i3 - 2] = i4;
                }
                i3 = i5;
            }
        }
        if (i3 == 3) {
            this.isTrinomial = true;
        }
        if (i3 == 5) {
            this.isPentanomial = true;
        }
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    public GF2nPolynomialField(int i2, SecureRandom secureRandom, boolean z2) {
        super(secureRandom);
        this.isTrinomial = false;
        this.isPentanomial = false;
        this.pc = new int[3];
        if (i2 < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i2;
        if (z2) {
            computeFieldPolynomial();
        } else {
            computeFieldPolynomial2();
        }
        computeSquaringMatrix();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    private void computeSquaringMatrix() {
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[this.mDegree - 1];
        this.squaringMatrix = new GF2Polynomial[this.mDegree];
        int i2 = 0;
        while (true) {
            GF2Polynomial[] gF2PolynomialArr2 = this.squaringMatrix;
            if (i2 >= gF2PolynomialArr2.length) {
                break;
            }
            gF2PolynomialArr2[i2] = new GF2Polynomial(this.mDegree, "ZERO");
            i2++;
        }
        for (int i3 = 0; i3 < this.mDegree - 1; i3++) {
            gF2PolynomialArr[i3] = new GF2Polynomial(1, "ONE").shiftLeft(this.mDegree + i3).remainder(this.fieldPolynomial);
        }
        for (int i4 = 1; i4 <= Math.abs(this.mDegree >> 1); i4++) {
            for (int i5 = 1; i5 <= this.mDegree; i5++) {
                if (gF2PolynomialArr[this.mDegree - (i4 << 1)].testBit(this.mDegree - i5)) {
                    this.squaringMatrix[i5 - 1].setBit(this.mDegree - i4);
                }
            }
        }
        for (int iAbs = Math.abs(this.mDegree >> 1) + 1; iAbs <= this.mDegree; iAbs++) {
            this.squaringMatrix[((iAbs << 1) - this.mDegree) - 1].setBit(this.mDegree - iAbs);
        }
    }

    private boolean testPentanomials() {
        this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        boolean zIsIrreducible = false;
        int i2 = 1;
        while (i2 <= this.mDegree - 3 && !zIsIrreducible) {
            this.fieldPolynomial.setBit(i2);
            int i3 = i2 + 1;
            int i4 = i3;
            while (i4 <= this.mDegree - 2 && !zIsIrreducible) {
                this.fieldPolynomial.setBit(i4);
                int i5 = i4 + 1;
                for (int i6 = i5; i6 <= this.mDegree - 1 && !zIsIrreducible; i6++) {
                    this.fieldPolynomial.setBit(i6);
                    int i7 = (this.mDegree & 1) != 0 ? 1 : 0;
                    int i8 = (-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? 1 : 0;
                    if ((((-1) - (((-1) - ((i7 + i8) - (i7 & i8))) & ((-1) - ((1 & i4) != 0 ? 1 : 0)))) | ((1 & i6) != 0 ? 1 : 0)) != 0 && (zIsIrreducible = this.fieldPolynomial.isIrreducible())) {
                        this.isPentanomial = true;
                        int[] iArr = this.pc;
                        iArr[0] = i2;
                        iArr[1] = i4;
                        iArr[2] = i6;
                        return zIsIrreducible;
                    }
                    this.fieldPolynomial.resetBit(i6);
                }
                this.fieldPolynomial.resetBit(i4);
                i4 = i5;
            }
            this.fieldPolynomial.resetBit(i2);
            i2 = i3;
        }
        return zIsIrreducible;
    }

    private boolean testRandom() {
        this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1);
        do {
            this.fieldPolynomial.randomize();
            this.fieldPolynomial.setBit(this.mDegree);
            this.fieldPolynomial.setBit(0);
        } while (!this.fieldPolynomial.isIrreducible());
        return true;
    }

    private boolean testTrinomials() {
        this.fieldPolynomial = new GF2Polynomial(this.mDegree + 1);
        boolean zIsIrreducible = false;
        this.fieldPolynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        for (int i2 = 1; i2 < this.mDegree && !zIsIrreducible; i2++) {
            this.fieldPolynomial.setBit(i2);
            boolean zIsIrreducible2 = this.fieldPolynomial.isIrreducible();
            if (zIsIrreducible2) {
                this.isTrinomial = true;
                this.tc = i2;
                return zIsIrreducible2;
            }
            this.fieldPolynomial.resetBit(i2);
            zIsIrreducible = this.fieldPolynomial.isIrreducible();
        }
        return zIsIrreducible;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    protected void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        GF2nElement[] gF2nElementArr;
        if (this.mDegree != gF2nField.mDegree) {
            throw new IllegalArgumentException("GF2nPolynomialField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        boolean z2 = gF2nField instanceof GF2nONBField;
        if (z2) {
            gF2nField.computeCOBMatrix(this);
            return;
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[this.mDegree];
        for (int i2 = 0; i2 < this.mDegree; i2++) {
            gF2PolynomialArr[i2] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        if (randomRoot instanceof GF2nONBElement) {
            gF2nElementArr = new GF2nONBElement[this.mDegree];
            gF2nElementArr[this.mDegree - 1] = GF2nONBElement.ONE((GF2nONBField) gF2nField);
        } else {
            gF2nElementArr = new GF2nPolynomialElement[this.mDegree];
            gF2nElementArr[this.mDegree - 1] = GF2nPolynomialElement.ONE((GF2nPolynomialField) gF2nField);
        }
        gF2nElementArr[this.mDegree - 2] = randomRoot;
        for (int i3 = this.mDegree - 3; i3 >= 0; i3--) {
            gF2nElementArr[i3] = (GF2nElement) gF2nElementArr[i3 + 1].multiply(randomRoot);
        }
        if (z2) {
            for (int i4 = 0; i4 < this.mDegree; i4++) {
                for (int i5 = 0; i5 < this.mDegree; i5++) {
                    if (gF2nElementArr[i4].testBit((this.mDegree - i5) - 1)) {
                        gF2PolynomialArr[(this.mDegree - i5) - 1].setBit((this.mDegree - i4) - 1);
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.mDegree; i6++) {
                for (int i7 = 0; i7 < this.mDegree; i7++) {
                    if (gF2nElementArr[i6].testBit(i7)) {
                        gF2PolynomialArr[(this.mDegree - i7) - 1].setBit((this.mDegree - i6) - 1);
                    }
                }
            }
        }
        this.fields.addElement(gF2nField);
        this.matrices.addElement(gF2PolynomialArr);
        gF2nField.fields.addElement(this);
        gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    protected void computeFieldPolynomial() {
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    protected void computeFieldPolynomial2() {
        if (testTrinomials() || testPentanomials()) {
            return;
        }
        testRandom();
    }

    public int[] getPc() throws RuntimeException {
        if (!this.isPentanomial) {
            throw new RuntimeException();
        }
        int[] iArr = new int[3];
        System.arraycopy(this.pc, 0, iArr, 0, 3);
        return iArr;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    protected GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gF2nPolynomialGcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                GF2nPolynomialElement gF2nPolynomialElement = new GF2nPolynomialElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nPolynomialElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nPolynomialElement);
                GF2nPolynomial gF2nPolynomial3 = new GF2nPolynomial(gF2nPolynomial2);
                for (int i2 = 1; i2 <= this.mDegree - 1; i2++) {
                    gF2nPolynomial3 = gF2nPolynomial3.multiplyAndReduce(gF2nPolynomial3, gF2nPolynomial).add(gF2nPolynomial2);
                }
                gF2nPolynomialGcd = gF2nPolynomial3.gcd(gF2nPolynomial);
                degree = gF2nPolynomialGcd.getDegree();
                degree2 = gF2nPolynomial.getDegree();
                if (degree != 0 && degree != degree2) {
                    break;
                }
            }
            gF2nPolynomial = (degree << 1) > degree2 ? gF2nPolynomial.quotient(gF2nPolynomialGcd) : new GF2nPolynomial(gF2nPolynomialGcd);
        }
        return gF2nPolynomial.at(0);
    }

    public GF2Polynomial getSquaringVector(int i2) {
        return new GF2Polynomial(this.squaringMatrix[i2]);
    }

    public int getTc() throws RuntimeException {
        if (this.isTrinomial) {
            return this.tc;
        }
        throw new RuntimeException();
    }

    public boolean isPentanomial() {
        return this.isPentanomial;
    }

    public boolean isTrinomial() {
        return this.isTrinomial;
    }
}
