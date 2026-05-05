package yg;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yg.oQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1562oQ {
    public static String[] Xd = null;

    static {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.od("dQ\u0017W8", (short) (C1580rY.Xd() ^ (1657148660 ^ (-1657152237))))).getDeclaredMethod(C1561oA.Kd("\u0011:", (short) (C1499aX.Xd() ^ ((759094475 ^ 645737952) ^ (-188974275)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String[] strArr = (String[]) declaredMethod.invoke(null, objArr);
            String strZd = Wg.Zd("\u0016wrM-", (short) (Od.Xd() ^ ((540895151 ^ 1303360858) ^ (-1838346219))), (short) (Od.Xd() ^ ((1502959531 ^ 2118686972) ^ (-668835677))));
            String strXd = C1561oA.Xd("\u0002\u000f", (short) (FB.Xd() ^ (1239833505 ^ 1239826305)));
            try {
                Class<?> cls = Class.forName(strZd);
                Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                field.setAccessible(true);
                field.set(null, strArr);
            } catch (Throwable th) {
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String Kd() {
        return Qg.kd("s}", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (131870039 ^ (-66539468)))), (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (1113878469 ^ 33493209))));
    }

    public static String[] Px() {
        String[] strArr = new String[1];
        short sXd = (short) (ZN.Xd() ^ (369094427 ^ 369071082));
        short sXd2 = (short) (ZN.Xd() ^ ((48328182 ^ 305632456) ^ 282502672));
        int[] iArr = new int[":EB\u0002:A@7;3z-9.;70*r1$47)-k1\u001d'%\u001b\u0019\u001a!ca\u0007\u0013\u001d\u001bp\u000f\u0010\u0017}\u000f\u001b\u001e\u0010\t\n".length()];
        QB qb = new QB(":EB\u0002:A@7;3z-9.;70*r1$47)-k1\u001d'%\u001b\u0019\u001a!ca\u0007\u0013\u001d\u001bp\u000f\u0010\u0017}\u000f\u001b\u001e\u0010\t\n");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        strArr[0] = new String(iArr, 0, i2);
        return strArr;
    }

    public static String Xd() {
        short sXd = (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1928838064 ^ (-829218590))));
        int[] iArr = new int["ta'gP".length()];
        QB qb = new QB("ta'gP");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.reflect.Method] */
    public static void Yd() throws Throwable {
        Method declaredMethod;
        if (hg.Qd()) {
            return;
        }
        Wl wl = new Wl();
        if (!wd(wl)) {
            String strQd = C1561oA.Qd("8%j\u0013*", (short) (ZN.Xd() ^ ((1200295052 ^ 2027537133) ^ 1062399383)));
            String strZd = C1593ug.zd(":G", (short) (FB.Xd() ^ ((1825183967 ^ 340144635) ^ 2022441628)), (short) (FB.Xd() ^ (309441925 ^ 309439071)));
            try {
                Class<?> cls = Class.forName(strQd);
                boolean z2 = false;
                try {
                    strZd = cls.getDeclaredMethod(strZd, new Class[0]);
                    declaredMethod = strZd;
                } catch (NoSuchMethodException e2) {
                    z2 = true;
                    declaredMethod = cls.getDeclaredMethod(strZd, Class.forName(C1561oA.od(">J?LHA;\u00048CAF6>C{\u0010;9>.@;", (short) (C1633zX.Xd() ^ ((1866170348 ^ 698737982) ^ (-1184799979))))));
                }
                if (!z2) {
                    declaredMethod.invoke(null, new Object[0]);
                    return;
                }
                Object[] objArr = new Object[1];
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(C1561oA.Kd("\u001e\rT \u0002", (short) (C1607wl.Xd() ^ (1535080536 ^ 1535060621)))).getDeclaredMethod(Wg.Zd("Ol", (short) (ZN.Xd() ^ (1921077950 ^ 1921083327)), (short) (ZN.Xd() ^ ((448303425 ^ 1123909302) ^ 1480965848))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    objArr[0] = (Context) declaredMethod2.invoke(null, objArr2);
                    declaredMethod.invoke(null, objArr);
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
        int iXd = C1499aX.Xd() ^ (2120322211 ^ (-1039854483));
        int iXd2 = Od.Xd() ^ (1065419398 ^ 2021181312);
        Class<?> cls2 = Class.forName(C1561oA.ud("hU\u001bS6", (short) (C1607wl.Xd() ^ (847318703 ^ 847337853))));
        Class<?>[] clsArr = new Class[(618783076 ^ 1383075584) ^ 1989275232];
        clsArr[0] = Integer.TYPE;
        clsArr[1] = Integer.TYPE;
        clsArr[717129105 ^ 717129107] = Integer.TYPE;
        clsArr[2068110547 ^ 2068110544] = Class.forName(C1561oA.yd("\u001d\fOy\f", (short) (ZN.Xd() ^ (ZN.Xd() ^ (1881419875 ^ 1135491313)))));
        Object[] objArr3 = new Object[C1633zX.Xd() ^ (2100340085 ^ (-157401414))];
        objArr3[0] = Integer.valueOf(iXd);
        objArr3[1] = Integer.valueOf(iXd2);
        objArr3[1221190110 ^ 1221190108] = 1;
        objArr3[ZN.Xd() ^ 864698099] = wl;
        Method declaredMethod3 = cls2.getDeclaredMethod(C1561oA.Yd("<L", (short) (Od.Xd() ^ (961607133 ^ (-961602910)))), clsArr);
        try {
            declaredMethod3.setAccessible(true);
            boolean zBooleanValue = ((Boolean) declaredMethod3.invoke(null, objArr3)).booleanValue();
            String strQd2 = Xg.qd(")\u0018_\n#", (short) (OY.Xd() ^ ((1995548712 ^ 10687846) ^ 1985148425)), (short) (OY.Xd() ^ (1220385695 ^ 1220407988)));
            String strWd = Jg.Wd("L)", (short) (FB.Xd() ^ ((86546152 ^ 873887132) ^ 826202754)), (short) (FB.Xd() ^ ((307182136 ^ 1367830370) ^ 1137193897)));
            Class<?> cls3 = Class.forName(ZO.xd("n{ja<", (short) (ZN.Xd() ^ ((807930125 ^ 644311245) ^ 374299968)), (short) (ZN.Xd() ^ (1623589950 ^ 1623594673))));
            Class<?>[] clsArr2 = new Class[332610639 ^ 332610636];
            clsArr2[0] = Class.forName(C1626yg.Ud("V3XqE\u0018lSl\u000ee/M%%u", (short) (Od.Xd() ^ (141827961 ^ (-141832237))), (short) (Od.Xd() ^ (1007364943 ^ (-1007356347)))));
            clsArr2[1] = Class.forName(Ig.wd(" gN\u001e2\u001b8m#Nyt\u001f\u0010I!", (short) (C1580rY.Xd() ^ (1751089695 ^ (-1751112863)))));
            clsArr2[2010578112 ^ 2010578114] = Boolean.TYPE;
            Object[] objArr4 = new Object[653614517 ^ 653614518];
            objArr4[0] = strQd2;
            objArr4[1] = strWd;
            objArr4[(215544060 ^ 1632634120) ^ 1837692406] = Boolean.valueOf(zBooleanValue);
            Method declaredMethod4 = cls3.getDeclaredMethod(EO.Od("\u000bh", (short) (Od.Xd() ^ ((1456415139 ^ 2102189890) ^ (-730040119)))), clsArr2);
            try {
                declaredMethod4.setAccessible(true);
                declaredMethod4.invoke(null, objArr4);
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    private static boolean wd(Wl wl) throws Throwable {
        Object obj;
        boolean z2 = false;
        short sXd = (short) (FB.Xd() ^ (987462197 ^ 987457433));
        int[] iArr = new int["\u007fn6\u0002c".length()];
        QB qb = new QB("\u007fn6\u0002c");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (C1580rY.Xd() ^ ((1085774586 ^ 1491073594) ^ (-409479494)));
            int[] iArr2 = new int["\u0001\u000e".length()];
            QB qb2 = new QB("\u0001\u000e");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                Context context = (Context) declaredMethod.invoke(null, objArr);
                String strKd = Qg.kd("BCBCPOD<BD@JN", (short) (C1633zX.Xd() ^ (711140672 ^ (-711141936))), (short) (C1633zX.Xd() ^ ((1788060898 ^ 1596065802) ^ (-900850404))));
                Class<?> cls2 = Class.forName(hg.Vd("\u0004\u0010\u0005\u0012\u000e\u0007\u0001I}\t\u0007\f{\u0004\tAU\u0001~\u0004s\u0006\u0001", (short) (C1607wl.Xd() ^ (1494503211 ^ 1494489544)), (short) (C1607wl.Xd() ^ (1344518424 ^ 1344516387))));
                Class<?>[] clsArr2 = new Class[1];
                clsArr2[0] = Class.forName(C1561oA.ud("g]q['dXd\\\"FfcY]U", (short) (FB.Xd() ^ ((1777825032 ^ 65457398) ^ 1779563616))));
                Object[] objArr2 = {strKd};
                Method method = cls2.getMethod(C1561oA.yd("0/;\u001b>97)>%4BC7.1", (short) (FB.Xd() ^ ((120665298 ^ 1517807671) ^ 1564904192))), clsArr2);
                try {
                    method.setAccessible(true);
                    AccessibilityManager accessibilityManager = (AccessibilityManager) method.invoke(context, objArr2);
                    if (accessibilityManager != null) {
                        Class<?> cls3 = Class.forName(C1561oA.Yd("(6-<:51{E96I\u0001589<KLC=EIGSY\u000f#FGJYZQKSWUag<Q_SZYg", (short) (OY.Xd() ^ (511710706 ^ 511710534))));
                        Class<?>[] clsArr3 = new Class[0];
                        Object[] objArr3 = new Object[0];
                        short sXd3 = (short) (C1633zX.Xd() ^ ((261397476 ^ 1214182971) ^ (-1204425997)));
                        short sXd4 = (short) (C1633zX.Xd() ^ (2080948840 ^ (-2080939592)));
                        int[] iArr3 = new int["~\n\\\u0007z|\b\u0002\u0002".length()];
                        QB qb3 = new QB("~\n\\\u0007z|\b\u0002\u0002");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) + sXd4);
                            i4++;
                        }
                        Method method2 = cls3.getMethod(new String(iArr3, 0, i4), clsArr3);
                        try {
                            method2.setAccessible(true);
                            if (((Boolean) method2.invoke(accessibilityManager, objArr3)).booleanValue()) {
                                String strWd = Jg.Wd("Vk\u0004H\\", (short) (C1607wl.Xd() ^ ((401757365 ^ 1013529734) ^ 731587395)), (short) (C1607wl.Xd() ^ ((1447282138 ^ 2077924069) ^ 765003054)));
                                String strXd = ZO.xd("8\u0010", (short) (ZN.Xd() ^ ((258305511 ^ 1243826817) ^ 1162228754)), (short) (ZN.Xd() ^ ((1226226329 ^ 987429445) ^ 1942775893)));
                                try {
                                    Class<?> cls4 = Class.forName(strWd);
                                    Field field = 0 != 0 ? cls4.getField(strXd) : cls4.getDeclaredField(strXd);
                                    field.setAccessible(true);
                                    obj = field.get(null);
                                } catch (Throwable th) {
                                    obj = null;
                                }
                                List listAsList = Arrays.asList((String[]) obj);
                                int i5 = (840784739 ^ 1187673708) ^ (-1960258832);
                                Class<?> cls5 = Class.forName(C1626yg.Ud("GI@/(#b\fh&E;At}C\u000ev).,XKB]\tvj\u0006_UHl\u00108<\u0014k\u0018\u0002pA$e:mW", (short) (OY.Xd() ^ (23266965 ^ 23278185)), (short) (OY.Xd() ^ ((1331767106 ^ 170688890) ^ 1162712983))));
                                Class<?>[] clsArr4 = {Integer.TYPE};
                                Object[] objArr4 = {Integer.valueOf(i5)};
                                Method method3 = cls5.getMethod(Ig.wd("k\u0016QS\"pG/q\u0012f\u0015FTL,Yf\u0013`\u0017W<\u0014$fJ\rZL\t\b{`", (short) (C1580rY.Xd() ^ (1854024343 ^ (-1854024157)))), clsArr4);
                                try {
                                    method3.setAccessible(true);
                                    Iterator it = ((List) method3.invoke(accessibilityManager, objArr4)).iterator();
                                    while (it.hasNext()) {
                                        String id = ((AccessibilityServiceInfo) it.next()).getId();
                                        if (!listAsList.contains(id)) {
                                            wl.MK(id);
                                            z2 = true;
                                        }
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (Exception e6) {
        }
        return z2;
    }
}
