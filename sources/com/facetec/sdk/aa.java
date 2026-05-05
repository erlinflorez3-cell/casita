package com.facetec.sdk;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class aa extends cz implements fa {
    private ev B;
    private ey V;
    private ck Z;

    public aa(ck ckVar, ey eyVar, ev evVar) {
        this.Z = ckVar;
        this.V = eyVar;
        this.B = evVar;
    }

    @Override // com.facetec.sdk.cz
    public final void B(ek ekVar, Object obj) throws IOException {
        if (obj == null) {
            ekVar.F();
            return;
        }
        D d2 = (D) obj;
        ck ckVar = this.Z;
        ev evVar = this.B;
        ekVar.I();
        if (d2 != d2.Code) {
            evVar.I(ekVar, 4);
            ekVar.V(d2.Code);
        }
        if (d2 != d2.V) {
            evVar.I(ekVar, 7);
            cv cvVar = d2.V;
            eu.Code(ckVar, cv.class, cvVar).B(ekVar, cvVar);
        }
        if (d2 != d2.I) {
            evVar.I(ekVar, 1);
            F f2 = new F();
            ArrayList<String> arrayList = d2.I;
            eu.Z(ckVar, f2, arrayList).B(ekVar, arrayList);
        }
        if (d2 != d2.Z) {
            evVar.I(ekVar, 0);
            ekVar.V(d2.Z);
        }
        if (d2 != d2.B) {
            evVar.I(ekVar, 3);
            ekVar.V(d2.B);
        }
        if (d2 != d2.F) {
            evVar.I(ekVar, 6);
            ekVar.V(d2.F);
        }
        if (d2 != d2.L) {
            evVar.I(ekVar, 2);
            ekVar.V(d2.L);
        }
        if (d2 != d2.D) {
            evVar.I(ekVar, 5);
            ekVar.V(d2.D);
        }
        ekVar.B();
    }

    @Override // com.facetec.sdk.cz
    public final Object V(ei eiVar) throws IOException {
        if (eiVar.D() == el.NULL) {
            eiVar.d();
            return null;
        }
        D d2 = new D();
        ck ckVar = this.Z;
        ey eyVar = this.V;
        eiVar.Code();
        while (eiVar.V()) {
            int iV = eyVar.V(eiVar);
            boolean z2 = eiVar.D() != el.NULL;
            switch (iV) {
                case 0:
                    if (!z2) {
                        d2.V = null;
                    } else {
                        d2.V = (cv) ckVar.V(cv.class).V(eiVar);
                    }
                    break;
                case 1:
                    if (!z2) {
                        d2.Code = null;
                    } else {
                        d2.Code = eiVar.D() != el.BOOLEAN ? eiVar.L() : Boolean.toString(eiVar.F());
                    }
                    break;
                case 2:
                    if (!z2) {
                        d2.Z = null;
                    } else {
                        d2.Z = eiVar.D() != el.BOOLEAN ? eiVar.L() : Boolean.toString(eiVar.F());
                    }
                    break;
                case 3:
                    if (!z2) {
                        d2.F = null;
                    } else {
                        d2.F = eiVar.D() != el.BOOLEAN ? eiVar.L() : Boolean.toString(eiVar.F());
                    }
                    break;
                case 4:
                    if (!z2) {
                        d2.I = null;
                    } else {
                        d2.I = (ArrayList) ckVar.V(new F()).V(eiVar);
                    }
                    break;
                case 5:
                    if (!z2) {
                        d2.D = null;
                    } else {
                        d2.D = eiVar.D() != el.BOOLEAN ? eiVar.L() : Boolean.toString(eiVar.F());
                    }
                    break;
                case 6:
                    if (!z2) {
                        d2.B = null;
                    } else {
                        d2.B = eiVar.D() != el.BOOLEAN ? eiVar.L() : Boolean.toString(eiVar.F());
                    }
                    break;
                case 7:
                    if (!z2) {
                        d2.L = null;
                    } else {
                        d2.L = eiVar.D() != el.BOOLEAN ? eiVar.L() : Boolean.toString(eiVar.F());
                    }
                    break;
                default:
                    eiVar.d();
                    continue;
            }
            eiVar.S();
        }
        eiVar.Z();
        return d2;
    }
}
