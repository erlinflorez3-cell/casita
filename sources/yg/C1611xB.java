package yg;

import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: yg.xB */
/* JADX INFO: loaded from: classes.dex */
public class C1611xB {
    final /* synthetic */ C1588uB Kd;
    private final JSONObject Xd;

    public C1611xB(C1588uB c1588uB, JSONObject jSONObject) {
        this.Kd = c1588uB;
        String strOd = EO.Od("\u0003#\u0018\u0006~", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (1725144161 ^ (-556686198)))));
        String strQd = C1561oA.Qd("LW", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849955800))));
        try {
            Class<?> cls = Class.forName(strOd);
            Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
            field.setAccessible(true);
            field.set(this, jSONObject);
        } catch (Throwable th) {
        }
    }

    public void IY(SX sx, Object[] objArr) {
        Object obj;
        Object obj2;
        Object obj3;
        String strZd = C1593ug.zd("\u0005s;\u0007Q", (short) (Od.Xd() ^ ((1474978931 ^ 606290957) ^ (-1942556527))), (short) (Od.Xd() ^ ((1797073526 ^ 965806587) ^ (-1384921672))));
        String strOd = C1561oA.od("+6", (short) (ZN.Xd() ^ (1292590994 ^ 1292580683)));
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        if (!((JSONObject) obj).has(sx.toString())) {
            JSONArray jSONArray = new JSONArray();
            String strKd = C1561oA.Kd("4#j6\u0001", (short) (C1633zX.Xd() ^ ((1945804089 ^ 871785624) ^ (-1074580348))));
            String strZd2 = Wg.Zd("{\f", (short) (C1607wl.Xd() ^ (2101210724 ^ 2101196664)), (short) (C1607wl.Xd() ^ ((272163605 ^ 2043592195) ^ 1777733690)));
            try {
                Class<?> cls2 = Class.forName(strKd);
                Field field2 = 0 != 0 ? cls2.getField(strZd2) : cls2.getDeclaredField(strZd2);
                field2.setAccessible(true);
                obj3 = field2.get(this);
            } catch (Throwable th2) {
                obj3 = null;
            }
            try {
                ((JSONObject) obj3).put(sx.toString(), jSONArray);
            } catch (JSONException e2) {
            }
        }
        if (objArr != null) {
            JSONArray jSONArray2 = null;
            String strXd = C1561oA.Xd("VE\rX#", (short) (C1499aX.Xd() ^ (1645925217 ^ (-1645927056))));
            String strVd = Wg.vd("\u0013 ", (short) (C1607wl.Xd() ^ ((333999306 ^ 1611944043) ^ 1945919256)));
            try {
                Class<?> cls3 = Class.forName(strXd);
                Field field3 = 0 != 0 ? cls3.getField(strVd) : cls3.getDeclaredField(strVd);
                field3.setAccessible(true);
                obj2 = field3.get(this);
            } catch (Throwable th3) {
                obj2 = null;
            }
            try {
                jSONArray2 = (JSONArray) ((JSONObject) obj2).get(sx.toString());
            } catch (JSONException e3) {
            }
            for (Object obj4 : objArr) {
                jSONArray2.put(obj4);
            }
        }
    }
}
