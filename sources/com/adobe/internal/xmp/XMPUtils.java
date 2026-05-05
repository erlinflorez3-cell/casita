package com.adobe.internal.xmp;

import com.adobe.internal.xmp.impl.Base64;
import com.adobe.internal.xmp.impl.ISO8601Converter;
import com.adobe.internal.xmp.impl.XMPUtilsImpl;
import com.adobe.internal.xmp.options.PropertyOptions;
import com.adobe.internal.xmp.options.TemplateOptions;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
public class XMPUtils {
    private XMPUtils() {
    }

    public static void appendProperties(XMPMeta xMPMeta, XMPMeta xMPMeta2, boolean z2, boolean z3) throws XMPException {
        appendProperties(xMPMeta, xMPMeta2, z2, z3, false);
    }

    public static void appendProperties(XMPMeta xMPMeta, XMPMeta xMPMeta2, boolean z2, boolean z3, boolean z4) throws XMPException {
        XMPUtilsImpl.appendProperties(xMPMeta, xMPMeta2, z2, z3, z4);
    }

    public static void applyTemplate(XMPMeta xMPMeta, XMPMeta xMPMeta2, TemplateOptions templateOptions) throws XMPException {
        XMPUtilsImpl.applyTemplate(xMPMeta, xMPMeta2, templateOptions);
    }

    public static String catenateArrayItems(XMPMeta xMPMeta, String str, String str2, String str3, String str4, boolean z2) throws XMPException {
        return XMPUtilsImpl.catenateArrayItems(xMPMeta, str, str2, str3, str4, z2);
    }

    public static String convertFromBoolean(boolean z2) {
        return z2 ? XMPConst.TRUESTR : XMPConst.FALSESTR;
    }

    public static String convertFromDate(XMPDateTime xMPDateTime) {
        return ISO8601Converter.render(xMPDateTime);
    }

    public static String convertFromDouble(double d2) {
        return String.valueOf(d2);
    }

    public static String convertFromInteger(int i2) {
        return String.valueOf(i2);
    }

    public static String convertFromLong(long j2) {
        return String.valueOf(j2);
    }

    public static boolean convertToBoolean(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty convert-string", 5);
        }
        String lowerCase = str.toLowerCase();
        try {
            return Integer.parseInt(lowerCase) != 0;
        } catch (NumberFormatException unused) {
            return "true".equals(lowerCase) || "t".equals(lowerCase) || "on".equals(lowerCase) || "yes".equals(lowerCase);
        }
    }

    public static XMPDateTime convertToDate(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty convert-string", 5);
        }
        return ISO8601Converter.parse(str);
    }

    public static double convertToDouble(String str) throws XMPException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return Double.parseDouble(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid double string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    public static int convertToInteger(String str) throws XMPException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid integer string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    public static long convertToLong(String str) throws XMPException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid long string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    public static byte[] decodeBase64(String str) throws XMPException {
        try {
            return Base64.decode(str.getBytes());
        } catch (Throwable th) {
            throw new XMPException("Invalid base64 string", 5, th);
        }
    }

    public static void duplicateSubtree(XMPMeta xMPMeta, XMPMeta xMPMeta2, String str, String str2, String str3, String str4, PropertyOptions propertyOptions) throws XMPException {
        XMPUtilsImpl.duplicateSubtree(xMPMeta, xMPMeta2, str, str2, str3, str4, propertyOptions);
    }

    public static String encodeBase64(byte[] bArr) {
        return new String(Base64.encode(bArr));
    }

    public static void mergeFromJPEG(XMPMeta xMPMeta, XMPMeta xMPMeta2) throws XMPException {
        XMPUtilsImpl.mergeFromJPEG(xMPMeta, xMPMeta2);
    }

    public static void packageForJPEG(XMPMeta xMPMeta, StringBuilder sb, StringBuilder sb2, StringBuilder sb3) throws NoSuchAlgorithmException, XMPException {
        XMPUtilsImpl.packageForJPEG(xMPMeta, sb, sb2, sb3);
    }

    public static void removeProperties(XMPMeta xMPMeta, String str, String str2, boolean z2, boolean z3) throws XMPException {
        XMPUtilsImpl.removeProperties(xMPMeta, str, str2, z2, z3);
    }

    public static void separateArrayItems(XMPMeta xMPMeta, String str, String str2, String str3, PropertyOptions propertyOptions, boolean z2) throws XMPException {
        XMPUtilsImpl.separateArrayItems(xMPMeta, str, str2, str3, propertyOptions, z2);
    }
}
