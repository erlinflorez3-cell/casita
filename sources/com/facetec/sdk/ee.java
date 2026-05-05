package com.facetec.sdk;

import com.facetec.sdk.dv;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes3.dex */
final class ee<T> extends cz<T> {
    private final Type B;
    private final cz<T> I;
    private final ck V;

    ee(ck ckVar, cz<T> czVar, Type type) {
        this.V = ckVar;
        this.I = czVar;
        this.B = type;
    }

    @Override // com.facetec.sdk.cz
    public final void B(ek ekVar, T t2) throws IOException {
        cz<T> czVarV = this.I;
        Type type = this.B;
        if (t2 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t2.getClass();
        }
        if (type != this.B) {
            czVarV = this.V.V(ef.V(type));
            if (czVarV instanceof dv.Code) {
                cz<T> czVar = this.I;
                if (!(czVar instanceof dv.Code)) {
                    czVarV = czVar;
                }
            }
        }
        czVarV.B(ekVar, t2);
    }

    @Override // com.facetec.sdk.cz
    public final T V(ei eiVar) throws IOException {
        return this.I.V(eiVar);
    }
}
