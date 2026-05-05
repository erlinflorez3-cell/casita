package com.facetec.sdk;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dx extends ek {
    private static final Writer B = new Writer() { // from class: com.facetec.sdk.dx.5
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    };
    private static final ct Z = new ct("closed");
    private final List<cm> Code;
    private String I;
    private cm V;

    public dx() {
        super(B);
        this.Code = new ArrayList();
        this.V = cs.I;
    }

    private cm C() {
        return this.Code.get(r1.size() - 1);
    }

    private void I(cm cmVar) {
        if (this.I != null) {
            if (!cmVar.S() || L()) {
                ((cv) C()).I(this.I, cmVar);
            }
            this.I = null;
            return;
        }
        if (this.Code.isEmpty()) {
            this.V = cmVar;
            return;
        }
        cm cmVarC = C();
        if (!(cmVarC instanceof co)) {
            throw new IllegalStateException();
        }
        ((co) cmVarC).B(cmVar);
    }

    @Override // com.facetec.sdk.ek
    public final ek B() throws IOException {
        if (this.Code.isEmpty() || this.I != null) {
            throw new IllegalStateException();
        }
        if (!(C() instanceof cv)) {
            throw new IllegalStateException();
        }
        this.Code.remove(r1.size() - 1);
        return this;
    }

    public final cm Code() {
        if (this.Code.isEmpty()) {
            return this.V;
        }
        throw new IllegalStateException(new StringBuilder("Expected one JSON element but was ").append(this.Code).toString());
    }

    @Override // com.facetec.sdk.ek
    public final ek Code(String str) throws IOException {
        if (this.Code.isEmpty() || this.I != null) {
            throw new IllegalStateException();
        }
        if (!(C() instanceof cv)) {
            throw new IllegalStateException();
        }
        this.I = str;
        return this;
    }

    @Override // com.facetec.sdk.ek
    public final ek F() throws IOException {
        I(cs.I);
        return this;
    }

    @Override // com.facetec.sdk.ek
    public final ek I() throws IOException {
        cv cvVar = new cv();
        I(cvVar);
        this.Code.add(cvVar);
        return this;
    }

    @Override // com.facetec.sdk.ek
    public final ek I(Number number) throws IOException {
        if (number == null) {
            return F();
        }
        if (!D()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        I(new ct(number));
        return this;
    }

    @Override // com.facetec.sdk.ek
    public final ek I(boolean z2) throws IOException {
        I(new ct(Boolean.valueOf(z2)));
        return this;
    }

    @Override // com.facetec.sdk.ek
    public final ek V() throws IOException {
        co coVar = new co();
        I(coVar);
        this.Code.add(coVar);
        return this;
    }

    @Override // com.facetec.sdk.ek
    public final ek V(Boolean bool) throws IOException {
        if (bool == null) {
            return F();
        }
        I(new ct(bool));
        return this;
    }

    @Override // com.facetec.sdk.ek
    public final ek V(String str) throws IOException {
        if (str == null) {
            return F();
        }
        I(new ct(str));
        return this;
    }

    @Override // com.facetec.sdk.ek
    public final ek Z() throws IOException {
        if (this.Code.isEmpty() || this.I != null) {
            throw new IllegalStateException();
        }
        if (!(C() instanceof co)) {
            throw new IllegalStateException();
        }
        this.Code.remove(r1.size() - 1);
        return this;
    }

    @Override // com.facetec.sdk.ek
    public final ek Z(long j2) throws IOException {
        I(new ct(Long.valueOf(j2)));
        return this;
    }

    @Override // com.facetec.sdk.ek, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.Code.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.Code.add(Z);
    }

    @Override // com.facetec.sdk.ek, java.io.Flushable
    public final void flush() throws IOException {
    }
}
