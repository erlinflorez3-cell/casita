package com.facetec.sdk;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cm {
    public int B() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final boolean C() {
        return this instanceof co;
    }

    public Number Code() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final boolean D() {
        return this instanceof cv;
    }

    public final boolean F() {
        return this instanceof ct;
    }

    public double I() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean L() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final boolean S() {
        return this instanceof cs;
    }

    public String V() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long Z() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final ct d() {
        if (F()) {
            return (ct) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(String.valueOf(this)));
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            ek ekVar = new ek(stringWriter);
            ekVar.B(true);
            dp.Code(this, ekVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
