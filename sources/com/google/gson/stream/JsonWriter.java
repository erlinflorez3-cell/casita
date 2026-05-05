package com.google.gson.stream;

import com.dynatrace.android.agent.Global;
import com.facebook.hermes.intl.Constants;
import com.google.gson.FormattingStyle;
import com.google.gson.Strictness;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private String deferredName;
    private String formattedColon;
    private String formattedComma;
    private FormattingStyle formattingStyle;
    private boolean htmlSafe;
    private final Writer out;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;
    private Strictness strictness;
    private boolean usesEmptyNewlineAndIndent;
    private static final Pattern VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] REPLACEMENT_CHARS = new String[128];

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            REPLACEMENT_CHARS[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        push(6);
        this.strictness = Strictness.LEGACY_STRICT;
        this.serializeNulls = true;
        this.out = (Writer) Objects.requireNonNull(writer, "out == null");
        setFormattingStyle(FormattingStyle.COMPACT);
    }

    private void beforeName() throws IOException {
        int iPeek = peek();
        if (iPeek == 5) {
            this.out.write(this.formattedComma);
        } else if (iPeek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws IOException {
        int iPeek = peek();
        if (iPeek == 1) {
            replaceTop(2);
            newline();
            return;
        }
        if (iPeek == 2) {
            this.out.append((CharSequence) this.formattedComma);
            newline();
        } else {
            if (iPeek == 4) {
                this.out.append((CharSequence) this.formattedColon);
                replaceTop(5);
                return;
            }
            if (iPeek != 6) {
                if (iPeek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.strictness != Strictness.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            replaceTop(7);
        }
    }

    private JsonWriter closeScope(int i2, int i3, char c2) throws IOException {
        int iPeek = peek();
        if (iPeek != i3 && iPeek != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
        this.stackSize--;
        if (iPeek == i3) {
            newline();
        }
        this.out.write(c2);
        return this;
    }

    private static boolean isTrustedNumberType(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void newline() throws IOException {
        if (this.usesEmptyNewlineAndIndent) {
            return;
        }
        this.out.write(this.formattingStyle.getNewline());
        int i2 = this.stackSize;
        for (int i3 = 1; i3 < i2; i3++) {
            this.out.write(this.formattingStyle.getIndent());
        }
    }

    private JsonWriter openScope(int i2, char c2) throws IOException {
        beforeValue();
        push(i2);
        this.out.write(c2);
        return this;
    }

    private int peek() {
        int i2 = this.stackSize;
        if (i2 != 0) {
            return this.stack[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void push(int i2) {
        int i3 = this.stackSize;
        int[] iArr = this.stack;
        if (i3 == iArr.length) {
            this.stack = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.stack;
        int i4 = this.stackSize;
        this.stackSize = i4 + 1;
        iArr2[i4] = i2;
    }

    private void replaceTop(int i2) {
        this.stack[this.stackSize - 1] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void string(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.htmlSafe
            if (r0 == 0) goto L42
            java.lang.String[] r7 = com.google.gson.stream.JsonWriter.HTML_SAFE_REPLACEMENT_CHARS
        L6:
            java.io.Writer r0 = r8.out
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
            java.io.Writer r1 = r8.out
            int r0 = r4 - r3
            r1.write(r9, r3, r0)
        L33:
            java.io.Writer r0 = r8.out
            r0.write(r2)
            int r3 = r4 + 1
            goto L21
        L3b:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L21
            java.lang.String r2 = "\\u2029"
            goto L2a
        L42:
            java.lang.String[] r7 = com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS
            goto L6
        L45:
            if (r3 >= r5) goto L4d
            java.io.Writer r0 = r8.out
            int r5 = r5 - r3
            r0.write(r9, r3, r5)
        L4d:
            java.io.Writer r0 = r8.out
            r0.write(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonWriter.string(java.lang.String):void");
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public JsonWriter beginArray() throws IOException {
        writeDeferredName();
        return openScope(1, AbstractJsonLexerKt.BEGIN_LIST);
    }

    public JsonWriter beginObject() throws IOException {
        writeDeferredName();
        return openScope(3, AbstractJsonLexerKt.BEGIN_OBJ);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
        int i2 = this.stackSize;
        if (i2 > 1 || (i2 == 1 && this.stack[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    public JsonWriter endArray() throws IOException {
        return closeScope(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    public JsonWriter endObject() throws IOException {
        return closeScope(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    public void flush() throws IOException {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.out.flush();
    }

    public final FormattingStyle getFormattingStyle() {
        return this.formattingStyle;
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final Strictness getStrictness() {
        return this.strictness;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.strictness == Strictness.LENIENT;
    }

    public JsonWriter jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((CharSequence) str);
        return this;
    }

    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.deferredName != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iPeek = peek();
        if (iPeek != 3 && iPeek != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.deferredName = str;
        return this;
    }

    public JsonWriter nullValue() throws IOException {
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public final void setFormattingStyle(FormattingStyle formattingStyle) {
        FormattingStyle formattingStyle2 = (FormattingStyle) Objects.requireNonNull(formattingStyle);
        this.formattingStyle = formattingStyle2;
        this.formattedComma = ",";
        if (formattingStyle2.usesSpaceAfterSeparators()) {
            this.formattedColon = ": ";
            if (this.formattingStyle.getNewline().isEmpty()) {
                this.formattedComma = ", ";
            }
        } else {
            this.formattedColon = Global.COLON;
        }
        this.usesEmptyNewlineAndIndent = this.formattingStyle.getNewline().isEmpty() && this.formattingStyle.getIndent().isEmpty();
    }

    public final void setHtmlSafe(boolean z2) {
        this.htmlSafe = z2;
    }

    public final void setIndent(String str) {
        if (str.isEmpty()) {
            setFormattingStyle(FormattingStyle.COMPACT);
        } else {
            setFormattingStyle(FormattingStyle.PRETTY.withIndent(str));
        }
    }

    @Deprecated
    public final void setLenient(boolean z2) {
        setStrictness(z2 ? Strictness.LENIENT : Strictness.LEGACY_STRICT);
    }

    public final void setSerializeNulls(boolean z2) {
        this.serializeNulls = z2;
    }

    public final void setStrictness(Strictness strictness) {
        this.strictness = (Strictness) Objects.requireNonNull(strictness);
    }

    public JsonWriter value(double d2) throws IOException {
        writeDeferredName();
        if (this.strictness != Strictness.LENIENT && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
        beforeValue();
        this.out.append((CharSequence) Double.toString(d2));
        return this;
    }

    public JsonWriter value(float f2) throws IOException {
        writeDeferredName();
        if (this.strictness != Strictness.LENIENT && (Float.isNaN(f2) || Float.isInfinite(f2))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f2);
        }
        beforeValue();
        this.out.append((CharSequence) Float.toString(f2));
        return this;
    }

    public JsonWriter value(long j2) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j2));
        return this;
    }

    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? "true" : Constants.CASEFIRST_FALSE);
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!isTrustedNumberType(cls) && !VALID_JSON_NUMBER_PATTERN.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (this.strictness != Strictness.LENIENT) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
        }
        beforeValue();
        this.out.append((CharSequence) string);
        return this;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }

    public JsonWriter value(boolean z2) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(z2 ? "true" : Constants.CASEFIRST_FALSE);
        return this;
    }
}
