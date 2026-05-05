package com.facetec.sdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes3.dex */
public final class dg {
    private final eh Code = eh.B();
    private final Map<Type, cq<?>> I;

    public dg(Map<Type, cq<?>> map) {
        this.I = map;
    }

    private <T> dn<T> Z(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.Code.B(declaredConstructor);
            }
            return new dn<T>() { // from class: com.facetec.sdk.dg.10
                @Override // com.facetec.sdk.dn
                public final T V() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e2) {
                        throw new AssertionError(e2);
                    } catch (InstantiationException e3) {
                        throw new RuntimeException(new StringBuilder("Failed to invoke ").append(declaredConstructor).append(" with no args").toString(), e3);
                    } catch (InvocationTargetException e4) {
                        throw new RuntimeException(new StringBuilder("Failed to invoke ").append(declaredConstructor).append(" with no args").toString(), e4.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final <T> dn<T> V(ef<T> efVar) {
        final Type typeV = efVar.V();
        final Class<? super T> clsZ = efVar.Z();
        final cq<?> cqVar = this.I.get(typeV);
        if (cqVar != null) {
            return new dn<T>() { // from class: com.facetec.sdk.dg.5
                @Override // com.facetec.sdk.dn
                public final T V() {
                    return (T) cqVar.Code();
                }
            };
        }
        final cq<?> cqVar2 = this.I.get(clsZ);
        if (cqVar2 != null) {
            return new dn<T>() { // from class: com.facetec.sdk.dg.8
                @Override // com.facetec.sdk.dn
                public final T V() {
                    return (T) cqVar2.Code();
                }
            };
        }
        dn<T> dnVarZ = Z(clsZ);
        if (dnVarZ != null) {
            return dnVarZ;
        }
        dn<T> dnVar = Collection.class.isAssignableFrom(clsZ) ? SortedSet.class.isAssignableFrom(clsZ) ? new dn<T>() { // from class: com.facetec.sdk.dg.9
            @Override // com.facetec.sdk.dn
            public final T V() {
                return (T) new TreeSet();
            }
        } : EnumSet.class.isAssignableFrom(clsZ) ? new dn<T>() { // from class: com.facetec.sdk.dg.7
            @Override // com.facetec.sdk.dn
            public final T V() {
                Type type = typeV;
                if (!(type instanceof ParameterizedType)) {
                    throw new cu(new StringBuilder("Invalid EnumSet type: ").append(typeV.toString()).toString());
                }
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return (T) EnumSet.noneOf((Class) type2);
                }
                throw new cu(new StringBuilder("Invalid EnumSet type: ").append(typeV.toString()).toString());
            }
        } : Set.class.isAssignableFrom(clsZ) ? new dn<T>() { // from class: com.facetec.sdk.dg.14
            @Override // com.facetec.sdk.dn
            public final T V() {
                return (T) new LinkedHashSet();
            }
        } : Queue.class.isAssignableFrom(clsZ) ? new dn<T>() { // from class: com.facetec.sdk.dg.13
            @Override // com.facetec.sdk.dn
            public final T V() {
                return (T) new ArrayDeque();
            }
        } : new dn<T>() { // from class: com.facetec.sdk.dg.15
            @Override // com.facetec.sdk.dn
            public final T V() {
                return (T) new ArrayList();
            }
        } : Map.class.isAssignableFrom(clsZ) ? ConcurrentNavigableMap.class.isAssignableFrom(clsZ) ? new dn<T>() { // from class: com.facetec.sdk.dg.11
            @Override // com.facetec.sdk.dn
            public final T V() {
                return (T) new ConcurrentSkipListMap();
            }
        } : ConcurrentMap.class.isAssignableFrom(clsZ) ? new dn<T>() { // from class: com.facetec.sdk.dg.2
            @Override // com.facetec.sdk.dn
            public final T V() {
                return (T) new ConcurrentHashMap();
            }
        } : SortedMap.class.isAssignableFrom(clsZ) ? new dn<T>() { // from class: com.facetec.sdk.dg.1
            @Override // com.facetec.sdk.dn
            public final T V() {
                return (T) new TreeMap();
            }
        } : (!(typeV instanceof ParameterizedType) || String.class.isAssignableFrom(ef.V(((ParameterizedType) typeV).getActualTypeArguments()[0]).Z())) ? new dn<T>() { // from class: com.facetec.sdk.dg.3
            @Override // com.facetec.sdk.dn
            public final T V() {
                return (T) new dm();
            }
        } : new dn<T>() { // from class: com.facetec.sdk.dg.4
            @Override // com.facetec.sdk.dn
            public final T V() {
                return (T) new LinkedHashMap();
            }
        } : null;
        return dnVar != null ? dnVar : new dn<T>() { // from class: com.facetec.sdk.dg.6
            private final Cdo Z = Cdo.B();

            @Override // com.facetec.sdk.dn
            public final T V() {
                try {
                    return (T) this.Z.I(clsZ);
                } catch (Exception e2) {
                    throw new RuntimeException(new StringBuilder("Unable to invoke no-args constructor for ").append(typeV).append(". Registering an InstanceCreator with Gson for this type may fix this problem.").toString(), e2);
                }
            }
        };
    }

    public final String toString() {
        return this.I.toString();
    }
}
