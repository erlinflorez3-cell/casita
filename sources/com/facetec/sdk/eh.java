package com.facetec.sdk;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eh {
    private static final eh V;

    static {
        V = dk.Z() < 9 ? new ej() : new eg();
    }

    public static eh B() {
        return V;
    }

    public abstract void B(AccessibleObject accessibleObject);
}
