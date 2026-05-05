package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: yg.uo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1594uo implements Wd {
    private final JSONObject Kd;
    private final JSONObject Xd;
    private final JSONObject Yd;
    private final JSONObject ud;

    public C1594uo() {
        JSONObject jSONObject = new JSONObject();
        short sXd = (short) (C1499aX.Xd() ^ ((924944826 ^ 1480662201) ^ (-1868626847)));
        short sXd2 = (short) (C1499aX.Xd() ^ ((433716894 ^ 783792556) ^ (-929977017)));
        int[] iArr = new int["XE\u000bQJ".length()];
        QB qb = new QB("XE\u000bQJ");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strUd = C1561oA.ud("Ph", (short) (C1499aX.Xd() ^ (115227490 ^ (-115224786))));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
            field.setAccessible(true);
            field.set(this, jSONObject);
        } catch (Throwable th) {
        }
        JSONObject jSONObject2 = new JSONObject();
        String strYd = C1561oA.yd("D1zA6", (short) (ZN.Xd() ^ (630705887 ^ 630689250)));
        String strYd2 = C1561oA.Yd("v\u0003", (short) (C1607wl.Xd() ^ (314362913 ^ 314353855)));
        try {
            Class<?> cls2 = Class.forName(strYd);
            Field field2 = 0 != 0 ? cls2.getField(strYd2) : cls2.getDeclaredField(strYd2);
            field2.setAccessible(true);
            field2.set(this, jSONObject2);
        } catch (Throwable th2) {
        }
        JSONObject jSONObject3 = new JSONObject();
        String strQd = Xg.qd("VE\rUP", (short) (C1607wl.Xd() ^ ((961948390 ^ 1687231014) ^ 1573352409)), (short) (C1607wl.Xd() ^ (282563440 ^ 282575784)));
        String strWd = Jg.Wd("?j", (short) (FB.Xd() ^ (2085997330 ^ 2086007942)), (short) (FB.Xd() ^ ((1937062196 ^ 2037816320) ^ 168015968)));
        try {
            Class<?> cls3 = Class.forName(strQd);
            Field field3 = 0 != 0 ? cls3.getField(strWd) : cls3.getDeclaredField(strWd);
            field3.setAccessible(true);
            field3.set(this, jSONObject3);
        } catch (Throwable th3) {
        }
        JSONObject jSONObject4 = new JSONObject();
        String strXd = ZO.xd("\u000ff\u001bN;", (short) (C1499aX.Xd() ^ ((1123359387 ^ 1005975249) ^ (-2030080133))), (short) (C1499aX.Xd() ^ (218970962 ^ (-218961603))));
        String strUd2 = C1626yg.Ud("'k", (short) (C1499aX.Xd() ^ (278023409 ^ (-278005876))), (short) (C1499aX.Xd() ^ (1474785840 ^ (-1474779347))));
        try {
            Class<?> cls4 = Class.forName(strXd);
            Field field4 = 0 != 0 ? cls4.getField(strUd2) : cls4.getDeclaredField(strUd2);
            field4.setAccessible(true);
            field4.set(this, jSONObject4);
        } catch (Throwable th4) {
        }
    }

    private JSONObject Xd(Ud ud) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String strWd = Ig.wd("a~s??", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (1885500695 ^ (-1105930401)))));
        String strOd = EO.Od("|6", (short) (C1607wl.Xd() ^ ((1781224229 ^ 425507565) ^ 1937214687)));
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        if (ud == ((Ud) obj)) {
            String strQd = C1561oA.Qd("\nv<\u0003{", (short) (OY.Xd() ^ ((18335545 ^ 534933614) ^ 519414231)));
            String strZd = C1593ug.zd("2>", (short) (C1607wl.Xd() ^ ((896727715 ^ 1418539795) ^ 1644162251)), (short) (C1607wl.Xd() ^ (2134553534 ^ 2134570616)));
            try {
                Class<?> cls2 = Class.forName(strQd);
                Field field2 = 0 != 0 ? cls2.getField(strZd) : cls2.getDeclaredField(strZd);
                field2.setAccessible(true);
                obj6 = field2.get(this);
            } catch (Throwable th2) {
                obj6 = null;
            }
            return (JSONObject) obj6;
        }
        short sXd = (short) (ZN.Xd() ^ ((1852087829 ^ 912084219) ^ 1480180725));
        int[] iArr = new int["bO\u0015;I".length()];
        QB qb = new QB("bO\u0015;I");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strKd = C1561oA.Kd("\u0010\u0006", (short) (C1499aX.Xd() ^ ((1632717957 ^ 1185707776) ^ (-670902449))));
        try {
            Class<?> cls3 = Class.forName(str);
            Field field3 = 0 != 0 ? cls3.getField(strKd) : cls3.getDeclaredField(strKd);
            field3.setAccessible(true);
            obj2 = field3.get(null);
        } catch (Throwable th3) {
            obj2 = null;
        }
        if (ud == ((Ud) obj2)) {
            String strZd2 = Wg.Zd("[\u001dH.|", (short) (C1499aX.Xd() ^ ((1035379580 ^ 893258886) ^ (-143189419))), (short) (C1499aX.Xd() ^ ((1463470846 ^ 985364426) ^ (-1837235416))));
            String strXd = C1561oA.Xd(")\u0019", (short) (OY.Xd() ^ ((2117921826 ^ 1564251915) ^ 587213632)));
            try {
                Class<?> cls4 = Class.forName(strZd2);
                Field field4 = 0 != 0 ? cls4.getField(strXd) : cls4.getDeclaredField(strXd);
                field4.setAccessible(true);
                obj5 = field4.get(this);
            } catch (Throwable th4) {
                obj5 = null;
            }
            return (JSONObject) obj5;
        }
        String strVd = Wg.vd("eR\u001cBT", (short) (C1633zX.Xd() ^ (1603645027 ^ (-1603655866))));
        short sXd2 = (short) (C1633zX.Xd() ^ (195626555 ^ (-195645178)));
        short sXd3 = (short) (C1633zX.Xd() ^ (1120364035 ^ (-1120361519)));
        int[] iArr2 = new int["_i".length()];
        QB qb2 = new QB("_i");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        try {
            Class<?> cls5 = Class.forName(strVd);
            Field field5 = 0 != 0 ? cls5.getField(str2) : cls5.getDeclaredField(str2);
            field5.setAccessible(true);
            obj3 = field5.get(null);
        } catch (Throwable th5) {
            obj3 = null;
        }
        if (ud != ((Ud) obj3)) {
            return null;
        }
        String strVd2 = hg.Vd("I6{B;", (short) (C1580rY.Xd() ^ ((1372469875 ^ 529365796) ^ (-1313032767))), (short) (C1580rY.Xd() ^ (1113554125 ^ (-1113548431))));
        short sXd4 = (short) (ZN.Xd() ^ ((1430960649 ^ 1205531622) ^ 311450710));
        int[] iArr3 = new int["8C".length()];
        QB qb3 = new QB("8C");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3));
            i4++;
        }
        String str3 = new String(iArr3, 0, i4);
        try {
            Class<?> cls6 = Class.forName(strVd2);
            Field field6 = 0 != 0 ? cls6.getField(str3) : cls6.getDeclaredField(str3);
            field6.setAccessible(true);
            obj4 = field6.get(this);
        } catch (Throwable th6) {
            obj4 = null;
        }
        return (JSONObject) obj4;
    }

    public void RY(Ud ud, EnumC1514eY enumC1514eY) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        try {
            JSONObject jSONObject = new JSONObject();
            String strYd = C1561oA.yd("*\u0017\\\u0003\u0011", (short) (ZN.Xd() ^ (2116736033 ^ 2116716854)));
            String strYd2 = C1561oA.Yd("\u0002q", (short) (C1580rY.Xd() ^ (2031799008 ^ (-2031785105))));
            try {
                Class<?> cls = Class.forName(strYd);
                Field field = 0 != 0 ? cls.getField(strYd2) : cls.getDeclaredField(strYd2);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (ud == ((Ud) obj)) {
                String strQd = Xg.qd("ra)ql", (short) (C1580rY.Xd() ^ (112068693 ^ (-112067245))), (short) (C1580rY.Xd() ^ (430520514 ^ (-430508224))));
                String strWd = Jg.Wd("89", (short) (ZN.Xd() ^ ((754090014 ^ 933813820) ^ 458907196)), (short) (ZN.Xd() ^ ((1459359577 ^ 1191662830) ^ 301683435)));
                try {
                    Class<?> cls2 = Class.forName(strQd);
                    Field field2 = 0 != 0 ? cls2.getField(strWd) : cls2.getDeclaredField(strWd);
                    field2.setAccessible(true);
                    obj10 = field2.get(this);
                } catch (Throwable th2) {
                    obj10 = null;
                }
                JSONObject jSONObject2 = (JSONObject) obj10;
                String string = ud.toString();
                short sXd = (short) (C1580rY.Xd() ^ ((10247567 ^ 519254992) ^ (-510597022)));
                short sXd2 = (short) (C1580rY.Xd() ^ ((1097671064 ^ 831577861) ^ (-1895675241)));
                int[] iArr = new int["3\u001bg0O".length()];
                QB qb = new QB("3\u001bg0O");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                    i2++;
                }
                String str = new String(iArr, 0, i2);
                String strUd = C1626yg.Ud("\u0003s", (short) (C1499aX.Xd() ^ (1971800879 ^ (-1971809057))), (short) (C1499aX.Xd() ^ ((862894853 ^ 399169097) ^ (-614757696))));
                try {
                    Class<?> cls3 = Class.forName(str);
                    Field field3 = 0 != 0 ? cls3.getField(strUd) : cls3.getDeclaredField(strUd);
                    field3.setAccessible(true);
                    obj11 = field3.get(this);
                } catch (Throwable th3) {
                    obj11 = null;
                }
                jSONObject2.put(string, (JSONObject) obj11);
                String strWd2 = Ig.wd("U\u001c.TS", (short) (ZN.Xd() ^ (1072280523 ^ 1072288025)));
                String strOd = EO.Od("\u0011M", (short) (ZN.Xd() ^ (410020300 ^ 410009454)));
                try {
                    Class<?> cls4 = Class.forName(strWd2);
                    Field field4 = 0 != 0 ? cls4.getField(strOd) : cls4.getDeclaredField(strOd);
                    field4.setAccessible(true);
                    obj12 = field4.get(this);
                } catch (Throwable th4) {
                    obj12 = null;
                }
                ((JSONObject) obj12).put(enumC1514eY.toString(), jSONObject);
            } else {
                String strQd2 = C1561oA.Qd("}j0Vd", (short) (OY.Xd() ^ (1901476007 ^ 1901476442)));
                String strZd = C1593ug.zd("_U", (short) (C1633zX.Xd() ^ (2129615381 ^ (-2129614399))), (short) (C1633zX.Xd() ^ (1115977136 ^ (-1115974792))));
                try {
                    Class<?> cls5 = Class.forName(strQd2);
                    Field field5 = 0 != 0 ? cls5.getField(strZd) : cls5.getDeclaredField(strZd);
                    field5.setAccessible(true);
                    obj2 = field5.get(null);
                } catch (Throwable th5) {
                    obj2 = null;
                }
                if (ud == ((Ud) obj2)) {
                    String strOd2 = C1561oA.od("lY\u001fe^", (short) (C1633zX.Xd() ^ ((544194399 ^ 2064861932) ^ (-1534899707))));
                    short sXd3 = (short) (FB.Xd() ^ (2057284609 ^ 2057289320));
                    int[] iArr2 = new int["x\u0013".length()];
                    QB qb2 = new QB("x\u0013");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
                        i3++;
                    }
                    String str2 = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls6 = Class.forName(strOd2);
                        Field field6 = 0 != 0 ? cls6.getField(str2) : cls6.getDeclaredField(str2);
                        field6.setAccessible(true);
                        obj7 = field6.get(this);
                    } catch (Throwable th6) {
                        obj7 = null;
                    }
                    JSONObject jSONObject3 = (JSONObject) obj7;
                    String string2 = ud.toString();
                    String strZd2 = Wg.Zd(".mM\u0011c", (short) (C1580rY.Xd() ^ ((57618282 ^ 940837116) ^ (-997934550))), (short) (C1580rY.Xd() ^ (1006785061 ^ (-1006775769))));
                    String strXd = C1561oA.Xd("L<", (short) (ZN.Xd() ^ ((1917728489 ^ 1409401203) ^ 642746552)));
                    try {
                        Class<?> cls7 = Class.forName(strZd2);
                        Field field7 = 0 != 0 ? cls7.getField(strXd) : cls7.getDeclaredField(strXd);
                        field7.setAccessible(true);
                        obj8 = field7.get(this);
                    } catch (Throwable th7) {
                        obj8 = null;
                    }
                    jSONObject3.put(string2, (JSONObject) obj8);
                    String strVd = Wg.vd("A0s<;", (short) (C1633zX.Xd() ^ (895521917 ^ (-895522989))));
                    short sXd4 = (short) (ZN.Xd() ^ (1761045942 ^ 1761019763));
                    short sXd5 = (short) (ZN.Xd() ^ ((603090051 ^ 873448867) ^ 402497582));
                    int[] iArr3 = new int["\u0006s".length()];
                    QB qb3 = new QB("\u0006s");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                        i4++;
                    }
                    String str3 = new String(iArr3, 0, i4);
                    try {
                        Class<?> cls8 = Class.forName(strVd);
                        Field field8 = 0 != 0 ? cls8.getField(str3) : cls8.getDeclaredField(str3);
                        field8.setAccessible(true);
                        obj9 = field8.get(this);
                    } catch (Throwable th8) {
                        obj9 = null;
                    }
                    ((JSONObject) obj9).put(enumC1514eY.toString(), jSONObject);
                } else {
                    String strVd2 = hg.Vd("bO\u0015;I", (short) (Od.Xd() ^ (1260493709 ^ (-1260516937))), (short) (Od.Xd() ^ (181190110 ^ (-181201130))));
                    short sXd6 = (short) (Od.Xd() ^ (602179352 ^ (-602204089)));
                    int[] iArr4 = new int["9C".length()];
                    QB qb4 = new QB("9C");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4));
                        i5++;
                    }
                    String str4 = new String(iArr4, 0, i5);
                    try {
                        Class<?> cls9 = Class.forName(strVd2);
                        Field field9 = 0 != 0 ? cls9.getField(str4) : cls9.getDeclaredField(str4);
                        field9.setAccessible(true);
                        obj3 = field9.get(null);
                    } catch (Throwable th9) {
                        obj3 = null;
                    }
                    if (ud == ((Ud) obj3)) {
                        String strYd3 = C1561oA.yd("bO\u0019_\\", (short) (C1633zX.Xd() ^ (10340806 ^ (-10322556))));
                        String strYd4 = C1561oA.Yd("\u000f)", (short) (C1580rY.Xd() ^ ((1038062549 ^ 833410792) ^ (-208886645))));
                        try {
                            Class<?> cls10 = Class.forName(strYd3);
                            Field field10 = 0 != 0 ? cls10.getField(strYd4) : cls10.getDeclaredField(strYd4);
                            field10.setAccessible(true);
                            obj4 = field10.get(this);
                        } catch (Throwable th10) {
                            obj4 = null;
                        }
                        JSONObject jSONObject4 = (JSONObject) obj4;
                        String string3 = ud.toString();
                        String strQd3 = Xg.qd("?.u>9", (short) (ZN.Xd() ^ ((996872085 ^ 1526669945) ^ 1637091877)), (short) (ZN.Xd() ^ (782735632 ^ 782743526)));
                        String strWd3 = Jg.Wd("hS", (short) (C1633zX.Xd() ^ ((1639832122 ^ 992162898) ^ (-1520361146))), (short) (C1633zX.Xd() ^ (1539626389 ^ (-1539618058))));
                        try {
                            Class<?> cls11 = Class.forName(strQd3);
                            Field field11 = 0 != 0 ? cls11.getField(strWd3) : cls11.getDeclaredField(strWd3);
                            field11.setAccessible(true);
                            obj5 = field11.get(this);
                        } catch (Throwable th11) {
                            obj5 = null;
                        }
                        jSONObject4.put(string3, (JSONObject) obj5);
                        String strXd2 = ZO.xd("\u0002|E!_", (short) (ZN.Xd() ^ (476751487 ^ 476759622)), (short) (ZN.Xd() ^ (248321573 ^ 248321517)));
                        String strUd2 = C1626yg.Ud("T\u0012", (short) (OY.Xd() ^ (993138502 ^ 993135478)), (short) (OY.Xd() ^ ((1988037384 ^ 1256267795) ^ 1017010905)));
                        try {
                            Class<?> cls12 = Class.forName(strXd2);
                            Field field12 = 0 != 0 ? cls12.getField(strUd2) : cls12.getDeclaredField(strUd2);
                            field12.setAccessible(true);
                            obj6 = field12.get(this);
                        } catch (Throwable th12) {
                            obj6 = null;
                        }
                        ((JSONObject) obj6).put(enumC1514eY.toString(), jSONObject);
                    }
                }
            }
        } catch (JSONException e2) {
        }
    }

    @Override // yg.Wd
    public YK UY(BF bf) throws Throwable {
        Object obj;
        short sXd = (short) (FB.Xd() ^ (FB.Xd() ^ 1609519635));
        int[] iArr = new int["2JA/v".length()];
        QB qb = new QB("2JA/v");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strOd = EO.Od("1\u001a", (short) (FB.Xd() ^ ((282882285 ^ 781137488) ^ 1045651574)));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        String string = ((JSONObject) obj).toString();
        String strQd = C1561oA.Qd("\"\u0014\u001c\u001d\u001d\b\u0012\u000e\u001e\u0004\u0016\n\u000f\ra\u0002\u0010\u007f|\r\u0001\u0006\u0004hx\u0006\u0006bt\u0002\u0003x\u007f}", (short) (C1607wl.Xd() ^ (1736506549 ^ 1736496456)));
        Class<?> cls2 = Class.forName(C1593ug.zd("jY!_e", (short) (C1580rY.Xd() ^ ((597110578 ^ 529348487) ^ (-1008356266))), (short) (C1580rY.Xd() ^ (648642654 ^ (-648663698)))));
        Class<?>[] clsArr = new Class[786848924 ^ 786848927];
        short sXd2 = (short) (OY.Xd() ^ (524877833 ^ 524902987));
        int[] iArr2 = new int["wd*=@".length()];
        QB qb2 = new QB("wd*=@");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        short sXd3 = (short) (C1633zX.Xd() ^ (531477582 ^ (-531490602)));
        int[] iArr3 = new int["og}i7vlzt<b\u0005\u0004{\u0002{".length()];
        QB qb3 = new QB("og}i7vlzt<b\u0005\u0004{\u0002{");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd3 + sXd3) + i4));
            i4++;
        }
        clsArr[1] = Class.forName(new String(iArr3, 0, i4));
        clsArr[986023879 ^ 986023877] = Class.forName(Wg.Zd("S\u001fPM&yD]\rk&Q'4FO", (short) (C1607wl.Xd() ^ ((1069965629 ^ 153520139) ^ 920684636)), (short) (C1607wl.Xd() ^ (1643565133 ^ 1643572901))));
        Object[] objArr = new Object[(2069127090 ^ 1621391269) ^ 468723732];
        objArr[0] = bf;
        objArr[1] = strQd;
        objArr[(434534215 ^ 1891336985) ^ 1767765084] = string;
        Constructor<?> constructor = cls2.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            return (C1549kp) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void zY(Ud ud, EnumC1514eY enumC1514eY, Map<String, String> map) {
        try {
            RY(ud, enumC1514eY);
            JSONObject jSONObjectXd = Xd(ud);
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObjectXd.put(enumC1514eY.toString(), jSONObject);
        } catch (JSONException e2) {
        }
    }
}
