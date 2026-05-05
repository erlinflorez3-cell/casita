package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Random;
import org.apache.commons.codec.language.bm.Rule;

/* JADX INFO: loaded from: classes2.dex */
public class GF2nONBField extends GF2nField {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    int[][] mMult;
    private int mType;

    public GF2nONBField(int i2, SecureRandom secureRandom) throws RuntimeException {
        super(secureRandom);
        if (i2 < 3) {
            throw new IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i2;
        this.mLength = this.mDegree / 64;
        int i3 = this.mDegree & 63;
        this.mBit = i3;
        if (i3 == 0) {
            this.mBit = 64;
        } else {
            this.mLength++;
        }
        computeType();
        if (this.mType >= 3) {
            throw new RuntimeException("\nThe type of this field is " + this.mType);
        }
        this.mMult = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.mDegree, 2);
        for (int i4 = 0; i4 < this.mDegree; i4++) {
            int[] iArr = this.mMult[i4];
            iArr[0] = -1;
            iArr[1] = -1;
        }
        computeMultMatrix();
        computeFieldPolynomial();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    private void computeMultMatrix() {
        int i2;
        int i3 = this.mType;
        if ((i3 + 7) - (7 | i3) == 0) {
            throw new RuntimeException("bisher nur fuer Gausssche Normalbasen implementiert");
        }
        int i4 = i3 * this.mDegree;
        int i5 = i4 + 1;
        int[] iArr = new int[i5];
        int i6 = this.mType;
        int iElementOfOrder = i6 == 1 ? 1 : i6 == 2 ? i4 : elementOfOrder(i6, i5);
        int i7 = 1;
        int i8 = 0;
        while (true) {
            i2 = this.mType;
            if (i8 >= i2) {
                break;
            }
            int i9 = i7;
            for (int i10 = 0; i10 < this.mDegree; i10++) {
                iArr[i9] = i10;
                i9 = (i9 << 1) % i5;
                if (i9 < 0) {
                    i9 += i5;
                }
            }
            i7 = (i7 * iElementOfOrder) % i5;
            if (i7 < 0) {
                i7 += i5;
            }
            i8++;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new RuntimeException("only type 1 or type 2 implemented");
            }
            int i11 = 1;
            while (i11 < i4) {
                int i12 = i11 + 1;
                int[] iArr2 = this.mMult[iArr[i12]];
                int i13 = i5 - i11;
                if (iArr2[0] == -1) {
                    iArr2[0] = iArr[i13];
                } else {
                    iArr2[1] = iArr[i13];
                }
                i11 = i12;
            }
            return;
        }
        int i14 = 1;
        while (i14 < i4) {
            int i15 = i14 + 1;
            int[] iArr3 = this.mMult[iArr[i15]];
            int i16 = i5 - i14;
            if (iArr3[0] == -1) {
                iArr3[0] = iArr[i16];
            } else {
                iArr3[1] = iArr[i16];
            }
            i14 = i15;
        }
        int i17 = this.mDegree >> 1;
        for (int i18 = 1; i18 <= i17; i18++) {
            int[][] iArr4 = this.mMult;
            int i19 = i18 - 1;
            int[] iArr5 = iArr4[i19];
            if (iArr5[0] == -1) {
                iArr5[0] = (i17 + i18) - 1;
            } else {
                iArr5[1] = (i17 + i18) - 1;
            }
            int[] iArr6 = iArr4[(i17 + i18) - 1];
            if (iArr6[0] == -1) {
                iArr6[0] = i19;
            } else {
                iArr6[1] = i19;
            }
        }
    }

    private void computeType() throws RuntimeException {
        if ((-1) - (((-1) - this.mDegree) | ((-1) - 7)) == 0) {
            throw new RuntimeException("The extension degree is divisible by 8!");
        }
        this.mType = 1;
        int iGcd = 0;
        while (iGcd != 1) {
            int i2 = (this.mType * this.mDegree) + 1;
            if (IntegerFunctions.isPrime(i2)) {
                iGcd = IntegerFunctions.gcd((this.mType * this.mDegree) / IntegerFunctions.order(2, i2), this.mDegree);
            }
            this.mType++;
        }
        int i3 = this.mType - 1;
        this.mType = i3;
        if (i3 == 1) {
            int i4 = (this.mDegree << 1) + 1;
            if (IntegerFunctions.isPrime(i4)) {
                if (IntegerFunctions.gcd((this.mDegree << 1) / IntegerFunctions.order(2, i4), this.mDegree) == 1) {
                    this.mType++;
                }
            }
        }
    }

