package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.StrictMode;
import com.dynatrace.android.agent.Global;
import com.facebook.soloader.MinElf;
import com.facebook.soloader.observer.ObserverHolder;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.C1580rY;
import yg.OY;
import yg.Od;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeDeps {
    private static final float HASHMAP_LOAD_FACTOR = 1.0f;
    private static final int INITIAL_HASH = 5381;
    private static final int LIB_PREFIX_LEN;
    private static final int LIB_PREFIX_SUFFIX_LEN;
    private static final int LIB_SUFFIX_LEN;
    private static final String LOG_TAG = "NativeDeps";
    private static final HashSet<String> STANDARD_SYSTEM_LIBS;
    private static final int WAITING_THREADS_WARNING_THRESHOLD = 3;

    @Nullable
    private static byte[] sEncodedDeps = null;
    private static volatile boolean sInitialized = false;
    private static Map<Integer, List<Integer>> sPrecomputedDeps = null;
    private static List<Integer> sPrecomputedLibs = null;
    private static volatile boolean sUseDepsFileAsync = false;
    private static final ReentrantReadWriteLock sWaitForDepsFileLock;

    /* JADX INFO: renamed from: com.facebook.soloader.NativeDeps$1 */
    class AnonymousClass1 extends HashSet<String> {
        AnonymousClass1() {
            add("libEGL.so");
            add("libGLESv2.so");
            add("libGLESv3.so");
            add("libOpenSLES.so");
            add("libandroid.so");
            add("libc.so");
            add("libdl.so");
            add("libjnigraphics.so");
            add("liblog.so");
            add("libm.so");
            add("libstdc++.so");
            add("libz.so");
        }
    }

    /* JADX INFO: renamed from: com.facebook.soloader.NativeDeps$2 */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ Context val$context;
        final /* synthetic */ boolean val$extractToDisk;

        AnonymousClass2(Context context, boolean z2) {
            context = context;
            z = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeDeps.sWaitForDepsFileLock.writeLock().lock();
            boolean unused = NativeDeps.sUseDepsFileAsync = true;
            try {
                NativeDeps.useDepsFileFromApkSync(context, z);
            } finally {
                int readLockCount = NativeDeps.sWaitForDepsFileLock.getReadLockCount();
                if (readLockCount >= 3) {
                    LogUtil.w(NativeDeps.LOG_TAG, "NativeDeps initialization finished with " + Integer.toString(readLockCount) + " threads waiting.");
                }
                NativeDeps.sWaitForDepsFileLock.writeLock().unlock();
                boolean unused2 = NativeDeps.sUseDepsFileAsync = false;
            }
        }
    }

    static {
        int length = "lib".length();
        LIB_PREFIX_LEN = length;
        int length2 = ".so".length();
        LIB_SUFFIX_LEN = length2;
        LIB_PREFIX_SUFFIX_LEN = length + length2;
        sInitialized = false;
        sUseDepsFileAsync = false;
        sWaitForDepsFileLock = new ReentrantReadWriteLock();
        STANDARD_SYSTEM_LIBS = new HashSet<String>() { // from class: com.facebook.soloader.NativeDeps.1
            AnonymousClass1() {
                add("libEGL.so");
                add("libGLESv2.so");
                add("libGLESv3.so");
                add("libOpenSLES.so");
                add("libandroid.so");
                add("libc.so");
                add("libdl.so");
                add("libjnigraphics.so");
                add("liblog.so");
                add("libm.so");
                add("libstdc++.so");
                add("libz.so");
            }
        };
    }

    @Nullable
    private static String[] awaitGetDepsFromPrecomputedDeps(String str) {
        if (sInitialized) {
            return tryGetDepsFromPrecomputedDeps(str);
        }
        if (!sUseDepsFileAsync) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sWaitForDepsFileLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            String[] strArrTryGetDepsFromPrecomputedDeps = tryGetDepsFromPrecomputedDeps(str);
            reentrantReadWriteLock.readLock().unlock();
            return strArrTryGetDepsFromPrecomputedDeps;
        } catch (Throwable th) {
            sWaitForDepsFileLock.readLock().unlock();
            throw th;
        }
    }

    private static int findNextLine(byte[] bArr, int i2) {
        while (i2 < bArr.length && bArr[i2] != 10) {
            i2++;
        }
        return i2 < bArr.length ? i2 + 1 : i2;
    }

    public static String[] getDependencies(String str, ElfByteChannel elfByteChannel) throws IOException {
        if (SoLoader.SYSTRACE_LIBRARY_LOADING) {
            Api18TraceUtils.beginTraceSection("soloader.NativeDeps.getDependencies[", str, "]");
        }
        ObserverHolder.onGetDependenciesStart();
        try {
            try {
                String[] strArrAwaitGetDepsFromPrecomputedDeps = awaitGetDepsFromPrecomputedDeps(str);
                if (strArrAwaitGetDepsFromPrecomputedDeps != null) {
                    return strArrAwaitGetDepsFromPrecomputedDeps;
                }
                String[] strArrExtract_DT_NEEDED = MinElf.extract_DT_NEEDED(elfByteChannel);
                ObserverHolder.onGetDependenciesEnd(null);
                if (SoLoader.SYSTRACE_LIBRARY_LOADING) {
                    Api18TraceUtils.endSection();
                }
                return strArrExtract_DT_NEEDED;
            } catch (MinElf.ElfError e2) {
                throw SoLoaderULErrorFactory.create(str, e2);
            } catch (Error e3) {
                throw e3;
            } catch (RuntimeException e4) {
                throw e4;
            }
        } finally {
            ObserverHolder.onGetDependenciesEnd(null);
            if (SoLoader.SYSTRACE_LIBRARY_LOADING) {
                Api18TraceUtils.endSection();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x003d, code lost:
    
        if (r5 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x003f, code lost:
    
        r0 = getLibString(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0043, code lost:
    
        if (r0 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0045, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0046, code lost:
    
        r4.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x004d, code lost:
    
        if (r4.isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x004f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005c, code lost:
    
        return (java.lang.String[]) r4.toArray(new java.lang.String[r4.size()]);
     */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String[] getDepsForLibAtOffset(int r7, int r8) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r7 = r7 + r8
            int r0 = com.facebook.soloader.NativeDeps.LIB_PREFIX_SUFFIX_LEN
            int r7 = r7 - r0
            r6 = 0
            r1 = r6
            r5 = r1
        Lc:
            byte[] r2 = com.facebook.soloader.NativeDeps.sEncodedDeps
            int r0 = r2.length
            r3 = 0
            if (r7 >= r0) goto L3d
            r2 = r2[r7]
            r0 = 10
            if (r2 == r0) goto L3d
            r0 = 32
            if (r2 != r0) goto L25
            if (r5 == 0) goto L3a
            java.lang.String r0 = getLibString(r1)
            if (r0 != 0) goto L35
            return r3
        L25:
            r0 = 48
            if (r2 < r0) goto L2d
            r0 = 57
            if (r2 <= r0) goto L2e
        L2d:
            return r3
        L2e:
            int r1 = r1 * 10
            int r0 = r2 + (-48)
            int r1 = r1 + r0
            r5 = 1
            goto L3a
        L35:
            r4.add(r0)
            r1 = r6
            r5 = r1
        L3a:
            int r7 = r7 + 1
            goto Lc
        L3d:
            if (r5 == 0) goto L49
            java.lang.String r0 = getLibString(r1)
            if (r0 != 0) goto L46
            return r3
        L46:
            r4.add(r0)
        L49:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L50
            return r3
        L50:
            int r0 = r4.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.NativeDeps.getDepsForLibAtOffset(int, int):java.lang.String[]");
    }

    @Nullable
    private static String getLibString(int i2) {
        if (i2 >= sPrecomputedLibs.size()) {
            return null;
        }
        int iIntValue = sPrecomputedLibs.get(i2).intValue();
        int i3 = iIntValue;
        while (true) {
            byte[] bArr = sEncodedDeps;
            if (i3 >= bArr.length || bArr[i3] <= 32) {
                break;
            }
            i3++;
        }
        int i4 = (i3 - iIntValue) + LIB_PREFIX_SUFFIX_LEN;
        char[] cArr = new char[i4];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i5 = 0; i5 < i4 - LIB_PREFIX_SUFFIX_LEN; i5++) {
            cArr[LIB_PREFIX_LEN + i5] = (char) sEncodedDeps[iIntValue + i5];
        }
        cArr[i4 - 3] = '.';
        cArr[i4 - 2] = 's';
        cArr[i4 - 1] = 'o';
        return new String(cArr);
    }

    private static int getOffsetForLib(String str) {
        List<Integer> list = sPrecomputedDeps.get(Integer.valueOf(hashLib(str)));
        if (list == null) {
            return -1;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (libIsAtOffset(str, iIntValue)) {
                return iIntValue;
            }
        }
        return -1;
    }

    private static int hashLib(String str) {
        int iCodePointAt = INITIAL_HASH;
        for (int i2 = LIB_PREFIX_LEN; i2 < str.length() - LIB_SUFFIX_LEN; i2++) {
            iCodePointAt = str.codePointAt(i2) + (iCodePointAt << 5) + iCodePointAt;
        }
        return iCodePointAt;
    }

    private static void indexDepsBytes(byte[] bArr, int i2) {
        int i3;
        byte b2;
        boolean z2 = true;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (z2) {
                i4 = INITIAL_HASH;
                i3 = i2;
                while (true) {
                    try {
                        b2 = bArr[i3];
                        if (b2 <= 32) {
                            break;
                        }
                        i4 = (i4 << 5) + i4 + b2;
                        i3++;
                    } catch (IndexOutOfBoundsException unused) {
                        if (z2 || i2 == bArr.length) {
                            return;
                        }
                        indexLib(i4, i2);
                        return;
                    }
                }
                indexLib(i4, i2);
                z2 = b2 != 32;
            } else {
                while (bArr[i2] != 10) {
                    i2++;
                }
                z2 = true;
                i3 = i2;
                i2 = i5;
            }
            try {
                i5 = i2;
                i2 = i3 + 1;
            } catch (IndexOutOfBoundsException unused2) {
                i2 = i5;
                if (z2) {
                    return;
                } else {
                    return;
                }
            }
        }
    }

    private static void indexLib(int i2, int i3) {
        sPrecomputedLibs.add(Integer.valueOf(i3));
        List<Integer> arrayList = sPrecomputedDeps.get(Integer.valueOf(i2));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            sPrecomputedDeps.put(Integer.valueOf(i2), arrayList);
        }
        arrayList.add(Integer.valueOf(i3));
    }

    private static boolean initDeps(Context context, boolean z2) throws Throwable {
        byte[] nativeDepsFromApk;
        byte[] bArrMakeApkDepBlock;
        Object obj;
        verifyUninitialized();
        if (z2) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd("\u001e,#20+'q(55<.8?y\u0010==D6JG", (short) (OY.Xd() ^ 11199))).getMethod(Wg.Zd("4\u001e` \u0003V\u0006u\u0013d+\u0013L\u001f-E`|", (short) (C1580rY.Xd() ^ (-4666)), (short) (C1580rY.Xd() ^ (-26096))), new Class[0]);
            try {
                method.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
                String strXd = C1561oA.Xd("\u001a(\u001f.,'#m$118*4;u97x\r=>;943G=DD F?I", (short) (OY.Xd() ^ 12717));
                String strVd = Wg.vd("NIRN:;\u001dAE", (short) (Od.Xd() ^ (-21145)));
                try {
                    Class<?> cls = Class.forName(strXd);
                    Field field = 1 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                bArrMakeApkDepBlock = SysUtil.makeApkDepBlock(new File((String) obj), context);
                nativeDepsFromApk = NativeDepsUnpacker.readNativeDepsFromDisk(context);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            nativeDepsFromApk = NativeDepsUnpacker.readNativeDepsFromApk(context);
            bArrMakeApkDepBlock = null;
        }
        return processDepsBytes(bArrMakeApkDepBlock, nativeDepsFromApk);
    }

    private static boolean libIsAtOffset(String str, int i2) {
        int i3;
        int i4 = LIB_PREFIX_LEN;
        while (true) {
            int length = str.length();
            i3 = LIB_SUFFIX_LEN;
            if (i4 >= length - i3 || i2 >= sEncodedDeps.length || (str.codePointAt(i4) & 255) != sEncodedDeps[i2]) {
                break;
            }
            i4++;
            i2++;
        }
        return i4 == str.length() - i3;
    }

    public static void loadDependencies(String str, ElfByteChannel elfByteChannel, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        String[] dependencies = getDependencies(str, elfByteChannel);
        LogUtil.d(SoLoader.TAG, Global.LOADING + str + "'s dependencies: " + Arrays.toString(dependencies));
        for (String str2 : dependencies) {
            if (!str2.startsWith(RemoteSettings.FORWARD_SLASH_STRING) && !STANDARD_SYSTEM_LIBS.contains(str2)) {
                SoLoader.loadDependency(str2, i2, threadPolicy);
            }
        }
    }

    private static int parseLibCount(byte[] bArr, int i2, int i3) {
        try {
            return Integer.parseInt(new String(bArr, i2, i3));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static boolean processDepsBytes(byte[] bArr, byte[] bArr2) throws IOException {
        int iVerifyBytesAndGetOffset;
        int libCount;
        if (bArr != null) {
            iVerifyBytesAndGetOffset = verifyBytesAndGetOffset(bArr, bArr2);
            if (iVerifyBytesAndGetOffset == -1) {
                return false;
            }
        } else {
            iVerifyBytesAndGetOffset = 0;
        }
        int iFindNextLine = findNextLine(bArr2, iVerifyBytesAndGetOffset);
        if (iFindNextLine >= bArr2.length || (libCount = parseLibCount(bArr2, iVerifyBytesAndGetOffset, (iFindNextLine - iVerifyBytesAndGetOffset) - 1)) <= 0) {
            return false;
        }
        sPrecomputedDeps = new HashMap(((int) (libCount / 1.0f)) + 1, 1.0f);
        sPrecomputedLibs = new ArrayList(libCount);
        indexDepsBytes(bArr2, iFindNextLine);
        if (sPrecomputedLibs.size() != libCount) {
            return false;
        }
        sEncodedDeps = bArr2;
        sInitialized = true;
        return true;
    }

    @Nullable
    static String[] tryGetDepsFromPrecomputedDeps(String str) {
        int offsetForLib;
        if (sInitialized && str.length() > LIB_PREFIX_SUFFIX_LEN && (offsetForLib = getOffsetForLib(str)) != -1) {
            return getDepsForLibAtOffset(offsetForLib, str.length());
        }
        return null;
    }

    public static boolean useDepsFile(Context context, boolean z2, boolean z3) {
        if (!z2) {
            return useDepsFileFromApkSync(context, z3);
        }
        new Thread(new Runnable() { // from class: com.facebook.soloader.NativeDeps.2
            final /* synthetic */ Context val$context;
            final /* synthetic */ boolean val$extractToDisk;

            AnonymousClass2(Context context2, boolean z32) {
                context = context2;
                z = z32;
            }

            @Override // java.lang.Runnable
            public void run() {
                NativeDeps.sWaitForDepsFileLock.writeLock().lock();
                boolean unused = NativeDeps.sUseDepsFileAsync = true;
                try {
                    NativeDeps.useDepsFileFromApkSync(context, z);
                } finally {
                    int readLockCount = NativeDeps.sWaitForDepsFileLock.getReadLockCount();
                    if (readLockCount >= 3) {
                        LogUtil.w(NativeDeps.LOG_TAG, "NativeDeps initialization finished with " + Integer.toString(readLockCount) + " threads waiting.");
                    }
                    NativeDeps.sWaitForDepsFileLock.writeLock().unlock();
                    boolean unused2 = NativeDeps.sUseDepsFileAsync = false;
                }
            }
        }, "soloader-nativedeps-init").start();
        return true;
    }

    public static boolean useDepsFileFromApkSync(Context context, boolean z2) throws Throwable {
        boolean zInitDeps;
        try {
            zInitDeps = initDeps(context, z2);
        } catch (IOException unused) {
            zInitDeps = false;
        }
        if (!zInitDeps && z2) {
            try {
                NativeDepsUnpacker.ensureNativeDepsAvailable(context);
                zInitDeps = initDeps(context, z2);
            } catch (IOException unused2) {
            }
        }
        if (!zInitDeps) {
            LogUtil.w(LOG_TAG, "Failed to extract native deps from APK, falling back to using MinElf to get library dependencies.");
        }
        return zInitDeps;
    }

    private static int verifyBytesAndGetOffset(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2.length < bArr.length + 4) {
            return -1;
        }
        if (bArr2.length != bArr.length + 4 + ByteBuffer.wrap(bArr2, bArr.length, 4).getInt()) {
            return -1;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return -1;
            }
        }
        return bArr.length + 4;
    }

    private static void verifyUninitialized() {
        if (sInitialized) {
            synchronized (NativeDeps.class) {
                if (sInitialized) {
                    throw new IllegalStateException("Trying to initialize NativeDeps but it was already initialized");
                }
            }
        }
    }
}
