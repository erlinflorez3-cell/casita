package com.davivienda.daviviendaapp.triggerArxan;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class TamperAction {
    public static void checksumNonTamperAction() throws Throwable {
        String strZd = C1593ug.zd("u\u0007{oVz!\u001f\u001e'03,_5#04*8060i9;Am35E76H::", (short) (C1633zX.Xd() ^ (1602427983 ^ (-1602424910))), (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831067508)));
        short sXd = (short) (Od.Xd() ^ (638563175 ^ (-638551920)));
        int[] iArr = new int["\u001e)&e\u001b\u0017+\u001d)\u001b\u0016\u001e\u0013\u000fZ\u0010\f \u0012\u001e\u0010\u000b\u0013\b\u0004\u0003\u0011\u0010L\u0012\u000f\u0005\u0002\u0001}\nW\b\rt\u0001?dp{}q}Kl|pus".length()];
        QB qb = new QB("\u001e)&e\u001b\u0017+\u001d)\u001b\u0016\u001e\u0013\u000fZ\u0010\f \u0012\u001e\u0010\u000b\u0013\b\u0004\u0003\u0011\u0010L\u0012\u000f\u0005\u0002\u0001}\nW\b\rt\u0001?dp{}q}Kl|pus");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {strZd};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Wg.Zd("\u0011'0]RPQu\u001e", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (882155046 ^ (-85821718)))), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (659134610 ^ (-381732618))))), Class.forName(C1561oA.Kd("%\u001d3\u001fl,\"0*q\u0018:9171", (short) (OY.Xd() ^ (Od.Xd() ^ (1359640290 ^ 385327449))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void checksumTamperAction() throws Throwable {
        String strXd = C1561oA.Xd("\u0016'\u001c\u0010v\u001bA?>GPSL\u007fUCPTJXPVP\nOQaSRdVV", (short) (FB.Xd() ^ (OY.Xd() ^ 69948727)));
        Class<?> cls = Class.forName(Wg.vd("nyz:kg\u007fqykjrc_/d|\u0011\u0007\u0013\u0001{\b|ts\u0006\u0005=\u0003\u0004y\u0013\u0012\u0013\u001fh\u0019\"\n\u0012Py\u0006\r\u000f\u0007\u0013|\u001e2&'%", (short) (C1499aX.Xd() ^ (565134898 ^ (-565116948)))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1580rY.Xd() ^ (1081647310 ^ (-1081650428)));
        short sXd2 = (short) (C1580rY.Xd() ^ ((2055042403 ^ 1156469182) ^ (-1049829683)));
        int[] iArr = new int["$\u001a.\u0018c!\u0015!\u0019^\u0003# \u0016\u001a\u0012".length()];
        QB qb = new QB("$\u001a.\u0018c!\u0015!\u0019^\u0003# \u0016\u001a\u0012");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strXd};
        Method declaredMethod = cls.getDeclaredMethod(hg.Vd("\u0010\u0003\f\u0005r\r}\u000f\u000f", (short) (OY.Xd() ^ (ZN.Xd() ^ 864699442)), (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951484122)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void customGuardNonTamperAction() throws Throwable {
        short sXd = (short) (FB.Xd() ^ ((1372310796 ^ 1400207190) ^ 46051030));
        int[] iArr = new int["+<9930a(5 0![kY''%b)\u0015 \"\u0016\"N\u001b\u0012 \u0013\u0019\rG\n\u0007\u0011\u0010\b\u0006".length()];
        QB qb = new QB("+<9930a(5 0![kY''%b)\u0015 \"\u0016\"N\u001b\u0012 \u0013\u0019\rG\n\u0007\u0011\u0010\b\u0006");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Class<?> cls = Class.forName(C1561oA.yd("}\u000b\nKzx\u000f\u0003\t|y\u0004rp>uk\u0002u\u0004olvmcdtu,srj\"#\"0w*1\u001b!a\t\u0017\u001c \u0016$k\u000f!\u0017\u0016\u0016", (short) (C1607wl.Xd() ^ (1122161168 ^ 1122156502))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("&\u001e4 m-#1+r\u0019;:282", (short) (C1499aX.Xd() ^ ((725951070 ^ 136881409) ^ (-594381095)))))};
        Object[] objArr = {str};
        int iXd = OY.Xd() ^ 69957023;
        int iXd2 = C1633zX.Xd() ^ (1738440316 ^ (-332342563));
        short sXd2 = (short) (FB.Xd() ^ iXd);
        short sXd3 = (short) (FB.Xd() ^ iXd2);
        int[] iArr2 = new int["[P[VFbUhj".length()];
        QB qb2 = new QB("[P[VFbUhj");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void customGuardNonTamperAction2() throws Throwable {
        String strWd = Jg.Wd("\u000f_B\u0019xV]\u000bm9/7WI\f@\u0016t\u00185\u0007r\nfFU\u0006UG\u001dvS\"GH+\u000eh:", (short) (C1580rY.Xd() ^ (1310244823 ^ (-1310229396))), (short) (C1580rY.Xd() ^ (Od.Xd() ^ (43375617 ^ (-1164448650)))));
        Object[] objArr = {strWd};
        Method declaredMethod = Class.forName(ZO.xd("X\u0012z=>\u000f^\u001d\u001c\re,/M\u007f\u0004\u0018q\u0010\u0019^U ?\u001e5\u0004X\u0003I@7\u007f&?8A-Ux$~JH\u0006\u00142i*NzC\f]", (short) (C1607wl.Xd() ^ ((2117995617 ^ 655275625) ^ 1496365184)), (short) (C1607wl.Xd() ^ (1839604273 ^ 1839608754)))).getDeclaredMethod(Ig.wd("o,\be\u0014r\u0005&|", (short) (Od.Xd() ^ (287436412 ^ (-287428414)))), Class.forName(C1626yg.Ud("\bY\u001e\u0013xN\u001c  \u000e\u0003Rm7z6", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (1440329577 ^ (-1000210298)))), (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134258618)))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void customGuardTamperAction() throws Throwable {
        Object[] objArr = {EO.Od("t8d\n%Wi*^\u000b\u001e.\u0014+.\u001dFd\u0010!BIfdK!\bNe\u0019pWA\u001e4", (short) (C1499aX.Xd() ^ ((1152579315 ^ 1701156328) ^ (-567747711))))};
        Method declaredMethod = Class.forName(C1561oA.Qd("\u0005\u0010\rL\u0002}\u0012\u0004\u0010\u0002|\u0005yuAvr\u0007x\u0005vqynjiwv3xukhgdp>ns[g&KWbdXd2ScW\\Z", (short) (OY.Xd() ^ (OY.Xd() ^ 69935537)))).getDeclaredMethod(C1561oA.od("\u0004v\u007fxf\u0001q\u0003\u0003", (short) (C1607wl.Xd() ^ (OY.Xd() ^ (2048176291 ^ 2118105180)))), Class.forName(C1593ug.zd("um\u0004o=|r\u0001zBh\u000b\n\u0002\b\u0002", (short) (C1580rY.Xd() ^ ((1003645429 ^ 701933588) ^ (-302305126))), (short) (C1580rY.Xd() ^ ((1875420684 ^ 424239774) ^ (-1988214228))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void customGuardTamperAction2() throws Throwable {
        Object[] objArr = {C1561oA.Kd(":MLNJI|ETASF\u0003\u0016\u0005ZHUYO]\fZScX`V\u0013WVbc]]", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849950794)))};
        Method declaredMethod = Class.forName(Wg.Zd("PY1+{r#\u0010wc9\u007f\u0012\tp\u001fv\u0005S\u001c)\u001dC3\rgpI\u007f [l#\u007fwa+6sv>ZzbiFv \t$M|]X", (short) (FB.Xd() ^ (2018116214 ^ 2018130470)), (short) (FB.Xd() ^ ((244650835 ^ 577697878) ^ 754708506)))).getDeclaredMethod(Wg.vd("{p{v^zm\u0001z", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (-1849964862)))), Class.forName(C1561oA.Xd("yq\bsA\u0001v\u0005~Fl\u000f\u000e\u0006\f\u0006", (short) (ZN.Xd() ^ (OY.Xd() ^ 69944766)))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void debuggerDetectionNonTamperAction() throws Throwable {
        Object[] objArr = {Qg.kd("\u000e\r\u000f\u0001e\u0019%02&2(,$[))-W\u001b\u001b)\u0019\u0016&\u0016\u0014", (short) (C1580rY.Xd() ^ ((59521105 ^ 1828419414) ^ (-1870098469))), (short) (C1580rY.Xd() ^ ((1778829511 ^ 1493896663) ^ (-856546763))))};
        Method declaredMethod = Class.forName(hg.Vd("R]Z\u001aOK_Q]OJRGC\u000fD@TFRD?G<87ED\u0001FC9652>\f<A)5s\u0019%02&2\u007f!1%*(", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609498790)), (short) (ZN.Xd() ^ ((1588540698 ^ 95826806) ^ 1528367678)))).getDeclaredMethod(C1561oA.yd("\u0019\u000e\u0019\u0014\u0004 \u0013&\u0018", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609515552)))), Class.forName(C1561oA.ud("D:N8\u0004A5A9~#C@6:2", (short) (Od.Xd() ^ ((741371220 ^ 795760673) ^ (-56499836))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void debuggerDetectionNonTamperAction2() throws Throwable {
        String strYd = C1561oA.Yd("\n\u000b\u000f\u0003i\u001f-:>4B:@:\u0006tDFLx>@PBASEE", (short) (OY.Xd() ^ (FB.Xd() ^ 1609526879)));
        Object[] objArr = {strYd};
        Method declaredMethod = Class.forName(Xg.qd("lyx:qo\u0006y\b{x\u0003ywE|z\u0011\u0005\u0013\u0007\u0004\u000e\u0005\u0003\u0004\u0014\u0015S\u001b\u001a\u0012\u0011\u0012\u0011\u001fn!(\u0012 `\b\u0016#'\u001d+z\u001e0&--", (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (589866323 ^ 1622393613))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951482931)))).getDeclaredMethod(ZO.xd("{8\"s\u0013rP;\t", (short) (FB.Xd() ^ ((579358707 ^ 1112915498) ^ 1625155185)), (short) (FB.Xd() ^ (922912457 ^ 922935313))), Class.forName(Jg.Wd("\u000fx1\u000f&Go\u007f#\\EQ\u0002z3\u0017", (short) (C1580rY.Xd() ^ (751061470 ^ (-751056920))), (short) (C1580rY.Xd() ^ (C1499aX.Xd() ^ 1134260637)))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void debuggerDetectionTamperAction() throws Throwable {
        String strUd = C1626yg.Ud("BzBf\u0018_a(g(dPs\u00188\nI+\u0012W\u001az)", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831066883))), (short) (FB.Xd() ^ (635531825 ^ 635522127)));
        Class<?> cls = Class.forName(Ig.wd("L\bs\u0018>\u000f<8u\u001b\u0017Djk*\t,U~Fy,Mabp v@7Sr\u0003'\u001cq\\,1\u0002\r#}'3P|[y~\u0016Ei\u001f", (short) (C1607wl.Xd() ^ (570684020 ^ 570660695))));
        Class<?>[] clsArr = {Class.forName(EO.Od("a\u0007PXv\u0003A@d\\\u0002?l_j\u0003", (short) (ZN.Xd() ^ (890555685 ^ 890561600))))};
        Object[] objArr = {strUd};
        short sXd = (short) (C1633zX.Xd() ^ ((446456090 ^ 7738494) ^ (-451550222)));
        int[] iArr = new int["\u0006x\u0002zh\u0003s\u0005\u0005".length()];
        QB qb = new QB("\u0006x\u0002zh\u0003s\u0005\u0005");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void debuggerDetectionTamperAction2() throws Throwable {
        String strZd = C1593ug.zd("!\"&\u001a\u00016DQUKYQWQ\u001d\fQScUTfXX", (short) (FB.Xd() ^ ((88153508 ^ 1047053769) ^ 992608240)), (short) (FB.Xd() ^ (826499384 ^ 826476039)));
        Class<?> cls = Class.forName(C1561oA.od("HSP\u0010EAUGSE@H=9\u0005:6J<H:5=2.-;:v<9/,+(4\u000227\u001f+i\u000f\u001b&(\u001c(u\u0017'\u001b \u001e", (short) (C1633zX.Xd() ^ ((138709446 ^ 1604700462) ^ (-1474381658)))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Kd("\u001b\u0013)\u0015b\"\u0018& g\u000e0/'-'", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951493309))))};
        Object[] objArr = {strZd};
        int iXd = Od.Xd() ^ (-1207817148);
        int iXd2 = FB.Xd() ^ (117958289 ^ (-1491634487));
        short sXd = (short) (C1499aX.Xd() ^ iXd);
        short sXd2 = (short) (C1499aX.Xd() ^ iXd2);
        int[] iArr = new int[".W\u0015Ln>e3i".length()];
        QB qb = new QB(".W\u0015Ln>e3i");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void dynamicInstrumentationDetectionNonTamperAction() throws Throwable {
        String strXd = C1561oA.Xd("HNJA(]kx|r\u0001x~x2\u0002\u0004\n6{}\u000e\u007f~\u0011\u0003\u0003", (short) (OY.Xd() ^ ((1723048316 ^ 1471715054) ^ 822816164)));
        Object[] objArr = {strXd};
        Method declaredMethod = Class.forName(Wg.vd("\u000e\u001b\u001a[\u0013\u0011'\u001b)\u001d\u001a$\u001b\u0019f\u001e\u001c2&4(%/&$%56t<;3232@\u0010BI3A\u0002)7DH>L\u001c?QGNN", (short) (FB.Xd() ^ (OY.Xd() ^ (1036427262 ^ 971887322))))).getDeclaredMethod(hg.Vd("\u001b\u000e\u0017\u0010}\u0018\t\u001a\u001a", (short) (C1580rY.Xd() ^ ((468252647 ^ 1333472623) ^ (-1418980756))), (short) (C1580rY.Xd() ^ (OY.Xd() ^ (892655306 ^ (-824176258))))), Class.forName(Qg.kd("{q\u0006o;xlxp6Zzwmqi", (short) (C1499aX.Xd() ^ ((1022750972 ^ 1677263544) ^ (-1594657198))), (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (664302101 ^ (-336727693)))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void dynamicInstrumentationDetectionNonTamperAction2() throws Throwable {
        String strUd = C1561oA.ud("mqk`Ex\u0005\u0010\u0012\u0006\u0012\b\f\u0004M:\b\b\f6yy\bwt\u0005tr", (short) (FB.Xd() ^ ((421692775 ^ 1100208707) ^ 1487996413)));
        Class<?> cls = Class.forName(C1561oA.yd("z\u0006\u0007F\u007f{\u0014\u0006\u0016\b\u0007\u000f\b\u0004S\th|r~to{ppo\u0002\u0001A\u0007\b}\u001f\u001e\u001f+|-6\u001e.l\u0016\"13+7h\n\u001e\u0012\u001b\u0019", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (1462120976 ^ 282834574)))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (OY.Xd() ^ ((95479857 ^ 43365753) ^ 119881883));
        int[] iArr = new int["\u001c\u0014*\u0016c#\u0019'!h\u000f10(.(".length()];
        QB qb = new QB("\u001c\u0014*\u0016c#\u0019'!h\u000f10(.(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strUd};
        Method declaredMethod = cls.getDeclaredMethod(Xg.qd("MBMH8TGZ\\", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609522032))), (short) (C1580rY.Xd() ^ (1679120317 ^ (-1679112329)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void dynamicInstrumentationDetectionTamperAction() throws Throwable {
        int iXd = ZN.Xd() ^ (1738641110 ^ 1412154659);
        int iXd2 = ZN.Xd() ^ (2083511848 ^ 1336270367);
        short sXd = (short) (ZN.Xd() ^ iXd);
        short sXd2 = (short) (ZN.Xd() ^ iXd2);
        int[] iArr = new int["R$w\"`Q7wS\u0015Z&c9*C|X\"dN{S".length()];
        QB qb = new QB("R$w\"`Q7wS\u0015Z&c9*C|X\"dN{S");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        int iXd3 = C1633zX.Xd() ^ (76666578 ^ 1891696107);
        int iXd4 = C1607wl.Xd() ^ (1114024801 ^ (-740468315));
        short sXd3 = (short) (C1580rY.Xd() ^ iXd3);
        short sXd4 = (short) (C1580rY.Xd() ^ iXd4);
        int[] iArr2 = new int[".\u007fJA\r(\u0007Qz\u0018f\u0004\u001as*c3$\u001a\u0019N<\u000f9$\u007f\u0019z\u001aj\\=;/\u0012LteZ\u001f\u0010G\u0007i\u000f\f}g\u001f9Ye_\u001f".length()];
        QB qb2 = new QB(".\u007fJA\r(\u0007Qz\u0018f\u0004\u001as*c3$\u001a\u0019N<\u000f9$\u007f\u0019z\u001aj\\=;/\u0012LteZ\u001f\u0010G\u0007i\u000f\f}g\u001f9Ye_\u001f");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Class.forName(C1626yg.Ud("\u007f\u0015Ov}\u0005\f!*bAXZJ~D", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849962267)), (short) (ZN.Xd() ^ ((1841074125 ^ 829043717) ^ 1557585216))))};
        Object[] objArr = {str};
        short sXd5 = (short) (Od.Xd() ^ (666226006 ^ (-666212958)));
        int[] iArr3 = new int["\tV.\u0005{9S\u00167".length()];
        QB qb3 = new QB("\tV.\u0005{9S\u00167");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd5 + i4)));
            i4++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void dynamicInstrumentationDetectionTamperAction2() throws Throwable {
        String strOd = EO.Od("l@?W?H+\u001a_bg\u0007ZW\u007f\u0016/\u0014]X\u0019T]b", (short) (C1580rY.Xd() ^ ((212401310 ^ 1324302991) ^ (-1111995425))));
        short sXd = (short) (C1607wl.Xd() ^ (724461372 ^ 724439478));
        int[] iArr = new int["\u000f\u001a\u0017V\f\b\u001c\u000e\u001a\f\u0007\u000f\u0004\u007fK\u0001|\u0011\u0003\u000f\u0001{\u0004xts\u0002\u0001=\u0003\u007furqnzHx}eq0Ualnbn<]mafd".length()];
        QB qb = new QB("\u000f\u001a\u0017V\f\b\u001c\u000e\u001a\f\u0007\u000f\u0004\u007fK\u0001|\u0011\u0003\u000f\u0001{\u0004xts\u0002\u0001=\u0003\u007furqnzHx}eq0Ualnbn<]mafd");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = {Class.forName(C1593ug.zd("%\u001d3\u001fl,\"0*q\u0018:9171", (short) (ZN.Xd() ^ (1778142453 ^ 1778137288)), (short) (ZN.Xd() ^ (OY.Xd() ^ (1536400727 ^ 1605959522)))))};
        Object[] objArr = {strOd};
        short sXd2 = (short) (OY.Xd() ^ (FB.Xd() ^ (288771681 ^ 1322844924)));
        int[] iArr2 = new int["3&/(\u00160!22".length()];
        QB qb2 = new QB("3&/(\u00160!22");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void emulatorDetectionNonTamperAction() throws Throwable {
        Object[] objArr = {C1561oA.Kd("\t\t\r\u0001g\u000e7@8.B>Bp@BHt:<L>=OAA", (short) (C1580rY.Xd() ^ ((1455175423 ^ 813199401) ^ (-1724149550))))};
        Method declaredMethod = Class.forName(Wg.Zd("\u000e\u0004~&9\u001f,{o]D&\u0018}#D:(\u0007\rjAA#xamDn/\u0014g\\G \u0015`zY=2L]cJ8%\u001dD_])\u001b\u0015", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ 831084417)), (short) (C1499aX.Xd() ^ ((1983174535 ^ 1467926966) ^ (-558506819))))).getDeclaredMethod(Wg.vd(">3:5!=,?M", (short) (ZN.Xd() ^ (OY.Xd() ^ (1329882348 ^ 1265578141)))), Class.forName(C1561oA.Xd("WOeQ\u001f^Tb\\$Jlkcic", (short) (OY.Xd() ^ (1521466275 ^ 1521479673)))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void emulatorDetectionNonTamperAction2() throws Throwable {
        String strKd = Qg.kd("757)\u000e2Y`VJ\\VX\u0017\u0004QQU\u007fCCQA>N><", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (794513711 ^ (-728783138)))), (short) (C1499aX.Xd() ^ ((394814658 ^ 1299064566) ^ (-1525054499))));
        int iXd = C1580rY.Xd() ^ 831086559;
        int iXd2 = ZN.Xd() ^ (-864704654);
        short sXd = (short) (C1580rY.Xd() ^ iXd);
        short sXd2 = (short) (C1580rY.Xd() ^ iXd2);
        int[] iArr = new int["y\u0005\u0002Avr\u0007x\u0005vqynj6kg{mykfnc_^lk(mj`]\\Ye3chP\\\u001b@LWYMY'HXLQO".length()];
        QB qb = new QB("y\u0005\u0002Avr\u0007x\u0005vqynj6kg{mykfnc_^lk(mj`]\\Ye3chP\\\u001b@LWYMY'HXLQO");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd3 = (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (1598369385 ^ 822178134)));
        int[] iArr2 = new int["oeyc/l`ld*Nnkae]".length()];
        QB qb2 = new QB("oeyc/l`ld*Nnkae]");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {strKd};
        short sXd4 = (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609507251)));
        int[] iArr3 = new int["SHOJ>ZI\\b".length()];
        QB qb3 = new QB("SHOJ>ZI\\b");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 ^ i4));
            i4++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void emulatorDetectionNonTamperAction3() throws Throwable {
        Object[] objArr = {C1561oA.Yd("ggk_Fl\u0016\u001f\u0017\r!\u001d!bP \"(T\u001a\u001c,\u001e\u001d/!!", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1528506732 ^ (-1754360000)))))};
        Method declaredMethod = Class.forName(Xg.qd("\u0005\u0012\u0011R\n\b\u001e\u0012 \u0014\u0011\u001b\u0012\u0010]\u0015\u0013)\u001d+\u001f\u001c&\u001d\u001b\u001c,-k32*)*)7\u00079@*8x .;?5C\u00136H>EE", (short) (OY.Xd() ^ (FB.Xd() ^ (1982040112 ^ 701270995))), (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951486656))))).getDeclaredMethod(ZO.xd("\u001ePep\u0018apO6", (short) (Od.Xd() ^ (C1499aX.Xd() ^ 1134260367)), (short) (Od.Xd() ^ ((98187052 ^ 999547040) ^ (-1045008055)))), Class.forName(Jg.Wd("/H\\\u0002=1`\u001c\u0010\u001e0\fHbf\u001c", (short) (FB.Xd() ^ (455969104 ^ 455977544)), (short) (FB.Xd() ^ ((1869679038 ^ 1357355708) ^ 1066840446)))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void emulatorDetectionTamperAction() throws Throwable {
        String strUd = C1626yg.Ud("w\u001c\u0003aRC#\u0011\u001cu{16\u007f{?m\u0002.?\"l", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (1177492658 ^ (-678124435)))), (short) (C1580rY.Xd() ^ ((47629159 ^ 857149443) ^ (-834792363))));
        short sXd = (short) (C1607wl.Xd() ^ ((468744718 ^ 1225168462) ^ 1391887569));
        int[] iArr = new int["'|\u000bla\"\u001d]@4,]!\u001exR\u0017\fTk$i^Z97\"]z\rpM\u001d\u0005J\u001bCRkHSp`m\u001d\u001aW\u0016PTC\f06".length()];
        QB qb = new QB("'|\u000bla\"\u001d]@4,]!\u001exR\u0017\fTk$i^Z97\"]z\rpM\u001d\u0005J\u001bCRkHSp`m\u001d\u001aW\u0016PTC\f06");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (OY.Xd() ^ ((502891956 ^ 55843902) ^ 514700062));
        int[] iArr2 = new int["g(KZoZ75\f$EF\u0010\u0007\u0016r".length()];
        QB qb2 = new QB("g(KZoZ75\f$EF\u0010\u0007\u0016r");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i3)) + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {strUd};
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.Qd("K>G@.H9JJ", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (534683370 ^ 1804580075)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void emulatorDetectionTamperAction2() throws Throwable {
        String strZd = C1593ug.zd("88<0\u0017=fog]qmq2!fhxji{mm", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849966043)), (short) (FB.Xd() ^ ((534539233 ^ 389504087) ^ 149624346)));
        short sXd = (short) (ZN.Xd() ^ (ZN.Xd() ^ (706665082 ^ 429169128)));
        int[] iArr = new int["/:7v,(<.:,'/$ k!\u001d1#/!\u001c$\u0019\u0015\u0014\"!]# \u0016\u0013\u0012\u000f\u001bh\u0019\u001e\u0006\u0012Pu\u0002\r\u000f\u0003\u000f\\}\u000e\u0002\u0007\u0005".length()];
        QB qb = new QB("/:7v,(<.:,'/$ k!\u001d1#/!\u001c$\u0019\u0015\u0014\"!]# \u0016\u0013\u0012\u000f\u001bh\u0019\u001e\u0006\u0012Pu\u0002\r\u000f\u0003\u000f\\}\u000e\u0002\u0007\u0005");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {strZd};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Wg.Zd("M\u000f2u\u001e\u0007\u0012mh", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (1687978801 ^ (-1427503764)))), (short) (OY.Xd() ^ ((408992491 ^ 387114668) ^ 259141803))), Class.forName(C1561oA.Kd("xp\u0007r@\u007fu\u0004}Ek\u000e\r\u0005\u000b\u0005", (short) (Od.Xd() ^ (OY.Xd() ^ (2084378267 ^ (-2014730744)))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void emulatorDetectionTamperAction3() throws Throwable {
        Object[] objArr = {C1561oA.Xd("\u0014\u0014\u0018\fr\u0019BKC9MIM\u000f|BDTFEWII", (short) (Od.Xd() ^ ((2128503169 ^ 1929753332) ^ (-232506639))))};
        Method declaredMethod = Class.forName(Wg.vd("BOJ\f?=OCMA:D75~60F6D417.()56p83+fgbp<nq[e&IW`dVd0SaWZZ", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831064038))))).getDeclaredMethod(hg.Vd("\u001c\u000f\u0018\u0011~\u0019\n\u001b\u001b", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (989387176 ^ (-1054051467)))), (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (1152824930 ^ (-2000462052))))), Class.forName(Qg.kd("\u001e\u0014(\u0012]\u001b\u000f\u001b\u0013X|\u001d\u001a\u0010\u0014\f", (short) (OY.Xd() ^ (FB.Xd() ^ (270309848 ^ 1341368205))), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831070222))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void hookDetectionNonTamperAction() throws Throwable {
        String strUd = C1561oA.ud(":57)\u000eAMXZNZPTL\u0004QQU\u007fCCQA>N><", (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951489621))));
        Class<?> cls = Class.forName(C1561oA.yd("U`]\u001dRNbTpb]eZV\"WCWIUGBJ?KJXW\u0014YVL985A\u000f?D,H\u0007,8CE9E\u0003$4(-+", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1495322089 ^ (-1789577406))))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1580rY.Xd() ^ (2033924919 ^ (-2033923123)));
        int[] iArr = new int["_WmY'f\\jd,Rtskqk".length()];
        QB qb = new QB("_WmY'f\\jd,Rtskqk");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strUd};
        Method declaredMethod = cls.getDeclaredMethod(Xg.qd("\u001f\u0014\u001f\u001a\n&\u0019,.", (short) (OY.Xd() ^ (Od.Xd() ^ 1207811710)), (short) (OY.Xd() ^ (856142840 ^ 856145999))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void hookDetectionTamperAction() throws Throwable {
        Object[] objArr = {Jg.Wd("Q\u0014lA~\u0005\u007f^8\u000frO/z\u0019/\b|G(\u0010R<", (short) (FB.Xd() ^ (FB.Xd() ^ 1609525049)), (short) (FB.Xd() ^ ((848818873 ^ 602911563) ^ 293091604)))};
        Method declaredMethod = Class.forName(ZO.xd("(y=9\u0015M\rO\u0015\u0003s\u00142\n\\@|4h=`>\u0019yrvu)+#\n\u0006$d.xG\u000e]\\PU=M/\u0010TJF\u001a}\u001f\tA", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831092357))), (short) (FB.Xd() ^ (FB.Xd() ^ 1609523793)))).getDeclaredMethod(Ig.wd("L\u0013lI5r\u0013K|", (short) (OY.Xd() ^ ((463594812 ^ 1737049160) ^ 2083043004))), Class.forName(C1626yg.Ud("\u0011kW'\u001e\u0007%@|n`\u0007<<'7", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (-864706588))), (short) (C1499aX.Xd() ^ ((1509991058 ^ 1116639095) ^ (-411978009))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void makeToast(String str) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(EO.Od("{8\u001c\u000f\u001cZ\u0006WoD\u0001|j`\u0006U\u000f", (short) (C1580rY.Xd() ^ ((76646265 ^ 2064533212) ^ (-2141183450))))).getDeclaredMethod(C1561oA.Qd("pm{SfmqNpooco", (short) (OY.Xd() ^ (OY.Xd() ^ (1826676029 ^ 1758189647)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Object[] objArr2 = {new Runnable() { // from class: com.davivienda.daviviendaapp.triggerArxan.TamperAction.1
                @Override // java.lang.Runnable
                public void run() {
                    EO.Od("x%)", (short) (ZN.Xd() ^ (Od.Xd() ^ 1207796481)));
                    C1561oA.Qd("\f2.\"", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609513996))));
                }
            }};
            Method method = Class.forName(C1593ug.zd("(6-<:51{>C~\u001a4B9B<J", (short) (OY.Xd() ^ (149386738 ^ 149379541)), (short) (OY.Xd() ^ ((1038312044 ^ 1547756525) ^ 1638106492)))).getMethod(C1561oA.Kd("2279", (short) (C1580rY.Xd() ^ (1434949470 ^ (-1434965233)))), Class.forName(C1561oA.od("<2F0{9-91v\u001a<43%%.&", (short) (C1499aX.Xd() ^ (1113515587 ^ (-1113501924))))));
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void maliciousPackageDetectionGuardNonTamperAction() throws Throwable {
        Object[] objArr = {Wg.Zd("\u000e\u0003`3\u0001#\u0019\u0005nUV.\u0019\u0003#Q;,Ar_[4\u0012\bjN", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849959670))), (short) (Od.Xd() ^ (ZN.Xd() ^ (-864696629))))};
        Method declaredMethod = Class.forName(C1561oA.Xd("\u001c)(i!\u001f5)7+(2)'t,*@4B63=423CD\u0003JIA@A@N\u001ePWAO\u00107ERVLZ*M_U\\\\", (short) (OY.Xd() ^ (Od.Xd() ^ (730637434 ^ 1819366426))))).getDeclaredMethod(Qg.kd("%\u0018!\u001a\b\"\u0013$$", (short) (OY.Xd() ^ (ZN.Xd() ^ 864700018)), (short) (OY.Xd() ^ (FB.Xd() ^ 1609530256))), Class.forName(Wg.vd("^VlX\u001e]SaS\u001bAcZRXR", (short) (OY.Xd() ^ (1805336394 ^ 1805327249)))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void maliciousPackageDetectionGuardTamperAction() throws Throwable {
        String strVd = hg.Vd("46)\u001e\u00036BMOCOEIAx<<J:7G75", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (427789899 ^ (-1831783699)))), (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (337330683 ^ (-1615486596)))));
        Class<?> cls = Class.forName(C1561oA.ud("Va^\u001eSOcUaSNVKG\u0013HDXJVHCK@<;IH\u0005JG=:96B\u0010@E-9w\u001d)46*6\u0004%5).,", (short) (C1499aX.Xd() ^ ((302449415 ^ 1647591919) ^ (-1882395985)))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (Od.Xd() ^ (ZN.Xd() ^ (-864710829)));
        int[] iArr = new int["-%7#l,\u001e,2y\u001c>913-".length()];
        QB qb = new QB("-%7#l,\u001e,2y\u001c>913-");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strVd};
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.Yd("\u0016\u000b\u0016\u0011\u0001\u001d\u0010#%", (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ (1181711965 ^ 2011586937)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void resourceVerificationNonTamperAction() throws Throwable {
        String strQd = Xg.qd("otfZAv\u0005\u0012\u0016\f\u001a\u0012\u0018\u0012K\u001b\u001d#O\u0015\u0017'\u0019\u0018*\u001c\u001c", (short) (C1607wl.Xd() ^ ((1380501464 ^ 136567186) ^ 1516971375)), (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134247639))));
        int iXd = ZN.Xd() ^ 864703355;
        short sXd = (short) (ZN.Xd() ^ ((839514211 ^ 962260414) ^ 190009081));
        short sXd2 = (short) (ZN.Xd() ^ iXd);
        int[] iArr = new int["\u0005\r\u0019\u0015q%UV\u000b\u0010Z\u0003\u001b\u0010\u001b[\u007fki5\u000e=d)I_z\u0011|v3AYo|<:\"B#nA6Y\u0011\n=]J@_\u000b|2".length()];
        QB qb = new QB("\u0005\r\u0019\u0015q%UV\u000b\u0010Z\u0003\u001b\u0010\u001b[\u007fki5\u000e=d)I_z\u0011|v3AYo|<:\"B#nA6Y\u0011\n=]J@_\u000b|2");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Object[] objArr = {strQd};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1626yg.Ud(" v&M\u0004,*d\u0016", (short) (Od.Xd() ^ ((476239353 ^ 1193158383) ^ (-1534913346))), (short) (Od.Xd() ^ (FB.Xd() ^ (-1609522340)))), Class.forName(ZO.xd("0,I+g\u0004}1\u0003*j\\|\u007f8/", (short) (FB.Xd() ^ ((400343502 ^ 761084059) ^ 981582065)), (short) (FB.Xd() ^ ((44853556 ^ 820563225) ^ 843350432)))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void resourceVerificationTamperAction() throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (Od.Xd() ^ (-1207796155)));
        int[] iArr = new int["6_B\u0019tSFA|\u0010\u00198qb)\u00125Ho8q)X".length()];
        QB qb = new QB("6_B\u0019tSFA|\u0010\u00198qb)\u00125Ho8q)X");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Class<?> cls = Class.forName(EO.Od("!]\frj\u001c\u000bx,aa\u0003#(f9r\u001c9|\b[60\u0005H5\u0007\"V0\u0003hN\u0005K\n\u0017}t}%~\u001a3JtLlv\u001fAS*", (short) (Od.Xd() ^ ((1022266492 ^ 1354785019) ^ (-1815016348)))));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (FB.Xd() ^ ((692879872 ^ 823421557) ^ 408467120));
        int[] iArr2 = new int["ZPdN\u001aWKWO\u00159YVLPH".length()];
        QB qb2 = new QB("ZPdN\u001aWKWO\u00159YVLPH");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {str};
        int iXd = OY.Xd() ^ 69946569;
        int iXd2 = C1607wl.Xd() ^ (1874117532 ^ 32553640);
        short sXd3 = (short) (FB.Xd() ^ iXd);
        short sXd4 = (short) (FB.Xd() ^ iXd2);
        int[] iArr3 = new int["?4?:*F9LN".length()];
        QB qb3 = new QB("?4?:*F9LN");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) - sXd4);
            i4++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void rootDetectionNonTamperAction() throws Throwable {
        short sXd = (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134253439)));
        int[] iArr = new int["\\MOA&Yeprfrhld\u001ciim\u0018[[iYVfVT".length()];
        QB qb = new QB("\\MOA&Yeprfrhld\u001ciim\u0018[[iYVfVT");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Class<?> cls = Class.forName(C1561oA.Kd("\u0006\u0013\u0012S\u000b\t\u001f\u0013!\u0015\u0012\u001c\u0013\u0011^\u0016\u0014*\u001e, \u001d'\u001e\u001c\u001d-.l43+*+*8\b:A+9y!/<@6D\u00147I?FF", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951489308))));
        Class<?>[] clsArr = {Class.forName(Wg.Zd("\u0005y\u0011e@-$\u001b\"\u0017>EUz\u0002`", (short) (Od.Xd() ^ (1162814561 ^ (-1162820402))), (short) (Od.Xd() ^ ((1413093843 ^ 690955664) ^ (-2098557996)))))};
        Object[] objArr = {str};
        short sXd2 = (short) (C1633zX.Xd() ^ (85865006 ^ (-85862481)));
        int[] iArr2 = new int["6+61!=0CE".length()];
        QB qb2 = new QB("6+61!=0CE");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
            i3++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr2, 0, i3), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void rootDetectionNonTamperAction2() throws Throwable {
        String strVd = Wg.vd("0!#\u0015\u00025ALVJVLXP\bU=Ak/7E52J:8", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69953243))));
        Object[] objArr = {strVd};
        Method declaredMethod = Class.forName(Qg.kd("6A>}3/C5A3.6+'r($8*6(#+ \u001c\u001b)(d*'\u001d\u001a\u0019\u0016\"o %\r\u0019W|\t\u0014\u0016\n\u0016c\u0005\u0015\t\u000e\f", (short) (Od.Xd() ^ (1959840512 ^ (-1959840002))), (short) (Od.Xd() ^ (C1499aX.Xd() ^ (65778407 ^ 1081143788))))).getDeclaredMethod(C1561oA.ud(".!*#\u0011+\u001c--", (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (1968131690 ^ (-18775881))))), Class.forName(hg.Vd("\u000b\u0001\u0015~J\b{\b\u007fEi\n\u0007|\u0001x", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69949685))), (short) (C1580rY.Xd() ^ (Od.Xd() ^ (1486798330 ^ (-526589501)))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void rootDetectionTamperAction() throws Throwable {
        String strYd = C1561oA.yd("2#%\u0017{/;FXLXNRJ\u0002EUcSP`PN", (short) (C1499aX.Xd() ^ ((2122784563 ^ 1586517523) ^ (-538408341))));
        short sXd = (short) (C1633zX.Xd() ^ (1935432559 ^ (-1935423845)));
        int[] iArr = new int["FSR\u0014KI_SaUR\\SQ\u001fVTj^l`]g^\\]mn-tskjkjxHz\u0002ky:ao|\u0001v\u0005Tw\n\u007f\u0007\u0007".length()];
        QB qb = new QB("FSR\u0014KI_SaUR\\SQ\u001fVTj^l`]g^\\]mn-tskjkjxHz\u0002ky:ao|\u0001v\u0005Tw\n\u007f\u0007\u0007");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr = {strYd};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Jg.Wd("\u001a=O\u000b\u0002%F`+", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (87018768 ^ 1121085263))), (short) (C1607wl.Xd() ^ ((124276904 ^ 1115692090) ^ 1172843525))), Class.forName(Xg.qd("@8N:\bG=KE\r3UTLRL", (short) (C1607wl.Xd() ^ (122985475 ^ 122992071)), (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134240327))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void rootDetectionTamperAction2() throws Throwable {
        String strXd = ZO.xd("\u000f6L%nH\u0006\u00148\tJL\rd+5g\u001f[RZ\u000bx", (short) (ZN.Xd() ^ ((113816178 ^ 2143890205) ^ 2030157461)), (short) (ZN.Xd() ^ ((700306065 ^ 895627858) ^ 484426720)));
        Object[] objArr = {strXd};
        Method declaredMethod = Class.forName(C1626yg.Ud("LW>\u000b\u001a1\u001e*W3vh\u0012l\u0017!a\\,\u0007ISxz\u0016(,\u000f$\r[\u000e&/Kv{X6\rmH\b'\nl^DoVRNkC", (short) (C1580rY.Xd() ^ ((2068677769 ^ 1213941978) ^ (-857137692))), (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951482457)))).getDeclaredMethod(EO.Od("C\baBB2}j2", (short) (C1580rY.Xd() ^ (1954631962 ^ (-1954625451)))), Class.forName(Ig.wd("\u000589\u0002Set\u0001*\u0015<{*',O", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849953099)))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void signatureCheckNonTamperAction() throws Throwable {
        String strQd = C1561oA.Qd("%\u0014\u0017\tm!-8:.:04,c115_##1!\u001e.\u001e\u001c", (short) (OY.Xd() ^ ((1799780444 ^ 1777003110) ^ 44874736)));
        int iXd = OY.Xd() ^ (-69931280);
        int iXd2 = OY.Xd() ^ (784144172 ^ (-714500489));
        short sXd = (short) (Od.Xd() ^ iXd);
        short sXd2 = (short) (Od.Xd() ^ iXd2);
        int[] iArr = new int["9FE\u0007><RFTHEOFD\u0012IG]Q_SPZQOP`a gf^]^]k;mt^l-TbosiwGj|ryy".length()];
        QB qb = new QB("9FE\u0007><RFTHEOFD\u0012IG]Q_SPZQOP`a gf^]^]k;mt^l-TbosiwGj|ryy");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = {strQd};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Kd("@5@;+G:MO", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (-831065875)))), Class.forName(C1561oA.od("\\RfP\u001cYMYQ\u0017;[XNRJ", (short) (Od.Xd() ^ (340504687 ^ (-340521206))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void signatureCheckNonTamperAction2() throws Throwable {
        String strZd = Wg.Zd(":&C\u0002_2\u0006\u000f+kp\u0006QG+d+J\u0016>\u001cho~CQ[&", (short) (C1607wl.Xd() ^ (OY.Xd() ^ 69939443)), (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (1730122139 ^ 157009092))));
        Class<?> cls = Class.forName(C1561oA.Xd("Wdc%\\Zpdrfcmdb0ge{o}qnxomn~\u007f>\u0006\u0005|{|{\nY\f\u0013|\u000bKr\u0001\u000e\u0012\b\u0016e\t\u001b\u0011\u0018\u0018", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (722116224 ^ (-411080244))))));
        Class<?>[] clsArr = {Class.forName(Wg.vd("\u000f\u0007\u001d\tN\u000e\u0004\u0012\u0004Kq\u0014\u000b\u0003\t\u0003", (short) (C1607wl.Xd() ^ ((1019403816 ^ 1180292089) ^ 2056981048))))};
        Object[] objArr = {strZd};
        int iXd = C1607wl.Xd() ^ (534814885 ^ (-1906612390));
        int iXd2 = C1580rY.Xd() ^ 831078428;
        short sXd = (short) (C1499aX.Xd() ^ iXd);
        short sXd2 = (short) (C1499aX.Xd() ^ iXd2);
        int[] iArr = new int["\u0002t}vd~o\u0001\u0001".length()];
        QB qb = new QB("\u0002t}vd~o\u0001\u0001");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void signatureCheckTamperAction() throws Throwable {
        short sXd = (short) (ZN.Xd() ^ ((1795597779 ^ 1267271699) ^ 546293897));
        short sXd2 = (short) (ZN.Xd() ^ ((782890694 ^ 711565562) ^ 79695197));
        int[] iArr = new int["\u0004rugL\u007f\f\u0017\u0019\r\u0019\u000f\u0013\u000bB\u0006\u0006\u0014\u0004\u0001\u0011\u0001~".length()];
        QB qb = new QB("\u0004rugL\u007f\f\u0017\u0019\r\u0019\u000f\u0013\u000bB\u0006\u0006\u0014\u0004\u0001\u0011\u0001~");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        Class<?> cls = Class.forName(C1561oA.ud("\u0014\u001f\u001c[\u0011\r!\u0013\u001f\u0011\f\u0014\t\u0005P\u0006\u0002\u0016\b\u0014\u0006\u0001\t}yx\u0007\u0006B\b\u0005zwvs\u007fM}\u0003jv5ZfqsgsAbrfki", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69949492)))));
        Class<?>[] clsArr = new Class[1];
        short sXd3 = (short) (C1633zX.Xd() ^ ((465571698 ^ 1386999781) ^ (-1231784137)));
        int[] iArr2 = new int["ndxb6sgsc)Mmrhld".length()];
        QB qb2 = new QB("ndxb6sgsc)Mmrhld");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {str};
        short sXd4 = (short) (C1633zX.Xd() ^ (757755118 ^ (-757757904)));
        int[] iArr3 = new int["-\"-(\u00184':<".length()];
        QB qb3 = new QB("-\"-(\u00184':<");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd4 + sXd4) + sXd4) + i4));
            i4++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i4), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void signatureCheckTamperAction2() throws Throwable {
        String strQd = Xg.qd("\u000e~\u0004w^\u0014\"/3)7/5/zi/1A32D66", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207796006))), (short) (C1580rY.Xd() ^ (1487636490 ^ (-1487637396))));
        Object[] objArr = {strQd};
        Method declaredMethod = Class.forName(Jg.Wd("TYR\u0010aWg\u0016@.cg:r:iASA\nUL\u0013\u0004\u001aU_\\5tm :5lt \r\u000eoX\u00156~ca\u0014\u001c\u0003`l^\u007fw", (short) (OY.Xd() ^ (ZN.Xd() ^ (636936044 ^ 377267876))), (short) (OY.Xd() ^ ((2059803373 ^ 360229247) ^ 1874779710)))).getDeclaredMethod(C1626yg.Ud("\u007fz\n~'.r<4", (short) (Od.Xd() ^ ((1969153691 ^ 524530866) ^ (-1780298841))), (short) (Od.Xd() ^ (2114271019 ^ (-2114278423)))), Class.forName(ZO.xd("\u0019t5)yZs\u0018\u0019!Dpr-yv", (short) (FB.Xd() ^ ((1588292590 ^ 1497764821) ^ 132976628)), (short) (FB.Xd() ^ (C1607wl.Xd() ^ (1772410579 ^ 132163104))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void virtualControlDetectionNonTamperAction() throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ ((976776795 ^ 1130095063) ^ 2036591622));
        int[] iArr = new int["\t-aq.&\u001df;ARe@)WA&;\f\u0017Y\u0012f^a,\u000b".length()];
        QB qb = new QB("\t-aq.&\u001df;ARe@)WA&;\f\u0017Y\u0012f^a,\u000b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2)};
        Method declaredMethod = Class.forName(EO.Od("\u0019N:_mGt\bc\u0017\r{<G\u0010)by%^\u00100\u0017\u0011|tb\u001f>S)\u0003\u00113\u0018gL&A 5\r}\r\u007frl+\u001cb4];;", (short) (ZN.Xd() ^ ((676847505 ^ 742287426) ^ 74033987)))).getDeclaredMethod(C1593ug.zd(" \u0015 \u001b\u000b'\u001a-/", (short) (C1499aX.Xd() ^ ((1923412582 ^ 2041843676) ^ (-185653719))), (short) (C1499aX.Xd() ^ ((1565543667 ^ 1676552501) ^ (-1052643015)))), Class.forName(C1561oA.Qd("<2F0{9-91v\u001b;8.2*", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (1433588381 ^ (-384416288)))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void virtualControlDetectionNonTamperAction2() throws Throwable {
        String strOd = C1561oA.od("\u001a\u0006\tz_\u0013\u001f*, ,\"&\u001egT\"\"&P\u0014\u0014\"\u0012\u000f\u001f\u000f\r", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (1443709145 ^ (-1378227468)))));
        Object[] objArr = {strOd};
        Method declaredMethod = Class.forName(C1561oA.Kd("!.-n&$:.<0-7.,y1/E9G;8B978HI\bONFEFES#U\\FT\u0015<JW[Q_/RdZaa", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (130214545 ^ (-910936888)))))).getDeclaredMethod(C1561oA.Xd("PEPK;WJ]_", (short) (ZN.Xd() ^ (44841381 ^ 44844554))), Class.forName(Wg.Zd("89QA\tDT^R\u001eF\\UIYO", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (186154601 ^ (-255027188)))), (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (-1849972564))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void virtualControlDetectionTamperAction() throws Throwable {
        String strVd = Wg.vd("\u0003nugP\u0004\u0014\u001f\u0015\t\u0019\u000f\u0017\u000fJ\u000e\"0$!5%'", (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (669521577 ^ (-1236021106)))));
        Object[] objArr = {strVd};
        Method declaredMethod = Class.forName(Qg.kd("KVS\u0013HDXJVHCK@<\b=9M?K=8@510>=y?<2/.+7\u00055:\".l\u0012\u001e)+\u001f+x\u001a*\u001e#!", (short) (C1607wl.Xd() ^ (2070288523 ^ 2070283656)), (short) (C1607wl.Xd() ^ (Od.Xd() ^ (139112457 ^ 1337406037))))).getDeclaredMethod(C1561oA.ud("i\\e^LfWhh", (short) (FB.Xd() ^ (191887827 ^ 191868014))), Class.forName(hg.Vd("g]q['dXd\\\"FfcY]U", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (1602498872 ^ (-1846370513)))), (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849973236)))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void virtualControlDetectionTamperAction2() throws Throwable {
        String strYd = C1561oA.yd("wcfXEx\u0005\u0010\u001a\u000e\u001a\u0010\u001c\u0014]J\u0016\u0016$\u0014\u0019)\u0019\u0017", (short) (C1580rY.Xd() ^ (312605787 ^ (-312579687))));
        short sXd = (short) (OY.Xd() ^ (1727124324 ^ 1727128149));
        int[] iArr = new int["LYX\u001aQOeYg[XbYW%\\Zpdrfcmdbcst3zyqpqp~N\u0001\bq\u007f@gu\u0003\u0007|\u000bZ}\u0010\u0006\r\r".length()];
        QB qb = new QB("LYX\u001aQOeYg[XbYW%\\Zpdrfcmdbcst3zyqpqp~N\u0001\bq\u007f@gu\u0003\u0007|\u000bZ}\u0010\u0006\r\r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr = {strYd};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Jg.Wd("\f\u000f8A\u001fIZ{J", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207798467))), (short) (C1580rY.Xd() ^ (1728508033 ^ (-1728489102)))), Class.forName(Xg.qd("A9O;\tH>LF\u000e4VUMSM", (short) (C1633zX.Xd() ^ (681908024 ^ (-681922591))), (short) (C1633zX.Xd() ^ (963029659 ^ (-963018956))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void virtualizationDetectionNonTamperAction() throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (133234409 ^ (-133209032)));
        short sXd2 = (short) (C1633zX.Xd() ^ ((1545415381 ^ 1026706364) ^ (-1630483736)));
        int[] iArr = new int["r^W]\u0016]=gy'\u0018E`;$ Wh swkm`!d\u001a".length()];
        QB qb = new QB("r^W]\u0016]=gy'\u0018E`;$ Wh swkm`!d\u001a");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2)};
        Method declaredMethod = Class.forName(C1626yg.Ud("\u0002PK\u0006Bq@\u007fS:kAqWuKe\nU\bo+xI!JhD=\u001e\u0019tuO\u001d`spfMA+>zB>i9I\u001e\u0003D3H", (short) (ZN.Xd() ^ (FB.Xd() ^ 1609521309)), (short) (ZN.Xd() ^ (OY.Xd() ^ 69956849)))).getDeclaredMethod(EO.Od("\u00192,\reMa\u0006E", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849967969)))), Class.forName(Ig.wd("x$)m_q|\u001f]\u0006'0{CTs", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951469140)))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void virtualizationDetectionNonTamperAction2() throws Throwable {
        Object[] objArr = {C1561oA.Qd("F35'\f?KVXLXNRJ\u0014\u0001NNR|@@N>;K;9", (short) (Od.Xd() ^ (877670676 ^ (-877667430))))};
        Method declaredMethod = Class.forName(C1593ug.zd("ANM\u000fFDZN\\PMWNL\u001aQOeYg[XbYWXhi(onfefesCu|ft5\\jw{q\u007fOr\u0005z\u0002\u0002", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831079975))), (short) (C1607wl.Xd() ^ (OY.Xd() ^ (1522540685 ^ 1592489954))))).getDeclaredMethod(C1561oA.Kd("dYd_Ok^qs", (short) (Od.Xd() ^ (C1580rY.Xd() ^ (1366064793 ^ 1625635986)))), Class.forName(C1561oA.od("WMaK\u0017THTL\u00126VSIME", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (1771502565 ^ (-913950453)))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void virtualizationDetectionTamperAction() throws Throwable {
        String strZd = Wg.Zd("Qr-1N4X\u00140X\u001f%c\f[Qi.VU\u001e>V", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609500517)), (short) (C1607wl.Xd() ^ (FB.Xd() ^ (1020639640 ^ 1664791879))));
        short sXd = (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609498838)));
        int[] iArr = new int["MZY\u001bRPfZh\\YcZX&][qesgdnecdtu4{zrqrq\u007fO\u0002\tr\u0001Ahv\u0004\b}\f[~\u0011\u0007\u000e\u000e".length()];
        QB qb = new QB("MZY\u001bRPfZh\\YcZX&][qesgdnecdtu4{zrqrq\u007fO\u0002\tr\u0001Ahv\u0004\b}\f[~\u0011\u0007\u000e\u000e");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Object[] objArr = {strZd};
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Qg.kd("(\u001b$\u001d\u000b%\u0016''", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134255815))), (short) (FB.Xd() ^ (ZN.Xd() ^ 864686596))), Class.forName(Wg.vd("A7K5\u0001>2>6{ @=37/", (short) (ZN.Xd() ^ ((2138567190 ^ 387639700) ^ 1751976226)))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void virtualizationDetectionTamperAction2() throws Throwable {
        Object[] objArr = {hg.Vd("'\u0014\u0016\bl ,79-9/3+ta%%3# 0 \u001e", (short) (C1499aX.Xd() ^ ((942317957 ^ 2039041144) ^ (-1101261851))), (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ 1134253122)))};
        Method declaredMethod = Class.forName(C1561oA.ud(";FC\u000384H:F83;0,w-)=/;-(0%! .-i/,\"\u001f\u001e\u001b't%*\u0012\u001e\\\u0002\u000e\u0019\u001b\u000f\u001bh\n\u001a\u000e\u0013\u0011", (short) (C1633zX.Xd() ^ ((1185047491 ^ 1630098275) ^ (-663449675))))).getDeclaredMethod(C1561oA.Yd("%\u001a% \u0010,\u001f24", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (1064027726 ^ (-2023128692))))), Class.forName(C1561oA.yd("\u0003x\u0011zJ\b\u007f\f\bMu\u0016\u0017\r\u0015\r", (short) (C1633zX.Xd() ^ (429532994 ^ (-429547560))))));
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
