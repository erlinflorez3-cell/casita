package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ea<T> extends cz<T> {
    private final cy B;
    private ck Code;
    private cz<T> F;
    private final cx<T> I;
    private final cn<T> V;
    private final ef<T> Z;

    public ea(cx<T> cxVar, cn<T> cnVar, ck ckVar, ef<T> efVar, cy cyVar) {
        this.I = cxVar;
        this.V = cnVar;
        this.Code = ckVar;
        this.Z = efVar;
        this.B = cyVar;
    }

    private cz<T> I() {
        cz<T> czVar = this.F;
        if (czVar != null) {
            return czVar;
        }
        cz<T> czVarV = this.Code.V(this.B, this.Z);
        this.F = czVarV;
        return czVarV;
    }

    @Override // com.facetec.sdk.cz
    public final void B(ek ekVar, T t2) throws IOException {
        cx<T> cxVar = this.I;
        if (cxVar == null) {
            I().B(ekVar, t2);
        } else if (t2 == null) {
            ekVar.F();
        } else {
            this.Z.V();
            dp.Code(cxVar.Z(), ekVar);
        }
    }

    @Override // com.facetec.sdk.cz
    public final T V(ei eiVar) throws IOException {
        if (this.V == null) {
            return I().V(eiVar);
        }
        if (dp.I(eiVar).S()) {
            return null;
        }
        cn<T> cnVar = this.V;
        this.Z.V();
        return cnVar.Z();
    }
}
