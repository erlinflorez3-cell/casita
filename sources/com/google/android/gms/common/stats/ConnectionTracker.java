package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
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

/* JADX INFO: loaded from: classes8.dex */
public class ConnectionTracker {
    private static final Object zzb = new Object();

    @Nullable
    private static volatile ConnectionTracker zzc = null;
    public final ConcurrentHashMap zza = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    public static ConnectionTracker getInstance() {
        if (zzc == null) {
            synchronized (zzb) {
                if (zzc == null) {
                    zzc = new ConnectionTracker();
                }
            }
        }
        ConnectionTracker connectionTracker = zzc;
        Preconditions.checkNotNull(connectionTracker);
        return connectionTracker;
    }

    private static void zzb(Context context, ServiceConnection serviceConnection) {
        try {
            Class<?> cls = Class.forName(EO.Od("#y=3h /8\u001d\r\u0006m\n!C^\u0011#yGwRh", (short) (C1580rY.Xd() ^ (-32471))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (Od.Xd() ^ (-24014));
            int[] iArr = new int["codqmf`)]hfk[ch!EVbeWPQ.YWVLIYMRP".length()];
            QB qb = new QB("codqmf`)]hfk[ch!EVbeWPQ.YWVLIYMRP");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {serviceConnection};
            short sXd2 = (short) (C1633zX.Xd() ^ (-13053));
            short sXd3 = (short) (C1633zX.Xd() ^ (-19241));
            int[] iArr2 = new int["gaV^d[K^lqe`c".length()];
            QB qb2 = new QB("gaV^d[K^lqe`c");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean zzc(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, boolean z2, @Nullable Executor executor) {
        Object obj;
        ComponentName component = intent.getComponent();
        C1561oA.od("m\u0019\u0017\u0016\f\t\u0019\r\u0012\u0010t\u0012\u007f\u0001\b\u0001\r", (short) (ZN.Xd() ^ 6253));
        if (component != null) {
            String packageName = component.getPackageName();
            C1561oA.Kd("6CB\u0004>GHAGA\u000b?MDSQLH\u0013MT[", (short) (OY.Xd() ^ 21147)).equals(packageName);
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(packageName, 0);
                String strZd = Wg.Zd("\u007fB%)\u0013\u0003j*LJ62\u0010\u000f\u00021`\u0013E=jOI+#\u0006\u0013lpT-7-[", (short) (FB.Xd() ^ 28143), (short) (FB.Xd() ^ 22829));
                String strXd = C1561oA.Xd("!(\u001e%2", (short) (C1633zX.Xd() ^ (-5602)));
                try {
                    Class<?> cls = Class.forName(strZd);
                    Field field = 1 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
                    field.setAccessible(true);
                    obj = field.get(applicationInfo);
                } catch (Throwable th) {
                    obj = null;
                }
                if ((-1) - (((-1) - ((Integer) obj).intValue()) | ((-1) - 2097152)) != 0) {
                    Wg.vd("d\u0019\u001a\f\u0015\u0019\u001e\u0010\u0010L\"\u001eO\u0013\u001b!\u0018T*&W\u001aY.!/4(#&a,q$f&Z\\XZ[QQ.\u007fqt}t{zD", (short) (C1607wl.Xd() ^ 19909));
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!zzd(serviceConnection)) {
            return zze(context, intent, serviceConnection, i2, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format(Qg.kd("S\u0004}xtmj|l&gmqfjnf\u001eteob\u0019l_[\u0015gT_V\u0010BS_bTMN+VTSIFVJOM\u0018|\u0001N\u0006x|J\u0002txF\u007f", (short) (C1580rY.Xd() ^ (-5238)), (short) (C1580rY.Xd() ^ (-10721))), serviceConnection, str, intent.getAction());
        }
        try {
            boolean zZze = zze(context, intent, serviceConnection, i2, executor);
            if (zZze) {
                return zZze;
            }
            return false;
        } finally {
            this.zza.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean zzd(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzt);
    }

    private static final boolean zze(Context context, Intent intent, ServiceConnection serviceConnection, int i2, @Nullable Executor executor) throws Throwable {
        if (executor == null) {
            executor = null;
        }
        if (PlatformVersion.isAtLeastQ() && executor != null) {
            Class<?> cls = Class.forName(hg.Vd("o{p}yrl5itrwgot-Aljo_ql", (short) (ZN.Xd() ^ 7405), (short) (ZN.Xd() ^ 1513)));
            Class<?>[] clsArr = {Class.forName(C1561oA.ud("\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fGa\u0006\u000bz\u0003\b", (short) (C1499aX.Xd() ^ (-28630)))), Integer.TYPE, Class.forName(C1561oA.yd("\f\u0002\u001a\u0004K\u0012\u0014\b\u0016V\u000f\u001a\u0014\b\u001d\u0019$\u0016\"'[q(\u0014\u001d.0*(", (short) (C1607wl.Xd() ^ 11903))), Class.forName(C1561oA.Yd("\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\f\u0019\u0019 \u0012\u001c#]\u0004\u0017%*\u001e\u0019\u001cz(()! 2(//", (short) (C1580rY.Xd() ^ (-32449))))};
            Object[] objArr = {intent, Integer.valueOf(i2), executor, serviceConnection};
            Method method = cls.getMethod(Xg.qd("-5;2\"5CH<7:", (short) (Od.Xd() ^ (-30005)), (short) (Od.Xd() ^ (-6276))), clsArr);
            try {
                method.setAccessible(true);
                return ((Boolean) method.invoke(context, objArr)).booleanValue();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Class<?> cls2 = Class.forName(Jg.Wd("3?V\u0001\u001f5Q7\u000e:Z|\u000f4[1gTt\u0017)Xu", (short) (C1633zX.Xd() ^ (-2886)), (short) (C1633zX.Xd() ^ (-27596))));
        Class<?>[] clsArr2 = {Class.forName(ZO.xd("\u0017e+n\u001dT,\u0010r\u00079_|\u0006\u0002\n(q\b)Ij", (short) (OY.Xd() ^ 5776), (short) (OY.Xd() ^ OlympusMakernoteDirectory.TAG_SHARPNESS))), Class.forName(C1626yg.Ud("Z?~m\u001fO^`2\u000f\u0018w5H\":F> (O&qW~Jc\n:T]\u00014", (short) (OY.Xd() ^ 836), (short) (OY.Xd() ^ 30231))), Integer.TYPE};
        Object[] objArr2 = {intent, serviceConnection, Integer.valueOf(i2)};
        short sXd = (short) (C1607wl.Xd() ^ 30951);
        int[] iArr = new int["w(\u0019\u0001v4'\u0019E`Z".length()];
        QB qb = new QB("w(\u0019\u0001v4'\u0019E`Z");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
            i3++;
        }
        Method method2 = cls2.getMethod(new String(iArr, 0, i3), clsArr2);
        try {
            method2.setAccessible(true);
            return ((Boolean) method2.invoke(context, objArr2)).booleanValue();
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        return zzc(context, context.getClass().getName(), intent, serviceConnection, i2, true, null);
    }

    public void unbindService(Context context, ServiceConnection serviceConnection) {
        if (!zzd(serviceConnection) || !this.zza.containsKey(serviceConnection)) {
            zzb(context, serviceConnection);
            return;
        }
        try {
            zzb(context, (ServiceConnection) this.zza.get(serviceConnection));
        } finally {
            this.zza.remove(serviceConnection);
        }
    }

    public void unbindServiceSafe(Context context, ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, @Nullable Executor executor) {
        return zzc(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
