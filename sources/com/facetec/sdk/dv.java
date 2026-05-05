package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import yg.Kl;

/* JADX INFO: loaded from: classes3.dex */
public final class dv implements cy {
    private final dg Code;
    private final cj I;
    private final dj V;
    private final eh Z = eh.B();

    /* JADX INFO: renamed from: com.facetec.sdk.dv$2 */
    final class AnonymousClass2 extends V {
        private /* synthetic */ boolean B;
        private /* synthetic */ cz C;
        private /* synthetic */ ck D;
        private /* synthetic */ boolean F;
        private /* synthetic */ Field I;
        private /* synthetic */ ef L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, boolean z2, boolean z3, Field field, boolean z4, cz czVar, ck ckVar, ef efVar, boolean z5) {
            super(str, z2, z3);
            field = field;
            z = z4;
            czVar = czVar;
            ckVar = ckVar;
            efVar = efVar;
            z = z5;
        }

        @Override // com.facetec.sdk.dv.V
        final void B(ek ekVar, Object obj) throws IllegalAccessException, IOException {
            (z ? czVar : new ee(ckVar, czVar, efVar.V())).B(ekVar, field.get(obj));
        }

        @Override // com.facetec.sdk.dv.V
        final void Code(ei eiVar, Object obj) throws IllegalAccessException, IOException {
            Object objV = czVar.V(eiVar);
            if (objV == null && z) {
                return;
            }
            field.set(obj, objV);
        }

