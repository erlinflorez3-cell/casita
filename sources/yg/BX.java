package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class BX implements Wd {
    private final JSONObject Xd;

    public BX() {
        JSONObject jSONObject = new JSONObject();
        String strOd = C1561oA.od("3 ex\u000e", (short) (Od.Xd() ^ (FB.Xd() ^ (1482035087 ^ (-129580452)))));
        short sXd = (short) (ZN.Xd() ^ ((283104547 ^ 576714792) ^ 847259270));
        int[] iArr = new int["*7".length()];
        QB qb = new QB("*7");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strOd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            field.set(this, jSONObject);
        } catch (Throwable th) {
        }
    }

    public Ao PX(EnumC1527hN enumC1527hN) {
        Object obj;
        Object obj2;
        Object obj3;
        String strZd = Wg.Zd("(f_\"h", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864701623)), (short) (ZN.Xd() ^ (Od.Xd() ^ 1207797162)));
        String strXd = C1561oA.Xd("+8", (short) (OY.Xd() ^ (FB.Xd() ^ 1609505548)));
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        if (!((JSONObject) obj).has(enumC1527hN.toString())) {
            JSONObject jSONObject = new JSONObject();
            String strVd = Wg.vd("%\u0012Wj\u007f", (short) (FB.Xd() ^ (330508363 ^ 330504928)));
            String strKd = Qg.kd("_j", (short) (C1580rY.Xd() ^ ((82810827 ^ 270891282) ^ (-348835362))), (short) (C1580rY.Xd() ^ ((426434857 ^ 822783909) ^ (-677395335))));
            try {
                Class<?> cls2 = Class.forName(strVd);
                Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
                field2.setAccessible(true);
                obj3 = field2.get(this);
            } catch (Throwable th2) {
                obj3 = null;
            }
            try {
                ((JSONObject) obj3).put(enumC1527hN.toString(), jSONObject);
            } catch (JSONException e2) {
            }
        }
        try {
            String strVd2 = hg.Vd("I6{\u000f$", (short) (ZN.Xd() ^ ((1103044858 ^ 480174484) ^ 1562492641)), (short) (ZN.Xd() ^ (1166514539 ^ 1166510071)));
            String strUd = C1561oA.ud("T_", (short) (FB.Xd() ^ ((364573379 ^ 1680954580) ^ 1904970328)));
            try {
                Class<?> cls3 = Class.forName(strVd2);
                Field field3 = 0 != 0 ? cls3.getField(strUd) : cls3.getDeclaredField(strUd);
                field3.setAccessible(true);
                obj2 = field3.get(this);
            } catch (Throwable th3) {
                obj2 = null;
            }
            return new Ao(this, (JSONObject) ((JSONObject) obj2).get(enumC1527hN.toString()));
        } catch (JSONException e3) {
            return null;
        }
    }

    @Override // yg.Wd
    public YK UY(BF bf) throws Throwable {
        Object obj;
        String strYd = C1561oA.yd("iX\u001c1D", (short) (OY.Xd() ^ (FB.Xd() ^ 1609505837)));
        String strYd2 = C1561oA.Yd("q~", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (831812864 ^ 1170551935))));
        try {
            Class<?> cls = Class.forName(strYd);
            Field field = 0 != 0 ? cls.getField(strYd2) : cls.getDeclaredField(strYd2);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        String string = ((JSONObject) obj).toString();
        String strQd = Xg.qd("\u0005\u000b\u0007w\n\u0019\u001by\u000e\u001d \u0018!!", (short) (C1499aX.Xd() ^ (1974069070 ^ (-1974069090))), (short) (C1499aX.Xd() ^ ((471539804 ^ 1208534870) ^ (-1410566594))));
        Class<?> cls2 = Class.forName(Jg.Wd("\u0006>!!f", (short) (OY.Xd() ^ (1189382726 ^ 1189398744)), (short) (OY.Xd() ^ ((549481624 ^ 1960507653) ^ 1411038462))));
        Class<?>[] clsArr = new Class[(2114307247 ^ 1574194879) ^ 600934931];
        clsArr[0] = Class.forName(ZO.xd("\\C\u0016=Y", (short) (C1633zX.Xd() ^ (1020975838 ^ (-1020968460))), (short) (C1633zX.Xd() ^ (157606082 ^ (-157589777)))));
        clsArr[1] = Class.forName(C1626yg.Ud("YN\"B3j?}xD\u0011C$Jr\u001c", (short) (OY.Xd() ^ (87426863 ^ 87440280)), (short) (OY.Xd() ^ ((1822757940 ^ 1922790383) ^ 507394097))));
        clsArr[1938229842 ^ 1938229840] = Class.forName(Ig.wd("Qz<L\u0007\t_J\t`\u0006G\u0017\u0002\u0001Y", (short) (C1499aX.Xd() ^ ((408048972 ^ 956378023) ^ (-559092651)))));
        Object[] objArr = new Object[(1054891042 ^ 1310472413) ^ 1895589116];
        objArr[0] = bf;
        objArr[1] = strQd;
        objArr[(1693116526 ^ 1589039194) ^ 979122230] = string;
        Constructor<?> constructor = cls2.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            return (C1549kp) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
