package com.valid.vssh_android_core;

import java.util.Random;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public final class BuildConfig {
    public static final String BUILD_TYPE;
    public static final boolean DEBUG = false;
    public static final String LIBRARY_PACKAGE_NAME;
    public static final int VERSION_CODE = 1;
    public static final String VERSION_NAME;

    /* JADX INFO: renamed from: com.valid.vssh_android_core.BuildConfig$1, reason: invalid class name */
    public class AnonymousClass1 {
        public static int indexOf() {
            try {
                return new Random().nextInt(1151979378 ^ 1151979321) + 1;
            } catch (Exception unused) {
                return 0;
            }
        }

        public static String indexOf(String str, int i2) {
            int i3;
            int i4;
            String str2;
            int i5;
            int i6;
            char[] charArray;
            int i7;
            int i8;
            int length;
            String strKd = C1561oA.Kd("r", (short) (C1607wl.Xd() ^ (2073199254 ^ 2073202472)));
            try {
                int i9 = Integer.parseInt(strKd);
                short sXd = (short) (ZN.Xd() ^ ((1092963606 ^ 1690028809) ^ 631144568));
                short sXd2 = (short) (ZN.Xd() ^ (1597617823 ^ 1597631422));
                int[] iArr = new int["+3".length()];
                QB qb = new QB("+3");
                int i10 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i10] = xuXd.fK(((i10 * sXd2) ^ sXd) + xuXd.CK(iKK));
                    i10++;
                }
                String str3 = new String(iArr, 0, i10);
                int i11 = 1;
                if (i9 != 0) {
                    i3 = (1043211994 ^ 1886302968) ^ 1312855072;
                    i4 = (2114038969 ^ 1374263702) ^ 803747110;
                    str2 = strKd;
                    i5 = 0;
                } else {
                    i3 = 2048893264 ^ 2048893268;
                    i4 = 943326044 ^ 943326043;
                    str2 = str3;
                    i5 = 1;
                }
                if (i4 != 0) {
                    i6 = i5 + i3;
                    str2 = strKd;
                } else {
                    i6 = i3;
                }
                if (Integer.parseInt(str2) != 0) {
                    i7 = 157812326 ^ 157812334;
                    charArray = null;
                    i8 = 1;
                } else {
                    i2 -= 11;
                    charArray = str.toCharArray();
                    i7 = 3;
                    str2 = str3;
                    i8 = 0;
                }
                if (i7 != 0) {
                    length = charArray.length;
                } else {
                    length = 1;
                    strKd = str2;
                }
                if (Integer.parseInt(strKd) != 0) {
                    charArray = null;
                } else {
                    i3 <<= i6;
                    i11 = i8;
                }
                int i12 = (i3 - 1) ^ 32;
                while (i11 != length) {
                    int i13 = charArray[i11] ^ ((i2 + i12) - (i2 | i12));
                    i2--;
                    charArray[i11] = (char) i13;
                    i11++;
                }
                return String.valueOf(charArray, 0, length);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class Exception extends RuntimeException {
    }

    static {
        short sXd = (short) (C1633zX.Xd() ^ (1231865301 ^ (-1231858369)));
        int[] iArr = new int["ifjhl".length()];
        QB qb = new QB("ifjhl");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        VERSION_NAME = new String(iArr, 0, i2);
        LIBRARY_PACKAGE_NAME = Wg.vd("x\u0006\u0005F\u0010{\b\u0006\u0002L\u0016\u0014\u0015\u000b\u0003\u0006\u0014\u000b\u001a\u0018\u0013\u000f\u000b\u0010\u001d!\u0015", (short) (ZN.Xd() ^ (963098526 ^ 963107921)));
        BUILD_TYPE = Qg.kd("8*0(#4%", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207810821))), (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ (979992762 ^ 199281498))));
    }
}
