package com.upokecenter.cbor;

/* JADX INFO: loaded from: classes5.dex */
final class CBORDataUtilitiesByteArrayString {
    private static final long DoubleNegInfinity = -4503599627370496L;
    private static final long DoublePosInfinity = 9218868437227405312L;

    private CBORDataUtilitiesByteArrayString() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0103, code lost:
    
        if (r2 != 45) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0105, code lost:
    
        r1 = r1 + 1;
        r13 = true;
        r12 = -1;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x010b, code lost:
    
        if (r22 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x010d, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0111, code lost:
    
        if (r2 == 44) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0115, code lost:
    
        if (r2 == 93) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0119, code lost:
    
        if (r2 == 125) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x011d, code lost:
    
        if (r2 == 32) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0121, code lost:
    
        if (r2 == 10) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0125, code lost:
    
        if (r2 == 13) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0129, code lost:
    
        if (r2 == 9) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x012b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x012d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x012f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0131, code lost:
    
        r0 = null;
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0133, code lost:
    
        if (r3 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0135, code lost:
    
        if (r22 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0137, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0139, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x013a, code lost:
    
        r13 = false;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x013c, code lost:
    
        if (r22 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x013e, code lost:
    
        r22[0] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0140, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0145, code lost:
    
        if (r12 < 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x014b, code lost:
    
        if ((r8 - r12) <= 20) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x014d, code lost:
    
        if (r14 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0151, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0153, code lost:
    
        if (r18 != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x015a, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(0, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0160, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0163, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0167, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x016e, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0170, code lost:
    
        if (r13 == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0174, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0178, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x017a, code lost:
    
        if (r18 != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0181, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(0, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0187, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x018a, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0190, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0193, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0197, code lost:
    
        if (r11 == com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x019b, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x019d, code lost:
    
        if (r18 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x019f, code lost:
    
        r1 = com.upokecenter.cbor.CBORDataUtilitiesByteArrayString.DoubleNegInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01a7, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r1, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01a8, code lost:
    
        r1 = com.upokecenter.cbor.CBORDataUtilitiesByteArrayString.DoublePosInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01ad, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Decimal128) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x01af, code lost:
    
        if (r18 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01b1, code lost:
    
        r0 = com.upokecenter.numbers.EDecimal.NegativeInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01b7, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01b8, code lost:
    
        r0 = com.upokecenter.numbers.EDecimal.PositiveInfinity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01bd, code lost:
    
        if (r16 != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01bf, code lost:
    
        if (r17 != 0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01c5, code lost:
    
        if ((r8 - r10) > 16) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x01c7, code lost:
    
        r12 = r10;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01c9, code lost:
    
        if (r12 >= r8) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01cb, code lost:
    
        r2 = (r2 * 10) + ((long) (r18[r12] + org.msgpack.core.MessagePack.Code.INT8));
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01d9, code lost:
    
        if (r2 != 0) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01db, code lost:
    
        if (r18 != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01e4, code lost:
    
        if (r2 >= yg.C1521gK.Yd) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01e6, code lost:
    
        if (r18 == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01e8, code lost:
    
        r2 = -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x01eb, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x01fb, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(com.upokecenter.numbers.EFloat.FromInt64(r2).ToDoubleBits(), 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01fe, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Decimal128) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0208, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(com.upokecenter.numbers.EDecimal.FromInt64(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x020d, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0210, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Full) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0212, code lost:
    
        if (r17 != 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0214, code lost:
    
        if (r16 != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0216, code lost:
    
        r1 = com.upokecenter.numbers.EInteger.FromSubstring(r18, r19, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x021a, code lost:
    
        if (r19 == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0220, code lost:
    
        if (r1.isZero() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0222, code lost:
    
        if (r18 == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x022c, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0231, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0232, code lost:
    
        if (r16 != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0234, code lost:
    
        if (r17 == 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0236, code lost:
    
        r11 = r9 + 1;
        r3 = -(r8 - r11);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x023e, code lost:
    
        if (r10 >= r9) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0240, code lost:
    
        if (r2 < 0) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0242, code lost:
    
        if (r2 < 18) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0244, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0245, code lost:
    
        if (r11 >= r8) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0247, code lost:
    
        if (r2 < 0) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0249, code lost:
    
        if (r2 < 18) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x024b, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x024c, code lost:
    
        if (r18 == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x024e, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x024f, code lost:
    
        if (r2 < 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0251, code lost:
    
        if (r18 == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0257, code lost:
    
        if (r4 == 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0259, code lost:
    
        if (r3 != 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x025f, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0260, code lost:
    
        if (r2 > 0) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0262, code lost:
    
        r1 = 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0266, code lost:
    
        if (r18[r11] == 48) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0268, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x026a, code lost:
    
        r4 = (r4 * 10) + ((long) (r18[r11] - r1));
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0273, code lost:
    
        r1 = 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0277, code lost:
    
        if (r2 > 0) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0279, code lost:
    
        r1 = 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x027d, code lost:
    
        if (r18[r10] == 48) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x027f, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0281, code lost:
    
        r4 = (r4 * 10) + ((long) (r18[r10] - r1));
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x028c, code lost:
    
        r1 = 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x02a9, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromArrayBackedObject(new com.upokecenter.cbor.CBORObject[]{com.upokecenter.cbor.CBORObject.FromObject(r3), com.upokecenter.cbor.CBORObject.FromObject(r4)}).WithTag(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x02aa, code lost:
    
        r1 = com.upokecenter.numbers.EDecimal.FromString(r18, r19, r8 - r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02b3, code lost:
    
        if (r1.isZero() == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x02b5, code lost:
    
        if (r18 == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x02bf, code lost:
    
        if (r1.getExponent().isZero() == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x02c1, code lost:
    
        if (r19 == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x02cb, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(32768, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x02d2, code lost:
    
        if (r19 != false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x02dc, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1.Negate());
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x02e1, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x02ea, code lost:
    
        if (r1.getExponent().isZero() == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x02f4, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1.getMantissa());
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x02fe, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Double) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0300, code lost:
    
        r3 = com.upokecenter.numbers.EFloat.FromString(r18, r19, r8 - r19, com.upokecenter.numbers.EContext.Binary64).ToDoubleBits();
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x030b, code lost:
    
        if (r19 != false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x030f, code lost:
    
        if (r3 == Long.MIN_VALUE) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0315, code lost:
    
        if (r3 != 0) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0317, code lost:
    
        r0 = 8;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x031f, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0320, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0325, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.Decimal128) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0327, code lost:
    
        r1 = com.upokecenter.numbers.EDecimal.FromString(r18, r19, r8 - r19, com.upokecenter.numbers.EContext.Decimal128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x032e, code lost:
    
        if (r19 != false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0334, code lost:
    
        if (r1.isNegative() == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x033a, code lost:
    
        if (r1.isZero() == false) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x033c, code lost:
    
        r1 = r1.Negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0344, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0347, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloatFromDouble) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0349, code lost:
    
        r1 = com.upokecenter.numbers.EFloat.FromString(r18, r19, r8 - r19, com.upokecenter.numbers.EContext.Binary64).ToDoubleBits();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0358, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsBeyondSafeRange(r1) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x035e, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsIntegerValue(r1) == false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0368, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(com.upokecenter.cbor.CBORUtilities.GetIntegerValue(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0372, code lost:
    
        if (r11 != com.upokecenter.cbor.JSONOptions.ConversionMode.IntOrFloat) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0374, code lost:
    
        r1 = com.upokecenter.numbers.EContext.Binary64.WithBlankFlags();
        r2 = com.upokecenter.numbers.EFloat.FromString(r18, r19, r8 - r19, r1).ToDoubleBits();
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0389, code lost:
    
        if ((r1.getFlags() & 1) == 0) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x038b, code lost:
    
        if (r19 != false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x038f, code lost:
    
        if (r2 == Long.MIN_VALUE) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0391, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0395, code lost:
    
        if (r2 != 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x039d, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromFloatingPointBits(r4, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x039e, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x03a1, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03a9, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsBeyondSafeRange(r2) != false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x03af, code lost:
    
        if (com.upokecenter.cbor.CBORUtilities.IsIntegerValue(r2) == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x03b9, code lost:
    
        return com.upokecenter.cbor.CBORObject.FromObject(com.upokecenter.cbor.CBORUtilities.GetIntegerValue(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x03c6, code lost:
    
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
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a8, code lost:
    
        if (r12 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00aa, code lost:
    
        if (r17 == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ac, code lost:
    
        if (r13 != 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ae, code lost:
    
        if (r22 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b0, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d6, code lost:
    
        if (r16 == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d8, code lost:
    
        if (r1 != r8) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00da, code lost:
    
        if (r22 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00dc, code lost:
    
        r22[0] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00de, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00df, code lost:
    
        r2 = r18[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e3, code lost:
    
        if (r2 != 43) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e5, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e7, code lost:
    
        r13 = false;
        r12 = -1;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ea, code lost:
    
        if (r1 >= r8) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ec, code lost:
    
        r2 = r18[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00f0, code lost:
    
        if (r2 < 48) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f2, code lost:
    
        if (r2 > 57) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f4, code lost:
    
        if (r12 >= 0) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f6, code lost:
    
        if (r2 == 48) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f8, code lost:
    
        r12 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f9, code lost:
    
        r1 = r1 + 1;
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.upokecenter.cbor.CBORObject ParseJSONNumber(byte[] r18, int r19, int r20, com.upokecenter.cbor.JSONOptions r21, int[] r22) {
        /*
            Method dump skipped, instruction units count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CBORDataUtilitiesByteArrayString.ParseJSONNumber(byte[], int, int, com.upokecenter.cbor.JSONOptions, int[]):com.upokecenter.cbor.CBORObject");
    }
}
