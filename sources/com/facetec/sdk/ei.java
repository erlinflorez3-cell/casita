package com.facetec.sdk;

import com.facebook.hermes.intl.Constants;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class ei implements Closeable {
    private static final char[] B = ")]}'\n".toCharArray();
    private long D;
    private final Reader V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f3148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f3149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f3150c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f3152e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f3153g;
    private boolean Code = false;
    private final char[] I = new char[1024];
    private int L = 0;
    private int S = 0;
    private int F = 0;
    private int C = 0;
    int Z = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3151d = 1;

    static {
        di.B = new di() { // from class: com.facetec.sdk.ei.5
            @Override // com.facetec.sdk.di
            public final void Z(ei eiVar) throws IOException {
                if (eiVar instanceof du) {
                    ((du) eiVar).e();
                    return;
                }
                int iG = eiVar.Z;
                if (iG == 0) {
                    iG = eiVar.g();
                }
                if (iG == 13) {
                    eiVar.Z = 9;
                } else if (iG == 12) {
                    eiVar.Z = 8;
                } else {
                    if (iG != 14) {
                        throw new IllegalStateException(new StringBuilder("Expected a name but was ").append(eiVar.D()).append(eiVar.f()).toString());
                    }
                    eiVar.Z = 10;
                }
            }
        };
    }

    public ei(Reader reader) {
        int[] iArr = new int[32];
        this.f3150c = iArr;
        iArr[0] = 6;
        this.f3152e = new String[32];
        this.f3153g = new int[32];
        this.V = reader;
    }

    private int B(boolean z2) throws IOException {
        char[] cArr = this.I;
        int i2 = this.L;
        int i3 = this.S;
        while (true) {
            if (i2 == i3) {
                this.L = i2;
                if (!V(1)) {
                    if (z2) {
                        throw new EOFException(new StringBuilder("End of input").append(f()).toString());
                    }
                    return -1;
                }
                i2 = this.L;
                i3 = this.S;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.F++;
                this.C = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.L = i4;
                    if (i4 == i3) {
                        this.L = i2;
                        boolean zV = V(2);
                        this.L++;
                        if (!zV) {
                            return c2;
                        }
                    }
                    n();
                    int i5 = this.L;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.L = i5 + 1;
                        if (!Z("*/")) {
                            throw B("Unterminated comment");
                        }
                        i2 = this.L + 2;
                        i3 = this.S;
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.L = i5 + 1;
                        m();
                        i2 = this.L;
                        i3 = this.S;
                    }
                } else {
                    if (c2 != '#') {
                        this.L = i4;
                        return c2;
                    }
                    this.L = i4;
                    n();
                    m();
                    i2 = this.L;
                    i3 = this.S;
                }
            }
            i2 = i4;
        }
    }

    private IOException B(String str) throws IOException {
        throw new em(new StringBuilder().append(str).append(f()).toString());
    }

    private boolean B(char c2) throws IOException {
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
        n();
        return false;
    }

    private void Code(int i2) {
        int i3 = this.f3151d;
        int[] iArr = this.f3150c;
        if (i3 == iArr.length) {
            int i4 = i3 << 1;
            this.f3150c = Arrays.copyOf(iArr, i4);
            this.f3153g = Arrays.copyOf(this.f3153g, i4);
            this.f3152e = (String[]) Arrays.copyOf(this.f3152e, i4);
        }
        int[] iArr2 = this.f3150c;
        int i5 = this.f3151d;
        this.f3151d = i5 + 1;
        iArr2[i5] = i2;
    }

    private void I(char c2) throws IOException {
        char[] cArr = this.I;
        while (true) {
            int i2 = this.L;
            int i3 = this.S;
            while (true) {
                if (i2 < i3) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 == c2) {
                        this.L = i4;
                        return;
                    }
                    if (c3 == '\\') {
                        this.L = i4;
                        l();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.F++;
                            this.C = i4;
                        }
                        i2 = i4;
                    }
                } else {
                    this.L = i2;
                    if (!V(1)) {
                        throw B("Unterminated string");
                    }
                }
            }
        }
    }

    private String V(char c2) throws IOException {
        char[] cArr = this.I;
        StringBuilder sb = null;
        while (true) {
            int i2 = this.L;
            int i3 = this.S;
            int i4 = i2;
            while (true) {
                if (i4 < i3) {
                    int i5 = i4 + 1;
                    char c3 = cArr[i4];
                    if (c3 == c2) {
                        this.L = i5;
                        int i6 = (i5 - i2) - 1;
                        if (sb == null) {
                            return new String(cArr, i2, i6);
                        }
                        sb.append(cArr, i2, i6);
                        return sb.toString();
                    }
                    if (c3 == '\\') {
                        this.L = i5;
                        int i7 = i5 - i2;
                        int i8 = i7 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i7 << 1, 16));
                        }
                        sb.append(cArr, i2, i8);
                        sb.append(l());
                    } else {
                        if (c3 == '\n') {
                            this.F++;
                            this.C = i5;
                        }
                        i4 = i5;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i4 - i2) << 1, 16));
                    }
                    sb.append(cArr, i2, i4 - i2);
                    this.L = i4;
                    if (!V(1)) {
                        throw B("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean V(int i2) throws IOException {
        int i3;
        int i4;
        char[] cArr = this.I;
        int i5 = this.C;
        int i6 = this.L;
        this.C = i5 - i6;
        int i7 = this.S;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.S = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.S = 0;
        }
        this.L = 0;
        do {
            Reader reader = this.V;
            int i9 = this.S;
            int i10 = reader.read(cArr, i9, cArr.length - i9);
            if (i10 == -1) {
                return false;
            }
            i3 = this.S + i10;
            this.S = i3;
            if (this.F == 0 && (i4 = this.C) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.L++;
                this.C = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private boolean Z(String str) throws IOException {
        int i2;
        int length = str.length();
        while (true) {
            if (this.L + length > this.S && !V(length)) {
                return false;
            }
            char[] cArr = this.I;
            int i3 = this.L;
            if (cArr[i3] != '\n') {
                while (i2 < length) {
                    i2 = this.I[this.L + i2] == str.charAt(i2) ? i2 + 1 : 0;
                }
                return true;
            }
            this.F++;
            this.C = i3 + 1;
            this.L++;
        }
    }

    private int e() throws IOException {
        String str;
        String str2;
        int i2;
        char c2 = this.I[this.L];
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
            if (this.L + i3 >= this.S && !V(i3 + 1)) {
                return 0;
            }
            char c3 = this.I[this.L + i3];
            if (c3 != str.charAt(i3) && c3 != str2.charAt(i3)) {
                return 0;
            }
        }
        if ((this.L + length < this.S || V(length + 1)) && B(this.I[this.L + length])) {
            return 0;
        }
        this.L += length;
        this.Z = i2;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (B(r1) == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004e, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bb, code lost:
    
        if (r4 != 2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00bd, code lost:
    
        if (r15 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c3, code lost:
    
        if (r2 != Long.MIN_VALUE) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c5, code lost:
    
        if (r16 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00cb, code lost:
    
        if (r2 != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00cd, code lost:
    
        if (r16 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00cf, code lost:
    
        if (r16 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d1, code lost:
    
        r17.D = r2;
        r17.L += r5;
        r17.Z = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00dc, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00dd, code lost:
    
        r2 = -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00df, code lost:
    
        if (r4 == 2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e2, code lost:
    
        if (r4 == 4) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e5, code lost:
    
        if (r4 != 7) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e7, code lost:
    
        r17.f3148a = r5;
        r17.Z = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ed, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00ee, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int j() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ei.j():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
    
        n();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String k() throws java.io.IOException {
        /*
            r6 = this;
            r2 = 0
            r3 = 0
        L2:
            r4 = r3
        L3:
            int r5 = r6.L
            int r1 = r5 + r4
            int r0 = r6.S
            if (r1 >= r0) goto L4a
            char[] r0 = r6.I
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
            char[] r0 = r6.I
            int r0 = r0.length
            if (r4 >= r0) goto L58
            int r0 = r4 + 1
            boolean r0 = r6.V(r0)
            if (r0 == 0) goto L7c
            goto L3
        L58:
            if (r2 != 0) goto L65
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r0 = 16
            int r0 = java.lang.Math.max(r4, r0)
            r2.<init>(r0)
        L65:
            char[] r1 = r6.I
            int r0 = r6.L
            r2.append(r1, r0, r4)
            int r0 = r6.L
            int r0 = r0 + r4
            r6.L = r0
            r0 = 1
            boolean r0 = r6.V(r0)
            if (r0 != 0) goto L2
            goto L7d
        L79:
            r6.n()
        L7c:
            r3 = r4
        L7d:
            if (r2 != 0) goto L8e
            java.lang.String r2 = new java.lang.String
            char[] r1 = r6.I
            int r0 = r6.L
            r2.<init>(r1, r0, r3)
        L88:
            int r0 = r6.L
            int r0 = r0 + r3
            r6.L = r0
            return r2
        L8e:
            char[] r1 = r6.I
            int r0 = r6.L
            java.lang.StringBuilder r0 = r2.append(r1, r0, r3)
            java.lang.String r2 = r0.toString()
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ei.k():java.lang.String");
    }

    private char l() throws IOException {
        int i2;
        if (this.L == this.S && !V(1)) {
            throw B("Unterminated escape sequence");
        }
        char[] cArr = this.I;
        int i3 = this.L;
        int i4 = i3 + 1;
        this.L = i4;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.F++;
            this.C = i4;
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
                throw B("Invalid escape sequence");
            }
            if (i3 + 5 > this.S && !V(4)) {
                throw B("Unterminated escape sequence");
            }
            int i5 = this.L;
            int i6 = i5 + 4;
            char c3 = 0;
            while (i5 < i6) {
                char c4 = this.I[i5];
                char c5 = (char) (c3 << 4);
                if (c4 >= '0' && c4 <= '9') {
                    i2 = c4 - '0';
                } else if (c4 >= 'a' && c4 <= 'f') {
                    i2 = c4 - 'W';
                } else {
                    if (c4 < 'A' || c4 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(this.I, this.L, 4)));
                    }
                    i2 = c4 - '7';
                }
                c3 = (char) (c5 + i2);
                i5++;
            }
            this.L += 4;
            return c3;
        }
        return c2;
    }

    private void m() throws IOException {
        char c2;
        do {
            if (this.L >= this.S && !V(1)) {
                return;
            }
            char[] cArr = this.I;
            int i2 = this.L;
            int i3 = i2 + 1;
            this.L = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.F++;
                this.C = i3;
                return;
            }
        } while (c2 != '\r');
    }

    private void n() throws IOException {
        if (!this.Code) {
            throw B("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void o() throws IOException {
        B(true);
        int i2 = this.L - 1;
        this.L = i2;
        char[] cArr = B;
        if (i2 + cArr.length > this.S && !V(cArr.length)) {
            return;
        }
        int i3 = 0;
        while (true) {
            char[] cArr2 = B;
            if (i3 >= cArr2.length) {
                this.L += cArr2.length;
                return;
            } else if (this.I[this.L + i3] != cArr2[i3]) {
                return;
            } else {
                i3++;
            }
        }
    }

    public void B() throws IOException {
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 4) {
            throw new IllegalStateException(new StringBuilder("Expected END_ARRAY but was ").append(D()).append(f()).toString());
        }
        int i2 = this.f3151d;
        this.f3151d = i2 - 1;
        int[] iArr = this.f3153g;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.Z = 0;
    }

    public String C() throws IOException {
        String strV;
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 14) {
            strV = k();
        } else if (iG == 12) {
            strV = V('\'');
        } else {
            if (iG != 13) {
                throw new IllegalStateException(new StringBuilder("Expected a name but was ").append(D()).append(f()).toString());
            }
            strV = V('\"');
        }
        this.Z = 0;
        this.f3152e[this.f3151d - 1] = strV;
        return strV;
    }

    public void Code() throws IOException {
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 1) {
            throw new IllegalStateException(new StringBuilder("Expected BEGIN_OBJECT but was ").append(D()).append(f()).toString());
        }
        Code(3);
        this.Z = 0;
    }

    public el D() throws IOException {
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        switch (iG) {
            case 1:
                return el.BEGIN_OBJECT;
            case 2:
                return el.END_OBJECT;
            case 3:
                return el.BEGIN_ARRAY;
            case 4:
                return el.END_ARRAY;
            case 5:
            case 6:
                return el.BOOLEAN;
            case 7:
                return el.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return el.STRING;
            case 12:
            case 13:
            case 14:
                return el.NAME;
            case 15:
            case 16:
                return el.NUMBER;
            case 17:
                return el.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public boolean F() throws IOException {
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 5) {
            this.Z = 0;
            int[] iArr = this.f3153g;
            int i2 = this.f3151d - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iG != 6) {
            throw new IllegalStateException(new StringBuilder("Expected a boolean but was ").append(D()).append(f()).toString());
        }
        this.Z = 0;
        int[] iArr2 = this.f3153g;
        int i3 = this.f3151d - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public void I() throws IOException {
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 3) {
            throw new IllegalStateException(new StringBuilder("Expected BEGIN_ARRAY but was ").append(D()).append(f()).toString());
        }
        Code(1);
        this.f3153g[this.f3151d - 1] = 0;
        this.Z = 0;
    }

    public String L() throws IOException {
        String str;
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 10) {
            str = k();
        } else if (iG == 8) {
            str = V('\'');
        } else if (iG == 9) {
            str = V('\"');
        } else if (iG == 11) {
            str = this.f3149b;
            this.f3149b = null;
        } else if (iG == 15) {
            str = Long.toString(this.D);
        } else {
            if (iG != 16) {
                throw new IllegalStateException(new StringBuilder("Expected a string but was ").append(D()).append(f()).toString());
            }
            str = new String(this.I, this.L, this.f3148a);
            this.L += this.f3148a;
        }
        this.Z = 0;
        int[] iArr = this.f3153g;
        int i2 = this.f3151d - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public void S() throws IOException {
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 7) {
            throw new IllegalStateException(new StringBuilder("Expected null but was ").append(D()).append(f()).toString());
        }
        this.Z = 0;
        int[] iArr = this.f3153g;
        int i2 = this.f3151d - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public boolean V() throws IOException {
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        return (iG == 2 || iG == 4) ? false : true;
    }

    public void Z() throws IOException {
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        if (iG != 2) {
            throw new IllegalStateException(new StringBuilder("Expected END_OBJECT but was ").append(D()).append(f()).toString());
        }
        int i2 = this.f3151d;
        int i3 = i2 - 1;
        this.f3151d = i3;
        this.f3152e[i3] = null;
        int[] iArr = this.f3153g;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.Z = 0;
    }

    public final void Z(boolean z2) {
        this.Code = z2;
    }

    public long a() throws IOException {
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.Z = 0;
            int[] iArr = this.f3153g;
            int i2 = this.f3151d - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.D;
        }
        if (iG == 16) {
            this.f3149b = new String(this.I, this.L, this.f3148a);
            this.L += this.f3148a;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw new IllegalStateException(new StringBuilder("Expected a long but was ").append(D()).append(f()).toString());
            }
            if (iG == 10) {
                this.f3149b = k();
            } else {
                this.f3149b = V(iG == 8 ? '\'' : '\"');
            }
            try {
                long j2 = Long.parseLong(this.f3149b);
                this.Z = 0;
                int[] iArr2 = this.f3153g;
                int i3 = this.f3151d - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.Z = 11;
        double d2 = Double.parseDouble(this.f3149b);
        long j3 = (long) d2;
        if (j3 != d2) {
            throw new NumberFormatException(new StringBuilder("Expected a long but was ").append(this.f3149b).append(f()).toString());
        }
        this.f3149b = null;
        this.Z = 0;
        int[] iArr3 = this.f3153g;
        int i4 = this.f3151d - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j3;
    }

    public int b() throws IOException {
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            long j2 = this.D;
            int i2 = (int) j2;
            if (j2 != i2) {
                throw new NumberFormatException(new StringBuilder("Expected an int but was ").append(this.D).append(f()).toString());
            }
            this.Z = 0;
            int[] iArr = this.f3153g;
            int i3 = this.f3151d - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (iG == 16) {
            this.f3149b = new String(this.I, this.L, this.f3148a);
            this.L += this.f3148a;
        } else {
            if (iG != 8 && iG != 9 && iG != 10) {
                throw new IllegalStateException(new StringBuilder("Expected an int but was ").append(D()).append(f()).toString());
            }
            if (iG == 10) {
                this.f3149b = k();
            } else {
                this.f3149b = V(iG == 8 ? '\'' : '\"');
            }
            try {
                int i4 = Integer.parseInt(this.f3149b);
                this.Z = 0;
                int[] iArr2 = this.f3153g;
                int i5 = this.f3151d - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.Z = 11;
        double d2 = Double.parseDouble(this.f3149b);
        int i6 = (int) d2;
        if (i6 != d2) {
            throw new NumberFormatException(new StringBuilder("Expected an int but was ").append(this.f3149b).append(f()).toString());
        }
        this.f3149b = null;
        this.Z = 0;
        int[] iArr3 = this.f3153g;
        int i7 = this.f3151d - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    public double c() throws IOException {
        int iG = this.Z;
        if (iG == 0) {
            iG = g();
        }
        if (iG == 15) {
            this.Z = 0;
            int[] iArr = this.f3153g;
            int i2 = this.f3151d - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.D;
        }
        if (iG == 16) {
            this.f3149b = new String(this.I, this.L, this.f3148a);
            this.L += this.f3148a;
        } else if (iG == 8 || iG == 9) {
            this.f3149b = V(iG == 8 ? '\'' : '\"');
        } else if (iG == 10) {
            this.f3149b = k();
        } else if (iG != 11) {
            throw new IllegalStateException(new StringBuilder("Expected a double but was ").append(D()).append(f()).toString());
        }
        this.Z = 11;
        double d2 = Double.parseDouble(this.f3149b);
        if (!this.Code && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new em(new StringBuilder("JSON forbids NaN and infinities: ").append(d2).append(f()).toString());
        }
        this.f3149b = null;
        this.Z = 0;
        int[] iArr2 = this.f3153g;
        int i3 = this.f3151d - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.Z = 0;
        this.f3150c[0] = 8;
        this.f3151d = 1;
        this.V.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x009e, code lost:
    
        n();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:52:0x008d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ei.d():void");
    }

    final String f() {
        int i2 = this.F + 1;
        return new StringBuilder(" at line ").append(i2).append(" column ").append((this.L - this.C) + 1).append(" path ").append(h()).toString();
    }

    final int g() throws IOException {
        int iB;
        int[] iArr = this.f3150c;
        int i2 = this.f3151d;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else if (i3 == 2) {
            int iB2 = B(true);
            if (iB2 != 44) {
                if (iB2 != 59) {
                    if (iB2 != 93) {
                        throw B("Unterminated array");
                    }
                    this.Z = 4;
                    return 4;
                }
                n();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2 - 1] = 4;
                if (i3 == 5 && (iB = B(true)) != 44) {
                    if (iB != 59) {
                        if (iB != 125) {
                            throw B("Unterminated object");
                        }
                        this.Z = 2;
                        return 2;
                    }
                    n();
                }
                int iB3 = B(true);
                if (iB3 == 34) {
                    this.Z = 13;
                    return 13;
                }
                if (iB3 == 39) {
                    n();
                    this.Z = 12;
                    return 12;
                }
                if (iB3 == 125) {
                    if (i3 == 5) {
                        throw B("Expected name");
                    }
                    this.Z = 2;
                    return 2;
                }
                n();
                this.L--;
                if (!B((char) iB3)) {
                    throw B("Expected name");
                }
                this.Z = 14;
                return 14;
            }
            if (i3 == 4) {
                iArr[i2 - 1] = 5;
                int iB4 = B(true);
                if (iB4 != 58) {
                    if (iB4 != 61) {
                        throw B("Expected ':'");
                    }
                    n();
                    if (this.L < this.S || V(1)) {
                        char[] cArr = this.I;
                        int i4 = this.L;
                        if (cArr[i4] == '>') {
                            this.L = i4 + 1;
                        }
                    }
                }
            } else if (i3 == 6) {
                if (this.Code) {
                    o();
                }
                this.f3150c[this.f3151d - 1] = 7;
            } else if (i3 == 7) {
                if (B(false) == -1) {
                    this.Z = 17;
                    return 17;
                }
                n();
                this.L--;
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iB5 = B(true);
        if (iB5 == 34) {
            this.Z = 9;
            return 9;
        }
        if (iB5 == 39) {
            n();
            this.Z = 8;
            return 8;
        }
        if (iB5 != 44 && iB5 != 59) {
            if (iB5 == 91) {
                this.Z = 3;
                return 3;
            }
            if (iB5 != 93) {
                if (iB5 == 123) {
                    this.Z = 1;
                    return 1;
                }
                this.L--;
                int iE = e();
                if (iE != 0) {
                    return iE;
                }
                int iJ = j();
                if (iJ != 0) {
                    return iJ;
                }
                if (!B(this.I[this.L])) {
                    throw B("Expected value");
                }
                n();
                this.Z = 10;
                return 10;
            }
            if (i3 == 1) {
                this.Z = 4;
                return 4;
            }
        }
        if (i3 != 1 && i3 != 2) {
            throw B("Unexpected value");
        }
        n();
        this.L--;
        this.Z = 7;
        return 7;
    }

    public String h() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.f3151d;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f3150c[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.f3153g[i3]).append(AbstractJsonLexerKt.END_LIST);
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = this.f3152e[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final boolean i() {
        return this.Code;
    }

    public String toString() {
        return new StringBuilder().append(getClass().getSimpleName()).append(f()).toString();
    }
}
