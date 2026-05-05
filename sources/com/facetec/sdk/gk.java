package com.facetec.sdk;

import com.facetec.sdk.fo;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class gk implements fo {
    private ft V;

    public gk(ft ftVar) {
        this.V = ftVar;
    }

    @Override // com.facetec.sdk.fo
    public final fy V(fo.Code code) throws IOException {
        gt gtVar = (gt) code;
        fv fvVarI = gtVar.I();
        gn gnVarL = gtVar.L();
        return gtVar.B(fvVarI, gnVarL, gnVarL.V(this.V, code, !fvVarI.Z().equals("GET")), gnVarL.I());
    }
}
