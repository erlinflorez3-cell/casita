package com.upokecenter.numbers;

/* JADX INFO: loaded from: classes5.dex */
final class EDecimalTextString {
    private static final int MaxSafeInt = 214748363;

    private EDecimalTextString() {
    }

    static EDecimal FromString(String str, int i2, int i3, EContext eContext, boolean z2) {
        boolean z3;
        EDecimal eDecimalParseSpecialValue;
        int i4 = i2;
        if (str == null) {
            if (z2) {
                throw new NullPointerException("chars");
            }
            return null;
        }
        if (i4 < 0) {
            if (z2) {
                throw new NumberFormatException("offset(" + i4 + ") is less than 0");
            }
            return null;
        }
        if (i4 > str.length()) {
            if (z2) {
                throw new NumberFormatException("offset(" + i4 + ") is more than " + str.length());
            }
            return null;
        }
        if (i3 <= 0) {
            if (i3 == 0) {
                if (z2) {
                    throw new NumberFormatException("length is 0");
                }
                return null;
            }
            if (z2) {
                throw new NumberFormatException("length(" + i3 + ") is less than 0");
            }
            return null;
        }
        if (i3 > str.length()) {
            if (z2) {
                throw new NumberFormatException("length(" + i3 + ") is more than " + str.length());
            }
            return null;
        }
        if (str.length() - i4 < i3) {
            if (z2) {
                throw new NumberFormatException("chars's length minus " + i4 + "(" + (str.length() - i4) + ") is less than " + i3);
            }
            return null;
        }
        int i5 = i3 + i4;
        char cCharAt = str.charAt(i4);
        if (cCharAt == '-') {
            i4++;
            if (i4 >= i5) {
                if (z2) {
                    throw new NumberFormatException();
                }
                return null;
            }
            cCharAt = str.charAt(i4);
            z3 = true;
        } else {
            char cCharAt2 = str.charAt(i4);
            z3 = false;
            if (cCharAt2 == '+') {
                i4++;
                if (i4 >= i5) {
                    if (z2) {
                        throw new NumberFormatException();
                    }
                    return null;
                }
                cCharAt = str.charAt(i4);
            }
        }
        return ((cCharAt < '0' || cCharAt > '9') && (eDecimalParseSpecialValue = ParseSpecialValue(str, i4, i5, z3, eContext, z2)) != null) ? eDecimalParseSpecialValue : (eContext == null || !eContext.getHasMaxPrecision() || !eContext.getHasExponentRange() || eContext.isSimplified()) ? ParseOrdinaryNumber(str, i4, i5, z3, eContext, z2) : ParseOrdinaryNumberLimitedPrecision(str, i4, i5, z3, eContext, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a2 A[PHI: r4 r24
  0x01a2: PHI (r4v16 boolean) = (r4v15 boolean), (r4v3 boolean), (r4v3 boolean) binds: [B:147:0x01c4, B:139:0x01b1, B:131:0x01a0] A[DONT_GENERATE, DONT_INLINE]
  0x01a2: PHI (r24v8 boolean) = (r24v6 boolean), (r24v3 boolean), (r24v3 boolean) binds: [B:147:0x01c4, B:139:0x01b1, B:131:0x01a0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.upokecenter.numbers.EDecimal ParseOrdinaryNumber(java.lang.String r23, int r24, int r25, boolean r26, com.upokecenter.numbers.EContext r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EDecimalTextString.ParseOrdinaryNumber(java.lang.String, int, int, boolean, com.upokecenter.numbers.EContext, boolean):com.upokecenter.numbers.EDecimal");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0120, code lost:
    
        if (r16 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0122, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0127, code lost:
    
        if (r0 < 214748364) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0129, code lost:
    
        if (r0 != 214748364) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x012c, code lost:
    
        if (r1 >= 7) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012e, code lost:
    
        r0 = (r0 * 10) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0131, code lost:
    
        r10 = r10 + 1;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0136, code lost:
    
        r0 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x013c, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x013e, code lost:
    
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0141, code lost:
    
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0144, code lost:
    
        if (r29 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0146, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x014d, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x014f, code lost:
    
        if (r15 != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0151, code lost:
    
        if (r29 != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0153, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0159, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x015a, code lost:
    
        r0 = r0 * r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x015e, code lost:
    
        if (r2 <= 12) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0160, code lost:
    
        if (r18 >= 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0166, code lost:
    
        return com.upokecenter.numbers.EDecimal.SignalUnderflow(r28, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x016b, code lost:
    
        return com.upokecenter.numbers.EDecimal.SignalOverflow(r28, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x016c, code lost:
    
        r17 = -1;
        r0 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0171, code lost:
    
        if (r10 == r26) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0173, code lost:
    
        if (r29 != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0175, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x017c, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0180, code lost:
    
        if (r0 == Integer.MAX_VALUE) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0185, code lost:
    
        if (r0 <= (-2147483647)) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0189, code lost:
    
        if (r3 == Long.MAX_VALUE) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x018b, code lost:
    
        r0 = ((long) r0) + ((long) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x018e, code lost:
    
        if (r27 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0190, code lost:
    
        r3 = -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0191, code lost:
    
        r0 = com.upokecenter.numbers.EDecimal.Create(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0195, code lost:
    
        if (r27 == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0197, code lost:
    
        if (r24 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0199, code lost:
    
        r0 = r0.Negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01a1, code lost:
    
        return r0.RoundToPrecision(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01a2, code lost:
    
        if (r19 != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01a4, code lost:
    
        r0 = com.upokecenter.numbers.EInteger.FromInt32(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01a9, code lost:
    
        if (r18 >= 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ab, code lost:
    
        r0 = r0.Negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01af, code lost:
    
        r2 = r0.Add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01b4, code lost:
    
        if (r23 == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01b6, code lost:
    
        r2 = r2.Subtract(1);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01c0, code lost:
    
        if (r28.getHasExponentRange() == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01e2, code lost:
    
        if (r2.Add(r7).Subtract(1).compareTo(r28.getEMin().Subtract(r28.getPrecision().Subtract(1)).Subtract(1)) >= 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01e8, code lost:
    
        return com.upokecenter.numbers.EDecimal.SignalUnderflow(r28, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01ea, code lost:
    
        r0 = com.upokecenter.numbers.EInteger.FromSubstring(r24, r17, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01f9, code lost:
    
        if (r2.compareTo(r28.getEMax()) <= 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01ff, code lost:
    
        return com.upokecenter.numbers.EDecimal.SignalOverflow(r28, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0200, code lost:
    
        if (r24 != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0202, code lost:
    
        r0 = com.upokecenter.numbers.EDecimal.Create(com.upokecenter.numbers.EInteger.FromInt32(0), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x020b, code lost:
    
        if (r27 == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x020d, code lost:
    
        r0 = r0.Negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0215, code lost:
    
        return r0.RoundToPrecision(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0218, code lost:
    
        if (r22 == r6) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x021a, code lost:
    
        r1 = com.upokecenter.numbers.EInteger.FromString(com.upokecenter.numbers.Extras.CharsConcat(r24, r25, r9 - r25, r24, r22, r6 - r22));
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0231, code lost:
    
        if (r23 == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0233, code lost:
    
        r1 = r1.Multiply(10).Add(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x023d, code lost:
    
        if (r27 == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x023f, code lost:
    
        r1 = r1.Negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x024b, code lost:
    
        return com.upokecenter.numbers.EDecimal.Create(r1, r2).RoundToPrecision(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x024c, code lost:
    
        r1 = com.upokecenter.numbers.EInteger.FromSubstring(r24, r25, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c8, code lost:
    
        if (r5 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ca, code lost:
    
        if (r29 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d2, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d3, code lost:
    
        r5 = !r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d7, code lost:
    
        if (r19 == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d9, code lost:
    
        if (r10 != r26) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00db, code lost:
    
        if (r29 != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00dd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e3, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ec, code lost:
    
        if (r24.charAt(r10) == '+') goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f2, code lost:
    
        if (r24.charAt(r10) != '-') goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f8, code lost:
    
        if (r24.charAt(r10) != '-') goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00fa, code lost:
    
        r18 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00fc, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00fe, code lost:
    
        r17 = r10;
        r2 = 0;
        r0 = 0;
        r15 = false;
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0105, code lost:
    
        if (r10 >= r26) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0107, code lost:
    
        r1 = r24.charAt(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x010d, code lost:
    
        if (r1 < '0') goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0111, code lost:
    
        if (r1 > '9') goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0113, code lost:
    
        r1 = r1 - '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0115, code lost:
    
        if (r1 == 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0117, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0118, code lost:
    
        r16 = (-1) - (((-1) - r16) & ((-1) - r15));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.upokecenter.numbers.EDecimal ParseOrdinaryNumberLimitedPrecision(java.lang.String r24, int r25, int r26, boolean r27, com.upokecenter.numbers.EContext r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EDecimalTextString.ParseOrdinaryNumberLimitedPrecision(java.lang.String, int, int, boolean, com.upokecenter.numbers.EContext, boolean):com.upokecenter.numbers.EDecimal");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0115, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0116, code lost:
    
        if (r20 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x011b, code lost:
    
        if (r3 > com.upokecenter.numbers.EDecimalTextString.MaxSafeInt) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x011d, code lost:
    
        if (r19 < 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x011f, code lost:
    
        if (r2 != 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0121, code lost:
    
        if (r6 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0123, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0124, code lost:
    
        if (r20 != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0126, code lost:
    
        if (r22 == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0128, code lost:
    
        r0 = -(r7 - r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0130, code lost:
    
        if (r4 > com.upokecenter.numbers.EDecimalTextString.MaxSafeInt) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0132, code lost:
    
        r0 = r4;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0134, code lost:
    
        if (r24 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0136, code lost:
    
        r0 = -r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0137, code lost:
    
        if (r14 < 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0139, code lost:
    
        if (r24 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x013f, code lost:
    
        if (r0 == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0148, code lost:
    
        return com.upokecenter.numbers.EDecimal.Create(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0149, code lost:
    
        r15 = r22;
        r14 = 0;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0150, code lost:
    
        if (r15 >= r5) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0152, code lost:
    
        r13 = r11.charAt(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0156, code lost:
    
        if (r14 < 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x015a, code lost:
    
        if (r14 < 18) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x015c, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x015d, code lost:
    
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x015e, code lost:
    
        if (r15 >= r7) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0160, code lost:
    
        r13 = r11.charAt(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0164, code lost:
    
        if (r14 < 0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0168, code lost:
    
        if (r14 < 18) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x016a, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x016e, code lost:
    
        if (r14 > 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0170, code lost:
    
        if (r13 == '0') goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0172, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0174, code lost:
    
        r0 = (r0 * 10) + ((long) (r13 - '0'));
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x017d, code lost:
    
        if (r14 > 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0181, code lost:
    
        if (r13 == '0') goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0183, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0185, code lost:
    
        r0 = (r0 * 10) + ((long) (r13 - '0'));
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0190, code lost:
    
        if (r6 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0192, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0193, code lost:
    
        if (r19 >= 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0195, code lost:
    
        r0 = r0 - ((long) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x019c, code lost:
    
        if (r0 < 2147483647L) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01a3, code lost:
    
        if (r0 > (-2147483648L)) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01a5, code lost:
    
        r2 = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01a8, code lost:
    
        r6 = com.upokecenter.numbers.EInteger.FromInt64(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01ad, code lost:
    
        if (r3 == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01af, code lost:
    
        r0 = r0 + ((long) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01b2, code lost:
    
        if (r19 >= 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01b4, code lost:
    
        r6 = r6.Subtract(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01b9, code lost:
    
        if (r3 == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01bb, code lost:
    
        r6 = r6.Add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01c5, code lost:
    
        if (r4 <= com.upokecenter.numbers.EDecimalTextString.MaxSafeInt) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01c7, code lost:
    
        if (r22 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01c9, code lost:
    
        r5 = r5 - r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01cc, code lost:
    
        if (r5 != 1) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01ce, code lost:
    
        if (r21 != 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01d0, code lost:
    
        r1 = com.upokecenter.numbers.EInteger.FromSubstring(r11, r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01d4, code lost:
    
        if (r20 == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01d9, code lost:
    
        if (r3 <= com.upokecenter.numbers.EDecimalTextString.MaxSafeInt) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01db, code lost:
    
        r0 = com.upokecenter.numbers.EInteger.FromSubstring(r11, r18, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01e1, code lost:
    
        if (r6 != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01e3, code lost:
    
        r6 = com.upokecenter.numbers.EInteger.FromInt32(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01e7, code lost:
    
        if (r19 >= 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01e9, code lost:
    
        r6 = r6.Subtract(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01ed, code lost:
    
        if (r6 != null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01ef, code lost:
    
        r3 = com.upokecenter.numbers.FastIntegerFixed.FromInt32(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01f3, code lost:
    
        if (r1 != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01f5, code lost:
    
        r2 = com.upokecenter.numbers.FastIntegerFixed.FromInt32(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01ff, code lost:
    
        return new com.upokecenter.numbers.EDecimal(r2, r3, r24 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0204, code lost:
    
        if (r1.CanFitInInt32() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0206, code lost:
    
        r2 = com.upokecenter.numbers.FastIntegerFixed.FromInt32(r1.ToInt32Checked());
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x020f, code lost:
    
        r2 = com.upokecenter.numbers.FastIntegerFixed.FromBig(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0214, code lost:
    
        r3 = com.upokecenter.numbers.FastIntegerFixed.FromBig(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0219, code lost:
    
        r6 = r6.Add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0220, code lost:
    
        r11 = r11;
        r1 = com.upokecenter.numbers.EInteger.FromString(com.upokecenter.numbers.Extras.CharsConcat(r11, r22, r5, r11, r8, r7 - r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0232, code lost:
    
        r1 = com.upokecenter.numbers.EInteger.FromSubstring(r11, r22, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0239, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009a, code lost:
    
        if (r15 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009c, code lost:
    
        if (r25 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a4, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
    
        if (r20 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a7, code lost:
    
        if (r12 != r23) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a9, code lost:
    
        if (r25 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ab, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b1, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b2, code lost:
    
        r3 = r11.charAt(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ba, code lost:
    
        if (r3 == '+') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bc, code lost:
    
        if (r3 != '-') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00be, code lost:
    
        if (r3 != '-') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c0, code lost:
    
        r19 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c2, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c4, code lost:
    
        r1 = r12;
        r0 = false;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c7, code lost:
    
        if (r1 >= r23) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c9, code lost:
    
        r13 = r11.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cd, code lost:
    
        if (r13 < r14) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00d1, code lost:
    
        if (r13 > '9') goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d3, code lost:
    
        r13 = r13 - '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d8, code lost:
    
        if (r3 > com.upokecenter.numbers.EDecimalTextString.MaxSafeInt) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00da, code lost:
    
        r13 = r13 + (r3 * 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00dd, code lost:
    
        r1 = r1 + 1;
        r14 = '0';
        r3 = r13;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e4, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e6, code lost:
    
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e9, code lost:
    
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ec, code lost:
    
        if (r25 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ee, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f5, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00f6, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f7, code lost:
    
        if (r0 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00f9, code lost:
    
        if (r25 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00fb, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0101, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0102, code lost:
    
        r3 = 0;
        r18 = -1;
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0108, code lost:
    
        r18 = r12;
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x010b, code lost:
    
        if (r12 == r23) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x010d, code lost:
    
        if (r25 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x010f, code lost:
    
        return r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.upokecenter.numbers.EDecimal ParseOrdinaryNumberNoContext(java.lang.String r21, int r22, int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EDecimalTextString.ParseOrdinaryNumberNoContext(java.lang.String, int, int, boolean, boolean):com.upokecenter.numbers.EDecimal");
    }

    private static EDecimal ParseSpecialValue(String str, int i2, int i3, boolean z2, EContext eContext, boolean z3) {
        FastInteger fastIntegerFromBig;
        EInteger eIntegerFromSubstring;
        FastInteger fastIntegerFromBig2;
        if (i2 + 8 == i3 && (str.charAt(i2) == 'I' || str.charAt(i2) == 'i')) {
            int i4 = i2 + 1;
            if (str.charAt(i4) == 'N' || str.charAt(i4) == 'n') {
                int i5 = i2 + 2;
                if (str.charAt(i5) == 'F' || str.charAt(i5) == 'f') {
                    int i6 = i2 + 3;
                    if (str.charAt(i6) == 'I' || str.charAt(i6) == 'i') {
                        int i7 = i2 + 4;
                        if (str.charAt(i7) == 'N' || str.charAt(i7) == 'n') {
                            int i8 = i2 + 5;
                            if (str.charAt(i8) == 'I' || str.charAt(i8) == 'i') {
                                int i9 = i2 + 6;
                                if (str.charAt(i9) == 'T' || str.charAt(i9) == 't') {
                                    int i10 = i2 + 7;
                                    if (str.charAt(i10) == 'Y' || str.charAt(i10) == 'y') {
                                        if (eContext == null || !eContext.isSimplified() || i2 >= i3) {
                                            return z2 ? EDecimal.NegativeInfinity : EDecimal.PositiveInfinity;
                                        }
                                        if (z3) {
                                            throw new NumberFormatException("Infinity not allowed");
                                        }
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i11 = i2 + 3;
        if (i11 == i3 && (str.charAt(i2) == 'I' || str.charAt(i2) == 'i')) {
            int i12 = i2 + 1;
            if (str.charAt(i12) == 'N' || str.charAt(i12) == 'n') {
                int i13 = i2 + 2;
                if (str.charAt(i13) == 'F' || str.charAt(i13) == 'f') {
                    if (eContext == null || !eContext.isSimplified() || i2 >= i3) {
                        return z2 ? EDecimal.NegativeInfinity : EDecimal.PositiveInfinity;
                    }
                    if (z3) {
                        throw new NumberFormatException("Infinity not allowed");
                    }
                    return null;
                }
            }
        }
        if (i11 <= i3 && (str.charAt(i2) == 'N' || str.charAt(i2) == 'n')) {
            int i14 = i2 + 1;
            if (str.charAt(i14) == 'A' || str.charAt(i14) == 'a') {
                int i15 = i2 + 2;
                if (str.charAt(i15) == 'N' || str.charAt(i15) == 'n') {
                    if (eContext != null && eContext.isSimplified() && i2 < i3) {
                        if (z3) {
                            throw new NumberFormatException("NaN not allowed");
                        }
                        return null;
                    }
                    int i16 = ((z2 ? 1 : 0) + 4) - ((z2 ? 1 : 0) & 4);
                    if (i11 == i3) {
                        return !z2 ? EDecimal.NaN : new EDecimal(FastIntegerFixed.Zero, FastIntegerFixed.Zero, (byte) i16);
                    }
                    FastInteger fastInteger = new FastInteger(0);
                    if (eContext == null || !eContext.getHasMaxPrecision()) {
                        fastIntegerFromBig2 = null;
                    } else {
                        fastIntegerFromBig2 = FastInteger.FromBig(eContext.getPrecision());
                        if (eContext.getClampNormalExponents()) {
                            fastIntegerFromBig2.Decrement();
                        }
                    }
                    int i17 = 0;
                    boolean z4 = false;
                    for (int i18 = i11; i18 < i3; i18++) {
                        if (str.charAt(i18) < '0' || str.charAt(i18) > '9') {
                            if (z3) {
                                throw new NumberFormatException();
                            }
                            return null;
                        }
                        int iCharAt = str.charAt(i18) - '0';
                        z4 = z4 || iCharAt != 0;
                        if (i17 <= MaxSafeInt) {
                            i17 = (i17 * 10) + iCharAt;
                        }
                        if (z4 && fastIntegerFromBig2 != null) {
                            fastInteger.Increment();
                            if (fastInteger.compareTo(fastIntegerFromBig2) > 0) {
                                if (z3) {
                                    throw new NumberFormatException();
                                }
                                return null;
                            }
                        }
                    }
                    eIntegerFromSubstring = i17 > MaxSafeInt ? EInteger.FromSubstring(str, i11, i3) : null;
                    if (eIntegerFromSubstring == null) {
                        eIntegerFromSubstring = EInteger.FromInt32(i17);
                    }
                    return EDecimal.CreateWithFlags(FastIntegerFixed.FromBig(eIntegerFromSubstring), FastIntegerFixed.Zero, ((z2 ? 1 : 0) + 4) - ((z2 ? 1 : 0) & 4));
                }
            }
        }
        int i19 = i2 + 4;
        if (i19 <= i3 && (str.charAt(i2) == 'S' || str.charAt(i2) == 's')) {
            int i20 = i2 + 1;
            if (str.charAt(i20) == 'N' || str.charAt(i20) == 'n') {
                int i21 = i2 + 2;
                if ((str.charAt(i21) == 'A' || str.charAt(i21) == 'a') && (str.charAt(i11) == 'N' || str.charAt(i11) == 'n')) {
                    if (eContext != null && eContext.isSimplified() && i2 < i3) {
                        if (z3) {
                            throw new NumberFormatException("NaN not allowed");
                        }
                        return null;
                    }
                    if (i19 == i3) {
                        return !z2 ? EDecimal.SignalingNaN : new EDecimal(FastIntegerFixed.Zero, FastIntegerFixed.Zero, (byte) ((-1) - (((-1) - (z2 ? 1 : 0)) & ((-1) - 8))));
                    }
                    FastInteger fastInteger2 = new FastInteger(0);
                    if (eContext == null || !eContext.getHasMaxPrecision()) {
                        fastIntegerFromBig = null;
                    } else {
                        fastIntegerFromBig = FastInteger.FromBig(eContext.getPrecision());
                        if (eContext.getClampNormalExponents()) {
                            fastIntegerFromBig.Decrement();
                        }
                    }
                    int i22 = 0;
                    boolean z5 = false;
                    for (int i23 = i19; i23 < i3; i23++) {
                        if (str.charAt(i23) < '0' || str.charAt(i23) > '9') {
                            if (z3) {
                                throw new NumberFormatException();
                            }
                            return null;
                        }
                        int iCharAt2 = str.charAt(i23) - '0';
                        z5 = z5 || iCharAt2 != 0;
                        if (i22 <= MaxSafeInt) {
                            i22 = (i22 * 10) + iCharAt2;
                        }
                        if (z5 && fastIntegerFromBig != null) {
                            fastInteger2.Increment();
                            if (fastInteger2.compareTo(fastIntegerFromBig) > 0) {
                                if (z3) {
                                    throw new NumberFormatException();
                                }
                                return null;
                            }
                        }
                    }
                    eIntegerFromSubstring = i22 > MaxSafeInt ? EInteger.FromSubstring(str, i19, i3) : null;
                    int i24 = (-1) - (((-1) - (z2 ? 1 : 0)) & ((-1) - 8));
                    if (eIntegerFromSubstring == null) {
                        eIntegerFromSubstring = EInteger.FromInt32(i22);
                    }
                    return EDecimal.CreateWithFlags(eIntegerFromSubstring, EInteger.FromInt32(0), i24);
                }
            }
        }
        return null;
    }
}
