package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class dq implements cy {
    private final dg V;

    static final class B<E> extends cz<Collection<E>> {
        private final cz<E> B;
        private final dn<? extends Collection<E>> Z;

        public B(ck ckVar, Type type, cz<E> czVar, dn<? extends Collection<E>> dnVar) {
            this.B = new ee(ckVar, czVar, type);
            this.Z = dnVar;
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                ekVar.F();
                return;
            }
            ekVar.V();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.B.B(ekVar, it.next());
            }
            ekVar.Z();
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Object V(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            Collection<E> collectionV = this.Z.V();
            eiVar.I();
            while (eiVar.V()) {
                collectionV.add(this.B.V(eiVar));
            }
            eiVar.B();
            return collectionV;
        }
    }

    public dq(dg dgVar) {
        this.V = dgVar;
    }

    @Override // com.facetec.sdk.cy
    public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
        Type typeV = efVar.V();
        Class<? super T> clsZ = efVar.Z();
        if (!Collection.class.isAssignableFrom(clsZ)) {
            return null;
        }
        Type typeB = dh.B(typeV, clsZ);
        return new B(ckVar, typeB, ckVar.V(ef.V(typeB)), this.V.V(efVar));
    }
}
