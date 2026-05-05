package com.facetec.sdk;

import com.facetec.sdk.dv;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes3.dex */
public final class eu {
    public static cz Code(ck ckVar, Class cls, Object obj) {
        Type typeCode = Code(cls, obj);
        cz czVarV = ckVar.V(ef.V(typeCode));
        if (cls != typeCode && !I(czVarV)) {
            cz czVarV2 = ckVar.V(cls);
            if (I(czVarV2)) {
                return czVarV2;
            }
        }
        return czVarV;
    }

    private static Type Code(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    private static boolean I(cz czVar) {
        return ((czVar instanceof fa) || (czVar instanceof dv.Code)) ? false : true;
    }

    public static cz Z(ck ckVar, ef efVar, Object obj) {
        Type typeV = efVar.V();
        Type typeCode = Code(typeV, obj);
        cz czVarV = ckVar.V(ef.V(typeCode));
        if (typeV != typeCode && !I(czVarV)) {
            cz czVarV2 = ckVar.V(efVar);
            if (I(czVarV2)) {
                return czVarV2;
            }
        }
        return czVarV;
    }
}
