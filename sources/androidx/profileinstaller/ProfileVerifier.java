package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
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
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileVerifier {
    private static final String CUR_PROFILES_BASE_DIR = "/data/misc/profiles/cur/0/";
    private static final String PROFILE_FILE_NAME = "primary.prof";
    private static final String PROFILE_INSTALLED_CACHE_FILE_NAME = "profileInstalled";
    private static final String REF_PROFILES_BASE_DIR = "/data/misc/profiles/ref/";
    private static final String TAG = "ProfileVerifier";
    private static final ResolvableFuture<CompilationStatus> sFuture = ResolvableFuture.create();
    private static final Object SYNC_OBJ = new Object();
    private static CompilationStatus sCompilationStatus = null;

    private ProfileVerifier() {
    }

    public static CompilationStatus writeProfileVerification(Context context) {
        return writeProfileVerification(context, false);
    }

    static CompilationStatus writeProfileVerification(Context context, boolean z2) {
        Cache fromFile;
        CompilationStatus compilationStatus;
        if (!z2 && (compilationStatus = sCompilationStatus) != null) {
            return compilationStatus;
        }
        synchronized (SYNC_OBJ) {
            if (!z2) {
                CompilationStatus compilationStatus2 = sCompilationStatus;
                if (compilationStatus2 != null) {
                    return compilationStatus2;
                }
                int i2 = 0;
                if (Build.VERSION.SDK_INT >= 28 || Build.VERSION.SDK_INT == 30) {
                    return setCompilationStatus(262144, false, false);
                }
                String strOd = C1561oA.od("x-);'s1,5$n/0,\"$&\u001e+e(\u001a\u001aa", (short) (C1580rY.Xd() ^ (-16219)));
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Kd("\u0015#\u001a)'\"\u001eh\u001f,,3%/6p\u000744;-A>", (short) (OY.Xd() ^ 11005))).getMethod(Wg.Zd("\u0001\\yc\u0003\u001b0u\u0010&\u001b=W$", (short) (C1580rY.Xd() ^ (-13758)), (short) (C1580rY.Xd() ^ (-3494))), new Class[0]);
                try {
                    method.setAccessible(true);
                    File file = new File(new File(strOd, (String) method.invoke(context, objArr)), C1561oA.Xd("ORJODV^\u0014WZXP", (short) (C1499aX.Xd() ^ (-24576))));
                    long length = file.length();
                    boolean z3 = file.exists() && length > 0;
                    String strVd = Wg.vd("S\b\b\u001a\u0002N\u0010\u000b\u0010~M\u000e\u000b\u0007\u0001\u0003!\u0019*d\u0014%%`\\Z", (short) (C1499aX.Xd() ^ (-25538)));
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Qg.kd("\u000b\u0017\f\u0019\u0015\u000e\bP\u0005\u0010\u000e\u0013\u0003\u000b\u0010H\\\b\u0006\u000bz\r\b", (short) (FB.Xd() ^ 19719), (short) (FB.Xd() ^ 1145))).getMethod(hg.Vd("NKY4DELAFC+=H?", (short) (C1499aX.Xd() ^ (-17265)), (short) (C1499aX.Xd() ^ (-12718))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        File file2 = new File(new File(strVd, (String) method2.invoke(context, objArr2)), C1561oA.ud("wxnqdtz.oplb", (short) (C1633zX.Xd() ^ (-12539))));
                        long length2 = file2.length();
                        boolean z4 = file2.exists() && length2 > 0;
                        try {
                            long packageLastUpdateTime = getPackageLastUpdateTime(context);
                            Object[] objArr3 = new Object[0];
                            Method method3 = Class.forName(C1561oA.yd("M[N]WRJ\u0015Wd`gU_b\u001d\u001fLHO=QJ", (short) (FB.Xd() ^ 26085))).getMethod(C1561oA.Yd("$#3\u0006*.(7\t/9", (short) (C1633zX.Xd() ^ (-3468))), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                File file3 = new File((File) method3.invoke(context, objArr3), Xg.qd("^a_W[_Y>djlZfgaa", (short) (C1633zX.Xd() ^ (-1952)), (short) (C1633zX.Xd() ^ (-26444))));
                                if (file3.exists()) {
                                    try {
                                        fromFile = Cache.readFromFile(file3);
                                    } catch (IOException unused) {
                                        return setCompilationStatus(131072, z3, z4);
                                    }
                                } else {
                                    fromFile = null;
                                }
                                if (fromFile != null && fromFile.mPackageLastUpdateTime == packageLastUpdateTime && fromFile.mResultCode != 2) {
                                    i2 = fromFile.mResultCode;
                                } else if (z3) {
                                    i2 = 1;
                                } else if (z4) {
                                    i2 = 2;
                                }
                                if (z2 && z4 && i2 != 1) {
                                    i2 = 2;
                                }
                                if (fromFile != null && fromFile.mResultCode == 2 && i2 == 1 && length < fromFile.mInstalledCurrentProfileSize) {
                                    i2 = 3;
                                }
                                Cache cache = new Cache(1, i2, packageLastUpdateTime, length2);
                                if (fromFile == null || !fromFile.equals(cache)) {
                                    try {
                                        cache.writeOnFile(file3);
                                    } catch (IOException unused2) {
                                        i2 = CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                    }
                                }
                                return setCompilationStatus(i2, z3, z4);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                            return setCompilationStatus(65536, z3, z4);
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
            int i22 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
            }
            return setCompilationStatus(262144, false, false);
        }
    }

    private static CompilationStatus setCompilationStatus(int i2, boolean z2, boolean z3) {
        CompilationStatus compilationStatus = new CompilationStatus(i2, z2, z3);
        sCompilationStatus = compilationStatus;
        sFuture.set(compilationStatus);
        return sCompilationStatus;
    }

    private static long getPackageLastUpdateTime(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("ESJYWRN\u0019O\\\\cU_f!7ddk]qn", (short) (C1580rY.Xd() ^ (-30536)))).getMethod(Xg.qd("\u001c\u001b+x)*'% \u001f3)00\u000633:,@=", (short) (FB.Xd() ^ 28804), (short) (FB.Xd() ^ 9885)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            short sXd = (short) (C1499aX.Xd() ^ (-13326));
            short sXd2 = (short) (C1499aX.Xd() ^ (-32013));
            int[] iArr = new int["'\u0003TpI\u0015+DSkH]*\u0001#.\u001ff/\u0015\u0014\u0007\u000e".length()];
            QB qb = new QB("'\u0003TpI\u0015+DSkH]*\u0001#.\u001ff/\u0015\u0014\u0007\u000e");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd3 = (short) (Od.Xd() ^ (-25072));
            short sXd4 = (short) (Od.Xd() ^ (-6067));
            int[] iArr2 = new int["Az\r]\u0012Y-m\u0011@7ARh62\u0019".length()];
            QB qb2 = new QB("Az\r]\u0012Y-m\u0011@7ARh62\u0019");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr2);
                if (Build.VERSION.SDK_INT >= 33) {
                    return Api33Impl.getPackageInfo(packageManager, context).lastUpdateTime;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1626yg.Ud("1\u001be3@^9\u0002e\u0014='K,q9\n\u001f\u0010z\u000e?\u0015", (short) (FB.Xd() ^ 27681), (short) (FB.Xd() ^ 30619))).getMethod(Ig.wd("Apm)J\u0010DQ\u0019fQF$\u0012", (short) (C1607wl.Xd() ^ 8235)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    Object[] objArr4 = {(String) method3.invoke(context, objArr3), 0};
                    Method method4 = Class.forName(EO.Od("L\u0001fZA\t&\u0001usnTpy*G78\"j;fVR\u0018@G5Fh\u00112a", (short) (C1607wl.Xd() ^ 29022))).getMethod(C1593ug.zd("BAQ.@CLCJI.TMW", (short) (C1633zX.Xd() ^ (-4390)), (short) (C1633zX.Xd() ^ (-20276))), Class.forName(C1561oA.Qd("?5I3~<0<4y\u001e>;15-", (short) (FB.Xd() ^ 5954))), Integer.TYPE);
                    try {
                        method4.setAccessible(true);
                        return ((PackageInfo) method4.invoke(packageManager, objArr4)).lastUpdateTime;
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
    }

    public static ListenableFuture<CompilationStatus> getCompilationStatusAsync() {
        return sFuture;
    }

    static class Cache {
        private static final int SCHEMA = 1;
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        Cache(int i2, int i3, long j2, long j3) {
            this.mSchema = i2;
            this.mResultCode = i3;
            this.mPackageLastUpdateTime = j2;
            this.mInstalledCurrentProfileSize = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Cache)) {
                return false;
            }
            Cache cache = (Cache) obj;
            return this.mResultCode == cache.mResultCode && this.mPackageLastUpdateTime == cache.mPackageLastUpdateTime && this.mSchema == cache.mSchema && this.mInstalledCurrentProfileSize == cache.mInstalledCurrentProfileSize;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.mResultCode), Long.valueOf(this.mPackageLastUpdateTime), Integer.valueOf(this.mSchema), Long.valueOf(this.mInstalledCurrentProfileSize));
        }

        void writeOnFile(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.mSchema);
                dataOutputStream.writeInt(this.mResultCode);
                dataOutputStream.writeLong(this.mPackageLastUpdateTime);
                dataOutputStream.writeLong(this.mInstalledCurrentProfileSize);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        static Cache readFromFile(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static class CompilationStatus {
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE = 1;
        public static final int RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING = 3;
        public static final int RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ = 131072;
        public static final int RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE = 196608;
        private static final int RESULT_CODE_ERROR_CODE_BIT_SHIFT = 16;
        public static final int RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST = 65536;
        public static final int RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION = 262144;
        public static final int RESULT_CODE_NO_PROFILE = 0;
        public static final int RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION = 2;
        private final boolean mHasCurrentProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        CompilationStatus(int i2, boolean z2, boolean z3) {
            this.mResultCode = i2;
            this.mHasCurrentProfile = z3;
            this.mHasReferenceProfile = z2;
        }

        public int getProfileInstallResultCode() {
            return this.mResultCode;
        }

        public boolean isCompiledWithProfile() {
            return this.mHasReferenceProfile;
        }

        public boolean hasProfileEnqueuedForCompilation() {
            return this.mHasCurrentProfile;
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
        }

        static PackageInfo getPackageInfo(PackageManager packageManager, Context context) throws Throwable {
            short sXd = (short) (Od.Xd() ^ (-20902));
            int[] iArr = new int["esjywrn9o||\u0004u\u007f\u0007AW\u0005\u0005\f}\u0012\u000f".length()];
            QB qb = new QB("esjywrn9o||\u0004u\u007f\u0007AW\u0005\u0005\f}\u0012\u000f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.vd("qn\u0001[ghshifRdkb", (short) (Od.Xd() ^ (-16905))), new Class[0]);
            try {
                method.setAccessible(true);
                String str = (String) method.invoke(context, objArr);
                PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(0L);
                short sXd2 = (short) (Od.Xd() ^ (-20117));
                short sXd3 = (short) (Od.Xd() ^ (-15434));
                int[] iArr2 = new int["lxmzvoi2fqotdlq*kg'HXY`UZW>Q]OTQ]".length()];
                QB qb2 = new QB("lxmzvoi2fqotdlq*kg'HXY`UZW>Q]OTQ]");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(hg.Vd("TJ^H\u0014QEQI\u000f3SPFJB", (short) (C1580rY.Xd() ^ (-18149)), (short) (C1580rY.Xd() ^ (-19113))));
                short sXd4 = (short) (OY.Xd() ^ 6413);
                int[] iArr3 = new int["XdYfb[U\u001eR][`PX]\u0016WS\u00134DELAFC*=I;@=Iy%56=274\u0017;2:\u00105).9".length()];
                QB qb3 = new QB("XdYfb[U\u001eR][`PX]\u0016WS\u00134DELAFC*=I;@=Iy%56=274\u0017;2:\u00105).9");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3));
                    i4++;
                }
                clsArr[1] = Class.forName(new String(iArr3, 0, i4));
                Object[] objArr2 = {str, packageInfoFlagsOf};
                Method method2 = cls.getMethod(C1561oA.yd("YXdAORWNa`Ag\\f", (short) (OY.Xd() ^ 15726)), clsArr);
                try {
                    method2.setAccessible(true);
                    return (PackageInfo) method2.invoke(packageManager, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }
}
