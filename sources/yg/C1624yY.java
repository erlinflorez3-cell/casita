package yg;

import com.dynatrace.android.agent.Global;
import java.util.Arrays;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: renamed from: yg.yY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1624yY {
    static char[] Kd = null;
    private static final String Xd = Wg.vd("\u0019\u0019\u001d\u001d\u0019\u0019\u001d\u001d\u0019\u0019\u001d\u001d\u0019\u0019\u001d\u001d\u0019\u0019\u001d\u001d\u0019\u0019\u001d\u001d\u0019\u0019##\u001f\u001f##__cc__cc__cc__cc__cc\u0014\u0014\u0018\u0018\u0014\u0014\u0018\u0018\u0014\u0014\t\f", (short) (C1580rY.Xd() ^ (1443604360 ^ (-1443598709))));

    public static byte[] Kd(String str) {
        String strReplaceAll = str.replaceAll(Qg.kd("CE''''''''''''''''''''''''''--------------------------aaaaaaaaaaRUb\u0002", (short) (C1633zX.Xd() ^ ((46365137 ^ 1845299295) ^ (-1866340625))), (short) (C1633zX.Xd() ^ (602817618 ^ (-602812911)))), "");
        int i2 = 810671491 ^ 810671550;
        String strVd = strReplaceAll.charAt(strReplaceAll.length() - 1) == i2 ? strReplaceAll.charAt(strReplaceAll.length() - 2) == i2 ? hg.Vd("ml", (short) (ZN.Xd() ^ (1952910679 ^ 1952930573)), (short) (ZN.Xd() ^ (FB.Xd() ^ (79378799 ^ 1532237173)))) : C1561oA.ud(Global.QUESTION, (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (1092439809 ^ 894190625)))) : "";
        String str2 = strReplaceAll.substring(0, strReplaceAll.length() - strVd.length()) + strVd;
        byte[] bArr = new byte[(str2.length() / 4) * 3];
        int i3 = 0;
        for (int i4 = 0; i4 < str2.length(); i4 += 4) {
            char cCharAt = str2.charAt(i4);
            String strYd = C1561oA.yd("\u001b\u001d\u001b\u001d\u001b\u001d\u001b\u001d\u001b\u001d\u001b\u001d\u001b\u001d\u001b\u001d;=;=;=;=;=ACACAC!#!#!#!#!#!#!#!#ACACuwuwuwuwuwfk", (short) (C1633zX.Xd() ^ (1394334901 ^ (-1394330736))));
            int iIndexOf = (strYd.indexOf(cCharAt) << 18) + (strYd.indexOf(str2.charAt(i4 + 1)) << 12) + (strYd.indexOf(str2.charAt(i4 + 2)) << 6) + strYd.indexOf(str2.charAt(i4 + 3));
            int i5 = i3 + 1;
            int i6 = iIndexOf >>> 16;
            bArr[i3] = (byte) ((i6 + 255) - (i6 | 255));
            int i7 = i5 + 1;
            int i8 = iIndexOf >>> 8;
            bArr[i5] = (byte) ((i8 + 255) - (i8 | 255));
            i3 = i7 + 1;
            bArr[i7] = (byte) ((iIndexOf + 255) - (iIndexOf | 255));
        }
        return Arrays.copyOfRange(bArr, 0, bArr.length - strVd.length());
    }

    public static String Xd(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char[] cArrYd = Yd();
        int length = (bArr.length / 3) * 3;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i4 = i2 + 1;
            int i5 = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
            int i6 = i4 + 1;
            byte b2 = bArr[i4];
            int i7 = (b2 + 255) - (b2 | 255);
            i2 = i6 + 1;
            int i8 = bArr[i6] & 255;
            int i9 = i5 >> 2;
            sb.append(cArrYd[(i9 + 63) - (i9 | 63)]);
            sb.append(cArrYd[((((i5 + 3) - (i5 | 3)) << 4) + (i7 >> 4)) & 63]);
            int i10 = ((i7 & 15) << 2) + (i8 >> 6);
            sb.append(cArrYd[(i10 + 63) - (i10 | 63)]);
            sb.append(cArrYd[(-1) - (((-1) - i8) | ((-1) - 63))]);
        }
        if (length < bArr.length) {
            int i11 = i2 + 1;
            int i12 = (-1) - (((-1) - bArr[i2]) | ((-1) - 255));
            int i13 = 0;
            if (length + 1 < bArr.length) {
                int i14 = i11 + 1;
                i13 = (-1) - (((-1) - bArr[i11]) | ((-1) - 255));
            }
            sb.append(cArrYd[(i12 >> 2) & 63]);
            sb.append(cArrYd[(-1) - (((-1) - (((i12 & 3) << 4) + (i13 >> 4))) | ((-1) - 63))]);
            if (length + 1 < bArr.length) {
                sb.append(cArrYd[(((-1) - (((-1) - i13) | ((-1) - 15))) << 2) & 63]);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static synchronized char[] Yd() {
        if (Kd == null) {
            Kd = new char[(1368854210 ^ 1922206668) ^ 587564366];
            int i2 = 0;
            for (char c2 = (421070251 ^ 1539240230) ^ 1118303436; c2 <= ((390799920 ^ 732829326) ^ 1021654244); c2 = (char) (c2 + 1)) {
                Kd[i2] = c2;
                i2++;
            }
            for (char c3 = 879871177 ^ 879871144; c3 <= (1876003712 ^ 1876003834); c3 = (char) (c3 + 1)) {
                Kd[i2] = c3;
                i2++;
            }
            for (char c4 = 1579468041 ^ 1579468089; c4 <= ((267852413 ^ 1811787891) ^ 1678420535); c4 = (char) (c4 + 1)) {
                Kd[i2] = c4;
                i2++;
            }
            int i3 = i2 + 1;
            Kd[i2] = Soundex.SILENT_MARKER;
            int i4 = i3 + 1;
            Kd[i3] = '_';
        }
        return Kd;
    }
}
