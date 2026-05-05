package io.sentry.vendor.gson.stream;

import com.facebook.hermes.intl.Constants;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class JsonReader implements Closeable {
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final Reader in;
    private int[] pathIndices;
    private String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int[] stack;
    private boolean lenient = false;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.in = reader;
    }

    private void checkLenient() throws IOException {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() throws IOException {
        nextNonWhitespace(true);
        int i2 = this.pos;
        int i3 = i2 - 1;
        this.pos = i3;
        if (i2 + 4 <= this.limit || fillBuffer(5)) {
            char[] cArr = this.buffer;
            if (cArr[i3] == ')' && cArr[i2] == ']' && cArr[i2 + 1] == '}' && cArr[i2 + 2] == '\'' && cArr[i2 + 3] == '\n') {
                this.pos += 5;
            }
        }
    }

    private boolean fillBuffer(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.buffer;
        int i5 = this.lineStart;
        int i6 = this.pos;
        this.lineStart = i5 - i6;
        int i7 = this.limit;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.limit = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.in;
            int i9 = this.limit;
            int i10 = reader.read(cArr, i9, cArr.length - i9);
            if (i10 == -1) {
                return false;
            }
            i3 = this.limit + i10;
            this.limit = i3;
            if (this.lineNumber == 0 && (i4 = this.lineStart) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private boolean isLiteral(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    private int nextNonWhitespace(boolean z2) throws IOException {
        char[] cArr = this.buffer;
        int i2 = this.pos;
        int i3 = this.limit;
        while (true) {
            if (i2 == i3) {
                this.pos = i2;
                if (!fillBuffer(1)) {
                    if (z2) {
                        throw new EOFException("End of input" + locationString());
                    }
                    return -1;
                }
                i2 = this.pos;
                i3 = this.limit;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.lineNumber++;
                this.lineStart = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.pos = i4;
                    if (i4 == i3) {
                        this.pos = i2;
                        boolean zFillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!zFillBuffer) {
                            return c2;
                        }
                    }
                    checkLenient();
                    int i5 = this.pos;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.pos = i5 + 1;
                        if (!skipTo("*/")) {
                            throw syntaxError("Unterminated comment");
                        }
                        i2 = this.pos + 2;
                        i3 = this.limit;
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.pos = i5 + 1;
                        skipToEndOfLine();
                        i2 = this.pos;
                        i3 = this.limit;
                    }
                } else {
                    if (c2 != '#') {
                        this.pos = i4;
                        return c2;
                    }
                    this.pos = i4;
                    checkLenient();
                    skipToEndOfLine();
                    i2 = this.pos;
                    i3 = this.limit;
                }
            }
            i2 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r4) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        r1.append(r3, r4, r2 - r4);
        r9.pos = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String nextQuotedValue(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r3 = r9.buffer
            r1 = 0
        L3:
            int r2 = r9.pos
            int r8 = r9.limit
        L7:
            r4 = r2
        L8:
            r7 = 16
            r6 = 1
            if (r2 >= r8) goto L51
            int r5 = r2 + 1
            char r2 = r3[r2]
            if (r2 != r10) goto L1f
            r9.pos = r5
            int r5 = r5 - r4
            int r5 = r5 - r6
            if (r1 != 0) goto L6e
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r4, r5)
            return r0
        L1f:
            r0 = 92
            if (r2 != r0) goto L44
            r9.pos = r5
            int r5 = r5 - r4
            int r2 = r5 + (-1)
            if (r1 != 0) goto L35
            int r0 = r5 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = java.lang.Math.max(r0, r7)
            r1.<init>(r0)
        L35:
            r1.append(r3, r4, r2)
            char r0 = r9.readEscapeCharacter()
            r1.append(r0)
            int r2 = r9.pos
            int r8 = r9.limit
            goto L7
        L44:
            r0 = 10
            if (r2 != r0) goto L4f
            int r0 = r9.lineNumber
            int r0 = r0 + r6
            r9.lineNumber = r0
            r9.lineStart = r5
        L4f:
            r2 = r5
            goto L8
        L51:
            if (r1 != 0) goto L60
            int r0 = r2 - r4
            int r0 = r0 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = java.lang.Math.max(r0, r7)
            r1.<init>(r0)
        L60:
            int r0 = r2 - r4
            r1.append(r3, r4, r0)
            r9.pos = r2
            boolean r0 = r9.fillBuffer(r6)
            if (r0 == 0) goto L76
            goto L3
        L6e:
            r1.append(r3, r4, r5)
            java.lang.String r0 = r1.toString()
            return r0
        L76:
            java.lang.String r0 = "Unterminated string"
            java.io.IOException r0 = r9.syntaxError(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.JsonReader.nextQuotedValue(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
    
        checkLenient();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String nextUnquotedValue() throws java.io.IOException {
        /*
            r6 = this;
            r2 = 0
            r3 = 0
        L2:
            r4 = r3
        L3:
            int r5 = r6.pos
            int r1 = r5 + r4
            int r0 = r6.limit
            if (r1 >= r0) goto L4a
            char[] r0 = r6.buffer
            int r5 = r5 + r4
            char r1 = r0[r5]
            r0 = 9
            if (r1 == r0) goto L7c
            r0 = 10
            if (r1 == r0) goto L7c
            r0 = 12
            if (r1 == r0) goto L7c
            r0 = 13
            if (r1 == r0) goto L7c
            r0 = 32
            if (r1 == r0) goto L7c
            r0 = 35
            if (r1 == r0) goto L79
            r0 = 44
            if (r1 == r0) goto L7c
            r0 = 47
            if (r1 == r0) goto L79
            r0 = 61
            if (r1 == r0) goto L79
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L7c
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L7c
            r0 = 58
            if (r1 == r0) goto L7c
            r0 = 59
            if (r1 == r0) goto L79
            switch(r1) {
                case 91: goto L7c;
                case 92: goto L79;
                case 93: goto L7c;
                default: goto L47;
            }
        L47:
            int r4 = r4 + 1
            goto L3
        L4a:
            char[] r0 = r6.buffer
            int r0 = r0.length
            if (r4 >= r0) goto L58
            int r0 = r4 + 1
            boolean r0 = r6.fillBuffer(r0)
            if (r0 == 0) goto L7c
            goto L3
        L58:
            if (r2 != 0) goto L65
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r0 = 16
            int r0 = java.lang.Math.max(r4, r0)
            r2.<init>(r0)
        L65:
            char[] r1 = r6.buffer
            int r0 = r6.pos
            r2.append(r1, r0, r4)
            int r0 = r6.pos
            int r0 = r0 + r4
            r6.pos = r0
            r0 = 1
            boolean r0 = r6.fillBuffer(r0)
            if (r0 != 0) goto L2
            goto L7d
        L79:
            r6.checkLenient()
        L7c:
            r3 = r4
        L7d:
            if (r2 != 0) goto L8e
            java.lang.String r2 = new java.lang.String
            char[] r1 = r6.buffer
            int r0 = r6.pos
            r2.<init>(r1, r0, r3)
        L88:
            int r0 = r6.pos
            int r0 = r0 + r3
            r6.pos = r0
            return r2
        L8e:
            char[] r1 = r6.buffer
            int r0 = r6.pos
            java.lang.StringBuilder r0 = r2.append(r1, r0, r3)
            java.lang.String r2 = r0.toString()
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.JsonReader.nextUnquotedValue():java.lang.String");
    }

    private int peekKeyword() throws IOException {
        String str;
        String str2;
        int i2;
        char c2 = this.buffer[this.pos];
        if (c2 == 't' || c2 == 'T') {
            str = "true";
            str2 = "TRUE";
            i2 = 5;
        } else if (c2 == 'f' || c2 == 'F') {
            str = Constants.CASEFIRST_FALSE;
            str2 = "FALSE";
            i2 = 6;
        } else {
            if (c2 != 'n' && c2 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i2 = 7;
        }
        int length = str.length();
        for (int i3 = 1; i3 < length; i3++) {
            if (this.pos + i3 >= this.limit && !fillBuffer(i3 + 1)) {
                return 0;
            }
            char c3 = this.buffer[this.pos + i3];
            if (c3 != str.charAt(i3) && c3 != str2.charAt(i3)) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (isLiteral(r1) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r4 != 2) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (r15 == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r2 != Long.MIN_VALUE) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (r16 == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (r2 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        if (r16 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
    
        if (r16 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        r17.peekedLong = r2;
        r17.pos += r5;
        r17.peeked = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        r2 = -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e1, code lost:
    
        if (r4 == 2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e4, code lost:
    
        if (r4 == 4) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e7, code lost:
    
        if (r4 != 7) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e9, code lost:
    
        r17.peekedNumberLength = r5;
        r17.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ef, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f2, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int peekNumber() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.JsonReader.peekNumber():int");
    }

    private void push(int i2) {
        int i3 = this.stackSize;
        int[] iArr = this.stack;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.stack = Arrays.copyOf(iArr, i4);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i4);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i4);
        }
        int[] iArr2 = this.stack;
        int i5 = this.stackSize;
        this.stackSize = i5 + 1;
        iArr2[i5] = i2;
    }

    private char readEscapeCharacter() throws IOException {
        int i2;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i3 = this.pos;
        int i4 = i3 + 1;
        this.pos = i4;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.lineNumber++;
            this.lineStart = i4;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return TokenParser.CR;
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                throw syntaxError("Invalid escape sequence");
            }
            if (i3 + 5 > this.limit && !fillBuffer(4)) {
                throw syntaxError("Unterminated escape sequence");
            }
            int i5 = this.pos;
            int i6 = i5 + 4;
            char c3 = 0;
            while (i5 < i6) {
                char c4 = this.buffer[i5];
                char c5 = (char) (c3 << 4);
                if (c4 >= '0' && c4 <= '9') {
                    i2 = c4 - '0';
                } else if (c4 >= 'a' && c4 <= 'f') {
                    i2 = c4 - 'W';
                } else {
                    if (c4 < 'A' || c4 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(this.buffer, this.pos, 4)));
                    }
                    i2 = c4 - '7';
                }
                c3 = (char) (c5 + i2);
                i5++;
            }
            this.pos += 4;
            return c3;
        }
        return c2;
    }

    private void skipQuotedValue(char c2) throws IOException {
        char[] cArr = this.buffer;
        do {
            int i2 = this.pos;
            int i3 = this.limit;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = cArr[i2];
                if (c3 == c2) {
                    this.pos = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.pos = i4;
                    readEscapeCharacter();
                    i2 = this.pos;
                    i3 = this.limit;
                } else {
                    if (c3 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i4;
                    }
                    i2 = i4;
                }
            }
            this.pos = i2;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private boolean skipTo(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i2 = this.pos;
            if (cArr[i2] != '\n') {
                for (int i3 = 0; i3 < length; i3++) {
                    if (this.buffer[this.pos + i3] != str.charAt(i3)) {
                        break;
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i2 + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() throws IOException {
        char c2;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i2 = this.pos;
            int i3 = i2 + 1;
            this.pos = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.lineNumber++;
                this.lineStart = i3;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        checkLenient();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void skipUnquotedValue() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r3 = 0
        L1:
            int r2 = r4.pos
            int r1 = r2 + r3
            int r0 = r4.limit
            if (r1 >= r0) goto L48
            char[] r0 = r4.buffer
            int r2 = r2 + r3
            char r1 = r0[r2]
            r0 = 9
            if (r1 == r0) goto L56
            r0 = 10
            if (r1 == r0) goto L56
            r0 = 12
            if (r1 == r0) goto L56
            r0 = 13
            if (r1 == r0) goto L56
            r0 = 32
            if (r1 == r0) goto L56
            r0 = 35
            if (r1 == r0) goto L53
            r0 = 44
            if (r1 == r0) goto L56
            r0 = 47
            if (r1 == r0) goto L53
            r0 = 61
            if (r1 == r0) goto L53
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L56
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L56
            r0 = 58
            if (r1 == r0) goto L56
            r0 = 59
            if (r1 == r0) goto L53
            switch(r1) {
                case 91: goto L56;
                case 92: goto L53;
                case 93: goto L56;
                default: goto L45;
            }
        L45:
            int r3 = r3 + 1
            goto L1
        L48:
            int r2 = r2 + r3
            r4.pos = r2
            r0 = 1
            boolean r0 = r4.fillBuffer(r0)
            if (r0 != 0) goto L0
            return
        L53:
            r4.checkLenient()
        L56:
            int r0 = r4.pos
            int r0 = r0 + r3
            r4.pos = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.JsonReader.skipUnquotedValue():void");
    }

    private IOException syntaxError(String str) throws IOException {
        throw new MalformedJsonException(str + locationString());
    }

    public void beginArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 3) {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + locationString());
        }
        push(1);
        this.pathIndices[this.stackSize - 1] = 0;
        this.peeked = 0;
    }

    public void beginObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 1) {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + locationString());
        }
        push(3);
        this.peeked = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    int doPeek() throws IOException {
        int iNextNonWhitespace;
        int[] iArr = this.stack;
        int i2 = this.stackSize;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int iNextNonWhitespace2 = nextNonWhitespace(true);
            if (iNextNonWhitespace2 != 44) {
                if (iNextNonWhitespace2 != 59) {
                    if (iNextNonWhitespace2 != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5 && (iNextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (iNextNonWhitespace != 59) {
                        if (iNextNonWhitespace != 125) {
                            throw syntaxError("Unterminated object");
                        }
                        this.peeked = 2;
                        return 2;
                    }
                    checkLenient();
                }
                int iNextNonWhitespace3 = nextNonWhitespace(true);
                if (iNextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (iNextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (iNextNonWhitespace3 == 125) {
                    if (i3 == 5) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 2;
                    return 2;
                }
                checkLenient();
                this.pos--;
                if (!isLiteral((char) iNextNonWhitespace3)) {
                    throw syntaxError("Expected name");
                }
                this.peeked = 14;
                return 14;
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int iNextNonWhitespace4 = nextNonWhitespace(true);
                if (iNextNonWhitespace4 != 58) {
                    if (iNextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        int i4 = this.pos;
                        if (cArr[i4] == '>') {
                            this.pos = i4 + 1;
                        }
                    }
                }
            } else if (i3 == 6) {
                if (this.lenient) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i3 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iNextNonWhitespace5 = nextNonWhitespace(true);
        if (iNextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (iNextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
            if (iNextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (iNextNonWhitespace5 != 93) {
                if (iNextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos--;
                int iPeekKeyword = peekKeyword();
                if (iPeekKeyword != 0) {
                    return iPeekKeyword;
                }
                int iPeekNumber = peekNumber();
                if (iPeekNumber != 0) {
                    return iPeekNumber;
                }
                if (!isLiteral(this.buffer[this.pos])) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i3 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.pos--;
        this.peeked = 7;
        return 7;
    }

    public void endArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + locationString());
        }
        int i2 = this.stackSize;
        this.stackSize = i2 - 1;
        int[] iArr = this.pathIndices;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.peeked = 0;
    }

    public void endObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + locationString());
        }
        int i2 = this.stackSize;
        int i3 = i2 - 1;
        this.stackSize = i3;
        this.pathNames[i3] = null;
        int[] iArr = this.pathIndices;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.peeked = 0;
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.stackSize;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.stack[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.pathIndices[i3]).append(AbstractJsonLexerKt.END_LIST);
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = this.pathNames[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean hasNext() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        return (iDoPeek == 2 || iDoPeek == 4) ? false : true;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    String locationString() {
        return " at line " + (this.lineNumber + 1) + " column " + ((this.pos - this.lineStart) + 1) + " path " + getPath();
    }

    public boolean nextBoolean() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iDoPeek != 6) {
            throw new IllegalStateException("Expected a boolean but was " + peek() + locationString());
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (iDoPeek == 8 || iDoPeek == 9) {
            this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
        } else if (iDoPeek == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (iDoPeek != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + locationString());
        }
        this.peeked = 11;
        double d2 = Double.parseDouble(this.peekedString);
        if (!this.lenient && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d2 + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d2;
    }

    public int nextInt() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            long j2 = this.peekedLong;
            int i2 = (int) j2;
            if (j2 != i2) {
                throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
            }
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + locationString());
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
            }
            try {
                int i4 = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i5 = this.stackSize - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d2 = Double.parseDouble(this.peekedString);
        int i6 = (int) d2;
        if (i6 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i7 = this.stackSize - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    public long nextLong() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + locationString());
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
            }
            try {
                long j2 = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d2 = Double.parseDouble(this.peekedString);
        long j3 = (long) d2;
        if (j3 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i4 = this.stackSize - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j3;
    }

    public String nextName() throws IOException {
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            strNextQuotedValue = nextUnquotedValue();
        } else if (iDoPeek == 12) {
            strNextQuotedValue = nextQuotedValue('\'');
        } else {
            if (iDoPeek != 13) {
                throw new IllegalStateException("Expected a name but was " + peek() + locationString());
            }
            strNextQuotedValue = nextQuotedValue('\"');
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = strNextQuotedValue;
        return strNextQuotedValue;
    }

    public void nextNull() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 7) {
            throw new IllegalStateException("Expected null but was " + peek() + locationString());
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public String nextString() throws IOException {
        String str;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 10) {
            str = nextUnquotedValue();
        } else if (iDoPeek == 8) {
            str = nextQuotedValue('\'');
        } else if (iDoPeek == 9) {
            str = nextQuotedValue('\"');
        } else if (iDoPeek == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (iDoPeek == 15) {
            str = Long.toString(this.peekedLong);
        } else {
            if (iDoPeek != 16) {
                throw new IllegalStateException("Expected a string but was " + peek() + locationString());
            }
            str = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public JsonToken peek() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        switch (iDoPeek) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void setLenient(boolean z2) {
        this.lenient = z2;
    }

    public void skipValue() throws IOException {
        int i2 = 0;
        do {
            int iDoPeek = this.peeked;
            if (iDoPeek == 0) {
                iDoPeek = doPeek();
            }
            if (iDoPeek == 3) {
                push(1);
            } else if (iDoPeek == 1) {
                push(3);
            } else if (iDoPeek == 4 || iDoPeek == 2) {
                this.stackSize--;
                i2--;
                this.peeked = 0;
            } else {
                if (iDoPeek == 14 || iDoPeek == 10) {
                    skipUnquotedValue();
                } else if (iDoPeek == 8 || iDoPeek == 12) {
                    skipQuotedValue('\'');
                } else if (iDoPeek == 9 || iDoPeek == 13) {
                    skipQuotedValue('\"');
                } else if (iDoPeek == 16) {
                    this.pos += this.peekedNumberLength;
                }
                this.peeked = 0;
            }
            i2++;
            this.peeked = 0;
        } while (i2 != 0);
        int[] iArr = this.pathIndices;
        int i3 = this.stackSize;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.pathNames[i3 - 1] = "null";
    }

    public String toString() {
        return getClass().getSimpleName() + locationString();
    }
}
