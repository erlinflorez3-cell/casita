package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27752n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27753t;

    public McElieceCCA2PublicKeyParameters(int i2, int i3, GF2Matrix gF2Matrix, String str) {
        super(false, str);
        this.f27752n = i2;
        this.f27753t = i3;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.matrixG;
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public int getN() {
        return this.f27752n;
    }

    public int getT() {
        return this.f27753t;
    }
}
