package yg;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DN extends C1549kp {
    /* JADX WARN: Illegal instructions before constructor call */
    public DN(BF bf, JSONObject jSONObject) throws Throwable {
        String strZd = Wg.Zd("{\u000ejj\u0015qG\u0013\u0005p\u0005'\u00038/\u001d", (short) (FB.Xd() ^ (Od.Xd() ^ 1207822153)), (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831088232))));
        Object[] objArr = {jSONObject};
        Method declaredMethod = Class.forName(C1561oA.Xd("6%l\u0004\u000f", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207799937)))).getDeclaredMethod(Qg.kd("cn", (short) (FB.Xd() ^ ((1958208673 ^ 1620880912) ^ 338367351)), (short) (FB.Xd() ^ ((515215446 ^ 2032718204) ^ 1738361904))), Class.forName(Wg.vd("UWK\u0011LTOM\u001c7?:88JQ;8H", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849971745)))));
        try {
            declaredMethod.setAccessible(true);
            super(bf, strZd, (String) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String Xd(JSONObject jSONObject) throws Throwable {
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        String string = jSONObject2.toString();
        while (true) {
            Class<?> cls = Class.forName(hg.Vd("iV\u001c9E", (short) (FB.Xd() ^ (724407912 ^ 724417374)), (short) (FB.Xd() ^ ((552236312 ^ 1955572167) ^ 1415940476))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (ZN.Xd() ^ (819983536 ^ 819983291));
            int[] iArr = new int["zp\u0005n:wkwo5Yyvlph".length()];
            QB qb = new QB("zp\u0005n:wkwo5Yyvlph");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {string};
            short sXd2 = (short) (C1499aX.Xd() ^ (1452066257 ^ (-1452077221)));
            int[] iArr2 = new int["dq".length()];
            QB qb2 = new QB("dq");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                int i4 = (1699826322 ^ 2105283684) ^ 405619126;
                if (((Integer) declaredMethod.invoke(null, objArr)).intValue() <= i4) {
                    return string;
                }
                int i5 = 0;
                int length = 0;
                for (int i6 = 0; i6 < jSONObject2.names().length(); i6++) {
                    String string2 = jSONObject2.get(jSONObject2.names().get(i6).toString()).toString();
                    if (string2.length() > length) {
                        length = string2.length();
                        i5 = i6;
                    }
                }
                String string3 = jSONObject2.names().get(i5).toString();
                String string4 = jSONObject2.get(string3).toString();
                Object[] objArr2 = {string};
                Method declaredMethod2 = Class.forName(C1561oA.Yd("=,s\u0013!", (short) (C1633zX.Xd() ^ ((520148616 ^ 462764685) ^ (-76909018))))).getDeclaredMethod(Jg.Wd("CL", (short) (ZN.Xd() ^ (1947242866 ^ 1947250410)), (short) (ZN.Xd() ^ ((1290355821 ^ 1053758901) ^ 1915118476))), Class.forName(Xg.qd("JBXD\u0012QGUO\u0017=_^V\\V", (short) (ZN.Xd() ^ (25803526 ^ 25811110)), (short) (ZN.Xd() ^ (1912666973 ^ 1912635405)))));
                try {
                    declaredMethod2.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue() - i4;
                    if (iIntValue >= string4.length()) {
                        jSONObject2.remove(string3);
                    } else {
                        jSONObject2.put(string3, string4.substring(0, string4.length() - iIntValue));
                    }
                    string = jSONObject2.toString();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }
}
