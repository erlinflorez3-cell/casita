package com.facetec.sdk;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class gi {
    private final Set<gc> I = new LinkedHashSet();

    public final synchronized boolean Code(gc gcVar) {
        return this.I.contains(gcVar);
    }

    public final synchronized void I(gc gcVar) {
        this.I.remove(gcVar);
    }

    public final synchronized void Z(gc gcVar) {
        this.I.add(gcVar);
    }
}
