package cz.msebera.android.httpclient.conn.ssl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
public final class DistinguishedNameParser {
    private int beg;
    private char[] chars;
    private int cur;
    private final String dn;
    private int end;
    private final int length;
    private int pos;

    public DistinguishedNameParser(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.dn = name;
        this.length = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r2 = r9.chars;
        r1 = r9.beg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        return new java.lang.String(r2, r1, r9.end - r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String escapedAV() {
        /*
            r9 = this;
            int r0 = r9.pos
            r9.beg = r0
            r9.end = r0
        L6:
            int r8 = r9.pos
            int r0 = r9.length
            if (r8 < r0) goto L19
            java.lang.String r3 = new java.lang.String
            char[] r2 = r9.chars
            int r1 = r9.beg
            int r0 = r9.end
            int r0 = r0 - r1
            r3.<init>(r2, r1, r0)
            return r3
        L19:
            char[] r3 = r9.chars
            char r2 = r3[r8]
            r5 = 44
            r4 = 43
            r6 = 59
            r7 = 32
            if (r2 == r7) goto L51
            if (r2 == r6) goto L91
            r0 = 92
            if (r2 == r0) goto L3e
            if (r2 == r4) goto L91
            if (r2 == r5) goto L91
            int r1 = r9.end
            int r0 = r1 + 1
            r9.end = r0
            r3[r1] = r2
            int r0 = r8 + 1
            r9.pos = r0
            goto L6
        L3e:
            int r1 = r9.end
            int r0 = r1 + 1
            r9.end = r0
            char r0 = r9.getEscaped()
            r3[r1] = r0
            int r0 = r9.pos
            int r0 = r0 + 1
            r9.pos = r0
            goto L6
        L51:
            int r1 = r9.end
            r9.cur = r1
            int r0 = r8 + 1
            r9.pos = r0
            int r0 = r1 + 1
            r9.end = r0
            r3[r1] = r7
        L5f:
            int r3 = r9.pos
            int r1 = r9.length
            if (r3 >= r1) goto L78
            char[] r2 = r9.chars
            char r0 = r2[r3]
            if (r0 != r7) goto L78
            int r1 = r9.end
            int r0 = r1 + 1
            r9.end = r0
            r2[r1] = r7
            int r0 = r3 + 1
            r9.pos = r0
            goto L5f
        L78:
            if (r3 == r1) goto L84
            char[] r0 = r9.chars
            char r0 = r0[r3]
            if (r0 == r5) goto L84
            if (r0 == r4) goto L84
            if (r0 != r6) goto L6
        L84:
            java.lang.String r3 = new java.lang.String
            char[] r2 = r9.chars
            int r1 = r9.beg
            int r0 = r9.cur
            int r0 = r0 - r1
            r3.<init>(r2, r1, r0)
            return r3
        L91:
            java.lang.String r3 = new java.lang.String
            char[] r2 = r9.chars
            int r1 = r9.beg
            int r0 = r9.end
            int r0 = r0 - r1
            r3.<init>(r2, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.msebera.android.httpclient.conn.ssl.DistinguishedNameParser.escapedAV():java.lang.String");
    }

    private int getByte(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        if (i5 >= this.length) {
            throw new IllegalStateException("Malformed DN: " + this.dn);
        }
        char[] cArr = this.chars;
        char c2 = cArr[i2];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            i3 = c2 - '7';
        }
        char c3 = cArr[i5];
        if (c3 >= '0' && c3 <= '9') {
            i4 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i4 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            i4 = c3 - '7';
        }
        return (i3 << 4) + i4;
    }

    private char getEscaped() {
        int i2 = this.pos + 1;
        this.pos = i2;
        if (i2 == this.length) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dn);
        }
        char c2 = this.chars[i2];
        if (c2 == ' ' || c2 == '%' || c2 == '\\' || c2 == '_' || c2 == '\"' || c2 == '#') {
            return c2;
        }
        switch (c2) {
            case '*':
            case '+':
            case ',':
                return c2;
            default:
                switch (c2) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c2;
                    default:
                        return getUTF8();
                }
        }
    }

    private char getUTF8() {
        int i2;
        int i3;
        int i4 = getByte(this.pos);
        this.pos++;
        if (i4 < 128) {
            return (char) i4;
        }
        if (i4 < 192 || i4 > 247) {
            return '?';
        }
        if (i4 <= 223) {
            i2 = (-1) - (((-1) - i4) | ((-1) - 31));
            i3 = 1;
        } else if (i4 <= 239) {
            i2 = i4 & 15;
            i3 = 2;
        } else {
            i2 = i4 & 7;
            i3 = 3;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.pos;
            int i7 = i6 + 1;
            this.pos = i7;
            if (i7 == this.length || this.chars[i7] != '\\') {
                return '?';
            }
            int i8 = i6 + 2;
            this.pos = i8;
            int i9 = getByte(i8);
            this.pos++;
            if ((192 & i9) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (i9 & 63);
        }
        return (char) i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r6.end = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String hexAV() {
        /*
            r6 = this;
            int r2 = r6.pos
            int r1 = r2 + 4
            int r0 = r6.length
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r0) goto L98
            r6.beg = r2
            int r0 = r2 + 1
            r6.pos = r0
        L10:
            int r5 = r6.pos
            int r0 = r6.length
            if (r5 == r0) goto L26
            char[] r4 = r6.chars
            char r1 = r4[r5]
            r0 = 43
            if (r1 == r0) goto L26
            r0 = 44
            if (r1 == r0) goto L26
            r0 = 59
            if (r1 != r0) goto L4c
        L26:
            r6.end = r5
        L28:
            int r5 = r6.end
            int r2 = r6.beg
            int r5 = r5 - r2
            r0 = 5
            if (r5 < r0) goto L83
            r0 = 1
            int r1 = r5 + r0
            r0 = r0 | r5
            int r1 = r1 - r0
            if (r1 == 0) goto L83
            int r4 = r5 / 2
            byte[] r3 = new byte[r4]
            int r2 = r2 + 1
            r1 = 0
        L3e:
            if (r1 >= r4) goto L79
            int r0 = r6.getByte(r2)
            byte r0 = (byte) r0
            r3[r1] = r0
            int r2 = r2 + 2
            int r1 = r1 + 1
            goto L3e
        L4c:
            r2 = 32
            if (r1 != r2) goto L67
            r6.end = r5
            int r0 = r5 + 1
            r6.pos = r0
        L56:
            int r1 = r6.pos
            int r0 = r6.length
            if (r1 >= r0) goto L28
            char[] r0 = r6.chars
            char r0 = r0[r1]
            if (r0 != r2) goto L28
            int r0 = r1 + 1
            r6.pos = r0
            goto L56
        L67:
            r0 = 65
            if (r1 < r0) goto L74
            r0 = 70
            if (r1 > r0) goto L74
            int r0 = r1 + 32
            char r0 = (char) r0
            r4[r5] = r0
        L74:
            int r0 = r5 + 1
            r6.pos = r0
            goto L10
        L79:
            java.lang.String r2 = new java.lang.String
            char[] r1 = r6.chars
            int r0 = r6.beg
            r2.<init>(r1, r0, r5)
            return r2
        L83:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r0 = r6.dn
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L98:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r0 = r6.dn
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.msebera.android.httpclient.conn.ssl.DistinguishedNameParser.hexAV():java.lang.String");
    }

    private String nextAT() {
        int i2;
        int i3;
        int i4;
        int i5;
        char c2;
        int i6;
        int i7;
        char c3;
        char c4;
        while (true) {
            i2 = this.pos;
            i3 = this.length;
            if (i2 >= i3 || this.chars[i2] != ' ') {
                break;
            }
            this.pos = i2 + 1;
        }
        if (i2 == i3) {
            return null;
        }
        this.beg = i2;
        this.pos = i2 + 1;
        while (true) {
            i4 = this.pos;
            i5 = this.length;
            if (i4 >= i5 || (c4 = this.chars[i4]) == '=' || c4 == ' ') {
                break;
            }
            this.pos = i4 + 1;
        }
        if (i4 >= i5) {
            throw new IllegalStateException("Unexpected end of DN: " + this.dn);
        }
        this.end = i4;
        if (this.chars[i4] == ' ') {
            while (true) {
                i6 = this.pos;
                i7 = this.length;
                if (i6 >= i7 || (c3 = this.chars[i6]) == '=' || c3 != ' ') {
                    break;
                }
                this.pos = i6 + 1;
            }
            if (this.chars[i6] != '=' || i6 == i7) {
                throw new IllegalStateException("Unexpected end of DN: " + this.dn);
            }
        }
        this.pos++;
        while (true) {
            int i8 = this.pos;
            if (i8 >= this.length || this.chars[i8] != ' ') {
                break;
            }
            this.pos = i8 + 1;
        }
        int i9 = this.end;
        int i10 = this.beg;
        if (i9 - i10 > 4) {
            char[] cArr = this.chars;
            if (cArr[i10 + 3] == '.' && (((c2 = cArr[i10]) == 'O' || c2 == 'o') && ((cArr[i10 + 1] == 'I' || cArr[i10 + 1] == 'i') && (cArr[i10 + 2] == 'D' || cArr[i10 + 2] == 'd')))) {
                this.beg = i10 + 4;
            }
        }
        char[] cArr2 = this.chars;
        int i11 = this.beg;
        return new String(cArr2, i11, this.end - i11);
    }

    private String quotedAV() {
        int i2 = this.pos + 1;
        this.pos = i2;
        this.beg = i2;
        this.end = i2;
        while (true) {
            int i3 = this.pos;
            if (i3 == this.length) {
                throw new IllegalStateException("Unexpected end of DN: " + this.dn);
            }
            char[] cArr = this.chars;
            char c2 = cArr[i3];
            if (c2 == '\"') {
                this.pos = i3 + 1;
                while (true) {
                    int i4 = this.pos;
                    if (i4 >= this.length || this.chars[i4] != ' ') {
                        break;
                    }
                    this.pos = i4 + 1;
                }
                char[] cArr2 = this.chars;
                int i5 = this.beg;
                return new String(cArr2, i5, this.end - i5);
            }
            if (c2 == '\\') {
                cArr[this.end] = getEscaped();
            } else {
                cArr[this.end] = c2;
            }
            this.pos++;
            this.end++;
        }
    }

    public String findMostSpecific(String str) {
        this.pos = 0;
        this.beg = 0;
        this.end = 0;
        this.cur = 0;
        this.chars = this.dn.toCharArray();
        String strNextAT = nextAT();
        if (strNextAT == null) {
            return null;
        }
        do {
            int i2 = this.pos;
            if (i2 == this.length) {
                return null;
            }
            char c2 = this.chars[i2];
            String strEscapedAV = c2 != '\"' ? c2 != '#' ? (c2 == '+' || c2 == ',' || c2 == ';') ? "" : escapedAV() : hexAV() : quotedAV();
            if (str.equalsIgnoreCase(strNextAT)) {
                return strEscapedAV;
            }
            int i3 = this.pos;
            if (i3 >= this.length) {
                return null;
            }
            char c3 = this.chars[i3];
            if (c3 != ',' && c3 != ';' && c3 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            this.pos = i3 + 1;
            strNextAT = nextAT();
        } while (strNextAT != null);
        throw new IllegalStateException("Malformed DN: " + this.dn);
    }

    public List<String> getAllMostSpecificFirst(String str) {
        this.pos = 0;
        this.beg = 0;
        this.end = 0;
        this.cur = 0;
        this.chars = this.dn.toCharArray();
        List<String> listEmptyList = Collections.emptyList();
        String strNextAT = nextAT();
        if (strNextAT == null) {
            return listEmptyList;
        }
        do {
            int i2 = this.pos;
            if (i2 < this.length) {
                char c2 = this.chars[i2];
                String strEscapedAV = c2 != '\"' ? c2 != '#' ? (c2 == '+' || c2 == ',' || c2 == ';') ? "" : escapedAV() : hexAV() : quotedAV();
                if (str.equalsIgnoreCase(strNextAT)) {
                    if (listEmptyList.isEmpty()) {
                        listEmptyList = new ArrayList<>();
                    }
                    listEmptyList.add(strEscapedAV);
                }
                int i3 = this.pos;
                if (i3 < this.length) {
                    char c3 = this.chars[i3];
                    if (c3 != ',' && c3 != ';' && c3 != '+') {
                        throw new IllegalStateException("Malformed DN: " + this.dn);
                    }
                    this.pos = i3 + 1;
                    strNextAT = nextAT();
                }
            }
            return listEmptyList;
        } while (strNextAT != null);
        throw new IllegalStateException("Malformed DN: " + this.dn);
    }
}
