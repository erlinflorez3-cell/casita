package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import androidx.core.content.ContextCompat;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import io.sentry.rrweb.RRWebVideoEvent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static Boolean zzj = null;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        try {
            method = WorkSource.class.getMethod(ProductAction.ACTION_ADD, Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        zzb = method;
        try {
            method2 = WorkSource.class.getMethod(ProductAction.ACTION_ADD, Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        zzc = method2;
        try {
            method3 = WorkSource.class.getMethod(RRWebVideoEvent.JsonKeys.SIZE, new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        zzd = method3;
        try {
            method4 = WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
            method4 = null;
        }
        zze = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
            method5 = null;
        }
        zzf = method5;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e2) {
                method6 = null;
            }
        } else {
            method6 = null;
        }
        zzg = method6;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e3) {
                method7 = null;
            }
        } else {
            method7 = null;
        }
        zzh = method7;
        if (PlatformVersion.isAtLeastP()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", new Class[0]);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        zzi = method8;
        zzj = null;
    }

    private WorkSourceUtil() {
    }

    public static void add(WorkSource workSource, int i2, String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i2), str);
                return;
            } catch (Exception e2) {
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i2));
            } catch (Exception e3) {
            }
        }
    }

    public static WorkSource fromPackage(Context context, String str) throws Throwable {
        Object obj;
        Wg.vd("TmmgTqtrhkXxrv", (short) (C1499aX.Xd() ^ (-1327)));
        if (context != null) {
            short sXd = (short) (ZN.Xd() ^ 32752);
            short sXd2 = (short) (ZN.Xd() ^ 8871);
            int[] iArr = new int["nzo|xqk4hsqvfns,@kin^pk".length()];
            QB qb = new QB("nzo|xqk4hsqvfns,@kin^pk");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(hg.Vd("+(6\u0011!\")\u001e# \u0007\u001a&\u0018\u001d\u001a&", (short) (C1633zX.Xd() ^ (-18184)), (short) (C1633zX.Xd() ^ (-5999))), new Class[0]);
            try {
                method.setAccessible(true);
                if (((PackageManager) method.invoke(context, objArr)) != null && str != null) {
                    try {
                        ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                        if (applicationInfo == null) {
                            short sXd3 = (short) (C1580rY.Xd() ^ (-15161));
                            int[] iArr2 = new int[">ind[\u0016ccg\u0012XUc\u000eN\\[VRKHZNSQ+OFN}CNJGxH89@5:7\u000bo".length()];
                            QB qb2 = new QB(">ind[\u0016ccg\u0012XUc\u000eN\\[VRKHZNSQ+OFN}CNJGxH89@5:7\u000bo");
                            int i3 = 0;
                            while (qb2.YK()) {
                                int iKK2 = qb2.KK();
                                Xu xuXd2 = Xu.Xd(iKK2);
                                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                                i3++;
                            }
                            new String(iArr2, 0, i3).concat(str);
                            return null;
                        }
                        String strYd = C1561oA.yd("<HANNGE\u000e6ACH<DM\u0006[W\u001b-_^]YFCYMVT2V!)", (short) (C1607wl.Xd() ^ 2931));
                        String strYd2 = C1561oA.Yd("shd", (short) (OY.Xd() ^ 25109));
                        try {
                            Class<?> cls = Class.forName(strYd);
                            Field field = 1 != 0 ? cls.getField(strYd2) : cls.getDeclaredField(strYd2);
                            field.setAccessible(true);
                            obj = field.get(applicationInfo);
                        } catch (Throwable th) {
                            obj = null;
                        }
                        int iIntValue = ((Integer) obj).intValue();
                        WorkSource workSource = new WorkSource();
                        add(workSource, iIntValue, str);
                        return workSource;
                    } catch (PackageManager.NameNotFoundException unused) {
                        short sXd4 = (short) (ZN.Xd() ^ 11356);
                        short sXd5 = (short) (ZN.Xd() ^ 32090);
                        int[] iArr3 = new int["b\u0010\u0017\u000f\bD\u0014\u0016\u001cH\u0010\u0014\u001a\u0011M\u001f\u0011\u0014\u001d\u0014\u001b\u001aoV".length()];
                        QB qb3 = new QB("b\u0010\u0017\u000f\bD\u0014\u0016\u001cH\u0010\u0014\u001a\u0011M\u001f\u0011\u0014\u001d\u0014\u001b\u001aoV");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                            i4++;
                        }
                        new String(iArr3, 0, i4).concat(str);
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return null;
    }

    public static WorkSource fromPackageAndModuleExperimentalPi(Context context, String str, String str2) throws Throwable {
        Method method;
        Object obj;
        short sXd = (short) (ZN.Xd() ^ 29371);
        short sXd2 = (short) (ZN.Xd() ^ 15449);
        int[] iArr = new int["<p\u001f4Qx;\u0006\u001aXU 9*".length()];
        QB qb = new QB("<p\u001f4Qx;\u0006\u001aXU 9*");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        new String(iArr, 0, i2);
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method2 = Class.forName(ZO.xd("sn\rB-2\u0017Eiqr\u0015t7\u000f\u001b\u001b[\u0006f\\U\u0001", (short) (Od.Xd() ^ (-9949)), (short) (Od.Xd() ^ (-9398)))).getMethod(C1626yg.Ud("Y\u0011\u0018]\u0005#Gv2\b\u001a:|O_D(", (short) (C1633zX.Xd() ^ (-7091)), (short) (C1633zX.Xd() ^ (-28120))), new Class[0]);
            try {
                method2.setAccessible(true);
                if (((PackageManager) method2.invoke(context, objArr)) != null && str2 != null && str != null) {
                    int iIntValue = -1;
                    try {
                        ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                        if (applicationInfo == null) {
                            Ig.wd("I)\u001bx\u001f-\u0016\u001dS4{\u001aZ\n=s\u001b/aQ\u0011]f\u000b\u000f{@\f%\u0005e\u001b*O8P^z\u0006cc7AG", (short) (Od.Xd() ^ (-19860))).concat(str);
                        } else {
                            String strOd = EO.Od("^\u001d\u0001o-\u0004\u0013txIB*e|^zy\u0005}\u0019\u0007/\u0005}fH:_S!OW_\u0007", (short) (ZN.Xd() ^ 20752));
                            String strQd = C1561oA.Qd("XKE", (short) (OY.Xd() ^ 27270));
                            try {
                                Class<?> cls = Class.forName(strOd);
                                Field field = 1 != 0 ? cls.getField(strQd) : cls.getDeclaredField(strQd);
                                field.setAccessible(true);
                                obj = field.get(applicationInfo);
                            } catch (Throwable th) {
                                obj = null;
                            }
                            iIntValue = ((Integer) obj).intValue();
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        C1593ug.zd("v$+#\u001cX(*0\\$(.%a3%(1(/.\u0004j", (short) (C1633zX.Xd() ^ (-28794)), (short) (C1633zX.Xd() ^ (-2136))).concat(str);
                    }
                    if (iIntValue < 0) {
                        return null;
                    }
                    WorkSource workSource = new WorkSource();
                    Method method3 = zzg;
                    if (method3 == null || (method = zzh) == null) {
                        add(workSource, iIntValue, str);
                    } else {
                        try {
                            Object objInvoke = method3.invoke(workSource, new Object[0]);
                            int i3 = zza;
                            if (iIntValue != i3) {
                                method.invoke(objInvoke, Integer.valueOf(iIntValue), str);
                            }
                            method.invoke(objInvoke, Integer.valueOf(i3), str2);
                        } catch (Exception e2) {
                            C1561oA.od("\t!\u0013\u0013\u001c\u0014M!\u001bJ\u000b\u001c\u001b\u0010\r\u0013C\u0006\n\u0002\t\r\u0003\u0001;|\u0006y\u0005{5\t{\u0005\u0001\u0006vv-cz|t[v{wgh", (short) (Od.Xd() ^ (-29273)));
                        }
                    }
                    return workSource;
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        C1561oA.Kd("\u000b%\u001d1* \u001f1##_/7/0d'9/>70:AA", (short) (C1499aX.Xd() ^ (-17416)));
        return null;
    }

    public static int get(WorkSource workSource, int i2) {
        Method method = zze;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, Integer.valueOf(i2));
            Preconditions.checkNotNull(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e2) {
            return 0;
        }
    }

    public static String getName(WorkSource workSource, int i2) {
        Method method = zzf;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i2));
        } catch (Exception e2) {
            return null;
        }
    }

    public static List<String> getNames(WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i2 = 0; i2 < size; i2++) {
                String name = getName(workSource, i2);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    public static synchronized boolean hasWorkSourcePermission(Context context) {
        Boolean bool = zzj;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        Boolean boolValueOf = Boolean.valueOf(ContextCompat.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0);
        zzj = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static boolean isEmpty(WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e2) {
            }
        }
        return size(workSource) == 0;
    }

    public static int size(WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(objInvoke);
                return ((Integer) objInvoke).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }
}
