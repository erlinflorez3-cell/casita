package com.valid.communication.helpers;

import yg.C1499aX;
import yg.C1607wl;
import yg.Qg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class ConvertDataHelper {

    public class Exception extends RuntimeException {
    }

    public static String concatenateWithSlash(String str, String str2) {
        StringBuilder sbAppend;
        StringBuilder sbAppend2;
        if (str == null || str.isEmpty()) {
            return str2;
        }
        if (str2 == null || str2.isEmpty()) {
            return str;
        }
        String strSubstring = str.substring(str.length() - 1);
        String strKd = Qg.kd("\u0013", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (1066733876 ^ 1372665608))), (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864684424)));
        int i2 = Integer.parseInt(strKd);
        String strSubstring2 = null;
        String strVd = hg.Vd("\u0014", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134255430)), (short) (C1499aX.Xd() ^ (1880337389 ^ (-1880341835))));
        Boolean boolValueOf = i2 != 0 ? null : Boolean.valueOf(strVd.equals(strSubstring));
        Boolean boolValueOf2 = Boolean.valueOf(strVd.equals(str2.substring(0, 1)));
        if (boolValueOf.booleanValue() && boolValueOf2.booleanValue()) {
            StringBuilder sb = new StringBuilder();
            if (Integer.parseInt(strKd) == 0) {
                sb = sb.append(str);
                strSubstring2 = str2.substring(1, str2.length());
            }
            sbAppend2 = sb.append(strSubstring2);
        } else {
            if ((boolValueOf.booleanValue() || !boolValueOf2.booleanValue()) && !boolValueOf.booleanValue()) {
                StringBuilder sb2 = new StringBuilder();
                if (Integer.parseInt(strKd) == 0) {
                    sb2 = sb2.append(str);
                    strSubstring2 = strVd;
                }
                sbAppend = sb2.append(strSubstring2);
            } else {
                sbAppend = new StringBuilder().append(str);
            }
            sbAppend2 = sbAppend.append(str2);
        }
        return sbAppend2.toString();
    }
}
