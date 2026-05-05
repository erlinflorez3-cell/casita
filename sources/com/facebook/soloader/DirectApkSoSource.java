package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import android.text.TextUtils;
import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
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

/* JADX INFO: loaded from: classes3.dex */
public class DirectApkSoSource extends SoSource implements RecoverableSoSource {
    private final Set<String> mDirectApkLdPaths;
    private final Map<String, Set<String>> mLibsInApkCache = new HashMap();
    private final Map<String, Set<String>> mDepsCache = new HashMap();

    public DirectApkSoSource(Context context) {
        this.mDirectApkLdPaths = getDirectApkLdPaths(context);
    }

    public DirectApkSoSource(Set<String> set) {
        this.mDirectApkLdPaths = set;
    }

    private void appendDepsCache(String str, String str2, String str3) {
        synchronized (this.mDepsCache) {
            String str4 = str + str2;
            if (!this.mDepsCache.containsKey(str4)) {
                this.mDepsCache.put(str4, new HashSet());
            }
            this.mDepsCache.get(str4).add(str3);
        }
    }

    private void appendLibsInApkCache(String str, String str2) {
        synchronized (this.mLibsInApkCache) {
            if (!this.mLibsInApkCache.containsKey(str)) {
                this.mLibsInApkCache.put(str, new HashSet());
            }
            this.mLibsInApkCache.get(str).add(str2);
        }
    }

