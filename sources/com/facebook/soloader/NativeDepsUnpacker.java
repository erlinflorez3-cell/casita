package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.drew.metadata.exif.makernotes.SonyType1MakernoteDirectory;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeDepsUnpacker {
    private static final String APK_IDENTIFIER_FILE_NAME = "apk_id";
    private static final String LOCK_FILE_NAME = "lock";
    private static final String NATIVE_DEPS_DIR_NAME = "native_deps";
    private static final String NATIVE_DEPS_FILE_APK_PATH = "assets/native_deps.txt";
    private static final String NATIVE_DEPS_FILE_NAME = "deps";
    private static final byte STATE_CLEAN = 1;
    private static final byte STATE_DIRTY = 0;
    private static final String STATE_FILE_NAME = "state";

    private NativeDepsUnpacker() {
    }

    private static boolean apkChanged(Context context, File file) throws Throwable {
        byte[] existingApkIdentifier = getExistingApkIdentifier(context, file);
        byte[] apkIdentifier = getApkIdentifier(context);
        if (existingApkIdentifier == null || apkIdentifier == null || existingApkIdentifier.length != apkIdentifier.length) {
            return true;
        }
        return !Arrays.equals(existingApkIdentifier, apkIdentifier);
    }

    private static boolean ensureDirExists(File file) {
        if (file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdir();
        }
        return file.isDirectory();
    }

    public static void ensureNativeDepsAvailable(Context context) throws IOException {
        File nativeDepsDir = getNativeDepsDir(context);
        if (ensureDirExists(nativeDepsDir)) {
            FileLocker orCreateLockOnDir = SysUtil.getOrCreateLockOnDir(nativeDepsDir, new File(nativeDepsDir, "lock"));
            try {
                byte state = readState(nativeDepsDir);
                if (state == 1 && apkChanged(context, nativeDepsDir)) {
                    state = 0;
                }
                if (state == 1) {
                    if (orCreateLockOnDir != null) {
                        orCreateLockOnDir.close();
                        return;
                    }
                    return;
                }
                writeState(nativeDepsDir, (byte) 0);
                extractNativeDeps(context);
                writeApkIdentifier(context, nativeDepsDir);
                SysUtil.fsyncAll(nativeDepsDir);
                writeState(nativeDepsDir, (byte) 1);
                if (orCreateLockOnDir != null) {
                    orCreateLockOnDir.close();
                }
            } catch (Throwable th) {
                if (orCreateLockOnDir != null) {
                    try {
                        orCreateLockOnDir.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    private static void extractNativeDeps(Context context) throws Throwable {
        byte[] nativeDepsFromApk = readNativeDepsFromApk(context);
        byte[] apkIdentifier = getApkIdentifier(context);
        int length = nativeDepsFromApk.length;
        RandomAccessFile randomAccessFile = new RandomAccessFile(getNativeDepsFilePath(context), "rw");
        try {
            randomAccessFile.write(apkIdentifier);
            randomAccessFile.writeInt(length);
            randomAccessFile.write(nativeDepsFromApk);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] getApkIdentifier(Context context) throws Throwable {
        Object obj;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd(":F;HD=7\u007f4?=B2:?w\f75:*<7", (short) (Od.Xd() ^ (-3884)), (short) (Od.Xd() ^ (-763)))).getMethod(hg.Vd("\t\u0006\u0014_\u000e\r\b\u0004|y\f\u007f\u0005\u0003\\\u0001w\u007f", (short) (C1580rY.Xd() ^ (-2472)), (short) (C1580rY.Xd() ^ (-1497))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strUd = C1561oA.ud("\u001f+ -)\"\u001cd\u0019$\"'\u0017\u001f$\\\u001e\u001aYk\u001a\u0019\u0014\u0010\t\u0006\u0018\f\u0011\u000fh\r\u0004\f", (short) (C1580rY.Xd() ^ (-7471)));
            String strYd = C1561oA.yd("upuqijHll", (short) (C1499aX.Xd() ^ (-29769)));
            try {
                Class<?> cls = Class.forName(strUd);
                Field field = 1 != 0 ? cls.getField(strYd) : cls.getDeclaredField(strYd);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return SysUtil.makeApkDepBlock(new File((String) obj), context);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Nullable
    private static byte[] getExistingApkIdentifier(Context context, File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(file, APK_IDENTIFIER_FILE_NAME), "rw");
        try {
            int length = (int) randomAccessFile.length();
            byte[] bArr = new byte[length];
            if (randomAccessFile.read(bArr) != length) {
                randomAccessFile.close();
                return null;
            }
            randomAccessFile.close();
            return bArr;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static File getNativeDepsDir(Context context) throws Throwable {
        Object obj;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u0015\"\")\u001b%,f|**1#74", (short) (ZN.Xd() ^ 19489))).getMethod(Xg.qd("~}\u000e[\f\r\n\b\u0003\u0002\u0016\f\u0013\u0013n\u0015\u000e\u0018", (short) (C1499aX.Xd() ^ (-797)), (short) (C1499aX.Xd() ^ (-24388))), new Class[0]);
        try {
            method.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method.invoke(context, objArr);
            String strWd = Jg.Wd("8AR J[U<\u001dd~A!E\u0005]K\b!oNk\":!Z\r9lJ`\u001fF\n", (short) (FB.Xd() ^ SonyType1MakernoteDirectory.TAG_CONTRAST), (short) (FB.Xd() ^ 16905));
            short sXd = (short) (C1580rY.Xd() ^ (-12520));
            short sXd2 = (short) (C1580rY.Xd() ^ (-3319));
            int[] iArr = new int["(\u0016MtY\u0011\"".length()];
            QB qb = new QB("(\u0016MtY\u0011\"");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            String str = new String(iArr, 0, i2);
            try {
                Class<?> cls = Class.forName(strWd);
                Field field = 1 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            return new File((String) obj, C1626yg.Ud("d-Ts\u001fO@\u0001B\u001a\u001c", (short) (C1580rY.Xd() ^ (-26773)), (short) (C1580rY.Xd() ^ (-21366))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static File getNativeDepsFilePath(Context context) {
        return new File(getNativeDepsDir(context), NATIVE_DEPS_FILE_NAME);
    }

    static byte[] readAllBytes(InputStream inputStream, int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                throw new EOFException("EOF found unexpectedly");
            }
            i3 += i4;
            if (i3 > i2) {
                throw new IllegalStateException("Read more bytes than expected");
            }
        }
        return bArr;
    }

    static byte[] readNativeDepsFromApk(Context context) throws IOException {
        Object obj;
        Object[] objArr;
        Method method;
        Class<?> cls = Class.forName(Ig.wd("\\4wy.s\u000fgvVO;}\u0005b}Z|S`\nS\u007f", (short) (FB.Xd() ^ 27102)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-29799));
        int[] iArr = new int["/]\u001f\bf3~l\u0011?Pg\u001c\u0015\u0018[\b\u001f".length()];
        QB qb = new QB("/]\u001f\bf3~l\u0011?Pg\u001c\u0015\u0018[\b\u001f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method2.setAccessible(true);
            ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(context, objArr2);
            String strQd = C1561oA.Qd("NZO\\XQK\u0014HSQVFNS\fMI\t\u001bIHC?85G;@>\u0018<3;", (short) (Od.Xd() ^ (-6233)));
            short sXd2 = (short) (C1580rY.Xd() ^ (-3932));
            short sXd3 = (short) (C1580rY.Xd() ^ (-32632));
            int[] iArr2 = new int["1.53%(\b.8".length()];
            QB qb2 = new QB("1.53%(\b.8");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                i3++;
            }
            String str = new String(iArr2, 0, i3);
            try {
                Class<?> cls2 = Class.forName(strQd);
                Field field = 1 != 0 ? cls2.getField(str) : cls2.getDeclaredField(str);
                field.setAccessible(true);
                obj = field.get(applicationInfo);
            } catch (Throwable th) {
                obj = null;
            }
            File file = new File((String) obj);
            short sXd4 = (short) (C1633zX.Xd() ^ (-28849));
            int[] iArr3 = new int["\u0010\u0006\u001a\u0004O\u0016\u0014\b\nJ\u0016\u0004\nFq\u007f\u0006Z|~v".length()];
            QB qb3 = new QB("\u0010\u0006\u001a\u0004O\u0016\u0014\b\nJ\u0016\u0004\nFq\u007f\u0006Z|~v");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
                i4++;
            }
            Object[] objArr3 = {file};
            Constructor<?> constructor = Class.forName(new String(iArr3, 0, i4)).getConstructor(Class.forName(C1561oA.Kd("\b\u007f\u0016\u0002O\f\u0013Rk\u0010\u0014\u000e", (short) (Od.Xd() ^ (-12978)))));
            try {
                constructor.setAccessible(true);
                ZipFile zipFile = (ZipFile) constructor.newInstance(objArr3);
                short sXd5 = (short) (C1499aX.Xd() ^ (-30233));
                short sXd6 = (short) (C1499aX.Xd() ^ (-18814));
                int[] iArr4 = new int["4\u000f\u007fmmP|8\u001c7\u0019^A$\u0015\u000f\n\u001aD\u007fs\u001c".length()];
                QB qb4 = new QB("4\u000f\u007fmmP|8\u001c7\u0019^A$\u0015\u000f\n\u001aD\u007fs\u001c");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(((i5 * sXd6) ^ sXd5) + xuXd4.CK(iKK4));
                    i5++;
                }
                String str2 = new String(iArr4, 0, i5);
                try {
                    Class<?> cls3 = Class.forName(C1561oA.Xd("( 6\"o88.2tB2:x&6>\u00159=7", (short) (FB.Xd() ^ 12749)));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.forName(Wg.vd("\u001f\u0015-\u0017^\u001c\u0014 \u0014Y\u0002\"\u001b\u0011\u0019\u0011", (short) (FB.Xd() ^ 21345)));
                    objArr = new Object[]{str2};
                    short sXd7 = (short) (C1607wl.Xd() ^ 22537);
                    short sXd8 = (short) (C1607wl.Xd() ^ 26932);
                    int[] iArr5 = new int["a^l<difl".length()];
                    QB qb5 = new QB("a^l<difl");
                    int i6 = 0;
                    while (qb5.YK()) {
                        int iKK5 = qb5.KK();
                        Xu xuXd5 = Xu.Xd(iKK5);
                        iArr5[i6] = xuXd5.fK(((sXd7 + i6) + xuXd5.CK(iKK5)) - sXd8);
                        i6++;
                    }
                    method = cls3.getMethod(new String(iArr5, 0, i6), clsArr2);
                } catch (Throwable th2) {
                    try {
                        Object[] objArr4 = new Object[0];
                        Method method3 = Class.forName(EO.Od("w@cm[P3\u0010q\u0018^/\u0001<D6\n]I$[", (short) (OY.Xd() ^ 25908))).getMethod(C1561oA.Qd("MUWZK", (short) (FB.Xd() ^ 20392)), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            method3.invoke(zipFile, objArr4);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
                try {
                    method.setAccessible(true);
                    ZipEntry zipEntry = (ZipEntry) method.invoke(zipFile, objArr);
                    if (zipEntry == null) {
                        short sXd9 = (short) (OY.Xd() ^ 2556);
                        int[] iArr6 = new int["Y8n\u007f\u0006\u001c@\u0018e\u001fa\r&$]\u00116Up\b?_D?C\u0014!\u0016|p?^\u000eo'|lM".length()];
                        QB qb6 = new QB("Y8n\u007f\u0006\u001c@\u0018e\u001fa\r&$]\u00116Up\b?_D?C\u0014!\u0016|p?^\u000eo'|lM");
                        int i7 = 0;
                        while (qb6.YK()) {
                            int iKK6 = qb6.KK();
                            Xu xuXd6 = Xu.Xd(iKK6);
                            iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - (C1561oA.Xd[i7 % C1561oA.Xd.length] ^ (sXd9 + i7)));
                            i7++;
                        }
                        throw new FileNotFoundException(new String(iArr6, 0, i7));
                    }
                    Class<?> cls4 = Class.forName(hg.Vd("\u000f\u0005\u0019\u0003N\u0015\u0013\u0007\tI\u0015\u0003\tEp~\u0005Y{}u", (short) (C1499aX.Xd() ^ (-18033)), (short) (C1499aX.Xd() ^ (-19828))));
                    Class<?>[] clsArr3 = new Class[1];
                    short sXd10 = (short) (ZN.Xd() ^ 14306);
                    int[] iArr7 = new int["F<P:\u0006LJ>@\u0001L:@|(6<\u00108=:@".length()];
                    QB qb7 = new QB("F<P:\u0006LJ>@\u0001L:@|(6<\u00108=:@");
                    int i8 = 0;
                    while (qb7.YK()) {
                        int iKK7 = qb7.KK();
                        Xu xuXd7 = Xu.Xd(iKK7);
                        iArr7[i8] = xuXd7.fK(sXd10 + i8 + xuXd7.CK(iKK7));
                        i8++;
                    }
                    clsArr3[0] = Class.forName(new String(iArr7, 0, i8));
                    Object[] objArr5 = {zipEntry};
                    short sXd11 = (short) (FB.Xd() ^ 11186);
                    int[] iArr8 = new int["ro\u0002U}~\u0007\u0005f\u0007\byx\u0004".length()];
                    QB qb8 = new QB("ro\u0002U}~\u0007\u0005f\u0007\byx\u0004");
                    int i9 = 0;
                    while (qb8.YK()) {
                        int iKK8 = qb8.KK();
                        Xu xuXd8 = Xu.Xd(iKK8);
                        iArr8[i9] = xuXd8.fK(xuXd8.CK(iKK8) - (sXd11 ^ i9));
                        i9++;
                    }
                    Method method4 = cls4.getMethod(new String(iArr8, 0, i9), clsArr3);
                    try {
                        method4.setAccessible(true);
                        InputStream inputStream = (InputStream) method4.invoke(zipFile, objArr5);
                        try {
                            if (inputStream == null) {
                                throw new FileNotFoundException(C1626yg.Ud("\u001bM)t&\u0017\u001d\u0003Cg\u001c;\tA~8?+@\u001cSU/NN,\f{s\u001aKQ`\u001ci@ ~\u0001(", (short) (Od.Xd() ^ (-1119)), (short) (Od.Xd() ^ (-13428))));
                            }
                            Class<?> cls5 = Class.forName(C1561oA.Yd("bZp\\*rrhl/|lt3`pxNx\u007f~\u0007", (short) (C1580rY.Xd() ^ (-9213))));
                            Class<?>[] clsArr4 = new Class[0];
                            Object[] objArr6 = new Object[0];
                            short sXd12 = (short) (C1607wl.Xd() ^ 17151);
                            short sXd13 = (short) (C1607wl.Xd() ^ 8066);
                            int[] iArr9 = new int["?>N.EWC".length()];
                            QB qb9 = new QB("?>N.EWC");
                            int i10 = 0;
                            while (qb9.YK()) {
                                int iKK9 = qb9.KK();
                                Xu xuXd9 = Xu.Xd(iKK9);
                                iArr9[i10] = xuXd9.fK((xuXd9.CK(iKK9) - (sXd12 + i10)) + sXd13);
                                i10++;
                            }
                            Method method5 = cls5.getMethod(new String(iArr9, 0, i10), clsArr4);
                            try {
                                method5.setAccessible(true);
                                byte[] allBytes = readAllBytes(inputStream, (int) ((Long) method5.invoke(zipEntry, objArr6)).longValue());
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                short sXd14 = (short) (Od.Xd() ^ (-7246));
                                short sXd15 = (short) (Od.Xd() ^ (-6729));
                                int[] iArr10 = new int["CrDk\u0005)d\u0016eCHsGaJ\u0016)\u001bz6{".length()];
                                QB qb10 = new QB("CrDk\u0005)d\u0016eCHsGaJ\u0016)\u001bz6{");
                                int i11 = 0;
                                while (qb10.YK()) {
                                    int iKK10 = qb10.KK();
                                    Xu xuXd10 = Xu.Xd(iKK10);
                                    iArr10[i11] = xuXd10.fK(xuXd10.CK(iKK10) - ((i11 * sXd15) ^ sXd14));
                                    i11++;
                                }
                                Class<?> cls6 = Class.forName(new String(iArr10, 0, i11));
                                Class<?>[] clsArr5 = new Class[0];
                                Object[] objArr7 = new Object[0];
                                short sXd16 = (short) (C1499aX.Xd() ^ (-12044));
                                short sXd17 = (short) (C1499aX.Xd() ^ (-30161));
                                int[] iArr11 = new int["\r,H``".length()];
                                QB qb11 = new QB("\r,H``");
                                int i12 = 0;
                                while (qb11.YK()) {
                                    int iKK11 = qb11.KK();
                                    Xu xuXd11 = Xu.Xd(iKK11);
                                    iArr11[i12] = xuXd11.fK(xuXd11.CK(iKK11) - (C1561oA.Xd[i12 % C1561oA.Xd.length] ^ ((i12 * sXd17) + sXd16)));
                                    i12++;
                                }
                                Method method6 = cls6.getMethod(new String(iArr11, 0, i12), clsArr5);
                                try {
                                    method6.setAccessible(true);
                                    method6.invoke(zipFile, objArr7);
                                    return allBytes;
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
                    Object[] objArr42 = new Object[0];
                    Method method32 = Class.forName(EO.Od("w@cm[P3\u0010q\u0018^/\u0001<D6\n]I$[", (short) (OY.Xd() ^ 25908))).getMethod(C1561oA.Qd("MUWZK", (short) (FB.Xd() ^ 20392)), new Class[0]);
                    method32.setAccessible(true);
                    method32.invoke(zipFile, objArr42);
                    throw th2;
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            } catch (InvocationTargetException e7) {
                throw e7.getCause();
            }
        } catch (InvocationTargetException e8) {
            throw e8.getCause();
        }
    }

    static byte[] readNativeDepsFromDisk(Context context) throws IOException {
        File nativeDepsFilePath = getNativeDepsFilePath(context);
        FileInputStream fileInputStream = new FileInputStream(nativeDepsFilePath);
        try {
            byte[] allBytes = readAllBytes(fileInputStream, (int) nativeDepsFilePath.length());
            fileInputStream.close();
            return allBytes;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte readState(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(file, "state"), "rw");
        byte b2 = 0;
        try {
            byte b3 = randomAccessFile.readByte();
            if (b3 == 1) {
                b2 = b3;
            }
        } catch (EOFException unused) {
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        randomAccessFile.close();
        return b2;
    }

    private static void writeApkIdentifier(Context context, File file) throws Throwable {
        File file2 = new File(file, APK_IDENTIFIER_FILE_NAME);
        byte[] apkIdentifier = getApkIdentifier(context);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
        try {
            randomAccessFile.write(apkIdentifier);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void writeState(File file, byte b2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(file, "state"), "rw");
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b2);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
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
    }
}
