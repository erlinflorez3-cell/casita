package org.spongycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceCCA2PublicKeySpec implements KeySpec {
    private GF2Matrix matrixG;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28187n;
    private String oid;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f28188t;

    public McElieceCCA2PublicKeySpec(String str, int i2, int i3, GF2Matrix gF2Matrix) {
        this.oid = str;
        this.f28187n = i2;
        this.f28188t = i3;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public McElieceCCA2PublicKeySpec(String str, int i2, int i3, byte[] bArr) {
        this.oid = str;
        this.f28187n = i2;
        this.f28188t = i3;
        this.matrixG = new GF2Matrix(bArr);
    }

    public GF2Matrix getMatrixG() {
        return this.matrixG;
    }

    public int getN() {
        return this.f28187n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public int getT() {
        return this.f28188t;
    }
}
