package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.biocatch.client.android.sdk.core.RootCheckConstants;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.BuildInfoProvider;
import io.sentry.util.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class RootChecker {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private final ILogger logger;
    private final String[] rootFiles;
    private final String[] rootPackages;
    private final Runtime runtime;

    public RootChecker(Context context, BuildInfoProvider buildInfoProvider, ILogger iLogger) {
        this(context, buildInfoProvider, iLogger, new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}, new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}, Runtime.getRuntime());
    }

    RootChecker(Context context, BuildInfoProvider buildInfoProvider, ILogger iLogger, String[] strArr, String[] strArr2, Runtime runtime) {
        this.context = (Context) Objects.requireNonNull(context, "The application context is required.");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "The Logger is required.");
        this.rootFiles = (String[]) Objects.requireNonNull(strArr, "The root Files are required.");
        this.rootPackages = (String[]) Objects.requireNonNull(strArr2, "The root packages are required.");
        this.runtime = (Runtime) Objects.requireNonNull(runtime, "The Runtime is required.");
    }

    private boolean checkRootFiles() {
        for (String str : this.rootFiles) {
            try {
            } catch (RuntimeException e2) {
                this.logger.log(SentryLevel.ERROR, e2, "Error when trying to check if root file %s exists.", str);
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    private boolean checkRootPackages(ILogger iLogger) throws Throwable {
        BuildInfoProvider buildInfoProvider = new BuildInfoProvider(iLogger);
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("Q_Vec^Z%[hhoakr-Cppwi}z", (short) (C1580rY.Xd() ^ (-18134)), (short) (C1580rY.Xd() ^ (-9863)))).getMethod(C1561oA.od("daoJZ[bW\\Y@S_QVS_", (short) (OY.Xd() ^ 7280)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            if (packageManager != null) {
                for (String str : this.rootPackages) {
                    try {
                        if (buildInfoProvider.getSdkInfoVersion() < 33) {
                            Class<?> cls = Class.forName(Qg.kd("YeZgc\\V\u001fS^\\aQY^\u0017XT\u00145EFMBGD+>J<A>J", (short) (Od.Xd() ^ (-8308)), (short) (Od.Xd() ^ (-31587))));
                            Class<?>[] clsArr = new Class[2];
                            clsArr[0] = Class.forName(hg.Vd("* 4\u001ei'\u001b'\u001fd\t)&\u001c \u0018", (short) (C1633zX.Xd() ^ (-31982)), (short) (C1633zX.Xd() ^ (-8852))));
                            clsArr[1] = Integer.TYPE;
                            Object[] objArr2 = {str, 0};
                            Method method2 = cls.getMethod(C1561oA.ud("(%3\u000e\u001e\u001f&\u001b \u001d\u007f$\u001b#", (short) (C1499aX.Xd() ^ (-9643))), clsArr);
                            try {
                                continue;
                                method2.setAccessible(true);
                                method2.invoke(packageManager, objArr2);
                                return true;
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }
                        PackageManager.PackageInfoFlags packageInfoFlagsOf = PackageManager.PackageInfoFlags.of(0L);
                        Class<?> cls2 = Class.forName(C1561oA.Kd("lzq\u0001~yu@v\u0004\u0004\u000b|\u0007\u000eH\f\nKn\u0001\u0004\r\u0004\u000b\nr\b\u0016\n\u0011\u0010\u001e", (short) (C1580rY.Xd() ^ (-27853))));
                        Class<?>[] clsArr2 = new Class[2];
                        clsArr2[0] = Class.forName(Wg.Zd("k\\,OVM=\u000365\u00150f\u0018U\t", (short) (C1607wl.Xd() ^ 15610), (short) (C1607wl.Xd() ^ 3802)));
                        clsArr2[1] = Class.forName(C1561oA.Xd("\u0018&\u001d,*%!k\"//6(29s75v\u001a,/8/65\u001e3A5<;I{);>G>ED)OHR*QGN[", (short) (C1499aX.Xd() ^ (-24020))));
                        Object[] objArr3 = {str, packageInfoFlagsOf};
                        Method method3 = cls2.getMethod(Wg.vd("wv\u0003_ux}t\u007f~_\u0006\u0003\r", (short) (C1580rY.Xd() ^ (-1364))), clsArr2);
                        try {
                            continue;
                            method3.setAccessible(true);
                            method3.invoke(packageManager, objArr3);
                            return true;
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            }
            return false;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    private boolean checkSUExist() {
        boolean z2 = true;
        Process process = null;
        try {
            try {
                Process processExec = this.runtime.exec(new String[]{"/system/xbin/which", RootCheckConstants.BINARY_SU});
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), UTF_8));
                try {
                    if (bufferedReader.readLine() == null) {
                        z2 = false;
                    }
                    bufferedReader.close();
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    return z2;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                this.logger.log(SentryLevel.DEBUG, "SU isn't found on this Device.", new Object[0]);
                if (0 != 0) {
                }
                return false;
            } catch (Throwable th3) {
                this.logger.log(SentryLevel.DEBUG, "Error when trying to check if SU exists.", th3);
                return false;
            }
        } finally {
            if (0 != 0) {
                process.destroy();
            }
        }
    }

    private boolean checkTestKeys() {
        String buildTags = this.buildInfoProvider.getBuildTags();
        return buildTags != null && buildTags.contains("test-keys");
    }

    public boolean isDeviceRooted() {
        return checkTestKeys() || checkRootFiles() || checkSUExist() || checkRootPackages(this.logger);
    }
}
