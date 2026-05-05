package org.spongycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.spongycastle.pqc.crypto.gmss.GMSSParameters;

/* JADX INFO: loaded from: classes2.dex */
public class GMSSKeySpec implements KeySpec {
    private GMSSParameters gmssParameterSet;

    protected GMSSKeySpec(GMSSParameters gMSSParameters) {
        this.gmssParameterSet = gMSSParameters;
    }

    public GMSSParameters getParameters() {
        return this.gmssParameterSet;
    }
}
