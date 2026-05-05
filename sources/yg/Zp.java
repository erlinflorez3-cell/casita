package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Zp implements Wd {
    private String Xd;

    @Override // yg.Wd
    public YK UY(BF bf) throws Throwable {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        String strWd = Jg.Wd("\u0006", (short) (C1580rY.Xd() ^ (652186639 ^ (-652197575))), (short) (C1580rY.Xd() ^ (629568597 ^ (-629551025))));
        String strXd = ZO.xd("sG8~a", (short) (OY.Xd() ^ (1329437305 ^ 1329438543)), (short) (OY.Xd() ^ (2002673548 ^ 2002664709)));
        short sXd = (short) (C1499aX.Xd() ^ ((456353239 ^ 231718429) ^ (-385674935)));
        short sXd2 = (short) (C1499aX.Xd() ^ ((1647959007 ^ 134638967) ^ (-1782551032)));
        int[] iArr = new int[".\u0014".length()];
        QB qb = new QB(".\u0014");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strXd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        try {
            jSONObject.put(strWd, (String) obj);
        } catch (Exception e2) {
        }
        String strWd2 = Ig.wd("GeU=G5Jg#^}rx\u0001\u001e8q\u0003\u0010xP\t\u0005\u001ccy\u0012Qz", (short) (OY.Xd() ^ (2072073793 ^ 2072072477)));
        String string = jSONObject.toString();
        Class<?> cls2 = Class.forName(EO.Od("Tq&G\\", (short) (Od.Xd() ^ (300164179 ^ (-300173244)))));
        Class<?>[] clsArr = new Class[(709858630 ^ 805003121) ^ 95734324];
        clsArr[0] = Class.forName(C1561oA.Qd(":'l\u007f\u0003", (short) (FB.Xd() ^ ((1946743252 ^ 699497556) ^ 1572462754))));
        short sXd3 = (short) (FB.Xd() ^ (1092209603 ^ 1092211900));
        short sXd4 = (short) (FB.Xd() ^ (413422903 ^ 413417625));
        int[] iArr2 = new int["-%;'t4*82y BA9?9".length()];
        QB qb2 = new QB("-%;'t4*82y BA9?9");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
            i3++;
        }
        clsArr[1] = Class.forName(new String(iArr2, 0, i3));
        clsArr[(402661674 ^ 1749369092) ^ 1883594796] = Class.forName(C1561oA.od("* 4\u001ei'\u001b'\u001fd\t)&\u001c \u0018", (short) (C1607wl.Xd() ^ (1029717676 ^ 1029731092))));
        Object[] objArr = new Object[290856921 ^ 290856922];
        objArr[0] = bf;
        objArr[1] = strWd2;
        objArr[(909986370 ^ 154245837) ^ 1057804429] = string;
        Constructor<?> constructor = cls2.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            return (C1549kp) constructor.newInstance(objArr);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void jK(String str) {
        String strYd = C1561oA.Yd("\u0019\bO|\u0014", (short) (OY.Xd() ^ ((225716503 ^ 379971192) ^ 466738350)));
        String strQd = Xg.qd("2?", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831080419))), (short) (ZN.Xd() ^ ((1756960184 ^ 1860682189) ^ 106859471)));
        try {
            Class<?> cls = Class.forName(strYd);
            Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
            field.setAccessible(true);
            field.set(this, str);
        } catch (Throwable th) {
        }
    }
}
