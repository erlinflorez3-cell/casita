package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
class BenchmarkOperation {
    private BenchmarkOperation() {
    }

    static void dropShaderCache(Context context, ProfileInstallReceiver.ResultDiagnostics resultDiagnostics) {
        if (deleteFilesRecursively(Api24ContextHelper.getDeviceProtectedCodeCacheDir(context))) {
            resultDiagnostics.onResultReceived(14, null);
        } else {
            resultDiagnostics.onResultReceived(15, null);
        }
    }

    static boolean deleteFilesRecursively(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return false;
            }
            boolean z2 = true;
            for (File file2 : fileArrListFiles) {
                z2 = deleteFilesRecursively(file2) && z2;
            }
            return z2;
        }
        file.delete();
        return true;
    }

    private static class Api21ContextHelper {
        private Api21ContextHelper() {
        }

        static File getCodeCacheDir(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG", (short) (C1580rY.Xd() ^ (-16218)), (short) (C1580rY.Xd() ^ (-7789)))).getMethod(hg.Vd("\n\u0007\u0015b\u000e\u0002\u0002^{|\u0001|Z~\u0007", (short) (ZN.Xd() ^ 12059), (short) (ZN.Xd() ^ 19092)), new Class[0]);
            try {
                method.setAccessible(true);
                return (File) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private static class Api24ContextHelper {
        private Api24ContextHelper() {
        }

        static File getDeviceProtectedCodeCacheDir(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.ud("AMBOKD>\u0007;FDI9AF~\u0013><A1C>", (short) (ZN.Xd() ^ 27911))).getMethod(C1561oA.yd("\u001d-!\u001e*\u001c{\u001e(\u001c\u0017\u001a}!\u001f%/.@2*\u001a<84$+*\u0001..5~\u0013\u0010", (short) (C1607wl.Xd() ^ 30262)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                short sXd = (short) (Od.Xd() ^ (-23030));
                int[] iArr = new int["/=4CA<8\u00039FFM?IP\u000b!NNUG[X".length()];
                QB qb = new QB("/=4CA<8\u00039FFM?IP\u000b!NNUG[X");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("-,<\f9/1\u0010/286\u0016<F", (short) (ZN.Xd() ^ 16202), (short) (ZN.Xd() ^ 3553)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    return (File) method2.invoke(context2, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }
}
