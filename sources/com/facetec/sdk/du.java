package com.facetec.sdk;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class du extends ei {
    private static final Object Code;
    private String[] B;
    private int[] C;
    private Object[] I;
    private int V;

    /* JADX INFO: renamed from: com.facetec.sdk.du$4 */
    final class AnonymousClass4 extends Reader {
        AnonymousClass4() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i2, int i3) throws IOException {
            throw new AssertionError();
        }
    }

    static {
        new Reader() { // from class: com.facetec.sdk.du.4
            AnonymousClass4() {
            }

            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                throw new AssertionError();
            }

            @Override // java.io.Reader
            public final int read(char[] cArr, int i2, int i3) throws IOException {
                throw new AssertionError();
            }
        };
        Code = new Object();
    }

    private void B(Object obj) {
        int i2 = this.V;
        Object[] objArr = this.I;
        if (i2 == objArr.length) {
            int i3 = i2 << 1;
            this.I = Arrays.copyOf(objArr, i3);
            this.C = Arrays.copyOf(this.C, i3);
            this.B = (String[]) Arrays.copyOf(this.B, i3);
        }
        Object[] objArr2 = this.I;
        int i4 = this.V;
        this.V = i4 + 1;
        objArr2[i4] = obj;
    }

    private void Z(el elVar) throws IOException {
        if (D() != elVar) {
            throw new IllegalStateException(new StringBuilder("Expected ").append(elVar).append(" but was ").append(D()).append(o()).toString());
        }
    }

    private Object j() {
        return this.I[this.V - 1];
    }

    private Object n() {
        Object[] objArr = this.I;
        int i2 = this.V - 1;
        this.V = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    private String o() {
        return new StringBuilder(" at path ").append(h()).toString();
    }

    @Override // com.facetec.sdk.ei
    public final void B() throws IOException {
        Z(el.END_ARRAY);
        n();
        n();
        int i2 = this.V;
        if (i2 > 0) {
            int[] iArr = this.C;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.facetec.sdk.ei
    public final String C() throws IOException {
        Z(el.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) j()).next();
        String str = (String) entry.getKey();
        this.B[this.V - 1] = str;
        B(entry.getValue());
        return str;
    }

    @Override // com.facetec.sdk.ei
    public final void Code() throws IOException {
        Z(el.BEGIN_OBJECT);
        B(((cv) j()).e().iterator());
    }

    @Override // com.facetec.sdk.ei
    public final el D() throws IOException {
        while (this.V != 0) {
            Object objJ = j();
            if (!(objJ instanceof Iterator)) {
                if (objJ instanceof cv) {
                    return el.BEGIN_OBJECT;
                }
                if (objJ instanceof co) {
                    return el.BEGIN_ARRAY;
                }
                if (!(objJ instanceof ct)) {
                    if (objJ instanceof cs) {
                        return el.NULL;
                    }
                    if (objJ == Code) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
                ct ctVar = (ct) objJ;
                if (ctVar.b()) {
                    return el.STRING;
                }
                if (ctVar.c()) {
                    return el.BOOLEAN;
                }
                if (ctVar.a()) {
                    return el.NUMBER;
                }
                throw new AssertionError();
            }
            boolean z2 = this.I[this.V - 2] instanceof cv;
            Iterator it = (Iterator) objJ;
            if (!it.hasNext()) {
                return z2 ? el.END_OBJECT : el.END_ARRAY;
            }
            if (z2) {
                return el.NAME;
            }
            B(it.next());
        }
        return el.END_DOCUMENT;
    }

    @Override // com.facetec.sdk.ei
    public final boolean F() throws IOException {
        Z(el.BOOLEAN);
        boolean zL = ((ct) n()).L();
        int i2 = this.V;
        if (i2 > 0) {
            int[] iArr = this.C;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return zL;
    }

    @Override // com.facetec.sdk.ei
    public final void I() throws IOException {
        Z(el.BEGIN_ARRAY);
        B(((co) j()).iterator());
        this.C[this.V - 1] = 0;
    }

    @Override // com.facetec.sdk.ei
    public final String L() throws IOException {
        el elVarD = D();
        if (elVarD != el.STRING && elVarD != el.NUMBER) {
            throw new IllegalStateException(new StringBuilder("Expected ").append(el.STRING).append(" but was ").append(elVarD).append(o()).toString());
        }
        String strV = ((ct) n()).V();
        int i2 = this.V;
        if (i2 > 0) {
            int[] iArr = this.C;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return strV;
    }

    @Override // com.facetec.sdk.ei
    public final void S() throws IOException {
        Z(el.NULL);
        n();
        int i2 = this.V;
        if (i2 > 0) {
            int[] iArr = this.C;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.facetec.sdk.ei
    public final boolean V() throws IOException {
        el elVarD = D();
        return (elVarD == el.END_OBJECT || elVarD == el.END_ARRAY) ? false : true;
    }

    @Override // com.facetec.sdk.ei
    public final void Z() throws IOException {
        Z(el.END_OBJECT);
        n();
        n();
        int i2 = this.V;
        if (i2 > 0) {
            int[] iArr = this.C;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.facetec.sdk.ei
    public final long a() throws IOException {
        el elVarD = D();
        if (elVarD != el.NUMBER && elVarD != el.STRING) {
            throw new IllegalStateException(new StringBuilder("Expected ").append(el.NUMBER).append(" but was ").append(elVarD).append(o()).toString());
        }
        long jZ = ((ct) j()).Z();
        n();
        int i2 = this.V;
        if (i2 > 0) {
            int[] iArr = this.C;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return jZ;
    }

    @Override // com.facetec.sdk.ei
    public final int b() throws IOException {
        el elVarD = D();
        if (elVarD != el.NUMBER && elVarD != el.STRING) {
            throw new IllegalStateException(new StringBuilder("Expected ").append(el.NUMBER).append(" but was ").append(elVarD).append(o()).toString());
        }
        int iB = ((ct) j()).B();
        n();
        int i2 = this.V;
        if (i2 > 0) {
            int[] iArr = this.C;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return iB;
    }

    @Override // com.facetec.sdk.ei
    public final double c() throws IOException {
        el elVarD = D();
        if (elVarD != el.NUMBER && elVarD != el.STRING) {
            throw new IllegalStateException(new StringBuilder("Expected ").append(el.NUMBER).append(" but was ").append(elVarD).append(o()).toString());
        }
        double dI = ((ct) j()).I();
        if (!i() && (Double.isNaN(dI) || Double.isInfinite(dI))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(dI)));
        }
        n();
        int i2 = this.V;
        if (i2 > 0) {
            int[] iArr = this.C;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return dI;
    }

    @Override // com.facetec.sdk.ei, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.I = new Object[]{Code};
        this.V = 1;
    }

    @Override // com.facetec.sdk.ei
    public final void d() throws IOException {
        if (D() == el.NAME) {
            C();
            this.B[this.V - 2] = "null";
        } else {
            n();
            int i2 = this.V;
            if (i2 > 0) {
                this.B[i2 - 1] = "null";
            }
        }
        int i3 = this.V;
        if (i3 > 0) {
            int[] iArr = this.C;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public final void e() throws IOException {
        Z(el.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) j()).next();
        B(entry.getValue());
        B(new ct((String) entry.getKey()));
    }

    @Override // com.facetec.sdk.ei
    public final String h() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (i2 < this.V) {
            Object[] objArr = this.I;
            Object obj = objArr[i2];
            if (obj instanceof co) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.C[i2]).append(AbstractJsonLexerKt.END_LIST);
                }
            } else if (obj instanceof cv) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String str = this.B[i2];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // com.facetec.sdk.ei
    public final String toString() {
        return getClass().getSimpleName();
    }
}
