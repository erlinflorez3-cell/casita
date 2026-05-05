package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes2.dex */
public class ECKeyParameters extends AsymmetricKeyParameter {
    ECDomainParameters params;

    protected ECKeyParameters(boolean z2, ECDomainParameters eCDomainParameters) {
        super(z2);
        this.params = eCDomainParameters;
    }

    public ECDomainParameters getParameters() {
        return this.params;
    }
}
