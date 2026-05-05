package org.springframework.util;

import com.dynatrace.android.agent.Global;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NumberUtils {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Number> T convertNumberToTargetClass(Number number, Class<T> cls) throws IllegalArgumentException {
        Assert.notNull(number, "Number must not be null");
        Assert.notNull(cls, "Target class must not be null");
        if (cls.isInstance(number)) {
            return number;
        }
        if (cls.equals(Byte.class)) {
            long jLongValue = number.longValue();
            if (jLongValue < -128 || jLongValue > 127) {
                raiseOverflowException(number, cls);
            }
            return new Byte(number.byteValue());
        }
        if (cls.equals(Short.class)) {
            long jLongValue2 = number.longValue();
            if (jLongValue2 < -32768 || jLongValue2 > 32767) {
                raiseOverflowException(number, cls);
            }
            return new Short(number.shortValue());
        }
        if (cls.equals(Integer.class)) {
            long jLongValue3 = number.longValue();
            if (jLongValue3 < -2147483648L || jLongValue3 > 2147483647L) {
                raiseOverflowException(number, cls);
            }
            return new Integer(number.intValue());
        }
        if (cls.equals(Long.class)) {
            return new Long(number.longValue());
        }
        if (cls.equals(BigInteger.class)) {
            return number instanceof BigDecimal ? ((BigDecimal) number).toBigInteger() : BigInteger.valueOf(number.longValue());
        }
        if (cls.equals(Float.class)) {
            return new Float(number.floatValue());
        }
        if (cls.equals(Double.class)) {
            return new Double(number.doubleValue());
        }
        if (cls.equals(BigDecimal.class)) {
            return new BigDecimal(number.toString());
        }
        throw new IllegalArgumentException("Could not convert number [" + number + "] of type [" + number.getClass().getName() + "] to unknown target class [" + cls.getName() + "]");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.math.BigInteger decodeBigInteger(java.lang.String r4) {
        /*
            java.lang.String r0 = "-"
            boolean r3 = r4.startsWith(r0)
            java.lang.String r0 = "0x"
            boolean r0 = r4.startsWith(r0, r3)
            r2 = 16
            if (r0 != 0) goto L18
            java.lang.String r0 = "0X"
            boolean r0 = r4.startsWith(r0, r3)
            if (r0 == 0) goto L2a
        L18:
            int r0 = r3 + 2
        L1a:
            java.math.BigInteger r1 = new java.math.BigInteger
            java.lang.String r0 = r4.substring(r0)
            r1.<init>(r0, r2)
            if (r3 == 0) goto L29
            java.math.BigInteger r1 = r1.negate()
        L29:
            return r1
        L2a:
            java.lang.String r0 = "#"
            boolean r0 = r4.startsWith(r0, r3)
            if (r0 == 0) goto L35
            int r0 = r3 + 1
            goto L1a
        L35:
            java.lang.String r0 = "0"
            boolean r0 = r4.startsWith(r0, r3)
            if (r0 == 0) goto L48
            int r1 = r4.length()
            int r0 = r3 + 1
            if (r1 <= r0) goto L48
            r2 = 8
            goto L1a
        L48:
            r2 = 10
            r0 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.springframework.util.NumberUtils.decodeBigInteger(java.lang.String):java.math.BigInteger");
    }

    private static boolean isHexNumber(String str) {
        boolean zStartsWith = str.startsWith(Global.HYPHEN);
        return str.startsWith("0x", zStartsWith ? 1 : 0) || str.startsWith("0X", zStartsWith ? 1 : 0) || str.startsWith("#", zStartsWith ? 1 : 0);
    }

    public static <T extends Number> T parseNumber(String str, Class<T> cls) {
        Assert.notNull(str, "Text must not be null");
        Assert.notNull(cls, "Target class must not be null");
        String strTrimAllWhitespace = StringUtils.trimAllWhitespace(str);
        if (cls.equals(Byte.class)) {
            return isHexNumber(strTrimAllWhitespace) ? Byte.decode(strTrimAllWhitespace) : Byte.valueOf(strTrimAllWhitespace);
        }
        if (cls.equals(Short.class)) {
            return isHexNumber(strTrimAllWhitespace) ? Short.decode(strTrimAllWhitespace) : Short.valueOf(strTrimAllWhitespace);
        }
        if (cls.equals(Integer.class)) {
            return isHexNumber(strTrimAllWhitespace) ? Integer.decode(strTrimAllWhitespace) : Integer.valueOf(strTrimAllWhitespace);
        }
        if (cls.equals(Long.class)) {
            return isHexNumber(strTrimAllWhitespace) ? Long.decode(strTrimAllWhitespace) : Long.valueOf(strTrimAllWhitespace);
        }
        if (cls.equals(BigInteger.class)) {
            return isHexNumber(strTrimAllWhitespace) ? decodeBigInteger(strTrimAllWhitespace) : new BigInteger(strTrimAllWhitespace);
        }
        if (cls.equals(Float.class)) {
            return Float.valueOf(strTrimAllWhitespace);
        }
        if (cls.equals(Double.class)) {
            return Double.valueOf(strTrimAllWhitespace);
        }
        if (cls.equals(BigDecimal.class) || cls.equals(Number.class)) {
            return new BigDecimal(strTrimAllWhitespace);
        }
        throw new IllegalArgumentException("Cannot convert String [" + str + "] to target class [" + cls.getName() + "]");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends java.lang.Number> T parseNumber(java.lang.String r7, java.lang.Class<T> r8, java.text.NumberFormat r9) {
        /*
            java.lang.String r6 = "Could not parse number: "
            if (r9 == 0) goto L5c
            java.lang.String r0 = "Text must not be null"
            org.springframework.util.Assert.notNull(r7, r0)
            java.lang.String r0 = "Target class must not be null"
            org.springframework.util.Assert.notNull(r8, r0)
            boolean r0 = r9 instanceof java.text.DecimalFormat
            r5 = 0
            if (r0 == 0) goto L29
            r4 = r9
            java.text.DecimalFormat r4 = (java.text.DecimalFormat) r4
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L2a
            boolean r0 = r4.isParseBigDecimal()
            if (r0 != 0) goto L2a
            r3 = 1
            r4.setParseBigDecimal(r3)
            goto L2b
        L29:
            r4 = 0
        L2a:
            r3 = r5
        L2b:
            java.lang.String r0 = org.springframework.util.StringUtils.trimAllWhitespace(r7)     // Catch: java.text.ParseException -> L3d java.lang.Throwable -> L55
            java.lang.Number r0 = r9.parse(r0)     // Catch: java.text.ParseException -> L3d java.lang.Throwable -> L55
            java.lang.Number r0 = convertNumberToTargetClass(r0, r8)     // Catch: java.text.ParseException -> L3d java.lang.Throwable -> L55
            if (r3 == 0) goto L3c
            r4.setParseBigDecimal(r5)
        L3c:
            return r0
        L3d:
            r0 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L55
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L55
            throw r2     // Catch: java.lang.Throwable -> L55
        L55:
            r0 = move-exception
            if (r3 == 0) goto L5b
            r4.setParseBigDecimal(r5)
        L5b:
            throw r0
        L5c:
            java.lang.Number r0 = parseNumber(r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.springframework.util.NumberUtils.parseNumber(java.lang.String, java.lang.Class, java.text.NumberFormat):java.lang.Number");
    }

    private static void raiseOverflowException(Number number, Class cls) {
        throw new IllegalArgumentException("Could not convert number [" + number + "] of type [" + number.getClass().getName() + "] to target class [" + cls.getName() + "]: overflow");
    }
}
