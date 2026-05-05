package org.bouncycastle.pqc.crypto.mceliece;

import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes2.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GF2Matrix f27775g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27776n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27777t;

    public McEliecePublicKeyParameters(int i2, int i3, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f27776n = i2;
        this.f27777t = i3;
        this.f27775g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f27775g;
    }

    public int getK() {
        return this.f27775g.getNumRows();
    }

    public int getN() {
        return this.f27776n;
    }

    public int getT() {
        return this.f27777t;
    }
}
