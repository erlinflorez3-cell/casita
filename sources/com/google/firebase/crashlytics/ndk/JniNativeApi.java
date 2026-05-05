package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.valid.communication.helpers.CommunicationConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

/* JADX INFO: loaded from: classes7.dex */
class JniNativeApi implements NativeApi {
    private static final FilenameFilter APK_FILTER = new FilenameFilter() { // from class: com.google.firebase.crashlytics.ndk.JniNativeApi$$ExternalSyntheticLambda0
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.toLowerCase().endsWith(".apk");
        }
    };
    private static final boolean LIB_CRASHLYTICS_LOADED;
    private final Context context;

    static {
        boolean z2;
        try {
            System.loadLibrary("crashlytics");
            z2 = true;
        } catch (UnsatisfiedLinkError e2) {
            Logger.getLogger().e("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e2.getLocalizedMessage());
            z2 = false;
        }
        LIB_CRASHLYTICS_LOADED = z2;
    }

    public JniNativeApi(Context context) {
        this.context = context;
    }

    public static void addSplitSourceDirs(List<String> list, PackageInfo packageInfo) {
        Object obj;
        Object obj2;
        Object obj3;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String strOd = C1561oA.od("'3(51*$l!,*/\u001f',d&\"as\"!\u001c\u0018\u0011\u000e \u0014\u0019\u0017p\u0015\f\u0014", (short) (C1580rY.Xd() ^ (-26412)));
        String strKd = C1561oA.Kd("nligsSpwugjJpz|", (short) (C1499aX.Xd() ^ (-11963)));
        try {
            Class<?> cls = Class.forName(strOd);
            Field field = 1 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
            field.setAccessible(true);
            obj = field.get(applicationInfo);
        } catch (Throwable th) {
            obj = null;
        }
        if (((String[]) obj) != null) {
            short sXd = (short) (FB.Xd() ^ 6159);
            short sXd2 = (short) (FB.Xd() ^ 30033);
            int[] iArr = new int["54cg}&\u001eylj\u001f;%`\u0004++9s<av-\u001b3^ku6*;qf\"".length()];
            QB qb = new QB("54cg}&\u001eylj\u001f;%`\u0004++9s<av-\u001b3^ku6*;qf\"");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            String strXd = C1561oA.Xd("YWTR^>[b`RU5[eg", (short) (C1580rY.Xd() ^ (-14999)));
            try {
                Class<?> cls2 = Class.forName(str);
                Field field2 = 1 != 0 ? cls2.getField(strXd) : cls2.getDeclaredField(strXd);
                field2.setAccessible(true);
                obj3 = field2.get(applicationInfo);
            } catch (Throwable th2) {
                obj3 = null;
            }
            Collections.addAll(list, (String[]) obj3);
        }
        short sXd3 = (short) (C1580rY.Xd() ^ CommunicationConstants.UNKNOWN_EXCEPTION_CODE);
        int[] iArr2 = new int["hvixrme0bokr`jm(\b\u0006CW\u0004\u0005}{rq\u0002wzzRxMW".length()];
        QB qb2 = new QB("hvixrme0bokr`jm(\b\u0006CW\u0004\u0005}{rq\u0002wzzRxMW");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd3 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        String strKd2 = Qg.kd("\u000f\u000b\u001d\tj\u000f\u0017", (short) (Od.Xd() ^ (-17826)), (short) (Od.Xd() ^ (-4918)));
        try {
            Class<?> cls3 = Class.forName(str2);
            Field field3 = 1 != 0 ? cls3.getField(strKd2) : cls3.getDeclaredField(strKd2);
            field3.setAccessible(true);
            obj2 = field3.get(applicationInfo);
        } catch (Throwable th3) {
            obj2 = null;
        }
        File file = new File((String) obj2, String.format(hg.Vd("suwo|7zvqmwepmo_q+ m(n\\h^Z\\WU\u001db^YU_]", (short) (Od.Xd() ^ (-29181)), (short) (Od.Xd() ^ (-5326))), getVersionCodeAsString(packageInfo)));
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(APK_FILTER);
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            Logger.getLogger().d(C1561oA.yd("1[^XK\b", (short) (ZN.Xd() ^ 20342)) + fileArrListFiles.length + C1561oA.Yd("Jl|x\"O\u001a R", (short) (C1580rY.Xd() ^ (-8379))) + file.getAbsolutePath());
            for (File file2 : fileArrListFiles) {
                Logger.getLogger().d(Xg.qd("%IJPVP\n", (short) (C1499aX.Xd() ^ (-23031)), (short) (C1499aX.Xd() ^ (-27122))) + file2.getName() + Jg.Wd("\u000fx\u0005Z?kq)Jnp)>'", (short) (OY.Xd() ^ 19343), (short) (OY.Xd() ^ 13578)));
                list.add(file2.getAbsolutePath());
            }
            return;
        }
        Logger logger = Logger.getLogger();
        short sXd4 = (short) (C1499aX.Xd() ^ (-18933));
        int[] iArr3 = new int["\t)X\u001c0$\u0016!\u001c\u0015P\u0016\u0014\u000f!!\u001d\u000f\u001cG\r\u0015\u001a\u0012\u0007A\u0002\u0014>".length()];
        QB qb3 = new QB("\t)X\u001c0$\u0016!\u001c\u0015P\u0016\u0014\u000f!!\u001d\u000f\u001cG\r\u0015\u001a\u0012\u0007A\u0002\u0014>");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3));
            i4++;
        }
        logger.d(new String(iArr3, 0, i4) + file.getAbsolutePath());
    }

    private static int getPackageInfoFlags() {
        return 9216;
    }

    private static String getVersionCodeAsString(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static boolean isAtLeastLollipop() {
        return true;
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    @Override // com.google.firebase.crashlytics.ndk.NativeApi
    public boolean initialize(String str, AssetManager assetManager) throws Throwable {
        String[] strArrMakePackagePaths = makePackagePaths(Build.CPU_ABI);
        if (strArrMakePackagePaths.length < 2) {
            return false;
        }
        return LIB_CRASHLYTICS_LOADED && nativeInit(new String[]{strArrMakePackagePaths[0], strArrMakePackagePaths[1], str}, assetManager);
    }

    public String[] makePackagePaths(String str) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        String strXd = ZO.xd("9s\u0014", (short) (C1633zX.Xd() ^ (-14379)), (short) (C1633zX.Xd() ^ (-28019)));
        short sXd = (short) (Od.Xd() ^ (-32603));
        short sXd2 = (short) (Od.Xd() ^ (-29212));
        int[] iArr = new int["-,\tS2".length()];
        QB qb = new QB("-,\tS2");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        try {
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("v5\u001b\u0010\u001bW|LR14\u0016[TPf^\u00137\u00046r\u0013", (short) (ZN.Xd() ^ 3264))).getMethod(EO.Od("\b5tm\u0002a;\u000b`_CwPS3T\u001f", (short) (ZN.Xd() ^ 4448)), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Context context2 = this.context;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.Qd("\f\u0018\r\u001a\u0016\u000f\tQ\u0006\u0011\u000f\u0014\u0004\f\u0011I]\t\u0007\f{\u000e\t", (short) (C1633zX.Xd() ^ (-10079)))).getMethod(C1593ug.zd("+*:\u0017),5,32\u001c0=6", (short) (FB.Xd() ^ 9390), (short) (FB.Xd() ^ 14191)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str3 = (String) method2.invoke(context2, objArr2);
                    int packageInfoFlags = getPackageInfoFlags();
                    Class<?> cls = Class.forName(C1561oA.od("=I>KG@:\u00037B@E5=Bz<8w\u0019)*1&+(\u000f\". %\".", (short) (Od.Xd() ^ (-22452))));
                    Class<?>[] clsArr = new Class[2];
                    short sXd3 = (short) (FB.Xd() ^ 23387);
                    int[] iArr2 = new int["\u000e\u0006\u001c\bU\u0015\u000b\u0019\u0013Z\u0001#\"\u001a \u001a".length()];
                    QB qb2 = new QB("\u000e\u0006\u001c\bU\u0015\u000b\u0019\u0013Z\u0001#\"\u001a \u001a");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
                        i3++;
                    }
                    clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr3 = {str3, Integer.valueOf(packageInfoFlags)};
                    Method method3 = cls.getMethod(Wg.Zd("\u0019kS\u0004oB'o.\u0001?5\ne", (short) (ZN.Xd() ^ 32316), (short) (ZN.Xd() ^ 27634)), clsArr);
                    try {
                        method3.setAccessible(true);
                        PackageInfo packageInfo = (PackageInfo) method3.invoke(packageManager, objArr3);
                        ArrayList<String> arrayList = new ArrayList(10);
                        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                        short sXd4 = (short) (C1633zX.Xd() ^ (-18477));
                        int[] iArr3 = new int["R`Wfd_[&\\iipbls.qo1Euvsqlk\u007fu||X~w\u0002".length()];
                        QB qb3 = new QB("R`Wfd_[&\\iipbls.qo1Euvsqlk\u007fu||X~w\u0002");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i4));
                            i4++;
                        }
                        String str4 = new String(iArr3, 0, i4);
                        String strVd = Wg.vd("\u0003}\u0007\u0003noQu\n", (short) (C1607wl.Xd() ^ 29040));
                        try {
                            Class<?> cls2 = Class.forName(str4);
                            Field field = 1 != 0 ? cls2.getField(strVd) : cls2.getDeclaredField(strVd);
                            field.setAccessible(true);
                            obj = field.get(applicationInfo);
                        } catch (Throwable th) {
                            obj = null;
                        }
                        arrayList.add((String) obj);
                        if (isAtLeastLollipop()) {
                            addSplitSourceDirs(arrayList, packageInfo);
                        }
                        ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                        String strKd = Qg.kd("AMBOKD>\u0007;FDI9AF~@<{\u000e<;62+(:.31\u000b/&.", (short) (C1607wl.Xd() ^ 21209), (short) (C1607wl.Xd() ^ 25304));
                        String strVd2 = hg.Vd("]QIYKI0LDSAQW#EG?L", (short) (C1607wl.Xd() ^ 22374), (short) (C1607wl.Xd() ^ 12047));
                        try {
                            Class<?> cls3 = Class.forName(strKd);
                            Field field2 = 1 != 0 ? cls3.getField(strVd2) : cls3.getDeclaredField(strVd2);
                            field2.setAccessible(true);
                            obj2 = field2.get(applicationInfo2);
                        } catch (Throwable th2) {
                            obj2 = null;
                        }
                        if (((String[]) obj2) != null) {
                            ApplicationInfo applicationInfo3 = packageInfo.applicationInfo;
                            String strUd = C1561oA.ud("JVKXTMG\u0010DOMRBJO\bIE\u0005\u0017ED?;41C7<:\u00148/7", (short) (FB.Xd() ^ 27936));
                            String strYd = C1561oA.yd("\n}u\u0006\u007f}d\u0001p\u007fm}\fWy{\f\u0019", (short) (ZN.Xd() ^ 31739));
                            try {
                                Class<?> cls4 = Class.forName(strUd);
                                Field field3 = 1 != 0 ? cls4.getField(strYd) : cls4.getDeclaredField(strYd);
                                field3.setAccessible(true);
                                obj5 = field3.get(applicationInfo3);
                            } catch (Throwable th3) {
                                obj5 = null;
                            }
                            Collections.addAll(arrayList, (String[]) obj5);
                        }
                        ArrayList arrayList2 = new ArrayList(10);
                        ApplicationInfo applicationInfo4 = packageInfo.applicationInfo;
                        String strYd2 = C1561oA.Yd("cqhwupl7mzz\u0002s}\u0005?\u0003\u0001BV\u0007\b\u0005\u0003}|\u0011\u0007\u000e\u000ei\u0010\t\u0013", (short) (C1580rY.Xd() ^ (-24672)));
                        String strQd = Xg.qd(">2F<J:\"@:K;MU!GQ", (short) (Od.Xd() ^ (-9154)), (short) (Od.Xd() ^ (-7191)));
                        try {
                            Class<?> cls5 = Class.forName(strYd2);
                            Field field4 = 1 != 0 ? cls5.getField(strQd) : cls5.getDeclaredField(strQd);
                            field4.setAccessible(true);
                            obj3 = field4.get(applicationInfo4);
                        } catch (Throwable th4) {
                            obj3 = null;
                        }
                        File parentFile = new File((String) obj3).getParentFile();
                        if (parentFile != null) {
                            arrayList2.add(new File(parentFile, str).getPath());
                            if (str.startsWith(str2)) {
                                arrayList2.add(new File(parentFile, str2).getPath());
                            } else if (str.startsWith(strXd)) {
                                arrayList2.add(new File(parentFile, strXd).getPath());
                            }
                        }
                        for (String str5 : arrayList) {
                            if (str5.endsWith(Jg.Wd("\u0013Ob\u0012", (short) (ZN.Xd() ^ 12859), (short) (ZN.Xd() ^ 2115)))) {
                                arrayList2.add(str5 + ZO.xd("\u0014SzaVk", (short) (FB.Xd() ^ 15871), (short) (FB.Xd() ^ 25101)) + str);
                            }
                        }
                        arrayList2.add(System.getProperty(C1626yg.Ud("\u0006\"CH\tz\u000fnR\\=6)hs:{", (short) (FB.Xd() ^ 16291), (short) (FB.Xd() ^ 7839))));
                        ApplicationInfo applicationInfo5 = packageInfo.applicationInfo;
                        String strWd = Ig.wd("\rs7!\u0007$G@\u0017'(\f.-36PKS:+\u0007dY)nc$\u007fp3D^\u0004", (short) (FB.Xd() ^ 19410));
                        String strOd = EO.Od("\u0005*_x&I\b&A\u0002f\"W$Ix", (short) (C1633zX.Xd() ^ (-23108)));
                        try {
                            Class<?> cls6 = Class.forName(strWd);
                            Field field5 = 1 != 0 ? cls6.getField(strOd) : cls6.getDeclaredField(strOd);
                            field5.setAccessible(true);
                            obj4 = field5.get(applicationInfo5);
                        } catch (Throwable th5) {
                            obj4 = null;
                        }
                        arrayList2.add((String) obj4);
                        return new String[]{TextUtils.join(File.pathSeparator, arrayList), TextUtils.join(File.pathSeparator, arrayList2)};
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Logger.getLogger().e(C1561oA.Qd("D\\NNWO\t\\V\u0006HSPRPSD}M=>E:?<uE5G:D", (short) (FB.Xd() ^ 32063)), e5);
            throw new RuntimeException(e5);
        }
    }
}
