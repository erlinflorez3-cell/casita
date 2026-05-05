package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Wl implements Wd {
    private final JSONArray Xd;

    public Wl() {
        JSONArray jSONArray = new JSONArray();
        int iXd = C1580rY.Xd() ^ (797938999 ^ (-503748508));
        short sXd = (short) (FB.Xd() ^ (415364253 ^ 415350259));
        short sXd2 = (short) (FB.Xd() ^ iXd);
        int[] iArr = new int["\u001a\tPz\u0011".length()];
        QB qb = new QB("\u001a\tPz\u0011");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strOd = C1561oA.od("\u001f*", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609524641))));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            field.set(this, jSONArray);
        } catch (Throwable th) {
        }
    }

    public void MK(String str) {
        Object obj;
        String strKd = C1561oA.Kd("H7~)?", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (1532079571 ^ (-1601894976)))));
        String strZd = Wg.Zd("t#", (short) (C1633zX.Xd() ^ (119775919 ^ (-119798903))), (short) (C1633zX.Xd() ^ ((1301787444 ^ 660574512) ^ (-1791521664))));
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        ((JSONArray) obj).put(str);
    }

    @Override // yg.Wd
    public YK UY(BF bf) throws Throwable {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        String strXd = C1561oA.Xd("U", (short) (C1580rY.Xd() ^ (1536065514 ^ (-1536057168))));
        String strVd = Wg.vd("iX J`", (short) (Od.Xd() ^ ((923173847 ^ 276874963) ^ (-663101058))));
        String strKd = Qg.kd("\u0010\u001b", (short) (C1607wl.Xd() ^ ((1376574585 ^ 884321369) ^ 1723404482)), (short) (C1607wl.Xd() ^ ((1207254954 ^ 808491694) ^ 2009442154)));
        try {
            Class<?> cls = Class.forName(strVd);
            Field field = 0 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        try {
            jSONObject.put(strXd, (JSONArray) obj);
        } catch (Exception e2) {
        }
        short sXd = (short) (C1580rY.Xd() ^ ((1583093850 ^ 1082716674) ^ (-517271955)));
        short sXd2 = (short) (C1580rY.Xd() ^ ((742233980 ^ 217461118) ^ (-550209279)));
        int[] iArr = new int["!\"!\"/.#\u001b!#\u001f)-\u0006\u0017#&\u0018\u0011\u0012o\u0010\u001e\u000e\u000b\u001b\u000f\u0014\u0012v\u0007\u0014\u0014p\u0003\u0010\u0011\u0007\u000e\f".length()];
        QB qb = new QB("!\"!\"/.#\u001b!#\u001f)-\u0006\u0017#&\u0018\u0011\u0012o\u0010\u001e\u000e\u000b\u001b\u000f\u0014\u0012v\u0007\u0014\u0014p\u0003\u0010\u0011\u0007\u000e\f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String string = jSONObject.toString();
        Class<?> cls2 = Class.forName(C1561oA.ud("\u0010|B~\u0003", (short) (C1499aX.Xd() ^ ((1952671381 ^ 1030005743) ^ (-1225248487)))));
        Class<?>[] clsArr = new Class[776956528 ^ 776956531];
        clsArr[0] = Class.forName(C1561oA.yd("aP\u0014)2", (short) (C1499aX.Xd() ^ (1804588338 ^ (-1804596348)))));
        clsArr[1] = Class.forName(C1561oA.Yd("2*@,y9/=7~%GF>D>", (short) (ZN.Xd() ^ ((193777689 ^ 1059578658) ^ 883640294))));
        clsArr[(2147147636 ^ 1438544955) ^ 709143373] = Class.forName(Xg.qd("OG]I\u0017VLZT\u001cBdc[a[", (short) (C1499aX.Xd() ^ ((1806299731 ^ 157388034) ^ (-1657281716))), (short) (C1499aX.Xd() ^ (1179737012 ^ (-1179720431)))));
        Object[] objArr = new Object[1889082381 ^ 1889082382];
        objArr[0] = bf;
        objArr[1] = str;
        objArr[(909634501 ^ 2104282891) ^ 1264264396] = string;
        Constructor<?> constructor = cls2.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            return (C1549kp) constructor.newInstance(objArr);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
