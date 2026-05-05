package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: yg.zo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1637zo implements Wd {
    private static final C1515eo Yd = null;
    private final JSONObject Kd;
    private final CRC32 Xd;

    static {
        C1515eo c1515eo = new C1515eo();
        String strZd = C1593ug.zd("9(o=3", (short) (C1607wl.Xd() ^ ((1482181209 ^ 2131076052) ^ 660468331)), (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831081503))));
        String strOd = C1561oA.od("U_", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134259352))));
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            field.set(null, c1515eo);
        } catch (Throwable th) {
        }
    }

    public C1637zo() {
        CRC32 crc32 = new CRC32();
        String strKd = C1561oA.Kd("iX mc", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (697043833 ^ (-1204314637)))));
        short sXd = (short) (OY.Xd() ^ (FB.Xd() ^ 1609501151));
        short sXd2 = (short) (OY.Xd() ^ (1025268028 ^ 1025258158));
        int[] iArr = new int["vK".length()];
        QB qb = new QB("vK");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            field.set(this, crc32);
        } catch (Throwable th) {
        }
        JSONObject jSONObject = new JSONObject();
        String strXd = C1561oA.Xd("\u007fn6\u0004y", (short) (C1499aX.Xd() ^ ((1900385439 ^ 576908441) ^ (-1395077824))));
        String strVd = Wg.vd("j\u0005", (short) (C1580rY.Xd() ^ (120801609 ^ (-120785765))));
        try {
            Class<?> cls2 = Class.forName(strXd);
            Field field2 = 0 != 0 ? cls2.getField(strVd) : cls2.getDeclaredField(strVd);
            field2.setAccessible(true);
            field2.set(this, jSONObject);
        } catch (Throwable th2) {
        }
    }

    public void SY(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        String strKd = Qg.kd("A.s?3", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (1448428693 ^ (-365829145)))), (short) (OY.Xd() ^ (1770830339 ^ 1770838335)));
        String strVd = hg.Vd("\u007f\u000b", (short) (FB.Xd() ^ (Od.Xd() ^ 1207823678)), (short) (FB.Xd() ^ (1541911750 ^ 1541926815)));
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        ((CRC32) obj).update(str.getBytes());
        String strUd = C1561oA.ud("ub(sg", (short) (FB.Xd() ^ (327617975 ^ 327637780)));
        String strYd = C1561oA.yd("z\b", (short) (C1633zX.Xd() ^ (739328255 ^ (-739325746))));
        try {
            Class<?> cls2 = Class.forName(strUd);
            Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
            field2.setAccessible(true);
            obj2 = field2.get(this);
        } catch (Throwable th2) {
            obj2 = null;
        }
        int i2 = ByteBuffer.wrap(C1593ug.yd((int) ((CRC32) obj2).getValue())).getInt();
        String strYd2 = C1561oA.Yd("xg/|r", (short) (FB.Xd() ^ ((1626397601 ^ 1592860803) ^ 1040286191)));
        String strQd = Xg.qd("\u0001\u000e", (short) (C1633zX.Xd() ^ (1879529797 ^ (-1879533630))), (short) (C1633zX.Xd() ^ (2027209270 ^ (-2027201094))));
        try {
            Class<?> cls3 = Class.forName(strYd2);
            Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
            field3.setAccessible(true);
            obj3 = field3.get(this);
        } catch (Throwable th3) {
            obj3 = null;
        }
        ((CRC32) obj3).reset();
        String str2 = String.format(Jg.Wd("\u0006vAG", (short) (Od.Xd() ^ (125742979 ^ (-125731834))), (short) (Od.Xd() ^ (452797177 ^ (-452815739)))), Integer.valueOf(i2));
        short sXd = (short) (FB.Xd() ^ ((417837354 ^ 2076945116) ^ 1663848605));
        short sXd2 = (short) (FB.Xd() ^ ((860102987 ^ 126380142) ^ 885793003));
        int[] iArr = new int["\u001b<E5e".length()];
        QB qb = new QB("\u001b<E5e");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
            i3++;
        }
        String str3 = new String(iArr, 0, i3);
        String strUd2 = C1626yg.Ud("x\u0010", (short) (C1580rY.Xd() ^ (373217036 ^ (-373223111))), (short) (C1580rY.Xd() ^ ((232904162 ^ 1379879514) ^ (-1608449142))));
        try {
            Class<?> cls4 = Class.forName(str3);
            Field field4 = 0 != 0 ? cls4.getField(strUd2) : cls4.getDeclaredField(strUd2);
            field4.setAccessible(true);
            obj4 = field4.get(null);
        } catch (Throwable th4) {
            obj4 = null;
        }
        if (((C1515eo) obj4).XY().containsKey(str2)) {
            String strWd = Ig.wd("\u001aWo\u001d\u0012", (short) (C1580rY.Xd() ^ (420654198 ^ (-420644809))));
            String strOd = EO.Od("~:", (short) (Od.Xd() ^ (1160081581 ^ (-1160069235))));
            try {
                Class<?> cls5 = Class.forName(strWd);
                Field field5 = 0 != 0 ? cls5.getField(strOd) : cls5.getDeclaredField(strOd);
                field5.setAccessible(true);
                obj5 = field5.get(null);
            } catch (Throwable th5) {
                obj5 = null;
            }
            UY uy = ((C1515eo) obj5).XY().get(str2);
            String strRK = uy.rK();
            short sXd3 = (short) (C1580rY.Xd() ^ (1523988433 ^ (-1524000310)));
            int[] iArr2 = new int["dQ\u0017bV".length()];
            QB qb2 = new QB("dQ\u0017bV");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i4 + xuXd2.CK(iKK2));
                i4++;
            }
            String str4 = new String(iArr2, 0, i4);
            String strZd = C1593ug.zd("\u0012,", (short) (FB.Xd() ^ ((579841339 ^ 522736914) ^ 1034408136)), (short) (FB.Xd() ^ ((85767702 ^ 1027424817) ^ 941733266)));
            try {
                Class<?> cls6 = Class.forName(str4);
                Field field6 = 0 != 0 ? cls6.getField(strZd) : cls6.getDeclaredField(strZd);
                field6.setAccessible(true);
                obj6 = field6.get(this);
            } catch (Throwable th6) {
                obj6 = null;
            }
            if (!((JSONObject) obj6).has(strRK)) {
                JSONObject jSONObject = new JSONObject();
                String strOd2 = C1561oA.od("#\u0010U!\u0015", (short) (FB.Xd() ^ (649067967 ^ 649040551)));
                String strKd2 = C1561oA.Kd("j\u0005", (short) (C1499aX.Xd() ^ (331709666 ^ (-331697263))));
                try {
                    Class<?> cls7 = Class.forName(strOd2);
                    Field field7 = 0 != 0 ? cls7.getField(strKd2) : cls7.getDeclaredField(strKd2);
                    field7.setAccessible(true);
                    obj8 = field7.get(this);
                } catch (Throwable th7) {
                    obj8 = null;
                }
                try {
                    ((JSONObject) obj8).put(strRK, jSONObject);
                } catch (JSONException e2) {
                }
            }
            try {
                String strZd2 = Wg.Zd("B1H\u0016[", (short) (C1499aX.Xd() ^ (1578674320 ^ (-1578687246))), (short) (C1499aX.Xd() ^ ((211485988 ^ 812857681) ^ (-1021844857))));
                String strXd = C1561oA.Xd("C]", (short) (C1633zX.Xd() ^ ((719267095 ^ 328277618) ^ (-961428352))));
                try {
                    Class<?> cls8 = Class.forName(strZd2);
                    Field field8 = 0 != 0 ? cls8.getField(strXd) : cls8.getDeclaredField(strXd);
                    field8.setAccessible(true);
                    obj7 = field8.get(this);
                } catch (Throwable th8) {
                    obj7 = null;
                }
                new C1635zd(this, (JSONObject) ((JSONObject) obj7).get(uy.rK())).sY(uy.wK());
            } catch (JSONException e3) {
            }
        }
    }

    @Override // yg.Wd
    public YK UY(BF bf) throws Throwable {
        Object obj;
        String strVd = Wg.vd("\u0002n8\u0004{", (short) (Od.Xd() ^ (332732474 ^ (-332741623))));
        String strKd = Qg.kd("Xp", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69956295))), (short) (C1633zX.Xd() ^ (752252867 ^ (-752230921))));
        try {
            Class<?> cls = Class.forName(strVd);
            Field field = 0 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        String string = ((JSONObject) obj).toString();
        String strVd2 = hg.Vd("%! $r\u0013!\u0011\u000e\u001e\u0012\u0017\u0015y\n\u0017\u0017s\u0006\u0013\u0014\n\u0011\u000fpK", (short) (OY.Xd() ^ (1600907484 ^ 1600896326)), (short) (OY.Xd() ^ (1214355774 ^ 1214364947)));
        Class<?> cls2 = Class.forName(C1561oA.ud("\u0016\u0003H\u0005\t", (short) (C1499aX.Xd() ^ ((1150312099 ^ 1203409801) ^ (-53130122)))));
        Class<?>[] clsArr = new Class[1448881888 ^ 1448881891];
        clsArr[0] = Class.forName(C1561oA.yd(";*q\u0007\u0004", (short) (C1607wl.Xd() ^ (1762297985 ^ 1762318695))));
        clsArr[1] = Class.forName(C1561oA.Yd("<4J6\u0004C9GA\t/QPHNH", (short) (OY.Xd() ^ ((545535812 ^ 160592171) ^ 689319646))));
        clsArr[1146267317 ^ 1146267319] = Class.forName(Xg.qd("\u0015\r#\u000f\\\u001c\u0012 \u001aa\b*)!'!", (short) (C1607wl.Xd() ^ ((2065109532 ^ 1381038664) ^ 692583008)), (short) (C1607wl.Xd() ^ (893016098 ^ 893022763))));
        Object[] objArr = new Object[43262874 ^ 43262873];
        objArr[0] = bf;
        objArr[1] = strVd2;
        objArr[(651935716 ^ 769962090) ^ 188682124] = string;
        Constructor<?> constructor = cls2.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            return (C1549kp) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
