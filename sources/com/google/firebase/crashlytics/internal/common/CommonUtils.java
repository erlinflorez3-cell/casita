package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import com.facebook.soloader.MinElf;
import com.google.firebase.crashlytics.internal.Logger;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
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
public class CommonUtils {
    static final String BUILD_IDS_ARCH_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_arch";
    static final String BUILD_IDS_BUILD_ID_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_build_id";
    static final String BUILD_IDS_LIB_NAMES_RESOURCE_NAME = "com.google.firebase.crashlytics.build_ids_lib";
    public static final int DEVICE_STATE_BETAOS = 8;
    public static final int DEVICE_STATE_COMPROMISEDLIBRARIES = 32;
    public static final int DEVICE_STATE_DEBUGGERATTACHED = 4;
    public static final int DEVICE_STATE_ISSIMULATOR = 1;
    public static final int DEVICE_STATE_JAILBROKEN = 2;
    public static final int DEVICE_STATE_VENDORINTERNAL = 16;
    private static final String GOLDFISH = "goldfish";
    private static final char[] HEX_VALUES = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    static final String LEGACY_MAPPING_FILE_ID_RESOURCE_NAME = "com.crashlytics.android.build_id";
    public static final String LEGACY_SHARED_PREFS_NAME = "com.crashlytics.prefs";
    static final String MAPPING_FILE_ID_RESOURCE_NAME = "com.google.firebase.crashlytics.mapping_file_id";
    private static final String RANCHU = "ranchu";
    private static final String SDK = "sdk";
    private static final String SHA1_INSTANCE = "SHA-1";
    public static final String SHARED_PREFS_NAME = "com.google.firebase.crashlytics";

    static final class Architecture extends Enum<Architecture> {
        public static final Architecture ARM64;
        public static final Architecture ARMV6;
        public static final Architecture ARMV7;
        public static final Architecture X86_32;
        private static final Map<String, Architecture> matcher;
        public static final Architecture X86_64 = new Architecture();
        public static final Architecture ARM_UNKNOWN = new Architecture();
        public static final Architecture PPC = new Architecture();
        public static final Architecture PPC64 = new Architecture();
        public static final Architecture UNKNOWN = new Architecture();
        public static final Architecture ARMV7S = new Architecture();
        private static final /* synthetic */ Architecture[] $VALUES = $values();

        private static /* synthetic */ Architecture[] $values() {
            return new Architecture[]{X86_32, X86_64, ARM_UNKNOWN, PPC, PPC64, ARMV6, ARMV7, UNKNOWN, ARMV7S, ARM64};
        }

        static {
            Architecture architecture = new Architecture();
            X86_32 = architecture;
            X86_64 = new Architecture();
            ARM_UNKNOWN = new Architecture();
            PPC = new Architecture();
            PPC64 = new Architecture();
            Architecture architecture2 = new Architecture();
            ARMV6 = architecture2;
            Architecture architecture3 = new Architecture();
            ARMV7 = architecture3;
            UNKNOWN = new Architecture();
            ARMV7S = new Architecture();
            Architecture architecture4 = new Architecture();
            ARM64 = architecture4;
            $VALUES = $values();
            HashMap map = new HashMap(4);
            matcher = map;
            map.put(MinElf.ISA.ARM, architecture3);
            map.put("armeabi", architecture2);
            map.put(MinElf.ISA.AARCH64, architecture4);
            map.put(MinElf.ISA.X86, architecture);
        }

        private Architecture(String str, int i2) {
            super(str, i2);
        }

        static Architecture getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                Logger.getLogger().v("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = matcher.get(str.toLowerCase(Locale.US));
            return architecture == null ? UNKNOWN : architecture;
        }

        public static Architecture valueOf(String str) {
            return (Architecture) Enum.valueOf(Architecture.class, str);
        }

        public static Architecture[] values() {
            return (Architecture[]) $VALUES.clone();
        }
    }

