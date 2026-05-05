package yg;

import com.dynatrace.android.agent.Global;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class qd implements Wd {
    private final int Xd;

    public qd(short s2, short s3) {
        String strQd = Xg.qd("\u0015\u0004K\u0010\u0004", (short) (Od.Xd() ^ ((1762706411 ^ 545261089) ^ (-1234237557))), (short) (Od.Xd() ^ (1584265652 ^ (-1584247547))));
        String strWd = Jg.Wd("?I", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (-864705949))), (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951491141)));
        Integer numValueOf = Integer.valueOf((-1) - (((-1) - (s2 << 16)) & ((-1) - s3)));
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 0 != 0 ? cls.getField(strWd) : cls.getDeclaredField(strWd);
            field.setAccessible(true);
            field.set(this, numValueOf);
        } catch (Throwable th) {
        }
    }

    @Override // yg.Wd
    public YK UY(BF bf) throws Throwable {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        String strXd = ZO.xd(Global.COLON, (short) (C1607wl.Xd() ^ (762012392 ^ 761989418)), (short) (C1607wl.Xd() ^ (879614947 ^ 879608651)));
        String strUd = C1626yg.Ud("1Xq+", (short) (FB.Xd() ^ ((1968988866 ^ 70332859) ^ 1902979226)), (short) (FB.Xd() ^ (750383313 ^ 750364743)));
        try {
            Object[] objArr = new Object[1];
            String strWd = Ig.wd("z;\u0010r%", (short) (C1499aX.Xd() ^ ((422317281 ^ 1764180174) ^ (-1879781622))));
            String strOd = EO.Od("\u001bM", (short) (Od.Xd() ^ ((2136434004 ^ 1737592313) ^ (-415684532))));
            try {
                Class<?> cls = Class.forName(strWd);
                Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
                field.setAccessible(true);
                obj = field.get(this);
            } catch (Throwable th) {
                obj = null;
            }
            objArr[0] = Integer.valueOf(((Integer) obj).intValue());
            jSONObject.put(strXd, String.format(strUd, objArr));
        } catch (Exception e2) {
        }
        String strQd = C1561oA.Qd(",0,)078/\u0005%3# 0$)'\f\u001c))\u0006\u0018%&\u001c#!", (short) (C1499aX.Xd() ^ ((231489705 ^ 784325115) ^ (-594773686))));
        String string = jSONObject.toString();
        short sXd = (short) (Od.Xd() ^ ((68889004 ^ 1664776455) ^ (-1730220342)));
        short sXd2 = (short) (Od.Xd() ^ (35641816 ^ (-35650047)));
        int[] iArr = new int["'\u0016]\u001c\"".length()];
        QB qb = new QB("'\u0016]\u001c\"");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Class<?> cls2 = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[(1858276053 ^ 2076087906) ^ 360553652];
        clsArr[0] = Class.forName(C1561oA.od("G4y\r\u0010", (short) (C1633zX.Xd() ^ ((1705224761 ^ 576218963) ^ (-1207690591)))));
        clsArr[1] = Class.forName(C1561oA.Kd("$\u001c2\u001ek+!/)p\u001798060", (short) (Od.Xd() ^ ((530905944 ^ 889376624) ^ (-715534329)))));
        clsArr[1407750200 ^ 1407750202] = Class.forName(Wg.Zd("\u0017sT%k\u0010P96jQPR56\u0015", (short) (FB.Xd() ^ ((1755347990 ^ 160227931) ^ 1630323472)), (short) (FB.Xd() ^ ((1143533358 ^ 1549559173) ^ 410289328))));
        Object[] objArr2 = new Object[1189171579 ^ 1189171576];
        objArr2[0] = bf;
        objArr2[1] = strQd;
        objArr2[(750733979 ^ 1522744911) ^ 1987867862] = string;
        Constructor<?> constructor = cls2.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            return (C1549kp) constructor.newInstance(objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
