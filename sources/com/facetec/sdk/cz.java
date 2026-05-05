package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cz<T> {
    public abstract void B(ek ekVar, T t2) throws IOException;

    public final cm Code(T t2) {
        try {
            dx dxVar = new dx();
            B(dxVar, t2);
            return dxVar.Code();
        } catch (IOException e2) {
            throw new cu(e2);
        }
    }

    public final cz<T> Code() {
        return new cz<T>() { // from class: com.facetec.sdk.cz.4
            @Override // com.facetec.sdk.cz
            public final void B(ek ekVar, T t2) throws IOException {
                if (t2 == null) {
                    ekVar.F();
                } else {
                    cz.this.B(ekVar, t2);
                }
            }

            @Override // com.facetec.sdk.cz
            public final T V(ei eiVar) throws IOException {
                if (eiVar.D() != el.NULL) {
                    return (T) cz.this.V(eiVar);
                }
                eiVar.S();
                return null;
            }
        };
    }

    public abstract T V(ei eiVar) throws IOException;
}
