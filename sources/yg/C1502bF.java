package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: yg.bF */
/* JADX INFO: loaded from: classes2.dex */
public class C1502bF implements Wd {
    private final JSONObject Xd;

    public C1502bF() {
        JSONObject jSONObject = new JSONObject();
        String strKd = C1561oA.Kd("!\u0010W\rq", (short) (C1580rY.Xd() ^ ((1862462745 ^ 1914398567) ^ (-488241509))));
        String strZd = Wg.Zd("$q", (short) (ZN.Xd() ^ (FB.Xd() ^ (255760857 ^ 1355911780))), (short) (ZN.Xd() ^ (ZN.Xd() ^ (1532463802 ^ 1759347208))));
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            field.set(this, jSONObject);
        } catch (Throwable th) {
        }
    }

    public C1502bF(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e2) {
            jSONObject = new JSONObject();
        }
        String strXd = C1561oA.Xd("m\\$Y>", (short) (C1580rY.Xd() ^ (1908161530 ^ (-1908165962))));
        String strVd = Wg.vd("`k", (short) (C1499aX.Xd() ^ ((2095041643 ^ 585498956) ^ (-1580840333))));
        try {
            Class<?> cls = Class.forName(strXd);
            Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
            field.setAccessible(true);
            field.set(this, jSONObject);
        } catch (Throwable th) {
        }
    }

    @Override // yg.Wd
    public YK UY(BF bf) throws Throwable {
        Object obj;
        String strWd = Jg.Wd("\u00130\u001c,5", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (938280809 ^ (-1136403919)))), (short) (OY.Xd() ^ (Od.Xd() ^ (801821159 ^ 1748466676))));
        String strXd = ZO.xd("\u0014\u0006", (short) (C1499aX.Xd() ^ (652264416 ^ (-652262153))), (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849950436))));
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        String string = ((JSONObject) obj).toString();
        String strUd = C1626yg.Ud("\u0014);o/DJycWrbUx@.z^c,'\u0014xr", (short) (C1607wl.Xd() ^ ((1059372179 ^ 1879876138) ^ 1328043029)), (short) (C1607wl.Xd() ^ ((2005974491 ^ 892964684) ^ 1118376963)));
        Class<?> cls2 = Class.forName(Ig.wd("L\u0002\u001a;`", (short) (OY.Xd() ^ (44945575 ^ 44935844))));
        Class<?>[] clsArr = new Class[(70301374 ^ 1063087018) ^ 997055767];
        clsArr[0] = Class.forName(EO.Od("W\u000f#\u001b'", (short) (C1499aX.Xd() ^ ((431955676 ^ 2121906301) ^ (-1741087743)))));
        clsArr[1] = Class.forName(C1561oA.Qd("\u0014\n\u001e\bS\u0011\u0005\u0011\tNr\u0013\u0010\u0006\n\u0002", (short) (ZN.Xd() ^ ((184459117 ^ 1742480779) ^ 1830989543))));
        clsArr[(606952185 ^ 1147643278) ^ 1615527797] = Class.forName(C1593ug.zd("\u001a\u0012(\u0014a!\u0017%\u001ff\r/.&,&", (short) (C1607wl.Xd() ^ (2074343969 ^ 2074317515)), (short) (C1607wl.Xd() ^ (1896269447 ^ 1896277887))));
        Object[] objArr = new Object[(201019651 ^ 39439603) ^ 161652211];
        objArr[0] = bf;
        objArr[1] = strUd;
        objArr[(1679992794 ^ 1284168644) ^ 682130460] = string;
        Constructor<?> constructor = cls2.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            return (C1549kp) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public String toString() {
        Object obj;
        String strOd = C1561oA.od("WD\n= ", (short) (FB.Xd() ^ (553001738 ^ 552993862)));
        String strKd = C1561oA.Kd("O\\", (short) (C1580rY.Xd() ^ (1385159107 ^ (-1385167506))));
        try {
            Class<?> cls = Class.forName(strOd);
            Field field = 0 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        return ((JSONObject) obj).toString();
    }

    public C1588uB xK(YF yf) {
        Object obj;
        Object obj2;
        Object obj3;
        String strKd = Qg.kd("9&k\u001f\u0002", (short) (Od.Xd() ^ (268181882 ^ (-268203329))), (short) (Od.Xd() ^ ((2065788705 ^ 1282504822) ^ (-928009880))));
        String strVd = hg.Vd("R]", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (1553413211 ^ 520885835))), (short) (C1633zX.Xd() ^ (1190165684 ^ (-1190140553))));
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        if (!((JSONObject) obj).has(yf.toString())) {
            JSONObject jSONObject = new JSONObject();
            String strUd = C1561oA.ud(".\u001b`\u0014v", (short) (OY.Xd() ^ ((802822000 ^ 1850980159) ^ 1099536462)));
            String strYd = C1561oA.yd("z\u0006", (short) (C1580rY.Xd() ^ ((679472438 ^ 898230767) ^ (-502690333))));
            try {
                Class<?> cls2 = Class.forName(strUd);
                Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                field2.setAccessible(true);
                obj3 = field2.get(this);
            } catch (Throwable th2) {
                obj3 = null;
            }
            try {
                ((JSONObject) obj3).put(yf.toString(), jSONObject);
            } catch (JSONException e2) {
            }
        }
        try {
            String strYd2 = C1561oA.Yd("E4{1\u0016", (short) (C1499aX.Xd() ^ ((1593229381 ^ 629613162) ^ (-2071048211))));
            short sXd = (short) (C1580rY.Xd() ^ (365037821 ^ (-365043381)));
            short sXd2 = (short) (C1580rY.Xd() ^ ((186693501 ^ 1784152770) ^ (-1635315240)));
            int[] iArr = new int["\u000e\u001b".length()];
            QB qb = new QB("\u000e\u001b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls3 = Class.forName(strYd2);
                Field field3 = 0 != 0 ? cls3.getField(str) : cls3.getDeclaredField(str);
                field3.setAccessible(true);
                obj2 = field3.get(this);
            } catch (Throwable th3) {
                obj2 = null;
            }
            return new C1588uB(this, (JSONObject) ((JSONObject) obj2).get(yf.toString()));
        } catch (JSONException e3) {
            return null;
        }
    }
}
