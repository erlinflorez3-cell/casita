package yg;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: yg.qB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1570qB {
    public final long Kd;
    public final boolean Od;
    public final String Qd;
    public final long Xd;
    public final long Yd;
    public final String od;
    public final long ud;
    public final boolean vd;
    public final boolean wd;
    public final boolean yd;

    public C1570qB(String str) {
        int iXd = FB.Xd() ^ (2077416094 ^ 608020587);
        int iXd2 = ZN.Xd() ^ (1862731610 ^ 1552752134);
        short sXd = (short) (C1607wl.Xd() ^ iXd);
        short sXd2 = (short) (C1607wl.Xd() ^ iXd2);
        int[] iArr = new int[RemoteSettings.FORWARD_SLASH_STRING.length()];
        QB qb = new QB(RemoteSettings.FORWARD_SLASH_STRING);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split(str2)));
        arrayList.removeAll(Collections.singleton(""));
        String str3 = (String) arrayList.get(0);
        short sXd3 = (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (715412366 ^ 1765760015)));
        int[] iArr2 = new int["M".length()];
        QB qb2 = new QB("M");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
            i3++;
        }
        String[] strArrSplit = str3.split(new String(iArr2, 0, i3));
        this.Kd = new BigInteger(strArrSplit[0], (1648221922 ^ 1399921300) ^ 827114598).longValue();
        this.Xd = new BigInteger(strArrSplit[1], Od.Xd() ^ 1207800901).longValue();
        String str4 = (String) arrayList.get(1);
        this.wd = str4.charAt(0) == (1803062472 ^ 1803062458);
        this.Od = str4.charAt(1) == (1308262740 ^ 1308262691);
        int i4 = (1788968669 ^ 80142375) ^ 1852284664;
        this.yd = str4.charAt(i4) == (688351930 ^ 688351938);
        int i5 = 1552230930 ^ 1552230929;
        this.vd = str4.charAt(i5) != (C1580rY.Xd() ^ (-831067247));
        this.ud = new BigInteger((String) arrayList.get(i4), 2039638605 ^ 2039638621).longValue();
        this.od = (String) arrayList.get(i5);
        this.Yd = Long.parseLong((String) arrayList.get(1607613091 ^ 1607613095));
        int size = arrayList.size();
        int iXd3 = C1499aX.Xd() ^ (1397830419 ^ (-281695238));
        StringBuilder sb = new StringBuilder(size > iXd3 ? (String) arrayList.get(iXd3) : "");
        if (arrayList.size() > (998028306 ^ 998028308)) {
            for (int i6 = (879116372 ^ 1770724944) ^ 1575837186; i6 < arrayList.size(); i6++) {
                sb.append(str2).append((String) arrayList.get(i6));
            }
        }
        this.Qd = sb.toString();
    }
}
