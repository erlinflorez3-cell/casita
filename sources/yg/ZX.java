package yg;

import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ZX {
    private float[] Kd;
    private float Xd;

    public ZX(float f2, float[] fArr) {
        String strXd = ZO.xd("h\u000fBK2", (short) (C1607wl.Xd() ^ (420208039 ^ 420191546)), (short) (C1607wl.Xd() ^ ((1386073128 ^ 932785266) ^ 1694807537)));
        String strUd = C1626yg.Ud("\u0001a", (short) (C1607wl.Xd() ^ (1697227254 ^ 1697237081)), (short) (C1607wl.Xd() ^ (1252729764 ^ 1252744833)));
        Float fValueOf = Float.valueOf(f2);
        try {
            Class<?> cls = Class.forName(strXd);
            Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
            field.setAccessible(true);
            field.set(this, fValueOf);
        } catch (Throwable th) {
        }
        short sXd = (short) (C1607wl.Xd() ^ (1428689617 ^ 1428701291));
        int[] iArr = new int["]$:@4".length()];
        QB qb = new QB("]$:@4");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strOd = EO.Od("\u0013\\", (short) (C1580rY.Xd() ^ ((1542944215 ^ 1041346949) ^ (-1709632624))));
        try {
            Class<?> cls2 = Class.forName(str);
            Field field2 = 0 != 0 ? cls2.getField(strOd) : cls2.getDeclaredField(strOd);
            field2.setAccessible(true);
            field2.set(this, fArr);
        } catch (Throwable th2) {
        }
    }

    public double WK(List<Float> list, QY<Double> qy) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String strQd = C1561oA.Qd("mZ KH", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831081133))));
        String strZd = C1593ug.zd("j\u0005", (short) (C1580rY.Xd() ^ ((701724111 ^ 256689597) ^ (-648017476))), (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (-864714609))));
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        if (((float[]) obj).length != list.size()) {
            throw new RuntimeException(hg.Vd("ERURR][\u0007GSH\u0003XBLTCP{NCS=vC>G@3E37{", (short) (C1499aX.Xd() ^ ((1343073864 ^ 1532339934) ^ (-190339484))), (short) (C1499aX.Xd() ^ ((269489011 ^ 1785702182) ^ (-2055203919)))));
        }
        double dFloatValue = 0.0d;
        short s2 = 0;
        while (true) {
            String strOd = C1561oA.od("\u000f{Ali", (short) (C1580rY.Xd() ^ (1865621342 ^ (-1865618872))));
            String strKd = C1561oA.Kd("\u0011+", (short) (OY.Xd() ^ (1398072026 ^ 1398063779)));
            try {
                Class<?> cls2 = Class.forName(strOd);
                Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
                field2.setAccessible(true);
                obj2 = field2.get(this);
            } catch (Throwable th2) {
                obj2 = null;
            }
            if (s2 >= ((float[]) obj2).length) {
                break;
            }
            short sXd = (short) (ZN.Xd() ^ ((1848913071 ^ 1004129689) ^ 1441632115));
            short sXd2 = (short) (ZN.Xd() ^ ((643548465 ^ 1821860139) ^ 1254927142));
            int[] iArr = new int["\"*\u001az\"".length()];
            QB qb = new QB("\"*\u001az\"");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strXd = C1561oA.Xd("'A", (short) (C1580rY.Xd() ^ ((582263037 ^ 1627860167) ^ (-1135850790))));
            try {
                Class<?> cls3 = Class.forName(str);
                Field field3 = 0 != 0 ? cls3.getField(strXd) : cls3.getDeclaredField(strXd);
                field3.setAccessible(true);
                obj4 = field3.get(this);
            } catch (Throwable th3) {
                obj4 = null;
            }
            dFloatValue += (double) (((float[]) obj4)[s2] * list.get(s2).floatValue());
            s2 = (short) (s2 + 1);
        }
        double dDoubleValue = ((Double) qy.gY(dFloatValue)).doubleValue();
        String strVd = Wg.vd("\u001f\fU\u0001y", (short) (C1633zX.Xd() ^ (1095651187 ^ (-1095637174))));
        String strKd2 = Qg.kd("hs", (short) (C1607wl.Xd() ^ (172778636 ^ 172768213)), (short) (C1607wl.Xd() ^ (295821970 ^ 295798897)));
        try {
            Class<?> cls4 = Class.forName(strVd);
            Field field4 = 0 != 0 ? cls4.getField(strKd2) : cls4.getDeclaredField(strKd2);
            field4.setAccessible(true);
            obj3 = field4.get(this);
        } catch (Throwable th4) {
            obj3 = null;
        }
        return dDoubleValue + ((double) ((Float) obj3).floatValue());
    }
}
