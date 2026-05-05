package org.bouncycastle.pqc.crypto.rainbow.util;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class ComputeInField {
    private short[][] A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    short[] f27781x;

    private void computeZerosAbove() throws RuntimeException {
        for (int length = this.A.length - 1; length > 0; length--) {
            for (int i2 = length - 1; i2 >= 0; i2--) {
                short[][] sArr = this.A;
                short s2 = sArr[i2][length];
                short sInvElem = GF2Field.invElem(sArr[length][length]);
                if (sInvElem == 0) {
                    throw new RuntimeException("The matrix is not invertible");
                }
                int i3 = length;
                while (true) {
                    short[][] sArr2 = this.A;
                    if (i3 < sArr2.length * 2) {
                        short sMultElem = GF2Field.multElem(s2, GF2Field.multElem(sArr2[length][i3], sInvElem));
                        short[] sArr3 = this.A[i2];
                        sArr3[i3] = GF2Field.addElem(sArr3[i3], sMultElem);
                        i3++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r7 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void computeZerosUnder(boolean r11) throws java.lang.RuntimeException {
        /*
            r10 = this;
            if (r11 == 0) goto L4a
            short[][] r0 = r10.A
            int r0 = r0.length
            int r8 = r0 * 2
        L7:
            r7 = 0
        L8:
            short[][] r0 = r10.A
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r7 >= r0) goto L58
            int r9 = r7 + 1
            r6 = r9
        L12:
            short[][] r1 = r10.A
            int r0 = r1.length
            if (r6 >= r0) goto L48
            r0 = r1[r6]
            short r5 = r0[r7]
            r0 = r1[r7]
            short r0 = r0[r7]
            short r4 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.invElem(r0)
            if (r4 == 0) goto L50
            r3 = r7
        L26:
            if (r3 >= r8) goto L45
            short[][] r0 = r10.A
            r0 = r0[r7]
            short r0 = r0[r3]
            short r0 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(r0, r4)
            short r2 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(r5, r0)
            short[][] r0 = r10.A
            r1 = r0[r6]
            short r0 = r1[r3]
            short r0 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(r0, r2)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L26
        L45:
            int r6 = r6 + 1
            goto L12
        L48:
            r7 = r9
            goto L8
        L4a:
            short[][] r0 = r10.A
            int r0 = r0.length
            int r8 = r0 + 1
            goto L7
        L50:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Matrix not invertible! We have to choose another one!"
            r1.<init>(r0)
            throw r1
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField.computeZerosUnder(boolean):void");
    }

    private void substitute() throws RuntimeException {
        short sInvElem = GF2Field.invElem(this.A[r2.length - 1][r2.length - 1]);
        if (sInvElem == 0) {
            throw new RuntimeException("The equation system is not solvable");
        }
        short[] sArr = this.f27781x;
        short[][] sArr2 = this.A;
        sArr[sArr2.length - 1] = GF2Field.multElem(sArr2[sArr2.length - 1][sArr2.length], sInvElem);
        for (int length = this.A.length - 2; length >= 0; length--) {
            short[][] sArr3 = this.A;
            short sAddElem = sArr3[length][sArr3.length];
            for (int length2 = sArr3.length - 1; length2 > length; length2--) {
                sAddElem = GF2Field.addElem(sAddElem, GF2Field.multElem(this.A[length][length2], this.f27781x[length2]));
            }
            short sInvElem2 = GF2Field.invElem(this.A[length][length]);
            if (sInvElem2 == 0) {
                throw new RuntimeException("Not solvable equation system");
            }
            this.f27781x[length] = GF2Field.multElem(sAddElem, sInvElem2);
        }
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            throw new RuntimeException("Addition is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        for (int i2 = 0; i2 < sArr.length; i2++) {
            for (int i3 = 0; i3 < sArr2.length; i3++) {
                sArr3[i2][i3] = GF2Field.addElem(sArr[i2][i3], sArr2[i2][i3]);
            }
        }
        return sArr3;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i2 = 0; i2 < length; i2++) {
            sArr3[i2] = GF2Field.addElem(sArr[i2], sArr2[i2]);
        }
        return sArr3;
    }

    public short[][] inverse(short[][] sArr) {
        try {
            int i2 = 0;
            this.A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length * 2);
            if (sArr.length != sArr[0].length) {
                throw new RuntimeException("The matrix is not invertible. Please choose another one!");
            }
            for (int i3 = 0; i3 < sArr.length; i3++) {
                for (int i4 = 0; i4 < sArr.length; i4++) {
                    this.A[i3][i4] = sArr[i3][i4];
                }
                for (int length = sArr.length; length < sArr.length * 2; length++) {
                    this.A[i3][length] = 0;
                }
                short[][] sArr2 = this.A;
                sArr2[i3][sArr2.length + i3] = 1;
            }
            computeZerosUnder(true);
            int i5 = 0;
            while (true) {
                short[][] sArr3 = this.A;
                if (i5 >= sArr3.length) {
                    break;
                }
                short sInvElem = GF2Field.invElem(sArr3[i5][i5]);
                int i6 = i5;
                while (true) {
                    short[][] sArr4 = this.A;
                    if (i6 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i5];
                        sArr5[i6] = GF2Field.multElem(sArr5[i6], sInvElem);
                        i6++;
                    }
                }
                i5++;
            }
            computeZerosAbove();
            short[][] sArr6 = this.A;
            short[][] sArr7 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr6.length, sArr6.length);
            while (true) {
                short[][] sArr8 = this.A;
                if (i2 >= sArr8.length) {
                    return sArr7;
                }
                int length2 = sArr8.length;
                while (true) {
                    short[][] sArr9 = this.A;
                    if (length2 < sArr9.length * 2) {
                        sArr7[i2][length2 - sArr9.length] = sArr9[i2][length2];
                        length2++;
                    }
                }
                i2++;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s2, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i2 = 0; i2 < sArr.length; i2++) {
            for (int i3 = 0; i3 < sArr[0].length; i3++) {
                sArr2[i2][i3] = GF2Field.multElem(s2, sArr[i2][i3]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s2, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i2 = 0; i2 < length; i2++) {
            sArr2[i2] = GF2Field.multElem(s2, sArr[i2]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i2 = 0; i2 < sArr.length; i2++) {
            for (int i3 = 0; i3 < sArr2.length; i3++) {
                sArr3[i2][i3] = GF2Field.multElem(sArr[i2], sArr2[i3]);
            }
        }
        return sArr3;
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) throws RuntimeException {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[] sArr3 = new short[sArr.length];
        for (int i2 = 0; i2 < sArr.length; i2++) {
            for (int i3 = 0; i3 < sArr2.length; i3++) {
                sArr3[i2] = GF2Field.addElem(sArr3[i2], GF2Field.multElem(sArr[i2][i3], sArr2[i3]));
            }
        }
        return sArr3;
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) throws RuntimeException {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        this.A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i2 = 0; i2 < sArr.length; i2++) {
            for (int i3 = 0; i3 < sArr2.length; i3++) {
                for (int i4 = 0; i4 < sArr2[0].length; i4++) {
                    short sMultElem = GF2Field.multElem(sArr[i2][i3], sArr2[i3][i4]);
                    short[] sArr3 = this.A[i2];
                    sArr3[i4] = GF2Field.addElem(sArr3[i4], sMultElem);
                }
            }
        }
        return this.A;
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        try {
            if (sArr.length != sArr2.length) {
                throw new RuntimeException("The equation system is not solvable");
            }
            this.A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            this.f27781x = new short[sArr.length];
            for (int i2 = 0; i2 < sArr.length; i2++) {
                for (int i3 = 0; i3 < sArr[0].length; i3++) {
                    this.A[i2][i3] = sArr[i2][i3];
                }
            }
            for (int i4 = 0; i4 < sArr2.length; i4++) {
                short[] sArr3 = this.A[i4];
                sArr3[sArr2.length] = GF2Field.addElem(sArr2[i4], sArr3[sArr2.length]);
            }
            computeZerosUnder(false);
            substitute();
            return this.f27781x;
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
