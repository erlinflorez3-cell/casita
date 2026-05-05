package org.spongycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.spongycastle.pqc.math.linearalgebra.GF2Matrix;
import org.spongycastle.pqc.math.linearalgebra.GF2mField;
import org.spongycastle.pqc.math.linearalgebra.Permutation;
import org.spongycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;

/* JADX INFO: loaded from: classes2.dex */
public class McElieceCCA2PrivateKeySpec implements KeySpec {
    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private GF2Matrix f28183h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f28184k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28185n;
    private String oid;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Permutation f28186p;
    private PolynomialGF2mSmallM[] qInv;

    public McElieceCCA2PrivateKeySpec(String str, int i2, int i3, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, GF2Matrix gF2Matrix, PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        this.oid = str;
        this.f28185n = i2;
        this.f28184k = i3;
        this.field = gF2mField;
        this.goppaPoly = polynomialGF2mSmallM;
        this.f28186p = permutation;
        this.f28183h = gF2Matrix;
        this.qInv = polynomialGF2mSmallMArr;
    }

    public McElieceCCA2PrivateKeySpec(String str, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[][] bArr5) {
        this.oid = str;
        this.f28185n = i2;
        this.f28184k = i3;
        this.field = new GF2mField(bArr);
        this.goppaPoly = new PolynomialGF2mSmallM(this.field, bArr2);
        this.f28186p = new Permutation(bArr3);
        this.f28183h = new GF2Matrix(bArr4);
        this.qInv = new PolynomialGF2mSmallM[bArr5.length];
        for (int i4 = 0; i4 < bArr5.length; i4++) {
            this.qInv[i4] = new PolynomialGF2mSmallM(this.field, bArr5[i4]);
        }
    }

    public GF2mField getField() {
        return this.field;
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.goppaPoly;
    }

    public GF2Matrix getH() {
        return this.f28183h;
    }

    public int getK() {
        return this.f28184k;
    }

    public int getN() {
        return this.f28185n;
    }

    public String getOIDString() {
        return this.oid;
    }

    public Permutation getP() {
        return this.f28186p;
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.qInv;
    }
}
