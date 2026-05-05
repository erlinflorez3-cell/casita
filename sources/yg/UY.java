package yg;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class UY {
    private final String Kd;
    private final String Xd;
    final /* synthetic */ C1515eo Yd;

    public UY(C1515eo c1515eo, String str, String str2) {
        this.Yd = c1515eo;
        String strQd = C1561oA.Qd("'\u0014Y\u007f\u0003", (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134247641)));
        String strZd = C1593ug.zd("bo", (short) (C1580rY.Xd() ^ ((2093618882 ^ 969411638) ^ (-1157788442))), (short) (C1580rY.Xd() ^ (1203914028 ^ (-1203925863))));
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            field.set(this, str);
        } catch (Throwable th) {
        }
        String strOd = C1561oA.od("'\u0014Y\u007f\u0003", (short) (C1607wl.Xd() ^ ((474785543 ^ 1271533987) ^ 1468457957)));
        String strKd = C1561oA.Kd("/I", (short) (Od.Xd() ^ (209851470 ^ (-209849583))));
        try {
            Class<?> cls2 = Class.forName(strOd);
            Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
            field2.setAccessible(true);
            field2.set(this, str2);
        } catch (Throwable th2) {
        }
    }

    public String rK() {
        Object obj;
        String strZd = Wg.Zd("qg(ec", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849958247))), (short) (C1499aX.Xd() ^ ((950545621 ^ 692038590) ^ (-295162651))));
        short sXd = (short) (C1607wl.Xd() ^ (261039608 ^ 261052931));
        int[] iArr = new int["S`".length()];
        QB qb = new QB("S`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        return (String) obj;
    }

    public String wK() {
        Object obj;
        String strVd = Wg.vd("_N\u0012:C", (short) (ZN.Xd() ^ ((856129507 ^ 436922950) ^ 688751976)));
        int iXd = ZN.Xd() ^ 864709148;
        short sXd = (short) (C1607wl.Xd() ^ ((1009319352 ^ 265840713) ^ 871420526));
        short sXd2 = (short) (C1607wl.Xd() ^ iXd);
        int[] iArr = new int["\":".length()];
        QB qb = new QB("\":");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strVd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        return (String) obj;
    }
}
