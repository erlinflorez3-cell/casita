package yg;

import android.content.Context;
import android.os.Process;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes9.dex */
public class YQ extends HF {
    public static int Kd = 0;
    private static List<Class<?>> Od = null;
    public static Set<WF> Qd = null;
    public static int Yd = 0;
    private static final Object kd = null;
    public static Set<WF> od = null;
    public static final String[] qd = null;
    public static Set<WF> ud = null;
    public static WF[] vd = null;
    public static int[] wd = null;
    public static byte[] yd = null;

    static {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(ZO.xd("Uzh8<", (short) (FB.Xd() ^ (OY.Xd() ^ (573499033 ^ 637896715))), (short) (FB.Xd() ^ ((620645013 ^ 1497092425) ^ 2110127623)))).getDeclaredMethod(C1626yg.Ud("\u0016 ", (short) (C1607wl.Xd() ^ ((29888806 ^ 256478479) ^ 243371286)), (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (173172257 ^ 1679195095)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            HashSet hashSet = (HashSet) declaredMethod.invoke(null, objArr);
            String strWd = Ig.wd("6j\u0003\u000fN", (short) (Od.Xd() ^ (252676947 ^ (-252684118))));
            short sXd = (short) (Od.Xd() ^ (1500719286 ^ (-1500730832)));
            int[] iArr = new int["O\u0013".length()];
            QB qb = new QB("O\u0013");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strWd);
                Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                field.set(null, hashSet);
            } catch (Throwable th) {
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.Qd("lY\u001fI@", (short) (C1607wl.Xd() ^ (2072986420 ^ 2072975917)))).getDeclaredMethod(C1593ug.zd("\u0015\u001f", (short) (Od.Xd() ^ ((1918466764 ^ 1582275079) ^ (-739689041))), (short) (Od.Xd() ^ (301930380 ^ (-301946284)))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod2.invoke(null, objArr2);
                String strOd = C1561oA.od(" \rR|s", (short) (ZN.Xd() ^ (1633134153 ^ 1633136928)));
                String strKd = C1561oA.Kd(")\u0015", (short) (Od.Xd() ^ (517330330 ^ (-517324257))));
                try {
                    Class<?> cls2 = Class.forName(strOd);
                    Field field2 = 0 != 0 ? cls2.getField(strKd) : cls2.getDeclaredField(strKd);
                    field2.setAccessible(true);
                    field2.set(null, bArr);
                } catch (Throwable th2) {
                }
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(Wg.Zd("8:L\u0003F", (short) (ZN.Xd() ^ ((264492105 ^ 2011929232) ^ 2015919628)), (short) (ZN.Xd() ^ (1939716827 ^ 1939718805)))).getDeclaredMethod(C1561oA.Xd("b\u001a", (short) (Od.Xd() ^ (1506194156 ^ (-1506209654)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    WF[] wfArr = (WF[]) declaredMethod3.invoke(null, objArr3);
                    String strVd = Wg.vd("]J\u0014>9", (short) (Od.Xd() ^ (443483403 ^ (-443493432))));
                    String strKd2 = Qg.kd("R?", (short) (C1580rY.Xd() ^ ((1614388722 ^ 830859081) ^ (-1371293535))), (short) (C1580rY.Xd() ^ ((1952779678 ^ 82315199) ^ (-1888294058))));
                    try {
                        Class<?> cls3 = Class.forName(strVd);
                        Field field3 = 0 != 0 ? cls3.getField(strKd2) : cls3.getDeclaredField(strKd2);
                        field3.setAccessible(true);
                        field3.set(null, wfArr);
                    } catch (Throwable th3) {
                    }
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(hg.Vd("\nv<f]", (short) (Od.Xd() ^ (239438233 ^ (-239455004))), (short) (Od.Xd() ^ ((2063246074 ^ 1738333739) ^ (-493236564))))).getDeclaredMethod(C1561oA.ud("\b)", (short) (Od.Xd() ^ ((496277804 ^ 199501400) ^ (-376475465)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        HashSet hashSet2 = (HashSet) declaredMethod4.invoke(null, objArr4);
                        String strYd = C1561oA.yd("\u0001m3]\\", (short) (OY.Xd() ^ (1548160322 ^ 1548169265)));
                        String strYd2 = C1561oA.Yd("\"\u0018", (short) (C1607wl.Xd() ^ ((784827075 ^ 208550269) ^ 581565812)));
                        try {
                            Class<?> cls4 = Class.forName(strYd);
                            Field field4 = 0 != 0 ? cls4.getField(strYd2) : cls4.getDeclaredField(strYd2);
                            field4.setAccessible(true);
                            field4.set(null, hashSet2);
                        } catch (Throwable th4) {
                        }
                        Object[] objArr5 = new Object[0];
                        Method declaredMethod5 = Class.forName(Xg.qd("Q@\b4-", (short) (ZN.Xd() ^ (1432967154 ^ 1432965452)), (short) (ZN.Xd() ^ (632114992 ^ 632113969)))).getDeclaredMethod(Jg.Wd("Ld", (short) (C1580rY.Xd() ^ (1671127283 ^ (-1671103633))), (short) (C1580rY.Xd() ^ ((2140649418 ^ 2110061300) ^ (-38998054)))), new Class[0]);
                        try {
                            declaredMethod5.setAccessible(true);
                            HashSet hashSet3 = (HashSet) declaredMethod5.invoke(null, objArr5);
                            String strXd = ZO.xd("Od\u0015\u0013l", (short) (C1633zX.Xd() ^ ((1593031744 ^ 787547112) ^ (-1879226894))), (short) (C1633zX.Xd() ^ (1537804279 ^ (-1537820139))));
                            short sXd2 = (short) (FB.Xd() ^ (2055521463 ^ 2055524585));
                            short sXd3 = (short) (FB.Xd() ^ (1390614600 ^ 1390640630));
                            int[] iArr2 = new int["*%".length()];
                            QB qb2 = new QB("*%");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i3 * sXd3))) + xuXd2.CK(iKK2));
                                i3++;
                            }
                            String str2 = new String(iArr2, 0, i3);
                            try {
                                Class<?> cls5 = Class.forName(strXd);
                                Field field5 = 0 != 0 ? cls5.getField(str2) : cls5.getDeclaredField(str2);
                                field5.setAccessible(true);
                                field5.set(null, hashSet3);
                            } catch (Throwable th5) {
                            }
                            Object[] objArr6 = new Object[0];
                            Method declaredMethod6 = Class.forName(Ig.wd(" @7|b", (short) (OY.Xd() ^ (1191985950 ^ 1191985890)))).getDeclaredMethod(EO.Od("\u007f0", (short) (Od.Xd() ^ ((752897982 ^ 956156112) ^ (-337499906)))), new Class[0]);
                            try {
                                declaredMethod6.setAccessible(true);
                                int iIntValue = ((Integer) declaredMethod6.invoke(null, objArr6)).intValue();
                                String strQd = C1561oA.Qd("`M\u0013=4", (short) (Od.Xd() ^ ((676806133 ^ 1432760887) ^ (-2100391855))));
                                String strZd = C1593ug.zd("Ga", (short) (C1607wl.Xd() ^ (1405932240 ^ 1405936819)), (short) (C1607wl.Xd() ^ (1078638845 ^ 1078642619)));
                                Integer numValueOf = Integer.valueOf(iIntValue);
                                try {
                                    Class<?> cls6 = Class.forName(strQd);
                                    Field field6 = 0 != 0 ? cls6.getField(strZd) : cls6.getDeclaredField(strZd);
                                    field6.setAccessible(true);
                                    field6.set(null, numValueOf);
                                } catch (Throwable th6) {
                                }
                                Object[] objArr7 = new Object[0];
                                Method declaredMethod7 = Class.forName(C1561oA.od("J7|'\u001e", (short) (FB.Xd() ^ ((882787967 ^ 1073124507) ^ 191402798)))).getDeclaredMethod(C1561oA.Kd("\u0003\u0012", (short) (OY.Xd() ^ ((131935469 ^ 355073305) ^ 318042923))), new Class[0]);
                                try {
                                    declaredMethod7.setAccessible(true);
                                    int[] iArr3 = (int[]) declaredMethod7.invoke(null, objArr7);
                                    String strZd2 = Wg.Zd("p\r>\u0015\b", (short) (C1499aX.Xd() ^ ((1808685164 ^ 289158978) ^ (-2062705550))), (short) (C1499aX.Xd() ^ (909376293 ^ (-909370676))));
                                    String strXd2 = C1561oA.Xd("xf", (short) (OY.Xd() ^ ((1277868299 ^ 2067702743) ^ 924073873)));
                                    try {
                                        Class<?> cls7 = Class.forName(strZd2);
                                        Field field7 = 0 != 0 ? cls7.getField(strXd2) : cls7.getDeclaredField(strXd2);
                                        field7.setAccessible(true);
                                        field7.set(null, iArr3);
                                    } catch (Throwable th7) {
                                    }
                                    Object[] objArr8 = new Object[0];
                                    Method declaredMethod8 = Class.forName(Wg.vd("1 g\u0014\r", (short) (OY.Xd() ^ (1838480400 ^ 1838475383)))).getDeclaredMethod(Qg.kd("V~", (short) (C1607wl.Xd() ^ (871893611 ^ 871915515)), (short) (C1607wl.Xd() ^ (2101983285 ^ 2101990275))), new Class[0]);
                                    try {
                                        declaredMethod8.setAccessible(true);
                                        int iIntValue2 = ((Integer) declaredMethod8.invoke(null, objArr8)).intValue();
                                        short sXd4 = (short) (C1499aX.Xd() ^ ((517582051 ^ 1587433142) ^ (-1078439980)));
                                        short sXd5 = (short) (C1499aX.Xd() ^ ((149096975 ^ 475567933) ^ (-347835410)));
                                        int[] iArr4 = new int["\u0003o5_V".length()];
                                        QB qb3 = new QB("\u0003o5_V");
                                        int i4 = 0;
                                        while (qb3.YK()) {
                                            int iKK3 = qb3.KK();
                                            Xu xuXd3 = Xu.Xd(iKK3);
                                            iArr4[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                                            i4++;
                                        }
                                        String str3 = new String(iArr4, 0, i4);
                                        String strUd = C1561oA.ud("Wa", (short) (C1580rY.Xd() ^ (554026362 ^ (-554009536))));
                                        Integer numValueOf2 = Integer.valueOf(iIntValue2);
                                        try {
                                            Class<?> cls8 = Class.forName(str3);
                                            Field field8 = 0 != 0 ? cls8.getField(strUd) : cls8.getDeclaredField(strUd);
                                            field8.setAccessible(true);
                                            field8.set(null, numValueOf2);
                                        } catch (Throwable th8) {
                                        }
                                        Object obj = new Object();
                                        short sXd6 = (short) (ZN.Xd() ^ (1407496400 ^ 1407484255));
                                        int[] iArr5 = new int["\u0018\u0005Jtk".length()];
                                        QB qb4 = new QB("\u0018\u0005Jtk");
                                        int i5 = 0;
                                        while (qb4.YK()) {
                                            int iKK4 = qb4.KK();
                                            Xu xuXd4 = Xu.Xd(iKK4);
                                            iArr5[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd6 ^ i5));
                                            i5++;
                                        }
                                        String str4 = new String(iArr5, 0, i5);
                                        String strYd3 = C1561oA.Yd("OI", (short) (Od.Xd() ^ ((154209725 ^ 11408042) ^ (-161415696))));
                                        try {
                                            Class<?> cls9 = Class.forName(str4);
                                            Field field9 = 0 != 0 ? cls9.getField(strYd3) : cls9.getDeclaredField(strYd3);
                                            field9.setAccessible(true);
                                            field9.set(null, obj);
                                        } catch (Throwable th9) {
                                        }
                                        String[] strArr = {ZO.xd("\u001a\u0004\u001eBC", (short) (C1499aX.Xd() ^ (1375676736 ^ (-1375677503))), (short) (C1499aX.Xd() ^ (284725847 ^ (-284724829)))), C1626yg.Ud("!*5N\u000e \u001dV", (short) (ZN.Xd() ^ (937197564 ^ 937166942)), (short) (ZN.Xd() ^ (1786573421 ^ 1786571108))), Ig.wd("~ae\f\u000f", (short) (C1499aX.Xd() ^ ((2121559602 ^ 565693668) ^ (-1606667715)))), Xg.qd("{yx\r\f", (short) (C1580rY.Xd() ^ ((92726534 ^ 1632505325) ^ (-1690876221))), (short) (C1580rY.Xd() ^ ((1250367945 ^ 1218289254) ^ (-35301886)))), Jg.Wd("\u001e\re\u0006\"\f&F,\rn", (short) (FB.Xd() ^ ((1823784762 ^ 1154886685) ^ 677570197)), (short) (FB.Xd() ^ (1291916510 ^ 1291934669)))};
                                        String strOd2 = EO.Od("o\u000e\u0003U\u001d", (short) (OY.Xd() ^ ((1637838995 ^ 507022589) ^ 2141692496)));
                                        String strQd2 = C1561oA.Qd("\u0007x", (short) (OY.Xd() ^ (1478589042 ^ 1478583377)));
                                        try {
                                            Class<?> cls10 = Class.forName(strOd2);
                                            Field field10 = 0 != 0 ? cls10.getField(strQd2) : cls10.getDeclaredField(strQd2);
                                            field10.setAccessible(true);
                                            field10.set(null, strArr);
                                        } catch (Throwable th10) {
                                        }
                                    } catch (InvocationTargetException e2) {
                                        throw e2.getCause();
                                    }
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            } catch (InvocationTargetException e8) {
                throw e8.getCause();
            }
        } catch (InvocationTargetException e9) {
            throw e9.getCause();
        }
    }

    public static boolean BX(String str, String str2) {
        return Pattern.matches(C1561oA.Kd("pml\")", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (1681742490 ^ (-665191531))))) + str2 + Wg.Zd(";rd\u001a?", (short) (ZN.Xd() ^ (OY.Xd() ^ (938701249 ^ 869818507))), (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (896918049 ^ (-83677422))))), str);
    }

    public static WF[] Bx() {
        return new WF[0];
    }

    public static int Od(int i2, BX bx) throws Throwable {
        Class<?> cls = Class.forName(Wg.Zd("eh2PA", (short) (OY.Xd() ^ (C1633zX.Xd() ^ (500747046 ^ (-1770627954)))), (short) (OY.Xd() ^ ((875771364 ^ 126807958) ^ 868074055))));
        Class<?>[] clsArr = new Class[141918942 ^ 141918940];
        clsArr[0] = Integer.TYPE;
        clsArr[1] = Class.forName(C1561oA.Xd(">-t\n!", (short) (C1580rY.Xd() ^ (801341071 ^ (-801327635)))));
        Object[] objArr = new Object[1962074885 ^ 1962074887];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = bx;
        Method declaredMethod = cls.getDeclaredMethod(Wg.vd("|l", (short) (C1607wl.Xd() ^ ((1802885113 ^ 426020065) ^ 1913723537))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod.invoke(null, objArr)).intValue();
            Class<?> cls2 = Class.forName(Qg.kd("{h.XO", (short) (C1633zX.Xd() ^ ((1930361376 ^ 1013110411) ^ (-1332495846))), (short) (C1633zX.Xd() ^ ((641347210 ^ 1900414298) ^ (-1467749056)))));
            Class<?>[] clsArr2 = new Class[1190893090 ^ 1190893088];
            clsArr2[0] = Integer.TYPE;
            clsArr2[1] = Class.forName(hg.Vd(">+p\u0004\u0019", (short) (FB.Xd() ^ ((334250353 ^ 814067737) ^ 594129463)), (short) (FB.Xd() ^ (441495676 ^ 441511391))));
            Object[] objArr2 = new Object[485048380 ^ 485048382];
            objArr2[0] = Integer.valueOf(iIntValue);
            objArr2[1] = bx;
            Method declaredMethod2 = cls2.getDeclaredMethod(C1561oA.ud("8C", (short) (FB.Xd() ^ (798223699 ^ 798210004))), clsArr2);
            try {
                declaredMethod2.setAccessible(true);
                int iIntValue2 = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                short sXd = (short) (Od.Xd() ^ ((1247183837 ^ 1413889795) ^ (-504429685)));
                int[] iArr = new int["P?\u00073,".length()];
                QB qb = new QB("P?\u00073,");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
                    i3++;
                }
                Class<?> cls3 = Class.forName(new String(iArr, 0, i3));
                Class<?>[] clsArr3 = new Class[(1305288445 ^ 1233089653) ^ 78801546];
                clsArr3[0] = Integer.TYPE;
                short sXd2 = (short) (C1499aX.Xd() ^ (305123105 ^ (-305107072)));
                int[] iArr2 = new int["5$k\u0001\u0018".length()];
                QB qb2 = new QB("5$k\u0001\u0018");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i4));
                    i4++;
                }
                clsArr3[1] = Class.forName(new String(iArr2, 0, i4));
                Object[] objArr3 = new Object[1988128827 ^ 1988128825];
                objArr3[0] = Integer.valueOf(iIntValue2);
                objArr3[1] = bx;
                short sXd3 = (short) (C1499aX.Xd() ^ ((1771571733 ^ 353379160) ^ (-2089318945)));
                short sXd4 = (short) (C1499aX.Xd() ^ (53169382 ^ (-53153217)));
                int[] iArr3 = new int["7K".length()];
                QB qb3 = new QB("7K");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i5)) + sXd4);
                    i5++;
                }
                Method declaredMethod3 = cls3.getDeclaredMethod(new String(iArr3, 0, i5), clsArr3);
                try {
                    declaredMethod3.setAccessible(true);
                    int iIntValue3 = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    Class<?> cls4 = Class.forName(Jg.Wd("e1^10", (short) (C1607wl.Xd() ^ ((911283501 ^ 299963756) ^ 665860365)), (short) (C1607wl.Xd() ^ (45793840 ^ 45804647))));
                    Class<?>[] clsArr4 = new Class[(1686612993 ^ 1050054988) ^ 1511079247];
                    clsArr4[0] = Integer.TYPE;
                    clsArr4[1] = Class.forName(ZO.xd(",V\n\u0014d", (short) (Od.Xd() ^ ((1982654324 ^ 1398188580) ^ (-628767880))), (short) (Od.Xd() ^ (774653002 ^ (-774652132)))));
                    Object[] objArr4 = new Object[1226300071 ^ 1226300069];
                    objArr4[0] = Integer.valueOf(iIntValue3);
                    objArr4[1] = bx;
                    short sXd5 = (short) (FB.Xd() ^ ((1179625804 ^ 932074018) ^ 1908522919));
                    short sXd6 = (short) (FB.Xd() ^ ((1018874964 ^ 961837225) ^ 99531824));
                    int[] iArr4 = new int["4?".length()];
                    QB qb4 = new QB("4?");
                    int i6 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i6] = xuXd4.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i6 * sXd6))) + xuXd4.CK(iKK4));
                        i6++;
                    }
                    Method declaredMethod4 = cls4.getDeclaredMethod(new String(iArr4, 0, i6), clsArr4);
                    try {
                        declaredMethod4.setAccessible(true);
                        int iIntValue4 = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        short sXd7 = (short) (C1633zX.Xd() ^ ((1564609488 ^ 1855210578) ^ (-869667486)));
                        int[] iArr5 = new int["\u0018Yous".length()];
                        QB qb5 = new QB("\u0018Yous");
                        int i7 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i7] = xuXd5.fK(xuXd5.CK(iKK5) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd7 + i7)));
                            i7++;
                        }
                        Class<?> cls5 = Class.forName(new String(iArr5, 0, i7));
                        Class<?>[] clsArr5 = new Class[1384409055 ^ 1384409053];
                        clsArr5[0] = Integer.TYPE;
                        short sXd8 = (short) (C1580rY.Xd() ^ (1667512994 ^ (-1667519356)));
                        int[] iArr6 = new int["p\u0019A5#".length()];
                        QB qb6 = new QB("p\u0019A5#");
                        int i8 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i8] = xuXd6.fK((C1561oA.Xd[i8 % C1561oA.Xd.length] ^ ((sXd8 + sXd8) + i8)) + xuXd6.CK(iKK6));
                            i8++;
                        }
                        clsArr5[1] = Class.forName(new String(iArr6, 0, i8));
                        Object[] objArr5 = new Object[(1899900491 ^ 1283217956) ^ 1027765357];
                        objArr5[0] = Integer.valueOf(iIntValue4);
                        objArr5[1] = bx;
                        Method declaredMethod5 = cls5.getDeclaredMethod(C1561oA.Qd("1%", (short) (FB.Xd() ^ (1657858612 ^ 1657837953))), clsArr5);
                        try {
                            declaredMethod5.setAccessible(true);
                            int iIntValue5 = ((Integer) declaredMethod5.invoke(null, objArr5)).intValue();
                            Class<?> cls6 = Class.forName(C1593ug.zd("@/v#\u001c", (short) (C1499aX.Xd() ^ ((2056989768 ^ 1426656444) ^ (-798101977))), (short) (C1499aX.Xd() ^ ((1692453614 ^ 1538729170) ^ (-1062729073)))));
                            Class<?>[] clsArr6 = new Class[(1481613951 ^ 1996987635) ^ 793263758];
                            clsArr6[0] = Integer.TYPE;
                            short sXd9 = (short) (Od.Xd() ^ (522391286 ^ (-522401976)));
                            int[] iArr7 = new int[")\u0016[n\u0004".length()];
                            QB qb7 = new QB(")\u0016[n\u0004");
                            int i9 = 0;
                            while (qb7.YK()) {
                                int iKK7 = qb7.KK();
                                Xu xuXd7 = Xu.Xd(iKK7);
                                iArr7[i9] = xuXd7.fK(sXd9 + sXd9 + i9 + xuXd7.CK(iKK7));
                                i9++;
                            }
                            clsArr6[1] = Class.forName(new String(iArr7, 0, i9));
                            Object[] objArr6 = new Object[(540145171 ^ 684479398) ^ 150840759];
                            objArr6[0] = Integer.valueOf(iIntValue5);
                            objArr6[1] = bx;
                            Method declaredMethod6 = cls6.getDeclaredMethod(C1561oA.Kd("&\u0014", (short) (ZN.Xd() ^ ((888397200 ^ 986168782) ^ 238311210))), clsArr6);
                            try {
                                declaredMethod6.setAccessible(true);
                                int iIntValue6 = ((Integer) declaredMethod6.invoke(null, objArr6)).intValue();
                                Class<?> cls7 = Class.forName(Wg.Zd("28\u00044\u0001", (short) (C1499aX.Xd() ^ ((275605523 ^ 181010523) ^ (-447167802))), (short) (C1499aX.Xd() ^ ((1995981253 ^ 1265231751) ^ (-1032970215)))));
                                Class<?>[] clsArr7 = new Class[22133743 ^ 22133741];
                                clsArr7[0] = Integer.TYPE;
                                clsArr7[1] = Class.forName(C1561oA.Xd("<+r\b\u001f", (short) (Od.Xd() ^ ((1133351477 ^ 962858292) ^ (-2062126689)))));
                                Object[] objArr7 = new Object[(814145055 ^ 2106762673) ^ 1293188012];
                                objArr7[0] = Integer.valueOf(iIntValue6);
                                objArr7[1] = bx;
                                Method declaredMethod7 = cls7.getDeclaredMethod(Wg.vd("-\u0019", (short) (C1580rY.Xd() ^ (489772460 ^ (-489782500)))), clsArr7);
                                try {
                                    declaredMethod7.setAccessible(true);
                                    return ((Integer) declaredMethod7.invoke(null, objArr7)).intValue();
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            } catch (InvocationTargetException e3) {
                                throw e3.getCause();
                            }
                        } catch (InvocationTargetException e4) {
                            throw e4.getCause();
                        }
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        } catch (InvocationTargetException e8) {
            throw e8.getCause();
        }
    }

    public static int Ox() {
        return ZN.Xd() ^ (582084286 ^ 289121168);
    }

    public static int Qd(int i2, BX bx) {
        Object obj;
        Object obj2;
        Object obj3;
        short sXd = (short) (ZN.Xd() ^ (1194309089 ^ 1194325823));
        int[] iArr = new int["(jmk`".length()];
        QB qb = new QB("(jmk`");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        File[] fileArrListFiles = new File(new String(iArr, 0, i3)).listFiles();
        if (fileArrListFiles == null) {
            return (i2 + 2) - (i2 & 2);
        }
        String strQd = Xg.qd("ve-YR", (short) (FB.Xd() ^ (FB.Xd() ^ (640077891 ^ 2043267643))), (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134261652))));
        int iXd = C1580rY.Xd() ^ (719126906 ^ 458505757);
        int iXd2 = ZN.Xd() ^ (560401350 ^ (-317531738));
        short sXd2 = (short) (Od.Xd() ^ iXd);
        short sXd3 = (short) (Od.Xd() ^ iXd2);
        int[] iArr2 = new int["Gk".length()];
        QB qb2 = new QB("Gk");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd3) ^ sXd2));
            i4++;
        }
        String str = new String(iArr2, 0, i4);
        try {
            Class<?> cls = Class.forName(strQd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        WF[] wfArr = new WF[((String[]) obj).length];
        int i5 = 0;
        while (true) {
            short sXd4 = (short) (C1633zX.Xd() ^ (404949949 ^ (-404956309)));
            short sXd5 = (short) (C1633zX.Xd() ^ (1745331081 ^ (-1745336737)));
            int[] iArr3 = new int[".pm\\}".length()];
            QB qb3 = new QB(".pm\\}");
            int i6 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i6] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((i6 * sXd5) + sXd4)));
                i6++;
            }
            String str2 = new String(iArr3, 0, i6);
            String strUd = C1626yg.Ud("~\u0010", (short) (OY.Xd() ^ (1807898229 ^ 1807892705)), (short) (OY.Xd() ^ ((659789246 ^ 10099796) ^ 667517195)));
            try {
                Class<?> cls2 = Class.forName(str2);
                Field field2 = 0 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
                field2.setAccessible(true);
                obj2 = field2.get(null);
            } catch (Throwable th2) {
                obj2 = null;
            }
            if (i5 >= ((String[]) obj2).length) {
                break;
            }
            String strWd = Ig.wd("k\"zI\u0019", (short) (OY.Xd() ^ (374517948 ^ 374516376)));
            String strOd = EO.Od("7_", (short) (FB.Xd() ^ (851963177 ^ 851953948)));
            try {
                Class<?> cls3 = Class.forName(strWd);
                Field field3 = 0 != 0 ? cls3.getField(strOd) : cls3.getDeclaredField(strOd);
                field3.setAccessible(true);
                obj3 = field3.get(null);
            } catch (Throwable th3) {
                obj3 = null;
            }
            wfArr[i5] = new WF(((String[]) obj3)[i5].getBytes());
            i5++;
        }
        int[][] iArrUd = C1510dN.ud(wfArr);
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                try {
                    Integer.parseInt(file.getName());
                    File file2 = new File(file, C1561oA.Qd("=F<C?C9", (short) (Od.Xd() ^ (1686155497 ^ (-1686148442)))));
                    if (file2.exists()) {
                        i2 = qd(file2, iArrUd, wfArr, i2, bx);
                    }
                } catch (NumberFormatException e2) {
                }
            }
        }
        return i2 | 2;
    }

    public static String Vd() {
        short sXd = (short) (C1607wl.Xd() ^ (585638961 ^ 585633766));
        short sXd2 = (short) (C1607wl.Xd() ^ ((1259557613 ^ 1604998131) ^ 347694979));
        int[] iArr = new int["-T5\tcL\r\\dpp).iW|4".length()];
        QB qb = new QB("-T5\tcL\r\\dpp).iW|4");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        String[] strArrVd = Tg.vd(new String(iArr, 0, i2));
        if (strArrVd == null) {
            return null;
        }
        for (String str : strArrVd) {
            if (str.toLowerCase().contains(C1626yg.Ud("#2FT", (short) (ZN.Xd() ^ ((693159907 ^ 741132124) ^ 92026143)), (short) (ZN.Xd() ^ (FB.Xd() ^ (1209579417 ^ 402104656)))))) {
                short sXd3 = (short) (ZN.Xd() ^ (961054748 ^ 961080569));
                int[] iArr2 = new int["\u0005".length()];
                QB qb2 = new QB("\u0005");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                    i3++;
                }
                return str.substring(str.indexOf(new String(iArr2, 0, i3)) + 1).trim();
            }
        }
        return null;
    }

    public static HashSet Vx() {
        HashSet hashSet = new HashSet();
        byte[] bArr = new byte[C1607wl.Xd() ^ 1849955294];
        // fill-array-data instruction
        bArr[0] = 11;
        bArr[1] = -54;
        bArr[2] = -115;
        bArr[3] = 100;
        hashSet.add(new WF(bArr));
        byte[] bArr2 = new byte[C1633zX.Xd() ^ (1666026502 ^ (-387770423))];
        // fill-array-data instruction
        bArr2[0] = -33;
        bArr2[1] = 44;
        bArr2[2] = -26;
        bArr2[3] = -85;
        hashSet.add(new WF(bArr2));
        byte[] bArr3 = new byte[412690391 ^ 412690387];
        // fill-array-data instruction
        bArr3[0] = -64;
        bArr3[1] = -8;
        bArr3[2] = -27;
        bArr3[3] = -49;
        hashSet.add(new WF(bArr3));
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.reflect.Method] */
    public static void Wd() throws Throwable {
        Method declaredMethod;
        if (hg.Qd()) {
            return;
        }
        BX bx = new BX();
        short sXd = (short) (C1580rY.Xd() ^ ((216044910 ^ 279481) ^ (-216312823)));
        int[] iArr = new int["S\u0019#*:".length()];
        QB qb = new QB("S\u0019#*:");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[C1607wl.Xd() ^ (207349558 ^ 1646261486)];
        clsArr[0] = Integer.TYPE;
        clsArr[1] = Class.forName(C1561oA.Qd("_L\u0012%:", (short) (C1580rY.Xd() ^ (837604612 ^ (-837610948)))));
        Object[] objArr = new Object[(1835873882 ^ 1405632576) ^ 1051031064];
        objArr[0] = 0;
        objArr[1] = bx;
        Method declaredMethod2 = cls.getDeclaredMethod(C1593ug.zd("H^", (short) (C1499aX.Xd() ^ (2038872694 ^ (-2038861995))), (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134237153))), clsArr);
        try {
            declaredMethod2.setAccessible(true);
            if ((((Integer) declaredMethod2.invoke(null, objArr)).intValue() & 4) <= 0) {
                String strYd = C1561oA.Yd("\fzBl\u0006", (short) (C1633zX.Xd() ^ ((1163099347 ^ 188552371) ^ (-1315849138))));
                String strQd = Xg.qd("\u007f\r", (short) (C1633zX.Xd() ^ (416160031 ^ (-416184191))), (short) (C1633zX.Xd() ^ ((1340345097 ^ 1361763347) ^ (-516876326))));
                try {
                    Class<?> cls2 = Class.forName(strYd);
                    boolean z2 = false;
                    try {
                        strQd = cls2.getDeclaredMethod(strQd, new Class[0]);
                        declaredMethod = strQd;
                    } catch (NoSuchMethodException e2) {
                        z2 = true;
                        declaredMethod = cls2.getDeclaredMethod(strQd, Class.forName(Jg.Wd("_k\\iaZp9it\u000fs_ih!Qzv\u001c\b\u001ar", (short) (C1607wl.Xd() ^ ((1530371749 ^ 2053008032) ^ 560570545)), (short) (C1607wl.Xd() ^ ((744835519 ^ 2119311226) ^ 1379350012)))));
                    }
                    if (!z2) {
                        declaredMethod.invoke(null, new Object[0]);
                        return;
                    }
                    Object[] objArr2 = new Object[1];
                    Object[] objArr3 = new Object[0];
                    Method declaredMethod3 = Class.forName(ZO.xd(" ?\u007f*d", (short) (OY.Xd() ^ ((1804352451 ^ 1408526064) ^ 947403421)), (short) (OY.Xd() ^ ((1504896710 ^ 2095116524) ^ 626131986)))).getDeclaredMethod(C1626yg.Ud("t\u0018", (short) (ZN.Xd() ^ ((281058017 ^ 1584976586) ^ 1320695348)), (short) (ZN.Xd() ^ ((927484370 ^ 317578179) ^ 631605398))), new Class[0]);
                    try {
                        declaredMethod3.setAccessible(true);
                        objArr2[0] = (Context) declaredMethod3.invoke(null, objArr3);
                        declaredMethod.invoke(null, objArr2);
                        return;
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    C1597vN.Xd(e4.getTargetException());
                    return;
                } catch (Exception e5) {
                    return;
                }
            }
            int i3 = (1360071753 ^ 466956668) ^ 1254374716;
            int i4 = (1122030357 ^ 932499860) ^ 1970836208;
            Class<?> cls3 = Class.forName(C1561oA.od("jW\u001dU8", (short) (C1633zX.Xd() ^ ((587102594 ^ 1145388023) ^ (-1723558891)))));
            Class<?>[] clsArr2 = new Class[(834401247 ^ 46812211) ^ 863092712];
            clsArr2[0] = Integer.TYPE;
            clsArr2[1] = Integer.TYPE;
            clsArr2[1811791645 ^ 1811791647] = Integer.TYPE;
            int i5 = 141765119 ^ 141765116;
            short sXd2 = (short) (FB.Xd() ^ (1437624968 ^ 1437622490));
            int[] iArr2 = new int["TC\u000b5C".length()];
            QB qb2 = new QB("TC\u000b5C");
            int i6 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i6] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i6));
                i6++;
            }
            clsArr2[i5] = Class.forName(new String(iArr2, 0, i6));
            Object[] objArr4 = new Object[115762837 ^ 115762833];
            objArr4[0] = Integer.valueOf(i3);
            objArr4[1] = Integer.valueOf(i4);
            objArr4[1032944397 ^ 1032944399] = 1;
            objArr4[(841160839 ^ 336953401) ^ 641112253] = bx;
            Method declaredMethod4 = cls3.getDeclaredMethod(Wg.Zd("\u0003\u0017", (short) (OY.Xd() ^ ((365981857 ^ 1253353363) ^ 1600431494)), (short) (OY.Xd() ^ ((535856931 ^ 487469069) ^ 50264788))), clsArr2);
            try {
                declaredMethod4.setAccessible(true);
                boolean zBooleanValue = ((Boolean) declaredMethod4.invoke(null, objArr4)).booleanValue();
                short sXd3 = (short) (FB.Xd() ^ (1621607627 ^ 1621613288));
                int[] iArr3 = new int["m\\$JQ".length()];
                QB qb3 = new QB("m\\$JQ");
                int i7 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i7] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i7));
                    i7++;
                }
                String str = new String(iArr3, 0, i7);
                String strVd = Wg.vd("VE", (short) (C1607wl.Xd() ^ ((1827163337 ^ 587432479) ^ 1340835047)));
                Class<?> cls4 = Class.forName(Qg.kd("\u001e\u000bP\tk", (short) (C1633zX.Xd() ^ (781869640 ^ (-781855671))), (short) (C1633zX.Xd() ^ ((99859327 ^ 450566667) ^ (-522749571)))));
                Class<?>[] clsArr3 = new Class[349810640 ^ 349810643];
                clsArr3[0] = Class.forName(hg.Vd("3)='r0$0(m\u00122/%)!", (short) (OY.Xd() ^ (335174418 ^ 335168787)), (short) (OY.Xd() ^ (868582192 ^ 868592003))));
                short sXd4 = (short) (C1607wl.Xd() ^ ((580920633 ^ 933088392) ^ 356378008));
                int[] iArr4 = new int["7-A+v4(4,q\u001663)-%".length()];
                QB qb4 = new QB("7-A+v4(4,q\u001663)-%");
                int i8 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i8] = xuXd4.fK(sXd4 + i8 + xuXd4.CK(iKK4));
                    i8++;
                }
                clsArr3[1] = Class.forName(new String(iArr4, 0, i8));
                clsArr3[1245967630 ^ 1245967628] = Boolean.TYPE;
                Object[] objArr5 = new Object[654314982 ^ 654314981];
                objArr5[0] = str;
                objArr5[1] = strVd;
                objArr5[(1538994856 ^ 1598693328) ^ 82914682] = Boolean.valueOf(zBooleanValue);
                Method declaredMethod5 = cls4.getDeclaredMethod(C1561oA.yd("p\u0005", (short) (C1499aX.Xd() ^ ((2066318937 ^ 1583146188) ^ (-628428684)))), clsArr3);
                try {
                    declaredMethod5.setAccessible(true);
                    declaredMethod5.invoke(null, objArr5);
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        } catch (InvocationTargetException e8) {
            throw e8.getCause();
        }
    }

    public static int Xd(int i2, BX bx) {
        Object obj;
        Object obj2;
        Object obj3;
        int i3 = 653042620 ^ 653042622;
        WF[] wfArr = new WF[i3];
        wfArr[0] = new WF(C1561oA.Xd("Ϩ^\\V[h`\\Zyb]aedt\u0001", (short) (ZN.Xd() ^ (OY.Xd() ^ 69957739))).getBytes());
        short sXd = (short) (OY.Xd() ^ (1222337738 ^ 1222326822));
        int[] iArr = new int["҇:6.9D:4(r,%/1.<".length()];
        QB qb = new QB("҇:6.9D:4(r,%/1.<");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK((sXd ^ i4) + xuXd.CK(iKK));
            i4++;
        }
        wfArr[1] = new WF(new String(iArr, 0, i4).getBytes());
        String strKd = Qg.kd("@-r\u001d\u0014", (short) (C1633zX.Xd() ^ ((1113708525 ^ 562008318) ^ (-1662925806))), (short) (C1633zX.Xd() ^ ((763991841 ^ 570890619) ^ (-261018402))));
        short sXd2 = (short) (C1633zX.Xd() ^ (1643950768 ^ (-1643938225)));
        short sXd3 = (short) (C1633zX.Xd() ^ ((2114818637 ^ 1650039864) ^ (-475269754)));
        int[] iArr2 = new int["\u0018\u0006".length()];
        QB qb2 = new QB("\u0018\u0006");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK(sXd2 + i5 + xuXd2.CK(iKK2) + sXd3);
            i5++;
        }
        String str = new String(iArr2, 0, i5);
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        if (CK.Kd(wfArr, (Set) obj) != (1102800135 ^ (-1102800136))) {
            i2 = (i2 + 12) - (i2 & 12);
            String strUd = C1561oA.ud("\u000f{Az_", (short) (Od.Xd() ^ ((666383081 ^ 2069243117) ^ (-1559104807))));
            String strYd = C1561oA.yd("q}", (short) (C1633zX.Xd() ^ ((2087456085 ^ 1947841452) ^ (-141931402))));
            try {
                Class<?> cls2 = Class.forName(strUd);
                Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                field2.setAccessible(true);
                obj2 = field2.get(null);
            } catch (Throwable th2) {
                obj2 = null;
            }
            Ao aoPX = bx.PX((EnumC1527hN) obj2);
            String strYd2 = C1561oA.Yd("VE\rVE", (short) (C1580rY.Xd() ^ ((673728473 ^ 1955926595) ^ (-1555901045))));
            short sXd4 = (short) (C1580rY.Xd() ^ ((601594916 ^ 33345357) ^ (-572991116)));
            short sXd5 = (short) (C1580rY.Xd() ^ ((1600456631 ^ 320800077) ^ (-1283066605)));
            int[] iArr3 = new int["Zf".length()];
            QB qb3 = new QB("Zf");
            int i6 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i6] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i6)) + sXd5);
                i6++;
            }
            String str2 = new String(iArr3, 0, i6);
            try {
                Class<?> cls3 = Class.forName(strYd2);
                Field field3 = 0 != 0 ? cls3.getField(str2) : cls3.getDeclaredField(str2);
                field3.setAccessible(true);
                obj3 = field3.get(null);
            } catch (Throwable th3) {
                obj3 = null;
            }
            aoPX.SX((EnumC1599vd) obj3, null);
        }
        return (-1) - (((-1) - i2) & ((-1) - i3));
    }

    private static boolean YX(String str) {
        Object obj;
        String[] strArrVd = Tg.vd(str);
        if (strArrVd == null || strArrVd.length < 1) {
            return false;
        }
        String strZd = C1593ug.zd("]L\u0014@9", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (1668810226 ^ (-222056736)))), (short) (C1499aX.Xd() ^ ((367540575 ^ 711966143) ^ (-1065861967))));
        String strOd = C1561oA.od("ug", (short) (C1499aX.Xd() ^ (1659297054 ^ (-1659276317))));
        try {
            Class<?> cls = Class.forName(strZd);
            Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        for (String str2 : (String[]) obj) {
            if (BX(strArrVd[0].toLowerCase(), str2)) {
                return true;
            }
        }
        return false;
    }

    public static int Yd(int i2, BX bx) {
        Object obj;
        Object obj2;
        String strVd = Vd();
        if (strVd != null) {
            StringBuilder sb = new StringBuilder();
            int iXd = FB.Xd() ^ (294476870 ^ (-1315077962));
            short sXd = (short) (C1633zX.Xd() ^ ((685535754 ^ 1999471038) ^ (-1609678769)));
            short sXd2 = (short) (C1633zX.Xd() ^ iXd);
            int[] iArr = new int["\u0007GHD7\u0002".length()];
            QB qb = new QB("\u0007GHD7\u0002");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
                i3++;
            }
            String[] strArrVd = Tg.vd(sb.append(new String(iArr, 0, i3)).append(strVd).append(hg.Vd("M\u0011\u0011|\u000f\u000f\f", (short) (OY.Xd() ^ ((1934146633 ^ 433903319) ^ 1788104523)), (short) (OY.Xd() ^ (1317009985 ^ 1317001437)))).toString());
            if (strArrVd != null) {
                int length = strArrVd.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    String str = strArrVd[i4];
                    if (str.toLowerCase().contains(C1561oA.ud("VHSJ", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849960831)))))) {
                        String strTrim = str.split(C1561oA.yd("\f", (short) (C1633zX.Xd() ^ ((956958955 ^ 190763708) ^ (-844400059)))))[1].trim();
                        if (strTrim.toLowerCase().contains(C1561oA.Yd("vventf", (short) (C1499aX.Xd() ^ (1055548002 ^ (-1055544440)))))) {
                            continue;
                        } else {
                            if (!strTrim.toLowerCase().contains(Xg.qd("^S\\b", (short) (C1633zX.Xd() ^ ((31699365 ^ 261996650) ^ (-243166303))), (short) (C1633zX.Xd() ^ (Od.Xd() ^ (1120944405 ^ (-86868662))))))) {
                                i2 = (-1) - (((-1) - i2) & ((-1) - 36));
                                String strWd = Jg.Wd("=\u000ftTc", (short) (FB.Xd() ^ (ZN.Xd() ^ (1064337083 ^ 217718554))), (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134254878))));
                                String strXd = ZO.xd("^g", (short) (Od.Xd() ^ ((1745612406 ^ 765894408) ^ (-1168982172))), (short) (Od.Xd() ^ (Od.Xd() ^ (-1207825641))));
                                try {
                                    Class<?> cls = Class.forName(strWd);
                                    Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                                    field.setAccessible(true);
                                    obj = field.get(null);
                                } catch (Throwable th) {
                                    obj = null;
                                }
                                Ao aoPX = bx.PX((EnumC1527hN) obj);
                                String strUd = C1626yg.Ud("\u0004\u000b]D\u0014", (short) (ZN.Xd() ^ (1855358912 ^ 1855376034)), (short) (ZN.Xd() ^ ((982085703 ^ 1062753703) ^ 97613929)));
                                short sXd3 = (short) (ZN.Xd() ^ (1310926445 ^ 1310924334));
                                int[] iArr2 = new int[":O".length()];
                                QB qb2 = new QB(":O");
                                int i5 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd3 + i5)));
                                    i5++;
                                }
                                String str2 = new String(iArr2, 0, i5);
                                try {
                                    Class<?> cls2 = Class.forName(strUd);
                                    Field field2 = 0 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
                                    field2.setAccessible(true);
                                    obj2 = field2.get(null);
                                } catch (Throwable th2) {
                                    obj2 = null;
                                }
                                aoPX.SX((EnumC1599vd) obj2, null);
                            }
                        }
                    }
                    i4++;
                }
            }
        }
        return (-1) - (((-1) - i2) & ((-1) - 2));
    }

    public static int[] jx() {
        return new int[0];
    }

    public static String kd() {
        return Xg.qd(";*q\u001e\u0017", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (1295508856 ^ (-316196934)))), (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (1281043416 ^ (-572487513)))));
    }

    public static HashSet kx() {
        return new HashSet();
    }

    public static HashSet lx() {
        HashSet hashSet = new HashSet();
        byte[] bArr = new byte[Od.Xd() ^ (1513917452 ^ 499193977)];
        // fill-array-data instruction
        bArr[0] = -121;
        bArr[1] = 65;
        bArr[2] = -102;
        bArr[3] = 120;
        bArr[4] = 19;
        bArr[5] = -29;
        bArr[6] = -115;
        bArr[7] = 69;
        bArr[8] = -108;
        bArr[9] = 12;
        bArr[10] = 10;
        bArr[11] = 35;
        bArr[12] = 101;
        bArr[13] = 44;
        bArr[14] = 12;
        bArr[15] = -51;
        bArr[16] = -55;
        bArr[17] = -26;
        bArr[18] = -122;
        bArr[19] = -72;
        bArr[20] = -87;
        bArr[21] = 42;
        bArr[22] = -94;
        bArr[23] = -55;
        bArr[24] = 38;
        bArr[25] = -48;
        bArr[26] = -107;
        bArr[27] = 9;
        bArr[28] = 87;
        bArr[29] = 81;
        bArr[30] = 41;
        bArr[31] = -29;
        hashSet.add(new WF(bArr));
        byte[] bArr2 = new byte[OY.Xd() ^ 69929160];
        // fill-array-data instruction
        bArr2[0] = -17;
        bArr2[1] = 31;
        bArr2[2] = -95;
        bArr2[3] = 118;
        bArr2[4] = -27;
        bArr2[5] = 78;
        bArr2[6] = 30;
        bArr2[7] = -79;
        bArr2[8] = 100;
        bArr2[9] = -48;
        bArr2[10] = 82;
        bArr2[11] = 32;
        bArr2[12] = -41;
        bArr2[13] = -53;
        bArr2[14] = 116;
        bArr2[15] = 117;
        bArr2[16] = -26;
        bArr2[17] = -15;
        bArr2[18] = -3;
        bArr2[19] = -38;
        bArr2[20] = 99;
        bArr2[21] = -43;
        bArr2[22] = -111;
        bArr2[23] = 41;
        bArr2[24] = 58;
        bArr2[25] = 20;
        bArr2[26] = -53;
        bArr2[27] = -86;
        bArr2[28] = -112;
        bArr2[29] = 5;
        bArr2[30] = 68;
        bArr2[31] = -118;
        hashSet.add(new WF(bArr2));
        byte[] bArr3 = new byte[282817166 ^ 282817198];
        // fill-array-data instruction
        bArr3[0] = 12;
        bArr3[1] = -116;
        bArr3[2] = 29;
        bArr3[3] = 118;
        bArr3[4] = 17;
        bArr3[5] = -33;
        bArr3[6] = 28;
        bArr3[7] = -122;
        bArr3[8] = -9;
        bArr3[9] = 15;
        bArr3[10] = 92;
        bArr3[11] = 37;
        bArr3[12] = 100;
        bArr3[13] = -45;
        bArr3[14] = -68;
        bArr3[15] = -10;
        bArr3[16] = -120;
        bArr3[17] = -123;
        bArr3[18] = 0;
        bArr3[19] = -117;
        bArr3[20] = 8;
        bArr3[21] = 81;
        bArr3[22] = 38;
        bArr3[23] = -31;
        bArr3[24] = 113;
        bArr3[25] = 89;
        bArr3[26] = -17;
        bArr3[27] = -124;
        bArr3[28] = 16;
        bArr3[29] = 105;
        bArr3[30] = -36;
        bArr3[31] = -30;
        hashSet.add(new WF(bArr3));
        byte[] bArr4 = new byte[C1607wl.Xd() ^ 1849955322];
        // fill-array-data instruction
        bArr4[0] = -100;
        bArr4[1] = 96;
        bArr4[2] = 87;
        bArr4[3] = 33;
        bArr4[4] = 36;
        bArr4[5] = 103;
        bArr4[6] = -15;
        bArr4[7] = -89;
        bArr4[8] = 117;
        bArr4[9] = -61;
        bArr4[10] = 92;
        bArr4[11] = 108;
        bArr4[12] = 23;
        bArr4[13] = 46;
        bArr4[14] = -124;
        bArr4[15] = 123;
        bArr4[16] = -50;
        bArr4[17] = 48;
        bArr4[18] = 84;
        bArr4[19] = 68;
        bArr4[20] = -45;
        bArr4[21] = -6;
        bArr4[22] = -49;
        bArr4[23] = -33;
        bArr4[24] = -127;
        bArr4[25] = -34;
        bArr4[26] = 88;
        bArr4[27] = 12;
        bArr4[28] = -69;
        bArr4[29] = -104;
        bArr4[30] = -32;
        bArr4[31] = -59;
        hashSet.add(new WF(bArr4));
        byte[] bArr5 = new byte[OY.Xd() ^ (374118547 ^ 308777051)];
        // fill-array-data instruction
        bArr5[0] = -61;
        bArr5[1] = 15;
        bArr5[2] = -5;
        bArr5[3] = 30;
        bArr5[4] = 13;
        bArr5[5] = -72;
        bArr5[6] = -116;
        bArr5[7] = 31;
        bArr5[8] = -97;
        bArr5[9] = 34;
        bArr5[10] = 97;
        bArr5[11] = -73;
        bArr5[12] = 29;
        bArr5[13] = 121;
        bArr5[14] = 88;
        bArr5[15] = 81;
        bArr5[16] = -107;
        bArr5[17] = -78;
        bArr5[18] = 70;
        bArr5[19] = 107;
        bArr5[20] = 0;
        bArr5[21] = -47;
        bArr5[22] = 71;
        bArr5[23] = 22;
        bArr5[24] = -97;
        bArr5[25] = -6;
        bArr5[26] = -93;
        bArr5[27] = -127;
        bArr5[28] = -86;
        bArr5[29] = 94;
        bArr5[30] = -107;
        bArr5[31] = -17;
        hashSet.add(new WF(bArr5));
        byte[] bArr6 = new byte[(1969359579 ^ 830198311) ^ 1142544604];
        // fill-array-data instruction
        bArr6[0] = 95;
        bArr6[1] = 98;
        bArr6[2] = -123;
        bArr6[3] = -96;
        bArr6[4] = 28;
        bArr6[5] = -62;
        bArr6[6] = 37;
        bArr6[7] = 33;
        bArr6[8] = 95;
        bArr6[9] = 63;
        bArr6[10] = -67;
        bArr6[11] = -85;
        bArr6[12] = 92;
        bArr6[13] = -71;
        bArr6[14] = 119;
        bArr6[15] = 29;
        bArr6[16] = -123;
        bArr6[17] = 15;
        bArr6[18] = 7;
        bArr6[19] = -4;
        bArr6[20] = -121;
        bArr6[21] = 3;
        bArr6[22] = 55;
        bArr6[23] = -51;
        bArr6[24] = 19;
        bArr6[25] = -87;
        bArr6[26] = -109;
        bArr6[27] = -13;
        bArr6[28] = 106;
        bArr6[29] = -61;
        bArr6[30] = -4;
        bArr6[31] = -15;
        hashSet.add(new WF(bArr6));
        byte[] bArr7 = new byte[(1338095182 ^ 443853576) ^ 1437932902];
        // fill-array-data instruction
        bArr7[0] = -126;
        bArr7[1] = -46;
        bArr7[2] = -122;
        bArr7[3] = -37;
        bArr7[4] = 52;
        bArr7[5] = 1;
        bArr7[6] = -71;
        bArr7[7] = 100;
        bArr7[8] = -20;
        bArr7[9] = 85;
        bArr7[10] = 103;
        bArr7[11] = -56;
        bArr7[12] = -35;
        bArr7[13] = 85;
        bArr7[14] = -15;
        bArr7[15] = 0;
        bArr7[16] = -27;
        bArr7[17] = 34;
        bArr7[18] = -105;
        bArr7[19] = 81;
        bArr7[20] = -58;
        bArr7[21] = 84;
        bArr7[22] = -122;
        bArr7[23] = -122;
        bArr7[24] = 45;
        bArr7[25] = 109;
        bArr7[26] = 55;
        bArr7[27] = 11;
        bArr7[28] = 127;
        bArr7[29] = 108;
        bArr7[30] = 94;
        bArr7[31] = -6;
        hashSet.add(new WF(bArr7));
        byte[] bArr8 = new byte[Od.Xd() ^ (285609605 ^ 1459329776)];
        // fill-array-data instruction
        bArr8[0] = -51;
        bArr8[1] = 48;
        bArr8[2] = 125;
        bArr8[3] = -17;
        bArr8[4] = -119;
        bArr8[5] = -7;
        bArr8[6] = -55;
        bArr8[7] = 69;
        bArr8[8] = -98;
        bArr8[9] = -48;
        bArr8[10] = -98;
        bArr8[11] = 39;
        bArr8[12] = -98;
        bArr8[13] = -28;
        bArr8[14] = 8;
        bArr8[15] = -84;
        bArr8[16] = -80;
        bArr8[17] = 127;
        bArr8[18] = 66;
        bArr8[19] = 102;
        bArr8[20] = -89;
        bArr8[21] = 53;
        bArr8[22] = 117;
        bArr8[23] = -71;
        bArr8[24] = 124;
        bArr8[25] = 29;
        bArr8[26] = -108;
        bArr8[27] = -122;
        bArr8[28] = -67;
        bArr8[29] = 49;
        bArr8[30] = -33;
        bArr8[31] = 49;
        hashSet.add(new WF(bArr8));
        byte[] bArr9 = new byte[C1499aX.Xd() ^ (-1134257972)];
        // fill-array-data instruction
        bArr9[0] = -19;
        bArr9[1] = -123;
        bArr9[2] = 23;
        bArr9[3] = 43;
        bArr9[4] = 67;
        bArr9[5] = 106;
        bArr9[6] = 86;
        bArr9[7] = -37;
        bArr9[8] = 30;
        bArr9[9] = -86;
        bArr9[10] = -86;
        bArr9[11] = 32;
        bArr9[12] = 71;
        bArr9[13] = 21;
        bArr9[14] = -83;
        bArr9[15] = -67;
        bArr9[16] = 116;
        bArr9[17] = -102;
        bArr9[18] = -88;
        bArr9[19] = -90;
        bArr9[20] = 120;
        bArr9[21] = -70;
        bArr9[22] = 11;
        bArr9[23] = 17;
        bArr9[24] = 124;
        bArr9[25] = 95;
        bArr9[26] = -81;
        bArr9[27] = 89;
        bArr9[28] = -72;
        bArr9[29] = 68;
        bArr9[30] = -67;
        bArr9[31] = 58;
        hashSet.add(new WF(bArr9));
        byte[] bArr10 = new byte[Od.Xd() ^ (1245997372 ^ 230292809)];
        // fill-array-data instruction
        bArr10[0] = -53;
        bArr10[1] = -72;
        bArr10[2] = 9;
        bArr10[3] = 77;
        bArr10[4] = 15;
        bArr10[5] = 10;
        bArr10[6] = 88;
        bArr10[7] = -21;
        bArr10[8] = -95;
        bArr10[9] = 99;
        bArr10[10] = -51;
        bArr10[11] = -118;
        bArr10[12] = 111;
        bArr10[13] = -28;
        bArr10[14] = 72;
        bArr10[15] = -40;
        bArr10[16] = 61;
        bArr10[17] = 62;
        bArr10[18] = 65;
        bArr10[19] = -117;
        bArr10[20] = 85;
        bArr10[21] = -51;
        bArr10[22] = -37;
        bArr10[23] = 13;
        bArr10[24] = -17;
        bArr10[25] = -5;
        bArr10[26] = -12;
        bArr10[27] = -113;
        bArr10[28] = 106;
        bArr10[29] = 29;
        bArr10[30] = -15;
        bArr10[31] = -19;
        hashSet.add(new WF(bArr10));
        byte[] bArr11 = new byte[ZN.Xd() ^ (775296989 ^ 498870541)];
        // fill-array-data instruction
        bArr11[0] = 91;
        bArr11[1] = -97;
        bArr11[2] = -6;
        bArr11[3] = 108;
        bArr11[4] = -23;
        bArr11[5] = -119;
        bArr11[6] = 36;
        bArr11[7] = 95;
        bArr11[8] = 3;
        bArr11[9] = -18;
        bArr11[10] = -15;
        bArr11[11] = 32;
        bArr11[12] = 111;
        bArr11[13] = 24;
        bArr11[14] = 81;
        bArr11[15] = -69;
        bArr11[16] = -75;
        bArr11[17] = 122;
        bArr11[18] = 78;
        bArr11[19] = -80;
        bArr11[20] = 10;
        bArr11[21] = 103;
        bArr11[22] = -17;
        bArr11[23] = -109;
        bArr11[24] = 54;
        bArr11[25] = -109;
        bArr11[26] = -67;
        bArr11[27] = -24;
        bArr11[28] = 65;
        bArr11[29] = 48;
        bArr11[30] = 53;
        bArr11[31] = 34;
        hashSet.add(new WF(bArr11));
        byte[] bArr12 = new byte[420809208 ^ 420809176];
        // fill-array-data instruction
        bArr12[0] = -63;
        bArr12[1] = -46;
        bArr12[2] = -33;
        bArr12[3] = 109;
        bArr12[4] = 79;
        bArr12[5] = 71;
        bArr12[6] = 7;
        bArr12[7] = 13;
        bArr12[8] = -110;
        bArr12[9] = -43;
        bArr12[10] = 122;
        bArr12[11] = 119;
        bArr12[12] = 74;
        bArr12[13] = 41;
        bArr12[14] = 45;
        bArr12[15] = 62;
        bArr12[16] = 119;
        bArr12[17] = 109;
        bArr12[18] = 60;
        bArr12[19] = 83;
        bArr12[20] = -57;
        bArr12[21] = 59;
        bArr12[22] = -35;
        bArr12[23] = -56;
        bArr12[24] = 76;
        bArr12[25] = -127;
        bArr12[26] = -73;
        bArr12[27] = -64;
        bArr12[28] = 26;
        bArr12[29] = 83;
        bArr12[30] = -38;
        bArr12[31] = 81;
        hashSet.add(new WF(bArr12));
        byte[] bArr13 = new byte[(1273381120 ^ 1996474850) ^ 1025083586];
        // fill-array-data instruction
        bArr13[0] = -71;
        bArr13[1] = -21;
        bArr13[2] = 117;
        bArr13[3] = 34;
        bArr13[4] = -67;
        bArr13[5] = 62;
        bArr13[6] = 21;
        bArr13[7] = -118;
        bArr13[8] = 114;
        bArr13[9] = 72;
        bArr13[10] = -106;
        bArr13[11] = 108;
        bArr13[12] = 124;
        bArr13[13] = -74;
        bArr13[14] = -98;
        bArr13[15] = -108;
        bArr13[16] = -47;
        bArr13[17] = 76;
        bArr13[18] = -94;
        bArr13[19] = 83;
        bArr13[20] = -77;
        bArr13[21] = 14;
        bArr13[22] = -59;
        bArr13[23] = -88;
        bArr13[24] = -52;
        bArr13[25] = 108;
        bArr13[26] = 74;
        bArr13[27] = -95;
        bArr13[28] = 10;
        bArr13[29] = -57;
        bArr13[30] = 71;
        bArr13[31] = -111;
        hashSet.add(new WF(bArr13));
        byte[] bArr14 = new byte[C1580rY.Xd() ^ (901057011 ^ (-71048654))];
        // fill-array-data instruction
        bArr14[0] = 24;
        bArr14[1] = 63;
        bArr14[2] = 46;
        bArr14[3] = 4;
        bArr14[4] = -76;
        bArr14[5] = 70;
        bArr14[6] = 73;
        bArr14[7] = -52;
        bArr14[8] = -124;
        bArr14[9] = 104;
        bArr14[10] = -107;
        bArr14[11] = 17;
        bArr14[12] = -105;
        bArr14[13] = -15;
        bArr14[14] = 93;
        bArr14[15] = 38;
        bArr14[16] = 8;
        bArr14[17] = -99;
        bArr14[18] = 111;
        bArr14[19] = 20;
        bArr14[20] = -36;
        bArr14[21] = 38;
        bArr14[22] = 17;
        bArr14[23] = 21;
        bArr14[24] = 5;
        bArr14[25] = 111;
        bArr14[26] = 81;
        bArr14[27] = 95;
        bArr14[28] = -38;
        bArr14[29] = 32;
        bArr14[30] = 38;
        bArr14[31] = -15;
        hashSet.add(new WF(bArr14));
        byte[] bArr15 = new byte[1509093696 ^ 1509093728];
        // fill-array-data instruction
        bArr15[0] = -1;
        bArr15[1] = 8;
        bArr15[2] = 79;
        bArr15[3] = -31;
        bArr15[4] = 74;
        bArr15[5] = -125;
        bArr15[6] = -83;
        bArr15[7] = -110;
        bArr15[8] = 7;
        bArr15[9] = -122;
        bArr15[10] = -8;
        bArr15[11] = 72;
        bArr15[12] = -119;
        bArr15[13] = 91;
        bArr15[14] = 126;
        bArr15[15] = -106;
        bArr15[16] = -82;
        bArr15[17] = 25;
        bArr15[18] = -63;
        bArr15[19] = 21;
        bArr15[20] = -42;
        bArr15[21] = 7;
        bArr15[22] = 62;
        bArr15[23] = -36;
        bArr15[24] = 123;
        bArr15[25] = -19;
        bArr15[26] = -79;
        bArr15[27] = 104;
        bArr15[28] = 29;
        bArr15[29] = 49;
        bArr15[30] = -36;
        bArr15[31] = -49;
        hashSet.add(new WF(bArr15));
        byte[] bArr16 = new byte[C1633zX.Xd() ^ (-1951491093)];
        // fill-array-data instruction
        bArr16[0] = 104;
        bArr16[1] = 95;
        bArr16[2] = -30;
        bArr16[3] = -111;
        bArr16[4] = -49;
        bArr16[5] = 81;
        bArr16[6] = 20;
        bArr16[7] = 45;
        bArr16[8] = 113;
        bArr16[9] = 76;
        bArr16[10] = -37;
        bArr16[11] = -89;
        bArr16[12] = 125;
        bArr16[13] = -77;
        bArr16[14] = 114;
        bArr16[15] = 10;
        bArr16[16] = 3;
        bArr16[17] = 31;
        bArr16[18] = 83;
        bArr16[19] = -35;
        bArr16[20] = 86;
        bArr16[21] = -9;
        bArr16[22] = 90;
        bArr16[23] = 107;
        bArr16[24] = 100;
        bArr16[25] = -98;
        bArr16[26] = 40;
        bArr16[27] = 106;
        bArr16[28] = 83;
        bArr16[29] = 68;
        bArr16[30] = 99;
        bArr16[31] = 106;
        hashSet.add(new WF(bArr16));
        byte[] bArr17 = new byte[FB.Xd() ^ (2020520761 ^ 662821930)];
        // fill-array-data instruction
        bArr17[0] = -4;
        bArr17[1] = -33;
        bArr17[2] = 63;
        bArr17[3] = -19;
        bArr17[4] = -102;
        bArr17[5] = 75;
        bArr17[6] = -4;
        bArr17[7] = 85;
        bArr17[8] = 126;
        bArr17[9] = -64;
        bArr17[10] = 21;
        bArr17[11] = -50;
        bArr17[12] = -21;
        bArr17[13] = 111;
        bArr17[14] = 14;
        bArr17[15] = -109;
        bArr17[16] = 93;
        bArr17[17] = 63;
        bArr17[18] = 124;
        bArr17[19] = -36;
        bArr17[20] = 8;
        bArr17[21] = 54;
        bArr17[22] = -14;
        bArr17[23] = -91;
        bArr17[24] = 60;
        bArr17[25] = 86;
        bArr17[26] = -53;
        bArr17[27] = 48;
        bArr17[28] = 19;
        bArr17[29] = -84;
        bArr17[30] = 93;
        bArr17[31] = -52;
        hashSet.add(new WF(bArr17));
        byte[] bArr18 = new byte[FB.Xd() ^ (5152767 ^ 1604448492)];
        // fill-array-data instruction
        bArr18[0] = -38;
        bArr18[1] = -36;
        bArr18[2] = 82;
        bArr18[3] = -57;
        bArr18[4] = 118;
        bArr18[5] = -101;
        bArr18[6] = 36;
        bArr18[7] = -43;
        bArr18[8] = -125;
        bArr18[9] = 120;
        bArr18[10] = -41;
        bArr18[11] = 4;
        bArr18[12] = 20;
        bArr18[13] = 63;
        bArr18[14] = -22;
        bArr18[15] = 0;
        bArr18[16] = 53;
        bArr18[17] = 25;
        bArr18[18] = -45;
        bArr18[19] = -72;
        bArr18[20] = 60;
        bArr18[21] = 114;
        bArr18[22] = -26;
        bArr18[23] = -82;
        bArr18[24] = 24;
        bArr18[25] = 29;
        bArr18[26] = -117;
        bArr18[27] = 51;
        bArr18[28] = -103;
        bArr18[29] = -14;
        bArr18[30] = 45;
        bArr18[31] = -112;
        hashSet.add(new WF(bArr18));
        byte[] bArr19 = new byte[1417141082 ^ 1417141114];
        // fill-array-data instruction
        bArr19[0] = 64;
        bArr19[1] = -49;
        bArr19[2] = -75;
        bArr19[3] = -128;
        bArr19[4] = 56;
        bArr19[5] = -86;
        bArr19[6] = 77;
        bArr19[7] = -73;
        bArr19[8] = -128;
        bArr19[9] = 74;
        bArr19[10] = -42;
        bArr19[11] = -8;
        bArr19[12] = -77;
        bArr19[13] = -71;
        bArr19[14] = -114;
        bArr19[15] = -4;
        bArr19[16] = 59;
        bArr19[17] = -40;
        bArr19[18] = 4;
        bArr19[19] = 86;
        bArr19[20] = -111;
        bArr19[21] = 117;
        bArr19[22] = 46;
        bArr19[23] = 6;
        bArr19[24] = -39;
        bArr19[25] = 102;
        bArr19[26] = 10;
        bArr19[27] = 78;
        bArr19[28] = -57;
        bArr19[29] = 72;
        bArr19[30] = -105;
        bArr19[31] = 73;
        hashSet.add(new WF(bArr19));
        byte[] bArr20 = new byte[349933799 ^ 349933767];
        // fill-array-data instruction
        bArr20[0] = 91;
        bArr20[1] = -23;
        bArr20[2] = -21;
        bArr20[3] = 36;
        bArr20[4] = -68;
        bArr20[5] = 16;
        bArr20[6] = 31;
        bArr20[7] = 4;
        bArr20[8] = -126;
        bArr20[9] = 69;
        bArr20[10] = -85;
        bArr20[11] = 61;
        bArr20[12] = 55;
        bArr20[13] = 127;
        bArr20[14] = -119;
        bArr20[15] = 38;
        bArr20[16] = 79;
        bArr20[17] = 89;
        bArr20[18] = 98;
        bArr20[19] = -68;
        bArr20[20] = 68;
        bArr20[21] = 23;
        bArr20[22] = -98;
        bArr20[23] = 125;
        bArr20[24] = -126;
        bArr20[25] = 1;
        bArr20[26] = 54;
        bArr20[27] = -73;
        bArr20[28] = -37;
        bArr20[29] = -84;
        bArr20[30] = -30;
        bArr20[31] = 97;
        hashSet.add(new WF(bArr20));
        byte[] bArr21 = new byte[Od.Xd() ^ (1288609207 ^ 187894210)];
        // fill-array-data instruction
        bArr21[0] = -27;
        bArr21[1] = -33;
        bArr21[2] = -125;
        bArr21[3] = 100;
        bArr21[4] = 6;
        bArr21[5] = 21;
        bArr21[6] = -114;
        bArr21[7] = 104;
        bArr21[8] = 61;
        bArr21[9] = 70;
        bArr21[10] = 72;
        bArr21[11] = -37;
        bArr21[12] = 118;
        bArr21[13] = 62;
        bArr21[14] = 60;
        bArr21[15] = -98;
        bArr21[16] = 41;
        bArr21[17] = 19;
        bArr21[18] = -55;
        bArr21[19] = -126;
        bArr21[20] = 99;
        bArr21[21] = 54;
        bArr21[22] = 49;
        bArr21[23] = 32;
        bArr21[24] = 25;
        bArr21[25] = -67;
        bArr21[26] = -127;
        bArr21[27] = 49;
        bArr21[28] = 33;
        bArr21[29] = 28;
        bArr21[30] = -41;
        bArr21[31] = 118;
        hashSet.add(new WF(bArr21));
        byte[] bArr22 = new byte[(44010611 ^ 1428110146) ^ 1468053265];
        // fill-array-data instruction
        bArr22[0] = 13;
        bArr22[1] = 12;
        bArr22[2] = 78;
        bArr22[3] = 2;
        bArr22[4] = 85;
        bArr22[5] = 16;
        bArr22[6] = -26;
        bArr22[7] = 37;
        bArr22[8] = 118;
        bArr22[9] = 87;
        bArr22[10] = 59;
        bArr22[11] = 127;
        bArr22[12] = -42;
        bArr22[13] = 52;
        bArr22[14] = 16;
        bArr22[15] = -97;
        bArr22[16] = 123;
        bArr22[17] = 24;
        bArr22[18] = 102;
        bArr22[19] = 109;
        bArr22[20] = 108;
        bArr22[21] = 80;
        bArr22[22] = 70;
        bArr22[23] = 75;
        bArr22[24] = 105;
        bArr22[25] = 32;
        bArr22[26] = 90;
        bArr22[27] = -53;
        bArr22[28] = 112;
        bArr22[29] = 8;
        bArr22[30] = 47;
        bArr22[31] = -28;
        hashSet.add(new WF(bArr22));
        byte[] bArr23 = new byte[1420991165 ^ 1420991133];
        // fill-array-data instruction
        bArr23[0] = 97;
        bArr23[1] = 0;
        bArr23[2] = -26;
        bArr23[3] = 124;
        bArr23[4] = 58;
        bArr23[5] = 81;
        bArr23[6] = -96;
        bArr23[7] = -101;
        bArr23[8] = 58;
        bArr23[9] = 114;
        bArr23[10] = -128;
        bArr23[11] = -15;
        bArr23[12] = -93;
        bArr23[13] = -49;
        bArr23[14] = 17;
        bArr23[15] = 107;
        bArr23[16] = -32;
        bArr23[17] = -87;
        bArr23[18] = -32;
        bArr23[19] = 115;
        bArr23[20] = 2;
        bArr23[21] = -90;
        bArr23[22] = 42;
        bArr23[23] = 98;
        bArr23[24] = -53;
        bArr23[25] = -57;
        bArr23[26] = 124;
        bArr23[27] = 101;
        bArr23[28] = 33;
        bArr23[29] = 79;
        bArr23[30] = -111;
        bArr23[31] = -100;
        hashSet.add(new WF(bArr23));
        byte[] bArr24 = new byte[C1580rY.Xd() ^ (167908514 ^ (-998965405))];
        // fill-array-data instruction
        bArr24[0] = -80;
        bArr24[1] = 37;
        bArr24[2] = -53;
        bArr24[3] = -119;
        bArr24[4] = 123;
        bArr24[5] = 90;
        bArr24[6] = -113;
        bArr24[7] = 18;
        bArr24[8] = -50;
        bArr24[9] = -55;
        bArr24[10] = 23;
        bArr24[11] = -41;
        bArr24[12] = 39;
        bArr24[13] = 78;
        bArr24[14] = 64;
        bArr24[15] = -87;
        bArr24[16] = 34;
        bArr24[17] = 67;
        bArr24[18] = 66;
        bArr24[19] = 50;
        bArr24[20] = 91;
        bArr24[21] = 41;
        bArr24[22] = 16;
        bArr24[23] = 110;
        bArr24[24] = -112;
        bArr24[25] = -90;
        bArr24[26] = -96;
        bArr24[27] = -8;
        bArr24[28] = 4;
        bArr24[29] = 27;
        bArr24[30] = 82;
        bArr24[31] = -89;
        hashSet.add(new WF(bArr24));
        byte[] bArr25 = new byte[C1633zX.Xd() ^ (-1951491093)];
        // fill-array-data instruction
        bArr25[0] = -12;
        bArr25[1] = -116;
        bArr25[2] = -32;
        bArr25[3] = -41;
        bArr25[4] = -8;
        bArr25[5] = -79;
        bArr25[6] = 123;
        bArr25[7] = -83;
        bArr25[8] = 30;
        bArr25[9] = 13;
        bArr25[10] = -8;
        bArr25[11] = 65;
        bArr25[12] = -120;
        bArr25[13] = 52;
        bArr25[14] = 126;
        bArr25[15] = 112;
        bArr25[16] = 68;
        bArr25[17] = 45;
        bArr25[18] = -84;
        bArr25[19] = 127;
        bArr25[20] = -88;
        bArr25[21] = -23;
        bArr25[22] = 10;
        bArr25[23] = 109;
        bArr25[24] = 6;
        bArr25[25] = -119;
        bArr25[26] = -52;
        bArr25[27] = 106;
        bArr25[28] = -95;
        bArr25[29] = -128;
        bArr25[30] = 106;
        bArr25[31] = -2;
        hashSet.add(new WF(bArr25));
        byte[] bArr26 = new byte[(1673585560 ^ 1901490698) ^ 311857586];
        // fill-array-data instruction
        bArr26[0] = -96;
        bArr26[1] = 43;
        bArr26[2] = -119;
        bArr26[3] = 31;
        bArr26[4] = 71;
        bArr26[5] = -111;
        bArr26[6] = -122;
        bArr26[7] = -120;
        bArr26[8] = 53;
        bArr26[9] = -72;
        bArr26[10] = 45;
        bArr26[11] = 37;
        bArr26[12] = 14;
        bArr26[13] = -92;
        bArr26[14] = 36;
        bArr26[15] = 11;
        bArr26[16] = 73;
        bArr26[17] = -6;
        bArr26[18] = -114;
        bArr26[19] = 14;
        bArr26[20] = 117;
        bArr26[21] = -26;
        bArr26[22] = -77;
        bArr26[23] = -91;
        bArr26[24] = 101;
        bArr26[25] = 86;
        bArr26[26] = 116;
        bArr26[27] = 115;
        bArr26[28] = 31;
        bArr26[29] = 24;
        bArr26[30] = -125;
        bArr26[31] = 22;
        hashSet.add(new WF(bArr26));
        byte[] bArr27 = new byte[912619933 ^ 912619965];
        // fill-array-data instruction
        bArr27[0] = 120;
        bArr27[1] = -82;
        bArr27[2] = -4;
        bArr27[3] = -87;
        bArr27[4] = 92;
        bArr27[5] = 79;
        bArr27[6] = -89;
        bArr27[7] = -48;
        bArr27[8] = -91;
        bArr27[9] = 92;
        bArr27[10] = 41;
        bArr27[11] = -31;
        bArr27[12] = -28;
        bArr27[13] = 36;
        bArr27[14] = 81;
        bArr27[15] = 48;
        bArr27[16] = 20;
        bArr27[17] = -6;
        bArr27[18] = -40;
        bArr27[19] = 15;
        bArr27[20] = 58;
        bArr27[21] = 33;
        bArr27[22] = 110;
        bArr27[23] = -32;
        bArr27[24] = 4;
        bArr27[25] = -121;
        bArr27[26] = 96;
        bArr27[27] = 7;
        bArr27[28] = -122;
        bArr27[29] = -68;
        bArr27[30] = 31;
        bArr27[31] = 113;
        hashSet.add(new WF(bArr27));
        byte[] bArr28 = new byte[(569809279 ^ 1390229735) ^ 1932239288];
        // fill-array-data instruction
        bArr28[0] = 12;
        bArr28[1] = 122;
        bArr28[2] = -111;
        bArr28[3] = 59;
        bArr28[4] = -62;
        bArr28[5] = 17;
        bArr28[6] = -56;
        bArr28[7] = 114;
        bArr28[8] = -31;
        bArr28[9] = 1;
        bArr28[10] = 9;
        bArr28[11] = 88;
        bArr28[12] = -73;
        bArr28[13] = -43;
        bArr28[14] = -31;
        bArr28[15] = -119;
        bArr28[16] = -118;
        bArr28[17] = 58;
        bArr28[18] = -98;
        bArr28[19] = 14;
        bArr28[20] = 68;
        bArr28[21] = 5;
        bArr28[22] = 33;
        bArr28[23] = 56;
        bArr28[24] = -69;
        bArr28[25] = 99;
        bArr28[26] = -54;
        bArr28[27] = 62;
        bArr28[28] = -19;
        bArr28[29] = 115;
        bArr28[30] = -101;
        bArr28[31] = 50;
        hashSet.add(new WF(bArr28));
        byte[] bArr29 = new byte[OY.Xd() ^ 69929160];
        // fill-array-data instruction
        bArr29[0] = 70;
        bArr29[1] = 40;
        bArr29[2] = 123;
        bArr29[3] = 120;
        bArr29[4] = -89;
        bArr29[5] = -101;
        bArr29[6] = 86;
        bArr29[7] = 116;
        bArr29[8] = -25;
        bArr29[9] = 115;
        bArr29[10] = 32;
        bArr29[11] = -49;
        bArr29[12] = 4;
        bArr29[13] = -46;
        bArr29[14] = 46;
        bArr29[15] = 37;
        bArr29[16] = 90;
        bArr29[17] = 65;
        bArr29[18] = 66;
        bArr29[19] = -1;
        bArr29[20] = -85;
        bArr29[21] = 36;
        bArr29[22] = 23;
        bArr29[23] = -14;
        bArr29[24] = -20;
        bArr29[25] = 44;
        bArr29[26] = -120;
        bArr29[27] = -52;
        bArr29[28] = -121;
        bArr29[29] = 124;
        bArr29[30] = -33;
        bArr29[31] = -5;
        hashSet.add(new WF(bArr29));
        byte[] bArr30 = new byte[ZN.Xd() ^ (2075929899 ^ 1211503611)];
        // fill-array-data instruction
        bArr30[0] = -41;
        bArr30[1] = -25;
        bArr30[2] = -89;
        bArr30[3] = -34;
        bArr30[4] = -119;
        bArr30[5] = 113;
        bArr30[6] = -128;
        bArr30[7] = -76;
        bArr30[8] = 8;
        bArr30[9] = -38;
        bArr30[10] = 78;
        bArr30[11] = 67;
        bArr30[12] = -127;
        bArr30[13] = -61;
        bArr30[14] = -106;
        bArr30[15] = -88;
        bArr30[16] = -66;
        bArr30[17] = 77;
        bArr30[18] = 2;
        bArr30[19] = -5;
        bArr30[20] = -28;
        bArr30[21] = -43;
        bArr30[22] = 60;
        bArr30[23] = -111;
        bArr30[24] = 64;
        bArr30[25] = 62;
        bArr30[26] = -28;
        bArr30[27] = 61;
        bArr30[28] = 49;
        bArr30[29] = -38;
        bArr30[30] = -70;
        bArr30[31] = 80;
        hashSet.add(new WF(bArr30));
        byte[] bArr31 = new byte[(1911225839 ^ 1621200277) ^ 290156634];
        // fill-array-data instruction
        bArr31[0] = -51;
        bArr31[1] = 107;
        bArr31[2] = -28;
        bArr31[3] = 53;
        bArr31[4] = 75;
        bArr31[5] = -32;
        bArr31[6] = -73;
        bArr31[7] = 85;
        bArr31[8] = 72;
        bArr31[9] = -23;
        bArr31[10] = -63;
        bArr31[11] = -61;
        bArr31[12] = 47;
        bArr31[13] = 60;
        bArr31[14] = 5;
        bArr31[15] = 13;
        bArr31[16] = 120;
        bArr31[17] = -101;
        bArr31[18] = -77;
        bArr31[19] = -105;
        bArr31[20] = 100;
        bArr31[21] = -59;
        bArr31[22] = -3;
        bArr31[23] = 4;
        bArr31[24] = -67;
        bArr31[25] = 50;
        bArr31[26] = -76;
        bArr31[27] = -68;
        bArr31[28] = 104;
        bArr31[29] = 1;
        bArr31[30] = -12;
        bArr31[31] = -8;
        hashSet.add(new WF(bArr31));
        byte[] bArr32 = new byte[(1092566856 ^ 1095510583) ^ 5444959];
        // fill-array-data instruction
        bArr32[0] = 52;
        bArr32[1] = 62;
        bArr32[2] = 109;
        bArr32[3] = -97;
        bArr32[4] = -25;
        bArr32[5] = -6;
        bArr32[6] = 49;
        bArr32[7] = 115;
        bArr32[8] = -32;
        bArr32[9] = 91;
        bArr32[10] = -88;
        bArr32[11] = 43;
        bArr32[12] = -76;
        bArr32[13] = -80;
        bArr32[14] = -77;
        bArr32[15] = 4;
        bArr32[16] = -114;
        bArr32[17] = -114;
        bArr32[18] = 20;
        bArr32[19] = -80;
        bArr32[20] = 85;
        bArr32[21] = -127;
        bArr32[22] = -128;
        bArr32[23] = 13;
        bArr32[24] = -106;
        bArr32[25] = -10;
        bArr32[26] = -120;
        bArr32[27] = -4;
        bArr32[28] = 75;
        bArr32[29] = 13;
        bArr32[30] = -55;
        bArr32[31] = 106;
        hashSet.add(new WF(bArr32));
        byte[] bArr33 = new byte[FB.Xd() ^ 1609527059];
        // fill-array-data instruction
        bArr33[0] = 43;
        bArr33[1] = -43;
        bArr33[2] = 73;
        bArr33[3] = 4;
        bArr33[4] = 31;
        bArr33[5] = 22;
        bArr33[6] = -35;
        bArr33[7] = -35;
        bArr33[8] = 124;
        bArr33[9] = 109;
        bArr33[10] = -41;
        bArr33[11] = 110;
        bArr33[12] = 58;
        bArr33[13] = 71;
        bArr33[14] = -98;
        bArr33[15] = -20;
        bArr33[16] = 68;
        bArr33[17] = -33;
        bArr33[18] = -116;
        bArr33[19] = 11;
        bArr33[20] = -88;
        bArr33[21] = -13;
        bArr33[22] = 14;
        bArr33[23] = -111;
        bArr33[24] = 122;
        bArr33[25] = 97;
        bArr33[26] = 68;
        bArr33[27] = -87;
        bArr33[28] = 115;
        bArr33[29] = -15;
        bArr33[30] = 99;
        bArr33[31] = 103;
        hashSet.add(new WF(bArr33));
        byte[] bArr34 = new byte[FB.Xd() ^ 1609527059];
        // fill-array-data instruction
        bArr34[0] = -32;
        bArr34[1] = 88;
        bArr34[2] = 121;
        bArr34[3] = -26;
        bArr34[4] = 107;
        bArr34[5] = -48;
        bArr34[6] = 41;
        bArr34[7] = 91;
        bArr34[8] = 19;
        bArr34[9] = -121;
        bArr34[10] = -27;
        bArr34[11] = 25;
        bArr34[12] = 30;
        bArr34[13] = -64;
        bArr34[14] = -50;
        bArr34[15] = 112;
        bArr34[16] = 7;
        bArr34[17] = -61;
        bArr34[18] = 17;
        bArr34[19] = 55;
        bArr34[20] = -60;
        bArr34[21] = 48;
        bArr34[22] = -64;
        bArr34[23] = -14;
        bArr34[24] = -16;
        bArr34[25] = 44;
        bArr34[26] = 48;
        bArr34[27] = 114;
        bArr34[28] = 7;
        bArr34[29] = 33;
        bArr34[30] = -42;
        bArr34[31] = 33;
        hashSet.add(new WF(bArr34));
        byte[] bArr35 = new byte[C1580rY.Xd() ^ (1745379735 ^ (-1501656490))];
        // fill-array-data instruction
        bArr35[0] = -37;
        bArr35[1] = -93;
        bArr35[2] = 71;
        bArr35[3] = 80;
        bArr35[4] = 14;
        bArr35[5] = 52;
        bArr35[6] = -111;
        bArr35[7] = -23;
        bArr35[8] = 70;
        bArr35[9] = 58;
        bArr35[10] = -4;
        bArr35[11] = -34;
        bArr35[12] = -69;
        bArr35[13] = 80;
        bArr35[14] = 125;
        bArr35[15] = -31;
        bArr35[16] = 0;
        bArr35[17] = -39;
        bArr35[18] = -60;
        bArr35[19] = -123;
        bArr35[20] = 21;
        bArr35[21] = -1;
        bArr35[22] = 48;
        bArr35[23] = 68;
        bArr35[24] = -2;
        bArr35[25] = -9;
        bArr35[26] = 26;
        bArr35[27] = -48;
        bArr35[28] = -108;
        bArr35[29] = 5;
        bArr35[30] = -78;
        bArr35[31] = 95;
        hashSet.add(new WF(bArr35));
        byte[] bArr36 = new byte[(9579827 ^ 1212414556) ^ 1221711695];
        // fill-array-data instruction
        bArr36[0] = 71;
        bArr36[1] = -21;
        bArr36[2] = -90;
        bArr36[3] = -123;
        bArr36[4] = 39;
        bArr36[5] = -12;
        bArr36[6] = -91;
        bArr36[7] = 108;
        bArr36[8] = 100;
        bArr36[9] = 28;
        bArr36[10] = 7;
        bArr36[11] = -66;
        bArr36[12] = -61;
        bArr36[13] = 41;
        bArr36[14] = 7;
        bArr36[15] = 1;
        bArr36[16] = -4;
        bArr36[17] = -43;
        bArr36[18] = 51;
        bArr36[19] = 37;
        bArr36[20] = 18;
        bArr36[21] = -27;
        bArr36[22] = -39;
        bArr36[23] = -17;
        bArr36[24] = -116;
        bArr36[25] = 18;
        bArr36[26] = -57;
        bArr36[27] = 93;
        bArr36[28] = -125;
        bArr36[29] = -68;
        bArr36[30] = 31;
        bArr36[31] = -63;
        hashSet.add(new WF(bArr36));
        byte[] bArr37 = new byte[OY.Xd() ^ (1618780896 ^ 1683466792)];
        // fill-array-data instruction
        bArr37[0] = -89;
        bArr37[1] = 34;
        bArr37[2] = 123;
        bArr37[3] = 86;
        bArr37[4] = -85;
        bArr37[5] = -15;
        bArr37[6] = 48;
        bArr37[7] = 5;
        bArr37[8] = 101;
        bArr37[9] = -104;
        bArr37[10] = -40;
        bArr37[11] = -103;
        bArr37[12] = 124;
        bArr37[13] = -86;
        bArr37[14] = -94;
        bArr37[15] = 1;
        bArr37[16] = 48;
        bArr37[17] = 23;
        bArr37[18] = -104;
        bArr37[19] = 114;
        bArr37[20] = -68;
        bArr37[21] = 5;
        bArr37[22] = 41;
        bArr37[23] = -51;
        bArr37[24] = 120;
        bArr37[25] = -118;
        bArr37[26] = 85;
        bArr37[27] = 105;
        bArr37[28] = 27;
        bArr37[29] = 38;
        bArr37[30] = 27;
        bArr37[31] = 113;
        hashSet.add(new WF(bArr37));
        byte[] bArr38 = new byte[C1633zX.Xd() ^ (-1951491093)];
        // fill-array-data instruction
        bArr38[0] = 77;
        bArr38[1] = 101;
        bArr38[2] = 125;
        bArr38[3] = -1;
        bArr38[4] = -53;
        bArr38[5] = 96;
        bArr38[6] = 122;
        bArr38[7] = -94;
        bArr38[8] = 71;
        bArr38[9] = -67;
        bArr38[10] = -33;
        bArr38[11] = -79;
        bArr38[12] = 120;
        bArr38[13] = 28;
        bArr38[14] = -86;
        bArr38[15] = -23;
        bArr38[16] = 28;
        bArr38[17] = 48;
        bArr38[18] = 36;
        bArr38[19] = -9;
        bArr38[20] = -20;
        bArr38[21] = -85;
        bArr38[22] = -80;
        bArr38[23] = -77;
        bArr38[24] = -106;
        bArr38[25] = 71;
        bArr38[26] = 61;
        bArr38[27] = 117;
        bArr38[28] = -95;
        bArr38[29] = 59;
        bArr38[30] = -69;
        bArr38[31] = 9;
        hashSet.add(new WF(bArr38));
        byte[] bArr39 = new byte[(458997741 ^ 816972601) ^ 736738548];
        // fill-array-data instruction
        bArr39[0] = 37;
        bArr39[1] = 68;
        bArr39[2] = 65;
        bArr39[3] = -77;
        bArr39[4] = 94;
        bArr39[5] = -116;
        bArr39[6] = -126;
        bArr39[7] = -122;
        bArr39[8] = 65;
        bArr39[9] = 127;
        bArr39[10] = -91;
        bArr39[11] = -66;
        bArr39[12] = 117;
        bArr39[13] = 23;
        bArr39[14] = 76;
        bArr39[15] = 45;
        bArr39[16] = 51;
        bArr39[17] = 34;
        bArr39[18] = 46;
        bArr39[19] = 16;
        bArr39[20] = 82;
        bArr39[21] = 86;
        bArr39[22] = -104;
        bArr39[23] = 61;
        bArr39[24] = -1;
        bArr39[25] = 105;
        bArr39[26] = 90;
        bArr39[27] = -125;
        bArr39[28] = -71;
        bArr39[29] = 102;
        bArr39[30] = 55;
        bArr39[31] = -96;
        hashSet.add(new WF(bArr39));
        byte[] bArr40 = new byte[(1767394349 ^ 1754739154) ^ 30375391];
        // fill-array-data instruction
        bArr40[0] = -2;
        bArr40[1] = 59;
        bArr40[2] = 35;
        bArr40[3] = -106;
        bArr40[4] = -64;
        bArr40[5] = -97;
        bArr40[6] = -126;
        bArr40[7] = -101;
        bArr40[8] = 61;
        bArr40[9] = -88;
        bArr40[10] = -48;
        bArr40[11] = 62;
        bArr40[12] = -101;
        bArr40[13] = -43;
        bArr40[14] = 40;
        bArr40[15] = 37;
        bArr40[16] = -102;
        bArr40[17] = 63;
        bArr40[18] = -84;
        bArr40[19] = -112;
        bArr40[20] = 101;
        bArr40[21] = 12;
        bArr40[22] = -123;
        bArr40[23] = -105;
        bArr40[24] = 53;
        bArr40[25] = -111;
        bArr40[26] = 41;
        bArr40[27] = -126;
        bArr40[28] = 5;
        bArr40[29] = -45;
        bArr40[30] = 28;
        bArr40[31] = 66;
        hashSet.add(new WF(bArr40));
        byte[] bArr41 = new byte[680900115 ^ 680900147];
        // fill-array-data instruction
        bArr41[0] = -37;
        bArr41[1] = -13;
        bArr41[2] = 122;
        bArr41[3] = -98;
        bArr41[4] = -116;
        bArr41[5] = -125;
        bArr41[6] = 44;
        bArr41[7] = 61;
        bArr41[8] = -87;
        bArr41[9] = -90;
        bArr41[10] = 67;
        bArr41[11] = -113;
        bArr41[12] = 7;
        bArr41[13] = -94;
        bArr41[14] = 37;
        bArr41[15] = 32;
        bArr41[16] = 101;
        bArr41[17] = 115;
        bArr41[18] = -21;
        bArr41[19] = 124;
        bArr41[20] = 86;
        bArr41[21] = -2;
        bArr41[22] = -37;
        bArr41[23] = 71;
        bArr41[24] = -105;
        bArr41[25] = -6;
        bArr41[26] = -75;
        bArr41[27] = 67;
        bArr41[28] = -15;
        bArr41[29] = 101;
        bArr41[30] = 45;
        bArr41[31] = 75;
        hashSet.add(new WF(bArr41));
        byte[] bArr42 = new byte[565393370 ^ 565393402];
        // fill-array-data instruction
        bArr42[0] = -96;
        bArr42[1] = -58;
        bArr42[2] = 118;
        bArr42[3] = -76;
        bArr42[4] = -74;
        bArr42[5] = -120;
        bArr42[6] = -93;
        bArr42[7] = -95;
        bArr42[8] = -50;
        bArr42[9] = 106;
        bArr42[10] = 55;
        bArr42[11] = -11;
        bArr42[12] = -62;
        bArr42[13] = -7;
        bArr42[14] = 113;
        bArr42[15] = 79;
        bArr42[16] = 20;
        bArr42[17] = -9;
        bArr42[18] = -6;
        bArr42[19] = -77;
        bArr42[20] = 18;
        bArr42[21] = 113;
        bArr42[22] = 31;
        bArr42[23] = 98;
        bArr42[24] = 40;
        bArr42[25] = -127;
        bArr42[26] = 25;
        bArr42[27] = 69;
        bArr42[28] = 25;
        bArr42[29] = 103;
        bArr42[30] = -103;
        bArr42[31] = 59;
        hashSet.add(new WF(bArr42));
        byte[] bArr43 = new byte[(339793163 ^ 1071807845) ^ 732080206];
        // fill-array-data instruction
        bArr43[0] = 48;
        bArr43[1] = 120;
        bArr43[2] = -31;
        bArr43[3] = -102;
        bArr43[4] = -74;
        bArr43[5] = 57;
        bArr43[6] = -17;
        bArr43[7] = 48;
        bArr43[8] = 59;
        bArr43[9] = 2;
        bArr43[10] = -52;
        bArr43[11] = -34;
        bArr43[12] = 112;
        bArr43[13] = 49;
        bArr43[14] = -32;
        bArr43[15] = 64;
        bArr43[16] = 107;
        bArr43[17] = -30;
        bArr43[18] = -34;
        bArr43[19] = -107;
        bArr43[20] = 62;
        bArr43[21] = 89;
        bArr43[22] = -4;
        bArr43[23] = 82;
        bArr43[24] = 3;
        bArr43[25] = -113;
        bArr43[26] = -128;
        bArr43[27] = -20;
        bArr43[28] = 10;
        bArr43[29] = -127;
        bArr43[30] = 27;
        bArr43[31] = 26;
        hashSet.add(new WF(bArr43));
        byte[] bArr44 = new byte[(1102057975 ^ 1394469832) ^ 313391647];
        // fill-array-data instruction
        bArr44[0] = -46;
        bArr44[1] = -41;
        bArr44[2] = 117;
        bArr44[3] = -24;
        bArr44[4] = -21;
        bArr44[5] = 52;
        bArr44[6] = -79;
        bArr44[7] = -121;
        bArr44[8] = -99;
        bArr44[9] = 109;
        bArr44[10] = -114;
        bArr44[11] = -123;
        bArr44[12] = -101;
        bArr44[13] = -116;
        bArr44[14] = 82;
        bArr44[15] = -32;
        bArr44[16] = 19;
        bArr44[17] = -124;
        bArr44[18] = 60;
        bArr44[19] = 110;
        bArr44[20] = -10;
        bArr44[21] = 20;
        bArr44[22] = 6;
        bArr44[23] = 124;
        bArr44[24] = -18;
        bArr44[25] = 86;
        bArr44[26] = -26;
        bArr44[27] = -115;
        bArr44[28] = -13;
        bArr44[29] = 17;
        bArr44[30] = -8;
        bArr44[31] = -106;
        hashSet.add(new WF(bArr44));
        byte[] bArr45 = new byte[1846591084 ^ 1846591052];
        // fill-array-data instruction
        bArr45[0] = 8;
        bArr45[1] = 96;
        bArr45[2] = 8;
        bArr45[3] = 32;
        bArr45[4] = -39;
        bArr45[5] = 0;
        bArr45[6] = -42;
        bArr45[7] = 59;
        bArr45[8] = 111;
        bArr45[9] = 26;
        bArr45[10] = 45;
        bArr45[11] = -79;
        bArr45[12] = -122;
        bArr45[13] = -106;
        bArr45[14] = -24;
        bArr45[15] = 30;
        bArr45[16] = -96;
        bArr45[17] = 55;
        bArr45[18] = 47;
        bArr45[19] = 97;
        bArr45[20] = -94;
        bArr45[21] = -27;
        bArr45[22] = -16;
        bArr45[23] = -5;
        bArr45[24] = -99;
        bArr45[25] = 10;
        bArr45[26] = 51;
        bArr45[27] = -91;
        bArr45[28] = 54;
        bArr45[29] = 7;
        bArr45[30] = -114;
        bArr45[31] = -70;
        hashSet.add(new WF(bArr45));
        byte[] bArr46 = new byte[140501165 ^ 140501133];
        // fill-array-data instruction
        bArr46[0] = 47;
        bArr46[1] = -104;
        bArr46[2] = -34;
        bArr46[3] = -34;
        bArr46[4] = -64;
        bArr46[5] = -10;
        bArr46[6] = -82;
        bArr46[7] = 31;
        bArr46[8] = -99;
        bArr46[9] = -126;
        bArr46[10] = -127;
        bArr46[11] = -40;
        bArr46[12] = -6;
        bArr46[13] = -127;
        bArr46[14] = 77;
        bArr46[15] = 18;
        bArr46[16] = 19;
        bArr46[17] = 32;
        bArr46[18] = 40;
        bArr46[19] = 97;
        bArr46[20] = 103;
        bArr46[21] = -110;
        bArr46[22] = -70;
        bArr46[23] = 8;
        bArr46[24] = -89;
        bArr46[25] = -48;
        bArr46[26] = -39;
        bArr46[27] = -17;
        bArr46[28] = -53;
        bArr46[29] = -15;
        bArr46[30] = -98;
        bArr46[31] = -44;
        hashSet.add(new WF(bArr46));
        byte[] bArr47 = new byte[(1995954561 ^ 1200763160) ^ 828762297];
        // fill-array-data instruction
        bArr47[0] = 0;
        bArr47[1] = 117;
        bArr47[2] = -63;
        bArr47[3] = 100;
        bArr47[4] = 118;
        bArr47[5] = -92;
        bArr47[6] = -21;
        bArr47[7] = -92;
        bArr47[8] = 36;
        bArr47[9] = 30;
        bArr47[10] = -86;
        bArr47[11] = -20;
        bArr47[12] = 18;
        bArr47[13] = 111;
        bArr47[14] = 82;
        bArr47[15] = 79;
        bArr47[16] = 61;
        bArr47[17] = -87;
        bArr47[18] = -5;
        bArr47[19] = -123;
        bArr47[20] = 71;
        bArr47[21] = 37;
        bArr47[22] = 5;
        bArr47[23] = -38;
        bArr47[24] = -87;
        bArr47[25] = 19;
        bArr47[26] = 62;
        bArr47[27] = -16;
        bArr47[28] = -102;
        bArr47[29] = 86;
        bArr47[30] = -93;
        bArr47[31] = -9;
        hashSet.add(new WF(bArr47));
        byte[] bArr48 = new byte[715958718 ^ 715958686];
        // fill-array-data instruction
        bArr48[0] = 116;
        bArr48[1] = 23;
        bArr48[2] = -91;
        bArr48[3] = -63;
        bArr48[4] = -65;
        bArr48[5] = 49;
        bArr48[6] = 111;
        bArr48[7] = -87;
        bArr48[8] = -17;
        bArr48[9] = -101;
        bArr48[10] = 99;
        bArr48[11] = -62;
        bArr48[12] = 114;
        bArr48[13] = 101;
        bArr48[14] = -89;
        bArr48[15] = 112;
        bArr48[16] = -25;
        bArr48[17] = 88;
        bArr48[18] = -121;
        bArr48[19] = -108;
        bArr48[20] = 12;
        bArr48[21] = 11;
        bArr48[22] = 70;
        bArr48[23] = 97;
        bArr48[24] = -101;
        bArr48[25] = 34;
        bArr48[26] = 55;
        bArr48[27] = 27;
        bArr48[28] = 118;
        bArr48[29] = 116;
        bArr48[30] = -56;
        bArr48[31] = -7;
        hashSet.add(new WF(bArr48));
        byte[] bArr49 = new byte[C1580rY.Xd() ^ (-831067199)];
        // fill-array-data instruction
        bArr49[0] = 75;
        bArr49[1] = 78;
        bArr49[2] = -97;
        bArr49[3] = -121;
        bArr49[4] = -26;
        bArr49[5] = -12;
        bArr49[6] = 127;
        bArr49[7] = -21;
        bArr49[8] = 21;
        bArr49[9] = -31;
        bArr49[10] = 126;
        bArr49[11] = -111;
        bArr49[12] = -53;
        bArr49[13] = 29;
        bArr49[14] = -126;
        bArr49[15] = -84;
        bArr49[16] = -42;
        bArr49[17] = 96;
        bArr49[18] = -16;
        bArr49[19] = 79;
        bArr49[20] = 96;
        bArr49[21] = -123;
        bArr49[22] = 117;
        bArr49[23] = -33;
        bArr49[24] = 50;
        bArr49[25] = 114;
        bArr49[26] = 16;
        bArr49[27] = -34;
        bArr49[28] = -2;
        bArr49[29] = 11;
        bArr49[30] = 52;
        bArr49[31] = 17;
        hashSet.add(new WF(bArr49));
        byte[] bArr50 = new byte[C1607wl.Xd() ^ 1849955322];
        // fill-array-data instruction
        bArr50[0] = 113;
        bArr50[1] = -47;
        bArr50[2] = 18;
        bArr50[3] = -1;
        bArr50[4] = -28;
        bArr50[5] = 46;
        bArr50[6] = -9;
        bArr50[7] = 93;
        bArr50[8] = 122;
        bArr50[9] = 97;
        bArr50[10] = 110;
        bArr50[11] = -58;
        bArr50[12] = -52;
        bArr50[13] = 77;
        bArr50[14] = 77;
        bArr50[15] = -23;
        bArr50[16] = -51;
        bArr50[17] = -36;
        bArr50[18] = -47;
        bArr50[19] = -4;
        bArr50[20] = 61;
        bArr50[21] = 50;
        bArr50[22] = 82;
        bArr50[23] = -26;
        bArr50[24] = -8;
        bArr50[25] = 114;
        bArr50[26] = -27;
        bArr50[27] = -48;
        bArr50[28] = 50;
        bArr50[29] = -62;
        bArr50[30] = -58;
        bArr50[31] = -60;
        hashSet.add(new WF(bArr50));
        byte[] bArr51 = new byte[C1633zX.Xd() ^ (1162639305 ^ (-823989214))];
        // fill-array-data instruction
        bArr51[0] = -52;
        bArr51[1] = -36;
        bArr51[2] = -91;
        bArr51[3] = 86;
        bArr51[4] = 122;
        bArr51[5] = -99;
        bArr51[6] = -55;
        bArr51[7] = -91;
        bArr51[8] = -44;
        bArr51[9] = -17;
        bArr51[10] = -125;
        bArr51[11] = -25;
        bArr51[12] = 63;
        bArr51[13] = 118;
        bArr51[14] = -113;
        bArr51[15] = 59;
        bArr51[16] = -108;
        bArr51[17] = -99;
        bArr51[18] = -42;
        bArr51[19] = -104;
        bArr51[20] = -6;
        bArr51[21] = -92;
        bArr51[22] = -58;
        bArr51[23] = 45;
        bArr51[24] = 31;
        bArr51[25] = -56;
        bArr51[26] = -30;
        bArr51[27] = -37;
        bArr51[28] = -59;
        bArr51[29] = -31;
        bArr51[30] = -95;
        bArr51[31] = 56;
        hashSet.add(new WF(bArr51));
        byte[] bArr52 = new byte[303375581 ^ 303375613];
        // fill-array-data instruction
        bArr52[0] = 37;
        bArr52[1] = 61;
        bArr52[2] = 58;
        bArr52[3] = 27;
        bArr52[4] = 75;
        bArr52[5] = -11;
        bArr52[6] = -108;
        bArr52[7] = 34;
        bArr52[8] = 44;
        bArr52[9] = -17;
        bArr52[10] = -32;
        bArr52[11] = -86;
        bArr52[12] = -97;
        bArr52[13] = 30;
        bArr52[14] = -76;
        bArr52[15] = -4;
        bArr52[16] = -5;
        bArr52[17] = 75;
        bArr52[18] = 53;
        bArr52[19] = -51;
        bArr52[20] = -56;
        bArr52[21] = -112;
        bArr52[22] = 6;
        bArr52[23] = 79;
        bArr52[24] = -98;
        bArr52[25] = -59;
        bArr52[26] = -17;
        bArr52[27] = 9;
        bArr52[28] = -3;
        bArr52[29] = -1;
        bArr52[30] = -115;
        bArr52[31] = 88;
        hashSet.add(new WF(bArr52));
        byte[] bArr53 = new byte[108554706 ^ 108554738];
        // fill-array-data instruction
        bArr53[0] = 105;
        bArr53[1] = -29;
        bArr53[2] = 113;
        bArr53[3] = -118;
        bArr53[4] = -101;
        bArr53[5] = 27;
        bArr53[6] = -94;
        bArr53[7] = 113;
        bArr53[8] = -104;
        bArr53[9] = -69;
        bArr53[10] = -116;
        bArr53[11] = -104;
        bArr53[12] = -20;
        bArr53[13] = -16;
        bArr53[14] = 62;
        bArr53[15] = -123;
        bArr53[16] = -20;
        bArr53[17] = -3;
        bArr53[18] = -44;
        bArr53[19] = 24;
        bArr53[20] = 20;
        bArr53[21] = -86;
        bArr53[22] = -27;
        bArr53[23] = 98;
        bArr53[24] = -44;
        bArr53[25] = -6;
        bArr53[26] = 93;
        bArr53[27] = -37;
        bArr53[28] = 56;
        bArr53[29] = -109;
        bArr53[30] = 119;
        bArr53[31] = -87;
        hashSet.add(new WF(bArr53));
        byte[] bArr54 = new byte[ZN.Xd() ^ 864698064];
        // fill-array-data instruction
        bArr54[0] = 15;
        bArr54[1] = -114;
        bArr54[2] = 32;
        bArr54[3] = -41;
        bArr54[4] = 38;
        bArr54[5] = 62;
        bArr54[6] = 122;
        bArr54[7] = -81;
        bArr54[8] = 70;
        bArr54[9] = 74;
        bArr54[10] = 54;
        bArr54[11] = -73;
        bArr54[12] = -125;
        bArr54[13] = -80;
        bArr54[14] = 44;
        bArr54[15] = -73;
        bArr54[16] = 80;
        bArr54[17] = 67;
        bArr54[18] = 71;
        bArr54[19] = -16;
        bArr54[20] = -55;
        bArr54[21] = 11;
        bArr54[22] = 126;
        bArr54[23] = -90;
        bArr54[24] = 85;
        bArr54[25] = 62;
        bArr54[26] = 26;
        bArr54[27] = -68;
        bArr54[28] = 104;
        bArr54[29] = -53;
        bArr54[30] = -105;
        bArr54[31] = 43;
        hashSet.add(new WF(bArr54));
        byte[] bArr55 = new byte[(1685111968 ^ 579684270) ^ 1191019310];
        // fill-array-data instruction
        bArr55[0] = -9;
        bArr55[1] = -105;
        bArr55[2] = -60;
        bArr55[3] = 19;
        bArr55[4] = 127;
        bArr55[5] = 63;
        bArr55[6] = -22;
        bArr55[7] = 92;
        bArr55[8] = 32;
        bArr55[9] = 103;
        bArr55[10] = 27;
        bArr55[11] = -43;
        bArr55[12] = 111;
        bArr55[13] = -115;
        bArr55[14] = -6;
        bArr55[15] = -32;
        bArr55[16] = -124;
        bArr55[17] = -59;
        bArr55[18] = -25;
        bArr55[19] = 0;
        bArr55[20] = 123;
        bArr55[21] = 63;
        bArr55[22] = -36;
        bArr55[23] = 119;
        bArr55[24] = 31;
        bArr55[25] = 50;
        bArr55[26] = 100;
        bArr55[27] = -23;
        bArr55[28] = 87;
        bArr55[29] = -100;
        bArr55[30] = 20;
        bArr55[31] = 45;
        hashSet.add(new WF(bArr55));
        byte[] bArr56 = new byte[ZN.Xd() ^ 864698064];
        // fill-array-data instruction
        bArr56[0] = -110;
        bArr56[1] = 87;
        bArr56[2] = -110;
        bArr56[3] = 44;
        bArr56[4] = 22;
        bArr56[5] = -85;
        bArr56[6] = -81;
        bArr56[7] = 17;
        bArr56[8] = 84;
        bArr56[9] = -50;
        bArr56[10] = -124;
        bArr56[11] = -64;
        bArr56[12] = -95;
        bArr56[13] = 123;
        bArr56[14] = -102;
        bArr56[15] = 58;
        bArr56[16] = 79;
        bArr56[17] = -120;
        bArr56[18] = -33;
        bArr56[19] = 21;
        bArr56[20] = -60;
        bArr56[21] = 105;
        bArr56[22] = -46;
        bArr56[23] = 65;
        bArr56[24] = -98;
        bArr56[25] = -14;
        bArr56[26] = -104;
        bArr56[27] = -95;
        bArr56[28] = -107;
        bArr56[29] = -128;
        bArr56[30] = -21;
        bArr56[31] = -21;
        hashSet.add(new WF(bArr56));
        byte[] bArr57 = new byte[C1499aX.Xd() ^ (-1134257972)];
        // fill-array-data instruction
        bArr57[0] = 67;
        bArr57[1] = -116;
        bArr57[2] = -93;
        bArr57[3] = 78;
        bArr57[4] = -93;
        bArr57[5] = -55;
        bArr57[6] = 42;
        bArr57[7] = -38;
        bArr57[8] = -32;
        bArr57[9] = -8;
        bArr57[10] = 88;
        bArr57[11] = -66;
        bArr57[12] = -93;
        bArr57[13] = -52;
        bArr57[14] = 60;
        bArr57[15] = 66;
        bArr57[16] = -86;
        bArr57[17] = -30;
        bArr57[18] = 97;
        bArr57[19] = 7;
        bArr57[20] = -108;
        bArr57[21] = -24;
        bArr57[22] = 34;
        bArr57[23] = 8;
        bArr57[24] = 31;
        bArr57[25] = -109;
        bArr57[26] = -45;
        bArr57[27] = -74;
        bArr57[28] = -12;
        bArr57[29] = 36;
        bArr57[30] = 65;
        bArr57[31] = -56;
        hashSet.add(new WF(bArr57));
        byte[] bArr58 = new byte[C1607wl.Xd() ^ (1501121700 ^ 926768990)];
        // fill-array-data instruction
        bArr58[0] = -98;
        bArr58[1] = 37;
        bArr58[2] = 9;
        bArr58[3] = -110;
        bArr58[4] = 121;
        bArr58[5] = -44;
        bArr58[6] = -79;
        bArr58[7] = -8;
        bArr58[8] = 20;
        bArr58[9] = -97;
        bArr58[10] = 126;
        bArr58[11] = -90;
        bArr58[12] = 80;
        bArr58[13] = -100;
        bArr58[14] = -70;
        bArr58[15] = 102;
        bArr58[16] = 13;
        bArr58[17] = -1;
        bArr58[18] = 55;
        bArr58[19] = 50;
        bArr58[20] = -42;
        bArr58[21] = 1;
        bArr58[22] = 86;
        bArr58[23] = -7;
        bArr58[24] = 86;
        bArr58[25] = -116;
        bArr58[26] = -71;
        bArr58[27] = -54;
        bArr58[28] = 91;
        bArr58[29] = -34;
        bArr58[30] = 92;
        bArr58[31] = -48;
        hashSet.add(new WF(bArr58));
        byte[] bArr59 = new byte[C1580rY.Xd() ^ (-831067199)];
        // fill-array-data instruction
        bArr59[0] = -65;
        bArr59[1] = -66;
        bArr59[2] = 35;
        bArr59[3] = 98;
        bArr59[4] = 93;
        bArr59[5] = 97;
        bArr59[6] = 72;
        bArr59[7] = 69;
        bArr59[8] = -5;
        bArr59[9] = -4;
        bArr59[10] = -100;
        bArr59[11] = -3;
        bArr59[12] = 0;
        bArr59[13] = 83;
        bArr59[14] = 40;
        bArr59[15] = -72;
        bArr59[16] = 99;
        bArr59[17] = 29;
        bArr59[18] = -49;
        bArr59[19] = 76;
        bArr59[20] = -7;
        bArr59[21] = -35;
        bArr59[22] = 97;
        bArr59[23] = -16;
        bArr59[24] = 32;
        bArr59[25] = 5;
        bArr59[26] = 105;
        bArr59[27] = -92;
        bArr59[28] = -100;
        bArr59[29] = 5;
        bArr59[30] = 110;
        bArr59[31] = 125;
        hashSet.add(new WF(bArr59));
        byte[] bArr60 = new byte[Od.Xd() ^ (618864681 ^ 1662956636)];
        // fill-array-data instruction
        bArr60[0] = 52;
        bArr60[1] = -19;
        bArr60[2] = 106;
        bArr60[3] = 57;
        bArr60[4] = -41;
        bArr60[5] = -99;
        bArr60[6] = -58;
        bArr60[7] = 53;
        bArr60[8] = -121;
        bArr60[9] = -81;
        bArr60[10] = -7;
        bArr60[11] = -109;
        bArr60[12] = 42;
        bArr60[13] = -117;
        bArr60[14] = 43;
        bArr60[15] = -26;
        bArr60[16] = -85;
        bArr60[17] = 116;
        bArr60[18] = 61;
        bArr60[19] = 10;
        bArr60[20] = -35;
        bArr60[21] = -128;
        bArr60[22] = 106;
        bArr60[23] = -124;
        bArr60[24] = 1;
        bArr60[25] = 91;
        bArr60[26] = -96;
        bArr60[27] = -127;
        bArr60[28] = -58;
        bArr60[29] = -111;
        bArr60[30] = -98;
        bArr60[31] = -40;
        hashSet.add(new WF(bArr60));
        byte[] bArr61 = new byte[218955847 ^ 218955879];
        // fill-array-data instruction
        bArr61[0] = -20;
        bArr61[1] = -24;
        bArr61[2] = -27;
        bArr61[3] = -126;
        bArr61[4] = 106;
        bArr61[5] = 60;
        bArr61[6] = 104;
        bArr61[7] = -119;
        bArr61[8] = -71;
        bArr61[9] = -52;
        bArr61[10] = 13;
        bArr61[11] = 65;
        bArr61[12] = -103;
        bArr61[13] = 37;
        bArr61[14] = -118;
        bArr61[15] = 45;
        bArr61[16] = -82;
        bArr61[17] = 104;
        bArr61[18] = 91;
        bArr61[19] = -61;
        bArr61[20] = 100;
        bArr61[21] = -102;
        bArr61[22] = -39;
        bArr61[23] = 49;
        bArr61[24] = -23;
        bArr61[25] = -106;
        bArr61[26] = -89;
        bArr61[27] = 110;
        bArr61[28] = 126;
        bArr61[29] = -125;
        bArr61[30] = -8;
        bArr61[31] = -94;
        hashSet.add(new WF(bArr61));
        byte[] bArr62 = new byte[C1607wl.Xd() ^ (1457206237 ^ 949952551)];
        // fill-array-data instruction
        bArr62[0] = 20;
        bArr62[1] = -57;
        bArr62[2] = -10;
        bArr62[3] = -78;
        bArr62[4] = 9;
        bArr62[5] = 16;
        bArr62[6] = 25;
        bArr62[7] = 78;
        bArr62[8] = 19;
        bArr62[9] = 15;
        bArr62[10] = -118;
        bArr62[11] = 95;
        bArr62[12] = 48;
        bArr62[13] = 33;
        bArr62[14] = 2;
        bArr62[15] = -124;
        bArr62[16] = 116;
        bArr62[17] = -94;
        bArr62[18] = 16;
        bArr62[19] = 1;
        bArr62[20] = -1;
        bArr62[21] = -119;
        bArr62[22] = 118;
        bArr62[23] = 116;
        bArr62[24] = -75;
        bArr62[25] = -113;
        bArr62[26] = 63;
        bArr62[27] = 70;
        bArr62[28] = 29;
        bArr62[29] = -28;
        bArr62[30] = -2;
        bArr62[31] = 73;
        hashSet.add(new WF(bArr62));
        return hashSet;
    }

    public static int od(int i2, BX bx) {
        Object obj;
        Object obj2;
        Object obj3;
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String strXd = C1561oA.Xd("RA\t5.", (short) (Od.Xd() ^ (227483116 ^ (-227492918))));
            String strVd = Wg.vd("H<", (short) (C1607wl.Xd() ^ ((1045596815 ^ 852574745) ^ 209953659)));
            try {
                Class<?> cls = Class.forName(strXd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            for (String str : (String[]) obj) {
                if (entry.getValue() != null && BX(entry.getValue(), str)) {
                    i2 = (i2 + 20) - (i2 & 20);
                    String strKd = Qg.kd("9&k%\n", (short) (FB.Xd() ^ ((1950586916 ^ 1634284552) ^ 355110153)), (short) (FB.Xd() ^ ((555603705 ^ 1013918229) ^ 494063336)));
                    short sXd = (short) (C1607wl.Xd() ^ (1366938652 ^ 1366949832));
                    short sXd2 = (short) (C1607wl.Xd() ^ ((1371943088 ^ 626329395) ^ 1955799135));
                    int[] iArr = new int["LV".length()];
                    QB qb = new QB("LV");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
                        i3++;
                    }
                    String str2 = new String(iArr, 0, i3);
                    try {
                        Class<?> cls2 = Class.forName(strKd);
                        Field field2 = 0 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
                        field2.setAccessible(true);
                        obj2 = field2.get(null);
                    } catch (Throwable th2) {
                        obj2 = null;
                    }
                    Ao aoPX = bx.PX((EnumC1527hN) obj2);
                    String strUd = C1561oA.ud("|i/vc", (short) (C1607wl.Xd() ^ ((1137381451 ^ 1487297140) ^ 460157262)));
                    short sXd3 = (short) (C1580rY.Xd() ^ (2079346253 ^ (-2079346048)));
                    int[] iArr2 = new int["R@".length()];
                    QB qb2 = new QB("R@");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i4));
                        i4++;
                    }
                    String str3 = new String(iArr2, 0, i4);
                    try {
                        Class<?> cls3 = Class.forName(strUd);
                        Field field3 = 0 != 0 ? cls3.getField(str3) : cls3.getDeclaredField(str3);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    aoPX.SX((EnumC1599vd) obj3, null);
                }
            }
        }
        return (i2 + 2) - (i2 & 2);
    }

    public static byte[] ox() {
        byte[] bArr = new byte[C1607wl.Xd() ^ (1415852384 ^ 975184562)];
        // fill-array-data instruction
        bArr[0] = -9;
        bArr[1] = -73;
        bArr[2] = -73;
        bArr[3] = -21;
        bArr[4] = -1;
        bArr[5] = -9;
        bArr[6] = -1;
        bArr[7] = -5;
        return bArr;
    }

    private static int qd(File file, int[][] iArr, WF[] wfArr, int i2, BX bx) {
        Object obj;
        Object obj2;
        try {
            qX qXVar = new qX(file);
            try {
                if (!C1510dN.Yd(qXVar, wfArr, iArr, qXVar.length()).isEmpty()) {
                    i2 = (i2 + 69) - (i2 & 69);
                    String strZd = C1593ug.zd("\u001f\u000eU\u0011w", (short) (C1499aX.Xd() ^ (876616340 ^ (-876632607))), (short) (C1499aX.Xd() ^ ((1521930089 ^ 276205632) ^ (-1254121045))));
                    String strOd = C1561oA.od(")3", (short) (C1580rY.Xd() ^ ((1324503434 ^ 1364029553) ^ (-532626335))));
                    try {
                        Class<?> cls = Class.forName(strZd);
                        Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
                        field.setAccessible(true);
                        obj = field.get(null);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    Ao aoPX = bx.PX((EnumC1527hN) obj);
                    String strKd = C1561oA.Kd("*\u0019`*\u0019", (short) (Od.Xd() ^ ((1510013114 ^ 149131075) ^ (-1390618104))));
                    short sXd = (short) (C1580rY.Xd() ^ (1273952972 ^ (-1273928674)));
                    short sXd2 = (short) (C1580rY.Xd() ^ ((1227160147 ^ 2042460813) ^ (-815377620)));
                    int[] iArr2 = new int["W)".length()];
                    QB qb = new QB("W)");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr2[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
                        i3++;
                    }
                    String str = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls2 = Class.forName(strKd);
                        Field field2 = 0 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                        field2.setAccessible(true);
                        obj2 = field2.get(null);
                    } catch (Throwable th2) {
                        obj2 = null;
                    }
                    aoPX.SX((EnumC1599vd) obj2, null);
                }
                qXVar.close();
            } finally {
            }
        } catch (Throwable th3) {
        }
        return i2;
    }

    public static int ud(int i2, BX bx) {
        Object obj;
        Object obj2;
        Object obj3;
        int iQX = i2;
        if (hg.Qd()) {
            return iQX;
        }
        try {
            String strOd = EO.Od("^&zB5", (short) (C1607wl.Xd() ^ ((967357605 ^ 756421376) ^ 348033793)));
            String strQd = C1561oA.Qd("q{", (short) (C1633zX.Xd() ^ (223372746 ^ (-223372628))));
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 0 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            int iIntValue = ((Integer) obj).intValue();
            String strZd = C1593ug.zd("D3z' ", (short) (Od.Xd() ^ (1656907088 ^ (-1656901939))), (short) (Od.Xd() ^ (772536894 ^ (-772522639))));
            String strOd2 = C1561oA.od(">V", (short) (C1580rY.Xd() ^ ((1076863499 ^ 2094487527) ^ (-1022949099))));
            try {
                Class<?> cls2 = Class.forName(strZd);
                Field field2 = 0 != 0 ? cls2.getField(strOd2) : cls2.getDeclaredField(strOd2);
                field2.setAccessible(true);
                obj2 = field2.get(null);
            } catch (Throwable th2) {
                obj2 = null;
            }
            int iIntValue2 = ((Integer) obj2).intValue();
            String strKd = C1561oA.Kd("\u0011\u007fGsl", (short) (ZN.Xd() ^ ((1195508246 ^ 2114212) ^ 1197629644)));
            String strZd2 = Wg.Zd("um", (short) (C1499aX.Xd() ^ (42145992 ^ (-42140509))), (short) (C1499aX.Xd() ^ (1947465035 ^ (-1947465878))));
            try {
                Class<?> cls3 = Class.forName(strKd);
                Field field3 = 0 != 0 ? cls3.getField(strZd2) : cls3.getDeclaredField(strZd2);
                field3.setAccessible(true);
                obj3 = field3.get(null);
            } catch (Throwable th3) {
                obj3 = null;
            }
            C1632zN c1632zN = new C1632zN(iQX, bx, iIntValue, iIntValue2, (int[]) obj3);
            c1632zN.setPriority((539432716 ^ 1914911537) ^ 1376005175);
            c1632zN.start();
            c1632zN.join();
            iQX = c1632zN.qX();
        } catch (Exception e2) {
        }
        return (iQX + 2) - (iQX & 2);
    }

    public static int wd(int i2, BX bx) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList<String> arrayList = new ArrayList(C1499aX.Xd() ^ (-1134257896));
        short sXd = (short) (FB.Xd() ^ (OY.Xd() ^ (146254354 ^ 211592030)));
        short sXd2 = (short) (FB.Xd() ^ (1252479113 ^ 1252470188));
        int[] iArr = new int["C\u0002)Mj\u001d\b\u0013\rp4\u001bgh~".length()];
        QB qb = new QB("C\u0002)Mj\u001d\b\u0013\rp4\u001bgh~");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        try {
            FileReader fileReader = new FileReader(new File(new String(iArr, 0, i3)));
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.endsWith(Ig.wd("\u00177\u0005", (short) (C1499aX.Xd() ^ ((1210412435 ^ 1910363750) ^ (-972609594)))))) {
                            if (!line.contains(EO.Od("21ez3YArW\u0004~", (short) (FB.Xd() ^ (1429482565 ^ 1429483552))))) {
                                short sXd3 = (short) (C1499aX.Xd() ^ (1297628268 ^ (-1297643226)));
                                int[] iArr2 = new int[")eaY%W]b`ZS\u001e".length()];
                                QB qb2 = new QB(")eaY%W]b`ZS\u001e");
                                int i4 = 0;
                                while (qb2.YK()) {
                                    int iKK2 = qb2.KK();
                                    Xu xuXd2 = Xu.Xd(iKK2);
                                    iArr2[i4] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i4 + xuXd2.CK(iKK2));
                                    i4++;
                                }
                                if (!line.contains(new String(iArr2, 0, i4))) {
                                }
                            }
                            arrayList.add(line);
                        }
                    } finally {
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } finally {
            }
        } catch (Throwable th) {
        }
        CRC32 crc32 = new CRC32();
        for (String str : arrayList) {
            String strSubstring = str.substring(str.lastIndexOf(136043354 ^ 136043381) + 1);
            try {
                crc32.reset();
                crc32.update(strSubstring.getBytes());
                WF wf = new WF(C1593ug.yd((int) crc32.getValue()));
                String strZd = C1593ug.zd("*\u0019`\r\u0006", (short) (C1633zX.Xd() ^ ((1184942753 ^ 2086683886) ^ (-985699055))), (short) (C1633zX.Xd() ^ ((147599117 ^ 611295644) ^ (-748926029))));
                String strOd = C1561oA.od("eY", (short) (OY.Xd() ^ (1677325063 ^ 1677296096)));
                try {
                    Class<?> cls = Class.forName(strZd);
                    Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
                    field.setAccessible(true);
                    obj = field.get(null);
                } catch (Throwable th2) {
                    obj = null;
                }
                if (((Set) obj).contains(wf)) {
                    C1570qB c1570qB = new C1570qB(str);
                    if (c1570qB.wd && c1570qB.Od && c1570qB.yd) {
                        i2 |= 516;
                        String strKd = C1561oA.Kd("gV\u001eY@", (short) (Od.Xd() ^ (1556860707 ^ (-1556843295))));
                        short sXd4 = (short) (Od.Xd() ^ (1104582137 ^ (-1104589231)));
                        short sXd5 = (short) (Od.Xd() ^ (505692840 ^ (-505699860)));
                        int[] iArr3 = new int[";\u0006".length()];
                        QB qb3 = new QB(";\u0006");
                        int i5 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i5] = xuXd3.fK(((i5 * sXd5) ^ sXd4) + xuXd3.CK(iKK3));
                            i5++;
                        }
                        String str2 = new String(iArr3, 0, i5);
                        try {
                            Class<?> cls2 = Class.forName(strKd);
                            Field field2 = 0 != 0 ? cls2.getField(str2) : cls2.getDeclaredField(str2);
                            field2.setAccessible(true);
                            obj2 = field2.get(null);
                        } catch (Throwable th3) {
                            obj2 = null;
                        }
                        Ao aoPX = bx.PX((EnumC1527hN) obj2);
                        String strXd = C1561oA.Xd("M<\u0004M<", (short) (C1580rY.Xd() ^ ((1480633752 ^ 268692170) ^ (-1212360486))));
                        String strVd = Wg.vd("UK", (short) (Od.Xd() ^ ((1199928846 ^ 348858852) ^ (-1397646520))));
                        try {
                            Class<?> cls3 = Class.forName(strXd);
                            Field field3 = 0 != 0 ? cls3.getField(strVd) : cls3.getDeclaredField(strVd);
                            field3.setAccessible(true);
                            obj3 = field3.get(null);
                        } catch (Throwable th4) {
                            obj3 = null;
                        }
                        aoPX.SX((EnumC1599vd) obj3, null);
                    }
                }
            } catch (Exception e2) {
            }
        }
        return i2 | 2;
    }

    public static int yd(int i2, BX bx) {
        Object obj;
        Object obj2;
        File[] fileArrListFiles = new File(C1561oA.Xd("K\u000e\u0011\u000f\u0004P", (short) (OY.Xd() ^ ((1128495849 ^ 1907961118) ^ 855256236))) + Process.myPid() + Wg.vd("T\u001b\t\u001c\u0015Y", (short) (C1580rY.Xd() ^ (1405332807 ^ (-1405343143))))).listFiles();
        if (fileArrListFiles != null) {
            int length = fileArrListFiles.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (YX(fileArrListFiles[i3].getAbsolutePath() + Qg.kd("\u001c__K]]Z", (short) (C1499aX.Xd() ^ (548056929 ^ (-548052856))), (short) (C1499aX.Xd() ^ (300131457 ^ (-300145534)))))) {
                    i2 |= OlympusCameraSettingsMakernoteDirectory.TagStackedImage;
                    int iXd = C1499aX.Xd() ^ 1134256147;
                    short sXd = (short) (C1580rY.Xd() ^ ((855143992 ^ 229889456) ^ (-1061940356)));
                    short sXd2 = (short) (C1580rY.Xd() ^ iXd);
                    int[] iArr = new int["hU\u001bT9".length()];
                    QB qb = new QB("hU\u001bT9");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(sXd + i4 + xuXd.CK(iKK) + sXd2);
                        i4++;
                    }
                    String str = new String(iArr, 0, i4);
                    String strUd = C1561oA.ud("lv", (short) (C1633zX.Xd() ^ (1217834140 ^ (-1217842808))));
                    try {
                        Class<?> cls = Class.forName(str);
                        Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
                        field.setAccessible(true);
                        obj = field.get(null);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    Ao aoPX = bx.PX((EnumC1527hN) obj);
                    short sXd3 = (short) (C1607wl.Xd() ^ (1274528115 ^ 1274539172));
                    int[] iArr2 = new int["\u0004p:\u0002j".length()];
                    QB qb2 = new QB("\u0004p:\u0002j");
                    int i5 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i5));
                        i5++;
                    }
                    String str2 = new String(iArr2, 0, i5);
                    String strYd = C1561oA.Yd("\u001c\f", (short) (C1633zX.Xd() ^ (1192065905 ^ (-1192047005))));
                    try {
                        Class<?> cls2 = Class.forName(str2);
                        Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                        field2.setAccessible(true);
                        obj2 = field2.get(null);
                    } catch (Throwable th2) {
                        obj2 = null;
                    }
                    aoPX.SX((EnumC1599vd) obj2, null);
                } else {
                    i3++;
                }
            }
        }
        return (-1) - (((-1) - i2) & ((-1) - 2));
    }

    public static String zd() {
        short sXd = (short) (C1607wl.Xd() ^ ((1188495591 ^ 152137720) ^ 1338407167));
        short sXd2 = (short) (C1607wl.Xd() ^ (1018122474 ^ 1018107520));
        int[] iArr = new int["\u001a\u0013".length()];
        QB qb = new QB("\u001a\u0013");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static int zx() {
        return OY.Xd() ^ (428854529 ^ 497342357);
    }
}
