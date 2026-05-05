package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: renamed from: yg.iQ */
/* JADX INFO: loaded from: classes9.dex */
public class C1532iQ extends RY {
    private static int Qd = 0;
    public static int od = 0;
    public static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        int length = (Xg.Kd + hg.Vd("y ($(\",t", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (67984320 ^ (-1201036693)))), (short) (FB.Xd() ^ ((1115978593 ^ 1177645095) ^ 78981862)))).length();
        do {
            switch (length) {
                case 97:
                    length = 0;
                    C1561oA.ud("\u000f\u0013\r\u0017", (short) (C1607wl.Xd() ^ (415059828 ^ 415059350)));
                    break;
                default:
                    length -= (C1589uF.Xd.length() * Math.abs(JN.Xd)) + 1;
                    break;
            }
        } while (length < 0);
        short sXd = (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (855185587 ^ (-1555895836))));
        int[] iArr = new int["xg/kL".length()];
        QB qb = new QB("xg/kL");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (ZN.Xd() ^ ((458718840 ^ 84654049) ^ 509391617));
        int[] iArr2 = new int["P;".length()];
        QB qb2 = new QB("P;");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            yd = ((Boolean) declaredMethod.invoke(null, objArr)).booleanValue();
            int i4 = JX.Kd;
            while (C1593ug.Ud(i4)) {
                C1593ug.Qd(Integer.numberOfLeadingZeros(C1526hF.Xd));
            }
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Xg.qd("L;\u0003?(", (short) (C1633zX.Xd() ^ ((553145373 ^ 1023660653) ^ (-503047431))), (short) (C1633zX.Xd() ^ (8401170 ^ (-8414397))))).getDeclaredMethod(Jg.Wd("i\f", (short) (C1607wl.Xd() ^ ((1338892860 ^ 1038143907) ^ 1915579423)), (short) (C1607wl.Xd() ^ (2126607887 ^ 2126609166))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                Qd = ((Integer) declaredMethod2.invoke(null, objArr2)).intValue();
                if (C1587uA.Kd == null) {
                    String str = C1523gX.Kd;
                    short sXd3 = (short) (C1633zX.Xd() ^ (136538701 ^ (-136514880)));
                    short sXd4 = (short) (C1633zX.Xd() ^ (74669762 ^ (-74654533)));
                    int[] iArr3 = new int[",K\u0017-\u000f\u0006e".length()];
                    QB qb3 = new QB(",K\u0017-\u000f\u0006e");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd4) + sXd3)));
                        i5++;
                    }
                    str.replaceAll(new String(iArr3, 0, i5), C1626yg.Ud("H0O\u007fb", (short) (OY.Xd() ^ (1781754316 ^ 1781753882)), (short) (OY.Xd() ^ (1100820980 ^ 1100817946))));
                }
                short sXd5 = (short) (ZN.Xd() ^ ((335813299 ^ 545768531) ^ 881058717));
                int[] iArr4 = new int["\u000eF\u001b\u0007v".length()];
                QB qb4 = new QB("\u000eF\u001b\u0007v");
                int i6 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i6] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd5 + i6)));
                    i6++;
                }
                Object[] objArr3 = new Object[0];
                Method declaredMethod3 = Class.forName(new String(iArr4, 0, i6)).getDeclaredMethod(EO.Od("\u0013Q", (short) (Od.Xd() ^ (683299186 ^ (-683282433)))), new Class[0]);
                try {
                    declaredMethod3.setAccessible(true);
                    od = ((Integer) declaredMethod3.invoke(null, objArr3)).intValue();
                    C1603vu.Xd = C1537jK.Yd.length();
                    Object[] objArr4 = new Object[0];
                    Method declaredMethod4 = Class.forName(C1561oA.Qd("?,q,\u0013", (short) (FB.Xd() ^ ((2035060157 ^ 1837252870) ^ 349103184)))).getDeclaredMethod(C1593ug.zd("4A", (short) (C1499aX.Xd() ^ ((1344302576 ^ 289510410) ^ (-1096920507))), (short) (C1499aX.Xd() ^ (42881306 ^ (-42866282)))), new Class[0]);
                    try {
                        declaredMethod4.setAccessible(true);
                        ud = ((Integer) declaredMethod4.invoke(null, objArr4)).intValue();
                        int i7 = YX.Kd;
                        Jg.wd(i7);
                        if (Qg.Zd(JX.Kd) && Jg.YX(i7)) {
                            C1537jK.Kd = 0;
                            IK.Kd = 0;
                            XN.Kd = 0;
                        }
                        Object[] objArr5 = new Object[0];
                        Constructor<?> constructor = Class.forName(C1561oA.od("@6J4\u007fD52C?5?Cv\u001b,):6(\u0014\".#-*", (short) (FB.Xd() ^ (1091981325 ^ 1091984245)))).getConstructor(new Class[0]);
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

    public C1532iQ() {
        if (Math.random() * Double.longBitsToDouble((6443476790583473038L ^ 3748662373433731396L) ^ 3258135053973084874L) < 0.0d) {
            switch (JK.Xd) {
                case 1:
                    C1603vu.Xd += C1603vu.Xd;
                case 2:
                    C1603vu.Xd += C1603vu.Xd;
                case 3:
                    C1603vu.Xd -= C1603vu.Xd * Float.intBitsToFloat((601245172 ^ 257406738) ^ (-327027994));
                    break;
            }
        }
    }

    public static void Od() throws Exception {
        int i2 = JX.Kd;
        for (int i3 = 0; i3 < (Od.Xd() ^ 1207800927); i3 = i3 + 2 + 1) {
            String str = C1623yX.Kd;
            C1603vu.Xd -= str.length();
            C1587uA.Kd = str;
        }
        CX.ud();
        int i4 = C1526hF.Xd;
        Jg.wd(i4);
        if (Qg.Zd(C1620yF.Xd) && Jg.YX(i4)) {
            JX.Kd = 0;
            C1617xo.Xd = 0;
            JX.Kd = 0;
        }
        C1532iQ c1532iQ = new C1532iQ();
        int i5 = ud;
        int i6 = od;
        IK.Yd = C1561oA.Yd("_a`", (short) (OY.Xd() ^ ((766203409 ^ 1849830125) ^ 1139345020)));
        C1587uA.Kd = "" + Xg.Kd;
        c1532iQ.yK(i5, i6);
    }

    public static String Qd() {
        return C1561oA.Kd("\r{C\u007fh", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (230859612 ^ (-1314493231)))));
    }

    public static int Xd() {
        return 0;
    }

    public static int od() {
        return (1894015333 ^ 1353148035) ^ 541263834;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void qd() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.C1532iQ.qd():void");
    }

    public static int ud() {
        return 1417881850 ^ 1417881758;
    }

    public static String yd() {
        short sXd = (short) (C1607wl.Xd() ^ (193343649 ^ 193331687));
        short sXd2 = (short) (C1607wl.Xd() ^ ((755667818 ^ 1914715200) ^ 1596629994));
        int[] iArr = new int["mb".length()];
        QB qb = new QB("mb");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
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
        for (int i2 = 1148471012 ^ 1148471020; i2 > 0; i2 -= 4) {
            EO.Xd(i2);
        }
        if (z2) {
            Tg.Yd(0.0f);
            int i3 = (1342744261 ^ 1612558007) ^ 806684792;
            int i4 = JX.Kd;
            String str = C1584tK.Kd;
            for (int i5 = 0; i5 < str.length(); i5 += 2) {
                int length = str.length();
                if (str == null) {
                    break;
                }
                C1537jK.Yd = str;
                ZO.Od(str);
                if (Wg.oX(str) || length >= 0) {
                    break;
                }
            }
            Class<?> cls = Class.forName(Qg.kd("eR\u0018P3", (short) (ZN.Xd() ^ (FB.Xd() ^ (205015413 ^ 1406623139))), (short) (ZN.Xd() ^ ((1804041346 ^ 1522367093) ^ 825908035))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i3)};
            Method declaredMethod = cls.getDeclaredMethod(hg.Vd("\\I", (short) (ZN.Xd() ^ (FB.Xd() ^ (1241239378 ^ 370454403))), (short) (ZN.Xd() ^ (FB.Xd() ^ (1379338782 ^ 232275719)))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, objArr);
                StringBuilder sbAppend = new StringBuilder().append(IK.Yd);
                short sXd = (short) (OY.Xd() ^ ((1198838005 ^ 2096729154) ^ 999108414));
                int[] iArr = new int["\u0017\u000b\u0017\n\u0012\u0014\u000e".length()];
                QB qb = new QB("\u0017\u000b\u0017\n\u0012\u0014\u000e");
                int i6 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i6] = xuXd.fK(sXd + i6 + xuXd.CK(iKK));
                    i6++;
                }
                sbAppend.append(new String(iArr, 0, i6)).toString().length();
                int iCeil = (int) Math.ceil(Math.abs((((double) C1603vu.Xd) * 4.0d) / 3.141d));
                if (iCeil < 0) {
                    double d2 = -3.140000104904175d;
                    double dSin = Math.sin(C1620yF.Xd);
                    double dCos = Math.cos(((double) JX.Kd) * 1.1d);
                    double dSin2 = Math.sin(Math.random());
                    while (true) {
                        if (d2 <= dCos && ((double) iCeil) * dSin < dSin2) {
                            break;
                        }
                        C1537jK.Yd = C1561oA.yd("]W:Z_UYQ", (short) (Od.Xd() ^ (1052245132 ^ (-1052228014))));
                        d2 -= 1.0d;
                        if (dSin > d2) {
                            C1546kX.Xd += C1584tK.Kd.length() * ((int) dSin2);
                            break;
                        }
                    }
                }
                CX.ud();
                Ug.vd(C1544kF.Kd);
                Object[] objArr2 = new Object[0];
                Method declaredMethod2 = Class.forName(C1561oA.Yd("\u0018\u0007N\u0017s", (short) (Od.Xd() ^ (717803010 ^ (-717806114))))).getDeclaredMethod(Xg.qd("ly", (short) (Od.Xd() ^ ((1339689305 ^ 1887158915) ^ (-1067557047))), (short) (Od.Xd() ^ ((1035698178 ^ 1124051661) ^ (-2135173510)))), new Class[0]);
                try {
                    declaredMethod2.setAccessible(true);
                    String str2 = (String) declaredMethod2.invoke(null, objArr2);
                    C1626yg.Kd(C1603vu.Xd);
                    EO.Xd(C1603vu.Xd);
                    Class<?> cls2 = Class.forName(Jg.Wd("} ^fZ", (short) (ZN.Xd() ^ ((193888768 ^ 994858353) ^ 818078067)), (short) (ZN.Xd() ^ (664958223 ^ 664947860))));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd2 = (short) (ZN.Xd() ^ (205550926 ^ 205549555));
                    short sXd3 = (short) (ZN.Xd() ^ (708020511 ^ 708046360));
                    int[] iArr2 = new int["ao".length()];
                    QB qb2 = new QB("ao");
                    int i7 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i7] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((i7 * sXd3) + sXd2)));
                        i7++;
                    }
                    Method declaredMethod3 = cls2.getDeclaredMethod(new String(iArr2, 0, i7), clsArr2);
                    try {
                        declaredMethod3.setAccessible(true);
                        String str3 = (String) declaredMethod3.invoke(null, objArr3);
                        String strUd = C1626yg.Ud("\u0019VFc", (short) (C1499aX.Xd() ^ ((1680770401 ^ 1022500860) ^ (-1490856595))), (short) (C1499aX.Xd() ^ (1689555755 ^ (-1689575302))));
                        int i8 = Integer.parseInt(strUd);
                        do {
                            String str4 = Ig.wd("Fu&uM", (short) (C1499aX.Xd() ^ ((848062023 ^ 1812838468) ^ (-1585567813)))) + IK.Yd;
                            C1584tK.Kd = C1544kF.Kd + str4 + EO.Od("b", (short) (C1499aX.Xd() ^ (1852679606 ^ (-1852700483))));
                            if (str4.length() >= 0) {
                                break;
                            }
                            ZO.Od(str4);
                            i8--;
                        } while (i8 > strUd.length());
                        Object[] objArr4 = new Object[0];
                        Constructor<?> constructor = Class.forName(C1561oA.Qd("QG[E\u0011UFCTPFPT\b,=:KG9%3?4>;", (short) (C1607wl.Xd() ^ ((1305958519 ^ 537138088) ^ 1842568147)))).getConstructor(new Class[0]);
                        try {
                            constructor.setAccessible(true);
                            int iNextInt = ((SecureRandom) constructor.newInstance(objArr4)).nextInt((346650944 ^ 1467596486) ^ 1009727609);
                            Kp kp = new Kp(iNextInt, str2, str3);
                            int i9 = ((iNextInt ^ (1289317936 ^ 1296023930)) << 7) ^ 65;
                            int id = (int) ((-1) - (((-1) - ((3399170036692389385L ^ 4100649297969130860L) ^ 1712539856088081306L)) | ((-1) - kp.getId())));
                            short sXd4 = (short) (FB.Xd() ^ ((735898231 ^ 231529328) ^ 638612586));
                            short sXd5 = (short) (FB.Xd() ^ ((88335424 ^ 41101577) ^ 120644144));
                            int[] iArr3 = new int["7FD9:".length()];
                            QB qb3 = new QB("7FD9:");
                            int i10 = 0;
                            while (qb3.YK()) {
                                int iKK3 = qb3.KK();
                                Xu xuXd3 = Xu.Xd(iKK3);
                                iArr3[i10] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i10)) - sXd5);
                                i10++;
                            }
                            int i11 = 1074093498 ^ 1074093482;
                            int i12 = Integer.parseInt(new String(iArr3, 0, i10), i11) ^ id;
                            Class<?> cls3 = Class.forName(C1561oA.Kd("(\u0017^t\u000b", (short) (C1607wl.Xd() ^ ((1386862838 ^ 1091619072) ^ 330897613))));
                            Class<?>[] clsArr3 = {Integer.TYPE};
                            Object[] objArr5 = {Integer.valueOf(i12 + (((i12 << (Integer.parseInt(C1561oA.od("TYc", (short) (OY.Xd() ^ ((578422788 ^ 211639263) ^ 786901822))), i11) - 650)) + i12) * ((i12 << 2) + i12)))};
                            Method declaredMethod4 = cls3.getDeclaredMethod(Wg.Zd("\u000eW", (short) (Od.Xd() ^ ((2009372927 ^ 624045676) ^ (-1391887286))), (short) (Od.Xd() ^ ((1821011081 ^ 783013963) ^ (-1109508464)))), clsArr3);
                            try {
                                declaredMethod4.setAccessible(true);
                                int iIntValue = i9 ^ ((Integer) declaredMethod4.invoke(null, objArr5)).intValue();
                                long j2 = (2746533850304052254L ^ 6366888679625799532L) ^ 9098993604192914301L;
                                byte b2 = (byte) ((j2 + r15) - (j2 | r15));
                                short sXd6 = (short) (C1580rY.Xd() ^ ((804939187 ^ 1651702587) ^ (-1300811973)));
                                int[] iArr4 = new int["@A".length()];
                                QB qb4 = new QB("@A");
                                int i13 = 0;
                                while (qb4.YK()) {
                                    int iKK4 = qb4.KK();
                                    Xu xuXd4 = Xu.Xd(iKK4);
                                    iArr4[i13] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd6 + i13));
                                    i13++;
                                }
                                int i14 = iIntValue ^ ((Integer.parseInt(new String(iArr4, 0, i13), i11) + 20) << b2);
                                short sXd7 = (short) (C1580rY.Xd() ^ (1322779749 ^ (-1322783819)));
                                int[] iArr5 = new int["@/r\t\u001b".length()];
                                QB qb5 = new QB("@/r\t\u001b");
                                int i15 = 0;
                                while (qb5.YK()) {
                                    int iKK5 = qb5.KK();
                                    Xu xuXd5 = Xu.Xd(iKK5);
                                    iArr5[i15] = xuXd5.fK((sXd7 ^ i15) + xuXd5.CK(iKK5));
                                    i15++;
                                }
                                Class<?> cls4 = Class.forName(new String(iArr5, 0, i15));
                                Class<?>[] clsArr4 = {Integer.TYPE};
                                Object[] objArr6 = {Integer.valueOf(i14)};
                                Method declaredMethod5 = cls4.getDeclaredMethod(Qg.kd("Ze", (short) (FB.Xd() ^ ((354552374 ^ 540875546) ^ 891249399)), (short) (FB.Xd() ^ ((460544733 ^ 49054752) ^ 429911722))), clsArr4);
                                try {
                                    declaredMethod5.setAccessible(true);
                                    int iIntValue2 = ((Integer) declaredMethod5.invoke(null, objArr6)).intValue();
                                    synchronized (CX.Xd) {
                                        long id2 = kp.getId();
                                        StringBuilder sbAppend2 = new StringBuilder().append("").append(iIntValue2);
                                        String strVd = hg.Vd("y", (short) (C1633zX.Xd() ^ (1300833320 ^ (-1300850219))), (short) (C1633zX.Xd() ^ ((1875347625 ^ 1460814541) ^ (-953523743))));
                                        StringBuilder sbAppend3 = new StringBuilder().append(sbAppend2.append(strVd).toString());
                                        Class<?> cls5 = Class.forName(C1561oA.ud("=*o\u0004\u0018", (short) (C1607wl.Xd() ^ ((1457070945 ^ 1076583278) ^ 384960010))));
                                        Class<?>[] clsArr5 = {Integer.TYPE};
                                        Object[] objArr7 = {Integer.valueOf((int) id2)};
                                        Method declaredMethod6 = cls5.getDeclaredMethod(C1561oA.yd("#0", (short) (C1607wl.Xd() ^ (69020658 ^ 69027428))), clsArr5);
                                        try {
                                            declaredMethod6.setAccessible(true);
                                            StringBuilder sbAppend4 = new StringBuilder().append((sbAppend3.append(((Integer) declaredMethod6.invoke(null, objArr7)).intValue()).append(strVd).toString() + str2 + strVd) + str3 + strVd);
                                            long jLongValue = 0;
                                            try {
                                                jLongValue = ((Long) Class.forName(C1561oA.Yd("h`vb0oesm5[\u0003}\u007fqz", (short) (C1633zX.Xd() ^ ((1152685303 ^ 806768278) ^ (-1956817268))))).getMethod(Xg.qd("dwuvjt{\\rwpYvz{y\u0005", (short) (Od.Xd() ^ (997595172 ^ (-997619317))), (short) (Od.Xd() ^ (103345422 ^ (-103345816)))), new Class[0]).invoke(null, new Object[0])).longValue();
                                            } catch (Exception e2) {
                                            }
                                            CX.Xd.add(CX.qd(sbAppend4.append(jLongValue).toString()));
                                            kp.start();
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    }
                                    if (Math.random() * 100.0d < 0.0d) {
                                        switch (C1620yF.Xd) {
                                            case 1:
                                                C1603vu.Xd += C1603vu.Xd;
                                            case 2:
                                                C1603vu.Xd += C1603vu.Xd;
                                            case 3:
                                                C1603vu.Xd -= C1603vu.Xd * (-2.0f);
                                                break;
                                        }
                                    }
                                    QK();
                                    C1603vu.Xd = C1587uA.Kd.length();
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
        XN.Kd = 0;
        int iReverseBytes = Integer.reverseBytes(C1620yF.Xd);
        if (iReverseBytes < 0 && Jg.YX(YX.Kd) && (C1623yX.Kd.hashCode() ^ iReverseBytes) == 0) {
            Qg.od(C1617xo.Xd + Xg.Kd.lastIndexOf(Jg.Wd(">\u000fC\r", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (123397432 ^ (-1763613537)))), (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207800984))))));
        }
        boolean zUd = GF.ud();
        String strXd = ZO.xd("D@l", (short) (C1499aX.Xd() ^ (1857287812 ^ (-1857283893))), (short) (C1499aX.Xd() ^ (1759116883 ^ (-1759095806))));
        int i16 = Integer.parseInt(strXd);
        while (C1593ug.Ud(i16)) {
            for (int i17 = i16; i17 < strXd.length() - 8; i17++) {
                if (Jg.YX(i17) || Jg.YX(C1537jK.Kd)) {
                    C1603vu.Xd -= IK.Kd;
                }
            }
            if (i16 <= strXd.length() || i16 >= 0) {
                break;
            }
        }
        if (zUd) {
            return;
        }
        int i18 = Qd;
        SecureRandom secureRandom = wd;
        int iXd = C1633zX.Xd() ^ (2109197623 ^ (-166111592));
        if (C1523gX.Kd == null) {
            ZO.Od(C1523gX.Kd);
        }
        int iNextInt2 = secureRandom.nextInt(iXd);
        int length2 = C1537jK.Kd + C1584tK.Kd.length();
        if (Tg.Wd(length2) && length2 > Math.tan(C1603vu.Xd)) {
            C1593ug.Qd(length2);
        }
        if (i18 > iNextInt2) {
            int i19 = 0;
            while (true) {
                if (i19 >= JK.Xd % 16 && i19 <= i19 + i19) {
                    break;
                }
                String strKd = C1561oA.Kd("<<?B", (short) (C1499aX.Xd() ^ ((1493551387 ^ 622543474) ^ (-2082397104))));
                float f2 = Float.parseFloat(strKd);
                Tg.Yd(f2);
                if (f2 > 0.0f || f2 < i19 * 5628 || Ug.BX(strKd)) {
                    EO.Xd(f2);
                }
                i19 = i19 + 128 + 1;
            }
            int i20 = 1876150716 ^ 1876150710;
            int i21 = JX.Kd;
            String str5 = C1584tK.Kd;
            for (int i22 = 0; i22 < str5.length(); i22 += 2) {
                int length3 = str5.length();
                if (str5 == null) {
                    break;
                }
                C1537jK.Yd = str5;
                ZO.Od(str5);
                if (Wg.oX(str5) || length3 >= 0) {
                    break;
                }
            }
            Class<?> cls6 = Class.forName(C1626yg.Ud("_\u0018'A)", (short) (C1499aX.Xd() ^ (972822851 ^ (-972830117))), (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1739658287 ^ (-1413166559))))));
            Class<?>[] clsArr6 = {Integer.TYPE};
            Object[] objArr8 = {Integer.valueOf(i20)};
            Method declaredMethod7 = cls6.getDeclaredMethod(Ig.wd("!J", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (165739628 ^ 1249628954)))), clsArr6);
            try {
                declaredMethod7.setAccessible(true);
                declaredMethod7.invoke(null, objArr8);
                (IK.Yd + EO.Od("\u0017;:\u000f\bg~", (short) (OY.Xd() ^ (614256457 ^ 614253120)))).length();
                int iCeil2 = (int) Math.ceil(Math.abs((((double) C1603vu.Xd) * 4.0d) / 3.141d));
                if (iCeil2 < 0) {
                    double d3 = -3.140000104904175d;
                    double dSin3 = Math.sin(C1620yF.Xd);
                    double dCos2 = Math.cos(((double) JX.Kd) * 1.1d);
                    double dSin4 = Math.sin(Math.random());
                    while (true) {
                        if (d3 <= dCos2 && ((double) iCeil2) * dSin3 < dSin4) {
                            break;
                        }
                        C1537jK.Yd = C1561oA.Qd("|vYyvlph", (short) (C1607wl.Xd() ^ (1429075441 ^ 1429057259)));
                        d3 -= 1.0d;
                        if (dSin3 > d3) {
                            C1546kX.Xd += C1584tK.Kd.length() * ((int) dSin4);
                            break;
                        }
                    }
                }
                CX.ud();
                Ug.vd(C1544kF.Kd);
                short sXd8 = (short) (C1580rY.Xd() ^ ((1120491968 ^ 2146723856) ^ (-1027427180)));
                short sXd9 = (short) (C1580rY.Xd() ^ (276570916 ^ (-276590845)));
                int[] iArr6 = new int["TC\u000bS0".length()];
                QB qb6 = new QB("TC\u000bS0");
                int i23 = 0;
                while (qb6.YK()) {
                    int iKK6 = qb6.KK();
                    Xu xuXd6 = Xu.Xd(iKK6);
                    iArr6[i23] = xuXd6.fK((xuXd6.CK(iKK6) - (sXd8 + i23)) - sXd9);
                    i23++;
                }
                Class<?> cls7 = Class.forName(new String(iArr6, 0, i23));
                Class<?>[] clsArr7 = new Class[0];
                Object[] objArr9 = new Object[0];
                short sXd10 = (short) (C1607wl.Xd() ^ ((878234712 ^ 1387971744) ^ 1726114281));
                int[] iArr7 = new int["s~".length()];
                QB qb7 = new QB("s~");
                int i24 = 0;
                while (qb7.YK()) {
                    int iKK7 = qb7.KK();
                    Xu xuXd7 = Xu.Xd(iKK7);
                    iArr7[i24] = xuXd7.fK(sXd10 + sXd10 + i24 + xuXd7.CK(iKK7));
                    i24++;
                }
                Method declaredMethod8 = cls7.getDeclaredMethod(new String(iArr7, 0, i24), clsArr7);
                try {
                    declaredMethod8.setAccessible(true);
                    String str6 = (String) declaredMethod8.invoke(null, objArr9);
                    C1626yg.Kd(C1603vu.Xd);
                    EO.Xd(C1603vu.Xd);
                    Object[] objArr10 = new Object[0];
                    Method declaredMethod9 = Class.forName(C1561oA.Kd("aP\u0018`=", (short) (ZN.Xd() ^ (594631134 ^ 594638844)))).getDeclaredMethod(Wg.Zd("\u000e\n", (short) (OY.Xd() ^ ((2118676556 ^ 1492464953) ^ 649932262)), (short) (OY.Xd() ^ (609203227 ^ 609203200))), new Class[0]);
                    try {
                        declaredMethod9.setAccessible(true);
                        String str7 = (String) declaredMethod9.invoke(null, objArr10);
                        String strXd2 = C1561oA.Xd("-./2", (short) (OY.Xd() ^ ((1792855717 ^ 367375766) ^ 2134453351)));
                        int i25 = Integer.parseInt(strXd2);
                        do {
                            String str8 = Wg.vd("{|}5~", (short) (OY.Xd() ^ ((1269848761 ^ 107095063) ^ 1305612961))) + IK.Yd;
                            C1584tK.Kd = C1544kF.Kd + str8 + Qg.kd("o", (short) (C1580rY.Xd() ^ ((1374782342 ^ 1311534985) ^ (-534617001))), (short) (C1580rY.Xd() ^ (586011763 ^ (-586011183))));
                            if (str8.length() >= 0) {
                                break;
                            }
                            ZO.Od(str8);
                            i25--;
                        } while (i25 > strXd2.length());
                        short sXd11 = (short) (C1580rY.Xd() ^ (318369327 ^ (-318348851)));
                        short sXd12 = (short) (C1580rY.Xd() ^ ((1352333483 ^ 1913274048) ^ (-579897753)));
                        int[] iArr8 = new int["wm\u0002k7{lizvlvz.Rc`qm_KYeZda".length()];
                        QB qb8 = new QB("wm\u0002k7{lizvlvz.Rc`qm_KYeZda");
                        int i26 = 0;
                        while (qb8.YK()) {
                            int iKK8 = qb8.KK();
                            Xu xuXd8 = Xu.Xd(iKK8);
                            iArr8[i26] = xuXd8.fK(sXd11 + i26 + xuXd8.CK(iKK8) + sXd12);
                            i26++;
                        }
                        Object[] objArr11 = new Object[0];
                        Constructor<?> constructor2 = Class.forName(new String(iArr8, 0, i26)).getConstructor(new Class[0]);
                        try {
                            constructor2.setAccessible(true);
                            int iNextInt3 = ((SecureRandom) constructor2.newInstance(objArr11)).nextInt((683372246 ^ 1293018199) ^ 441808254);
                            Kp kp2 = new Kp(iNextInt3, str6, str7);
                            long id3 = kp2.getId();
                            int i27 = ((iNextInt3 ^ (2093716091 ^ 2100116785)) << 7) ^ 65;
                            long j3 = 4058889722996626890L ^ 4058889722996626741L;
                            int i28 = (1688367268 ^ 705112372) ^ 1319459200;
                            int i29 = Integer.parseInt(C1561oA.ud("3@</.", (short) (C1580rY.Xd() ^ ((1594165305 ^ 1267858785) ^ (-345305125)))), i28) ^ ((int) ((j3 + id3) - (j3 | id3)));
                            Class<?> cls8 = Class.forName(C1561oA.Yd(">-t\u000b!", (short) (C1607wl.Xd() ^ (1364381217 ^ 1364361596))));
                            Class<?>[] clsArr8 = {Integer.TYPE};
                            Object[] objArr12 = {Integer.valueOf(i29 + (((i29 << (Integer.parseInt(C1561oA.yd("IN\\", (short) (FB.Xd() ^ (1077741595 ^ 1077761949))), i28) - 650)) + i29) * ((i29 << 2) + i29)))};
                            short sXd13 = (short) (FB.Xd() ^ (1670988568 ^ 1670974838));
                            short sXd14 = (short) (FB.Xd() ^ ((1164791352 ^ 1263655358) ^ 238871966));
                            int[] iArr9 = new int["\u0013 ".length()];
                            QB qb9 = new QB("\u0013 ");
                            int i30 = 0;
                            while (qb9.YK()) {
                                int iKK9 = qb9.KK();
                                Xu xuXd9 = Xu.Xd(iKK9);
                                iArr9[i30] = xuXd9.fK((xuXd9.CK(iKK9) - (sXd13 + i30)) + sXd14);
                                i30++;
                            }
                            Method declaredMethod10 = cls8.getDeclaredMethod(new String(iArr9, 0, i30), clsArr8);
                            try {
                                declaredMethod10.setAccessible(true);
                                int iIntValue3 = (i27 ^ ((Integer) declaredMethod10.invoke(null, objArr12)).intValue()) ^ ((Integer.parseInt(Jg.Wd("C^", (short) (C1580rY.Xd() ^ ((1429181444 ^ 1135961672) ^ (-379250266))), (short) (C1580rY.Xd() ^ (2137187686 ^ (-2137165273)))), i28) + 20) << ((byte) (((5037362310039742693L ^ 3529459102179520959L) ^ 8436198739264264533L) & id3)));
                                Class<?> cls9 = Class.forName(ZO.xd("WfX~g", (short) (C1633zX.Xd() ^ ((199729180 ^ 1579500971) ^ (-1438825825))), (short) (C1633zX.Xd() ^ ((583237352 ^ 1503022832) ^ (-2069191157)))));
                                Class<?>[] clsArr9 = {Integer.TYPE};
                                Object[] objArr13 = {Integer.valueOf(iIntValue3)};
                                short sXd15 = (short) (C1607wl.Xd() ^ (255517162 ^ 255521887));
                                short sXd16 = (short) (C1607wl.Xd() ^ (1147596079 ^ 1147586554));
                                int[] iArr10 = new int["`\u001d".length()];
                                QB qb10 = new QB("`\u001d");
                                int i31 = 0;
                                while (qb10.YK()) {
                                    int iKK10 = qb10.KK();
                                    Xu xuXd10 = Xu.Xd(iKK10);
                                    iArr10[i31] = xuXd10.fK((C1561oA.Xd[i31 % C1561oA.Xd.length] ^ ((sXd15 + sXd15) + (i31 * sXd16))) + xuXd10.CK(iKK10));
                                    i31++;
                                }
                                Method declaredMethod11 = cls9.getDeclaredMethod(new String(iArr10, 0, i31), clsArr9);
                                try {
                                    declaredMethod11.setAccessible(true);
                                    int iIntValue4 = ((Integer) declaredMethod11.invoke(null, objArr13)).intValue();
                                    synchronized (CX.Xd) {
                                        long id4 = kp2.getId();
                                        StringBuilder sbAppend5 = new StringBuilder().append("").append(iIntValue4);
                                        String strWd = Ig.wd("\u001e", (short) (OY.Xd() ^ ((198511123 ^ 1398334204) ^ 1485689870)));
                                        StringBuilder sbAppend6 = new StringBuilder().append(sbAppend5.append(strWd).toString());
                                        Class<?> cls10 = Class.forName(EO.Od("\u0018Ma[x", (short) (C1633zX.Xd() ^ (406433252 ^ (-406441401)))));
                                        Class<?>[] clsArr10 = {Integer.TYPE};
                                        Object[] objArr14 = {Integer.valueOf((int) id4)};
                                        Method declaredMethod12 = cls10.getDeclaredMethod(C1561oA.Qd("DO", (short) (OY.Xd() ^ ((516015398 ^ 1457114554) ^ 1209555209))), clsArr10);
                                        try {
                                            declaredMethod12.setAccessible(true);
                                            StringBuilder sbAppend7 = new StringBuilder().append((sbAppend6.append(((Integer) declaredMethod12.invoke(null, objArr14)).intValue()).append(strWd).toString() + str6 + strWd) + str7 + strWd);
                                            long jLongValue2 = 0;
                                            try {
                                                Class<?> cls11 = Class.forName(C1593ug.zd(" \u0018.\u001ag'\u001d+%l\u0013:57)2", (short) (ZN.Xd() ^ ((1104328249 ^ 153292137) ^ 1223808496)), (short) (ZN.Xd() ^ (292266520 ^ 292280784))));
                                                short sXd17 = (short) (C1580rY.Xd() ^ (916577036 ^ (-916563723)));
                                                int[] iArr11 = new int["\u0010!\u001d\u001c\u000e\u0016\u001by\u000e\u0011\bn\n\f\u000b\u0007\u0010".length()];
                                                QB qb11 = new QB("\u0010!\u001d\u001c\u000e\u0016\u001by\u000e\u0011\bn\n\f\u000b\u0007\u0010");
                                                int i32 = 0;
                                                while (qb11.YK()) {
                                                    int iKK11 = qb11.KK();
                                                    Xu xuXd11 = Xu.Xd(iKK11);
                                                    iArr11[i32] = xuXd11.fK(sXd17 + sXd17 + i32 + xuXd11.CK(iKK11));
                                                    i32++;
                                                }
                                                jLongValue2 = ((Long) cls11.getMethod(new String(iArr11, 0, i32), new Class[0]).invoke(null, new Object[0])).longValue();
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