    private void buildLibDepsCache(String str, String str2) throws Throwable {
        String apkPathFromLdPath = getApkPathFromLdPath(str);
        Object[] objArr = {apkPathFromLdPath};
        Constructor<?> constructor = Class.forName(Jg.Wd("-w\\[\u007fV%2\tY}|Sh(\u0007\u001eK}Te", (short) (ZN.Xd() ^ 20499), (short) (ZN.Xd() ^ 22928))).getConstructor(Class.forName(ZO.xd(";\u000bwPwV\u0012\u0016>AL\u007f\u001c<%Y", (short) (C1499aX.Xd() ^ (-27819)), (short) (C1499aX.Xd() ^ (-12006)))));
        try {
            constructor.setAccessible(true);
            ZipFile zipFile = (ZipFile) constructor.newInstance(objArr);
            try {
                String libraryPathInApk = getLibraryPathInApk(str, str2);
                Class<?> cls = Class.forName(C1626yg.Ud("\u0013\u0002\u0019\u0019}C<98xWnt\u001f\u001f^+S1-0", (short) (ZN.Xd() ^ 1029), (short) (ZN.Xd() ^ FujifilmMakernoteDirectory.TAG_SEQUENCE_NUMBER)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(Ig.wd("=}#0\u001c\u001dwS!i\u000bT\u001f\u0016\t&", (short) (C1607wl.Xd() ^ 28881)));
                Object[] objArr2 = {libraryPathInApk};
                Method method = cls.getMethod(EO.Od("B\u0007* S\u0017n_", (short) (C1499aX.Xd() ^ (-31627))), clsArr);
                try {
                    method.setAccessible(true);
                    ZipEntry zipEntry = (ZipEntry) method.invoke(zipFile, objArr2);
                    if (zipEntry != null) {
                        buildLibDepsCacheImpl(str, zipFile, zipEntry, str2);
                        Object[] objArr3 = new Object[0];
                        Method method2 = Class.forName(Wg.Zd("X\\\u000b\"\b]u\u00173\u0002h\u0005$n5q\u0011s0Yk", (short) (C1499aX.Xd() ^ (-2727)), (short) (C1499aX.Xd() ^ (-10000)))).getMethod(C1561oA.Xd("\\fjob", (short) (OY.Xd() ^ 1079)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            method2.invoke(zipFile, objArr3);
                            return;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    LogUtil.e(C1561oA.Qd("\u0011,\b*\u001b\u001d\u001d)", (short) (Od.Xd() ^ (-5555))), libraryPathInApk + C1593ug.zd("\u0001PRX\u0005LV]WN\u000bU[\u000e", (short) (C1633zX.Xd() ^ (-26620)), (short) (C1633zX.Xd() ^ (-4268))) + apkPathFromLdPath);
                    Class<?> cls2 = Class.forName(C1561oA.od("\u0003x\rvB\t\u0007z|=\tv|9drxMoqi", (short) (FB.Xd() ^ 11359)));
                    Class<?>[] clsArr2 = new Class[0];
                    Object[] objArr4 = new Object[0];
                    short sXd = (short) (C1633zX.Xd() ^ (-13289));
                    int[] iArr = new int["}\b\f\u0011\u0004".length()];
                    QB qb = new QB("}\b\f\u0011\u0004");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                        i2++;
                    }
                    Method method3 = cls2.getMethod(new String(iArr, 0, i2), clsArr2);
                    try {
                        method3.setAccessible(true);
                        method3.invoke(zipFile, objArr4);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } finally {
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private void buildLibDepsCacheImpl(String str, ZipFile zipFile, ZipEntry zipEntry, String str2) throws IOException {
        ElfZipFileChannel elfZipFileChannel = new ElfZipFileChannel(zipFile, zipEntry);
        try {
            for (String str3 : NativeDeps.getDependencies(str2, elfZipFileChannel)) {
                if (!str3.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                    appendDepsCache(str, str2, str3);
                }
            }
            elfZipFileChannel.close();
        } catch (Throwable th) {
            try {
                elfZipFileChannel.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String getApkPathFromLdPath(String str) {
        return str.substring(0, str.indexOf(33));
    }

    @Nullable
    private Set<String> getDepsFromCache(String str, String str2) {
        Set<String> set;
        synchronized (this.mDepsCache) {
            set = this.mDepsCache.get(str + str2);
        }
        return set;
    }

    static Set<String> getDirectApkLdPaths(Context context) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        HashSet hashSet = new HashSet();
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("&2'40)#k +).\u001e&+cw#!&\u0016(#", (short) (C1499aX.Xd() ^ (-2910)), (short) (C1499aX.Xd() ^ (-27365)))).getMethod(C1561oA.ud(":7E\u0011?>95.+=164\u000e2)1", (short) (C1580rY.Xd() ^ (-4541))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strYd = C1561oA.yd("v\u0005w\u0007\t\u0004{Fp}y\u0001v\u0001\u0004>\u0016\u0014Qe\u001a\u001b\u0014\u0012\u0001\u007f\u0010\u0006\u0011\u0011h\u000f[e", (short) (ZN.Xd() ^ IDStepResponseCodes.STEP_RESULT_DOCUMENT_BACK_MAX_LOCAL_ATTEMPS));
            String strYd2 = C1561oA.Yd("olsqcfFlv", (short) (C1607wl.Xd() ^ 10601));
            try {
                Class<?> cls = Class.forName(strYd);
                Field field = 1 != 0 ? cls.getField(strYd2) : cls.getDeclaredField(strYd2);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            String fallbackApkLdPath = getFallbackApkLdPath((String) obj);
            if (fallbackApkLdPath != null) {
                hashSet.add(fallbackApkLdPath);
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Xg.qd("DRIXVQM\u0018N[[bT^e 6ccj\\pm", (short) (Od.Xd() ^ (-26016)), (short) (Od.Xd() ^ (-436)))).getMethod(Jg.Wd("$tKjg.}@\tZ4~O\u0016F.uQ", (short) (C1580rY.Xd() ^ (-5286)), (short) (C1580rY.Xd() ^ (-11452))), new Class[0]);
            try {
                method2.setAccessible(true);
                ApplicationInfo applicationInfo2 = (ApplicationInfo) method2.invoke(context, objArr2);
                String strXd = ZO.xd("\u001cmg\u0006(\n\n\n\u001d}G\f?:nv=\u0012&\u0003h^e$Y\u0013SOr\r=-qd", (short) (FB.Xd() ^ 2137), (short) (FB.Xd() ^ 25061));
                String strUd = C1626yg.Ud("oS_\tz\u0001eQ\u00173EOPE\f", (short) (C1499aX.Xd() ^ (-15712)), (short) (C1499aX.Xd() ^ (-20758)));
                try {
                    Class<?> cls2 = Class.forName(strXd);
                    Field field2 = 1 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
                    field2.setAccessible(true);
                    obj2 = field2.get(applicationInfo2);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (((String[]) obj2) != null) {
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(Ig.wd("zQ\u0019\f\u0019UpJT52\u001aWbDd@^6P\u0006x\u001b", (short) (FB.Xd() ^ 22936))).getMethod(EO.Od("d\u0015\u0012>-\u000b\u001b/x:G\u001eo|3:o\u0007", (short) (ZN.Xd() ^ 16688)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        ApplicationInfo applicationInfo3 = (ApplicationInfo) method3.invoke(context, objArr3);
                        String strQd = C1561oA.Qd("\t\u0015\n\u0017\u0013\f\u0006N\u0003\u000e\f\u0011\u0001\t\u000eF\b\u0004CU\u0004\u0003}yro\u0002uzxRvmu", (short) (FB.Xd() ^ 2580));
                        short sXd = (short) (ZN.Xd() ^ 10406);
                        short sXd2 = (short) (ZN.Xd() ^ 3197);
                        int[] iArr = new int["igdbnNkrpbeEkuw".length()];
                        QB qb = new QB("igdbnNkrpbeEkuw");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                            i2++;
                        }
                        String str = new String(iArr, 0, i2);
                        try {
                            Class<?> cls3 = Class.forName(strQd);
                            Field field3 = 1 != 0 ? cls3.getField(str) : cls3.getDeclaredField(str);
                            field3.setAccessible(true);
                            obj3 = field3.get(applicationInfo3);
                        } catch (Throwable th3) {
                            obj3 = null;
                        }
                        for (String str2 : (String[]) obj3) {
                            String fallbackApkLdPath2 = getFallbackApkLdPath(str2);
                            if (fallbackApkLdPath2 != null) {
                                hashSet.add(fallbackApkLdPath2);
                            }
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                return hashSet;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Nullable
    private static String getFallbackApkLdPath(String str) {
        String[] supportedAbis = SysUtil.getSupportedAbis();
        if (str == null || str.isEmpty()) {
            LogUtil.w(SoLoader.TAG, "Cannot compute fallback path, apk path is ".concat(str != null ? "empty" : "null"));
            return null;
        }
        if (supportedAbis != null && supportedAbis.length != 0) {
            return str + "!/lib/" + supportedAbis[0];
        }
        LogUtil.w(SoLoader.TAG, "Cannot compute fallback path, supportedAbis is ".concat(supportedAbis != null ? "empty" : "null"));
        return null;
    }

    private static String getLibraryPathInApk(String str, String str2) {
        return str.substring(str.indexOf(33) + 2) + File.separator + str2;
    }

    private void loadDependencies(String str, String str2, int i2, StrictMode.ThreadPolicy threadPolicy) throws Throwable {
        Set<String> depsFromCache = getDepsFromCache(str, str2);
        if (depsFromCache == null) {
            buildLibDepsCache(str, str2);
            depsFromCache = getDepsFromCache(str, str2);
        }
        if (depsFromCache != null) {
            Iterator<String> it = depsFromCache.iterator();
            while (it.hasNext()) {
                SoLoader.loadDependency(it.next(), i2, threadPolicy);
            }
        }
    }

    private void prepare() throws Throwable {
        int iIndexOf;
        int i2;
        for (String str : this.mDirectApkLdPaths) {
            String strSubstring = (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(33)) < 0 || (i2 = iIndexOf + 2) >= str.length()) ? null : str.substring(i2);
            if (!TextUtils.isEmpty(strSubstring)) {
                String apkPathFromLdPath = getApkPathFromLdPath(str);
                Class<?> cls = Class.forName(C1561oA.od("zp\u0005n:\u0001~rt5\u0001nt1\\jpEgia", (short) (C1499aX.Xd() ^ (-6761))));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (OY.Xd() ^ 27825);
                int[] iArr = new int["1)?+x8.<6}$FE=C=".length()];
                QB qb = new QB("1)?+x8.<6}$FE=C=");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i3));
                Object[] objArr = {apkPathFromLdPath};
                Constructor<?> constructor = cls.getConstructor(clsArr);
                try {
                    constructor.setAccessible(true);
                    ZipFile zipFile = (ZipFile) constructor.newInstance(objArr);
                    short sXd2 = (short) (FB.Xd() ^ 4643);
                    short sXd3 = (short) (FB.Xd() ^ 11313);
                    int[] iArr2 = new int["^Rh`.rrt\u0019W%!)c\u0011-\u0015g\f\u001c\u0016".length()];
                    QB qb2 = new QB("^Rh`.rrt\u0019W%!)c\u0011-\u0015g\f\u001c\u0016");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(((i4 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                        i4++;
                    }
                    try {
                        Class<?> cls2 = Class.forName(new String(iArr2, 0, i4));
                        Object[] objArr2 = new Object[0];
                        Method method = cls2.getMethod(C1561oA.Xd("\u0003\r\u0014\u0013\u000b\b\u0017", (short) (FB.Xd() ^ 14043)), new Class[0]);
                        try {
                            method.setAccessible(true);
                            Enumeration enumeration = (Enumeration) method.invoke(zipFile, objArr2);
                            while (enumeration.hasMoreElements()) {
                                ZipEntry zipEntry = (ZipEntry) enumeration.nextElement();
                                if (zipEntry != null) {
                                    Object[] objArr3 = new Object[0];
                                    Method method2 = Class.forName(Wg.vd("[SeQ\u001bc_Ue(qae$M]qGmtow", (short) (C1580rY.Xd() ^ (-20040)))).getMethod(Qg.kd("HES+BPCI=", (short) (C1633zX.Xd() ^ (-5285)), (short) (C1633zX.Xd() ^ (-690))), new Class[0]);
                                    try {
                                        method2.setAccessible(true);
                                        if (((Integer) method2.invoke(zipEntry, objArr3)).intValue() == 0) {
                                            short sXd4 = (short) (Od.Xd() ^ (-30986));
                                            short sXd5 = (short) (Od.Xd() ^ (-31884));
                                            int[] iArr3 = new int["RH\\F\u0012XVJL\rXFL\t4BH\u001cDIFL".length()];
                                            QB qb3 = new QB("RH\\F\u0012XVJL\rXFL\t4BH\u001cDIFL");
                                            int i5 = 0;
                                            while (qb3.YK()) {
                                                int iKK3 = qb3.KK();
                                                Xu xuXd3 = Xu.Xd(iKK3);
                                                iArr3[i5] = xuXd3.fK(sXd4 + i5 + xuXd3.CK(iKK3) + sXd5);
                                                i5++;
                                            }
                                            Class<?> cls3 = Class.forName(new String(iArr3, 0, i5));
                                            Class<?>[] clsArr2 = new Class[0];
                                            Object[] objArr4 = new Object[0];
                                            short sXd6 = (short) (C1633zX.Xd() ^ (-9613));
                                            int[] iArr4 = new int["+(6\u000f!,#".length()];
                                            QB qb4 = new QB("+(6\u000f!,#");
                                            int i6 = 0;
                                            while (qb4.YK()) {
                                                int iKK4 = qb4.KK();
                                                Xu xuXd4 = Xu.Xd(iKK4);
                                                iArr4[i6] = xuXd4.fK(sXd6 + i6 + xuXd4.CK(iKK4));
                                                i6++;
                                            }
                                            Method method3 = cls3.getMethod(new String(iArr4, 0, i6), clsArr2);
                                            try {
                                                method3.setAccessible(true);
                                                if (((String) method3.invoke(zipEntry, objArr4)).startsWith(strSubstring)) {
                                                    Class<?> cls4 = Class.forName(C1561oA.yd("\u0018\u0010&\u0012_((\u001e\u0012T\"\u0012\u001aX\u0006\u0016.\u0004.54<", (short) (OY.Xd() ^ 2624)));
                                                    Class<?>[] clsArr3 = new Class[0];
                                                    Object[] objArr5 = new Object[0];
                                                    short sXd7 = (short) (ZN.Xd() ^ 1219);
                                                    int[] iArr5 = new int["`_oJ^kd".length()];
                                                    QB qb5 = new QB("`_oJ^kd");
                                                    int i7 = 0;
                                                    while (qb5.YK()) {
                                                        int iKK5 = qb5.KK();
                                                        Xu xuXd5 = Xu.Xd(iKK5);
                                                        iArr5[i7] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd7 + sXd7) + sXd7) + i7));
                                                        i7++;
                                                    }
                                                    Method method4 = cls4.getMethod(new String(iArr5, 0, i7), clsArr3);
                                                    try {
                                                        method4.setAccessible(true);
                                                        if (((String) method4.invoke(zipEntry, objArr5)).endsWith(Xg.qd("\u0019_\\", (short) (C1580rY.Xd() ^ (-9635)), (short) (C1580rY.Xd() ^ (-7355))))) {
                                                            Object[] objArr6 = new Object[0];
                                                            Method method5 = Class.forName(Jg.Wd("K\te!5N\u0016Z%1M\u0004W^Z2\t'\u0019n4\u000e", (short) (C1499aX.Xd() ^ (-1680)), (short) (C1499aX.Xd() ^ (-5108)))).getMethod(ZO.xd("\u0016\u0013\fO_\u0003J", (short) (ZN.Xd() ^ 6930), (short) (ZN.Xd() ^ 14536)), new Class[0]);
                                                            try {
                                                                method5.setAccessible(true);
                                                                appendLibsInApkCache(str, ((String) method5.invoke(zipEntry, objArr6)).substring(strSubstring.length() + 1));
                                                            } catch (InvocationTargetException e2) {
                                                                throw e2.getCause();
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    } catch (InvocationTargetException e3) {
                                                        throw e3.getCause();
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } catch (InvocationTargetException e4) {
                                                throw e4.getCause();
                                            }
                                        } else {
                                            continue;
                                        }
                                    } catch (InvocationTargetException e5) {
                                        throw e5.getCause();
                                    }
                                }
                            }
                            Class<?> cls5 = Class.forName(C1626yg.Ud("\u001d1\u0017i\u001fc]\u0006\fR]YPn3t\u001e8Y2W", (short) (C1580rY.Xd() ^ (-9241)), (short) (C1580rY.Xd() ^ (-22318))));
                            Class<?>[] clsArr4 = new Class[0];
                            Object[] objArr7 = new Object[0];
                            short sXd8 = (short) (OY.Xd() ^ 2117);
                            int[] iArr6 = new int["\u0012m>/p".length()];
                            QB qb6 = new QB("\u0012m>/p");
                            int i8 = 0;
                            while (qb6.YK()) {
                                int iKK6 = qb6.KK();
                                Xu xuXd6 = Xu.Xd(iKK6);
                                iArr6[i8] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i8 % C1561oA.Xd.length] ^ (sXd8 + i8)));
                                i8++;
                            }
                            Method method6 = cls5.getMethod(new String(iArr6, 0, i8), clsArr4);
                            try {
                                method6.setAccessible(true);
                                method6.invoke(zipFile, objArr7);
                            } catch (InvocationTargetException e6) {
                                throw e6.getCause();
                            }
                        } catch (InvocationTargetException e7) {
                            throw e7.getCause();
                        }
                    } finally {
                    }
                } catch (InvocationTargetException e8) {
                    throw e8.getCause();
                }
            }
        }
    }

    @Override // com.facebook.soloader.SoSource
    @Nullable
    public String getLibraryPath(String str) throws IOException {
        for (String str2 : this.mDirectApkLdPaths) {
            Set<String> set = this.mLibsInApkCache.get(str2);
            if (!TextUtils.isEmpty(str2) && set != null && set.contains(str)) {
                return str2 + File.separator + str;
            }
        }
        return null;
    }

    @Override // com.facebook.soloader.SoSource
    public String getName() {
        return "DirectApkSoSource";
    }

    public boolean isValid() {
        return !this.mDirectApkLdPaths.isEmpty();
    }

    @Override // com.facebook.soloader.SoSource
    public int loadLibrary(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws Throwable {
        if (SoLoader.sSoFileLoader == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        for (String str2 : this.mDirectApkLdPaths) {
            Set<String> set = this.mLibsInApkCache.get(str2);
            if (TextUtils.isEmpty(str2) || set == null || !set.contains(str)) {
                LogUtil.v(SoLoader.TAG, str + " not found on " + str2);
            } else {
                loadDependencies(str2, str, i2, threadPolicy);
                try {
                    i2 |= 4;
                    SoLoader.sSoFileLoader.load(str2 + File.separator + str, i2);
                    LogUtil.d(SoLoader.TAG, str + " found on " + str2);
                    return 1;
                } catch (UnsatisfiedLinkError e2) {
                    LogUtil.w(SoLoader.TAG, str + " not found on " + str2 + " flag: " + i2, e2);
                }
            }
        }
        return 0;
    }

    @Override // com.facebook.soloader.SoSource
    protected void prepare(int i2) throws Throwable {
        prepare();
    }

    @Override // com.facebook.soloader.RecoverableSoSource
    public SoSource recover(Context context) throws Throwable {
        DirectApkSoSource directApkSoSource = new DirectApkSoSource(context);
        try {
            directApkSoSource.prepare();
            return directApkSoSource;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.facebook.soloader.SoSource
    public String toString() {
        return getName() + "[root = " + this.mDirectApkLdPaths.toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // com.facebook.soloader.SoSource
    public File unpackLibrary(String str) throws IOException {
        throw new UnsupportedOperationException("DirectAPKSoSource doesn't support unpackLibrary");
    }
}
