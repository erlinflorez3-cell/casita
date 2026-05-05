package yg;

import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: renamed from: yg.yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1628yp {
    public final long Kd;
    public final List<String> Qd;
    public final long Xd;
    public final String Yd;
    public final String od;
    public final String ud;
    public final List<String> yd;

    public C1628yp(String str, long j2, long j3, String str2, String str3, List<String> list, List<String> list2) {
        String strUd = C1626yg.Ud("\u001e\u000f#\u001d\"", (short) (ZN.Xd() ^ ((1864244902 ^ 2114212901) ^ 286932015)), (short) (ZN.Xd() ^ ((1298173111 ^ 1892445076) ^ 1034724733)));
        String strWd = Ig.wd("<}", (short) (C1580rY.Xd() ^ ((1104964525 ^ 431839906) ^ (-1482761685))));
        try {
            Class<?> cls = Class.forName(strUd);
            Field field = 1 != 0 ? cls.getField(strWd) : cls.getDeclaredField(strWd);
            field.setAccessible(true);
            field.set(this, str);
        } catch (Throwable th) {
        }
        String strOd = EO.Od("9l\u00030q", (short) (ZN.Xd() ^ (2121299284 ^ 2121287596)));
        String strQd = C1561oA.Qd("U`", (short) (ZN.Xd() ^ (826006058 ^ 825993663)));
        Long lValueOf = Long.valueOf(j2);
        try {
            Class<?> cls2 = Class.forName(strOd);
            Field field2 = 1 != 0 ? cls2.getField(strQd) : cls2.getDeclaredField(strQd);
            field2.setAccessible(true);
            field2.set(this, lValueOf);
        } catch (Throwable th2) {
        }
        short sXd = (short) (Od.Xd() ^ (520402842 ^ (-520412085)));
        short sXd2 = (short) (Od.Xd() ^ ((1633066954 ^ 542830824) ^ (-1091329891)));
        int[] iArr = new int["0\u001ff3+".length()];
        QB qb = new QB("0\u001ff3+");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        String str4 = new String(iArr, 0, i2);
        String strOd2 = C1561oA.od("E]", (short) (C1580rY.Xd() ^ (763704227 ^ (-763717728))));
        Long lValueOf2 = Long.valueOf(j3);
        try {
            Class<?> cls3 = Class.forName(str4);
            Field field3 = 1 != 0 ? cls3.getField(strOd2) : cls3.getDeclaredField(strOd2);
            field3.setAccessible(true);
            field3.set(this, lValueOf2);
        } catch (Throwable th3) {
        }
        String strKd = C1561oA.Kd("#\u0012Y&\u001e", (short) (C1607wl.Xd() ^ ((1076414873 ^ 1085060301) ^ 8679005)));
        String strZd = Wg.Zd("*u", (short) (C1607wl.Xd() ^ ((823172719 ^ 43443033) ^ 864450448)), (short) (C1607wl.Xd() ^ ((2014458105 ^ 1835359446) ^ 360135229)));
        try {
            Class<?> cls4 = Class.forName(strKd);
            Field field4 = 1 != 0 ? cls4.getField(strZd) : cls4.getDeclaredField(strZd);
            field4.setAccessible(true);
            field4.set(this, str2);
        } catch (Throwable th4) {
        }
        String strXd = C1561oA.Xd("H7~KC", (short) (C1607wl.Xd() ^ ((1396910760 ^ 1710659960) ^ 917879443)));
        String strVd = Wg.vd("\u0004w", (short) (ZN.Xd() ^ (1285665493 ^ 1285666983)));
        try {
            Class<?> cls5 = Class.forName(strXd);
            Field field5 = 1 != 0 ? cls5.getField(strVd) : cls5.getDeclaredField(strVd);
            field5.setAccessible(true);
            field5.set(this, str3);
        } catch (Throwable th5) {
        }
        String strKd2 = Qg.kd("hU\u001be[", (short) (C1499aX.Xd() ^ ((174709838 ^ 1367178478) ^ (-1528091860))), (short) (C1499aX.Xd() ^ (450942398 ^ (-450925344))));
        String strVd2 = hg.Vd("\u0007p", (short) (C1580rY.Xd() ^ (1997011513 ^ (-1996998833))), (short) (C1580rY.Xd() ^ (1708564050 ^ (-1708583687))));
        try {
            Class<?> cls6 = Class.forName(strKd2);
            Field field6 = 1 != 0 ? cls6.getField(strVd2) : cls6.getDeclaredField(strVd2);
            field6.setAccessible(true);
            field6.set(this, list);
        } catch (Throwable th6) {
        }
        String strUd2 = C1561oA.ud("+\u0018](\u001e", (short) (ZN.Xd() ^ (366871666 ^ 366883258)));
        String strYd = C1561oA.yd("8J", (short) (C1633zX.Xd() ^ ((1535845733 ^ 230065030) ^ (-1446881229))));
        try {
            Class<?> cls7 = Class.forName(strUd2);
            Field field7 = 1 != 0 ? cls7.getField(strYd) : cls7.getDeclaredField(strYd);
            field7.setAccessible(true);
            field7.set(this, list2);
        } catch (Throwable th7) {
        }
    }
}
