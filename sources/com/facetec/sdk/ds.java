package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ds<E> extends cz<Object> {
    public static final cy I = new cy() { // from class: com.facetec.sdk.ds.3
        AnonymousClass3() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            Type typeV = efVar.V();
            if (!(typeV instanceof GenericArrayType) && (!(typeV instanceof Class) || !((Class) typeV).isArray())) {
                return null;
            }
            Type typeB = dh.B(typeV);
            return new ds(ckVar, ckVar.V(ef.V(typeB)), dh.V(typeB));
        }
    };
    private final cz<E> B;
    private final Class<E> Z;

    /* JADX INFO: renamed from: com.facetec.sdk.ds$3 */
    final class AnonymousClass3 implements cy {
        AnonymousClass3() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            Type typeV = efVar.V();
            if (!(typeV instanceof GenericArrayType) && (!(typeV instanceof Class) || !((Class) typeV).isArray())) {
                return null;
            }
            Type typeB = dh.B(typeV);
            return new ds(ckVar, ckVar.V(ef.V(typeB)), dh.V(typeB));
        }
    }

    public ds(ck ckVar, cz<E> czVar, Class<E> cls) {
        this.B = new ee(ckVar, czVar, cls);
        this.Z = cls;
    }

    @Override // com.facetec.sdk.cz
    public final void B(ek ekVar, Object obj) throws IOException {
        if (obj == null) {
            ekVar.F();
            return;
        }
        ekVar.V();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.B.B(ekVar, (E) Array.get(obj, i2));
        }
        ekVar.Z();
    }

    @Override // com.facetec.sdk.cz
    public final Object V(ei eiVar) throws IOException {
        if (eiVar.D() == el.NULL) {
            eiVar.S();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        eiVar.I();
        while (eiVar.V()) {
            arrayList.add(this.B.V(eiVar));
        }
        eiVar.B();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.Z, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(objNewInstance, i2, arrayList.get(i2));
        }
        return objNewInstance;
    }
}
