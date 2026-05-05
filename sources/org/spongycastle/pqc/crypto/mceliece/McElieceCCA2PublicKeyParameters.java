package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28119n;
    private String oid;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28120t;

    public McElieceCCA2PublicKeyParameters(String str, int i2, int i3, GF2Matrix gF2Matrix, McElieceCCA2Parameters mcElieceCCA2Parameters) {
        super(false, mcElieceCCA2Parameters);
        this.oid = str;
        this.f28119n = i2;
        this.f28120t = i3;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public McElieceCCA2PublicKeyParameters(String str, int i2, int i3, byte[] bArr, McElieceCCA2Parameters mcElieceCCA2Parameters) {
        super(false, mcElieceCCA2Parameters);
        this.oid = str;
        this.f28119n = i2;
        this.f28120t = i3;
        this.matrixG = new GF2Matrix(bArr);
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public GF2Matrix getMatrixG() {
        return this.matrixG;
    }

    public int getN() {
        return this.f28119n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public int getT() {
        return this.f28120t;
    }
}
