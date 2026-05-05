package com.valid.emvqr.utils;

import com.dynatrace.android.agent.Global;
import com.valid.emvqr.a4;
import com.valid.emvqr.qb;
import com.valid.utils.VsshLogger;
import java.net.NetworkInterface;
import java.util.Collections;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public class SdkUtils {
    public static String getMacAddress() {
        String string;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        NetworkInterface networkInterface;
        String strKd;
        int i21;
        String str2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        short sXd = (short) (C1607wl.Xd() ^ (2045852281 ^ 2045857071));
        int[] iArr = new int["\t".length()];
        QB qb = new QB("\t");
        int i29 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i29] = xuXd.fK(xuXd.CK(iKK) - (sXd + i29));
            i29++;
        }
        String str3 = new String(iArr, 0, i29);
        String strVd = Wg.vd(Global.BLANK, (short) (FB.Xd() ^ ((1529309787 ^ 353475291) ^ 1312195429)));
        int iXd = FB.Xd() ^ 1609527097;
        int i30 = (1872027353 ^ 1656267417) ^ 221019202;
        int i31 = (1851929648 ^ 417834889) ^ 1988465599;
        try {
            string = null;
            for (Object obj : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                try {
                    if (Integer.parseInt(strVd) != 0) {
                        str2 = strVd;
                        i21 = 4;
                        networkInterface = null;
                        strKd = null;
                    } else {
                        networkInterface = (NetworkInterface) obj;
                        strKd = Qg.kd("QH\u0017\u000e@", (short) (C1499aX.Xd() ^ (466539859 ^ (-466527861))), (short) (C1499aX.Xd() ^ (1994645574 ^ (-1994630958))));
                        i21 = 311987119 ^ 311987111;
                        str2 = str3;
                    }
                    if (i21 != 0) {
                        str2 = strVd;
                        i23 = iXd;
                        i24 = i23;
                        i25 = i24;
                        i22 = 0;
                    } else {
                        i22 = i21 + 11;
                        i23 = 0;
                        i24 = 0;
                        i25 = 0;
                    }
                    if (Integer.parseInt(str2) != 0) {
                        i27 = i22 + 13;
                        i28 = 1;
                        i26 = 1;
                    } else {
                        i26 = i25 + i23 + i24;
                        i27 = i22 + 11;
                        str2 = str3;
                        i28 = i30;
                    }
                    if (i27 != 0) {
                        i26 += i28 + i28;
                        str2 = strVd;
                    }
                    if (qb.substring(strKd, i26 / (Integer.parseInt(str2) != 0 ? 1 : i31)).equalsIgnoreCase(networkInterface.getName())) {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        if (hardwareAddress == null) {
                        }
                        StringBuilder sb = new StringBuilder();
                        if (hardwareAddress != null) {
                            for (byte b2 : hardwareAddress) {
                                short sXd2 = (short) (Od.Xd() ^ (2147145028 ^ (-2147138744)));
                                short sXd3 = (short) (Od.Xd() ^ ((1200848701 ^ 1855245329) ^ (-688373227)));
                                int[] iArr2 = new int["\u0014!\u001bhO".length()];
                                QB qb2 = new QB("\u0014!\u001bhO");
                                int i32 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i32] = xuXd2.fK(sXd2 + i32 + xuXd2.CK(iKK2) + sXd3);
                                    i32++;
                                }
                                sb.append(String.format(a4.indexOf(i30, new String(iArr2, 0, i32)), Byte.valueOf(b2)));
                            }
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        string = sb.toString();
                    }
                } catch (Exception e2) {
                    e = e2;
                    if (Integer.parseInt(strVd) != 0) {
                        str = strVd;
                        i2 = 1;
                        i3 = 12;
                    } else {
                        i2 = 571290406 ^ 571290370;
                        str = str3;
                        i3 = 14;
                    }
                    int i33 = 1521740798 ^ 1521740791;
                    if (i3 != 0) {
                        i5 = i2 + i33;
                        str = strVd;
                        i6 = 4;
                        i4 = 0;
                    } else {
                        i4 = i3 + 7;
                        i5 = 1;
                        i6 = 1;
                    }
                    if (Integer.parseInt(str) != 0) {
                        i7 = i4 + i31;
                        i8 = 0;
                    } else {
                        i5 += i6 + i6;
                        i7 = i4 + 12;
                        str = str3;
                        i8 = i33;
                    }
                    if (i7 != 0) {
                        i5 /= i8 << i30;
                        str = strVd;
                        i9 = 0;
                    } else {
                        i9 = i7 + i31;
                    }
                    if (Integer.parseInt(str) != 0) {
                        i10 = i9 + 5;
                    } else {
                        a4.indexOf(i5, C1561oA.ud("fkr\u0012+&+0", (short) (C1607wl.Xd() ^ (2019390360 ^ 2019362919))));
                        e.getMessage();
                        i10 = i9 + 3;
                        str = str3;
                    }
                    if (i10 != 0) {
                        str = strVd;
                        i11 = 0;
                    } else {
                        i11 = i10 + 14;
                    }
                    int i34 = i11 + 5;
                    if (Integer.parseInt(str) != 0) {
                        i12 = 0;
                        i13 = 0;
                        i33 = 0;
                    } else {
                        str = str3;
                        i12 = i33;
                        i13 = i12;
                    }
                    if (i34 != 0) {
                        i15 = i33 + i12;
                        str = strVd;
                        i14 = 0;
                    } else {
                        i14 = i34 + i31;
                        i15 = 1;
                        i13 = 0;
                    }
                    if (Integer.parseInt(str) != 0) {
                        i16 = i14 + 15;
                        str3 = str;
                    } else {
                        i15 += i13 << 2;
                        i16 = i14 + iXd;
                    }
                    if (i16 != 0) {
                        i18 = i31;
                        i17 = 0;
                    } else {
                        i17 = i16 + iXd;
                        strVd = str3;
                        i18 = 1;
                    }
                    if (Integer.parseInt(strVd) != 0) {
                        i19 = i17 + 4;
                        i31 = 0;
                        i20 = 0;
                    } else {
                        i15 += i18;
                        i19 = i17 + 3;
                        i20 = i31;
                    }
                    VsshLogger.logError(a4.indexOf(i15 / (i19 != 0 ? i31 + (i20 + i31) : 1), C1561oA.yd("\b1,Ohkpq", (short) (OY.Xd() ^ ((141229487 ^ 962680518) ^ 822855786)))), e.getMessage(), e);
                }
            }
        } catch (Exception e3) {
            e = e3;
            string = null;
        }
        if (string == null) {
            return null;
        }
        return m(string);
    }

    private static String m(String str) {
        StringBuilder sb;
        String[] strArrSplit = str.split(C1561oA.Yd("\u000b", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (1964394796 ^ (-1184642652))))));
        if (Integer.parseInt(Xg.qd("\u001f", (short) (OY.Xd() ^ (Od.Xd() ^ (756298579 ^ 1793700008))), (short) (OY.Xd() ^ (ZN.Xd() ^ (1566952598 ^ 1861221891))))) != 0) {
            sb = null;
            strArrSplit = null;
        } else {
            sb = new StringBuilder();
        }
        for (String str2 : strArrSplit) {
            sb.append(str2);
        }
        return sb.toString();
    }
}