    private int elementOfOrder(int i2, int i3) {
        int iOrder;
        Random random = new Random();
        int iNextInt = 0;
        while (iNextInt == 0) {
            int i4 = i3 - 1;
            iNextInt = random.nextInt() % i4;
            if (iNextInt < 0) {
                iNextInt += i4;
            }
        }
        while (true) {
            iOrder = IntegerFunctions.order(iNextInt, i3);
            if (iOrder % i2 == 0 && iOrder != 0) {
                break;
            }
            while (iNextInt == 0) {
                int i5 = i3 - 1;
                iNextInt = random.nextInt() % i5;
                if (iNextInt < 0) {
                    iNextInt += i5;
                }
            }
        }
        int i6 = i2 / iOrder;
        int i7 = iNextInt;
        for (int i8 = 2; i8 <= i6; i8++) {
            i7 *= iNextInt;
        }
        return i7;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    protected void computeCOBMatrix(GF2nField gF2nField) {
        GF2nElement randomRoot;
        if (this.mDegree != gF2nField.mDegree) {
            throw new IllegalArgumentException("GF2nField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        GF2Polynomial[] gF2PolynomialArr = new GF2Polynomial[this.mDegree];
        for (int i2 = 0; i2 < this.mDegree; i2++) {
            gF2PolynomialArr[i2] = new GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        GF2nElement[] gF2nElementArr = new GF2nPolynomialElement[this.mDegree];
        gF2nElementArr[0] = (GF2nElement) randomRoot.clone();
        for (int i3 = 1; i3 < this.mDegree; i3++) {
            gF2nElementArr[i3] = gF2nElementArr[i3 - 1].square();
        }
        for (int i4 = 0; i4 < this.mDegree; i4++) {
            for (int i5 = 0; i5 < this.mDegree; i5++) {
                if (gF2nElementArr[i4].testBit(i5)) {
                    gF2PolynomialArr[(this.mDegree - i5) - 1].setBit((this.mDegree - i4) - 1);
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
        GF2Polynomial gF2Polynomial;
        int i2 = this.mType;
        int i3 = 1;
        if (i2 == 1) {
            gF2Polynomial = new GF2Polynomial(this.mDegree + 1, Rule.ALL);
        } else {
            if (i2 != 2) {
                return;
            }
            GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree + 1, "ONE");
            gF2Polynomial = new GF2Polynomial(this.mDegree + 1, "X");
            gF2Polynomial.addToThis(gF2Polynomial2);
            while (i3 < this.mDegree) {
                GF2Polynomial gF2PolynomialShiftLeft = gF2Polynomial.shiftLeft();
                gF2PolynomialShiftLeft.addToThis(gF2Polynomial2);
                i3++;
                gF2Polynomial2 = gF2Polynomial;
                gF2Polynomial = gF2PolynomialShiftLeft;
            }
        }
        this.fieldPolynomial = gF2Polynomial;
    }

    int getONBBit() {
        return this.mBit;
    }

    int getONBLength() {
        return this.mLength;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    protected GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial) {
        GF2nPolynomial gF2nPolynomialGcd;
        int degree;
        int degree2;
        GF2nPolynomial gF2nPolynomial = new GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                GF2nONBElement gF2nONBElement = new GF2nONBElement(this, this.random);
                GF2nPolynomial gF2nPolynomial2 = new GF2nPolynomial(2, GF2nONBElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nONBElement);
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

    int[][] invMatrix(int[][] iArr) {
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.mDegree, this.mDegree);
        for (int i2 = 0; i2 < this.mDegree; i2++) {
            iArr2[i2][i2] = 1;
        }
        for (int i3 = 0; i3 < this.mDegree; i3++) {
            for (int i4 = i3; i4 < this.mDegree; i4++) {
                iArr[(this.mDegree - 1) - i3][i4] = iArr[i3][i3];
            }
        }
        return null;
    }
}
