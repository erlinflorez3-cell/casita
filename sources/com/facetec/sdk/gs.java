package com.facetec.sdk;

import cz.msebera.android.httpclient.message.BasicHeaderValueFormatter;
import cz.msebera.android.httpclient.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class gs {
    static {
        ib.V(BasicHeaderValueFormatter.UNSAFE_CHARS);
        ib.V("\t ,=");
    }

    public static int B(String str, int i2) {
        try {
            long j2 = Long.parseLong(str);
            if (j2 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j2 < 0) {
                return 0;
            }
            return (int) j2;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static int Code(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }

    public static long Code(fy fyVar) {
        return I(fyVar.Z().Code("Content-Length"));
    }

    private static long I(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static void I(fm fmVar, fp fpVar, fr frVar) {
        if (fmVar == fm.B) {
            return;
        }
        fj.I(fpVar, frVar).isEmpty();
    }

    public static int V(String str, int i2) {
        char cCharAt;
        while (i2 < str.length() && ((cCharAt = str.charAt(i2)) == ' ' || cCharAt == '\t')) {
            i2++;
        }
        return i2;
    }

    public static boolean Z(fy fyVar) {
        if (fyVar.Code().Z().equals("HEAD")) {
            return false;
        }
        int I = fyVar.I();
        return (((I >= 100 && I < 200) || I == 204 || I == 304) && Code(fyVar) == -1 && !HTTP.CHUNK_CODING.equalsIgnoreCase(fyVar.B("Transfer-Encoding"))) ? false : true;
    }
}
