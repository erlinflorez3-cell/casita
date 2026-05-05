package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
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
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileInstaller {
    public static final int DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST = 2;
    public static final int DIAGNOSTIC_CURRENT_PROFILE_EXISTS = 1;
    public static final int DIAGNOSTIC_PROFILE_IS_COMPRESSED = 5;
    public static final int DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST = 4;
    public static final int DIAGNOSTIC_REF_PROFILE_EXISTS = 3;
    private static final DiagnosticsCallback EMPTY_DIAGNOSTICS = new DiagnosticsCallback() { // from class: androidx.profileinstaller.ProfileInstaller.1
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i2, Object obj) {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i2, Object obj) {
        }
    };
    static final DiagnosticsCallback LOG_DIAGNOSTICS = new DiagnosticsCallback() { // from class: androidx.profileinstaller.ProfileInstaller.2
        static final String TAG = "ProfileInstaller";

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int i2, Object obj) {
            if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 != 5) {
            }
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int i2, Object obj) {
            switch (i2) {
            }
            if (i2 == 6 || i2 == 7 || i2 == 8) {
            }
        }
    };
    private static final String PROFILE_BASE_DIR = "/data/misc/profiles/cur/0";
    private static final String PROFILE_FILE = "primary.prof";
    private static final String PROFILE_INSTALLER_SKIP_FILE_NAME = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";
    private static final String PROFILE_META_LOCATION = "dexopt/baseline.profm";
    private static final String PROFILE_SOURCE_LOCATION = "dexopt/baseline.prof";
    public static final int RESULT_ALREADY_INSTALLED = 2;
    public static final int RESULT_BASELINE_PROFILE_NOT_FOUND = 6;
    public static final int RESULT_BENCHMARK_OPERATION_FAILURE = 15;
    public static final int RESULT_BENCHMARK_OPERATION_SUCCESS = 14;
    public static final int RESULT_BENCHMARK_OPERATION_UNKNOWN = 16;
    public static final int RESULT_DELETE_SKIP_FILE_SUCCESS = 11;
    public static final int RESULT_DESIRED_FORMAT_UNSUPPORTED = 5;
    public static final int RESULT_INSTALL_SKIP_FILE_SUCCESS = 10;
    public static final int RESULT_INSTALL_SUCCESS = 1;
    public static final int RESULT_IO_EXCEPTION = 7;
    public static final int RESULT_META_FILE_REQUIRED_BUT_NOT_FOUND = 9;
    public static final int RESULT_NOT_WRITABLE = 4;
    public static final int RESULT_PARSE_EXCEPTION = 8;
    public static final int RESULT_SAVE_PROFILE_SIGNALLED = 12;
    public static final int RESULT_SAVE_PROFILE_SKIPPED = 13;
    public static final int RESULT_UNSUPPORTED_ART_VERSION = 3;
    private static final String TAG = "ProfileInstaller";

    @Retention(RetentionPolicy.SOURCE)
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void onDiagnosticReceived(int i2, Object obj);

        void onResultReceived(int i2, Object obj);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    private ProfileInstaller() {
    }

    static void result(Executor executor, final DiagnosticsCallback diagnosticsCallback, final int i2, final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                diagnosticsCallback.onResultReceived(i2, obj);
            }
        });
    }

    static void diagnostic(Executor executor, final DiagnosticsCallback diagnosticsCallback, final int i2, final Object obj) {
        executor.execute(new Runnable() { // from class: androidx.profileinstaller.ProfileInstaller$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                diagnosticsCallback.onDiagnosticReceived(i2, obj);
            }
        });
    }

    static boolean hasAlreadyWrittenProfileForThisInstall(PackageInfo packageInfo, File file, DiagnosticsCallback diagnosticsCallback) {
        File file2 = new File(file, PROFILE_INSTALLER_SKIP_FILE_NAME);
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j2 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z2 = j2 == packageInfo.lastUpdateTime;
                if (z2) {
                    diagnosticsCallback.onResultReceived(2, null);
                }
                return z2;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    static void noteProfileWrittenFor(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, PROFILE_INSTALLER_SKIP_FILE_NAME)));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    static boolean deleteProfileWrittenFor(File file) {
        return new File(file, PROFILE_INSTALLER_SKIP_FILE_NAME).delete();
    }

    private static boolean transcodeAndWrite(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, DiagnosticsCallback diagnosticsCallback) {
        DeviceProfileWriter deviceProfileWriter = new DeviceProfileWriter(assetManager, executor, diagnosticsCallback, str2, PROFILE_SOURCE_LOCATION, PROFILE_META_LOCATION, new File(new File(PROFILE_BASE_DIR, str), PROFILE_FILE));
        if (!deviceProfileWriter.deviceAllowsProfileInstallerAotWrites()) {
            return false;
        }
        boolean zWrite = deviceProfileWriter.read().transcodeIfNeeded().write();
        if (zWrite) {
            noteProfileWrittenFor(packageInfo, file);
        }
        return zWrite;
    }

    public static void writeProfile(Context context) throws Throwable {
        writeProfile(context, new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), EMPTY_DIAGNOSTICS);
    }

    public static void writeProfile(Context context, Executor executor, DiagnosticsCallback diagnosticsCallback) throws Throwable {
        writeProfile(context, executor, diagnosticsCallback, false);
    }

    static void writeProfile(Context context, Executor executor, DiagnosticsCallback diagnosticsCallback, boolean z2) throws Throwable {
        Object obj;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("qe3BA\u0002:P+!/.G&0wqrS8\u000e\u000e^", (short) (C1580rY.Xd() ^ (-21240)), (short) (C1580rY.Xd() ^ (-2014)))).getMethod(Ig.wd("Eli&M)9U\u0019fs6lw6\u00038^uO\u0004", (short) (C1499aX.Xd() ^ (-21735))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(EO.Od("\u0012Qu(\u00053\u000eP,xy\u001e9Hb6\bFmOTA\r", (short) (C1633zX.Xd() ^ (-23619)))).getMethod(C1561oA.Qd("ur\u0001[klshmjRdof", (short) (C1499aX.Xd() ^ (-22849))), new Class[0]);
            try {
                method2.setAccessible(true);
                String str = (String) method2.invoke(context2, objArr2);
                short sXd = (short) (C1607wl.Xd() ^ 13766);
                short sXd2 = (short) (C1607wl.Xd() ^ 32631);
                int[] iArr = new int["R`Wfd_[&\\iipbls.Dqqxj~{".length()];
                QB qb = new QB("R`Wfd_[&\\iipbls.Dqqxj~{");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                    i2++;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("OLZ&TSNJC@RFKI#G>F", (short) (C1633zX.Xd() ^ (-32110))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method3.invoke(context2, objArr3);
                    Object[] objArr4 = new Object[0];
                    Method method4 = Class.forName(C1561oA.Kd("]kbqojf1gtt{mw~9O||\u0004u\n\u0007", (short) (Od.Xd() ^ (-30313)))).getMethod(Wg.Zd("?!\u0002@\u0005V<\\-", (short) (C1607wl.Xd() ^ 12277), (short) (C1607wl.Xd() ^ OlympusMakernoteDirectory.TAG_FOCUS_INFO)), new Class[0]);
                    try {
                        method4.setAccessible(true);
                        AssetManager assetManager = (AssetManager) method4.invoke(context2, objArr4);
                        short sXd3 = (short) (C1633zX.Xd() ^ (-19885));
                        int[] iArr2 = new int["M[Ra_ZV!Wddk]gn)lj,@pqnlgfzpwwSyr|".length()];
                        QB qb2 = new QB("M[Ra_ZV!Wddk]gn)lj,@pqnlgfzpwwSyr|");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
                            i3++;
                        }
                        String str2 = new String(iArr2, 0, i3);
                        short sXd4 = (short) (C1633zX.Xd() ^ (-2636));
                        int[] iArr3 = new int["\u0016\u0013\u001a\u0018\n\rl\u0013\u001d".length()];
                        QB qb3 = new QB("\u0016\u0013\u001a\u0018\n\rl\u0013\u001d");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK((sXd4 ^ i4) + xuXd3.CK(iKK3));
                            i4++;
                        }
                        String str3 = new String(iArr3, 0, i4);
                        try {
                            Class<?> cls = Class.forName(str2);
                            Field field = 1 != 0 ? cls.getField(str3) : cls.getDeclaredField(str3);
                            field.setAccessible(true);
                            obj = field.get(applicationInfo);
                        } catch (Throwable th) {
                            obj = null;
                        }
                        String name = new File((String) obj).getName();
                        short sXd5 = (short) (C1633zX.Xd() ^ (-19993));
                        short sXd6 = (short) (C1633zX.Xd() ^ (-31080));
                        int[] iArr4 = new int["nzo|xqk4hsqvfns,@kin^pk".length()];
                        QB qb4 = new QB("nzo|xqk4hsqvfns,@kin^pk");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(((sXd5 + i5) + xuXd4.CK(iKK4)) - sXd6);
                            i5++;
                        }
                        Object[] objArr5 = new Object[0];
                        Method method5 = Class.forName(new String(iArr4, 0, i5)).getMethod(hg.Vd("!\u001e,\u0007\u0017\u0018\u001f\u0014\u0019\u0016|\u0010\u001c\u000e\u0013\u0010\u001c", (short) (C1633zX.Xd() ^ (-31674)), (short) (C1633zX.Xd() ^ (-29695))), new Class[0]);
                        try {
                            method5.setAccessible(true);
                            PackageManager packageManager = (PackageManager) method5.invoke(context, objArr5);
                            boolean z3 = false;
                            try {
                                Class<?> cls2 = Class.forName(C1561oA.ud("\r\u0019\u000e\u001b\u0017\u0010\nR\u0007\u0012\u0010\u0015\u0005\r\u0012J\f\bGhxy\u0001uzw^q}otq}", (short) (Od.Xd() ^ (-7129))));
                                Class<?>[] clsArr = new Class[2];
                                clsArr[0] = Class.forName(C1561oA.yd("vl\u0001j>{o{{Ae\u0006\u000b\u0001\u0005|", (short) (C1580rY.Xd() ^ (-30686))));
                                clsArr[1] = Integer.TYPE;
                                Object[] objArr6 = {str, 0};
                                Method method6 = cls2.getMethod(C1561oA.Yd("YXhEWZcZa`Ekdn", (short) (C1499aX.Xd() ^ (-3301))), clsArr);
                                try {
                                    method6.setAccessible(true);
                                    PackageInfo packageInfo = (PackageInfo) method6.invoke(packageManager, objArr6);
                                    Object[] objArr7 = new Object[0];
                                    Method method7 = Class.forName(Xg.qd("=KBQOJF\u0011GTT[MW^\u0019/\\\\cUif", (short) (OY.Xd() ^ 16064), (short) (OY.Xd() ^ 5353))).getMethod(Jg.Wd("\\KH\u0013#\u0017\u000e\u0005Nd[", (short) (Od.Xd() ^ (-3216)), (short) (Od.Xd() ^ (-25482))), new Class[0]);
                                    try {
                                        method7.setAccessible(true);
                                        File file = (File) method7.invoke(context, objArr7);
                                        ZO.xd("=Y$i{|\u000e[|7F%1\u001d~j", (short) (OY.Xd() ^ 30213), (short) (OY.Xd() ^ 1151));
                                        if (z2 || !hasAlreadyWrittenProfileForThisInstall(packageInfo, file, diagnosticsCallback)) {
                                            StringBuilder sb = new StringBuilder(C1561oA.Qd("`\u0005\t\tt~}y}u-|}yoqsk%jrt!", (short) (ZN.Xd() ^ 12352)));
                                            Class<?> cls3 = Class.forName(C1593ug.zd("p~u\u0005\u0003}yDz\b\b\u000f\u0001\u000b\u0012Lb\u0010\u0010\u0017\t\u001d\u001a", (short) (C1607wl.Xd() ^ 26), (short) (C1607wl.Xd() ^ 26208)));
                                            Class<?>[] clsArr2 = new Class[0];
                                            Object[] objArr8 = new Object[0];
                                            short sXd7 = (short) (C1580rY.Xd() ^ (-2443));
                                            int[] iArr5 = new int["HES.>?F;@=%7B9".length()];
                                            QB qb5 = new QB("HES.>?F;@=%7B9");
                                            int i6 = 0;
                                            while (qb5.YK()) {
                                                int iKK5 = qb5.KK();
                                                Xu xuXd5 = Xu.Xd(iKK5);
                                                iArr5[i6] = xuXd5.fK(sXd7 + sXd7 + i6 + xuXd5.CK(iKK5));
                                                i6++;
                                            }
                                            Method method8 = cls3.getMethod(new String(iArr5, 0, i6), clsArr2);
                                            try {
                                                method8.setAccessible(true);
                                                sb.append((String) method8.invoke(context, objArr8)).toString();
                                                if (transcodeAndWrite(assetManager, str, packageInfo, file, name, executor, diagnosticsCallback) && z2) {
                                                    z3 = true;
                                                }
                                                ProfileVerifier.writeProfileVerification(context, z3);
                                                return;
                                            } catch (InvocationTargetException e2) {
                                                throw e2.getCause();
                                            }
                                        }
                                        StringBuilder sb2 = new StringBuilder(C1626yg.Ud("\u007fEX&%\bb\u0017G=r(\nJq#A\u00049=eA\u000fuw6\r'\u001dF\u0004zn\u001e", (short) (Od.Xd() ^ (-18364)), (short) (Od.Xd() ^ (-15831))));
                                        Object[] objArr9 = new Object[0];
                                        Method method9 = Class.forName(Ig.wd("fM\u000fw+GhhB=<&GDD^Nb(X\u000ecC", (short) (C1499aX.Xd() ^ (-22066)))).getMethod(EO.Od("n\u001e\u001bS\u0015s\u0014\"vE(!w}", (short) (ZN.Xd() ^ 21392)), new Class[0]);
                                        try {
                                            method9.setAccessible(true);
                                            sb2.append((String) method9.invoke(context, objArr9)).toString();
                                            ProfileVerifier.writeProfileVerification(context, false);
                                        } catch (InvocationTargetException e3) {
                                            throw e3.getCause();
                                        }
                                    } catch (InvocationTargetException e4) {
                                        throw e4.getCause();
                                    }
                                } catch (InvocationTargetException e5) {
                                    throw e5.getCause();
                                }
                            } catch (PackageManager.NameNotFoundException e6) {
                                diagnosticsCallback.onResultReceived(7, e6);
                                ProfileVerifier.writeProfileVerification(context, false);
                            }
                        } catch (InvocationTargetException e7) {
                            throw e7.getCause();
                        }
                    } catch (InvocationTargetException e8) {
                        throw e8.getCause();
                    }
                } catch (InvocationTargetException e9) {
                    throw e9.getCause();
                }
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        } catch (InvocationTargetException e11) {
            throw e11.getCause();
        }
    }

    static void writeSkipFile(Context context, Executor executor, DiagnosticsCallback diagnosticsCallback) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 19333);
        int[] iArr = new int["\u0004\u0012\t\u0018\u0016\u0011\rW\u000e\u001b\u001b\"\u0014\u001e%_u##*\u001c0-".length()];
        QB qb = new QB("\u0004\u0012\t\u0018\u0016\u0011\rW\u000e\u001b\u001b\"\u0014\u001e%_u##*\u001c0-");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1580rY.Xd() ^ (-3411));
        short sXd3 = (short) (C1580rY.Xd() ^ (-29119));
        int[] iArr2 = new int["h}A=~2eu\"O\u0017#Z\rqQ\u0003 D\u00075".length()];
        QB qb2 = new QB("h}A=~2eu\"O\u0017#Z\rqQ\u0003 D\u00075");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Xd("jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\n\u0011\u0003\u0017\u0014", (short) (Od.Xd() ^ (-14927)))).getMethod(Wg.vd("DAO*:;B7LI1CNE", (short) (ZN.Xd() ^ 23080)), new Class[0]);
            try {
                method2.setAccessible(true);
                String str = (String) method2.invoke(context2, objArr2);
                short sXd4 = (short) (C1633zX.Xd() ^ (-23667));
                short sXd5 = (short) (C1633zX.Xd() ^ (-7173));
                int[] iArr3 = new int["LXMZVOI\u0012FQOTDLQ\n\u001eIGL<NI".length()];
                QB qb3 = new QB("LXMZVOI\u0012FQOTDLQ\n\u001eIGL<NI");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(((sXd4 + i4) + xuXd3.CK(iKK3)) - sXd5);
                    i4++;
                }
                Class<?> cls2 = Class.forName(new String(iArr3, 0, i4));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd6 = (short) (Od.Xd() ^ (-7967));
                short sXd7 = (short) (Od.Xd() ^ (-5693));
                int[] iArr4 = new int["52@\u001b+,3(-*\u0011$0\"'$0".length()];
                QB qb4 = new QB("52@\u001b+,3(-*\u0011$0\"'$0");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4) + sXd7);
                    i5++;
                }
                Method method3 = cls2.getMethod(new String(iArr4, 0, i5), clsArr2);
                try {
                    method3.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method3.invoke(context, objArr3);
                    try {
                        Class<?> cls3 = Class.forName(C1561oA.ud("O[P]YRL\u0015ITRWGOT\rNJ\n+;<C8=:!4@274@", (short) (Od.Xd() ^ (-26920))));
                        Class<?>[] clsArr3 = new Class[2];
                        clsArr3[0] = Class.forName(C1561oA.yd("\u0016\u000e \f]\u001d\u000f\u001d\u000bRt\u0017\u001a\u0012\u0014\u000e", (short) (ZN.Xd() ^ 13930)));
                        clsArr3[1] = Integer.TYPE;
                        Object[] objArr4 = {str, 0};
                        short sXd8 = (short) (FB.Xd() ^ 30635);
                        int[] iArr5 = new int["DCS0BENELK0VOY".length()];
                        QB qb5 = new QB("DCS0BENELK0VOY");
                        int i6 = 0;
                        while (qb5.YK()) {
                            int iKK5 = qb5.KK();
                            Xu xuXd5 = Xu.Xd(iKK5);
                            iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd8 + sXd8) + sXd8) + i6));
                            i6++;
                        }
                        Method method4 = cls3.getMethod(new String(iArr5, 0, i6), clsArr3);
                        try {
                            method4.setAccessible(true);
                            PackageInfo packageInfo = (PackageInfo) method4.invoke(packageManager, objArr4);
                            Class<?> cls4 = Class.forName(Xg.qd("\u001b) /-($n%229+5<v\r::A3GD", (short) (C1580rY.Xd() ^ (-11591)), (short) (C1580rY.Xd() ^ (-16634))));
                            Class<?>[] clsArr4 = new Class[0];
                            Object[] objArr5 = new Object[0];
                            short sXd9 = (short) (ZN.Xd() ^ 7441);
                            short sXd10 = (short) (ZN.Xd() ^ 5470);
                            int[] iArr6 = new int["\u0011E\u001du_j+?XET".length()];
                            QB qb6 = new QB("\u0011E\u001du_j+?XET");
                            int i7 = 0;
                            while (qb6.YK()) {
                                int iKK6 = qb6.KK();
                                Xu xuXd6 = Xu.Xd(iKK6);
                                iArr6[i7] = xuXd6.fK(xuXd6.CK(iKK6) - ((i7 * sXd10) ^ sXd9));
                                i7++;
                            }
                            Method method5 = cls4.getMethod(new String(iArr6, 0, i7), clsArr4);
                            try {
                                method5.setAccessible(true);
                                noteProfileWrittenFor(packageInfo, (File) method5.invoke(context, objArr5));
                                result(executor, diagnosticsCallback, 10, null);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } catch (PackageManager.NameNotFoundException e4) {
                        result(executor, diagnosticsCallback, 7, e4);
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getCause();
        }
    }

    static void deleteSkipFile(Context context, Executor executor, DiagnosticsCallback diagnosticsCallback) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("2\\\u001de\rU\u000b~nIr3n&fj:\u0015^\u001f:\u001cR", (short) (FB.Xd() ^ 3259), (short) (FB.Xd() ^ 28872))).getMethod(ZO.xd("uJ~\u000ea2WS)0g", (short) (C1499aX.Xd() ^ (-3755)), (short) (C1499aX.Xd() ^ (-2014))), new Class[0]);
        try {
            method.setAccessible(true);
            deleteProfileWrittenFor((File) method.invoke(context, objArr));
            result(executor, diagnosticsCallback, 11, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
