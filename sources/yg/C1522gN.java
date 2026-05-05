package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: yg.gN */
/* JADX INFO: loaded from: classes.dex */
public class C1522gN implements Wd {
    private final List<GN> Xd = new ArrayList();

    @Override // yg.Wd
    public YK UY(BF bf) throws Throwable {
        JSONArray jSONArray = new JSONArray();
        try {
            for (GN gn : this.Xd) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(EO.Od("4\u000e\u001b,e", (short) (C1580rY.Xd() ^ (1605763943 ^ (-1605764612)))), gn.Xd);
                jSONObject.put(C1561oA.Qd("6.?3", (short) (OY.Xd() ^ (1032452755 ^ 1032434241))), gn.Kd);
                jSONArray.put(jSONObject);
            }
        } catch (Exception e2) {
        }
        String strZd = C1593ug.zd("\tz}\u0007}\u0005\u0004g\u0002\u0015\u000b\t\u0018", (short) (FB.Xd() ^ (77656026 ^ 77657613)), (short) (FB.Xd() ^ (1151109264 ^ 1151114995)));
        String string = jSONArray.toString();
        Class<?> cls = Class.forName(C1561oA.od("\tu;w{", (short) (C1607wl.Xd() ^ (302644743 ^ 302619785))));
        Class<?>[] clsArr = new Class[(344223679 ^ 374878009) ^ 47988869];
        short sXd = (short) (C1499aX.Xd() ^ ((2025520935 ^ 230814247) ^ (-1971019467)));
        int[] iArr = new int["\u0001o7LQ".length()];
        QB qb = new QB("\u0001o7LQ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        short sXd2 = (short) (C1499aX.Xd() ^ (1639258568 ^ (-1639281950)));
        short sXd3 = (short) (C1499aX.Xd() ^ ((982190059 ^ 277367641) ^ (-704870610)));
        int[] iArr2 = new int["\rxsd\u0017\u001at\bv\"\r\u0014\u0018s>-".length()];
        QB qb2 = new QB("\rxsd\u0017\u001at\bv\"\r\u0014\u0018s>-");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[1] = Class.forName(new String(iArr2, 0, i3));
        clsArr[(764665591 ^ 2122637295) ^ 1394016538] = Class.forName(C1561oA.Xd("&\u001e4 m-#1+r\u0019;:282", (short) (OY.Xd() ^ ((2117878337 ^ 561412191) ^ 1598690714))));
        Object[] objArr = new Object[55811294 ^ 55811293];
        objArr[0] = bf;
        objArr[1] = strZd;
        objArr[(911789619 ^ 1293495255) ^ 2067916262] = string;
        Constructor<?> constructor = cls.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            return (C1549kp) constructor.newInstance(objArr);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void YY(long j2, String str) {
        this.Xd.add(new GN(this, j2, str));
    }
}
