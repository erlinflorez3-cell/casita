package com.facetec.sdk;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class dm<K, V> extends AbstractMap<K, V> implements Serializable {
    private static /* synthetic */ boolean S = true;
    private static final Comparator<Comparable> V = new Comparator<Comparable>() { // from class: com.facetec.sdk.dm.2
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };
    int B;
    private Z<K, V> C;
    final Z<K, V> Code;
    private dm<K, V>.B F;
    int I;
    private dm<K, V>.Code L;
    private Comparator<? super K> Z;

    class B extends AbstractSet<Map.Entry<K, V>> {
        B() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            dm.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && dm.this.V((Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new V(this) { // from class: com.facetec.sdk.dm.B.5
                {
                    dm dmVar = dm.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return Z();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Z<K, V> zV;
            if (!(obj instanceof Map.Entry) || (zV = dm.this.V((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            dm.this.I((Z) zV, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return dm.this.B;
        }
    }

    final class Code extends AbstractSet<K> {
        Code() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            dm.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return dm.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new V(this) { // from class: com.facetec.sdk.dm.Code.4
                {
                    dm dmVar = dm.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return Z().S;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return dm.this.Code(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return dm.this.B;
        }
    }

    abstract class V<T> implements Iterator<T> {
        private int B;
        private Z<K, V> Code;
        private Z<K, V> I = null;

        V() {
            this.Code = dm.this.Code.Code;
            this.B = dm.this.I;
        }

        final Z<K, V> Z() {
            Z<K, V> z2 = this.Code;
            if (z2 == dm.this.Code) {
                throw new NoSuchElementException();
            }
            if (dm.this.I != this.B) {
                throw new ConcurrentModificationException();
            }
            this.Code = z2.Code;
            this.I = z2;
            return z2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.Code != dm.this.Code;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Z<K, V> z2 = this.I;
            if (z2 == null) {
                throw new IllegalStateException();
            }
            dm.this.I((Z) z2, true);
            this.I = null;
            this.B = dm.this.I;
        }
    }

    static final class Z<K, V> implements Map.Entry<K, V> {
        Z<K, V> B;
        Z<K, V> Code;
        int D;
        Z<K, V> I;
        V L;
        final K S;
        Z<K, V> V;
        Z<K, V> Z;

        Z() {
            this.S = null;
            this.I = this;
            this.Code = this;
        }

        Z(Z<K, V> z2, K k2, Z<K, V> z3, Z<K, V> z4) {
            this.B = z2;
            this.S = k2;
            this.D = 1;
            this.Code = z3;
            this.I = z4;
            z4.Code = this;
            z3.I = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k2 = this.S;
                if (k2 != null ? k2.equals(entry.getKey()) : entry.getKey() == null) {
                    V v2 = this.L;
                    if (v2 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v2.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.S;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.L;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k2 = this.S;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v2 = this.L;
            return iHashCode ^ (v2 != null ? v2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v2) {
            V v3 = this.L;
            this.L = v2;
            return v3;
        }

        public final String toString() {
            return new StringBuilder().append(this.S).append("=").append(this.L).toString();
        }
    }

    public dm() {
        this(V);
    }

    private dm(Comparator<? super K> comparator) {
        this.B = 0;
        this.I = 0;
        this.Code = new Z<>();
        this.Z = comparator == null ? V : comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Z<K, V> B(Object obj) {
        if (obj != 0) {
            try {
                return Code(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    private Z<K, V> Code(K k2, boolean z2) {
        int iCompareTo;
        Z<K, V> z3;
        Comparator<? super K> comparator = this.Z;
        Z<K, V> z4 = this.C;
        if (z4 != null) {
            Comparable comparable = comparator == V ? (Comparable) k2 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(z4.S) : comparator.compare(k2, z4.S);
                if (iCompareTo != 0) {
                    Z<K, V> z5 = iCompareTo < 0 ? z4.Z : z4.V;
                    if (z5 == null) {
                        break;
                    }
                    z4 = z5;
                } else {
                    return z4;
                }
            }
        } else {
            iCompareTo = 0;
        }
        if (!z2) {
            return null;
        }
        Z<K, V> z6 = this.Code;
        if (z4 != null) {
            z3 = new Z<>(z4, k2, z6, z6.I);
            if (iCompareTo < 0) {
                z4.Z = z3;
            } else {
                z4.V = z3;
            }
            V((Z) z4, true);
        } else {
            if (comparator == V && !(k2 instanceof Comparable)) {
                throw new ClassCastException(new StringBuilder().append(k2.getClass().getName()).append(" is not Comparable").toString());
            }
            z3 = new Z<>(z4, k2, z6, z6.I);
            this.C = z3;
        }
        this.B++;
        this.I++;
        return z3;
    }

    private void Code(Z<K, V> z2) {
        Z<K, V> z3 = z2.Z;
        Z<K, V> z4 = z2.V;
        Z<K, V> z5 = z3.Z;
        Z<K, V> z6 = z3.V;
        z2.Z = z6;
        if (z6 != null) {
            z6.B = z2;
        }
        I(z2, z3);
        z3.V = z2;
        z2.B = z3;
        z2.D = Math.max(z4 != null ? z4.D : 0, z6 != null ? z6.D : 0) + 1;
        z3.D = Math.max(z2.D, z5 != null ? z5.D : 0) + 1;
    }

    private void I(Z<K, V> z2, Z<K, V> z3) {
        Z<K, V> z4 = z2.B;
        z2.B = null;
        if (z3 != null) {
            z3.B = z4;
        }
        if (z4 == null) {
            this.C = z3;
            return;
        }
        if (z4.Z == z2) {
            z4.Z = z3;
        } else {
            if (!S && z4.V != z2) {
                throw new AssertionError();
            }
            z4.V = z3;
        }
    }

    private void V(Z<K, V> z2) {
        Z<K, V> z3 = z2.Z;
        Z<K, V> z4 = z2.V;
        Z<K, V> z5 = z4.Z;
        Z<K, V> z6 = z4.V;
        z2.V = z5;
        if (z5 != null) {
            z5.B = z2;
        }
        I(z2, z4);
        z4.Z = z2;
        z2.B = z4;
        z2.D = Math.max(z3 != null ? z3.D : 0, z5 != null ? z5.D : 0) + 1;
        z4.D = Math.max(z2.D, z6 != null ? z6.D : 0) + 1;
    }

    private void V(Z<K, V> z2, boolean z3) {
        while (z2 != null) {
            Z<K, V> z4 = z2.Z;
            Z<K, V> z5 = z2.V;
            int i2 = z4 != null ? z4.D : 0;
            int i3 = z5 != null ? z5.D : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                Z<K, V> z6 = z5.Z;
                Z<K, V> z7 = z5.V;
                int i5 = (z6 != null ? z6.D : 0) - (z7 != null ? z7.D : 0);
                if (i5 == -1 || (i5 == 0 && !z3)) {
                    V((Z) z2);
                } else {
                    if (!S && i5 != 1) {
                        throw new AssertionError();
                    }
                    Code((Z) z5);
                    V((Z) z2);
                }
                if (z3) {
                    return;
                }
            } else if (i4 == 2) {
                Z<K, V> z8 = z4.Z;
                Z<K, V> z9 = z4.V;
                int i6 = (z8 != null ? z8.D : 0) - (z9 != null ? z9.D : 0);
                if (i6 == 1 || (i6 == 0 && !z3)) {
                    Code((Z) z2);
                } else {
                    if (!S && i6 != -1) {
                        throw new AssertionError();
                    }
                    V((Z) z4);
                    Code((Z) z2);
                }
                if (z3) {
                    return;
                }
            } else if (i4 == 0) {
                z2.D = i2 + 1;
                if (z3) {
                    return;
                }
            } else {
                if (!S && i4 != -1 && i4 != 1) {
                    throw new AssertionError();
                }
                z2.D = Math.max(i2, i3) + 1;
                if (!z3) {
                    return;
                }
            }
            z2 = z2.B;
        }
    }

    private static boolean V(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    final Z<K, V> Code(Object obj) {
        Z<K, V> zB = B(obj);
        if (zB != null) {
            I((Z) zB, true);
        }
        return zB;
    }

    final void I(Z<K, V> z2, boolean z3) {
        int i2;
        if (z3) {
            z2.I.Code = z2.Code;
            z2.Code.I = z2.I;
        }
        Z<K, V> z4 = z2.Z;
        Z<K, V> z5 = z2.V;
        Z<K, V> z6 = z2.B;
        int i3 = 0;
        if (z4 == null || z5 == null) {
            if (z4 != null) {
                I(z2, z4);
                z2.Z = null;
            } else if (z5 != null) {
                I(z2, z5);
                z2.V = null;
            } else {
                I(z2, (Z) null);
            }
            V((Z) z6, false);
            this.B--;
            this.I++;
            return;
        }
        if (z4.D > z5.D) {
            Z<K, V> z7 = z4.V;
            while (true) {
                z5 = z4;
                z4 = z7;
                if (z4 == null) {
                    break;
                } else {
                    z7 = z4.V;
                }
            }
        } else {
            while (true) {
                Z<K, V> z8 = z5.Z;
                if (z8 == null) {
                    break;
                } else {
                    z5 = z8;
                }
            }
        }
        I((Z) z5, false);
        Z<K, V> z9 = z2.Z;
        if (z9 != null) {
            i2 = z9.D;
            z5.Z = z9;
            z9.B = z5;
            z2.Z = null;
        } else {
            i2 = 0;
        }
        Z<K, V> z10 = z2.V;
        if (z10 != null) {
            i3 = z10.D;
            z5.V = z10;
            z10.B = z5;
            z2.V = null;
        }
        z5.D = Math.max(i2, i3) + 1;
        I(z2, z5);
    }

    final Z<K, V> V(Map.Entry<?, ?> entry) {
        Z<K, V> zB = B(entry.getKey());
        if (zB == null || !V(zB.L, entry.getValue())) {
            return null;
        }
        return zB;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.C = null;
        this.B = 0;
        this.I++;
        Z<K, V> z2 = this.Code;
        z2.I = z2;
        z2.Code = z2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return B(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        dm<K, V>.B b2 = this.F;
        if (b2 != null) {
            return b2;
        }
        dm<K, V>.B b3 = new B();
        this.F = b3;
        return b3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Z<K, V> zB = B(obj);
        if (zB != null) {
            return zB.L;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        dm<K, V>.Code code = this.L;
        if (code != null) {
            return code;
        }
        dm<K, V>.Code code2 = new Code();
        this.L = code2;
        return code2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v2) {
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        Z<K, V> zCode = Code(k2, true);
        V v3 = zCode.L;
        zCode.L = v2;
        return v3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Z<K, V> zCode = Code(obj);
        if (zCode != null) {
            return zCode.L;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.B;
    }
}
