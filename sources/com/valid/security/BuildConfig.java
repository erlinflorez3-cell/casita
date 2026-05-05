package com.valid.security;

import com.dynatrace.android.agent.Global;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public final class BuildConfig {
    public static final boolean DEBUG = false;
    public static final String FLAVOR = "";
    public static final int VERSION_CODE = 6;
    public static final String VERSION_NAME = C1561oA.Kd("\u001f\u001c\u001f\u001e#", (short) (ZN.Xd() ^ ((1869091126 ^ 1008376852) ^ 1400028491)));
    public static final String BUILD_TYPE = Wg.Zd("Z=\u0001y3\u0002c", (short) (OY.Xd() ^ (1200021349 ^ 1200016338)), (short) (OY.Xd() ^ (OY.Xd() ^ 69931861)));
    public static final String APPLICATION_ID = C1561oA.Xd("mzy;\u0005p|zvA\bzy\r\u000b\u0003\u000f\u0015", (short) (C1499aX.Xd() ^ (175707931 ^ (-175726372))));

    /* JADX INFO: renamed from: com.valid.security.BuildConfig$1 */
    public class AnonymousClass1 {
        public static String equals(String str, int i2) {
            String strOd;
            int i3;
            int i4;
            char[] charArray;
            int i5;
            int i6;
            int length;
            int i7;
            String strZd = C1593ug.zd(Global.HYPHEN, (short) (C1633zX.Xd() ^ (Od.Xd() ^ (355168720 ^ (-1389808369)))), (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831083510)));
            try {
                int i8 = 4;
                if (Integer.parseInt(strZd) != 0) {
                    strOd = strZd;
                    i4 = 8;
                    i3 = 4;
                } else {
                    strOd = C1561oA.od("MP", (short) (C1633zX.Xd() ^ (839560886 ^ (-839571067))));
                    i3 = (157982127 ^ 1701262856) ^ 1812835234;
                    i4 = (447190759 ^ 648259015) ^ 1006908204;
                }
                int i9 = 1;
                if (i4 != 0) {
                    i2 += 2;
                    charArray = str.toCharArray();
                    i5 = 0;
                    i6 = 0;
                } else {
                    i6 = i4 + 10;
                    charArray = null;
                    strZd = strOd;
                    i5 = 1;
                }
                if (Integer.parseInt(strZd) != 0) {
                    i7 = i6 + 8;
                    length = 1;
                } else {
                    length = charArray.length;
                    i7 = i6 + 4;
                }
                if (i7 != 0) {
                    i8 = 4 << i3;
                    i9 = i5;
                } else {
                    charArray = null;
                }
                int i10 = (i8 - 1) ^ 32;
                while (i9 != length) {
                    int i11 = charArray[i9] ^ ((i2 + i10) - (i2 | i10));
                    i2--;
                    charArray[i9] = (char) i11;
                    i9++;
                }
                return String.valueOf(charArray, 0, length).intern();
            } catch (NullPointerException unused) {
                return null;
            }
        }
    }

    public class NullPointerException extends RuntimeException {
    }
}
