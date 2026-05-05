package yg;

import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Ao {
    final /* synthetic */ BX Kd;
    private final JSONObject Xd;

    public Ao(BX bx, JSONObject jSONObject) {
        this.Kd = bx;
        String strYd = C1561oA.yd(".\u001d`t ", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (943475408 ^ (-1450728987)))));
        String strYd2 = C1561oA.Yd("Yf", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (1251933557 ^ (-224609835)))));
        try {
            Class<?> cls = Class.forName(strYd);
            Field field = 0 != 0 ? cls.getField(strYd2) : cls.getDeclaredField(strYd2);
            field.setAccessible(true);
            field.set(this, jSONObject);
        } catch (Throwable th) {
        }
    }

    public void SX(EnumC1599vd enumC1599vd, Object[] objArr) {
        Object obj;
        Object obj2;
        Object obj3;
        String strQd = C1561oA.Qd("*\u0017\\n\u001c", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (892164167 ^ 77885693))));
        String strZd = C1593ug.zd("!.", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (1021645577 ^ 2138970548))), (short) (C1633zX.Xd() ^ (1168563029 ^ (-1168542032))));
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        if (((JSONObject) obj).has(enumC1599vd.toString())) {
            return;
        }
        try {
            if (objArr == null) {
                String strOd = C1561oA.od(";(m\u007f-", (short) (OY.Xd() ^ (1086353612 ^ 1086331001)));
                String strKd = C1561oA.Kd("\u001c)", (short) (C1607wl.Xd() ^ (1146301079 ^ 1146300143)));
                try {
                    Class<?> cls2 = Class.forName(strOd);
                    Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
                    field2.setAccessible(true);
                    obj3 = field2.get(this);
                } catch (Throwable th2) {
                    obj3 = null;
                }
                ((JSONObject) obj3).put(enumC1599vd.toString(), new JSONArray());
                return;
            }
            JSONArray jSONArray = new JSONArray();
            for (Object obj4 : objArr) {
                jSONArray.put(obj4);
            }
            String strZd2 = Wg.Zd("\u001b\u001awa\u001f", (short) (FB.Xd() ^ (896000549 ^ 895984535)), (short) (FB.Xd() ^ (1632462026 ^ 1632455808)));
            String strXd = C1561oA.Xd("p}", (short) (ZN.Xd() ^ ((104790923 ^ 1998789281) ^ 1897767489)));
            try {
                Class<?> cls3 = Class.forName(strZd2);
                Field field3 = 0 != 0 ? cls3.getField(strXd) : cls3.getDeclaredField(strXd);
                field3.setAccessible(true);
                obj2 = field3.get(this);
            } catch (Throwable th3) {
                obj2 = null;
            }
            ((JSONObject) obj2).put(enumC1599vd.toString(), jSONArray);
        } catch (JSONException e2) {
        }
    }

    public void sX(EnumC1599vd enumC1599vd, Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        int iXd = C1499aX.Xd() ^ (1417690669 ^ 387661195);
        short sXd = (short) (C1633zX.Xd() ^ (1408983918 ^ (-1408981888)));
        short sXd2 = (short) (C1633zX.Xd() ^ iXd);
        int[] iArr = new int["VE\r!P".length()];
        QB qb = new QB("VE\r!P");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        int iXd2 = Od.Xd() ^ (765612691 ^ 1784661417);
        int iXd3 = ZN.Xd() ^ (67921612 ^ 931544011);
        short sXd3 = (short) (ZN.Xd() ^ iXd2);
        short sXd4 = (short) (ZN.Xd() ^ iXd3);
        int[] iArr2 = new int["s?".length()];
        QB qb2 = new QB("s?");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
            field.setAccessible(true);
            obj2 = field.get(this);
        } catch (Throwable th) {
            obj2 = null;
        }
        if (((JSONObject) obj2).has(enumC1599vd.toString())) {
            return;
        }
        try {
            if (obj == null) {
                String strXd = ZO.xd("A#.\u00140", (short) (OY.Xd() ^ ((8743334 ^ 724687029) ^ 733256704)), (short) (OY.Xd() ^ (668931775 ^ 668926885)));
                String strUd = C1626yg.Ud("\u0018\u001b", (short) (OY.Xd() ^ (1291109851 ^ 1291123980)), (short) (OY.Xd() ^ (726624630 ^ 726598256)));
                try {
                    Class<?> cls2 = Class.forName(strXd);
                    Field field2 = 0 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
                    field2.setAccessible(true);
                    obj4 = field2.get(this);
                } catch (Throwable th2) {
                    obj4 = null;
                }
                ((JSONObject) obj4).put(enumC1599vd.toString(), new JSONObject());
            } else {
                String strWd = Ig.wd("K\u0002\u0018\u0012U", (short) (ZN.Xd() ^ ((1947387439 ^ 1396200202) ^ 657128945)));
                short sXd5 = (short) (C1633zX.Xd() ^ ((1299968748 ^ 282702502) ^ (-1570913778)));
                int[] iArr3 = new int["S6".length()];
                QB qb3 = new QB("S6");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + i4)) + xuXd3.CK(iKK3));
                    i4++;
                }
                String str3 = new String(iArr3, 0, i4);
                try {
                    Class<?> cls3 = Class.forName(strWd);
                    Field field3 = 0 != 0 ? cls3.getField(str3) : cls3.getDeclaredField(str3);
                    field3.setAccessible(true);
                    obj3 = field3.get(this);
                } catch (Throwable th3) {
                    obj3 = null;
                }
                ((JSONObject) obj3).put(enumC1599vd.toString(), obj);
            }
        } catch (JSONException e2) {
        }
    }
}
