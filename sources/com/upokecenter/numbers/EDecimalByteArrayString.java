package com.upokecenter.numbers;

import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
final class EDecimalByteArrayString {
    private static final int MaxSafeInt = 214748363;

    private EDecimalByteArrayString() {
    }

    static EDecimal FromString(byte[] bArr, int i2, int i3, EContext eContext, boolean z2) {
        boolean z3;
        EDecimal eDecimalParseSpecialValue;
        int i4 = i2;
        if (bArr == null) {
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
        if (i4 > bArr.length) {
            if (z2) {
                throw new NumberFormatException("offset(" + i4 + ") is more than " + bArr.length);
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
        if (i3 > bArr.length) {
            if (z2) {
                throw new NumberFormatException("length(" + i3 + ") is more than " + bArr.length);
            }
            return null;
        }
        if (bArr.length - i4 < i3) {
            if (z2) {
                throw new NumberFormatException("chars's length minus " + i4 + "(" + (bArr.length - i4) + ") is less than " + i3);
            }
            return null;
        }
        int i5 = i3 + i4;
        byte b2 = bArr[i4];
        if (b2 == 45) {
            i4++;
            if (i4 >= i5) {
                if (z2) {
                    throw new NumberFormatException();
                }
                return null;
            }
            b2 = bArr[i4];
            z3 = true;
        } else {
            z3 = false;
            if (b2 == 43) {
                i4++;
                if (i4 >= i5) {
                    if (z2) {
                        throw new NumberFormatException();
                    }
                    return null;
                }
                b2 = bArr[i4];
            }
        }
        return ((b2 < 48 || b2 > 57) && (eDecimalParseSpecialValue = ParseSpecialValue(bArr, i4, i5, z3, eContext, z2)) != null) ? eDecimalParseSpecialValue : (eContext == null || !eContext.getHasMaxPrecision() || !eContext.getHasExponentRange() || eContext.isSimplified()) ? ParseOrdinaryNumber(bArr, i4, i5, z3, eContext, z2) : ParseOrdinaryNumberLimitedPrecision(bArr, i4, i5, z3, eContext, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197 A[PHI: r4 r24
  0x0197: PHI (r4v16 boolean) = (r4v15 boolean), (r4v3 boolean), (r4v3 boolean) binds: [B:147:0x01b9, B:139:0x01a6, B:131:0x0195] A[DONT_GENERATE, DONT_INLINE]
  0x0197: PHI (r24v8 boolean) = (r24v6 boolean), (r24v3 boolean), (r24v3 boolean) binds: [B:147:0x01b9, B:139:0x01a6, B:131:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.upokecenter.numbers.EDecimal ParseOrdinaryNumber(byte[] r23, int r24, int r25, boolean r26, com.upokecenter.numbers.EContext r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EDecimalByteArrayString.ParseOrdinaryNumber(byte[], int, int, boolean, com.upokecenter.numbers.EContext, boolean):com.upokecenter.numbers.EDecimal");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0119, code lost:
    
        if (r0 < 214748364) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x011b, code lost:
    
        if (r0 != 214748364) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x011e, code lost:
    
        if (r1 >= 7) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0120, code lost:
    
        r0 = (r0 * 10) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0123, code lost:
    
        r10 = r10 + 1;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0128, code lost:
    
        r0 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x012e, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0130, code lost:
    
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0133, code lost:
    
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0136, code lost:
    
        if (r29 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0138, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x013f, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0141, code lost:
    
        if (r15 != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0143, code lost:
    
        if (r29 != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0145, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x014b, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x014c, code lost:
    
        r0 = r0 * r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0150, code lost:
    
        if (r2 <= 12) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0152, code lost:
    
        if (r18 >= 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0158, code lost:
    
        return com.upokecenter.numbers.EDecimal.SignalUnderflow(r28, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x015d, code lost:
    
        return com.upokecenter.numbers.EDecimal.SignalOverflow(r28, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x015e, code lost:
    
        r17 = -1;
        r0 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0163, code lost:
    
        if (r10 == r26) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0165, code lost:
    
        if (r29 != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0167, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x016e, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0172, code lost:
    
        if (r0 == Integer.MAX_VALUE) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0177, code lost:
    
        if (r0 <= (-2147483647)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x017b, code lost:
    
        if (r3 == Long.MAX_VALUE) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x017d, code lost:
    
        r0 = ((long) r0) + ((long) r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0180, code lost:
    
        if (r27 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0182, code lost:
    
        r3 = -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0183, code lost:
    
        r0 = com.upokecenter.numbers.EDecimal.Create(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0187, code lost:
    
        if (r27 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0189, code lost:
    
        if (r24 != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x018b, code lost:
    
        r0 = r0.Negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0193, code lost:
    
        return r0.RoundToPrecision(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0194, code lost:
    
        if (r19 != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0196, code lost:
    
        r0 = com.upokecenter.numbers.EInteger.FromInt32(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x019b, code lost:
    
        if (r18 >= 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x019d, code lost:
    
        r0 = r0.Negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01a1, code lost:
    
        r2 = r0.Add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01a6, code lost:
    
        if (r23 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01a8, code lost:
    
        r2 = r2.Subtract(1);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01b2, code lost:
    
        if (r28.getHasExponentRange() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01d4, code lost:
    
        if (r2.Add(r7).Subtract(1).compareTo(r28.getEMin().Subtract(r28.getPrecision().Subtract(1)).Subtract(1)) >= 0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01da, code lost:
    
        return com.upokecenter.numbers.EDecimal.SignalUnderflow(r28, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01dc, code lost:
    
        r0 = com.upokecenter.numbers.EInteger.FromSubstring(r24, r17, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01eb, code lost:
    
        if (r2.compareTo(r28.getEMax()) <= 0) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01f1, code lost:
    
        return com.upokecenter.numbers.EDecimal.SignalOverflow(r28, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01f2, code lost:
    
        if (r24 != 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01f4, code lost:
    
        r0 = com.upokecenter.numbers.EDecimal.Create(com.upokecenter.numbers.EInteger.FromInt32(0), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01fd, code lost:
    
        if (r27 == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01ff, code lost:
    
        r0 = r0.Negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0207, code lost:
    
        return r0.RoundToPrecision(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x020a, code lost:
    
        if (r22 == r6) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x020c, code lost:
    
        r1 = com.upokecenter.numbers.EInteger.FromString(com.upokecenter.numbers.Extras.CharsConcat(r24, r25, r9 - r25, r24, r22, r6 - r22));
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0223, code lost:
    
        if (r23 == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0225, code lost:
    
        r1 = r1.Multiply(10).Add(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x022f, code lost:
    
        if (r27 == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0231, code lost:
    
        r1 = r1.Negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x023d, code lost:
    
        return com.upokecenter.numbers.EDecimal.Create(r1, r2).RoundToPrecision(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x023e, code lost:
    
        r1 = com.upokecenter.numbers.EInteger.FromSubstring(r24, r25, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cc, code lost:
    
        if (r5 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ce, code lost:
    
        if (r29 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d6, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d7, code lost:
    
        r5 = r24 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00db, code lost:
    
        if (r19 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00dd, code lost:
    
        if (r10 != r26) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00df, code lost:
    
        if (r29 != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e7, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e8, code lost:
    
        r2 = r24[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ee, code lost:
    
        if (r2 == 43) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f0, code lost:
    
        if (r2 != 45) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f2, code lost:
    
        if (r2 != 45) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f4, code lost:
    
        r18 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f6, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f8, code lost:
    
        r17 = r10;
        r2 = 0;
        r0 = 0;
        r15 = false;
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ff, code lost:
    
        if (r10 >= r26) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0101, code lost:
    
        r1 = r24[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0105, code lost:
    
        if (r1 < 48) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0109, code lost:
    
        if (r1 > 57) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x010b, code lost:
    
        r1 = r1 + org.msgpack.core.MessagePack.Code.INT8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x010d, code lost:
    
        if (r1 == 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x010f, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0110, code lost:
    
        r16 = r16 | r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0112, code lost:
    
        if (r16 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0114, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.upokecenter.numbers.EDecimal ParseOrdinaryNumberLimitedPrecision(byte[] r24, int r25, int r26, boolean r27, com.upokecenter.numbers.EContext r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EDecimalByteArrayString.ParseOrdinaryNumberLimitedPrecision(byte[], int, int, boolean, com.upokecenter.numbers.EContext, boolean):com.upokecenter.numbers.EDecimal");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x010b, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x010c, code lost:
    
        if (r20 == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0111, code lost:
    
        if (r3 > com.upokecenter.numbers.EDecimalByteArrayString.MaxSafeInt) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0113, code lost:
    
        if (r19 < 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0115, code lost:
    
        if (r2 != 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0117, code lost:
    
        if (r6 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0119, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x011a, code lost:
    
        if (r20 != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x011c, code lost:
    
        if (r22 == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x011e, code lost:
    
        r0 = -(r7 - r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0126, code lost:
    
        if (r4 > com.upokecenter.numbers.EDecimalByteArrayString.MaxSafeInt) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0128, code lost:
    
        r0 = r4;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x012a, code lost:
    
        if (r24 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x012c, code lost:
    
        r0 = -r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x012d, code lost:
    
        if (r14 < 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x012f, code lost:
    
        if (r24 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0135, code lost:
    
        if (r0 == 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x013e, code lost:
    
        return com.upokecenter.numbers.EDecimal.Create(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x013f, code lost:
    
        r15 = r22;
        r14 = 0;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0146, code lost:
    
        if (r15 >= r5) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0148, code lost:
    
        r13 = r11[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x014a, code lost:
    
        if (r14 < 0) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x014e, code lost:
    
        if (r14 < 18) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0150, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0151, code lost:
    
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0152, code lost:
    
        if (r15 >= r7) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0154, code lost:
    
        r13 = r11[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0156, code lost:
    
        if (r14 < 0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x015a, code lost:
    
        if (r14 < 18) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x015c, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0160, code lost:
    
        if (r14 > 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0162, code lost:
    
        if (r13 == 48) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0164, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0166, code lost:
    
        r0 = (r0 * 10) + ((long) (r13 + org.msgpack.core.MessagePack.Code.INT8));
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x016f, code lost:
    
        if (r14 > 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0173, code lost:
    
        if (r13 == 48) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0175, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0177, code lost:
    
        r0 = (r0 * 10) + ((long) (r13 + org.msgpack.core.MessagePack.Code.INT8));
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0182, code lost:
    
        if (r6 != null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0184, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0185, code lost:
    
        if (r19 >= 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0187, code lost:
    
        r0 = r0 - ((long) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x018e, code lost:
    
        if (r0 < 2147483647L) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0195, code lost:
    
        if (r0 > (-2147483648L)) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0197, code lost:
    
        r2 = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0199, code lost:
    
        r6 = com.upokecenter.numbers.EInteger.FromInt64(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x019e, code lost:
    
        if (r3 == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01a0, code lost:
    
        r0 = r0 + ((long) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a3, code lost:
    
        if (r19 >= 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01a5, code lost:
    
        r6 = r6.Subtract(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01aa, code lost:
    
        if (r3 == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01ac, code lost:
    
        r6 = r6.Add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01b6, code lost:
    
        if (r4 <= com.upokecenter.numbers.EDecimalByteArrayString.MaxSafeInt) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01b8, code lost:
    
        if (r22 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01ba, code lost:
    
        r5 = r5 - r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01bd, code lost:
    
        if (r5 != 1) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01bf, code lost:
    
        if (r21 != 0) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01c1, code lost:
    
        r1 = com.upokecenter.numbers.EInteger.FromSubstring(r11, r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01c5, code lost:
    
        if (r20 == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01ca, code lost:
    
        if (r3 <= com.upokecenter.numbers.EDecimalByteArrayString.MaxSafeInt) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01cc, code lost:
    
        r0 = com.upokecenter.numbers.EInteger.FromSubstring(r11, r18, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01d2, code lost:
    
        if (r6 != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01d4, code lost:
    
        r6 = com.upokecenter.numbers.EInteger.FromInt32(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01d8, code lost:
    
        if (r19 >= 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01da, code lost:
    
        r6 = r6.Subtract(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01de, code lost:
    
        if (r6 != null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01e0, code lost:
    
        r3 = com.upokecenter.numbers.FastIntegerFixed.FromInt32(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01e4, code lost:
    
        if (r1 != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01e6, code lost:
    
        r2 = com.upokecenter.numbers.FastIntegerFixed.FromInt32(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01f0, code lost:
    
        return new com.upokecenter.numbers.EDecimal(r2, r3, r24 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01f5, code lost:
    
        if (r1.CanFitInInt32() == false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01f7, code lost:
    
        r2 = com.upokecenter.numbers.FastIntegerFixed.FromInt32(r1.ToInt32Checked());
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0200, code lost:
    
        r2 = com.upokecenter.numbers.FastIntegerFixed.FromBig(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0205, code lost:
    
        r3 = com.upokecenter.numbers.FastIntegerFixed.FromBig(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x020a, code lost:
    
        r6 = r6.Add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0211, code lost:
    
        r11 = r11;
        r1 = com.upokecenter.numbers.EInteger.FromString(com.upokecenter.numbers.Extras.CharsConcat(r11, r22, r5, r11, r8, r7 - r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0223, code lost:
    
        r1 = com.upokecenter.numbers.EInteger.FromSubstring(r11, r22, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x022a, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
    
        if (r15 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0096, code lost:
    
        if (r25 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0098, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
    
        if (r20 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
    
        if (r12 != r23) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        if (r25 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ac, code lost:
    
        r13 = r11[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b2, code lost:
    
        if (r13 == 43) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b4, code lost:
    
        if (r13 != 45) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        if (r13 != 45) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b8, code lost:
    
        r19 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ba, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bc, code lost:
    
        r1 = r12;
        r13 = false;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bf, code lost:
    
        if (r1 >= r23) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        r13 = r11[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c3, code lost:
    
        if (r13 < r0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c7, code lost:
    
        if (r13 > 57) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c9, code lost:
    
        r13 = r13 + org.msgpack.core.MessagePack.Code.INT8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ce, code lost:
    
        if (r3 > com.upokecenter.numbers.EDecimalByteArrayString.MaxSafeInt) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d0, code lost:
    
        r13 = r13 + (r3 * 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d3, code lost:
    
        r1 = r1 + 1;
        r0 = 48;
        r3 = r13;
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00da, code lost:
    
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00dc, code lost:
    
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00df, code lost:
    
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e2, code lost:
    
        if (r25 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00eb, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ec, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ed, code lost:
    
        if (r13 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ef, code lost:
    
        if (r25 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00f1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f7, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f8, code lost:
    
        r3 = 0;
        r18 = -1;
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00fe, code lost:
    
        r18 = r12;
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0101, code lost:
    
        if (r12 == r23) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0103, code lost:
    
        if (r25 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0105, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.upokecenter.numbers.EDecimal ParseOrdinaryNumberNoContext(byte[] r21, int r22, int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.numbers.EDecimalByteArrayString.ParseOrdinaryNumberNoContext(byte[], int, int, boolean, boolean):com.upokecenter.numbers.EDecimal");
    }

    private static EDecimal ParseSpecialValue(byte[] bArr, int i2, int i3, boolean z2, EContext eContext, boolean z3) {
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        FastInteger fastIntegerFromBig;
        EInteger eIntegerFromSubstring;
        byte b6;
        byte b7;
        byte b8;
        FastInteger fastIntegerFromBig2;
        byte b9;
        byte b10;
        byte b11;
        byte b12;
        byte b13;
        byte b14;
        byte b15;
        byte b16;
        byte b17;
        byte b18;
        byte b19;
        if (i2 + 8 == i3 && (((b12 = bArr[i2]) == 73 || b12 == 105) && (((b13 = bArr[i2 + 1]) == 78 || b13 == 110) && (((b14 = bArr[i2 + 2]) == 70 || b14 == 102) && (((b15 = bArr[i2 + 3]) == 73 || b15 == 105) && (((b16 = bArr[i2 + 4]) == 78 || b16 == 110) && (((b17 = bArr[i2 + 5]) == 73 || b17 == 105) && (((b18 = bArr[i2 + 6]) == 84 || b18 == 116) && ((b19 = bArr[i2 + 7]) == 89 || b19 == 121))))))))) {
            if (eContext == null || !eContext.isSimplified() || i2 >= i3) {
                return z2 ? EDecimal.NegativeInfinity : EDecimal.PositiveInfinity;
            }
            if (z3) {
                throw new NumberFormatException("Infinity not allowed");
            }
            return null;
        }
        int i4 = i2 + 3;
        if (i4 == i3 && (((b9 = bArr[i2]) == 73 || b9 == 105) && (((b10 = bArr[i2 + 1]) == 78 || b10 == 110) && ((b11 = bArr[i2 + 2]) == 70 || b11 == 102)))) {
            if (eContext == null || !eContext.isSimplified() || i2 >= i3) {
                return z2 ? EDecimal.NegativeInfinity : EDecimal.PositiveInfinity;
            }
            if (z3) {
                throw new NumberFormatException("Infinity not allowed");
            }
            return null;
        }
        if (i4 <= i3 && (((b6 = bArr[i2]) == 78 || b6 == 110) && (((b7 = bArr[i2 + 1]) == 65 || b7 == 97) && ((b8 = bArr[i2 + 2]) == 78 || b8 == 110)))) {
            if (eContext != null && eContext.isSimplified() && i2 < i3) {
                if (z3) {
                    throw new NumberFormatException("NaN not allowed");
                }
                return null;
            }
            int i5 = 4 | (z2 ? 1 : 0);
            if (i4 == i3) {
                return !z2 ? EDecimal.NaN : new EDecimal(FastIntegerFixed.Zero, FastIntegerFixed.Zero, (byte) i5);
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
            int i6 = 0;
            boolean z4 = false;
            for (int i7 = i4; i7 < i3; i7++) {
                byte b20 = bArr[i7];
                if (b20 < 48 || b20 > 57) {
                    if (z3) {
                        throw new NumberFormatException();
                    }
                    return null;
                }
                int i8 = b20 + MessagePack.Code.INT8;
                z4 = z4 || i8 != 0;
                if (i6 <= MaxSafeInt) {
                    i6 = (i6 * 10) + i8;
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
            eIntegerFromSubstring = i6 > MaxSafeInt ? EInteger.FromSubstring(bArr, i4, i3) : null;
            if (eIntegerFromSubstring == null) {
                eIntegerFromSubstring = EInteger.FromInt32(i6);
            }
            return EDecimal.CreateWithFlags(FastIntegerFixed.FromBig(eIntegerFromSubstring), FastIntegerFixed.Zero, ((z2 ? 1 : 0) + 4) - ((z2 ? 1 : 0) & 4));
        }
        int i9 = i2 + 4;
        if (i9 > i3 || !(((b2 = bArr[i2]) == 83 || b2 == 115) && (((b3 = bArr[i2 + 1]) == 78 || b3 == 110) && (((b4 = bArr[i2 + 2]) == 65 || b4 == 97) && ((b5 = bArr[i4]) == 78 || b5 == 110))))) {
            return null;
        }
        if (eContext != null && eContext.isSimplified() && i2 < i3) {
            if (z3) {
                throw new NumberFormatException("NaN not allowed");
            }
            return null;
        }
        if (i9 == i3) {
            return !z2 ? EDecimal.SignalingNaN : new EDecimal(FastIntegerFixed.Zero, FastIntegerFixed.Zero, (byte) (8 | (z2 ? 1 : 0)));
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
        int i10 = 0;
        boolean z5 = false;
        for (int i11 = i9; i11 < i3; i11++) {
            byte b21 = bArr[i11];
            if (b21 < 48 || b21 > 57) {
                if (z3) {
                    throw new NumberFormatException();
                }
                return null;
            }
            int i12 = b21 + MessagePack.Code.INT8;
            z5 = z5 || i12 != 0;
            if (i10 <= MaxSafeInt) {
                i10 = (i10 * 10) + i12;
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
        eIntegerFromSubstring = i10 > MaxSafeInt ? EInteger.FromSubstring(bArr, i9, i3) : null;
        int i13 = (z2 ? 1 : 0) | 8;
        if (eIntegerFromSubstring == null) {
            eIntegerFromSubstring = EInteger.FromInt32(i10);
        }
        return EDecimal.CreateWithFlags(eIntegerFromSubstring, EInteger.FromInt32(0), i13);
    }
}
