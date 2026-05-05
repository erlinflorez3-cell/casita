package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: yg.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1542jl implements Wd {
    private final Map<String, Vl> Xd;

    public C1542jl() {
        HashMap map = new HashMap();
        int iXd = C1499aX.Xd() ^ 1134236032;
        short sXd = (short) (Od.Xd() ^ ((1234905024 ^ 1263315938) ^ (-47690462)));
        short sXd2 = (short) (Od.Xd() ^ iXd);
        int[] iArr = new int["ze5na".length()];
        QB qb = new QB("ze5na");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strXd = ZO.xd("$5", (short) (C1607wl.Xd() ^ ((1009503450 ^ 1601343617) ^ 1666787193)), (short) (C1607wl.Xd() ^ ((1419945308 ^ 1341073318) ^ 458090691)));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            field.set(this, map);
        } catch (Throwable th) {
        }
    }

    JSONArray AY() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        JSONArray jSONArray = new JSONArray();
        String strKd = Qg.kd("L9~:;", (short) (Od.Xd() ^ ((1177649238 ^ 2036418254) ^ (-1062266235))), (short) (Od.Xd() ^ (1643185835 ^ (-1643209615))));
        String strVd = hg.Vd("v\u0002", (short) (C1580rY.Xd() ^ (907587429 ^ (-907598194))), (short) (C1580rY.Xd() ^ (640006826 ^ (-640016154))));
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        try {
            for (Vl vl : ((Map) obj).values()) {
                JSONObject jSONObject = new JSONObject();
                String strUd = C1561oA.ud("gWX_TYV>P[R", (short) (C1499aX.Xd() ^ ((484657677 ^ 1307842582) ^ (-1360490332))));
                String strYd = C1561oA.yd("\u0006t8at", (short) (OY.Xd() ^ (1258140614 ^ 1258141120)));
                String strYd2 = C1561oA.Yd(":F", (short) (ZN.Xd() ^ ((881457168 ^ 1574850969) ^ 1767344797)));
                try {
                    Class<?> cls2 = Class.forName(strYd);
                    Field field2 = 1 != 0 ? cls2.getField(strYd2) : cls2.getDeclaredField(strYd2);
                    field2.setAccessible(true);
                    obj2 = field2.get(vl);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                jSONObject.put(strUd, (String) obj2);
                String strQd = Xg.qd("VfbKbt`", (short) (ZN.Xd() ^ (1169536474 ^ 1169549430)), (short) (ZN.Xd() ^ (1046236899 ^ 1046233310)));
                String strWd = Jg.Wd("&q\u0018\r#", (short) (C1633zX.Xd() ^ ((125361485 ^ 540556350) ^ (-658558676))), (short) (C1633zX.Xd() ^ (1384956570 ^ (-1384965079))));
                String strXd = ZO.xd("Pq", (short) (FB.Xd() ^ (957840897 ^ 957826682)), (short) (FB.Xd() ^ ((1686118662 ^ 1773670940) ^ 221785712)));
                try {
                    Class<?> cls3 = Class.forName(strWd);
                    Field field3 = 1 != 0 ? cls3.getField(strXd) : cls3.getDeclaredField(strXd);
                    field3.setAccessible(true);
                    obj3 = field3.get(vl);
                } catch (Throwable th3) {
                    obj3 = null;
                }
                jSONObject.put(strQd, String.valueOf(((Long) obj3).longValue()));
                String strUd2 = C1626yg.Ud("p\bzeK\u001c=Z~O3w", (short) (Od.Xd() ^ (29812496 ^ (-29815302))), (short) (Od.Xd() ^ (804521635 ^ (-804531095))));
                String strWd2 = Ig.wd("Lqj.\\", (short) (FB.Xd() ^ (243536692 ^ 243548383)));
                short sXd = (short) (OY.Xd() ^ ((1023002652 ^ 1658041427) ^ 1579832202));
                int[] iArr = new int["S<".length()];
                QB qb = new QB("S<");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                try {
                    Class<?> cls4 = Class.forName(strWd2);
                    Field field4 = 1 != 0 ? cls4.getField(str) : cls4.getDeclaredField(str);
                    field4.setAccessible(true);
                    obj4 = field4.get(vl);
                } catch (Throwable th4) {
                    obj4 = null;
                }
                jSONObject.put(strUd2, String.valueOf(((Long) obj4).longValue()));
                jSONArray.put(jSONObject);
            }
        } catch (Exception e2) {
        }
        return jSONArray;
    }

    public void QY(String str, long j2, long j3) {
        Object obj;
        String strUd = C1626yg.Ud("\u001e\u0003F\u0014F", (short) (C1607wl.Xd() ^ ((862655361 ^ 2083479264) ^ 1329875583)), (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ 1849971624)));
        short sXd = (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (1855590279 ^ 449532698)));
        int[] iArr = new int["S\u000e".length()];
        QB qb = new QB("S\u000e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strUd);
            Field field = 0 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        ((Map) obj).put(str, new Vl(str, j2, j3));
    }

    @Override // yg.Wd
    public YK UY(BF bf) throws Throwable {
        Object obj;
        JSONArray jSONArrayAY = AY();
        short sXd = (short) (C1580rY.Xd() ^ (OY.Xd() ^ (1186697047 ^ (-1116785844))));
        int[] iArr = new int["n|ni{kJzhpuSdpsamMb\\\\".length()];
        QB qb = new QB("n|ni{kJzhpuSdpsamMb\\\\");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Class<?> cls = Class.forName(C1593ug.zd("_N\u0016:+", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951484307))), (short) (ZN.Xd() ^ (Od.Xd() ^ 1207806784))));
        Class<?>[] clsArr = new Class[ZN.Xd() ^ (1935950364 ^ 1089371375)];
        clsArr[0] = Class.forName(C1561oA.od("]J\u0010#&", (short) (ZN.Xd() ^ ((281203018 ^ 1458266102) ^ 1177134383))));
        short sXd2 = (short) (Od.Xd() ^ ((53606429 ^ 1246869007) ^ (-1231060381)));
        int[] iArr2 = new int["\u0016\u000e$\u0010]\u001d\u0013!\u001bb\t+*\"(\"".length()];
        QB qb2 = new QB("\u0016\u000e$\u0010]\u001d\u0013!\u001bb\t+*\"(\"");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
            i3++;
        }
        clsArr[1] = Class.forName(new String(iArr2, 0, i3));
        clsArr[(214112083 ^ 828877189) ^ 1034206932] = Integer.TYPE;
        Object[] objArr = new Object[ZN.Xd() ^ (931148928 ^ 67766899)];
        objArr[0] = bf;
        objArr[1] = str;
        objArr[ZN.Xd() ^ 864698098] = 0;
        Constructor<?> constructor = cls.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(objArr);
            String strZd = Wg.Zd("A8'Co", (short) (C1633zX.Xd() ^ (1957840151 ^ (-1957825091))), (short) (C1633zX.Xd() ^ ((1274004189 ^ 225378874) ^ (-1182849230))));
            String strXd = C1561oA.Xd("\u001d)", (short) (C1580rY.Xd() ^ (567994041 ^ (-567972948))));
            try {
                Class<?> cls2 = Class.forName(strZd);
                Field field = 1 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
                field.setAccessible(true);
                obj = field.get(bf);
            } catch (Throwable th) {
                obj = null;
            }
            ((ArrayList) obj).add(objNewInstance);
            String strVd = Wg.vd("%(#!\u0017\u0012\u0015\u001c\u001f\u001ew\n\t\u0012\u0005\f'6", (short) (C1580rY.Xd() ^ ((110133381 ^ 1743319958) ^ (-1635268893))));
            String string = jSONArrayAY.toString();
            Class<?> cls3 = Class.forName(Qg.kd("C0u26", (short) (C1499aX.Xd() ^ (872641551 ^ (-872624609))), (short) (C1499aX.Xd() ^ ((1534473793 ^ 83292059) ^ (-1602258897)))));
            Class<?>[] clsArr2 = new Class[(152978373 ^ 402655005) ^ 287196379];
            clsArr2[0] = Class.forName(hg.Vd("N;\u0001\u0014\u0017", (short) (Od.Xd() ^ ((1693628118 ^ 1690923395) ^ (-3903256))), (short) (Od.Xd() ^ ((849202755 ^ 88674550) ^ (-936690326)))));
            short sXd3 = (short) (C1499aX.Xd() ^ (1846837812 ^ (-1846851117)));
            int[] iArr3 = new int["8.B,w5)5-r\u001774*.&".length()];
            QB qb3 = new QB("8.B,w5)5-r\u001774*.&");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd3 + i4 + xuXd3.CK(iKK3));
                i4++;
            }
            clsArr2[1] = Class.forName(new String(iArr3, 0, i4));
            clsArr2[1869754622 ^ 1869754620] = Class.forName(C1561oA.yd("\u0019\u0011'\u0013` \u0016$\u001ee\f.-%+%", (short) (C1580rY.Xd() ^ (438175750 ^ (-438205049)))));
            Object[] objArr2 = new Object[1179304344 ^ 1179304347];
            objArr2[0] = bf;
            objArr2[1] = strVd;
            objArr2[2128433343 ^ 2128433341] = string;
            Constructor<?> constructor2 = cls3.getConstructor(clsArr2);
            try {
                constructor2.setAccessible(true);
                return (C1549kp) constructor2.newInstance(objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public long oY(String str) {
        Object obj;
        Object obj2;
        String strOd = EO.Od(";v\r+o", (short) (C1633zX.Xd() ^ (1085888062 ^ (-1085897221))));
        String strQd = C1561oA.Qd("\u0011\u001c", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (469654439 ^ (-712459249)))));
        try {
            Class<?> cls = Class.forName(strOd);
            Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        Vl vl = (Vl) ((Map) obj).get(str);
        if (vl == null) {
            return 0L;
        }
        String strZd = C1593ug.zd("ve-Vm", (short) (FB.Xd() ^ (196095411 ^ 196110445)), (short) (FB.Xd() ^ ((1287208557 ^ 143488375) ^ 1144269364)));
        short sXd = (short) (C1499aX.Xd() ^ (365665414 ^ (-365670098)));
        int[] iArr = new int["x\u0004".length()];
        QB qb = new QB("x\u0004");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        try {
            Class<?> cls2 = Class.forName(strZd);
            Field field2 = 1 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
            field2.setAccessible(true);
            obj2 = field2.get(vl);
        } catch (Throwable th2) {
            obj2 = null;
        }
        return ((Long) obj2).longValue();
    }

    public long pY(String str) {
        Object obj;
        Object obj2;
        String strKd = C1561oA.Kd("1 g%(", (short) (C1607wl.Xd() ^ (866825988 ^ 866817837)));
        String strZd = Wg.Zd("n#", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849964823)), (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849959323)));
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strZd) : cls.getDeclaredField(strZd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        Vl vl = (Vl) ((Map) obj).get(str);
        if (vl == null) {
            return 0L;
        }
        String strXd = C1561oA.Xd("o^&Of", (short) (OY.Xd() ^ ((341980236 ^ 1350062804) ^ 1142565404)));
        String strVd = Wg.vd("}\u0016", (short) (ZN.Xd() ^ (1574732756 ^ 1574758204)));
        try {
            Class<?> cls2 = Class.forName(strXd);
            Field field2 = 1 != 0 ? cls2.getField(strVd) : cls2.getDeclaredField(strVd);
            field2.setAccessible(true);
            obj2 = field2.get(vl);
        } catch (Throwable th2) {
            obj2 = null;
        }
        return ((Long) obj2).longValue();
    }
}
