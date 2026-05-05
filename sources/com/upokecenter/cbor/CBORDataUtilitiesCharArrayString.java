package com.upokecenter.cbor;

/* JADX INFO: loaded from: classes5.dex */
final class CBORDataUtilitiesCharArrayString {
    private static final long DoubleNegInfinity = -4503599627370496L;
    private static final long DoublePosInfinity = 9218868437227405312L;

    private CBORDataUtilitiesCharArrayString() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00ff, code lost:
    
        if (r2 != '-') goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0101, code lost:
    
        r1 = r1 + 1;
        r13 = true;
        r12 = -1;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0107, code lost:
    
        if (r22 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0109, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x010d, code lost:
    
        if (r2 == ',') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0111, code lost:
    
        if (r2 == ']') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0115, code lost:
    
        if (r2 == '}') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0119, code lost:
    
        if (r2 == ' ') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x011d, code lost:
    
        if (r2 == '\n') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0121, code lost:
    
        if (r2 == '\r') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0125, code lost:
    
        if (r2 == '\t') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0127, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0129, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x012b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x012d, code lost:
    
        r0 = null;
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x012f, code lost:
    
        if (r3 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0131, code lost:
    
        if (r22 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0133, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0135, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0136, code lost:
    
        r13 = false;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0138, code lost:
    
        if (r22 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x013a, code lost:
    
        r22[0] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x013c, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0141, code lost:
    
        if (r12 < 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0147, code lost:
    
        if ((r8 - r12) <= 20) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0149, code lost:
    
        if (r14 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x014d, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x014f, code lost:
    
        if (r18 != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0156, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(0, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x015c, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x015f, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0163, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x016a, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x016c, code lost:
    
        if (r13 == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0170, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0174, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0176, code lost:
    
        if (r18 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x017d, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(0, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0183, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0186, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x018c, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x018f, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0193, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0197, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0199, code lost:
    
        if (r18 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x019b, code lost:
    
        r1 = com.upokecenter.cbor.CBORDataUtilitiesCharArrayString.DoubleNegInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01a3, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r1, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01a4, code lost:
    
        r1 = com.upokecenter.cbor.CBORDataUtilitiesCharArrayString.DoublePosInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01a9, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Decimal128) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01ab, code lost:
    
        if (r18 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01ad, code lost:
    
        r0 = com.upokecenter.numbers.EDecimal.NegativeInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01b3, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01b4, code lost:
    
        r0 = com.upokecenter.numbers.EDecimal.PositiveInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01b9, code lost:
    
        if (r16 != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01bb, code lost:
    
        if (r17 != 0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01c1, code lost:
    
        if ((r8 - r10) > 16) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01c3, code lost:
    
        r12 = r10;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01c5, code lost:
    
        if (r12 >= r8) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01c7, code lost:
    
        r2 = (r2 * 10) + ((long) (r18[r12] - '0'));
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01d5, code lost:
    
        if (r2 != 0) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01d7, code lost:
    
        if (r18 != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01e0, code lost:
    
        if (r2 >= yg.C1521gK.Yd) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01e2, code lost:
    
        if (r18 == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01e4, code lost:
    
        r2 = -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x01e7, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01f7, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(com.upokecenter.numbers.EFloat.FromInt64(r2).ToDoubleBits(), 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01fa, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Decimal128) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0204, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(com.upokecenter.numbers.EDecimal.FromInt64(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0209, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x020c, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Full) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x020e, code lost:
    
        if (r17 != 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0210, code lost:
    
        if (r16 != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0212, code lost:
    
        r1 = com.upokecenter.numbers.EInteger.FromSubstring(r18, r19, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0216, code lost:
    
        if (r19 == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x021c, code lost:
    
        if (r1.isZero() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x021e, code lost:
    
        if (r18 == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0228, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x022d, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x022e, code lost:
    
        if (r16 != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0230, code lost:
    
        if (r17 == 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0232, code lost:
    
        r11 = r9 + 1;
        r3 = -(r8 - r11);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x023a, code lost:
    
        if (r10 >= r9) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x023c, code lost:
    
        if (r2 < 0) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x023e, code lost:
    
        if (r2 < 18) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0240, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0241, code lost:
    
        if (r11 >= r8) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0243, code lost:
    
        if (r2 < 0) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0245, code lost:
    
        if (r2 < 18) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0247, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0248, code lost:
    
        if (r18 == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x024a, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x024b, code lost:
    
        if (r2 < 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x024d, code lost:
    
        if (r18 == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0253, code lost:
    
        if (r4 == 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0255, code lost:
    
        if (r3 != 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x025b, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x025c, code lost:
    
        if (r2 > 0) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x025e, code lost:
    
        r1 = '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0262, code lost:
    
        if (r18[r11] == '0') goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0264, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0266, code lost:
    
        r4 = (r4 * 10) + ((long) (r18[r11] - r1));
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x026f, code lost:
    
        r1 = '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0273, code lost:
    
        if (r2 > 0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0275, code lost:
    
        r1 = '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0279, code lost:
    
        if (r18[r10] == '0') goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x027b, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x027d, code lost:
    
        r4 = (r4 * 10) + ((long) (r18[r10] - r1));
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0288, code lost:
    
        r1 = '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02a5, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromArrayBackedObject(new com.upokecenter.cbor.CBORObject[]{com.upokecenter.cbor.CBORObject.FromObject(r3), com.upokecenter.cbor.CBORObject.FromObject(r4)}).WithTag(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x02a6, code lost:
    
        r1 = com.upokecenter.numbers.EDecimal.FromString(r18, r19, r8 - r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02af, code lost:
    
        if (r1.isZero() == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x02b1, code lost:
    
        if (r18 == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x02bb, code lost:
    
        if (r1.getExponent().isZero() == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x02bd, code lost:
    
        if (r19 == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x02c7, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x02ce, code lost:
    
        if (r19 != false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x02d8, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1.Negate());
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x02dd, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x02e6, code lost:
    
        if (r1.getExponent().isZero() == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x02f0, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1.getMantissa());
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x02fa, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x02fc, code lost:
    
        r3 = com.upokecenter.numbers.EFloat.FromString(r18, r19, r8 - r19, com.upokecenter.numbers.EContext.Binary64).ToDoubleBits();
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0307, code lost:
    
        if (r19 != false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x030b, code lost:
    
        if (r3 == Long.MIN_VALUE) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0311, code lost:
    
        if (r3 != 0) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0313, code lost:
    
        r0 = 8;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x031b, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x031c, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0321, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Decimal128) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0323, code lost:
    
        r1 = com.upokecenter.numbers.EDecimal.FromString(r18, r19, r8 - r19, com.upokecenter.numbers.EContext.Decimal128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x032a, code lost:
    
        if (r19 != false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0330, code lost:
    
        if (r1.isNegative() == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0336, code lost:
    
        if (r1.isZero() == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0338, code lost:
    
        r1 = r1.Negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0340, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0343, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0345, code lost:
    
        r1 = com.upokecenter.numbers.EFloat.FromString(r18, r19, r8 - r19, com.upokecenter.numbers.EContext.Binary64).ToDoubleBits();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0354, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsBeyondSafeRange(r1) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x035a, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsIntegerValue(r1) == false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0364, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(com.upokecenter.cbor.CBORUtilities.GetIntegerValue(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x036e, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0370, code lost:
    
        r1 = com.upokecenter.numbers.EContext.Binary64.WithBlankFlags();
        r2 = com.upokecenter.numbers.EFloat.FromString(r18, r19, r8 - r19, r1).ToDoubleBits();
        r4 = r1.getFlags();
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0388, code lost:
    
        if (((r4 + 1) - (r4 | 1)) == 0) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x038a, code lost:
    
        if (r19 != false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x038e, code lost:
    
        if (r2 == Long.MIN_VALUE) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0390, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0394, code lost:
    
        if (r2 != 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x039c, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r4, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x039d, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x03a0, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03a8, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsBeyondSafeRange(r2) != false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x03ae, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsIntegerValue(r2) == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x03b8, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(com.upokecenter.cbor.CBORUtilities.GetIntegerValue(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x03c5, code lost:
    
        throw new java.lang.IllegalArgumentException("Unsupported conversion kind.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:?, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:?, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:?, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r1, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:?, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r2, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a4, code lost:
    
        if (r12 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        if (r17 == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a8, code lost:
    
        if (r13 != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00aa, code lost:
    
        if (r22 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ac, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00af, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d2, code lost:
    
        if (r16 == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d4, code lost:
    
        if (r1 != r8) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d6, code lost:
    
        if (r22 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d8, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00da, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00db, code lost:
    
        r2 = r18[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00df, code lost:
    
        if (r2 != '+') goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e1, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e3, code lost:
    
        r13 = false;
        r12 = -1;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e6, code lost:
    
        if (r1 >= r8) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e8, code lost:
    
        r2 = r18[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00ec, code lost:
    
        if (r2 < '0') goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ee, code lost:
    
        if (r2 > '9') goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f0, code lost:
    
        if (r12 >= 0) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f2, code lost:
    
        if (r2 == '0') goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f4, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f5, code lost:
    
        r1 = r1 + 1;
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.upokecenter.cbor.CBORObject ParseJSONNumber(char[] r18, int r19, int r20, com.upokecenter.cbor.JSONOptions r21, int[] r22) {
        /*
            Method dump skipped, instruction units count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORDataUtilitiesCharArrayString.ParseJSONNumber(char[], int, int, com.upokecenter.cbor.JSONOptions, int[]):com.upokecenter.cbor.CBORObject");
    }
}