        @Override // com.facetec.sdk.dv.V
        public final boolean V(Object obj) throws IllegalAccessException, IOException {
            return this.V && field.get(obj) != obj;
        }
    }

    public static final class Code<T> extends cz<T> {
        private final dn<T> B;
        private final Map<String, V> Code;

        Code(dn<T> dnVar, Map<String, V> map) {
            this.B = dnVar;
            this.Code = map;
        }

        @Override // com.facetec.sdk.cz
        public final void B(ek ekVar, T t2) throws IOException {
            if (t2 == null) {
                ekVar.F();
                return;
            }
            ekVar.I();
            try {
                for (V v2 : this.Code.values()) {
                    if (v2.V(t2)) {
                        ekVar.Code(v2.Z);
                        v2.B(ekVar, t2);
                    }
                }
                ekVar.B();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.facetec.sdk.cz
        public final T V(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            T tV = this.B.V();
            try {
                eiVar.Code();
                while (eiVar.V()) {
                    V v2 = this.Code.get(eiVar.C());
                    if (v2 == null || !v2.Code) {
                        eiVar.d();
                    } else {
                        v2.Code(eiVar, tV);
                    }
                }
                eiVar.Z();
                return tV;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new da(e3);
            }
        }
    }

    static abstract class V {
        final boolean Code;
        final boolean V;
        final String Z;

        protected V(String str, boolean z2, boolean z3) {
            this.Z = str;
            this.V = z2;
            this.Code = z3;
        }

        abstract void B(ek ekVar, Object obj) throws IllegalAccessException, IOException;

        abstract void Code(ei eiVar, Object obj) throws IllegalAccessException, IOException;

        abstract boolean V(Object obj) throws IllegalAccessException, IOException;
    }

    public dv(dg dgVar, cj cjVar, dj djVar) {
        this.Code = dgVar;
        this.I = cjVar;
        this.V = djVar;
    }

    private List<String> V(Field field) {
        db dbVar = (db) Kl.qd(field, db.class);
        if (dbVar == null) {
            return Collections.singletonList(this.I.V(field));
        }
        String strB = dbVar.B();
        String[] strArrV = dbVar.V();
        if (strArrV.length == 0) {
            return Collections.singletonList(strB);
        }
        ArrayList arrayList = new ArrayList(strArrV.length + 1);
        arrayList.add(strB);
        for (String str : strArrV) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private boolean V(Field field, boolean z2) {
        return V(field, z2, this.V);
    }

    private static boolean V(Field field, boolean z2, dj djVar) {
        return (djVar.B(field.getType(), z2) || djVar.I(field, z2)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    private Map<String, V> Z(ck ckVar, ef<?> efVar, Class<?> cls) {
        Class<?> clsZ = cls;
        dv dvVar = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (clsZ.isInterface()) {
            return linkedHashMap;
        }
        Type typeV = efVar.V();
        while (clsZ != Object.class) {
            Field[] declaredFields = clsZ.getDeclaredFields();
            int length = declaredFields.length;
            boolean z2 = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean zV = dvVar.V(field, true);
                boolean zV2 = dvVar.V(field, z2);
                if (zV || zV2) {
                    dvVar.Z.B(field);
                    Type typeB = dh.B(efVar.V(), clsZ, field.getGenericType());
                    List<String> listV = dvVar.V(field);
                    int size = listV.size();
                    V v2 = null;
                    for (?? r3 = z2; r3 < size; r3++) {
                        String str = listV.get(r3);
                        if (r3 == 0) {
                            z2 = zV;
                        }
                        ef<?> efVarV = ef.V(typeB);
                        boolean zCode = dp.Code((Type) efVarV.Z());
                        dc dcVar = (dc) Kl.qd(field, dc.class);
                        cz<?> czVarZ = dcVar != null ? dr.Z(dvVar.Code, ckVar, efVarV, dcVar) : null;
                        boolean z3 = czVarZ != null;
                        if (czVarZ == null) {
                            czVarZ = ckVar.V(efVarV);
                        }
                        Field field2 = field;
                        V v3 = (V) linkedHashMap.put(str, new V(str, z2, zV2) { // from class: com.facetec.sdk.dv.2
                            private /* synthetic */ boolean B;
                            private /* synthetic */ cz C;
                            private /* synthetic */ ck D;
                            private /* synthetic */ boolean F;
                            private /* synthetic */ Field I;
                            private /* synthetic */ ef L;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass2(String str2, boolean z22, boolean zV22, Field field22, boolean z32, cz czVarZ2, ck ckVar2, ef efVarV2, boolean zCode2) {
                                super(str2, z22, zV22);
                                field = field22;
                                z = z32;
                                czVar = czVarZ2;
                                ckVar = ckVar2;
                                efVar = efVarV2;
                                z = zCode2;
                            }

                            @Override // com.facetec.sdk.dv.V
                            final void B(ek ekVar, Object obj) throws IllegalAccessException, IOException {
                                (z ? czVar : new ee(ckVar, czVar, efVar.V())).B(ekVar, field.get(obj));
                            }

                            @Override // com.facetec.sdk.dv.V
                            final void Code(ei eiVar, Object obj) throws IllegalAccessException, IOException {
                                Object objV = czVar.V(eiVar);
                                if (objV == null && z) {
                                    return;
                                }
                                field.set(obj, objV);
                            }

                            @Override // com.facetec.sdk.dv.V
                            public final boolean V(Object obj) throws IllegalAccessException, IOException {
                                return this.V && field.get(obj) != obj;
                            }
                        });
                        if (v2 == null) {
                            v2 = v3;
                        }
                        dvVar = this;
                        zV = z22;
                        z22 = false;
                        field = field22;
                    }
                    if (v2 != null) {
                        throw new IllegalArgumentException(new StringBuilder().append(typeV).append(" declares multiple JSON fields named ").append(v2.Z).toString());
                    }
                }
                i2++;
                dvVar = this;
            }
            efVar = ef.V(dh.B(efVar.V(), clsZ, clsZ.getGenericSuperclass()));
            clsZ = efVar.Z();
            dvVar = this;
        }
        return linkedHashMap;
    }

    @Override // com.facetec.sdk.cy
    public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
        Class<? super T> clsZ = efVar.Z();
        if (Object.class.isAssignableFrom(clsZ)) {
            return new Code(this.Code.V(efVar), Z(ckVar, efVar, clsZ));
        }
        return null;
    }
}
