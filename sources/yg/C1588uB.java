package yg;

import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: yg.uB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1588uB {
    final /* synthetic */ C1502bF Kd;
    private final JSONObject Xd;

    public C1588uB(C1502bF c1502bF, JSONObject jSONObject) {
        this.Kd = c1502bF;
        short sXd = (short) (ZN.Xd() ^ ((744575324 ^ 1349676933) ^ 2081651849));
        int[] iArr = new int["C0u<\b".length()];
        QB qb = new QB("C0u<\b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strKd = C1561oA.Kd("kx", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (899168704 ^ (-101857211)))));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
            field.setAccessible(true);
            field.set(this, jSONObject);
        } catch (Throwable th) {
        }
    }

    public C1611xB cY(EnumC1540jY enumC1540jY) {
        Object obj;
        Object obj2;
        Object obj3;
        String strZd = Wg.Zd("\n`\b0e", (short) (ZN.Xd() ^ (OY.Xd() ^ (1780688543 ^ 1846044293))), (short) (ZN.Xd() ^ (ZN.Xd() ^ 864698523)));
        String strXd = C1561oA.Xd("w\u0005", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (1918154829 ^ (-101034404)))));
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        if (!((JSONObject) obj).has(enumC1540jY.toString())) {
            JSONObject jSONObject = new JSONObject();
            String strVd = Wg.vd("ud,tB", (short) (ZN.Xd() ^ (1974159888 ^ 1974164167)));
            short sXd = (short) (ZN.Xd() ^ ((38143055 ^ 2092188885) ^ 2129792158));
            short sXd2 = (short) (ZN.Xd() ^ (193649252 ^ 193648075));
            int[] iArr = new int["?J".length()];
            QB qb = new QB("?J");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls2 = Class.forName(strVd);
                Field field2 = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                field2.setAccessible(true);
                obj3 = field2.get(this);
            } catch (Throwable th2) {
                obj3 = null;
            }
            try {
                ((JSONObject) obj3).put(enumC1540jY.toString(), jSONObject);
            } catch (JSONException e2) {
            }
        }
        JSONObject jSONObject2 = null;
        String strVd2 = hg.Vd("VC\tO\u001b", (short) (C1499aX.Xd() ^ (433669195 ^ (-433665837))), (short) (C1499aX.Xd() ^ (471339425 ^ (-471335599))));
        String strUd = C1561oA.ud("ep", (short) (C1633zX.Xd() ^ ((61047848 ^ 1718515452) ^ (-1707971981))));
        try {
            Class<?> cls3 = Class.forName(strVd2);
            Field field3 = 0 != 0 ? cls3.getField(strUd) : cls3.getDeclaredField(strUd);
            field3.setAccessible(true);
            obj2 = field3.get(this);
        } catch (Throwable th3) {
            obj2 = null;
        }
        try {
            jSONObject2 = (JSONObject) ((JSONObject) obj2).get(enumC1540jY.toString());
        } catch (JSONException e3) {
        }
        return new C1611xB(this, jSONObject2);
    }
}
