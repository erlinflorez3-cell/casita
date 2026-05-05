package com.upokecenter.cbor;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import cz.msebera.android.httpclient.message.TokenParser;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes5.dex */
final class URIUtility {
    private static final String HexChars = "0123456789ABCDEF";
    private static final String ValueDotSlash = "./";
    private static final String ValueSlashDot = "/.";

    enum ParseMode {
        IRIStrict,
        URIStrict,
        IRILenient,
        URILenient,
        IRISurrogateLenient
    }

    private URIUtility() {
    }

    private static void AppendAuthority(StringBuilder sb, String str, int[] iArr) {
        if (iArr[2] >= 0) {
            sb.append("//");
            int i2 = iArr[2];
            sb.append(str.substring(i2, (iArr[3] - i2) + i2));
        }
    }

    private static void AppendFragment(StringBuilder sb, String str, int[] iArr) {
        if (iArr[8] >= 0) {
            sb.append('#');
            int i2 = iArr[8];
            sb.append(str.substring(i2, (iArr[9] - i2) + i2));
        }
    }

    private static void AppendNormalizedPath(StringBuilder sb, String str, int[] iArr) {
        int i2 = iArr[4];
        sb.append(NormalizePath(str.substring(i2, (iArr[5] - i2) + i2)));
    }

    private static void AppendPath(StringBuilder sb, String str, int[] iArr) {
        int i2 = iArr[4];
        sb.append(str.substring(i2, (iArr[5] - i2) + i2));
    }

    private static void AppendQuery(StringBuilder sb, String str, int[] iArr) {
        if (iArr[6] >= 0) {
            sb.append('?');
            int i2 = iArr[6];
            sb.append(str.substring(i2, (iArr[7] - i2) + i2));
        }
    }

