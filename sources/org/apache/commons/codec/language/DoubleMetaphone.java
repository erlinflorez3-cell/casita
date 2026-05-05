package org.apache.commons.codec.language;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.Global;
import com.facebook.imagepipeline.transcoder.JpegTranscoderUtils;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.codec.binary.StringUtils;

/* JADX INFO: loaded from: classes6.dex */
public class DoubleMetaphone implements StringEncoder {
    private static final String VOWELS = "AEIOUY";
    private int maxCodeLen = 4;
    private static final String[] SILENT_START = {"GN", "KN", "PN", "WR", "PS"};
    private static final String[] L_R_N_M_B_H_F_V_W_SPACE = {"L", "R", "N", "M", "B", "H", "F", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, Global.BLANK};
    private static final String[] ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};
    private static final String[] L_T_K_S_N_M_B_Z = {"L", ExifInterface.GPS_DIRECTION_TRUE, "K", ExifInterface.LATITUDE_SOUTH, "N", "M", "B", "Z"};

    public class DoubleMetaphoneResult {
        private final StringBuilder alternate;
        private final int maxLength;
        private final StringBuilder primary;

        public DoubleMetaphoneResult(int i2) {
            this.primary = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.alternate = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.maxLength = i2;
        }

        public void append(char c2) {
            appendPrimary(c2);
            appendAlternate(c2);
        }

        public void append(char c2, char c3) {
            appendPrimary(c2);
            appendAlternate(c3);
        }

        public void append(String str) {
            appendPrimary(str);
            appendAlternate(str);
        }

        public void append(String str, String str2) {
            appendPrimary(str);
            appendAlternate(str2);
        }

        public void appendAlternate(char c2) {
            if (this.alternate.length() < this.maxLength) {
                this.alternate.append(c2);
            }
        }

        public void appendAlternate(String str) {
            int length = this.maxLength - this.alternate.length();
            if (str.length() <= length) {
                this.alternate.append(str);
            } else {
                this.alternate.append((CharSequence) str, 0, length);
            }
        }

        public void appendPrimary(char c2) {
            if (this.primary.length() < this.maxLength) {
                this.primary.append(c2);
            }
        }

        public void appendPrimary(String str) {
            int length = this.maxLength - this.primary.length();
            if (str.length() <= length) {
                this.primary.append(str);
            } else {
                this.primary.append((CharSequence) str, 0, length);
            }
        }

        public String getAlternate() {
            return this.alternate.toString();
        }

        public String getPrimary() {
            return this.primary.toString();
        }

        public boolean isComplete() {
            return this.primary.length() >= this.maxLength && this.alternate.length() >= this.maxLength;
        }
    }

    private String cleanInput(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        return strTrim.toUpperCase(Locale.ENGLISH);
    }

    private boolean conditionC0(String str, int i2) {
        if (contains(str, i2, 4, "CHIA")) {
            return true;
        }
        if (i2 <= 1) {
            return false;
        }
        int i3 = i2 - 2;
        if (isVowel(charAt(str, i3)) || !contains(str, i2 - 1, 3, "ACH")) {
            return false;
        }
        char cCharAt = charAt(str, i2 + 2);
        return !(cCharAt == 'I' || cCharAt == 'E') || contains(str, i3, 6, "BACHER", "MACHER");
    }

    private boolean conditionCH0(String str, int i2) {
        if (i2 != 0) {
            return false;
        }
        int i3 = i2 + 1;
        if (contains(str, i3, 5, "HARAC", "HARIS") || contains(str, i3, 3, "HOR", "HYM", "HIA", "HEM")) {
            return !contains(str, 0, 5, "CHORE");
        }
        return false;
    }

    private boolean conditionCH1(String str, int i2) {
        if (!contains(str, 0, 4, "VAN ", "VON ") && !contains(str, 0, 3, "SCH") && !contains(str, i2 - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
            int i3 = i2 + 2;
            if (!contains(str, i3, 1, ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH)) {
                if (!contains(str, i2 - 1, 1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "O", "U", ExifInterface.LONGITUDE_EAST) && i2 != 0) {
                    return false;
                }
                if (!contains(str, i3, 1, L_R_N_M_B_H_F_V_W_SPACE) && i2 + 1 != str.length() - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean conditionL0(String str, int i2) {
        if (i2 == str.length() - 3 && contains(str, i2 - 1, 4, "ILLO", "ILLA", "ALLE")) {
            return true;
        }
        return (contains(str, str.length() - 2, 2, "AS", "OS") || contains(str, str.length() - 1, 1, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "O")) && contains(str, i2 - 1, 4, "ALLE");
    }

    private boolean conditionM0(String str, int i2) {
        int i3 = i2 + 1;
        if (charAt(str, i3) == 'M') {
            return true;
        }
        return contains(str, i2 + (-1), 3, "UMB") && (i3 == str.length() - 1 || contains(str, i2 + 2, 2, "ER"));
    }

    protected static boolean contains(String str, int i2, int i3, String... strArr) {
        int i4;
        if (i2 < 0 || (i4 = i3 + i2) > str.length()) {
            return false;
        }
        String strSubstring = str.substring(i2, i4);
        for (String str2 : strArr) {
            if (strSubstring.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private int handleAEIOUY(DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        if (i2 == 0) {
            doubleMetaphoneResult.append('A');
        }
        return i2 + 1;
    }

    private int handleC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        if (conditionC0(str, i2)) {
            doubleMetaphoneResult.append('K');
        } else if (i2 == 0 && contains(str, i2, 6, "CAESAR")) {
            doubleMetaphoneResult.append('S');
        } else {
            if (contains(str, i2, 2, "CH")) {
                return handleCH(str, doubleMetaphoneResult, i2);
            }
            if (!contains(str, i2, 2, "CZ") || contains(str, i2 - 2, 4, "WICZ")) {
                int i3 = i2 + 1;
                if (contains(str, i3, 3, "CIA")) {
                    doubleMetaphoneResult.append('X');
                } else {
                    if (contains(str, i2, 2, "CC") && (i2 != 1 || charAt(str, 0) != 'M')) {
                        return handleCC(str, doubleMetaphoneResult, i2);
                    }
                    if (contains(str, i2, 2, "CK", "CG", "CQ")) {
                        doubleMetaphoneResult.append('K');
                    } else if (!contains(str, i2, 2, "CI", "CE", "CY")) {
                        doubleMetaphoneResult.append('K');
                        if (!contains(str, i3, 2, " C", " Q", " G")) {
                            if (!contains(str, i3, 1, "C", "K", "Q") || contains(str, i3, 2, "CE", "CI")) {
                                return i3;
                            }
                        }
                    } else if (contains(str, i2, 3, "CIO", "CIE", "CIA")) {
                        doubleMetaphoneResult.append('S', 'X');
                    } else {
                        doubleMetaphoneResult.append('S');
                    }
                }
                return i2 + 3;
            }
            doubleMetaphoneResult.append('S', 'X');
        }
        return i2 + 2;
    }

    private int handleCC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        int i3 = i2 + 2;
        if (!contains(str, i3, 1, "I", ExifInterface.LONGITUDE_EAST, "H") || contains(str, i3, 2, "HU")) {
            doubleMetaphoneResult.append('K');
            return i3;
        }
        if ((i2 == 1 && charAt(str, i2 - 1) == 'A') || contains(str, i2 - 1, 5, "UCCEE", "UCCES")) {
            doubleMetaphoneResult.append("KS");
        } else {
            doubleMetaphoneResult.append('X');
        }
        return i2 + 3;
    }

    private int handleCH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        if (i2 > 0 && contains(str, i2, 4, "CHAE")) {
            doubleMetaphoneResult.append('K', 'X');
        } else {
            if (!conditionCH0(str, i2) && !conditionCH1(str, i2)) {
                if (i2 <= 0) {
                    doubleMetaphoneResult.append('X');
                } else if (contains(str, 0, 2, "MC")) {
                    doubleMetaphoneResult.append('K');
                } else {
                    doubleMetaphoneResult.append('X', 'K');
                }
                return i2 + 2;
            }
            doubleMetaphoneResult.append('K');
        }
        return i2 + 2;
    }

    private int handleD(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        if (!contains(str, i2, 2, "DG")) {
            if (contains(str, i2, 2, "DT", "DD")) {
                doubleMetaphoneResult.append('T');
                return i2 + 2;
            }
            doubleMetaphoneResult.append('T');
            return i2 + 1;
        }
        int i3 = i2 + 2;
        if (contains(str, i3, 1, "I", ExifInterface.LONGITUDE_EAST, "Y")) {
            doubleMetaphoneResult.append('J');
            return i2 + 3;
        }
        doubleMetaphoneResult.append("TK");
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int handleG(java.lang.String r13, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r14, int r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleG(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean):int");
    }

    private int handleGH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        if (i2 > 0 && !isVowel(charAt(str, i2 - 1))) {
            doubleMetaphoneResult.append('K');
        } else {
            if (i2 == 0) {
                int i3 = i2 + 2;
                if (charAt(str, i3) == 'I') {
                    doubleMetaphoneResult.append('J');
                    return i3;
                }
                doubleMetaphoneResult.append('K');
                return i3;
            }
            if ((i2 <= 1 || !contains(str, i2 - 2, 1, "B", "H", "D")) && ((i2 <= 2 || !contains(str, i2 - 3, 1, "B", "H", "D")) && (i2 <= 3 || !contains(str, i2 - 4, 1, "B", "H")))) {
                if (i2 > 2 && charAt(str, i2 - 1) == 'U' && contains(str, i2 - 3, 1, "C", "G", "L", "R", ExifInterface.GPS_DIRECTION_TRUE)) {
                    doubleMetaphoneResult.append('F');
                } else if (i2 > 0 && charAt(str, i2 - 1) != 'I') {
                    doubleMetaphoneResult.append('K');
                }
            }
        }
        return i2 + 2;
    }

    private int handleH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        if ((i2 != 0 && !isVowel(charAt(str, i2 - 1))) || !isVowel(charAt(str, i2 + 1))) {
            return i2 + 1;
        }
        doubleMetaphoneResult.append('H');
        return i2 + 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int handleJ(java.lang.String r12, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r13, int r14, boolean r15) {
        /*
            r11 = this;
            r3 = 1
            java.lang.String[] r0 = new java.lang.String[r3]
            r4 = 0
            java.lang.String r10 = "JOSE"
            r0[r4] = r10
            r5 = 4
            boolean r0 = contains(r12, r14, r5, r0)
            r7 = 32
            java.lang.String r6 = "SAN "
            r1 = 72
            r2 = 74
            if (r0 != 0) goto L21
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r4] = r6
            boolean r0 = contains(r12, r4, r5, r0)
            if (r0 == 0) goto L45
        L21:
            if (r14 != 0) goto L2b
            int r0 = r14 + 4
            char r0 = r11.charAt(r12, r0)
            if (r0 == r7) goto L3b
        L2b:
            int r0 = r12.length()
            if (r0 == r5) goto L3b
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r4] = r6
            boolean r0 = contains(r12, r4, r5, r0)
            if (r0 == 0) goto L41
        L3b:
            r13.append(r1)
        L3e:
            int r1 = r14 + 1
        L40:
            return r1
        L41:
            r13.append(r2, r1)
            goto L3e
        L45:
            r9 = 2
            r8 = 65
            if (r14 != 0) goto L62
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r4] = r10
            boolean r0 = contains(r12, r14, r5, r0)
            if (r0 != 0) goto L62
            r13.append(r2, r8)
        L57:
            int r1 = r14 + 1
            char r0 = r11.charAt(r12, r1)
            if (r0 != r2) goto L40
            int r1 = r14 + 2
            goto L40
        L62:
            int r5 = r14 + (-1)
            char r0 = r11.charAt(r12, r5)
            boolean r0 = r11.isVowel(r0)
            if (r0 == 0) goto L84
            if (r15 != 0) goto L84
            int r6 = r14 + 1
            char r0 = r11.charAt(r12, r6)
            if (r0 == r8) goto L80
            char r6 = r11.charAt(r12, r6)
            r0 = 79
            if (r6 != r0) goto L84
        L80:
            r13.append(r2, r1)
            goto L57
        L84:
            int r0 = r12.length()
            int r0 = r0 - r3
            if (r14 != r0) goto L8f
            r13.append(r2, r7)
            goto L57
        L8f:
            int r1 = r14 + 1
            java.lang.String[] r0 = org.apache.commons.codec.language.DoubleMetaphone.L_T_K_S_N_M_B_Z
            boolean r0 = contains(r12, r1, r3, r0)
            if (r0 != 0) goto L57
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r0 = "S"
            r1[r4] = r0
            java.lang.String r0 = "K"
            r1[r3] = r0
            java.lang.String r0 = "L"
            r1[r9] = r0
            boolean r0 = contains(r12, r5, r3, r1)
            if (r0 != 0) goto L57
            r13.append(r2)
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleJ(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean):int");
    }

    private int handleL(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        int i3 = i2 + 1;
        if (charAt(str, i3) != 'L') {
            doubleMetaphoneResult.append('L');
            return i3;
        }
        if (conditionL0(str, i2)) {
            doubleMetaphoneResult.appendPrimary('L');
        } else {
            doubleMetaphoneResult.append('L');
        }
        return i2 + 2;
    }

    private int handleP(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        int i3 = i2 + 1;
        if (charAt(str, i3) == 'H') {
            doubleMetaphoneResult.append('F');
            return i2 + 2;
        }
        doubleMetaphoneResult.append('P');
        if (contains(str, i3, 1, "P", "B")) {
            i3 = i2 + 2;
        }
        return i3;
    }

    private int handleR(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2, boolean z2) {
        if (i2 != str.length() - 1 || z2 || !contains(str, i2 - 2, 2, "IE") || contains(str, i2 - 4, 2, "ME", "MA")) {
            doubleMetaphoneResult.append('R');
        } else {
            doubleMetaphoneResult.appendAlternate('R');
        }
        int i3 = i2 + 1;
        return charAt(str, i3) == 'R' ? i2 + 2 : i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int handleS(java.lang.String r12, org.apache.commons.codec.language.DoubleMetaphone.DoubleMetaphoneResult r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.language.DoubleMetaphone.handleS(java.lang.String, org.apache.commons.codec.language.DoubleMetaphone$DoubleMetaphoneResult, int, boolean):int");
    }

    private int handleSC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        int i3 = i2 + 2;
        if (charAt(str, i3) == 'H') {
            int i4 = i2 + 3;
            if (contains(str, i4, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (contains(str, i4, 2, "ER", "EN")) {
                    doubleMetaphoneResult.append("X", "SK");
                } else {
                    doubleMetaphoneResult.append("SK");
                }
            } else if (i2 != 0 || isVowel(charAt(str, 3)) || charAt(str, 3) == 'W') {
                doubleMetaphoneResult.append('X');
            } else {
                doubleMetaphoneResult.append('X', 'S');
            }
        } else if (contains(str, i3, 1, "I", ExifInterface.LONGITUDE_EAST, "Y")) {
            doubleMetaphoneResult.append('S');
        } else {
            doubleMetaphoneResult.append("SK");
        }
        return i2 + 3;
    }

    private int handleT(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        if (contains(str, i2, 4, "TION") || contains(str, i2, 3, "TIA", "TCH")) {
            doubleMetaphoneResult.append('X');
            return i2 + 3;
        }
        if (!contains(str, i2, 2, "TH") && !contains(str, i2, 3, "TTH")) {
            doubleMetaphoneResult.append('T');
            int i3 = i2 + 1;
            return contains(str, i3, 1, ExifInterface.GPS_DIRECTION_TRUE, "D") ? i2 + 2 : i3;
        }
        int i4 = i2 + 2;
        if (contains(str, i4, 2, "OM", "AM") || contains(str, 0, 4, "VAN ", "VON ") || contains(str, 0, 3, "SCH")) {
            doubleMetaphoneResult.append('T');
        } else {
            doubleMetaphoneResult.append('0', 'T');
        }
        return i4;
    }

    private int handleW(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        if (contains(str, i2, 2, "WR")) {
            doubleMetaphoneResult.append('R');
            return i2 + 2;
        }
        if (i2 == 0) {
            int i3 = i2 + 1;
            if (isVowel(charAt(str, i3)) || contains(str, i2, 2, "WH")) {
                if (isVowel(charAt(str, i3))) {
                    doubleMetaphoneResult.append('A', 'F');
                } else {
                    doubleMetaphoneResult.append('A');
                }
                return i3;
            }
        }
        if ((i2 == str.length() - 1 && isVowel(charAt(str, i2 - 1))) || contains(str, i2 - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") || contains(str, 0, 3, "SCH")) {
            doubleMetaphoneResult.appendAlternate('F');
        } else if (contains(str, i2, 4, "WICZ", "WITZ")) {
            doubleMetaphoneResult.append("TS", "FX");
            return i2 + 4;
        }
        return i2 + 1;
    }

    private int handleX(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2) {
        if (i2 == 0) {
            doubleMetaphoneResult.append('S');
            return i2 + 1;
        }
        if (i2 != str.length() - 1 || (!contains(str, i2 - 3, 3, "IAU", "EAU") && !contains(str, i2 - 2, 2, "AU", "OU"))) {
            doubleMetaphoneResult.append("KS");
        }
        int i3 = i2 + 1;
        return contains(str, i3, 1, "C", "X") ? i2 + 2 : i3;
    }

    private int handleZ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i2, boolean z2) {
        int i3 = i2 + 1;
        if (charAt(str, i3) == 'H') {
            doubleMetaphoneResult.append('J');
            return i2 + 2;
        }
        if (contains(str, i3, 2, "ZO", "ZI", "ZA") || (z2 && i2 > 0 && charAt(str, i2 - 1) != 'T')) {
            doubleMetaphoneResult.append(ExifInterface.LATITUDE_SOUTH, "TS");
        } else {
            doubleMetaphoneResult.append('S');
        }
        if (charAt(str, i3) == 'Z') {
            i3 = i2 + 2;
        }
        return i3;
    }

    private boolean isSilentStart(String str) {
        for (String str2 : SILENT_START) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSlavoGermanic(String str) {
        return str.indexOf(87) > -1 || str.indexOf(75) > -1 || str.contains("CZ") || str.contains("WITZ");
    }

    private boolean isVowel(char c2) {
        return VOWELS.indexOf(c2) != -1;
    }

    protected char charAt(String str, int i2) {
        if (i2 < 0 || i2 >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i2);
    }

    public String doubleMetaphone(String str) {
        return doubleMetaphone(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.apache.commons.codec.language.DoubleMetaphone] */
    public String doubleMetaphone(String str, boolean z2) {
        int i2;
        ?? CleanInput = cleanInput(str);
        if (CleanInput == 0) {
            return null;
        }
        boolean zIsSlavoGermanic = isSlavoGermanic(CleanInput);
        ?? IsSilentStart = isSilentStart(CleanInput);
        DoubleMetaphoneResult doubleMetaphoneResult = new DoubleMetaphoneResult(getMaxCodeLen());
        while (!doubleMetaphoneResult.isComplete() && IsSilentStart <= CleanInput.length() - 1) {
            char cCharAt = CleanInput.charAt(IsSilentStart);
            if (cCharAt == 199) {
                doubleMetaphoneResult.append('S');
            } else if (cCharAt != 209) {
                switch (cCharAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case JpegTranscoderUtils.DEFAULT_JPEG_QUALITY /* 85 */:
                    case 'Y':
                        IsSilentStart = handleAEIOUY(doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'B':
                        doubleMetaphoneResult.append('P');
                        i2 = IsSilentStart + 1;
                        IsSilentStart = charAt(CleanInput, i2) != 'B' ? i2 : IsSilentStart + 2;
                        break;
                    case 'C':
                        IsSilentStart = handleC(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'D':
                        IsSilentStart = handleD(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'F':
                        doubleMetaphoneResult.append('F');
                        i2 = IsSilentStart + 1;
                        if (charAt(CleanInput, i2) != 'F') {
                        }
                        break;
                    case 'G':
                        IsSilentStart = handleG(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'H':
                        IsSilentStart = handleH(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'J':
                        IsSilentStart = handleJ(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'K':
                        doubleMetaphoneResult.append('K');
                        i2 = IsSilentStart + 1;
                        if (charAt(CleanInput, i2) != 'K') {
                        }
                        break;
                    case 'L':
                        IsSilentStart = handleL(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'M':
                        doubleMetaphoneResult.append('M');
                        if (!conditionM0(CleanInput, IsSilentStart)) {
                        }
                        break;
                    case 'N':
                        doubleMetaphoneResult.append('N');
                        i2 = IsSilentStart + 1;
                        if (charAt(CleanInput, i2) != 'N') {
                        }
                        break;
                    case 'P':
                        IsSilentStart = handleP(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'Q':
                        doubleMetaphoneResult.append('K');
                        i2 = IsSilentStart + 1;
                        if (charAt(CleanInput, i2) != 'Q') {
                        }
                        break;
                    case 'R':
                        IsSilentStart = handleR(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'S':
                        IsSilentStart = handleS(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'T':
                        IsSilentStart = handleT(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'V':
                        doubleMetaphoneResult.append('F');
                        i2 = IsSilentStart + 1;
                        if (charAt(CleanInput, i2) != 'V') {
                        }
                        break;
                    case 'W':
                        IsSilentStart = handleW(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'X':
                        IsSilentStart = handleX(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'Z':
                        IsSilentStart = handleZ(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                }
            } else {
                doubleMetaphoneResult.append('N');
            }
            IsSilentStart++;
        }
        return z2 ? doubleMetaphoneResult.getAlternate() : doubleMetaphoneResult.getPrimary();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return doubleMetaphone((String) obj);
        }
        throw new EncoderException("DoubleMetaphone encode parameter is not of type String");
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return doubleMetaphone(str);
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2) {
        return isDoubleMetaphoneEqual(str, str2, false);
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2, boolean z2) {
        return StringUtils.equals(doubleMetaphone(str, z2), doubleMetaphone(str2, z2));
    }

    public void setMaxCodeLen(int i2) {
        this.maxCodeLen = i2;
    }
}
