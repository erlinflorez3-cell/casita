package org.spongycastle.pqc.crypto.mceliece;

import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes2.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GF2Matrix f28142g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28143n;
    private String oid;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28144t;

    public McEliecePublicKeyParameters(String str, int i2, int i3, GF2Matrix gF2Matrix, McElieceParameters mcElieceParameters) {
        super(false, mcElieceParameters);
        this.oid = str;
        this.f28143n = i2;
        this.f28144t = i3;
        this.f28142g = new GF2Matrix(gF2Matrix);
    }

    public McEliecePublicKeyParameters(String str, int i2, int i3, byte[] bArr, McElieceParameters mcElieceParameters) {
        super(false, mcElieceParameters);
        this.oid = str;
        this.f28143n = i3;
        this.f28144t = i2;
        this.f28142g = new GF2Matrix(bArr);
    }

    public GF2Matrix getG() {
        return this.f28142g;
    }

    public int getK() {
        return this.f28142g.getNumRows();
    }

    public int getN() {
        return this.f28143n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public int getT() {
        return this.f28144t;
    }
}
