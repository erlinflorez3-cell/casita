package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import com.facebook.hermes.intl.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class ek implements Closeable, Flushable {
    private static final String[] B;
    private static final String[] I = new String[128];
    private String C;
    private boolean D;
    private String F;
    private boolean L;
    private String S;
    private final Writer Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3154a;
    private int[] Code = new int[32];
    private int V = 0;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            I[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = I;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        B = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public ek(Writer writer) {
        I(6);
        this.F = Global.COLON;
        this.f3154a = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.Z = writer;
    }

    private void B(int i2) {
        this.Code[this.V - 1] = i2;
    }

    private void C() throws IOException {
        if (this.C != null) {
            c();
            Z(this.C);
            this.C = null;
        }
    }

    private int Code() {
        int i2 = this.V;
        if (i2 != 0) {
            return this.Code[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private ek Code(int i2, int i3, char c2) throws IOException {
        int iCode = Code();
        if (iCode != i3 && iCode != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.C != null) {
            throw new IllegalStateException(new StringBuilder("Dangling name: ").append(this.C).toString());
        }
        this.V--;
        if (iCode == i3) {
            d();
        }
        this.Z.write(c2);
        return this;
    }

    private void I(int i2) {
        int i3 = this.V;
        int[] iArr = this.Code;
        if (i3 == iArr.length) {
            this.Code = Arrays.copyOf(iArr, i3 << 1);
        }
        int[] iArr2 = this.Code;
        int i4 = this.V;
        this.V = i4 + 1;
        iArr2[i4] = i2;
    }

    private ek V(int i2, char c2) throws IOException {
        b();
        I(i2);
        this.Z.write(c2);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Z(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.L
            if (r0 == 0) goto L42
            java.lang.String[] r7 = com.facetec.sdk.ek.B
        L6:
            java.io.Writer r0 = r8.Z
            r6 = 34
            r0.write(r6)
            int r5 = r9.length()
            r4 = 0
            r3 = r4
        L13:
            if (r4 >= r5) goto L45
            char r1 = r9.charAt(r4)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L24
            r2 = r7[r1]
            if (r2 != 0) goto L2a
        L21:
            int r4 = r4 + 1
            goto L13
        L24:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L3b
            java.lang.String r2 = "\\u2028"
        L2a:
            if (r3 >= r4) goto L33
            java.io.Writer r1 = r8.Z
            int r0 = r4 - r3
            r1.write(r9, r3, r0)
        L33:
            java.io.Writer r0 = r8.Z
            r0.write(r2)
            int r3 = r4 + 1
            goto L21
        L3b:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L21
            java.lang.String r2 = "\\u2029"
            goto L2a
        L42:
            java.lang.String[] r7 = com.facetec.sdk.ek.I
            goto L6
        L45:
            if (r3 >= r5) goto L4d
            java.io.Writer r0 = r8.Z
            int r5 = r5 - r3
            r0.write(r9, r3, r5)
        L4d:
            java.io.Writer r0 = r8.Z
            r0.write(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ek.Z(java.lang.String):void");
    }

    private void b() throws IOException {
        int iCode = Code();
        if (iCode == 1) {
            B(2);
            d();
            return;
        }
        if (iCode == 2) {
            this.Z.append(AbstractJsonLexerKt.COMMA);
            d();
        } else {
            if (iCode == 4) {
                this.Z.append((CharSequence) this.F);
                B(5);
                return;
            }
            if (iCode != 6) {
                if (iCode != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.D) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            B(7);
        }
    }

    private void c() throws IOException {
        int iCode = Code();
        if (iCode == 5) {
            this.Z.write(44);
        } else if (iCode != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        d();
        B(4);
    }

    private void d() throws IOException {
        if (this.S == null) {
            return;
        }
        this.Z.write(10);
        int i2 = this.V;
        for (int i3 = 1; i3 < i2; i3++) {
            this.Z.write(this.S);
        }
    }

    public ek B() throws IOException {
        return Code(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    public final void B(String str) {
        if (str.length() == 0) {
            this.S = null;
            this.F = Global.COLON;
        } else {
            this.S = str;
            this.F = ": ";
        }
    }

    public final void B(boolean z2) {
        this.D = z2;
    }

    public ek Code(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.C != null) {
            throw new IllegalStateException();
        }
        if (this.V == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.C = str;
        return this;
    }

    public final void Code(boolean z2) {
        this.f3154a = z2;
    }

    public final boolean D() {
        return this.D;
    }

    public ek F() throws IOException {
        if (this.C != null) {
            if (!this.f3154a) {
                this.C = null;
                return this;
            }
            C();
        }
        b();
        this.Z.write("null");
        return this;
    }

    public ek I() throws IOException {
        C();
        return V(3, AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public ek I(Number number) throws IOException {
        if (number == null) {
            return F();
        }
        C();
        String string = number.toString();
        if (!this.D && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        b();
        this.Z.append((CharSequence) string);
        return this;
    }

    public ek I(boolean z2) throws IOException {
        C();
        b();
        this.Z.write(z2 ? "true" : Constants.CASEFIRST_FALSE);
        return this;
    }

    public final boolean L() {
        return this.f3154a;
    }

    public final boolean S() {
        return this.L;
    }

    public ek V() throws IOException {
        C();
        return V(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    public ek V(Boolean bool) throws IOException {
        if (bool == null) {
            return F();
        }
        C();
        b();
        this.Z.write(bool.booleanValue() ? "true" : Constants.CASEFIRST_FALSE);
        return this;
    }

    public ek V(String str) throws IOException {
        if (str == null) {
            return F();
        }
        C();
        b();
        Z(str);
        return this;
    }

    public final void V(boolean z2) {
        this.L = z2;
    }

    public ek Z() throws IOException {
        return Code(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    public ek Z(long j2) throws IOException {
        C();
        b();
        this.Z.write(Long.toString(j2));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.Z.close();
        int i2 = this.V;
        if (i2 > 1 || (i2 == 1 && this.Code[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.V = 0;
    }

    public void flush() throws IOException {
        if (this.V == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.Z.flush();
    }
}
