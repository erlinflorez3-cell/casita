package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceParameters implements CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28134n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28135t;

    public McElieceParameters() {
        this(11, 50);
    }

    public McElieceParameters(int i2) throws IllegalArgumentException {
        if (i2 < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        this.f28133m = 0;
        this.f28134n = 1;
        while (true) {
            int i3 = this.f28134n;
            if (i3 >= i2) {
                int i4 = i3 >>> 1;
                this.f28135t = i4;
                int i5 = this.f28133m;
                this.f28135t = i4 / i5;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i5);
                return;
            }
            this.f28134n = i3 << 1;
            this.f28133m++;
        }
    }

    public McElieceParameters(int i2, int i3) throws IllegalArgumentException {
        if (i2 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i2 > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f28133m = i2;
        int i4 = 1 << i2;
        this.f28134n = i4;
        if (i3 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i3 > i4) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f28135t = i3;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i2);
    }

    public McElieceParameters(int i2, int i3, int i4) throws IllegalArgumentException {
        this.f28133m = i2;
        if (i2 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i2 > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i5 = 1 << i2;
        this.f28134n = i5;
        this.f28135t = i3;
        if (i3 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i3 > i5) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        if (PolynomialRingGF2.degree(i4) != i2 || !PolynomialRingGF2.isIrreducible(i4)) {
            throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.fieldPoly = i4;
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f28133m;
    }

    public int getN() {
        return this.f28134n;
    }

    public int getT() {
        return this.f28135t;
    }
}
