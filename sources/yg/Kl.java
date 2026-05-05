package yg;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class Kl {
    static Map<String, String> Xd = null;

    static {
        Class<?> cls = Class.forName(Ig.wd("\b&\\_\u001e", (short) (C1580rY.Xd() ^ ((1830568084 ^ 947526963) ^ (-1432750026)))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1215244272 ^ (-2078628477))));
        int[] iArr = new int["\u0004H".length()];
        QB qb = new QB("\u0004H");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            TreeMap treeMap = (TreeMap) declaredMethod.invoke(null, objArr);
            String strQd = C1561oA.Qd("xe+Gg", (short) (FB.Xd() ^ (1584589931 ^ 1584565859)));
            String strZd = C1593ug.zd(";H", (short) (ZN.Xd() ^ ((1466895909 ^ 725417624) ^ 2085858290)), (short) (ZN.Xd() ^ (1562686481 ^ 1562682341)));
            try {
                Class<?> cls2 = Class.forName(strQd);
                Field field = 0 != 0 ? cls2.getField(strZd) : cls2.getDeclaredField(strZd);
                field.setAccessible(true);
                field.set(null, treeMap);
            } catch (Throwable th) {
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Annotation[] GX(Field field) {
        Annotation[] annotations = field.getAnnotations();
        if (field.getAnnotation(InterfaceC1492Gx.class) != null) {
            C1626yg.Qd(Xd(field.toString()), C1561oA.Yd("CBR NOQWEYOVV\\", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (-69952933)))));
            Zd(annotations);
        } else if (!KX()) {
            return GX(field);
        }
        return annotations;
    }

    private static boolean KX() {
        return true;
    }

    public static Annotation Kd(Class cls, Class cls2) {
        Annotation annotation = cls.getAnnotation(cls2);
        if (cls.getAnnotation(InterfaceC1492Gx.class) == null) {
            return !KX() ? Kd(cls, cls2) : annotation;
        }
        Tg.yd(cls.getName(), hg.Vd("\u001f\u001c*u\"!!%\u0011#\u0017\u001c\u001a", (short) (FB.Xd() ^ (Od.Xd() ^ 1207824375)), (short) (FB.Xd() ^ ((743674865 ^ 739927489) ^ 4819685))), cls2);
        return ud(annotation);
    }

    public static void Ud(Annotation[][] annotationArr) {
        for (Annotation[] annotationArr2 : annotationArr) {
            Zd(annotationArr2);
        }
    }

    public static String Xd(String str) {
        return str.split(EO.Od(",", (short) (Od.Xd() ^ ((1178647121 ^ 1447701703) ^ (-269142068)))))[r1.length - 1];
    }

    public static Annotation[] YX(Class cls) {
        Annotation[] annotations = cls.getAnnotations();
        if (cls.getAnnotation(InterfaceC1492Gx.class) != null) {
            C1626yg.Qd(cls.getName(), C1561oA.ud("GDR\u001eJIIM9K?DBF", (short) (Od.Xd() ^ (FB.Xd() ^ (1506643631 ^ (-102943782))))));
            Zd(annotations);
        } else if (!KX()) {
            return YX(cls);
        }
        return annotations;
    }

    public static Annotation[][] ZX(Constructor constructor) {
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (constructor.getAnnotation(InterfaceC1492Gx.class) != null) {
            C1626yg.Qd(Xd(constructor.toString()), C1561oA.od("85C\u001e.>,7.<,8\u00062115!3',*.", (short) (Od.Xd() ^ ((1847681570 ^ 2005152098) ^ (-430248811)))));
            Ud(parameterAnnotations);
        } else if (!KX()) {
            return ZX(constructor);
        }
        return parameterAnnotations;
    }

    public static void Zd(Annotation[] annotationArr) {
        for (int i2 = 0; i2 < annotationArr.length; i2++) {
            annotationArr[i2] = ud(annotationArr[i2]);
        }
    }

    public static Annotation[] cX(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (field.getAnnotation(InterfaceC1492Gx.class) != null) {
            C1626yg.Qd(Xd(field.toString()), ZO.xd("o8WP$NE\u001db)d\"\u001f\u001ed\n\u0010RBN\b2", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (2139039943 ^ 948098136))), (short) (C1607wl.Xd() ^ (1577857174 ^ 1577857810))));
            Zd(declaredAnnotations);
        } else if (!KX()) {
            return cX(field);
        }
        return declaredAnnotations;
    }

    public static Annotation[] kX(Method method) {
        Annotation[] annotations = method.getAnnotations();
        if (method.getAnnotation(InterfaceC1492Gx.class) != null) {
            C1626yg.Qd(Xd(method.toString()), EO.Od("Ao/\u001d\\\u0012po\u0004D=_\n\u0017", (short) (OY.Xd() ^ (FB.Xd() ^ (1593240240 ^ 18461565)))));
            Zd(annotations);
        } else if (!KX()) {
            return kX(method);
        }
        return annotations;
    }

    public static Annotation[][] nX(Method method) {
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (method.getAnnotation(InterfaceC1492Gx.class) != null) {
            C1626yg.Qd(Xd(method.toString()), Wg.Zd("\u0012FkZq:;]\\\u001e&I\u001a~\u0015)4W}\t\u0012Gf", (short) (Od.Xd() ^ (FB.Xd() ^ (-1609525144))), (short) (Od.Xd() ^ (C1607wl.Xd() ^ (1316605470 ^ (-540908387))))));
            Ud(parameterAnnotations);
        } else if (!KX()) {
            return nX(method);
        }
        return parameterAnnotations;
    }

    public static Annotation[] oX(AccessibleObject accessibleObject) {
        Annotation[] annotations = accessibleObject.getAnnotations();
        if (accessibleObject.getAnnotation(InterfaceC1492Gx.class) != null) {
            C1626yg.Qd(Xd(accessibleObject.toString()), C1561oA.Kd("$#3\u0001/028&:077=", (short) (ZN.Xd() ^ (159858970 ^ 159870355))));
            Zd(annotations);
        } else if (!KX()) {
            return oX(accessibleObject);
        }
        return annotations;
    }

    public static Annotation od(AccessibleObject accessibleObject, Class cls) {
        Annotation annotation = accessibleObject.getAnnotation(cls);
        if (accessibleObject.getAnnotation(InterfaceC1492Gx.class) == null) {
            return !KX() ? od(accessibleObject, cls) : annotation;
        }
        Tg.yd(Xd(accessibleObject.toString()), C1561oA.od("WTb.ZYY]I[OTR", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (73073557 ^ (-1780434157))))), cls);
        return ud(annotation);
    }

    public static Annotation[] pX(AccessibleObject accessibleObject) {
        Annotation[] declaredAnnotations = accessibleObject.getDeclaredAnnotations();
        if (accessibleObject.getAnnotation(InterfaceC1492Gx.class) != null) {
            String strXd = Xd(accessibleObject.toString());
            short sXd = (short) (C1607wl.Xd() ^ (C1633zX.Xd() ^ (-1951476486)));
            int[] iArr = new int["A@P!;:D:THH&LMOU+?5<4:".length()];
            QB qb = new QB("A@P!;:D:THH&LMOU+?5<4:");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            C1626yg.Qd(strXd, new String(iArr, 0, i2));
            Zd(declaredAnnotations);
        } else if (!KX()) {
            return pX(accessibleObject);
        }
        return declaredAnnotations;
    }

    public static Annotation qd(Field field, Class cls) {
        Annotation annotation = field.getAnnotation(cls);
        if (field.getAnnotation(InterfaceC1492Gx.class) == null) {
            return !KX() ? qd(field, cls) : annotation;
        }
        Tg.yd(Xd(field.toString()), C1561oA.yd("\"\u001f1|-,04\u0014&\u001e#%", (short) (C1499aX.Xd() ^ ((970968032 ^ 1881632328) ^ (-1241053939)))), cls);
        return ud(annotation);
    }

    public static TreeMap tg() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(C1561oA.Qd("`lanjc]p%WcbbfRdX][\u001a=OYTHIJ;LVI", (short) (C1607wl.Xd() ^ ((1121082400 ^ 2023863136) ^ 980654355))), C1593ug.zd("\u0012\u0001H\u0007\u000e", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609505327)), (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831072481)))));
        treeMap.put(C1561oA.od("9DA\u000182340<;6w;-()9q01%5+#j\u001d)((,\u0018*\u001e#!%^\u0002\u0014\u000f\u0010 w\u0019\r\u001d\u0013\u000b", (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831070562))), C1561oA.Kd("^M\u00155Z", (short) (C1633zX.Xd() ^ ((2008722174 ^ 1316904827) ^ (-969182157)))));
        int iXd = C1607wl.Xd() ^ (1318315053 ^ (-550995497));
        treeMap.put(Wg.Zd("l8geo\u0018[+Y$u/%\u0017k\u0015H7\"'l\u001eS.T\u0018G2\u001f\u0001n\u001cN1O\"h\u001c\\\u000f\u001b|A\u001bN\rJ\u001cJ)", (short) (Od.Xd() ^ ((169238624 ^ 151829671) ^ (-52080428))), (short) (Od.Xd() ^ iXd)), C1561oA.Xd("6%l62", (short) (ZN.Xd() ^ (ZN.Xd() ^ (1371417231 ^ 1647589785)))));
        treeMap.put(Wg.vd("hut6gcfio}~{7|pmXj%mZ_Tb^edr'[ijTZH\\JQQW\u001b@TQL^;^DF\u001eJ@GC", (short) (C1499aX.Xd() ^ (325759536 ^ (-325755433)))), Qg.kd("\u0019\u0006K\u0014\r", (short) (C1580rY.Xd() ^ (970124907 ^ (-970097428))), (short) (C1580rY.Xd() ^ ((2083029644 ^ 1549073207) ^ (-545002787)))));
        treeMap.put(hg.Vd("ali)ahg^bZ\"T`Ub^WQ\u001aRW\\\u0016JURQRP\u000fIMRBNI;E\u0006J7;9C3C34:z\u001f,0.\u0018(8()/##,$k\u007f(\u001c-,", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864712737)), (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207812402))), C1561oA.ud("hU\u001bf\\", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831091128)))));
        treeMap.put(C1561oA.yd("|\n\tJ|\u0006\u0007\u007f}wAu{r\u0002\u007f\u0013\u000fY\u0014\u0013\u001aU\f\u0011\u0010\u0011\u0014\fL\t\u000f. .+\u0017#e,\u0013\u0019\u0019%\u000f!\u0013\u00166x\u001f.,,\u0018*4&)1\u001f!,&\u0007 DAA:", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849982718))), C1561oA.Yd("4#j(&", (short) (FB.Xd() ^ (FB.Xd() ^ 1609518794))));
        String strQd = Xg.qd("u\u0003\u0002C}\u0007\b\u0001\u0007\u0001J\u0003\u0011\u0012\u0010\u0014\u0013\u0016\u0014\u0014\fU\n\u0018\u0019\u001b!\u000f#\u0019  &ax%\u0005'-\u0007*\u001f(", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849980610)), (short) (ZN.Xd() ^ (657779701 ^ 657776636)));
        int iXd2 = C1633zX.Xd() ^ (2013961793 ^ 207341093);
        treeMap.put(strQd, Jg.Wd("RK2i|", (short) (C1633zX.Xd() ^ ((939327698 ^ 1377948460) ^ (-1708979872))), (short) (C1633zX.Xd() ^ iXd2)));
        short sXd = (short) (OY.Xd() ^ (FB.Xd() ^ 1609502526));
        short sXd2 = (short) (OY.Xd() ^ ((862222845 ^ 440343896) ^ 693860219));
        int[] iArr = new int["\u001cNb(E&<\fj\fIL8,C\u0001R*qm\f(<p[>\u0015\u00114=\u0011V)#{hfiP\u0007#>\u0011".length()];
        QB qb = new QB("\u001cNb(E&<\fj\fIL8,C\u0001R*qm\f(<p[>\u0015\u00114=\u0011V)#{hfiP\u0007#>\u0011");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        treeMap.put(new String(iArr, 0, i2), C1626yg.Ud("qIt\n3", (short) (C1607wl.Xd() ^ (Od.Xd() ^ 1207803741)), (short) (C1607wl.Xd() ^ (441342248 ^ 441329556))));
        treeMap.put(Ig.wd("\fb0W~9K\u0002+\u001b_{+D\u0015vLBz)%|I[!s]53r\u00127Z\u000ba(Ff<U\nN!*\nt8k\"@\u0017r\u007fQ\u001a'", (short) (Od.Xd() ^ ((327067578 ^ 97453899) ^ (-380733817)))), EO.Od("%l\u0001t\r", (short) (C1580rY.Xd() ^ ((623106209 ^ 485834942) ^ (-970367440)))));
        String strQd2 = C1561oA.Qd("BMJ\nBIH?C;\u0003;FA?}0<;;?+=1648q\u0016'3) *&6 \u001e\u0007\u0019$\u001b", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609510812))));
        short sXd3 = (short) (Od.Xd() ^ (FB.Xd() ^ (-1609522676)));
        short sXd4 = (short) (Od.Xd() ^ (992039998 ^ (-992025789)));
        int[] iArr2 = new int["\u0007u=\tx".length()];
        QB qb2 = new QB("\u0007u=\tx");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
            i3++;
        }
        treeMap.put(strQd2, new String(iArr2, 0, i3));
        String strOd = C1561oA.od("&1.m2/2\u001d-\u001f.(d-\u001e&\u0018_\b\u0019!\u0013r\u0015\u0010\u0016\r", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864691730)));
        short sXd5 = (short) (C1607wl.Xd() ^ ((267496466 ^ 1175443605) ^ 1241396764));
        int[] iArr3 = new int["C2y'5".length()];
        QB qb3 = new QB("C2y'5");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd5 + sXd5) + i4));
            i4++;
        }
        treeMap.put(strOd, new String(iArr3, 0, i4));
        treeMap.put(Wg.Zd("u\u0017qR\u0005X6?Ox\u0004\u0013#.w\u00100Pyh13NrHeN/g\u0006/Br[\u00182Lh\u0004zW", (short) (FB.Xd() ^ (Od.Xd() ^ 1207800390)), (short) (FB.Xd() ^ (1774349383 ^ 1774328100))), C1561oA.Xd(",\u001bb&(", (short) (ZN.Xd() ^ ((405961121 ^ 1691736973) ^ 2095558551))));
        treeMap.put(Wg.vd("aWoYk Vbmmuaoclj5Y\u0003vwc}", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1007954801 ^ (-2140108931))))), Qg.kd("_L\u0012TS", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ 831078951)), (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1362270132 ^ (-1656270713))))));
        int iXd3 = C1580rY.Xd() ^ (594043090 ^ (-316759401));
        short sXd6 = (short) (OY.Xd() ^ (897712914 ^ 897716061));
        short sXd7 = (short) (OY.Xd() ^ iXd3);
        int[] iArr4 = new int["+!5\u001f5i$(#\u001d\u001a*b\u0002\u0014\u001f\u0016\u0014".length()];
        QB qb4 = new QB("+!5\u001f5i$(#\u001d\u001a*b\u0002\u0014\u001f\u0016\u0014");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4) + sXd7);
            i5++;
        }
        treeMap.put(new String(iArr4, 0, i5), C1561oA.ud(".\u001b`\n\"", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (683408100 ^ 1191151810)))));
        treeMap.put(C1561oA.yd("\n\r\u0011\b\f\u0010Nc{\u0006\u0007x}z\r|r", (short) (C1607wl.Xd() ^ ((1326164388 ^ 771711119) ^ 1660210058))), C1561oA.Yd(":)p\u0019=", (short) (C1607wl.Xd() ^ (584873644 ^ 584845433))));
        short sXd8 = (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (1731150435 ^ 1420118230)));
        short sXd9 = (short) (C1607wl.Xd() ^ ((405658779 ^ 519879986) ^ 114364692));
        int[] iArr5 = new int["+06/-3s\u000b-9<0/.B44$;A7:!FLECI".length()];
        QB qb5 = new QB("+06/-3s\u000b-9<0/.B44$;A7:!FLECI");
        int i6 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i6] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd8 + i6)) + sXd9);
            i6++;
        }
        treeMap.put(new String(iArr5, 0, i6), Jg.Wd("S>rNc", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (343325247 ^ (-2050137079)))), (short) (C1580rY.Xd() ^ (FB.Xd() ^ (1552440499 ^ (-57103545))))));
        String strXd = ZO.xd("f\u0016Ne<\u001700\t&\u00106\u0002\u001d\b", (short) (OY.Xd() ^ ((1605843123 ^ 1949315138) ^ 730287353)), (short) (OY.Xd() ^ (2050217913 ^ 2050212078)));
        int iXd4 = C1580rY.Xd() ^ 831083238;
        short sXd10 = (short) (C1580rY.Xd() ^ (527075695 ^ (-527079178)));
        short sXd11 = (short) (C1580rY.Xd() ^ iXd4);
        int[] iArr6 = new int["_\u001a^+\u0001".length()];
        QB qb6 = new QB("_\u001a^+\u0001");
        int i7 = 0;
        while (qb6.YK()) {
            int iKK6 = qb6.KK();
            Xu xuXd6 = Xu.Xd(iKK6);
            iArr6[i7] = xuXd6.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd10 + sXd10) + (i7 * sXd11))) + xuXd6.CK(iKK6));
            i7++;
        }
        treeMap.put(strXd, new String(iArr6, 0, i7));
        treeMap.put(Ig.wd("4g^6c<\u0018d\u0003()K~s\u001f2r=0\"YD\u0014\u00139t\"`c\u001fz-l\nB\u0001~1k@=\u0011XU", (short) (Od.Xd() ^ (2028942927 ^ (-2028960286)))), EO.Od("/F;\u0019\u0002", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69944457)))));
        treeMap.put(C1561oA.Qd("eg[!UYURYR^Q\\JUL]TVN\u0010DHDAHAM\bGMCBC9FE~AD/9y\u00108<=9+8\u001220\u000f5+*", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (1128260859 ^ 930007881)))), C1593ug.zd("Q@\b'M", (short) (C1607wl.Xd() ^ ((112554067 ^ 1860636685) ^ 1750219660)), (short) (C1607wl.Xd() ^ (1835163562 ^ 1835163496))));
        String strOd2 = C1561oA.od("dfZ TXTQXQ]P[ITK\\SUM\u000fCGC@G@L\u0007FLBAB8ED}@C.8x\u000f7;<8*7\u00111/\u000e4*)\u0005!", (short) (ZN.Xd() ^ (Od.Xd() ^ 1207819506)));
        short sXd12 = (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849968227)));
        int[] iArr7 = new int["\u0018\u0007Nz\n".length()];
        QB qb7 = new QB("\u0018\u0007Nz\n");
        int i8 = 0;
        while (qb7.YK()) {
            int iKK7 = qb7.KK();
            Xu xuXd7 = Xu.Xd(iKK7);
            iArr7[i8] = xuXd7.fK(xuXd7.CK(iKK7) - ((sXd12 + sXd12) + i8));
            i8++;
        }
        treeMap.put(strOd2, new String(iArr7, 0, i8));
        treeMap.put(Wg.Zd("\nFpd_\u001aT\b-\\\u001fP\"F\u007f--Z\u00139A,n!<y)stj\u001fK9p\u001dX\u001e\u0016\u000fHU\u0016\rnG\u0001:cZ\u0003FN5q\u0007cw-", (short) (ZN.Xd() ^ (ZN.Xd() ^ (1705439028 ^ 1445761756))), (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849971176))), C1561oA.Xd("q`(Om", (short) (Od.Xd() ^ (1316032385 ^ (-1316059132)))));
        short sXd13 = (short) (FB.Xd() ^ (OY.Xd() ^ 69936748));
        int[] iArr8 = new int["48.u,20/(#1&3#0)LEIC\u0007@M=:3F?C=\u0001EZGS\u0016-OQMRJS&PT".length()];
        QB qb8 = new QB("48.u,20/(#1&3#0)LEIC\u0007@M=:3F?C=\u0001EZGS\u0016-OQMRJS&PT");
        int i9 = 0;
        while (qb8.YK()) {
            int iKK8 = qb8.KK();
            Xu xuXd8 = Xu.Xd(iKK8);
            iArr8[i9] = xuXd8.fK((sXd13 ^ i9) + xuXd8.CK(iKK8));
            i9++;
        }
        treeMap.put(new String(iArr8, 0, i9), Qg.kd("\tu;M\u0004", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (1271430117 ^ 1067013133))), (short) (C1499aX.Xd() ^ (1573982777 ^ (-1573980183)))));
        treeMap.put(hg.Vd("@B6{040-4-9,7%0'8/1)j\"-\u001b&\u001d.%'\u001f`#&\u0011\u001b[}!\f\u0016\u0012\u000e\u0010\u000b\u0017d\u0015\t\u0016\r\u0004\f\u0011", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849964896))), (short) (C1499aX.Xd() ^ ((472317495 ^ 1680952084) ^ (-2014819082)))), C1561oA.ud("M:\u007f7A", (short) (C1633zX.Xd() ^ ((983086949 ^ 1724314797) ^ (-1549678198)))));
        treeMap.put(C1561oA.yd("HLB\n8><;LGUJO?LE@9=7r,9)>7JC?9|A.\u001b'i\u0006+\u0018$*(,)/\u0004.2t\u0013\u001f\u0011\u0017\u0007\u0013\u001b", (short) (OY.Xd() ^ (FB.Xd() ^ 1609528815))), C1561oA.Yd("J9\u0001&F", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (661636031 ^ (-1227617276))))));
        treeMap.put(Xg.qd("VJZYWOS_\u001e\u001bVcda :9I", (short) (Od.Xd() ^ (C1580rY.Xd() ^ (2030071250 ^ 1216942294))), (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831087662))), Jg.Wd("krB2\u0017", (short) (ZN.Xd() ^ (1765365483 ^ 1765363391)), (short) (ZN.Xd() ^ (1067163640 ^ 1067186722))));
        String strXd2 = ZO.xd("MMbkm,$j\tvktGgR*6R1\u000e5", (short) (Od.Xd() ^ (C1633zX.Xd() ^ (1477119740 ^ 744112951))), (short) (Od.Xd() ^ (C1580rY.Xd() ^ (1810880886 ^ 1516697342))));
        int iXd5 = C1580rY.Xd() ^ 831082081;
        treeMap.put(strXd2, C1626yg.Ud("OENqn", (short) (C1633zX.Xd() ^ (1810290227 ^ (-1810298243))), (short) (C1633zX.Xd() ^ iXd5)));
        treeMap.put(Ig.wd("E\u0014rJUw)QL*hT\u0002ui_$(p{F\u0011", (short) (FB.Xd() ^ (480592021 ^ 480581369))), EO.Od(".Dx\u0004z", (short) (C1580rY.Xd() ^ ((378688929 ^ 323701432) ^ (-98113992)))));
        String strQd3 = C1561oA.Qd("0\"0-)\u001f!+gb\u001c'&!]~|\u007f\u007f", (short) (C1499aX.Xd() ^ (2073024393 ^ (-2073019442))));
        short sXd14 = (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951473085));
        short sXd15 = (short) (Od.Xd() ^ (1307539437 ^ (-1307519885)));
        int[] iArr9 = new int["|k3Ox".length()];
        QB qb9 = new QB("|k3Ox");
        int i10 = 0;
        while (qb9.YK()) {
            int iKK9 = qb9.KK();
            Xu xuXd9 = Xu.Xd(iKK9);
            iArr9[i10] = xuXd9.fK((xuXd9.CK(iKK9) - (sXd14 + i10)) - sXd15);
            i10++;
        }
        treeMap.put(strQd3, new String(iArr9, 0, i10));
        short sXd16 = (short) (Od.Xd() ^ ((1345649046 ^ 756119019) ^ (-2099629345)));
        int[] iArr10 = new int["WIWTPFHR\u000f\nCNMH\u0005&6FG".length()];
        QB qb10 = new QB("WIWTPFHR\u000f\nCNMH\u0005&6FG");
        int i11 = 0;
        while (qb10.YK()) {
            int iKK10 = qb10.KK();
            Xu xuXd10 = Xu.Xd(iKK10);
            iArr10[i11] = xuXd10.fK(sXd16 + sXd16 + i11 + xuXd10.CK(iKK10));
            i11++;
        }
        treeMap.put(new String(iArr10, 0, i11), C1561oA.Kd("(\u0017^\u0014$", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207822480)))));
        treeMap.put(Wg.Zd("fHE\u0010h,tk\u0006O\u0017nD-6%\u0014rK", (short) (C1499aX.Xd() ^ (937926338 ^ (-937922663))), (short) (C1499aX.Xd() ^ ((878470236 ^ 808134113) ^ (-74930421)))), C1561oA.Xd("\u0001o7X|", (short) (C1580rY.Xd() ^ (Od.Xd() ^ (902778549 ^ (-1915916601))))));
        return treeMap;
    }

    public static Annotation ud(Annotation annotation) {
        Object obj;
        if (annotation == null) {
            return null;
        }
        String name = annotation.annotationType().getName();
        String strVd = Wg.vd("M", (short) (C1499aX.Xd() ^ ((1098487484 ^ 1526979490) ^ (-444223106))));
        short sXd = (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831068115));
        short sXd2 = (short) (Od.Xd() ^ (1568381182 ^ (-1568403247)));
        int[] iArr = new int["(".length()];
        QB qb = new QB("(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        String strReplace = name.replace(strVd, new String(iArr, 0, i2));
        short sXd3 = (short) (OY.Xd() ^ (C1580rY.Xd() ^ (123286425 ^ (-919610709))));
        short sXd4 = (short) (OY.Xd() ^ ((689558506 ^ 1806858688) ^ 1118537740));
        int[] iArr2 = new int["\u0006r8Tt".length()];
        QB qb2 = new QB("\u0006r8Tt");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
            i3++;
        }
        String str = new String(iArr2, 0, i3);
        String strUd = C1561oA.ud("\u0005\u0010", (short) (ZN.Xd() ^ ((496599506 ^ 1205511523) ^ 1514341462)));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strUd) : cls.getDeclaredField(strUd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        String str2 = (String) ((Map) obj).get(strReplace);
        if (str2 == null) {
            return annotation;
        }
        try {
            try {
                return (Annotation) Class.forName(str2).getDeclaredConstructors()[0].newInstance(annotation);
            } catch (Exception e2) {
                return annotation;
            }
        } catch (ClassNotFoundException e3) {
            return annotation;
        }
    }

    public static Annotation zd(Method method, Class cls) {
        Annotation annotation = method.getAnnotation(cls);
        if (method.getAnnotation(InterfaceC1492Gx.class) == null) {
            return !KX() ? zd(method, cls) : annotation;
        }
        Tg.yd(Xd(method.toString()), Ig.wd("B\ff)L\u0018;M\u0014|iW(", (short) (Od.Xd() ^ (ZN.Xd() ^ (1977634772 ^ (-1181363428))))), cls);
        return ud(annotation);
    }
}
