package com.facetec.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes3.dex */
public final class ck {
    private static ef<?> B = ef.I(Object.class);
    private boolean C;
    private Map<ef<?>, cz<?>> Code;
    private boolean D;
    private boolean F;
    private ThreadLocal<Map<ef<?>, I<?>>> I;
    private boolean L;
    private List<cy> S;
    private dr V;
    private dg Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3096e;

    static class I<T> extends cz<T> {
        private cz<T> V;

        I() {
        }

        @Override // com.facetec.sdk.cz
        public final void B(ek ekVar, T t2) throws IOException {
            cz<T> czVar = this.V;
            if (czVar == null) {
                throw new IllegalStateException();
            }
            czVar.B(ekVar, t2);
        }

        public final void I(cz<T> czVar) {
            if (this.V != null) {
                throw new AssertionError();
            }
            this.V = czVar;
        }

        @Override // com.facetec.sdk.cz
        public final T V(ei eiVar) throws IOException {
            cz<T> czVar = this.V;
            if (czVar != null) {
                return czVar.V(eiVar);
            }
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ck() {
        dj djVar = dj.Code;
        ch chVar = ch.IDENTITY;
        Map mapEmptyMap = Collections.emptyMap();
        cw cwVar = cw.DEFAULT;
        Collections.emptyList();
        Collections.emptyList();
        this(djVar, chVar, mapEmptyMap, false, false, false, true, false, false, false, cwVar, Collections.emptyList());
    }

    ck(dj djVar, cj cjVar, Map<Type, cq<?>> map, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, cw cwVar, List<cy> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new fd());
        this.I = new ThreadLocal<>();
        this.Code = new ConcurrentHashMap();
        this.Z = new dg(map);
        this.L = z2;
        this.C = z4;
        this.F = z5;
        this.D = z6;
        this.f3096e = z7;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(eb.f3137p);
        arrayList2.add(dw.Z);
        arrayList2.add(djVar);
        arrayList2.addAll(arrayList);
        arrayList2.add(eb.f3129h);
        arrayList2.add(eb.D);
        arrayList2.add(eb.V);
        arrayList2.add(eb.Z);
        arrayList2.add(eb.C);
        final cz<Number> czVar = cwVar == cw.DEFAULT ? eb.f3122a : new cz<Number>() { // from class: com.facetec.sdk.ck.4
            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    ekVar.F();
                } else {
                    ekVar.V(number2.toString());
                }
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Number V(ei eiVar) throws IOException {
                if (eiVar.D() != el.NULL) {
                    return Long.valueOf(eiVar.a());
                }
                eiVar.S();
                return null;
            }
        };
        arrayList2.add(eb.Z(Long.TYPE, Long.class, czVar));
        arrayList2.add(eb.Z(Double.TYPE, Double.class, z8 ? eb.f3124c : new cz<Number>() { // from class: com.facetec.sdk.ck.1
            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    ekVar.F();
                } else {
                    ck.B(number2.doubleValue());
                    ekVar.I(number2);
                }
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Number V(ei eiVar) throws IOException {
                if (eiVar.D() != el.NULL) {
                    return Double.valueOf(eiVar.c());
                }
                eiVar.S();
                return null;
            }
        }));
        arrayList2.add(eb.Z(Float.TYPE, Float.class, z8 ? eb.f3126e : new cz<Number>() { // from class: com.facetec.sdk.ck.5
            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    ekVar.F();
                } else {
                    ck.B(number2.floatValue());
                    ekVar.I(number2);
                }
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Number V(ei eiVar) throws IOException {
                if (eiVar.D() != el.NULL) {
                    return Float.valueOf((float) eiVar.c());
                }
                eiVar.S();
                return null;
            }
        }));
        arrayList2.add(eb.f3125d);
        arrayList2.add(eb.L);
        arrayList2.add(eb.F);
        arrayList2.add(eb.V(AtomicLong.class, new cz<AtomicLong>() { // from class: com.facetec.sdk.ck.3
            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, AtomicLong atomicLong) throws IOException {
                czVar.B(ekVar, Long.valueOf(atomicLong.get()));
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ AtomicLong V(ei eiVar) throws IOException {
                return new AtomicLong(((Number) czVar.V(eiVar)).longValue());
            }
        }.Code()));
        arrayList2.add(eb.V(AtomicLongArray.class, new cz<AtomicLongArray>() { // from class: com.facetec.sdk.ck.2
            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, AtomicLongArray atomicLongArray) throws IOException {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                ekVar.V();
                int length = atomicLongArray2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    czVar.B(ekVar, Long.valueOf(atomicLongArray2.get(i2)));
                }
                ekVar.Z();
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ AtomicLongArray V(ei eiVar) throws IOException {
                ArrayList arrayList3 = new ArrayList();
                eiVar.I();
                while (eiVar.V()) {
                    arrayList3.add(Long.valueOf(((Number) czVar.V(eiVar)).longValue()));
                }
                eiVar.B();
                int size = arrayList3.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList3.get(i2)).longValue());
                }
                return atomicLongArray;
            }
        }.Code()));
        arrayList2.add(eb.S);
        arrayList2.add(eb.f3123b);
        arrayList2.add(eb.f3127f);
        arrayList2.add(eb.f3128g);
        arrayList2.add(eb.V(BigDecimal.class, eb.f3131j));
        arrayList2.add(eb.V(BigInteger.class, eb.f3130i));
        arrayList2.add(eb.f3134m);
        arrayList2.add(eb.f3135n);
        arrayList2.add(eb.f3136o);
        arrayList2.add(eb.f3133l);
        arrayList2.add(eb.f3141t);
        arrayList2.add(eb.f3132k);
        arrayList2.add(eb.Code);
        arrayList2.add(dt.Z);
        arrayList2.add(eb.f3139r);
        arrayList2.add(ec.B);
        arrayList2.add(dy.I);
        arrayList2.add(eb.f3140s);
        arrayList2.add(ds.I);
        arrayList2.add(eb.B);
        arrayList2.add(new dq(this.Z));
        arrayList2.add(new dz(this.Z, z3));
        dr drVar = new dr(this.Z);
        this.V = drVar;
        arrayList2.add(drVar);
        arrayList2.add(eb.f3143v);
        arrayList2.add(new dv(this.Z, cjVar, djVar));
        this.S = Collections.unmodifiableList(arrayList2);
    }

    static void B(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(new StringBuilder().append(d2).append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
        }
    }

    private ek V(Writer writer) throws IOException {
        if (this.C) {
            writer.write(")]}'\n");
        }
        ek ekVar = new ek(writer);
        if (this.D) {
            ekVar.B("  ");
        }
        ekVar.Code(this.L);
        return ekVar;
    }

    private <T> T V(ei eiVar, Type type) throws da, cu {
        boolean zI = eiVar.i();
        boolean z2 = true;
        eiVar.Z(true);
        try {
            try {
                try {
                    try {
                        eiVar.D();
                        z2 = false;
                        return V(ef.V(type)).V(eiVar);
                    } catch (IOException e2) {
                        throw new da(e2);
                    } catch (IllegalStateException e3) {
                        throw new da(e3);
                    }
                } catch (EOFException e4) {
                    if (!z2) {
                        throw new da(e4);
                    }
                    eiVar.Z(zI);
                    return null;
                }
            } catch (AssertionError e5) {
                AssertionError assertionError = new AssertionError(new StringBuilder("AssertionError (GSON 2.8.6): ").append(e5.getMessage()).toString());
                assertionError.initCause(e5);
                throw assertionError;
            }
        } finally {
            eiVar.Z(zI);
        }
    }

    public final String I(Object obj) {
        if (obj != null) {
            Class<?> cls = obj.getClass();
            StringWriter stringWriter = new StringWriter();
            try {
                V(obj, cls, V(dp.B(stringWriter)));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new cu(e2);
            }
        }
        cs csVar = cs.I;
        StringWriter stringWriter2 = new StringWriter();
        try {
            ek ekVarV = V(dp.B(stringWriter2));
            boolean zD = ekVarV.D();
            ekVarV.B(true);
            boolean zS = ekVarV.S();
            ekVarV.V(this.F);
            boolean zL = ekVarV.L();
            ekVarV.Code(this.L);
            try {
                try {
                    try {
                        dp.Code(csVar, ekVarV);
                        return stringWriter2.toString();
                    } catch (AssertionError e3) {
                        AssertionError assertionError = new AssertionError(new StringBuilder("AssertionError (GSON 2.8.6): ").append(e3.getMessage()).toString());
                        assertionError.initCause(e3);
                        throw assertionError;
                    }
                } catch (IOException e4) {
                    throw new cu(e4);
                }
            } finally {
                ekVarV.B(zD);
                ekVarV.V(zS);
                ekVarV.Code(zL);
            }
        } catch (IOException e5) {
            throw new cu(e5);
        }
    }

    public final <T> cz<T> V(cy cyVar, ef<T> efVar) {
        if (!this.S.contains(cyVar)) {
            cyVar = this.V;
        }
        boolean z2 = false;
        for (cy cyVar2 : this.S) {
            if (z2) {
                cz<T> czVarV = cyVar2.V(this, efVar);
                if (czVarV != null) {
                    return czVarV;
                }
            } else if (cyVar2 == cyVar) {
                z2 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize ".concat(String.valueOf(efVar)));
    }

    public final <T> cz<T> V(ef<T> efVar) {
        boolean z2;
        cz<T> czVar = (cz) this.Code.get(efVar == null ? B : efVar);
        if (czVar != null) {
            return czVar;
        }
        Map<ef<?>, I<?>> map = this.I.get();
        if (map == null) {
            map = new HashMap<>();
            this.I.set(map);
            z2 = true;
        } else {
            z2 = false;
        }
        I<?> i2 = map.get(efVar);
        if (i2 != null) {
            return i2;
        }
        try {
            I<?> i3 = new I<>();
            map.put(efVar, i3);
            Iterator<cy> it = this.S.iterator();
            while (it.hasNext()) {
                cz<T> czVarV = it.next().V(this, efVar);
                if (czVarV != null) {
                    i3.I(czVarV);
                    this.Code.put(efVar, czVarV);
                    return czVarV;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle ".concat(String.valueOf(efVar)));
        } finally {
            map.remove(efVar);
            if (z2) {
                this.I.remove();
            }
        }
    }

    public final <T> cz<T> V(Class<T> cls) {
        return V(ef.I(cls));
    }

    public final void V(Object obj, Type type, ek ekVar) throws cu {
        cz czVarV = V(ef.V(type));
        boolean zD = ekVar.D();
        ekVar.B(true);
        boolean zS = ekVar.S();
        ekVar.V(this.F);
        boolean zL = ekVar.L();
        ekVar.Code(this.L);
        try {
            try {
                try {
                    czVarV.B(ekVar, obj);
                } catch (IOException e2) {
                    throw new cu(e2);
                }
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError(new StringBuilder("AssertionError (GSON 2.8.6): ").append(e3.getMessage()).toString());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            ekVar.B(zD);
            ekVar.V(zS);
            ekVar.Code(zL);
        }
    }

    public final <T> T Z(String str, Class<T> cls) throws da {
        ei eiVar = new ei(new StringReader(str));
        eiVar.Z(this.f3096e);
        Object objV = V(eiVar, cls);
        if (objV != null) {
            try {
                if (eiVar.D() != el.END_DOCUMENT) {
                    throw new cu("JSON document was not fully consumed.");
                }
            } catch (em e2) {
                throw new da(e2);
            } catch (IOException e3) {
                throw new cu(e3);
            }
        }
        if (cls == Integer.TYPE) {
            cls = (Class<T>) Integer.class;
        } else if (cls == Float.TYPE) {
            cls = (Class<T>) Float.class;
        } else if (cls == Byte.TYPE) {
            cls = (Class<T>) Byte.class;
        } else if (cls == Double.TYPE) {
            cls = (Class<T>) Double.class;
        } else if (cls == Long.TYPE) {
            cls = (Class<T>) Long.class;
        } else if (cls == Character.TYPE) {
            cls = (Class<T>) Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = (Class<T>) Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = (Class<T>) Short.class;
        } else if (cls == Void.TYPE) {
            cls = (Class<T>) Void.class;
        }
        return cls.cast(objV);
    }

    public final String toString() {
        return new StringBuilder("{serializeNulls:").append(this.L).append(",factories:").append(this.S).append(",instanceCreators:").append(this.Z).append("}").toString();
    }
}