    private static void AppendScheme(StringBuilder sb, String str, int[] iArr) {
        int i2 = iArr[0];
        if (i2 >= 0) {
            sb.append(str.substring(i2, (iArr[1] - i2) + i2));
            sb.append(AbstractJsonLexerKt.COLON);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String BuildIRI(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.URIUtility.BuildIRI(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static String DirectoryPath(String str) {
        return DirectoryPath(str, ParseMode.IRIStrict);
    }

    public static String DirectoryPath(String str, ParseMode parseMode) {
        int[] iArrSplitIRI = SplitIRI(str, parseMode);
        if (iArrSplitIRI == null) {
            return null;
        }
        String strSubstring = str.substring(0, iArrSplitIRI[4]);
        int i2 = iArrSplitIRI[4];
        String strSubstring2 = str.substring(i2, (iArrSplitIRI[5] - i2) + i2);
        if (strSubstring2.length() <= 0) {
            return strSubstring;
        }
        for (int length = strSubstring2.length() - 1; length >= 0; length--) {
            if (strSubstring2.charAt(length) == '/') {
                return strSubstring + strSubstring2.substring(0, length + 1);
            }
        }
        return strSubstring + strSubstring2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String EncodeStringForURI(java.lang.String r9) {
        /*
            if (r9 == 0) goto L8e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
        L8:
            int r0 = r9.length()
            if (r2 >= r0) goto L89
            char r4 = r9.charAt(r2)
            r8 = 64512(0xfc00, float:9.04E-41)
            int r1 = r4 + r8
            r0 = r4 | r8
            int r1 = r1 - r0
            r7 = 65536(0x10000, float:9.1835E-41)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r1 != r6) goto L7f
            int r5 = r2 + 1
            int r0 = r9.length()
            if (r5 >= r0) goto L7f
            char r0 = r9.charAt(r5)
            int r1 = r8 + r0
            r8 = r8 | r0
            int r1 = r1 - r8
            r0 = 56320(0xdc00, float:7.8921E-41)
            if (r1 != r0) goto L7f
            r0 = 1023(0x3ff, float:1.434E-42)
            r4 = r4 & r0
            int r4 = r4 << 10
            int r4 = r4 + r7
            char r5 = r9.charAt(r5)
            r1 = 1023(0x3ff, float:1.434E-42)
            int r0 = r5 + r1
            r5 = r5 | r1
            int r0 = r0 - r5
            int r4 = r4 + r0
        L47:
            if (r4 < r7) goto L4b
            int r2 = r2 + 1
        L4b:
            r0 = 127(0x7f, float:1.78E-43)
            int r1 = r4 + r0
            r0 = r0 | r4
            int r1 = r1 - r0
            if (r1 != r4) goto L7b
            r0 = 65
            if (r4 < r0) goto L5b
            r0 = 90
            if (r4 <= r0) goto L74
        L5b:
            r0 = 97
            if (r4 < r0) goto L63
            r0 = 122(0x7a, float:1.71E-43)
            if (r4 <= r0) goto L74
        L63:
            r0 = 48
            if (r4 < r0) goto L6b
            r0 = 57
            if (r4 <= r0) goto L74
        L6b:
            java.lang.String r1 = "-_.~"
            char r0 = (char) r4
            int r0 = r1.indexOf(r0)
            if (r0 < 0) goto L7b
        L74:
            char r0 = (char) r4
            r3.append(r0)
        L78:
            int r2 = r2 + 1
            goto L8
        L7b:
            PercentEncodeUtf8(r3, r4)
            goto L78
        L7f:
            r0 = 63488(0xf800, float:8.8966E-41)
            r0 = r0 & r4
            if (r0 != r6) goto L47
            r4 = 65533(0xfffd, float:9.1831E-41)
            goto L47
        L89:
            java.lang.String r0 = r3.toString()
            return r0
        L8e:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "s"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.URIUtility.EncodeStringForURI(java.lang.String):java.lang.String");
    }

    public static String EscapeURI(String str, int i2) {
        int[] iArrSplitIRI;
        int i3;
        if (str == null) {
            return null;
        }
        int i4 = 0;
        int i5 = 1;
        if (i2 == 1) {
            iArrSplitIRI = str == null ? null : SplitIRI(str, 0, str.length(), ParseMode.IRIStrict);
            if (iArrSplitIRI == null) {
                return null;
            }
        } else {
            iArrSplitIRI = str != null ? SplitIRI(str, 0, str.length(), ParseMode.IRISurrogateLenient) : null;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        while (i4 < length) {
            int iCharAt = str.charAt(i4);
            if ((-1) - (((-1) - iCharAt) | ((-1) - 64512)) == 55296 && (i3 = i4 + 1) < length && (-1) - (((-1) - 64512) | (65535 - str.charAt(i3))) == 56320) {
                char cCharAt = str.charAt(i3);
                iCharAt = ((cCharAt + 1023) - (cCharAt | 1023)) + (((-1) - (((-1) - iCharAt) | ((-1) - 1023))) << 10) + 65536;
                i4 = i3;
            } else if ((-1) - (((-1) - 63488) | ((-1) - iCharAt)) == 55296) {
                iCharAt = Utf8.REPLACEMENT_CODE_POINT;
            }
            if (i2 == 0 || i2 == 3) {
                if (iCharAt == 37 && i2 == 3) {
                    int i6 = i4 + 2;
                    if (i6 >= length || !IsHexChar(str.charAt(i4 + 1)) || !IsHexChar(str.charAt(i6))) {
                        PercentEncodeUtf8(sb, iCharAt);
                    } else if (iCharAt <= 65535) {
                        sb.append((char) iCharAt);
                    } else if (iCharAt <= 1114111) {
                        int i7 = iCharAt - 65536;
                        sb.append((char) (((-1) - (((-1) - (i7 >> 10)) | ((-1) - 1023))) | 55296));
                        sb.append((char) ((-1) - (((-1) - ((-1) - (((-1) - i7) | ((-1) - 1023)))) & ((-1) - Utf8.LOG_SURROGATE_HEADER))));
                    }
                } else if (iCharAt >= 127 || iCharAt <= 32 || ((iCharAt + 127) - (127 | iCharAt) == iCharAt && "{}|^\\`<>\"".indexOf((char) iCharAt) >= 0)) {
                    PercentEncodeUtf8(sb, iCharAt);
                } else if (iCharAt == 91 || iCharAt == 93) {
                    if (iArrSplitIRI == null || i4 < iArrSplitIRI[2] || i4 >= iArrSplitIRI[3]) {
                        PercentEncodeUtf8(sb, iCharAt);
                    } else if (iCharAt <= 65535) {
                        sb.append((char) iCharAt);
                    } else if (iCharAt <= 1114111) {
                        int i8 = iCharAt - 65536;
                        int i9 = (i8 >> 10) & 1023;
                        sb.append((char) ((i9 + 55296) - (i9 & 55296)));
                        int i10 = (i8 + 1023) - (i8 | 1023);
                        sb.append((char) ((i10 + Utf8.LOG_SURROGATE_HEADER) - (i10 & Utf8.LOG_SURROGATE_HEADER)));
                    }
                } else if (iCharAt <= 65535) {
                    sb.append((char) iCharAt);
                } else if (iCharAt <= 1114111) {
                    int i11 = iCharAt - 65536;
                    int i12 = i11 >> 10;
                    int i13 = (i12 + 1023) - (i12 | 1023);
                    sb.append((char) ((i13 + 55296) - (i13 & 55296)));
                    int i14 = (-1) - (((-1) - i11) | ((-1) - 1023));
                    sb.append((char) ((i14 + Utf8.LOG_SURROGATE_HEADER) - (i14 & Utf8.LOG_SURROGATE_HEADER)));
                }
            } else if (i2 == i5 || i2 == 2) {
                if (iCharAt >= 128) {
                    PercentEncodeUtf8(sb, iCharAt);
                } else if (iCharAt == 91 || iCharAt == 93) {
                    if (iArrSplitIRI == null || i4 < iArrSplitIRI[2] || i4 >= iArrSplitIRI[3]) {
                        PercentEncodeUtf8(sb, iCharAt);
                    } else if (iCharAt <= 65535) {
                        sb.append((char) iCharAt);
                    } else if (iCharAt <= 1114111) {
                        int i15 = iCharAt - 65536;
                        sb.append((char) ((-1) - (((-1) - ((-1) - (((-1) - (i15 >> 10)) | ((-1) - 1023)))) & ((-1) - 55296))));
                        int i16 = (i15 + 1023) - (i15 | 1023);
                        sb.append((char) ((i16 + Utf8.LOG_SURROGATE_HEADER) - (i16 & Utf8.LOG_SURROGATE_HEADER)));
                    }
                } else if (iCharAt <= 65535) {
                    sb.append((char) iCharAt);
                } else if (iCharAt <= 1114111) {
                    int i17 = iCharAt - 65536;
                    int i18 = i17 >> 10;
                    sb.append((char) (((i18 + 1023) - (i18 | 1023)) | 55296));
                    int i19 = (i17 + 1023) - (i17 | 1023);
                    sb.append((char) ((i19 + Utf8.LOG_SURROGATE_HEADER) - (i19 & Utf8.LOG_SURROGATE_HEADER)));
                }
            }
            i4++;
            i5 = 1;
        }
        return sb.toString();
    }

    public static boolean HasScheme(String str) {
        int[] iArrSplitIRI = str == null ? null : SplitIRI(str, 0, str.length(), ParseMode.IRIStrict);
        return iArrSplitIRI != null && iArrSplitIRI[0] >= 0;
    }

    public static boolean HasSchemeForURI(String str) {
        int[] iArrSplitIRI = str == null ? null : SplitIRI(str, 0, str.length(), ParseMode.URIStrict);
        return iArrSplitIRI != null && iArrSplitIRI[0] >= 0;
    }

    private static boolean IsHexChar(char c2) {
        return (c2 >= 'a' && c2 <= 'f') || (c2 >= 'A' && c2 <= 'F') || (c2 >= '0' && c2 <= '9');
    }

    private static boolean IsIRegNameChar(int i2) {
        return (i2 >= 97 && i2 <= 122) || (i2 >= 65 && i2 <= 90) || ((i2 >= 48 && i2 <= 57) || (((-1) - (((-1) - i2) | ((-1) - 127)) == i2 && "-._~!$&'()*+,;=".indexOf((char) i2) >= 0) || ((i2 >= 160 && i2 <= 55295) || ((i2 >= 63744 && i2 <= 64975) || ((i2 >= 65008 && i2 <= 65519) || ((i2 >= 921600 && i2 <= 983037) || (i2 >= 65536 && i2 <= 917501 && (i2 + 65534) - (i2 | 65534) != 65534)))))));
    }

    private static boolean IsIUserInfoChar(int i2) {
        return (i2 >= 97 && i2 <= 122) || (i2 >= 65 && i2 <= 90) || ((i2 >= 48 && i2 <= 57) || (((127 & i2) == i2 && "-._~:!$&'()*+,;=".indexOf((char) i2) >= 0) || ((i2 >= 160 && i2 <= 55295) || ((i2 >= 63744 && i2 <= 64975) || ((i2 >= 65008 && i2 <= 65519) || ((i2 >= 921600 && i2 <= 983037) || (i2 >= 65536 && i2 <= 917501 && (i2 + 65534) - (i2 | 65534) != 65534)))))));
    }

    private static boolean IsIfragmentChar(int i2) {
        return (i2 >= 97 && i2 <= 122) || (i2 >= 65 && i2 <= 90) || ((i2 >= 48 && i2 <= 57) || (((i2 + 127) - (127 | i2) == i2 && "/?-._~:@!$&'()*+,;=".indexOf((char) i2) >= 0) || ((i2 >= 160 && i2 <= 55295) || ((i2 >= 63744 && i2 <= 64975) || ((i2 >= 65008 && i2 <= 65519) || ((i2 >= 921600 && i2 <= 983037) || (i2 >= 65536 && i2 <= 917501 && (i2 + 65534) - (i2 | 65534) != 65534)))))));
    }

    private static boolean IsIpchar(int i2) {
        return (i2 >= 97 && i2 <= 122) || (i2 >= 65 && i2 <= 90) || ((i2 >= 48 && i2 <= 57) || (((i2 + 127) - (127 | i2) == i2 && "/-._~:@!$&'()*+,;=".indexOf((char) i2) >= 0) || ((i2 >= 160 && i2 <= 55295) || ((i2 >= 63744 && i2 <= 64975) || ((i2 >= 65008 && i2 <= 65519) || ((i2 >= 921600 && i2 <= 983037) || (i2 >= 65536 && i2 <= 917501 && (i2 & 65534) != 65534)))))));
    }

    private static boolean IsIqueryChar(int i2) {
        return (i2 >= 97 && i2 <= 122) || (i2 >= 65 && i2 <= 90) || ((i2 >= 48 && i2 <= 57) || (((-1) - (((-1) - i2) | ((-1) - 127)) == i2 && "/?-._~:@!$&'()*+,;=".indexOf((char) i2) >= 0) || ((i2 >= 160 && i2 <= 55295) || ((i2 >= 57344 && i2 <= 64975) || ((i2 >= 65008 && i2 <= 65519) || (i2 >= 65536 && i2 <= 1114109 && (i2 & 65534) != 65534 && (i2 < 917504 || i2 > 921599)))))));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean IsValidCurieReference(java.lang.String r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.URIUtility.IsValidCurieReference(java.lang.String, int, int):boolean");
    }

    public static boolean IsValidIRI(String str) {
        return (str == null ? null : SplitIRI(str, 0, str.length(), ParseMode.IRIStrict)) != null;
    }

    public static boolean IsValidIRI(String str, ParseMode parseMode) {
        return (str == null ? null : SplitIRI(str, 0, str.length(), parseMode)) != null;
    }

    private static String NormalizePath(String str) {
        int i2;
        int i3;
        int length = str.length();
        if (length == 0 || str.equals("..") || str.equals(".")) {
            return "";
        }
        if (str.indexOf(ValueSlashDot) < 0 && str.indexOf(ValueDotSlash) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char cCharAt = str.charAt(i4);
            int i5 = i4 + 3;
            if ((i5 <= length && cCharAt == '/' && str.charAt(i4 + 1) == '.' && str.charAt(i4 + 2) == '/') || ((i2 = i4 + 2) == length && cCharAt == '.' && str.charAt(i4 + 1) == '.')) {
                i4 += 2;
            } else {
                if (i5 > length || cCharAt != '.' || str.charAt(i4 + 1) != '.' || str.charAt(i2) != '/') {
                    if ((i2 > length || cCharAt != '.' || str.charAt(i4 + 1) != '/') && ((i3 = i4 + 1) != length || cCharAt != '.')) {
                        if (i2 == length && cCharAt == '/' && str.charAt(i3) == '.') {
                            sb.append('/');
                            break;
                        }
                        if (i5 == length && cCharAt == '/' && str.charAt(i3) == '.' && str.charAt(i2) == '.') {
                            int length2 = sb.length() - 1;
                            String string = sb.toString();
                            while (length2 >= 0 && string.charAt(length2) != '/') {
                                length2--;
                            }
                            sb.setLength(length2 >= 0 ? length2 : 0);
                            sb.append('/');
                        } else if (i4 + 4 <= length && cCharAt == '/' && str.charAt(i3) == '.' && str.charAt(i2) == '.' && str.charAt(i5) == '/') {
                            int length3 = sb.length() - 1;
                            String string2 = sb.toString();
                            while (length3 >= 0 && string2.charAt(length3) != '/') {
                                length3--;
                            }
                            if (length3 < 0) {
                                length3 = 0;
                            }
                            sb.setLength(length3);
                        } else {
                            sb.append(cCharAt);
                            i4 = i3;
                            while (i4 < length) {
                                char cCharAt2 = str.charAt(i4);
                                if (cCharAt2 == '/') {
                                    break;
                                }
                                sb.append(cCharAt2);
                                i4++;
                            }
                        }
                    } else {
                        i4++;
                    }
                }
                i4 = i5;
            }
        }
        return sb.toString();
    }

    private static int ParseIPLiteral(String str, int i2, int i3) {
        int i4;
        boolean z2;
        int i5 = i2;
        if (i5 == i3) {
            return -1;
        }
        char c2 = '.';
        int i6 = 1;
        if (str.charAt(i5) == 'v') {
            int i7 = i5 + 1;
            boolean z3 = false;
            while (i7 < i3 && IsHexChar(str.charAt(i7))) {
                i7++;
                z3 = true;
            }
            if (z3 && i7 < i3 && str.charAt(i7) == '.') {
                int i8 = i7 + 1;
                boolean z4 = false;
                while (i8 < i3) {
                    char cCharAt = str.charAt(i8);
                    if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < '0' || cCharAt > '9') && ((-1) - ((65535 - cCharAt) | ((-1) - 127)) != cCharAt || ":-._~!$&'()*+,;=".indexOf(cCharAt) < 0)))) {
                        break;
                    }
                    i8++;
                    z4 = true;
                }
                if (z4 && i8 < i3 && str.charAt(i8) == ']') {
                    return i8 + 1;
                }
            }
            return -1;
        }
        if (str.charAt(i5) != ':' && !IsHexChar(str.charAt(i5))) {
            return -1;
        }
        int i9 = i5;
        for (char c3 = 'A'; i9 < i3 && ((str.charAt(i9) >= c3 && str.charAt(i9) <= 'F') || ((str.charAt(i9) >= 'a' && str.charAt(i9) <= 'f') || ((str.charAt(i9) >= '0' && str.charAt(i9) <= ':') || str.charAt(i9) == '.'))); c3 = 'A') {
            i9++;
        }
        if (i9 >= i3 || !(str.charAt(i9) == ']' || str.charAt(i9) == '%')) {
            return -1;
        }
        int i10 = 8;
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i4 = 4;
            if (i11 >= 8) {
                break;
            }
            if (i12 == 0 && i9 - i5 > i6 && str.charAt(i5) == ':' && str.charAt(i5 + 1) == ':') {
                i5 += 2;
                if (i5 == i9) {
                    i12 = i6;
                    break;
                }
                i14 = i11;
                i12 = i6;
            }
            int i15 = i5;
            int i16 = 0;
            boolean z5 = false;
            int iToHex = 0;
            while (i16 < 4 && IsHexChar(str.charAt(i15))) {
                iToHex = (-1) - (((-1) - (iToHex << 4)) & ((-1) - ToHex(str.charAt(i15))));
                i15++;
                i16++;
                z5 = true;
            }
            if (!z5) {
                return -1;
            }
            if (i15 < i9 && str.charAt(i15) == '.' && i11 < 7) {
                i11 = i14;
                z2 = true;
                break;
            }
            iArr[i11] = iToHex;
            i13++;
            if (i15 < i9 && str.charAt(i15) != ':') {
                return -1;
            }
            if (i15 == i9 && i12 != 0) {
                i5 = i15;
                break;
            }
            if (i15 >= i9 || ((i5 = i15 + 1) < i9 && str.charAt(i5) == ':')) {
                i5 = i15;
            }
            i11++;
            i6 = 1;
        }
        i11 = i14;
        z2 = false;
        if (i5 != i9 && !z2) {
            return -1;
        }
        if (i12 != 0 || z2) {
            if (z2) {
                int[] iArr2 = new int[4];
                int i17 = 0;
                while (i17 < i4) {
                    if (i17 > 0) {
                        if (i5 >= i9 || str.charAt(i5) != c2) {
                            return -1;
                        }
                        i5++;
                    }
                    int i18 = i5 + 1;
                    if (i18 < i9 && str.charAt(i5) == '0' && str.charAt(i18) >= '0' && str.charAt(i18) <= '9') {
                        return -1;
                    }
                    boolean z6 = false;
                    int i19 = 0;
                    int iCharAt = 0;
                    while (i19 < i4 && str.charAt(i5) >= '0' && str.charAt(i5) <= '9') {
                        iCharAt = (iCharAt * 10) + (str.charAt(i5) - '0');
                        i5++;
                        i19++;
                        z6 = true;
                        i4 = 4;
                    }
                    if (!z6 || iCharAt > 255) {
                        return -1;
                    }
                    iArr2[i17] = iCharAt;
                    i17++;
                    i4 = 4;
                    c2 = '.';
                }
                if (i5 != i9) {
                    return -1;
                }
                i10 = 8;
                iArr[i13] = (iArr2[0] << 8) | iArr2[1];
                iArr[i13 + 1] = (-1) - (((-1) - (iArr2[2] << 8)) & ((-1) - iArr2[3]));
                i13 += 2;
                if (i12 == 0 && i13 != 8) {
                    return -1;
                }
            }
            if (i12 != 0) {
                int i20 = 8 - i13;
                if (i20 == 0) {
                    return -1;
                }
                int[] iArr3 = new int[i10];
                System.arraycopy(iArr, 0, iArr3, 0, i11);
                System.arraycopy(iArr, i11, iArr3, i20 + i11, i13 - i11);
                System.arraycopy(iArr3, 0, iArr, 0, i10);
            }
        } else if (i13 != 8) {
            return -1;
        }
        if (str.charAt(i5) != '%') {
            return i5 + 1;
        }
        int i21 = i5 + 2;
        if (i21 < i3 && str.charAt(i5 + 1) == '2' && str.charAt(i21) == '5') {
            boolean z7 = false;
            if ((-1) - (((-1) - iArr[0]) | ((-1) - 65472)) == 65152) {
                int i22 = i5 + 3;
                while (i22 < i3) {
                    char cCharAt2 = str.charAt(i22);
                    if (cCharAt2 == ']') {
                        if (z7) {
                            return i22 + 1;
                        }
                        return -1;
                    }
                    if (cCharAt2 == '%') {
                        int i23 = i22 + 2;
                        if (i23 >= i3 || !IsHexChar(str.charAt(i22 + 1)) || !IsHexChar(str.charAt(i23))) {
                            return -1;
                        }
                        i22 += 3;
                    } else {
                        if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9'))) {
                            if (cCharAt2 != '.' && cCharAt2 != '_' && cCharAt2 != '-' && cCharAt2 != '~') {
                                return -1;
                            }
                        }
                        i22++;
                    }
                    z7 = true;
                }
            }
        }
        return -1;
    }

    private static boolean PathHasDotComponent(String str) {
        int i2;
        int i3;
        if (str != null && str.length() != 0) {
            String strPercentDecode = PercentDecode(str);
            if (strPercentDecode.equals("..") || strPercentDecode.equals(".")) {
                return true;
            }
            if (strPercentDecode.indexOf(ValueSlashDot) < 0 && strPercentDecode.indexOf(ValueDotSlash) < 0) {
                return false;
            }
            int length = strPercentDecode.length();
            int i4 = 0;
            while (i4 < length) {
                char cCharAt = strPercentDecode.charAt(i4);
                int i5 = i4 + 3;
                if ((i5 <= length && cCharAt == '/' && strPercentDecode.charAt(i4 + 1) == '.' && strPercentDecode.charAt(i4 + 2) == '/') || ((i2 = i4 + 2) == length && cCharAt == '.' && strPercentDecode.charAt(i4 + 1) == '.')) {
                    return true;
                }
                if (i5 <= length && cCharAt == '.' && strPercentDecode.charAt(i4 + 1) == '.' && strPercentDecode.charAt(i2) == '/') {
                    return true;
                }
                if ((i2 <= length && cCharAt == '.' && strPercentDecode.charAt(i4 + 1) == '/') || ((i3 = i4 + 1) == length && cCharAt == '.')) {
                    return true;
                }
                if (i2 == length && cCharAt == '/' && strPercentDecode.charAt(i3) == '.') {
                    return true;
                }
                if (i5 == length && cCharAt == '/' && strPercentDecode.charAt(i3) == '.' && strPercentDecode.charAt(i2) == '.') {
                    return true;
                }
                if (i4 + 4 <= length && cCharAt == '/' && strPercentDecode.charAt(i3) == '.' && strPercentDecode.charAt(i2) == '.' && strPercentDecode.charAt(i5) == '/') {
                    return true;
                }
                i4 = i3;
                while (i4 < length && strPercentDecode.charAt(i4) != '/') {
                    i4++;
                }
            }
        }
        return false;
    }

    private static String PathParent(String str, int i2, int i3) {
        if (i2 > i3) {
            return "";
        }
        do {
            i3--;
            if (i3 < i2) {
                return "";
            }
        } while (str.charAt(i3) != '/');
        return str.substring(i2, ((i3 + 1) - i2) + i2);
    }

    public static String PercentDecode(String str) {
        if (str == null) {
            return null;
        }
        return PercentDecode(str, 0, str.length());
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String PercentDecode(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.URIUtility.PercentDecode(java.lang.String, int, int):java.lang.String");
    }

    private static void PercentEncode(StringBuilder sb, int i2) {
        sb.append('%');
        sb.append(HexChars.charAt((i2 >> 4) & 15));
        sb.append(HexChars.charAt((i2 + 15) - (i2 | 15)));
    }

    private static void PercentEncodeUtf8(StringBuilder sb, int i2) {
        if (i2 <= 127) {
            sb.append('%');
            int i3 = i2 >> 4;
            sb.append(HexChars.charAt((i3 + 15) - (i3 | 15)));
            sb.append(HexChars.charAt((-1) - (((-1) - i2) | ((-1) - 15))));
            return;
        }
        if (i2 <= 2047) {
            PercentEncode(sb, (-1) - (((-1) - ((i2 >> 6) & 31)) & ((-1) - 192)));
            PercentEncode(sb, (-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 63)))) & ((-1) - 128)));
            return;
        }
        if (i2 <= 65535) {
            PercentEncode(sb, (-1) - (((-1) - ((-1) - (((-1) - (i2 >> 12)) | ((-1) - 15)))) & ((-1) - CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY)));
            int i4 = i2 >> 6;
            int i5 = (i4 + 63) - (i4 | 63);
            PercentEncode(sb, (i5 + 128) - (i5 & 128));
            PercentEncode(sb, ((-1) - (((-1) - i2) | ((-1) - 63))) | 128);
            return;
        }
        PercentEncode(sb, (-1) - (((-1) - ((-1) - (((-1) - (i2 >> 18)) | ((-1) - 7)))) & ((-1) - 240)));
        PercentEncode(sb, (-1) - (((-1) - ((i2 >> 12) & 63)) & ((-1) - 128)));
        int i6 = (i2 >> 6) & 63;
        PercentEncode(sb, (i6 + 128) - (i6 & 128));
        PercentEncode(sb, (i2 & 63) | 128);
    }

    public static String RelativeResolve(String str, String str2) {
        return RelativeResolve(str, str2, ParseMode.IRIStrict);
    }

    public static String RelativeResolve(String str, String str2, ParseMode parseMode) {
        int[] iArrSplitIRI = str == null ? null : SplitIRI(str, 0, str.length(), parseMode);
        if (iArrSplitIRI == null) {
            return null;
        }
        int[] iArrSplitIRI2 = str2 != null ? SplitIRI(str2, 0, str2.length(), parseMode) : null;
        if (iArrSplitIRI2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (iArrSplitIRI[0] >= 0) {
            AppendScheme(sb, str, iArrSplitIRI);
            AppendAuthority(sb, str, iArrSplitIRI);
            AppendNormalizedPath(sb, str, iArrSplitIRI);
            AppendQuery(sb, str, iArrSplitIRI);
            AppendFragment(sb, str, iArrSplitIRI);
        } else if (iArrSplitIRI[2] >= 0) {
            AppendScheme(sb, str2, iArrSplitIRI2);
            AppendAuthority(sb, str, iArrSplitIRI);
            AppendNormalizedPath(sb, str, iArrSplitIRI);
            AppendQuery(sb, str, iArrSplitIRI);
            AppendFragment(sb, str, iArrSplitIRI);
        } else if (iArrSplitIRI[4] == iArrSplitIRI[5]) {
            AppendScheme(sb, str2, iArrSplitIRI2);
            AppendAuthority(sb, str2, iArrSplitIRI2);
            AppendPath(sb, str2, iArrSplitIRI2);
            if (iArrSplitIRI[6] >= 0) {
                AppendQuery(sb, str, iArrSplitIRI);
            } else {
                AppendQuery(sb, str2, iArrSplitIRI2);
            }
            AppendFragment(sb, str, iArrSplitIRI);
        } else {
            AppendScheme(sb, str2, iArrSplitIRI2);
            AppendAuthority(sb, str2, iArrSplitIRI2);
            int i2 = iArrSplitIRI[4];
            if (i2 >= iArrSplitIRI[5] || str.charAt(i2) != '/') {
                StringBuilder sb2 = new StringBuilder();
                if (iArrSplitIRI2[2] < 0 || iArrSplitIRI2[4] != iArrSplitIRI2[5]) {
                    sb2.append(PathParent(str2, iArrSplitIRI2[4], iArrSplitIRI2[5]));
                    AppendPath(sb2, str, iArrSplitIRI);
                    sb.append(NormalizePath(sb2.toString()));
                } else {
                    sb2.append('/');
                    AppendPath(sb2, str, iArrSplitIRI);
                    sb.append(NormalizePath(sb2.toString()));
                }
            } else {
                AppendNormalizedPath(sb, str, iArrSplitIRI);
            }
            AppendQuery(sb, str, iArrSplitIRI);
            AppendFragment(sb, str, iArrSplitIRI);
        }
        return sb.toString();
    }

    public static String RelativeResolveWithinBaseURI(String str, String str2) {
        String strRelativeResolve = RelativeResolve(str, str2);
        if (strRelativeResolve == null || PathHasDotComponent(UriPath(str, ParseMode.IRIStrict))) {
            return null;
        }
        String strDirectoryPath = DirectoryPath(str2);
        String strDirectoryPath2 = DirectoryPath(strRelativeResolve);
        if (strDirectoryPath == null || strDirectoryPath2 == null || !strDirectoryPath.equals(strDirectoryPath2)) {
            return null;
        }
        return strRelativeResolve;
    }

    public static int[] SplitIRI(String str) {
        if (str == null) {
            return null;
        }
        return SplitIRI(str, 0, str.length(), ParseMode.IRIStrict);
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x0293, code lost:
    
        if (r6 != r3) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] SplitIRI(java.lang.String r16, int r17, int r18, com.upokecenter.cbor.URIUtility.ParseMode r19) {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.URIUtility.SplitIRI(java.lang.String, int, int, com.upokecenter.cbor.URIUtility$ParseMode):int[]");
    }

    public static int[] SplitIRI(String str, ParseMode parseMode) {
        if (str == null) {
            return null;
        }
        return SplitIRI(str, 0, str.length(), parseMode);
    }

    public static String[] SplitIRIToStrings(String str) {
        int[] iArrSplitIRI = SplitIRI(str);
        if (iArrSplitIRI == null) {
            return null;
        }
        int i2 = iArrSplitIRI[0];
        String strSubstring = i2 < 0 ? null : str.substring(i2, (iArrSplitIRI[1] - i2) + i2);
        int i3 = iArrSplitIRI[2];
        String strSubstring2 = i3 < 0 ? null : str.substring(i3, (iArrSplitIRI[3] - i3) + i3);
        int i4 = iArrSplitIRI[4];
        String strSubstring3 = i4 < 0 ? null : str.substring(i4, (iArrSplitIRI[5] - i4) + i4);
        int i5 = iArrSplitIRI[6];
        String strSubstring4 = i5 < 0 ? null : str.substring(i5, (iArrSplitIRI[7] - i5) + i5);
        int i6 = iArrSplitIRI[8];
        String strSubstring5 = i6 < 0 ? null : str.substring(i6, (iArrSplitIRI[9] - i6) + i6);
        String[] strArr = new String[5];
        strArr[0] = strSubstring != null ? ToLowerCaseAscii(strSubstring) : null;
        strArr[1] = strSubstring2;
        strArr[2] = strSubstring3;
        strArr[3] = strSubstring4;
        strArr[4] = strSubstring5;
        return strArr;
    }

    private static int ToHex(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        if (c2 < 'a' || c2 > 'f') {
            return 1;
        }
        return c2 - 'W';
    }

    private static String ToLowerCaseAscii(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                        sb.append(cCharAt2);
                    } else {
                        sb.append((char) (cCharAt2 + TokenParser.SP));
                    }
                }
                return sb.toString();
            }
        }
        return str;
    }

    private static String UriPath(String str, ParseMode parseMode) {
        int[] iArrSplitIRI = SplitIRI(str, parseMode);
        if (iArrSplitIRI == null) {
            return null;
        }
        int i2 = iArrSplitIRI[4];
        return str.substring(i2, (iArrSplitIRI[5] - i2) + i2);
    }
}
