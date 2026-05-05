package org.spongycastle.pqc.jcajce.spec;

import java.security.InvalidParameterException;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.pqc.math.linearalgebra.PolynomialRingGF2;

/* JADX INFO: loaded from: classes2.dex */
public class ECCKeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f28180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28181n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28182t;

    public ECCKeyGenParameterSpec() {
        this(11, 50);
    }

    public ECCKeyGenParameterSpec(int i2) throws InvalidParameterException {
        if (i2 < 1) {
            throw new InvalidParameterException("key size must be positive");
        }
        this.f28180m = 0;
        this.f28181n = 1;
        while (true) {
            int i3 = this.f28181n;
            if (i3 >= i2) {
                int i4 = i3 >>> 1;
                this.f28182t = i4;
                int i5 = this.f28180m;
                this.f28182t = i4 / i5;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i5);
                return;
            }
            this.f28181n = i3 << 1;
            this.f28180m++;
        }
    }

    public ECCKeyGenParameterSpec(int i2, int i3) throws InvalidParameterException {
        if (i2 < 1) {
            throw new InvalidParameterException("m must be positive");
        }
        if (i2 > 32) {
            throw new InvalidParameterException("m is too large");
        }
        this.f28180m = i2;
        int i4 = 1 << i2;
        this.f28181n = i4;
        if (i3 < 0) {
            throw new InvalidParameterException("t must be positive");
        }
        if (i3 > i4) {
            throw new InvalidParameterException("t must be less than n = 2^m");
        }
        this.f28182t = i3;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i2);
    }

    public ECCKeyGenParameterSpec(int i2, int i3, int i4) throws InvalidParameterException {
        this.f28180m = i2;
        if (i2 < 1) {
            throw new InvalidParameterException("m must be positive");
        }
        if (i2 > 32) {
            throw new InvalidParameterException(" m is too large");
        }
        int i5 = 1 << i2;
        this.f28181n = i5;
        this.f28182t = i3;
        if (i3 < 0) {
            throw new InvalidParameterException("t must be positive");
        }
        if (i3 > i5) {
            throw new InvalidParameterException("t must be less than n = 2^m");
        }
        if (PolynomialRingGF2.degree(i4) != i2 || !PolynomialRingGF2.isIrreducible(i4)) {
            throw new InvalidParameterException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.fieldPoly = i4;
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f28180m;
    }

    public int getN() {
        return this.f28181n;
    }

    public int getT() {
        return this.f28182t;
    }
}
