package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
public final class dk {
    private static final int I;

    static {
        String property = System.getProperty("java.version");
        int iCode = Code(property);
        if (iCode == -1) {
            iCode = Z(property);
        }
        if (iCode == -1) {
            iCode = 6;
        }
        I = iCode;
    }

    private static int Code(String str) {
        try {
            String[] strArrSplit = str.split("[._]");
            int i2 = Integer.parseInt(strArrSplit[0]);
            return (i2 != 1 || strArrSplit.length <= 1) ? i2 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean I() {
        return I >= 9;
    }

    public static int Z() {
        return I;
    }

    private static int Z(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
