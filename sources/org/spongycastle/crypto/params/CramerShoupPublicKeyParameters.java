package org.spongycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class CramerShoupPublicKeyParameters extends CramerShoupKeyParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BigInteger f27934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BigInteger f27935d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BigInteger f27936h;

    public CramerShoupPublicKeyParameters(CramerShoupParameters cramerShoupParameters, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        super(false, cramerShoupParameters);
        this.f27934c = bigInteger;
        this.f27935d = bigInteger2;
        this.f27936h = bigInteger3;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupPublicKeyParameters)) {
            return false;
        }
        CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) obj;
        return cramerShoupPublicKeyParameters.getC().equals(this.f27934c) && cramerShoupPublicKeyParameters.getD().equals(this.f27935d) && cramerShoupPublicKeyParameters.getH().equals(this.f27936h) && super.equals(obj);
    }

    public BigInteger getC() {
        return this.f27934c;
    }

    public BigInteger getD() {
        return this.f27935d;
    }

    public BigInteger getH() {
        return this.f27936h;
    }

    @Override // org.spongycastle.crypto.params.CramerShoupKeyParameters
    public int hashCode() {
        return ((this.f27934c.hashCode() ^ this.f27935d.hashCode()) ^ this.f27936h.hashCode()) ^ super.hashCode();
    }
}
