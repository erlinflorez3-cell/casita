package com.facetec.sdk;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class fp {
    private static final char[] V = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final int B;
    private final String C;
    final String Code;

    @Nullable
    private final String F;
    private final String I;
    private final String L;

    @Nullable
    private final List<String> S;
    final String Z;

    public static final class I {

        @Nullable
        String C;

        @Nullable
        String Code;
        final List<String> F;

        @Nullable
        List<String> S;

        @Nullable
        String Z;
        String I = "";
        String V = "";
        int B = -1;

        public I() {
            ArrayList arrayList = new ArrayList();
            this.F = arrayList;
            arrayList.add("");
        }

        private static int B(String str, int i2, int i3) {
            int i4 = 0;
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i4++;
                i2++;
            }
            return i4;
        }

        private static boolean B(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* JADX WARN: Removed duplicated region for block: B:59:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00b1 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x006f -> B:56:0x0024). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void Code(java.lang.String r18, int r19, int r20) {
            /*
                r17 = this;
                r10 = r19
                r3 = r17
                r4 = r20
                if (r10 != r4) goto L9
                return
            L9:
                r8 = r18
                char r1 = r8.charAt(r10)
                r0 = 47
                java.lang.String r2 = ""
                r7 = 1
                if (r1 == r0) goto L1a
                r0 = 92
                if (r1 != r0) goto La5
            L1a:
                java.util.List<java.lang.String> r0 = r3.F
                r0.clear()
                java.util.List<java.lang.String> r0 = r3.F
                r0.add(r2)
            L24:
                int r10 = r10 + 1
            L26:
                r9 = r10
                if (r9 >= r4) goto Lb1
                java.lang.String r0 = "/\\"
                int r10 = com.facetec.sdk.gg.V(r8, r9, r4, r0)
                if (r10 >= r4) goto La3
                r6 = r7
            L32:
                r15 = 1
                r16 = 0
                java.lang.String r11 = " \"<>^`{}|/\\?#"
                r12 = 1
                r13 = 0
                r14 = 0
                java.lang.String r5 = com.facetec.sdk.fp.V(r8, r9, r10, r11, r12, r13, r14, r15, r16)
                boolean r0 = Z(r5)
                if (r0 != 0) goto L6f
                boolean r0 = B(r5)
                if (r0 == 0) goto L78
                java.util.List<java.lang.String> r1 = r3.F
                int r0 = r1.size()
                int r0 = r0 - r7
                java.lang.Object r0 = r1.remove(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L72
                java.util.List<java.lang.String> r0 = r3.F
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L72
                java.util.List<java.lang.String> r1 = r3.F
                int r0 = r1.size()
                int r0 = r0 - r7
                r1.set(r0, r2)
            L6f:
                if (r6 == 0) goto L26
                goto L24
            L72:
                java.util.List<java.lang.String> r0 = r3.F
                r0.add(r2)
                goto L6f
            L78:
                java.util.List<java.lang.String> r1 = r3.F
                int r0 = r1.size()
                int r0 = r0 - r7
                java.lang.Object r0 = r1.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L9d
                java.util.List<java.lang.String> r1 = r3.F
                int r0 = r1.size()
                int r0 = r0 - r7
                r1.set(r0, r5)
            L95:
                if (r6 == 0) goto L6f
                java.util.List<java.lang.String> r0 = r3.F
                r0.add(r2)
                goto L6f
            L9d:
                java.util.List<java.lang.String> r0 = r3.F
                r0.add(r5)
                goto L95
            La3:
                r6 = 0
                goto L32
            La5:
                java.util.List<java.lang.String> r1 = r3.F
                int r0 = r1.size()
                int r0 = r0 - r7
                r1.set(r0, r2)
                goto L26
            Lb1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.fp.I.Code(java.lang.String, int, int):void");
        }

        private static int I(String str, int i2, int i3) {
            int i4;
            try {
                i4 = Integer.parseInt(fp.V(str, i2, i3, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i4 <= 0 || i4 > 65535) {
                return -1;
            }
            return i4;
        }

        private static int V(String str, int i2, int i3) {
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == ':') {
                    return i2;
                }
                if (cCharAt == '[') {
                    do {
                        i2++;
                        if (i2 < i3) {
                        }
                    } while (str.charAt(i2) != ']');
                }
                i2++;
            }
            return i3;
        }

        private static String Z(String str, int i2, int i3) {
            return gg.Z(fp.V(str, i2, i3, false));
        }

        private static boolean Z(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        final I I(@Nullable fp fpVar, String str) {
            int i2;
            int iV;
            char c2;
            char cCharAt;
            boolean z2 = false;
            int iV2 = gg.V(str, 0, str.length());
            int iB = gg.B(str, iV2, str.length());
            int i3 = iB - iV2;
            char c3 = AbstractJsonLexerKt.COLON;
            byte b2 = -1;
            if (i3 < 2 || (((cCharAt = str.charAt(iV2)) < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z'))) {
                i2 = -1;
            } else {
                i2 = iV2 + 1;
                while (true) {
                    if (i2 >= iB) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i2);
                    if ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || ((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '+' || cCharAt2 == '-' || cCharAt2 == '.'))) {
                        i2++;
                    } else if (cCharAt2 != ':') {
                        break;
                    }
                }
                i2 = -1;
            }
            if (i2 != -1) {
                if (str.regionMatches(true, iV2, "https:", 0, 6)) {
                    this.Z = "https";
                    iV2 += 6;
                } else {
                    if (!str.regionMatches(true, iV2, "http:", 0, 5)) {
                        throw new IllegalArgumentException(new StringBuilder("Expected URL scheme 'http' or 'https' but was '").append(str.substring(0, i2)).append("'").toString());
                    }
                    this.Z = "http";
                    iV2 += 5;
                }
            } else {
                if (fpVar == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.Z = fpVar.Code;
            }
            int iB2 = B(str, iV2, iB);
            byte b3 = Utf8.REPLACEMENT_BYTE;
            byte b4 = 35;
            if (iB2 >= 2 || fpVar == null || !fpVar.Code.equals(this.Z)) {
                int i4 = iV2 + iB2;
                boolean z3 = false;
                while (true) {
                    iV = gg.V(str, i4, iB, "@/\\?#");
                    byte bCharAt = iV != iB ? str.charAt(iV) : b2;
                    if (bCharAt == b2 || bCharAt == b4 || bCharAt == 47 || bCharAt == 92 || bCharAt == b3) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z2) {
                            this.V = new StringBuilder().append(this.V).append("%40").append(fp.V(str, i4, iV, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null)).toString();
                        } else {
                            int iZ = gg.Z(str, i4, iV, c3);
                            String strV = fp.V(str, i4, iZ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z3) {
                                strV = new StringBuilder().append(this.I).append("%40").append(strV).toString();
                            }
                            this.I = strV;
                            if (iZ != iV) {
                                this.V = fp.V(str, iZ + 1, iV, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z2 = true;
                            }
                            z3 = true;
                        }
                        i4 = iV + 1;
                        b4 = 35;
                        c3 = AbstractJsonLexerKt.COLON;
                        b2 = -1;
                        b3 = Utf8.REPLACEMENT_BYTE;
                    }
                }
                int iV3 = V(str, i4, iV);
                int i5 = iV3 + 1;
                if (i5 < iV) {
                    this.Code = Z(str, i4, iV3);
                    int I = I(str, i5, iV);
                    this.B = I;
                    if (I == -1) {
                        throw new IllegalArgumentException(new StringBuilder("Invalid URL port: \"").append(str.substring(i5, iV)).append('\"').toString());
                    }
                } else {
                    this.Code = Z(str, i4, iV3);
                    this.B = fp.V(this.Z);
                }
                if (this.Code == null) {
                    throw new IllegalArgumentException(new StringBuilder("Invalid URL host: \"").append(str.substring(i4, iV3)).append('\"').toString());
                }
                iV2 = iV;
            } else {
                this.I = fpVar.Code();
                this.V = fpVar.I();
                this.Code = fpVar.Z;
                this.B = fpVar.B;
                this.F.clear();
                this.F.addAll(fpVar.S());
                if (iV2 == iB || str.charAt(iV2) == '#') {
                    I(fpVar.L());
                }
            }
            int iV4 = gg.V(str, iV2, iB, "?#");
            Code(str, iV2, iV4);
            if (iV4 >= iB || str.charAt(iV4) != '?') {
                c2 = '#';
            } else {
                c2 = '#';
                int iZ2 = gg.Z(str, iV4, iB, '#');
                this.S = fp.I(fp.V(str, iV4 + 1, iZ2, HttpUrl.QUERY_ENCODE_SET, true, false, true, true, null));
                iV4 = iZ2;
            }
            if (iV4 < iB && str.charAt(iV4) == c2) {
                this.C = fp.V(str, iV4 + 1, iB, "", true, false, false, false, null);
            }
            return this;
        }

        public final I I(@Nullable String str) {
            this.S = str != null ? fp.I(fp.Code(str, HttpUrl.QUERY_ENCODE_SET, true, false, true, true)) : null;
            return this;
        }

        public final fp I() {
            if (this.Z == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.Code != null) {
                return new fp(this);
            }
            throw new IllegalStateException("host == null");
        }

        final int V() {
            int i2 = this.B;
            return i2 != -1 ? i2 : fp.V(this.Z);
        }

        public final I V(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strZ = Z(str, 0, str.length());
            if (strZ == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
            }
            this.Code = strZ;
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.Z;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.I.isEmpty() || !this.V.isEmpty()) {
                sb.append(this.I);
                if (!this.V.isEmpty()) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.V);
                }
                sb.append('@');
            }
            String str2 = this.Code;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(this.Code);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                } else {
                    sb.append(this.Code);
                }
            }
            if (this.B != -1 || this.Z != null) {
                int iV = V();
                String str3 = this.Z;
                if (str3 == null || iV != fp.V(str3)) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(iV);
                }
            }
            fp.V(sb, this.F);
            if (this.S != null) {
                sb.append('?');
                fp.I(sb, this.S);
            }
            if (this.C != null) {
                sb.append('#');
                sb.append(this.C);
            }
            return sb.toString();
        }
    }

    fp(I i2) {
        this.Code = i2.Z;
        this.I = I(i2.I, false);
        this.C = I(i2.V, false);
        this.Z = i2.Code;
        this.B = i2.V();
        I(i2.F, false);
        this.S = i2.S != null ? I(i2.S, true) : null;
        this.F = i2.C != null ? I(i2.C, false) : null;
        this.L = i2.toString();
    }

    public static fp B(String str) {
        return new I().I(null, str).I();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void B(com.facetec.sdk.ie r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r4 = r6.codePointAt(r7)
            r0 = 37
            if (r4 != r0) goto L32
            int r3 = r7 + 2
            if (r3 >= r8) goto L32
            int r0 = r7 + 1
            char r0 = r6.charAt(r0)
            int r2 = com.facetec.sdk.gg.I(r0)
            char r0 = r6.charAt(r3)
            int r1 = com.facetec.sdk.gg.I(r0)
            r0 = -1
            if (r2 == r0) goto L3e
            if (r1 == r0) goto L3e
            int r0 = r2 << 4
            int r0 = r0 + r1
            r5.I(r0)
            r7 = r3
        L2c:
            int r0 = java.lang.Character.charCount(r4)
            int r7 = r7 + r0
            goto L0
        L32:
            r0 = 43
            if (r4 != r0) goto L3e
            if (r9 == 0) goto L3e
            r0 = 32
            r5.I(r0)
            goto L2c
        L3e:
            r5.V(r4)
            goto L2c
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.fp.B(com.facetec.sdk.ie, java.lang.String, int, int, boolean):void");
    }

    private static boolean B(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && gg.I(str.charAt(i2 + 1)) != -1 && gg.I(str.charAt(i4)) != -1;
    }

    static String Code(String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5) {
        return V(str, 0, str.length(), str2, z2, z3, z4, z5, null);
    }

    static String I(String str, String str2, Charset charset) {
        return V(str, 0, str.length(), str2, false, false, true, true, charset);
    }

    private static String I(String str, boolean z2) {
        return V(str, 0, str.length(), z2);
    }

    static List<String> I(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int iIndexOf = str.indexOf(38, i2);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i2);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i2, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i2 = iIndexOf + 1;
        }
        return arrayList;
    }

    private static List<String> I(List<String> list, boolean z2) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? I(str, z2) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void I(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static int V(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static String V(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, Charset charset) {
        int iCharCount = i2;
        while (iCharCount < i3) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z5) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z2 || (z3 && !B(str, iCharCount, i3)))) || (iCodePointAt == 43 && z4)))) {
                ie ieVar = new ie();
                ieVar.B(str, i2, iCharCount);
                ie ieVar2 = null;
                while (iCharCount < i3) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z2 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z4) {
                            ieVar.V(z2 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z5) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z2 || (z3 && !B(str, iCharCount, i3)))))) {
                            if (ieVar2 == null) {
                                ieVar2 = new ie();
                            }
                            if (charset == null || charset.equals(gg.Code)) {
                                ieVar2.V(iCodePointAt2);
                            } else {
                                ieVar2.V(str, iCharCount, Character.charCount(iCodePointAt2) + iCharCount, charset);
                            }
                            while (!ieVar2.F()) {
                                byte bD = ieVar2.D();
                                ieVar.I(37);
                                char[] cArr = V;
                                int i4 = ((bD + 255) - (bD | 255)) >> 4;
                                ieVar.I((int) cArr[(i4 + 15) - (i4 | 15)]);
                                ieVar.I((int) cArr[(-1) - (((-1) - bD) | ((-1) - 15))]);
                            }
                        } else {
                            ieVar.V(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return ieVar.n();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i2, i3);
    }

    static String V(String str, int i2, int i3, boolean z2) {
        for (int i4 = i2; i4 < i3; i4++) {
            char cCharAt = str.charAt(i4);
            if (cCharAt == '%' || (cCharAt == '+' && z2)) {
                ie ieVar = new ie();
                ieVar.B(str, i2, i4);
                B(ieVar, str, i4, i3, z2);
                return ieVar.n();
            }
        }
        return str.substring(i2, i3);
    }

    static void V(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    @Nullable
    private I Z(String str) {
        try {
            return new I().I(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final URI B() {
        I i2 = new I();
        i2.Z = this.Code;
        i2.I = Code();
        i2.V = I();
        i2.Code = this.Z;
        i2.B = this.B != V(this.Code) ? this.B : -1;
        i2.F.clear();
        i2.F.addAll(S());
        i2.I(L());
        i2.C = this.F == null ? null : this.L.substring(this.L.indexOf(35) + 1);
        int size = i2.F.size();
        for (int i3 = 0; i3 < size; i3++) {
            i2.F.set(i3, Code(i2.F.get(i3), "[]", true, true, false, true));
        }
        if (i2.S != null) {
            int size2 = i2.S.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str = i2.S.get(i4);
                if (str != null) {
                    i2.S.set(i4, Code(str, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, true));
                }
            }
        }
        if (i2.C != null) {
            i2.C = Code(i2.C, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, false);
        }
        String string = i2.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final String C() {
        int iIndexOf = this.L.indexOf(47, this.Code.length() + 3);
        String str = this.L;
        return this.L.substring(iIndexOf, gg.V(str, iIndexOf, str.length(), "?#"));
    }

    @Nullable
    public final fp Code(String str) {
        I iZ = Z(str);
        if (iZ != null) {
            return iZ.I();
        }
        return null;
    }

    public final String Code() {
        if (this.I.isEmpty()) {
            return "";
        }
        int length = this.Code.length() + 3;
        String str = this.L;
        return this.L.substring(length, gg.V(str, length, str.length(), ":@"));
    }

    public final String D() {
        return this.Z;
    }

    public final int F() {
        return this.B;
    }

    public final String I() {
        if (this.C.isEmpty()) {
            return "";
        }
        return this.L.substring(this.L.indexOf(58, this.Code.length() + 3) + 1, this.L.indexOf(64));
    }

    @Nullable
    public final String L() {
        if (this.S == null) {
            return null;
        }
        int iIndexOf = this.L.indexOf(63) + 1;
        String str = this.L;
        return this.L.substring(iIndexOf, gg.Z(str, iIndexOf, str.length(), '#'));
    }

    public final List<String> S() {
        int iIndexOf = this.L.indexOf(47, this.Code.length() + 3);
        String str = this.L;
        int iV = gg.V(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iV) {
            int i2 = iIndexOf + 1;
            iIndexOf = gg.Z(this.L, i2, iV, '/');
            arrayList.add(this.L.substring(i2, iIndexOf));
        }
        return arrayList;
    }

    public final boolean V() {
        return this.Code.equals("https");
    }

    public final String Z() {
        return this.Code;
    }

    @Nullable
    public final String b() {
        if (this.S == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        I(sb, this.S);
        return sb.toString();
    }

    public final String d() {
        I iZ = Z("/...");
        iZ.I = Code("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        iZ.V = Code("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return iZ.I().toString();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof fp) && ((fp) obj).L.equals(this.L);
    }

    public final int hashCode() {
        return this.L.hashCode();
    }

    public final String toString() {
        return this.L;
    }
}
