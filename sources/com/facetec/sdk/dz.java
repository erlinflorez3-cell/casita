package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class dz implements cy {
    final boolean B;
    private final dg Code;

    final class Code<K, V> extends cz<Map<K, V>> {
        private final dn<? extends Map<K, V>> Code;
        private final cz<K> V;
        private final cz<V> Z;

        public Code(ck ckVar, Type type, cz<K> czVar, Type type2, cz<V> czVar2, dn<? extends Map<K, V>> dnVar) {
            this.V = new ee(ckVar, czVar, type);
            this.Z = new ee(ckVar, czVar2, type2);
            this.Code = dnVar;
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Object obj) throws IOException {
            String strV;
            Map map = (Map) obj;
            if (map == null) {
                ekVar.F();
                return;
            }
            if (!dz.this.B) {
                ekVar.I();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    ekVar.Code(String.valueOf(entry.getKey()));
                    this.Z.B(ekVar, entry.getValue());
                }
                ekVar.B();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            boolean z2 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                cm cmVarCode = this.V.Code(entry2.getKey());
                arrayList.add(cmVarCode);
                arrayList2.add(entry2.getValue());
                z2 |= cmVarCode.C() || cmVarCode.D();
            }
            if (z2) {
                ekVar.V();
                int size = arrayList.size();
                while (i2 < size) {
                    ekVar.V();
                    dp.Code((cm) arrayList.get(i2), ekVar);
                    this.Z.B(ekVar, (V) arrayList2.get(i2));
                    ekVar.Z();
                    i2++;
                }
                ekVar.Z();
                return;
            }
            ekVar.I();
            int size2 = arrayList.size();
            while (i2 < size2) {
                cm cmVar = (cm) arrayList.get(i2);
                if (cmVar.F()) {
                    ct ctVarD = cmVar.d();
                    if (ctVarD.a()) {
                        strV = String.valueOf(ctVarD.Code());
                    } else if (ctVarD.c()) {
                        strV = Boolean.toString(ctVarD.L());
                    } else {
                        if (!ctVarD.b()) {
                            throw new AssertionError();
                        }
                        strV = ctVarD.V();
                    }
                } else {
                    if (!cmVar.S()) {
                        throw new AssertionError();
                    }
                    strV = "null";
                }
                ekVar.Code(strV);
                this.Z.B(ekVar, (V) arrayList2.get(i2));
                i2++;
            }
            ekVar.B();
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Object V(ei eiVar) throws IOException {
            el elVarD = eiVar.D();
            if (elVarD == el.NULL) {
                eiVar.S();
                return null;
            }
            Map<K, V> mapV = this.Code.V();
            if (elVarD == el.BEGIN_ARRAY) {
                eiVar.I();
                while (eiVar.V()) {
                    eiVar.I();
                    K kV = this.V.V(eiVar);
                    if (mapV.put(kV, this.Z.V(eiVar)) != null) {
                        throw new da("duplicate key: ".concat(String.valueOf(kV)));
                    }
                    eiVar.B();
                }
                eiVar.B();
            } else {
                eiVar.Code();
                while (eiVar.V()) {
                    di.B.Z(eiVar);
                    K kV2 = this.V.V(eiVar);
                    if (mapV.put(kV2, this.Z.V(eiVar)) != null) {
                        throw new da("duplicate key: ".concat(String.valueOf(kV2)));
                    }
                }
                eiVar.Z();
            }
            return mapV;
        }
    }

    public dz(dg dgVar, boolean z2) {
        this.Code = dgVar;
        this.B = z2;
    }

    @Override // com.facetec.sdk.cy
    public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
        Type typeV = efVar.V();
        if (!Map.class.isAssignableFrom(efVar.Z())) {
            return null;
        }
        Type[] typeArrV = dh.V(typeV, dh.V(typeV));
        Type type = typeArrV[0];
        return new Code(ckVar, typeArrV[0], (type == Boolean.TYPE || type == Boolean.class) ? eb.I : ckVar.V(ef.V(type)), typeArrV[1], ckVar.V(ef.V(typeArrV[1])), this.Code.V(efVar));
    }
}
