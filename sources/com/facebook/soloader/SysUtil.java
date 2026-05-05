package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import com.dynatrace.android.agent.Global;
import com.facebook.soloader.MinElf;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class SysUtil {
    private static final long APK_DEP_BLOCK_METADATA_LENGTH = 20;
    private static final byte APK_SIGNATURE_VERSION = 1;
    private static final String TAG = "SysUtil";

    private static final class LollipopSysdeps {
        private LollipopSysdeps() {
        }

        public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j2) throws IOException {
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j2);
            } catch (ErrnoException e2) {
                if (e2.errno != OsConstants.EOPNOTSUPP && e2.errno != OsConstants.ENOSYS && e2.errno != OsConstants.EINVAL) {
                    throw new IOException(e2.toString(), e2);
                }
            }
        }

        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (is64Bit()) {
                    treeSet.add(MinElf.ISA.AARCH64);
                    treeSet.add(MinElf.ISA.X86_64);
                } else {
                    treeSet.add(MinElf.ISA.ARM);
                    treeSet.add(MinElf.ISA.X86);
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e2) {
                LogUtil.e(SysUtil.TAG, String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e2.errno), e2.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        public static boolean is64Bit() throws ErrnoException {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    private static final class MarshmallowSysdeps {
        private MarshmallowSysdeps() {
        }

        public static String[] getSupportedAbis() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (is64Bit()) {
                treeSet.add(MinElf.ISA.AARCH64);
                treeSet.add(MinElf.ISA.X86_64);
            } else {
                treeSet.add(MinElf.ISA.ARM);
                treeSet.add(MinElf.ISA.X86);
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        public static boolean is64Bit() {
            return Process.is64Bit();
        }

        /* JADX WARN: Code restructure failed: missing block: B:259:0x035a, code lost:
        
            r4 = new java.lang.Object[0];
         */
        /* JADX WARN: Code restructure failed: missing block: B:261:0x0372, code lost:
        
            r1 = java.lang.Class.forName(yg.C1561oA.Xd("H@VB\u0010XXNR\u0015bRZ\u0019FV^4^edl", (short) (yg.C1633zX.Xd() ^ (-5200)))).getMethod(yg.Wg.vd("\b\u0007\u0017p\u0002\u0012\u0007\u000f|", (short) (yg.ZN.Xd() ^ 14499)), new java.lang.Class[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:262:0x0377, code lost:
        
            r1.setAccessible(true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:264:0x0384, code lost:
        
            if (((java.lang.Integer) r1.invoke(r7, r4)).intValue() != 0) goto L266;
         */
        /* JADX WARN: Code restructure failed: missing block: B:265:0x0386, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:266:0x0387, code lost:
        
            r5 = new java.lang.Object[0];
            r1 = java.lang.Class.forName(yg.Qg.kd("rh|f2xvjl-xfl)Tbh=_aY", (short) (yg.C1607wl.Xd() ^ 16975), (short) (yg.C1607wl.Xd() ^ 13871))).getMethod(yg.hg.Vd("'/14%", (short) (yg.Od.Xd() ^ (-15481)), (short) (yg.Od.Xd() ^ (-18524))), new java.lang.Class[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:267:0x03c3, code lost:
        
            r1.setAccessible(true);
            r1.invoke(r2, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:268:0x03ca, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:269:0x03cb, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:271:0x03d0, code lost:
        
            throw r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:272:0x03d1, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:274:0x03d6, code lost:
        
            throw r0.getCause();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean isApkUncompressedDso(android.content.Context r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1193
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SysUtil.MarshmallowSysdeps.isApkUncompressedDso(android.content.Context):boolean");
        }

        public static boolean isDisabledExtractNativeLibs(@Nullable Context context) throws Throwable {
            Object obj;
            if (context != null) {
                short sXd = (short) (OY.Xd() ^ 19934);
                short sXd2 = (short) (OY.Xd() ^ 20025);
                int[] iArr = new int["#]\r\\$_\u0018\u000b\u0013X\u0017n\u0016d\u0010\u000fJH\u0005Gy6o".length()];
                QB qb = new QB("#]\r\\$_\u0018\u000b\u0013X\u0017n\u0016d\u0010\u000fJH\u0005Gy6o");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                    i2++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd("R;x\u000bTt6y0(W\u000e\u001c,vO)o", (short) (OY.Xd() ^ 14082), (short) (OY.Xd() ^ 10290)), new Class[0]);
                try {
                    method.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
                    String strUd = C1626yg.Ud("(\u001acV+RzK\u0019@(<m|}nZ7q\u0019\u0006d\u001b*l;?r4G #\\\f", (short) (Od.Xd() ^ (-27006)), (short) (Od.Xd() ^ (-14821)));
                    short sXd3 = (short) (OY.Xd() ^ 31391);
                    int[] iArr2 = new int["D{`LN".length()];
                    QB qb2 = new QB("D{`LN");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                        i3++;
                    }
                    String str = new String(iArr2, 0, i3);
                    try {
                        Class<?> cls = Class.forName(strUd);
                        Field field = 1 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                        field.setAccessible(true);
                        obj = field.get(applicationInfo);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    int iIntValue = ((Integer) obj).intValue();
                    if ((iIntValue + 268435456) - (iIntValue | 268435456) == 0) {
                        return true;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return false;
        }

        public static boolean isSupportedDirectLoad(@Nullable Context context, int i2) {
            if (i2 == 2) {
                return true;
            }
            return isDisabledExtractNativeLibs(context);
        }
    }

    static int copyBytes(RandomAccessFile randomAccessFile, InputStream inputStream, int i2, byte[] bArr) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, 0, Math.min(bArr.length, i2 - i3));
            if (i4 == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, i4);
            i3 += i4;
        }
        return i3;
    }

    public static void deleteOrThrow(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.canWrite() && !parentFile.setWritable(true)) {
            LogUtil.e(TAG, "Enable write permission failed: " + parentFile);
        }
        if (!file.delete() && file.exists()) {
            throw new IOException("Could not delete file " + file);
        }
    }

    public static void dumbDelete(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        ArrayList arrayList = new ArrayList();
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                arrayList.add(file2);
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    for (File file3 : fileArrListFiles) {
                        stack.push(file3);
                    }
                }
            } else {
                deleteOrThrow(file2);
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            deleteOrThrow((File) arrayList.get(size));
        }
    }

    public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j2) throws IOException {
        LollipopSysdeps.fallocateIfSupported(fileDescriptor, j2);
    }

    public static int findAbiScore(String[] strArr, String str) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            if (str2 != null && str.equals(str2)) {
                return i2;
            }
        }
        return -1;
    }

    public static void fsyncAll(File file) throws IOException {
        Stack stack = new Stack();
        stack.push(file);
        while (!stack.isEmpty()) {
            File file2 = (File) stack.pop();
            if (file2.isDirectory()) {
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("cannot list directory " + file2);
                }
                for (File file3 : fileArrListFiles) {
                    stack.push(file3);
                }
            } else if (file2.getPath().endsWith("_lock")) {
                continue;
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
                    try {
                        randomAccessFile.getFD().sync();
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    LogUtil.e(TAG, "Syncing failed for " + file2 + ": " + e2.getMessage());
                }
            }
        }
    }

    public static long getApkDepBlockLength(File file) throws IOException {
        return getParcelPadSize(((long) (file.getCanonicalFile().getPath().length() + 1)) * 2) + 20;
    }

    public static int getAppVersionCode(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("L!h^Cz\u0012\u0003sspTt\b6\rg\u000edb\u000f}\u0018", (short) (FB.Xd() ^ 28666))).getMethod(C1561oA.Qd(")&4\u000f\u001f '\u001c!\u001e\u0005\u0018$\u0016\u001b\u0018$", (short) (C1580rY.Xd() ^ (-19298))), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            if (packageManager != null) {
                try {
                    Class<?> cls = Class.forName(C1593ug.zd("=KBQOJF\u0011GTT[MW^\u0019/\\\\cUif", (short) (FB.Xd() ^ 1029), (short) (FB.Xd() ^ 7508)));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd = (short) (OY.Xd() ^ 4783);
                    int[] iArr = new int["olzUefmbgdL^i`".length()];
                    QB qb = new QB("olzUefmbgdL^i`");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method2.setAccessible(true);
                        String str = (String) method2.invoke(context, objArr2);
                        Class<?> cls2 = Class.forName(C1561oA.Kd("w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019S\u0017\u0015Vy\f\u000f\u0018\u000f\u0016\u0015}\u0013!\u0015\u001c\u001b)", (short) (ZN.Xd() ^ 26152)));
                        Class<?>[] clsArr2 = new Class[2];
                        clsArr2[0] = Class.forName(Wg.Zd("dYfM\u0012<923e\u0003 \u0014\u000b\u0004l", (short) (OY.Xd() ^ 19221), (short) (OY.Xd() ^ 12934)));
                        clsArr2[1] = Integer.TYPE;
                        Object[] objArr3 = {str, 0};
                        Method method3 = cls2.getMethod(C1561oA.Xd("/.>\u001b-09076\u001bA:D", (short) (ZN.Xd() ^ 6282)), clsArr2);
                        try {
                            method3.setAccessible(true);
                            return ((PackageInfo) method3.invoke(packageManager, objArr3)).versionCode;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
                }
            }
            return 0;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static String getBaseName(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
    }

    @Nullable
    public static String getClassLoaderLdLoadLibrary() {
        ClassLoader classLoader = SoLoader.class.getClassLoader();
        if (classLoader != null && !(classLoader instanceof BaseDexClassLoader)) {
            throw new IllegalStateException("ClassLoader " + classLoader.getClass().getName() + " should be of type BaseDexClassLoader");
        }
        try {
            return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
        } catch (Exception e2) {
            LogUtil.e(TAG, "Cannot call getLdLibraryPath", e2);
            return null;
        }
    }

    public static FileLocker getFileLocker(File file) throws IOException {
        return FileLocker.lock(file);
    }

    @Nullable
    public static Method getNativeLoadRuntimeMethod() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception e2) {
            LogUtil.w(TAG, "Cannot get nativeLoad method", e2);
            return null;
        }
    }

    @Nullable
    public static FileLocker getOrCreateLockOnDir(File file, File file2) throws Throwable {
        boolean z2;
        try {
            return getFileLocker(file2);
        } catch (FileNotFoundException e2) {
            z2 = true;
            try {
                if (!file.setWritable(true)) {
                    throw e2;
                }
                FileLocker fileLocker = getFileLocker(file2);
                if (!file.setWritable(false)) {
                    LogUtil.w(TAG, "error removing " + file.getCanonicalPath() + " write permission");
                }
                return fileLocker;
            } catch (Throwable th) {
                th = th;
                if (z2 && !file.setWritable(false)) {
                    LogUtil.w(TAG, "error removing " + file.getCanonicalPath() + " write permission");
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
            if (z2) {
                LogUtil.w(TAG, "error removing " + file.getCanonicalPath() + " write permission");
            }
            throw th;
        }
    }

    private static long getParcelPadSize(long j2) {
        return j2 + ((4 - (j2 % 4)) % 4);
    }

    public static String[] getSupportedAbis() {
        return MarshmallowSysdeps.getSupportedAbis();
    }

    public static boolean is64Bit() {
        return MarshmallowSysdeps.is64Bit();
    }

    public static boolean isDisabledExtractNativeLibs(Context context) {
        return MarshmallowSysdeps.isDisabledExtractNativeLibs(context);
    }

    public static boolean isSupportedDirectLoad(@Nullable Context context, int i2) {
        return MarshmallowSysdeps.isSupportedDirectLoad(context, i2);
    }

    public static byte[] makeApkDepBlock(File file, Context context) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 1);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            parcelObtain.writeInt(getAppVersionCode(context));
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Nullable
    public static String makeNonZipPath(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(Global.COLON);
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(Global.COLON, arrayList);
    }

    public static void mkdirOrThrow(File file) throws IOException {
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("cannot mkdir: " + file);
        }
    }
}
