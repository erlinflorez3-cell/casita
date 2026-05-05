package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class co extends cm implements Iterable<cm> {
    private final List<cm> V = new ArrayList();

    @Override // com.facetec.sdk.cm
    public final int B() {
        if (this.V.size() == 1) {
            return this.V.get(0).B();
        }
        throw new IllegalStateException();
    }

    public final void B(cm cmVar) {
        if (cmVar == null) {
            cmVar = cs.I;
        }
        this.V.add(cmVar);
    }

    public final void B(String str) {
        this.V.add(str == null ? cs.I : new ct(str));
    }

    @Override // com.facetec.sdk.cm
    public final Number Code() {
        if (this.V.size() == 1) {
            return this.V.get(0).Code();
        }
        throw new IllegalStateException();
    }

    @Override // com.facetec.sdk.cm
    public final double I() {
        if (this.V.size() == 1) {
            return this.V.get(0).I();
        }
        throw new IllegalStateException();
    }

    @Override // com.facetec.sdk.cm
    public final boolean L() {
        if (this.V.size() == 1) {
            return this.V.get(0).L();
        }
        throw new IllegalStateException();
    }

    @Override // com.facetec.sdk.cm
    public final String V() {
        if (this.V.size() == 1) {
            return this.V.get(0).V();
        }
        throw new IllegalStateException();
    }

    @Override // com.facetec.sdk.cm
    public final long Z() {
        if (this.V.size() == 1) {
            return this.V.get(0).Z();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof co) && ((co) obj).V.equals(this.V);
        }
        return true;
    }

    public final int hashCode() {
        return this.V.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<cm> iterator() {
        return this.V.iterator();
    }
}
