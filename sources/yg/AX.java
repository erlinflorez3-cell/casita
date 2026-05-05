package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AX implements Wd {
    private final List<C1628yp> Xd;

    public AX() {
        ArrayList arrayList = new ArrayList();
        short sXd = (short) (C1633zX.Xd() ^ (1835240027 ^ (-1835248306)));
        short sXd2 = (short) (C1633zX.Xd() ^ (1982062792 ^ (-1982053533)));
        int[] iArr = new int["bO\u0015'=".length()];
        QB qb = new QB("bO\u0015'=");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd3 = (short) (OY.Xd() ^ ((456797686 ^ 1513431769) ^ 1091533559));
        short sXd4 = (short) (OY.Xd() ^ ((1165177383 ^ 1093007010) ^ 72795922));
        int[] iArr2 = new int["\u0016!".length()];
        QB qb2 = new QB("\u0016!");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(str2) : cls.getDeclaredField(str2);
            field.setAccessible(true);
            field.set(this, arrayList);
        } catch (Throwable th) {
        }
    }

    public JSONArray CX() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        JSONArray jSONArray = new JSONArray();
        String strYd = C1561oA.Yd("L;\u0003\u0017/", (short) (C1633zX.Xd() ^ (1979508710 ^ (-1979509327))));
        String strQd = Xg.qd("MZ", (short) (FB.Xd() ^ ((670457538 ^ 848009637) ^ 360573295)), (short) (FB.Xd() ^ (965437903 ^ 965414222)));
        try {
            Class<?> cls = Class.forName(strYd);
            Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        try {
            for (C1628yp c1628yp : (List) obj) {
                JSONObject jSONObject = new JSONObject();
                String strWd = Jg.Wd("|\u0011%@2L\\y(G2", (short) (OY.Xd() ^ ((1325592029 ^ 1154276589) ^ 198059403)), (short) (OY.Xd() ^ (1211408978 ^ 1211428127)));
                String strXd = ZO.xd("h\u0010O|\u001d", (short) (ZN.Xd() ^ (525554715 ^ 525564970)), (short) (ZN.Xd() ^ ((1144322373 ^ 527423116) ^ 1532693357)));
                String strUd = C1626yg.Ud("n\u0003", (short) (C1580rY.Xd() ^ (260631376 ^ (-260618109))), (short) (C1580rY.Xd() ^ (1927070668 ^ (-1927078643))));
                try {
                    Class<?> cls2 = Class.forName(strXd);
                    Field field2 = 1 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
                    field2.setAccessible(true);
                    obj2 = field2.get(c1628yp);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                jSONObject.put(strWd, (String) obj2);
                short sXd = (short) (ZN.Xd() ^ ((794899311 ^ 1191676803) ^ 1751574705));
                int[] iArr = new int["mD\ri\u0018s~".length()];
                QB qb = new QB("mD\ri\u0018s~");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strOd = EO.Od("C^UFo", (short) (C1499aX.Xd() ^ (1132856212 ^ (-1132879894))));
                String strQd2 = C1561oA.Qd("^i", (short) (ZN.Xd() ^ (550472367 ^ 550486220)));
                try {
                    Class<?> cls3 = Class.forName(strOd);
                    Field field3 = 1 != 0 ? cls3.getField(strQd2) : cls3.getDeclaredField(strQd2);
                    field3.setAccessible(true);
                    obj3 = field3.get(c1628yp);
                } catch (Throwable th3) {
                    obj3 = null;
                }
                jSONObject.put(str, String.valueOf(((Long) obj3).longValue()));
                String strZd = C1593ug.zd("\u0012\u0007\u0015\u0011\u000f\u000f\u001e t\u000f\"\u0018", (short) (Od.Xd() ^ ((2059454361 ^ 1441876836) ^ (-791805352))), (short) (Od.Xd() ^ (176651697 ^ (-176633512))));
                String strOd2 = C1561oA.od("wd*tj", (short) (ZN.Xd() ^ ((1106808215 ^ 1660730165) ^ 587482165)));
                String strKd = C1561oA.Kd("\u001c6", (short) (ZN.Xd() ^ ((150508462 ^ 395968870) ^ 526559907)));
                try {
                    Class<?> cls4 = Class.forName(strOd2);
                    Field field4 = 1 != 0 ? cls4.getField(strKd) : cls4.getDeclaredField(strKd);
                    field4.setAccessible(true);
                    obj4 = field4.get(c1628yp);
                } catch (Throwable th4) {
                    obj4 = null;
                }
                jSONObject.put(strZd, String.valueOf(((Long) obj4).longValue()));
                short sXd2 = (short) (Od.Xd() ^ (1960393258 ^ (-1960384133)));
                short sXd3 = (short) (Od.Xd() ^ ((6828973 ^ 1265861787) ^ (-1260110011)));
                int[] iArr2 = new int["U\b+K".length()];
                QB qb2 = new QB("U\b+K");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                String strXd2 = C1561oA.Xd("\u0011\u007fG\u0014\f", (short) (C1580rY.Xd() ^ ((80740484 ^ 1998924885) ^ (-1945454168))));
                String strVd = Wg.vd("IU", (short) (FB.Xd() ^ (666857428 ^ 666852144)));
                try {
                    Class<?> cls5 = Class.forName(strXd2);
                    Field field5 = 1 != 0 ? cls5.getField(strVd) : cls5.getDeclaredField(strVd);
                    field5.setAccessible(true);
                    obj5 = field5.get(c1628yp);
                } catch (Throwable th5) {
                    obj5 = null;
                }
                jSONObject.put(str2, (String) obj5);
                String strKd2 = Qg.kd("UHQC>P'?O=C", (short) (C1580rY.Xd() ^ (1734813219 ^ (-1734824559))), (short) (C1580rY.Xd() ^ (556673410 ^ (-556676038))));
                short sXd4 = (short) (C1607wl.Xd() ^ (258505486 ^ 258487169));
                short sXd5 = (short) (C1607wl.Xd() ^ (388634029 ^ 388650557));
                int[] iArr3 = new int["\u0001m3}s".length()];
                QB qb3 = new QB("\u0001m3}s");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                    i4++;
                }
                String str3 = new String(iArr3, 0, i4);
                short sXd6 = (short) (C1607wl.Xd() ^ (1922439338 ^ 1922441837));
                int[] iArr4 = new int["\u007fs".length()];
                QB qb4 = new QB("\u007fs");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4));
                    i5++;
                }
                String str4 = new String(iArr4, 0, i5);
                try {
                    Class<?> cls6 = Class.forName(str3);
                    Field field6 = 1 != 0 ? cls6.getField(str4) : cls6.getDeclaredField(str4);
                    field6.setAccessible(true);
                    obj6 = field6.get(c1628yp);
                } catch (Throwable th6) {
                    obj6 = null;
                }
                jSONObject.put(strKd2, (String) obj6);
                JSONArray jSONArray2 = new JSONArray();
                String strYd2 = C1561oA.yd("|i3}w", (short) (OY.Xd() ^ (1432342991 ^ 1432342014)));
                String strYd3 = C1561oA.Yd("=)", (short) (C1499aX.Xd() ^ ((1391424903 ^ 224320851) ^ (-1605485969))));
                try {
                    Class<?> cls7 = Class.forName(strYd2);
                    Field field7 = 1 != 0 ? cls7.getField(strYd3) : cls7.getDeclaredField(strYd3);
                    field7.setAccessible(true);
                    obj7 = field7.get(c1628yp);
                } catch (Throwable th7) {
                    obj7 = null;
                }
                Iterator it = ((List) obj7).iterator();
                while (it.hasNext()) {
                    jSONArray2.put((String) it.next());
                }
                jSONObject.put(Xg.qd("UJUIFZ5IVO^", (short) (C1633zX.Xd() ^ ((1364446269 ^ 1838569420) ^ (-1019590443))), (short) (C1633zX.Xd() ^ ((535345089 ^ 1389035089) ^ (-1294101562)))), jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                short sXd7 = (short) (OY.Xd() ^ ((461043537 ^ 65944084) ^ 412407035));
                short sXd8 = (short) (OY.Xd() ^ ((1363083016 ^ 1722212752) ^ 932736614));
                int[] iArr5 = new int["r{n\u0006h".length()];
                QB qb5 = new QB("r{n\u0006h");
                int i6 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - ((i6 * sXd8) ^ sXd7));
                    i6++;
                }
                String str5 = new String(iArr5, 0, i6);
                String strXd3 = ZO.xd("\\V", (short) (C1580rY.Xd() ^ ((1565838655 ^ 307360981) ^ (-1325731263))), (short) (C1580rY.Xd() ^ (2111721579 ^ (-2111705332))));
                try {
                    Class<?> cls8 = Class.forName(str5);
                    Field field8 = 1 != 0 ? cls8.getField(strXd3) : cls8.getDeclaredField(strXd3);
                    field8.setAccessible(true);
                    obj8 = field8.get(c1628yp);
                } catch (Throwable th8) {
                    obj8 = null;
                }
                Iterator it2 = ((List) obj8).iterator();
                while (it2.hasNext()) {
                    jSONArray3.put((String) it2.next());
                }
                jSONObject.put(C1626yg.Ud("J2%}IL/\u007f\u001cdW\u000b~2", (short) (C1633zX.Xd() ^ ((963129818 ^ 878665668) ^ (-221718758))), (short) (C1633zX.Xd() ^ ((2009953465 ^ 1618876485) ^ (-397616174)))), jSONArray3);
                jSONArray.put(jSONObject);
            }
        } catch (Exception e2) {
        }
        return jSONArray;
    }

    @Override // yg.Wd
    public YK UY(BF bf) throws Throwable {
        JSONArray jSONArrayCX = CX();
        String strQd = C1561oA.Qd("visohmrwtP`ah]b_l", (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ (1527986992 ^ 1788508418))));
        String string = jSONArrayCX.toString();
        Class<?> cls = Class.forName(C1593ug.zd("\u0013\u0002I\b\u000e", (short) (Od.Xd() ^ (FB.Xd() ^ (1433134311 ^ (-176462635)))), (short) (Od.Xd() ^ ((435998094 ^ 526520104) ^ (-111056577)))));
        Class<?>[] clsArr = new Class[C1580rY.Xd() ^ (-831067166)];
        clsArr[0] = Class.forName(C1561oA.od("@-r\u0006\t", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (72472286 ^ (-1879102529))))));
        clsArr[1] = Class.forName(C1561oA.Kd("E=S?\rLBPJ\u00128ZYQWQ", (short) (C1633zX.Xd() ^ ((438860878 ^ 1921782531) ^ (-1755585010)))));
        clsArr[Od.Xd() ^ (1854936505 ^ 695042542)] = Class.forName(Wg.Zd("Xa\t\nH\u0019$#2\u000bBYirmx", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (-1951489473))), (short) (ZN.Xd() ^ (Od.Xd() ^ (1776326329 ^ 773682812)))));
        Object[] objArr = new Object[(926287096 ^ 1184226309) ^ 1906563326];
        objArr[0] = bf;
        objArr[1] = strQd;
        objArr[(807892565 ^ 1870725042) ^ 1604815333] = string;
        Constructor<?> constructor = cls.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            return (C1549kp) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void VX(String str, long j2, long j3, String str2, String str3, List<String> list, List<String> list2) {
        Object obj;
        String strUd = C1561oA.ud("N;\u0001\u0013)", (short) (OY.Xd() ^ ((376746716 ^ 1538795355) ^ 1305263881)));
        String strYd = C1561oA.yd("\u0014\u001f", (short) (C1580rY.Xd() ^ (1984324906 ^ (-1984323312))));
        try {
            Class<?> cls = Class.forName(strUd);
            Field field = 0 != 0 ? cls.getField(strYd) : cls.getDeclaredField(strYd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        ((List) obj).add(new C1628yp(str, j2, j3, str2, str3, list, list2));
    }

    public List<C1628yp> kX() {
        Object obj;
        short sXd = (short) (ZN.Xd() ^ (FB.Xd() ^ (2125690831 ^ 559684635)));
        int[] iArr = new int["\u0006'\u001eW\u0005".length()];
        QB qb = new QB("\u0006'\u001eW\u0005");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strOd = EO.Od("m+", (short) (C1499aX.Xd() ^ ((792942511 ^ 637034377) ^ (-180027618))));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        return (List) obj;
    }

    public JSONObject zX() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            String strYd = C1561oA.Yd("[J\u0012&>", (short) (FB.Xd() ^ ((1192048517 ^ 101406632) ^ 1090920394)));
            String strQd = Xg.qd("\u0005\u0012", (short) (ZN.Xd() ^ ((338329772 ^ 214050277) ^ 417902428)), (short) (ZN.Xd() ^ ((1525158116 ^ 1533380981) ^ 26059126)));
            try {
                Class<?> cls = Class.forName(strYd);
                Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
                field.setAccessible(true);
                obj = field.get(this);
            } catch (Throwable th) {
                obj = null;
            }
            for (C1628yp c1628yp : (List) obj) {
                JSONObject jSONObject2 = new JSONObject();
                String strWd = Jg.Wd("\u0004j+h\u001dXUsE\u0007]", (short) (C1633zX.Xd() ^ (1385925270 ^ (-1385953602))), (short) (C1633zX.Xd() ^ ((1909778171 ^ 1400410849) ^ (-581722357))));
                short sXd = (short) (C1607wl.Xd() ^ ((1968055152 ^ 1198892022) ^ 842777977));
                short sXd2 = (short) (C1607wl.Xd() ^ ((1563091759 ^ 1445352425) ^ 185378857));
                int[] iArr = new int["L>s)1".length()];
                QB qb = new QB("L>s)1");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                short sXd3 = (short) (C1607wl.Xd() ^ ((890542810 ^ 1566594334) ^ 1752497928));
                short sXd4 = (short) (C1607wl.Xd() ^ ((714750328 ^ 1846150775) ^ 1150311919));
                int[] iArr2 = new int["<B".length()];
                QB qb2 = new QB("<B");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                    i3++;
                }
                String str2 = new String(iArr2, 0, i3);
                try {
                    Class<?> cls2 = Class.forName(str);
                    Field field2 = 1 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
                    field2.setAccessible(true);
                    obj2 = field2.get(c1628yp);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                jSONObject2.put(strWd, (String) obj2);
                short sXd5 = (short) (Od.Xd() ^ (988629993 ^ (-988639200)));
                int[] iArr3 = new int["%D\t\u001e".length()];
                QB qb3 = new QB("%D\t\u001e");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd5 + i4)));
                    i4++;
                }
                String str3 = new String(iArr3, 0, i4);
                short sXd6 = (short) (FB.Xd() ^ ((225502159 ^ 1279870986) ^ 1094311627));
                int[] iArr4 = new int["\u0016J%\u0013\u0014".length()];
                QB qb4 = new QB("\u0016J%\u0013\u0014");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + i5)) + xuXd4.CK(iKK4));
                    i5++;
                }
                String str4 = new String(iArr4, 0, i5);
                String strQd2 = C1561oA.Qd("bl", (short) (ZN.Xd() ^ (551505775 ^ 551512666)));
                try {
                    Class<?> cls3 = Class.forName(str4);
                    Field field3 = 1 != 0 ? cls3.getField(strQd2) : cls3.getDeclaredField(strQd2);
                    field3.setAccessible(true);
                    obj3 = field3.get(c1628yp);
                } catch (Throwable th3) {
                    obj3 = null;
                }
                jSONObject2.put(str3, (String) obj3);
                String strZd = C1593ug.zd("<1<0-A\u001a4F6>", (short) (OY.Xd() ^ (553278560 ^ 553257488)), (short) (OY.Xd() ^ (423485443 ^ 423490128)));
                short sXd7 = (short) (C1499aX.Xd() ^ ((2079530257 ^ 413489513) ^ (-1666600479)));
                int[] iArr5 = new int["VC\tSI".length()];
                QB qb5 = new QB("VC\tSI");
                int i6 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i6] = xuXd5.fK(sXd7 + sXd7 + i6 + xuXd5.CK(iKK5));
                    i6++;
                }
                String str5 = new String(iArr5, 0, i6);
                short sXd8 = (short) (Od.Xd() ^ ((942559390 ^ 1429824766) ^ (-1830244906)));
                int[] iArr6 = new int["mc".length()];
                QB qb6 = new QB("mc");
                int i7 = 0;
                while (qb6.YK()) {
                    int iKK6 = qb6.KK();
                    Xu xuXd6 = Xu.Xd(iKK6);
                    iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - ((sXd8 + sXd8) + i7));
                    i7++;
                }
                String str6 = new String(iArr6, 0, i7);
                try {
                    Class<?> cls4 = Class.forName(str5);
                    Field field4 = 1 != 0 ? cls4.getField(str6) : cls4.getDeclaredField(str6);
                    field4.setAccessible(true);
                    obj4 = field4.get(c1628yp);
                } catch (Throwable th4) {
                    obj4 = null;
                }
                jSONObject2.put(strZd, (String) obj4);
                JSONArray jSONArray2 = new JSONArray();
                String strZd2 = Wg.Zd("\"10g\u0016", (short) (FB.Xd() ^ (1910426821 ^ 1910415018)), (short) (FB.Xd() ^ ((42003236 ^ 1068512757) ^ 1026601865)));
                String strXd = C1561oA.Xd("9%", (short) (C1580rY.Xd() ^ ((169152496 ^ 415448642) ^ (-316045739))));
                try {
                    Class<?> cls5 = Class.forName(strZd2);
                    Field field5 = 1 != 0 ? cls5.getField(strXd) : cls5.getDeclaredField(strXd);
                    field5.setAccessible(true);
                    obj5 = field5.get(c1628yp);
                } catch (Throwable th5) {
                    obj5 = null;
                }
                Iterator it = ((List) obj5).iterator();
                while (it.hasNext()) {
                    jSONArray2.put((String) it.next());
                }
                short sXd9 = (short) (Od.Xd() ^ ((1363669867 ^ 1882866666) ^ (-561894956)));
                int[] iArr7 = new int["ZMVHCU.@KBO".length()];
                QB qb7 = new QB("ZMVHCU.@KBO");
                int i8 = 0;
                while (qb7.YK()) {
                    int iKK7 = qb7.KK();
                    Xu xuXd7 = Xu.Xd(iKK7);
                    iArr7[i8] = xuXd7.fK((sXd9 ^ i8) + xuXd7.CK(iKK7));
                    i8++;
                }
                jSONObject2.put(new String(iArr7, 0, i8), jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                short sXd10 = (short) (C1607wl.Xd() ^ ((626569043 ^ 1039780863) ^ 413228135));
                short sXd11 = (short) (C1607wl.Xd() ^ ((426347131 ^ 1184438944) ^ 1609611880));
                int[] iArr8 = new int["n[!ka".length()];
                QB qb8 = new QB("n[!ka");
                int i9 = 0;
                while (qb8.YK()) {
                    int iKK8 = qb8.KK();
                    Xu xuXd8 = Xu.Xd(iKK8);
                    iArr8[i9] = xuXd8.fK(((sXd10 + i9) + xuXd8.CK(iKK8)) - sXd11);
                    i9++;
                }
                String str7 = new String(iArr8, 0, i9);
                short sXd12 = (short) (C1580rY.Xd() ^ (1638740582 ^ (-1638755885)));
                short sXd13 = (short) (C1580rY.Xd() ^ ((1459110645 ^ 46337166) ^ (-1413154190)));
                int[] iArr9 = new int["BT".length()];
                QB qb9 = new QB("BT");
                int i10 = 0;
                while (qb9.YK()) {
                    int iKK9 = qb9.KK();
                    Xu xuXd9 = Xu.Xd(iKK9);
                    iArr9[i10] = xuXd9.fK(sXd12 + i10 + xuXd9.CK(iKK9) + sXd13);
                    i10++;
                }
                String str8 = new String(iArr9, 0, i10);
                try {
                    Class<?> cls6 = Class.forName(str7);
                    Field field6 = 1 != 0 ? cls6.getField(str8) : cls6.getDeclaredField(str8);
                    field6.setAccessible(true);
                    obj6 = field6.get(c1628yp);
                } catch (Throwable th6) {
                    obj6 = null;
                }
                Iterator it2 = ((List) obj6).iterator();
                while (it2.hasNext()) {
                    jSONArray3.put((String) it2.next());
                }
                short sXd14 = (short) (ZN.Xd() ^ (2119524768 ^ 2119513074));
                int[] iArr10 = new int["wjse`r@]o_`gio".length()];
                QB qb10 = new QB("wjse`r@]o_`gio");
                int i11 = 0;
                while (qb10.YK()) {
                    int iKK10 = qb10.KK();
                    Xu xuXd10 = Xu.Xd(iKK10);
                    iArr10[i11] = xuXd10.fK(sXd14 + i11 + xuXd10.CK(iKK10));
                    i11++;
                }
                jSONObject2.put(new String(iArr10, 0, i11), jSONArray3);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put(C1561oA.yd("!\u0016\u001e\u001c\u001b\"%,/\r\u001b\u001e+\"%$7", (short) (C1499aX.Xd() ^ (438795816 ^ (-438791930)))), jSONArray);
        } catch (Exception e2) {
        }
        return jSONObject;
    }
}
