package org.spongycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes2.dex */
public class McEliecePublicKeySpec implements KeySpec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GF2Matrix f28192g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28193n;
    private String oid;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28194t;

    public McEliecePublicKeySpec(String str, int i2, int i3, GF2Matrix gF2Matrix) {
        this.oid = str;
        this.f28193n = i2;
        this.f28194t = i3;
        this.f28192g = new GF2Matrix(gF2Matrix);
    }

    public McEliecePublicKeySpec(String str, int i2, int i3, byte[] bArr) {
        this.oid = str;
        this.f28193n = i3;
        this.f28194t = i2;
        this.f28192g = new GF2Matrix(bArr);
    }

    public GF2Matrix getG() {
        return this.f28192g;
    }

    public int getN() {
        return this.f28193n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public int getT() {
        return this.f28194t;
    }
}
