package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
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
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class PackageManagerCompat {
    public static final String ACTION_PERMISSION_REVOCATION_SETTINGS = "android.intent.action.AUTO_REVOKE_PERMISSIONS";
    public static final String LOG_TAG = "PackageManagerCompat";

    @Retention(RetentionPolicy.SOURCE)
    public @interface UnusedAppRestrictionsStatus {
    }

    private PackageManagerCompat() {
    }

    public static ListenableFuture<Integer> getUnusedAppRestrictionsStatus(Context context) throws Throwable {
        Object obj;
        ResolvableFuture<Integer> resolvableFutureCreate = ResolvableFuture.create();
        boolean zIsUserUnlocked = UserManagerCompat.isUserUnlocked(context);
        C1561oA.od("(89@5:7\u001e1=/41=\r857'9", (short) (C1499aX.Xd() ^ (-22918)));
        if (!zIsUserUnlocked) {
            resolvableFutureCreate.set(0);
            C1561oA.Kd("BaTb\u0011[f\u0014^d\u0017dh]faa\u001ecisgfx%hvw}*x{qs", (short) (C1499aX.Xd() ^ (-6827)));
            return resolvableFutureCreate;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("F\u0011T0z2z\u0012U\u001fk?}D\u0018\u001fA+wG\u0006V ", (short) (C1580rY.Xd() ^ (-1256)), (short) (C1580rY.Xd() ^ (-13841)))).getMethod(C1561oA.Xd("\u001a\u0019)\u0006\u0018\u001b$\u001b\"!\n\u001f-!('5", (short) (OY.Xd() ^ 31267)), new Class[0]);
        try {
            method.setAccessible(true);
            if (!areUnusedAppRestrictionsAvailable((PackageManager) method.invoke(context, objArr))) {
                resolvableFutureCreate.set(1);
                return resolvableFutureCreate;
            }
            short sXd = (short) (C1607wl.Xd() ^ 17045);
            int[] iArr = new int["n|s\u0003\u0001{wBx\u0006\u0006\r~\t\u0010J@mmtfzw".length()];
            QB qb = new QB("n|s\u0003\u0001{wBx\u0006\u0006\r~\t\u0010J@mmtfzw");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd2 = (short) (C1499aX.Xd() ^ (-12310));
            short sXd3 = (short) (C1499aX.Xd() ^ (-32076));
            int[] iArr2 = new int["?<J\u0016DC>:30B6;9\u00137.6".length()];
            QB qb2 = new QB("?<J\u0016DC>:30B6;9\u00137.6");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                i3++;
            }
            Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method2.setAccessible(true);
                ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(context, objArr2);
                String strVd = hg.Vd("w\u0004x\u0006\u0002zt=q|z\u007fow|5vr2Drqlha^pdigAe\\d", (short) (C1607wl.Xd() ^ 7647), (short) (C1607wl.Xd() ^ 14116));
                String strUd = C1561oA.ud("O;K?<J(8>(6BB7<:", (short) (C1499aX.Xd() ^ (-7360)));
                try {
                    Class<?> cls2 = Class.forName(strVd);
                    Field field = 1 != 0 ? cls2.getField(strUd) : cls2.getDeclaredField(strUd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue < 30) {
                    resolvableFutureCreate.set(0);
                    C1561oA.yd("fr\u0003vs\u0002,^^d8\u000e{\b\b|\u0012\u0010@\u0002\u0004\n\f\u0013JjxpFXT", (short) (ZN.Xd() ^ 7095));
                    return resolvableFutureCreate;
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    if (Api30Impl.areUnusedAppRestrictionsEnabled(context)) {
                        resolvableFutureCreate.set(Integer.valueOf(iIntValue >= 31 ? 5 : 4));
                    } else {
                        resolvableFutureCreate.set(2);
                    }
                    return resolvableFutureCreate;
                }
                if (Build.VERSION.SDK_INT == 30) {
                    resolvableFutureCreate.set(Integer.valueOf(Api30Impl.areUnusedAppRestrictionsEnabled(context) ? 4 : 2));
                    return resolvableFutureCreate;
                }
                final UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = new UnusedAppRestrictionsBackportServiceConnection(context);
                Objects.requireNonNull(unusedAppRestrictionsBackportServiceConnection);
                Runnable runnable = new Runnable() { // from class: androidx.core.content.PackageManagerCompat$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        unusedAppRestrictionsBackportServiceConnection.disconnectFromService();
                    }
                };
                short sXd4 = (short) (ZN.Xd() ^ 255);
                int[] iArr3 = new int["\u000f\u0007\u001d\tV\u001f\u001f\u0015\u0019[\u0012\u001f\u001f\u0015(&'\u001b%,f~3! 33/35".length()];
                QB qb3 = new QB("\u000f\u0007\u001d\tV\u001f\u001f\u0015\u0019[\u0012\u001f\u001f\u0015(&'\u001b%,f~3! 33/35");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd4 + sXd4) + sXd4) + i4));
                    i4++;
                }
                Class<?> cls3 = Class.forName(new String(iArr3, 0, i4));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr3 = new Object[0];
                short sXd5 = (short) (FB.Xd() ^ 14653);
                short sXd6 = (short) (FB.Xd() ^ 14639);
                int[] iArr4 = new int["`XkH_e_e_Odoc`dFzhgzzvz".length()];
                QB qb4 = new QB("`XkH_e_e_Odoc`dFzhgzzvz");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i5)) + sXd6);
                    i5++;
                }
                Method declaredMethod = cls3.getDeclaredMethod(new String(iArr4, 0, i5), clsArr2);
                try {
                    declaredMethod.setAccessible(true);
                    resolvableFutureCreate.addListener(runnable, (ExecutorService) declaredMethod.invoke(null, objArr3));
                    unusedAppRestrictionsBackportServiceConnection.connectAndFetchResult(resolvableFutureCreate);
                    return resolvableFutureCreate;
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

    public static boolean areUnusedAppRestrictionsAvailable(PackageManager packageManager) {
        boolean z2 = Build.VERSION.SDK_INT >= 30;
        boolean z3 = Build.VERSION.SDK_INT < 30;
        boolean z4 = getPermissionRevocationVerifierApp(packageManager) != null;
        if (z2) {
            return true;
        }
        return z3 && z4;
    }

    public static String getPermissionRevocationVerifierApp(PackageManager packageManager) throws Throwable {
        String str = null;
        Intent data = new Intent(C1561oA.ud("eqfsohb+ein^fk$VWg[`^\u001d/B@:I;-=50)B2&2,'0/$)'+", (short) (Od.Xd() ^ (-13592)))).setData(Uri.fromParts(C1561oA.yd("cUXaPWV", (short) (Od.Xd() ^ (-19599))), C1561oA.Yd("|\n\tJ\u0003\u0017\u0001\u000e\u0012\u000f\t", (short) (Od.Xd() ^ (-30346))), null));
        short sXd = (short) (Od.Xd() ^ (-3121));
        short sXd2 = (short) (Od.Xd() ^ (-8006));
        int[] iArr = new int["q\u007fv\u0006\u0004~zE{\t\t\u0010\u0002\f\u0013M\u0011\u000fPs\u0006\t\u0012\t\u0010\u000fw\r\u001b\u000f\u0016\u0015#".length()];
        QB qb = new QB("q\u007fv\u0006\u0004~zE{\t\t\u0010\u0002\f\u0013M\u0011\u000fPs\u0006\t\u0012\t\u0010\u000fw\r\u001b\u000f\u0016\u0015#");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Object[] objArr = {data, 0};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(ZO.xd(".\b\u000e%f>*\u0002l\u00109-j[\u0011\fvxM-M", (short) (C1499aX.Xd() ^ (-4192)), (short) (C1499aX.Xd() ^ (-23225))), Class.forName(Jg.Wd("FiQ1 \u0004P\f#\tyatgOjgv^1,\f", (short) (C1607wl.Xd() ^ 24609), (short) (C1607wl.Xd() ^ 27969))), Integer.TYPE);
        try {
            method.setAccessible(true);
            Iterator it = ((List) method.invoke(packageManager, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = ((ResolveInfo) it.next()).activityInfo.packageName;
                Object[] objArr2 = {C1626yg.Ud("\u0017,'K\u0010\u007f=\rGx\\RS;t+ hBo\\L\n%G+*\u0012,06R1xSu\u000e8!?\u0004ak\u0002=", (short) (Od.Xd() ^ (-16742)), (short) (Od.Xd() ^ (-3294))), str2};
                Method method2 = Class.forName(Ig.wd("\u0018L@/sH_AC,Tt\u0017.D\u0017\u0015 \u0018R!Vxr6HM5Xx\u001b2o", (short) (C1580rY.Xd() ^ (-11177)))).getMethod(C1593ug.zd("'-+*3\u0019/=96AB9@@", (short) (FB.Xd() ^ 10718), (short) (FB.Xd() ^ 24272)), Class.forName(EO.Od("3y^#\"\u000e)_8\f-r<3\">", (short) (C1607wl.Xd() ^ 29910))), Class.forName(C1561oA.Qd("\u0013\t\u001d\u0007R\u0010\u0004\u0010\bMq\u0012\u000f\u0005\t\u0001", (short) (OY.Xd() ^ 11323))));
                try {
                    method2.setAccessible(true);
                    if (((Integer) method2.invoke(packageManager, objArr2)).intValue() == 0) {
                        if (str != null) {
                            return str;
                        }
                        str = str2;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return str;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static boolean areUnusedAppRestrictionsEnabled(Context context) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.Xd("5C:IGB>\t?LLSEOV\u0011'TT[Ma^", (short) (OY.Xd() ^ 2106)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 21252);
            int[] iArr = new int["\u0007\u0004\u0016p\u0005\u0006\u0011\u0006\u000f\fv\n\u001a\f\u0015\u0012\"".length()];
            QB qb = new QB("\u0007\u0004\u0016p\u0005\u0006\u0011\u0006\u000f\fv\n\u001a\f\u0015\u0012\"");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                Class<?> cls2 = Class.forName(Qg.kd("'3(51*$l!,*/\u001f',d&\"a\u0003\u0013\u0014\u001b\u0010\u0015\u0012x\f\u0018\n\u000f\f\u0018", (short) (ZN.Xd() ^ 1141), (short) (ZN.Xd() ^ GoogleSignInStatusCodes.SIGN_IN_FAILED)));
                Class<?>[] clsArr2 = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd2 = (short) (C1633zX.Xd() ^ (-644));
                short sXd3 = (short) (C1633zX.Xd() ^ (-26267));
                int[] iArr2 = new int["09\u0006971\u0013%5-(!\u0012\"\",\u001c\"\u001e''\u0017\u0015".length()];
                QB qb2 = new QB("09\u0006971\u0013%5-(!\u0012\"\",\u001c\"\u001e''\u0017\u0015");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                    i3++;
                }
                try {
                    cls2.getMethod(new String(iArr2, 0, i3), clsArr2).setAccessible(true);
                    return !((Boolean) r1.invoke(packageManager, objArr2)).booleanValue();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }
}
