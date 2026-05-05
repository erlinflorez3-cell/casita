package com.facetec.sdk;

import yg.Kl;

/* JADX INFO: loaded from: classes3.dex */
public final class dr implements cy {
    private final dg I;

    public dr(dg dgVar) {
        this.I = dgVar;
    }

    static cz<?> Z(dg dgVar, ck ckVar, ef<?> efVar, dc dcVar) {
        cz<?> eaVar;
        Object objV = dgVar.V(ef.I(dcVar.V())).V();
        if (objV instanceof cz) {
            eaVar = (cz) objV;
        } else if (objV instanceof cy) {
            eaVar = ((cy) objV).V(ckVar, efVar);
        } else {
            boolean z2 = objV instanceof cx;
            if (!z2 && !(objV instanceof cn)) {
                throw new IllegalArgumentException(new StringBuilder("Invalid attempt to bind an instance of ").append(objV.getClass().getName()).append(" as a @JsonAdapter for ").append(efVar.toString()).append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.").toString());
            }
            eaVar = new ea<>(z2 ? (cx) objV : null, objV instanceof cn ? (cn) objV : null, ckVar, efVar, null);
        }
        return (eaVar == null || !dcVar.B()) ? eaVar : eaVar.Code();
    }

    @Override // com.facetec.sdk.cy
    public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
        dc dcVar = (dc) Kl.Kd(efVar.Z(), dc.class);
        if (dcVar == null) {
            return null;
        }
        return (cz<T>) Z(this.I, ckVar, efVar, dcVar);
    }
}
