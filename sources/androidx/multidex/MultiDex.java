package androidx.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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

/* JADX INFO: loaded from: classes4.dex */
public final class MultiDex {
    private static final String CODE_CACHE_NAME = "code_cache";
    private static final String CODE_CACHE_SECONDARY_FOLDER_NAME = "secondary-dexes";
    private static final int MAX_SUPPORTED_SDK_VERSION = 20;
    private static final int MIN_SDK_VERSION = 4;
    private static final String NO_KEY_PREFIX = "";
    private static final String OLD_SECONDARY_FOLDER_NAME = "secondary-dexes";
    static final String TAG = "MultiDex";
    private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
    private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;
    private static final Set<File> installedApk = new HashSet();
    private static final boolean IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty("java.vm.version"));

    private MultiDex() {
    }

    public static void install(Context context) throws Throwable {
        Object obj;
        Object obj2;
        Jg.Wd("0nyfi>d<H,i\u0006;\u0007\u0019\u007f\u007f\u0019\u0013\u0012}\u0017", (short) (FB.Xd() ^ 19245), (short) (FB.Xd() ^ 7676));
        ZO.xd("vb\u0018[IYH,", (short) (C1633zX.Xd() ^ (-21263)), (short) (C1633zX.Xd() ^ (-4626)));
        if (IS_VM_MULTIDEX_CAPABLE) {
            C1626yg.Ud("npU\u001c\u0006c5\u0003TX\tu\\_8fiqUR[\u0001#\f\u001ax\u0001r\t~\u0014wL<ofOU\u0012\r)z\u007fl\u0001\t\u007fA\u007fTx}aNL\n\u0018Q.wl\u000b", (short) (C1607wl.Xd() ^ 21045), (short) (C1607wl.Xd() ^ 6486));
            return;
        }
        try {
            ApplicationInfo applicationInfo = getApplicationInfo(context);
            if (applicationInfo == null) {
                Ig.wd("J\u0014686Y9&U\u0003\u0014/bcZ%D[C\u001dw\u001eP[Q~&zOp^H\u0014\u0002Ld\u0001\u0016\t\u001a\u001bsUCG\u0011\f\u001b=\u000e\u000b?\u0007QO\u001e&x]_\u0015dYsBBx+\"7\u0003\u0001#Hp\u007f\u001dG\u0005qV\u0018DMIXxX7[\u0001{Ls%ME\u001fB", (short) (C1633zX.Xd() ^ (-15248)));
                return;
            }
            String strOd = EO.Od("S15^;bEv\u000bwp\\\u0018\u001f\u0001\u001d,#,[I\u001e\b\u0001Y\u0017\t22\u007fBJ\"\u0006", (short) (C1607wl.Xd() ^ 1670));
            short sXd = (short) (Od.Xd() ^ (-18166));
            int[] iArr = new int["D?D@01\u000f3;".length()];
            QB qb = new QB("D?D@01\u000f3;");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strOd);
                Field field = 1 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            File file = new File((String) obj);
            String strZd = C1593ug.zd("\u0005\u0013\n\u0019\u0017\u0012\u000eX\u000f\u001c\u001c#\u0015\u001f&`$\"cw()&$\u001f\u001e2(//\u000b1*4", (short) (Od.Xd() ^ (-24846)), (short) (Od.Xd() ^ (-11635)));
            String strOd2 = C1561oA.od("^ZlX:^f", (short) (FB.Xd() ^ 23466));
            try {
                Class<?> cls2 = Class.forName(strZd);
                Field field2 = 1 != 0 ? cls2.getField(strOd2) : cls2.getDeclaredField(strOd2);
                field2.setAccessible(true);
                obj2 = field2.get(applicationInfo);
            } catch (Throwable th2) {
                obj2 = null;
            }
            doInstallation(context, file, new File((String) obj2), C1561oA.Kd("xkjwwnl~\u0007;su\nw\u0007", (short) (ZN.Xd() ^ 23176)), "", true);
            Wg.Zd("13e\u0003|$Q!r\u001aF9", (short) (C1499aX.Xd() ^ (-32540)), (short) (C1499aX.Xd() ^ (-18520)));
        } catch (Exception e2) {
            C1561oA.Xd("OxpyoKm\u0002*tz\u0001\u0003p|}s\b}\u0005\u00057~z\u0004\b\u0012\u0010\u0004", (short) (FB.Xd() ^ 21044));
            throw new RuntimeException(Wg.vd("k\u0013\t\u0010\u0004]}\u00106~\u0003\u0007\u0007r|{\u0010\"\u0016\u001b\u0019I\u000f\t\u0010\u0012\n\bBI", (short) (C1607wl.Xd() ^ 31690)) + e2.getMessage() + Qg.kd("\u0004\b", (short) (Od.Xd() ^ (-24375)), (short) (Od.Xd() ^ (-3901))));
        }
    }

    public static void installInstrumentation(Context context, Context context2) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        hg.Vd("c\b\f\fw\u0002\u0001|\u0001x0x|\u0001\u0001}\u007fvmuzfxlqo", (short) (FB.Xd() ^ 30834), (short) (FB.Xd() ^ 21939));
        short sXd = (short) (FB.Xd() ^ 18027);
        int[] iArr = new int["\"I?F:\u00144F".length()];
        QB qb = new QB("\"I?F:\u00144F");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        new String(iArr, 0, i2);
        if (IS_VM_MULTIDEX_CAPABLE) {
            C1561oA.yd("\u0016\f]%\u001d.Y&=3:.((:`CD>=;=>tw$KAH<\u00166\u0018>\u0011\u0012\f\u000b\t\u000b\u001cF\u0012\u000e\u0006\u0015\u0003\u0013)N\u0017 K\u000f\u0013\u001c\u0019\u0019\"\u001a\u0018`", (short) (FB.Xd() ^ 25364));
            return;
        }
        try {
            ApplicationInfo applicationInfo = getApplicationInfo(context);
            if (applicationInfo == null) {
                C1561oA.Yd("Eg\u0019;kligbaukrrNtmw)k\u0002mvzpr}w3z\u0005\t7\u0002\b\u000e\u0010\u000f\u0013\f\u0005\u000f\u0016\u0004\u0018\u000e\u0015\u0015SH\u0013X\u0011ZM!%\u001f \u001c\"\u001cU&&X\u001bZ0\"13_\u0004118*>;\u0002h\u0017@8A7\u00135IqFIEFFJMyGE?P@RZ\u0002LW\u0005JP[JLWQQ\u001c", (short) (C1607wl.Xd() ^ 5546));
                return;
            }
            ApplicationInfo applicationInfo2 = getApplicationInfo(context2);
            if (applicationInfo2 == null) {
                Xg.qd("Ac\u00157ghec^]qgnnJpis%g}irvlnys;0z@xB5\t\r\u0007\b\u0004\n\u0004=\u000e\u000e@\u0003B\u0018\n\u0019\u001bGk\u0019\u0019 \u0012&#iP~( )\u001fz\u001d1Y.1-..25a/-'8(:Bi4?l28C24?99\u0004", (short) (OY.Xd() ^ 13739), (short) (OY.Xd() ^ 29119));
                return;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[0];
            Method method = Class.forName(Jg.Wd("\u0007_g\u0002QWdzBZ,=F\u001a4wa\u0018+{\u0001\u001em", (short) (Od.Xd() ^ (-7146)), (short) (Od.Xd() ^ (-24849)))).getMethod(ZO.xd("tVP\tE_Z*(Z]bzR", (short) (C1580rY.Xd() ^ (-30040)), (short) (C1580rY.Xd() ^ (-29303))), new Class[0]);
            try {
                method.setAccessible(true);
                String string = sb.append((String) method.invoke(context, objArr)).append(C1626yg.Ud("N", (short) (C1580rY.Xd() ^ (-2007)), (short) (C1580rY.Xd() ^ (-18947)))).toString();
                String strWd = Ig.wd("o$X\u0007\u001cpGik\u0004-\r.Ek\u007f|wp,\u0018<\u0012\u0013\nk]%p^\u0015\u0013zb", (short) (C1580rY.Xd() ^ (-12169)));
                String strOd = EO.Od("1\u0001a/1\u00130", (short) (C1607wl.Xd() ^ 25650));
                try {
                    Class<?> cls = Class.forName(strWd);
                    Field field = 1 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo2);
                } catch (Throwable th) {
                    obj = null;
                }
                File file = new File((String) obj);
                String strQd = C1561oA.Qd("\\h]jf_Y\"Va_dT\\a\u001a[W\u0017)WVQMFCUINL&JAI", (short) (C1633zX.Xd() ^ (-26792)));
                String strZd = C1593ug.zd("GDKI;>\u001eDN", (short) (FB.Xd() ^ 8559), (short) (FB.Xd() ^ 5718));
                try {
                    Class<?> cls2 = Class.forName(strQd);
                    Field field2 = 1 != 0 ? cls2.getField(strZd) : cls2.getDeclaredField(strZd);
                    field2.setAccessible(true);
                    obj2 = field2.get(applicationInfo);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                File file2 = new File((String) obj2);
                StringBuilder sbAppend = new StringBuilder().append(string);
                short sXd2 = (short) (C1499aX.Xd() ^ (-28841));
                int[] iArr2 = new int["\u001e\u000f\f\u0017\u0015\n\u0006\u0016\u001cN\u0005\u0005\u0017\u0003\u0010".length()];
                QB qb2 = new QB("\u001e\u000f\f\u0017\u0015\n\u0006\u0016\u001cN\u0005\u0005\u0017\u0003\u0010");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                doInstallation(context2, file2, file, sbAppend.append(new String(iArr2, 0, i3)).toString(), string, false);
                String strKd = C1561oA.Kd("\u000f\u001d\u0014#!\u001c\u0018b\u0019&&-\u001f)0j.,m\u0002230.)(<299\u0015;4>", (short) (FB.Xd() ^ 25224));
                short sXd3 = (short) (OY.Xd() ^ 22393);
                short sXd4 = (short) (OY.Xd() ^ 15837);
                int[] iArr3 = new int["\"t\u000ea\u0006\u001dN+E".length()];
                QB qb3 = new QB("\"t\u000ea\u0006\u001dN+E");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(((i4 * sXd4) ^ sXd3) + xuXd3.CK(iKK3));
                    i4++;
                }
                String str = new String(iArr3, 0, i4);
                try {
                    Class<?> cls3 = Class.forName(strKd);
                    Field field3 = 1 != 0 ? cls3.getField(str) : cls3.getDeclaredField(str);
                    field3.setAccessible(true);
                    obj3 = field3.get(applicationInfo2);
                } catch (Throwable th3) {
                    obj3 = null;
                }
                doInstallation(context2, new File((String) obj3), file, C1561oA.Xd("*\u001d\u001c)) \u001e08l%';)8", (short) (C1633zX.Xd() ^ (-24730))), "", false);
                Wg.vd("Kqwy_klbndkk\u0016[ggW", (short) (OY.Xd() ^ 25675));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            Qg.kd("\u00107-4(\u0002\"4Z#'++\u0017! \u0014&\u001a\u001f\u001dM\u0013\r\u0014\u0016\u001e\u001a\f", (short) (C1633zX.Xd() ^ (-11822)), (short) (C1633zX.Xd() ^ (-4529)));
            throw new RuntimeException(hg.Vd("[\u0003x\u007fsMm\u007f&nrvvblk_qejh\u0019^X_aYW\u0012\u0019", (short) (C1580rY.Xd() ^ (-4873)), (short) (C1580rY.Xd() ^ (-25845))) + e3.getMessage() + C1561oA.ud("'+", (short) (C1580rY.Xd() ^ (-715))));
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void doInstallation(Context context, File file, File file2, String str, String str2, boolean z2) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Set<File> set = installedApk;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            String str3 = "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"";
            ClassLoader dexClassloader = getDexClassloader(context);
            if (dexClassloader == null) {
                return;
            }
            try {
                clearOldDexDir(context);
            } catch (Throwable th) {
            }
            File dexDir = getDexDir(context, file2, str);
            MultiDexExtractor multiDexExtractor = new MultiDexExtractor(file, dexDir);
            try {
                try {
                    installSecondaryDexes(dexClassloader, dexDir, multiDexExtractor.load(context, str2, false));
                } catch (IOException e2) {
                    if (!z2) {
                        throw e2;
                    }
                    installSecondaryDexes(dexClassloader, dexDir, multiDexExtractor.load(context, str2, true));
                }
                try {
                    multiDexExtractor.close();
                    e = null;
                } catch (IOException e3) {
                    e = e3;
                }
                if (e != null) {
                    throw e;
                }
            } catch (Throwable th2) {
                try {
                    multiDexExtractor.close();
                } catch (IOException unused) {
                }
                throw th2;
            }
        }
    }

    private static ClassLoader getDexClassloader(Context context) throws Throwable {
        C1561oA.Xd("o\u0019\u0011\u001a\u0010k\u000e\"", (short) (Od.Xd() ^ (-22404)));
        short sXd = (short) (Od.Xd() ^ (-12900));
        int[] iArr = new int["cqdsmh`+mzv}kux35b^eSg`".length()];
        QB qb = new QB("cqdsmh`+mzv}kux35b^eSg`");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd2 = (short) (Od.Xd() ^ (-25778));
            short sXd3 = (short) (Od.Xd() ^ (-16311));
            int[] iArr2 = new int["sp~LthyxPrceeq".length()];
            QB qb2 = new QB("sp~LthyxPrceeq");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                ClassLoader classLoader = (ClassLoader) method.invoke(context, objArr);
                if (classLoader instanceof BaseDexClassLoader) {
                    return classLoader;
                }
                hg.Vd(">igl\\ni\u0014V^Rcb\u000eY[LNNZ\u0007OX\u0004QWML~MO{IIMw;;M\u000163A11:2yj\u0017>;;e')b46.-'+#Z#'W+\u001b((R\u001f \u0014\u0014[L~\u0016\u0013\u0019G\u0017\u0007\u0019\u0007\u000b\u000b\u000f\u0007L", (short) (OY.Xd() ^ 30629), (short) (OY.Xd() ^ 2396));
                return null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (RuntimeException e3) {
            C1561oA.ud("\u001829;C?1jA113+d85;*.&]1+Z)\u001b,\u0018\u001f#Su!\u001f$\u0014&!K\u000e\u0016\n\u001b\u001aE\u0011\u0013\u0004\u0006\u0006\u0012L=i\u0011\u000e\u000e8y{5\u0007\t\u0001\u007fy}u-uy*}mzz%qrff.\u001fQhek\u001aiYkY]]aY\u001f", (short) (OY.Xd() ^ 21277));
            return null;
        }
    }

    private static ApplicationInfo getApplicationInfo(Context context) throws Throwable {
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("{\n\u0001\u0010\u000e\t\u0005O\u0006\u0013\u0013\u001a\f\u0016\u001dWm\u001b\u001b\"\u0014(%", (short) (FB.Xd() ^ 6001), (short) (FB.Xd() ^ 11986))).getMethod(C1561oA.od("\u0010\r\u001bf\u0015\u0014\u000f\u000b\u0004\u0001\u0013\u0007\f\nc\b~\u0007", (short) (C1499aX.Xd() ^ (-1080))), new Class[0]);
            try {
                method.setAccessible(true);
                return (ApplicationInfo) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (RuntimeException e3) {
            C1561oA.Kd("'PHQG#EY", (short) (Od.Xd() ^ (-18448)));
            short sXd = (short) (OY.Xd() ^ 24224);
            short sXd2 = (short) (OY.Xd() ^ 20729);
            int[] iArr = new int["Pk//xq\"[\u007fl--b\u001d/([K\f\u0003zK\u00042O>\u0010z>C2U22jd\u001e\u0018g[/*Eg\u001b$\u0011R\f\nCrU|9>|\rH~,`F?n\u001a\u0018\u0018\u0011_ \u0018f]\"\u0018\u000bT\u0017CF7\u0001}h2qf5y+b64x$\"\u0013`L\u0011\u000eQI]".length()];
            QB qb = new QB("Pk//xq\"[\u007fl--b\u001d/([K\f\u0003zK\u00042O>\u0010z>C2U22jd\u001e\u0018g[/*Eg\u001b$\u0011R\f\nCrU|9>|\rH~,`F?n\u001a\u0018\u0018\u0011_ \u0018f]\"\u0018\u000bT\u0017CF7\u0001}h2qf5y+b64x$\"\u0013`L\u0011\u000eQI]");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            new String(iArr, 0, i2);
            return null;
        }
    }

    static boolean isVMMultidexCapable(String str) {
        boolean z2 = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (strNextToken != null && strNextToken2 != null) {
                try {
                    int i2 = Integer.parseInt(strNextToken);
                    int i3 = Integer.parseInt(strNextToken2);
                    if (i2 > 2 || (i2 == 2 && i3 >= 1)) {
                        z2 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        String str2 = "VM with version " + str + (z2 ? " has multidex support" : " does not have multidex support");
        return z2;
    }

    private static void installSecondaryDexes(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (list.isEmpty()) {
            return;
        }
        V19.install(classLoader, list, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field findField(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method findMethod(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void expandFieldArray(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field fieldFindField = findField(obj, str);
        Object[] objArr2 = (Object[]) fieldFindField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldFindField.set(obj, objArr3);
    }

    private static void clearOldDexDir(Context context) throws Exception {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("\u0006\u0014\u0007\u0016\u0018\u0013\u000bU\u007f\r\t\u0010\u0006\u0010\u0013MW\u0005\u0001\b}\u0012\u000b", (short) (C1580rY.Xd() ^ (-28284)))).getMethod(Qg.kd("+(6\u0007)+#0\u007f$,", (short) (Od.Xd() ^ (-11165)), (short) (Od.Xd() ^ (-28911))), new Class[0]);
        try {
            method.setAccessible(true);
            File file = new File((File) method.invoke(context, objArr), hg.Vd("E63><1-=Cu,,>*7", (short) (C1633zX.Xd() ^ (-23739)), (short) (C1633zX.Xd() ^ (-1629))));
            if (file.isDirectory()) {
                short sXd = (short) (C1633zX.Xd() ^ (-29819));
                int[] iArr = new int["T|to\u007fuyq)wsj%whepnc_ou\u001b^^p\u0017Z^f\u0013\u001a".length()];
                QB qb = new QB("T|to\u007fuyq)wsj%whepnc_ou\u001b^^p\u0017Z^f\u0013\u001a");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                StringBuilder sbAppend = new StringBuilder(new String(iArr, 0, i2)).append(file.getPath());
                String strYd = C1561oA.yd("\u0013\u0019", (short) (C1580rY.Xd() ^ (-21059)));
                sbAppend.append(strYd).toString();
                C1561oA.Yd("z$\u001c%\u001bv\u0019-", (short) (FB.Xd() ^ 5285));
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    String str = Xg.qd("{\u0018!%\u001f\u001f[1-^,*57c8+*77.,>Fm35Iq7=Gu:GGN@JQ}\u0007", (short) (OY.Xd() ^ 9495), (short) (OY.Xd() ^ 19826)) + file.getPath() + strYd;
                    return;
                }
                for (File file2 : fileArrListFiles) {
                    String str2 = Jg.Wd("(\u0005^\u001c\fPK\u000eSS\u0007E\u0017\u007fa\u001c1P e\b\rcU\u0018\u001d", (short) (OY.Xd() ^ 11237), (short) (OY.Xd() ^ 18397)) + file2.getPath() + ZO.xd("a'}\"\t\u0018^8m", (short) (Od.Xd() ^ (-7291)), (short) (Od.Xd() ^ (-1738))) + file2.length();
                    if (!file2.delete()) {
                        short sXd2 = (short) (C1607wl.Xd() ^ 1662);
                        short sXd3 = (short) (C1607wl.Xd() ^ 10370);
                        int[] iArr2 = new int["'$\u007fY}#\"y\u00115!7?|?Nb\u007f\u0015\u0012S\t\u0004gKG".length()];
                        QB qb2 = new QB("'$\u007fY}#\"y\u00115!7?|?Nb\u007f\u0015\u0012S\t\u0004gKG");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i3 * sXd3))) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        String str3 = new String(iArr2, 0, i3) + file2.getPath();
                    } else {
                        String str4 = Ig.wd("$\u0015.?W\u000bmq\u0016\u0013\tj}\u0003\u001212", (short) (FB.Xd() ^ 1720)) + file2.getPath();
                    }
                }
                if (!file.delete()) {
                    String str5 = EO.Od("+x3Q:\u0007\u0012V|\\\u001fBxk#1!\u0003\u001c\u0006Ms<5!\u0018!.|\u0003\n-\u001a\u0002\u000f", (short) (C1499aX.Xd() ^ (-7239))) + file.getPath();
                    return;
                }
                short sXd4 = (short) (C1607wl.Xd() ^ 26797);
                int[] iArr3 = new int["t\u0015\u001b\u0013!\u0011\u000fI\u0018\u0014\u000bE\u0018\t\u0006\u0011\u000f\u0004\u007f\u0010\u0016;~~\u00117z~\u00073".length()];
                QB qb3 = new QB("t\u0015\u001b\u0013!\u0011\u000fI\u0018\u0014\u000bE\u0018\t\u0006\u0011\u000f\u0004\u007f\u0010\u0016;~~\u00117z~\u00073");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                String str6 = new String(iArr3, 0, i4) + file.getPath();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static File getDexDir(Context context, File file, String str) throws Throwable {
        String strYd = C1561oA.yd("ALDDADEFNJ", (short) (C1580rY.Xd() ^ (-10752)));
        File file2 = new File(file, strYd);
        try {
            mkdirChecked(file2);
        } catch (IOException unused) {
            Class<?> cls = Class.forName(C1561oA.Yd("0>5DB=9\u0004:GGN@JQ\f\"OOVH\\Y", (short) (C1607wl.Xd() ^ 26747)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1499aX.Xd() ^ (-19916));
            short sXd2 = (short) (C1499aX.Xd() ^ (-11869));
            int[] iArr = new int["32B\u00159=7F\u0018>H".length()];
            QB qb = new QB("32B\u00159=7F\u0018>H");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                file2 = new File((File) method.invoke(context, objArr), strYd);
                mkdirChecked(file2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        File file3 = new File(file2, str);
        mkdirChecked(file3);
        return file3;
    }

    private static void mkdirChecked(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                String str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
            } else {
                String str2 = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }

    private static final class V19 {
        private V19() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, IllegalArgumentException, InvocationTargetException {
            IOException[] iOExceptionArr;
            Object obj = MultiDex.findField(classLoader, "pathList").get(classLoader);
            ArrayList<IOException> arrayList = new ArrayList();
            MultiDex.expandFieldArray(obj, "dexElements", makeDexElements(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                for (IOException iOException : arrayList) {
                }
                Field fieldFindField = MultiDex.findField(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) fieldFindField.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    iOExceptionArr = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr, arrayList.size(), iOExceptionArr2.length);
                }
                fieldFindField.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        private static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return (Object[]) MultiDex.findMethod(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    private static final class V14 {
        private static final int EXTRACTED_SUFFIX_LENGTH = ".zip".length();
        private final ElementConstructor elementConstructor;

        private interface ElementConstructor {
            Object newInstance(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException;
        }

        private static class ICSElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            ICSElementConstructor(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public Object newInstance(File file, DexFile dexFile) throws Throwable {
                Constructor<?> constructor = this.elementConstructor;
                Object[] objArr = {file};
                Constructor<?> constructor2 = Class.forName(ZO.xd("[e>\u0004\u0019xs.\u000f\u0005b4(G\u001f2M\u0016:)h", (short) (C1633zX.Xd() ^ (-23366)), (short) (C1633zX.Xd() ^ (-21116)))).getConstructor(Class.forName(C1626yg.Ud("Ol(D*>)(/\u001ep\u0002", (short) (C1607wl.Xd() ^ 20043), (short) (C1607wl.Xd() ^ 16266))));
                try {
                    constructor2.setAccessible(true);
                    return constructor.newInstance(file, (ZipFile) constructor2.newInstance(objArr), dexFile);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }

        private static class JBMR11ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            JBMR11ElementConstructor(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public Object newInstance(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                return this.elementConstructor.newInstance(file, file, dexFile);
            }
        }

        private static class JBMR2ElementConstructor implements ElementConstructor {
            private final Constructor<?> elementConstructor;

            JBMR2ElementConstructor(Class<?> cls) throws NoSuchMethodException, SecurityException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.elementConstructor = constructor;
                constructor.setAccessible(true);
            }

            @Override // androidx.multidex.MultiDex.V14.ElementConstructor
            public Object newInstance(File file, DexFile dexFile) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                return this.elementConstructor.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        static void install(ClassLoader classLoader, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            Object obj = MultiDex.findField(classLoader, "pathList").get(classLoader);
            Object[] objArrMakeDexElements = new V14().makeDexElements(list);
            try {
                MultiDex.expandFieldArray(obj, "dexElements", objArrMakeDexElements);
            } catch (NoSuchFieldException e2) {
                MultiDex.expandFieldArray(obj, "pathElements", objArrMakeDexElements);
            }
        }

        private V14() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            ElementConstructor jBMR2ElementConstructor;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    jBMR2ElementConstructor = new ICSElementConstructor(cls);
                } catch (NoSuchMethodException unused) {
                    jBMR2ElementConstructor = new JBMR2ElementConstructor(cls);
                }
            } catch (NoSuchMethodException unused2) {
                jBMR2ElementConstructor = new JBMR11ElementConstructor(cls);
            }
            this.elementConstructor = jBMR2ElementConstructor;
        }

        private Object[] makeDexElements(List<? extends File> list) throws IllegalAccessException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                File file = list.get(i2);
                objArr[i2] = this.elementConstructor.newInstance(file, DexFile.loadDex(file.getPath(), optimizedPathFor(file), 0));
            }
            return objArr;
        }

        private static String optimizedPathFor(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - EXTRACTED_SUFFIX_LENGTH) + ".dex").getPath();
        }
    }

    private static final class V4 {
        private V4() {
        }

        static void install(ClassLoader classLoader, List<? extends File> list) throws Throwable {
            int size = list.size();
            Field fieldFindField = MultiDex.findField(classLoader, Ig.wd("\u000e5:\u0006", (short) (C1633zX.Xd() ^ (-13773))));
            StringBuilder sb = new StringBuilder((String) fieldFindField.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                sb.append(AbstractJsonLexerKt.COLON).append(absolutePath);
                int iPreviousIndex = listIterator.previousIndex();
                strArr[iPreviousIndex] = absolutePath;
                fileArr[iPreviousIndex] = next;
                short sXd = (short) (ZN.Xd() ^ 25593);
                int[] iArr = new int["a'\u0010Trw\u0015+i\u0019e4j4f\u0015a30\rA".length()];
                QB qb = new QB("a'\u0010Trw\u0015+i\u0019e4j4f\u0015a30\rA");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[1];
                short sXd2 = (short) (C1633zX.Xd() ^ (-8168));
                int[] iArr2 = new int["\u0005z\u000fxD~\u0004AXz|t".length()];
                QB qb2 = new QB("\u0005z\u000fxD~\u0004AXz|t");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr = {next};
                Constructor<?> constructor = cls.getConstructor(clsArr);
                try {
                    constructor.setAccessible(true);
                    zipFileArr[iPreviousIndex] = (ZipFile) constructor.newInstance(objArr);
                    dexFileArr[iPreviousIndex] = DexFile.loadDex(absolutePath, absolutePath + C1593ug.zd("\rDFZ", (short) (Od.Xd() ^ (-19661)), (short) (Od.Xd() ^ (-6505))), 0);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            fieldFindField.set(classLoader, sb.toString());
            short sXd3 = (short) (C1607wl.Xd() ^ 5970);
            int[] iArr3 = new int["K-=OBL".length()];
            QB qb3 = new QB("K-=OBL");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
                i4++;
            }
            MultiDex.expandFieldArray(classLoader, new String(iArr3, 0, i4), strArr);
            MultiDex.expandFieldArray(classLoader, C1561oA.Kd("\u0019r\u0017\u001b\u0015$", (short) (FB.Xd() ^ 10486)), fileArr);
            short sXd4 = (short) (OY.Xd() ^ 26628);
            short sXd5 = (short) (OY.Xd() ^ 20034);
            int[] iArr4 = new int[">GRu5".length()];
            QB qb4 = new QB(">GRu5");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(((i5 * sXd5) ^ sXd4) + xuXd4.CK(iKK4));
                i5++;
            }
            MultiDex.expandFieldArray(classLoader, new String(iArr4, 0, i5), zipFileArr);
            MultiDex.expandFieldArray(classLoader, C1561oA.Xd("\u001eu\u0018,(", (short) (ZN.Xd() ^ 2481)), dexFileArr);
        }
    }
}
