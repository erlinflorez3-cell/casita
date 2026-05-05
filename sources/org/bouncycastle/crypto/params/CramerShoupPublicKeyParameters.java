package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f27572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f27573d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BigInteger f27574h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f27572c = bigInteger;
        this.f27573d = bigInteger2;
        this.f27574h = bigInteger3;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f27572c) && cramerShoupPublicKeyParameters.getD().equals(this.f27573d) && cramerShoupPublicKeyParameters.getH().equals(this.f27574h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f27572c;
    }

    public BigInteger getD() {
        return this.f27573d;
    }

    public BigInteger getH() {
        return this.f27574h;
    }

    @Override // org.bouncycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f27572c.hashCode() ^ this.f27573d.hashCode()) ^ this.f27574h.hashCode()) ^ super.hashCode();
    }
}