    public static long calculateFreeRamInBytes(Context context) throws Throwable {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        String strWd = Jg.Wd("qZ\u0015\u0012\u000e\u00036J", (short) (C1607wl.Xd() ^ 3465), (short) (C1607wl.Xd() ^ 13453));
        Class<?> cls = Class.forName(ZO.xd("\u0006c+v\u001b\u001f%\u0002I5y[yaSd\u0010+t7\u0012rM", (short) (C1633zX.Xd() ^ (-11304)), (short) (C1633zX.Xd() ^ (-2552))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (ZN.Xd() ^ 20726);
        short sXd2 = (short) (ZN.Xd() ^ 6965);
        int[] iArr = new int["#Q5gu\u0014x_\u0015\u0010H3\b\u0001\u0012\u000b".length()];
        QB qb = new QB("#Q5gu\u0014x_\u0015\u0010H3\b\u0001\u0012\u000b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strWd};
        Method method = cls.getMethod(Ig.wd("%{\u0017\u0010{(\u001fV3\u0017)Z/&*L", (short) (Od.Xd() ^ (-12961))), clsArr);
        try {
            method.setAccessible(true);
            ((ActivityManager) method.invoke(context, objArr)).getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static synchronized long calculateTotalRamInBytes(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        short sXd = (short) (OY.Xd() ^ 23989);
        int[] iArr = new int["O\"EUBb=R".length()];
        QB qb = new QB("O\"EUBb=R");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2)};
        Method method = Class.forName(C1561oA.Qd("=I>KG@:\u00037B@E5=Bz\u000f:8=-?:", (short) (FB.Xd() ^ 30314))).getMethod(C1561oA.od("|y\be\u000b\u0004\u0004sz_p|\u007fqjk", (short) (C1607wl.Xd() ^ 17358)), Class.forName(C1593ug.zd(")!7#p0&4.u\u001c>=5;5", (short) (C1580rY.Xd() ^ (-17158)), (short) (C1580rY.Xd() ^ (-11421)))));
        try {
            method.setAccessible(true);
            ((ActivityManager) method.invoke(context, objArr)).getMemoryInfo(memoryInfo);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
        return memoryInfo.totalMem;
    }

    public static long calculateUsedDiskSpaceInBytes(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static boolean canTryConnection(Context context) throws Throwable {
        short sXd = (short) (C1499aX.Xd() ^ (-32128));
        int[] iArr = new int["$2)861-w;1?;8CD;BB\u0003\u0017\u001a\u001b\u001e-.;+#3704.C8:(<.".length()];
        QB qb = new QB("$2)861-w;1?;8CD;BB\u0003\u0017\u001a\u001b\u001e-.;+#3704.C8:(<.");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        if (!checkPermission(context, new String(iArr, 0, i2))) {
            return true;
        }
        String strZd = Wg.Zd("\"\u0015u<\u0015\u0019\rGW0=)", (short) (ZN.Xd() ^ 10723), (short) (ZN.Xd() ^ 3442));
        short sXd2 = (short) (ZN.Xd() ^ 27290);
        int[] iArr2 = new int["u\u0004z\n\b\u0003~I\u007f\r\r\u0014\u0006\u0010\u0017Qg\u0015\u0015\u001c\u000e\"\u001f".length()];
        QB qb2 = new QB("u\u0004z\n\b\u0003~I\u007f\r\r\u0014\u0006\u0010\u0017Qg\u0015\u0015\u001c\u000e\"\u001f");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
            i3++;
        }
        Object[] objArr = {strZd};
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Qg.kd("\u0017\u0014\"\u007f%\u001e\u001e\u000e\u0015y\u000b\u0017\u001a\f\u0005\u0006", (short) (ZN.Xd() ^ 17521), (short) (ZN.Xd() ^ 7471)), Class.forName(Wg.vd("\u007fw\nu?~p~t<^\u0001{suo", (short) (C1633zX.Xd() ^ (-4150)))));
        try {
            method.setAccessible(true);
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) method.invoke(context, objArr)).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean checkPermission(Context context, String str) throws Throwable {
        Class<?> cls = Class.forName(hg.Vd("\u001e*\u001f,(!\u001bc\u0018#!&\u0016\u001e#[o\u001b\u0019\u001e\u000e \u001b", (short) (ZN.Xd() ^ 7267), (short) (ZN.Xd() ^ 3572)));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1607wl.Xd() ^ 23905);
        int[] iArr = new int["\u0011\u0007\u001b\u0005P\u000e\u0002\u000e\u0006Ko\u0010\r\u0003\u0007~".length()];
        QB qb = new QB("\u0011\u0007\u001b\u0005P\u000e\u0002\u000e\u0006Ko\u0010\r\u0003\u0007~");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {str};
        Method method = cls.getMethod(C1561oA.yd("y\u007fyx}Vq}zxztY}[nrmTjtpitqhkk", (short) (OY.Xd() ^ 9046)), clsArr);
        try {
            method.setAccessible(true);
            return ((Integer) method.invoke(context, objArr)).intValue() == 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void closeOrLog(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Logger.getLogger().e(str, e2);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static String createInstanceIdFrom(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace(Global.HYPHEN, "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String string = sb.toString();
        if (string.length() > 0) {
            return sha1(string);
        }
        return null;
    }

    public static boolean getBooleanResourceValue(Context context, String str, boolean z2) throws Throwable {
        if (context != null) {
            short sXd = (short) (C1580rY.Xd() ^ (-13795));
            int[] iArr = new int["#1(750,v-::A3=D~\u0015BBI;OL".length()];
            QB qb = new QB("#1(750,v-::A3=D~\u0015BBI;OL");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd(",+;\u001a.=:A?14C", (short) (OY.Xd() ^ 32362), (short) (OY.Xd() ^ 1784)), new Class[0]);
            try {
                method.setAccessible(true);
                Resources resources = (Resources) method.invoke(context, objArr);
                if (resources != null) {
                    int resourcesIdentifier = getResourcesIdentifier(context, str, Jg.Wd("a(b\u0018", (short) (C1499aX.Xd() ^ (-14510)), (short) (C1499aX.Xd() ^ (-31264))));
                    if (resourcesIdentifier > 0) {
                        return resources.getBoolean(resourcesIdentifier);
                    }
                    int resourcesIdentifier2 = getResourcesIdentifier(context, str, ZO.xd("\bb\b\u0005dl", (short) (C1499aX.Xd() ^ (-3757)), (short) (C1499aX.Xd() ^ (-11143))));
                    if (resourcesIdentifier2 > 0) {
                        short sXd2 = (short) (Od.Xd() ^ (-16622));
                        short sXd3 = (short) (Od.Xd() ^ (-27466));
                        int[] iArr2 = new int["%\u001e{\u0010\u0004\u0004nxQ\t'D`A<0.D?p<E5".length()];
                        QB qb2 = new QB("%\u001e{\u0010\u0004\u0004nxQ\t'D`A<0.D?p<E5");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + (i3 * sXd3))) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                        Class<?>[] clsArr = {Integer.TYPE};
                        Object[] objArr2 = {Integer.valueOf(resourcesIdentifier2)};
                        Method method2 = cls.getMethod(Ig.wd("a\t\nL=[8,Y", (short) (Od.Xd() ^ (-21842))), clsArr);
                        try {
                            method2.setAccessible(true);
                            return Boolean.parseBoolean((String) method2.invoke(context, objArr2));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        return z2;
    }

    public static List<BuildIdInfo> getBuildIdInfo(Context context) throws Throwable {
        ArrayList arrayList = new ArrayList();
        String strOd = EO.Od("lBR;\u001da=\u001e]\u000bQ(Yl\u0005a&4\u007fB3\u001cjz;-\u001eb3!~\u0019'\u00169\fW8KRg-irv", (short) (C1580rY.Xd() ^ (-13544)));
        String strQd = C1561oA.Qd("WgfTk", (short) (C1580rY.Xd() ^ (-28690)));
        int resourcesIdentifier = getResourcesIdentifier(context, strOd, strQd);
        short sXd = (short) (C1580rY.Xd() ^ (-15344));
        short sXd2 = (short) (C1580rY.Xd() ^ (-12051));
        int[] iArr = new int["8ED\u0006@IJCIC\rFJTHFFYL\u0016L\\L_UZhdZUf\"Wk`d]Yd`p]`rdj".length()];
        QB qb = new QB("8ED\u0006@IJCIC\rFJTHFFYL\u0016L\\L_UZhdZUf\"Wk`d]Yd`p]`rdj");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        int resourcesIdentifier2 = getResourcesIdentifier(context, new String(iArr, 0, i2), strQd);
        int resourcesIdentifier3 = getResourcesIdentifier(context, C1561oA.od(";FC\u0003;BA8<4{35=/+):+r'5#4(+71%\u001e-f\u001a,\u001f!\u0018\u0012\u001b\u0015#\u000e\u0010\"\u0015\u0017\u000e\b\u0011\u000b", (short) (Od.Xd() ^ (-32577))), strQd);
        if (resourcesIdentifier == 0 || resourcesIdentifier2 == 0 || resourcesIdentifier3 == 0) {
            Logger.getLogger().d(String.format(C1561oA.yd("^\n\u0013\t{6\b\b\u0018B\f\u000e\u000e\u0003A\u0013p}|\u0002yin{M2:x/3u0`\u001f", (short) (C1633zX.Xd() ^ (-9890))), Integer.valueOf(resourcesIdentifier), Integer.valueOf(resourcesIdentifier2), Integer.valueOf(resourcesIdentifier3)));
            return arrayList;
        }
        short sXd3 = (short) (C1633zX.Xd() ^ (-9442));
        int[] iArr2 = new int["\u0011\u001f\u0016%#\u001e\u001ad\u001b((/!+2l\u0003007)=:".length()];
        QB qb2 = new QB("\u0011\u001f\u0016%#\u001e\u001ad\u001b((/!+2l\u0003007)=:");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i3));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(Wg.Zd("az\u0013w\u0014-BOUQ\\s", (short) (C1633zX.Xd() ^ (-10186)), (short) (C1633zX.Xd() ^ (-1889))), new Class[0]);
        try {
            method.setAccessible(true);
            String[] stringArray = ((Resources) method.invoke(context, objArr)).getStringArray(resourcesIdentifier);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Xd("\u0015#\u001a)'\"\u001eh\u001f,,3%/6p\u000744;-A>", (short) (ZN.Xd() ^ 25225))).getMethod(Wg.vd("_^jIYhahrdcr", (short) (OY.Xd() ^ 3985)), new Class[0]);
            try {
                method2.setAccessible(true);
                String[] stringArray2 = ((Resources) method2.invoke(context, objArr2)).getStringArray(resourcesIdentifier2);
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(Qg.kd("\u0013\u001f\u0014!\u001d\u0016\u0010X\r\u0018\u0016\u001b\u000b\u0013\u0018Pd\u0010\u000e\u0013\u0003\u0015\u0010", (short) (OY.Xd() ^ 17206), (short) (OY.Xd() ^ 22017))).getMethod(hg.Vd("khvSermrn^_l", (short) (C1580rY.Xd() ^ (-6197)), (short) (C1580rY.Xd() ^ (-3096))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    String[] stringArray3 = ((Resources) method3.invoke(context, objArr3)).getStringArray(resourcesIdentifier3);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        for (int i4 = 0; i4 < stringArray3.length; i4++) {
                            arrayList.add(new BuildIdInfo(stringArray[i4], stringArray2[i4], stringArray3[i4]));
                        }
                        return arrayList;
                    }
                    Logger logger = Logger.getLogger();
                    Object[] objArr4 = {Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)};
                    short sXd4 = (short) (C1607wl.Xd() ^ 21878);
                    int[] iArr3 = new int["\u0012*2*6)3^\"& Z((,V#\u0016(\u0016\u001ajOS\u0012LP\u000fIM\f".length()];
                    QB qb3 = new QB("\u0012*2*6)3^\"& Z((,V#\u0016(\u0016\u001ajOS\u0012LP\u000fIM\f");
                    int i5 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i5] = xuXd3.fK(sXd4 + i5 + xuXd3.CK(iKK3));
                        i5++;
                    }
                    logger.d(String.format(new String(iArr3, 0, i5), objArr4));
                    return arrayList;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static int getCpuArchitectureInt() {
        return Architecture.getValue().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public static int getDeviceState() {
        ?? IsEmulator = isEmulator();
        int i2 = IsEmulator;
        if (isRooted()) {
            i2 = (-1) - (((-1) - IsEmulator) & ((-1) - 2));
        }
        return isDebuggerAttached() ? (-1) - (((-1) - i2) & ((-1) - 4)) : i2;
    }

    public static SharedPreferences getLegacySharedPrefs(Context context) throws Throwable {
        String strYd = C1561oA.Yd("u\u0003\u0002Cy\ny\r\u0003\b\u0016\u0012\b\u0003\u0014O\u0013\u0016\n\f\u001a", (short) (C1633zX.Xd() ^ (-10964)));
        Class<?> cls = Class.forName(Xg.qd("\f\u001a\u0011 \u001e\u0019\u0015_\u0016##*\u001c&-g}++2$85", (short) (C1607wl.Xd() ^ 4589), (short) (C1607wl.Xd() ^ 19595)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (OY.Xd() ^ 19122);
        short sXd2 = (short) (OY.Xd() ^ 12176);
        int[] iArr = new int["JO:|+~K2zWVO+;\u0018f".length()];
        QB qb = new QB("JO:|+~K2zWVO+;\u0018f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Integer.TYPE;
        Object[] objArr = {strYd, 0};
        Method method = cls.getMethod(ZO.xd("4\nW\u0002fdy\u0011)UV\u000b\u0017n_\\\u0013F>h", (short) (OY.Xd() ^ 26851), (short) (OY.Xd() ^ 1517)), clsArr);
        try {
            method.setAccessible(true);
            return (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String getMappingFileId(Context context) throws Throwable {
        String strUd = C1626yg.Ud("]DO\u000b a:5pL6NEQv]9f\u001f]wX\u001eF#\u0005\u0011` fu8*k\"=t5\u0013T>\u001drWJfX", (short) (ZN.Xd() ^ 16369), (short) (ZN.Xd() ^ 5757));
        String strWd = Ig.wd("X~;VD\u0018", (short) (ZN.Xd() ^ 22630));
        int resourcesIdentifier = getResourcesIdentifier(context, strUd, strWd);
        if (resourcesIdentifier == 0) {
            resourcesIdentifier = getResourcesIdentifier(context, EO.Od("\u001cr~gd0r\u0006)ah\u0006%-)\u0006UZ*R\u000f^5|\u0001a5\u000e]H(\u0007", (short) (C1607wl.Xd() ^ 26402)), strWd);
        }
        if (resourcesIdentifier == 0) {
            return null;
        }
        Class<?> cls = Class.forName(C1561oA.Qd("v\u0003w\u0005\u0001ys<p{y~nv{4Hsqvfxs", (short) (OY.Xd() ^ 23590)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 11270);
        short sXd2 = (short) (FB.Xd() ^ 12234);
        int[] iArr = new int[" \u001f/\u000e\"1.53%(7".length()];
        QB qb = new QB(" \u001f/\u000e\"1.53%(7");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getString(resourcesIdentifier);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean getProximitySensorEnabled(Context context) throws Throwable {
        if (isEmulator()) {
            return false;
        }
        String strOd = C1561oA.od("\u001f\u0010\u0018\u001c\u0017\u0019", (short) (C1633zX.Xd() ^ (-9746)));
        short sXd = (short) (C1499aX.Xd() ^ (-18547));
        int[] iArr = new int["bpgvtok6lyy\u0001r|\u0004>T\u0002\u0002\tz\u000f\f".length()];
        QB qb = new QB("bpgvtok6lyy\u0001r|\u0004>T\u0002\u0002\tz\u000f\f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Object[] objArr = {strOd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Xd("@?O/VQSEN5HV[OJM", (short) (C1607wl.Xd() ^ 22167)), Class.forName(Wg.Zd("\u000f&E\u001eh\u0015s~\u0006Zy)\u0016hy^", (short) (C1580rY.Xd() ^ (-12429)), (short) (C1580rY.Xd() ^ (-30371)))));
        try {
            method.setAccessible(true);
            return ((SensorManager) method.invoke(context, objArr)).getDefaultSensor(8) != null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String getResourcePackageName(Context context) throws Throwable {
        Class<?> cls = Class.forName(Wg.vd("\u001d)\u001e+/(\"j'205-5:r\u000f:8=5GB", (short) (Od.Xd() ^ (-22647))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (-12178));
        short sXd2 = (short) (C1633zX.Xd() ^ (-11946));
        int[] iArr = new int["]Zh4ba\\XQN`TYW+VTYI[V".length()];
        QB qb = new QB("]Zh4ba\\XQN`TYW+VTYI[V");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(hg.Vd("q}r\u007f{tn7kvtyiqv/Cnlqasn", (short) (ZN.Xd() ^ 9953), (short) (ZN.Xd() ^ 28151))).getMethod(C1561oA.ud("mjxDrqlha^pdigAe\\d", (short) (ZN.Xd() ^ 5974)), new Class[0]);
            try {
                method2.setAccessible(true);
                int i3 = ((ApplicationInfo) method2.invoke(context2, objArr2)).icon;
                if (i3 <= 0) {
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(EO.Od("\u0003j\"\f\u0010/RC,(|-mhnM(R\u0019\u001bO:`", (short) (ZN.Xd() ^ 20411))).getMethod(C1561oA.Qd("[XfAQRYNSP8JUL", (short) (C1607wl.Xd() ^ 19997)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        return (String) method3.invoke(context, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                try {
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(C1561oA.yd("NZS``YW Xcej^fo( KMRFXW", (short) (OY.Xd() ^ 5465))).getMethod(C1561oA.Yd("YXhG[jgnl^ap", (short) (C1607wl.Xd() ^ 31011)), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        String resourcePackageName = ((Resources) method4.invoke(context, objArr4)).getResourcePackageName(i3);
                        if (!Xg.qd("gul{ytp", (short) (C1607wl.Xd() ^ 27217), (short) (C1607wl.Xd() ^ 5684)).equals(resourcePackageName)) {
                            return resourcePackageName;
                        }
                        short sXd3 = (short) (C1633zX.Xd() ^ (-5702));
                        short sXd4 = (short) (C1633zX.Xd() ^ (-25675));
                        int[] iArr2 = new int["9cXeaRL\u0015I|z\u007foot-A\u0015\u0013\u0018\b\u0012\r".length()];
                        QB qb2 = new QB("9cXeaRL\u0015I|z\u007foot-A\u0015\u0013\u0018\b\u0012\r");
                        int i4 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd4) ^ sXd3));
                            i4++;
                        }
                        Object[] objArr5 = new Object[0];
                        Method method5 = Class.forName(new String(iArr2, 0, i4)).getMethod(ZO.xd("CrtJPS=G\u0011\u001bh>\u001bA", (short) (ZN.Xd() ^ 3976), (short) (ZN.Xd() ^ 22270)), new Class[0]);
                        try {
                            method5.setAccessible(true);
                            return (String) method5.invoke(context, objArr5);
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (Resources.NotFoundException unused) {
                    Object[] objArr6 = new Object[0];
                    Method method6 = Class.forName(C1626yg.Ud("6\u0001o\u0002\u001cq\u000b\"\u0005Pv-wb\u0007Q14A\u007f<QU", (short) (C1499aX.Xd() ^ (-6731)), (short) (C1499aX.Xd() ^ (-20535)))).getMethod(Ig.wd("\u000e2\u007f{tQ5\u0004Vp\u0004p-3", (short) (OY.Xd() ^ 20350)), new Class[0]);
                    try {
                        method6.setAccessible(true);
                        return (String) method6.invoke(context, objArr6);
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    public static int getResourcesIdentifier(Context context, String str, String str2) {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("y\b~\u000e\f\u0007\u0003M\u0004\u0011\u0011\u0018\n\u0014\u001bUk\u0019\u0019 \u0012&#", (short) (Od.Xd() ^ (-9728)), (short) (Od.Xd() ^ (-27407)))).getMethod(C1561oA.od("\f\t\u0017s\u0006\u0013\u000e\u0013\u000f~\u007f\r", (short) (C1499aX.Xd() ^ (-9717))), new Class[0]);
        try {
            method.setAccessible(true);
            return ((Resources) method.invoke(context, objArr)).getIdentifier(str, str2, getResourcePackageName(context));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static SharedPreferences getSharedPrefs(Context context) throws Throwable {
        Object[] objArr = {C1561oA.Kd("0=<}8AB;A;\u0005>BL@>>QD\u000eDTDWMR`\\RM^", (short) (ZN.Xd() ^ 8861)), 0};
        Method method = Class.forName(Wg.Zd("\trFA\u001apY\u007f\u0011\nf\u0018eL?TF`<.{l\u0014", (short) (Od.Xd() ^ (-18347)), (short) (Od.Xd() ^ (-15062)))).getMethod(Wg.vd("65A!3-;/;(G;99C7-#\"1", (short) (C1499aX.Xd() ^ (-13467))), Class.forName(C1561oA.Xd("/'=)v6,:4{\"DC;A;", (short) (C1580rY.Xd() ^ (-25292)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static String hash(String str, String str2) {
        return hash(str.getBytes(), str2);
    }

    private static String hash(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return hexify(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            Logger.getLogger().e("Could not create hashing algorithm: " + str + ", returning empty string.", e2);
            return "";
        }
    }

    public static String hexify(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = HEX_VALUES;
            cArr[i3] = cArr2[(255 & b2) >>> 4];
            cArr[i3 + 1] = cArr2[(-1) - (((-1) - b2) | ((-1) - 15))];
        }
        return new String(cArr);
    }

    public static boolean isAppDebuggable(Context context) throws Throwable {
        Object obj;
        Class<?> cls = Class.forName(Qg.kd("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ", (short) (C1633zX.Xd() ^ (-30230)), (short) (C1633zX.Xd() ^ (-1759))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (FB.Xd() ^ 16020);
        short sXd2 = (short) (FB.Xd() ^ 15176);
        int[] iArr = new int["vs\u0002M{zuqjgymrpJnem".length()];
        QB qb = new QB("vs\u0002M{zuqjgymrpJnem");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            short sXd3 = (short) (C1499aX.Xd() ^ (-5885));
            int[] iArr2 = new int["\r\u0019\u000e\u001b\u0017\u0010\nR\u0007\u0012\u0010\u0015\u0005\r\u0012J\f\bGY\b\u0007\u0002}vs\u0006y~|Vzqy".length()];
            QB qb2 = new QB("\r\u0019\u000e\u001b\u0017\u0010\nR\u0007\u0012\u0010\u0015\u0005\r\u0012J\f\bGY\b\u0007\u0002}vs\u0006y~|Vzqy");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                i3++;
            }
            String str = new String(iArr2, 0, i3);
            String strYd = C1561oA.yd("ZaSZk", (short) (C1607wl.Xd() ^ 6968));
            try {
                Class<?> cls2 = Class.forName(str);
                Field field = 1 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            int iIntValue = ((Integer) obj).intValue();
            return (iIntValue + 2) - (iIntValue | 2) != 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean isDebuggerAttached() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean isEmulator() {
        return Build.PRODUCT.contains("sdk") || Build.HARDWARE.contains(GOLDFISH) || Build.HARDWARE.contains(RANCHU);
    }

    @Deprecated
    public static boolean isLoggingEnabled(Context context) {
        return false;
    }

    public static boolean isRooted() {
        boolean zIsEmulator = isEmulator();
        String str = Build.TAGS;
        if ((zIsEmulator || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zIsEmulator && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean nullSafeEquals(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static String padWithZerosToMaxIntWidth(int i2) {
        if (i2 >= 0) {
            return String.format(Locale.US, "%1$10s", Integer.valueOf(i2)).replace(TokenParser.SP, '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String sha1(String str) {
        return hash(str, "SHA-1");
    }

    public static String streamToString(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
    }
}
