package com.facetec.sdk;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import yg.Kl;

/* JADX INFO: loaded from: classes3.dex */
public final class dj implements cy, Cloneable {
    public static final dj Code = new dj();
    private boolean V;
    private double I = -1.0d;
    private int B = 136;
    private boolean Z = true;
    private List<cj> S = Collections.emptyList();
    private List<cj> F = Collections.emptyList();

    /* JADX INFO: renamed from: com.facetec.sdk.dj$2 */
    final class AnonymousClass2<T> extends cz<T> {
        private /* synthetic */ ef B;
        private /* synthetic */ ck Code;
        private cz<T> I;
        private /* synthetic */ boolean V;
        private /* synthetic */ boolean Z;

        AnonymousClass2(boolean z2, boolean z3, ck ckVar, ef efVar) {
            z = z2;
            z = z3;
            ckVar = ckVar;
            efVar = efVar;
        }

        private cz<T> Z() {
            cz<T> czVar = this.I;
            if (czVar != null) {
                return czVar;
            }
            cz<T> czVarV = ckVar.V(dj.this, efVar);
            this.I = czVarV;
            return czVarV;
        }

        @Override // com.facetec.sdk.cz
        public final void B(ek ekVar, T t2) throws IOException {
            if (z) {
                ekVar.F();
            } else {
                Z().B(ekVar, t2);
            }
        }

        @Override // com.facetec.sdk.cz
        public final T V(ei eiVar) throws IOException {
            if (!z) {
                return Z().V(eiVar);
            }
            eiVar.d();
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    public dj clone() {
        try {
            return (dj) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    private static boolean B(Class<?> cls) {
        return cls.isMemberClass() && !I(cls);
    }

    private boolean B(boolean z2) {
        Iterator<cj> it = (z2 ? this.S : this.F).iterator();
        while (it.hasNext()) {
            if (it.next().I()) {
                return true;
            }
        }
        return false;
    }

    private boolean Code(df dfVar) {
        return dfVar == null || dfVar.I() <= this.I;
    }

    private static boolean Code(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    private boolean I(dd ddVar) {
        return ddVar == null || ddVar.I() > this.I;
    }

    private static boolean I(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean V(Class<?> cls) {
        if (this.I == -1.0d || Z((df) Kl.Kd(cls, df.class), (dd) Kl.Kd(cls, dd.class))) {
            return (!this.Z && B(cls)) || Code(cls);
        }
        return true;
    }

    private boolean Z(df dfVar, dd ddVar) {
        return Code(dfVar) && I(ddVar);
    }

    public final boolean B(Class<?> cls, boolean z2) {
        return V(cls) || B(z2);
    }

    public final boolean I(Field field, boolean z2) {
        de deVar;
        if ((-1) - (((-1) - this.B) | ((-1) - field.getModifiers())) != 0) {
            return true;
        }
        if ((this.I != -1.0d && !Z((df) Kl.qd(field, df.class), (dd) Kl.qd(field, dd.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.V && ((deVar = (de) Kl.qd(field, de.class)) == null || (!z2 ? deVar.V() : deVar.B()))) {
            return true;
        }
        if ((!this.Z && B(field.getType())) || Code(field.getType())) {
            return true;
        }
        List<cj> list = z2 ? this.S : this.F;
        if (list.isEmpty()) {
            return false;
        }
        new dp(field);
        Iterator<cj> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facetec.sdk.cy
    public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
        boolean zV = V(efVar.Z());
        boolean z2 = true;
        boolean z3 = zV || B(true);
        if (!zV && !B(false)) {
            z2 = false;
        }
        if (z3 || z2) {
            return new cz<T>() { // from class: com.facetec.sdk.dj.2
                private /* synthetic */ ef B;
                private /* synthetic */ ck Code;
                private cz<T> I;
                private /* synthetic */ boolean V;
                private /* synthetic */ boolean Z;

                AnonymousClass2(boolean z22, boolean z32, ck ckVar2, ef efVar2) {
                    z = z22;
                    z = z32;
                    ckVar = ckVar2;
                    efVar = efVar2;
                }

                private cz<T> Z() {
                    cz<T> czVar = this.I;
                    if (czVar != null) {
                        return czVar;
                    }
                    cz<T> czVarV = ckVar.V(dj.this, efVar);
                    this.I = czVarV;
                    return czVarV;
                }

                @Override // com.facetec.sdk.cz
                public final void B(ek ekVar, T t2) throws IOException {
                    if (z) {
                        ekVar.F();
                    } else {
                        Z().B(ekVar, t2);
                    }
                }

                @Override // com.facetec.sdk.cz
                public final T V(ei eiVar) throws IOException {
                    if (!z) {
                        return Z().V(eiVar);
                    }
                    eiVar.d();
                    return null;
                }
            };
        }
        return null;
    }
}
