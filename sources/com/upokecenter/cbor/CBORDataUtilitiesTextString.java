package com.upokecenter.cbor;

/* JADX INFO: loaded from: classes5.dex */
final class CBORDataUtilitiesTextString {
    private static final long DoubleNegInfinity = -4503599627370496L;
    private static final long DoublePosInfinity = 9218868437227405312L;

    private CBORDataUtilitiesTextString() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x011c, code lost:
    
        if (r2 != '-') goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x011e, code lost:
    
        r1 = r1 + 1;
        r13 = true;
        r12 = -1;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0124, code lost:
    
        if (r22 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0126, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x012a, code lost:
    
        if (r2 == ',') goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x012e, code lost:
    
        if (r2 == ']') goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0132, code lost:
    
        if (r2 == '}') goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0136, code lost:
    
        if (r2 == ' ') goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x013a, code lost:
    
        if (r2 == '\n') goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x013e, code lost:
    
        if (r2 == '\r') goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0142, code lost:
    
        if (r2 == '\t') goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0144, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0146, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0148, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x014a, code lost:
    
        r0 = null;
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x014c, code lost:
    
        if (r3 != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x014e, code lost:
    
        if (r22 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0150, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0152, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0153, code lost:
    
        r13 = false;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0155, code lost:
    
        if (r22 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0157, code lost:
    
        r22[0] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0159, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x015e, code lost:
    
        if (r12 < 0) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0164, code lost:
    
        if ((r8 - r12) <= 20) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0166, code lost:
    
        if (r14 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x016a, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x016c, code lost:
    
        if (r18 != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0173, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(0, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0179, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x017c, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0180, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0187, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0189, code lost:
    
        if (r13 == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x018d, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0191, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0193, code lost:
    
        if (r18 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x019a, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(0, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01a0, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01a3, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01a9, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01ac, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x01b0, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x01b4, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01b6, code lost:
    
        if (r18 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01b8, code lost:
    
        r1 = com.upokecenter.cbor.CBORDataUtilitiesTextString.DoubleNegInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01c0, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r1, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01c1, code lost:
    
        r1 = com.upokecenter.cbor.CBORDataUtilitiesTextString.DoublePosInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01c6, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Decimal128) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01c8, code lost:
    
        if (r18 == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01ca, code lost:
    
        r0 = com.upokecenter.numbers.EDecimal.NegativeInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01d0, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01d1, code lost:
    
        r0 = com.upokecenter.numbers.EDecimal.PositiveInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01d6, code lost:
    
        if (r16 != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01d8, code lost:
    
        if (r17 != 0) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01de, code lost:
    
        if ((r8 - r10) > 16) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01e0, code lost:
    
        r12 = r10;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01e2, code lost:
    
        if (r12 >= r8) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01e4, code lost:
    
        r2 = (r2 * 10) + ((long) (r18.charAt(r12) - '0'));
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01f4, code lost:
    
        if (r2 != 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x01f6, code lost:
    
        if (r18 != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01ff, code lost:
    
        if (r2 >= yg.C1521gK.Yd) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0201, code lost:
    
        if (r18 == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0203, code lost:
    
        r2 = -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0206, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0216, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(com.upokecenter.numbers.EFloat.FromInt64(r2).ToDoubleBits(), 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0219, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Decimal128) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0223, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(com.upokecenter.numbers.EDecimal.FromInt64(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0228, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x022b, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Full) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x022d, code lost:
    
        if (r17 != 0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x022f, code lost:
    
        if (r16 != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0231, code lost:
    
        r1 = com.upokecenter.numbers.EInteger.FromSubstring(r18, r19, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0235, code lost:
    
        if (r19 == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x023b, code lost:
    
        if (r1.isZero() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x023d, code lost:
    
        if (r18 == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0247, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x024c, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x024d, code lost:
    
        if (r16 != false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x024f, code lost:
    
        if (r17 == 0) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0251, code lost:
    
        r11 = r9 + 1;
        r3 = -(r8 - r11);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0259, code lost:
    
        if (r10 >= r9) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x025b, code lost:
    
        if (r2 < 0) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x025d, code lost:
    
        if (r2 < 18) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x025f, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0260, code lost:
    
        if (r11 >= r8) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0262, code lost:
    
        if (r2 < 0) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0264, code lost:
    
        if (r2 < 18) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0266, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0267, code lost:
    
        if (r18 == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0269, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x026a, code lost:
    
        if (r2 < 0) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x026c, code lost:
    
        if (r18 == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0272, code lost:
    
        if (r4 == 0) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0274, code lost:
    
        if (r3 != 0) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x027a, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x027b, code lost:
    
        if (r2 > 0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x027d, code lost:
    
        r1 = '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0283, code lost:
    
        if (r18.charAt(r11) == '0') goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0285, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0287, code lost:
    
        r4 = (r4 * 10) + ((long) (r18.charAt(r11) - r1));
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0292, code lost:
    
        r1 = '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0296, code lost:
    
        if (r2 > 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0298, code lost:
    
        r1 = '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x029e, code lost:
    
        if (r18.charAt(r10) == '0') goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x02a0, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02a2, code lost:
    
        r4 = (r4 * 10) + ((long) (r18.charAt(r10) - r1));
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x02af, code lost:
    
        r1 = '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x02cc, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromArrayBackedObject(new com.upokecenter.cbor.CBORObject[]{com.upokecenter.cbor.CBORObject.FromObject(r3), com.upokecenter.cbor.CBORObject.FromObject(r4)}).WithTag(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02cd, code lost:
    
        r1 = com.upokecenter.numbers.EDecimal.FromString(r18, r19, r8 - r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x02d6, code lost:
    
        if (r1.isZero() == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x02d8, code lost:
    
        if (r18 == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x02e2, code lost:
    
        if (r1.getExponent().isZero() == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x02e4, code lost:
    
        if (r19 == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x02ee, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x02f5, code lost:
    
        if (r19 != false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x02ff, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1.Negate());
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0304, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x030d, code lost:
    
        if (r1.getExponent().isZero() == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0317, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1.getMantissa());
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0321, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0323, code lost:
    
        r3 = com.upokecenter.numbers.EFloat.FromString(r18, r19, r8 - r19, com.upokecenter.numbers.EContext.Binary64).ToDoubleBits();
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x032e, code lost:
    
        if (r19 != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0332, code lost:
    
        if (r3 == Long.MIN_VALUE) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0338, code lost:
    
        if (r3 != 0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x033a, code lost:
    
        r0 = 8;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0342, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0343, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0348, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Decimal128) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x034a, code lost:
    
        r1 = com.upokecenter.numbers.EDecimal.FromString(r18, r19, r8 - r19, com.upokecenter.numbers.EContext.Decimal128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0351, code lost:
    
        if (r19 != false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0357, code lost:
    
        if (r1.isNegative() == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x035d, code lost:
    
        if (r1.isZero() == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x035f, code lost:
    
        r1 = r1.Negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0367, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x036a, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x036c, code lost:
    
        r1 = com.upokecenter.numbers.EFloat.FromString(r18, r19, r8 - r19, com.upokecenter.numbers.EContext.Binary64).ToDoubleBits();
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x037b, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsBeyondSafeRange(r1) != false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0381, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsIntegerValue(r1) == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x038b, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(com.upokecenter.cbor.CBORUtilities.GetIntegerValue(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0395, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0397, code lost:
    
        r1 = com.upokecenter.numbers.EContext.Binary64.WithBlankFlags();
        r2 = com.upokecenter.numbers.EFloat.FromString(r18, r19, r8 - r19, r1).ToDoubleBits();
        r4 = r1.getFlags();
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x03af, code lost:
    
        if (((r4 + 1) - (r4 | 1)) == 0) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x03b1, code lost:
    
        if (r19 != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x03b5, code lost:
    
        if (r2 == Long.MIN_VALUE) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03b7, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03bb, code lost:
    
        if (r2 != 0) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x03c3, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r4, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x03c4, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x03c7, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x03cf, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsBeyondSafeRange(r2) != false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x03d5, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsIntegerValue(r2) == false) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x03df, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(com.upokecenter.cbor.CBORUtilities.GetIntegerValue(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x03ec, code lost:
    
        throw new java.lang.IllegalArgumentException("Unsupported conversion kind.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:?, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:?, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:?, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r1, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:?, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r2, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bd, code lost:
    
        if (r12 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bf, code lost:
    
        if (r17 == 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c1, code lost:
    
        if (r13 != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c3, code lost:
    
        if (r22 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c5, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00eb, code lost:
    
        if (r16 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ed, code lost:
    
        if (r1 != r8) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ef, code lost:
    
        if (r22 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f1, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00f4, code lost:
    
        r2 = r18.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00fa, code lost:
    
        if (r2 != '+') goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00fc, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00fe, code lost:
    
        r13 = false;
        r12 = -1;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0101, code lost:
    
        if (r1 >= r8) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0103, code lost:
    
        r2 = r18.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0109, code lost:
    
        if (r2 < '0') goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x010b, code lost:
    
        if (r2 > '9') goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x010d, code lost:
    
        if (r12 >= 0) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x010f, code lost:
    
        if (r2 == '0') goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0111, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0112, code lost:
    
        r1 = r1 + 1;
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.upokecenter.cbor.CBORObject ParseJSONNumber(java.lang.String r18, int r19, int r20, com.upokecenter.cbor.JSONOptions r21, int[] r22) {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORDataUtilitiesTextString.ParseJSONNumber(java.lang.String, int, int, com.upokecenter.cbor.JSONOptions, int[]):com.upokecenter.cbor.CBORObject");
    }
}
