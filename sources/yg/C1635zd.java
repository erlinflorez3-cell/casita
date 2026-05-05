package yg;

import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: yg.zd */
/* JADX INFO: loaded from: classes.dex */
public class C1635zd {
    final /* synthetic */ C1637zo Kd;
    private final JSONObject Xd;

    public C1635zd(C1637zo c1637zo, JSONObject jSONObject) {
        this.Kd = c1637zo;
        String strWd = Ig.wd("6_\u00128h", (short) (C1633zX.Xd() ^ ((349838076 ^ 248077574) ^ (-437453496))));
        String strOd = EO.Od("6k", (short) (ZN.Xd() ^ (1717343279 ^ 1717341339)));
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            field.set(this, jSONObject);
        } catch (Throwable th) {
        }
    }

    public void sY(String str) {
        Object obj;
        Object obj2;
        String strQd = C1561oA.Qd("p]#nW", (short) (FB.Xd() ^ (OY.Xd() ^ 69929724)));
        String strZd = C1593ug.zd("\u000b\u0018", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (1183429477 ^ (-853051501)))), (short) (OY.Xd() ^ (OY.Xd() ^ 69929877)));
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        if (((JSONObject) obj).has(str)) {
            return;
        }
        short sXd = (short) (C1499aX.Xd() ^ ((1464666014 ^ 1548932140) ^ (-186641106)));
        int[] iArr = new int["\u001d\nO\u001b\u0004".length()];
        QB qb = new QB("\u001d\nO\u001b\u0004");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        String strKd = C1561oA.Kd("_l", (short) (Od.Xd() ^ ((2029214931 ^ 1926989828) ^ (-170451957))));
        try {
            Class<?> cls2 = Class.forName(str2);
            Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
            field2.setAccessible(true);
            obj2 = field2.get(this);
        } catch (Throwable th2) {
            obj2 = null;
        }
        try {
            ((JSONObject) obj2).put(str, new JSONObject());
        } catch (JSONException e2) {
        }
    }
}
