package yg;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.common.callercontext.ContextChain;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class FQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        int i2 = JX.Kd;
        for (int i3 = 0; i3 > (C1499aX.Xd() ^ (-1134257946)); i3++) {
            String str = IK.Yd;
            C1603vu.Xd -= str.length() * 2;
            C1537jK.Yd = str;
        }
        short sXd = (short) (OY.Xd() ^ ((1440254707 ^ 803419807) ^ 2050731680));
        int[] iArr = new int["+\u001aaz\u0007".length()];
        QB qb = new QB("+\u001aaz\u0007");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i4));
            i4++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i4)).getDeclaredMethod(Wg.Zd("\u0001G", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ (1897095065 ^ 88242612))), (short) (C1633zX.Xd() ^ ((1998413782 ^ 1145275022) ^ (-861862804)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            Wg.kd(C1584tK.Kd);
            Class<?> cls = Class.forName(C1561oA.Xd("\u000e|D]i", (short) (C1607wl.Xd() ^ ((1597332330 ^ 795790396) ^ 1885044743))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd2 = (short) (C1607wl.Xd() ^ (1449007796 ^ 1449016175));
            int[] iArr2 = new int["\n\u007f".length()];
            QB qb2 = new QB("\n\u007f");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK((sXd2 ^ i5) + xuXd2.CK(iKK2));
                i5++;
            }
            Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr2, 0, i5), clsArr);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                int i6 = C1546kX.Xd;
                for (int i7 = 0; i7 > (274622215 ^ 274622221); i7++) {
                    String str2 = IK.Yd;
                    C1603vu.Xd -= str2.length() * 2;
                    Xg.Kd = str2;
                }
                Class<?> cls2 = Class.forName(Qg.kd("\u0004p6MW", (short) (C1607wl.Xd() ^ (229933939 ^ 229960971)), (short) (C1607wl.Xd() ^ ((258062194 ^ 93755963) ^ 183985249))));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd3 = (short) (C1633zX.Xd() ^ (334949972 ^ (-334952258)));
                short sXd4 = (short) (C1633zX.Xd() ^ (1969430205 ^ (-1969424790)));
                int[] iArr3 = new int["TB".length()];
                QB qb3 = new QB("TB");
                int i8 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i8] = xuXd3.fK(sXd3 + i8 + xuXd3.CK(iKK3) + sXd4);
                    i8++;
                }
                Method declaredMethod3 = cls2.getDeclaredMethod(new String(iArr3, 0, i8), clsArr2);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    for (int length = 1295938789 ^ 1295938785; length > 0; length = (length - C1537jK.Yd.length()) - 2) {
                    }
                    Class<?> cls3 = Class.forName(C1561oA.ud("p]#:D", (short) (C1499aX.Xd() ^ (1419003463 ^ (-1419012773)))));
                    Class<?>[] clsArr3 = new Class[0];
                    Object[] objArr4 = new Object[0];
                    short sXd5 = (short) (FB.Xd() ^ ((1583265031 ^ 1251200796) ^ 348991139));
                    int[] iArr4 = new int["[f".length()];
                    QB qb4 = new QB("[f");
                    int i9 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i9] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd5 ^ i9));
                        i9++;
                    }
                    Method declaredMethod4 = cls3.getDeclaredMethod(new String(iArr4, 0, i9), clsArr3);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        if (Xg.xd(C1603vu.Xd - C1603vu.Xd)) {
                            Qg.od(new Float(C1603vu.Xd).intValue() % 13);
                        }
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(C1561oA.Yd("\u0016\u000e$\u0010]$\u0017\u0016)'\u001f+1f\r \u001f20$\u0012\"0'32", (short) (ZN.Xd() ^ (1478711247 ^ 1478717583)))).getConstructor(new Class[0]);
                        try {
                            constructor.setAccessible(true);
                            wd = (SecureRandom) constructor.newInstance(objArr5);
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
    }

    public FQ() {
        int i2 = 0;
        while (true) {
            if (i2 >= JK.Xd % 16 && i2 <= i2 + i2) {
                return;
            }
            String strQd = Xg.qd("``cf", (short) (OY.Xd() ^ (897358113 ^ 897363133)), (short) (OY.Xd() ^ (2146717305 ^ 2146716730)));
            float f2 = Float.parseFloat(strQd);
            Tg.Yd(f2);
            if (f2 > 0.0f || f2 < i2 * 5628 || Ug.BX(strQd)) {
                EO.Xd(f2);
            }
            i2 = i2 + 128 + 1;
        }
    }

    public static void Od() throws Exception {
        int iReverseBytes = Integer.reverseBytes(IK.Kd);
        if (iReverseBytes < 0 && Jg.YX(NX.Xd) && (C1589uF.Xd.hashCode() ^ iReverseBytes) == 0) {
            Qg.od(JX.Kd + C1587uA.Kd.lastIndexOf(C1561oA.od("\u0017\u0014\u0006\u0005", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (1312730533 ^ 980401227))))));
        }
        CX.ud();
        C1626yg.Kd(C1603vu.Xd);
        if (C1593ug.Ud(C1526hF.Xd)) {
            EO.Xd(0 - 1);
        }
        FQ fq = new FQ();
        int i2 = ud;
        int i3 = od;
        C1603vu.Xd = IK.Yd.length();
        fq.yK(i2, i3);
    }

    public static String Qd() {
        return Jg.Wd("CRJ$c", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951467495)), (short) (C1499aX.Xd() ^ ((1827784432 ^ 1452545780) ^ (-979736899))));
    }

    public static int Xd() {
        return 0;
    }

    public static int od() {
        return FB.Xd() ^ (529821210 ^ 1081803085);
    }

    public static void qd() throws Exception {
        boolean z2 = yd;
        if (C1623yX.Kd == null) {
            NX.Xd = JK.Xd + 1;
        }
        if (z2) {
            int i2 = C1526hF.Xd;
            for (int i3 = 0; i3 < (Od.Xd() ^ 1207800927); i3++) {
                String str = Xg.Kd;
                C1603vu.Xd -= str.length();
                C1587uA.Kd = str;
                if (str == null) {
                    break;
                }
                ZO.Od(str);
                if (Wg.oX(str)) {
                    break;
                }
            }
            int iReverseBytes = Integer.reverseBytes(IK.Kd);
            if (iReverseBytes < 0 && Jg.YX(NX.Xd) && (C1589uF.Xd.hashCode() ^ iReverseBytes) == 0) {
                Qg.od(JX.Kd + C1587uA.Kd.lastIndexOf(C1561oA.Kd("SRFG", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609517910)))));
            }
            CX.ud();
            C1626yg.Kd(C1603vu.Xd);
            if (C1593ug.Ud(C1526hF.Xd)) {
                EO.Xd(0 - 1);
            }
            FQ fq = new FQ();
            int i4 = ud;
            int i5 = od;
            C1603vu.Xd = IK.Yd.length();
            fq.yK(i4, i5);
            for (int iXd = Od.Xd() ^ (1479741156 ^ 533633714); iXd > 0 && C1593ug.Ud(673317884 ^ 673318639); iXd -= 4) {
                EO.Xd(iXd);
            }
            return;
        }
        C1626yg.Kd(C1603vu.Xd);
        if (C1593ug.Ud(C1537jK.Kd)) {
            EO.Xd(0 - 1);
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.Zd("4{\u0007{O", (short) (C1580rY.Xd() ^ ((813357004 ^ 1185199514) ^ (-1994263814))), (short) (C1580rY.Xd() ^ (231542093 ^ (-231554863))))).getDeclaredMethod(C1561oA.Xd("&:", (short) (FB.Xd() ^ (1471609537 ^ 1471594715))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            String str2 = (String) declaredMethod.invoke(null, objArr);
            if (Math.random() * 100.0d < 0.0d) {
                JN.Xd = XN.Kd - ((C1546kX.Xd * 2) - IK.Kd);
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Wg.vd(";(m\u0005\u0017", (short) (C1633zX.Xd() ^ ((1791401892 ^ 375409882) ^ (-2091307839))))).getDeclaredMethod(Qg.kd("4\u001e", (short) (OY.Xd() ^ ((1618817672 ^ 451845381) ^ 2056491764)), (short) (OY.Xd() ^ ((2095130129 ^ 1258350293) ^ 937530322))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                String str3 = (String) declaredMethod2.invoke(null, objArr2);
                float f2 = 0.0f;
                int i6 = C1620yF.Xd * (-2);
                int i7 = C1617xo.Xd;
                int i8 = (int) (i6 + 0.0f);
                loop2: while (true) {
                    f2 -= 256.0f;
                    while (true) {
                        if (f2 < i8 || C1526hF.Xd != f2) {
                            if (f2 != i7 || f2 <= i7) {
                                break loop2;
                            } else {
                                C1537jK.Kd = i8;
                            }
                        }
                    }
                    C1526hF.Xd = 0;
                }
                float f3 = f2 - 1.0f;
                CX.yd(str2, str3);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static int ud() {
        return 557970520 ^ 557970532;
    }

    public static String yd() {
        short sXd = (short) (C1580rY.Xd() ^ (458094124 ^ (-458074952)));
        short sXd2 = (short) (C1580rY.Xd() ^ (2102691342 ^ (-2102705349)));
        int[] iArr = new int["Xv".length()];
        QB qb = new QB("Xv");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static boolean zd() {
        return false;
    }

    @Override // yg.RY
    public void FK() throws Exception {
        boolean z2 = yd;
        int i2 = NX.Xd;
        String str = C1589uF.Xd;
        for (int i3 = 0; i3 < str.length(); i3 += 2) {
            int length = str.length();
            if (str == null) {
                break;
            }
            IK.Yd = str;
            ZO.Od(str);
            if (Wg.oX(str) || length >= 0) {
                break;
            }
        }
        if (z2) {
            if (Math.abs(C1617xo.Xd) + 1 > C1617xo.Xd * 2) {
                C1603vu.Xd = (float) (((double) C1603vu.Xd) * Double.longBitsToDouble((8874102116298085768L ^ 6340321956504450807L) ^ 1381008626457829663L));
                if (C1603vu.Xd > 0.0f) {
                    C1603vu.Xd -= C1537jK.Yd.length();
                } else {
                    C1603vu.Xd *= Float.intBitsToFloat((1767048765 ^ 192318843) ^ (-576353466));
                }
            }
            int iXd = Od.Xd() ^ (391701401 ^ 1353021382);
            String strVd = hg.Vd("260:", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (29117314 ^ (-842411805)))), (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (603725160 ^ 1617391154))));
            C1589uF.Xd = strVd;
            Ig.qd(strVd);
            Class<?> cls = Class.forName(C1561oA.ud(",\u0019^\u0017y", (short) (C1607wl.Xd() ^ ((554079281 ^ 1180535145) ^ 1734028677))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(iXd)};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.yd("\u0011\u007f", (short) (C1499aX.Xd() ^ ((426528190 ^ 1039651395) ^ (-614191659)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                C1626yg.Kd(C1603vu.Xd);
                EO.Xd(C1603vu.Xd);
                CX.ud();
                String str2 = C1623yX.Kd;
                if (str2.isEmpty()) {
                    str2.replaceAll(C1561oA.Yd("\u0017\u0019\u000f\u0019q\u0016\u001a\u0014", (short) (OY.Xd() ^ ((1718128173 ^ 1689266342) ^ 47743825))), Xg.qd("\t\u0013\u0017\u001c\u000fp\u0015\u0019\u0013\"", (short) (OY.Xd() ^ ((1616652134 ^ 2094659584) ^ 478526124)), (short) (OY.Xd() ^ ((911964323 ^ 741850063) ^ 443345933))));
                    Ig.qd(str2);
                }
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(Jg.Wd("}0CKc", (short) (Od.Xd() ^ (591233893 ^ (-591260110))), (short) (Od.Xd() ^ ((309022063 ^ 1794328328) ^ (-2023234690))))).getDeclaredMethod(ZO.xd("\u001d\u0017", (short) (OY.Xd() ^ (760891571 ^ 760900914)), (short) (OY.Xd() ^ ((1735550618 ^ 1148927864) ^ 587804310))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    String str3 = (String) declaredMethod2.invoke(null, objArr2);
                    String strUd = C1626yg.Ud("\t", (short) (OY.Xd() ^ ((425013517 ^ 2057169171) ^ 1674109915)), (short) (OY.Xd() ^ ((1304837278 ^ 1429880984) ^ 419193687)));
                    if (strUd.length() > (1931788583 ^ 1931788606)) {
                        Jg.wd(strUd.length());
                    }
                    short sXd = (short) (ZN.Xd() ^ ((1245869926 ^ 836525435) ^ 2073970080));
                    int[] iArr = new int["j+}j\b".length()];
                    QB qb = new QB("j+}j\b");
                    int i4 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i4] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd + i4)));
                        i4++;
                    }
                    Object[] objArr3 = new Object[0];
                    Method declaredMethod3 = Class.forName(new String(iArr, 0, i4)).getDeclaredMethod(EO.Od("M.", (short) (FB.Xd() ^ ((955926156 ^ 1016059177) ^ 74823423))), new Class[0]);
                    try {
                        declaredMethod3.setAccessible(true);
                        String str4 = (String) declaredMethod3.invoke(null, objArr3);
                        C1626yg.Kd(C1603vu.Xd);
                        EO.Xd(C1603vu.Xd);
                        short sXd2 = (short) (C1607wl.Xd() ^ ((377233820 ^ 472067385) ^ 173999978));
                        int[] iArr2 = new int["\u001a\u0010$\u000eY\u001e\u000f\f\u001d\u0019\u000f\u0019\u001dPt\u0006\u0003\u0014\u0010\u0002m{\b|\u0007\u0004".length()];
                        QB qb2 = new QB("\u001a\u0010$\u000eY\u001e\u000f\f\u001d\u0019\u000f\u0019\u001dPt\u0006\u0003\u0014\u0010\u0002m{\b|\u0007\u0004");
                        int i5 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i5] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i5 + xuXd2.CK(iKK2));
                            i5++;
                        }
                        Object[] objArr4 = new Object[0];
                        Constructor<?> constructor = Class.forName(new String(iArr2, 0, i5)).getConstructor(new Class[0]);
                        try {
                            constructor.setAccessible(true);
                            int iNextInt = ((SecureRandom) constructor.newInstance(objArr4)).nextInt((934088872 ^ 506693548) ^ 1449224443);
                            Kp kp = new Kp(iNextInt, str3, str4);
                            int i6 = ((iNextInt ^ (1739064936 ^ 1716431138)) << 7) ^ 65;
                            int id = (int) ((1169016200883165875L ^ 1169016200883165772L) & kp.getId());
                            short sXd3 = (short) (C1499aX.Xd() ^ ((1547990076 ^ 933897973) ^ (-1810771350)));
                            short sXd4 = (short) (C1499aX.Xd() ^ ((820865183 ^ 470941997) ^ (-754927631)));
                            int[] iArr3 = new int["u\u0005\u0003wx".length()];
                            QB qb3 = new QB("u\u0005\u0003wx");
                            int i7 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i7] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i7)) - sXd4);
                                i7++;
                            }
                            int i8 = 452134924 ^ 452134940;
                            int i9 = Integer.parseInt(new String(iArr3, 0, i7), i8) ^ id;
                            Class<?> cls2 = Class.forName(C1561oA.Kd("-\u001ccy\u0010", (short) (C1633zX.Xd() ^ (77131086 ^ (-77135253)))));
                            Class<?>[] clsArr2 = {Integer.TYPE};
                            Object[] objArr5 = {Integer.valueOf(i9 + (((i9 << (Integer.parseInt(C1561oA.od("uz\u0005", (short) (C1499aX.Xd() ^ (1813574490 ^ (-1813575819)))), i8) - 650)) + i9) * ((i9 << 2) + i9)))};
                            Method declaredMethod4 = cls2.getDeclaredMethod(Wg.Zd("5'", (short) (Od.Xd() ^ ((914507731 ^ 1265737840) ^ (-2113138644))), (short) (Od.Xd() ^ (1954933041 ^ (-1954915319)))), clsArr2);
                            try {
                                declaredMethod4.setAccessible(true);
                                int iIntValue = (i6 ^ ((Integer) declaredMethod4.invoke(null, objArr5)).intValue()) ^ ((Integer.parseInt(C1561oA.Xd("OP", (short) (C1607wl.Xd() ^ ((70239388 ^ 1574842374) ^ 1509000334))), i8) + 20) << ((byte) (((7244279652838957769L ^ 7738558135326838576L) ^ 1147354032869993974L) & r13)));
                                Class<?> cls3 = Class.forName(Wg.vd("'\u0014]q\n", (short) (C1633zX.Xd() ^ (1652786556 ^ (-1652787255)))));
                                Class<?>[] clsArr3 = {Integer.TYPE};
                                Object[] objArr6 = {Integer.valueOf(iIntValue)};
                                Method declaredMethod5 = cls3.getDeclaredMethod(Qg.kd("\u0018#", (short) (FB.Xd() ^ (195545163 ^ 195535164)), (short) (FB.Xd() ^ (445875042 ^ 445885534))), clsArr3);
                                try {
                                    declaredMethod5.setAccessible(true);
                                    int iIntValue2 = ((Integer) declaredMethod5.invoke(null, objArr6)).intValue();
                                    synchronized (CX.Xd) {
                                        long id2 = kp.getId();
                                        StringBuilder sbAppend = new StringBuilder().append("").append(iIntValue2);
                                        String strVd2 = hg.Vd("+", (short) (C1633zX.Xd() ^ ((1575431617 ^ 1056583584) ^ (-1662876987))), (short) (C1633zX.Xd() ^ ((1238726828 ^ 1064717263) ^ (-1990397045))));
                                        StringBuilder sbAppend2 = new StringBuilder().append(sbAppend.append(strVd2).toString());
                                        Class<?> cls4 = Class.forName(C1561oA.ud("\u0012~DXl", (short) (Od.Xd() ^ ((590284610 ^ 1001906897) ^ (-412669065)))));
                                        Class<?>[] clsArr4 = {Integer.TYPE};
                                        Object[] objArr7 = {Integer.valueOf((int) id2)};
                                        Method declaredMethod6 = cls4.getDeclaredMethod(C1561oA.yd("=J", (short) (C1499aX.Xd() ^ (770498593 ^ (-770500013)))), clsArr4);
                                        try {
                                            declaredMethod6.setAccessible(true);
                                            StringBuilder sbAppend3 = new StringBuilder().append((sbAppend2.append(((Integer) declaredMethod6.invoke(null, objArr7)).intValue()).append(strVd2).toString() + str3 + strVd2) + str4 + strVd2);
                                            long jLongValue = 0;
                                            try {
                                                Class<?> cls5 = Class.forName(C1561oA.Yd("@8N:\bG=KE\r3ZUWIR", (short) (FB.Xd() ^ ((1907622422 ^ 334934977) ^ 1648531971))));
                                                short sXd5 = (short) (FB.Xd() ^ ((1731418259 ^ 1849319927) ^ 151597072));
                                                short sXd6 = (short) (FB.Xd() ^ (1573082004 ^ 1573065379));
                                                int[] iArr4 = new int["\u0018+)*\u001e(/\u0010&+$\r*./-8".length()];
                                                QB qb4 = new QB("\u0018+)*\u001e(/\u0010&+$\r*./-8");
                                                int i10 = 0;
                                                while (qb4.YK()) {
                                                    int iKK4 = qb4.KK();
                                                    Xu xuXd4 = Xu.Xd(iKK4);
                                                    iArr4[i10] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i10)) + sXd6);
                                                    i10++;
                                                }
                                                jLongValue = ((Long) cls5.getMethod(new String(iArr4, 0, i10), new Class[0]).invoke(null, new Object[0])).longValue();
                                            } catch (Exception e2) {
                                            }
                                            CX.Xd.add(CX.qd(sbAppend3.append(jLongValue).toString()));
                                            kp.start();
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    }
                                    if (Math.random() * 100.0d < 0.0d) {
                                        C1546kX.Xd -= (C1620yF.Xd * 2) - IK.Kd;
                                    }
                                    QK();
                                    int i11 = C1537jK.Kd;
                                    while (C1593ug.Ud(i11)) {
                                        C1593ug.Qd(Integer.numberOfLeadingZeros(XN.Kd));
                                    }
                                    return;
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
        for (int iXd2 = OY.Xd() ^ (2082891594 ^ 2014146474); iXd2 > 0; iXd2 -= 4) {
            EO.Xd(iXd2);
        }
        for (int i12 = 550142097 ^ 550142105; i12 > 0; i12 -= 4) {
            EO.Xd(i12);
        }
        boolean zUd = GF.ud();
        String strWd = Jg.Wd("\u0001+\u00076", (short) (C1499aX.Xd() ^ ((1166983681 ^ 523772246) ^ (-1521921600))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951472458)));
        int i13 = Integer.parseInt(strWd);
        do {
            String str5 = ZO.xd("Z\u001fdT}", (short) (OY.Xd() ^ ((843628746 ^ 1832805591) ^ 1601602988)), (short) (OY.Xd() ^ ((1487902586 ^ 1430063960) ^ 227731922))) + C1537jK.Yd;
            StringBuilder sbAppend4 = new StringBuilder().append(C1523gX.Kd).append(str5);
            int iXd3 = C1580rY.Xd() ^ (1559188693 ^ (-1835433696));
            int iXd4 = FB.Xd() ^ 1609501570;
            short sXd7 = (short) (C1607wl.Xd() ^ iXd3);
            short sXd8 = (short) (C1607wl.Xd() ^ iXd4);
            int[] iArr5 = new int["5".length()];
            QB qb5 = new QB("5");
            int i14 = 0;
            while (qb5.YK()) {
                int iKK5 = qb5.KK();
                Xu xuXd5 = Xu.Xd(iKK5);
                iArr5[i14] = xuXd5.fK((C1561oA.Xd[i14 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + (i14 * sXd8))) + xuXd5.CK(iKK5));
                i14++;
            }
            C1584tK.Kd = sbAppend4.append(new String(iArr5, 0, i14)).toString();
            if (str5.length() >= 0) {
                break;
            }
            ZO.Od(str5);
            i13--;
        } while (i13 > strWd.length());
        if (zUd) {
            return;
        }
        int i15 = Qd;
        SecureRandom secureRandom = wd;
        int i16 = (470149725 ^ 737822085) ^ 939503548;
        int i17 = JX.Kd;
        for (int i18 = 0; i18 > (Od.Xd() ^ (640157492 ^ 1641386859)); i18++) {
            String str6 = Xg.Kd;
            C1603vu.Xd -= str6.length() * 2;
            C1598vY.Kd = str6;
        }
        int iNextInt2 = secureRandom.nextInt(i16);
        float f2 = C1603vu.Xd;
        if (Math.random() == Math.ceil(f2)) {
            C1620yF.Xd = (int) (NX.Xd - ((Float.intBitsToFloat((1059585480 ^ 1986302648) ^ 155414384) * f2) - C1546kX.Xd));
        }
        if (i15 > iNextInt2) {
            float f3 = C1603vu.Xd;
            if (Math.random() == Math.ceil(f3)) {
                JX.Kd = (int) (XN.Kd - ((Float.intBitsToFloat((290320006 ^ 1984665665) ^ 654735047) * f3) - YX.Kd));
            }
            int iXd5 = FB.Xd() ^ (948227703 ^ 1735106894);
            String strWd2 = Ig.wd("+y\u00055", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (1443996720 ^ 361421427))));
            C1589uF.Xd = strWd2;
            Ig.qd(strWd2);
            Class<?> cls6 = Class.forName(EO.Od("\u0005Maz\u0006", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (209096206 ^ 1267416651)))));
            Class<?>[] clsArr5 = {Integer.TYPE};
            Object[] objArr8 = {Integer.valueOf(iXd5)};
            Method declaredMethod7 = cls6.getDeclaredMethod(C1561oA.Qd("lY", (short) (FB.Xd() ^ (ZN.Xd() ^ 864710044))), clsArr5);
            try {
                declaredMethod7.setAccessible(true);
                declaredMethod7.invoke(null, objArr8);
                C1626yg.Kd(C1603vu.Xd);
                EO.Xd(C1603vu.Xd);
                CX.ud();
                String str7 = C1623yX.Kd;
                if (str7.isEmpty()) {
                    String strZd = C1593ug.zd("35+5\u000e260", (short) (ZN.Xd() ^ ((835638253 ^ 2063165073) ^ 1261952283)), (short) (ZN.Xd() ^ ((1506231414 ^ 1689024674) ^ 1030439512)));
                    short sXd9 = (short) (C1607wl.Xd() ^ (271888410 ^ 271883642));
                    int[] iArr6 = new int["rz|\u007fpPrtly".length()];
                    QB qb6 = new QB("rz|\u007fpPrtly");
                    int i19 = 0;
                    while (qb6.YK()) {
                        int iKK6 = qb6.KK();
                        Xu xuXd6 = Xu.Xd(iKK6);
                        iArr6[i19] = xuXd6.fK(sXd9 + sXd9 + i19 + xuXd6.CK(iKK6));
                        i19++;
                    }
                    str7.replaceAll(strZd, new String(iArr6, 0, i19));
                    Ig.qd(str7);
                }
                Object[] objArr9 = new Object[0];
                Method declaredMethod8 = Class.forName(C1561oA.Kd("ud,pA", (short) (C1499aX.Xd() ^ (1724282140 ^ (-1724269398))))).getDeclaredMethod(Wg.Zd("c?", (short) (C1607wl.Xd() ^ ((1860151092 ^ 982398058) ^ 1414659443)), (short) (C1607wl.Xd() ^ ((1178312126 ^ 527941137) ^ 1498177405))), new Class[0]);
                try {
                    declaredMethod8.setAccessible(true);
                    String str8 = (String) declaredMethod8.invoke(null, objArr9);
                    String strXd = C1561oA.Xd(ExifInterface.GPS_MEASUREMENT_2D, (short) (OY.Xd() ^ (1966010309 ^ 1965986489)));
                    if (strXd.length() > ((2024424348 ^ 798547802) ^ 1462934751)) {
                        Jg.wd(strXd.length());
                    }
                    Object[] objArr10 = new Object[0];
                    Method declaredMethod9 = Class.forName(Wg.vd("\r{C\bP", (short) (C1580rY.Xd() ^ ((1945006883 ^ 1608687155) ^ (-739024174))))).getDeclaredMethod(Qg.kd("\u0014,", (short) (ZN.Xd() ^ ((1385677995 ^ 382682560) ^ 1146674123)), (short) (ZN.Xd() ^ ((816116115 ^ 381566254) ^ 639301635))), new Class[0]);
                    try {
                        declaredMethod9.setAccessible(true);
                        String str9 = (String) declaredMethod9.invoke(null, objArr10);
                        C1626yg.Kd(C1603vu.Xd);
                        EO.Xd(C1603vu.Xd);
                        Object[] objArr11 = new Object[0];
                        Constructor<?> constructor2 = Class.forName(hg.Vd("-#7!l1\"\u001f0,\",0c\b\u0019\u0016'#\u0015\u0001\u000f\u001b\u0010\u001a\u0017", (short) (Od.Xd() ^ ((840339811 ^ 816519913) ^ (-45973707))), (short) (Od.Xd() ^ ((1438332460 ^ 239955620) ^ (-1542866177))))).getConstructor(new Class[0]);
                        try {
                            constructor2.setAccessible(true);
                            int iNextInt3 = ((SecureRandom) constructor2.newInstance(objArr11)).nextInt(1631304008 ^ 516179639);
                            Kp kp2 = new Kp(iNextInt3, str8, str9);
                            int i20 = ((iNextInt3 ^ ((324239842 ^ 264704587) ^ 494025955)) << 7) ^ 65;
                            int i21 = (1960092055 ^ 1501359063) ^ 766003792;
                            int i22 = Integer.parseInt(C1561oA.ud("Wd`SR", (short) (C1499aX.Xd() ^ (581446741 ^ (-581467827)))), i21) ^ ((int) ((2548595707909388267L ^ 2548595707909388052L) & kp2.getId()));
                            Class<?> cls7 = Class.forName(C1561oA.Yd("zi1G]", (short) (C1633zX.Xd() ^ ((1737673558 ^ 483826023) ^ (-2068076183)))));
                            Class<?>[] clsArr6 = {Integer.TYPE};
                            Object[] objArr12 = {Integer.valueOf(i22 + (((i22 << (Integer.parseInt(C1561oA.yd("W\\j", (short) (Od.Xd() ^ ((1715235282 ^ 1596088261) ^ (-958268621)))), i21) - 650)) + i22) * ((i22 << 2) + i22)))};
                            Method declaredMethod10 = cls7.getDeclaredMethod(Xg.qd("-:", (short) (C1580rY.Xd() ^ (1649002051 ^ (-1648986935))), (short) (C1580rY.Xd() ^ (352320626 ^ (-352319559)))), clsArr6);
                            try {
                                declaredMethod10.setAccessible(true);
                                int iIntValue3 = (i20 ^ ((Integer) declaredMethod10.invoke(null, objArr12)).intValue()) ^ ((Integer.parseInt(Jg.Wd("qm", (short) (OY.Xd() ^ (367690952 ^ 367707271)), (short) (OY.Xd() ^ (855631200 ^ 855633840))), i21) + 20) << ((byte) ((-1) - (((-1) - ((8187422665431309325L ^ 5824392022991075518L) ^ 2399279673034122428L)) | ((-1) - r14)))));
                                Class<?> cls8 = Class.forName(ZO.xd("\u0019FY3\"", (short) (OY.Xd() ^ ((691357186 ^ 1762391642) ^ 1077844077)), (short) (OY.Xd() ^ (1670386353 ^ 1670402264))));
                                Class<?>[] clsArr7 = {Integer.TYPE};
                                Object[] objArr13 = {Integer.valueOf(iIntValue3)};
                                Method declaredMethod11 = cls8.getDeclaredMethod(C1626yg.Ud("J1", (short) (Od.Xd() ^ (2037639197 ^ (-2037616348))), (short) (Od.Xd() ^ ((1420982758 ^ 119739696) ^ (-1402017615)))), clsArr7);
                                try {
                                    declaredMethod11.setAccessible(true);
                                    int iIntValue4 = ((Integer) declaredMethod11.invoke(null, objArr13)).intValue();
                                    synchronized (CX.Xd) {
                                        long id3 = kp2.getId();
                                        StringBuilder sbAppend5 = new StringBuilder().append("").append(iIntValue4);
                                        String strWd3 = Ig.wd(ContextChain.TAG_INFRA, (short) (FB.Xd() ^ ((1896178315 ^ 863090980) ^ 1114944306)));
                                        StringBuilder sbAppend6 = new StringBuilder().append(sbAppend5.append(strWd3).toString());
                                        Class<?> cls9 = Class.forName(EO.Od("Ywr!8", (short) (ZN.Xd() ^ (1233087652 ^ 1233088321))));
                                        Class<?>[] clsArr8 = {Integer.TYPE};
                                        Object[] objArr14 = {Integer.valueOf((int) id3)};
                                        Method declaredMethod12 = cls9.getDeclaredMethod(C1561oA.Qd(":E", (short) (FB.Xd() ^ (1643446237 ^ 1643432892))), clsArr8);
                                        try {
                                            declaredMethod12.setAccessible(true);
                                            StringBuilder sbAppend7 = new StringBuilder().append((sbAppend6.append(((Integer) declaredMethod12.invoke(null, objArr14)).intValue()).append(strWd3).toString() + str8 + strWd3) + str9 + strWd3);
                                            long jLongValue2 = 0;
                                            try {
                                                short sXd10 = (short) (ZN.Xd() ^ ((1296344545 ^ 1341683685) ^ 45938308));
                                                short sXd11 = (short) (ZN.Xd() ^ ((775283383 ^ 204005590) ^ 572341514));
                                                int[] iArr7 = new int[".&<(u5+93z!HCE7@".length()];
                                                QB qb7 = new QB(".&<(u5+93z!HCE7@");
                                                int i23 = 0;
                                                while (qb7.YK()) {
                                                    int iKK7 = qb7.KK();
                                                    Xu xuXd7 = Xu.Xd(iKK7);
                                                    iArr7[i23] = xuXd7.fK((xuXd7.CK(iKK7) - (sXd10 + i23)) - sXd11);
                                                    i23++;
                                                }
                                                jLongValue2 = ((Long) Class.forName(new String(iArr7, 0, i23)).getMethod(C1561oA.od("\u0019*&%\u0017\u001f$\u0003\u0017\u001a\u0011w\u0013\u0015\u0014\u0010\u0019", (short) (C1499aX.Xd() ^ (499292155 ^ (-499306891)))), new Class[0]).invoke(null, new Object[0])).longValue();
                                            } catch (Exception e10) {
                                            }
                                            CX.Xd.add(CX.qd(sbAppend7.append(jLongValue2).toString()));
                                            kp2.start();
                                        } catch (InvocationTargetException e11) {
                                            throw e11.getCause();
                                        }
                                    }
                                } catch (InvocationTargetException e12) {
                                    throw e12.getCause();
                                }
                            } catch (InvocationTargetException e13) {
                                throw e13.getCause();
                            }
                        } catch (InvocationTargetException e14) {
                            throw e14.getCause();
                        }
                    } catch (InvocationTargetException e15) {
                        throw e15.getCause();
                    }
                } catch (InvocationTargetException e16) {
                    throw e16.getCause();
                }
            } catch (InvocationTargetException e17) {
                throw e17.getCause();
            }
        }
    }
}
